// Generated from rpn/rpn.g4 by ANTLR 4.7.1
package parsers.rpn;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link rpnParser}.
 */
public interface rpnListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link rpnParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(rpnParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link rpnParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(rpnParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link rpnParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(rpnParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link rpnParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(rpnParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link rpnParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterOper(rpnParser.OperContext ctx);
	/**
	 * Exit a parse tree produced by {@link rpnParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitOper(rpnParser.OperContext ctx);
	/**
	 * Enter a parse tree produced by {@link rpnParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void enterSignedAtom(rpnParser.SignedAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link rpnParser#signedAtom}.
	 * @param ctx the parse tree
	 */
	void exitSignedAtom(rpnParser.SignedAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link rpnParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(rpnParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link rpnParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(rpnParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link rpnParser#scientific}.
	 * @param ctx the parse tree
	 */
	void enterScientific(rpnParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by {@link rpnParser#scientific}.
	 * @param ctx the parse tree
	 */
	void exitScientific(rpnParser.ScientificContext ctx);
}