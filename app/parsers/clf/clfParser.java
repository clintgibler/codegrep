// Generated from clf/clf.g4 by ANTLR 4.7.1
package parsers.clf;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class clfParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, DATE=4, TIME=5, TZ=6, LITERAL=7, IP=8, STRING=9, 
		EOL=10, WS=11;
	public static final int
		RULE_log = 0, RULE_line = 1, RULE_host = 2, RULE_logname = 3, RULE_username = 4, 
		RULE_datetimetz = 5, RULE_referer = 6, RULE_request = 7, RULE_useragent = 8, 
		RULE_statuscode = 9, RULE_bytes = 10;
	public static final String[] ruleNames = {
		"log", "line", "host", "logname", "username", "datetimetz", "referer", 
		"request", "useragent", "statuscode", "bytes"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "':'", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "DATE", "TIME", "TZ", "LITERAL", "IP", "STRING", 
		"EOL", "WS"
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
	public String getGrammarFileName() { return "clf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public clfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LogContext extends ParserRuleContext {
		public List<TerminalNode> EOL() { return getTokens(clfParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(clfParser.EOL, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).exitLog(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_log);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(26); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(23);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IP || _la==STRING) {
						{
						setState(22);
						line();
						}
					}

					setState(25);
					match(EOL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(28); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IP || _la==STRING) {
				{
				setState(30);
				line();
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

	public static class LineContext extends ParserRuleContext {
		public HostContext host() {
			return getRuleContext(HostContext.class,0);
		}
		public LognameContext logname() {
			return getRuleContext(LognameContext.class,0);
		}
		public UsernameContext username() {
			return getRuleContext(UsernameContext.class,0);
		}
		public DatetimetzContext datetimetz() {
			return getRuleContext(DatetimetzContext.class,0);
		}
		public RequestContext request() {
			return getRuleContext(RequestContext.class,0);
		}
		public StatuscodeContext statuscode() {
			return getRuleContext(StatuscodeContext.class,0);
		}
		public BytesContext bytes() {
			return getRuleContext(BytesContext.class,0);
		}
		public RefererContext referer() {
			return getRuleContext(RefererContext.class,0);
		}
		public UseragentContext useragent() {
			return getRuleContext(UseragentContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			host();
			setState(34);
			logname();
			setState(35);
			username();
			setState(36);
			datetimetz();
			setState(37);
			request();
			setState(38);
			statuscode();
			setState(39);
			bytes();
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LITERAL) {
				{
				setState(40);
				referer();
				setState(41);
				useragent();
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

	public static class HostContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(clfParser.STRING, 0); }
		public TerminalNode IP() { return getToken(clfParser.IP, 0); }
		public HostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).enterHost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).exitHost(this);
		}
	}

	public final HostContext host() throws RecognitionException {
		HostContext _localctx = new HostContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_host);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_la = _input.LA(1);
			if ( !(_la==IP || _la==STRING) ) {
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

	public static class LognameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(clfParser.STRING, 0); }
		public LognameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).enterLogname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).exitLogname(this);
		}
	}

	public final LognameContext logname() throws RecognitionException {
		LognameContext _localctx = new LognameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_logname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
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

	public static class UsernameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(clfParser.STRING, 0); }
		public UsernameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_username; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).enterUsername(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).exitUsername(this);
		}
	}

	public final UsernameContext username() throws RecognitionException {
		UsernameContext _localctx = new UsernameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_username);
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

	public static class DatetimetzContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(clfParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(clfParser.TIME, 0); }
		public TerminalNode TZ() { return getToken(clfParser.TZ, 0); }
		public DatetimetzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetimetz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).enterDatetimetz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).exitDatetimetz(this);
		}
	}

	public final DatetimetzContext datetimetz() throws RecognitionException {
		DatetimetzContext _localctx = new DatetimetzContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_datetimetz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__0);
			setState(52);
			match(DATE);
			setState(53);
			match(T__1);
			setState(54);
			match(TIME);
			setState(55);
			match(TZ);
			setState(56);
			match(T__2);
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

	public static class RefererContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(clfParser.LITERAL, 0); }
		public RefererContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).enterReferer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).exitReferer(this);
		}
	}

	public final RefererContext referer() throws RecognitionException {
		RefererContext _localctx = new RefererContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_referer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(LITERAL);
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

	public static class RequestContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(clfParser.LITERAL, 0); }
		public RequestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_request; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).enterRequest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).exitRequest(this);
		}
	}

	public final RequestContext request() throws RecognitionException {
		RequestContext _localctx = new RequestContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_request);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(LITERAL);
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

	public static class UseragentContext extends ParserRuleContext {
		public TerminalNode LITERAL() { return getToken(clfParser.LITERAL, 0); }
		public UseragentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useragent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).enterUseragent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).exitUseragent(this);
		}
	}

	public final UseragentContext useragent() throws RecognitionException {
		UseragentContext _localctx = new UseragentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_useragent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(LITERAL);
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

	public static class StatuscodeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(clfParser.STRING, 0); }
		public StatuscodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statuscode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).enterStatuscode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).exitStatuscode(this);
		}
	}

	public final StatuscodeContext statuscode() throws RecognitionException {
		StatuscodeContext _localctx = new StatuscodeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statuscode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
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

	public static class BytesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(clfParser.STRING, 0); }
		public BytesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bytes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).enterBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clfListener ) ((clfListener)listener).exitBytes(this);
		}
	}

	public final BytesContext bytes() throws RecognitionException {
		BytesContext _localctx = new BytesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bytes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\rG\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\5\2\32\n\2\3\2\6\2\35\n\2\r\2\16\2\36\3\2\5\2\"\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2\n\13\2?\2\34\3\2\2\2\4#\3\2"+
		"\2\2\6/\3\2\2\2\b\61\3\2\2\2\n\63\3\2\2\2\f\65\3\2\2\2\16<\3\2\2\2\20"+
		">\3\2\2\2\22@\3\2\2\2\24B\3\2\2\2\26D\3\2\2\2\30\32\5\4\3\2\31\30\3\2"+
		"\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\35\7\f\2\2\34\31\3\2\2\2\35\36\3\2"+
		"\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \"\5\4\3\2! \3\2\2\2!\"\3"+
		"\2\2\2\"\3\3\2\2\2#$\5\6\4\2$%\5\b\5\2%&\5\n\6\2&\'\5\f\7\2\'(\5\20\t"+
		"\2()\5\24\13\2)-\5\26\f\2*+\5\16\b\2+,\5\22\n\2,.\3\2\2\2-*\3\2\2\2-."+
		"\3\2\2\2.\5\3\2\2\2/\60\t\2\2\2\60\7\3\2\2\2\61\62\7\13\2\2\62\t\3\2\2"+
		"\2\63\64\7\13\2\2\64\13\3\2\2\2\65\66\7\3\2\2\66\67\7\6\2\2\678\7\4\2"+
		"\289\7\7\2\29:\7\b\2\2:;\7\5\2\2;\r\3\2\2\2<=\7\t\2\2=\17\3\2\2\2>?\7"+
		"\t\2\2?\21\3\2\2\2@A\7\t\2\2A\23\3\2\2\2BC\7\13\2\2C\25\3\2\2\2DE\7\13"+
		"\2\2E\27\3\2\2\2\6\31\36!-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}