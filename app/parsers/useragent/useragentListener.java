// Generated from useragent/useragent.g4 by ANTLR 4.7.1
package parsers.useragent;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link useragentParser}.
 */
public interface useragentListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link useragentParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(useragentParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link useragentParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(useragentParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link useragentParser#product}.
	 * @param ctx the parse tree
	 */
	void enterProduct(useragentParser.ProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link useragentParser#product}.
	 * @param ctx the parse tree
	 */
	void exitProduct(useragentParser.ProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link useragentParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(useragentParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link useragentParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(useragentParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link useragentParser#version}.
	 * @param ctx the parse tree
	 */
	void enterVersion(useragentParser.VersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link useragentParser#version}.
	 * @param ctx the parse tree
	 */
	void exitVersion(useragentParser.VersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link useragentParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(useragentParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link useragentParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(useragentParser.CommentContext ctx);
}