package com.helloworld.controller;

import com.helloworld.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/")
    public String helloWorld(Model model) {
        String message = messageService.getHelloMessage();
        model.addAttribute("message", message);  // Pass the message to the view
        return "helloWorld";  // Refers to helloWorld.html (Thymeleaf template)
    }
}
