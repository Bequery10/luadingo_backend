package com.avengers.luadingo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.avengers.luadingo.model.Has_Quiz;
import com.avengers.luadingo.model.Has_QuizPK;
import com.avengers.luadingo.service.Has_QuizService;

import java.util.*;

@RestController
@RequestMapping("/Has_Quiz")
@CrossOrigin
public class Has_QuizController {
    @Autowired
    private Has_QuizService has_quizService;

    @PostMapping("/add/{quiz_id}/{course_id}")
    public String add(@PathVariable int quiz_id, @PathVariable int course_id) {
        has_quizService.save(quiz_id, course_id);
        return "New Has_Quiz is added";
    }

    @GetMapping("/getAll")
    public List<Has_QuizPK> getAll() {
        return has_quizService.findAll();
    }

    @GetMapping("/course/{quiz_id}")
    public ResponseEntity<Has_QuizPK> getCourse(@PathVariable int quiz_id) {
        try {
            Has_QuizPK has_quizPK = has_quizService.getCourse(quiz_id);
            return new ResponseEntity<Has_QuizPK>(has_quizPK, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Has_QuizPK>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/quizzes/{course_id}")
    public List<Has_QuizPK> getQuizz(@PathVariable int course_id) {

        List<Has_QuizPK> has_quizzes = has_quizService.getQuizzes(course_id);
        return has_quizzes;
    }

}