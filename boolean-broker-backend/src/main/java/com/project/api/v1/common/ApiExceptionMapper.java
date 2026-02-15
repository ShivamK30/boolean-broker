package com.project.api.v1.common;

import com.project.api.v1.model.dto.ErrorResponse;
import com.project.api.v1.model.entity.ErrorCode;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ApiExceptionMapper
        implements ExceptionMapper<ApiException> {

    @Override
    public Response toResponse(ApiException exception) {

        ErrorCode code = exception.getErrorCode();

        ErrorResponse error = new ErrorResponse(
                code.name(),
                exception.getMessage()
        );

        return Response.status(code.getHttpStatus())
                .entity(error)
                .build();
    }
}

