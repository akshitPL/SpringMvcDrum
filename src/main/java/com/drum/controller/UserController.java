package com.drum.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.drum.model.User;

@Controller
public class UserController {

	
	static List<User> list = new ArrayList<User>();
	
	
	static {
		list.add(new User("akshit","sdsds","Dsds"));
	}
	
    @GetMapping("/userForm")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "user-form";
    }

    @PostMapping("/submitUser")
    public String submitForm(@ModelAttribute("user") User user, Model model) {
        list.add(user);  
        
        model.addAttribute("message", "User submitted successfully!");
        model.addAttribute("userList", list);  // 👈 pass the list
        model.addAttribute("user", user); 
        return "user-success";
    }

}

