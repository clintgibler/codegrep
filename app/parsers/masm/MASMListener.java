// Generated from masm/MASM.g4 by ANTLR 4.7.1
package parsers.masm;
 
 	 package com.Ostermiller.Syntax;
 	 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MASMParser}.
 */
public interface MASMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MASMParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(MASMParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(MASMParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#segments}.
	 * @param ctx the parse tree
	 */
	void enterSegments(MASMParser.SegmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#segments}.
	 * @param ctx the parse tree
	 */
	void exitSegments(MASMParser.SegmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#proc}.
	 * @param ctx the parse tree
	 */
	void enterProc(MASMParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#proc}.
	 * @param ctx the parse tree
	 */
	void exitProc(MASMParser.ProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(MASMParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(MASMParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#binary_exp1}.
	 * @param ctx the parse tree
	 */
	void enterBinary_exp1(MASMParser.Binary_exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#binary_exp1}.
	 * @param ctx the parse tree
	 */
	void exitBinary_exp1(MASMParser.Binary_exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#unuary_exp1}.
	 * @param ctx the parse tree
	 */
	void enterUnuary_exp1(MASMParser.Unuary_exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#unuary_exp1}.
	 * @param ctx the parse tree
	 */
	void exitUnuary_exp1(MASMParser.Unuary_exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#unuary_exp2}.
	 * @param ctx the parse tree
	 */
	void enterUnuary_exp2(MASMParser.Unuary_exp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#unuary_exp2}.
	 * @param ctx the parse tree
	 */
	void exitUnuary_exp2(MASMParser.Unuary_exp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#binary_exp2}.
	 * @param ctx the parse tree
	 */
	void enterBinary_exp2(MASMParser.Binary_exp2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#binary_exp2}.
	 * @param ctx the parse tree
	 */
	void exitBinary_exp2(MASMParser.Binary_exp2Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#notarguments}.
	 * @param ctx the parse tree
	 */
	void enterNotarguments(MASMParser.NotargumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#notarguments}.
	 * @param ctx the parse tree
	 */
	void exitNotarguments(MASMParser.NotargumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#binary_exp3}.
	 * @param ctx the parse tree
	 */
	void enterBinary_exp3(MASMParser.Binary_exp3Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#binary_exp3}.
	 * @param ctx the parse tree
	 */
	void exitBinary_exp3(MASMParser.Binary_exp3Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#unuary_exp3}.
	 * @param ctx the parse tree
	 */
	void enterUnuary_exp3(MASMParser.Unuary_exp3Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#unuary_exp3}.
	 * @param ctx the parse tree
	 */
	void exitUnuary_exp3(MASMParser.Unuary_exp3Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#binary_exp4}.
	 * @param ctx the parse tree
	 */
	void enterBinary_exp4(MASMParser.Binary_exp4Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#binary_exp4}.
	 * @param ctx the parse tree
	 */
	void exitBinary_exp4(MASMParser.Binary_exp4Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#binary_exp5}.
	 * @param ctx the parse tree
	 */
	void enterBinary_exp5(MASMParser.Binary_exp5Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#binary_exp5}.
	 * @param ctx the parse tree
	 */
	void exitBinary_exp5(MASMParser.Binary_exp5Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#binary_exp6}.
	 * @param ctx the parse tree
	 */
	void enterBinary_exp6(MASMParser.Binary_exp6Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#binary_exp6}.
	 * @param ctx the parse tree
	 */
	void exitBinary_exp6(MASMParser.Binary_exp6Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#binary_exp7}.
	 * @param ctx the parse tree
	 */
	void enterBinary_exp7(MASMParser.Binary_exp7Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#binary_exp7}.
	 * @param ctx the parse tree
	 */
	void exitBinary_exp7(MASMParser.Binary_exp7Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#binary_exp8}.
	 * @param ctx the parse tree
	 */
	void enterBinary_exp8(MASMParser.Binary_exp8Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#binary_exp8}.
	 * @param ctx the parse tree
	 */
	void exitBinary_exp8(MASMParser.Binary_exp8Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#binary_exp9}.
	 * @param ctx the parse tree
	 */
	void enterBinary_exp9(MASMParser.Binary_exp9Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#binary_exp9}.
	 * @param ctx the parse tree
	 */
	void exitBinary_exp9(MASMParser.Binary_exp9Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#unuary_exp4}.
	 * @param ctx the parse tree
	 */
	void enterUnuary_exp4(MASMParser.Unuary_exp4Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#unuary_exp4}.
	 * @param ctx the parse tree
	 */
	void exitUnuary_exp4(MASMParser.Unuary_exp4Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#unuary_exp5}.
	 * @param ctx the parse tree
	 */
	void enterUnuary_exp5(MASMParser.Unuary_exp5Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#unuary_exp5}.
	 * @param ctx the parse tree
	 */
	void exitUnuary_exp5(MASMParser.Unuary_exp5Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#binary_exp10}.
	 * @param ctx the parse tree
	 */
	void enterBinary_exp10(MASMParser.Binary_exp10Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#binary_exp10}.
	 * @param ctx the parse tree
	 */
	void exitBinary_exp10(MASMParser.Binary_exp10Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#binary_exp11}.
	 * @param ctx the parse tree
	 */
	void enterBinary_exp11(MASMParser.Binary_exp11Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#binary_exp11}.
	 * @param ctx the parse tree
	 */
	void exitBinary_exp11(MASMParser.Binary_exp11Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#binary_exp12}.
	 * @param ctx the parse tree
	 */
	void enterBinary_exp12(MASMParser.Binary_exp12Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#binary_exp12}.
	 * @param ctx the parse tree
	 */
	void exitBinary_exp12(MASMParser.Binary_exp12Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#directive_exp1}.
	 * @param ctx the parse tree
	 */
	void enterDirective_exp1(MASMParser.Directive_exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#directive_exp1}.
	 * @param ctx the parse tree
	 */
	void exitDirective_exp1(MASMParser.Directive_exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariabledeclaration(MASMParser.VariabledeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#variabledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariabledeclaration(MASMParser.VariabledeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#memory}.
	 * @param ctx the parse tree
	 */
	void enterMemory(MASMParser.MemoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#memory}.
	 * @param ctx the parse tree
	 */
	void exitMemory(MASMParser.MemoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#segmentos}.
	 * @param ctx the parse tree
	 */
	void enterSegmentos(MASMParser.SegmentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#segmentos}.
	 * @param ctx the parse tree
	 */
	void exitSegmentos(MASMParser.SegmentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(MASMParser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(MASMParser.RegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#o}.
	 * @param ctx the parse tree
	 */
	void enterO(MASMParser.OContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#o}.
	 * @param ctx the parse tree
	 */
	void exitO(MASMParser.OContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(MASMParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(MASMParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#ope}.
	 * @param ctx the parse tree
	 */
	void enterOpe(MASMParser.OpeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#ope}.
	 * @param ctx the parse tree
	 */
	void exitOpe(MASMParser.OpeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#oper}.
	 * @param ctx the parse tree
	 */
	void enterOper(MASMParser.OperContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#oper}.
	 * @param ctx the parse tree
	 */
	void exitOper(MASMParser.OperContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#opera}.
	 * @param ctx the parse tree
	 */
	void enterOpera(MASMParser.OperaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#opera}.
	 * @param ctx the parse tree
	 */
	void exitOpera(MASMParser.OperaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#operat}.
	 * @param ctx the parse tree
	 */
	void enterOperat(MASMParser.OperatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#operat}.
	 * @param ctx the parse tree
	 */
	void exitOperat(MASMParser.OperatContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#operato}.
	 * @param ctx the parse tree
	 */
	void enterOperato(MASMParser.OperatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#operato}.
	 * @param ctx the parse tree
	 */
	void exitOperato(MASMParser.OperatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(MASMParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(MASMParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#l}.
	 * @param ctx the parse tree
	 */
	void enterL(MASMParser.LContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#l}.
	 * @param ctx the parse tree
	 */
	void exitL(MASMParser.LContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#x}.
	 * @param ctx the parse tree
	 */
	void enterX(MASMParser.XContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#x}.
	 * @param ctx the parse tree
	 */
	void exitX(MASMParser.XContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(MASMParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(MASMParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#sh}.
	 * @param ctx the parse tree
	 */
	void enterSh(MASMParser.ShContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#sh}.
	 * @param ctx the parse tree
	 */
	void exitSh(MASMParser.ShContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#b}.
	 * @param ctx the parse tree
	 */
	void enterB(MASMParser.BContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#b}.
	 * @param ctx the parse tree
	 */
	void exitB(MASMParser.BContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(MASMParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(MASMParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#interruption}.
	 * @param ctx the parse tree
	 */
	void enterInterruption(MASMParser.InterruptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#interruption}.
	 * @param ctx the parse tree
	 */
	void exitInterruption(MASMParser.InterruptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#in}.
	 * @param ctx the parse tree
	 */
	void enterIn(MASMParser.InContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#in}.
	 * @param ctx the parse tree
	 */
	void exitIn(MASMParser.InContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#out}.
	 * @param ctx the parse tree
	 */
	void enterOut(MASMParser.OutContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#out}.
	 * @param ctx the parse tree
	 */
	void exitOut(MASMParser.OutContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#re}.
	 * @param ctx the parse tree
	 */
	void enterRe(MASMParser.ReContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#re}.
	 * @param ctx the parse tree
	 */
	void exitRe(MASMParser.ReContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#directives}.
	 * @param ctx the parse tree
	 */
	void enterDirectives(MASMParser.DirectivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#directives}.
	 * @param ctx the parse tree
	 */
	void exitDirectives(MASMParser.DirectivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#ty}.
	 * @param ctx the parse tree
	 */
	void enterTy(MASMParser.TyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#ty}.
	 * @param ctx the parse tree
	 */
	void exitTy(MASMParser.TyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(MASMParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(MASMParser.QuestionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MASMParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(MASMParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MASMParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(MASMParser.TimeContext ctx);
}