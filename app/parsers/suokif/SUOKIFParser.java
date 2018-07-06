// Generated from suokif/SUOKIF.g4 by ANTLR 4.7.1
package parsers.suokif;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SUOKIFParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOT=1, AND=2, OR=3, FORALL=4, EXISTS=5, WORD=6, STRING=7, VARIABLE=8, 
		NUMBER=9, WHITE=10, COMMENT=11, LPAREN=12, RPAREN=13, ASSIGN=14, GT=15, 
		LT=16, QUESTION=17;
	public static final int
		RULE_top_level = 0, RULE_term = 1, RULE_argument = 2, RULE_funterm = 3, 
		RULE_sentence = 4, RULE_equation = 5, RULE_relsent = 6, RULE_logsent = 7, 
		RULE_quantsent = 8;
	public static final String[] ruleNames = {
		"top_level", "term", "argument", "funterm", "sentence", "equation", "relsent", 
		"logsent", "quantsent"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'not'", "'and'", "'or'", "'forall'", "'exists'", null, null, null, 
		null, null, null, "'('", "')'", "'='", "'>'", "'<'", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NOT", "AND", "OR", "FORALL", "EXISTS", "WORD", "STRING", "VARIABLE", 
		"NUMBER", "WHITE", "COMMENT", "LPAREN", "RPAREN", "ASSIGN", "GT", "LT", 
		"QUESTION"
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
	public String getGrammarFileName() { return "SUOKIF.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SUOKIFParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Top_levelContext extends ParserRuleContext {
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public Top_levelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SUOKIFListener ) ((SUOKIFListener)listener).enterTop_level(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SUOKIFListener ) ((SUOKIFListener)listener).exitTop_level(this);
		}
	}

	public final Top_levelContext top_level() throws RecognitionException {
		Top_levelContext _localctx = new Top_levelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_top_level);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WORD) | (1L << VARIABLE) | (1L << LPAREN))) != 0)) {
				{
				{
				setState(18);
				sentence();
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(SUOKIFParser.VARIABLE, 0); }
		public TerminalNode WORD() { return getToken(SUOKIFParser.WORD, 0); }
		public TerminalNode STRING() { return getToken(SUOKIFParser.STRING, 0); }
		public FuntermContext funterm() {
			return getRuleContext(FuntermContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(SUOKIFParser.NUMBER, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SUOKIFListener ) ((SUOKIFListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SUOKIFListener ) ((SUOKIFListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_term);
		try {
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(VARIABLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(WORD);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(26);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(27);
				funterm();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(28);
				match(NUMBER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(29);
				sentence();
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

	public static class ArgumentContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SUOKIFListener ) ((SUOKIFListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SUOKIFListener ) ((SUOKIFListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_argument);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				term();
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

	public static class FuntermContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(SUOKIFParser.WORD, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public FuntermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SUOKIFListener ) ((SUOKIFListener)listener).enterFunterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SUOKIFListener ) ((SUOKIFListener)listener).exitFunterm(this);
		}
	}

	public final FuntermContext funterm() throws RecognitionException {
		FuntermContext _localctx = new FuntermContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funterm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(LPAREN);
			setState(37);
			match(WORD);
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				argument();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WORD) | (1L << STRING) | (1L << VARIABLE) | (1L << NUMBER) | (1L << LPAREN))) != 0) );
			setState(43);
			match(RPAREN);
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

	public static class SentenceContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(SUOKIFParser.WORD, 0); }
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public RelsentContext relsent() {
			return getRuleContext(RelsentContext.class,0);
		}
		public LogsentContext logsent() {
			return getRuleContext(LogsentContext.class,0);
		}
		public QuantsentContext quantsent() {
			return getRuleContext(QuantsentContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(SUOKIFParser.VARIABLE, 0); }
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SUOKIFListener ) ((SUOKIFListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SUOKIFListener ) ((SUOKIFListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentence);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(WORD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				equation();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				relsent();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				logsent();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				quantsent();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				match(VARIABLE);
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

	public static class EquationContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SUOKIFListener ) ((SUOKIFListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SUOKIFListener ) ((SUOKIFListener)listener).exitEquation(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_equation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(LPAREN);
			setState(54);
			match(ASSIGN);
			setState(55);
			term();
			setState(56);
			term();
			setState(57);
			match(RPAREN);
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

	public static class RelsentContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(SUOKIFParser.WORD, 0); }
		public TerminalNode VARIABLE() { return getToken(SUOKIFParser.VARIABLE, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public RelsentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relsent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SUOKIFListener ) ((SUOKIFListener)listener).enterRelsent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SUOKIFListener ) ((SUOKIFListener)listener).exitRelsent(this);
		}
	}

	public final RelsentContext relsent() throws RecognitionException {
		RelsentContext _localctx = new RelsentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relsent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(LPAREN);
			setState(60);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				argument();
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WORD) | (1L << STRING) | (1L << VARIABLE) | (1L << NUMBER) | (1L << LPAREN))) != 0) );
			setState(66);
			match(RPAREN);
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

	public static class LogsentContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SUOKIFParser.NOT, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public TerminalNode AND() { return getToken(SUOKIFParser.AND, 0); }
		public TerminalNode OR() { return getToken(SUOKIFParser.OR, 0); }
		public LogsentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logsent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SUOKIFListener ) ((SUOKIFListener)listener).enterLogsent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SUOKIFListener ) ((SUOKIFListener)listener).exitLogsent(this);
		}
	}

	public final LogsentContext logsent() throws RecognitionException {
		LogsentContext _localctx = new LogsentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_logsent);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(LPAREN);
				setState(69);
				match(NOT);
				setState(70);
				sentence();
				setState(71);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(LPAREN);
				setState(74);
				match(AND);
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(75);
					sentence();
					}
					}
					setState(78); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WORD) | (1L << VARIABLE) | (1L << LPAREN))) != 0) );
				setState(80);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(LPAREN);
				setState(83);
				match(OR);
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(84);
					sentence();
					}
					}
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WORD) | (1L << VARIABLE) | (1L << LPAREN))) != 0) );
				setState(89);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match(LPAREN);
				setState(92);
				match(ASSIGN);
				setState(93);
				match(GT);
				setState(94);
				sentence();
				setState(95);
				sentence();
				setState(96);
				match(RPAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				match(LPAREN);
				setState(99);
				match(LT);
				setState(100);
				match(ASSIGN);
				setState(101);
				match(GT);
				setState(102);
				sentence();
				setState(103);
				sentence();
				setState(104);
				match(RPAREN);
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

	public static class QuantsentContext extends ParserRuleContext {
		public TerminalNode FORALL() { return getToken(SUOKIFParser.FORALL, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(SUOKIFParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(SUOKIFParser.VARIABLE, i);
		}
		public TerminalNode EXISTS() { return getToken(SUOKIFParser.EXISTS, 0); }
		public QuantsentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantsent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SUOKIFListener ) ((SUOKIFListener)listener).enterQuantsent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SUOKIFListener ) ((SUOKIFListener)listener).exitQuantsent(this);
		}
	}

	public final QuantsentContext quantsent() throws RecognitionException {
		QuantsentContext _localctx = new QuantsentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_quantsent);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(LPAREN);
				setState(109);
				match(FORALL);
				setState(110);
				match(LPAREN);
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(111);
					match(VARIABLE);
					}
					}
					setState(114); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VARIABLE );
				setState(116);
				match(RPAREN);
				setState(117);
				sentence();
				setState(118);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(LPAREN);
				setState(121);
				match(EXISTS);
				setState(122);
				match(LPAREN);
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(123);
					match(VARIABLE);
					}
					}
					setState(126); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VARIABLE );
				setState(128);
				match(RPAREN);
				setState(129);
				sentence();
				setState(130);
				match(RPAREN);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u0089\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7"+
		"\2\26\n\2\f\2\16\2\31\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\5"+
		"\4%\n\4\3\5\3\5\3\5\6\5*\n\5\r\5\16\5+\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6\66\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\6\bA\n\b\r\b\16\bB\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\tO\n\t\r\t\16\tP\3\t\3\t\3\t\3"+
		"\t\3\t\6\tX\n\t\r\t\16\tY\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\tm\n\t\3\n\3\n\3\n\3\n\6\ns\n\n\r\n\16\nt\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\177\n\n\r\n\16\n\u0080\3\n\3\n\3\n"+
		"\3\n\5\n\u0087\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\3\4\2\b\b\n\n\2\u0096"+
		"\2\27\3\2\2\2\4 \3\2\2\2\6$\3\2\2\2\b&\3\2\2\2\n\65\3\2\2\2\f\67\3\2\2"+
		"\2\16=\3\2\2\2\20l\3\2\2\2\22\u0086\3\2\2\2\24\26\5\n\6\2\25\24\3\2\2"+
		"\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\27\3\2\2"+
		"\2\32!\7\n\2\2\33!\7\b\2\2\34!\7\t\2\2\35!\5\b\5\2\36!\7\13\2\2\37!\5"+
		"\n\6\2 \32\3\2\2\2 \33\3\2\2\2 \34\3\2\2\2 \35\3\2\2\2 \36\3\2\2\2 \37"+
		"\3\2\2\2!\5\3\2\2\2\"%\5\n\6\2#%\5\4\3\2$\"\3\2\2\2$#\3\2\2\2%\7\3\2\2"+
		"\2&\'\7\16\2\2\')\7\b\2\2(*\5\6\4\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3"+
		"\2\2\2,-\3\2\2\2-.\7\17\2\2.\t\3\2\2\2/\66\7\b\2\2\60\66\5\f\7\2\61\66"+
		"\5\16\b\2\62\66\5\20\t\2\63\66\5\22\n\2\64\66\7\n\2\2\65/\3\2\2\2\65\60"+
		"\3\2\2\2\65\61\3\2\2\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\13"+
		"\3\2\2\2\678\7\16\2\289\7\20\2\29:\5\4\3\2:;\5\4\3\2;<\7\17\2\2<\r\3\2"+
		"\2\2=>\7\16\2\2>@\t\2\2\2?A\5\6\4\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3"+
		"\2\2\2CD\3\2\2\2DE\7\17\2\2E\17\3\2\2\2FG\7\16\2\2GH\7\3\2\2HI\5\n\6\2"+
		"IJ\7\17\2\2Jm\3\2\2\2KL\7\16\2\2LN\7\4\2\2MO\5\n\6\2NM\3\2\2\2OP\3\2\2"+
		"\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\17\2\2Sm\3\2\2\2TU\7\16\2\2UW\7\5"+
		"\2\2VX\5\n\6\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7"+
		"\17\2\2\\m\3\2\2\2]^\7\16\2\2^_\7\20\2\2_`\7\21\2\2`a\5\n\6\2ab\5\n\6"+
		"\2bc\7\17\2\2cm\3\2\2\2de\7\16\2\2ef\7\22\2\2fg\7\20\2\2gh\7\21\2\2hi"+
		"\5\n\6\2ij\5\n\6\2jk\7\17\2\2km\3\2\2\2lF\3\2\2\2lK\3\2\2\2lT\3\2\2\2"+
		"l]\3\2\2\2ld\3\2\2\2m\21\3\2\2\2no\7\16\2\2op\7\6\2\2pr\7\16\2\2qs\7\n"+
		"\2\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\17\2\2wx\5"+
		"\n\6\2xy\7\17\2\2y\u0087\3\2\2\2z{\7\16\2\2{|\7\7\2\2|~\7\16\2\2}\177"+
		"\7\n\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2"+
		"\2\u0081\u0082\3\2\2\2\u0082\u0083\7\17\2\2\u0083\u0084\5\n\6\2\u0084"+
		"\u0085\7\17\2\2\u0085\u0087\3\2\2\2\u0086n\3\2\2\2\u0086z\3\2\2\2\u0087"+
		"\23\3\2\2\2\16\27 $+\65BPYlt\u0080\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}