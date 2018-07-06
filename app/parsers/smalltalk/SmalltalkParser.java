// Generated from smalltalk/Smalltalk.g4 by ANTLR 4.7.1
package parsers.smalltalk;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SmalltalkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEPARATOR=1, STRING=2, COMMENT=3, BLOCK_START=4, BLOCK_END=5, CLOSE_PAREN=6, 
		OPEN_PAREN=7, PIPE=8, PERIOD=9, SEMI_COLON=10, BINARY_SELECTOR=11, LT=12, 
		GT=13, MINUS=14, RESERVED_WORD=15, IDENTIFIER=16, CARROT=17, COLON=18, 
		ASSIGNMENT=19, HASH=20, DOLLAR=21, EXP=22, HEX=23, LITARR_START=24, DYNDICT_START=25, 
		DYNARR_END=26, DYNARR_START=27, DIGIT=28, HEXDIGIT=29, KEYWORD=30, BLOCK_PARAM=31, 
		CHARACTER_CONSTANT=32;
	public static final int
		RULE_script = 0, RULE_sequence = 1, RULE_ws = 2, RULE_temps = 3, RULE_statements = 4, 
		RULE_answer = 5, RULE_expression = 6, RULE_expressions = 7, RULE_expressionList = 8, 
		RULE_cascade = 9, RULE_message = 10, RULE_assignment = 11, RULE_variable = 12, 
		RULE_binarySend = 13, RULE_unarySend = 14, RULE_keywordSend = 15, RULE_keywordMessage = 16, 
		RULE_keywordPair = 17, RULE_operand = 18, RULE_subexpression = 19, RULE_literal = 20, 
		RULE_runtimeLiteral = 21, RULE_block = 22, RULE_blockParamList = 23, RULE_dynamicDictionary = 24, 
		RULE_dynamicArray = 25, RULE_parsetimeLiteral = 26, RULE_number = 27, 
		RULE_numberExp = 28, RULE_charConstant = 29, RULE_hex = 30, RULE_stInteger = 31, 
		RULE_stFloat = 32, RULE_pseudoVariable = 33, RULE_string = 34, RULE_symbol = 35, 
		RULE_primitive = 36, RULE_bareSymbol = 37, RULE_literalArray = 38, RULE_literalArrayRest = 39, 
		RULE_bareLiteralArray = 40, RULE_unaryTail = 41, RULE_unaryMessage = 42, 
		RULE_unarySelector = 43, RULE_keywords = 44, RULE_reference = 45, RULE_binaryTail = 46, 
		RULE_binaryMessage = 47;
	public static final String[] ruleNames = {
		"script", "sequence", "ws", "temps", "statements", "answer", "expression", 
		"expressions", "expressionList", "cascade", "message", "assignment", "variable", 
		"binarySend", "unarySend", "keywordSend", "keywordMessage", "keywordPair", 
		"operand", "subexpression", "literal", "runtimeLiteral", "block", "blockParamList", 
		"dynamicDictionary", "dynamicArray", "parsetimeLiteral", "number", "numberExp", 
		"charConstant", "hex", "stInteger", "stFloat", "pseudoVariable", "string", 
		"symbol", "primitive", "bareSymbol", "literalArray", "literalArrayRest", 
		"bareLiteralArray", "unaryTail", "unaryMessage", "unarySelector", "keywords", 
		"reference", "binaryTail", "binaryMessage"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'['", "']'", "')'", "'('", "'|'", "'.'", "';'", 
		null, "'<'", "'>'", "'-'", null, null, "'^'", "':'", "':='", "'#'", "'$'", 
		"'e'", "'16r'", "'#('", "'#{'", "'}'", "'{'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SEPARATOR", "STRING", "COMMENT", "BLOCK_START", "BLOCK_END", "CLOSE_PAREN", 
		"OPEN_PAREN", "PIPE", "PERIOD", "SEMI_COLON", "BINARY_SELECTOR", "LT", 
		"GT", "MINUS", "RESERVED_WORD", "IDENTIFIER", "CARROT", "COLON", "ASSIGNMENT", 
		"HASH", "DOLLAR", "EXP", "HEX", "LITARR_START", "DYNDICT_START", "DYNARR_END", 
		"DYNARR_START", "DIGIT", "HEXDIGIT", "KEYWORD", "BLOCK_PARAM", "CHARACTER_CONSTANT"
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
	public String getGrammarFileName() { return "Smalltalk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SmalltalkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ScriptContext extends ParserRuleContext {
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SmalltalkParser.EOF, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			sequence();
			setState(97);
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

	public static class SequenceContext extends ParserRuleContext {
		public TempsContext temps() {
			return getRuleContext(TempsContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitSequence(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sequence);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				temps();
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==COMMENT) {
					{
					setState(100);
					ws();
					}
				}

				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << BLOCK_START) | (1L << OPEN_PAREN) | (1L << LT) | (1L << MINUS) | (1L << RESERVED_WORD) | (1L << IDENTIFIER) | (1L << CARROT) | (1L << HASH) | (1L << HEX) | (1L << LITARR_START) | (1L << DYNDICT_START) | (1L << DYNARR_START) | (1L << DIGIT) | (1L << CHARACTER_CONSTANT))) != 0)) {
					{
					setState(103);
					statements();
					}
				}

				}
				break;
			case SEPARATOR:
			case STRING:
			case COMMENT:
			case BLOCK_START:
			case OPEN_PAREN:
			case LT:
			case MINUS:
			case RESERVED_WORD:
			case IDENTIFIER:
			case CARROT:
			case HASH:
			case HEX:
			case LITARR_START:
			case DYNDICT_START:
			case DYNARR_START:
			case DIGIT:
			case CHARACTER_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==COMMENT) {
					{
					setState(106);
					ws();
					}
				}

				setState(109);
				statements();
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

	public static class WsContext extends ParserRuleContext {
		public List<TerminalNode> SEPARATOR() { return getTokens(SmalltalkParser.SEPARATOR); }
		public TerminalNode SEPARATOR(int i) {
			return getToken(SmalltalkParser.SEPARATOR, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(SmalltalkParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(SmalltalkParser.COMMENT, i);
		}
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitWs(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ws);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(112);
					_la = _input.LA(1);
					if ( !(_la==SEPARATOR || _la==COMMENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(115); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class TempsContext extends ParserRuleContext {
		public List<TerminalNode> PIPE() { return getTokens(SmalltalkParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(SmalltalkParser.PIPE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SmalltalkParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SmalltalkParser.IDENTIFIER, i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TempsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterTemps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitTemps(this);
		}
	}

	public final TempsContext temps() throws RecognitionException {
		TempsContext _localctx = new TempsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_temps);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(PIPE);
			setState(122); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEPARATOR || _la==COMMENT) {
						{
						setState(118);
						ws();
						}
					}

					setState(121);
					match(IDENTIFIER);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(124); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR || _la==COMMENT) {
				{
				setState(126);
				ws();
				}
			}

			setState(129);
			match(PIPE);
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	 
		public StatementsContext() { }
		public void copyFrom(StatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StatementAnswerContext extends StatementsContext {
		public AnswerContext answer() {
			return getRuleContext(AnswerContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public StatementAnswerContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterStatementAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitStatementAnswer(this);
		}
	}
	public static class StatementExpressionsContext extends StatementsContext {
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(SmalltalkParser.PERIOD, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public StatementExpressionsContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterStatementExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitStatementExpressions(this);
		}
	}
	public static class StatementExpressionsAnswerContext extends StatementsContext {
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(SmalltalkParser.PERIOD, 0); }
		public AnswerContext answer() {
			return getRuleContext(AnswerContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public StatementExpressionsAnswerContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterStatementExpressionsAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitStatementExpressionsAnswer(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statements);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new StatementAnswerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				answer();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==COMMENT) {
					{
					setState(132);
					ws();
					}
				}

				}
				break;
			case 2:
				_localctx = new StatementExpressionsAnswerContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				expressions();
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==COMMENT) {
					{
					setState(136);
					ws();
					}
				}

				setState(139);
				match(PERIOD);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==COMMENT) {
					{
					setState(140);
					ws();
					}
				}

				setState(143);
				answer();
				}
				break;
			case 3:
				_localctx = new StatementExpressionsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				expressions();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PERIOD) {
					{
					setState(146);
					match(PERIOD);
					}
				}

				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==COMMENT) {
					{
					setState(149);
					ws();
					}
				}

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

	public static class AnswerContext extends ParserRuleContext {
		public TerminalNode CARROT() { return getToken(SmalltalkParser.CARROT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode PERIOD() { return getToken(SmalltalkParser.PERIOD, 0); }
		public AnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterAnswer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitAnswer(this);
		}
	}

	public final AnswerContext answer() throws RecognitionException {
		AnswerContext _localctx = new AnswerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_answer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(CARROT);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR || _la==COMMENT) {
				{
				setState(155);
				ws();
				}
			}

			setState(158);
			expression();
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(159);
				ws();
				}
				break;
			}
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PERIOD) {
				{
				setState(162);
				match(PERIOD);
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CascadeContext cascade() {
			return getRuleContext(CascadeContext.class,0);
		}
		public KeywordSendContext keywordSend() {
			return getRuleContext(KeywordSendContext.class,0);
		}
		public BinarySendContext binarySend() {
			return getRuleContext(BinarySendContext.class,0);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				cascade();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				keywordSend();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				binarySend();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				primitive();
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

	public static class ExpressionsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitExpressions(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			expression();
			setState(176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					expressionList();
					}
					} 
				}
				setState(178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(SmalltalkParser.PERIOD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(PERIOD);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR || _la==COMMENT) {
				{
				setState(180);
				ws();
				}
			}

			setState(183);
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

	public static class CascadeContext extends ParserRuleContext {
		public KeywordSendContext keywordSend() {
			return getRuleContext(KeywordSendContext.class,0);
		}
		public BinarySendContext binarySend() {
			return getRuleContext(BinarySendContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(SmalltalkParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(SmalltalkParser.SEMI_COLON, i);
		}
		public List<MessageContext> message() {
			return getRuleContexts(MessageContext.class);
		}
		public MessageContext message(int i) {
			return getRuleContext(MessageContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public CascadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cascade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterCascade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitCascade(this);
		}
	}

	public final CascadeContext cascade() throws RecognitionException {
		CascadeContext _localctx = new CascadeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cascade);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(185);
				keywordSend();
				}
				break;
			case 2:
				{
				setState(186);
				binarySend();
				}
				break;
			}
			setState(197); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEPARATOR || _la==COMMENT) {
						{
						setState(189);
						ws();
						}
					}

					setState(192);
					match(SEMI_COLON);
					setState(194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(193);
						ws();
						}
						break;
					}
					setState(196);
					message();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(199); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class MessageContext extends ParserRuleContext {
		public BinaryMessageContext binaryMessage() {
			return getRuleContext(BinaryMessageContext.class,0);
		}
		public UnaryMessageContext unaryMessage() {
			return getRuleContext(UnaryMessageContext.class,0);
		}
		public KeywordMessageContext keywordMessage() {
			return getRuleContext(KeywordMessageContext.class,0);
		}
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitMessage(this);
		}
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_message);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				binaryMessage();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				unaryMessage();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				keywordMessage();
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

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGNMENT() { return getToken(SmalltalkParser.ASSIGNMENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			variable();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR || _la==COMMENT) {
				{
				setState(207);
				ws();
				}
			}

			setState(210);
			match(ASSIGNMENT);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR || _la==COMMENT) {
				{
				setState(211);
				ws();
				}
			}

			setState(214);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SmalltalkParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(IDENTIFIER);
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

	public static class BinarySendContext extends ParserRuleContext {
		public UnarySendContext unarySend() {
			return getRuleContext(UnarySendContext.class,0);
		}
		public BinaryTailContext binaryTail() {
			return getRuleContext(BinaryTailContext.class,0);
		}
		public BinarySendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binarySend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterBinarySend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitBinarySend(this);
		}
	}

	public final BinarySendContext binarySend() throws RecognitionException {
		BinarySendContext _localctx = new BinarySendContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_binarySend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			unarySend();
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(219);
				binaryTail();
				}
				break;
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

	public static class UnarySendContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public UnaryTailContext unaryTail() {
			return getRuleContext(UnaryTailContext.class,0);
		}
		public UnarySendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unarySend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterUnarySend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitUnarySend(this);
		}
	}

	public final UnarySendContext unarySend() throws RecognitionException {
		UnarySendContext _localctx = new UnarySendContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unarySend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			operand();
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(223);
				ws();
				}
				break;
			}
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(226);
				unaryTail();
				}
				break;
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

	public static class KeywordSendContext extends ParserRuleContext {
		public BinarySendContext binarySend() {
			return getRuleContext(BinarySendContext.class,0);
		}
		public KeywordMessageContext keywordMessage() {
			return getRuleContext(KeywordMessageContext.class,0);
		}
		public KeywordSendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordSend; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterKeywordSend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitKeywordSend(this);
		}
	}

	public final KeywordSendContext keywordSend() throws RecognitionException {
		KeywordSendContext _localctx = new KeywordSendContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_keywordSend);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			binarySend();
			setState(230);
			keywordMessage();
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

	public static class KeywordMessageContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<KeywordPairContext> keywordPair() {
			return getRuleContexts(KeywordPairContext.class);
		}
		public KeywordPairContext keywordPair(int i) {
			return getRuleContext(KeywordPairContext.class,i);
		}
		public KeywordMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterKeywordMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitKeywordMessage(this);
		}
	}

	public final KeywordMessageContext keywordMessage() throws RecognitionException {
		KeywordMessageContext _localctx = new KeywordMessageContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_keywordMessage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR || _la==COMMENT) {
				{
				setState(232);
				ws();
				}
			}

			setState(239); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(235);
				keywordPair();
				setState(237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(236);
					ws();
					}
					break;
				}
				}
				}
				setState(241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KEYWORD );
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

	public static class KeywordPairContext extends ParserRuleContext {
		public TerminalNode KEYWORD() { return getToken(SmalltalkParser.KEYWORD, 0); }
		public BinarySendContext binarySend() {
			return getRuleContext(BinarySendContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public KeywordPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterKeywordPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitKeywordPair(this);
		}
	}

	public final KeywordPairContext keywordPair() throws RecognitionException {
		KeywordPairContext _localctx = new KeywordPairContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_keywordPair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(KEYWORD);
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR || _la==COMMENT) {
				{
				setState(244);
				ws();
				}
			}

			setState(247);
			binarySend();
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(248);
				ws();
				}
				break;
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

	public static class OperandContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public SubexpressionContext subexpression() {
			return getRuleContext(SubexpressionContext.class,0);
		}
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_operand);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
			case BLOCK_START:
			case MINUS:
			case RESERVED_WORD:
			case HASH:
			case HEX:
			case LITARR_START:
			case DYNDICT_START:
			case DYNARR_START:
			case DIGIT:
			case CHARACTER_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				literal();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				reference();
				}
				break;
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				subexpression();
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

	public static class SubexpressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(SmalltalkParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(SmalltalkParser.CLOSE_PAREN, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public SubexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterSubexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitSubexpression(this);
		}
	}

	public final SubexpressionContext subexpression() throws RecognitionException {
		SubexpressionContext _localctx = new SubexpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_subexpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(OPEN_PAREN);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR || _la==COMMENT) {
				{
				setState(257);
				ws();
				}
			}

			setState(260);
			expression();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR || _la==COMMENT) {
				{
				setState(261);
				ws();
				}
			}

			setState(264);
			match(CLOSE_PAREN);
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

	public static class LiteralContext extends ParserRuleContext {
		public RuntimeLiteralContext runtimeLiteral() {
			return getRuleContext(RuntimeLiteralContext.class,0);
		}
		public ParsetimeLiteralContext parsetimeLiteral() {
			return getRuleContext(ParsetimeLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_literal);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLOCK_START:
			case DYNDICT_START:
			case DYNARR_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				runtimeLiteral();
				}
				break;
			case STRING:
			case MINUS:
			case RESERVED_WORD:
			case HASH:
			case HEX:
			case LITARR_START:
			case DIGIT:
			case CHARACTER_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				parsetimeLiteral();
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

	public static class RuntimeLiteralContext extends ParserRuleContext {
		public DynamicDictionaryContext dynamicDictionary() {
			return getRuleContext(DynamicDictionaryContext.class,0);
		}
		public DynamicArrayContext dynamicArray() {
			return getRuleContext(DynamicArrayContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RuntimeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runtimeLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterRuntimeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitRuntimeLiteral(this);
		}
	}

	public final RuntimeLiteralContext runtimeLiteral() throws RecognitionException {
		RuntimeLiteralContext _localctx = new RuntimeLiteralContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_runtimeLiteral);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DYNDICT_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				dynamicDictionary();
				}
				break;
			case DYNARR_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				dynamicArray();
				}
				break;
			case BLOCK_START:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
				block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BLOCK_START() { return getToken(SmalltalkParser.BLOCK_START, 0); }
		public TerminalNode BLOCK_END() { return getToken(SmalltalkParser.BLOCK_END, 0); }
		public BlockParamListContext blockParamList() {
			return getRuleContext(BlockParamListContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(BLOCK_START);
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(276);
				blockParamList();
				}
				break;
			}
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(279);
				ws();
				}
				break;
			}
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEPARATOR) | (1L << STRING) | (1L << COMMENT) | (1L << BLOCK_START) | (1L << OPEN_PAREN) | (1L << PIPE) | (1L << LT) | (1L << MINUS) | (1L << RESERVED_WORD) | (1L << IDENTIFIER) | (1L << CARROT) | (1L << HASH) | (1L << HEX) | (1L << LITARR_START) | (1L << DYNDICT_START) | (1L << DYNARR_START) | (1L << DIGIT) | (1L << CHARACTER_CONSTANT))) != 0)) {
				{
				setState(282);
				sequence();
				}
			}

			setState(285);
			match(BLOCK_END);
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

	public static class BlockParamListContext extends ParserRuleContext {
		public List<TerminalNode> BLOCK_PARAM() { return getTokens(SmalltalkParser.BLOCK_PARAM); }
		public TerminalNode BLOCK_PARAM(int i) {
			return getToken(SmalltalkParser.BLOCK_PARAM, i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public BlockParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockParamList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterBlockParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitBlockParamList(this);
		}
	}

	public final BlockParamListContext blockParamList() throws RecognitionException {
		BlockParamListContext _localctx = new BlockParamListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_blockParamList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(291); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEPARATOR || _la==COMMENT) {
						{
						setState(287);
						ws();
						}
					}

					setState(290);
					match(BLOCK_PARAM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(293); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class DynamicDictionaryContext extends ParserRuleContext {
		public TerminalNode DYNDICT_START() { return getToken(SmalltalkParser.DYNDICT_START, 0); }
		public TerminalNode DYNARR_END() { return getToken(SmalltalkParser.DYNARR_END, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public DynamicDictionaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicDictionary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterDynamicDictionary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitDynamicDictionary(this);
		}
	}

	public final DynamicDictionaryContext dynamicDictionary() throws RecognitionException {
		DynamicDictionaryContext _localctx = new DynamicDictionaryContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dynamicDictionary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(DYNDICT_START);
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(296);
				ws();
				}
				break;
			}
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << BLOCK_START) | (1L << OPEN_PAREN) | (1L << LT) | (1L << MINUS) | (1L << RESERVED_WORD) | (1L << IDENTIFIER) | (1L << HASH) | (1L << HEX) | (1L << LITARR_START) | (1L << DYNDICT_START) | (1L << DYNARR_START) | (1L << DIGIT) | (1L << CHARACTER_CONSTANT))) != 0)) {
				{
				setState(299);
				expressions();
				}
			}

			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR || _la==COMMENT) {
				{
				setState(302);
				ws();
				}
			}

			setState(305);
			match(DYNARR_END);
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

	public static class DynamicArrayContext extends ParserRuleContext {
		public TerminalNode DYNARR_START() { return getToken(SmalltalkParser.DYNARR_START, 0); }
		public TerminalNode DYNARR_END() { return getToken(SmalltalkParser.DYNARR_END, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public DynamicArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterDynamicArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitDynamicArray(this);
		}
	}

	public final DynamicArrayContext dynamicArray() throws RecognitionException {
		DynamicArrayContext _localctx = new DynamicArrayContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dynamicArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(DYNARR_START);
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(308);
				ws();
				}
				break;
			}
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << BLOCK_START) | (1L << OPEN_PAREN) | (1L << LT) | (1L << MINUS) | (1L << RESERVED_WORD) | (1L << IDENTIFIER) | (1L << HASH) | (1L << HEX) | (1L << LITARR_START) | (1L << DYNDICT_START) | (1L << DYNARR_START) | (1L << DIGIT) | (1L << CHARACTER_CONSTANT))) != 0)) {
				{
				setState(311);
				expressions();
				}
			}

			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR || _la==COMMENT) {
				{
				setState(314);
				ws();
				}
			}

			setState(317);
			match(DYNARR_END);
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

	public static class ParsetimeLiteralContext extends ParserRuleContext {
		public PseudoVariableContext pseudoVariable() {
			return getRuleContext(PseudoVariableContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CharConstantContext charConstant() {
			return getRuleContext(CharConstantContext.class,0);
		}
		public LiteralArrayContext literalArray() {
			return getRuleContext(LiteralArrayContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public ParsetimeLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parsetimeLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterParsetimeLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitParsetimeLiteral(this);
		}
	}

	public final ParsetimeLiteralContext parsetimeLiteral() throws RecognitionException {
		ParsetimeLiteralContext _localctx = new ParsetimeLiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parsetimeLiteral);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RESERVED_WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				pseudoVariable();
				}
				break;
			case MINUS:
			case HEX:
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				number();
				}
				break;
			case CHARACTER_CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
				charConstant();
				}
				break;
			case LITARR_START:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				literalArray();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(323);
				string();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 6);
				{
				setState(324);
				symbol();
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

	public static class NumberContext extends ParserRuleContext {
		public NumberExpContext numberExp() {
			return getRuleContext(NumberExpContext.class,0);
		}
		public HexContext hex() {
			return getRuleContext(HexContext.class,0);
		}
		public StFloatContext stFloat() {
			return getRuleContext(StFloatContext.class,0);
		}
		public StIntegerContext stInteger() {
			return getRuleContext(StIntegerContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_number);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				numberExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				hex();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				stFloat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(330);
				stInteger();
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

	public static class NumberExpContext extends ParserRuleContext {
		public TerminalNode EXP() { return getToken(SmalltalkParser.EXP, 0); }
		public List<StIntegerContext> stInteger() {
			return getRuleContexts(StIntegerContext.class);
		}
		public StIntegerContext stInteger(int i) {
			return getRuleContext(StIntegerContext.class,i);
		}
		public StFloatContext stFloat() {
			return getRuleContext(StFloatContext.class,0);
		}
		public NumberExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterNumberExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitNumberExp(this);
		}
	}

	public final NumberExpContext numberExp() throws RecognitionException {
		NumberExpContext _localctx = new NumberExpContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_numberExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(333);
				stFloat();
				}
				break;
			case 2:
				{
				setState(334);
				stInteger();
				}
				break;
			}
			setState(337);
			match(EXP);
			setState(338);
			stInteger();
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

	public static class CharConstantContext extends ParserRuleContext {
		public TerminalNode CHARACTER_CONSTANT() { return getToken(SmalltalkParser.CHARACTER_CONSTANT, 0); }
		public CharConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterCharConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitCharConstant(this);
		}
	}

	public final CharConstantContext charConstant() throws RecognitionException {
		CharConstantContext _localctx = new CharConstantContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_charConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(CHARACTER_CONSTANT);
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

	public static class HexContext extends ParserRuleContext {
		public TerminalNode HEX() { return getToken(SmalltalkParser.HEX, 0); }
		public TerminalNode MINUS() { return getToken(SmalltalkParser.MINUS, 0); }
		public List<TerminalNode> HEXDIGIT() { return getTokens(SmalltalkParser.HEXDIGIT); }
		public TerminalNode HEXDIGIT(int i) {
			return getToken(SmalltalkParser.HEXDIGIT, i);
		}
		public HexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterHex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitHex(this);
		}
	}

	public final HexContext hex() throws RecognitionException {
		HexContext _localctx = new HexContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_hex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(342);
				match(MINUS);
				}
			}

			setState(345);
			match(HEX);
			setState(347); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(346);
				match(HEXDIGIT);
				}
				}
				setState(349); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==HEXDIGIT );
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

	public static class StIntegerContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SmalltalkParser.MINUS, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(SmalltalkParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(SmalltalkParser.DIGIT, i);
		}
		public StIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterStInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitStInteger(this);
		}
	}

	public final StIntegerContext stInteger() throws RecognitionException {
		StIntegerContext _localctx = new StIntegerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_stInteger);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(351);
				match(MINUS);
				}
			}

			setState(355); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(354);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(357); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class StFloatContext extends ParserRuleContext {
		public TerminalNode PERIOD() { return getToken(SmalltalkParser.PERIOD, 0); }
		public TerminalNode MINUS() { return getToken(SmalltalkParser.MINUS, 0); }
		public List<TerminalNode> DIGIT() { return getTokens(SmalltalkParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(SmalltalkParser.DIGIT, i);
		}
		public StFloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stFloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterStFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitStFloat(this);
		}
	}

	public final StFloatContext stFloat() throws RecognitionException {
		StFloatContext _localctx = new StFloatContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_stFloat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(359);
				match(MINUS);
				}
			}

			setState(363); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(362);
				match(DIGIT);
				}
				}
				setState(365); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(367);
			match(PERIOD);
			setState(369); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(368);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(371); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class PseudoVariableContext extends ParserRuleContext {
		public TerminalNode RESERVED_WORD() { return getToken(SmalltalkParser.RESERVED_WORD, 0); }
		public PseudoVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterPseudoVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitPseudoVariable(this);
		}
	}

	public final PseudoVariableContext pseudoVariable() throws RecognitionException {
		PseudoVariableContext _localctx = new PseudoVariableContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_pseudoVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(RESERVED_WORD);
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
		public TerminalNode STRING() { return getToken(SmalltalkParser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
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

	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(SmalltalkParser.HASH, 0); }
		public BareSymbolContext bareSymbol() {
			return getRuleContext(BareSymbolContext.class,0);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitSymbol(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(HASH);
			setState(378);
			bareSymbol();
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

	public static class PrimitiveContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(SmalltalkParser.LT, 0); }
		public TerminalNode KEYWORD() { return getToken(SmalltalkParser.KEYWORD, 0); }
		public TerminalNode GT() { return getToken(SmalltalkParser.GT, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(SmalltalkParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(SmalltalkParser.DIGIT, i);
		}
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitPrimitive(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(LT);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR || _la==COMMENT) {
				{
				setState(381);
				ws();
				}
			}

			setState(384);
			match(KEYWORD);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR || _la==COMMENT) {
				{
				setState(385);
				ws();
				}
			}

			setState(389); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(388);
				match(DIGIT);
				}
				}
				setState(391); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR || _la==COMMENT) {
				{
				setState(393);
				ws();
				}
			}

			setState(396);
			match(GT);
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

	public static class BareSymbolContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SmalltalkParser.IDENTIFIER, 0); }
		public TerminalNode BINARY_SELECTOR() { return getToken(SmalltalkParser.BINARY_SELECTOR, 0); }
		public List<TerminalNode> KEYWORD() { return getTokens(SmalltalkParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SmalltalkParser.KEYWORD, i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public BareSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bareSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterBareSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitBareSymbol(this);
		}
	}

	public final BareSymbolContext bareSymbol() throws RecognitionException {
		BareSymbolContext _localctx = new BareSymbolContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_bareSymbol);
		int _la;
		try {
			int _alt;
			setState(405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY_SELECTOR:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				_la = _input.LA(1);
				if ( !(_la==BINARY_SELECTOR || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(400); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(399);
						match(KEYWORD);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(402); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				string();
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

	public static class LiteralArrayContext extends ParserRuleContext {
		public TerminalNode LITARR_START() { return getToken(SmalltalkParser.LITARR_START, 0); }
		public LiteralArrayRestContext literalArrayRest() {
			return getRuleContext(LiteralArrayRestContext.class,0);
		}
		public LiteralArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterLiteralArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitLiteralArray(this);
		}
	}

	public final LiteralArrayContext literalArray() throws RecognitionException {
		LiteralArrayContext _localctx = new LiteralArrayContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_literalArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(LITARR_START);
			setState(408);
			literalArrayRest();
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

	public static class LiteralArrayRestContext extends ParserRuleContext {
		public TerminalNode CLOSE_PAREN() { return getToken(SmalltalkParser.CLOSE_PAREN, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<ParsetimeLiteralContext> parsetimeLiteral() {
			return getRuleContexts(ParsetimeLiteralContext.class);
		}
		public ParsetimeLiteralContext parsetimeLiteral(int i) {
			return getRuleContext(ParsetimeLiteralContext.class,i);
		}
		public List<BareLiteralArrayContext> bareLiteralArray() {
			return getRuleContexts(BareLiteralArrayContext.class);
		}
		public BareLiteralArrayContext bareLiteralArray(int i) {
			return getRuleContext(BareLiteralArrayContext.class,i);
		}
		public List<BareSymbolContext> bareSymbol() {
			return getRuleContexts(BareSymbolContext.class);
		}
		public BareSymbolContext bareSymbol(int i) {
			return getRuleContext(BareSymbolContext.class,i);
		}
		public LiteralArrayRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalArrayRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterLiteralArrayRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitLiteralArrayRest(this);
		}
	}

	public final LiteralArrayRestContext literalArrayRest() throws RecognitionException {
		LiteralArrayRestContext _localctx = new LiteralArrayRestContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_literalArrayRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR || _la==COMMENT) {
				{
				setState(410);
				ws();
				}
			}

			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << OPEN_PAREN) | (1L << BINARY_SELECTOR) | (1L << MINUS) | (1L << RESERVED_WORD) | (1L << IDENTIFIER) | (1L << HASH) | (1L << HEX) | (1L << LITARR_START) | (1L << DIGIT) | (1L << KEYWORD) | (1L << CHARACTER_CONSTANT))) != 0)) {
				{
				{
				setState(416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(413);
					parsetimeLiteral();
					}
					break;
				case 2:
					{
					setState(414);
					bareLiteralArray();
					}
					break;
				case 3:
					{
					setState(415);
					bareSymbol();
					}
					break;
				}
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARATOR || _la==COMMENT) {
					{
					setState(418);
					ws();
					}
				}

				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
			match(CLOSE_PAREN);
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

	public static class BareLiteralArrayContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(SmalltalkParser.OPEN_PAREN, 0); }
		public LiteralArrayRestContext literalArrayRest() {
			return getRuleContext(LiteralArrayRestContext.class,0);
		}
		public BareLiteralArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bareLiteralArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterBareLiteralArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitBareLiteralArray(this);
		}
	}

	public final BareLiteralArrayContext bareLiteralArray() throws RecognitionException {
		BareLiteralArrayContext _localctx = new BareLiteralArrayContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_bareLiteralArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			match(OPEN_PAREN);
			setState(429);
			literalArrayRest();
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

	public static class UnaryTailContext extends ParserRuleContext {
		public UnaryMessageContext unaryMessage() {
			return getRuleContext(UnaryMessageContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public UnaryTailContext unaryTail() {
			return getRuleContext(UnaryTailContext.class,0);
		}
		public UnaryTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterUnaryTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitUnaryTail(this);
		}
	}

	public final UnaryTailContext unaryTail() throws RecognitionException {
		UnaryTailContext _localctx = new UnaryTailContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_unaryTail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			unaryMessage();
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(432);
				ws();
				}
				break;
			}
			setState(436);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(435);
				unaryTail();
				}
				break;
			}
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(438);
				ws();
				}
				break;
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

	public static class UnaryMessageContext extends ParserRuleContext {
		public UnarySelectorContext unarySelector() {
			return getRuleContext(UnarySelectorContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public UnaryMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterUnaryMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitUnaryMessage(this);
		}
	}

	public final UnaryMessageContext unaryMessage() throws RecognitionException {
		UnaryMessageContext _localctx = new UnaryMessageContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_unaryMessage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR || _la==COMMENT) {
				{
				setState(441);
				ws();
				}
			}

			setState(444);
			unarySelector();
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

	public static class UnarySelectorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SmalltalkParser.IDENTIFIER, 0); }
		public UnarySelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unarySelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterUnarySelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitUnarySelector(this);
		}
	}

	public final UnarySelectorContext unarySelector() throws RecognitionException {
		UnarySelectorContext _localctx = new UnarySelectorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_unarySelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(IDENTIFIER);
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

	public static class KeywordsContext extends ParserRuleContext {
		public List<TerminalNode> KEYWORD() { return getTokens(SmalltalkParser.KEYWORD); }
		public TerminalNode KEYWORD(int i) {
			return getToken(SmalltalkParser.KEYWORD, i);
		}
		public KeywordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterKeywords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitKeywords(this);
		}
	}

	public final KeywordsContext keywords() throws RecognitionException {
		KeywordsContext _localctx = new KeywordsContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_keywords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(448);
				match(KEYWORD);
				}
				}
				setState(451); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==KEYWORD );
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

	public static class ReferenceContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitReference(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_reference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			variable();
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

	public static class BinaryTailContext extends ParserRuleContext {
		public BinaryMessageContext binaryMessage() {
			return getRuleContext(BinaryMessageContext.class,0);
		}
		public BinaryTailContext binaryTail() {
			return getRuleContext(BinaryTailContext.class,0);
		}
		public BinaryTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterBinaryTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitBinaryTail(this);
		}
	}

	public final BinaryTailContext binaryTail() throws RecognitionException {
		BinaryTailContext _localctx = new BinaryTailContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_binaryTail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			binaryMessage();
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(456);
				binaryTail();
				}
				break;
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

	public static class BinaryMessageContext extends ParserRuleContext {
		public TerminalNode BINARY_SELECTOR() { return getToken(SmalltalkParser.BINARY_SELECTOR, 0); }
		public UnarySendContext unarySend() {
			return getRuleContext(UnarySendContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public BinaryMessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryMessage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).enterBinaryMessage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SmalltalkListener ) ((SmalltalkListener)listener).exitBinaryMessage(this);
		}
	}

	public final BinaryMessageContext binaryMessage() throws RecognitionException {
		BinaryMessageContext _localctx = new BinaryMessageContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_binaryMessage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR || _la==COMMENT) {
				{
				setState(459);
				ws();
				}
			}

			setState(462);
			match(BINARY_SELECTOR);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR || _la==COMMENT) {
				{
				setState(463);
				ws();
				}
			}

			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(466);
				unarySend();
				}
				break;
			case 2:
				{
				setState(467);
				operand();
				}
				break;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u01d9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\3\3\3\5\3h\n"+
		"\3\3\3\5\3k\n\3\3\3\5\3n\n\3\3\3\5\3q\n\3\3\4\6\4t\n\4\r\4\16\4u\3\5\3"+
		"\5\5\5z\n\5\3\5\6\5}\n\5\r\5\16\5~\3\5\5\5\u0082\n\5\3\5\3\5\3\6\3\6\5"+
		"\6\u0088\n\6\3\6\3\6\5\6\u008c\n\6\3\6\3\6\5\6\u0090\n\6\3\6\3\6\3\6\3"+
		"\6\5\6\u0096\n\6\3\6\5\6\u0099\n\6\5\6\u009b\n\6\3\7\3\7\5\7\u009f\n\7"+
		"\3\7\3\7\5\7\u00a3\n\7\3\7\5\7\u00a6\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u00ad"+
		"\n\b\3\t\3\t\7\t\u00b1\n\t\f\t\16\t\u00b4\13\t\3\n\3\n\5\n\u00b8\n\n\3"+
		"\n\3\n\3\13\3\13\5\13\u00be\n\13\3\13\5\13\u00c1\n\13\3\13\3\13\5\13\u00c5"+
		"\n\13\3\13\6\13\u00c8\n\13\r\13\16\13\u00c9\3\f\3\f\3\f\5\f\u00cf\n\f"+
		"\3\r\3\r\5\r\u00d3\n\r\3\r\3\r\5\r\u00d7\n\r\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\5\17\u00df\n\17\3\20\3\20\5\20\u00e3\n\20\3\20\5\20\u00e6\n\20\3\21"+
		"\3\21\3\21\3\22\5\22\u00ec\n\22\3\22\3\22\5\22\u00f0\n\22\6\22\u00f2\n"+
		"\22\r\22\16\22\u00f3\3\23\3\23\5\23\u00f8\n\23\3\23\3\23\5\23\u00fc\n"+
		"\23\3\24\3\24\3\24\5\24\u0101\n\24\3\25\3\25\5\25\u0105\n\25\3\25\3\25"+
		"\5\25\u0109\n\25\3\25\3\25\3\26\3\26\5\26\u010f\n\26\3\27\3\27\3\27\5"+
		"\27\u0114\n\27\3\30\3\30\5\30\u0118\n\30\3\30\5\30\u011b\n\30\3\30\5\30"+
		"\u011e\n\30\3\30\3\30\3\31\5\31\u0123\n\31\3\31\6\31\u0126\n\31\r\31\16"+
		"\31\u0127\3\32\3\32\5\32\u012c\n\32\3\32\5\32\u012f\n\32\3\32\5\32\u0132"+
		"\n\32\3\32\3\32\3\33\3\33\5\33\u0138\n\33\3\33\5\33\u013b\n\33\3\33\5"+
		"\33\u013e\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0148\n\34"+
		"\3\35\3\35\3\35\3\35\5\35\u014e\n\35\3\36\3\36\5\36\u0152\n\36\3\36\3"+
		"\36\3\36\3\37\3\37\3 \5 \u015a\n \3 \3 \6 \u015e\n \r \16 \u015f\3!\5"+
		"!\u0163\n!\3!\6!\u0166\n!\r!\16!\u0167\3\"\5\"\u016b\n\"\3\"\6\"\u016e"+
		"\n\"\r\"\16\"\u016f\3\"\3\"\6\"\u0174\n\"\r\"\16\"\u0175\3#\3#\3$\3$\3"+
		"%\3%\3%\3&\3&\5&\u0181\n&\3&\3&\5&\u0185\n&\3&\6&\u0188\n&\r&\16&\u0189"+
		"\3&\5&\u018d\n&\3&\3&\3\'\3\'\6\'\u0193\n\'\r\'\16\'\u0194\3\'\5\'\u0198"+
		"\n\'\3(\3(\3(\3)\5)\u019e\n)\3)\3)\3)\5)\u01a3\n)\3)\5)\u01a6\n)\7)\u01a8"+
		"\n)\f)\16)\u01ab\13)\3)\3)\3*\3*\3*\3+\3+\5+\u01b4\n+\3+\5+\u01b7\n+\3"+
		"+\5+\u01ba\n+\3,\5,\u01bd\n,\3,\3,\3-\3-\3.\6.\u01c4\n.\r.\16.\u01c5\3"+
		"/\3/\3\60\3\60\5\60\u01cc\n\60\3\61\5\61\u01cf\n\61\3\61\3\61\5\61\u01d3"+
		"\n\61\3\61\3\61\5\61\u01d7\n\61\3\61\2\2\62\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\4\4\2\3\3\5"+
		"\5\4\2\r\r\22\22\2\u0207\2b\3\2\2\2\4p\3\2\2\2\6s\3\2\2\2\bw\3\2\2\2\n"+
		"\u009a\3\2\2\2\f\u009c\3\2\2\2\16\u00ac\3\2\2\2\20\u00ae\3\2\2\2\22\u00b5"+
		"\3\2\2\2\24\u00bd\3\2\2\2\26\u00ce\3\2\2\2\30\u00d0\3\2\2\2\32\u00da\3"+
		"\2\2\2\34\u00dc\3\2\2\2\36\u00e0\3\2\2\2 \u00e7\3\2\2\2\"\u00eb\3\2\2"+
		"\2$\u00f5\3\2\2\2&\u0100\3\2\2\2(\u0102\3\2\2\2*\u010e\3\2\2\2,\u0113"+
		"\3\2\2\2.\u0115\3\2\2\2\60\u0125\3\2\2\2\62\u0129\3\2\2\2\64\u0135\3\2"+
		"\2\2\66\u0147\3\2\2\28\u014d\3\2\2\2:\u0151\3\2\2\2<\u0156\3\2\2\2>\u0159"+
		"\3\2\2\2@\u0162\3\2\2\2B\u016a\3\2\2\2D\u0177\3\2\2\2F\u0179\3\2\2\2H"+
		"\u017b\3\2\2\2J\u017e\3\2\2\2L\u0197\3\2\2\2N\u0199\3\2\2\2P\u019d\3\2"+
		"\2\2R\u01ae\3\2\2\2T\u01b1\3\2\2\2V\u01bc\3\2\2\2X\u01c0\3\2\2\2Z\u01c3"+
		"\3\2\2\2\\\u01c7\3\2\2\2^\u01c9\3\2\2\2`\u01ce\3\2\2\2bc\5\4\3\2cd\7\2"+
		"\2\3d\3\3\2\2\2eg\5\b\5\2fh\5\6\4\2gf\3\2\2\2gh\3\2\2\2hj\3\2\2\2ik\5"+
		"\n\6\2ji\3\2\2\2jk\3\2\2\2kq\3\2\2\2ln\5\6\4\2ml\3\2\2\2mn\3\2\2\2no\3"+
		"\2\2\2oq\5\n\6\2pe\3\2\2\2pm\3\2\2\2q\5\3\2\2\2rt\t\2\2\2sr\3\2\2\2tu"+
		"\3\2\2\2us\3\2\2\2uv\3\2\2\2v\7\3\2\2\2w|\7\n\2\2xz\5\6\4\2yx\3\2\2\2"+
		"yz\3\2\2\2z{\3\2\2\2{}\7\22\2\2|y\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2"+
		"\2\2\177\u0081\3\2\2\2\u0080\u0082\5\6\4\2\u0081\u0080\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\n\2\2\u0084\t\3\2\2\2\u0085"+
		"\u0087\5\f\7\2\u0086\u0088\5\6\4\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u009b\3\2\2\2\u0089\u008b\5\20\t\2\u008a\u008c\5\6\4\2\u008b"+
		"\u008a\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f\7\13"+
		"\2\2\u008e\u0090\5\6\4\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\5\f\7\2\u0092\u009b\3\2\2\2\u0093\u0095\5\20"+
		"\t\2\u0094\u0096\7\13\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0099\5\6\4\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009b\3\2\2\2\u009a\u0085\3\2\2\2\u009a\u0089\3\2\2\2\u009a"+
		"\u0093\3\2\2\2\u009b\13\3\2\2\2\u009c\u009e\7\23\2\2\u009d\u009f\5\6\4"+
		"\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2"+
		"\5\16\b\2\u00a1\u00a3\5\6\4\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2"+
		"\u00a3\u00a5\3\2\2\2\u00a4\u00a6\7\13\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\r\3\2\2\2\u00a7\u00ad\5\30\r\2\u00a8\u00ad\5\24\13\2\u00a9"+
		"\u00ad\5 \21\2\u00aa\u00ad\5\34\17\2\u00ab\u00ad\5J&\2\u00ac\u00a7\3\2"+
		"\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\17\3\2\2\2\u00ae\u00b2\5\16\b\2\u00af\u00b1\5\22"+
		"\n\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\21\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\7\13\2"+
		"\2\u00b6\u00b8\5\6\4\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00ba\5\16\b\2\u00ba\23\3\2\2\2\u00bb\u00be\5 \21\2\u00bc"+
		"\u00be\5\34\17\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c7\3"+
		"\2\2\2\u00bf\u00c1\5\6\4\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c4\7\f\2\2\u00c3\u00c5\5\6\4\2\u00c4\u00c3\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\5\26\f\2\u00c7"+
		"\u00c0\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\25\3\2\2\2\u00cb\u00cf\5`\61\2\u00cc\u00cf\5V,\2\u00cd\u00cf"+
		"\5\"\22\2\u00ce\u00cb\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2"+
		"\u00cf\27\3\2\2\2\u00d0\u00d2\5\32\16\2\u00d1\u00d3\5\6\4\2\u00d2\u00d1"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\7\25\2\2"+
		"\u00d5\u00d7\5\6\4\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00d9\5\16\b\2\u00d9\31\3\2\2\2\u00da\u00db\7\22\2\2\u00db"+
		"\33\3\2\2\2\u00dc\u00de\5\36\20\2\u00dd\u00df\5^\60\2\u00de\u00dd\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\35\3\2\2\2\u00e0\u00e2\5&\24\2\u00e1\u00e3"+
		"\5\6\4\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e6\5T+\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\37\3\2\2\2"+
		"\u00e7\u00e8\5\34\17\2\u00e8\u00e9\5\"\22\2\u00e9!\3\2\2\2\u00ea\u00ec"+
		"\5\6\4\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f1\3\2\2\2\u00ed"+
		"\u00ef\5$\23\2\u00ee\u00f0\5\6\4\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4#\3\2\2\2\u00f5\u00f7\7 \2\2\u00f6"+
		"\u00f8\5\6\4\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2"+
		"\2\2\u00f9\u00fb\5\34\17\2\u00fa\u00fc\5\6\4\2\u00fb\u00fa\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc%\3\2\2\2\u00fd\u0101\5*\26\2\u00fe\u0101\5\\/\2\u00ff"+
		"\u0101\5(\25\2\u0100\u00fd\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2"+
		"\2\2\u0101\'\3\2\2\2\u0102\u0104\7\t\2\2\u0103\u0105\5\6\4\2\u0104\u0103"+
		"\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\5\16\b\2"+
		"\u0107\u0109\5\6\4\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010b\7\b\2\2\u010b)\3\2\2\2\u010c\u010f\5,\27\2\u010d"+
		"\u010f\5\66\34\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f+\3\2\2"+
		"\2\u0110\u0114\5\62\32\2\u0111\u0114\5\64\33\2\u0112\u0114\5.\30\2\u0113"+
		"\u0110\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114-\3\2\2\2"+
		"\u0115\u0117\7\6\2\2\u0116\u0118\5\60\31\2\u0117\u0116\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u011b\5\6\4\2\u011a\u0119\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u011e\5\4\3\2\u011d\u011c\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7\7\2\2\u0120"+
		"/\3\2\2\2\u0121\u0123\5\6\4\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2"+
		"\u0123\u0124\3\2\2\2\u0124\u0126\7!\2\2\u0125\u0122\3\2\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\61\3\2\2\2\u0129"+
		"\u012b\7\33\2\2\u012a\u012c\5\6\4\2\u012b\u012a\3\2\2\2\u012b\u012c\3"+
		"\2\2\2\u012c\u012e\3\2\2\2\u012d\u012f\5\20\t\2\u012e\u012d\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u0132\5\6\4\2\u0131\u0130\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\7\34\2\2\u0134"+
		"\63\3\2\2\2\u0135\u0137\7\35\2\2\u0136\u0138\5\6\4\2\u0137\u0136\3\2\2"+
		"\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u013b\5\20\t\2\u013a"+
		"\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013e\5\6"+
		"\4\2\u013d\u013c\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\7\34\2\2\u0140\65\3\2\2\2\u0141\u0148\5D#\2\u0142\u0148\58\35\2"+
		"\u0143\u0148\5<\37\2\u0144\u0148\5N(\2\u0145\u0148\5F$\2\u0146\u0148\5"+
		"H%\2\u0147\u0141\3\2\2\2\u0147\u0142\3\2\2\2\u0147\u0143\3\2\2\2\u0147"+
		"\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\67\3\2\2"+
		"\2\u0149\u014e\5:\36\2\u014a\u014e\5> \2\u014b\u014e\5B\"\2\u014c\u014e"+
		"\5@!\2\u014d\u0149\3\2\2\2\u014d\u014a\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014c\3\2\2\2\u014e9\3\2\2\2\u014f\u0152\5B\"\2\u0150\u0152\5@!\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7\30"+
		"\2\2\u0154\u0155\5@!\2\u0155;\3\2\2\2\u0156\u0157\7\"\2\2\u0157=\3\2\2"+
		"\2\u0158\u015a\7\20\2\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015d\7\31\2\2\u015c\u015e\7\37\2\2\u015d\u015c\3"+
		"\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160"+
		"?\3\2\2\2\u0161\u0163\7\20\2\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2"+
		"\u0163\u0165\3\2\2\2\u0164\u0166\7\36\2\2\u0165\u0164\3\2\2\2\u0166\u0167"+
		"\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168A\3\2\2\2\u0169"+
		"\u016b\7\20\2\2\u016a\u0169\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016d\3"+
		"\2\2\2\u016c\u016e\7\36\2\2\u016d\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0173\7\13"+
		"\2\2\u0172\u0174\7\36\2\2\u0173\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176C\3\2\2\2\u0177\u0178\7\21\2\2"+
		"\u0178E\3\2\2\2\u0179\u017a\7\4\2\2\u017aG\3\2\2\2\u017b\u017c\7\26\2"+
		"\2\u017c\u017d\5L\'\2\u017dI\3\2\2\2\u017e\u0180\7\16\2\2\u017f\u0181"+
		"\5\6\4\2\u0180\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0184\7 \2\2\u0183\u0185\5\6\4\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u0187\3\2\2\2\u0186\u0188\7\36\2\2\u0187\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018c\3\2"+
		"\2\2\u018b\u018d\5\6\4\2\u018c\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018e\3\2\2\2\u018e\u018f\7\17\2\2\u018fK\3\2\2\2\u0190\u0198\t\3\2\2"+
		"\u0191\u0193\7 \2\2\u0192\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0192"+
		"\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0198\5F$\2\u0197"+
		"\u0190\3\2\2\2\u0197\u0192\3\2\2\2\u0197\u0196\3\2\2\2\u0198M\3\2\2\2"+
		"\u0199\u019a\7\32\2\2\u019a\u019b\5P)\2\u019bO\3\2\2\2\u019c\u019e\5\6"+
		"\4\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a9\3\2\2\2\u019f"+
		"\u01a3\5\66\34\2\u01a0\u01a3\5R*\2\u01a1\u01a3\5L\'\2\u01a2\u019f\3\2"+
		"\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4"+
		"\u01a6\5\6\4\2\u01a5\u01a4\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2"+
		"\2\2\u01a7\u01a2\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\7\b"+
		"\2\2\u01adQ\3\2\2\2\u01ae\u01af\7\t\2\2\u01af\u01b0\5P)\2\u01b0S\3\2\2"+
		"\2\u01b1\u01b3\5V,\2\u01b2\u01b4\5\6\4\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4"+
		"\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b7\5T+\2\u01b6\u01b5\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01ba\5\6\4\2\u01b9\u01b8\3\2"+
		"\2\2\u01b9\u01ba\3\2\2\2\u01baU\3\2\2\2\u01bb\u01bd\5\6\4\2\u01bc\u01bb"+
		"\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bf\5X-\2\u01bf"+
		"W\3\2\2\2\u01c0\u01c1\7\22\2\2\u01c1Y\3\2\2\2\u01c2\u01c4\7 \2\2\u01c3"+
		"\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6[\3\2\2\2\u01c7\u01c8\5\32\16\2\u01c8]\3\2\2\2\u01c9\u01cb\5"+
		"`\61\2\u01ca\u01cc\5^\60\2\u01cb\u01ca\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"_\3\2\2\2\u01cd\u01cf\5\6\4\2\u01ce\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2"+
		"\u01cf\u01d0\3\2\2\2\u01d0\u01d2\7\r\2\2\u01d1\u01d3\5\6\4\2\u01d2\u01d1"+
		"\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d6\3\2\2\2\u01d4\u01d7\5\36\20\2"+
		"\u01d5\u01d7\5&\24\2\u01d6\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7a\3"+
		"\2\2\2Rgjmpuy~\u0081\u0087\u008b\u008f\u0095\u0098\u009a\u009e\u00a2\u00a5"+
		"\u00ac\u00b2\u00b7\u00bd\u00c0\u00c4\u00c9\u00ce\u00d2\u00d6\u00de\u00e2"+
		"\u00e5\u00eb\u00ef\u00f3\u00f7\u00fb\u0100\u0104\u0108\u010e\u0113\u0117"+
		"\u011a\u011d\u0122\u0127\u012b\u012e\u0131\u0137\u013a\u013d\u0147\u014d"+
		"\u0151\u0159\u015f\u0162\u0167\u016a\u016f\u0175\u0180\u0184\u0189\u018c"+
		"\u0194\u0197\u019d\u01a2\u01a5\u01a9\u01b3\u01b6\u01b9\u01bc\u01c5\u01cb"+
		"\u01ce\u01d2\u01d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}