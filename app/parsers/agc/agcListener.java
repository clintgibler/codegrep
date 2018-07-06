// Generated from agc/agc.g4 by ANTLR 4.7.1
package parsers.agc;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link agcParser}.
 */
public interface agcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link agcParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(agcParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(agcParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(agcParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(agcParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#blank_line}.
	 * @param ctx the parse tree
	 */
	void enterBlank_line(agcParser.Blank_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#blank_line}.
	 * @param ctx the parse tree
	 */
	void exitBlank_line(agcParser.Blank_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#comment_line}.
	 * @param ctx the parse tree
	 */
	void enterComment_line(agcParser.Comment_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#comment_line}.
	 * @param ctx the parse tree
	 */
	void exitComment_line(agcParser.Comment_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#instruction_line}.
	 * @param ctx the parse tree
	 */
	void enterInstruction_line(agcParser.Instruction_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#instruction_line}.
	 * @param ctx the parse tree
	 */
	void exitInstruction_line(agcParser.Instruction_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#erase_line}.
	 * @param ctx the parse tree
	 */
	void enterErase_line(agcParser.Erase_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#erase_line}.
	 * @param ctx the parse tree
	 */
	void exitErase_line(agcParser.Erase_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#assignment_line}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_line(agcParser.Assignment_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#assignment_line}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_line(agcParser.Assignment_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#opcodes}.
	 * @param ctx the parse tree
	 */
	void enterOpcodes(agcParser.OpcodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#opcodes}.
	 * @param ctx the parse tree
	 */
	void exitOpcodes(agcParser.OpcodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(agcParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(agcParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(agcParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(agcParser.WsContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#eol}.
	 * @param ctx the parse tree
	 */
	void enterEol(agcParser.EolContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#eol}.
	 * @param ctx the parse tree
	 */
	void exitEol(agcParser.EolContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(agcParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(agcParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(agcParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(agcParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(agcParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(agcParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(agcParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(agcParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(agcParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(agcParser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(agcParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(agcParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#inte}.
	 * @param ctx the parse tree
	 */
	void enterInte(agcParser.InteContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#inte}.
	 * @param ctx the parse tree
	 */
	void exitInte(agcParser.InteContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(agcParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(agcParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(agcParser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(agcParser.RegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#opcode}.
	 * @param ctx the parse tree
	 */
	void enterOpcode(agcParser.OpcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#opcode}.
	 * @param ctx the parse tree
	 */
	void exitOpcode(agcParser.OpcodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#axt_opcode}.
	 * @param ctx the parse tree
	 */
	void enterAxt_opcode(agcParser.Axt_opcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#axt_opcode}.
	 * @param ctx the parse tree
	 */
	void exitAxt_opcode(agcParser.Axt_opcodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#pseudo_opcode}.
	 * @param ctx the parse tree
	 */
	void enterPseudo_opcode(agcParser.Pseudo_opcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#pseudo_opcode}.
	 * @param ctx the parse tree
	 */
	void exitPseudo_opcode(agcParser.Pseudo_opcodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link agcParser#standard_opcode}.
	 * @param ctx the parse tree
	 */
	void enterStandard_opcode(agcParser.Standard_opcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link agcParser#standard_opcode}.
	 * @param ctx the parse tree
	 */
	void exitStandard_opcode(agcParser.Standard_opcodeContext ctx);
}