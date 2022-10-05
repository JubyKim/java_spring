package com.example.put.controller;

import com.example.put.dto.PutRequestDto;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutAPIController {
    @JsonProperty("user_id")
    @PutMapping("/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto putRequestDto, @PathVariable Long userId) {
        System.out.println(putRequestDto);
        System.out.println("ID 여기임 : " + userId);
        return putRequestDto;
    }
}
