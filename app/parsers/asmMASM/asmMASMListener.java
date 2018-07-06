// Generated from asmMASM/asmMASM.g4 by ANTLR 4.7.1
package parsers.asmMASM;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link asmMASMParser}.
 */
public interface asmMASMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(asmMASMParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(asmMASMParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(asmMASMParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(asmMASMParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(asmMASMParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(asmMASMParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#lbl}.
	 * @param ctx the parse tree
	 */
	void enterLbl(asmMASMParser.LblContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#lbl}.
	 * @param ctx the parse tree
	 */
	void exitLbl(asmMASMParser.LblContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#assemblerdirective}.
	 * @param ctx the parse tree
	 */
	void enterAssemblerdirective(asmMASMParser.AssemblerdirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#assemblerdirective}.
	 * @param ctx the parse tree
	 */
	void exitAssemblerdirective(asmMASMParser.AssemblerdirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#masmdirectives}.
	 * @param ctx the parse tree
	 */
	void enterMasmdirectives(asmMASMParser.MasmdirectivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#masmdirectives}.
	 * @param ctx the parse tree
	 */
	void exitMasmdirectives(asmMASMParser.MasmdirectivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#masmdirective}.
	 * @param ctx the parse tree
	 */
	void enterMasmdirective(asmMASMParser.MasmdirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#masmdirective}.
	 * @param ctx the parse tree
	 */
	void exitMasmdirective(asmMASMParser.MasmdirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#assume}.
	 * @param ctx the parse tree
	 */
	void enterAssume(asmMASMParser.AssumeContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#assume}.
	 * @param ctx the parse tree
	 */
	void exitAssume(asmMASMParser.AssumeContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#label_}.
	 * @param ctx the parse tree
	 */
	void enterLabel_(asmMASMParser.Label_Context ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#label_}.
	 * @param ctx the parse tree
	 */
	void exitLabel_(asmMASMParser.Label_Context ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(asmMASMParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(asmMASMParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(asmMASMParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(asmMASMParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#segment}.
	 * @param ctx the parse tree
	 */
	void enterSegment(asmMASMParser.SegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#segment}.
	 * @param ctx the parse tree
	 */
	void exitSegment(asmMASMParser.SegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#endsegment}.
	 * @param ctx the parse tree
	 */
	void enterEndsegment(asmMASMParser.EndsegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#endsegment}.
	 * @param ctx the parse tree
	 */
	void exitEndsegment(asmMASMParser.EndsegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#align}.
	 * @param ctx the parse tree
	 */
	void enterAlign(asmMASMParser.AlignContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#align}.
	 * @param ctx the parse tree
	 */
	void exitAlign(asmMASMParser.AlignContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(asmMASMParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(asmMASMParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#put}.
	 * @param ctx the parse tree
	 */
	void enterPut(asmMASMParser.PutContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#put}.
	 * @param ctx the parse tree
	 */
	void exitPut(asmMASMParser.PutContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#ds}.
	 * @param ctx the parse tree
	 */
	void enterDs(asmMASMParser.DsContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#ds}.
	 * @param ctx the parse tree
	 */
	void exitDs(asmMASMParser.DsContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#dw}.
	 * @param ctx the parse tree
	 */
	void enterDw(asmMASMParser.DwContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#dw}.
	 * @param ctx the parse tree
	 */
	void exitDw(asmMASMParser.DwContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#db}.
	 * @param ctx the parse tree
	 */
	void enterDb(asmMASMParser.DbContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#db}.
	 * @param ctx the parse tree
	 */
	void exitDb(asmMASMParser.DbContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#dm}.
	 * @param ctx the parse tree
	 */
	void enterDm(asmMASMParser.DmContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#dm}.
	 * @param ctx the parse tree
	 */
	void exitDm(asmMASMParser.DmContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#dup}.
	 * @param ctx the parse tree
	 */
	void enterDup(asmMASMParser.DupContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#dup}.
	 * @param ctx the parse tree
	 */
	void exitDup(asmMASMParser.DupContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#equ}.
	 * @param ctx the parse tree
	 */
	void enterEqu(asmMASMParser.EquContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#equ}.
	 * @param ctx the parse tree
	 */
	void exitEqu(asmMASMParser.EquContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#extern}.
	 * @param ctx the parse tree
	 */
	void enterExtern(asmMASMParser.ExternContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#extern}.
	 * @param ctx the parse tree
	 */
	void exitExtern(asmMASMParser.ExternContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(asmMASMParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(asmMASMParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#endif}.
	 * @param ctx the parse tree
	 */
	void enterEndif(asmMASMParser.EndifContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#endif}.
	 * @param ctx the parse tree
	 */
	void exitEndif(asmMASMParser.EndifContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#org}.
	 * @param ctx the parse tree
	 */
	void enterOrg(asmMASMParser.OrgContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#org}.
	 * @param ctx the parse tree
	 */
	void exitOrg(asmMASMParser.OrgContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void enterExpressionlist(asmMASMParser.ExpressionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void exitExpressionlist(asmMASMParser.ExpressionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(asmMASMParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(asmMASMParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(asmMASMParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(asmMASMParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(asmMASMParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(asmMASMParser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(asmMASMParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(asmMASMParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#gross}.
	 * @param ctx the parse tree
	 */
	void enterGross(asmMASMParser.GrossContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#gross}.
	 * @param ctx the parse tree
	 */
	void exitGross(asmMASMParser.GrossContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#grossrawassemblerdirective}.
	 * @param ctx the parse tree
	 */
	void enterGrossrawassemblerdirective(asmMASMParser.GrossrawassemblerdirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#grossrawassemblerdirective}.
	 * @param ctx the parse tree
	 */
	void exitGrossrawassemblerdirective(asmMASMParser.GrossrawassemblerdirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#dollar}.
	 * @param ctx the parse tree
	 */
	void enterDollar(asmMASMParser.DollarContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#dollar}.
	 * @param ctx the parse tree
	 */
	void exitDollar(asmMASMParser.DollarContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#ques}.
	 * @param ctx the parse tree
	 */
	void enterQues(asmMASMParser.QuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#ques}.
	 * @param ctx the parse tree
	 */
	void exitQues(asmMASMParser.QuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(asmMASMParser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(asmMASMParser.RegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(asmMASMParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(asmMASMParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(asmMASMParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(asmMASMParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(asmMASMParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(asmMASMParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#opcode}.
	 * @param ctx the parse tree
	 */
	void enterOpcode(asmMASMParser.OpcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#opcode}.
	 * @param ctx the parse tree
	 */
	void exitOpcode(asmMASMParser.OpcodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#rep}.
	 * @param ctx the parse tree
	 */
	void enterRep(asmMASMParser.RepContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#rep}.
	 * @param ctx the parse tree
	 */
	void exitRep(asmMASMParser.RepContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmMASMParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(asmMASMParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmMASMParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(asmMASMParser.CommentContext ctx);
}