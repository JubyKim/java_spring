package com.example.delete.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteAPIController {
    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable String userId, @RequestParam String account) {
        System.out.println(userId);
        System.out.println(account);
    }
}
