package com.main.grammar;

import com.main.ScopeElement;

public class Print extends Line {
    public Print() {
        this("");
    }

    public Print(String str) {
        this.asm = "\n\tgetstatic java/lang/System/out Ljava/io/PrintStream;\n";
        this.asm += "\tldc \"" + str + "\"\n";
        this.asm += "\tinvokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n\n";
    }

    public Print(ScopeElement se) {
        if (!se.getValue().toString().contains("load")) {
            this.asm = new Print(se.getValue().toString()).getAsm();
        } else {
            this.asm = "\n\tgetstatic java/lang/System/out Ljava/io/PrintStream;\n";

            this.asm += "\t" + se.getValue() + "\n";

            if (se.getType().equals("int")) {
                this.asm += "\tinvokevirtual java/io/PrintStream/println(J)V\n\n";
            } else if (se.getType().equals("float")) {
                this.asm += "\tinvokevirtual java/io/PrintStream/println(D)V\n\n";
            }
        }
    }

    public Print(Integer num) {
        this(num.toString());
    }

    public Print(Double num) {
        this(num.toString());
    }
}
