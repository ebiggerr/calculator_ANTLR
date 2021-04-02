// Generated from C:/Users/alexi/IdeaProjects/ebiggerr_language/src/com/ebiggerr/grammar\ebiggerr.g4 by ANTLR 4.9.1
package com.ebiggerr.grammar.output;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ebiggerrParser}.
 */
public interface ebiggerrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ebiggerrParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ebiggerrParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ebiggerrParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ebiggerrParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ebiggerrParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ebiggerrParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ebiggerrParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ebiggerrParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ebiggerrParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ebiggerrParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ebiggerrParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ebiggerrParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ebiggerrParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(ebiggerrParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ebiggerrParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(ebiggerrParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ebiggerrParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ebiggerrParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ebiggerrParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ebiggerrParser.AtomContext ctx);
}