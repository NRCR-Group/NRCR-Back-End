package com.nrcr.nrcrbackend.exceptions;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

//Defines the properties that I would like to see in the payload.
public class NotFoundErrorDetails {
    private final String message;
    private final HttpStatus httpStatus;
    private final ZonedDateTime timestamp;

    public NotFoundErrorDetails(String message, HttpStatus httpStatus, ZonedDateTime timestamp) {
        this.message = message;
        this.httpStatus = httpStatus;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

}
