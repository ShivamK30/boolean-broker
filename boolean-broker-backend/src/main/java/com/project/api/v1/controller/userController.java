package com.project.api.v1.controller;

/*
This is a controller class for user related endpoints
 */

import com.project.api.v1.model.dto.UserRegistrationRequest;
import com.project.api.v1.service.UserRegistrationService;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/v1/user/userregistration")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class userController {

    @Inject
    UserRegistrationService userRegistrationService;

    @POST
    public Response register(@Valid UserRegistrationRequest request) {
        userRegistrationService.registerUser(request);
        return Response.status(Response.Status.CREATED).build();
    }
}
