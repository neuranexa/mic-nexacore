package com.neuranexa.core.exception;

import java.util.ArrayList;
import java.util.List;

public class DomainException extends RuntimeException {

    private final String code;
    private final List<String> details;

    public DomainException(String code, String message) {
        super(message);
        this.code = code;
        this.details = new ArrayList<>();
    }

    public DomainException( String code, String message, List<String> details) {
        super(message);
        this.code = code;
        this.details = details;
    }

    public DomainException(String code, String message,  List<String> details, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.details = details;
    }
}
