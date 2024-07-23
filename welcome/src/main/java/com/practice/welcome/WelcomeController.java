package com.practice.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Indicate class as @REST controller
    @RequestMapping("/api") //Maps HTTP GET requests to /api/welcome to the @sayWelcome (f)
    public class WelcomeController {

        @GetMapping("/welcome")
        public String sayWelcome() {
            return "Welcome to OASIS!";
        }
    }

