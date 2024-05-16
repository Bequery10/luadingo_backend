USE luadingo;

-- QUERRY FOR QUIZZES FROM SELECTED COURSE

-- BASIC VERSION

SELECT quiz_id FROM has_quiz
WHERE course_id = 1
ORDER BY quiz_id;

-- JOINED VERSION

SELECT * FROM has_quiz AS hq, quiz AS q
WHERE hq.course_id = 1 AND q.quiz_id = hq.quiz_id
ORDER BY hq.quiz_id;

-- QUERRY FOR QUESTIONS FROM SELECTED QUIZ

-- BASIC VERSION

SELECT question_id FROM has_question
WHERE quiz_id = 1
ORDER BY question_id;

-- JOINED VERSION

SELECT * FROM has_question AS hq, question AS q
WHERE hq.quiz_id = 1 AND q.question_id = hq.question_id
ORDER BY hq.question_id;

-- QUERRY FOR OPTIONS FROM SELECTED QUESTION

-- BASIC VERSION

SELECT choice FROM has_options
WHERE question_id = 1
ORDER BY choice;

-- JOINED VERSION

SELECT * FROM has_options AS ho, question as q
WHERE q.question_id = 1 and ho.question_id = q.question_id
ORDER BY ho.choice;


