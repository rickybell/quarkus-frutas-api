package dev.rickybell.api.dto.response;

import java.util.List;

public class ErrorResponse {

    private String errorCode;
    private List<String> errorCodeValues;

    public ErrorResponse(String errorCode, List<String> errorCodeValues){
        this.errorCode = errorCode;
        this.errorCodeValues = errorCodeValues;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public List<String> getErrorCodeValues() {
        return errorCodeValues;
    }

    public void setErrorCodeValues(List<String> errorCodeValues) {
        this.errorCodeValues = errorCodeValues;
    }
}
