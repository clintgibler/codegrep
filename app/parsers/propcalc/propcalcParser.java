// Generated from propcalc/propcalc.g4 by ANTLR 4.7.1
package parsers.propcalc;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class propcalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, AND=2, OR=3, NOT=4, EQ=5, IMPLIES=6, THEREFORE=7, EQUIV=8, LPAREN=9, 
		RPAREN=10, LETTER=11, WS=12;
	public static final int
		RULE_proposition = 0, RULE_expression = 1, RULE_relExpression = 2, RULE_atoms = 3, 
		RULE_atom = 4, RULE_equiv = 5, RULE_implies = 6, RULE_variable = 7;
	public static final String[] ruleNames = {
		"proposition", "expression", "relExpression", "atoms", "atom", "equiv", 
		"implies", "variable"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'^'", "'v'", "'!'", "'='", "'->'", "'|-'", "'<->'", "'('", 
		"')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "AND", "OR", "NOT", "EQ", "IMPLIES", "THEREFORE", "EQUIV", 
		"LPAREN", "RPAREN", "LETTER", "WS"
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
	public String getGrammarFileName() { return "propcalc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public propcalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PropositionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode THEREFORE() { return getToken(propcalcParser.THEREFORE, 0); }
		public PropositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proposition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof propcalcListener ) ((propcalcListener)listener).enterProposition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof propcalcListener ) ((propcalcListener)listener).exitProposition(this);
		}
	}

	public final PropositionContext proposition() throws RecognitionException {
		PropositionContext _localctx = new PropositionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_proposition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			expression();
			setState(17);
			match(THEREFORE);
			setState(18);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<RelExpressionContext> relExpression() {
			return getRuleContexts(RelExpressionContext.class);
		}
		public RelExpressionContext relExpression(int i) {
			return getRuleContext(RelExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(propcalcParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(propcalcParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(propcalcParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(propcalcParser.OR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof propcalcListener ) ((propcalcListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof propcalcListener ) ((propcalcListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			relExpression();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(21);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(22);
				relExpression();
				}
				}
				setState(27);
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

	public static class RelExpressionContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public EquivContext equiv() {
			return getRuleContext(EquivContext.class,0);
		}
		public ImpliesContext implies() {
			return getRuleContext(ImpliesContext.class,0);
		}
		public RelExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof propcalcListener ) ((propcalcListener)listener).enterRelExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof propcalcListener ) ((propcalcListener)listener).exitRelExpression(this);
		}
	}

	public final RelExpressionContext relExpression() throws RecognitionException {
		RelExpressionContext _localctx = new RelExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_relExpression);
		try {
			setState(31);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				equiv();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(30);
				implies();
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

	public static class AtomsContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public AtomsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atoms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof propcalcListener ) ((propcalcListener)listener).enterAtoms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof propcalcListener ) ((propcalcListener)listener).exitAtoms(this);
		}
	}

	public final AtomsContext atoms() throws RecognitionException {
		AtomsContext _localctx = new AtomsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atoms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			atom();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(34);
				match(T__0);
				setState(35);
				atom();
				}
				}
				setState(40);
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

	public static class AtomContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode NOT() { return getToken(propcalcParser.NOT, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(propcalcParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(propcalcParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof propcalcListener ) ((propcalcListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof propcalcListener ) ((propcalcListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_atom);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case AND:
			case OR:
			case IMPLIES:
			case THEREFORE:
			case EQUIV:
			case RPAREN:
			case LETTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				variable();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(NOT);
				setState(43);
				atom();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				match(LPAREN);
				setState(45);
				expression();
				setState(46);
				match(RPAREN);
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

	public static class EquivContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode EQUIV() { return getToken(propcalcParser.EQUIV, 0); }
		public EquivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equiv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof propcalcListener ) ((propcalcListener)listener).enterEquiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof propcalcListener ) ((propcalcListener)listener).exitEquiv(this);
		}
	}

	public final EquivContext equiv() throws RecognitionException {
		EquivContext _localctx = new EquivContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_equiv);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			atom();
			setState(51);
			match(EQUIV);
			setState(52);
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

	public static class ImpliesContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TerminalNode IMPLIES() { return getToken(propcalcParser.IMPLIES, 0); }
		public ImpliesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof propcalcListener ) ((propcalcListener)listener).enterImplies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof propcalcListener ) ((propcalcListener)listener).exitImplies(this);
		}
	}

	public final ImpliesContext implies() throws RecognitionException {
		ImpliesContext _localctx = new ImpliesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_implies);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			atom();
			setState(55);
			match(IMPLIES);
			setState(56);
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

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(propcalcParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(propcalcParser.LETTER, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof propcalcListener ) ((propcalcListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof propcalcListener ) ((propcalcListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETTER) {
				{
				{
				setState(58);
				match(LETTER);
				}
				}
				setState(63);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16C\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\4\3\4\3\4\5\4\"\n\4\3\5\3\5\3\5"+
		"\7\5\'\n\5\f\5\16\5*\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\63\n\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\7\t>\n\t\f\t\16\tA\13\t\3\t\2\2\n\2\4\6"+
		"\b\n\f\16\20\2\3\3\2\4\5\2A\2\22\3\2\2\2\4\26\3\2\2\2\6!\3\2\2\2\b#\3"+
		"\2\2\2\n\62\3\2\2\2\f\64\3\2\2\2\168\3\2\2\2\20?\3\2\2\2\22\23\5\4\3\2"+
		"\23\24\7\t\2\2\24\25\5\4\3\2\25\3\3\2\2\2\26\33\5\6\4\2\27\30\t\2\2\2"+
		"\30\32\5\6\4\2\31\27\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2"+
		"\34\5\3\2\2\2\35\33\3\2\2\2\36\"\5\n\6\2\37\"\5\f\7\2 \"\5\16\b\2!\36"+
		"\3\2\2\2!\37\3\2\2\2! \3\2\2\2\"\7\3\2\2\2#(\5\n\6\2$%\7\3\2\2%\'\5\n"+
		"\6\2&$\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\t\3\2\2\2*(\3\2\2\2+\63"+
		"\5\20\t\2,-\7\6\2\2-\63\5\n\6\2./\7\13\2\2/\60\5\4\3\2\60\61\7\f\2\2\61"+
		"\63\3\2\2\2\62+\3\2\2\2\62,\3\2\2\2\62.\3\2\2\2\63\13\3\2\2\2\64\65\5"+
		"\n\6\2\65\66\7\n\2\2\66\67\5\n\6\2\67\r\3\2\2\289\5\n\6\29:\7\b\2\2:;"+
		"\5\n\6\2;\17\3\2\2\2<>\7\r\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2"+
		"@\21\3\2\2\2A?\3\2\2\2\7\33!(\62?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}