package com.controllers;

import com.entities.AuthRequest;
import com.entities.AuthResponse;
import com.services.AuthService;
import com.utills.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/auth")
@Slf4j
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(final AuthService authService) {
        this.authService = authService;
    }

    @PostMapping(value = "/register")
    public Response register(@RequestBody AuthRequest authRequest) {
        return authService.register(authRequest);
    }
    @PostMapping(value = "/login")
    public Response login(@RequestBody AuthRequest authRequest) {
        return authService.login(authRequest);
    }

}
