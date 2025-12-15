package org.example.lab7.bridge;

public class ExeFileFormatter implements FileFormatter {
    @Override
    public String format(String fileName) {
        return fileName + ".exe (formatted)";
    }
}
