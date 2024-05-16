USE Luadingo;

-- This has all the insertions to the Russian Quizzes

-- Quiz 1

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Russian: "Apple".', 'MultipleChoice', 'Яблоко');

INSERT INTO has_options (question_id, choice)
VALUES (51, 'Яблоко'),
       (51, 'Банан'),
       (51, 'Виноград'),
       (51, 'Апельсин');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct form of the verb "to be" for the following sentence: "Я ___" (I am).', 'MultipleChoice', 'Есть');

INSERT INTO has_options (question_id, choice)
VALUES (52, 'Есть'),
       (52, 'Быть'),
       (52, 'буду'),
       (52, 'Ем');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Russian: "House".', 'MultipleChoice', 'Дом');

INSERT INTO has_options (question_id, choice)
VALUES (53, 'Машина'),
       (53, 'Дом'),
       (53, 'Школа'),
       (53, 'Собака');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: What does "Привет" mean?', 'MultipleChoice', 'Hello');

INSERT INTO has_options (question_id, choice)
VALUES (54, 'Goodbye'),
       (54, 'Hello'),
       (54, 'Thank you'),
       (54, 'Please');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct personal pronoun for "You" (singular, informal).', 'MultipleChoice', 'Ты');

INSERT INTO has_options (question_id, choice)
VALUES (55, 'Я'),
       (55, 'Ты'),
       (55, 'Он'),
       (55, 'Мы');

INSERT INTO has_question (quiz_id, question_id)
VALUES (11, 51),
       (11, 52),
       (11, 53),
       (11, 54),
       (11, 55);

-- Quiz 2

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Russian: "Dog".', 'MultipleChoice', 'Собака');

INSERT INTO has_options (question_id, choice)
VALUES (56, 'Кот'),
       (56, 'Птица'),
       (56, 'Рыба'),
       (56, 'Собака');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct plural form of "book" (книга).', 'MultipleChoice', 'Книги');

INSERT INTO has_options (question_id, choice)
VALUES (57, 'Книги'),
       (57, 'Книга'),
       (57, 'Книг'),
       (57, 'Книгами');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: What does "Как дела?" mean?', 'MultipleChoice', 'How are you?');

INSERT INTO has_options (question_id, choice)
VALUES (58, 'What is your name?'),
       (58, 'How are you?'),
       (58, 'Where are you from?'),
       (58, 'What time is it?');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Russian: "Car".', 'MultipleChoice', 'Автомобиль');

INSERT INTO has_options (question_id, choice)
VALUES (59, 'Велосипед'),
       (59, 'Автомобиль'),
       (59, 'Самолет'),
       (59, 'Поезд');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: What is the correct form of "to eat" (есть) in the present tense for "he/she/it"?', 'MultipleChoice', 'Ест');

INSERT INTO has_options (question_id, choice)
VALUES (60, 'Ем'),
       (60, 'Ест'),
       (60, 'Ешь'),
       (60, 'Едим');

INSERT INTO has_question (quiz_id, question_id)
VALUES (12, 56),
       (12, 57),
       (12, 58),
       (12, 59),
       (12, 60);

-- Quiz 3

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Russian: "Water".', 'MultipleChoice', 'Вода');

INSERT INTO has_options (question_id, choice)
VALUES (61, 'Молоко'),
       (61, 'Кофе'),
       (61, 'Вода'),
       (61, 'Сок');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: What is the correct possessive form for "my house"?', 'MultipleChoice', 'Мой дом');

INSERT INTO has_options (question_id, choice)
VALUES (62, 'Мой дом'),
       (62, 'Твой дом'),
       (62, 'Его дом'),
       (62, 'Наш дом');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: What does "Спасибо" mean?', 'MultipleChoice', 'Thank you');

INSERT INTO has_options (question_id, choice)
VALUES (63, 'Excuse me'),
       (63, 'I\'m sorry'),
       (63, 'Thank you'),
       (63, 'Please');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Russian: "Book".', 'MultipleChoice', 'Книга');

INSERT INTO has_options (question_id, choice)
VALUES (64, 'Ручка'),
       (64, 'Бумага'),
       (64, 'Книга'),
       (64, 'Тетрадь');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct form of the verb "to go" (идти) for "we" in the present tense.', 'MultipleChoice', 'Идем');

INSERT INTO has_options (question_id, choice)
VALUES (65, 'Иду'),
       (65, 'Идешь'),
       (65, 'Идет'),
       (65, 'Идем');

INSERT INTO has_question (quiz_id, question_id)
VALUES (13, 61),
       (13, 62),
       (13, 63),
       (13, 64),
       (13, 65);

-- Quiz 4

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Russian: "School".', 'MultipleChoice', 'Школа');

INSERT INTO has_options (question_id, choice)
VALUES (66, 'Библиотека'),
       (66, 'Школа'),
       (66, 'Класс'),
       (66, 'Урок');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: What is the correct negative form of "I am a student" (Я студент)?', 'MultipleChoice', 'Я не студент');

INSERT INTO has_options (question_id, choice)
VALUES (67, 'Я не студент'),
       (67, 'Я нет студент'),
       (67, 'Я не есть студент'),
       (67, 'Я студент нет');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: What does "Сколько тебе лет?" mean?', 'MultipleChoice', 'How old are you?');

INSERT INTO has_options (question_id, choice)
VALUES (68, 'What is your name?'),
       (68, 'How old are you?'),
       (68, 'Where are you from?'),
       (68, 'What time is it?');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Russian: "City".', 'MultipleChoice', 'Город');

INSERT INTO has_options (question_id, choice)
VALUES (69, 'Деревня'),
       (69, 'Город'),
       (69, 'Страна'),
       (69, 'Штат');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct form of "to read" (читать) in the present tense for "they".', 'MultipleChoice', 'Читают');

INSERT INTO has_options (question_id, choice)
VALUES (70, 'Читаю'),
       (70, 'Читаешь'),
       (70, 'Читаем'),
       (70, 'Читают');

INSERT INTO has_question (quiz_id, question_id)
VALUES (14, 66),
       (14, 67),
       (14, 68),
       (14, 69),
       (14, 70);

-- Quiz 5

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Russian: "Table".', 'MultipleChoice', 'Стол');

INSERT INTO has_options (question_id, choice)
VALUES (71, 'Стул'),
       (71, 'Стол'),
       (71, 'Письменный стол'),
       (71, 'Шкаф');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: What is the correct form of the verb "to do" (делать) for "I" in the past tense?', 'MultipleChoice', 'Делал');

INSERT INTO has_options (question_id, choice)
VALUES (72, 'Делаю'),
       (72, 'Делал'),
       (72, 'Делала'),
       (72, 'Делали');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: Translate "I have a cat" into Russian.', 'MultipleChoice', 'У меня есть кошка');

INSERT INTO has_options (question_id, choice)
VALUES (73, 'У меня есть собака'),
       (73, 'У меня есть кошка'),
       (73, 'У меня есть птица'),
       (73, 'У меня есть рыба');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Russian: "Family".', 'MultipleChoice', 'Семья');

INSERT INTO has_options (question_id, choice)
VALUES (74, 'Друг'),
       (74, 'Семья'),
       (74, 'Сосед'),
       (74, 'Команда');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct possessive form for "your name" (имя).', 'MultipleChoice', 'Твое имя');

INSERT INTO has_options (question_id, choice)
VALUES (75, 'Мое имя'),
       (75, 'Твое имя'),
       (75, 'Его имя'),
       (75, 'Наше имя');

INSERT INTO has_question (quiz_id, question_id)
VALUES (15, 71),
       (15, 72),
       (15, 73),
       (15, 74),
       (15, 75);

