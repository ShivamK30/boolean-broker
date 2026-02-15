package com.project.api.v1.model.entity;

import io.quarkus.elytron.security.common.BcryptUtil;

public class OtpEntry {

    private String userId;
    private final String otp;
    private int attempts;

    public OtpEntry(String userId, String otp) {
        this.otp = getOtpHash(otp);
        this.attempts = 1;
    }

    public String getOtp() {
        return otp;
    }

    public void incrementAttempts() {

        ++attempts;
    }

    public int GetAttempts() {
        return attempts;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOtpHash(String otp) {
        return BcryptUtil.bcryptHash(otp);
    }
}

