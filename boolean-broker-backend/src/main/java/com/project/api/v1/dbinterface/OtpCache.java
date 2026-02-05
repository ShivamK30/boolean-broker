package com.project.api.v1.dbinterface;

import com.project.api.v1.model.entity.OtpEntry;
import jakarta.enterprise.context.ApplicationScoped;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;


import java.util.concurrent.TimeUnit;

@ApplicationScoped
public class OtpCache {

    private final Cache<String, OtpEntry> cache =
            Caffeine.newBuilder()
                    .expireAfterWrite(5, TimeUnit.MINUTES) // OTP valid for 5 min
                    .maximumSize(100_000)
                    .build();

    public void put(String userId, OtpEntry otp) {
        cache.put(userId, otp);
    }

    public OtpEntry get(String userId) {
        return cache.getIfPresent(userId);
    }

    public void remove(String userId) {
        cache.invalidate(userId);
    }
}

