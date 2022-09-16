package com.example.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/server")
@RestController
public class ServerAPIController {

    @GetMapping("")
    public String hello() {
        return "hello server";
    }
}
