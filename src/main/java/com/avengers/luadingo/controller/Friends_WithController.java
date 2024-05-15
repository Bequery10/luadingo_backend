package com.avengers.luadingo.controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import com.avengers.luadingo.model.Friends_With;
import com.avengers.luadingo.model.Friends_WithPK;
import com.avengers.luadingo.service.Friends_WithService;
import java.util.*;

import org.springframework.web.bind.annotation.Autowired;

@RestController
@RequestMapping("/Friends_With")
@CrossOrigin
public class Friends_WithController{
    
    @Autowired
    private Friends_WithService friends_withService;

    @PostMapping("/add")
    public String add(@RequestBody Friends_With friends_with){
        friends_withService.save(friends_with);
        return "New Friends_With is added";
    }

    @GetMapping("/getAll")
    public List<Friends_With> getAllFriends_Withs(){
        return friends_withService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Friends_With> get(@PathVariable Friends_WithPK id){
       try{
        Friends_With friends_with = friends_withService.get(id);
        return new ResponseEntity<Friends_With>(friends_with, HttpStatus.OK);
       }
       catch(NoSuchElementException e){
        return new ResponseEntity<Friends_With>(HttpStatus.NOT_FOUND);
       }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Friends_With> update(@RequestBody Friends_With friends_with, @PathVariable Friends_WithPK id){
       try{
        Friends_With existingFriends_With = friends_withService.get(id);
        friends_withService.delete(id);
        friends_withService.save(friends_with);
        return new ResponseEntity<Friends_With>(friends_with, HttpStatus.OK);
       }
       catch(NoSuchElementException e){
        return new ResponseEntity<Friends_With>(HttpStatus.NOT_FOUND);
       }
    }
}