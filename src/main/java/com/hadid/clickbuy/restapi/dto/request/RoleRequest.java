package com.hadid.clickbuy.restapi.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleRequest {

    @NotEmpty(message = "Role name is mandatory")
    @NotBlank(message = "Role name is mandatory")
    private String name;

}
