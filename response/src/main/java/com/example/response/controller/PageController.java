package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    //ResponseEntity

    //ResponseBody
    @ResponseBody
    @GetMapping("/user")
    public User user() {
        var user = new User();
        user.setName("juby");
        user.setAge(10);
        user.setAddress("서울");
        return user;
    }
}
