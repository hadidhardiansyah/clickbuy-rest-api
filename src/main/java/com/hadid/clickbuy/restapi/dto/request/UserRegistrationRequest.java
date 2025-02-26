package com.hadid.clickbuy.restapi.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserRegistrationRequest {

    @NotEmpty(message = "Firstname is mandatory")
    @NotBlank(message = "Firstname is mandatory")
    private String firstName;

    @NotEmpty(message = "Lastname is mandatory")
    @NotBlank(message = "Lastname is mandatory")
    private String lastName;

    @Email(message = "Email is not formatted")
    @NotEmpty(message = "Email is mandatory")
    @NotBlank(message = "Email is mandatory")
    private String email;

    @NotEmpty(message = "Password is mandatory")
    @NotBlank(message = "Password is mandatory")
    @Size(min = 8, message = "Password should be 8 characters long minimum")
    private String password;

    @NotEmpty(message = "Phone Number is mandatory")
    @NotBlank(message = "Phone Number is mandatory")
    @Size(max = 13, message = "Phone Number should be 13 characters long maximum")
    private String phoneNumber;

    @NotEmpty(message = "Address is mandatory")
    @NotBlank(message = "Address is mandatory")
    private String address;

    @NotEmpty(message = "Role is required")
    private List<String> roles;

}
