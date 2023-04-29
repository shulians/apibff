package com.example.bff.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ErrorDTO extends ResponseDTO {
    private String code;
    private String message;
}