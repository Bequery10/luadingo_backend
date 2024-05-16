USE luadingo;

-- QUERRY FOR QUIZZES FROM SELECTED COURSE

SELECT * FROM has_quiz
WHERE course_id = 1
ORDER BY quiz_id;

-- QUERRY FOR QUESTIONS FROM SELECTED QUIZ

SELECT question_id FROM has_question
WHERE quiz_id = 1
ORDER BY question_id;

-- QUERRY FOR OPTIONS FROM SELECTED QUESTION

SELECT choice FROM has_option
WHERE question_id = 1
ORDER BY choice;


