package com.project.api.v1.service;

import com.project.api.v1.model.entity.SendOtpService;
import io.vertx.core.json.pointer.JsonPointerIterator;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@ApplicationScoped
public class TwilioSendOtpService implements SendOtpService {

    @ConfigProperty(name = "twilio.account-sid")
    String accountSid;

    @ConfigProperty(name = "twilio.auth-token")
    String authToken;

    @ConfigProperty(name = "twilio.from-number")
    String fromNumber;

    @Override
    public void SendOtp(String toPhoneNumber, String otp) {
        try {
            String auth = accountSid + ":" + authToken;
            String encodedAuth = Base64.getEncoder()
                    .encodeToString(auth.getBytes(StandardCharsets.UTF_8));

            String message = "Your OTP is " + otp;

            String formBody =
                    "To=" + URLEncoder.encode(toPhoneNumber, StandardCharsets.UTF_8) +
                            "&From=" + URLEncoder.encode(fromNumber, StandardCharsets.UTF_8) +
                            "&Body=" + URLEncoder.encode(message, StandardCharsets.UTF_8);

            //Actual API call - Costs incurred - Do it only when absolutely needed

//            HttpRequest request = HttpRequest.newBuilder()
//                    .uri(URI.create(
//                            "https://api.twilio.com/2010-04-01/Accounts/"
//                                    + accountSid + "/Messages.json"))
//                    .header("Authorization", "Basic " + encodedAuth)
//                    .header("Content-Type", "application/x-www-form-urlencoded")
//                    .POST(HttpRequest.BodyPublishers.ofString(formBody))
//                    .build();
//
//
//            HttpClient.newHttpClient()
//                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Otp API Body: "+formBody);

        } catch (Exception e) {
            throw new RuntimeException("Failed to send OTP SMS", e);
        }
    }
}
