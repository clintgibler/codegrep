// Generated from clf/clf.g4 by ANTLR 4.7.1
package parsers.clf;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link clfParser}.
 */
public interface clfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link clfParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(clfParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link clfParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(clfParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link clfParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(clfParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link clfParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(clfParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link clfParser#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(clfParser.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link clfParser#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(clfParser.HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link clfParser#logname}.
	 * @param ctx the parse tree
	 */
	void enterLogname(clfParser.LognameContext ctx);
	/**
	 * Exit a parse tree produced by {@link clfParser#logname}.
	 * @param ctx the parse tree
	 */
	void exitLogname(clfParser.LognameContext ctx);
	/**
	 * Enter a parse tree produced by {@link clfParser#username}.
	 * @param ctx the parse tree
	 */
	void enterUsername(clfParser.UsernameContext ctx);
	/**
	 * Exit a parse tree produced by {@link clfParser#username}.
	 * @param ctx the parse tree
	 */
	void exitUsername(clfParser.UsernameContext ctx);
	/**
	 * Enter a parse tree produced by {@link clfParser#datetimetz}.
	 * @param ctx the parse tree
	 */
	void enterDatetimetz(clfParser.DatetimetzContext ctx);
	/**
	 * Exit a parse tree produced by {@link clfParser#datetimetz}.
	 * @param ctx the parse tree
	 */
	void exitDatetimetz(clfParser.DatetimetzContext ctx);
	/**
	 * Enter a parse tree produced by {@link clfParser#referer}.
	 * @param ctx the parse tree
	 */
	void enterReferer(clfParser.RefererContext ctx);
	/**
	 * Exit a parse tree produced by {@link clfParser#referer}.
	 * @param ctx the parse tree
	 */
	void exitReferer(clfParser.RefererContext ctx);
	/**
	 * Enter a parse tree produced by {@link clfParser#request}.
	 * @param ctx the parse tree
	 */
	void enterRequest(clfParser.RequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link clfParser#request}.
	 * @param ctx the parse tree
	 */
	void exitRequest(clfParser.RequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link clfParser#useragent}.
	 * @param ctx the parse tree
	 */
	void enterUseragent(clfParser.UseragentContext ctx);
	/**
	 * Exit a parse tree produced by {@link clfParser#useragent}.
	 * @param ctx the parse tree
	 */
	void exitUseragent(clfParser.UseragentContext ctx);
	/**
	 * Enter a parse tree produced by {@link clfParser#statuscode}.
	 * @param ctx the parse tree
	 */
	void enterStatuscode(clfParser.StatuscodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link clfParser#statuscode}.
	 * @param ctx the parse tree
	 */
	void exitStatuscode(clfParser.StatuscodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link clfParser#bytes}.
	 * @param ctx the parse tree
	 */
	void enterBytes(clfParser.BytesContext ctx);
	/**
	 * Exit a parse tree produced by {@link clfParser#bytes}.
	 * @param ctx the parse tree
	 */
	void exitBytes(clfParser.BytesContext ctx);
}