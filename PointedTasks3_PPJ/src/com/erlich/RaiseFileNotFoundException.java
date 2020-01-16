package com.erlich;

public class RaiseFileNotFoundException extends RuntimeException {
    public RaiseFileNotFoundException() {
    }

    public RaiseFileNotFoundException(String message) {
        super(message);
    }
}
