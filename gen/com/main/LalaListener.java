// Generated from /Users/ali/Documents/cmpe-152-project-4/Lala.g4 by ANTLR 4.7.2
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
	 * Enter a parse tree produced by {@link LalaParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void enterAddexpr(LalaParser.AddexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LalaParser#addexpr}.
	 * @param ctx the parse tree
	 */
	void exitAddexpr(LalaParser.AddexprContext ctx);
}
