package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class APIController {
    //text
    @GetMapping("/text")
    public String text(@RequestParam String account) {
        return account;
    }

    //json
    @PostMapping("/json")
    public User json(@RequestBody User user){
        return user;
    }

    //ResponseEntity를 활용.
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user){
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

}
