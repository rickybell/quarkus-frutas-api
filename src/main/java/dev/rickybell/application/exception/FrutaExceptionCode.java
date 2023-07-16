package dev.rickybell.application.exception;

public enum FrutaExceptionCode {


    INTERNAL_ERROR(500),
    FRUTA_NOT_FOUND(404);

    private final int httpCode;

    FrutaExceptionCode(int httpCode) { this.httpCode = httpCode; }

    public int getHttpCode() {
        return httpCode;}
}
