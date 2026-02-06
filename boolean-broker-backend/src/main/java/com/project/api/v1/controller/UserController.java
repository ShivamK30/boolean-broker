package com.project.api.v1.controller;

/*
This is a controller class for user related endpoints
 */

import com.project.api.v1.model.dto.UserRegistrationRequest;
import com.project.api.v1.model.dto.UserRegistrationResponse;
import com.project.api.v1.service.UserRegistrationService;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("api/v1/user")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class UserController {


    private final UserRegistrationService userRegistrationService;
//    private final UpdateProfileService updateProfileService;

    @Inject
    public UserController(UserRegistrationService userRegistrationService) {
        this.userRegistrationService = userRegistrationService;
//        this.updateProfileService = updateProfileService;
    }


    @POST
    @Path("/registration")
    public Response register(@Valid UserRegistrationRequest request) {
        String verificationToken = userRegistrationService.RegisterUser(request);

        UserRegistrationResponse response =
                new UserRegistrationResponse(verificationToken);
        return Response
                .status(Response.Status.CREATED)
                .entity(response)
                .build();
    }

//    @POST
//    @Path("/profileupdate")
//    public Response register(@Valid UpdateUserProfileRequest request) {
//        updateProfileService.UpdateUserProfile(request);
//        return Response.status(Response.Status.CREATED).build();
//    }
}
