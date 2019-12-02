package com.main;

import com.main.grammar.Add;
import com.main.grammar.Print;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.swing.*;

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
                    compiler.addLine(new Print(compiler.scope.getToken(toPrint)));
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
        String rhs = ctx.children.get(2).getText();

        if (compiler.lastType != null) {
            if (compiler.lastType.equals("long")) {
                se.setValue("lload_" + (compiler.varCounter - 1));
                se.setType("int");
                compiler.lastType = null;
            } else {
                if (!se.getType().equals("float")) {
                    compiler.lastType = "long";
                }

                se.setValue("dload_" + (compiler.varCounter - 1));
                se.setType("float");
            }
        } else {
            se.setValue(rhs);
        }
    }

    @Override
    public void exitExpr(LalaParser.ExprContext ctx) {
        if (ctx.children.size() == 1)
            return;

        compiler.addStackCounter(2);
        compiler.localCounter += 2;

        String l = ctx.children.get(0).getText();
        String r = ctx.children.get(2).getText();

        if (l.contains("+")) {
            l = "lload_" + (compiler.varCounter - 1);
        }

        if (compiler.scope.tokenInScope(l)) {
            l = compiler.scope.getToken(l).getValue().toString();
            System.out.println(l);
        }

        if (compiler.scope.tokenInScope(r)) {
            r = compiler.scope.getToken(r).getValue().toString();
            System.out.println(r);
        }

        Add add = new Add(l, r, compiler);
        compiler.lastType = add.type;
        compiler.addLine(add);
    }


    @Override
    public void enterBlock(LalaParser.BlockContext ctx) {
        compiler.scope.createScope();
    }

    @Override
    public void exitBlock(LalaParser.BlockContext ctx) {
        compiler.scope.exitScope();
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
