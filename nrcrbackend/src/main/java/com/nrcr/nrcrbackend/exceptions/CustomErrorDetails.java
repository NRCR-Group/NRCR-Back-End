package com.nrcr.nrcrbackend.exceptions;

import java.time.LocalDate;
import java.time.ZonedDateTime;

//Simple custom error details bean
public class CustomErrorDetails {
    private ZonedDateTime timestamp;
    private String  message;
    private String errorDetails;

    //Fields Constructor
    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    //Getters
    public String getMessage() {
        return message;
    }

    public String getErrorDetails() {
        return errorDetails;
    }

    public CustomErrorDetails(ZonedDateTime timestamp, String message, String errorDetails) {
        this.timestamp = timestamp;
        this.message = message;
        this.errorDetails = errorDetails;


    }
}
