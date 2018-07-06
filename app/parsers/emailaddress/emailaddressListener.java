// Generated from emailaddress/emailaddress.g4 by ANTLR 4.7.1
package parsers.emailaddress;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link emailaddressParser}.
 */
public interface emailaddressListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#emailaddress}.
	 * @param ctx the parse tree
	 */
	void enterEmailaddress(emailaddressParser.EmailaddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#emailaddress}.
	 * @param ctx the parse tree
	 */
	void exitEmailaddress(emailaddressParser.EmailaddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(emailaddressParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(emailaddressParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#mailbox}.
	 * @param ctx the parse tree
	 */
	void enterMailbox(emailaddressParser.MailboxContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#mailbox}.
	 * @param ctx the parse tree
	 */
	void exitMailbox(emailaddressParser.MailboxContext ctx);
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#routeaddr}.
	 * @param ctx the parse tree
	 */
	void enterRouteaddr(emailaddressParser.RouteaddrContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#routeaddr}.
	 * @param ctx the parse tree
	 */
	void exitRouteaddr(emailaddressParser.RouteaddrContext ctx);
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#route}.
	 * @param ctx the parse tree
	 */
	void enterRoute(emailaddressParser.RouteContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#route}.
	 * @param ctx the parse tree
	 */
	void exitRoute(emailaddressParser.RouteContext ctx);
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#addrspec}.
	 * @param ctx the parse tree
	 */
	void enterAddrspec(emailaddressParser.AddrspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#addrspec}.
	 * @param ctx the parse tree
	 */
	void exitAddrspec(emailaddressParser.AddrspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#localpart}.
	 * @param ctx the parse tree
	 */
	void enterLocalpart(emailaddressParser.LocalpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#localpart}.
	 * @param ctx the parse tree
	 */
	void exitLocalpart(emailaddressParser.LocalpartContext ctx);
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#domain}.
	 * @param ctx the parse tree
	 */
	void enterDomain(emailaddressParser.DomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#domain}.
	 * @param ctx the parse tree
	 */
	void exitDomain(emailaddressParser.DomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#subdomain}.
	 * @param ctx the parse tree
	 */
	void enterSubdomain(emailaddressParser.SubdomainContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#subdomain}.
	 * @param ctx the parse tree
	 */
	void exitSubdomain(emailaddressParser.SubdomainContext ctx);
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#domainref}.
	 * @param ctx the parse tree
	 */
	void enterDomainref(emailaddressParser.DomainrefContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#domainref}.
	 * @param ctx the parse tree
	 */
	void exitDomainref(emailaddressParser.DomainrefContext ctx);
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#phrase}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(emailaddressParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#phrase}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(emailaddressParser.PhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(emailaddressParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(emailaddressParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#lwspchar}.
	 * @param ctx the parse tree
	 */
	void enterLwspchar(emailaddressParser.LwspcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#lwspchar}.
	 * @param ctx the parse tree
	 */
	void exitLwspchar(emailaddressParser.LwspcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#lwsp}.
	 * @param ctx the parse tree
	 */
	void enterLwsp(emailaddressParser.LwspContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#lwsp}.
	 * @param ctx the parse tree
	 */
	void exitLwsp(emailaddressParser.LwspContext ctx);
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#delimeters}.
	 * @param ctx the parse tree
	 */
	void enterDelimeters(emailaddressParser.DelimetersContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#delimeters}.
	 * @param ctx the parse tree
	 */
	void exitDelimeters(emailaddressParser.DelimetersContext ctx);
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(emailaddressParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(emailaddressParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#quotedpair}.
	 * @param ctx the parse tree
	 */
	void enterQuotedpair(emailaddressParser.QuotedpairContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#quotedpair}.
	 * @param ctx the parse tree
	 */
	void exitQuotedpair(emailaddressParser.QuotedpairContext ctx);
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#domainliteral}.
	 * @param ctx the parse tree
	 */
	void enterDomainliteral(emailaddressParser.DomainliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#domainliteral}.
	 * @param ctx the parse tree
	 */
	void exitDomainliteral(emailaddressParser.DomainliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#quotedstring}.
	 * @param ctx the parse tree
	 */
	void enterQuotedstring(emailaddressParser.QuotedstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#quotedstring}.
	 * @param ctx the parse tree
	 */
	void exitQuotedstring(emailaddressParser.QuotedstringContext ctx);
	/**
	 * Enter a parse tree produced by {@link emailaddressParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(emailaddressParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link emailaddressParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(emailaddressParser.CommentContext ctx);
}