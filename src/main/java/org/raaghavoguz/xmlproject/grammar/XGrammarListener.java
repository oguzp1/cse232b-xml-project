// Generated from C:/Users/OGUZ/IdeaProjects/cse232b-xml-project/src/main/antlr\XGrammar.g4 by ANTLR 4.9.1
package org.raaghavoguz.xmlproject.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XGrammarParser}.
 */
public interface XGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code APDir}
	 * labeled alternative in {@link XGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAPDir(XGrammarParser.APDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APDir}
	 * labeled alternative in {@link XGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAPDir(XGrammarParser.APDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code APDirRecursive}
	 * labeled alternative in {@link XGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterAPDirRecursive(XGrammarParser.APDirRecursiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code APDirRecursive}
	 * labeled alternative in {@link XGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitAPDirRecursive(XGrammarParser.APDirRecursiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPCurrentDir}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPCurrentDir(XGrammarParser.RPCurrentDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPCurrentDir}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPCurrentDir(XGrammarParser.RPCurrentDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPConcat}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPConcat(XGrammarParser.RPConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPConcat}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPConcat(XGrammarParser.RPConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPAttName}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPAttName(XGrammarParser.RPAttNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPAttName}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPAttName(XGrammarParser.RPAttNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPFilter}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPFilter(XGrammarParser.RPFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPFilter}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPFilter(XGrammarParser.RPFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPText}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPText(XGrammarParser.RPTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPText}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPText(XGrammarParser.RPTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPDir}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPDir(XGrammarParser.RPDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPDir}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPDir(XGrammarParser.RPDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPParentDir}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPParentDir(XGrammarParser.RPParentDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPParentDir}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPParentDir(XGrammarParser.RPParentDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPParantheses}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPParantheses(XGrammarParser.RPParanthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPParantheses}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPParantheses(XGrammarParser.RPParanthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPTagName}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPTagName(XGrammarParser.RPTagNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPTagName}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPTagName(XGrammarParser.RPTagNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPStar}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPStar(XGrammarParser.RPStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPStar}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPStar(XGrammarParser.RPStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RPDirRecursive}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterRPDirRecursive(XGrammarParser.RPDirRecursiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RPDirRecursive}
	 * labeled alternative in {@link XGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitRPDirRecursive(XGrammarParser.RPDirRecursiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FAnd}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFAnd(XGrammarParser.FAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FAnd}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFAnd(XGrammarParser.FAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRP}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFRP(XGrammarParser.FRPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRP}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFRP(XGrammarParser.FRPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPEqual}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFRPEqual(XGrammarParser.FRPEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPEqual}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFRPEqual(XGrammarParser.FRPEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FOr}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFOr(XGrammarParser.FOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FOr}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFOr(XGrammarParser.FOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FStringEqual}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFStringEqual(XGrammarParser.FStringEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FStringEqual}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFStringEqual(XGrammarParser.FStringEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FParantheses}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFParantheses(XGrammarParser.FParanthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FParantheses}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFParantheses(XGrammarParser.FParanthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FNot}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFNot(XGrammarParser.FNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FNot}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFNot(XGrammarParser.FNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FRPIdentical}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterFRPIdentical(XGrammarParser.FRPIdenticalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FRPIdentical}
	 * labeled alternative in {@link XGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitFRPIdentical(XGrammarParser.FRPIdenticalContext ctx);
}