package com.main;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.ListTokenSource;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

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

            String className = path.substring(path.lastIndexOf('/') + 1, path.lastIndexOf('.'));
            className = className.substring(0, 1).toUpperCase() + className.substring(1);
            Compiler compiler = new Compiler(className);
            System.out.println("-----===== PARSE USING LISTENER =====-----");
            mp.addParseListener(new MyLalaListener(compiler));
            mp.program();

            System.out.println("\n\n\n\n-----===== jASMin =====-----");
            System.out.println(compiler.generateAsm());

            String jfile = path.substring(0, path.lastIndexOf('.')) + ".j";
            BufferedWriter writer = new BufferedWriter(new FileWriter(jfile));
            writer.write(compiler.generateAsm());
            writer.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
