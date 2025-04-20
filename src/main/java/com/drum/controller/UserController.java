package com.drum.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.drum.model.User;

@Controller
public class UserController {

    @GetMapping("/userForm")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "user-form";
    }

    @PostMapping("/submitUser")
    public String submitForm(@ModelAttribute("user") User user, Model model) {
        model.addAttribute("message", "User submitted successfully!");
        return "user-success";
    }
}

