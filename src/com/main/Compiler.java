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
            ".class public " + className + "\n" +
            ".super java/lang/Object\n" +
            ".method public static main([Ljava/lang/String;)V\n";

        asm += ".limit stack " + stackCounter + "\n";

        asm += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";

        asm += "ldc \"print value\"\n";

        asm += "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n";

        asm += "return\n" +
                ".end method";

        return asm;
    }

}
