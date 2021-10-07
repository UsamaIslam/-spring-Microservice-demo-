package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/fallback-user")
    public String userFallback() {
        return "User service is not available";
    }

    @GetMapping("/fallback-department")
    public String departmentFallback() {
        return "Department service is not available";
    }

    @GetMapping("/fallback-auth")
    public String authFallback() {
        return "Auth service is not available";
    }
}
