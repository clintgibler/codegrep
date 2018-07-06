// Generated from asmMASM/asmMASM.g4 by ANTLR 4.7.1
package parsers.asmMASM;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class asmMASMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ORG=9, 
		ENDIF=10, IF=11, EQU=12, DW=13, DB=14, DM=15, DS=16, PUT=17, NOT=18, REGISTER=19, 
		OPCODE=20, REP=21, ASSIGN=22, OFFSET=23, DOLLAR=24, QUES=25, SEGMENT=26, 
		SEGMENTEND=27, GROUP=28, BYTE=29, SBYTE=30, WORD=31, DWORD=32, PARA=33, 
		PAGE=34, ALIGN=35, LABEL=36, DUP=37, ASSUME=38, SIGN=39, EXTERN=40, MASMDIRECTIVE=41, 
		NAME=42, NUMBER=43, STRING1=44, STRING2=45, COMMENT=46, EOL=47, WS=48;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_instruction = 2, RULE_lbl = 3, RULE_assemblerdirective = 4, 
		RULE_masmdirectives = 5, RULE_masmdirective = 6, RULE_assume = 7, RULE_label_ = 8, 
		RULE_type = 9, RULE_group = 10, RULE_segment = 11, RULE_endsegment = 12, 
		RULE_align = 13, RULE_assign = 14, RULE_put = 15, RULE_ds = 16, RULE_dw = 17, 
		RULE_db = 18, RULE_dm = 19, RULE_dup = 20, RULE_equ = 21, RULE_extern = 22, 
		RULE_if_ = 23, RULE_endif = 24, RULE_org = 25, RULE_expressionlist = 26, 
		RULE_label = 27, RULE_expression = 28, RULE_multiplyingExpression = 29, 
		RULE_argument = 30, RULE_gross = 31, RULE_grossrawassemblerdirective = 32, 
		RULE_dollar = 33, RULE_ques = 34, RULE_register = 35, RULE_string = 36, 
		RULE_name = 37, RULE_number = 38, RULE_opcode = 39, RULE_rep = 40, RULE_comment = 41;
	public static final String[] ruleNames = {
		"prog", "line", "instruction", "lbl", "assemblerdirective", "masmdirectives", 
		"masmdirective", "assume", "label_", "type", "group", "segment", "endsegment", 
		"align", "assign", "put", "ds", "dw", "db", "dm", "dup", "equ", "extern", 
		"if_", "endif", "org", "expressionlist", "label", "expression", "multiplyingExpression", 
		"argument", "gross", "grossrawassemblerdirective", "dollar", "ques", "register", 
		"string", "name", "number", "opcode", "rep", "comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "','", "'('", "')'", "'*'", "'/'", "'['", "']'", null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "'='", 
		null, "'$'", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "ORG", "ENDIF", 
		"IF", "EQU", "DW", "DB", "DM", "DS", "PUT", "NOT", "REGISTER", "OPCODE", 
		"REP", "ASSIGN", "OFFSET", "DOLLAR", "QUES", "SEGMENT", "SEGMENTEND", 
		"GROUP", "BYTE", "SBYTE", "WORD", "DWORD", "PARA", "PAGE", "ALIGN", "LABEL", 
		"DUP", "ASSUME", "SIGN", "EXTERN", "MASMDIRECTIVE", "NAME", "NUMBER", 
		"STRING1", "STRING2", "COMMENT", "EOL", "WS"
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
	public String getGrammarFileName() { return "asmMASM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public asmMASMParser(TokenStream input) {
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
		public List<TerminalNode> EOL() { return getTokens(asmMASMParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(asmMASMParser.EOL, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << ORG) | (1L << ENDIF) | (1L << IF) | (1L << EQU) | (1L << DW) | (1L << DB) | (1L << DM) | (1L << DS) | (1L << PUT) | (1L << NOT) | (1L << REGISTER) | (1L << OPCODE) | (1L << REP) | (1L << OFFSET) | (1L << DOLLAR) | (1L << QUES) | (1L << BYTE) | (1L << SBYTE) | (1L << WORD) | (1L << DWORD) | (1L << ASSUME) | (1L << SIGN) | (1L << EXTERN) | (1L << MASMDIRECTIVE) | (1L << NAME) | (1L << NUMBER) | (1L << STRING1) | (1L << STRING2) | (1L << COMMENT) | (1L << EOL))) != 0)) {
				{
				{
				setState(84);
				line();
				setState(85);
				match(EOL);
				}
				}
				setState(91);
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
		public MasmdirectivesContext masmdirectives() {
			return getRuleContext(MasmdirectivesContext.class,0);
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
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(92);
				lbl();
				}
				break;
			}
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(95);
				assemblerdirective();
				}
				break;
			case 2:
				{
				setState(96);
				masmdirectives();
				}
				break;
			case 3:
				{
				setState(97);
				instruction();
				}
				break;
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(100);
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
		public RepContext rep() {
			return getRuleContext(RepContext.class,0);
		}
		public OpcodeContext opcode() {
			return getRuleContext(OpcodeContext.class,0);
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
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REP) {
				{
				setState(103);
				rep();
				}
			}

			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(106);
				opcode();
				}
				break;
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << ORG) | (1L << ENDIF) | (1L << IF) | (1L << EQU) | (1L << PUT) | (1L << NOT) | (1L << REGISTER) | (1L << OPCODE) | (1L << OFFSET) | (1L << DOLLAR) | (1L << QUES) | (1L << SIGN) | (1L << NAME) | (1L << NUMBER) | (1L << STRING1) | (1L << STRING2))) != 0)) {
				{
				setState(109);
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
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterLbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitLbl(this);
		}
	}

	public final LblContext lbl() throws RecognitionException {
		LblContext _localctx = new LblContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lbl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			label();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(113);
				match(T__0);
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
		public DmContext dm() {
			return getRuleContext(DmContext.class,0);
		}
		public DsContext ds() {
			return getRuleContext(DsContext.class,0);
		}
		public PutContext put() {
			return getRuleContext(PutContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public SegmentContext segment() {
			return getRuleContext(SegmentContext.class,0);
		}
		public EndsegmentContext endsegment() {
			return getRuleContext(EndsegmentContext.class,0);
		}
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public Label_Context label_() {
			return getRuleContext(Label_Context.class,0);
		}
		public AssumeContext assume() {
			return getRuleContext(AssumeContext.class,0);
		}
		public ExternContext extern() {
			return getRuleContext(ExternContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionlistContext> expressionlist() {
			return getRuleContexts(ExpressionlistContext.class);
		}
		public ExpressionlistContext expressionlist(int i) {
			return getRuleContext(ExpressionlistContext.class,i);
		}
		public AssemblerdirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblerdirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterAssemblerdirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitAssemblerdirective(this);
		}
	}

	public final AssemblerdirectiveContext assemblerdirective() throws RecognitionException {
		AssemblerdirectiveContext _localctx = new AssemblerdirectiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assemblerdirective);
		int _la;
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				org();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				if_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				endif();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				equ();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(120);
				db();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(121);
				dw();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				dm();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(123);
				ds();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(124);
				put();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(125);
				assign();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(126);
				segment();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(127);
				endsegment();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(128);
				group();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(129);
				label_();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(130);
				assume();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(131);
				extern();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				{
				setState(132);
				type();
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(133);
					expressionlist();
					}
					}
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << ORG) | (1L << ENDIF) | (1L << IF) | (1L << EQU) | (1L << PUT) | (1L << NOT) | (1L << REGISTER) | (1L << OPCODE) | (1L << OFFSET) | (1L << DOLLAR) | (1L << QUES) | (1L << SIGN) | (1L << NAME) | (1L << NUMBER) | (1L << STRING1) | (1L << STRING2))) != 0) );
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

	public static class MasmdirectivesContext extends ParserRuleContext {
		public List<MasmdirectiveContext> masmdirective() {
			return getRuleContexts(MasmdirectiveContext.class);
		}
		public MasmdirectiveContext masmdirective(int i) {
			return getRuleContext(MasmdirectiveContext.class,i);
		}
		public MasmdirectivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_masmdirectives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterMasmdirectives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitMasmdirectives(this);
		}
	}

	public final MasmdirectivesContext masmdirectives() throws RecognitionException {
		MasmdirectivesContext _localctx = new MasmdirectivesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_masmdirectives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(140);
				masmdirective();
				}
				}
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MASMDIRECTIVE );
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

	public static class MasmdirectiveContext extends ParserRuleContext {
		public TerminalNode MASMDIRECTIVE() { return getToken(asmMASMParser.MASMDIRECTIVE, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public MasmdirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_masmdirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterMasmdirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitMasmdirective(this);
		}
	}

	public final MasmdirectiveContext masmdirective() throws RecognitionException {
		MasmdirectiveContext _localctx = new MasmdirectiveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_masmdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(MASMDIRECTIVE);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << ORG) | (1L << ENDIF) | (1L << IF) | (1L << EQU) | (1L << PUT) | (1L << NOT) | (1L << REGISTER) | (1L << OPCODE) | (1L << OFFSET) | (1L << DOLLAR) | (1L << QUES) | (1L << SIGN) | (1L << NAME) | (1L << NUMBER) | (1L << STRING1) | (1L << STRING2))) != 0)) {
				{
				setState(146);
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

	public static class AssumeContext extends ParserRuleContext {
		public TerminalNode ASSUME() { return getToken(asmMASMParser.ASSUME, 0); }
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public AssumeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assume; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterAssume(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitAssume(this);
		}
	}

	public final AssumeContext assume() throws RecognitionException {
		AssumeContext _localctx = new AssumeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assume);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ASSUME);
			setState(150);
			register();
			setState(151);
			match(T__0);
			setState(152);
			name();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(153);
				match(T__1);
				setState(154);
				register();
				setState(155);
				match(T__0);
				setState(156);
				name();
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

	public static class Label_Context extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode LABEL() { return getToken(asmMASMParser.LABEL, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Label_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterLabel_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitLabel_(this);
		}
	}

	public final Label_Context label_() throws RecognitionException {
		Label_Context _localctx = new Label_Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_label_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			name();
			setState(164);
			match(LABEL);
			setState(165);
			type();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(asmMASMParser.BYTE, 0); }
		public TerminalNode SBYTE() { return getToken(asmMASMParser.SBYTE, 0); }
		public TerminalNode WORD() { return getToken(asmMASMParser.WORD, 0); }
		public TerminalNode DWORD() { return getToken(asmMASMParser.DWORD, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << SBYTE) | (1L << WORD) | (1L << DWORD))) != 0)) ) {
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

	public static class GroupContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode GROUP() { return getToken(asmMASMParser.GROUP, 0); }
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitGroup(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			name();
			setState(170);
			match(GROUP);
			setState(171);
			name();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(172);
				match(T__1);
				setState(173);
				name();
				}
				}
				setState(178);
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

	public static class SegmentContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEGMENT() { return getToken(asmMASMParser.SEGMENT, 0); }
		public AlignContext align() {
			return getRuleContext(AlignContext.class,0);
		}
		public SegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitSegment(this);
		}
	}

	public final SegmentContext segment() throws RecognitionException {
		SegmentContext _localctx = new SegmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			name();
			setState(180);
			match(SEGMENT);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << WORD) | (1L << DWORD) | (1L << PARA) | (1L << PAGE) | (1L << ALIGN))) != 0)) {
				{
				setState(181);
				align();
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

	public static class EndsegmentContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode SEGMENTEND() { return getToken(asmMASMParser.SEGMENTEND, 0); }
		public EndsegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endsegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterEndsegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitEndsegment(this);
		}
	}

	public final EndsegmentContext endsegment() throws RecognitionException {
		EndsegmentContext _localctx = new EndsegmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_endsegment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			name();
			setState(185);
			match(SEGMENTEND);
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

	public static class AlignContext extends ParserRuleContext {
		public TerminalNode BYTE() { return getToken(asmMASMParser.BYTE, 0); }
		public TerminalNode WORD() { return getToken(asmMASMParser.WORD, 0); }
		public TerminalNode DWORD() { return getToken(asmMASMParser.DWORD, 0); }
		public TerminalNode PARA() { return getToken(asmMASMParser.PARA, 0); }
		public TerminalNode PAGE() { return getToken(asmMASMParser.PAGE, 0); }
		public TerminalNode ALIGN() { return getToken(asmMASMParser.ALIGN, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public AlignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_align; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterAlign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitAlign(this);
		}
	}

	public final AlignContext align() throws RecognitionException {
		AlignContext _localctx = new AlignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_align);
		int _la;
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BYTE:
			case WORD:
			case DWORD:
			case PARA:
			case PAGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BYTE) | (1L << WORD) | (1L << DWORD) | (1L << PARA) | (1L << PAGE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ALIGN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(188);
				match(ALIGN);
				setState(189);
				match(T__2);
				setState(190);
				number();
				setState(191);
				match(T__3);
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

	public static class AssignContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(asmMASMParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			name();
			setState(196);
			match(ASSIGN);
			setState(197);
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

	public static class PutContext extends ParserRuleContext {
		public TerminalNode PUT() { return getToken(asmMASMParser.PUT, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public PutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_put; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterPut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitPut(this);
		}
	}

	public final PutContext put() throws RecognitionException {
		PutContext _localctx = new PutContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_put);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(PUT);
			setState(200);
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

	public static class DsContext extends ParserRuleContext {
		public TerminalNode DS() { return getToken(asmMASMParser.DS, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public DsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterDs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitDs(this);
		}
	}

	public final DsContext ds() throws RecognitionException {
		DsContext _localctx = new DsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(DS);
			setState(203);
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

	public static class DwContext extends ParserRuleContext {
		public TerminalNode DW() { return getToken(asmMASMParser.DW, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public DwContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dw; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterDw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitDw(this);
		}
	}

	public final DwContext dw() throws RecognitionException {
		DwContext _localctx = new DwContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dw);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(DW);
			setState(206);
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
		public TerminalNode DB() { return getToken(asmMASMParser.DB, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public DbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterDb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitDb(this);
		}
	}

	public final DbContext db() throws RecognitionException {
		DbContext _localctx = new DbContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_db);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(DB);
			setState(209);
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

	public static class DmContext extends ParserRuleContext {
		public TerminalNode DM() { return getToken(asmMASMParser.DM, 0); }
		public ExpressionlistContext expressionlist() {
			return getRuleContext(ExpressionlistContext.class,0);
		}
		public DmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterDm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitDm(this);
		}
	}

	public final DmContext dm() throws RecognitionException {
		DmContext _localctx = new DmContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(DM);
			setState(212);
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

	public static class DupContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode DUP() { return getToken(asmMASMParser.DUP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterDup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitDup(this);
		}
	}

	public final DupContext dup() throws RecognitionException {
		DupContext _localctx = new DupContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			number();
			setState(215);
			match(DUP);
			setState(216);
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

	public static class EquContext extends ParserRuleContext {
		public TerminalNode EQU() { return getToken(asmMASMParser.EQU, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EquContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterEqu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitEqu(this);
		}
	}

	public final EquContext equ() throws RecognitionException {
		EquContext _localctx = new EquContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_equ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(EQU);
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

	public static class ExternContext extends ParserRuleContext {
		public TerminalNode EXTERN() { return getToken(asmMASMParser.EXTERN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterExtern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitExtern(this);
		}
	}

	public final ExternContext extern() throws RecognitionException {
		ExternContext _localctx = new ExternContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_extern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(EXTERN);
			setState(222);
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
		public TerminalNode IF() { return getToken(asmMASMParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitIf_(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_if_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(IF);
			setState(225);
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

	public static class EndifContext extends ParserRuleContext {
		public TerminalNode ENDIF() { return getToken(asmMASMParser.ENDIF, 0); }
		public EndifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterEndif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitEndif(this);
		}
	}

	public final EndifContext endif() throws RecognitionException {
		EndifContext _localctx = new EndifContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_endif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
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

	public static class OrgContext extends ParserRuleContext {
		public TerminalNode ORG() { return getToken(asmMASMParser.ORG, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_org; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterOrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitOrg(this);
		}
	}

	public final OrgContext org() throws RecognitionException {
		OrgContext _localctx = new OrgContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_org);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(ORG);
			setState(230);
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
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterExpressionlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitExpressionlist(this);
		}
	}

	public final ExpressionlistContext expressionlist() throws RecognitionException {
		ExpressionlistContext _localctx = new ExpressionlistContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expressionlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			expression();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(233);
				match(T__1);
				setState(234);
				expression();
				}
				}
				setState(239);
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
		public GrossContext gross() {
			return getRuleContext(GrossContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_label);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(240);
				name();
				}
				break;
			case ORG:
			case ENDIF:
			case IF:
			case EQU:
			case PUT:
			case OPCODE:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				gross();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public List<TerminalNode> SIGN() { return getTokens(asmMASMParser.SIGN); }
		public TerminalNode SIGN(int i) {
			return getToken(asmMASMParser.SIGN, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			multiplyingExpression();
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245);
					match(SIGN);
					setState(246);
					multiplyingExpression();
					}
					} 
				}
				setState(251);
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
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterMultiplyingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitMultiplyingExpression(this);
		}
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_multiplyingExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			argument();
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(253);
					_la = _input.LA(1);
					if ( !(_la==T__4 || _la==T__5) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(254);
					argument();
					}
					} 
				}
				setState(259);
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
		public QuesContext ques() {
			return getRuleContext(QuesContext.class,0);
		}
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(asmMASMParser.NOT, 0); }
		public TerminalNode OFFSET() { return getToken(asmMASMParser.OFFSET, 0); }
		public GrossContext gross() {
			return getRuleContext(GrossContext.class,0);
		}
		public DupContext dup() {
			return getRuleContext(DupContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_argument);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				dollar();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				ques();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				register();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(267);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(264);
					name();
					setState(265);
					match(T__0);
					}
					break;
				}
				setState(269);
				name();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(270);
				string();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(271);
				match(T__2);
				setState(272);
				expression();
				setState(273);
				match(T__3);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(275);
				match(T__6);
				setState(276);
				expression();
				setState(277);
				match(T__7);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(279);
				match(NOT);
				setState(280);
				expression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(281);
				match(OFFSET);
				setState(282);
				expression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(283);
				gross();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(284);
				dup();
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

	public static class GrossContext extends ParserRuleContext {
		public OpcodeContext opcode() {
			return getRuleContext(OpcodeContext.class,0);
		}
		public GrossrawassemblerdirectiveContext grossrawassemblerdirective() {
			return getRuleContext(GrossrawassemblerdirectiveContext.class,0);
		}
		public GrossContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gross; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterGross(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitGross(this);
		}
	}

	public final GrossContext gross() throws RecognitionException {
		GrossContext _localctx = new GrossContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_gross);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPCODE:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				opcode();
				}
				break;
			case ORG:
			case ENDIF:
			case IF:
			case EQU:
			case PUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				grossrawassemblerdirective();
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

	public static class GrossrawassemblerdirectiveContext extends ParserRuleContext {
		public TerminalNode PUT() { return getToken(asmMASMParser.PUT, 0); }
		public TerminalNode IF() { return getToken(asmMASMParser.IF, 0); }
		public TerminalNode ENDIF() { return getToken(asmMASMParser.ENDIF, 0); }
		public TerminalNode ORG() { return getToken(asmMASMParser.ORG, 0); }
		public TerminalNode EQU() { return getToken(asmMASMParser.EQU, 0); }
		public GrossrawassemblerdirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grossrawassemblerdirective; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterGrossrawassemblerdirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitGrossrawassemblerdirective(this);
		}
	}

	public final GrossrawassemblerdirectiveContext grossrawassemblerdirective() throws RecognitionException {
		GrossrawassemblerdirectiveContext _localctx = new GrossrawassemblerdirectiveContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_grossrawassemblerdirective);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ORG) | (1L << ENDIF) | (1L << IF) | (1L << EQU) | (1L << PUT))) != 0)) ) {
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

	public static class DollarContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(asmMASMParser.DOLLAR, 0); }
		public DollarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dollar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterDollar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitDollar(this);
		}
	}

	public final DollarContext dollar() throws RecognitionException {
		DollarContext _localctx = new DollarContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_dollar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
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

	public static class QuesContext extends ParserRuleContext {
		public TerminalNode QUES() { return getToken(asmMASMParser.QUES, 0); }
		public QuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ques; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterQues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitQues(this);
		}
	}

	public final QuesContext ques() throws RecognitionException {
		QuesContext _localctx = new QuesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ques);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(QUES);
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
		public TerminalNode REGISTER() { return getToken(asmMASMParser.REGISTER, 0); }
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitRegister(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_register);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
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
		public TerminalNode STRING1() { return getToken(asmMASMParser.STRING1, 0); }
		public TerminalNode STRING2() { return getToken(asmMASMParser.STRING2, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			_la = _input.LA(1);
			if ( !(_la==STRING1 || _la==STRING2) ) {
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(asmMASMParser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
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
		public TerminalNode NUMBER() { return getToken(asmMASMParser.NUMBER, 0); }
		public TerminalNode SIGN() { return getToken(asmMASMParser.SIGN, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGN) {
				{
				setState(303);
				match(SIGN);
				}
			}

			setState(306);
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
		public TerminalNode OPCODE() { return getToken(asmMASMParser.OPCODE, 0); }
		public OpcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterOpcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitOpcode(this);
		}
	}

	public final OpcodeContext opcode() throws RecognitionException {
		OpcodeContext _localctx = new OpcodeContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_opcode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
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
		public TerminalNode REP() { return getToken(asmMASMParser.REP, 0); }
		public RepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterRep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitRep(this);
		}
	}

	public final RepContext rep() throws RecognitionException {
		RepContext _localctx = new RepContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_rep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
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
		public TerminalNode COMMENT() { return getToken(asmMASMParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmMASMListener ) ((asmMASMListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u013d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\3\5\3`\n\3\3\3\3\3\3\3\5\3e\n\3\3"+
		"\3\5\3h\n\3\3\4\5\4k\n\4\3\4\5\4n\n\4\3\4\5\4q\n\4\3\5\3\5\5\5u\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\6\6\u0089\n\6\r\6\16\6\u008a\5\6\u008d\n\6\3\7\6\7\u0090\n\7\r\7\16\7"+
		"\u0091\3\b\3\b\5\b\u0096\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00a1"+
		"\n\t\f\t\16\t\u00a4\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u00b1\n\f\f\f\16\f\u00b4\13\f\3\r\3\r\3\r\5\r\u00b9\n\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c4\n\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u00ee\n\34\f\34\16\34\u00f1"+
		"\13\34\3\35\3\35\5\35\u00f5\n\35\3\36\3\36\3\36\7\36\u00fa\n\36\f\36\16"+
		"\36\u00fd\13\36\3\37\3\37\3\37\7\37\u0102\n\37\f\37\16\37\u0105\13\37"+
		"\3 \3 \3 \3 \3 \3 \3 \5 \u010e\n \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \5 \u0120\n \3!\3!\5!\u0124\n!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"&\3&\3\'\3\'\3(\5(\u0133\n(\3(\3(\3)\3)\3*\3*\3+\3+\3+\2\2,\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT\2\7"+
		"\3\2\37\"\4\2\37\37!$\3\2\7\b\4\2\13\16\23\23\3\2./\2\u0145\2[\3\2\2\2"+
		"\4_\3\2\2\2\6j\3\2\2\2\br\3\2\2\2\n\u008c\3\2\2\2\f\u008f\3\2\2\2\16\u0093"+
		"\3\2\2\2\20\u0097\3\2\2\2\22\u00a5\3\2\2\2\24\u00a9\3\2\2\2\26\u00ab\3"+
		"\2\2\2\30\u00b5\3\2\2\2\32\u00ba\3\2\2\2\34\u00c3\3\2\2\2\36\u00c5\3\2"+
		"\2\2 \u00c9\3\2\2\2\"\u00cc\3\2\2\2$\u00cf\3\2\2\2&\u00d2\3\2\2\2(\u00d5"+
		"\3\2\2\2*\u00d8\3\2\2\2,\u00dc\3\2\2\2.\u00df\3\2\2\2\60\u00e2\3\2\2\2"+
		"\62\u00e5\3\2\2\2\64\u00e7\3\2\2\2\66\u00ea\3\2\2\28\u00f4\3\2\2\2:\u00f6"+
		"\3\2\2\2<\u00fe\3\2\2\2>\u011f\3\2\2\2@\u0123\3\2\2\2B\u0125\3\2\2\2D"+
		"\u0127\3\2\2\2F\u0129\3\2\2\2H\u012b\3\2\2\2J\u012d\3\2\2\2L\u012f\3\2"+
		"\2\2N\u0132\3\2\2\2P\u0136\3\2\2\2R\u0138\3\2\2\2T\u013a\3\2\2\2VW\5\4"+
		"\3\2WX\7\61\2\2XZ\3\2\2\2YV\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\3"+
		"\3\2\2\2][\3\2\2\2^`\5\b\5\2_^\3\2\2\2_`\3\2\2\2`d\3\2\2\2ae\5\n\6\2b"+
		"e\5\f\7\2ce\5\6\4\2da\3\2\2\2db\3\2\2\2dc\3\2\2\2de\3\2\2\2eg\3\2\2\2"+
		"fh\5T+\2gf\3\2\2\2gh\3\2\2\2h\5\3\2\2\2ik\5R*\2ji\3\2\2\2jk\3\2\2\2km"+
		"\3\2\2\2ln\5P)\2ml\3\2\2\2mn\3\2\2\2np\3\2\2\2oq\5\66\34\2po\3\2\2\2p"+
		"q\3\2\2\2q\7\3\2\2\2rt\58\35\2su\7\3\2\2ts\3\2\2\2tu\3\2\2\2u\t\3\2\2"+
		"\2v\u008d\5\64\33\2w\u008d\5\60\31\2x\u008d\5\62\32\2y\u008d\5,\27\2z"+
		"\u008d\5&\24\2{\u008d\5$\23\2|\u008d\5(\25\2}\u008d\5\"\22\2~\u008d\5"+
		" \21\2\177\u008d\5\36\20\2\u0080\u008d\5\30\r\2\u0081\u008d\5\32\16\2"+
		"\u0082\u008d\5\26\f\2\u0083\u008d\5\22\n\2\u0084\u008d\5\20\t\2\u0085"+
		"\u008d\5.\30\2\u0086\u0088\5\24\13\2\u0087\u0089\5\66\34\2\u0088\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008d\3\2\2\2\u008cv\3\2\2\2\u008cw\3\2\2\2\u008cx\3\2\2\2\u008cy\3\2"+
		"\2\2\u008cz\3\2\2\2\u008c{\3\2\2\2\u008c|\3\2\2\2\u008c}\3\2\2\2\u008c"+
		"~\3\2\2\2\u008c\177\3\2\2\2\u008c\u0080\3\2\2\2\u008c\u0081\3\2\2\2\u008c"+
		"\u0082\3\2\2\2\u008c\u0083\3\2\2\2\u008c\u0084\3\2\2\2\u008c\u0085\3\2"+
		"\2\2\u008c\u0086\3\2\2\2\u008d\13\3\2\2\2\u008e\u0090\5\16\b\2\u008f\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\r\3\2\2\2\u0093\u0095\7+\2\2\u0094\u0096\5\66\34\2\u0095\u0094\3\2\2"+
		"\2\u0095\u0096\3\2\2\2\u0096\17\3\2\2\2\u0097\u0098\7(\2\2\u0098\u0099"+
		"\5H%\2\u0099\u009a\7\3\2\2\u009a\u00a2\5L\'\2\u009b\u009c\7\4\2\2\u009c"+
		"\u009d\5H%\2\u009d\u009e\7\3\2\2\u009e\u009f\5L\'\2\u009f\u00a1\3\2\2"+
		"\2\u00a0\u009b\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\21\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\5L\'\2\u00a6"+
		"\u00a7\7&\2\2\u00a7\u00a8\5\24\13\2\u00a8\23\3\2\2\2\u00a9\u00aa\t\2\2"+
		"\2\u00aa\25\3\2\2\2\u00ab\u00ac\5L\'\2\u00ac\u00ad\7\36\2\2\u00ad\u00b2"+
		"\5L\'\2\u00ae\u00af\7\4\2\2\u00af\u00b1\5L\'\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\27\3\2\2"+
		"\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\5L\'\2\u00b6\u00b8\7\34\2\2\u00b7\u00b9"+
		"\5\34\17\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\31\3\2\2\2\u00ba"+
		"\u00bb\5L\'\2\u00bb\u00bc\7\35\2\2\u00bc\33\3\2\2\2\u00bd\u00c4\t\3\2"+
		"\2\u00be\u00bf\7%\2\2\u00bf\u00c0\7\5\2\2\u00c0\u00c1\5N(\2\u00c1\u00c2"+
		"\7\6\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c3\u00be\3\2\2\2\u00c4"+
		"\35\3\2\2\2\u00c5\u00c6\5L\'\2\u00c6\u00c7\7\30\2\2\u00c7\u00c8\5:\36"+
		"\2\u00c8\37\3\2\2\2\u00c9\u00ca\7\23\2\2\u00ca\u00cb\5\66\34\2\u00cb!"+
		"\3\2\2\2\u00cc\u00cd\7\22\2\2\u00cd\u00ce\5\66\34\2\u00ce#\3\2\2\2\u00cf"+
		"\u00d0\7\17\2\2\u00d0\u00d1\5\66\34\2\u00d1%\3\2\2\2\u00d2\u00d3\7\20"+
		"\2\2\u00d3\u00d4\5\66\34\2\u00d4\'\3\2\2\2\u00d5\u00d6\7\21\2\2\u00d6"+
		"\u00d7\5\66\34\2\u00d7)\3\2\2\2\u00d8\u00d9\5N(\2\u00d9\u00da\7\'\2\2"+
		"\u00da\u00db\5:\36\2\u00db+\3\2\2\2\u00dc\u00dd\7\16\2\2\u00dd\u00de\5"+
		":\36\2\u00de-\3\2\2\2\u00df\u00e0\7*\2\2\u00e0\u00e1\5:\36\2\u00e1/\3"+
		"\2\2\2\u00e2\u00e3\7\r\2\2\u00e3\u00e4\5:\36\2\u00e4\61\3\2\2\2\u00e5"+
		"\u00e6\7\f\2\2\u00e6\63\3\2\2\2\u00e7\u00e8\7\13\2\2\u00e8\u00e9\5:\36"+
		"\2\u00e9\65\3\2\2\2\u00ea\u00ef\5:\36\2\u00eb\u00ec\7\4\2\2\u00ec\u00ee"+
		"\5:\36\2\u00ed\u00eb\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\67\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\5L\'\2"+
		"\u00f3\u00f5\5@!\2\u00f4\u00f2\3\2\2\2\u00f4\u00f3\3\2\2\2\u00f59\3\2"+
		"\2\2\u00f6\u00fb\5<\37\2\u00f7\u00f8\7)\2\2\u00f8\u00fa\5<\37\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc;\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0103\5> \2\u00ff\u0100"+
		"\t\4\2\2\u0100\u0102\5> \2\u0101\u00ff\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104=\3\2\2\2\u0105\u0103\3\2\2\2"+
		"\u0106\u0120\5N(\2\u0107\u0120\5D#\2\u0108\u0120\5F$\2\u0109\u0120\5H"+
		"%\2\u010a\u010b\5L\'\2\u010b\u010c\7\3\2\2\u010c\u010e\3\2\2\2\u010d\u010a"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0120\5L\'\2\u0110"+
		"\u0120\5J&\2\u0111\u0112\7\5\2\2\u0112\u0113\5:\36\2\u0113\u0114\7\6\2"+
		"\2\u0114\u0120\3\2\2\2\u0115\u0116\7\t\2\2\u0116\u0117\5:\36\2\u0117\u0118"+
		"\7\n\2\2\u0118\u0120\3\2\2\2\u0119\u011a\7\24\2\2\u011a\u0120\5:\36\2"+
		"\u011b\u011c\7\31\2\2\u011c\u0120\5:\36\2\u011d\u0120\5@!\2\u011e\u0120"+
		"\5*\26\2\u011f\u0106\3\2\2\2\u011f\u0107\3\2\2\2\u011f\u0108\3\2\2\2\u011f"+
		"\u0109\3\2\2\2\u011f\u010d\3\2\2\2\u011f\u0110\3\2\2\2\u011f\u0111\3\2"+
		"\2\2\u011f\u0115\3\2\2\2\u011f\u0119\3\2\2\2\u011f\u011b\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120?\3\2\2\2\u0121\u0124\5P)\2\u0122"+
		"\u0124\5B\"\2\u0123\u0121\3\2\2\2\u0123\u0122\3\2\2\2\u0124A\3\2\2\2\u0125"+
		"\u0126\t\5\2\2\u0126C\3\2\2\2\u0127\u0128\7\32\2\2\u0128E\3\2\2\2\u0129"+
		"\u012a\7\33\2\2\u012aG\3\2\2\2\u012b\u012c\7\25\2\2\u012cI\3\2\2\2\u012d"+
		"\u012e\t\6\2\2\u012eK\3\2\2\2\u012f\u0130\7,\2\2\u0130M\3\2\2\2\u0131"+
		"\u0133\7)\2\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0135\7-\2\2\u0135O\3\2\2\2\u0136\u0137\7\26\2\2\u0137Q\3\2"+
		"\2\2\u0138\u0139\7\27\2\2\u0139S\3\2\2\2\u013a\u013b\7\60\2\2\u013bU\3"+
		"\2\2\2\32[_dgjmpt\u008a\u008c\u0091\u0095\u00a2\u00b2\u00b8\u00c3\u00ef"+
		"\u00f4\u00fb\u0103\u010d\u011f\u0123\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}