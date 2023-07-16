package dev.rickybell.application.exception;

import java.util.List;

public class FrutaException extends RuntimeException{
    private final FrutaExceptionCode frutaExceptionCode;

    private final List<String> errorCodeValues;

    public FrutaException(FrutaExceptionCode frutaExceptionCode) { this(frutaExceptionCode, null); }

    public FrutaException(FrutaExceptionCode frutaExceptionCode, List<String> errorCodeValues) {
        this.frutaExceptionCode = frutaExceptionCode;
        this.errorCodeValues = errorCodeValues;
    }

    public FrutaExceptionCode getFrutaExceptionCode() { return frutaExceptionCode;}

    public List<String> getErrorCodeValues() { return errorCodeValues; }
}
