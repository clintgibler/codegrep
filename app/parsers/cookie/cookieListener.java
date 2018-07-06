// Generated from cookie/cookie.g4 by ANTLR 4.7.1
package parsers.cookie;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cookieParser}.
 */
public interface cookieListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cookieParser#cookie}.
	 * @param ctx the parse tree
	 */
	void enterCookie(cookieParser.CookieContext ctx);
	/**
	 * Exit a parse tree produced by {@link cookieParser#cookie}.
	 * @param ctx the parse tree
	 */
	void exitCookie(cookieParser.CookieContext ctx);
	/**
	 * Enter a parse tree produced by {@link cookieParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(cookieParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link cookieParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(cookieParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link cookieParser#av_pairs}.
	 * @param ctx the parse tree
	 */
	void enterAv_pairs(cookieParser.Av_pairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link cookieParser#av_pairs}.
	 * @param ctx the parse tree
	 */
	void exitAv_pairs(cookieParser.Av_pairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link cookieParser#av_pair}.
	 * @param ctx the parse tree
	 */
	void enterAv_pair(cookieParser.Av_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link cookieParser#av_pair}.
	 * @param ctx the parse tree
	 */
	void exitAv_pair(cookieParser.Av_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link cookieParser#attr}.
	 * @param ctx the parse tree
	 */
	void enterAttr(cookieParser.AttrContext ctx);
	/**
	 * Exit a parse tree produced by {@link cookieParser#attr}.
	 * @param ctx the parse tree
	 */
	void exitAttr(cookieParser.AttrContext ctx);
	/**
	 * Enter a parse tree produced by {@link cookieParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(cookieParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link cookieParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(cookieParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link cookieParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(cookieParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link cookieParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(cookieParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link cookieParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(cookieParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link cookieParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(cookieParser.TokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link cookieParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_string(cookieParser.Quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link cookieParser#quoted_string}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_string(cookieParser.Quoted_stringContext ctx);
}