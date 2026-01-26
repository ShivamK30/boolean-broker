package com.project.api.v1.model.dto;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.project.api.v1.model.entity.UserType;
import io.quarkus.runtime.annotations.ConfigDocEnumValue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


import java.time.LocalDate;

public class UserRegistrationRequest {

    @NotNull
    private String name;

    @NotNull
    private UserType userType;    // ADMIN / BROKER / TRADER

    @NotBlank
    @Pattern(
            regexp = "^[6-9]\\d{9}$",
            message = "Phone must be 10 digits and start with 6, 7, 8, or 9"
    )
    private String phone;

    @NotNull
    @Size(min = 10, max = 10)
    @Pattern(regexp = "[A-Z]{5}[0-9]{4}[A-Z]", message = "Invalid PAN format")
    private String panNumber;       // nullable for ADMIN

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }
}
