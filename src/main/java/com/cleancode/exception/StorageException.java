package com.cleancode.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class StorageException extends RuntimeException {
    public StorageException(String message,Throwable cause) {
        super(message, cause);
    }
}
