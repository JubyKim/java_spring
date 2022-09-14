package org.example;

import org.example.model.TodoResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TodoServerApplication  {
    public static void main(String[] args) {
        SpringApplication.run(TodoServerApplication.class, args);
    }
}
