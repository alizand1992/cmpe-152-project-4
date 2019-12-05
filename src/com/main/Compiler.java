package com.main;

import com.main.grammar.Print;
import com.main.grammar.Line;
import java.util.ArrayList;
import java.util.Collection;


public class Compiler {
    public int stackCounter;
    public int localCounter;
    public int varCounter;
    public String className;
    public ArrayList<Line> lines;
    public Scope scope;
    public String lastType;

    public Compiler() {
        this("Main");
    }

    public Compiler(String className) {
        lastType = null;
        varCounter = 1;
        stackCounter = 0;
        localCounter = 0;
        this.className = className;
        lines = new ArrayList<Line>();
        scope = new Scope();
    }

    public void addStackCounter(int howMany) {
        this.stackCounter += howMany;
    }

    public void addLine(Line line) {
        lines.add(line);
    }

    public String generateAsm() {
        String asm =
            ".class public " + className + "\n" +
            ".super java/lang/Object\n" +
            ".method public static main([Ljava/lang/String;)V\n";

        asm += "\t.limit stack " + stackCounter + "\n";

        if (localCounter != 0) {
            asm += "\t.limit locals " + localCounter + "\n";
        }

        asm += "\n";

        for (Line line : lines) {
            asm += line.getAsm();
        }

        asm += "label_1:\n" +
                "\tgetstatic java/lang/System/out Ljava/io/PrintStream;\n" +
                "\tldc \"THIS IS LABEL 1\"\n" +
                "\tinvokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n";

        asm += "return\n" +
                ".end method";

        return asm;
    }
}
