package com.cleancode.exception;

import java.io.FileNotFoundException;

public class StorageException extends Exception {
    public StorageException(String retrieval_error, Exception e) {
        super(retrieval_error, e);
    }
}
