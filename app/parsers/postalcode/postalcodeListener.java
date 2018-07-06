// Generated from postalcode/postalcode.g4 by ANTLR 4.7.1
package parsers.postalcode;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link postalcodeParser}.
 */
public interface postalcodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link postalcodeParser#postalcode}.
	 * @param ctx the parse tree
	 */
	void enterPostalcode(postalcodeParser.PostalcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link postalcodeParser#postalcode}.
	 * @param ctx the parse tree
	 */
	void exitPostalcode(postalcodeParser.PostalcodeContext ctx);
}