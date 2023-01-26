package com.cleancode.nullpointer;

public class InvalidArgumentException extends RuntimeException{

    public InvalidArgumentException(String message) {
        super(message);
    }
}
