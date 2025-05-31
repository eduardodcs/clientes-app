package com.bank.clientes.core.exceptions;

import java.time.LocalDateTime;
import java.util.List;

public class ErrorResponse {

    private LocalDateTime timestamp;
    private int status;
    private String error;
    private String message;
    private String path;
    private List<String> errors;

    private ErrorResponse() {
        // Default constructor
    }

    public static class Builder {
        private ErrorResponse errorResponse;

        public Builder() {
            errorResponse = new ErrorResponse();
        }

        public Builder timestamp(LocalDateTime timestamp) {
            errorResponse.timestamp = timestamp;
            return this;
        }

        public Builder status(int status) {
            errorResponse.status = status;
            return this;
        }

        public Builder error(String error) {
            errorResponse.error = error;
            return this;
        }

        public Builder message(String message) {
            errorResponse.message = message;
            return this;
        }

        public Builder path(String path) {
            errorResponse.path = path;
            return this;
        }

        public Builder errors(List<String> errors) {
            errorResponse.errors = errors;
            return this;
        }

        public ErrorResponse build() {
            return errorResponse;
        }
    }

    public static Builder builder() {
        return new Builder();
    }


    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public int getStatus() {
        return status;
    }
    public String getError() {
        return error;
    }
    public String getMessage() {
        return message;
    }
    public String getPath() {
        return path;
    }
    public List<String> getErrors() {
        return errors;
    }

}
