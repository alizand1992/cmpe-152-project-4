package com.main.grammar;

import com.main.Compiler;

public class Add extends Arith {

    public Add(String a, String b, Compiler compiler) {
        super(a, b, compiler, "add");
    }
}
