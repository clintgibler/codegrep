// Generated from databank/databank.g4 by ANTLR 4.7.1
package parsers.databank;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link databankParser}.
 */
public interface databankListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link databankParser#databank}.
	 * @param ctx the parse tree
	 */
	void enterDatabank(databankParser.DatabankContext ctx);
	/**
	 * Exit a parse tree produced by {@link databankParser#databank}.
	 * @param ctx the parse tree
	 */
	void exitDatabank(databankParser.DatabankContext ctx);
	/**
	 * Enter a parse tree produced by {@link databankParser#datedseries}.
	 * @param ctx the parse tree
	 */
	void enterDatedseries(databankParser.DatedseriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link databankParser#datedseries}.
	 * @param ctx the parse tree
	 */
	void exitDatedseries(databankParser.DatedseriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link databankParser#undatedseries}.
	 * @param ctx the parse tree
	 */
	void enterUndatedseries(databankParser.UndatedseriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link databankParser#undatedseries}.
	 * @param ctx the parse tree
	 */
	void exitUndatedseries(databankParser.UndatedseriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link databankParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(databankParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link databankParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(databankParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link databankParser#dateline}.
	 * @param ctx the parse tree
	 */
	void enterDateline(databankParser.DatelineContext ctx);
	/**
	 * Exit a parse tree produced by {@link databankParser#dateline}.
	 * @param ctx the parse tree
	 */
	void exitDateline(databankParser.DatelineContext ctx);
	/**
	 * Enter a parse tree produced by {@link databankParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(databankParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link databankParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(databankParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by {@link databankParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(databankParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link databankParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(databankParser.NumberContext ctx);
}