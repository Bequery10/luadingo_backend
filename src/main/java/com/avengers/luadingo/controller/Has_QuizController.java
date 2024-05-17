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
    public String add(@RequestBody Has_Quiz has_quiz, @PathVariable int quiz_id, @PathVariable int course_id) {
        Has_QuizPK id = new Has_QuizPK(quiz_id, course_id);
        has_quiz.setId(id);
        has_quizService.save(has_quiz);
        return "New Has_Quiz is added";
    }

    @GetMapping("/getAll")
    public List<Has_Quiz> getAllHas_Quizs() {
        return has_quizService.getAll();
    }

    @GetMapping("/{quiz_id}/{course_id}")
    public ResponseEntity<Has_Quiz> get(@PathVariable int quiz_id, @PathVariable int course_id) {
        try {
            Has_QuizPK id = new Has_QuizPK(quiz_id, course_id);
            Has_Quiz has_quiz = has_quizService.get(id);
            return new ResponseEntity<Has_Quiz>(has_quiz, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Has_Quiz>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{quiz_id}/{course_id}")
    public ResponseEntity<Has_Quiz> update(@RequestBody Has_Quiz has_quiz, @PathVariable int quiz_id,
            @PathVariable int course_id) {
        try {
            Has_QuizPK id = new Has_QuizPK(quiz_id, course_id);
            Has_Quiz existingHas_Quiz = has_quizService.get(id);
            if (existingHas_Quiz != null) {
                has_quizService.delete(id);
                has_quiz.setId(id);
                has_quizService.save(has_quiz);
                return new ResponseEntity<Has_Quiz>(has_quiz, HttpStatus.OK);
            } else {
                return new ResponseEntity<Has_Quiz>(HttpStatus.NOT_FOUND);
            }
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Has_Quiz>(HttpStatus.NOT_FOUND);
        }
    }
}