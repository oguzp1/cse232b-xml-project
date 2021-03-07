// Generated from C:/Users/OGUZ/IdeaProjects/cse232b-xml-project/src/main/antlr\XSimpleGrammar.g4 by ANTLR 4.9.1
package org.raaghavoguz.xmlproject.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XSimpleGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XSimpleGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XSimpleGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXq(XSimpleGrammarParser.XqContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSimpleGrammarParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(XSimpleGrammarParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSimpleGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(XSimpleGrammarParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSimpleGrammarParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(XSimpleGrammarParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSimpleGrammarParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(XSimpleGrammarParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSimpleGrammarParser#sep}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSep(XSimpleGrammarParser.SepContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSimpleGrammarParser#ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(XSimpleGrammarParser.RetContext ctx);
	/**
	 * Visit a parse tree produced by {@link XSimpleGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(XSimpleGrammarParser.CondContext ctx);
}