// Generated from asmZ80/asmZ80.g4 by ANTLR 4.7.1
package parsers.asmZ80;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link asmZ80Parser}.
 */
public interface asmZ80Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link asmZ80Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(asmZ80Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmZ80Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(asmZ80Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmZ80Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(asmZ80Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmZ80Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(asmZ80Parser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmZ80Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(asmZ80Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmZ80Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(asmZ80Parser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmZ80Parser#opcode}.
	 * @param ctx the parse tree
	 */
	void enterOpcode(asmZ80Parser.OpcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmZ80Parser#opcode}.
	 * @param ctx the parse tree
	 */
	void exitOpcode(asmZ80Parser.OpcodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmZ80Parser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(asmZ80Parser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmZ80Parser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(asmZ80Parser.RegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmZ80Parser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(asmZ80Parser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmZ80Parser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(asmZ80Parser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmZ80Parser#assemblerdirective}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerdirective(asmZ80Parser.AssemblerdirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmZ80Parser#assemblerdirective}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerdirective(asmZ80Parser.AssemblerdirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmZ80Parser#lbl}.
	 * @param ctx the parse tree
	 */
	void enterLbl(asmZ80Parser.LblContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmZ80Parser#lbl}.
	 * @param ctx the parse tree
	 */
	void exitLbl(asmZ80Parser.LblContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmZ80Parser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void enterExpressionlist(asmZ80Parser.ExpressionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmZ80Parser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void exitExpressionlist(asmZ80Parser.ExpressionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmZ80Parser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(asmZ80Parser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmZ80Parser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(asmZ80Parser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmZ80Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(asmZ80Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmZ80Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(asmZ80Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmZ80Parser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(asmZ80Parser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmZ80Parser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(asmZ80Parser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmZ80Parser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(asmZ80Parser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmZ80Parser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(asmZ80Parser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmZ80Parser#dollar}.
	 * @param ctx the parse tree
	 */
	void enterDollar(asmZ80Parser.DollarContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmZ80Parser#dollar}.
	 * @param ctx the parse tree
	 */
	void exitDollar(asmZ80Parser.DollarContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmZ80Parser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(asmZ80Parser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmZ80Parser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(asmZ80Parser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmZ80Parser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(asmZ80Parser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmZ80Parser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(asmZ80Parser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmZ80Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(asmZ80Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmZ80Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(asmZ80Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmZ80Parser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(asmZ80Parser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmZ80Parser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(asmZ80Parser.CommentContext ctx);
}