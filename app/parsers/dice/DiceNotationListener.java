// Generated from dice/DiceNotation.g4 by ANTLR 4.7.1
package parsers.dice;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DiceNotationParser}.
 */
public interface DiceNotationListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DiceNotationParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(DiceNotationParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceNotationParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(DiceNotationParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceNotationParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(DiceNotationParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceNotationParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(DiceNotationParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceNotationParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(DiceNotationParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceNotationParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(DiceNotationParser.BinaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DiceNotationParser#dice}.
	 * @param ctx the parse tree
	 */
	void enterDice(DiceNotationParser.DiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DiceNotationParser#dice}.
	 * @param ctx the parse tree
	 */
	void exitDice(DiceNotationParser.DiceContext ctx);
}