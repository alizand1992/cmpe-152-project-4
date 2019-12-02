package com.main.grammar;

public class Add extends Line {
    public String type;

    public Add(String a, String b, int count) {
        boolean canConvert = true;
        type = "";
        try {
            Integer.parseInt(a);
            Integer.parseInt(b);
            type = "long";
        } catch (Exception e1) {
            try {
                Double.parseDouble(a);
                Double.parseDouble(b);
                type = "float";
            } catch (Exception e2) {
                if (a.startsWith("lload_"))
                    type = "long";
                else if(a.startsWith("dload_")) {
                    type = "float";
                } else {
                    canConvert = false;
                }
            }
        }

        if (canConvert) {
            String temp = "";

            if (type.equals("long")) { // Long
                if (a.startsWith("lload_"))
                    temp += "\t" + a + "\n";
                else
                    temp += "\tldc2_w " + a + "\n";
                temp += "\tldc2_w " + b + "\n";
                temp += "\tladd\n";
                temp += "\tlstore_" + count + "\n";
            } else { // float
                temp += "\tldc2_w " + a + "\n";
                temp += "\tldc2_w " + b + "\n";
                temp += "\tdadd\n";
            }

            this.asm = temp;
        }
    }
}
