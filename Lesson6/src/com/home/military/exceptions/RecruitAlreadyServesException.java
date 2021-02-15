package com.home.military.exceptions;

public class RecruitAlreadyServesException extends Exception{
    public RecruitAlreadyServesException() {
    }

    public RecruitAlreadyServesException(String message) {
        super(message);
    }
}
