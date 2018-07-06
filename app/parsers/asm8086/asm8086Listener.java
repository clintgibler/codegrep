// Generated from asm8086/asm8086.g4 by ANTLR 4.7.1
package parsers.asm8086;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link asm8086Parser}.
 */
public interface asm8086Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(asm8086Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(asm8086Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(asm8086Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(asm8086Parser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(asm8086Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(asm8086Parser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#lbl}.
	 * @param ctx the parse tree
	 */
	void enterLbl(asm8086Parser.LblContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#lbl}.
	 * @param ctx the parse tree
	 */
	void exitLbl(asm8086Parser.LblContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#assemblerdirective}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerdirective(asm8086Parser.AssemblerdirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#assemblerdirective}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerdirective(asm8086Parser.AssemblerdirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#rw}.
	 * @param ctx the parse tree
	 */
	void enterRw(asm8086Parser.RwContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#rw}.
	 * @param ctx the parse tree
	 */
	void exitRw(asm8086Parser.RwContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#rb}.
	 * @param ctx the parse tree
	 */
	void enterRb(asm8086Parser.RbContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#rb}.
	 * @param ctx the parse tree
	 */
	void exitRb(asm8086Parser.RbContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#rs}.
	 * @param ctx the parse tree
	 */
	void enterRs(asm8086Parser.RsContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#rs}.
	 * @param ctx the parse tree
	 */
	void exitRs(asm8086Parser.RsContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#cseg}.
	 * @param ctx the parse tree
	 */
	void enterCseg(asm8086Parser.CsegContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#cseg}.
	 * @param ctx the parse tree
	 */
	void exitCseg(asm8086Parser.CsegContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#dseg}.
	 * @param ctx the parse tree
	 */
	void enterDseg(asm8086Parser.DsegContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#dseg}.
	 * @param ctx the parse tree
	 */
	void exitDseg(asm8086Parser.DsegContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#dw}.
	 * @param ctx the parse tree
	 */
	void enterDw(asm8086Parser.DwContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#dw}.
	 * @param ctx the parse tree
	 */
	void exitDw(asm8086Parser.DwContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#db}.
	 * @param ctx the parse tree
	 */
	void enterDb(asm8086Parser.DbContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#db}.
	 * @param ctx the parse tree
	 */
	void exitDb(asm8086Parser.DbContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#dd}.
	 * @param ctx the parse tree
	 */
	void enterDd(asm8086Parser.DdContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#dd}.
	 * @param ctx the parse tree
	 */
	void exitDd(asm8086Parser.DdContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#equ}.
	 * @param ctx the parse tree
	 */
	void enterEqu(asm8086Parser.EquContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#equ}.
	 * @param ctx the parse tree
	 */
	void exitEqu(asm8086Parser.EquContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(asm8086Parser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(asm8086Parser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#assemblerexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerexpression(asm8086Parser.AssemblerexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#assemblerexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerexpression(asm8086Parser.AssemblerexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#assemblerlogical}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerlogical(asm8086Parser.AssemblerlogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#assemblerlogical}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerlogical(asm8086Parser.AssemblerlogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#assemblerterm}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerterm(asm8086Parser.AssemblertermContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#assemblerterm}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerterm(asm8086Parser.AssemblertermContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#endif}.
	 * @param ctx the parse tree
	 */
	void enterEndif(asm8086Parser.EndifContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#endif}.
	 * @param ctx the parse tree
	 */
	void exitEndif(asm8086Parser.EndifContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(asm8086Parser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(asm8086Parser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#org}.
	 * @param ctx the parse tree
	 */
	void enterOrg(asm8086Parser.OrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#org}.
	 * @param ctx the parse tree
	 */
	void exitOrg(asm8086Parser.OrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(asm8086Parser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(asm8086Parser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#include}.
	 * @param ctx the parse tree
	 */
	void enterInclude(asm8086Parser.IncludeContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#include}.
	 * @param ctx the parse tree
	 */
	void exitInclude(asm8086Parser.IncludeContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void enterExpressionlist(asm8086Parser.ExpressionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void exitExpressionlist(asm8086Parser.ExpressionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(asm8086Parser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(asm8086Parser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(asm8086Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(asm8086Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(asm8086Parser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(asm8086Parser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(asm8086Parser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(asm8086Parser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#ptr}.
	 * @param ctx the parse tree
	 */
	void enterPtr(asm8086Parser.PtrContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#ptr}.
	 * @param ctx the parse tree
	 */
	void exitPtr(asm8086Parser.PtrContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#dollar}.
	 * @param ctx the parse tree
	 */
	void enterDollar(asm8086Parser.DollarContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#dollar}.
	 * @param ctx the parse tree
	 */
	void exitDollar(asm8086Parser.DollarContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(asm8086Parser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(asm8086Parser.RegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(asm8086Parser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(asm8086Parser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(asm8086Parser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(asm8086Parser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(asm8086Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(asm8086Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#opcode}.
	 * @param ctx the parse tree
	 */
	void enterOpcode(asm8086Parser.OpcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#opcode}.
	 * @param ctx the parse tree
	 */
	void exitOpcode(asm8086Parser.OpcodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#rep}.
	 * @param ctx the parse tree
	 */
	void enterRep(asm8086Parser.RepContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#rep}.
	 * @param ctx the parse tree
	 */
	void exitRep(asm8086Parser.RepContext ctx);
	/**
	 * Enter a parse tree produced by {@link asm8086Parser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(asm8086Parser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link asm8086Parser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(asm8086Parser.CommentContext ctx);
}