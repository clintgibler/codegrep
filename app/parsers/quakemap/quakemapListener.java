// Generated from quakemap/quakemap.g4 by ANTLR 4.7.1
package parsers.quakemap;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link quakemapParser}.
 */
public interface quakemapListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link quakemapParser#map}.
	 * @param ctx the parse tree
	 */
	void enterMap(quakemapParser.MapContext ctx);
	/**
	 * Exit a parse tree produced by {@link quakemapParser#map}.
	 * @param ctx the parse tree
	 */
	void exitMap(quakemapParser.MapContext ctx);
	/**
	 * Enter a parse tree produced by {@link quakemapParser#entity}.
	 * @param ctx the parse tree
	 */
	void enterEntity(quakemapParser.EntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link quakemapParser#entity}.
	 * @param ctx the parse tree
	 */
	void exitEntity(quakemapParser.EntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link quakemapParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void enterKeyvalue(quakemapParser.KeyvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link quakemapParser#keyvalue}.
	 * @param ctx the parse tree
	 */
	void exitKeyvalue(quakemapParser.KeyvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link quakemapParser#brush}.
	 * @param ctx the parse tree
	 */
	void enterBrush(quakemapParser.BrushContext ctx);
	/**
	 * Exit a parse tree produced by {@link quakemapParser#brush}.
	 * @param ctx the parse tree
	 */
	void exitBrush(quakemapParser.BrushContext ctx);
	/**
	 * Enter a parse tree produced by {@link quakemapParser#brushline}.
	 * @param ctx the parse tree
	 */
	void enterBrushline(quakemapParser.BrushlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link quakemapParser#brushline}.
	 * @param ctx the parse tree
	 */
	void exitBrushline(quakemapParser.BrushlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link quakemapParser#coord}.
	 * @param ctx the parse tree
	 */
	void enterCoord(quakemapParser.CoordContext ctx);
	/**
	 * Exit a parse tree produced by {@link quakemapParser#coord}.
	 * @param ctx the parse tree
	 */
	void exitCoord(quakemapParser.CoordContext ctx);
	/**
	 * Enter a parse tree produced by {@link quakemapParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(quakemapParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link quakemapParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(quakemapParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link quakemapParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(quakemapParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link quakemapParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(quakemapParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link quakemapParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(quakemapParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link quakemapParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(quakemapParser.TextContext ctx);
}