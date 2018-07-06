// Generated from ucb-logo/UCBLogo.g4 by ANTLR 4.7.1
package parsers.ucb-logo;

  import java.util.Map;
  import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UCBLogoParser}.
 */
public interface UCBLogoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UCBLogoParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(UCBLogoParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link UCBLogoParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(UCBLogoParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code procedureDefInstruction}
	 * labeled alternative in {@link UCBLogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDefInstruction(UCBLogoParser.ProcedureDefInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code procedureDefInstruction}
	 * labeled alternative in {@link UCBLogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDefInstruction(UCBLogoParser.ProcedureDefInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code macroDefInstruction}
	 * labeled alternative in {@link UCBLogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterMacroDefInstruction(UCBLogoParser.MacroDefInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code macroDefInstruction}
	 * labeled alternative in {@link UCBLogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitMacroDefInstruction(UCBLogoParser.MacroDefInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code procedureCallExtraInputInstruction}
	 * labeled alternative in {@link UCBLogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCallExtraInputInstruction(UCBLogoParser.ProcedureCallExtraInputInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code procedureCallExtraInputInstruction}
	 * labeled alternative in {@link UCBLogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCallExtraInputInstruction(UCBLogoParser.ProcedureCallExtraInputInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code procedureCallInstruction}
	 * labeled alternative in {@link UCBLogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCallInstruction(UCBLogoParser.ProcedureCallInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code procedureCallInstruction}
	 * labeled alternative in {@link UCBLogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCallInstruction(UCBLogoParser.ProcedureCallInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UCBLogoParser#procedure_def}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_def(UCBLogoParser.Procedure_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link UCBLogoParser#procedure_def}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_def(UCBLogoParser.Procedure_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link UCBLogoParser#macro_def}.
	 * @param ctx the parse tree
	 */
	void enterMacro_def(UCBLogoParser.Macro_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link UCBLogoParser#macro_def}.
	 * @param ctx the parse tree
	 */
	void exitMacro_def(UCBLogoParser.Macro_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link UCBLogoParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(UCBLogoParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link UCBLogoParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(UCBLogoParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link UCBLogoParser#body_def}.
	 * @param ctx the parse tree
	 */
	void enterBody_def(UCBLogoParser.Body_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link UCBLogoParser#body_def}.
	 * @param ctx the parse tree
	 */
	void exitBody_def(UCBLogoParser.Body_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link UCBLogoParser#body_instruction}.
	 * @param ctx the parse tree
	 */
	void enterBody_instruction(UCBLogoParser.Body_instructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UCBLogoParser#body_instruction}.
	 * @param ctx the parse tree
	 */
	void exitBody_instruction(UCBLogoParser.Body_instructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UCBLogoParser#procedure_call_extra_input}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_call_extra_input(UCBLogoParser.Procedure_call_extra_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link UCBLogoParser#procedure_call_extra_input}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_call_extra_input(UCBLogoParser.Procedure_call_extra_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link UCBLogoParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_call(UCBLogoParser.Procedure_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link UCBLogoParser#procedure_call}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_call(UCBLogoParser.Procedure_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link UCBLogoParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(UCBLogoParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link UCBLogoParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(UCBLogoParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqualsExpressionExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualsExpressionExpression(UCBLogoParser.NotEqualsExpressionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqualsExpressionExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualsExpressionExpression(UCBLogoParser.NotEqualsExpressionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpression(UCBLogoParser.ArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpression(UCBLogoParser.ArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additionExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpression(UCBLogoParser.AdditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additionExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpression(UCBLogoParser.AdditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wordExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterWordExpression(UCBLogoParser.WordExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wordExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitWordExpression(UCBLogoParser.WordExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(UCBLogoParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(UCBLogoParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParensExpression(UCBLogoParser.ParensExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParensExpression(UCBLogoParser.ParensExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(UCBLogoParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(UCBLogoParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpression(UCBLogoParser.GreaterThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpression(UCBLogoParser.GreaterThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(UCBLogoParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(UCBLogoParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpression(UCBLogoParser.DivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpression(UCBLogoParser.DivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanEqualsExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanEqualsExpression(UCBLogoParser.LessThanEqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanEqualsExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanEqualsExpression(UCBLogoParser.LessThanEqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanEqualsExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanEqualsExpression(UCBLogoParser.GreaterThanEqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanEqualsExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanEqualsExpression(UCBLogoParser.GreaterThanEqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(UCBLogoParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(UCBLogoParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedWordExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterQuotedWordExpression(UCBLogoParser.QuotedWordExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedWordExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitQuotedWordExpression(UCBLogoParser.QuotedWordExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalsExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualsExpression(UCBLogoParser.EqualsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalsExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualsExpression(UCBLogoParser.EqualsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractionExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionExpression(UCBLogoParser.SubtractionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractionExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionExpression(UCBLogoParser.SubtractionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code procedureCallExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCallExpression(UCBLogoParser.ProcedureCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code procedureCallExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCallExpression(UCBLogoParser.ProcedureCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThanExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThanExpression(UCBLogoParser.LessThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThanExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThanExpression(UCBLogoParser.LessThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code procedureCallExtraInput}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCallExtraInput(UCBLogoParser.ProcedureCallExtraInputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code procedureCallExtraInput}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCallExtraInput(UCBLogoParser.ProcedureCallExtraInputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListExpression(UCBLogoParser.ListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListExpression(UCBLogoParser.ListExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNameExpression(UCBLogoParser.NameExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameExpression}
	 * labeled alternative in {@link UCBLogoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNameExpression(UCBLogoParser.NameExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UCBLogoParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(UCBLogoParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link UCBLogoParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(UCBLogoParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link UCBLogoParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(UCBLogoParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link UCBLogoParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(UCBLogoParser.ListContext ctx);
}