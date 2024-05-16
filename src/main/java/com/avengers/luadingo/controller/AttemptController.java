package com.avengers.luadingo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.avengers.luadingo.model.Attempt;
import com.avengers.luadingo.service.AttemptService;

import java.util.*;

@RestController
@RequestMapping("/Attempt")
@CrossOrigin
public class AttemptController {
    @Autowired
    private AttemptService attemptService;

    @PostMapping("/add")
    public String add(@RequestBody Attempt attempt) {
        attemptService.save(attempt);
        return "New Attempt is added";
    }

    @GetMapping("/getAll")
    public List<Attempt> getAllAttempts() {
        return attemptService.getAll();
    }

    @GetMapping("/{attempt_id}")
    public ResponseEntity<Attempt> get(@PathVariable int attempt_id) {
        try {
            Attempt attempt = attemptService.get(attempt_id);
            return new ResponseEntity<Attempt>(attempt, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Attempt>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{attempt_id}")
    public ResponseEntity<Attempt> update(@RequestBody Attempt attempt, @PathVariable int attempt_id) {
        try {
            Attempt existingAttempt = attemptService.get(attempt_id);
            attemptService.delete(attempt_id);
            attemptService.save(attempt);
            return new ResponseEntity<Attempt>(attempt, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Attempt>(HttpStatus.NOT_FOUND);
        }
    }
}