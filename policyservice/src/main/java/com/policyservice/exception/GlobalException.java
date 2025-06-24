package com.policyservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpServerErrorException;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(PolicyException.class)
    public ResponseEntity<String> handleGlobalException(PolicyException ex)
    {
        return new ResponseEntity<>("Error :"+ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
