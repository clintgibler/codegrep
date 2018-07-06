// Generated from asm8086/asm8086.g4 by ANTLR 4.7.1
package parsers.asm8086;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class asm8086Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BYTE=15, WORD=16, DWORD=17, 
		DSEG=18, CSEG=19, INCLUDE=20, TITLE=21, END=22, ORG=23, ENDIF=24, IF=25, 
		EQU=26, DW=27, DB=28, DD=29, PTR=30, NOT=31, OFFSET=32, RW=33, RB=34, 
		RS=35, LENGTH=36, COMMENT=37, REGISTER=38, OPCODE=39, REP=40, DOLLAR=41, 
		SIGN=42, NAME=43, NUMBER=44, STRING=45, EOL=46, WS=47;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_instruction = 2, RULE_lbl = 3, RULE_assemblerdirective = 4, 
		RULE_rw = 5, RULE_rb = 6, RULE_rs = 7, RULE_cseg = 8, RULE_dseg = 9, RULE_dw = 10, 
		RULE_db = 11, RULE_dd = 12, RULE_equ = 13, RULE_if_ = 14, RULE_assemblerexpression = 15, 
		RULE_assemblerlogical = 16, RULE_assemblerterm = 17, RULE_endif = 18, 
		RULE_end = 19, RULE_org = 20, RULE_title = 21, RULE_include = 22, RULE_expressionlist = 23, 
		RULE_label = 24, RULE_expression = 25, RULE_multiplyingExpression = 26, 
		RULE_argument = 27, RULE_ptr = 28, RULE_dollar = 29, RULE_register = 30, 
		RULE_string = 31, RULE_name = 32, RULE_number = 33, RULE_opcode = 34, 
		RULE_rep = 35, RULE_comment = 36;
	public static final String[] ruleNames = {
		"prog", "line", "instruction", "lbl", "assemblerdirective", "rw", "rb", 
		"rs", "cseg", "dseg", "dw", "db", "dd", "equ", "if_", "assemblerexpression", 
		"assemblerlogical", "assemblerterm", "endif", "end", "org", "title", "include", 
		"expressionlist", "label", "expression", "multiplyingExpression", "argument", 
		"ptr", "dollar", "register", "string", "name", "number", "opcode", "rep", 
		"comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", "':'", "'.'", "'('", "')'", "'eq'", "'ne'", "','", "'*'", 
		"'/'", "'mod'", "'and'", "'['", "']'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "BYTE", "WORD", "DWORD", "DSEG", "CSEG", "INCLUDE", 
		"TITLE", "END", "ORG", "ENDIF", "IF", "EQU", "DW", "DB", "DD", "PTR", 
		"NOT", "OFFSET", "RW", "RB", "RS", "LENGTH", "COMMENT", "REGISTER", "OPCODE", 
		"REP", "DOLLAR", "SIGN", "NAME", "NUMBER", "STRING", "EOL", "WS"
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
	public String getGrammarFileName() { return "asm8086.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public asm8086Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> EOL() { return getTokens(asm8086Parser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(asm8086Parser.EOL, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << DSEG) | (1L << CSEG) | (1L << INCLUDE) | (1L << TITLE) | (1L << END) | (1L << ORG) | (1L << ENDIF) | (1L << IF) | (1L << DW) | (1L << DB) | (1L << DD) | (1L << RW) | (1L << RB) | (1L << RS) | (1L << COMMENT) | (1L << OPCODE) | (1L << REP) | (1L << NAME) | (1L << EOL))) != 0)) {
				{
				{
				setState(74);
				line();
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(75);
					match(T__0);
					setState(76);
					line();
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(82);
				match(EOL);
				}
				}
				setState(88);
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
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
		public AssemblerdirectiveContext assemblerdirective() {
			return getRuleContext(AssemblerdirectiveContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(89);
				lbl();
				}
				break;
			}
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case DSEG:
			case CSEG:
			case INCLUDE:
			case TITLE:
			case END:
			case ORG:
			case ENDIF:
			case IF:
			case DW:
			case DB:
			case DD:
			case RW:
			case RB:
			case RS:
			case NAME:
				{
				setState(92);
				assemblerdirective();
				}
				break;
			case OPCODE:
			case REP:
				{
				setState(93);
				instruction();
				}
				break;
			case T__0:
			case COMMENT:
			case EOL:
				break;
			default:
				break;
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(96);
				comment();
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

	public static class InstructionContext extends ParserRuleContext {
		public OpcodeContext opcode() {
			return getRuleContext(OpcodeContext.class,0);
		}
		public RepContext rep() {
			return getRuleContext(RepContext.class,0);
		}
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REP) {
				{
				setState(99);
				rep();
				}
			}

			setState(102);
			opcode();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << BYTE) | (1L << WORD) | (1L << DWORD) | (1L << PTR) | (1L << NOT) | (1L << OFFSET) | (1L << LENGTH) | (1L << REGISTER) | (1L << DOLLAR) | (1L << SIGN) | (1L << NAME) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(103);
				expressionlist();
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

	public static class LblContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public LblContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lbl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterLbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitLbl(this);
		}
	}

	public final LblContext lbl() throws RecognitionException {
		LblContext _localctx = new LblContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lbl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			label();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(107);
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

	public static class AssemblerdirectiveContext extends ParserRuleContext {
		public OrgContext org() {
			return getRuleContext(OrgContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public EndifContext endif() {
			return getRuleContext(EndifContext.class,0);
		}
		public EquContext equ() {
			return getRuleContext(EquContext.class,0);
		}
		public DbContext db() {
			return getRuleContext(DbContext.class,0);
		}
		public DwContext dw() {
			return getRuleContext(DwContext.class,0);
		}
		public CsegContext cseg() {
			return getRuleContext(CsegContext.class,0);
		}
		public DdContext dd() {
			return getRuleContext(DdContext.class,0);
		}
		public DsegContext dseg() {
			return getRuleContext(DsegContext.class,0);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public IncludeContext include() {
			return getRuleContext(IncludeContext.class,0);
		}
		public RwContext rw() {
			return getRuleContext(RwContext.class,0);
		}
		public RbContext rb() {
			return getRuleContext(RbContext.class,0);
		}
		public RsContext rs() {
			return getRuleContext(RsContext.class,0);
		}
		public AssemblerdirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblerdirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterAssemblerdirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitAssemblerdirective(this);
		}
	}

	public final AssemblerdirectiveContext assemblerdirective() throws RecognitionException {
		AssemblerdirectiveContext _localctx = new AssemblerdirectiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assemblerdirective);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				org();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				end();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				if_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				endif();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				equ();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				db();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				dw();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				cseg();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(118);
				dd();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(119);
				dseg();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(120);
				title();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(121);
				include();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(122);
				rw();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(123);
				rb();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(124);
				rs();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(125);
				match(T__2);
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

	public static class RwContext extends ParserRuleContext {
		public TerminalNode RW() { return getToken(asm8086Parser.RW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public RwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterRw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitRw(this);
		}
	}

	public final RwContext rw() throws RecognitionException {
		RwContext _localctx = new RwContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rw);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(128);
				name();
				}
			}

			setState(131);
			match(RW);
			setState(132);
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

	public static class RbContext extends ParserRuleContext {
		public TerminalNode RB() { return getToken(asm8086Parser.RB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public RbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterRb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitRb(this);
		}
	}

	public final RbContext rb() throws RecognitionException {
		RbContext _localctx = new RbContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(134);
				name();
				}
			}

			setState(137);
			match(RB);
			setState(138);
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

	public static class RsContext extends ParserRuleContext {
		public TerminalNode RS() { return getToken(asm8086Parser.RS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public RsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterRs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitRs(this);
		}
	}

	public final RsContext rs() throws RecognitionException {
		RsContext _localctx = new RsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(140);
				name();
				}
			}

			setState(143);
			match(RS);
			setState(144);
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

	public static class CsegContext extends ParserRuleContext {
		public TerminalNode CSEG() { return getToken(asm8086Parser.CSEG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CsegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cseg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterCseg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitCseg(this);
		}
	}

	public final CsegContext cseg() throws RecognitionException {
		CsegContext _localctx = new CsegContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cseg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(CSEG);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << BYTE) | (1L << WORD) | (1L << DWORD) | (1L << PTR) | (1L << NOT) | (1L << OFFSET) | (1L << LENGTH) | (1L << REGISTER) | (1L << DOLLAR) | (1L << SIGN) | (1L << NAME) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(147);
				expression();
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

	public static class DsegContext extends ParserRuleContext {
		public TerminalNode DSEG() { return getToken(asm8086Parser.DSEG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DsegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dseg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterDseg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitDseg(this);
		}
	}

	public final DsegContext dseg() throws RecognitionException {
		DsegContext _localctx = new DsegContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dseg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(DSEG);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << BYTE) | (1L << WORD) | (1L << DWORD) | (1L << PTR) | (1L << NOT) | (1L << OFFSET) | (1L << LENGTH) | (1L << REGISTER) | (1L << DOLLAR) | (1L << SIGN) | (1L << NAME) | (1L << NUMBER) | (1L << STRING))) != 0)) {
				{
				setState(151);
				expression();
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

	public static class DwContext extends ParserRuleContext {
		public TerminalNode DW() { return getToken(asm8086Parser.DW, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public DwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterDw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitDw(this);
		}
	}

	public final DwContext dw() throws RecognitionException {
		DwContext _localctx = new DwContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(DW);
			setState(155);
			expressionlist();
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

	public static class DbContext extends ParserRuleContext {
		public TerminalNode DB() { return getToken(asm8086Parser.DB, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public DbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterDb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitDb(this);
		}
	}

	public final DbContext db() throws RecognitionException {
		DbContext _localctx = new DbContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_db);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(DB);
			setState(158);
			expressionlist();
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

	public static class DdContext extends ParserRuleContext {
		public TerminalNode DD() { return getToken(asm8086Parser.DD, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public DdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterDd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitDd(this);
		}
	}

	public final DdContext dd() throws RecognitionException {
		DdContext _localctx = new DdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(DD);
			setState(161);
			expressionlist();
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

	public static class EquContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode EQU() { return getToken(asm8086Parser.EQU, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EquContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterEqu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitEqu(this);
		}
	}

	public final EquContext equ() throws RecognitionException {
		EquContext _localctx = new EquContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_equ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			name();
			setState(164);
			match(EQU);
			setState(165);
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

	public static class If_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(asm8086Parser.IF, 0); }
		public AssemblerexpressionContext assemblerexpression() {
			return getRuleContext(AssemblerexpressionContext.class,0);
		}
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitIf_(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(IF);
			setState(168);
			assemblerexpression();
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

	public static class AssemblerexpressionContext extends ParserRuleContext {
		public List<AssemblertermContext> assemblerterm() {
			return getRuleContexts(AssemblertermContext.class);
		}
		public AssemblertermContext assemblerterm(int i) {
			return getRuleContext(AssemblertermContext.class,i);
		}
		public List<AssemblerlogicalContext> assemblerlogical() {
			return getRuleContexts(AssemblerlogicalContext.class);
		}
		public AssemblerlogicalContext assemblerlogical(int i) {
			return getRuleContext(AssemblerlogicalContext.class,i);
		}
		public AssemblerexpressionContext assemblerexpression() {
			return getRuleContext(AssemblerexpressionContext.class,0);
		}
		public AssemblerexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblerexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterAssemblerexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitAssemblerexpression(this);
		}
	}

	public final AssemblerexpressionContext assemblerexpression() throws RecognitionException {
		AssemblerexpressionContext _localctx = new AssemblerexpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assemblerexpression);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case SIGN:
			case NAME:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				assemblerterm();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5 || _la==T__6) {
					{
					{
					setState(171);
					assemblerlogical();
					setState(172);
					assemblerterm();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(T__3);
				setState(180);
				assemblerexpression();
				setState(181);
				match(T__4);
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

	public static class AssemblerlogicalContext extends ParserRuleContext {
		public AssemblerlogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblerlogical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterAssemblerlogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitAssemblerlogical(this);
		}
	}

	public final AssemblerlogicalContext assemblerlogical() throws RecognitionException {
		AssemblerlogicalContext _localctx = new AssemblerlogicalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_assemblerlogical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
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

	public static class AssemblertermContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode NOT() { return getToken(asm8086Parser.NOT, 0); }
		public AssemblertermContext assemblerterm() {
			return getRuleContext(AssemblertermContext.class,0);
		}
		public AssemblertermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblerterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterAssemblerterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitAssemblerterm(this);
		}
	}

	public final AssemblertermContext assemblerterm() throws RecognitionException {
		AssemblertermContext _localctx = new AssemblertermContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assemblerterm);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				name();
				}
				break;
			case SIGN:
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				number();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(189);
				match(NOT);
				setState(190);
				assemblerterm();
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

	public static class EndifContext extends ParserRuleContext {
		public TerminalNode ENDIF() { return getToken(asm8086Parser.ENDIF, 0); }
		public EndifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterEndif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitEndif(this);
		}
	}

	public final EndifContext endif() throws RecognitionException {
		EndifContext _localctx = new EndifContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_endif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(ENDIF);
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(asm8086Parser.END, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(END);
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

	public static class OrgContext extends ParserRuleContext {
		public TerminalNode ORG() { return getToken(asm8086Parser.ORG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_org; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterOrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitOrg(this);
		}
	}

	public final OrgContext org() throws RecognitionException {
		OrgContext _localctx = new OrgContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_org);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(ORG);
			setState(198);
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode TITLE() { return getToken(asm8086Parser.TITLE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitTitle(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(TITLE);
			setState(201);
			string();
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

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(asm8086Parser.INCLUDE, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitInclude(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(INCLUDE);
			setState(204);
			name();
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

	public static class ExpressionlistContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterExpressionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitExpressionlist(this);
		}
	}

	public final ExpressionlistContext expressionlist() throws RecognitionException {
		ExpressionlistContext _localctx = new ExpressionlistContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expressionlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			expression();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(207);
				match(T__7);
				setState(208);
				expression();
				}
				}
				setState(213);
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

	public static class LabelContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			name();
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
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public List<TerminalNode> SIGN() { return getTokens(asm8086Parser.SIGN); }
		public TerminalNode SIGN(int i) {
			return getToken(asm8086Parser.SIGN, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			multiplyingExpression();
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					match(SIGN);
					setState(218);
					multiplyingExpression();
					}
					} 
				}
				setState(223);
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

	public static class MultiplyingExpressionContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterMultiplyingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitMultiplyingExpression(this);
		}
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_multiplyingExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			argument();
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(226);
					argument();
					}
					} 
				}
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class ArgumentContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DollarContext dollar() {
			return getRuleContext(DollarContext.class,0);
		}
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PtrContext ptr() {
			return getRuleContext(PtrContext.class,0);
		}
		public TerminalNode NOT() { return getToken(asm8086Parser.NOT, 0); }
		public TerminalNode OFFSET() { return getToken(asm8086Parser.OFFSET, 0); }
		public TerminalNode LENGTH() { return getToken(asm8086Parser.LENGTH, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_argument);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				dollar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				register();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				name();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(237);
				match(T__3);
				setState(238);
				expression();
				setState(239);
				match(T__4);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(243);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SIGN:
				case NUMBER:
					{
					setState(241);
					number();
					}
					break;
				case NAME:
					{
					setState(242);
					name();
					}
					break;
				case T__12:
					break;
				default:
					break;
				}
				setState(245);
				match(T__12);
				setState(246);
				expression();
				setState(247);
				match(T__13);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(249);
				ptr();
				setState(250);
				expression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(252);
				match(NOT);
				setState(253);
				expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(254);
				match(OFFSET);
				setState(255);
				expression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(256);
				match(LENGTH);
				setState(257);
				expression();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(258);
				register();
				setState(259);
				match(T__1);
				}
				setState(261);
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

	public static class PtrContext extends ParserRuleContext {
		public TerminalNode PTR() { return getToken(asm8086Parser.PTR, 0); }
		public TerminalNode BYTE() { return getToken(asm8086Parser.BYTE, 0); }
		public TerminalNode WORD() { return getToken(asm8086Parser.WORD, 0); }
		public TerminalNode DWORD() { return getToken(asm8086Parser.DWORD, 0); }
		public PtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ptr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterPtr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitPtr(this);
		}
	}

	public final PtrContext ptr() throws RecognitionException {
		PtrContext _localctx = new PtrContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ptr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << WORD) | (1L << DWORD))) != 0)) {
				{
				setState(265);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << WORD) | (1L << DWORD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(268);
			match(PTR);
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

	public static class DollarContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(asm8086Parser.DOLLAR, 0); }
		public DollarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dollar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitDollar(this);
		}
	}

	public final DollarContext dollar() throws RecognitionException {
		DollarContext _localctx = new DollarContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_dollar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(DOLLAR);
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

	public static class RegisterContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(asm8086Parser.REGISTER, 0); }
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitRegister(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_register);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(REGISTER);
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
		public TerminalNode STRING() { return getToken(asm8086Parser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(asm8086Parser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(NAME);
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
		public TerminalNode NUMBER() { return getToken(asm8086Parser.NUMBER, 0); }
		public TerminalNode SIGN() { return getToken(asm8086Parser.SIGN, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN) {
				{
				setState(278);
				match(SIGN);
				}
			}

			setState(281);
			match(NUMBER);
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

	public static class OpcodeContext extends ParserRuleContext {
		public TerminalNode OPCODE() { return getToken(asm8086Parser.OPCODE, 0); }
		public OpcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterOpcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitOpcode(this);
		}
	}

	public final OpcodeContext opcode() throws RecognitionException {
		OpcodeContext _localctx = new OpcodeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_opcode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(OPCODE);
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

	public static class RepContext extends ParserRuleContext {
		public TerminalNode REP() { return getToken(asm8086Parser.REP, 0); }
		public RepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterRep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitRep(this);
		}
	}

	public final RepContext rep() throws RecognitionException {
		RepContext _localctx = new RepContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_rep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(REP);
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
		public TerminalNode COMMENT() { return getToken(asm8086Parser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm8086Listener ) ((asm8086Listener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(COMMENT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0124\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\7\2P\n\2\f\2\16\2S\13"+
		"\2\3\2\3\2\7\2W\n\2\f\2\16\2Z\13\2\3\3\5\3]\n\3\3\3\3\3\5\3a\n\3\3\3\5"+
		"\3d\n\3\3\4\5\4g\n\4\3\4\3\4\5\4k\n\4\3\5\3\5\5\5o\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0081\n\6\3\7\5\7"+
		"\u0084\n\7\3\7\3\7\3\7\3\b\5\b\u008a\n\b\3\b\3\b\3\b\3\t\5\t\u0090\n\t"+
		"\3\t\3\t\3\t\3\n\3\n\5\n\u0097\n\n\3\13\3\13\5\13\u009b\n\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\7\21\u00b1\n\21\f\21\16\21\u00b4\13\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00ba\n\21\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00c2\n\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\7\31\u00d4\n\31\f\31\16\31\u00d7\13\31\3\32\3\32\3\33\3\33\3"+
		"\33\7\33\u00de\n\33\f\33\16\33\u00e1\13\33\3\34\3\34\3\34\7\34\u00e6\n"+
		"\34\f\34\16\34\u00e9\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u00f6\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u010a\n\35\3\36\5\36"+
		"\u010d\n\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\5#\u011a\n#\3#"+
		"\3#\3$\3$\3%\3%\3&\3&\3&\2\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJ\2\5\3\2\b\t\3\2\13\16\3\2\21\23\2\u0131"+
		"\2X\3\2\2\2\4\\\3\2\2\2\6f\3\2\2\2\bl\3\2\2\2\n\u0080\3\2\2\2\f\u0083"+
		"\3\2\2\2\16\u0089\3\2\2\2\20\u008f\3\2\2\2\22\u0094\3\2\2\2\24\u0098\3"+
		"\2\2\2\26\u009c\3\2\2\2\30\u009f\3\2\2\2\32\u00a2\3\2\2\2\34\u00a5\3\2"+
		"\2\2\36\u00a9\3\2\2\2 \u00b9\3\2\2\2\"\u00bb\3\2\2\2$\u00c1\3\2\2\2&\u00c3"+
		"\3\2\2\2(\u00c5\3\2\2\2*\u00c7\3\2\2\2,\u00ca\3\2\2\2.\u00cd\3\2\2\2\60"+
		"\u00d0\3\2\2\2\62\u00d8\3\2\2\2\64\u00da\3\2\2\2\66\u00e2\3\2\2\28\u0109"+
		"\3\2\2\2:\u010c\3\2\2\2<\u0110\3\2\2\2>\u0112\3\2\2\2@\u0114\3\2\2\2B"+
		"\u0116\3\2\2\2D\u0119\3\2\2\2F\u011d\3\2\2\2H\u011f\3\2\2\2J\u0121\3\2"+
		"\2\2LQ\5\4\3\2MN\7\3\2\2NP\5\4\3\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2"+
		"\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\60\2\2UW\3\2\2\2VL\3\2\2\2WZ\3\2\2\2XV\3"+
		"\2\2\2XY\3\2\2\2Y\3\3\2\2\2ZX\3\2\2\2[]\5\b\5\2\\[\3\2\2\2\\]\3\2\2\2"+
		"]`\3\2\2\2^a\5\n\6\2_a\5\6\4\2`^\3\2\2\2`_\3\2\2\2`a\3\2\2\2ac\3\2\2\2"+
		"bd\5J&\2cb\3\2\2\2cd\3\2\2\2d\5\3\2\2\2eg\5H%\2fe\3\2\2\2fg\3\2\2\2gh"+
		"\3\2\2\2hj\5F$\2ik\5\60\31\2ji\3\2\2\2jk\3\2\2\2k\7\3\2\2\2ln\5\62\32"+
		"\2mo\7\4\2\2nm\3\2\2\2no\3\2\2\2o\t\3\2\2\2p\u0081\5*\26\2q\u0081\5(\25"+
		"\2r\u0081\5\36\20\2s\u0081\5&\24\2t\u0081\5\34\17\2u\u0081\5\30\r\2v\u0081"+
		"\5\26\f\2w\u0081\5\22\n\2x\u0081\5\32\16\2y\u0081\5\24\13\2z\u0081\5,"+
		"\27\2{\u0081\5.\30\2|\u0081\5\f\7\2}\u0081\5\16\b\2~\u0081\5\20\t\2\177"+
		"\u0081\7\5\2\2\u0080p\3\2\2\2\u0080q\3\2\2\2\u0080r\3\2\2\2\u0080s\3\2"+
		"\2\2\u0080t\3\2\2\2\u0080u\3\2\2\2\u0080v\3\2\2\2\u0080w\3\2\2\2\u0080"+
		"x\3\2\2\2\u0080y\3\2\2\2\u0080z\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2"+
		"\u0080}\3\2\2\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\13\3\2\2\2\u0082"+
		"\u0084\5B\"\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0086\7#\2\2\u0086\u0087\5\64\33\2\u0087\r\3\2\2\2\u0088\u008a"+
		"\5B\"\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\7$\2\2\u008c\u008d\5\64\33\2\u008d\17\3\2\2\2\u008e\u0090\5B\""+
		"\2\u008f\u008e\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092"+
		"\7%\2\2\u0092\u0093\5\64\33\2\u0093\21\3\2\2\2\u0094\u0096\7\25\2\2\u0095"+
		"\u0097\5\64\33\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\23\3\2"+
		"\2\2\u0098\u009a\7\24\2\2\u0099\u009b\5\64\33\2\u009a\u0099\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\25\3\2\2\2\u009c\u009d\7\35\2\2\u009d\u009e\5\60"+
		"\31\2\u009e\27\3\2\2\2\u009f\u00a0\7\36\2\2\u00a0\u00a1\5\60\31\2\u00a1"+
		"\31\3\2\2\2\u00a2\u00a3\7\37\2\2\u00a3\u00a4\5\60\31\2\u00a4\33\3\2\2"+
		"\2\u00a5\u00a6\5B\"\2\u00a6\u00a7\7\34\2\2\u00a7\u00a8\5\64\33\2\u00a8"+
		"\35\3\2\2\2\u00a9\u00aa\7\33\2\2\u00aa\u00ab\5 \21\2\u00ab\37\3\2\2\2"+
		"\u00ac\u00b2\5$\23\2\u00ad\u00ae\5\"\22\2\u00ae\u00af\5$\23\2\u00af\u00b1"+
		"\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00ba\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7\6"+
		"\2\2\u00b6\u00b7\5 \21\2\u00b7\u00b8\7\7\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00ac\3\2\2\2\u00b9\u00b5\3\2\2\2\u00ba!\3\2\2\2\u00bb\u00bc\t\2\2\2"+
		"\u00bc#\3\2\2\2\u00bd\u00c2\5B\"\2\u00be\u00c2\5D#\2\u00bf\u00c0\7!\2"+
		"\2\u00c0\u00c2\5$\23\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf"+
		"\3\2\2\2\u00c2%\3\2\2\2\u00c3\u00c4\7\32\2\2\u00c4\'\3\2\2\2\u00c5\u00c6"+
		"\7\30\2\2\u00c6)\3\2\2\2\u00c7\u00c8\7\31\2\2\u00c8\u00c9\5\64\33\2\u00c9"+
		"+\3\2\2\2\u00ca\u00cb\7\27\2\2\u00cb\u00cc\5@!\2\u00cc-\3\2\2\2\u00cd"+
		"\u00ce\7\26\2\2\u00ce\u00cf\5B\"\2\u00cf/\3\2\2\2\u00d0\u00d5\5\64\33"+
		"\2\u00d1\u00d2\7\n\2\2\u00d2\u00d4\5\64\33\2\u00d3\u00d1\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\61\3\2\2"+
		"\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\5B\"\2\u00d9\63\3\2\2\2\u00da\u00df"+
		"\5\66\34\2\u00db\u00dc\7,\2\2\u00dc\u00de\5\66\34\2\u00dd\u00db\3\2\2"+
		"\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\65"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e7\58\35\2\u00e3\u00e4\t\3\2\2\u00e4"+
		"\u00e6\58\35\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\67\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u010a"+
		"\5D#\2\u00eb\u010a\5<\37\2\u00ec\u010a\5> \2\u00ed\u010a\5B\"\2\u00ee"+
		"\u010a\5@!\2\u00ef\u00f0\7\6\2\2\u00f0\u00f1\5\64\33\2\u00f1\u00f2\7\7"+
		"\2\2\u00f2\u010a\3\2\2\2\u00f3\u00f6\5D#\2\u00f4\u00f6\5B\"\2\u00f5\u00f3"+
		"\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\7\17\2\2\u00f8\u00f9\5\64\33\2\u00f9\u00fa\7\20\2\2\u00fa\u010a"+
		"\3\2\2\2\u00fb\u00fc\5:\36\2\u00fc\u00fd\5\64\33\2\u00fd\u010a\3\2\2\2"+
		"\u00fe\u00ff\7!\2\2\u00ff\u010a\5\64\33\2\u0100\u0101\7\"\2\2\u0101\u010a"+
		"\5\64\33\2\u0102\u0103\7&\2\2\u0103\u010a\5\64\33\2\u0104\u0105\5> \2"+
		"\u0105\u0106\7\4\2\2\u0106\u0107\3\2\2\2\u0107\u0108\5\64\33\2\u0108\u010a"+
		"\3\2\2\2\u0109\u00ea\3\2\2\2\u0109\u00eb\3\2\2\2\u0109\u00ec\3\2\2\2\u0109"+
		"\u00ed\3\2\2\2\u0109\u00ee\3\2\2\2\u0109\u00ef\3\2\2\2\u0109\u00f5\3\2"+
		"\2\2\u0109\u00fb\3\2\2\2\u0109\u00fe\3\2\2\2\u0109\u0100\3\2\2\2\u0109"+
		"\u0102\3\2\2\2\u0109\u0104\3\2\2\2\u010a9\3\2\2\2\u010b\u010d\t\4\2\2"+
		"\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f"+
		"\7 \2\2\u010f;\3\2\2\2\u0110\u0111\7+\2\2\u0111=\3\2\2\2\u0112\u0113\7"+
		"(\2\2\u0113?\3\2\2\2\u0114\u0115\7/\2\2\u0115A\3\2\2\2\u0116\u0117\7-"+
		"\2\2\u0117C\3\2\2\2\u0118\u011a\7,\2\2\u0119\u0118\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7.\2\2\u011cE\3\2\2\2\u011d\u011e"+
		"\7)\2\2\u011eG\3\2\2\2\u011f\u0120\7*\2\2\u0120I\3\2\2\2\u0121\u0122\7"+
		"\'\2\2\u0122K\3\2\2\2\32QX\\`cfjn\u0080\u0083\u0089\u008f\u0096\u009a"+
		"\u00b2\u00b9\u00c1\u00d5\u00df\u00e7\u00f5\u0109\u010c\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}