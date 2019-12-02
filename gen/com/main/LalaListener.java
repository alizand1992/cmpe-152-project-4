// Generated from /home/ali/Documents/cmpe-152-project-4/Lala.g4 by ANTLR 4.7.2
package com.main;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LalaParser}.
 */
public interface LalaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LalaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LalaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LalaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LalaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LalaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LalaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LalaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LalaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LalaParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(LalaParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LalaParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(LalaParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LalaParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(LalaParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LalaParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(LalaParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LalaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LalaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LalaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LalaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LalaParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(LalaParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LalaParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(LalaParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LalaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(LalaParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LalaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(LalaParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LalaParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LalaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link LalaParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LalaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link LalaParser#allexpr}.
	 * @param ctx the parse tree
	 */
	void enterAllexpr(LalaParser.AllexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LalaParser#allexpr}.
	 * @param ctx the parse tree
	 */
	void exitAllexpr(LalaParser.AllexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LalaParser#andexpr}.
	 * @param ctx the parse tree
	 */
	void enterAndexpr(LalaParser.AndexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LalaParser#andexpr}.
	 * @param ctx the parse tree
	 */
	void exitAndexpr(LalaParser.AndexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LalaParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(LalaParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link LalaParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(LalaParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link LalaParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRel(LalaParser.RelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LalaParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRel(LalaParser.RelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LalaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LalaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LalaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LalaParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LalaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(LalaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link LalaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(LalaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link LalaParser#incdecexpr}.
	 * @param ctx the parse tree
	 */
	void enterIncdecexpr(LalaParser.IncdecexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LalaParser#incdecexpr}.
	 * @param ctx the parse tree
	 */
	void exitIncdecexpr(LalaParser.IncdecexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LalaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(LalaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LalaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(LalaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LalaParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(LalaParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LalaParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(LalaParser.PrintContext ctx);
}