package com.main.grammar;

import com.main.Compiler;

public class Arith extends Line {
    public String type;

    public Arith(String a, String b, Compiler compiler, String op) {
        type = null;

        boolean i = false;
        boolean f = false;

        try {
            Integer.parseInt(a);
            i = true;
        } catch (Exception e) {
            try {
                Double.parseDouble(a);
                f = true;
            } catch (Exception e2) {
                if (a.startsWith("dload")) {
                    f = true;
                } else if (a.startsWith("lload")) {
                    i = true;
                }
            }
        }

        try {
            Integer.parseInt(b);
            i = true;
        } catch (Exception e) {
            try {
                Double.parseDouble(b);
                f = true;
            } catch (Exception e2) {
                if (b.startsWith("dload")) {
                    f = true;
                } else if (b.startsWith("lload")) {
                    i = true;
                }
            }
        }

        if (i || f) {
            String temp = "";

            if (f) { // double
                if (a.startsWith("lload ")) {
                    temp += "\tlload " + a.substring(a.lastIndexOf(" ") + 1) + "\n";
                    temp += "\tl2d\n";
                } else if (a.startsWith("dload ")) {
                    temp += "\t" + a + "\n";
                } else {
                    temp += "\tldc2_w " + a + "\n";
                }

                temp += "\tldc2_w " + b + "\n";
                temp += "\td" + op + "\n\n";
                temp += "\tdstore " + compiler.varCounter++ + "\n\n";

                this.type = "float";
            } else { // long
                if (a.startsWith("lload "))
                    temp += "\t" + a + "\n";
                else
                    temp += "\tldc2_w " + a + "\n";

                temp += "\tldc2_w " + b + "\n";
                temp += "\tl" + op + "\n";
                temp += "\tlstore " + compiler.varCounter++ + "\n\n";
                this.type = "long";
            }

            this.asm = temp;
        }
    }
}
