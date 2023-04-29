package com.example.bff.exception;

import lombok.Data;

@Data
public abstract class CustomException extends Exception {
    protected final String code;
    protected final String message;
}
