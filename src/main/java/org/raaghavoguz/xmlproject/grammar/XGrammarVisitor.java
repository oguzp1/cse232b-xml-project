// Generated from C:/Users/OGUZ/IdeaProjects/cse232b-xml-project/src/main/antlr\XGrammar.g4 by ANTLR 4.9.1
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
	 * Visit a parse tree produced by the {@code APDir}
	 * labeled alternative in {@link XGrammarParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAPDir(XGrammarParser.APDirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code APDirRecursive}
	 * labeled alternative in {@link XGrammarParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAPDirRecursive(XGrammarParser.APDirRecursiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPCurrentDir}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPCurrentDir(XGrammarParser.RPCurrentDirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPConcat}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPConcat(XGrammarParser.RPConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPAttName}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPAttName(XGrammarParser.RPAttNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPFilter}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPFilter(XGrammarParser.RPFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPText}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPText(XGrammarParser.RPTextContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPDir}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPDir(XGrammarParser.RPDirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPParentDir}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPParentDir(XGrammarParser.RPParentDirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPParantheses}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPParantheses(XGrammarParser.RPParanthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPTagName}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPTagName(XGrammarParser.RPTagNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPStar}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPStar(XGrammarParser.RPStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RPDirRecursive}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRPDirRecursive(XGrammarParser.RPDirRecursiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FAnd}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFAnd(XGrammarParser.FAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRP}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRP(XGrammarParser.FRPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPEqual}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPEqual(XGrammarParser.FRPEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FOr}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFOr(XGrammarParser.FOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FStringEqual}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFStringEqual(XGrammarParser.FStringEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FParantheses}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFParantheses(XGrammarParser.FParanthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FNot}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFNot(XGrammarParser.FNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FRPIdentical}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFRPIdentical(XGrammarParser.FRPIdenticalContext ctx);
}