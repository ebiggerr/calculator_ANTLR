// Generated from C:/Users/alexi/IdeaProjects/ebiggerr_language/src/com/ebiggerr/grammar\ebiggerr.g4 by ANTLR 4.9.1
package com.ebiggerr.grammar.output;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ebiggerrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ebiggerrVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ebiggerrParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ebiggerrParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ebiggerrParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(ebiggerrParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ebiggerrParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ebiggerrParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ebiggerrParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(ebiggerrParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ebiggerrParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(ebiggerrParser.AtomContext ctx);
}