package com.project.api.v1.model.entity;

public class OtpEntry {

    private final int otp;
    private int attempts;

    public OtpEntry(int otp) {
        this.otp = otp;
        this.attempts = 0;
    }

    public int getOtp() {
        return otp;
    }

    public int incrementAttempts() {
        return ++attempts;
    }
}

