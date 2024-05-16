USE Luadingo;

-- This has all the insertions to the turkish Quizzes

-- Quiz 1 (Beginner Level)

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Turkish: "Apple".', 'MultipleChoice', 'Elma');

INSERT INTO has_options (question_id, choice)
VALUES (1, 'Elma'),
       (1, 'Armut'),
       (1, 'Muz'),
       (1, 'Üzüm');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct form of the verb "to be" for the following sentence: "Ben ___" (I am).', 'MultipleChoice', 'Varım');

INSERT INTO has_options (question_id, choice)
VALUES (2, 'Olmak'),
       (2, 'İyiyim'),
       (2, 'Var'),
       (2, 'Varım');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Turkish: "House".', 'MultipleChoice', 'Ev');

INSERT INTO has_options (question_id, choice)
VALUES (3, 'Ev'),
       (3, 'Araba'),
       (3, 'Okul'),
       (3, 'Köpek');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: What does "Merhaba" mean?', 'MultipleChoice', 'Hello');

INSERT INTO has_options (question_id, choice)
VALUES (4, 'Goodbye'),
       (4, 'Hello'),
       (4, 'Thank you'),
       (4, 'Please');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct personal pronoun for "You" (singular).', 'MultipleChoice', 'Sen');

INSERT INTO has_options (question_id, choice)
VALUES (5, 'Ben'),
       (5, 'Sen'),
       (5, 'O'),
       (5, 'Biz');

INSERT INTO has_question (quiz_id, question_id)
VALUES (1, 1),
       (1, 2),
       (1, 3),
       (1, 4),
       (1, 5);

-- Quiz 2

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Turkish: "Dog".', 'MultipleChoice', 'Köpek');

INSERT INTO has_options (question_id, choice)
VALUES (6, 'Kedi'),
       (6, 'Kuş'),
       (6, 'Balık'),
       (6, 'Köpek');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct plural form of "book" (kitap).', 'MultipleChoice', 'Kitaplar');

INSERT INTO has_options (question_id, choice)
VALUES (7, 'Kitaplar'),
       (7, 'Kitaplarım'),
       (7, 'Kitapları'),
       (7, 'Kitaplarınız');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: What does "Nasılsın?" mean?', 'MultipleChoice', 'How are you?');

INSERT INTO has_options (question_id, choice)
VALUES (8, 'How are you?'),
       (8, 'What is this?'),
       (8, 'Where are you?'),
       (8, 'How old are you?');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Turkish: "Car".', 'MultipleChoice', 'Araba');

INSERT INTO has_options (question_id, choice)
VALUES (9, 'Araba'),
       (9, 'Uçak'),
       (9, 'Bisiklet'),
       (9, 'Tren');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: What is the correct form of "to eat" (yemek) in the present tense for "he/she/it"?', 'MultipleChoice', 'Yer');

INSERT INTO has_options (question_id, choice)
VALUES (10, 'Yerim'),
       (10, 'Yer'),
       (10, 'Yersin'),
       (10, 'Yiyoruz');

INSERT INTO has_question (quiz_id, question_id)
VALUES (2, 6),
       (2, 7),
       (2, 8),
       (2, 9),
       (2, 10);

-- Quiz 3

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Turkish: "Water".', 'MultipleChoice', 'Su');

INSERT INTO has_options (question_id, choice)
VALUES (11, 'Su'),
       (11, 'Çay'),
       (11, 'Kahve'),
       (11, 'Süt');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: What is the correct possessive form for "my house"?', 'MultipleChoice', 'Evim');

INSERT INTO has_options (question_id, choice)
VALUES (12, 'Evim'),
       (12, 'Evin'),
       (12, 'Evi'),
       (12, 'Evimiz');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: What does "Teşekkür ederim" mean?', 'MultipleChoice', 'Thank you');

INSERT INTO has_options (question_id, choice)
VALUES (13, 'Excuse me'),
       (13, 'I''m sorry'),
       (13, 'Thank you'),
       (13, 'Please');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Turkish: "Book".', 'MultipleChoice', 'Kitap');

INSERT INTO has_options (question_id, choice)
VALUES (14, 'Kalem'),
       (14, 'Kitap'),
       (14, 'Defter'),
       (14, 'Kağıt');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct form of the verb "to go" (gitmek) for "we" in the present tense.', 'MultipleChoice', 'Gideriz');

INSERT INTO has_options (question_id, choice)
VALUES (15, 'Giderim'),
       (15, 'Gider'),
       (15, 'Gidersiniz'),
       (15, 'Gideriz');

INSERT INTO has_question (quiz_id, question_id)
VALUES (3, 11),
       (3, 12),
       (3, 13),
       (3, 14),
       (3, 15);

-- Quiz 4

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Turkish: "School".', 'MultipleChoice', 'Okul');

INSERT INTO has_options (question_id, choice)
VALUES (16, 'Kütüphane'),
       (16, 'Okul'),
       (16, 'Sınıf'),
       (16, 'Ders');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: What is the correct negative form of "I am a student" (Ben öğrenciyim)?', 'MultipleChoice', 'Ben öğrenci değilim');

INSERT INTO has_options (question_id, choice)
VALUES (17, 'Ben öğrenci değilim'),
       (17, 'Ben öğrenci değilsin'),
       (17, 'Ben öğrenci değil'),
       (17, 'Ben öğrenci değiliz');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: What does "Kaç yaşındasın?" mean?', 'MultipleChoice', 'How old are you?');

INSERT INTO has_options (question_id, choice)
VALUES (18, 'What is your name?'),
       (18, 'How old are you?'),
       (18, 'Where are you from?'),
       (18, 'What time is it?');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Turkish: "City".', 'MultipleChoice', 'Şehir');

INSERT INTO has_options (question_id, choice)
VALUES (19, 'Köy'),
       (19, 'Kasaba'),
       (19, 'Şehir'),
       (19, 'Ülke');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct form of "to read" (okumak) in the present tense for "they".', 'MultipleChoice', 'Okurlar');

INSERT INTO has_options (question_id, choice)
VALUES (20, 'Okurlar'),
       (20, 'Okurum'),
       (20, 'Okuruz'),
       (20, 'Okursun');

INSERT INTO has_question (quiz_id, question_id)
VALUES (4, 16),
       (4, 17),
       (4, 18),
       (4, 19),
       (4, 20);

-- Quiz 5

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Turkish: "Table".', 'MultipleChoice', 'Masa');

INSERT INTO has_options (question_id, choice)
VALUES (21, 'Sandalye'),
       (21, 'Masa'),
       (21, 'Dolap'),
       (21, 'Raf');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: What is the correct form of the verb "to do" (yapmak) for "I" in the past tense?', 'MultipleChoice', 'Yaptım');

INSERT INTO has_options (question_id, choice)
VALUES (22, 'Yaptım'),
       (22, 'Yaptı'),
       (22, 'Yaptık'),
       (22, 'Yaptınız');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: Translate "I have a cat" into Turkish.', 'MultipleChoice', 'Benim bir kedim var');

INSERT INTO has_options (question_id, choice)
VALUES (23, 'Benim bir köpeğim var'),
       (23, 'Benim bir kedim var'),
       (23, 'Ben bir kuşum var'),
       (23, 'Ben bir balığım var');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Turkish: "Family".', 'MultipleChoice', 'Aile');

INSERT INTO has_options (question_id, choice)
VALUES (24, 'Arkadaş'),
       (24, 'Aile'),
       (24, 'Komşu'),
       (24, 'Ekip');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct possessive form for "your name" (isim).', 'MultipleChoice', 'İsmin');

INSERT INTO has_options (question_id, choice)
VALUES (25, 'İsmim'),
       (25, 'İsmin'),
       (25, 'İsmi'),
       (25, 'İsmimiz');

INSERT INTO has_question (quiz_id, question_id)
VALUES (5, 21),
       (5, 22),
       (5, 23),
       (5, 24),
       (5, 25);
