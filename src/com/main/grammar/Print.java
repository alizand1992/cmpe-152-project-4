package com.main.grammar;

public class Print extends Line {
    public Print() {
        this("");
    }

    public Print(String str) {
        this.asm = "\tgetstatic java/lang/System/out Ljava/io/PrintStream;\n";
        this.asm += "\tldc \"" + str + "\"\n";
        this.asm += "\tinvokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n";
    }

    public Print(Integer num) {
        this(num.toString());
    }

    public Print(Double num) {
        this(num.toString());
    }
}
