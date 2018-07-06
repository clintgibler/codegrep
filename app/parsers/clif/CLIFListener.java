// Generated from clif/CLIF.g4 by ANTLR 4.7.1
package parsers.clif;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CLIFParser}.
 */
public interface CLIFListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CLIFParser#termseq}.
	 * @param ctx the parse tree
	 */
	void enterTermseq(CLIFParser.TermseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#termseq}.
	 * @param ctx the parse tree
	 */
	void exitTermseq(CLIFParser.TermseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIFParser#interpretedname}.
	 * @param ctx the parse tree
	 */
	void enterInterpretedname(CLIFParser.InterpretednameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#interpretedname}.
	 * @param ctx the parse tree
	 */
	void exitInterpretedname(CLIFParser.InterpretednameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIFParser#interpretablename}.
	 * @param ctx the parse tree
	 */
	void enterInterpretablename(CLIFParser.InterpretablenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#interpretablename}.
	 * @param ctx the parse tree
	 */
	void exitInterpretablename(CLIFParser.InterpretablenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIFParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(CLIFParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(CLIFParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIFParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CLIFParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CLIFParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIFParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(CLIFParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(CLIFParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIFParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(CLIFParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(CLIFParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIFParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(CLIFParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(CLIFParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIFParser#atomsent}.
	 * @param ctx the parse tree
	 */
	void enterAtomsent(CLIFParser.AtomsentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#atomsent}.
	 * @param ctx the parse tree
	 */
	void exitAtomsent(CLIFParser.AtomsentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIFParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(CLIFParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(CLIFParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIFParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(CLIFParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(CLIFParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIFParser#boolsent}.
	 * @param ctx the parse tree
	 */
	void enterBoolsent(CLIFParser.BoolsentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#boolsent}.
	 * @param ctx the parse tree
	 */
	void exitBoolsent(CLIFParser.BoolsentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIFParser#quantsent}.
	 * @param ctx the parse tree
	 */
	void enterQuantsent(CLIFParser.QuantsentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#quantsent}.
	 * @param ctx the parse tree
	 */
	void exitQuantsent(CLIFParser.QuantsentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIFParser#boundlist}.
	 * @param ctx the parse tree
	 */
	void enterBoundlist(CLIFParser.BoundlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#boundlist}.
	 * @param ctx the parse tree
	 */
	void exitBoundlist(CLIFParser.BoundlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIFParser#commentsent}.
	 * @param ctx the parse tree
	 */
	void enterCommentsent(CLIFParser.CommentsentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#commentsent}.
	 * @param ctx the parse tree
	 */
	void exitCommentsent(CLIFParser.CommentsentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIFParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(CLIFParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(CLIFParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIFParser#phrase}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(CLIFParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#phrase}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(CLIFParser.PhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIFParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(CLIFParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(CLIFParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIFParser#cltext}.
	 * @param ctx the parse tree
	 */
	void enterCltext(CLIFParser.CltextContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#cltext}.
	 * @param ctx the parse tree
	 */
	void exitCltext(CLIFParser.CltextContext ctx);
	/**
	 * Enter a parse tree produced by {@link CLIFParser#namedtext}.
	 * @param ctx the parse tree
	 */
	void enterNamedtext(CLIFParser.NamedtextContext ctx);
	/**
	 * Exit a parse tree produced by {@link CLIFParser#namedtext}.
	 * @param ctx the parse tree
	 */
	void exitNamedtext(CLIFParser.NamedtextContext ctx);
}