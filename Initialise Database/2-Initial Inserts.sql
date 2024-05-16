USE Luadingo;

-- THIS SQL ADDS A BUNCHA QUIZES AND QUESTIONS

-- ONLY USE IF YOU MADE A FRESH DATABASE

-- INITIAL ADMIN

INSERT INTO user(username, email, password, level) VALUE ('TheUltimateAvenger', 'nothingCanStopUs', 'theultavenger@gmail.com', 'Admin');

-- COURSES
-- 1=Turkish 2=Azerbaijani 3=German 4=Russian 5=English


INSERT INTO course(course_name,course_language) VALUE ('Learn Turkish!', 'Turkish'); -- 1
INSERT INTO course(course_name,course_language) VALUE ('Learn Azerbaijani!', 'Azerbaijani'); -- 2
INSERT INTO course(course_name,course_language) VALUE ('Learn Russian!', 'Russian'); -- 3
INSERT INTO course(course_name,course_language) VALUE ('Learn Spanish!', 'Spanish'); -- 4

-- QUIZZES
-- 1-5 Turkish 6-10 Azer 11-15 German 16-20 Russian 21 - 25 English

INSERT INTO quiz(quiz_title) VALUE ('Turkish Part I'); -- 1
INSERT INTO has_quiz(course_id,quiz_id) VALUE(1,1);
INSERT INTO quiz(quiz_title) VALUE ('Turkish Part II'); -- 2
INSERT INTO has_quiz(course_id,quiz_id) VALUE(1,2);
INSERT INTO quiz(quiz_title) VALUE ('Turkish Part III'); -- 3
INSERT INTO has_quiz(course_id,quiz_id) VALUE(1,3);
INSERT INTO quiz(quiz_title) VALUE ('Turkish Part IV'); -- 4
INSERT INTO has_quiz(course_id,quiz_id) VALUE(1,4);
INSERT INTO quiz(quiz_title) VALUE ('Turkish Part V'); -- 5
INSERT INTO has_quiz(course_id,quiz_id) VALUE(1,5);

INSERT INTO quiz(quiz_title) VALUE ('Azerbaijani Part I'); -- 6
INSERT INTO has_quiz(course_id,quiz_id) VALUE(2,6);
INSERT INTO quiz(quiz_title) VALUE ('Azerbaijani Part II'); -- 7
INSERT INTO has_quiz(course_id,quiz_id) VALUE(2,7);
INSERT INTO quiz(quiz_title) VALUE ('Azerbaijani Part III'); -- 8
INSERT INTO has_quiz(course_id,quiz_id) VALUE(2,8);
INSERT INTO quiz(quiz_title) VALUE ('Azerbaijani Part IV'); -- 9
INSERT INTO has_quiz(course_id,quiz_id) VALUE(2,9);
INSERT INTO quiz(quiz_title) VALUE ('Azerbaijani Part V'); -- 10
INSERT INTO has_quiz(course_id,quiz_id) VALUE(2,10);

INSERT INTO quiz(quiz_title) VALUE ('Russian Part I'); -- 11
INSERT INTO has_quiz(course_id,quiz_id) VALUE(3,11);
INSERT INTO quiz(quiz_title) VALUE ('Russian Part II'); -- 12
INSERT INTO has_quiz(course_id,quiz_id) VALUE(3,12);
INSERT INTO quiz(quiz_title) VALUE ('Russian Part III'); -- 13
INSERT INTO has_quiz(course_id,quiz_id) VALUE(3,13);
INSERT INTO quiz(quiz_title) VALUE ('Russian Part IV'); -- 14
INSERT INTO has_quiz(course_id,quiz_id) VALUE(3,14);
INSERT INTO quiz(quiz_title) VALUE ('Russian Part V'); -- 15
INSERT INTO has_quiz(course_id,quiz_id) VALUE(3,15);

INSERT INTO quiz(quiz_title) VALUE ('Spanish Part I'); -- 16
INSERT INTO has_quiz(course_id,quiz_id) VALUE(4,16);
INSERT INTO quiz(quiz_title) VALUE ('Spanish Part II'); -- 17
INSERT INTO has_quiz(course_id,quiz_id) VALUE(4,17);
INSERT INTO quiz(quiz_title) VALUE ('Spanish Part III'); -- 18
INSERT INTO has_quiz(course_id,quiz_id) VALUE(4,18);
INSERT INTO quiz(quiz_title) VALUE ('Spanish Part IV'); -- 19
INSERT INTO has_quiz(course_id,quiz_id) VALUE(4,19);
INSERT INTO quiz(quiz_title) VALUE ('Spanish Part V'); -- 20
INSERT INTO has_quiz(course_id,quiz_id) VALUE(4,20);

