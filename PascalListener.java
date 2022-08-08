// Generated from Pascal.g4 by ANTLR 4.9.3

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalParser}.
 */
public interface PascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(PascalParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(PascalParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#progName}.
	 * @param ctx the parse tree
	 */
	void enterProgName(PascalParser.ProgNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#progName}.
	 * @param ctx the parse tree
	 */
	void exitProgName(PascalParser.ProgNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#varDec}.
	 * @param ctx the parse tree
	 */
	void enterVarDec(PascalParser.VarDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#varDec}.
	 * @param ctx the parse tree
	 */
	void exitVarDec(PascalParser.VarDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#varLists}.
	 * @param ctx the parse tree
	 */
	void enterVarLists(PascalParser.VarListsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#varLists}.
	 * @param ctx the parse tree
	 */
	void exitVarLists(PascalParser.VarListsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#varName}.
	 * @param ctx the parse tree
	 */
	void enterVarName(PascalParser.VarNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#varName}.
	 * @param ctx the parse tree
	 */
	void exitVarName(PascalParser.VarNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void enterMainBlock(PascalParser.MainBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void exitMainBlock(PascalParser.MainBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#statFull}.
	 * @param ctx the parse tree
	 */
	void enterStatFull(PascalParser.StatFullContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#statFull}.
	 * @param ctx the parse tree
	 */
	void exitStatFull(PascalParser.StatFullContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(PascalParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(PascalParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#writeStat}.
	 * @param ctx the parse tree
	 */
	void enterWriteStat(PascalParser.WriteStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#writeStat}.
	 * @param ctx the parse tree
	 */
	void exitWriteStat(PascalParser.WriteStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#writeBlock}.
	 * @param ctx the parse tree
	 */
	void enterWriteBlock(PascalParser.WriteBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#writeBlock}.
	 * @param ctx the parse tree
	 */
	void exitWriteBlock(PascalParser.WriteBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#readStat}.
	 * @param ctx the parse tree
	 */
	void enterReadStat(PascalParser.ReadStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#readStat}.
	 * @param ctx the parse tree
	 */
	void exitReadStat(PascalParser.ReadStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(PascalParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(PascalParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#caseBegin}.
	 * @param ctx the parse tree
	 */
	void enterCaseBegin(PascalParser.CaseBeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#caseBegin}.
	 * @param ctx the parse tree
	 */
	void exitCaseBegin(PascalParser.CaseBeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#caseStat}.
	 * @param ctx the parse tree
	 */
	void enterCaseStat(PascalParser.CaseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#caseStat}.
	 * @param ctx the parse tree
	 */
	void exitCaseStat(PascalParser.CaseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#boolCase}.
	 * @param ctx the parse tree
	 */
	void enterBoolCase(PascalParser.BoolCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#boolCase}.
	 * @param ctx the parse tree
	 */
	void exitBoolCase(PascalParser.BoolCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#checkBoolCase}.
	 * @param ctx the parse tree
	 */
	void enterCheckBoolCase(PascalParser.CheckBoolCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#checkBoolCase}.
	 * @param ctx the parse tree
	 */
	void exitCheckBoolCase(PascalParser.CheckBoolCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#elseCase}.
	 * @param ctx the parse tree
	 */
	void enterElseCase(PascalParser.ElseCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#elseCase}.
	 * @param ctx the parse tree
	 */
	void exitElseCase(PascalParser.ElseCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#checkElseCase}.
	 * @param ctx the parse tree
	 */
	void enterCheckElseCase(PascalParser.CheckElseCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#checkElseCase}.
	 * @param ctx the parse tree
	 */
	void exitCheckElseCase(PascalParser.CheckElseCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#doubleCase}.
	 * @param ctx the parse tree
	 */
	void enterDoubleCase(PascalParser.DoubleCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#doubleCase}.
	 * @param ctx the parse tree
	 */
	void exitDoubleCase(PascalParser.DoubleCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#checkDoubleCase}.
	 * @param ctx the parse tree
	 */
	void enterCheckDoubleCase(PascalParser.CheckDoubleCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#checkDoubleCase}.
	 * @param ctx the parse tree
	 */
	void exitCheckDoubleCase(PascalParser.CheckDoubleCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(PascalParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(PascalParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(PascalParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(PascalParser.BoolExprContext ctx);
}