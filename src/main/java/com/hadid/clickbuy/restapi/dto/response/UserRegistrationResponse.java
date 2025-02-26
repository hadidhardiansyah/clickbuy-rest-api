package com.hadid.clickbuy.restapi.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class UserRegistrationResponse {

    private String message;

    private List<String> roles;

}
