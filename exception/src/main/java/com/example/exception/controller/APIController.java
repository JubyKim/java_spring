package com.example.exception.controller;

import com.example.exception.dto.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@RestController
@RequestMapping("/api/user")
@Validated
public class APIController {
    @GetMapping("")
    public User get(
            @Size(min=1)
            @RequestParam String name,

            @NotNull
            @RequestParam int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        System.out.println(age + 10);
        return user;
    }
    @PostMapping("")
    public User post(@Valid @RequestBody User user){
        System.out.println(user);
        return user;
    }


}
