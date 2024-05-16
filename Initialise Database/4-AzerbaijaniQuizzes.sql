USE Luadingo;

-- This has all the insertions to the Azerbaijani Quizzes

-- Quiz 1

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Azerbaijani: "Apple".', 'MultipleChoice', 'Alma');

INSERT INTO has_options (question_id, choice)
VALUES (26, 'Alma'),
       (26, 'Armud'),
       (26, 'Banan'),
       (26, 'Üzüm');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct form of the verb "to be" for the following sentence: "Mən ___" (I am).', 'MultipleChoice', 'Var');

INSERT INTO has_options (question_id, choice)
VALUES (27, 'Olmaq'),
       (27, 'Yaxşıyam'),
       (27, 'Var'),
       (27, 'Varam');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Azerbaijani: "House".', 'MultipleChoice', 'Ev');

INSERT INTO has_options (question_id, choice)
VALUES (28, 'Ev'),
       (28, 'Maşın'),
       (28, 'Məktəb'),
       (28, 'İt');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: What does "Salam" mean?', 'MultipleChoice', 'Hello');

INSERT INTO has_options (question_id, choice)
VALUES (29, 'Goodbye'),
       (29, 'Hello'),
       (29, 'Thank you'),
       (29, 'Please');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct personal pronoun for "You" (singular).', 'MultipleChoice', 'Sən');

INSERT INTO has_options (question_id, choice)
VALUES (30, 'Mən'),
       (30, 'Sən'),
       (30, 'O'),
       (30, 'Biz');

INSERT INTO has_question (quiz_id, question_id)
VALUES (6, 26),
       (6, 27),
       (6, 28),
       (6, 29),
       (6, 30);

-- Quiz 2

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Azerbaijani: "Dog".', 'MultipleChoice', 'İt');

INSERT INTO has_options (question_id, choice)
VALUES (31, 'Pişik'),
       (31, 'Quş'),
       (31, 'Balıq'),
       (31, 'İt');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct plural form of "book" (kitab).', 'MultipleChoice', 'Kitablar');

INSERT INTO has_options (question_id, choice)
VALUES (32, 'Kitablar'),
       (32, 'Kitablarım'),
       (32, 'Kitabları'),
       (32, 'Kitablarınız');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: What does "Necəsən?" mean?', 'MultipleChoice', 'How are you?');

INSERT INTO has_options (question_id, choice)
VALUES (33, 'How are you?'),
       (33, 'What is this?'),
       (33, 'Where are you?'),
       (33, 'How old are you?');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Azerbaijani: "Car".', 'MultipleChoice', 'Maşın');

INSERT INTO has_options (question_id, choice)
VALUES (34, 'Maşın'),
       (34, 'Təyyarə'),
       (34, 'Velosiped'),
       (34, 'Qatar');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: What is the correct form of "to eat" (yemək) in the present tense for "he/she/it"?', 'MultipleChoice', 'Yeyir');

INSERT INTO has_options (question_id, choice)
VALUES (35, 'Yeyirəm'),
       (35, 'Yeyir'),
       (35, 'Yeyirsən'),
       (35, 'Yeyirik');

INSERT INTO has_question (quiz_id, question_id)
VALUES (7, 31),
       (7, 32),
       (7, 33),
       (7, 34),
       (7, 35);

-- Quiz 3

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Azerbaijani: "Water".', 'MultipleChoice', 'Su');

INSERT INTO has_options (question_id, choice)
VALUES (36, 'Su'),
       (36, 'Çay'),
       (36, 'Qəhvə'),
       (36, 'Süd');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: What is the correct possessive form for "my house"?', 'MultipleChoice', 'Evim');

INSERT INTO has_options (question_id, choice)
VALUES (37, 'Evim'),
       (37, 'Evin'),
       (37, 'Evi'),
       (37, 'Evimiz');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: What does "Çox sağ ol" mean?', 'MultipleChoice', 'Thank you');

INSERT INTO has_options (question_id, choice)
VALUES (38, 'Excuse me'),
       (38, 'I''m sorry'),
       (38, 'Thank you'),
       (38, 'Please');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Azerbaijani: "Book".', 'MultipleChoice', 'Kitab');

INSERT INTO has_options (question_id, choice)
VALUES (39, 'Qələm'),
       (39, 'Kitab'),
       (39, 'Dəftər'),
       (39, 'Kağız');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct form of the verb "to go" (getmək) for "we" in the present tense.', 'MultipleChoice', 'Gedirik');

INSERT INTO has_options (question_id, choice)
VALUES (40, 'Gedirəm'),
       (40, 'Gedir'),
       (40, 'Gedirsəniz'),
       (40, 'Gedirik');

INSERT INTO has_question (quiz_id, question_id)
VALUES (8, 36),
       (8, 37),
       (8, 38),
       (8, 39),
       (8, 40);

-- Quiz 4

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Azerbaijani: "School".', 'MultipleChoice', 'Məktəb');

INSERT INTO has_options (question_id, choice)
VALUES (41, 'Kitabxana'),
       (41, 'Məktəb'),
       (41, 'Sinif'),
       (41, 'Dərs');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: What is the correct negative form of "I am a student" (Mən tələbəyəm)?', 'MultipleChoice', 'Mən tələbə deyiləm');

INSERT INTO has_options (question_id, choice)
VALUES (42, 'Mən tələbə deyiləm'),
       (42, 'Mən tələbə deyilsən'),
       (42, 'Mən tələbə deyil'),
       (42, 'Mən tələbə deyilik');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: What does "Neçə yaşın var?" mean?', 'MultipleChoice', 'How old are you?');

INSERT INTO has_options (question_id, choice)
VALUES (43, 'What is your name?'),
       (43, 'How old are you?'),
       (43, 'Where are you from?'),
       (43, 'What time is it?');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Azerbaijani: "City".', 'MultipleChoice', 'Şəhər');

INSERT INTO has_options (question_id, choice)
VALUES (44, 'Kənd'),
       (44, 'Qəsəbə'),
       (44, 'Şəhər'),
       (44, 'Ölkə');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct form of "to read" (oxumaq) in the present tense for "they".', 'MultipleChoice', 'Oxuyurlar');

INSERT INTO has_options (question_id, choice)
VALUES (45, 'Oxuyurlar'),
       (45, 'Oxuyuram'),
       (45, 'Oxuyuruq'),
       (45, 'Oxuyursan');

INSERT INTO has_question (quiz_id, question_id)
VALUES (9, 41),
       (9, 42),
       (9, 43),
       (9, 44),
       (9, 45);

-- Quiz 5

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Azerbaijani: "Table".', 'MultipleChoice', 'Masa');

INSERT INTO has_options (question_id, choice)
VALUES (46, 'Stul'),
       (46, 'Masa'),
       (46, 'Dolab'),
       (46, 'Raf');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: What is the correct form of the verb "to do" (etmək) for "I" in the past tense?', 'MultipleChoice', 'Etdim');

INSERT INTO has_options (question_id, choice)
VALUES (47, 'Etdim'),
       (47, 'Etdi'),
       (47, 'Etdik'),
       (47, 'Etdiniz');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: Translate "I have a cat" into Azerbaijani.', 'MultipleChoice', 'Mənim bir pişiyim var');

INSERT INTO has_options (question_id, choice)
VALUES (48, 'Mənim bir itim var'),
       (48, 'Mənim bir pişiyim var'),
       (48, 'Mənim bir quşum var'),
       (48, 'Mənim bir balığım var');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Azerbaijani: "Family".', 'MultipleChoice', 'Ailə');

INSERT INTO has_options (question_id, choice)
VALUES (49, 'Dost'),
       (49, 'Ailə'),
       (49, 'Qonşu'),
       (49, 'Komanda');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct possessive form for "your name" (ad).', 'MultipleChoice', 'Adın');

INSERT INTO has_options (question_id, choice)
VALUES (50, 'Adım'),
       (50, 'Adın'),
       (50, 'Adı'),
       (50, 'Adımız');

INSERT INTO has_question (quiz_id, question_id)
VALUES (10, 46),
       (10, 47),
       (10, 48),
       (10, 49),
       (10, 50);

