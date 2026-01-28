package com.fitness.userservice.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.jspecify.annotations.Nullable;

@Data

public class RegisterResquest {

    @NotBlank(message = "E-mail is Required...")
    @Email(message = "Invalid E-mail Format")
    private String email;

    @NotBlank(message = "Password is required...")
    @Size(min = 8, message = "Password must have atLeast 6 Characters")
    @Size(max = 12, message = "Password size is less than 12 Characters")
    private String password;
    private String firstName;
    private String lastName;

}
