package org.example.lab7.bridge;

public class FileConvertor extends FileProcessor {
    public FileConvertor(FileFormatter formatter) {
        super(formatter);
    }
    @Override
    public String processFile(String fileName) {
        return "Converted: " + formatter.format(fileName);
    }
}
