package com.guilherme.first_spring_app.controller;

import com.guilherme.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWordController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Guilherme");
    }

    @PostMapping("")
    public String helloWorldPost(@RequestBody String body){
        return "Hello World Post";
    }
}
