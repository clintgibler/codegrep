// Generated from telephone/telephone.g4 by ANTLR 4.7.1
package parsers.telephone;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link telephoneParser}.
 */
public interface telephoneListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link telephoneParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(telephoneParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link telephoneParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(telephoneParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link telephoneParser#variation}.
	 * @param ctx the parse tree
	 */
	void enterVariation(telephoneParser.VariationContext ctx);
	/**
	 * Exit a parse tree produced by {@link telephoneParser#variation}.
	 * @param ctx the parse tree
	 */
	void exitVariation(telephoneParser.VariationContext ctx);
	/**
	 * Enter a parse tree produced by {@link telephoneParser#nanp}.
	 * @param ctx the parse tree
	 */
	void enterNanp(telephoneParser.NanpContext ctx);
	/**
	 * Exit a parse tree produced by {@link telephoneParser#nanp}.
	 * @param ctx the parse tree
	 */
	void exitNanp(telephoneParser.NanpContext ctx);
	/**
	 * Enter a parse tree produced by {@link telephoneParser#areacode}.
	 * @param ctx the parse tree
	 */
	void enterAreacode(telephoneParser.AreacodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link telephoneParser#areacode}.
	 * @param ctx the parse tree
	 */
	void exitAreacode(telephoneParser.AreacodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link telephoneParser#exchange}.
	 * @param ctx the parse tree
	 */
	void enterExchange(telephoneParser.ExchangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link telephoneParser#exchange}.
	 * @param ctx the parse tree
	 */
	void exitExchange(telephoneParser.ExchangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link telephoneParser#subscriber}.
	 * @param ctx the parse tree
	 */
	void enterSubscriber(telephoneParser.SubscriberContext ctx);
	/**
	 * Exit a parse tree produced by {@link telephoneParser#subscriber}.
	 * @param ctx the parse tree
	 */
	void exitSubscriber(telephoneParser.SubscriberContext ctx);
	/**
	 * Enter a parse tree produced by {@link telephoneParser#japan}.
	 * @param ctx the parse tree
	 */
	void enterJapan(telephoneParser.JapanContext ctx);
	/**
	 * Exit a parse tree produced by {@link telephoneParser#japan}.
	 * @param ctx the parse tree
	 */
	void exitJapan(telephoneParser.JapanContext ctx);
}