// Generated from emailaddress/emailaddress.g4 by ANTLR 4.7.1
package parsers.emailaddress;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class emailaddressParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, CHAR=13, ALPHA=14, DIGIT=15, CTL=16, CR=17, 
		LF=18, SPACE=19, HTAB=20, CRLF=21, SPECIALS=22, QUOTE=23, QTEXT=24, DTEXT=25, 
		CTEXT=26;
	public static final int
		RULE_emailaddress = 0, RULE_group = 1, RULE_mailbox = 2, RULE_routeaddr = 3, 
		RULE_route = 4, RULE_addrspec = 5, RULE_localpart = 6, RULE_domain = 7, 
		RULE_subdomain = 8, RULE_domainref = 9, RULE_phrase = 10, RULE_word = 11, 
		RULE_lwspchar = 12, RULE_lwsp = 13, RULE_delimeters = 14, RULE_atom = 15, 
		RULE_quotedpair = 16, RULE_domainliteral = 17, RULE_quotedstring = 18, 
		RULE_comment = 19;
	public static final String[] ruleNames = {
		"emailaddress", "group", "mailbox", "routeaddr", "route", "addrspec", 
		"localpart", "domain", "subdomain", "domainref", "phrase", "word", "lwspchar", 
		"lwsp", "delimeters", "atom", "quotedpair", "domainliteral", "quotedstring", 
		"comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "';'", "'<'", "'>'", "'@'", "'.'", "'\\'", "'['", "']'", 
		"'''", "'('", "')'", null, null, null, null, "'\n'", "'\r'", "' '", "'\t'", 
		"'\r\n'", null, "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "CHAR", "ALPHA", "DIGIT", "CTL", "CR", "LF", "SPACE", "HTAB", "CRLF", 
		"SPECIALS", "QUOTE", "QTEXT", "DTEXT", "CTEXT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "emailaddress.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public emailaddressParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EmailaddressContext extends ParserRuleContext {
		public MailboxContext mailbox() {
			return getRuleContext(MailboxContext.class,0);
		}
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public EmailaddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emailaddress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterEmailaddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitEmailaddress(this);
		}
	}

	public final EmailaddressContext emailaddress() throws RecognitionException {
		EmailaddressContext _localctx = new EmailaddressContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_emailaddress);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				mailbox();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				group();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupContext extends ParserRuleContext {
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public List<MailboxContext> mailbox() {
			return getRuleContexts(MailboxContext.class);
		}
		public MailboxContext mailbox(int i) {
			return getRuleContext(MailboxContext.class,i);
		}
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitGroup(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			phrase();
			setState(45);
			match(T__0);
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==CHAR) {
				{
				{
				setState(46);
				mailbox();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MailboxContext extends ParserRuleContext {
		public AddrspecContext addrspec() {
			return getRuleContext(AddrspecContext.class,0);
		}
		public PhraseContext phrase() {
			return getRuleContext(PhraseContext.class,0);
		}
		public RouteaddrContext routeaddr() {
			return getRuleContext(RouteaddrContext.class,0);
		}
		public MailboxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mailbox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterMailbox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitMailbox(this);
		}
	}

	public final MailboxContext mailbox() throws RecognitionException {
		MailboxContext _localctx = new MailboxContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mailbox);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				addrspec();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(55);
				phrase();
				setState(56);
				routeaddr();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RouteaddrContext extends ParserRuleContext {
		public AddrspecContext addrspec() {
			return getRuleContext(AddrspecContext.class,0);
		}
		public List<RouteContext> route() {
			return getRuleContexts(RouteContext.class);
		}
		public RouteContext route(int i) {
			return getRuleContext(RouteContext.class,i);
		}
		public RouteaddrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routeaddr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterRouteaddr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitRouteaddr(this);
		}
	}

	public final RouteaddrContext routeaddr() throws RecognitionException {
		RouteaddrContext _localctx = new RouteaddrContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_routeaddr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__2);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(61);
				route();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			addrspec();
			setState(68);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RouteContext extends ParserRuleContext {
		public DomainContext domain() {
			return getRuleContext(DomainContext.class,0);
		}
		public RouteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_route; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterRoute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitRoute(this);
		}
	}

	public final RouteContext route() throws RecognitionException {
		RouteContext _localctx = new RouteContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_route);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__4);
			setState(71);
			domain();
			setState(72);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddrspecContext extends ParserRuleContext {
		public LocalpartContext localpart() {
			return getRuleContext(LocalpartContext.class,0);
		}
		public DomainContext domain() {
			return getRuleContext(DomainContext.class,0);
		}
		public AddrspecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addrspec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterAddrspec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitAddrspec(this);
		}
	}

	public final AddrspecContext addrspec() throws RecognitionException {
		AddrspecContext _localctx = new AddrspecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_addrspec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			localpart();
			setState(75);
			match(T__4);
			setState(76);
			domain();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalpartContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public LocalpartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localpart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterLocalpart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitLocalpart(this);
		}
	}

	public final LocalpartContext localpart() throws RecognitionException {
		LocalpartContext _localctx = new LocalpartContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_localpart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			word();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(79);
				match(T__5);
				setState(80);
				word();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DomainContext extends ParserRuleContext {
		public List<SubdomainContext> subdomain() {
			return getRuleContexts(SubdomainContext.class);
		}
		public SubdomainContext subdomain(int i) {
			return getRuleContext(SubdomainContext.class,i);
		}
		public DomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterDomain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitDomain(this);
		}
	}

	public final DomainContext domain() throws RecognitionException {
		DomainContext _localctx = new DomainContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_domain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			subdomain();
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(87);
				match(T__5);
				setState(88);
				subdomain();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubdomainContext extends ParserRuleContext {
		public DomainrefContext domainref() {
			return getRuleContext(DomainrefContext.class,0);
		}
		public DomainliteralContext domainliteral() {
			return getRuleContext(DomainliteralContext.class,0);
		}
		public SubdomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subdomain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterSubdomain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitSubdomain(this);
		}
	}

	public final SubdomainContext subdomain() throws RecognitionException {
		SubdomainContext _localctx = new SubdomainContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_subdomain);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				domainref();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				domainliteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DomainrefContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public DomainrefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterDomainref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitDomainref(this);
		}
	}

	public final DomainrefContext domainref() throws RecognitionException {
		DomainrefContext _localctx = new DomainrefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_domainref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			atom();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PhraseContext extends ParserRuleContext {
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public PhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitPhrase(this);
		}
	}

	public final PhraseContext phrase() throws RecognitionException {
		PhraseContext _localctx = new PhraseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_phrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				word();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__9 || _la==CHAR );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WordContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public QuotedstringContext quotedstring() {
			return getRuleContext(QuotedstringContext.class,0);
		}
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_word);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				atom();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				quotedstring();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LwspcharContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(emailaddressParser.SPACE, 0); }
		public TerminalNode HTAB() { return getToken(emailaddressParser.HTAB, 0); }
		public LwspcharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lwspchar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterLwspchar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitLwspchar(this);
		}
	}

	public final LwspcharContext lwspchar() throws RecognitionException {
		LwspcharContext _localctx = new LwspcharContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lwspchar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !(_la==SPACE || _la==HTAB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LwspContext extends ParserRuleContext {
		public List<LwspcharContext> lwspchar() {
			return getRuleContexts(LwspcharContext.class);
		}
		public LwspcharContext lwspchar(int i) {
			return getRuleContext(LwspcharContext.class,i);
		}
		public List<TerminalNode> CRLF() { return getTokens(emailaddressParser.CRLF); }
		public TerminalNode CRLF(int i) {
			return getToken(emailaddressParser.CRLF, i);
		}
		public LwspContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lwsp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterLwsp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitLwsp(this);
		}
	}

	public final LwspContext lwsp() throws RecognitionException {
		LwspContext _localctx = new LwspContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lwsp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CRLF) {
					{
					setState(111);
					match(CRLF);
					}
				}

				setState(114);
				lwspchar();
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SPACE) | (1L << HTAB) | (1L << CRLF))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelimetersContext extends ParserRuleContext {
		public TerminalNode SPECIALS() { return getToken(emailaddressParser.SPECIALS, 0); }
		public LwspContext lwsp() {
			return getRuleContext(LwspContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public DelimetersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimeters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterDelimeters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitDelimeters(this);
		}
	}

	public final DelimetersContext delimeters() throws RecognitionException {
		DelimetersContext _localctx = new DelimetersContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_delimeters);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPECIALS:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(SPECIALS);
				}
				break;
			case SPACE:
			case HTAB:
			case CRLF:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				lwsp();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				comment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(emailaddressParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(emailaddressParser.CHAR, i);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(124);
					match(CHAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(127); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedpairContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(emailaddressParser.CHAR, 0); }
		public QuotedpairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedpair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterQuotedpair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitQuotedpair(this);
		}
	}

	public final QuotedpairContext quotedpair() throws RecognitionException {
		QuotedpairContext _localctx = new QuotedpairContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_quotedpair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__6);
			setState(130);
			match(CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DomainliteralContext extends ParserRuleContext {
		public List<TerminalNode> DTEXT() { return getTokens(emailaddressParser.DTEXT); }
		public TerminalNode DTEXT(int i) {
			return getToken(emailaddressParser.DTEXT, i);
		}
		public List<QuotedpairContext> quotedpair() {
			return getRuleContexts(QuotedpairContext.class);
		}
		public QuotedpairContext quotedpair(int i) {
			return getRuleContext(QuotedpairContext.class,i);
		}
		public DomainliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterDomainliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitDomainliteral(this);
		}
	}

	public final DomainliteralContext domainliteral() throws RecognitionException {
		DomainliteralContext _localctx = new DomainliteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_domainliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__7);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==DTEXT) {
				{
				setState(135);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DTEXT:
					{
					setState(133);
					match(DTEXT);
					}
					break;
				case T__6:
					{
					setState(134);
					quotedpair();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedstringContext extends ParserRuleContext {
		public List<TerminalNode> QTEXT() { return getTokens(emailaddressParser.QTEXT); }
		public TerminalNode QTEXT(int i) {
			return getToken(emailaddressParser.QTEXT, i);
		}
		public List<QuotedpairContext> quotedpair() {
			return getRuleContexts(QuotedpairContext.class);
		}
		public QuotedpairContext quotedpair(int i) {
			return getRuleContext(QuotedpairContext.class,i);
		}
		public QuotedstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterQuotedstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitQuotedstring(this);
		}
	}

	public final QuotedstringContext quotedstring() throws RecognitionException {
		QuotedstringContext _localctx = new QuotedstringContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_quotedstring);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__9);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==QTEXT) {
				{
				setState(145);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QTEXT:
					{
					setState(143);
					match(QTEXT);
					}
					break;
				case T__6:
					{
					setState(144);
					quotedpair();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public List<TerminalNode> CTEXT() { return getTokens(emailaddressParser.CTEXT); }
		public TerminalNode CTEXT(int i) {
			return getToken(emailaddressParser.CTEXT, i);
		}
		public List<QuotedpairContext> quotedpair() {
			return getRuleContexts(QuotedpairContext.class);
		}
		public QuotedpairContext quotedpair(int i) {
			return getRuleContext(QuotedpairContext.class,i);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof emailaddressListener ) ((emailaddressListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__10);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__10) | (1L << CTEXT))) != 0)) {
				{
				setState(156);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CTEXT:
					{
					setState(153);
					match(CTEXT);
					}
					break;
				case T__6:
					{
					setState(154);
					quotedpair();
					}
					break;
				case T__10:
					{
					setState(155);
					comment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u00a6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\5\2-\n\2\3\3\3\3\3\3\7\3\62\n\3"+
		"\f\3\16\3\65\13\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4=\n\4\3\5\3\5\7\5A\n\5\f"+
		"\5\16\5D\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\7\bT\n\b\f\b\16\bW\13\b\3\t\3\t\3\t\7\t\\\n\t\f\t\16\t_\13\t\3\n\3\n"+
		"\5\nc\n\n\3\13\3\13\3\f\6\fh\n\f\r\f\16\fi\3\r\3\r\5\rn\n\r\3\16\3\16"+
		"\3\17\5\17s\n\17\3\17\6\17v\n\17\r\17\16\17w\3\20\3\20\3\20\5\20}\n\20"+
		"\3\21\6\21\u0080\n\21\r\21\16\21\u0081\3\22\3\22\3\22\3\23\3\23\3\23\7"+
		"\23\u008a\n\23\f\23\16\23\u008d\13\23\3\23\3\23\3\24\3\24\3\24\7\24\u0094"+
		"\n\24\f\24\16\24\u0097\13\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25\u009f"+
		"\n\25\f\25\16\25\u00a2\13\25\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(\2\3\3\2\25\26\2\u00a6\2,\3\2\2\2\4.\3\2\2\2\6"+
		"<\3\2\2\2\b>\3\2\2\2\nH\3\2\2\2\fL\3\2\2\2\16P\3\2\2\2\20X\3\2\2\2\22"+
		"b\3\2\2\2\24d\3\2\2\2\26g\3\2\2\2\30m\3\2\2\2\32o\3\2\2\2\34u\3\2\2\2"+
		"\36|\3\2\2\2 \177\3\2\2\2\"\u0083\3\2\2\2$\u0086\3\2\2\2&\u0090\3\2\2"+
		"\2(\u009a\3\2\2\2*-\5\6\4\2+-\5\4\3\2,*\3\2\2\2,+\3\2\2\2-\3\3\2\2\2."+
		"/\5\26\f\2/\63\7\3\2\2\60\62\5\6\4\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7\4\2\2\67\5"+
		"\3\2\2\28=\5\f\7\29:\5\26\f\2:;\5\b\5\2;=\3\2\2\2<8\3\2\2\2<9\3\2\2\2"+
		"=\7\3\2\2\2>B\7\5\2\2?A\5\n\6\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2"+
		"\2CE\3\2\2\2DB\3\2\2\2EF\5\f\7\2FG\7\6\2\2G\t\3\2\2\2HI\7\7\2\2IJ\5\20"+
		"\t\2JK\7\3\2\2K\13\3\2\2\2LM\5\16\b\2MN\7\7\2\2NO\5\20\t\2O\r\3\2\2\2"+
		"PU\5\30\r\2QR\7\b\2\2RT\5\30\r\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2"+
		"\2V\17\3\2\2\2WU\3\2\2\2X]\5\22\n\2YZ\7\b\2\2Z\\\5\22\n\2[Y\3\2\2\2\\"+
		"_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\21\3\2\2\2_]\3\2\2\2`c\5\24\13\2ac\5$\23"+
		"\2b`\3\2\2\2ba\3\2\2\2c\23\3\2\2\2de\5 \21\2e\25\3\2\2\2fh\5\30\r\2gf"+
		"\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\27\3\2\2\2kn\5 \21\2ln\5&\24\2"+
		"mk\3\2\2\2ml\3\2\2\2n\31\3\2\2\2op\t\2\2\2p\33\3\2\2\2qs\7\27\2\2rq\3"+
		"\2\2\2rs\3\2\2\2st\3\2\2\2tv\5\32\16\2ur\3\2\2\2vw\3\2\2\2wu\3\2\2\2w"+
		"x\3\2\2\2x\35\3\2\2\2y}\7\30\2\2z}\5\34\17\2{}\5(\25\2|y\3\2\2\2|z\3\2"+
		"\2\2|{\3\2\2\2}\37\3\2\2\2~\u0080\7\17\2\2\177~\3\2\2\2\u0080\u0081\3"+
		"\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082!\3\2\2\2\u0083\u0084"+
		"\7\t\2\2\u0084\u0085\7\17\2\2\u0085#\3\2\2\2\u0086\u008b\7\n\2\2\u0087"+
		"\u008a\7\33\2\2\u0088\u008a\5\"\22\2\u0089\u0087\3\2\2\2\u0089\u0088\3"+
		"\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\13\2\2\u008f%\3\2\2\2"+
		"\u0090\u0095\7\f\2\2\u0091\u0094\7\32\2\2\u0092\u0094\5\"\22\2\u0093\u0091"+
		"\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\f"+
		"\2\2\u0099\'\3\2\2\2\u009a\u00a0\7\r\2\2\u009b\u009f\7\34\2\2\u009c\u009f"+
		"\5\"\22\2\u009d\u009f\5(\25\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2"+
		"\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\16\2\2"+
		"\u00a4)\3\2\2\2\25,\63<BU]bimrw|\u0081\u0089\u008b\u0093\u0095\u009e\u00a0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}