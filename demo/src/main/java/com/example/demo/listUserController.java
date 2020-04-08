package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class listUserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/listUsers")
    public String listUsers(Model model) {
        System.out.println(userRepository.findAll());
        model.addAttribute("users", userRepository.findAll());
        return "listUser";
    }
}
