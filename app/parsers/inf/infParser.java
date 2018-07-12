// Generated from inf/inf.g4 by ANTLR 4.7.1
package parsers.inf;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class infParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, CHARS=5, STRING=6, COMMENT=7, EOL=8, WS=9;
	public static final int
		RULE_inf = 0, RULE_section = 1, RULE_sectionheader = 2, RULE_string = 3, 
		RULE_line = 4, RULE_stringlist = 5;
	public static final String[] ruleNames = {
		"inf", "section", "sectionheader", "string", "line", "stringlist"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'='", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "CHARS", "STRING", "COMMENT", "EOL", "WS"
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
	public String getGrammarFileName() { return "inf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public infParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InfContext extends ParserRuleContext {
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(infParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(infParser.EOL, i);
		}
		public InfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof infListener ) ((infListener)listener).enterInf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof infListener ) ((infListener)listener).exitInf(this);
		}
	}

	public final InfContext inf() throws RecognitionException {
		InfContext _localctx = new InfContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==EOL) {
				{
				setState(14);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(12);
					section();
					}
					break;
				case EOL:
					{
					setState(13);
					match(EOL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(18);
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

	public static class SectionContext extends ParserRuleContext {
		public SectionheaderContext sectionheader() {
			return getRuleContext(SectionheaderContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof infListener ) ((infListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof infListener ) ((infListener)listener).exitSection(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			sectionheader();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARS || _la==STRING) {
				{
				{
				setState(20);
				line();
				}
				}
				setState(25);
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

	public static class SectionheaderContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode EOL() { return getToken(infParser.EOL, 0); }
		public SectionheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionheader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof infListener ) ((infListener)listener).enterSectionheader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof infListener ) ((infListener)listener).exitSectionheader(this);
		}
	}

	public final SectionheaderContext sectionheader() throws RecognitionException {
		SectionheaderContext _localctx = new SectionheaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sectionheader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			string();
			setState(28);
			match(T__1);
			setState(29);
			match(EOL);
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode CHARS() { return getToken(infParser.CHARS, 0); }
		public TerminalNode STRING() { return getToken(infParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof infListener ) ((infListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof infListener ) ((infListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_la = _input.LA(1);
			if ( !(_la==CHARS || _la==STRING) ) {
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

	public static class LineContext extends ParserRuleContext {
		public List<StringlistContext> stringlist() {
			return getRuleContexts(StringlistContext.class);
		}
		public StringlistContext stringlist(int i) {
			return getRuleContext(StringlistContext.class,i);
		}
		public TerminalNode EOL() { return getToken(infParser.EOL, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof infListener ) ((infListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof infListener ) ((infListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			stringlist();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(34);
				match(T__2);
				setState(35);
				stringlist();
				}
			}

			setState(38);
			match(EOL);
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

	public static class StringlistContext extends ParserRuleContext {
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public StringlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof infListener ) ((infListener)listener).enterStringlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof infListener ) ((infListener)listener).exitStringlist(this);
		}
	}

	public final StringlistContext stringlist() throws RecognitionException {
		StringlistContext _localctx = new StringlistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stringlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			string();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(41);
				match(T__3);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CHARS || _la==STRING) {
					{
					setState(42);
					string();
					}
				}

				}
				}
				setState(49);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\65\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13"+
		"\2\3\3\3\3\7\3\30\n\3\f\3\16\3\33\13\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\6\5\6\'\n\6\3\6\3\6\3\7\3\7\3\7\5\7.\n\7\7\7\60\n\7\f\7\16\7\63"+
		"\13\7\3\7\2\2\b\2\4\6\b\n\f\2\3\3\2\7\b\2\64\2\22\3\2\2\2\4\25\3\2\2\2"+
		"\6\34\3\2\2\2\b!\3\2\2\2\n#\3\2\2\2\f*\3\2\2\2\16\21\5\4\3\2\17\21\7\n"+
		"\2\2\20\16\3\2\2\2\20\17\3\2\2\2\21\24\3\2\2\2\22\20\3\2\2\2\22\23\3\2"+
		"\2\2\23\3\3\2\2\2\24\22\3\2\2\2\25\31\5\6\4\2\26\30\5\n\6\2\27\26\3\2"+
		"\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\5\3\2\2\2\33\31\3\2"+
		"\2\2\34\35\7\3\2\2\35\36\5\b\5\2\36\37\7\4\2\2\37 \7\n\2\2 \7\3\2\2\2"+
		"!\"\t\2\2\2\"\t\3\2\2\2#&\5\f\7\2$%\7\5\2\2%\'\5\f\7\2&$\3\2\2\2&\'\3"+
		"\2\2\2\'(\3\2\2\2()\7\n\2\2)\13\3\2\2\2*\61\5\b\5\2+-\7\6\2\2,.\5\b\5"+
		"\2-,\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/+\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2"+
		"\61\62\3\2\2\2\62\r\3\2\2\2\63\61\3\2\2\2\b\20\22\31&-\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}