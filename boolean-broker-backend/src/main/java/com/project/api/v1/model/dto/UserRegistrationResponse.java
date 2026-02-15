package com.project.api.v1.model.dto;

public class UserRegistrationResponse {

    private String verificationToken;

    public UserRegistrationResponse(String verificationToken) {
        this.verificationToken = verificationToken;
    }

    public String getVerificationToken() {
        return verificationToken;
    }

    public void setVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
    }
}
