// Generated from lolcode/lolcode.g4 by ANTLR 4.7.1
package parsers.lolcode;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class lolcodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, LABEL=41, ATOM=42, STRING=43, WS=44;
	public static final int
		RULE_program = 0, RULE_code_block = 1, RULE_statement = 2, RULE_loop = 3, 
		RULE_declaration = 4, RULE_comment = 5, RULE_print_block = 6, RULE_if_block = 7, 
		RULE_else_if_block = 8, RULE_input_block = 9, RULE_func_decl = 10, RULE_assignment = 11, 
		RULE_expression = 12, RULE_equals = 13, RULE_not_equals = 14, RULE_both = 15, 
		RULE_either = 16, RULE_greater = 17, RULE_less = 18, RULE_add = 19, RULE_sub = 20, 
		RULE_mul = 21, RULE_div = 22, RULE_mod = 23, RULE_cast = 24, RULE_all = 25, 
		RULE_any = 26, RULE_not = 27, RULE_func = 28;
	public static final String[] ruleNames = {
		"program", "code_block", "statement", "loop", "declaration", "comment", 
		"print_block", "if_block", "else_if_block", "input_block", "func_decl", 
		"assignment", "expression", "equals", "not_equals", "both", "either", 
		"greater", "less", "add", "sub", "mul", "div", "mod", "cast", "all", "any", 
		"not", "func"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'HAI'", "'KTHXBYE'", "'IM IN YR'", "'WILE'", "'IM OUTTA YR'", "'I HAS A'", 
		"'ITZ'", "'BTW'", "'OBTW'", "'TLDR'", "'VISIBLE'", "'MKAY?'", "'O RLY?'", 
		"'YA RLY'", "'OIC'", "'MEBBE'", "'NO WAI'", "'GIMMEH'", "'HOW DUZ I'", 
		"'YR'", "'AN YR'", "'IF U SAY SO'", "'R'", "'BOTH SAEM'", "'AN'", "'DIFFRINT'", 
		"'BOTH OF'", "'EITHER OF'", "'BIGGR OF'", "'SMALLR OF'", "'SUM OF'", "'DIFF OF'", 
		"'PRODUKT OF'", "'QUOSHUNT OF'", "'MOD OF'", "'MAEK'", "'A'", "'ALL OF'", 
		"'ANY OF'", "'NOT'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "LABEL", "ATOM", "STRING", "WS"
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
	public String getGrammarFileName() { return "lolcode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public lolcodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(T__0);
			setState(59);
			code_block();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(60);
				match(T__1);
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

	public static class Code_blockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitCode_block(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(63);
				statement();
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__17) | (1L << T__18) | (1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << LABEL) | (1L << ATOM))) != 0) );
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
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Print_blockContext print_block() {
			return getRuleContext(Print_blockContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public Input_blockContext input_block() {
			return getRuleContext(Input_blockContext.class,0);
		}
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				loop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				comment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				print_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(72);
				if_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				input_block();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				func_decl();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				assignment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(76);
				expression();
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

	public static class LoopContext extends ParserRuleContext {
		public List<TerminalNode> LABEL() { return getTokens(lolcodeParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(lolcodeParser.LABEL, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__2);
			setState(80);
			match(LABEL);
			setState(81);
			match(T__3);
			setState(82);
			expression();
			setState(83);
			code_block();
			setState(84);
			match(T__4);
			setState(85);
			match(LABEL);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(lolcodeParser.LABEL, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(T__5);
				setState(88);
				match(LABEL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(T__5);
				setState(90);
				match(LABEL);
				setState(91);
				match(T__6);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(lolcodeParser.STRING, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comment);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				match(T__7);
				setState(95);
				match(STRING);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(T__8);
				setState(97);
				match(STRING);
				setState(98);
				match(T__9);
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

	public static class Print_blockContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Print_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterPrint_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitPrint_block(this);
		}
	}

	public final Print_blockContext print_block() throws RecognitionException {
		Print_blockContext _localctx = new Print_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_print_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__10);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					expression();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(108);
				match(T__11);
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

	public static class If_blockContext extends ParserRuleContext {
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Else_if_blockContext else_if_block() {
			return getRuleContext(Else_if_blockContext.class,0);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterIf_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitIf_block(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_block);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(T__12);
				setState(112);
				match(T__13);
				setState(113);
				code_block();
				setState(114);
				match(T__14);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(T__12);
				setState(117);
				match(T__13);
				setState(118);
				code_block();
				setState(119);
				else_if_block();
				setState(120);
				match(T__14);
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

	public static class Else_if_blockContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Else_if_blockContext else_if_block() {
			return getRuleContext(Else_if_blockContext.class,0);
		}
		public Else_if_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterElse_if_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitElse_if_block(this);
		}
	}

	public final Else_if_blockContext else_if_block() throws RecognitionException {
		Else_if_blockContext _localctx = new Else_if_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_if_block);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(T__15);
				setState(125);
				expression();
				setState(126);
				code_block();
				setState(127);
				else_if_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(T__16);
				setState(130);
				code_block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(T__15);
				setState(132);
				expression();
				setState(133);
				code_block();
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

	public static class Input_blockContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(lolcodeParser.LABEL, 0); }
		public Input_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterInput_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitInput_block(this);
		}
	}

	public final Input_blockContext input_block() throws RecognitionException {
		Input_blockContext _localctx = new Input_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_input_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__17);
			setState(138);
			match(LABEL);
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

	public static class Func_declContext extends ParserRuleContext {
		public List<TerminalNode> LABEL() { return getTokens(lolcodeParser.LABEL); }
		public TerminalNode LABEL(int i) {
			return getToken(lolcodeParser.LABEL, i);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitFunc_decl(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_func_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__18);
			setState(141);
			match(LABEL);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				{
				setState(142);
				match(T__19);
				setState(143);
				match(LABEL);
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__20) {
					{
					{
					setState(145);
					match(T__20);
					setState(146);
					match(LABEL);
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(154);
			code_block();
			setState(155);
			match(T__21);
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
		public TerminalNode LABEL() { return getToken(lolcodeParser.LABEL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(LABEL);
			setState(158);
			match(T__22);
			setState(159);
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
		public EqualsContext equals() {
			return getRuleContext(EqualsContext.class,0);
		}
		public BothContext both() {
			return getRuleContext(BothContext.class,0);
		}
		public Not_equalsContext not_equals() {
			return getRuleContext(Not_equalsContext.class,0);
		}
		public GreaterContext greater() {
			return getRuleContext(GreaterContext.class,0);
		}
		public LessContext less() {
			return getRuleContext(LessContext.class,0);
		}
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public SubContext sub() {
			return getRuleContext(SubContext.class,0);
		}
		public MulContext mul() {
			return getRuleContext(MulContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public ModContext mod() {
			return getRuleContext(ModContext.class,0);
		}
		public CastContext cast() {
			return getRuleContext(CastContext.class,0);
		}
		public EitherContext either() {
			return getRuleContext(EitherContext.class,0);
		}
		public AllContext all() {
			return getRuleContext(AllContext.class,0);
		}
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public TerminalNode LABEL() { return getToken(lolcodeParser.LABEL, 0); }
		public TerminalNode ATOM() { return getToken(lolcodeParser.ATOM, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				equals();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				both();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				not_equals();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				greater();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				less();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
				add();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(167);
				sub();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(168);
				mul();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(169);
				div();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(170);
				mod();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(171);
				cast();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(172);
				either();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(173);
				all();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(174);
				any();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(175);
				not();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(176);
				func();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(177);
				match(LABEL);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(178);
				match(ATOM);
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

	public static class EqualsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitEquals(this);
		}
	}

	public final EqualsContext equals() throws RecognitionException {
		EqualsContext _localctx = new EqualsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__23);
			setState(182);
			expression();
			setState(183);
			match(T__24);
			setState(184);
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

	public static class Not_equalsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Not_equalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_equals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterNot_equals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitNot_equals(this);
		}
	}

	public final Not_equalsContext not_equals() throws RecognitionException {
		Not_equalsContext _localctx = new Not_equalsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_not_equals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__25);
			setState(187);
			expression();
			setState(188);
			match(T__24);
			setState(189);
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

	public static class BothContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BothContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_both; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterBoth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitBoth(this);
		}
	}

	public final BothContext both() throws RecognitionException {
		BothContext _localctx = new BothContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_both);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__26);
			setState(192);
			expression();
			setState(193);
			match(T__24);
			setState(194);
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

	public static class EitherContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EitherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_either; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterEither(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitEither(this);
		}
	}

	public final EitherContext either() throws RecognitionException {
		EitherContext _localctx = new EitherContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_either);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__27);
			setState(197);
			expression();
			setState(198);
			match(T__24);
			setState(199);
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

	public static class GreaterContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GreaterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_greater; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterGreater(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitGreater(this);
		}
	}

	public final GreaterContext greater() throws RecognitionException {
		GreaterContext _localctx = new GreaterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_greater);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__28);
			setState(202);
			expression();
			setState(203);
			match(T__24);
			setState(204);
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

	public static class LessContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterLess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitLess(this);
		}
	}

	public final LessContext less() throws RecognitionException {
		LessContext _localctx = new LessContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_less);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(T__29);
			setState(207);
			expression();
			setState(208);
			match(T__24);
			setState(209);
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

	public static class AddContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitAdd(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(T__30);
			setState(212);
			expression();
			setState(213);
			match(T__24);
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

	public static class SubContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitSub(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__31);
			setState(217);
			expression();
			setState(218);
			match(T__24);
			setState(219);
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

	public static class MulContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitMul(this);
		}
	}

	public final MulContext mul() throws RecognitionException {
		MulContext _localctx = new MulContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mul);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__32);
			setState(222);
			expression();
			setState(223);
			match(T__24);
			setState(224);
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

	public static class DivContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitDiv(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__33);
			setState(227);
			expression();
			setState(228);
			match(T__24);
			setState(229);
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

	public static class ModContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitMod(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(T__34);
			setState(232);
			expression();
			setState(233);
			match(T__24);
			setState(234);
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

	public static class CastContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cast; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitCast(this);
		}
	}

	public final CastContext cast() throws RecognitionException {
		CastContext _localctx = new CastContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cast);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__35);
			setState(237);
			expression();
			setState(238);
			match(T__36);
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

	public static class AllContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitAll(this);
		}
	}

	public final AllContext all() throws RecognitionException {
		AllContext _localctx = new AllContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_all);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__37);
			setState(241);
			expression();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(242);
				match(T__24);
				setState(243);
				expression();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(T__11);
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

	public static class AnyContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitAny(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_any);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__38);
			setState(252);
			expression();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(253);
				match(T__24);
				setState(254);
				expression();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(T__11);
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

	public static class NotContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitNot(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__39);
			setState(263);
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(lolcodeParser.LABEL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof lolcodeListener ) ((lolcodeListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(LABEL);
			setState(267); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(266);
				expression();
				}
				}
				setState(269); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << LABEL) | (1L << ATOM))) != 0) );
			setState(271);
			match(T__11);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0114\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\5\2@\n"+
		"\2\3\3\6\3C\n\3\r\3\16\3D\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\5\7f\n\7\3\b\3\b\7\bj\n\b\f\b\16\bm\13\b\3\b\5\bp\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t}\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008a\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\7\f\u0096\n\f\f\f\16\f\u0099\13\f\5\f\u009b\n\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00b6\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\7\33\u00f7\n\33\f\33\16\33\u00fa\13\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\7\34\u0102\n\34\f\34\16\34\u0105\13\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\6\36\u010e\n\36\r\36\16\36\u010f\3\36\3\36\3"+
		"\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:\2\2\2\u011d\2<\3\2\2\2\4B\3\2\2\2\6O\3\2\2\2\bQ\3\2\2\2\n^\3\2\2\2"+
		"\fe\3\2\2\2\16g\3\2\2\2\20|\3\2\2\2\22\u0089\3\2\2\2\24\u008b\3\2\2\2"+
		"\26\u008e\3\2\2\2\30\u009f\3\2\2\2\32\u00b5\3\2\2\2\34\u00b7\3\2\2\2\36"+
		"\u00bc\3\2\2\2 \u00c1\3\2\2\2\"\u00c6\3\2\2\2$\u00cb\3\2\2\2&\u00d0\3"+
		"\2\2\2(\u00d5\3\2\2\2*\u00da\3\2\2\2,\u00df\3\2\2\2.\u00e4\3\2\2\2\60"+
		"\u00e9\3\2\2\2\62\u00ee\3\2\2\2\64\u00f2\3\2\2\2\66\u00fd\3\2\2\28\u0108"+
		"\3\2\2\2:\u010b\3\2\2\2<=\7\3\2\2=?\5\4\3\2>@\7\4\2\2?>\3\2\2\2?@\3\2"+
		"\2\2@\3\3\2\2\2AC\5\6\4\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\5\3"+
		"\2\2\2FP\5\b\5\2GP\5\n\6\2HP\5\f\7\2IP\5\16\b\2JP\5\20\t\2KP\5\24\13\2"+
		"LP\5\26\f\2MP\5\30\r\2NP\5\32\16\2OF\3\2\2\2OG\3\2\2\2OH\3\2\2\2OI\3\2"+
		"\2\2OJ\3\2\2\2OK\3\2\2\2OL\3\2\2\2OM\3\2\2\2ON\3\2\2\2P\7\3\2\2\2QR\7"+
		"\5\2\2RS\7+\2\2ST\7\6\2\2TU\5\32\16\2UV\5\4\3\2VW\7\7\2\2WX\7+\2\2X\t"+
		"\3\2\2\2YZ\7\b\2\2Z_\7+\2\2[\\\7\b\2\2\\]\7+\2\2]_\7\t\2\2^Y\3\2\2\2^"+
		"[\3\2\2\2_\13\3\2\2\2`a\7\n\2\2af\7-\2\2bc\7\13\2\2cd\7-\2\2df\7\f\2\2"+
		"e`\3\2\2\2eb\3\2\2\2f\r\3\2\2\2gk\7\r\2\2hj\5\32\16\2ih\3\2\2\2jm\3\2"+
		"\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2np\7\16\2\2on\3\2\2\2op\3"+
		"\2\2\2p\17\3\2\2\2qr\7\17\2\2rs\7\20\2\2st\5\4\3\2tu\7\21\2\2u}\3\2\2"+
		"\2vw\7\17\2\2wx\7\20\2\2xy\5\4\3\2yz\5\22\n\2z{\7\21\2\2{}\3\2\2\2|q\3"+
		"\2\2\2|v\3\2\2\2}\21\3\2\2\2~\177\7\22\2\2\177\u0080\5\32\16\2\u0080\u0081"+
		"\5\4\3\2\u0081\u0082\5\22\n\2\u0082\u008a\3\2\2\2\u0083\u0084\7\23\2\2"+
		"\u0084\u008a\5\4\3\2\u0085\u0086\7\22\2\2\u0086\u0087\5\32\16\2\u0087"+
		"\u0088\5\4\3\2\u0088\u008a\3\2\2\2\u0089~\3\2\2\2\u0089\u0083\3\2\2\2"+
		"\u0089\u0085\3\2\2\2\u008a\23\3\2\2\2\u008b\u008c\7\24\2\2\u008c\u008d"+
		"\7+\2\2\u008d\25\3\2\2\2\u008e\u008f\7\25\2\2\u008f\u009a\7+\2\2\u0090"+
		"\u0091\7\26\2\2\u0091\u0092\7+\2\2\u0092\u0097\3\2\2\2\u0093\u0094\7\27"+
		"\2\2\u0094\u0096\7+\2\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\u0090\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\5\4\3\2\u009d\u009e\7\30\2\2\u009e\27\3\2\2\2\u009f\u00a0\7+\2"+
		"\2\u00a0\u00a1\7\31\2\2\u00a1\u00a2\5\32\16\2\u00a2\31\3\2\2\2\u00a3\u00b6"+
		"\5\34\17\2\u00a4\u00b6\5 \21\2\u00a5\u00b6\5\36\20\2\u00a6\u00b6\5$\23"+
		"\2\u00a7\u00b6\5&\24\2\u00a8\u00b6\5(\25\2\u00a9\u00b6\5*\26\2\u00aa\u00b6"+
		"\5,\27\2\u00ab\u00b6\5.\30\2\u00ac\u00b6\5\60\31\2\u00ad\u00b6\5\62\32"+
		"\2\u00ae\u00b6\5\"\22\2\u00af\u00b6\5\64\33\2\u00b0\u00b6\5\66\34\2\u00b1"+
		"\u00b6\58\35\2\u00b2\u00b6\5:\36\2\u00b3\u00b6\7+\2\2\u00b4\u00b6\7,\2"+
		"\2\u00b5\u00a3\3\2\2\2\u00b5\u00a4\3\2\2\2\u00b5\u00a5\3\2\2\2\u00b5\u00a6"+
		"\3\2\2\2\u00b5\u00a7\3\2\2\2\u00b5\u00a8\3\2\2\2\u00b5\u00a9\3\2\2\2\u00b5"+
		"\u00aa\3\2\2\2\u00b5\u00ab\3\2\2\2\u00b5\u00ac\3\2\2\2\u00b5\u00ad\3\2"+
		"\2\2\u00b5\u00ae\3\2\2\2\u00b5\u00af\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b5"+
		"\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2"+
		"\2\2\u00b6\33\3\2\2\2\u00b7\u00b8\7\32\2\2\u00b8\u00b9\5\32\16\2\u00b9"+
		"\u00ba\7\33\2\2\u00ba\u00bb\5\32\16\2\u00bb\35\3\2\2\2\u00bc\u00bd\7\34"+
		"\2\2\u00bd\u00be\5\32\16\2\u00be\u00bf\7\33\2\2\u00bf\u00c0\5\32\16\2"+
		"\u00c0\37\3\2\2\2\u00c1\u00c2\7\35\2\2\u00c2\u00c3\5\32\16\2\u00c3\u00c4"+
		"\7\33\2\2\u00c4\u00c5\5\32\16\2\u00c5!\3\2\2\2\u00c6\u00c7\7\36\2\2\u00c7"+
		"\u00c8\5\32\16\2\u00c8\u00c9\7\33\2\2\u00c9\u00ca\5\32\16\2\u00ca#\3\2"+
		"\2\2\u00cb\u00cc\7\37\2\2\u00cc\u00cd\5\32\16\2\u00cd\u00ce\7\33\2\2\u00ce"+
		"\u00cf\5\32\16\2\u00cf%\3\2\2\2\u00d0\u00d1\7 \2\2\u00d1\u00d2\5\32\16"+
		"\2\u00d2\u00d3\7\33\2\2\u00d3\u00d4\5\32\16\2\u00d4\'\3\2\2\2\u00d5\u00d6"+
		"\7!\2\2\u00d6\u00d7\5\32\16\2\u00d7\u00d8\7\33\2\2\u00d8\u00d9\5\32\16"+
		"\2\u00d9)\3\2\2\2\u00da\u00db\7\"\2\2\u00db\u00dc\5\32\16\2\u00dc\u00dd"+
		"\7\33\2\2\u00dd\u00de\5\32\16\2\u00de+\3\2\2\2\u00df\u00e0\7#\2\2\u00e0"+
		"\u00e1\5\32\16\2\u00e1\u00e2\7\33\2\2\u00e2\u00e3\5\32\16\2\u00e3-\3\2"+
		"\2\2\u00e4\u00e5\7$\2\2\u00e5\u00e6\5\32\16\2\u00e6\u00e7\7\33\2\2\u00e7"+
		"\u00e8\5\32\16\2\u00e8/\3\2\2\2\u00e9\u00ea\7%\2\2\u00ea\u00eb\5\32\16"+
		"\2\u00eb\u00ec\7\33\2\2\u00ec\u00ed\5\32\16\2\u00ed\61\3\2\2\2\u00ee\u00ef"+
		"\7&\2\2\u00ef\u00f0\5\32\16\2\u00f0\u00f1\7\'\2\2\u00f1\63\3\2\2\2\u00f2"+
		"\u00f3\7(\2\2\u00f3\u00f8\5\32\16\2\u00f4\u00f5\7\33\2\2\u00f5\u00f7\5"+
		"\32\16\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7\16"+
		"\2\2\u00fc\65\3\2\2\2\u00fd\u00fe\7)\2\2\u00fe\u0103\5\32\16\2\u00ff\u0100"+
		"\7\33\2\2\u0100\u0102\5\32\16\2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2"+
		"\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0106\u0107\7\16\2\2\u0107\67\3\2\2\2\u0108\u0109\7*\2\2\u0109"+
		"\u010a\5\32\16\2\u010a9\3\2\2\2\u010b\u010d\7+\2\2\u010c\u010e\5\32\16"+
		"\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7\16\2\2\u0112;\3\2\2\2\21?D"+
		"O^eko|\u0089\u0097\u009a\u00b5\u00f8\u0103\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}