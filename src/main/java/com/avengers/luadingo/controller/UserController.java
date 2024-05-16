package com.avengers.luadingo.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;

import com.avengers.luadingo.model.User;
import com.avengers.luadingo.service.UserService;

import jakarta.websocket.server.PathParam;
import java.util.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String add(@RequestBody User user) {
        userService.save(user);
        return "New user is added";
    }

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @GetMapping("/{username}")
    public ResponseEntity<User> get(@PathVariable String username) {
        try {
            User user = userService.get(username);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{username}")
    public ResponseEntity<User> update(@RequestBody User user, @PathVariable String username) {
        try {
            User existingUser = userService.get(username);
            userService.delete(username);
            userService.save(user);
            return new ResponseEntity<User>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{username}")
    public String delete(@PathVariable String username) {

        User existingUser = userService.get(username);

        if (existingUser == null)
            return "user with username: " + username + " not found.";
        userService.delete(username);
        return "Deleted user with username: " + username;

    }

    @GetMapping("/isExist/{username}:{password}")
    public boolean isExist(@PathVariable String username, @PathVariable String password) {
        return userService.isExist(username, password);
    }

}
