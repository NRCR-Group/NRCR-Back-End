package com.nrcr.nrcrbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

//Handles exceptions and customises them the way that the error is thrown to the client.

@ControllerAdvice //This is the main class that can handle exceptions for all controllers.
public class ApiExceptionHandler {

    @ExceptionHandler(value = {ApiRequestException.class})
    public ResponseEntity<Object> handleApiRequestException(ApiRequestException e) {
        //1. Payload containing exception details. This class returns a 400 (Bad Request) error.
        HttpStatus notFound = HttpStatus.NOT_FOUND;

        ApiException apiException = new ApiException(
                e.getMessage(),
                HttpStatus.NOT_FOUND,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        //2. Return ResponseEntity
        return new ResponseEntity<>(apiException, notFound);
    }

}
