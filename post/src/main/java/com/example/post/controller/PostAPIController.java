package com.example.post.controller;

import com.example.post.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostAPIController {
    @PostMapping("/post")
    public void post (@RequestBody PostRequestDto requestDate) {
        System.out.println(requestDate);
    }
}
