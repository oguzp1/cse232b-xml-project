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
	/**
	 * Enter a parse tree produced by the {@code XQVar}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQVar(XGrammarParser.XQVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQVar}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQVar(XGrammarParser.XQVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQString}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQString(XGrammarParser.XQStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQString}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQString(XGrammarParser.XQStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQJoin}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQJoin(XGrammarParser.XQJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQJoin}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQJoin(XGrammarParser.XQJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQAbsolute}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQAbsolute(XGrammarParser.XQAbsoluteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQAbsolute}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQAbsolute(XGrammarParser.XQAbsoluteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQConcat}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQConcat(XGrammarParser.XQConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQConcat}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQConcat(XGrammarParser.XQConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQDir}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQDir(XGrammarParser.XQDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQDir}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQDir(XGrammarParser.XQDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQParantheses}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQParantheses(XGrammarParser.XQParanthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQParantheses}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQParantheses(XGrammarParser.XQParanthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQFLWR}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQFLWR(XGrammarParser.XQFLWRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQFLWR}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQFLWR(XGrammarParser.XQFLWRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQLet}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQLet(XGrammarParser.XQLetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQLet}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQLet(XGrammarParser.XQLetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQDirRecursive}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQDirRecursive(XGrammarParser.XQDirRecursiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQDirRecursive}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQDirRecursive(XGrammarParser.XQDirRecursiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XQConstructor}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void enterXQConstructor(XGrammarParser.XQConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XQConstructor}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 */
	void exitXQConstructor(XGrammarParser.XQConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link XGrammarParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(XGrammarParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XGrammarParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(XGrammarParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XGrammarParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(XGrammarParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XGrammarParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(XGrammarParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(XGrammarParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(XGrammarParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XGrammarParser#joinConstructor}.
	 * @param ctx the parse tree
	 */
	void enterJoinConstructor(XGrammarParser.JoinConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link XGrammarParser#joinConstructor}.
	 * @param ctx the parse tree
	 */
	void exitJoinConstructor(XGrammarParser.JoinConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link XGrammarParser#joinCond}.
	 * @param ctx the parse tree
	 */
	void enterJoinCond(XGrammarParser.JoinCondContext ctx);
	/**
	 * Exit a parse tree produced by {@link XGrammarParser#joinCond}.
	 * @param ctx the parse tree
	 */
	void exitJoinCond(XGrammarParser.JoinCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link XGrammarParser#joinProj}.
	 * @param ctx the parse tree
	 */
	void enterJoinProj(XGrammarParser.JoinProjContext ctx);
	/**
	 * Exit a parse tree produced by {@link XGrammarParser#joinProj}.
	 * @param ctx the parse tree
	 */
	void exitJoinProj(XGrammarParser.JoinProjContext ctx);
	/**
	 * Enter a parse tree produced by {@link XGrammarParser#joinReturn}.
	 * @param ctx the parse tree
	 */
	void enterJoinReturn(XGrammarParser.JoinReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link XGrammarParser#joinReturn}.
	 * @param ctx the parse tree
	 */
	void exitJoinReturn(XGrammarParser.JoinReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link XGrammarParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(XGrammarParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XGrammarParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(XGrammarParser.JoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XGrammarParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(XGrammarParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XGrammarParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(XGrammarParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondOr}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondOr(XGrammarParser.CondOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondOr}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondOr(XGrammarParser.CondOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondAnd}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondAnd(XGrammarParser.CondAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondAnd}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondAnd(XGrammarParser.CondAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondParantheses}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondParantheses(XGrammarParser.CondParanthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondParantheses}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondParantheses(XGrammarParser.CondParanthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondEmpty}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEmpty(XGrammarParser.CondEmptyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondEmpty}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEmpty(XGrammarParser.CondEmptyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondSome}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondSome(XGrammarParser.CondSomeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondSome}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondSome(XGrammarParser.CondSomeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondNot}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondNot(XGrammarParser.CondNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondNot}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondNot(XGrammarParser.CondNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondEqual}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondEqual(XGrammarParser.CondEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondEqual}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondEqual(XGrammarParser.CondEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CondIdentical}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCondIdentical(XGrammarParser.CondIdenticalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CondIdentical}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCondIdentical(XGrammarParser.CondIdenticalContext ctx);
}