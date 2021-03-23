// Generated from C:/Users/OGUZ/IdeaProjects/cse232b-xml-project/src/main/antlr\XSimpleGrammar.g4 by ANTLR 4.9.1
package org.raaghavoguz.xmlproject.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XSimpleGrammarParser}.
 */
public interface XSimpleGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XSimpleGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXq(XSimpleGrammarParser.XqContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSimpleGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXq(XSimpleGrammarParser.XqContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSimpleGrammarParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(XSimpleGrammarParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSimpleGrammarParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(XSimpleGrammarParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSimpleGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(XSimpleGrammarParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSimpleGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(XSimpleGrammarParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSimpleGrammarParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(XSimpleGrammarParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSimpleGrammarParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(XSimpleGrammarParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSimpleGrammarParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(XSimpleGrammarParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSimpleGrammarParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(XSimpleGrammarParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSimpleGrammarParser#pathname}.
	 * @param ctx the parse tree
	 */
	void enterPathname(XSimpleGrammarParser.PathnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSimpleGrammarParser#pathname}.
	 * @param ctx the parse tree
	 */
	void exitPathname(XSimpleGrammarParser.PathnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSimpleGrammarParser#sep}.
	 * @param ctx the parse tree
	 */
	void enterSep(XSimpleGrammarParser.SepContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSimpleGrammarParser#sep}.
	 * @param ctx the parse tree
	 */
	void exitSep(XSimpleGrammarParser.SepContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSimpleGrammarParser#ret}.
	 * @param ctx the parse tree
	 */
	void enterRet(XSimpleGrammarParser.RetContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSimpleGrammarParser#ret}.
	 * @param ctx the parse tree
	 */
	void exitRet(XSimpleGrammarParser.RetContext ctx);
	/**
	 * Enter a parse tree produced by {@link XSimpleGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(XSimpleGrammarParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link XSimpleGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(XSimpleGrammarParser.CondContext ctx);
}