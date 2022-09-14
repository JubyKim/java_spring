package com.example.hello.controller;

import com.example.hello.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetAPIController {

    @GetMapping(path = "/hello")
    public String Hello() {
        return "get Hello";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    public String Hi() {
        return "get Hi";
    }

    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable String name) {
        System.out.println("PathVariable : " + name);

        return name;
    }

    //http://localhost:9090/api/get/query-param?user=steve&email=steve@gmail.com&age=30


    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {

        StringBuilder sb = new StringBuilder();
        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.print(entry.getValue());
            System.out.print("");

            sb.append(entry.getKey() + " = " + entry.getValue() + " ");
        });
        return sb.toString();
    }

    @GetMapping(path = "query-param02")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age) {
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name + "  " + email + " " + age;
    }

    @GetMapping(path = "query-param03")
    public String queryParam03(UserRequest userRequest) {


        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();

    }

}
