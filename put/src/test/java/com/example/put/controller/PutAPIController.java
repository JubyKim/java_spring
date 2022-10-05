package com.example.put.controller;

import com.example.put.dto.PutRequestDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PutAPIController {
    @RequestMapping("/put")
    public void put(@RequestBody PutRequestDto putRequestDto) {
        System.out.println(putRequestDto);
    }
}
