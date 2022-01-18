package com.dish.assignment.exception;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ExceptionResponse {

    private HttpStatus httpStatus;
    private LocalDateTime timeStamp;
    private String message;
    private String details;

    public ExceptionResponse(HttpStatus httpStatus, String message, String details) {
        this.httpStatus = httpStatus;
        this.timeStamp = LocalDateTime.now();
        this.message = message;
        this.details = details;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
