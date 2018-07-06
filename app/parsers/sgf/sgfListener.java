// Generated from sgf/sgf.g4 by ANTLR 4.7.1
package parsers.sgf;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sgfParser}.
 */
public interface sgfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sgfParser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(sgfParser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sgfParser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(sgfParser.CollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sgfParser#gameTree}.
	 * @param ctx the parse tree
	 */
	void enterGameTree(sgfParser.GameTreeContext ctx);
	/**
	 * Exit a parse tree produced by {@link sgfParser#gameTree}.
	 * @param ctx the parse tree
	 */
	void exitGameTree(sgfParser.GameTreeContext ctx);
	/**
	 * Enter a parse tree produced by {@link sgfParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(sgfParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link sgfParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(sgfParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link sgfParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(sgfParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link sgfParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(sgfParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link sgfParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(sgfParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link sgfParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(sgfParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link sgfParser#move}.
	 * @param ctx the parse tree
	 */
	void enterMove(sgfParser.MoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link sgfParser#move}.
	 * @param ctx the parse tree
	 */
	void exitMove(sgfParser.MoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link sgfParser#setup}.
	 * @param ctx the parse tree
	 */
	void enterSetup(sgfParser.SetupContext ctx);
	/**
	 * Exit a parse tree produced by {@link sgfParser#setup}.
	 * @param ctx the parse tree
	 */
	void exitSetup(sgfParser.SetupContext ctx);
	/**
	 * Enter a parse tree produced by {@link sgfParser#nodeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNodeAnnotation(sgfParser.NodeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sgfParser#nodeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNodeAnnotation(sgfParser.NodeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sgfParser#moveAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMoveAnnotation(sgfParser.MoveAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sgfParser#moveAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMoveAnnotation(sgfParser.MoveAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sgfParser#markup}.
	 * @param ctx the parse tree
	 */
	void enterMarkup(sgfParser.MarkupContext ctx);
	/**
	 * Exit a parse tree produced by {@link sgfParser#markup}.
	 * @param ctx the parse tree
	 */
	void exitMarkup(sgfParser.MarkupContext ctx);
	/**
	 * Enter a parse tree produced by {@link sgfParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(sgfParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link sgfParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(sgfParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link sgfParser#gameInfo}.
	 * @param ctx the parse tree
	 */
	void enterGameInfo(sgfParser.GameInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link sgfParser#gameInfo}.
	 * @param ctx the parse tree
	 */
	void exitGameInfo(sgfParser.GameInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link sgfParser#timing}.
	 * @param ctx the parse tree
	 */
	void enterTiming(sgfParser.TimingContext ctx);
	/**
	 * Exit a parse tree produced by {@link sgfParser#timing}.
	 * @param ctx the parse tree
	 */
	void exitTiming(sgfParser.TimingContext ctx);
	/**
	 * Enter a parse tree produced by {@link sgfParser#misc}.
	 * @param ctx the parse tree
	 */
	void enterMisc(sgfParser.MiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link sgfParser#misc}.
	 * @param ctx the parse tree
	 */
	void exitMisc(sgfParser.MiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link sgfParser#loa}.
	 * @param ctx the parse tree
	 */
	void enterLoa(sgfParser.LoaContext ctx);
	/**
	 * Exit a parse tree produced by {@link sgfParser#loa}.
	 * @param ctx the parse tree
	 */
	void exitLoa(sgfParser.LoaContext ctx);
	/**
	 * Enter a parse tree produced by {@link sgfParser#go}.
	 * @param ctx the parse tree
	 */
	void enterGo(sgfParser.GoContext ctx);
	/**
	 * Exit a parse tree produced by {@link sgfParser#go}.
	 * @param ctx the parse tree
	 */
	void exitGo(sgfParser.GoContext ctx);
	/**
	 * Enter a parse tree produced by {@link sgfParser#privateProp}.
	 * @param ctx the parse tree
	 */
	void enterPrivateProp(sgfParser.PrivatePropContext ctx);
	/**
	 * Exit a parse tree produced by {@link sgfParser#privateProp}.
	 * @param ctx the parse tree
	 */
	void exitPrivateProp(sgfParser.PrivatePropContext ctx);
}