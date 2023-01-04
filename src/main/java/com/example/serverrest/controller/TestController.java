package com.example.serverrest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TestController {
    @GetMapping
    public String getTest(){
        return "Hello2";
    }
}
