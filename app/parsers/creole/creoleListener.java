// Generated from creole/creole.g4 by ANTLR 4.7.1
package parsers.creole;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link creoleParser}.
 */
public interface creoleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link creoleParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(creoleParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(creoleParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link creoleParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(creoleParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(creoleParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link creoleParser#markup}.
	 * @param ctx the parse tree
	 */
	void enterMarkup(creoleParser.MarkupContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#markup}.
	 * @param ctx the parse tree
	 */
	void exitMarkup(creoleParser.MarkupContext ctx);
	/**
	 * Enter a parse tree produced by {@link creoleParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(creoleParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(creoleParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link creoleParser#bold}.
	 * @param ctx the parse tree
	 */
	void enterBold(creoleParser.BoldContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#bold}.
	 * @param ctx the parse tree
	 */
	void exitBold(creoleParser.BoldContext ctx);
	/**
	 * Enter a parse tree produced by {@link creoleParser#italics}.
	 * @param ctx the parse tree
	 */
	void enterItalics(creoleParser.ItalicsContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#italics}.
	 * @param ctx the parse tree
	 */
	void exitItalics(creoleParser.ItalicsContext ctx);
	/**
	 * Enter a parse tree produced by {@link creoleParser#href}.
	 * @param ctx the parse tree
	 */
	void enterHref(creoleParser.HrefContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#href}.
	 * @param ctx the parse tree
	 */
	void exitHref(creoleParser.HrefContext ctx);
	/**
	 * Enter a parse tree produced by {@link creoleParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(creoleParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(creoleParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link creoleParser#hline}.
	 * @param ctx the parse tree
	 */
	void enterHline(creoleParser.HlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#hline}.
	 * @param ctx the parse tree
	 */
	void exitHline(creoleParser.HlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link creoleParser#listitem}.
	 * @param ctx the parse tree
	 */
	void enterListitem(creoleParser.ListitemContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#listitem}.
	 * @param ctx the parse tree
	 */
	void exitListitem(creoleParser.ListitemContext ctx);
	/**
	 * Enter a parse tree produced by {@link creoleParser#tableheader}.
	 * @param ctx the parse tree
	 */
	void enterTableheader(creoleParser.TableheaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#tableheader}.
	 * @param ctx the parse tree
	 */
	void exitTableheader(creoleParser.TableheaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link creoleParser#tablerow}.
	 * @param ctx the parse tree
	 */
	void enterTablerow(creoleParser.TablerowContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#tablerow}.
	 * @param ctx the parse tree
	 */
	void exitTablerow(creoleParser.TablerowContext ctx);
	/**
	 * Enter a parse tree produced by {@link creoleParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(creoleParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(creoleParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link creoleParser#nowiki}.
	 * @param ctx the parse tree
	 */
	void enterNowiki(creoleParser.NowikiContext ctx);
	/**
	 * Exit a parse tree produced by {@link creoleParser#nowiki}.
	 * @param ctx the parse tree
	 */
	void exitNowiki(creoleParser.NowikiContext ctx);
}