package com.home.military.exceptions;

public class InvalidNameSurnameException extends Exception {
    public InvalidNameSurnameException() {
    }

    public InvalidNameSurnameException(String message) {
        super(message);
    }
}
