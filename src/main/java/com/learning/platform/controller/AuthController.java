package com.learning.platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learning.platform.entity.User;
import com.learning.platform.repository.UserRepository;

@Controller
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/student_login")
    @SuppressWarnings("ConvertToStringSwitch")
    public String student_login(
            @RequestParam String email,
            @RequestParam String password
    ) {
        User user = userRepository.findByEmailAndPassword(email, password);

        if (user == null) {
            return "error";
        }

        if (user.getRole().equals("st")) {
            return "student";
        }else {
            return "error";
        }
    }
    @GetMapping("/admin_login")
    @SuppressWarnings("ConvertToStringSwitch")
    public String admin_login(
            @RequestParam String email,
            @RequestParam String password
    ) {
        User user = userRepository.findByEmailAndPassword(email, password);

        if (user == null) {
            return "error";
        }
        if (user.getRole().equals("admin")) {
            return "admin";
        } else {
            return "error";
        }
    }
}
