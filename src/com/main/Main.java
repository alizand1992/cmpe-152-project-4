package com.main;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ListTokenSource;

public class Main {
    public static void main(String[] args) {
        try {
            String path = "test_files/print/print.lala";
//            Scanner in = new Scanner(System.in);
//            System.out.println("Please enter a path to a test file: ");
//            path = in.nextLine();

            LalaLexer mll = new LalaLexer(CharStreams.fromFileName(path));
            ListTokenSource ltsl = new ListTokenSource(mll.getAllTokens());
            BufferedTokenStream btsl = new BufferedTokenStream(ltsl);
            LalaParser mp = new LalaParser(btsl);

            Compiler compiler = new Compiler();
            System.out.println("-----===== PARSE USING LISTENER =====-----");
            mp.addParseListener(new MyLalaListener(compiler));
            mp.program();


            System.out.println("\n\n\n\\n-----===== jASMin =====-----");
            System.out.println(compiler.generateAsm());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
