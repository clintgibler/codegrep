// Generated from lcc/lcc.g4 by ANTLR 4.7.1
package parsers.lcc;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lccParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, DIGIT=3, LETTER=4, WS=5;
	public static final int
		RULE_lcc = 0, RULE_topic = 1, RULE_subtopic = 2, RULE_subclasses = 3, 
		RULE_subclass = 4, RULE_cutters = 5, RULE_cutter = 6, RULE_date = 7;
	public static final String[] ruleNames = {
		"lcc", "topic", "subtopic", "subclasses", "subclass", "cutters", "cutter", 
		"date"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "DIGIT", "LETTER", "WS"
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
	public String getGrammarFileName() { return "lcc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lccParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LccContext extends ParserRuleContext {
		public TopicContext topic() {
			return getRuleContext(TopicContext.class,0);
		}
		public SubclassesContext subclasses() {
			return getRuleContext(SubclassesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(lccParser.EOF, 0); }
		public SubtopicContext subtopic() {
			return getRuleContext(SubtopicContext.class,0);
		}
		public CuttersContext cutters() {
			return getRuleContext(CuttersContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public LccContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lcc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lccListener ) ((lccListener)listener).enterLcc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lccListener ) ((lccListener)listener).exitLcc(this);
		}
	}

	public final LccContext lcc() throws RecognitionException {
		LccContext _localctx = new LccContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lcc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			topic();
			setState(18);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(17);
				match(T__0);
				}
				break;
			}
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LETTER) {
				{
				setState(20);
				subtopic();
				}
			}

			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(23);
				match(T__0);
				}
			}

			setState(26);
			subclasses();
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(27);
				match(T__0);
				}
				break;
			}
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(30);
				match(T__1);
				setState(31);
				cutters();
				}
			}

			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(34);
				match(T__0);
				setState(35);
				date();
				}
			}

			setState(38);
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

	public static class TopicContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(lccParser.LETTER, 0); }
		public TopicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lccListener ) ((lccListener)listener).enterTopic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lccListener ) ((lccListener)listener).exitTopic(this);
		}
	}

	public final TopicContext topic() throws RecognitionException {
		TopicContext _localctx = new TopicContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_topic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(LETTER);
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

	public static class SubtopicContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(lccParser.LETTER, 0); }
		public SubtopicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtopic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lccListener ) ((lccListener)listener).enterSubtopic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lccListener ) ((lccListener)listener).exitSubtopic(this);
		}
	}

	public final SubtopicContext subtopic() throws RecognitionException {
		SubtopicContext _localctx = new SubtopicContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_subtopic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(LETTER);
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

	public static class SubclassesContext extends ParserRuleContext {
		public List<SubclassContext> subclass() {
			return getRuleContexts(SubclassContext.class);
		}
		public SubclassContext subclass(int i) {
			return getRuleContext(SubclassContext.class,i);
		}
		public SubclassesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subclasses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lccListener ) ((lccListener)listener).enterSubclasses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lccListener ) ((lccListener)listener).exitSubclasses(this);
		}
	}

	public final SubclassesContext subclasses() throws RecognitionException {
		SubclassesContext _localctx = new SubclassesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_subclasses);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			subclass();
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(45);
					match(T__1);
					setState(46);
					subclass();
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class SubclassContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(lccParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(lccParser.DIGIT, i);
		}
		public SubclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lccListener ) ((lccListener)listener).enterSubclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lccListener ) ((lccListener)listener).exitSubclass(this);
		}
	}

	public final SubclassContext subclass() throws RecognitionException {
		SubclassContext _localctx = new SubclassContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subclass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				match(DIGIT);
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class CuttersContext extends ParserRuleContext {
		public List<CutterContext> cutter() {
			return getRuleContexts(CutterContext.class);
		}
		public CutterContext cutter(int i) {
			return getRuleContext(CutterContext.class,i);
		}
		public CuttersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cutters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lccListener ) ((lccListener)listener).enterCutters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lccListener ) ((lccListener)listener).exitCutters(this);
		}
	}

	public final CuttersContext cutters() throws RecognitionException {
		CuttersContext _localctx = new CuttersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cutters);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			cutter();
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					match(T__0);
					setState(59);
					cutter();
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class CutterContext extends ParserRuleContext {
		public TerminalNode LETTER() { return getToken(lccParser.LETTER, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(lccParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(lccParser.DIGIT, i);
		}
		public CutterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cutter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lccListener ) ((lccListener)listener).enterCutter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lccListener ) ((lccListener)listener).exitCutter(this);
		}
	}

	public final CutterContext cutter() throws RecognitionException {
		CutterContext _localctx = new CutterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cutter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(LETTER);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(66);
				match(DIGIT);
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class DateContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(lccParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(lccParser.DIGIT, i);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lccListener ) ((lccListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lccListener ) ((lccListener)listener).exitDate(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(DIGIT);
			setState(72);
			match(DIGIT);
			setState(73);
			match(DIGIT);
			setState(74);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7O\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\5\2\25\n\2"+
		"\3\2\5\2\30\n\2\3\2\5\2\33\n\2\3\2\3\2\5\2\37\n\2\3\2\3\2\5\2#\n\2\3\2"+
		"\3\2\5\2\'\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\7\5\62\n\5\f\5\16\5"+
		"\65\13\5\3\6\6\68\n\6\r\6\16\69\3\7\3\7\3\7\7\7?\n\7\f\7\16\7B\13\7\3"+
		"\b\3\b\6\bF\n\b\r\b\16\bG\3\t\3\t\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16"+
		"\20\2\2\2P\2\22\3\2\2\2\4*\3\2\2\2\6,\3\2\2\2\b.\3\2\2\2\n\67\3\2\2\2"+
		"\f;\3\2\2\2\16C\3\2\2\2\20I\3\2\2\2\22\24\5\4\3\2\23\25\7\3\2\2\24\23"+
		"\3\2\2\2\24\25\3\2\2\2\25\27\3\2\2\2\26\30\5\6\4\2\27\26\3\2\2\2\27\30"+
		"\3\2\2\2\30\32\3\2\2\2\31\33\7\3\2\2\32\31\3\2\2\2\32\33\3\2\2\2\33\34"+
		"\3\2\2\2\34\36\5\b\5\2\35\37\7\3\2\2\36\35\3\2\2\2\36\37\3\2\2\2\37\""+
		"\3\2\2\2 !\7\4\2\2!#\5\f\7\2\" \3\2\2\2\"#\3\2\2\2#&\3\2\2\2$%\7\3\2\2"+
		"%\'\5\20\t\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\7\2\2\3)\3\3\2\2\2*+\7"+
		"\6\2\2+\5\3\2\2\2,-\7\6\2\2-\7\3\2\2\2.\63\5\n\6\2/\60\7\4\2\2\60\62\5"+
		"\n\6\2\61/\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\t\3\2"+
		"\2\2\65\63\3\2\2\2\668\7\5\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3"+
		"\2\2\2:\13\3\2\2\2;@\5\16\b\2<=\7\3\2\2=?\5\16\b\2><\3\2\2\2?B\3\2\2\2"+
		"@>\3\2\2\2@A\3\2\2\2A\r\3\2\2\2B@\3\2\2\2CE\7\6\2\2DF\7\5\2\2ED\3\2\2"+
		"\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\17\3\2\2\2IJ\7\5\2\2JK\7\5\2\2KL\7\5"+
		"\2\2LM\7\5\2\2M\21\3\2\2\2\f\24\27\32\36\"&\639@G";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}