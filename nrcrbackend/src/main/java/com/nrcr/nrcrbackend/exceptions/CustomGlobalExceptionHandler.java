package com.nrcr.nrcrbackend.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class CustomGlobalExceptionHandler extends ResponseEntityExceptionHandler {

    //MethodArgumentNotValidException - 400
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

          CustomErrorDetails customErrorDetails = new CustomErrorDetails(ZonedDateTime.now(ZoneId.of("Z")),
                  "The Method Argument is Not Valid.",
                  ex.getMessage());

        return new ResponseEntity<>(customErrorDetails, HttpStatus.BAD_REQUEST);
    }

    //HTTPRequestMethodNOtSupportedException - 405
    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(
            HttpRequestMethodNotSupportedException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        CustomErrorDetails customErrorDetails = new CustomErrorDetails(ZonedDateTime.now(ZoneId.of("Z")),
                "Method not allowed.",
                ex.getMessage());

        return new ResponseEntity<>(customErrorDetails, HttpStatus.METHOD_NOT_ALLOWED);
    }

    //ResultNotFoundException - 404
    @ExceptionHandler(value = {NotFoundException.class})
    public final ResponseEntity<Object> handleResultNotFoundException(NotFoundException ex) {
        NotFoundErrorDetails notFoundErrorDetails = new NotFoundErrorDetails(ex.getMessage(),
                HttpStatus.NOT_FOUND,
                ZonedDateTime.now(ZoneId.of("Z")));

        return new ResponseEntity<>(notFoundErrorDetails, HttpStatus.NOT_FOUND);

    }
}
