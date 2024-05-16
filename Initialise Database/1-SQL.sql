-- MySQL Workbench Forward Engineering
-- -----------------------------------------------------
-- Not everything was correctly generated. Let me know if theres anything missing. -Ahmet
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Luadingo` DEFAULT CHARACTER SET utf8mb3 ;
USE `Luadingo` ;

-- -----------------------------------------------------
-- Table `Luadingo`.`question`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Luadingo`.`Question` (
  `question_id` INT AUTO_INCREMENT NOT NULL,
  `question_text` TEXT NOT NULL,
  `question_type` ENUM('MultipleChoice', 'TrueFalse', 'FillTheBlank') NOT NULL DEFAULT 'MultipleChoice',
  `question_answer` TEXT NOT NULL,
  PRIMARY KEY (`question_id`))
  ENGINE=InnoDB;



-- -----------------------------------------------------
-- Table `Luadingo`.`quiz`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Luadingo`.`Quiz` (
  `quiz_id` INT AUTO_INCREMENT NOT NULL,
  `quiz_title` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`quiz_id`))
  ENGINE=InnoDB;


-- -----------------------------------------------------
-- Table `Luadingo`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Luadingo`.`User` (
  `username` VARCHAR(50) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `level` ENUM('Beginner', 'Intermediate', 'Advanced','Admin') NOT NULL DEFAULT 'Beginner',
  PRIMARY KEY (`username`),
  UNIQUE INDEX `Email_UNIQUE` (`email` ASC) VISIBLE)
  ENGINE=InnoDB;


-- -----------------------------------------------------
-- Table `Luadingo`.`attempt`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Luadingo`.`Attempt` (
  `attempt_id`  INT AUTO_INCREMENT NOT NULL,
  `attempt_current` INT NOT NULL DEFAULT '1',
  `attempt_score` INT NOT NULL DEFAULT '0',
  `attempt_timestamp` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`attempt_id`),
  UNIQUE INDEX `score_UNIQUE` (`attempt_score` ASC) VISIBLE)
  ENGINE=InnoDB;



-- -----------------------------------------------------
-- Table `Luadingo`.`badge`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Luadingo`.`Badge` (
  `badge_id` INT AUTO_INCREMENT NOT NULL,
  `badge_name` VARCHAR(50) NOT NULL,
  `badge_desc` TEXT NOT NULL,
  `badge_image_url` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`badge_id`))
  ENGINE=InnoDB;



-- -----------------------------------------------------
-- Table `Luadingo`.`course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Luadingo`.`Course` (
  `course_id` INT AUTO_INCREMENT NOT NULL,
  `course_name` VARCHAR(100) CHARACTER SET 'armscii8' NOT NULL,
  `course_language` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`course_id`))
  ENGINE=InnoDB;



-- -----------------------------------------------------
-- Table `Luadingo`.`friends_with`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Luadingo`.`Friends_With` (
  `username1` VARCHAR(50) NOT NULL,
  `username2` VARCHAR(50) NOT NULL,
  `status` ENUM('Pending', 'Accepted') NOT NULL DEFAULT 'Pending',
  PRIMARY KEY (`username1`, `username2`),
  FOREIGN KEY(`username1`) REFERENCES User(`username`),
  FOREIGN KEY(`username2`) REFERENCES User(`username`))
  ENGINE=InnoDB;



-- -----------------------------------------------------
-- Table `Luadingo`.`has_badge`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Luadingo`.`Has_Badge` (
  `username` VARCHAR(50) NOT NULL,
  `badge_id` INT NOT NULL,
  PRIMARY KEY (`username`, `badge_id`),
  FOREIGN KEY(`username`) REFERENCES User(`username`),
  FOREIGN KEY(`badge_id`) REFERENCES Badge(`badge_id`))
  ENGINE=InnoDB;



-- -----------------------------------------------------
-- Table `Luadingo`.`has_option`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Luadingo`.`Has_Options` (
  `question_id` INT AUTO_INCREMENT NOT NULL,
  `choice` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`question_id`, `choice`),
  FOREIGN KEY(`question_id`) REFERENCES Question(`question_id`))
  ENGINE=InnoDB;



-- -----------------------------------------------------
-- Table `Luadingo`.`has_question`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Luadingo`.`Has_Question` (
  `quiz_id` INT NOT NULL,
  `question_id` INT NOT NULL,
  PRIMARY KEY (`quiz_id`, `question_id`),
  FOREIGN KEY(`question_id`) REFERENCES Question(`question_id`),
  FOREIGN KEY(`quiz_id`) REFERENCES Quiz(`quiz_id`))
  ENGINE=InnoDB;



-- -----------------------------------------------------
-- Table `Luadingo`.`has_quiz`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Luadingo`.`Has_Quiz` (
  `course_id` INT NOT NULL,
  `quiz_id` INT NOT NULL,
  PRIMARY KEY (`course_id`, `quiz_id`),
  FOREIGN KEY(`quiz_id`) REFERENCES Quiz(`quiz_id`),
  FOREIGN KEY(`course_id`) REFERENCES Course(`course_id`)
  )
   ENGINE=InnoDB;


-- -----------------------------------------------------
-- Table `Luadingo`.`attempts`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Luadingo`.`Attempts` (
  `attempt_id` INT NOT NULL,
  `quiz_id` INT NOT NULL,
  `username` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`attempt_id`, `quiz_id`,`username`),
  FOREIGN KEY(`quiz_id`) REFERENCES Quiz(`quiz_id`),
  FOREIGN KEY(`attempt_id`) REFERENCES Attempt(`attempt_id`),
  FOREIGN KEY(`username`) REFERENCES User(`username`)
  )
   ENGINE=InnoDB;

