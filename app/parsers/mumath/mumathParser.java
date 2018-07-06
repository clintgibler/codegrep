// Generated from mumath/mumath.g4 by ANTLR 4.7.1
package parsers.mumath;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mumathParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLOCK=1, ENDBLOCK=2, FUNCTION=3, ENDFUN=4, EQF=5, LOOP=6, ENDLOOP=7, WHEN=8, 
		EXIT=9, OR=10, AND=11, NOT=12, MOD=13, WS=14, COMMENT=15, EQUATION=16, 
		QUOTE=17, PLUS=18, MINUS=19, STAR=20, SLASH=21, COMMA=22, SEMI=23, DOLLAR=24, 
		COLON=25, EQC=26, NOT_EQUAL=27, LT=28, LE=29, GE=30, GT=31, LPAREN=32, 
		RPAREN=33, POWER=34, ID=35, ARR=36, STRING=37, NUMBER=38;
	public static final int
		RULE_program = 0, RULE_assignment = 1, RULE_list = 2, RULE_functionDefinition = 3, 
		RULE_actualParameter = 4, RULE_statments = 5, RULE_block = 6, RULE_loop = 7, 
		RULE_when = 8, RULE_expression = 9, RULE_relationalOperator = 10, RULE_simpleExpression = 11, 
		RULE_addingOperator = 12, RULE_term = 13, RULE_multiplyingOperator = 14, 
		RULE_factor = 15, RULE_constant = 16, RULE_functionDesignator = 17, RULE_equal = 18;
	public static final String[] ruleNames = {
		"program", "assignment", "list", "functionDefinition", "actualParameter", 
		"statments", "block", "loop", "when", "expression", "relationalOperator", 
		"simpleExpression", "addingOperator", "term", "multiplyingOperator", "factor", 
		"constant", "functionDesignator", "equal"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'BLOCK'", "'ENDBLOCK'", "'FUNCTION'", "'ENDFUN'", "'EQ'", "'LOOP'", 
		"'ENDLOOP'", "'WHEN'", "'EXIT'", "'OR'", "'AND'", "'NOT'", "'mod'", null, 
		null, "'=='", "'''", "'+'", "'-'", "'*'", "'/'", "','", "';'", "'$'", 
		"':'", "'='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'('", "')'", "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BLOCK", "ENDBLOCK", "FUNCTION", "ENDFUN", "EQF", "LOOP", "ENDLOOP", 
		"WHEN", "EXIT", "OR", "AND", "NOT", "MOD", "WS", "COMMENT", "EQUATION", 
		"QUOTE", "PLUS", "MINUS", "STAR", "SLASH", "COMMA", "SEMI", "DOLLAR", 
		"COLON", "EQC", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", "RPAREN", 
		"POWER", "ID", "ARR", "STRING", "NUMBER"
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
	public String getGrammarFileName() { return "mumath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mumathParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(mumathParser.EOF, 0); }
		public List<TerminalNode> SEMI() { return getTokens(mumathParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(mumathParser.SEMI, i);
		}
		public List<TerminalNode> DOLLAR() { return getTokens(mumathParser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(mumathParser.DOLLAR, i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<FunctionDesignatorContext> functionDesignator() {
			return getRuleContexts(FunctionDesignatorContext.class);
		}
		public FunctionDesignatorContext functionDesignator(int i) {
			return getRuleContext(FunctionDesignatorContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION || _la==ID) {
				{
				{
				setState(41);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(38);
					functionDefinition();
					}
					break;
				case 2:
					{
					setState(39);
					assignment();
					}
					break;
				case 3:
					{
					setState(40);
					functionDesignator();
					}
					break;
				}
				setState(43);
				_la = _input.LA(1);
				if ( !(_la==SEMI || _la==DOLLAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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

	public static class AssignmentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(mumathParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(mumathParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(mumathParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(mumathParser.COLON, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(52);
					match(ID);
					setState(53);
					match(COLON);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(56); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(58);
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(mumathParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(mumathParser.RPAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(mumathParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(mumathParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mumathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mumathParser.COMMA, i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(LPAREN);
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAREN:
				{
				setState(61);
				match(RPAREN);
				}
				break;
			case ID:
				{
				setState(62);
				match(ID);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(63);
					match(COMMA);
					setState(64);
					match(ID);
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(70);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(mumathParser.FUNCTION, 0); }
		public TerminalNode ID() { return getToken(mumathParser.ID, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(mumathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mumathParser.COMMA, i);
		}
		public StatmentsContext statments() {
			return getRuleContext(StatmentsContext.class,0);
		}
		public TerminalNode ENDFUN() { return getToken(mumathParser.ENDFUN, 0); }
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(FUNCTION);
			setState(74);
			match(ID);
			setState(75);
			list();
			setState(76);
			match(COMMA);
			setState(77);
			statments();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(78);
				match(COMMA);
				}
			}

			setState(81);
			match(ENDFUN);
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

	public static class ActualParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).enterActualParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).exitActualParameter(this);
		}
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_actualParameter);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				assignment();
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

	public static class StatmentsContext extends ParserRuleContext {
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public WhenContext when() {
			return getRuleContext(WhenContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionDesignatorContext functionDesignator() {
			return getRuleContext(FunctionDesignatorContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(mumathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mumathParser.COMMA, i);
		}
		public List<StatmentsContext> statments() {
			return getRuleContexts(StatmentsContext.class);
		}
		public StatmentsContext statments(int i) {
			return getRuleContext(StatmentsContext.class,i);
		}
		public StatmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).enterStatments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).exitStatments(this);
		}
	}

	public final StatmentsContext statments() throws RecognitionException {
		StatmentsContext _localctx = new StatmentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(87);
				loop();
				}
				break;
			case 2:
				{
				setState(88);
				when();
				}
				break;
			case 3:
				{
				setState(89);
				block();
				}
				break;
			case 4:
				{
				setState(90);
				assignment();
				}
				break;
			case 5:
				{
				setState(91);
				expression();
				}
				break;
			case 6:
				{
				setState(92);
				functionDesignator();
				}
				break;
			}
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					match(COMMA);
					setState(96);
					statments();
					}
					} 
				}
				setState(101);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BLOCK() { return getToken(mumathParser.BLOCK, 0); }
		public StatmentsContext statments() {
			return getRuleContext(StatmentsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(mumathParser.COMMA, 0); }
		public TerminalNode ENDBLOCK() { return getToken(mumathParser.ENDBLOCK, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(BLOCK);
			setState(103);
			statments();
			setState(104);
			match(COMMA);
			setState(105);
			match(ENDBLOCK);
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(mumathParser.LOOP, 0); }
		public StatmentsContext statments() {
			return getRuleContext(StatmentsContext.class,0);
		}
		public TerminalNode ENDLOOP() { return getToken(mumathParser.ENDLOOP, 0); }
		public TerminalNode COMMA() { return getToken(mumathParser.COMMA, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(LOOP);
			setState(108);
			statments();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(109);
				match(COMMA);
				}
			}

			setState(112);
			match(ENDLOOP);
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

	public static class WhenContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(mumathParser.WHEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> EXIT() { return getTokens(mumathParser.EXIT); }
		public TerminalNode EXIT(int i) {
			return getToken(mumathParser.EXIT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mumathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mumathParser.COMMA, i);
		}
		public StatmentsContext statments() {
			return getRuleContext(StatmentsContext.class,0);
		}
		public WhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).enterWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).exitWhen(this);
		}
	}

	public final WhenContext when() throws RecognitionException {
		WhenContext _localctx = new WhenContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_when);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(WHEN);
			setState(115);
			expression();
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(116);
				match(COMMA);
				}
			}

			setState(119);
			match(EXIT);
			setState(120);
			match(COMMA);
			setState(121);
			statments();
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(122);
				match(COMMA);
				}
			}

			setState(125);
			match(EXIT);
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
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<RelationalOperatorContext> relationalOperator() {
			return getRuleContexts(RelationalOperatorContext.class);
		}
		public RelationalOperatorContext relationalOperator(int i) {
			return getRuleContext(RelationalOperatorContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			simpleExpression();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQF) | (1L << EQUATION) | (1L << EQC) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) {
				{
				{
				setState(128);
				relationalOperator();
				setState(129);
				simpleExpression();
				}
				}
				setState(135);
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

	public static class RelationalOperatorContext extends ParserRuleContext {
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public TerminalNode NOT_EQUAL() { return getToken(mumathParser.NOT_EQUAL, 0); }
		public TerminalNode LT() { return getToken(mumathParser.LT, 0); }
		public TerminalNode LE() { return getToken(mumathParser.LE, 0); }
		public TerminalNode GE() { return getToken(mumathParser.GE, 0); }
		public TerminalNode GT() { return getToken(mumathParser.GT, 0); }
		public TerminalNode EQUATION() { return getToken(mumathParser.EQUATION, 0); }
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).exitRelationalOperator(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_relationalOperator);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQF:
			case EQC:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				equal();
				}
				break;
			case EQUATION:
			case NOT_EQUAL:
			case LT:
			case LE:
			case GE:
			case GT:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUATION) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MINUS() { return getToken(mumathParser.MINUS, 0); }
		public List<AddingOperatorContext> addingOperator() {
			return getRuleContexts(AddingOperatorContext.class);
		}
		public AddingOperatorContext addingOperator(int i) {
			return getRuleContext(AddingOperatorContext.class,i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(140);
				match(MINUS);
				}
			}

			setState(143);
			term();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				{
				setState(144);
				addingOperator();
				setState(145);
				term();
				}
				}
				setState(151);
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

	public static class AddingOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(mumathParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(mumathParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(mumathParser.OR, 0); }
		public AddingOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addingOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).enterAddingOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).exitAddingOperator(this);
		}
	}

	public final AddingOperatorContext addingOperator() throws RecognitionException {
		AddingOperatorContext _localctx = new AddingOperatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_addingOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MultiplyingOperatorContext> multiplyingOperator() {
			return getRuleContexts(MultiplyingOperatorContext.class);
		}
		public MultiplyingOperatorContext multiplyingOperator(int i) {
			return getRuleContext(MultiplyingOperatorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			factor();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << MOD) | (1L << STAR) | (1L << SLASH) | (1L << POWER))) != 0)) {
				{
				{
				setState(155);
				multiplyingOperator();
				setState(156);
				factor();
				}
				}
				setState(162);
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

	public static class MultiplyingOperatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(mumathParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(mumathParser.SLASH, 0); }
		public TerminalNode MOD() { return getToken(mumathParser.MOD, 0); }
		public TerminalNode AND() { return getToken(mumathParser.AND, 0); }
		public TerminalNode POWER() { return getToken(mumathParser.POWER, 0); }
		public MultiplyingOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).enterMultiplyingOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).exitMultiplyingOperator(this);
		}
	}

	public final MultiplyingOperatorContext multiplyingOperator() throws RecognitionException {
		MultiplyingOperatorContext _localctx = new MultiplyingOperatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multiplyingOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << MOD) | (1L << STAR) | (1L << SLASH) | (1L << POWER))) != 0)) ) {
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mumathParser.ID, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(mumathParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(mumathParser.RPAREN, 0); }
		public FunctionDesignatorContext functionDesignator() {
			return getRuleContext(FunctionDesignatorContext.class,0);
		}
		public TerminalNode NOT() { return getToken(mumathParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_factor);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				constant();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(LPAREN);
				setState(168);
				expression();
				setState(169);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				functionDesignator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				match(NOT);
				setState(173);
				factor();
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(mumathParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(mumathParser.STRING, 0); }
		public TerminalNode QUOTE() { return getToken(mumathParser.QUOTE, 0); }
		public TerminalNode ID() { return getToken(mumathParser.ID, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(176);
				match(NUMBER);
				}
				break;
			case 2:
				{
				setState(177);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(178);
				match(QUOTE);
				setState(179);
				match(ID);
				}
				break;
			case 4:
				{
				setState(180);
				match(QUOTE);
				setState(181);
				match(STRING);
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

	public static class FunctionDesignatorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mumathParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(mumathParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(mumathParser.RPAREN, 0); }
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mumathParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mumathParser.COMMA, i);
		}
		public FunctionDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDesignator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).enterFunctionDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).exitFunctionDesignator(this);
		}
	}

	public final FunctionDesignatorContext functionDesignator() throws RecognitionException {
		FunctionDesignatorContext _localctx = new FunctionDesignatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionDesignator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ID);
			setState(185);
			match(LPAREN);
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case QUOTE:
			case MINUS:
			case LPAREN:
			case ID:
			case STRING:
			case NUMBER:
				{
				{
				setState(186);
				actualParameter();
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(187);
					match(COMMA);
					setState(188);
					actualParameter();
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case RPAREN:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(197);
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

	public static class EqualContext extends ParserRuleContext {
		public TerminalNode EQF() { return getToken(mumathParser.EQF, 0); }
		public TerminalNode EQC() { return getToken(mumathParser.EQC, 0); }
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mumathListener ) ((mumathListener)listener).exitEqual(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_equal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !(_la==EQF || _la==EQC) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\5\2,\n\2\3\2\3\2\7\2\60\n\2\f\2\16\2"+
		"\63\13\2\3\2\3\2\3\3\3\3\6\39\n\3\r\3\16\3:\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\7\4D\n\4\f\4\16\4G\13\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5R\n"+
		"\5\3\5\3\5\3\6\3\6\5\6X\n\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7`\n\7\3\7\3\7\7"+
		"\7d\n\7\f\7\16\7g\13\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\tq\n\t\3\t\3"+
		"\t\3\n\3\n\3\n\5\nx\n\n\3\n\3\n\3\n\3\n\5\n~\n\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\7\13\u0086\n\13\f\13\16\13\u0089\13\13\3\f\3\f\5\f\u008d\n\f\3\r"+
		"\5\r\u0090\n\r\3\r\3\r\3\r\3\r\7\r\u0096\n\r\f\r\16\r\u0099\13\r\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\7\17\u00a1\n\17\f\17\16\17\u00a4\13\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00b1\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00b9\n\22\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u00c0\n\23\f\23\16\23\u00c3\13\23\3\23\5\23\u00c6\n\23\3\23\3\23\3\24"+
		"\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\7\3\2"+
		"\31\32\4\2\22\22\35!\4\2\f\f\24\25\6\2\r\r\17\17\26\27$$\4\2\7\7\34\34"+
		"\2\u00d7\2\61\3\2\2\2\48\3\2\2\2\6>\3\2\2\2\bK\3\2\2\2\nW\3\2\2\2\f_\3"+
		"\2\2\2\16h\3\2\2\2\20m\3\2\2\2\22t\3\2\2\2\24\u0081\3\2\2\2\26\u008c\3"+
		"\2\2\2\30\u008f\3\2\2\2\32\u009a\3\2\2\2\34\u009c\3\2\2\2\36\u00a5\3\2"+
		"\2\2 \u00b0\3\2\2\2\"\u00b8\3\2\2\2$\u00ba\3\2\2\2&\u00c9\3\2\2\2(,\5"+
		"\b\5\2),\5\4\3\2*,\5$\23\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,-\3\2\2\2-.\t"+
		"\2\2\2.\60\3\2\2\2/+\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62"+
		"\64\3\2\2\2\63\61\3\2\2\2\64\65\7\2\2\3\65\3\3\2\2\2\66\67\7%\2\2\679"+
		"\7\33\2\28\66\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\5\24\13"+
		"\2=\5\3\2\2\2>I\7\"\2\2?J\7#\2\2@E\7%\2\2AB\7\30\2\2BD\7%\2\2CA\3\2\2"+
		"\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HJ\7#\2\2I?\3\2\2"+
		"\2I@\3\2\2\2J\7\3\2\2\2KL\7\5\2\2LM\7%\2\2MN\5\6\4\2NO\7\30\2\2OQ\5\f"+
		"\7\2PR\7\30\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\6\2\2T\t\3\2\2\2UX\5"+
		"\24\13\2VX\5\4\3\2WU\3\2\2\2WV\3\2\2\2X\13\3\2\2\2Y`\5\20\t\2Z`\5\22\n"+
		"\2[`\5\16\b\2\\`\5\4\3\2]`\5\24\13\2^`\5$\23\2_Y\3\2\2\2_Z\3\2\2\2_[\3"+
		"\2\2\2_\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`e\3\2\2\2ab\7\30\2\2bd\5\f\7\2c"+
		"a\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\r\3\2\2\2ge\3\2\2\2hi\7\3\2\2"+
		"ij\5\f\7\2jk\7\30\2\2kl\7\4\2\2l\17\3\2\2\2mn\7\b\2\2np\5\f\7\2oq\7\30"+
		"\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\t\2\2s\21\3\2\2\2tu\7\n\2\2uw\5"+
		"\24\13\2vx\7\30\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\13\2\2z{\7\30\2"+
		"\2{}\5\f\7\2|~\7\30\2\2}|\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\13"+
		"\2\2\u0080\23\3\2\2\2\u0081\u0087\5\30\r\2\u0082\u0083\5\26\f\2\u0083"+
		"\u0084\5\30\r\2\u0084\u0086\3\2\2\2\u0085\u0082\3\2\2\2\u0086\u0089\3"+
		"\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\25\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008d\5&\24\2\u008b\u008d\t\3\2\2\u008c\u008a\3\2"+
		"\2\2\u008c\u008b\3\2\2\2\u008d\27\3\2\2\2\u008e\u0090\7\25\2\2\u008f\u008e"+
		"\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0097\5\34\17\2"+
		"\u0092\u0093\5\32\16\2\u0093\u0094\5\34\17\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\31\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\t\4\2\2\u009b\33"+
		"\3\2\2\2\u009c\u00a2\5 \21\2\u009d\u009e\5\36\20\2\u009e\u009f\5 \21\2"+
		"\u009f\u00a1\3\2\2\2\u00a0\u009d\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\35\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a6\t\5\2\2\u00a6\37\3\2\2\2\u00a7\u00b1\7%\2\2\u00a8\u00b1\5\"\22"+
		"\2\u00a9\u00aa\7\"\2\2\u00aa\u00ab\5\24\13\2\u00ab\u00ac\7#\2\2\u00ac"+
		"\u00b1\3\2\2\2\u00ad\u00b1\5$\23\2\u00ae\u00af\7\16\2\2\u00af\u00b1\5"+
		" \21\2\u00b0\u00a7\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b0"+
		"\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1!\3\2\2\2\u00b2\u00b9\7(\2\2\u00b3"+
		"\u00b9\7\'\2\2\u00b4\u00b5\7\23\2\2\u00b5\u00b9\7%\2\2\u00b6\u00b7\7\23"+
		"\2\2\u00b7\u00b9\7\'\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b8"+
		"\u00b4\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9#\3\2\2\2\u00ba\u00bb\7%\2\2\u00bb"+
		"\u00c5\7\"\2\2\u00bc\u00c1\5\n\6\2\u00bd\u00be\7\30\2\2\u00be\u00c0\5"+
		"\n\6\2\u00bf\u00bd\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c6\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\3\2"+
		"\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c8\7#\2\2\u00c8%\3\2\2\2\u00c9\u00ca\t\6\2\2\u00ca\'\3\2\2\2\27+\61"+
		":EIQW_epw}\u0087\u008c\u008f\u0097\u00a2\u00b0\u00b8\u00c1\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}