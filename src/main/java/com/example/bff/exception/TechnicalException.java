package com.example.bff.exception;

public class TechnicalException extends CustomException {
    public TechnicalException(String code, String message) {
        super(code, message);
    }
}
