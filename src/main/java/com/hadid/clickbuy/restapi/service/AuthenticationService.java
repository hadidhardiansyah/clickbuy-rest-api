package com.hadid.clickbuy.restapi.service;

import com.hadid.clickbuy.restapi.dto.request.UserRegistrationRequest;
import com.hadid.clickbuy.restapi.dto.response.UserRegistrationResponse;
import com.hadid.clickbuy.restapi.entity.Role;
import com.hadid.clickbuy.restapi.entity.User;
import com.hadid.clickbuy.restapi.repository.RoleRepository;
import com.hadid.clickbuy.restapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final RoleRepository roleRepository;

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;


    public UserRegistrationResponse register(UserRegistrationRequest request) {

        List<Role> userRoles = request.getRoles().stream()
                .map(roleName -> roleRepository.findByName(roleName)
                        .orElseThrow(() -> new IllegalArgumentException("Role not found")))
                .toList();

        if (userRoles.isEmpty()) {
            throw new IllegalArgumentException("At least one role is required");
        }

        var user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .phoneNumber(request.getPhoneNumber())
                .address(request.getAddress())
                .roles(userRoles)
                .build();

        userRepository.save(user);

        return UserRegistrationResponse.builder()
                .message("Your account registered successfully")
                .roles(userRoles.stream().map(Role::getName).toList())
                .build();
    }

}
