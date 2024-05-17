package com.avengers.luadingo.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import com.avengers.luadingo.model.Friends_With;
import com.avengers.luadingo.model.Friends_WithPK;
import com.avengers.luadingo.model.User;
import com.avengers.luadingo.service.Friends_WithService;
import com.avengers.luadingo.model.Friends_With;
import java.util.*;

@RestController
@RequestMapping("/Friends_With")
@CrossOrigin
public class Friends_WithController {

    @Autowired
    private Friends_WithService friends_withService;

    @PostMapping("/add/{username1}/{username2}")
    public String add(@PathVariable String username1, @PathVariable String username2) {
        Friends_WithPK friends_WithPK = new Friends_WithPK();
        friends_WithPK.setUsername1(username1);
        friends_WithPK.setUsername2(username2);

        Friends_With friends_with = new Friends_With();
        friends_with.setId(friends_WithPK);

        // String statusString = "Pending";
        // Friends_With.Status status = Friends_With.Status.valueOf(statusString);

        // friends_with.setStatus(status);

        friends_withService.save(friends_with);
        return "New Friends_With is added";
    }

    @GetMapping("/getAll")
    public List<Friends_With> getAllFriends_Withs() {
        return friends_withService.getAll();
    }

    @GetMapping("/{username}")
    public List<Friends_With> get(@PathVariable String username) {
        return friends_withService.get(username);
    }

    // @PutMapping("/{id}")
    // public ResponseEntity<Friends_With> update(@RequestBody Friends_With
    // friends_with,
    // @PathVariable Friends_WithPK id) {
    // try {
    // Friends_With existingFriends_With = friends_withService.get(id);
    // friends_withService.delete(id);
    // friends_withService.save(friends_with);
    // return new ResponseEntity<Friends_With>(friends_with, HttpStatus.OK);
    // } catch (NoSuchElementException e) {
    // return new ResponseEntity<Friends_With>(HttpStatus.NOT_FOUND);
    // }
    // }
}