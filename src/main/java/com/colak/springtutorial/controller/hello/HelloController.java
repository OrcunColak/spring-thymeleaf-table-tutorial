package com.colak.springtutorial.controller.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    // http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("hello_message", "Thymeleaf!");
        return "hello";
    }
}
