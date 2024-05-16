USE luadingo

-- THIS SQL CODE HAS PROCEDURES

-- MAKING A FRIEND REQUEST PROCEDURE

-- Format
-- CALL AddFriend('sender,'reciever',@output)
-- Tries to send a friend request from sender to reciever
-- If the sender has already sent a request or is accepted by the reciever already then @output is a 0
-- If the reciever has already sent a request to the sender before then @output is also a 0
-- If the reciever hasnt sent a request to the sender or didnt recieve one by the sender then the request is created and the @output is a 1

DELIMITER //

CREATE PROCEDURE AddFriend(
	IN input_username VARCHAR(50), 
    IN TargetUser VARCHAR(50),
    out invSuccess INT
    )
BEGIN
    DECLARE existsPending INT DEFAULT 0;
    DECLARE existsAccepted INT DEFAULT 0;
    DECLARE existsSent INT DEFAULT 0;

    SELECT COUNT(*)
    INTO existsPending
    FROM friends_with
    WHERE username2 = input_username AND status = 'Pending';

    SELECT COUNT(*)
    INTO existsAccepted
    FROM friends_with
    WHERE (username1 = TargetUser OR username2 = TargetUser) AND status = 'Accepted';
    
    SELECT COUNT(*)
    INTO existsSent
    FROM friends_with
    WHERE username1 = input_username AND status = 'Pending';


    IF (existsPending > 0 OR existsAccepted > 0 OR existsSent > 0) THEN -- THERES A FRIEND REQUEST OR THE FRIEND ALREADY EXISTS! 
    
        SELECT 0
        INTO invSuccess;
    ELSE -- SENDING REQUEST!
    
		INSERT INTO friends_with (username1,username2) VALUE (input_username,TargetUser);
        
        SELECT 1
        INTO invSuccess;
    END IF;
END //

DELIMITER ;

-- PASSWORD CHECK PROCEDURE

-- Format
-- CALL TryLogin('username','password',@output)
-- Tries to check if the username and password is correct for a user
-- If the username doesnt exist or the password is wrong the @output is a 0
-- If the username and password match then the @output is a 1

DELIMITER //

CREATE PROCEDURE TryLogin(
    IN input_username VARCHAR(50), 
    IN input_password VARCHAR(255), 
    OUT passMatch INT
)
BEGIN
    DECLARE nameExists INT DEFAULT 0;

    -- Check if the user exists
    SELECT COUNT(*)
    INTO nameExists
    FROM user
    WHERE username = input_username;

    IF nameExists > 0 THEN
        -- Check if the password matches
        SELECT COUNT(*)
        INTO passMatch
        FROM user
        WHERE username = input_username AND password = input_password;
    ELSE
        -- User does not exist, set passMatch to 0
        SET passMatch = 0;
    END IF;
END //

DELIMITER ;

-- ATTEMPT MAKER PROCEDURE

-- Format
-- CALL CreateAttempt('username',quiz_id,@output)
-- Tries to create an attempt made by the username on quiz_id
-- If the attempt creation is successful (quiz is valid) then @output is a 1 and makes a new attempt
-- If the quiz isnt valid or the number of attempts made by the user on the quiz is past 5 then @output returns a 0 


DELIMITER //

CREATE PROCEDURE CreateAttempt(
    IN input_username VARCHAR(50), 
    IN input_quiz_id INT, 
    OUT createSuccessful INT
)
BEGIN
    DECLARE attemptsCount INT DEFAULT 0;
    DECLARE attemptsInDB INT DEFAULT 0;
    DECLARE quizIsValid INT DEFAULT 0;

	-- Get total ammount of attempts in DB
    SELECT COUNT(*)
    INTO attemptsInDB
    FROM attempt;
    
    SET attemptsInDB = attemptsInDB + 1;

    -- Check attempt limit reached
    SELECT COUNT(*)
    INTO attemptsCount
    FROM attempts
    WHERE username = input_username AND quiz_id = input_quiz_id;
    
    -- Check if quiz exists
    SELECT COUNT(*)
    INTO quizIsValid
    FROM quiz
    WHERE quiz_id = input_quiz_id;

    IF attemptsCount > 5  OR quizIsValid < 1 THEN
        -- LimitReached or Quiz doesnt exist
        SET createSuccessful = 0;
        
    ELSE
        -- Can make an attempt
        INSERT INTO attempt(attempt_id) VALUE (attemptsInDB);
        INSERT INTO attempts(attempt_id,quiz_id,username) VALUE (attemptsInDB, input_quiz_id, input_username);
         SET createSuccessful = 1;
    END IF;
END //

DELIMITER ;

-- CONTINUE FROM ATTEMPT PROCEDURE

-- Format
-- CALL ContinueFromAttempt('username',quiz_id,attempt_id,@output)
-- Gets the current question id of the attempt
-- If there is no such attempt or the attempt has reached the end then @output returns a -1
-- Otherwise the @output returns the current question_id to load

DELIMITER //

CREATE PROCEDURE ContinueFromAttempt(
    IN input_username VARCHAR(50), 
    IN input_quiz_id INT,
    IN input_attempt_id INT,
    OUT question_id_cont INT
)
BEGIN
    DECLARE currentQ INT DEFAULT 0;
    DECLARE attemptIsValid INT DEFAULT 0;
    DECLARE questionCount INT DEFAULT 0;

    -- Check if quiz exists
    SELECT COUNT(*)
    INTO attemptIsValid
    FROM attempts
    WHERE quiz_id = input_quiz_id AND attempt_id = input_attempt_id AND username = input_username;
    

    IF attemptIsValid < 1 THEN
        -- Attempt doesnt exist
        SET  question_id_cont = -1;
        
    ELSE
		SELECT attempt_current
        INTO currentQ
        FROM attempt
        WHERE attempt_id = input_attempt_id;
        
        SET CurrentQ = CurrentQ - 1;
        
        SELECT COUNT(*)
		INTO questionCount
		FROM has_question
		WHERE quiz_id = input_quiz_id;
        
        IF currentQ > questionCount THEN -- Attempt is already finished
        
			SET question_id_cont = -1;
            
            ELSE 
            
			SELECT question_id
            INTO question_id_cont
            FROM has_question
            WHERE quiz_id = input_quiz_id
            ORDER BY question_id
            LIMIT 1 OFFSET currentQ;
        
        END IF;
        
       
         
    END IF;
END //

DELIMITER ;

-- ANSWER QUESTION PROCEDURE

-- Format
-- CALL TryAnswer('username',quiz_id,attempt_id,'givenAnswer',@output)
-- Processess the answer of a given attempt. Also pushes the current value of attempt and processes score if given a correct answer (out of 100)
-- If the answer for the current question on attempt is wrong or theres no question to check on attempt the @output returns a 0
-- If the answer for the current question on attempt is correct then the @output returns a 1

DELIMITER //

CREATE PROCEDURE TryAnswer(
    IN input_username VARCHAR(50), 
    IN input_quiz_id INT,
    IN input_attempt_id INT,
    IN input_answer TEXT,
    OUT correctAnswer INT
)
BEGIN
    DECLARE currentQ INT DEFAULT 0;
    DECLARE scoreAdd INT DEFAULT 0;
    DECLARE questionCount INT DEFAULT 0;
    
	
    CALL ContinueFromAttempt(input_username,input_quiz_id,input_attempt_id,@output);
    SET currentQ = @output;
    
    IF currentQ > 0 THEN
        -- we can continue as the questino exists
        
        -- Checks if the answer is correct
        SELECT COUNT(*)
        INTO correctAnswer
        FROM question
        WHERE question_id = currentQ AND question_answer = input_answer;
        
        SELECT COUNT(*)
		INTO questionCount
		FROM has_question
		WHERE quiz_id = input_quiz_id;
        
        SET scoreAdd = 100 / questionCount;
        
        -- add an increment to current question to move it to next
        
        UPDATE attempt
        SET attempt_current = attempt_current + 1
        WHERE attempt_id = input_attempt_id;
        
        IF correctAnswer = 1 THEN -- Given answer was correct. Increase score
        
        UPDATE attempt
        SET attempt_score = attempt_score + scoreAdd
        WHERE attempt_id = input_attempt_id;
        
        END IF;
        
    ELSE
        -- we cant do any question answering as the question cant be reached
        SET correctAnswer = 0;
    END IF;
END //

DELIMITER ;
