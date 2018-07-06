// Generated from telephone/telephone.g4 by ANTLR 4.7.1
package parsers.telephone;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class telephoneParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, DIGIT=5, WS=6;
	public static final int
		RULE_number = 0, RULE_variation = 1, RULE_nanp = 2, RULE_areacode = 3, 
		RULE_exchange = 4, RULE_subscriber = 5, RULE_japan = 6;
	public static final String[] ruleNames = {
		"number", "variation", "nanp", "areacode", "exchange", "subscriber", "japan"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+1'", "'+'", "'011'", "'010'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "DIGIT", "WS"
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
	public String getGrammarFileName() { return "telephone.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public telephoneParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NumberContext extends ParserRuleContext {
		public VariationContext variation() {
			return getRuleContext(VariationContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof telephoneListener ) ((telephoneListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof telephoneListener ) ((telephoneListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(14);
				match(T__0);
				}
			}

			setState(18);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(17);
				match(T__1);
				}
			}

			setState(20);
			variation();
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

	public static class VariationContext extends ParserRuleContext {
		public NanpContext nanp() {
			return getRuleContext(NanpContext.class,0);
		}
		public JapanContext japan() {
			return getRuleContext(JapanContext.class,0);
		}
		public VariationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof telephoneListener ) ((telephoneListener)listener).enterVariation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof telephoneListener ) ((telephoneListener)listener).exitVariation(this);
		}
	}

	public final VariationContext variation() throws RecognitionException {
		VariationContext _localctx = new VariationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variation);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				nanp();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				japan();
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

	public static class NanpContext extends ParserRuleContext {
		public AreacodeContext areacode() {
			return getRuleContext(AreacodeContext.class,0);
		}
		public ExchangeContext exchange() {
			return getRuleContext(ExchangeContext.class,0);
		}
		public SubscriberContext subscriber() {
			return getRuleContext(SubscriberContext.class,0);
		}
		public NanpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nanp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof telephoneListener ) ((telephoneListener)listener).enterNanp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof telephoneListener ) ((telephoneListener)listener).exitNanp(this);
		}
	}

	public final NanpContext nanp() throws RecognitionException {
		NanpContext _localctx = new NanpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nanp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__2);
			setState(27);
			areacode();
			setState(28);
			exchange();
			setState(29);
			subscriber();
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

	public static class AreacodeContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(telephoneParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(telephoneParser.DIGIT, i);
		}
		public AreacodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_areacode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof telephoneListener ) ((telephoneListener)listener).enterAreacode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof telephoneListener ) ((telephoneListener)listener).exitAreacode(this);
		}
	}

	public final AreacodeContext areacode() throws RecognitionException {
		AreacodeContext _localctx = new AreacodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_areacode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(DIGIT);
			setState(32);
			match(DIGIT);
			setState(33);
			match(DIGIT);
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

	public static class ExchangeContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(telephoneParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(telephoneParser.DIGIT, i);
		}
		public ExchangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exchange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof telephoneListener ) ((telephoneListener)listener).enterExchange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof telephoneListener ) ((telephoneListener)listener).exitExchange(this);
		}
	}

	public final ExchangeContext exchange() throws RecognitionException {
		ExchangeContext _localctx = new ExchangeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exchange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(DIGIT);
			setState(36);
			match(DIGIT);
			setState(37);
			match(DIGIT);
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

	public static class SubscriberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(telephoneParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(telephoneParser.DIGIT, i);
		}
		public SubscriberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof telephoneListener ) ((telephoneListener)listener).enterSubscriber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof telephoneListener ) ((telephoneListener)listener).exitSubscriber(this);
		}
	}

	public final SubscriberContext subscriber() throws RecognitionException {
		SubscriberContext _localctx = new SubscriberContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subscriber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(DIGIT);
			setState(40);
			match(DIGIT);
			setState(41);
			match(DIGIT);
			setState(42);
			match(DIGIT);
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

	public static class JapanContext extends ParserRuleContext {
		public AreacodeContext areacode() {
			return getRuleContext(AreacodeContext.class,0);
		}
		public ExchangeContext exchange() {
			return getRuleContext(ExchangeContext.class,0);
		}
		public SubscriberContext subscriber() {
			return getRuleContext(SubscriberContext.class,0);
		}
		public JapanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_japan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof telephoneListener ) ((telephoneListener)listener).enterJapan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof telephoneListener ) ((telephoneListener)listener).exitJapan(this);
		}
	}

	public final JapanContext japan() throws RecognitionException {
		JapanContext _localctx = new JapanContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_japan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__3);
			setState(45);
			areacode();
			setState(46);
			exchange();
			setState(47);
			subscriber();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\5\2\22\n\2\3\2\5\2\25"+
		"\n\2\3\2\3\2\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\2\2\t\2\4\6"+
		"\b\n\f\16\2\2\2/\2\21\3\2\2\2\4\32\3\2\2\2\6\34\3\2\2\2\b!\3\2\2\2\n%"+
		"\3\2\2\2\f)\3\2\2\2\16.\3\2\2\2\20\22\7\3\2\2\21\20\3\2\2\2\21\22\3\2"+
		"\2\2\22\24\3\2\2\2\23\25\7\4\2\2\24\23\3\2\2\2\24\25\3\2\2\2\25\26\3\2"+
		"\2\2\26\27\5\4\3\2\27\3\3\2\2\2\30\33\5\6\4\2\31\33\5\16\b\2\32\30\3\2"+
		"\2\2\32\31\3\2\2\2\33\5\3\2\2\2\34\35\7\5\2\2\35\36\5\b\5\2\36\37\5\n"+
		"\6\2\37 \5\f\7\2 \7\3\2\2\2!\"\7\7\2\2\"#\7\7\2\2#$\7\7\2\2$\t\3\2\2\2"+
		"%&\7\7\2\2&\'\7\7\2\2\'(\7\7\2\2(\13\3\2\2\2)*\7\7\2\2*+\7\7\2\2+,\7\7"+
		"\2\2,-\7\7\2\2-\r\3\2\2\2./\7\6\2\2/\60\5\b\5\2\60\61\5\n\6\2\61\62\5"+
		"\f\7\2\62\17\3\2\2\2\5\21\24\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}