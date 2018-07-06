// Generated from prolog/prolog.g4 by ANTLR 4.7.1
package parsers.prolog;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link prologParser}.
 */
public interface prologListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link prologParser#p_text}.
	 * @param ctx the parse tree
	 */
	void enterP_text(prologParser.P_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link prologParser#p_text}.
	 * @param ctx the parse tree
	 */
	void exitP_text(prologParser.P_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link prologParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(prologParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link prologParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(prologParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link prologParser#clause}.
	 * @param ctx the parse tree
	 */
	void enterClause(prologParser.ClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link prologParser#clause}.
	 * @param ctx the parse tree
	 */
	void exitClause(prologParser.ClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link prologParser#termlist}.
	 * @param ctx the parse tree
	 */
	void enterTermlist(prologParser.TermlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link prologParser#termlist}.
	 * @param ctx the parse tree
	 */
	void exitTermlist(prologParser.TermlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atom_term}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void enterAtom_term(prologParser.Atom_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atom_term}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void exitAtom_term(prologParser.Atom_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binary_operator}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(prologParser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binary_operator}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(prologParser.Binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_operator}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(prologParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_operator}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(prologParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code braced_term}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void enterBraced_term(prologParser.Braced_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code braced_term}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void exitBraced_term(prologParser.Braced_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code list_term}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void enterList_term(prologParser.List_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code list_term}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void exitList_term(prologParser.List_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void enterVariable(prologParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void exitVariable(prologParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFloat(prologParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFloat(prologParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compound_term}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void enterCompound_term(prologParser.Compound_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compound_term}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void exitCompound_term(prologParser.Compound_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer_term}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void enterInteger_term(prologParser.Integer_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer_term}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void exitInteger_term(prologParser.Integer_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code curly_bracketed_term}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void enterCurly_bracketed_term(prologParser.Curly_bracketed_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code curly_bracketed_term}
	 * labeled alternative in {@link prologParser#term}.
	 * @param ctx the parse tree
	 */
	void exitCurly_bracketed_term(prologParser.Curly_bracketed_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link prologParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(prologParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link prologParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(prologParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empty_list}
	 * labeled alternative in {@link prologParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_list(prologParser.Empty_listContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empty_list}
	 * labeled alternative in {@link prologParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_list(prologParser.Empty_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empty_braces}
	 * labeled alternative in {@link prologParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_braces(prologParser.Empty_bracesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empty_braces}
	 * labeled alternative in {@link prologParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_braces(prologParser.Empty_bracesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code name}
	 * labeled alternative in {@link prologParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterName(prologParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code name}
	 * labeled alternative in {@link prologParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitName(prologParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code graphic}
	 * labeled alternative in {@link prologParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterGraphic(prologParser.GraphicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code graphic}
	 * labeled alternative in {@link prologParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitGraphic(prologParser.GraphicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quoted_string}
	 * labeled alternative in {@link prologParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_string(prologParser.Quoted_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quoted_string}
	 * labeled alternative in {@link prologParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_string(prologParser.Quoted_stringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dq_string}
	 * labeled alternative in {@link prologParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDq_string(prologParser.Dq_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dq_string}
	 * labeled alternative in {@link prologParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDq_string(prologParser.Dq_stringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code backq_string}
	 * labeled alternative in {@link prologParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBackq_string(prologParser.Backq_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code backq_string}
	 * labeled alternative in {@link prologParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBackq_string(prologParser.Backq_stringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code semicolon}
	 * labeled alternative in {@link prologParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterSemicolon(prologParser.SemicolonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code semicolon}
	 * labeled alternative in {@link prologParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitSemicolon(prologParser.SemicolonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cut}
	 * labeled alternative in {@link prologParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterCut(prologParser.CutContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cut}
	 * labeled alternative in {@link prologParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitCut(prologParser.CutContext ctx);
	/**
	 * Enter a parse tree produced by {@link prologParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(prologParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link prologParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(prologParser.IntegerContext ctx);
}