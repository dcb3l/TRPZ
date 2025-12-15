package org.example.lab7.bridge;

public class MsiFileFormatter implements FileFormatter {
    @Override
    public String format(String fileName) {
        return fileName + ".msi (formatted)";
    }
}
