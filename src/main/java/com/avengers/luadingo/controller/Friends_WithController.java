package com.avengers.luadingo.controller;

import com.avengers.luadingo.model.Friends_With;
import com.avengers.luadingo.model.Friends_WithPK;
import com.avengers.luadingo.model.User;
import com.avengers.luadingo.service.Friends_WithService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Friends_With")
@CrossOrigin
public class Friends_WithController {

    @Autowired
    private Friends_WithService friends_withService;

    @GetMapping("/all")
    public List<Friends_WithPK> getAll() {
        return friends_withService.getAll();
    }

    @GetMapping("/friends/{username}")
    public List<User> getFriends(@PathVariable String username) {
        return friends_withService.getFriends(username);
    }

    @PostMapping("/send/{username1}/{username2}")
    public ResponseEntity<?> sendRequest(@PathVariable String username1, @PathVariable String username2) {
        try {
            int result = friends_withService.addFriend(username1, username2);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            // log the exception
            System.out.println(e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @PutMapping("/accept/{username1}/{username2}")
    public int acceptRequest(@PathVariable String username1, @PathVariable String username2) {
        return friends_withService.accept(username1, username2);
    }

    @DeleteMapping("/delete/{username1}/{username2}")
    public ResponseEntity<?> deleteById(@PathVariable String username1, @PathVariable String username2) {
        try {
            int result = friends_withService.deleteById(username1, username2);
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
        }
    }

    @GetMapping("/requests/{username}")
    public List<Friends_WithPK> getRequests(@PathVariable String username) {
        return friends_withService.getRequests(username);
    }
}