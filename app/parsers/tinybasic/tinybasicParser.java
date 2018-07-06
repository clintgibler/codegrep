// Generated from tinybasic/tinybasic.g4 by ANTLR 4.7.1
package parsers.tinybasic;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tinybasicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, STRING=22, DIGIT=23, VAR=24, CR=25, 
		WS=26;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_statement = 2, RULE_exprlist = 3, 
		RULE_varlist = 4, RULE_expression = 5, RULE_term = 6, RULE_factor = 7, 
		RULE_vara = 8, RULE_number = 9, RULE_relop = 10;
	public static final String[] ruleNames = {
		"program", "line", "statement", "exprlist", "varlist", "expression", "term", 
		"factor", "vara", "number", "relop"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PRINT'", "'IF'", "'THEN'", "'GOTO'", "'INPUT'", "'LET'", "'='", 
		"'GOSUB'", "'RETURN'", "'CLEAR'", "'LIST'", "'RUN'", "'END'", "','", "'+'", 
		"'-'", "'\u03B5'", "'*'", "'/'", "'<'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "STRING", 
		"DIGIT", "VAR", "CR", "WS"
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
	public String getGrammarFileName() { return "tinybasic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tinybasicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << STRING) | (1L << DIGIT) | (1L << VAR))) != 0)) {
				{
				{
				setState(22);
				line();
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

	public static class LineContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode CR() { return getToken(tinybasicParser.CR, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				number();
				setState(29);
				statement();
				setState(30);
				match(CR);
				}
				break;
			case T__0:
			case T__1:
			case T__3:
			case T__4:
			case T__5:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case STRING:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				statement();
				setState(33);
				match(CR);
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

	public static class StatementContext extends ParserRuleContext {
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelopContext relop() {
			return getRuleContext(RelopContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public VaraContext vara() {
			return getRuleContext(VaraContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(T__0);
				setState(38);
				exprlist();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(T__1);
				setState(40);
				expression();
				setState(41);
				relop();
				setState(42);
				expression();
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(43);
					match(T__2);
					}
				}

				setState(46);
				statement();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				match(T__3);
				setState(49);
				number();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(T__4);
				setState(51);
				varlist();
				}
				break;
			case T__5:
			case STRING:
			case VAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(52);
					match(T__5);
					}
				}

				setState(55);
				vara();
				setState(56);
				match(T__6);
				setState(57);
				expression();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(59);
				match(T__7);
				setState(60);
				expression();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 7);
				{
				setState(61);
				match(T__8);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 8);
				{
				setState(62);
				match(T__9);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 9);
				{
				setState(63);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 10);
				{
				setState(64);
				match(T__11);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 11);
				{
				setState(65);
				match(T__12);
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

	public static class ExprlistContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(tinybasicParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(tinybasicParser.STRING, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).enterExprlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).exitExprlist(this);
		}
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_exprlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(68);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(69);
				expression();
				}
				break;
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(72);
				match(T__13);
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(73);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(74);
					expression();
					}
					break;
				}
				}
				}
				setState(81);
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

	public static class VarlistContext extends ParserRuleContext {
		public List<VaraContext> vara() {
			return getRuleContexts(VaraContext.class);
		}
		public VaraContext vara(int i) {
			return getRuleContext(VaraContext.class,i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).exitVarlist(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			vara();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(83);
				match(T__13);
				setState(84);
				vara();
				}
				}
				setState(89);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) {
				{
				setState(90);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(93);
			term();
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					_la = _input.LA(1);
					if ( !(_la==T__14 || _la==T__15) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(95);
					term();
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			factor();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17 || _la==T__18) {
				{
				{
				setState(102);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(103);
				factor();
				}
				}
				setState(108);
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

	public static class FactorContext extends ParserRuleContext {
		public VaraContext vara() {
			return getRuleContext(VaraContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_factor);
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				vara();
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				number();
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

	public static class VaraContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(tinybasicParser.VAR, 0); }
		public TerminalNode STRING() { return getToken(tinybasicParser.STRING, 0); }
		public VaraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).enterVara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).exitVara(this);
		}
	}

	public final VaraContext vara() throws RecognitionException {
		VaraContext _localctx = new VaraContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_vara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==VAR) ) {
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

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(tinybasicParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(tinybasicParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				match(DIGIT);
				}
				}
				setState(118); 
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

	public static class RelopContext extends ParserRuleContext {
		public RelopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).enterRelop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tinybasicListener ) ((tinybasicListener)listener).exitRelop(this);
		}
	}

	public final RelopContext relop() throws RecognitionException {
		RelopContext _localctx = new RelopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relop);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(120);
				match(T__19);
				setState(122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(121);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__16) | (1L << T__20))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(124);
				match(T__20);
				setState(126);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(125);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__16) | (1L << T__19))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(T__6);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(130);
				match(T__15);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u0088\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3&\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\48\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4E\n\4"+
		"\3\5\3\5\5\5I\n\5\3\5\3\5\3\5\5\5N\n\5\7\5P\n\5\f\5\16\5S\13\5\3\6\3\6"+
		"\3\6\7\6X\n\6\f\6\16\6[\13\6\3\7\5\7^\n\7\3\7\3\7\3\7\7\7c\n\7\f\7\16"+
		"\7f\13\7\3\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\t\3\t\5\tr\n\t\3\n\3\n"+
		"\3\13\6\13w\n\13\r\13\16\13x\3\f\3\f\5\f}\n\f\3\f\3\f\5\f\u0081\n\f\3"+
		"\f\3\f\3\f\5\f\u0086\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\b\3\2"+
		"\21\23\3\2\21\22\3\2\24\25\4\2\30\30\32\32\5\2\t\t\23\23\27\27\5\2\t\t"+
		"\23\23\26\26\2\u0099\2\33\3\2\2\2\4%\3\2\2\2\6D\3\2\2\2\bH\3\2\2\2\nT"+
		"\3\2\2\2\f]\3\2\2\2\16g\3\2\2\2\20q\3\2\2\2\22s\3\2\2\2\24v\3\2\2\2\26"+
		"\u0085\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2"+
		"\33\34\3\2\2\2\34\3\3\2\2\2\35\33\3\2\2\2\36\37\5\24\13\2\37 \5\6\4\2"+
		" !\7\33\2\2!&\3\2\2\2\"#\5\6\4\2#$\7\33\2\2$&\3\2\2\2%\36\3\2\2\2%\"\3"+
		"\2\2\2&\5\3\2\2\2\'(\7\3\2\2(E\5\b\5\2)*\7\4\2\2*+\5\f\7\2+,\5\26\f\2"+
		",.\5\f\7\2-/\7\5\2\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\5\6\4\2\61"+
		"E\3\2\2\2\62\63\7\6\2\2\63E\5\24\13\2\64\65\7\7\2\2\65E\5\n\6\2\668\7"+
		"\b\2\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29:\5\22\n\2:;\7\t\2\2;<\5\f"+
		"\7\2<E\3\2\2\2=>\7\n\2\2>E\5\f\7\2?E\7\13\2\2@E\7\f\2\2AE\7\r\2\2BE\7"+
		"\16\2\2CE\7\17\2\2D\'\3\2\2\2D)\3\2\2\2D\62\3\2\2\2D\64\3\2\2\2D\67\3"+
		"\2\2\2D=\3\2\2\2D?\3\2\2\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\7"+
		"\3\2\2\2FI\7\30\2\2GI\5\f\7\2HF\3\2\2\2HG\3\2\2\2IQ\3\2\2\2JM\7\20\2\2"+
		"KN\7\30\2\2LN\5\f\7\2MK\3\2\2\2ML\3\2\2\2NP\3\2\2\2OJ\3\2\2\2PS\3\2\2"+
		"\2QO\3\2\2\2QR\3\2\2\2R\t\3\2\2\2SQ\3\2\2\2TY\5\22\n\2UV\7\20\2\2VX\5"+
		"\22\n\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\13\3\2\2\2[Y\3\2\2\2"+
		"\\^\t\2\2\2]\\\3\2\2\2]^\3\2\2\2^_\3\2\2\2_d\5\16\b\2`a\t\3\2\2ac\5\16"+
		"\b\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\r\3\2\2\2fd\3\2\2\2gl\5"+
		"\20\t\2hi\t\4\2\2ik\5\20\t\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m"+
		"\17\3\2\2\2nl\3\2\2\2or\5\22\n\2pr\5\24\13\2qo\3\2\2\2qp\3\2\2\2r\21\3"+
		"\2\2\2st\t\5\2\2t\23\3\2\2\2uw\7\31\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2"+
		"xy\3\2\2\2y\25\3\2\2\2z|\7\26\2\2{}\t\6\2\2|{\3\2\2\2|}\3\2\2\2}\u0086"+
		"\3\2\2\2~\u0080\7\27\2\2\177\u0081\t\7\2\2\u0080\177\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0086\3\2\2\2\u0082\u0086\7\t\2\2\u0083\u0086\7\21\2\2"+
		"\u0084\u0086\7\22\2\2\u0085z\3\2\2\2\u0085~\3\2\2\2\u0085\u0082\3\2\2"+
		"\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\27\3\2\2\2\23\33%.\67"+
		"DHMQY]dlqx|\u0080\u0085";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}