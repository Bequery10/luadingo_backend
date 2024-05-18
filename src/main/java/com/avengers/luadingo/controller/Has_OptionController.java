package com.avengers.luadingo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.avengers.luadingo.model.Has_Options;
import com.avengers.luadingo.model.Has_OptionsPK;
import com.avengers.luadingo.service.Has_OptionsService;

import java.util.*;

@RestController
@RequestMapping("/Has_Options")
@CrossOrigin
public class Has_OptionController {
    @Autowired
    private Has_OptionsService has_optionsService;

    @PostMapping("/add/{question_id}/{option}")
    public String add(@PathVariable int question_id, @PathVariable String option) {
        has_optionsService.save(question_id, option);
        return "New Has_Option is added";
    }

    @GetMapping("/getAll")
    public List<Has_OptionsPK> findAll() {
        return has_optionsService.findAll();
    }

    @GetMapping("/{question_id}")
    public List<Has_OptionsPK> getChoices(@PathVariable int question_id) {
        return has_optionsService.getChoices(question_id);
    }

    @DeleteMapping("/add/{question_id}/{option}")
    public int delete(@PathVariable int question_id, @PathVariable String option) {
        return has_optionsService.delete(question_id, option);
    }

}