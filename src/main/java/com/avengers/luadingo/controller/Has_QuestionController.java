package com.avengers.luadingo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.avengers.luadingo.model.Has_Question;
import com.avengers.luadingo.model.Has_QuestionPK;
import com.avengers.luadingo.model.Question;
import com.avengers.luadingo.service.Has_QuestionService;

import java.util.*;

@RestController
@RequestMapping("/Has_Question")
@CrossOrigin
public class Has_QuestionController {
    @Autowired
    private Has_QuestionService has_questionService;

    @PostMapping("/add/{question_id}/{quiz_id}")
    public String add(@PathVariable int question_id, @PathVariable int quiz_id) {
        has_questionService.save(question_id, quiz_id);
        return "New Has_question is added";
    }

    @GetMapping("/getAll")
    public List<Has_QuestionPK> getAll() {
        return has_questionService.findAll();
    }

    @GetMapping("/quizzes/{question_id}")
    public ResponseEntity<Has_QuestionPK> getquiz(@PathVariable int question_id) {
        try {
            Has_QuestionPK has_questionPK = has_questionService.getquiz(question_id);
            return new ResponseEntity<Has_QuestionPK>(has_questionPK, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Has_QuestionPK>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/questions/{quiz_id}")
    public List<Question> getquestionz(@PathVariable int quiz_id) {

        return has_questionService.getquestionzes(quiz_id);

    }
}