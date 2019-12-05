package com.main;

import com.main.grammar.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Arrays;

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
        String lhs = ctx.children.get(0).getText();
        ScopeElement se = compiler.scope.getToken(lhs);
        String rhs = ctx.children.get(2).getText();

        if (compiler.lastType != null) {
            if (compiler.lastType.equals("long")) {
                se.setValue("lload " + (compiler.varCounter - 1));
                se.setType("int");
                compiler.lastType = null;
            } else {
                if (!se.getType().equals("float")) {
                    compiler.lastType = "long";
                }

                se.setValue("dload " + (compiler.varCounter - 1));
                se.setType("float");
            }
        } else {
            se.setValue(rhs);
        }
    }

    @Override
    public void exitAllexpr(LalaParser.AllexprContext ctx) {
        String expr = ctx.children.get(0).getText();

        ArrayList<String> tokens =
            new ArrayList<String>(
                Arrays.asList(new String[]{
                    "=<", ">=", "<",
                    ">", "=="
                }));

        for (String tok : tokens) {
            if (expr.contains(tok)) {
                String[] parts = expr.split(tok);

                char ltype = '\0';
                char rtype = '\0';

                String lhs = parts[0];
                String rhs = parts[1];

                try {
                    Integer.parseInt(rhs);
                    rtype = 'l';
                } catch (Exception e1) {
                    try {
                        Double.parseDouble(rhs);
                        rtype = 'd';
                    } catch (Exception e2) {
                        ScopeElement rse = compiler.scope.getToken(rhs);

                        if (rse != null) {
                            rhs = rse.getValue().toString();
                            rtype = rse.getType().equals("long") ? 'l' : 'd';
                        }
                    }
                }

                try {
                    Integer.parseInt(lhs);
                    ltype = 'l';
                } catch (Exception e1) {
                    try {
                        Double.parseDouble(lhs);
                        ltype = 'd';
                    } catch (Exception e2) {
                        ScopeElement lse = compiler.scope.getToken(lhs);

                        if (lse != null) {
                            lhs = lse.getValue().toString();
                            ltype = lse.getType().equals("long") ? 'l' : 'd';
                        }
                    }
                }

                if (ltype == '\0' || rtype == '\0') {
                    return;
                }

                char type = ltype == 'd' || rtype == 'd' ? 'd' : 'l';

                Logic logic = new Logic(ltype, lhs, "ifeq", rtype, rhs, type);
                compiler.addLine(logic);
            }
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
            if (compiler.lastType.equals("long"))
                l = "lload " + (compiler.varCounter - 1);
            else
                l = "dload " + (compiler.varCounter - 1);

        }

        if (compiler.scope.tokenInScope(l)) {
            l = compiler.scope.getToken(l).getValue().toString();
        }

        if (compiler.scope.tokenInScope(r)) {
            r = compiler.scope.getToken(r).getValue().toString();
        }

        Arith expr = null;
        switch (ctx.children.get(1).getText()) {
            case "+":
                expr = new Add(l, r, compiler);
                break;
            case "-":
                expr = new Sub(l, r, compiler);
        }
        compiler.lastType = expr.type;
        compiler.addLine(expr);
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
    public void exitRel(LalaParser.RelContext ctx) {
////        for (ParseTree pt : ctx.children)
////            System.out.println(pt.getText());
//
//        if (ctx.children.size() != 3) {
//            return;
//        }
//
//        String lhs = ctx.children.get(0).getText();
//        String rhs = ctx.children.get(2).getText();
//
//        System.out.println(lhs + "    " + rhs);
//
//        switch (ctx.children.get(1).getText()) {
//            case "<":
//
//            case "<=":
//            case ">":
//            case ">=":
//            case "==":
//                break;
//        }
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
