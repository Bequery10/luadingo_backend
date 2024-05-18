package com.avengers.luadingo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.avengers.luadingo.model.Attempts;
import com.avengers.luadingo.model.AttemptsPK;
import com.avengers.luadingo.service.AttemptsService;

import java.util.*;

@RestController
@RequestMapping("/Attempts")
@CrossOrigin
public class AttemptsController {
    @Autowired
    private AttemptsService attemptsService;

    @PostMapping("/save/{current}")
    public int save(@RequestBody AttemptsPK attemptsPK) {
        String username = attemptsPK.getUsername();
        int attempt_id = attemptsPK.getAttempt_id();
        int quiz_id = attemptsPK.getQuiz_id();
        int response = attemptsService.save(username, attempt_id, quiz_id);
        return response;
    }

    @GetMapping("/getAll")
    public List<AttemptsPK> getAllAttempts() {
        return attemptsService.findAll();
    }

    @GetMapping("/{username}")
    public List<AttemptsPK> getUserAttempts(@PathVariable String username) {
        return attemptsService.getUserAttempts(username);
    }

    @GetMapping("/{username}/{quiz_id}")
    public List<AttemptsPK> getUserAttemptsForQuiz(@PathVariable String username, @PathVariable int quiz_id) {
        return attemptsService.getUserAttemptsForQuiz(username, quiz_id);
    }

    @DeleteMapping("/delete")
    public int delete(@RequestBody AttemptsPK id) {
        return attemptsService.delete(id.getUsername(), id.getAttempt_id(), id.getQuiz_id());
    }
}