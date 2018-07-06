// Generated from snobol/snobol.g4 by ANTLR 4.7.1
package parsers.snobol;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link snobolParser}.
 */
public interface snobolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link snobolParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(snobolParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(snobolParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#lin}.
	 * @param ctx the parse tree
	 */
	void enterLin(snobolParser.LinContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#lin}.
	 * @param ctx the parse tree
	 */
	void exitLin(snobolParser.LinContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(snobolParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(snobolParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(snobolParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(snobolParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(snobolParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(snobolParser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(snobolParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(snobolParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(snobolParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(snobolParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingExpression(snobolParser.MultiplyingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#multiplyingExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingExpression(snobolParser.MultiplyingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowExpression(snobolParser.PowExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#powExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowExpression(snobolParser.PowExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(snobolParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(snobolParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(snobolParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(snobolParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(snobolParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(snobolParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#differ}.
	 * @param ctx the parse tree
	 */
	void enterDiffer(snobolParser.DifferContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#differ}.
	 * @param ctx the parse tree
	 */
	void exitDiffer(snobolParser.DifferContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#eq}.
	 * @param ctx the parse tree
	 */
	void enterEq(snobolParser.EqContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#eq}.
	 * @param ctx the parse tree
	 */
	void exitEq(snobolParser.EqContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#ne}.
	 * @param ctx the parse tree
	 */
	void enterNe(snobolParser.NeContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#ne}.
	 * @param ctx the parse tree
	 */
	void exitNe(snobolParser.NeContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#ge}.
	 * @param ctx the parse tree
	 */
	void enterGe(snobolParser.GeContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#ge}.
	 * @param ctx the parse tree
	 */
	void exitGe(snobolParser.GeContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#gt}.
	 * @param ctx the parse tree
	 */
	void enterGt(snobolParser.GtContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#gt}.
	 * @param ctx the parse tree
	 */
	void exitGt(snobolParser.GtContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#le}.
	 * @param ctx the parse tree
	 */
	void enterLe(snobolParser.LeContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#le}.
	 * @param ctx the parse tree
	 */
	void exitLe(snobolParser.LeContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#lt}.
	 * @param ctx the parse tree
	 */
	void enterLt(snobolParser.LtContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#lt}.
	 * @param ctx the parse tree
	 */
	void exitLt(snobolParser.LtContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(snobolParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(snobolParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#lgt}.
	 * @param ctx the parse tree
	 */
	void enterLgt(snobolParser.LgtContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#lgt}.
	 * @param ctx the parse tree
	 */
	void exitLgt(snobolParser.LgtContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#atan}.
	 * @param ctx the parse tree
	 */
	void enterAtan(snobolParser.AtanContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#atan}.
	 * @param ctx the parse tree
	 */
	void exitAtan(snobolParser.AtanContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#chop}.
	 * @param ctx the parse tree
	 */
	void enterChop(snobolParser.ChopContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#chop}.
	 * @param ctx the parse tree
	 */
	void exitChop(snobolParser.ChopContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#cos}.
	 * @param ctx the parse tree
	 */
	void enterCos(snobolParser.CosContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#cos}.
	 * @param ctx the parse tree
	 */
	void exitCos(snobolParser.CosContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(snobolParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(snobolParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#ln}.
	 * @param ctx the parse tree
	 */
	void enterLn(snobolParser.LnContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#ln}.
	 * @param ctx the parse tree
	 */
	void exitLn(snobolParser.LnContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#remdr}.
	 * @param ctx the parse tree
	 */
	void enterRemdr(snobolParser.RemdrContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#remdr}.
	 * @param ctx the parse tree
	 */
	void exitRemdr(snobolParser.RemdrContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#sin}.
	 * @param ctx the parse tree
	 */
	void enterSin(snobolParser.SinContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#sin}.
	 * @param ctx the parse tree
	 */
	void exitSin(snobolParser.SinContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#tan}.
	 * @param ctx the parse tree
	 */
	void enterTan(snobolParser.TanContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#tan}.
	 * @param ctx the parse tree
	 */
	void exitTan(snobolParser.TanContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#dupl}.
	 * @param ctx the parse tree
	 */
	void enterDupl(snobolParser.DuplContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#dupl}.
	 * @param ctx the parse tree
	 */
	void exitDupl(snobolParser.DuplContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#reverse}.
	 * @param ctx the parse tree
	 */
	void enterReverse(snobolParser.ReverseContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#reverse}.
	 * @param ctx the parse tree
	 */
	void exitReverse(snobolParser.ReverseContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(snobolParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(snobolParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#replace}.
	 * @param ctx the parse tree
	 */
	void enterReplace(snobolParser.ReplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#replace}.
	 * @param ctx the parse tree
	 */
	void exitReplace(snobolParser.ReplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(snobolParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(snobolParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#trim}.
	 * @param ctx the parse tree
	 */
	void enterTrim(snobolParser.TrimContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#trim}.
	 * @param ctx the parse tree
	 */
	void exitTrim(snobolParser.TrimContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(snobolParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(snobolParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#convert}.
	 * @param ctx the parse tree
	 */
	void enterConvert(snobolParser.ConvertContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#convert}.
	 * @param ctx the parse tree
	 */
	void exitConvert(snobolParser.ConvertContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(snobolParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(snobolParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#sort}.
	 * @param ctx the parse tree
	 */
	void enterSort(snobolParser.SortContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#sort}.
	 * @param ctx the parse tree
	 */
	void exitSort(snobolParser.SortContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#break_}.
	 * @param ctx the parse tree
	 */
	void enterBreak_(snobolParser.Break_Context ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#break_}.
	 * @param ctx the parse tree
	 */
	void exitBreak_(snobolParser.Break_Context ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#transfer}.
	 * @param ctx the parse tree
	 */
	void enterTransfer(snobolParser.TransferContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#transfer}.
	 * @param ctx the parse tree
	 */
	void exitTransfer(snobolParser.TransferContext ctx);
	/**
	 * Enter a parse tree produced by {@link snobolParser#transferpre}.
	 * @param ctx the parse tree
	 */
	void enterTransferpre(snobolParser.TransferpreContext ctx);
	/**
	 * Exit a parse tree produced by {@link snobolParser#transferpre}.
	 * @param ctx the parse tree
	 */
	void exitTransferpre(snobolParser.TransferpreContext ctx);
}