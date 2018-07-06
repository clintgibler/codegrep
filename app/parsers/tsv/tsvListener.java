// Generated from tsv/tsv.g4 by ANTLR 4.7.1
package parsers.tsv;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tsvParser}.
 */
public interface tsvListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tsvParser#tsvFile}.
	 * @param ctx the parse tree
	 */
	void enterTsvFile(tsvParser.TsvFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsvParser#tsvFile}.
	 * @param ctx the parse tree
	 */
	void exitTsvFile(tsvParser.TsvFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsvParser#hdr}.
	 * @param ctx the parse tree
	 */
	void enterHdr(tsvParser.HdrContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsvParser#hdr}.
	 * @param ctx the parse tree
	 */
	void exitHdr(tsvParser.HdrContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsvParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(tsvParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsvParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(tsvParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link tsvParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(tsvParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link tsvParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(tsvParser.FieldContext ctx);
}