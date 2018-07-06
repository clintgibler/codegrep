// Generated from fen/fen.g4 by ANTLR 4.7.1
package parsers.fen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fenParser}.
 */
public interface fenListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fenParser#fen}.
	 * @param ctx the parse tree
	 */
	void enterFen(fenParser.FenContext ctx);
	/**
	 * Exit a parse tree produced by {@link fenParser#fen}.
	 * @param ctx the parse tree
	 */
	void exitFen(fenParser.FenContext ctx);
	/**
	 * Enter a parse tree produced by {@link fenParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(fenParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link fenParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(fenParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link fenParser#castling}.
	 * @param ctx the parse tree
	 */
	void enterCastling(fenParser.CastlingContext ctx);
	/**
	 * Exit a parse tree produced by {@link fenParser#castling}.
	 * @param ctx the parse tree
	 */
	void exitCastling(fenParser.CastlingContext ctx);
	/**
	 * Enter a parse tree produced by {@link fenParser#enpassant}.
	 * @param ctx the parse tree
	 */
	void enterEnpassant(fenParser.EnpassantContext ctx);
	/**
	 * Exit a parse tree produced by {@link fenParser#enpassant}.
	 * @param ctx the parse tree
	 */
	void exitEnpassant(fenParser.EnpassantContext ctx);
	/**
	 * Enter a parse tree produced by {@link fenParser#position}.
	 * @param ctx the parse tree
	 */
	void enterPosition(fenParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fenParser#position}.
	 * @param ctx the parse tree
	 */
	void exitPosition(fenParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fenParser#halfmoveclock}.
	 * @param ctx the parse tree
	 */
	void enterHalfmoveclock(fenParser.HalfmoveclockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fenParser#halfmoveclock}.
	 * @param ctx the parse tree
	 */
	void exitHalfmoveclock(fenParser.HalfmoveclockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fenParser#fullmoveclock}.
	 * @param ctx the parse tree
	 */
	void enterFullmoveclock(fenParser.FullmoveclockContext ctx);
	/**
	 * Exit a parse tree produced by {@link fenParser#fullmoveclock}.
	 * @param ctx the parse tree
	 */
	void exitFullmoveclock(fenParser.FullmoveclockContext ctx);
	/**
	 * Enter a parse tree produced by {@link fenParser#placement}.
	 * @param ctx the parse tree
	 */
	void enterPlacement(fenParser.PlacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link fenParser#placement}.
	 * @param ctx the parse tree
	 */
	void exitPlacement(fenParser.PlacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link fenParser#rank}.
	 * @param ctx the parse tree
	 */
	void enterRank(fenParser.RankContext ctx);
	/**
	 * Exit a parse tree produced by {@link fenParser#rank}.
	 * @param ctx the parse tree
	 */
	void exitRank(fenParser.RankContext ctx);
	/**
	 * Enter a parse tree produced by {@link fenParser#piece}.
	 * @param ctx the parse tree
	 */
	void enterPiece(fenParser.PieceContext ctx);
	/**
	 * Exit a parse tree produced by {@link fenParser#piece}.
	 * @param ctx the parse tree
	 */
	void exitPiece(fenParser.PieceContext ctx);
}