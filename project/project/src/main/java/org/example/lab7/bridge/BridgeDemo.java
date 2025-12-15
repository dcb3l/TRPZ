package org.example.lab7.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        FileFormatter exeFormatter = new ExeFileFormatter();
        FileFormatter msiFormatter = new MsiFileFormatter();

        FileProcessor convertorExe = new FileConvertor(exeFormatter);
        FileProcessor convertorMsi = new FileConvertor(msiFormatter);
        FileProcessor validatorExe = new FileValidatorProcessor(exeFormatter);

        System.out.println(convertorExe.processFile("setup"));
        System.out.println(convertorMsi.processFile("installer"));
        System.out.println(validatorExe.processFile("myapp"));
        System.out.println(validatorExe.processFile("   "));
    }
}
