// Generated from fasta/fasta.g4 by ANTLR 4.7.1
package parsers.fasta;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fastaParser}.
 */
public interface fastaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fastaParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(fastaParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link fastaParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(fastaParser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link fastaParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(fastaParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link fastaParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(fastaParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link fastaParser#sequencelines}.
	 * @param ctx the parse tree
	 */
	void enterSequencelines(fastaParser.SequencelinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link fastaParser#sequencelines}.
	 * @param ctx the parse tree
	 */
	void exitSequencelines(fastaParser.SequencelinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link fastaParser#descriptionline}.
	 * @param ctx the parse tree
	 */
	void enterDescriptionline(fastaParser.DescriptionlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link fastaParser#descriptionline}.
	 * @param ctx the parse tree
	 */
	void exitDescriptionline(fastaParser.DescriptionlineContext ctx);
	/**
	 * Enter a parse tree produced by {@link fastaParser#commentline}.
	 * @param ctx the parse tree
	 */
	void enterCommentline(fastaParser.CommentlineContext ctx);
	/**
	 * Exit a parse tree produced by {@link fastaParser#commentline}.
	 * @param ctx the parse tree
	 */
	void exitCommentline(fastaParser.CommentlineContext ctx);
}