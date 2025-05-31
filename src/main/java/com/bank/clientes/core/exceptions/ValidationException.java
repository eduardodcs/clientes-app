package com.bank.clientes.core.exceptions;

public class ValidationException extends DomainException {
    
    public ValidationException(String message) {
        super(message);
    }

    public ValidationException(String message, Throwable cause) {
        super(message, cause);
    }

}
