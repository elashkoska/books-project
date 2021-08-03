package com.example.graduates.errors;

import lombok.Data;

@Data
public class ResponseError {

    private final String message;
    private final String error;
}
