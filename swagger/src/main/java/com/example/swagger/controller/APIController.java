package com.example.swagger.controller;

import com.example.swagger.db.UserRequest;
import com.example.swagger.db.UserResponse;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

@Api(tags = {"API 정보를 제공하는 Controller"})
@RestController
@RequestMapping("/api")
public class APIController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @ApiImplicitParams({@ApiImplicitParam(name = "x", value = "x값"),
                        @ApiImplicitParam(name = "y", value = "y값")})
    @GetMapping("/plus/{x}")
    public int plus(@PathVariable int x,
                    @RequestParam int y){
        return x+y;
    }


    @ApiResponse(code = 502, message = "사용자의 이름이 10살 이하")
    @ApiOperation(value = "사용자의 이름과 나이를 리턴하는 메소드")
    @GetMapping("/user")
    public UserResponse user(UserResponse req) {
        return new UserResponse(req.getName(), req.getAge());
    }

    @PostMapping("/user")
    public UserResponse user(@RequestBody UserRequest req) {
        return new UserResponse(req.getName(), req.getAge());
    }
}
