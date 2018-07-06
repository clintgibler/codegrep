// Generated from pgn/PGN.g4 by ANTLR 4.7.1
package parsers.pgn;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PGNParser}.
 */
public interface PGNListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PGNParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(PGNParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(PGNParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#pgn_database}.
	 * @param ctx the parse tree
	 */
	void enterPgn_database(PGNParser.Pgn_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#pgn_database}.
	 * @param ctx the parse tree
	 */
	void exitPgn_database(PGNParser.Pgn_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#pgn_game}.
	 * @param ctx the parse tree
	 */
	void enterPgn_game(PGNParser.Pgn_gameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#pgn_game}.
	 * @param ctx the parse tree
	 */
	void exitPgn_game(PGNParser.Pgn_gameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#tag_section}.
	 * @param ctx the parse tree
	 */
	void enterTag_section(PGNParser.Tag_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#tag_section}.
	 * @param ctx the parse tree
	 */
	void exitTag_section(PGNParser.Tag_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#tag_pair}.
	 * @param ctx the parse tree
	 */
	void enterTag_pair(PGNParser.Tag_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#tag_pair}.
	 * @param ctx the parse tree
	 */
	void exitTag_pair(PGNParser.Tag_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#tag_name}.
	 * @param ctx the parse tree
	 */
	void enterTag_name(PGNParser.Tag_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#tag_name}.
	 * @param ctx the parse tree
	 */
	void exitTag_name(PGNParser.Tag_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#tag_value}.
	 * @param ctx the parse tree
	 */
	void enterTag_value(PGNParser.Tag_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#tag_value}.
	 * @param ctx the parse tree
	 */
	void exitTag_value(PGNParser.Tag_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#movetext_section}.
	 * @param ctx the parse tree
	 */
	void enterMovetext_section(PGNParser.Movetext_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#movetext_section}.
	 * @param ctx the parse tree
	 */
	void exitMovetext_section(PGNParser.Movetext_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#element_sequence}.
	 * @param ctx the parse tree
	 */
	void enterElement_sequence(PGNParser.Element_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#element_sequence}.
	 * @param ctx the parse tree
	 */
	void exitElement_sequence(PGNParser.Element_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(PGNParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(PGNParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#move_number_indication}.
	 * @param ctx the parse tree
	 */
	void enterMove_number_indication(PGNParser.Move_number_indicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#move_number_indication}.
	 * @param ctx the parse tree
	 */
	void exitMove_number_indication(PGNParser.Move_number_indicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#san_move}.
	 * @param ctx the parse tree
	 */
	void enterSan_move(PGNParser.San_moveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#san_move}.
	 * @param ctx the parse tree
	 */
	void exitSan_move(PGNParser.San_moveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#recursive_variation}.
	 * @param ctx the parse tree
	 */
	void enterRecursive_variation(PGNParser.Recursive_variationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#recursive_variation}.
	 * @param ctx the parse tree
	 */
	void exitRecursive_variation(PGNParser.Recursive_variationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PGNParser#game_termination}.
	 * @param ctx the parse tree
	 */
	void enterGame_termination(PGNParser.Game_terminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PGNParser#game_termination}.
	 * @param ctx the parse tree
	 */
	void exitGame_termination(PGNParser.Game_terminationContext ctx);
}