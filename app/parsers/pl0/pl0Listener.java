// Generated from pl0/pl0.g4 by ANTLR 4.7.1
package parsers.pl0;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pl0Parser}.
 */
public interface pl0Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pl0Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(pl0Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link pl0Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(pl0Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link pl0Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(pl0Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pl0Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(pl0Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pl0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(pl0Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pl0Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(pl0Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pl0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(pl0Parser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pl0Parser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(pl0Parser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pl0Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(pl0Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pl0Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(pl0Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pl0Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(pl0Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link pl0Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(pl0Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link pl0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(pl0Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pl0Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(pl0Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pl0Parser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(pl0Parser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pl0Parser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(pl0Parser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pl0Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(pl0Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link pl0Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(pl0Parser.NumberContext ctx);
}