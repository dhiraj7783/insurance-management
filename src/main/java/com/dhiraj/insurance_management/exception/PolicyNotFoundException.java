package com.dhiraj.insurance_management.exception;

public class PolicyNotFoundException extends RuntimeException {

    public PolicyNotFoundException(String message) {
        super(message);
    }
}