package com.cleancode.exception;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RecordedGripTest {
    private static RecordedGrip sectionStore;

    @BeforeAll
    static void beforeAll() {
        sectionStore = new RecordedGrip();
    }

    @Test
    public void retrieveSectionShouldThrowOnInvalidFileName() {
        StorageException storageException = assertThrows(StorageException.class, () -> {
            sectionStore.retrieveSection("invalid - file");
        });
        assertTrue(storageException.getMessage().contains("retrieval error"));
    }
}