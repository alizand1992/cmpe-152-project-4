package com.main;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyLalaListener extends LalaBaseListener {
    public Compiler compiler;

    public MyLalaListener(Compiler compiler) {
        this.compiler = compiler;
    }

    @Override
    public void exitProgram(LalaParser.ProgramContext ctx) { }

    @Override
    public void exitBlock(LalaParser.BlockContext ctx) { }

    @Override
    public void exitAddexpr(LalaParser.AddexprContext ctx) {
        for (ParseTree pt : ctx.children)
            System.out.println(pt.getText());
    }

    @Override
    public void exitPrint(LalaParser.PrintContext ctx) {
        compiler.addStackCounter(2);
        for (ParseTree pt : ctx.children)
            System.out.println(pt.getText());
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) { }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) { }

    @Override
    public void visitTerminal(TerminalNode node) { }

    @Override
    public void visitErrorNode(ErrorNode node) { }
}
