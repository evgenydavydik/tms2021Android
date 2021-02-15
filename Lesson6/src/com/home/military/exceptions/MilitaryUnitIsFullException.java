package com.home.military.exceptions;

public class MilitaryUnitIsFullException extends Exception {
    public MilitaryUnitIsFullException() {
    }

    public MilitaryUnitIsFullException(String message) {
        super(message);
    }
}
