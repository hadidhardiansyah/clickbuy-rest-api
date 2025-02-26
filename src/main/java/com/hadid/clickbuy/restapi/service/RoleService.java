package com.hadid.clickbuy.restapi.service;

import com.hadid.clickbuy.restapi.common.enums.RoleType;
import com.hadid.clickbuy.restapi.dto.request.RoleRequest;
import com.hadid.clickbuy.restapi.dto.response.RoleResponse;
import com.hadid.clickbuy.restapi.entity.Role;
import com.hadid.clickbuy.restapi.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleResponse createRole(RoleRequest request) {
        boolean isValidRole = Arrays.stream(RoleType.values())
                .anyMatch(roleType -> roleType.name().equalsIgnoreCase(request.getName()));

        if (!isValidRole) {
            throw new IllegalArgumentException("Role is not valid");
        }

        var role = Role.builder()
                .name(request.getName())
                .build();

        roleRepository.save(role);

        return RoleResponse.builder()
                .message("Role created successfully")
                .build();
    }

}
