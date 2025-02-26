package com.hadid.clickbuy.restapi.controller;

import com.hadid.clickbuy.restapi.dto.request.UserRegistrationRequest;
import com.hadid.clickbuy.restapi.service.AuthenticationService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<?> register(
            @RequestBody @Valid UserRegistrationRequest request
            ) {
        service.register(request);
        return ResponseEntity.ok("Your account registered successfully");
    }

}
