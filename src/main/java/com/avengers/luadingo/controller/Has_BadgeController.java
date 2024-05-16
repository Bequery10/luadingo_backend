package com.avengers.luadingo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.avengers.luadingo.model.Has_Badge;
import com.avengers.luadingo.model.Has_BadgePK;
import com.avengers.luadingo.service.Has_BadgeService;

import java.util.*;

@RestController
@RequestMapping("/Has_Badge")
@CrossOrigin
public class Has_BadgeController {
    @Autowired
    private Has_BadgeService has_badgeService;

    @PostMapping("/add")
    public String add(@RequestBody Has_Badge has_badge) {
        has_badgeService.save(has_badge);
        return "New Has_Badge is added";
    }

    @GetMapping("/getAll")
    public List<Has_Badge> getAllHas_Badges() {
        return has_badgeService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Has_Badge> get(@PathVariable Has_BadgePK id) {
        try {
            Has_Badge has_badge = has_badgeService.get(id);
            return new ResponseEntity<Has_Badge>(has_badge, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Has_Badge>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Has_Badge> update(@RequestBody Has_Badge has_badge, @PathVariable Has_BadgePK id) {
        try {
            Has_Badge existingHas_Badge = has_badgeService.get(id);
            has_badgeService.delete(id);
            has_badgeService.save(has_badge);
            return new ResponseEntity<Has_Badge>(has_badge, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Has_Badge>(HttpStatus.NOT_FOUND);
        }
    }
}