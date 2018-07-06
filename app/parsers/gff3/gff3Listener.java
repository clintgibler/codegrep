// Generated from gff3/gff3.g4 by ANTLR 4.7.1
package parsers.gff3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gff3Parser}.
 */
public interface gff3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gff3Parser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(gff3Parser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(gff3Parser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gff3Parser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(gff3Parser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(gff3Parser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link gff3Parser#dataline}.
	 * @param ctx the parse tree
	 */
	void enterDataline(gff3Parser.DatalineContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#dataline}.
	 * @param ctx the parse tree
	 */
	void exitDataline(gff3Parser.DatalineContext ctx);
	/**
	 * Enter a parse tree produced by {@link gff3Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(gff3Parser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(gff3Parser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link gff3Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(gff3Parser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(gff3Parser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gff3Parser#seqid}.
	 * @param ctx the parse tree
	 */
	void enterSeqid(gff3Parser.SeqidContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#seqid}.
	 * @param ctx the parse tree
	 */
	void exitSeqid(gff3Parser.SeqidContext ctx);
	/**
	 * Enter a parse tree produced by {@link gff3Parser#source}.
	 * @param ctx the parse tree
	 */
	void enterSource(gff3Parser.SourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#source}.
	 * @param ctx the parse tree
	 */
	void exitSource(gff3Parser.SourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link gff3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(gff3Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(gff3Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gff3Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(gff3Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(gff3Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link gff3Parser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(gff3Parser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(gff3Parser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link gff3Parser#strand}.
	 * @param ctx the parse tree
	 */
	void enterStrand(gff3Parser.StrandContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#strand}.
	 * @param ctx the parse tree
	 */
	void exitStrand(gff3Parser.StrandContext ctx);
	/**
	 * Enter a parse tree produced by {@link gff3Parser#score}.
	 * @param ctx the parse tree
	 */
	void enterScore(gff3Parser.ScoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#score}.
	 * @param ctx the parse tree
	 */
	void exitScore(gff3Parser.ScoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link gff3Parser#phase}.
	 * @param ctx the parse tree
	 */
	void enterPhase(gff3Parser.PhaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#phase}.
	 * @param ctx the parse tree
	 */
	void exitPhase(gff3Parser.PhaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gff3Parser#commentline}.
	 * @param ctx the parse tree
	 */
	void enterCommentline(gff3Parser.CommentlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link gff3Parser#commentline}.
	 * @param ctx the parse tree
	 */
	void exitCommentline(gff3Parser.CommentlineContext ctx);
}