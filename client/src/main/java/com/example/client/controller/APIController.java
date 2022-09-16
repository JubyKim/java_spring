package com.example.client.controller;

import com.example.client.dto.UserResponse;
import com.example.client.service.RestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/client")
public class APIController {


    private final RestTemplateService restTemplateService;

    public APIController(RestTemplateService restTemplateService) {
        this.restTemplateService = restTemplateService;
    }

    @PostMapping("/hello")
    public UserResponse getHello() {
        return restTemplateService.exchange();
    }


}
