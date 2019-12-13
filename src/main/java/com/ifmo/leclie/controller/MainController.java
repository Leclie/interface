package com.ifmo.leclie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class MainController {

    @GetMapping("/")
    public String main(Map<String, Object> model) {
        model.put("hello", "Hello");
        return "main";
    }

    @GetMapping("/login")
    public String login(Map<String, Object> model) {

        return "login";
    }

}