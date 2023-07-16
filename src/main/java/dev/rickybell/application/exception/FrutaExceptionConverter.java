package dev.rickybell.application.exception;

import dev.rickybell.api.dto.response.ErrorResponse;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class FrutaExceptionConverter implements ExceptionMapper<FrutaException> {
    @Override
    public Response toResponse(FrutaException frutaException){
        FrutaExceptionCode frutaExceptionCode = frutaException.getFrutaExceptionCode() != null ? frutaException.getFrutaExceptionCode() : FrutaExceptionCode.INTERNAL_ERROR;
        return Response
                .status(frutaExceptionCode.getHttpCode())
                .entity(new ErrorResponse(frutaExceptionCode.name(), frutaException.getErrorCodeValues()))
                .build();
    }
}
