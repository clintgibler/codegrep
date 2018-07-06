// Generated from mumath/mumath.g4 by ANTLR 4.7.1
package parsers.mumath;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mumathParser}.
 */
public interface mumathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mumathParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(mumathParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumathParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(mumathParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumathParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(mumathParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumathParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(mumathParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumathParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(mumathParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumathParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(mumathParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumathParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(mumathParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumathParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(mumathParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumathParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(mumathParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumathParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(mumathParser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumathParser#statments}.
	 * @param ctx the parse tree
	 */
	void enterStatments(mumathParser.StatmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumathParser#statments}.
	 * @param ctx the parse tree
	 */
	void exitStatments(mumathParser.StatmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumathParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(mumathParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumathParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(mumathParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumathParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(mumathParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumathParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(mumathParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumathParser#when}.
	 * @param ctx the parse tree
	 */
	void enterWhen(mumathParser.WhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumathParser#when}.
	 * @param ctx the parse tree
	 */
	void exitWhen(mumathParser.WhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumathParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(mumathParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumathParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(mumathParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumathParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(mumathParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumathParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(mumathParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumathParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(mumathParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumathParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(mumathParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumathParser#addingOperator}.
	 * @param ctx the parse tree
	 */
	void enterAddingOperator(mumathParser.AddingOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumathParser#addingOperator}.
	 * @param ctx the parse tree
	 */
	void exitAddingOperator(mumathParser.AddingOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumathParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(mumathParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumathParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(mumathParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumathParser#multiplyingOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingOperator(mumathParser.MultiplyingOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumathParser#multiplyingOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingOperator(mumathParser.MultiplyingOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumathParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(mumathParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumathParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(mumathParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumathParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(mumathParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumathParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(mumathParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumathParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDesignator(mumathParser.FunctionDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumathParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDesignator(mumathParser.FunctionDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumathParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(mumathParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumathParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(mumathParser.EqualContext ctx);
}