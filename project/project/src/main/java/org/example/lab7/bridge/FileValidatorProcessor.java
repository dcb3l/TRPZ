package org.example.lab7.bridge;

public class FileValidatorProcessor extends FileProcessor {
    public FileValidatorProcessor(FileFormatter formatter) {
        super(formatter);
    }
    @Override
    public String processFile(String fileName) {
        if (!validate(fileName)) {
            return "Validation failed for: " + fileName;
        }
        return "Validated and converted: " + formatter.format(fileName);
    }
    private boolean validate(String fileName) {
        return fileName != null && !fileName.trim().isEmpty();
    }
}
