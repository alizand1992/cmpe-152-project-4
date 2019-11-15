package com.main;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ListTokenSource;

import java.util.Scanner;

public class Compiler {
    public static void main(String[] args) {
        try {
            String path = "";
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter a path to a test file: ");
            path = in.nextLine();

            LalaLexer mll = new LalaLexer(CharStreams.fromFileName(path));
            ListTokenSource ltsl = new ListTokenSource(mll.getAllTokens());
            BufferedTokenStream btsl = new BufferedTokenStream(ltsl);
            LalaParser mp = new LalaParser(btsl);

            System.out.println("-----===== PARSE USING LISTENER =====-----");
            mp.addParseListener(new MyLalaListener());
            mp.program();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
