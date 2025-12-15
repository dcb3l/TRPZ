package org.example.lab7.bridge;

public abstract class FileProcessor {
    protected FileFormatter formatter;
    public FileProcessor(FileFormatter formatter) {
        this.formatter = formatter;
    }
    public abstract String processFile(String fileName);
}
