// Generated from lcc/lcc.g4 by ANTLR 4.7.1
package parsers.lcc;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lccParser}.
 */
public interface lccListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lccParser#lcc}.
	 * @param ctx the parse tree
	 */
	void enterLcc(lccParser.LccContext ctx);
	/**
	 * Exit a parse tree produced by {@link lccParser#lcc}.
	 * @param ctx the parse tree
	 */
	void exitLcc(lccParser.LccContext ctx);
	/**
	 * Enter a parse tree produced by {@link lccParser#topic}.
	 * @param ctx the parse tree
	 */
	void enterTopic(lccParser.TopicContext ctx);
	/**
	 * Exit a parse tree produced by {@link lccParser#topic}.
	 * @param ctx the parse tree
	 */
	void exitTopic(lccParser.TopicContext ctx);
	/**
	 * Enter a parse tree produced by {@link lccParser#subtopic}.
	 * @param ctx the parse tree
	 */
	void enterSubtopic(lccParser.SubtopicContext ctx);
	/**
	 * Exit a parse tree produced by {@link lccParser#subtopic}.
	 * @param ctx the parse tree
	 */
	void exitSubtopic(lccParser.SubtopicContext ctx);
	/**
	 * Enter a parse tree produced by {@link lccParser#subclasses}.
	 * @param ctx the parse tree
	 */
	void enterSubclasses(lccParser.SubclassesContext ctx);
	/**
	 * Exit a parse tree produced by {@link lccParser#subclasses}.
	 * @param ctx the parse tree
	 */
	void exitSubclasses(lccParser.SubclassesContext ctx);
	/**
	 * Enter a parse tree produced by {@link lccParser#subclass}.
	 * @param ctx the parse tree
	 */
	void enterSubclass(lccParser.SubclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link lccParser#subclass}.
	 * @param ctx the parse tree
	 */
	void exitSubclass(lccParser.SubclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link lccParser#cutters}.
	 * @param ctx the parse tree
	 */
	void enterCutters(lccParser.CuttersContext ctx);
	/**
	 * Exit a parse tree produced by {@link lccParser#cutters}.
	 * @param ctx the parse tree
	 */
	void exitCutters(lccParser.CuttersContext ctx);
	/**
	 * Enter a parse tree produced by {@link lccParser#cutter}.
	 * @param ctx the parse tree
	 */
	void enterCutter(lccParser.CutterContext ctx);
	/**
	 * Exit a parse tree produced by {@link lccParser#cutter}.
	 * @param ctx the parse tree
	 */
	void exitCutter(lccParser.CutterContext ctx);
	/**
	 * Enter a parse tree produced by {@link lccParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(lccParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link lccParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(lccParser.DateContext ctx);
}