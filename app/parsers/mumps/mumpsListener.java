// Generated from mumps/mumps.g4 by ANTLR 4.7.1
package parsers.mumps;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mumpsParser}.
 */
public interface mumpsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mumpsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(mumpsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(mumpsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#eof}.
	 * @param ctx the parse tree
	 */
	void enterEof(mumpsParser.EofContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#eof}.
	 * @param ctx the parse tree
	 */
	void exitEof(mumpsParser.EofContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(mumpsParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(mumpsParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(mumpsParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(mumpsParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(mumpsParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(mumpsParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#routinedecl}.
	 * @param ctx the parse tree
	 */
	void enterRoutinedecl(mumpsParser.RoutinedeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#routinedecl}.
	 * @param ctx the parse tree
	 */
	void exitRoutinedecl(mumpsParser.RoutinedeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(mumpsParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(mumpsParser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(mumpsParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(mumpsParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#subproc}.
	 * @param ctx the parse tree
	 */
	void enterSubproc(mumpsParser.SubprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#subproc}.
	 * @param ctx the parse tree
	 */
	void exitSubproc(mumpsParser.SubprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(mumpsParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(mumpsParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#postcondition}.
	 * @param ctx the parse tree
	 */
	void enterPostcondition(mumpsParser.PostconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#postcondition}.
	 * @param ctx the parse tree
	 */
	void exitPostcondition(mumpsParser.PostconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(mumpsParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(mumpsParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(mumpsParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(mumpsParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(mumpsParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(mumpsParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(mumpsParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(mumpsParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(mumpsParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(mumpsParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#break_}.
	 * @param ctx the parse tree
	 */
	void enterBreak_(mumpsParser.Break_Context ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#break_}.
	 * @param ctx the parse tree
	 */
	void exitBreak_(mumpsParser.Break_Context ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#do_}.
	 * @param ctx the parse tree
	 */
	void enterDo_(mumpsParser.Do_Context ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#do_}.
	 * @param ctx the parse tree
	 */
	void exitDo_(mumpsParser.Do_Context ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#for_}.
	 * @param ctx the parse tree
	 */
	void enterFor_(mumpsParser.For_Context ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#for_}.
	 * @param ctx the parse tree
	 */
	void exitFor_(mumpsParser.For_Context ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#halt_}.
	 * @param ctx the parse tree
	 */
	void enterHalt_(mumpsParser.Halt_Context ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#halt_}.
	 * @param ctx the parse tree
	 */
	void exitHalt_(mumpsParser.Halt_Context ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#hang_}.
	 * @param ctx the parse tree
	 */
	void enterHang_(mumpsParser.Hang_Context ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#hang_}.
	 * @param ctx the parse tree
	 */
	void exitHang_(mumpsParser.Hang_Context ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#if_}.
	 * @param ctx the parse tree
	 */
	void enterIf_(mumpsParser.If_Context ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#if_}.
	 * @param ctx the parse tree
	 */
	void exitIf_(mumpsParser.If_Context ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#kill_}.
	 * @param ctx the parse tree
	 */
	void enterKill_(mumpsParser.Kill_Context ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#kill_}.
	 * @param ctx the parse tree
	 */
	void exitKill_(mumpsParser.Kill_Context ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#merge_}.
	 * @param ctx the parse tree
	 */
	void enterMerge_(mumpsParser.Merge_Context ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#merge_}.
	 * @param ctx the parse tree
	 */
	void exitMerge_(mumpsParser.Merge_Context ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#new_}.
	 * @param ctx the parse tree
	 */
	void enterNew_(mumpsParser.New_Context ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#new_}.
	 * @param ctx the parse tree
	 */
	void exitNew_(mumpsParser.New_Context ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#quit_}.
	 * @param ctx the parse tree
	 */
	void enterQuit_(mumpsParser.Quit_Context ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#quit_}.
	 * @param ctx the parse tree
	 */
	void exitQuit_(mumpsParser.Quit_Context ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#read_}.
	 * @param ctx the parse tree
	 */
	void enterRead_(mumpsParser.Read_Context ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#read_}.
	 * @param ctx the parse tree
	 */
	void exitRead_(mumpsParser.Read_Context ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#set_}.
	 * @param ctx the parse tree
	 */
	void enterSet_(mumpsParser.Set_Context ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#set_}.
	 * @param ctx the parse tree
	 */
	void exitSet_(mumpsParser.Set_Context ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#view_}.
	 * @param ctx the parse tree
	 */
	void enterView_(mumpsParser.View_Context ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#view_}.
	 * @param ctx the parse tree
	 */
	void exitView_(mumpsParser.View_Context ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#write_}.
	 * @param ctx the parse tree
	 */
	void enterWrite_(mumpsParser.Write_Context ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#write_}.
	 * @param ctx the parse tree
	 */
	void exitWrite_(mumpsParser.Write_Context ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#xecute_}.
	 * @param ctx the parse tree
	 */
	void enterXecute_(mumpsParser.Xecute_Context ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#xecute_}.
	 * @param ctx the parse tree
	 */
	void exitXecute_(mumpsParser.Xecute_Context ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(mumpsParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(mumpsParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#arglist}.
	 * @param ctx the parse tree
	 */
	void enterArglist(mumpsParser.ArglistContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#arglist}.
	 * @param ctx the parse tree
	 */
	void exitArglist(mumpsParser.ArglistContext ctx);
	/**
	 * Enter a parse tree produced by {@link mumpsParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(mumpsParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link mumpsParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(mumpsParser.ArgContext ctx);
}