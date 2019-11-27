package com.main;

import com.main.grammar.Print;

public class Compiler {
    public int stackCounter;
    public String className;

    public Compiler() {
        stackCounter = 0;
        className = null;
    }

    public void addStackCounter(int howMany) {
        this.stackCounter += howMany;
    }

    public String generateAsm() {
        String asm =
            ".class public " + "Test" + "\n" +
            ".super java/lang/Object\n" +
            ".method public static main([Ljava/lang/String;)V\n";

        asm += print("Hello World");
        asm += "return\n" +
                ".end method";

        return asm;
    }

    public String print(String somethingToPrint) {
        String asm = "";
        asm += ".limit stack " + 2 + "\n";

        Print pf = new Print(somethingToPrint);

        return pf.generateAsm();
    }
}
