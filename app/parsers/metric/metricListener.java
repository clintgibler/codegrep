// Generated from metric/metric.g4 by ANTLR 4.7.1
package parsers.metric;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link metricParser}.
 */
public interface metricListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link metricParser#uom}.
	 * @param ctx the parse tree
	 */
	void enterUom(metricParser.UomContext ctx);
	/**
	 * Exit a parse tree produced by {@link metricParser#uom}.
	 * @param ctx the parse tree
	 */
	void exitUom(metricParser.UomContext ctx);
	/**
	 * Enter a parse tree produced by {@link metricParser#measure}.
	 * @param ctx the parse tree
	 */
	void enterMeasure(metricParser.MeasureContext ctx);
	/**
	 * Exit a parse tree produced by {@link metricParser#measure}.
	 * @param ctx the parse tree
	 */
	void exitMeasure(metricParser.MeasureContext ctx);
	/**
	 * Enter a parse tree produced by {@link metricParser#exponent}.
	 * @param ctx the parse tree
	 */
	void enterExponent(metricParser.ExponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link metricParser#exponent}.
	 * @param ctx the parse tree
	 */
	void exitExponent(metricParser.ExponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link metricParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(metricParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link metricParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(metricParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link metricParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(metricParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link metricParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(metricParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link metricParser#baseunit}.
	 * @param ctx the parse tree
	 */
	void enterBaseunit(metricParser.BaseunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link metricParser#baseunit}.
	 * @param ctx the parse tree
	 */
	void exitBaseunit(metricParser.BaseunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link metricParser#derivedunit}.
	 * @param ctx the parse tree
	 */
	void enterDerivedunit(metricParser.DerivedunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link metricParser#derivedunit}.
	 * @param ctx the parse tree
	 */
	void exitDerivedunit(metricParser.DerivedunitContext ctx);
}