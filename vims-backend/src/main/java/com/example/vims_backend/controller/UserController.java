package com.example.vims_backend.controller;

import com.example.vims_backend.entity.User;
import com.example.vims_backend.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Home Page
    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }

    // Registration Page
    @RequestMapping("/registerPage")
    public String registerPage() {
        return "register.jsp";
    }

    // Login Page
    @RequestMapping("/loginPage")
    public String loginPage() {
        return "login.jsp";
    }

    // Handle Registration Form
    @PostMapping("/register")
    public String registerUser(User user, Model model) {
        if (userRepository.findByEmail(user.getEmail()) != null) {
            model.addAttribute("error", "Email already exists!");
            return "register.jsp";
        }
        userRepository.save(user);
        model.addAttribute("message", "Registration successful!");
        return "login.jsp";
    }

    // Handle Login Form
    @PostMapping("/login")
    public String loginUser(@RequestParam String email, @RequestParam String password, Model model) {
        User existingUser = userRepository.findByEmail(email);
        
        if (existingUser != null && existingUser.getPassword().equals(password)) {
            model.addAttribute("user", existingUser);
            if (existingUser.getRole().toString().equals("OFFICER")) {
                return "adminhome.jsp";
            } else {
                return "userhome.jsp";
            }
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login.jsp";
        }
    }

    // User Home after Login
    @RequestMapping("/userhome")
    public String userHome() {
        return "userhome.jsp";
    }
}
