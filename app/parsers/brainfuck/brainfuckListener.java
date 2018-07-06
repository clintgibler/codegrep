// Generated from brainfuck/brainfuck.g4 by ANTLR 4.7.1
package parsers.brainfuck;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link brainfuckParser}.
 */
public interface brainfuckListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link brainfuckParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(brainfuckParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link brainfuckParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(brainfuckParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link brainfuckParser#opcode}.
	 * @param ctx the parse tree
	 */
	void enterOpcode(brainfuckParser.OpcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link brainfuckParser#opcode}.
	 * @param ctx the parse tree
	 */
	void exitOpcode(brainfuckParser.OpcodeContext ctx);
}