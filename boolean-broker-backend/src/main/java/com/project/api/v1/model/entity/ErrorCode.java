package com.project.api.v1.model.entity;

public enum ErrorCode {

    INVALID_OTP(400, "The OTP you entered is incorrect"),
    OTP_EXPIRED(410, "OTP has expired. Please request a new one."),
    TOO_MANY_ATTEMPTS(429, "Maximum OTP attempts exceeded."),
    USER_ALREADY_EXISTS(409, "User already exists"),
    INTERNAL_SERVER_ERROR(500, "Something went wrong");

    private final int httpStatus;
    private final String defaultMessage;

    ErrorCode(int httpStatus, String defaultMessage) {
        this.httpStatus = httpStatus;
        this.defaultMessage = defaultMessage;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public String getDefaultMessage() {
        return defaultMessage;
    }
}
