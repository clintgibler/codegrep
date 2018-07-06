// Generated from propcalc/propcalc.g4 by ANTLR 4.7.1
package parsers.propcalc;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link propcalcParser}.
 */
public interface propcalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link propcalcParser#proposition}.
	 * @param ctx the parse tree
	 */
	void enterProposition(propcalcParser.PropositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link propcalcParser#proposition}.
	 * @param ctx the parse tree
	 */
	void exitProposition(propcalcParser.PropositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link propcalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(propcalcParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link propcalcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(propcalcParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link propcalcParser#relExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelExpression(propcalcParser.RelExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link propcalcParser#relExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelExpression(propcalcParser.RelExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link propcalcParser#atoms}.
	 * @param ctx the parse tree
	 */
	void enterAtoms(propcalcParser.AtomsContext ctx);
	/**
	 * Exit a parse tree produced by {@link propcalcParser#atoms}.
	 * @param ctx the parse tree
	 */
	void exitAtoms(propcalcParser.AtomsContext ctx);
	/**
	 * Enter a parse tree produced by {@link propcalcParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(propcalcParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link propcalcParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(propcalcParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link propcalcParser#equiv}.
	 * @param ctx the parse tree
	 */
	void enterEquiv(propcalcParser.EquivContext ctx);
	/**
	 * Exit a parse tree produced by {@link propcalcParser#equiv}.
	 * @param ctx the parse tree
	 */
	void exitEquiv(propcalcParser.EquivContext ctx);
	/**
	 * Enter a parse tree produced by {@link propcalcParser#implies}.
	 * @param ctx the parse tree
	 */
	void enterImplies(propcalcParser.ImpliesContext ctx);
	/**
	 * Exit a parse tree produced by {@link propcalcParser#implies}.
	 * @param ctx the parse tree
	 */
	void exitImplies(propcalcParser.ImpliesContext ctx);
	/**
	 * Enter a parse tree produced by {@link propcalcParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(propcalcParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link propcalcParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(propcalcParser.VariableContext ctx);
}