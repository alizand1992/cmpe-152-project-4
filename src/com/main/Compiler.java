package com.main;

import com.main.grammar.Print;
import com.main.grammar.Line;
import java.util.ArrayList;
import java.util.Collection;


public class Compiler {
    public int stackCounter;
    public String className;
    public ArrayList<Line> lines;
    public Scope scope;

    public Compiler() {
        this("Main");
    }

    public Compiler(String className) {
        stackCounter = 0;
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

        for (Line line : lines) {
            asm += line.getAsm();
        }

        asm += "return\n" +
                ".end method";

        return asm;
    }
}
