package com.hadid.clickbuy.restapi.dto.response;

import lombok.Builder;
import lombok.Getter;

@Builder
public record RoleResponse(
        String message
) { }
