package com.example.demo.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CarNotFoundException.class)
    public ResponseEntity handleNotFound(){
        return ResponseEntity.notFound().build();
    }


    @ExceptionHandler(CarAlreadyExistsException.class)
    public ResponseEntity handleAlreadyExists(){
        return ResponseEntity.badRequest().build();
    }

}
