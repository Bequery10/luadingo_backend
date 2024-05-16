package com.avengers.luadingo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.avengers.luadingo.model.Has_Option;
import com.avengers.luadingo.model.Has_OptionPK;
import com.avengers.luadingo.service.Has_OptionService;

import java.util.*;

@RestController
@RequestMapping("/Has_Option")
@CrossOrigin
public class Has_OptionController {
    @Autowired
    private Has_OptionService has_optionService;

    @PostMapping("/add")
    public String add(@RequestBody Has_Option has_option) {
        has_optionService.save(has_option);
        return "New Has_Option is added";
    }

    @GetMapping("/getAll")
    public List<Has_Option> getAllHas_Options() {
        return has_optionService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Has_Option> get(@PathVariable Has_OptionPK id) {
        try {
            Has_Option has_option = has_optionService.get(id);
            return new ResponseEntity<Has_Option>(has_option, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Has_Option>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Has_Option> update(@RequestBody Has_Option has_option, @PathVariable Has_OptionPK id) {
        try {
            Has_Option existingHas_Option = has_optionService.get(id);
            has_optionService.delete(id);
            has_optionService.save(has_option);
            return new ResponseEntity<Has_Option>(has_option, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Has_Option>(HttpStatus.NOT_FOUND);
        }
    }
}