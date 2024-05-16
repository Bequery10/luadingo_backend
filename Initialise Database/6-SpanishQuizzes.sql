USE Luadingo;

-- This has all the insertions to the Spanish Quizzes

-- Quiz 1

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Spanish: "Apple".', 'MultipleChoice', 'Manzana');

INSERT INTO has_options (question_id, choice)
VALUES (76, 'Manzana'),
       (76, 'Plátano'),
       (76, 'Naranja'),
       (76, 'Uva');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct form of the verb "to be" for the following sentence: "Yo ___" (I am).', 'MultipleChoice', 'Soy');

INSERT INTO has_options (question_id, choice)
VALUES (77, 'Ser'),
       (77, 'Estoy'),
       (77, 'Soy'),
       (77, 'Estar');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Spanish: "House".', 'MultipleChoice', 'Casa');

INSERT INTO has_options (question_id, choice)
VALUES (78, 'Casa'),
       (78, 'Carro'),
       (78, 'Escuela'),
       (78, 'Perro');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: What does "Hola" mean?', 'MultipleChoice', 'Hello');

INSERT INTO has_options (question_id, choice)
VALUES (79, 'Goodbye'),
       (79, 'Hello'),
       (79, 'Thank you'),
       (79, 'Please');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct personal pronoun for "You" (singular).', 'MultipleChoice', 'Tú');

INSERT INTO has_options (question_id, choice)
VALUES (80, 'Yo'),
       (80, 'Tú'),
       (80, 'Él'),
       (80, 'Nosotros');

INSERT INTO has_question (quiz_id, question_id)
VALUES (16, 76),
       (16, 77),
       (16, 78),
       (16, 79),
       (16, 80);

-- Quiz 2

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Spanish: "Dog".', 'MultipleChoice', 'Perro');

INSERT INTO has_options (question_id, choice)
VALUES (81, 'Gato'),
       (81, 'Pájaro'),
       (81, 'Pez'),
       (81, 'Perro');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct plural form of "book" (libro).', 'MultipleChoice', 'Libros');

INSERT INTO has_options (question_id, choice)
VALUES (82, 'Libras'),
       (82, 'Libro'),
       (82, 'Libres'),
       (82, 'Libros');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: What does "Cómo estás?" mean?', 'MultipleChoice', 'How are you?');

INSERT INTO has_options (question_id, choice)
VALUES (83, 'What is your name?'),
       (83, 'How are you?'),
       (83, 'Where are you from?'),
       (83, 'What time is it?');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Spanish: "Car".', 'MultipleChoice', 'Carro');

INSERT INTO has_options (question_id, choice)
VALUES (84, 'Avión'),
       (84, 'Bicicleta'),
       (84, 'Carro'),
       (84, 'Tren');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: What is the correct form of "to eat" (comer) in the present tense for "he/she/it"?', 'MultipleChoice', 'Come');

INSERT INTO has_options (question_id, choice)
VALUES (85, 'Come'),
       (85, 'Comemos'),
       (85, 'Comer'),
       (85, 'Comes');

INSERT INTO has_question (quiz_id, question_id)
VALUES (17, 81),
       (17, 82),
       (17, 83),
       (17, 84),
       (17, 85);

-- Quiz 3

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Spanish: "Water".', 'MultipleChoice', 'Agua');

INSERT INTO has_options (question_id, choice)
VALUES (86, 'Leche'),
       (86, 'Café'),
       (86, 'Agua'),
       (86, 'Jugo');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: What is the correct possessive form for "my house"?', 'MultipleChoice', 'Mi casa');

INSERT INTO has_options (question_id, choice)
VALUES (87, 'Mi casa'),
       (87, 'Tu casa'),
       (87, 'Su casa'),
       (87, 'Nuestra casa');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: What does "Gracias" mean?', 'MultipleChoice', 'Thank you');

INSERT INTO has_options (question_id, choice)
VALUES (88, 'Excuse me'),
       (88, 'I''m sorry'),
       (88, 'Thank you'),
       (88, 'Please');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Spanish: "Book".', 'MultipleChoice', 'Libro');

INSERT INTO has_options (question_id, choice)
VALUES (89, 'Lápiz'),
       (89, 'Papel'),
       (89, 'Libro'),
       (89, 'Cuaderno');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct form of the verb "to go" (ir) for "we" in the present tense.', 'MultipleChoice', 'Vamos');

INSERT INTO has_options (question_id, choice)
VALUES (90, 'Voy'),
       (90, 'Vas'),
       (90, 'Va'),
       (90, 'Vamos');

INSERT INTO has_question (quiz_id, question_id)
VALUES (18, 86),
       (18, 87),
       (18, 88),
       (18, 89),
       (18, 90);

-- Quiz 4

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Spanish: "School".', 'MultipleChoice', 'Escuela');

INSERT INTO has_options (question_id, choice)
VALUES (91, 'Librería'),
       (91, 'Escuela'),
       (91, 'Clase'),
       (91, 'Curso');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: What is the correct negative form of "I am a student" (Yo soy estudiante)?', 'MultipleChoice', 'Yo no soy estudiante');

INSERT INTO has_options (question_id, choice)
VALUES (92, 'Yo soy no estudiante'),
       (92, 'Yo no soy un estudiante'),
       (92, 'Yo soy estudiante no'),
       (92, 'Yo no soy estudiante');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: What does "Cuántos años tienes?" mean?', 'MultipleChoice', 'How old are you?');

INSERT INTO has_options (question_id, choice)
VALUES (93, 'What is your name?'),
       (93, 'How old are you?'),
       (93, 'Where are you from?'),
       (93, 'What time is it?');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Spanish: "City".', 'MultipleChoice', 'Ciudad');

INSERT INTO has_options (question_id, choice)
VALUES (94, 'Pueblo'),
       (94, 'Ciudad'),
       (94, 'País'),
       (94, 'Estado');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct form of "to read" (leer) in the present tense for "they".', 'MultipleChoice', 'Leen');

INSERT INTO has_options (question_id, choice)
VALUES (95, 'Leo'),
       (95, 'Lees'),
       (95, 'Leemos'),
       (95, 'Leen');

INSERT INTO has_question (quiz_id, question_id)
VALUES (19, 91),
       (19, 92),
       (19, 93),
       (19, 94),
       (19, 95);

-- Quiz 5

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Spanish: "Table".', 'MultipleChoice', 'Mesa');

INSERT INTO has_options (question_id, choice)
VALUES (96, 'Mesa'),
       (96, 'Silla'),
       (96, 'Escritorio'),
       (96, 'Estantería');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: What is the correct form of the verb "to do" (hacer) for "I" in the past tense?', 'MultipleChoice', 'Hice');

INSERT INTO has_options (question_id, choice)
VALUES (97, 'Hago'),
       (97, 'Hiciste'),
       (97, 'Hizo'),
       (97, 'Hice');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Sentence: Translate "I have a cat" into Spanish.', 'MultipleChoice', 'Tengo un gato');

INSERT INTO has_options (question_id, choice)
VALUES (98, 'Tengo un perro'),
       (98, 'Tengo un gato'),
       (98, 'Tengo un pájaro'),
       (98, 'Tengo un pez');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Vocabulary: Translate the following word into Spanish: "Family".', 'MultipleChoice', 'Familia');

INSERT INTO has_options (question_id, choice)
VALUES (99, 'Amigo'),
       (99, 'Familia'),
       (99, 'Vecino'),
       (99, 'Equipo');

INSERT INTO question (question_text, question_type, question_answer)
VALUES ('Grammar: Choose the correct possessive form for "your name" (nombre).', 'MultipleChoice', 'Tu nombre');

INSERT INTO has_options (question_id, choice)
VALUES (100, 'Mi nombre'),
       (100, 'Tu nombre'),
       (100, 'Su nombre'),
       (100, 'Nuestro nombre');

INSERT INTO has_question (quiz_id, question_id)
VALUES (20, 96),
       (20, 97),
       (20, 98),
       (20, 99),
       (20, 100);
