package com.rrapps.testproject.utils.exceptions;

import java.util.HashMap;

public class UniversalException extends Exception {
    private String description;

    public UniversalException(String description) {
        this.description = description;
    }

    public UniversalException(String message, String description) {
        super(message);
        this.description = description;
    }

    public UniversalException(String message, Throwable cause, String description) {
        super(message, cause);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
