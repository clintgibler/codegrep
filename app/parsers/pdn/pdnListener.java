// Generated from pdn/pdn.g4 by ANTLR 4.7.1
package parsers.pdn;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pdnParser}.
 */
public interface pdnListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pdnParser#game}.
	 * @param ctx the parse tree
	 */
	void enterGame(pdnParser.GameContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdnParser#game}.
	 * @param ctx the parse tree
	 */
	void exitGame(pdnParser.GameContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdnParser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(pdnParser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdnParser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(pdnParser.TagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdnParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(pdnParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdnParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(pdnParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdnParser#moves}.
	 * @param ctx the parse tree
	 */
	void enterMoves(pdnParser.MovesContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdnParser#moves}.
	 * @param ctx the parse tree
	 */
	void exitMoves(pdnParser.MovesContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdnParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(pdnParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdnParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(pdnParser.MoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdnParser#movespec}.
	 * @param ctx the parse tree
	 */
	void enterMovespec(pdnParser.MovespecContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdnParser#movespec}.
	 * @param ctx the parse tree
	 */
	void exitMovespec(pdnParser.MovespecContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdnParser#movenum}.
	 * @param ctx the parse tree
	 */
	void enterMovenum(pdnParser.MovenumContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdnParser#movenum}.
	 * @param ctx the parse tree
	 */
	void exitMovenum(pdnParser.MovenumContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdnParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(pdnParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdnParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(pdnParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdnParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(pdnParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdnParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(pdnParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdnParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(pdnParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdnParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(pdnParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdnParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(pdnParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdnParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(pdnParser.NumberContext ctx);
}