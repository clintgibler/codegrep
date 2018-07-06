// Generated from istc/istc.g4 by ANTLR 4.7.1
package parsers.istc;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class istcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SEP=3, CHAR=4, WS=5;
	public static final int
		RULE_istc = 0, RULE_registration = 1, RULE_year = 2, RULE_work = 3, RULE_check = 4;
	public static final String[] ruleNames = {
		"istc", "registration", "year", "work", "check"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ISTC'", "' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "SEP", "CHAR", "WS"
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
	public String getGrammarFileName() { return "istc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public istcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IstcContext extends ParserRuleContext {
		public RegistrationContext registration() {
			return getRuleContext(RegistrationContext.class,0);
		}
		public List<TerminalNode> SEP() { return getTokens(istcParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(istcParser.SEP, i);
		}
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public WorkContext work() {
			return getRuleContext(WorkContext.class,0);
		}
		public CheckContext check() {
			return getRuleContext(CheckContext.class,0);
		}
		public TerminalNode EOF() { return getToken(istcParser.EOF, 0); }
		public IstcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_istc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof istcListener ) ((istcListener)listener).enterIstc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof istcListener ) ((istcListener)listener).exitIstc(this);
		}
	}

	public final IstcContext istc() throws RecognitionException {
		IstcContext _localctx = new IstcContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_istc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__0);
			setState(11);
			match(T__1);
			setState(12);
			registration();
			setState(13);
			match(SEP);
			setState(14);
			year();
			setState(15);
			match(SEP);
			setState(16);
			work();
			setState(17);
			match(SEP);
			setState(18);
			check();
			setState(19);
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

	public static class RegistrationContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(istcParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(istcParser.CHAR, i);
		}
		public RegistrationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof istcListener ) ((istcListener)listener).enterRegistration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof istcListener ) ((istcListener)listener).exitRegistration(this);
		}
	}

	public final RegistrationContext registration() throws RecognitionException {
		RegistrationContext _localctx = new RegistrationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_registration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(CHAR);
			setState(22);
			match(CHAR);
			setState(23);
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

	public static class YearContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(istcParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(istcParser.CHAR, i);
		}
		public YearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof istcListener ) ((istcListener)listener).enterYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof istcListener ) ((istcListener)listener).exitYear(this);
		}
	}

	public final YearContext year() throws RecognitionException {
		YearContext _localctx = new YearContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_year);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(CHAR);
			setState(26);
			match(CHAR);
			setState(27);
			match(CHAR);
			setState(28);
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

	public static class WorkContext extends ParserRuleContext {
		public List<TerminalNode> CHAR() { return getTokens(istcParser.CHAR); }
		public TerminalNode CHAR(int i) {
			return getToken(istcParser.CHAR, i);
		}
		public WorkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_work; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof istcListener ) ((istcListener)listener).enterWork(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof istcListener ) ((istcListener)listener).exitWork(this);
		}
	}

	public final WorkContext work() throws RecognitionException {
		WorkContext _localctx = new WorkContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_work);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(CHAR);
			setState(31);
			match(CHAR);
			setState(32);
			match(CHAR);
			setState(33);
			match(CHAR);
			setState(34);
			match(CHAR);
			setState(35);
			match(CHAR);
			setState(36);
			match(CHAR);
			setState(37);
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

	public static class CheckContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(istcParser.CHAR, 0); }
		public CheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof istcListener ) ((istcListener)listener).enterCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof istcListener ) ((istcListener)listener).exitCheck(this);
		}
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7,\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\2&\2\f\3\2\2\2\4\27\3\2\2\2\6\33\3"+
		"\2\2\2\b \3\2\2\2\n)\3\2\2\2\f\r\7\3\2\2\r\16\7\4\2\2\16\17\5\4\3\2\17"+
		"\20\7\5\2\2\20\21\5\6\4\2\21\22\7\5\2\2\22\23\5\b\5\2\23\24\7\5\2\2\24"+
		"\25\5\n\6\2\25\26\7\2\2\3\26\3\3\2\2\2\27\30\7\6\2\2\30\31\7\6\2\2\31"+
		"\32\7\6\2\2\32\5\3\2\2\2\33\34\7\6\2\2\34\35\7\6\2\2\35\36\7\6\2\2\36"+
		"\37\7\6\2\2\37\7\3\2\2\2 !\7\6\2\2!\"\7\6\2\2\"#\7\6\2\2#$\7\6\2\2$%\7"+
		"\6\2\2%&\7\6\2\2&\'\7\6\2\2\'(\7\6\2\2(\t\3\2\2\2)*\7\6\2\2*\13\3\2\2"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}