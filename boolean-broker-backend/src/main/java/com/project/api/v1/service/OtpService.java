package com.project.api.v1.service;

import com.project.api.v1.dbinterface.OtpCache;
import com.project.api.v1.model.dto.OtpVerificationRequest;
import com.project.api.v1.model.entity.OtpEntry;
import com.project.api.v1.model.entity.SendOtpService;
import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.UUID;
import io.quarkus.elytron.security.common.BcryptUtil;

import java.security.SecureRandom; // For secure generation

@ApplicationScoped
public class OtpService {

    @Inject
    OtpCache otpCache;

    @Inject
    SendOtpService sendOtpService;

    private static final SecureRandom secureRandom = new SecureRandom();

    public String generateAndStoreOtp(String userId) {
        // Use a simple, secure method to generate a 6-digit number
        String otp = String.valueOf(secureRandom.nextInt(900000) + 100000);
        String verificationToken = generateVerificationToken();
        Log.infof("Verification token: %s",verificationToken);

        // Store the OTP manually in the cache. The expiration is handled by Quarkus config.
        otpCache.put(verificationToken, new OtpEntry(userId,otp));

//        String phone = getUserPhoneNumber(userId);

        //Send OTP
        sendOtpService.SendOtp("+918637253693",otp);

        //Verify if the otp is stored in cache with the correct key
        OtpEntry otpEntry = otpCache.get(verificationToken);
        Log.infof("%s is the otp for user: %s",otpEntry.getOtp(), userId);

        return verificationToken;
    }

    public boolean VerifyOtp(OtpVerificationRequest request) {
        // Use getIfPresent to retrieve the value. If expired, it automatically returns null.
        OtpEntry storedOtp = otpCache.get(request.getVerificationToken());

        if (storedOtp != null) {

            if (storedOtp.GetAttempts() <= 3 && BcryptUtil.matches(request.getOtp(), storedOtp.getOtp())) {
                // Remove the OTP immediately after successful verification
                otpCache.remove(request.getVerificationToken());
                return true;
            }
            //Increase attempts by 1 before returning
            storedOtp.incrementAttempts();
        }
        return false;
    }

    public String generateVerificationToken() {
        return UUID.randomUUID().toString();
    }
}
