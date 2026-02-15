package com.project.api.v1.model.dto;

public record TokenPair(String accessToken, String refreshToken, long accessTokenExpiresIn, long refreshTokenExpiresIn) {}