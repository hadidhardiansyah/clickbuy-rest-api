package com.hadid.clickbuy.restapi.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
public record UserRegistrationResponse(
        String message,
        List<String> roles
) {}
