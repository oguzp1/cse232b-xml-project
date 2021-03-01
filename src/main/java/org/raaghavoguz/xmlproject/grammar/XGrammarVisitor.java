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
	/**
	 * Visit a parse tree produced by the {@code XQVar}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQVar(XGrammarParser.XQVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQString}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQString(XGrammarParser.XQStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQJoin}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQJoin(XGrammarParser.XQJoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQAbsolute}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQAbsolute(XGrammarParser.XQAbsoluteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQConcat}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQConcat(XGrammarParser.XQConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQDir}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQDir(XGrammarParser.XQDirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQParantheses}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQParantheses(XGrammarParser.XQParanthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQFLWR}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQFLWR(XGrammarParser.XQFLWRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQLet}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQLet(XGrammarParser.XQLetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQDirRecursive}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQDirRecursive(XGrammarParser.XQDirRecursiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XQConstructor}
	 * labeled alternative in {@link XGrammarParser#xq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXQConstructor(XGrammarParser.XQConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link XGrammarParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(XGrammarParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XGrammarParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(XGrammarParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(XGrammarParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XGrammarParser#joinConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinConstructor(XGrammarParser.JoinConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link XGrammarParser#joinCond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCond(XGrammarParser.JoinCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link XGrammarParser#joinProj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinProj(XGrammarParser.JoinProjContext ctx);
	/**
	 * Visit a parse tree produced by {@link XGrammarParser#joinReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinReturn(XGrammarParser.JoinReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link XGrammarParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(XGrammarParser.JoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link XGrammarParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(XGrammarParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondOr}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOr(XGrammarParser.CondOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondAnd}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondAnd(XGrammarParser.CondAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondParantheses}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondParantheses(XGrammarParser.CondParanthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondEmpty}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondEmpty(XGrammarParser.CondEmptyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondSome}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondSome(XGrammarParser.CondSomeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondNot}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondNot(XGrammarParser.CondNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondEqual}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondEqual(XGrammarParser.CondEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CondIdentical}
	 * labeled alternative in {@link XGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondIdentical(XGrammarParser.CondIdenticalContext ctx);
}