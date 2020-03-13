package com.test.rick.springbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/hello")
public class MainController {
    @RequestMapping("/say")
    public String say(){
        return "Hello World";
    }
}