// Generated from cookie/cookie.g4 by ANTLR 4.7.1
package parsers.cookie;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class cookieParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, STRING=3, TOKEN=4, DIGIT=5, WS=6;
	public static final int
		RULE_cookie = 0, RULE_name = 1, RULE_av_pairs = 2, RULE_av_pair = 3, RULE_attr = 4, 
		RULE_value = 5, RULE_word = 6, RULE_token = 7, RULE_quoted_string = 8;
	public static final String[] ruleNames = {
		"cookie", "name", "av_pairs", "av_pair", "attr", "value", "word", "token", 
		"quoted_string"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "STRING", "TOKEN", "DIGIT", "WS"
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
	public String getGrammarFileName() { return "cookie.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cookieParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CookieContext extends ParserRuleContext {
		public List<Av_pairsContext> av_pairs() {
			return getRuleContexts(Av_pairsContext.class);
		}
		public Av_pairsContext av_pairs(int i) {
			return getRuleContext(Av_pairsContext.class,i);
		}
		public CookieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cookie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cookieListener ) ((cookieListener)listener).enterCookie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cookieListener ) ((cookieListener)listener).exitCookie(this);
		}
	}

	public final CookieContext cookie() throws RecognitionException {
		CookieContext _localctx = new CookieContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cookie);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN) {
				{
				{
				setState(18);
				av_pairs();
				}
				}
				setState(23);
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

	public static class NameContext extends ParserRuleContext {
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cookieListener ) ((cookieListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cookieListener ) ((cookieListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			attr();
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

	public static class Av_pairsContext extends ParserRuleContext {
		public List<Av_pairContext> av_pair() {
			return getRuleContexts(Av_pairContext.class);
		}
		public Av_pairContext av_pair(int i) {
			return getRuleContext(Av_pairContext.class,i);
		}
		public Av_pairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_av_pairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cookieListener ) ((cookieListener)listener).enterAv_pairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cookieListener ) ((cookieListener)listener).exitAv_pairs(this);
		}
	}

	public final Av_pairsContext av_pairs() throws RecognitionException {
		Av_pairsContext _localctx = new Av_pairsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_av_pairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			av_pair();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(27);
				match(T__0);
				setState(28);
				av_pair();
				}
				}
				setState(33);
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

	public static class Av_pairContext extends ParserRuleContext {
		public AttrContext attr() {
			return getRuleContext(AttrContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Av_pairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_av_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cookieListener ) ((cookieListener)listener).enterAv_pair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cookieListener ) ((cookieListener)listener).exitAv_pair(this);
		}
	}

	public final Av_pairContext av_pair() throws RecognitionException {
		Av_pairContext _localctx = new Av_pairContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_av_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			attr();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(35);
				match(T__1);
				setState(36);
				value();
				}
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

	public static class AttrContext extends ParserRuleContext {
		public TokenContext token() {
			return getRuleContext(TokenContext.class,0);
		}
		public AttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cookieListener ) ((cookieListener)listener).enterAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cookieListener ) ((cookieListener)listener).exitAttr(this);
		}
	}

	public final AttrContext attr() throws RecognitionException {
		AttrContext _localctx = new AttrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			token();
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

	public static class ValueContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cookieListener ) ((cookieListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cookieListener ) ((cookieListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			word();
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
		public TokenContext token() {
			return getRuleContext(TokenContext.class,0);
		}
		public Quoted_stringContext quoted_string() {
			return getRuleContext(Quoted_stringContext.class,0);
		}
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cookieListener ) ((cookieListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cookieListener ) ((cookieListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_word);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				token();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				quoted_string();
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

	public static class TokenContext extends ParserRuleContext {
		public TerminalNode TOKEN() { return getToken(cookieParser.TOKEN, 0); }
		public TokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cookieListener ) ((cookieListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cookieListener ) ((cookieListener)listener).exitToken(this);
		}
	}

	public final TokenContext token() throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(TOKEN);
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

	public static class Quoted_stringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(cookieParser.STRING, 0); }
		public Quoted_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quoted_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cookieListener ) ((cookieListener)listener).enterQuoted_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cookieListener ) ((cookieListener)listener).exitQuoted_string(this);
		}
	}

	public final Quoted_stringContext quoted_string() throws RecognitionException {
		Quoted_stringContext _localctx = new Quoted_stringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_quoted_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\66\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\3\3\3\3\4\3\4\3\4\7\4 \n\4\f\4\16\4#\13\4\3\5"+
		"\3\5\3\5\5\5(\n\5\3\6\3\6\3\7\3\7\3\b\3\b\5\b\60\n\b\3\t\3\t\3\n\3\n\3"+
		"\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2\60\2\27\3\2\2\2\4\32\3\2\2\2\6\34"+
		"\3\2\2\2\b$\3\2\2\2\n)\3\2\2\2\f+\3\2\2\2\16/\3\2\2\2\20\61\3\2\2\2\22"+
		"\63\3\2\2\2\24\26\5\6\4\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27"+
		"\30\3\2\2\2\30\3\3\2\2\2\31\27\3\2\2\2\32\33\5\n\6\2\33\5\3\2\2\2\34!"+
		"\5\b\5\2\35\36\7\3\2\2\36 \5\b\5\2\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2"+
		"!\"\3\2\2\2\"\7\3\2\2\2#!\3\2\2\2$\'\5\n\6\2%&\7\4\2\2&(\5\f\7\2\'%\3"+
		"\2\2\2\'(\3\2\2\2(\t\3\2\2\2)*\5\20\t\2*\13\3\2\2\2+,\5\16\b\2,\r\3\2"+
		"\2\2-\60\5\20\t\2.\60\5\22\n\2/-\3\2\2\2/.\3\2\2\2\60\17\3\2\2\2\61\62"+
		"\7\6\2\2\62\21\3\2\2\2\63\64\7\5\2\2\64\23\3\2\2\2\6\27!\'/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}