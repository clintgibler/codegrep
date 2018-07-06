// Generated from redcode/redcode.g4 by ANTLR 4.7.1
package parsers.redcode;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link redcodeParser}.
 */
public interface redcodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link redcodeParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(redcodeParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link redcodeParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(redcodeParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link redcodeParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(redcodeParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link redcodeParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(redcodeParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link redcodeParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(redcodeParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link redcodeParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(redcodeParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link redcodeParser#opcode}.
	 * @param ctx the parse tree
	 */
	void enterOpcode(redcodeParser.OpcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link redcodeParser#opcode}.
	 * @param ctx the parse tree
	 */
	void exitOpcode(redcodeParser.OpcodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link redcodeParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(redcodeParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link redcodeParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(redcodeParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link redcodeParser#mmode}.
	 * @param ctx the parse tree
	 */
	void enterMmode(redcodeParser.MmodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link redcodeParser#mmode}.
	 * @param ctx the parse tree
	 */
	void exitMmode(redcodeParser.MmodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link redcodeParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(redcodeParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link redcodeParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(redcodeParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link redcodeParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(redcodeParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link redcodeParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(redcodeParser.CommentContext ctx);
}