// Generated from tinybasic/tinybasic.g4 by ANTLR 4.7.1
package parsers.tinybasic;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tinybasicParser}.
 */
public interface tinybasicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tinybasicParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(tinybasicParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinybasicParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(tinybasicParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinybasicParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(tinybasicParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinybasicParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(tinybasicParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinybasicParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(tinybasicParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinybasicParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(tinybasicParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinybasicParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void enterExprlist(tinybasicParser.ExprlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinybasicParser#exprlist}.
	 * @param ctx the parse tree
	 */
	void exitExprlist(tinybasicParser.ExprlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinybasicParser#varlist}.
	 * @param ctx the parse tree
	 */
	void enterVarlist(tinybasicParser.VarlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinybasicParser#varlist}.
	 * @param ctx the parse tree
	 */
	void exitVarlist(tinybasicParser.VarlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinybasicParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(tinybasicParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinybasicParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(tinybasicParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinybasicParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(tinybasicParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinybasicParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(tinybasicParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinybasicParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(tinybasicParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinybasicParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(tinybasicParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinybasicParser#vara}.
	 * @param ctx the parse tree
	 */
	void enterVara(tinybasicParser.VaraContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinybasicParser#vara}.
	 * @param ctx the parse tree
	 */
	void exitVara(tinybasicParser.VaraContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinybasicParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(tinybasicParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinybasicParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(tinybasicParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link tinybasicParser#relop}.
	 * @param ctx the parse tree
	 */
	void enterRelop(tinybasicParser.RelopContext ctx);
	/**
	 * Exit a parse tree produced by {@link tinybasicParser#relop}.
	 * @param ctx the parse tree
	 */
	void exitRelop(tinybasicParser.RelopContext ctx);
}