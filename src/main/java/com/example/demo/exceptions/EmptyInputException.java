package com.example.demo.exceptions;

public class EmptyInputException extends RuntimeException{
    public EmptyInputException(String message){
        super(message);
    }
}
