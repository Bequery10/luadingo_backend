package com.avengers.luadingo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.avengers.luadingo.model.User;
import com.avengers.luadingo.service.UserService;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

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

    @PutMapping("/update/{username}")
    public int update(@RequestBody User user, @PathVariable String username) {
        String newUsername = user.getUsername();
        String newPassword = user.getPassword();
        return userService.update(newUsername, newPassword, username);
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
    public int isExist(@PathVariable String username, @PathVariable String password) {
        boolean exists = userService.isExist(username, password);
        if (exists && userService.get(username).getLevel().equals(User.Level.Admin)) {
            return 2;
        } else if (exists) {
            return 1;
        }
        return 0;
    }

    @GetMapping("/sort/badge")
    public List<User> sortByBadgeCount() {
        return userService.sortByBadgeCount();
    }

    @PostMapping("/code")
    public Map<String, Object> runSqlCommand(@RequestBody String sqlCommand) {
        return userService.executeSqlCommand(sqlCommand);
    }

}
