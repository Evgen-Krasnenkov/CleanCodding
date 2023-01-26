package com.cleancode.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RecordedGrip {

    public List<RecordedGrip> retrieveSection(String sectionName) {
        FileInputStream stream = null;
        try {
            stream = new FileInputStream(sectionName);
            stream.close();
        } catch (IOException e) {
            throw new StorageException("file problem: ", e);
        }
        return new ArrayList<RecordedGrip>();
    }
}
