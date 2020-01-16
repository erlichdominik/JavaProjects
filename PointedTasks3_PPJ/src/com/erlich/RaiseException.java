package com.erlich;

public class RaiseException extends Exception {
    public RaiseException() {
    }

    public RaiseException(String message) {
        super(message);
        System.out.println("Wrong unit");
    }
}
