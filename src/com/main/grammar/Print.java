package com.main.grammar;

public class Print {
    private String toPrint;

    public Print() {
        this.toPrint = "";
    }

    public Print(Integer num) {
        this.toPrint = num.toString();
    }

    public Print(Double num) {
        this.toPrint = num.toString();
    }

    public String generateAsm() {
        String asm = "";

        asm += "\tgetstatic java/lang/System/out Ljava/io/PrintStream;\n";
        asm += "\tldc \"" + toPrint + "\"\n";
        asm += "\tinvokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n";

        return asm;
    }
}
