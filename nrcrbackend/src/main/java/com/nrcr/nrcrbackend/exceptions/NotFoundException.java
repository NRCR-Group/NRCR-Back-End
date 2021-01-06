package com.nrcr.nrcrbackend.exceptions;

//Enables customized text to be defined from another file (i.e. in this case, controller) to the CustomGlobalExceptionHandler.
public class NotFoundException extends RuntimeException {

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }


}
