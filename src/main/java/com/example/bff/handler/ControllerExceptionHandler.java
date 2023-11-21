package com.example.bff.handler;

import com.example.bff.dto.ErrorDTO;
import com.example.bff.dto.ResponseDTO;
import com.example.bff.exception.BusinessException;
import com.example.bff.exception.TechnicalException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler({ TechnicalException.class })

    public ResponseEntity<ResponseDTO> handlerTechnicalException(final TechnicalException exception,
                                                                 final WebRequest request) {

        return new ResponseEntity<>(
                ErrorDTO.builder().code(exception.getCode()).message(exception.getMessage()).build(),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler({ BusinessException.class, })

    public ResponseEntity<ResponseDTO> handlerBusinessException(final BusinessException exception,
                                                                final WebRequest request) {

        return new ResponseEntity<>(
                ErrorDTO.builder().code(exception.getCode()).message(exception.getMessage()).build(),
                HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
