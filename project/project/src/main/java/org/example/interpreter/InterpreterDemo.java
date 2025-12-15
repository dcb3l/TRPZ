package org.example.interpreter;

public class InterpreterDemo {
    public static void main(String[] args) {
        Expression isExe = new TerminalExpression("exe");
        Expression isMsi = new TerminalExpression("msi");
        Expression isExeOrMsi = new OrExpression(isExe, isMsi);

        String test1 = "setup.exe";
        String test2 = "installer.msi";
        String test3 = "readme.txt";

        System.out.println(test1 + " is exe or msi? " + isExeOrMsi.interpret(test1));
        System.out.println(test2 + " is exe or msi? " + isExeOrMsi.interpret(test2));
        System.out.println(test3 + " is exe or msi? " + isExeOrMsi.interpret(test3));
    }
}
