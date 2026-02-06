package com.project.api.v1.service;

import com.project.api.v1.model.dto.UpdateUserProfileRequest;
import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UpdateProfileService {

    public void UpdateUserProfile(UpdateUserProfileRequest updateUserProfileRequest) {
        Log.infof("Inside user profile update file");
    }
}
