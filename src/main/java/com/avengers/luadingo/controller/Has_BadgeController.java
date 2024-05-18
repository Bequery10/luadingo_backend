package com.avengers.luadingo.controller;

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

    @PostMapping("/add/{username}/{badge_id}")
    public ResponseEntity<String> add(@PathVariable String username, @PathVariable int badge_id) {
        int result = has_badgeService.add(username, badge_id);
        return new ResponseEntity<>("New Has_Badge is added, affected rows: " + result, HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public List<Has_BadgePK> getAllHas_Badges() {
        return has_badgeService.findAll();
    }

    @GetMapping("/getBadges/{username}")
    public List<Has_BadgePK> getUserBadges(@PathVariable String username) {
        return has_badgeService.getUserBadges(username);
    }

    @GetMapping("/getBadgesCount/{username}")
    public ResponseEntity<Integer> getUserBadgesCount(@PathVariable String username) {
        int count = has_badgeService.getUserBadgesCount(username);
        return new ResponseEntity<>(count, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{username}")
    public ResponseEntity<String> deleteById(@PathVariable String username) {
        int result = has_badgeService.deleteById(username);
        return new ResponseEntity<>("Deleted Has_Badge, affected rows: " + result, HttpStatus.OK);
    }
}