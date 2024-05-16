package com.avengers.luadingo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.avengers.luadingo.model.Quiz;
import com.avengers.luadingo.service.QuizService;

import java.util.*;

@RestController
@RequestMapping("/Quiz")
@CrossOrigin
public class QuizController {
    @Autowired
    private QuizService quizService;

    @PostMapping("/add")
    public String add(@RequestBody Quiz quiz) {
        quizService.save(quiz);
        return "New quiz is added";
    }

    @GetMapping("/getAll")
    public List<Quiz> getAllQuizzes() {
        return quizService.getAll();
    }

    @GetMapping("/{quiz_id}")
    public ResponseEntity<Quiz> get(@PathVariable int quiz_id) {
        try {
            Quiz quiz = quizService.get(quiz_id);
            return new ResponseEntity<Quiz>(quiz, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Quiz>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{quiz_id}")
    public ResponseEntity<Quiz> update(@RequestBody Quiz quiz, @PathVariable int quiz_id) {
        try {
            Quiz existingQuiz = quizService.get(quiz_id);
            quizService.delete(quiz_id);
            quizService.save(quiz);
            return new ResponseEntity<Quiz>(quiz, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Quiz>(HttpStatus.NOT_FOUND);
        }
    }
}