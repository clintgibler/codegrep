// Generated from robotwars/robotwar.g4 by ANTLR 4.7.1
package parsers.robotwars;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link robotwarParser}.
 */
public interface robotwarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link robotwarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(robotwarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotwarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(robotwarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotwarParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(robotwarParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotwarParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(robotwarParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotwarParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(robotwarParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotwarParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(robotwarParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotwarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(robotwarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotwarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(robotwarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotwarParser#accumstatement}.
	 * @param ctx the parse tree
	 */
	void enterAccumstatement(robotwarParser.AccumstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotwarParser#accumstatement}.
	 * @param ctx the parse tree
	 */
	void exitAccumstatement(robotwarParser.AccumstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotwarParser#accumexpression}.
	 * @param ctx the parse tree
	 */
	void enterAccumexpression(robotwarParser.AccumexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotwarParser#accumexpression}.
	 * @param ctx the parse tree
	 */
	void exitAccumexpression(robotwarParser.AccumexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotwarParser#gosubstatement}.
	 * @param ctx the parse tree
	 */
	void enterGosubstatement(robotwarParser.GosubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotwarParser#gosubstatement}.
	 * @param ctx the parse tree
	 */
	void exitGosubstatement(robotwarParser.GosubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotwarParser#gotostatement}.
	 * @param ctx the parse tree
	 */
	void enterGotostatement(robotwarParser.GotostatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotwarParser#gotostatement}.
	 * @param ctx the parse tree
	 */
	void exitGotostatement(robotwarParser.GotostatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotwarParser#tostatement}.
	 * @param ctx the parse tree
	 */
	void enterTostatement(robotwarParser.TostatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotwarParser#tostatement}.
	 * @param ctx the parse tree
	 */
	void exitTostatement(robotwarParser.TostatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotwarParser#endsubstatement}.
	 * @param ctx the parse tree
	 */
	void enterEndsubstatement(robotwarParser.EndsubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotwarParser#endsubstatement}.
	 * @param ctx the parse tree
	 */
	void exitEndsubstatement(robotwarParser.EndsubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotwarParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void enterIfstatement(robotwarParser.IfstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotwarParser#ifstatement}.
	 * @param ctx the parse tree
	 */
	void exitIfstatement(robotwarParser.IfstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotwarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(robotwarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotwarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(robotwarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotwarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(robotwarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotwarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(robotwarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotwarParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(robotwarParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotwarParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(robotwarParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotwarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(robotwarParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotwarParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(robotwarParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotwarParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(robotwarParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotwarParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(robotwarParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotwarParser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(robotwarParser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotwarParser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(robotwarParser.RegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotwarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(robotwarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotwarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(robotwarParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link robotwarParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(robotwarParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link robotwarParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(robotwarParser.CommentContext ctx);
}