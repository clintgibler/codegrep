// Generated from databank/databank.g4 by ANTLR 4.7.1
package parsers.databank;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class databankParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, FLOATINGPOINT=5, COMMENT=6, EOL=7, WS=8;
	public static final int
		RULE_databank = 0, RULE_datedseries = 1, RULE_undatedseries = 2, RULE_datatype = 3, 
		RULE_dateline = 4, RULE_sample = 5, RULE_number = 6;
	public static final String[] ruleNames = {
		"databank", "datedseries", "undatedseries", "datatype", "dateline", "sample", 
		"number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-1'", "'-4'", "'-12'", "'NA'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "FLOATINGPOINT", "COMMENT", "EOL", "WS"
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
	public String getGrammarFileName() { return "databank.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public databankParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DatabankContext extends ParserRuleContext {
		public DatedseriesContext datedseries() {
			return getRuleContext(DatedseriesContext.class,0);
		}
		public UndatedseriesContext undatedseries() {
			return getRuleContext(UndatedseriesContext.class,0);
		}
		public List<TerminalNode> EOL() { return getTokens(databankParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(databankParser.EOL, i);
		}
		public List<SampleContext> sample() {
			return getRuleContexts(SampleContext.class);
		}
		public SampleContext sample(int i) {
			return getRuleContext(SampleContext.class,i);
		}
		public DatabankContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databank; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof databankListener ) ((databankListener)listener).enterDatabank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof databankListener ) ((databankListener)listener).exitDatabank(this);
		}
	}

	public final DatabankContext databank() throws RecognitionException {
		DatabankContext _localctx = new DatabankContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_databank);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EOL) {
				{
				{
				setState(14);
				match(EOL);
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
				{
				setState(20);
				datedseries();
				}
				break;
			case FLOATINGPOINT:
				{
				setState(21);
				undatedseries();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				sample();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 || _la==FLOATINGPOINT );
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

	public static class DatedseriesContext extends ParserRuleContext {
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
		public List<DatelineContext> dateline() {
			return getRuleContexts(DatelineContext.class);
		}
		public DatelineContext dateline(int i) {
			return getRuleContext(DatelineContext.class,i);
		}
		public DatedseriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datedseries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof databankListener ) ((databankListener)listener).enterDatedseries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof databankListener ) ((databankListener)listener).exitDatedseries(this);
		}
	}

	public final DatedseriesContext datedseries() throws RecognitionException {
		DatedseriesContext _localctx = new DatedseriesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_datedseries);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			datatype();
			setState(30);
			dateline();
			setState(31);
			dateline();
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

	public static class UndatedseriesContext extends ParserRuleContext {
		public List<DatelineContext> dateline() {
			return getRuleContexts(DatelineContext.class);
		}
		public DatelineContext dateline(int i) {
			return getRuleContext(DatelineContext.class,i);
		}
		public UndatedseriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_undatedseries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof databankListener ) ((databankListener)listener).enterUndatedseries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof databankListener ) ((databankListener)listener).exitUndatedseries(this);
		}
	}

	public final UndatedseriesContext undatedseries() throws RecognitionException {
		UndatedseriesContext _localctx = new UndatedseriesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_undatedseries);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			dateline();
			setState(34);
			dateline();
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

	public static class DatatypeContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(databankParser.EOL, 0); }
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof databankListener ) ((databankListener)listener).enterDatatype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof databankListener ) ((databankListener)listener).exitDatatype(this);
		}
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(37);
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

	public static class DatelineContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode EOL() { return getToken(databankParser.EOL, 0); }
		public DatelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof databankListener ) ((databankListener)listener).enterDateline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof databankListener ) ((databankListener)listener).exitDateline(this);
		}
	}

	public final DatelineContext dateline() throws RecognitionException {
		DatelineContext _localctx = new DatelineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dateline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			number();
			setState(40);
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

	public static class SampleContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode EOL() { return getToken(databankParser.EOL, 0); }
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof databankListener ) ((databankListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof databankListener ) ((databankListener)listener).exitSample(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sample);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOATINGPOINT:
				{
				setState(42);
				number();
				}
				break;
			case T__3:
				{
				setState(43);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(46);
				match(EOL);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode FLOATINGPOINT() { return getToken(databankParser.FLOATINGPOINT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof databankListener ) ((databankListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof databankListener ) ((databankListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(FLOATINGPOINT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\66\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\2\3\2\5\2\31\n\2\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\5\7/\n\7\3\7\5\7\62\n\7\3\b"+
		"\3\b\3\b\2\2\t\2\4\6\b\n\f\16\2\3\3\2\3\5\2\63\2\23\3\2\2\2\4\37\3\2\2"+
		"\2\6#\3\2\2\2\b&\3\2\2\2\n)\3\2\2\2\f.\3\2\2\2\16\63\3\2\2\2\20\22\7\t"+
		"\2\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\30\3\2"+
		"\2\2\25\23\3\2\2\2\26\31\5\4\3\2\27\31\5\6\4\2\30\26\3\2\2\2\30\27\3\2"+
		"\2\2\31\33\3\2\2\2\32\34\5\f\7\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2"+
		"\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37 \5\b\5\2 !\5\n\6\2!\"\5\n\6\2\"\5\3"+
		"\2\2\2#$\5\n\6\2$%\5\n\6\2%\7\3\2\2\2&\'\t\2\2\2\'(\7\t\2\2(\t\3\2\2\2"+
		")*\5\16\b\2*+\7\t\2\2+\13\3\2\2\2,/\5\16\b\2-/\7\6\2\2.,\3\2\2\2.-\3\2"+
		"\2\2/\61\3\2\2\2\60\62\7\t\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62\r\3\2\2"+
		"\2\63\64\7\7\2\2\64\17\3\2\2\2\7\23\30\35.\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}