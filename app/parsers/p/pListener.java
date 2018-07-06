// Generated from p/p.g4 by ANTLR 4.7.1
package parsers.p;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pParser}.
 */
public interface pListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(pParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link pParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(pParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link pParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(pParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link pParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(pParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link pParser#iterate}.
	 * @param ctx the parse tree
	 */
	void enterIterate(pParser.IterateContext ctx);
	/**
	 * Exit a parse tree produced by {@link pParser#iterate}.
	 * @param ctx the parse tree
	 */
	void exitIterate(pParser.IterateContext ctx);
	/**
	 * Enter a parse tree produced by {@link pParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(pParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link pParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(pParser.AtomContext ctx);
}