package com.main;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyLalaListener extends LalaBaseListener {
    @Override
    public void enterProgram(LalaParser.ProgramContext ctx) {
        System.out.println("PROGRAM");
    }

    @Override
    public void exitProgram(LalaParser.ProgramContext ctx) { }

    @Override
    public void enterBlock(LalaParser.BlockContext ctx) {
        System.out.println("BLOCK");
    }

    @Override
    public void exitBlock(LalaParser.BlockContext ctx) { }

    @Override
    public void enterAddexpr(LalaParser.AddexprContext ctx) {
        System.out.println("Add Expr");
        System.out.println(ctx.toString());
    }

    @Override
    public void exitAddexpr(LalaParser.AddexprContext ctx) { }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) { }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) { }

    @Override
    public void visitTerminal(TerminalNode node) { }

    @Override
    public void visitErrorNode(ErrorNode node) { }
}
