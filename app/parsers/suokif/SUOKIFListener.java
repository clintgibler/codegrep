// Generated from suokif/SUOKIF.g4 by ANTLR 4.7.1
package parsers.suokif;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SUOKIFParser}.
 */
public interface SUOKIFListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SUOKIFParser#top_level}.
	 * @param ctx the parse tree
	 */
	void enterTop_level(SUOKIFParser.Top_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SUOKIFParser#top_level}.
	 * @param ctx the parse tree
	 */
	void exitTop_level(SUOKIFParser.Top_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SUOKIFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SUOKIFParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SUOKIFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SUOKIFParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SUOKIFParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(SUOKIFParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SUOKIFParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(SUOKIFParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SUOKIFParser#funterm}.
	 * @param ctx the parse tree
	 */
	void enterFunterm(SUOKIFParser.FuntermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SUOKIFParser#funterm}.
	 * @param ctx the parse tree
	 */
	void exitFunterm(SUOKIFParser.FuntermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SUOKIFParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(SUOKIFParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SUOKIFParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(SUOKIFParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SUOKIFParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(SUOKIFParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SUOKIFParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(SUOKIFParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SUOKIFParser#relsent}.
	 * @param ctx the parse tree
	 */
	void enterRelsent(SUOKIFParser.RelsentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SUOKIFParser#relsent}.
	 * @param ctx the parse tree
	 */
	void exitRelsent(SUOKIFParser.RelsentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SUOKIFParser#logsent}.
	 * @param ctx the parse tree
	 */
	void enterLogsent(SUOKIFParser.LogsentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SUOKIFParser#logsent}.
	 * @param ctx the parse tree
	 */
	void exitLogsent(SUOKIFParser.LogsentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SUOKIFParser#quantsent}.
	 * @param ctx the parse tree
	 */
	void enterQuantsent(SUOKIFParser.QuantsentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SUOKIFParser#quantsent}.
	 * @param ctx the parse tree
	 */
	void exitQuantsent(SUOKIFParser.QuantsentContext ctx);
}