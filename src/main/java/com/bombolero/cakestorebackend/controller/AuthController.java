package com.bombolero.cakestorebackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @GetMapping("/")
    public String getTest(){
        return "<h1>Isil idrem lorem</h1>";
    }
    @PostMapping("/")
    public String login(){
        return " ";
    }
}
