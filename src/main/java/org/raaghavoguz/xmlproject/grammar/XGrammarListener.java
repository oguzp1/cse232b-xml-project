// Generated from C:/Users/OGUZ/IdeaProjects/cse232b-xml-project/src/main/antlr\XGrammar.g4 by ANTLR 4.9.1
package org.raaghavoguz.xmlproject.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XGrammarParser}.
 */
public interface XGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAp(XGrammarParser.ApContext ctx);
	/**
	 * Exit a parse tree produced by {@link XGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAp(XGrammarParser.ApContext ctx);
	/**
	 * Enter a parse tree produced by {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRp(XGrammarParser.RpContext ctx);
	/**
	 * Exit a parse tree produced by {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRp(XGrammarParser.RpContext ctx);
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