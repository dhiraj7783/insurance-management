package com.dhiraj.insurance_management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(PolicyNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handlePolicyNotFoundException(PolicyNotFoundException ex) {
        return ex.getMessage();
    }
}