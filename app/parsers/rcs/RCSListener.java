// Generated from rcs/RCS.g4 by ANTLR 4.7.1
package parsers.rcs;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RCSParser}.
 */
public interface RCSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RCSParser#rcstext}.
	 * @param ctx the parse tree
	 */
	void enterRcstext(RCSParser.RcstextContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#rcstext}.
	 * @param ctx the parse tree
	 */
	void exitRcstext(RCSParser.RcstextContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#rcsheader}.
	 * @param ctx the parse tree
	 */
	void enterRcsheader(RCSParser.RcsheaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#rcsheader}.
	 * @param ctx the parse tree
	 */
	void exitRcsheader(RCSParser.RcsheaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#rcsrevisions}.
	 * @param ctx the parse tree
	 */
	void enterRcsrevisions(RCSParser.RcsrevisionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#rcsrevisions}.
	 * @param ctx the parse tree
	 */
	void exitRcsrevisions(RCSParser.RcsrevisionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#admin}.
	 * @param ctx the parse tree
	 */
	void enterAdmin(RCSParser.AdminContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#admin}.
	 * @param ctx the parse tree
	 */
	void exitAdmin(RCSParser.AdminContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(RCSParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(RCSParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterBranch(RCSParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitBranch(RCSParser.BranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#access}.
	 * @param ctx the parse tree
	 */
	void enterAccess(RCSParser.AccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#access}.
	 * @param ctx the parse tree
	 */
	void exitAccess(RCSParser.AccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#symbols}.
	 * @param ctx the parse tree
	 */
	void enterSymbols(RCSParser.SymbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#symbols}.
	 * @param ctx the parse tree
	 */
	void exitSymbols(RCSParser.SymbolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#tags}.
	 * @param ctx the parse tree
	 */
	void enterTags(RCSParser.TagsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#tags}.
	 * @param ctx the parse tree
	 */
	void exitTags(RCSParser.TagsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#locks}.
	 * @param ctx the parse tree
	 */
	void enterLocks(RCSParser.LocksContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#locks}.
	 * @param ctx the parse tree
	 */
	void exitLocks(RCSParser.LocksContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#strict}.
	 * @param ctx the parse tree
	 */
	void enterStrict(RCSParser.StrictContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#strict}.
	 * @param ctx the parse tree
	 */
	void exitStrict(RCSParser.StrictContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(RCSParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(RCSParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#expand}.
	 * @param ctx the parse tree
	 */
	void enterExpand(RCSParser.ExpandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#expand}.
	 * @param ctx the parse tree
	 */
	void exitExpand(RCSParser.ExpandContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#deltalist}.
	 * @param ctx the parse tree
	 */
	void enterDeltalist(RCSParser.DeltalistContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#deltalist}.
	 * @param ctx the parse tree
	 */
	void exitDeltalist(RCSParser.DeltalistContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#delta}.
	 * @param ctx the parse tree
	 */
	void enterDelta(RCSParser.DeltaContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#delta}.
	 * @param ctx the parse tree
	 */
	void exitDelta(RCSParser.DeltaContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#delta_date}.
	 * @param ctx the parse tree
	 */
	void enterDelta_date(RCSParser.Delta_dateContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#delta_date}.
	 * @param ctx the parse tree
	 */
	void exitDelta_date(RCSParser.Delta_dateContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#delta_author}.
	 * @param ctx the parse tree
	 */
	void enterDelta_author(RCSParser.Delta_authorContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#delta_author}.
	 * @param ctx the parse tree
	 */
	void exitDelta_author(RCSParser.Delta_authorContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#delta_state}.
	 * @param ctx the parse tree
	 */
	void enterDelta_state(RCSParser.Delta_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#delta_state}.
	 * @param ctx the parse tree
	 */
	void exitDelta_state(RCSParser.Delta_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#delta_branches}.
	 * @param ctx the parse tree
	 */
	void enterDelta_branches(RCSParser.Delta_branchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#delta_branches}.
	 * @param ctx the parse tree
	 */
	void exitDelta_branches(RCSParser.Delta_branchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#delta_next}.
	 * @param ctx the parse tree
	 */
	void enterDelta_next(RCSParser.Delta_nextContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#delta_next}.
	 * @param ctx the parse tree
	 */
	void exitDelta_next(RCSParser.Delta_nextContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#desc}.
	 * @param ctx the parse tree
	 */
	void enterDesc(RCSParser.DescContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#desc}.
	 * @param ctx the parse tree
	 */
	void exitDesc(RCSParser.DescContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#deltatextlist}.
	 * @param ctx the parse tree
	 */
	void enterDeltatextlist(RCSParser.DeltatextlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#deltatextlist}.
	 * @param ctx the parse tree
	 */
	void exitDeltatextlist(RCSParser.DeltatextlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#deltatext}.
	 * @param ctx the parse tree
	 */
	void enterDeltatext(RCSParser.DeltatextContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#deltatext}.
	 * @param ctx the parse tree
	 */
	void exitDeltatext(RCSParser.DeltatextContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#deltatext_log}.
	 * @param ctx the parse tree
	 */
	void enterDeltatext_log(RCSParser.Deltatext_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#deltatext_log}.
	 * @param ctx the parse tree
	 */
	void exitDeltatext_log(RCSParser.Deltatext_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#deltatext_text}.
	 * @param ctx the parse tree
	 */
	void enterDeltatext_text(RCSParser.Deltatext_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#deltatext_text}.
	 * @param ctx the parse tree
	 */
	void exitDeltatext_text(RCSParser.Deltatext_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link RCSParser#newphrase}.
	 * @param ctx the parse tree
	 */
	void enterNewphrase(RCSParser.NewphraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RCSParser#newphrase}.
	 * @param ctx the parse tree
	 */
	void exitNewphrase(RCSParser.NewphraseContext ctx);
}