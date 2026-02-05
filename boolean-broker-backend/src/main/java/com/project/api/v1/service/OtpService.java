package com.project.api.v1.service;

import com.project.api.v1.dbinterface.OtpCache;
import com.project.api.v1.model.entity.OtpEntry;
import com.project.api.v1.model.entity.SendOtpService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.security.SecureRandom; // For secure generation

@ApplicationScoped
public class OtpService {

    @Inject
    OtpCache otpCache;

    @Inject
    SendOtpService sendOtpService;

    private static final SecureRandom secureRandom = new SecureRandom();

    public void generateAndStoreOtp(String userId) {
        // Use a simple, secure method to generate a 6-digit number
        int otp = secureRandom.nextInt(900000) + 100000;


        // Store the OTP manually in the cache. The expiration is handled by Quarkus config.
        otpCache.put(userId, new OtpEntry(otp));

//        String phone = getUserPhoneNumber(userId);

        //Send OTP
        sendOtpService.SendOtp("+918637253693",otp);
//        return otp;
    }

    public boolean verifyOtp(String userId, int providedOtp) {
        // Use getIfPresent to retrieve the value. If expired, it automatically returns null.
        OtpEntry storedOtp = otpCache.get(userId);

        if (storedOtp != null && storedOtp.getOtp() == providedOtp) {
            // Remove the OTP immediately after successful verification
            otpCache.remove(userId);
            return true;
        }
        return false;
    }
}
