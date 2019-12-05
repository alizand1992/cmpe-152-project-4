package com.main.grammar;

public class Logic extends Line {
    public Logic() {

    }

    public Logic(char ltype, String lhs, String op, char rtype, String rhs, char type) {
        this.asm = "";

        if (lhs.contains("load")) {
            this.asm += "\t" + lhs + "\n";
        } else {
            this.asm += "\tldc2_w " + lhs + "\n";
        }

        if (type == 'd' && ltype == 'l') {
            this.asm += "\tl2d\n";
        }

        if (rhs.contains("load")) {
            this.asm += "\t" + rhs + "\n";
        } else {
            this.asm += "\tldc2_w " + rhs + "\n";
        }

        if (type == 'd' && rtype == 'l') {
            this.asm += "\tl2d\n";
        }

        this.asm += "\t" + op + " label_1\n";
    }
}
