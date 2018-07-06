// Generated from rcs/RCS.g4 by ANTLR 4.7.1
package parsers.rcs;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RCSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, BRANCH=2, LOGS=3, ADMIN=4, DELTAS=5, LITERAL_HEAD=6, LITERAL_BRANCH=7, 
		LITERAL_ACCESS=8, LITERAL_SYMBOLS=9, LITERAL_LOCKS=10, LITERAL_STRICT=11, 
		LITERAL_COMMENT=12, LITERAL_EXPAND=13, LITERAL_DATE=14, LITERAL_AUTHOR=15, 
		LITERAL_STATE=16, LITERAL_BRANCHES=17, LITERAL_NEXT=18, LITERAL_DESC=19, 
		LITERAL_LOG=20, LITERAL_TEXT=21, IDENT=22, INT=23, REVISION=24, STRING=25, 
		SEMI=26, COLON=27, WS=28;
	public static final int
		RULE_rcstext = 0, RULE_rcsheader = 1, RULE_rcsrevisions = 2, RULE_admin = 3, 
		RULE_head = 4, RULE_branch = 5, RULE_access = 6, RULE_symbols = 7, RULE_tags = 8, 
		RULE_locks = 9, RULE_strict = 10, RULE_comment = 11, RULE_expand = 12, 
		RULE_deltalist = 13, RULE_delta = 14, RULE_delta_date = 15, RULE_delta_author = 16, 
		RULE_delta_state = 17, RULE_delta_branches = 18, RULE_delta_next = 19, 
		RULE_desc = 20, RULE_deltatextlist = 21, RULE_deltatext = 22, RULE_deltatext_log = 23, 
		RULE_deltatext_text = 24, RULE_newphrase = 25;
	public static final String[] ruleNames = {
		"rcstext", "rcsheader", "rcsrevisions", "admin", "head", "branch", "access", 
		"symbols", "tags", "locks", "strict", "comment", "expand", "deltalist", 
		"delta", "delta_date", "delta_author", "delta_state", "delta_branches", 
		"delta_next", "desc", "deltatextlist", "deltatext", "deltatext_log", "deltatext_text", 
		"newphrase"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'COMMA'", "'BRANCH'", "'LOGS'", "'ADMIN'", "'DELTAS'", "'head'", 
		"'branch'", "'access'", "'symbols'", "'locks'", "'strict'", "'comment'", 
		"'expand'", "'date'", "'author'", "'state'", "'branches'", "'next'", "'desc'", 
		"'log'", "'text'", null, null, null, null, "';'", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMA", "BRANCH", "LOGS", "ADMIN", "DELTAS", "LITERAL_HEAD", "LITERAL_BRANCH", 
		"LITERAL_ACCESS", "LITERAL_SYMBOLS", "LITERAL_LOCKS", "LITERAL_STRICT", 
		"LITERAL_COMMENT", "LITERAL_EXPAND", "LITERAL_DATE", "LITERAL_AUTHOR", 
		"LITERAL_STATE", "LITERAL_BRANCHES", "LITERAL_NEXT", "LITERAL_DESC", "LITERAL_LOG", 
		"LITERAL_TEXT", "IDENT", "INT", "REVISION", "STRING", "SEMI", "COLON", 
		"WS"
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
	public String getGrammarFileName() { return "RCS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RCSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RcstextContext extends ParserRuleContext {
		public AdminContext admin() {
			return getRuleContext(AdminContext.class,0);
		}
		public DeltalistContext deltalist() {
			return getRuleContext(DeltalistContext.class,0);
		}
		public DescContext desc() {
			return getRuleContext(DescContext.class,0);
		}
		public DeltatextlistContext deltatextlist() {
			return getRuleContext(DeltatextlistContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RCSParser.EOF, 0); }
		public RcstextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rcstext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterRcstext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitRcstext(this);
		}
	}

	public final RcstextContext rcstext() throws RecognitionException {
		RcstextContext _localctx = new RcstextContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_rcstext);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			admin();
			setState(53);
			deltalist();
			setState(54);
			desc();
			setState(55);
			deltatextlist();
			setState(56);
			match(EOF);
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

	public static class RcsheaderContext extends ParserRuleContext {
		public AdminContext admin() {
			return getRuleContext(AdminContext.class,0);
		}
		public RcsheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rcsheader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterRcsheader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitRcsheader(this);
		}
	}

	public final RcsheaderContext rcsheader() throws RecognitionException {
		RcsheaderContext _localctx = new RcsheaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rcsheader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			admin();
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

	public static class RcsrevisionsContext extends ParserRuleContext {
		public AdminContext admin() {
			return getRuleContext(AdminContext.class,0);
		}
		public DeltalistContext deltalist() {
			return getRuleContext(DeltalistContext.class,0);
		}
		public RcsrevisionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rcsrevisions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterRcsrevisions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitRcsrevisions(this);
		}
	}

	public final RcsrevisionsContext rcsrevisions() throws RecognitionException {
		RcsrevisionsContext _localctx = new RcsrevisionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rcsrevisions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			admin();
			setState(61);
			deltalist();
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

	public static class AdminContext extends ParserRuleContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public AccessContext access() {
			return getRuleContext(AccessContext.class,0);
		}
		public SymbolsContext symbols() {
			return getRuleContext(SymbolsContext.class,0);
		}
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public LocksContext locks() {
			return getRuleContext(LocksContext.class,0);
		}
		public StrictContext strict() {
			return getRuleContext(StrictContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ExpandContext expand() {
			return getRuleContext(ExpandContext.class,0);
		}
		public List<NewphraseContext> newphrase() {
			return getRuleContexts(NewphraseContext.class);
		}
		public NewphraseContext newphrase(int i) {
			return getRuleContext(NewphraseContext.class,i);
		}
		public AdminContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_admin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterAdmin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitAdmin(this);
		}
	}

	public final AdminContext admin() throws RecognitionException {
		AdminContext _localctx = new AdminContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_admin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			head();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL_BRANCH) {
				{
				setState(64);
				branch();
				}
			}

			setState(67);
			access();
			setState(68);
			symbols();
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL_LOCKS) {
				{
				setState(69);
				locks();
				}
			}

			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL_STRICT) {
				{
				setState(72);
				strict();
				}
			}

			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL_COMMENT) {
				{
				setState(75);
				comment();
				}
			}

			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL_EXPAND) {
				{
				setState(78);
				expand();
				}
			}

			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(81);
				newphrase();
				}
				}
				setState(86);
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

	public static class HeadContext extends ParserRuleContext {
		public TerminalNode LITERAL_HEAD() { return getToken(RCSParser.LITERAL_HEAD, 0); }
		public TerminalNode REVISION() { return getToken(RCSParser.REVISION, 0); }
		public TerminalNode SEMI() { return getToken(RCSParser.SEMI, 0); }
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitHead(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(LITERAL_HEAD);
			setState(88);
			match(REVISION);
			setState(89);
			match(SEMI);
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

	public static class BranchContext extends ParserRuleContext {
		public TerminalNode LITERAL_BRANCH() { return getToken(RCSParser.LITERAL_BRANCH, 0); }
		public TerminalNode BRANCH() { return getToken(RCSParser.BRANCH, 0); }
		public TerminalNode SEMI() { return getToken(RCSParser.SEMI, 0); }
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitBranch(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_branch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(LITERAL_BRANCH);
			setState(92);
			match(BRANCH);
			setState(93);
			match(SEMI);
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

	public static class AccessContext extends ParserRuleContext {
		public TerminalNode LITERAL_ACCESS() { return getToken(RCSParser.LITERAL_ACCESS, 0); }
		public TerminalNode SEMI() { return getToken(RCSParser.SEMI, 0); }
		public List<TerminalNode> IDENT() { return getTokens(RCSParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(RCSParser.IDENT, i);
		}
		public AccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitAccess(this);
		}
	}

	public final AccessContext access() throws RecognitionException {
		AccessContext _localctx = new AccessContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(LITERAL_ACCESS);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(96);
				match(IDENT);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(SEMI);
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

	public static class SymbolsContext extends ParserRuleContext {
		public TerminalNode LITERAL_SYMBOLS() { return getToken(RCSParser.LITERAL_SYMBOLS, 0); }
		public TerminalNode SEMI() { return getToken(RCSParser.SEMI, 0); }
		public List<TagsContext> tags() {
			return getRuleContexts(TagsContext.class);
		}
		public TagsContext tags(int i) {
			return getRuleContext(TagsContext.class,i);
		}
		public SymbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterSymbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitSymbols(this);
		}
	}

	public final SymbolsContext symbols() throws RecognitionException {
		SymbolsContext _localctx = new SymbolsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_symbols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(LITERAL_SYMBOLS);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(105);
				tags();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(SEMI);
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

	public static class TagsContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(RCSParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(RCSParser.COLON, 0); }
		public TerminalNode REVISION() { return getToken(RCSParser.REVISION, 0); }
		public TagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterTags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitTags(this);
		}
	}

	public final TagsContext tags() throws RecognitionException {
		TagsContext _localctx = new TagsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tags);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(IDENT);
			setState(114);
			match(COLON);
			setState(115);
			match(REVISION);
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

	public static class LocksContext extends ParserRuleContext {
		public TerminalNode LITERAL_LOCKS() { return getToken(RCSParser.LITERAL_LOCKS, 0); }
		public TerminalNode SEMI() { return getToken(RCSParser.SEMI, 0); }
		public List<TerminalNode> IDENT() { return getTokens(RCSParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(RCSParser.IDENT, i);
		}
		public LocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterLocks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitLocks(this);
		}
	}

	public final LocksContext locks() throws RecognitionException {
		LocksContext _localctx = new LocksContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_locks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(LITERAL_LOCKS);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(118);
				match(IDENT);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(SEMI);
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

	public static class StrictContext extends ParserRuleContext {
		public TerminalNode LITERAL_STRICT() { return getToken(RCSParser.LITERAL_STRICT, 0); }
		public TerminalNode SEMI() { return getToken(RCSParser.SEMI, 0); }
		public StrictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterStrict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitStrict(this);
		}
	}

	public final StrictContext strict() throws RecognitionException {
		StrictContext _localctx = new StrictContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_strict);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LITERAL_STRICT);
			setState(127);
			match(SEMI);
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
		public TerminalNode LITERAL_COMMENT() { return getToken(RCSParser.LITERAL_COMMENT, 0); }
		public TerminalNode SEMI() { return getToken(RCSParser.SEMI, 0); }
		public TerminalNode STRING() { return getToken(RCSParser.STRING, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(LITERAL_COMMENT);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(130);
				match(STRING);
				}
			}

			setState(133);
			match(SEMI);
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

	public static class ExpandContext extends ParserRuleContext {
		public TerminalNode LITERAL_EXPAND() { return getToken(RCSParser.LITERAL_EXPAND, 0); }
		public TerminalNode SEMI() { return getToken(RCSParser.SEMI, 0); }
		public TerminalNode STRING() { return getToken(RCSParser.STRING, 0); }
		public ExpandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterExpand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitExpand(this);
		}
	}

	public final ExpandContext expand() throws RecognitionException {
		ExpandContext _localctx = new ExpandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(LITERAL_EXPAND);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(136);
				match(STRING);
				}
			}

			setState(139);
			match(SEMI);
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

	public static class DeltalistContext extends ParserRuleContext {
		public List<DeltaContext> delta() {
			return getRuleContexts(DeltaContext.class);
		}
		public DeltaContext delta(int i) {
			return getRuleContext(DeltaContext.class,i);
		}
		public DeltalistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deltalist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterDeltalist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitDeltalist(this);
		}
	}

	public final DeltalistContext deltalist() throws RecognitionException {
		DeltalistContext _localctx = new DeltalistContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_deltalist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REVISION) {
				{
				{
				setState(141);
				delta();
				}
				}
				setState(146);
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

	public static class DeltaContext extends ParserRuleContext {
		public TerminalNode REVISION() { return getToken(RCSParser.REVISION, 0); }
		public Delta_dateContext delta_date() {
			return getRuleContext(Delta_dateContext.class,0);
		}
		public Delta_authorContext delta_author() {
			return getRuleContext(Delta_authorContext.class,0);
		}
		public Delta_stateContext delta_state() {
			return getRuleContext(Delta_stateContext.class,0);
		}
		public Delta_branchesContext delta_branches() {
			return getRuleContext(Delta_branchesContext.class,0);
		}
		public Delta_nextContext delta_next() {
			return getRuleContext(Delta_nextContext.class,0);
		}
		public List<NewphraseContext> newphrase() {
			return getRuleContexts(NewphraseContext.class);
		}
		public NewphraseContext newphrase(int i) {
			return getRuleContext(NewphraseContext.class,i);
		}
		public DeltaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterDelta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitDelta(this);
		}
	}

	public final DeltaContext delta() throws RecognitionException {
		DeltaContext _localctx = new DeltaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_delta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(REVISION);
			setState(148);
			delta_date();
			setState(149);
			delta_author();
			setState(150);
			delta_state();
			setState(151);
			delta_branches();
			setState(152);
			delta_next();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(153);
				newphrase();
				}
				}
				setState(158);
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

	public static class Delta_dateContext extends ParserRuleContext {
		public TerminalNode LITERAL_DATE() { return getToken(RCSParser.LITERAL_DATE, 0); }
		public TerminalNode REVISION() { return getToken(RCSParser.REVISION, 0); }
		public TerminalNode SEMI() { return getToken(RCSParser.SEMI, 0); }
		public Delta_dateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delta_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterDelta_date(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitDelta_date(this);
		}
	}

	public final Delta_dateContext delta_date() throws RecognitionException {
		Delta_dateContext _localctx = new Delta_dateContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_delta_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(LITERAL_DATE);
			setState(160);
			match(REVISION);
			setState(161);
			match(SEMI);
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

	public static class Delta_authorContext extends ParserRuleContext {
		public TerminalNode LITERAL_AUTHOR() { return getToken(RCSParser.LITERAL_AUTHOR, 0); }
		public TerminalNode IDENT() { return getToken(RCSParser.IDENT, 0); }
		public TerminalNode SEMI() { return getToken(RCSParser.SEMI, 0); }
		public Delta_authorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delta_author; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterDelta_author(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitDelta_author(this);
		}
	}

	public final Delta_authorContext delta_author() throws RecognitionException {
		Delta_authorContext _localctx = new Delta_authorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_delta_author);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(LITERAL_AUTHOR);
			setState(164);
			match(IDENT);
			setState(165);
			match(SEMI);
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

	public static class Delta_stateContext extends ParserRuleContext {
		public TerminalNode LITERAL_STATE() { return getToken(RCSParser.LITERAL_STATE, 0); }
		public TerminalNode IDENT() { return getToken(RCSParser.IDENT, 0); }
		public TerminalNode SEMI() { return getToken(RCSParser.SEMI, 0); }
		public Delta_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delta_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterDelta_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitDelta_state(this);
		}
	}

	public final Delta_stateContext delta_state() throws RecognitionException {
		Delta_stateContext _localctx = new Delta_stateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_delta_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(LITERAL_STATE);
			setState(168);
			match(IDENT);
			setState(169);
			match(SEMI);
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

	public static class Delta_branchesContext extends ParserRuleContext {
		public TerminalNode LITERAL_BRANCHES() { return getToken(RCSParser.LITERAL_BRANCHES, 0); }
		public TerminalNode SEMI() { return getToken(RCSParser.SEMI, 0); }
		public List<TerminalNode> REVISION() { return getTokens(RCSParser.REVISION); }
		public TerminalNode REVISION(int i) {
			return getToken(RCSParser.REVISION, i);
		}
		public Delta_branchesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delta_branches; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterDelta_branches(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitDelta_branches(this);
		}
	}

	public final Delta_branchesContext delta_branches() throws RecognitionException {
		Delta_branchesContext _localctx = new Delta_branchesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_delta_branches);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(LITERAL_BRANCHES);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REVISION) {
				{
				{
				setState(172);
				match(REVISION);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(SEMI);
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

	public static class Delta_nextContext extends ParserRuleContext {
		public TerminalNode LITERAL_NEXT() { return getToken(RCSParser.LITERAL_NEXT, 0); }
		public TerminalNode SEMI() { return getToken(RCSParser.SEMI, 0); }
		public TerminalNode REVISION() { return getToken(RCSParser.REVISION, 0); }
		public Delta_nextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delta_next; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterDelta_next(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitDelta_next(this);
		}
	}

	public final Delta_nextContext delta_next() throws RecognitionException {
		Delta_nextContext _localctx = new Delta_nextContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_delta_next);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(LITERAL_NEXT);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REVISION) {
				{
				setState(181);
				match(REVISION);
				}
			}

			setState(184);
			match(SEMI);
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

	public static class DescContext extends ParserRuleContext {
		public TerminalNode LITERAL_DESC() { return getToken(RCSParser.LITERAL_DESC, 0); }
		public TerminalNode STRING() { return getToken(RCSParser.STRING, 0); }
		public DescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitDesc(this);
		}
	}

	public final DescContext desc() throws RecognitionException {
		DescContext _localctx = new DescContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_desc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(LITERAL_DESC);
			setState(187);
			match(STRING);
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

	public static class DeltatextlistContext extends ParserRuleContext {
		public List<DeltatextContext> deltatext() {
			return getRuleContexts(DeltatextContext.class);
		}
		public DeltatextContext deltatext(int i) {
			return getRuleContext(DeltatextContext.class,i);
		}
		public DeltatextlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deltatextlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterDeltatextlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitDeltatextlist(this);
		}
	}

	public final DeltatextlistContext deltatextlist() throws RecognitionException {
		DeltatextlistContext _localctx = new DeltatextlistContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_deltatextlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REVISION) {
				{
				{
				setState(189);
				deltatext();
				}
				}
				setState(194);
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

	public static class DeltatextContext extends ParserRuleContext {
		public TerminalNode REVISION() { return getToken(RCSParser.REVISION, 0); }
		public Deltatext_logContext deltatext_log() {
			return getRuleContext(Deltatext_logContext.class,0);
		}
		public Deltatext_textContext deltatext_text() {
			return getRuleContext(Deltatext_textContext.class,0);
		}
		public List<NewphraseContext> newphrase() {
			return getRuleContexts(NewphraseContext.class);
		}
		public NewphraseContext newphrase(int i) {
			return getRuleContext(NewphraseContext.class,i);
		}
		public DeltatextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deltatext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterDeltatext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitDeltatext(this);
		}
	}

	public final DeltatextContext deltatext() throws RecognitionException {
		DeltatextContext _localctx = new DeltatextContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_deltatext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(REVISION);
			setState(196);
			deltatext_log();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(197);
				newphrase();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
			deltatext_text();
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

	public static class Deltatext_logContext extends ParserRuleContext {
		public TerminalNode LITERAL_LOG() { return getToken(RCSParser.LITERAL_LOG, 0); }
		public TerminalNode STRING() { return getToken(RCSParser.STRING, 0); }
		public Deltatext_logContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deltatext_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterDeltatext_log(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitDeltatext_log(this);
		}
	}

	public final Deltatext_logContext deltatext_log() throws RecognitionException {
		Deltatext_logContext _localctx = new Deltatext_logContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_deltatext_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(LITERAL_LOG);
			setState(206);
			match(STRING);
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

	public static class Deltatext_textContext extends ParserRuleContext {
		public TerminalNode LITERAL_TEXT() { return getToken(RCSParser.LITERAL_TEXT, 0); }
		public TerminalNode STRING() { return getToken(RCSParser.STRING, 0); }
		public Deltatext_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deltatext_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterDeltatext_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitDeltatext_text(this);
		}
	}

	public final Deltatext_textContext deltatext_text() throws RecognitionException {
		Deltatext_textContext _localctx = new Deltatext_textContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_deltatext_text);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(LITERAL_TEXT);
			setState(209);
			match(STRING);
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

	public static class NewphraseContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(RCSParser.SEMI, 0); }
		public List<TerminalNode> IDENT() { return getTokens(RCSParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(RCSParser.IDENT, i);
		}
		public NewphraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newphrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).enterNewphrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RCSListener ) ((RCSListener)listener).exitNewphrase(this);
		}
	}

	public final NewphraseContext newphrase() throws RecognitionException {
		NewphraseContext _localctx = new NewphraseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_newphrase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				match(IDENT);
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			setState(216);
			match(SEMI);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00dd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3"+
		"\5\5\5D\n\5\3\5\3\5\3\5\5\5I\n\5\3\5\5\5L\n\5\3\5\5\5O\n\5\3\5\5\5R\n"+
		"\5\3\5\7\5U\n\5\f\5\16\5X\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\7\bd\n\b\f\b\16\bg\13\b\3\b\3\b\3\t\3\t\7\tm\n\t\f\t\16\tp\13\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\13\3\13\7\13z\n\13\f\13\16\13}\13\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\5\r\u0086\n\r\3\r\3\r\3\16\3\16\5\16\u008c\n\16\3\16"+
		"\3\16\3\17\7\17\u0091\n\17\f\17\16\17\u0094\13\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u009d\n\20\f\20\16\20\u00a0\13\20\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\7\24\u00b0\n\24"+
		"\f\24\16\24\u00b3\13\24\3\24\3\24\3\25\3\25\5\25\u00b9\n\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\7\27\u00c1\n\27\f\27\16\27\u00c4\13\27\3\30\3\30"+
		"\3\30\7\30\u00c9\n\30\f\30\16\30\u00cc\13\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\33\6\33\u00d7\n\33\r\33\16\33\u00d8\3\33\3\33\3\33\2"+
		"\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\2\2\u00d4"+
		"\2\66\3\2\2\2\4<\3\2\2\2\6>\3\2\2\2\bA\3\2\2\2\nY\3\2\2\2\f]\3\2\2\2\16"+
		"a\3\2\2\2\20j\3\2\2\2\22s\3\2\2\2\24w\3\2\2\2\26\u0080\3\2\2\2\30\u0083"+
		"\3\2\2\2\32\u0089\3\2\2\2\34\u0092\3\2\2\2\36\u0095\3\2\2\2 \u00a1\3\2"+
		"\2\2\"\u00a5\3\2\2\2$\u00a9\3\2\2\2&\u00ad\3\2\2\2(\u00b6\3\2\2\2*\u00bc"+
		"\3\2\2\2,\u00c2\3\2\2\2.\u00c5\3\2\2\2\60\u00cf\3\2\2\2\62\u00d2\3\2\2"+
		"\2\64\u00d6\3\2\2\2\66\67\5\b\5\2\678\5\34\17\289\5*\26\29:\5,\27\2:;"+
		"\7\2\2\3;\3\3\2\2\2<=\5\b\5\2=\5\3\2\2\2>?\5\b\5\2?@\5\34\17\2@\7\3\2"+
		"\2\2AC\5\n\6\2BD\5\f\7\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\5\16\b\2FH\5"+
		"\20\t\2GI\5\24\13\2HG\3\2\2\2HI\3\2\2\2IK\3\2\2\2JL\5\26\f\2KJ\3\2\2\2"+
		"KL\3\2\2\2LN\3\2\2\2MO\5\30\r\2NM\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PR\5\32\16"+
		"\2QP\3\2\2\2QR\3\2\2\2RV\3\2\2\2SU\5\64\33\2TS\3\2\2\2UX\3\2\2\2VT\3\2"+
		"\2\2VW\3\2\2\2W\t\3\2\2\2XV\3\2\2\2YZ\7\b\2\2Z[\7\32\2\2[\\\7\34\2\2\\"+
		"\13\3\2\2\2]^\7\t\2\2^_\7\4\2\2_`\7\34\2\2`\r\3\2\2\2ae\7\n\2\2bd\7\30"+
		"\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\34"+
		"\2\2i\17\3\2\2\2jn\7\13\2\2km\5\22\n\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2n"+
		"o\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\34\2\2r\21\3\2\2\2st\7\30\2\2tu\7\35"+
		"\2\2uv\7\32\2\2v\23\3\2\2\2w{\7\f\2\2xz\7\30\2\2yx\3\2\2\2z}\3\2\2\2{"+
		"y\3\2\2\2{|\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\7\34\2\2\177\25\3\2\2\2\u0080"+
		"\u0081\7\r\2\2\u0081\u0082\7\34\2\2\u0082\27\3\2\2\2\u0083\u0085\7\16"+
		"\2\2\u0084\u0086\7\33\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\7\34\2\2\u0088\31\3\2\2\2\u0089\u008b\7\17"+
		"\2\2\u008a\u008c\7\33\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008d\3\2\2\2\u008d\u008e\7\34\2\2\u008e\33\3\2\2\2\u008f\u0091\5\36"+
		"\20\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\35\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7\32\2"+
		"\2\u0096\u0097\5 \21\2\u0097\u0098\5\"\22\2\u0098\u0099\5$\23\2\u0099"+
		"\u009a\5&\24\2\u009a\u009e\5(\25\2\u009b\u009d\5\64\33\2\u009c\u009b\3"+
		"\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\37\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7\20\2\2\u00a2\u00a3\7\32"+
		"\2\2\u00a3\u00a4\7\34\2\2\u00a4!\3\2\2\2\u00a5\u00a6\7\21\2\2\u00a6\u00a7"+
		"\7\30\2\2\u00a7\u00a8\7\34\2\2\u00a8#\3\2\2\2\u00a9\u00aa\7\22\2\2\u00aa"+
		"\u00ab\7\30\2\2\u00ab\u00ac\7\34\2\2\u00ac%\3\2\2\2\u00ad\u00b1\7\23\2"+
		"\2\u00ae\u00b0\7\32\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b4\u00b5\7\34\2\2\u00b5\'\3\2\2\2\u00b6\u00b8\7\24\2\2\u00b7\u00b9"+
		"\7\32\2\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3\2\2\2"+
		"\u00ba\u00bb\7\34\2\2\u00bb)\3\2\2\2\u00bc\u00bd\7\25\2\2\u00bd\u00be"+
		"\7\33\2\2\u00be+\3\2\2\2\u00bf\u00c1\5.\30\2\u00c0\u00bf\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3-\3\2\2\2"+
		"\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7\32\2\2\u00c6\u00ca\5\60\31\2\u00c7"+
		"\u00c9\5\64\33\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3"+
		"\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00ce\5\62\32\2\u00ce/\3\2\2\2\u00cf\u00d0\7\26\2\2\u00d0\u00d1\7\33"+
		"\2\2\u00d1\61\3\2\2\2\u00d2\u00d3\7\27\2\2\u00d3\u00d4\7\33\2\2\u00d4"+
		"\63\3\2\2\2\u00d5\u00d7\7\30\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2"+
		"\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db"+
		"\7\34\2\2\u00db\65\3\2\2\2\24CHKNQVen{\u0085\u008b\u0092\u009e\u00b1\u00b8"+
		"\u00c2\u00ca\u00d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}