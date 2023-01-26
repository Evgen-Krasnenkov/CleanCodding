package com.cleancode.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RecordedGrip {

    public List<RecordedGrip> retrieveSection(String sectionName) throws StorageException {
        FileInputStream stream = null;
        try {
            stream = new FileInputStream(sectionName);
            stream.close();
        } catch (Exception e) {
            throw new StorageException("retrieval error", e);
        }
        return new ArrayList<RecordedGrip>(); }
}
