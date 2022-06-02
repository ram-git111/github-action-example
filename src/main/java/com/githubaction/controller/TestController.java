package com.githubaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/hii")
    public String hello(){
        return "Hello gitHub Action";
    }

    @GetMapping("/")
    public String home(){
        return "Hi gitHub Action";
    }

}
