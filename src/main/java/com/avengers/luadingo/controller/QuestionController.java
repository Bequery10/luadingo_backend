package com.avengers.luadingo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.avengers.luadingo.model.Question;
import com.avengers.luadingo.service.QuestionService;

import java.util.*;

@RestController
@RequestMapping("/Question")
@CrossOrigin
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @PostMapping("/add")
    public String add(@RequestBody Question question) {
        questionService.save(question);
        return "New question is added";
    }

    @GetMapping("/getAll")
    public List<Question> getAllQuestions() {
        return questionService.getAll();
    }

    @GetMapping("/{question_id}")
    public ResponseEntity<Question> get(@PathVariable int question_id) {
        try {
            Question question = questionService.get(question_id);
            return new ResponseEntity<Question>(question, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Question>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{question_id}")
    public ResponseEntity<Question> update(@RequestBody Question question, @PathVariable int question_id) {
        try {
            Question existingQuestion = questionService.get(question_id);
            questionService.delete(question_id);
            questionService.save(question);
            return new ResponseEntity<Question>(question, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Question>(HttpStatus.NOT_FOUND);
        }
    }
}