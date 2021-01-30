// Generated from C:/Users/raagh/IdeaProjects/cse232b-xml-project/src/main/antlr\XGrammar.g4 by ANTLR 4.9.1
package org.raaghavoguz.xmlproject.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code AbsoluteImmediate}
	 * labeled alternative in {@link XGrammarParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteImmediate(XGrammarParser.AbsoluteImmediateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AbsoluteRecursive}
	 * labeled alternative in {@link XGrammarParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsoluteRecursive(XGrammarParser.AbsoluteRecursiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpDot}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpDot(XGrammarParser.ExpDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpRPDir1}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpRPDir1(XGrammarParser.ExpRPDir1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpRPbrackets}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpRPbrackets(XGrammarParser.ExpRPbracketsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpCat}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpCat(XGrammarParser.ExpCatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpDotDot}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpDotDot(XGrammarParser.ExpDotDotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpStar}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpStar(XGrammarParser.ExpStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpTagName}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpTagName(XGrammarParser.ExpTagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpRPDir2}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpRPDir2(XGrammarParser.ExpRPDir2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpRPfilter}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpRPfilter(XGrammarParser.ExpRPfilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpText}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpText(XGrammarParser.ExpTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpAttname}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpAttname(XGrammarParser.ExpAttnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(XGrammarParser.FContext ctx);
}