// Generated from C:/Users/raagh/IdeaProjects/cse232b-xml-project/src/main/antlr\XGrammar.g4 by ANTLR 4.9.1
package org.raaghavoguz.xmlproject.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XGrammarParser}.
 */
public interface XGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code AbsoluteImmediate}
	 * labeled alternative in {@link XGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteImmediate(XGrammarParser.AbsoluteImmediateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbsoluteImmediate}
	 * labeled alternative in {@link XGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteImmediate(XGrammarParser.AbsoluteImmediateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AbsoluteRecursive}
	 * labeled alternative in {@link XGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAbsoluteRecursive(XGrammarParser.AbsoluteRecursiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AbsoluteRecursive}
	 * labeled alternative in {@link XGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAbsoluteRecursive(XGrammarParser.AbsoluteRecursiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpDot}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterExpDot(XGrammarParser.ExpDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpDot}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitExpDot(XGrammarParser.ExpDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpRPDir1}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterExpRPDir1(XGrammarParser.ExpRPDir1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpRPDir1}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitExpRPDir1(XGrammarParser.ExpRPDir1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpRPbrackets}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterExpRPbrackets(XGrammarParser.ExpRPbracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpRPbrackets}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitExpRPbrackets(XGrammarParser.ExpRPbracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpCat}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterExpCat(XGrammarParser.ExpCatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpCat}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitExpCat(XGrammarParser.ExpCatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpDotDot}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterExpDotDot(XGrammarParser.ExpDotDotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpDotDot}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitExpDotDot(XGrammarParser.ExpDotDotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpStar}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterExpStar(XGrammarParser.ExpStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpStar}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitExpStar(XGrammarParser.ExpStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpTagName}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterExpTagName(XGrammarParser.ExpTagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpTagName}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitExpTagName(XGrammarParser.ExpTagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpRPDir2}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterExpRPDir2(XGrammarParser.ExpRPDir2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpRPDir2}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitExpRPDir2(XGrammarParser.ExpRPDir2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpRPfilter}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterExpRPfilter(XGrammarParser.ExpRPfilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpRPfilter}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitExpRPfilter(XGrammarParser.ExpRPfilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpText}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterExpText(XGrammarParser.ExpTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpText}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitExpText(XGrammarParser.ExpTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpAttname}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterExpAttname(XGrammarParser.ExpAttnameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpAttname}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitExpAttname(XGrammarParser.ExpAttnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(XGrammarParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(XGrammarParser.FContext ctx);
}