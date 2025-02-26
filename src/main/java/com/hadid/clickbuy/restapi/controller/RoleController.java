package com.hadid.clickbuy.restapi.controller;

import com.hadid.clickbuy.restapi.dto.request.RoleRequest;
import com.hadid.clickbuy.restapi.service.RoleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/role")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService service;

    @PostMapping("/create")
    public ResponseEntity<?> createRole(
            @RequestBody @Valid RoleRequest request
            ) {
        service.createRole(request);
        return ResponseEntity.ok("Role created successfully");
    }
}
