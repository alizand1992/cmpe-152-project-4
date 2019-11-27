package com.main;

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

        asm += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";

        asm += "ldc \"" + somethingToPrint + "\"\n";

        asm += "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n";
        return asm;
    }
}
