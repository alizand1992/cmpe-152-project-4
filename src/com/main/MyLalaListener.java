package com.main;

import com.main.grammar.Print;
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
    public void exitPrint(LalaParser.PrintContext ctx) {
        compiler.addStackCounter(2);
        String toPrint = ctx.children.get(1).getText();
        try {
            Integer num = Integer.parseInt(toPrint);
            compiler.addLine(new Print(num));
        } catch (Exception e) {
            try {
                Double num = Double.parseDouble(toPrint);
                compiler.addLine(new Print(num));
            } catch (Exception e2) {
                if (compiler.scope.tokenInScope(toPrint)) {
                    compiler.addLine(new Print(compiler.scope.getToken(toPrint).toString()));
                }
            }
        }
    }

    @Override
    public void exitDecl(LalaParser.DeclContext ctx) {
        compiler.scope.addToken(ctx.children.get(1).getText(), ctx.children.get(0).getText(), null);
    }

    @Override
    public void exitAssign(LalaParser.AssignContext ctx) {
        ScopeElement se = compiler.scope.getToken(ctx.children.get(0).getText());
        se.setValue(ctx.children.get(2).getText());

    }

    @Override
    public void exitBlock(LalaParser.BlockContext ctx) { }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) { }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) { }

    @Override
    public void visitTerminal(TerminalNode node) { }

    @Override
    public void visitErrorNode(ErrorNode node) { }
}
