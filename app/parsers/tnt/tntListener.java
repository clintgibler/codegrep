// Generated from tnt/tnt.g4 by ANTLR 4.7.1
package parsers.tnt;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tntParser}.
 */
public interface tntListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tntParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(tntParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link tntParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(tntParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link tntParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(tntParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link tntParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(tntParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link tntParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(tntParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link tntParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(tntParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link tntParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(tntParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link tntParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(tntParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link tntParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(tntParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tntParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(tntParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tntParser#forevery}.
	 * @param ctx the parse tree
	 */
	void enterForevery(tntParser.ForeveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link tntParser#forevery}.
	 * @param ctx the parse tree
	 */
	void exitForevery(tntParser.ForeveryContext ctx);
	/**
	 * Enter a parse tree produced by {@link tntParser#exists}.
	 * @param ctx the parse tree
	 */
	void enterExists(tntParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tntParser#exists}.
	 * @param ctx the parse tree
	 */
	void exitExists(tntParser.ExistsContext ctx);
}