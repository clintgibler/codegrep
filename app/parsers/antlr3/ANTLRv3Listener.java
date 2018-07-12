// Generated from antlr3/ANTLRv3.g4 by ANTLR 4.7.1
package parsers.antlr3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ANTLRv3Parser}.
 */
public interface ANTLRv3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#grammarDef}.
	 * @param ctx the parse tree
	 */
	void enterGrammarDef(ANTLRv3Parser.GrammarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#grammarDef}.
	 * @param ctx the parse tree
	 */
	void exitGrammarDef(ANTLRv3Parser.GrammarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#tokensSpec}.
	 * @param ctx the parse tree
	 */
	void enterTokensSpec(ANTLRv3Parser.TokensSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#tokensSpec}.
	 * @param ctx the parse tree
	 */
	void exitTokensSpec(ANTLRv3Parser.TokensSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#tokenSpec}.
	 * @param ctx the parse tree
	 */
	void enterTokenSpec(ANTLRv3Parser.TokenSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#tokenSpec}.
	 * @param ctx the parse tree
	 */
	void exitTokenSpec(ANTLRv3Parser.TokenSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#attrScope}.
	 * @param ctx the parse tree
	 */
	void enterAttrScope(ANTLRv3Parser.AttrScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#attrScope}.
	 * @param ctx the parse tree
	 */
	void exitAttrScope(ANTLRv3Parser.AttrScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(ANTLRv3Parser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(ANTLRv3Parser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#actionScopeName}.
	 * @param ctx the parse tree
	 */
	void enterActionScopeName(ANTLRv3Parser.ActionScopeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#actionScopeName}.
	 * @param ctx the parse tree
	 */
	void exitActionScopeName(ANTLRv3Parser.ActionScopeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#optionsSpec}.
	 * @param ctx the parse tree
	 */
	void enterOptionsSpec(ANTLRv3Parser.OptionsSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#optionsSpec}.
	 * @param ctx the parse tree
	 */
	void exitOptionsSpec(ANTLRv3Parser.OptionsSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(ANTLRv3Parser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(ANTLRv3Parser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#optionValue}.
	 * @param ctx the parse tree
	 */
	void enterOptionValue(ANTLRv3Parser.OptionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#optionValue}.
	 * @param ctx the parse tree
	 */
	void exitOptionValue(ANTLRv3Parser.OptionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#rule_}.
	 * @param ctx the parse tree
	 */
	void enterRule_(ANTLRv3Parser.Rule_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#rule_}.
	 * @param ctx the parse tree
	 */
	void exitRule_(ANTLRv3Parser.Rule_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#ruleAction}.
	 * @param ctx the parse tree
	 */
	void enterRuleAction(ANTLRv3Parser.RuleActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#ruleAction}.
	 * @param ctx the parse tree
	 */
	void exitRuleAction(ANTLRv3Parser.RuleActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#throwsSpec}.
	 * @param ctx the parse tree
	 */
	void enterThrowsSpec(ANTLRv3Parser.ThrowsSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#throwsSpec}.
	 * @param ctx the parse tree
	 */
	void exitThrowsSpec(ANTLRv3Parser.ThrowsSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#ruleScopeSpec}.
	 * @param ctx the parse tree
	 */
	void enterRuleScopeSpec(ANTLRv3Parser.RuleScopeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#ruleScopeSpec}.
	 * @param ctx the parse tree
	 */
	void exitRuleScopeSpec(ANTLRv3Parser.RuleScopeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ANTLRv3Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ANTLRv3Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#altList}.
	 * @param ctx the parse tree
	 */
	void enterAltList(ANTLRv3Parser.AltListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#altList}.
	 * @param ctx the parse tree
	 */
	void exitAltList(ANTLRv3Parser.AltListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#alternative}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(ANTLRv3Parser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#alternative}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(ANTLRv3Parser.AlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#exceptionGroup}.
	 * @param ctx the parse tree
	 */
	void enterExceptionGroup(ANTLRv3Parser.ExceptionGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#exceptionGroup}.
	 * @param ctx the parse tree
	 */
	void exitExceptionGroup(ANTLRv3Parser.ExceptionGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#exceptionHandler}.
	 * @param ctx the parse tree
	 */
	void enterExceptionHandler(ANTLRv3Parser.ExceptionHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#exceptionHandler}.
	 * @param ctx the parse tree
	 */
	void exitExceptionHandler(ANTLRv3Parser.ExceptionHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void enterFinallyClause(ANTLRv3Parser.FinallyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#finallyClause}.
	 * @param ctx the parse tree
	 */
	void exitFinallyClause(ANTLRv3Parser.FinallyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(ANTLRv3Parser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(ANTLRv3Parser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#elementNoOptionSpec}.
	 * @param ctx the parse tree
	 */
	void enterElementNoOptionSpec(ANTLRv3Parser.ElementNoOptionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#elementNoOptionSpec}.
	 * @param ctx the parse tree
	 */
	void exitElementNoOptionSpec(ANTLRv3Parser.ElementNoOptionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ANTLRv3Parser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ANTLRv3Parser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#notSet}.
	 * @param ctx the parse tree
	 */
	void enterNotSet(ANTLRv3Parser.NotSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#notSet}.
	 * @param ctx the parse tree
	 */
	void exitNotSet(ANTLRv3Parser.NotSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#treeSpec}.
	 * @param ctx the parse tree
	 */
	void enterTreeSpec(ANTLRv3Parser.TreeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#treeSpec}.
	 * @param ctx the parse tree
	 */
	void exitTreeSpec(ANTLRv3Parser.TreeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#ebnf}.
	 * @param ctx the parse tree
	 */
	void enterEbnf(ANTLRv3Parser.EbnfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#ebnf}.
	 * @param ctx the parse tree
	 */
	void exitEbnf(ANTLRv3Parser.EbnfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(ANTLRv3Parser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(ANTLRv3Parser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#terminal_}.
	 * @param ctx the parse tree
	 */
	void enterTerminal_(ANTLRv3Parser.Terminal_Context ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#terminal_}.
	 * @param ctx the parse tree
	 */
	void exitTerminal_(ANTLRv3Parser.Terminal_Context ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#notTerminal}.
	 * @param ctx the parse tree
	 */
	void enterNotTerminal(ANTLRv3Parser.NotTerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#notTerminal}.
	 * @param ctx the parse tree
	 */
	void exitNotTerminal(ANTLRv3Parser.NotTerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#ebnfSuffix}.
	 * @param ctx the parse tree
	 */
	void enterEbnfSuffix(ANTLRv3Parser.EbnfSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#ebnfSuffix}.
	 * @param ctx the parse tree
	 */
	void exitEbnfSuffix(ANTLRv3Parser.EbnfSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#rewrite}.
	 * @param ctx the parse tree
	 */
	void enterRewrite(ANTLRv3Parser.RewriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#rewrite}.
	 * @param ctx the parse tree
	 */
	void exitRewrite(ANTLRv3Parser.RewriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#rewrite_alternative}.
	 * @param ctx the parse tree
	 */
	void enterRewrite_alternative(ANTLRv3Parser.Rewrite_alternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#rewrite_alternative}.
	 * @param ctx the parse tree
	 */
	void exitRewrite_alternative(ANTLRv3Parser.Rewrite_alternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#rewrite_tree_block}.
	 * @param ctx the parse tree
	 */
	void enterRewrite_tree_block(ANTLRv3Parser.Rewrite_tree_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#rewrite_tree_block}.
	 * @param ctx the parse tree
	 */
	void exitRewrite_tree_block(ANTLRv3Parser.Rewrite_tree_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#rewrite_tree_alternative}.
	 * @param ctx the parse tree
	 */
	void enterRewrite_tree_alternative(ANTLRv3Parser.Rewrite_tree_alternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#rewrite_tree_alternative}.
	 * @param ctx the parse tree
	 */
	void exitRewrite_tree_alternative(ANTLRv3Parser.Rewrite_tree_alternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#rewrite_tree_element}.
	 * @param ctx the parse tree
	 */
	void enterRewrite_tree_element(ANTLRv3Parser.Rewrite_tree_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#rewrite_tree_element}.
	 * @param ctx the parse tree
	 */
	void exitRewrite_tree_element(ANTLRv3Parser.Rewrite_tree_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#rewrite_tree_atom}.
	 * @param ctx the parse tree
	 */
	void enterRewrite_tree_atom(ANTLRv3Parser.Rewrite_tree_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#rewrite_tree_atom}.
	 * @param ctx the parse tree
	 */
	void exitRewrite_tree_atom(ANTLRv3Parser.Rewrite_tree_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#rewrite_tree_ebnf}.
	 * @param ctx the parse tree
	 */
	void enterRewrite_tree_ebnf(ANTLRv3Parser.Rewrite_tree_ebnfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#rewrite_tree_ebnf}.
	 * @param ctx the parse tree
	 */
	void exitRewrite_tree_ebnf(ANTLRv3Parser.Rewrite_tree_ebnfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#rewrite_tree}.
	 * @param ctx the parse tree
	 */
	void enterRewrite_tree(ANTLRv3Parser.Rewrite_treeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#rewrite_tree}.
	 * @param ctx the parse tree
	 */
	void exitRewrite_tree(ANTLRv3Parser.Rewrite_treeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#rewrite_template}.
	 * @param ctx the parse tree
	 */
	void enterRewrite_template(ANTLRv3Parser.Rewrite_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#rewrite_template}.
	 * @param ctx the parse tree
	 */
	void exitRewrite_template(ANTLRv3Parser.Rewrite_templateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#rewrite_template_ref}.
	 * @param ctx the parse tree
	 */
	void enterRewrite_template_ref(ANTLRv3Parser.Rewrite_template_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#rewrite_template_ref}.
	 * @param ctx the parse tree
	 */
	void exitRewrite_template_ref(ANTLRv3Parser.Rewrite_template_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#rewrite_indirect_template_head}.
	 * @param ctx the parse tree
	 */
	void enterRewrite_indirect_template_head(ANTLRv3Parser.Rewrite_indirect_template_headContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#rewrite_indirect_template_head}.
	 * @param ctx the parse tree
	 */
	void exitRewrite_indirect_template_head(ANTLRv3Parser.Rewrite_indirect_template_headContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#rewrite_template_args}.
	 * @param ctx the parse tree
	 */
	void enterRewrite_template_args(ANTLRv3Parser.Rewrite_template_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#rewrite_template_args}.
	 * @param ctx the parse tree
	 */
	void exitRewrite_template_args(ANTLRv3Parser.Rewrite_template_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#rewrite_template_arg}.
	 * @param ctx the parse tree
	 */
	void enterRewrite_template_arg(ANTLRv3Parser.Rewrite_template_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#rewrite_template_arg}.
	 * @param ctx the parse tree
	 */
	void exitRewrite_template_arg(ANTLRv3Parser.Rewrite_template_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link ANTLRv3Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(ANTLRv3Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ANTLRv3Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(ANTLRv3Parser.IdContext ctx);
}