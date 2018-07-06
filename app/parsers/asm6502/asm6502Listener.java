// Generated from asm6502/asm6502.g4 by ANTLR 4.7.1
package parsers.asm6502;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link asm6502Parser}.
 */
public interface asm6502Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link asm6502Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(asm6502Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(asm6502Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm6502Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(asm6502Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(asm6502Parser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm6502Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(asm6502Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(asm6502Parser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm6502Parser#assemblerinstruction}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerinstruction(asm6502Parser.AssemblerinstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#assemblerinstruction}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerinstruction(asm6502Parser.AssemblerinstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm6502Parser#assembleropcode}.
	 * @param ctx the parse tree
	 */
	void enterAssembleropcode(asm6502Parser.AssembleropcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#assembleropcode}.
	 * @param ctx the parse tree
	 */
	void exitAssembleropcode(asm6502Parser.AssembleropcodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm6502Parser#lbl}.
	 * @param ctx the parse tree
	 */
	void enterLbl(asm6502Parser.LblContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#lbl}.
	 * @param ctx the parse tree
	 */
	void exitLbl(asm6502Parser.LblContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm6502Parser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void enterArgumentlist(asm6502Parser.ArgumentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void exitArgumentlist(asm6502Parser.ArgumentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm6502Parser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(asm6502Parser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(asm6502Parser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm6502Parser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(asm6502Parser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(asm6502Parser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm6502Parser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(asm6502Parser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(asm6502Parser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm6502Parser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(asm6502Parser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(asm6502Parser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm6502Parser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(asm6502Parser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(asm6502Parser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm6502Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(asm6502Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(asm6502Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm6502Parser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(asm6502Parser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(asm6502Parser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm6502Parser#opcode}.
	 * @param ctx the parse tree
	 */
	void enterOpcode(asm6502Parser.OpcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm6502Parser#opcode}.
	 * @param ctx the parse tree
	 */
	void exitOpcode(asm6502Parser.OpcodeContext ctx);
}