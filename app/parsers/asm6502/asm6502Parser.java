// Generated from asm6502/asm6502.g4 by ANTLR 4.7.1
package parsers.asm6502;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class asm6502Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, ASSEMBLER_INSTRUCTION=9, 
		ADC=10, AND=11, ASL=12, BCC=13, BCS=14, BEQ=15, BIT=16, BMI=17, BNE=18, 
		BPL=19, BRA=20, BRK=21, BVC=22, BVS=23, CLC=24, CLD=25, CLI=26, CLV=27, 
		CMP=28, CPX=29, CPY=30, DEC=31, DEX=32, DEY=33, EOR=34, INC=35, INX=36, 
		INY=37, JMP=38, JSR=39, LDA=40, LDY=41, LDX=42, LSR=43, NOP=44, ORA=45, 
		PHA=46, PHX=47, PHY=48, PHP=49, PLA=50, PLP=51, PLY=52, ROL=53, ROR=54, 
		RTI=55, RTS=56, SBC=57, SEC=58, SED=59, SEI=60, STA=61, STX=62, STY=63, 
		STZ=64, TAX=65, TAY=66, TSX=67, TXA=68, TXS=69, TYA=70, NAME=71, NUMBER=72, 
		COMMENT=73, STRING=74, EOL=75, WS=76;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_instruction = 2, RULE_assemblerinstruction = 3, 
		RULE_assembleropcode = 4, RULE_lbl = 5, RULE_argumentlist = 6, RULE_label = 7, 
		RULE_argument = 8, RULE_prefix = 9, RULE_string = 10, RULE_name = 11, 
		RULE_number = 12, RULE_comment = 13, RULE_opcode = 14;
	public static final String[] ruleNames = {
		"prog", "line", "instruction", "assemblerinstruction", "assembleropcode", 
		"lbl", "argumentlist", "label", "argument", "prefix", "string", "name", 
		"number", "comment", "opcode"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "','", "'*'", "'+'", "'-'", "'('", "')'", "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "ASSEMBLER_INSTRUCTION", 
		"ADC", "AND", "ASL", "BCC", "BCS", "BEQ", "BIT", "BMI", "BNE", "BPL", 
		"BRA", "BRK", "BVC", "BVS", "CLC", "CLD", "CLI", "CLV", "CMP", "CPX", 
		"CPY", "DEC", "DEX", "DEY", "EOR", "INC", "INX", "INY", "JMP", "JSR", 
		"LDA", "LDY", "LDX", "LSR", "NOP", "ORA", "PHA", "PHX", "PHY", "PHP", 
		"PLA", "PLP", "PLY", "ROL", "ROR", "RTI", "RTS", "SBC", "SEC", "SED", 
		"SEI", "STA", "STX", "STY", "STZ", "TAX", "TAY", "TSX", "TXA", "TXS", 
		"TYA", "NAME", "NUMBER", "COMMENT", "STRING", "EOL", "WS"
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
	public String getGrammarFileName() { return "asm6502.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public asm6502Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> EOL() { return getTokens(asm6502Parser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(asm6502Parser.EOL, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << ASSEMBLER_INSTRUCTION) | (1L << ADC) | (1L << AND) | (1L << ASL) | (1L << BCC) | (1L << BCS) | (1L << BEQ) | (1L << BIT) | (1L << BMI) | (1L << BNE) | (1L << BPL) | (1L << BRA) | (1L << BRK) | (1L << BVC) | (1L << BVS) | (1L << CLC) | (1L << CLD) | (1L << CLI) | (1L << CLV) | (1L << CMP) | (1L << CPX) | (1L << CPY) | (1L << DEC) | (1L << DEX) | (1L << DEY) | (1L << EOR) | (1L << INC) | (1L << INX) | (1L << INY) | (1L << JMP) | (1L << JSR) | (1L << LDA) | (1L << LDY) | (1L << LDX) | (1L << LSR) | (1L << NOP) | (1L << ORA) | (1L << PHA) | (1L << PHX) | (1L << PHY) | (1L << PHP) | (1L << PLA) | (1L << PLP) | (1L << PLY) | (1L << ROL) | (1L << ROR) | (1L << RTI) | (1L << RTS) | (1L << SBC) | (1L << SEC) | (1L << SED) | (1L << SEI) | (1L << STA) | (1L << STX) | (1L << STY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STZ - 64)) | (1L << (TAX - 64)) | (1L << (TAY - 64)) | (1L << (TSX - 64)) | (1L << (TXA - 64)) | (1L << (TXS - 64)) | (1L << (TYA - 64)) | (1L << (NAME - 64)) | (1L << (NUMBER - 64)) | (1L << (COMMENT - 64)) | (1L << (STRING - 64)))) != 0)) {
					{
					setState(30);
					line();
					}
				}

				setState(33);
				match(EOL);
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << ASSEMBLER_INSTRUCTION) | (1L << ADC) | (1L << AND) | (1L << ASL) | (1L << BCC) | (1L << BCS) | (1L << BEQ) | (1L << BIT) | (1L << BMI) | (1L << BNE) | (1L << BPL) | (1L << BRA) | (1L << BRK) | (1L << BVC) | (1L << BVS) | (1L << CLC) | (1L << CLD) | (1L << CLI) | (1L << CLV) | (1L << CMP) | (1L << CPX) | (1L << CPY) | (1L << DEC) | (1L << DEX) | (1L << DEY) | (1L << EOR) | (1L << INC) | (1L << INX) | (1L << INY) | (1L << JMP) | (1L << JSR) | (1L << LDA) | (1L << LDY) | (1L << LDX) | (1L << LSR) | (1L << NOP) | (1L << ORA) | (1L << PHA) | (1L << PHX) | (1L << PHY) | (1L << PHP) | (1L << PLA) | (1L << PLP) | (1L << PLY) | (1L << ROL) | (1L << ROR) | (1L << RTI) | (1L << RTS) | (1L << SBC) | (1L << SEC) | (1L << SED) | (1L << SEI) | (1L << STA) | (1L << STX) | (1L << STY))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (STZ - 64)) | (1L << (TAX - 64)) | (1L << (TAY - 64)) | (1L << (TSX - 64)) | (1L << (TXA - 64)) | (1L << (TXS - 64)) | (1L << (TYA - 64)) | (1L << (NAME - 64)) | (1L << (NUMBER - 64)) | (1L << (COMMENT - 64)) | (1L << (STRING - 64)) | (1L << (EOL - 64)))) != 0) );
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public AssemblerinstructionContext assemblerinstruction() {
			return getRuleContext(AssemblerinstructionContext.class,0);
		}
		public LblContext lbl() {
			return getRuleContext(LblContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(42);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				comment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				instruction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				assemblerinstruction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				lbl();
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

	public static class InstructionContext extends ParserRuleContext {
		public OpcodeContext opcode() {
			return getRuleContext(OpcodeContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(44);
				label();
				}
			}

			setState(47);
			opcode();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__7))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (NAME - 71)) | (1L << (NUMBER - 71)) | (1L << (STRING - 71)))) != 0)) {
				{
				setState(48);
				argumentlist();
				}
			}

			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(51);
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

	public static class AssemblerinstructionContext extends ParserRuleContext {
		public AssembleropcodeContext assembleropcode() {
			return getRuleContext(AssembleropcodeContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public AssemblerinstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblerinstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterAssemblerinstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitAssemblerinstruction(this);
		}
	}

	public final AssemblerinstructionContext assemblerinstruction() throws RecognitionException {
		AssemblerinstructionContext _localctx = new AssemblerinstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assemblerinstruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__7))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (NAME - 71)) | (1L << (NUMBER - 71)) | (1L << (STRING - 71)))) != 0)) {
				{
				setState(54);
				argument();
				}
			}

			setState(57);
			assembleropcode();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__7))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (NAME - 71)) | (1L << (NUMBER - 71)) | (1L << (STRING - 71)))) != 0)) {
				{
				setState(58);
				argumentlist();
				}
			}

			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(61);
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

	public static class AssembleropcodeContext extends ParserRuleContext {
		public TerminalNode ASSEMBLER_INSTRUCTION() { return getToken(asm6502Parser.ASSEMBLER_INSTRUCTION, 0); }
		public AssembleropcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assembleropcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterAssembleropcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitAssembleropcode(this);
		}
	}

	public final AssembleropcodeContext assembleropcode() throws RecognitionException {
		AssembleropcodeContext _localctx = new AssembleropcodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assembleropcode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ASSEMBLER_INSTRUCTION);
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
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterLbl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitLbl(this);
		}
	}

	public final LblContext lbl() throws RecognitionException {
		LblContext _localctx = new LblContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lbl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			label();
			setState(67);
			match(T__0);
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

	public static class ArgumentlistContext extends ParserRuleContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentlistContext argumentlist() {
			return getRuleContext(ArgumentlistContext.class,0);
		}
		public ArgumentlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterArgumentlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitArgumentlist(this);
		}
	}

	public final ArgumentlistContext argumentlist() throws RecognitionException {
		ArgumentlistContext _localctx = new ArgumentlistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argumentlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			argument();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(70);
				match(T__1);
				setState(71);
				argumentlist();
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
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
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

	public static class ArgumentContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argument);
		int _la;
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__7:
			case NAME:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(76);
					prefix();
					}
				}

				setState(83);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(79);
					number();
					}
					break;
				case NAME:
					{
					setState(80);
					name();
					}
					break;
				case STRING:
					{
					setState(81);
					string();
					}
					break;
				case T__2:
					{
					setState(82);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3 || _la==T__4) {
					{
					setState(85);
					_la = _input.LA(1);
					if ( !(_la==T__3 || _la==T__4) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(86);
					number();
					}
				}

				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(T__5);
				setState(90);
				argument();
				setState(91);
				match(T__6);
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

	public static class PrefixContext extends ParserRuleContext {
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitPrefix(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__7);
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
		public TerminalNode STRING() { return getToken(asm6502Parser.STRING, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
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
		public TerminalNode NAME() { return getToken(asm6502Parser.NAME, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
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
		public TerminalNode NUMBER() { return getToken(asm6502Parser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(asm6502Parser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
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

	public static class OpcodeContext extends ParserRuleContext {
		public TerminalNode ADC() { return getToken(asm6502Parser.ADC, 0); }
		public TerminalNode AND() { return getToken(asm6502Parser.AND, 0); }
		public TerminalNode ASL() { return getToken(asm6502Parser.ASL, 0); }
		public TerminalNode BCC() { return getToken(asm6502Parser.BCC, 0); }
		public TerminalNode BCS() { return getToken(asm6502Parser.BCS, 0); }
		public TerminalNode BEQ() { return getToken(asm6502Parser.BEQ, 0); }
		public TerminalNode BIT() { return getToken(asm6502Parser.BIT, 0); }
		public TerminalNode BMI() { return getToken(asm6502Parser.BMI, 0); }
		public TerminalNode BNE() { return getToken(asm6502Parser.BNE, 0); }
		public TerminalNode BPL() { return getToken(asm6502Parser.BPL, 0); }
		public TerminalNode BRA() { return getToken(asm6502Parser.BRA, 0); }
		public TerminalNode BRK() { return getToken(asm6502Parser.BRK, 0); }
		public TerminalNode BVC() { return getToken(asm6502Parser.BVC, 0); }
		public TerminalNode BVS() { return getToken(asm6502Parser.BVS, 0); }
		public TerminalNode CLC() { return getToken(asm6502Parser.CLC, 0); }
		public TerminalNode CLD() { return getToken(asm6502Parser.CLD, 0); }
		public TerminalNode CLI() { return getToken(asm6502Parser.CLI, 0); }
		public TerminalNode CLV() { return getToken(asm6502Parser.CLV, 0); }
		public TerminalNode CMP() { return getToken(asm6502Parser.CMP, 0); }
		public TerminalNode CPX() { return getToken(asm6502Parser.CPX, 0); }
		public TerminalNode CPY() { return getToken(asm6502Parser.CPY, 0); }
		public TerminalNode DEC() { return getToken(asm6502Parser.DEC, 0); }
		public TerminalNode DEX() { return getToken(asm6502Parser.DEX, 0); }
		public TerminalNode DEY() { return getToken(asm6502Parser.DEY, 0); }
		public TerminalNode EOR() { return getToken(asm6502Parser.EOR, 0); }
		public TerminalNode INC() { return getToken(asm6502Parser.INC, 0); }
		public TerminalNode INX() { return getToken(asm6502Parser.INX, 0); }
		public TerminalNode INY() { return getToken(asm6502Parser.INY, 0); }
		public TerminalNode JMP() { return getToken(asm6502Parser.JMP, 0); }
		public TerminalNode JSR() { return getToken(asm6502Parser.JSR, 0); }
		public TerminalNode LDA() { return getToken(asm6502Parser.LDA, 0); }
		public TerminalNode LDY() { return getToken(asm6502Parser.LDY, 0); }
		public TerminalNode LDX() { return getToken(asm6502Parser.LDX, 0); }
		public TerminalNode LSR() { return getToken(asm6502Parser.LSR, 0); }
		public TerminalNode NOP() { return getToken(asm6502Parser.NOP, 0); }
		public TerminalNode ORA() { return getToken(asm6502Parser.ORA, 0); }
		public TerminalNode PHA() { return getToken(asm6502Parser.PHA, 0); }
		public TerminalNode PHX() { return getToken(asm6502Parser.PHX, 0); }
		public TerminalNode PHY() { return getToken(asm6502Parser.PHY, 0); }
		public TerminalNode PHP() { return getToken(asm6502Parser.PHP, 0); }
		public TerminalNode PLA() { return getToken(asm6502Parser.PLA, 0); }
		public TerminalNode PLP() { return getToken(asm6502Parser.PLP, 0); }
		public TerminalNode PLY() { return getToken(asm6502Parser.PLY, 0); }
		public TerminalNode ROL() { return getToken(asm6502Parser.ROL, 0); }
		public TerminalNode ROR() { return getToken(asm6502Parser.ROR, 0); }
		public TerminalNode RTI() { return getToken(asm6502Parser.RTI, 0); }
		public TerminalNode RTS() { return getToken(asm6502Parser.RTS, 0); }
		public TerminalNode SBC() { return getToken(asm6502Parser.SBC, 0); }
		public TerminalNode SEC() { return getToken(asm6502Parser.SEC, 0); }
		public TerminalNode SED() { return getToken(asm6502Parser.SED, 0); }
		public TerminalNode SEI() { return getToken(asm6502Parser.SEI, 0); }
		public TerminalNode STA() { return getToken(asm6502Parser.STA, 0); }
		public TerminalNode STX() { return getToken(asm6502Parser.STX, 0); }
		public TerminalNode STY() { return getToken(asm6502Parser.STY, 0); }
		public TerminalNode STZ() { return getToken(asm6502Parser.STZ, 0); }
		public TerminalNode TAX() { return getToken(asm6502Parser.TAX, 0); }
		public TerminalNode TAY() { return getToken(asm6502Parser.TAY, 0); }
		public TerminalNode TSX() { return getToken(asm6502Parser.TSX, 0); }
		public TerminalNode TXA() { return getToken(asm6502Parser.TXA, 0); }
		public TerminalNode TXS() { return getToken(asm6502Parser.TXS, 0); }
		public TerminalNode TYA() { return getToken(asm6502Parser.TYA, 0); }
		public OpcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).enterOpcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asm6502Listener ) ((asm6502Listener)listener).exitOpcode(this);
		}
	}

	public final OpcodeContext opcode() throws RecognitionException {
		OpcodeContext _localctx = new OpcodeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_opcode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !(((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (ADC - 10)) | (1L << (AND - 10)) | (1L << (ASL - 10)) | (1L << (BCC - 10)) | (1L << (BCS - 10)) | (1L << (BEQ - 10)) | (1L << (BIT - 10)) | (1L << (BMI - 10)) | (1L << (BNE - 10)) | (1L << (BPL - 10)) | (1L << (BRA - 10)) | (1L << (BRK - 10)) | (1L << (BVC - 10)) | (1L << (BVS - 10)) | (1L << (CLC - 10)) | (1L << (CLD - 10)) | (1L << (CLI - 10)) | (1L << (CLV - 10)) | (1L << (CMP - 10)) | (1L << (CPX - 10)) | (1L << (CPY - 10)) | (1L << (DEC - 10)) | (1L << (DEX - 10)) | (1L << (DEY - 10)) | (1L << (EOR - 10)) | (1L << (INC - 10)) | (1L << (INX - 10)) | (1L << (INY - 10)) | (1L << (JMP - 10)) | (1L << (JSR - 10)) | (1L << (LDA - 10)) | (1L << (LDY - 10)) | (1L << (LDX - 10)) | (1L << (LSR - 10)) | (1L << (NOP - 10)) | (1L << (ORA - 10)) | (1L << (PHA - 10)) | (1L << (PHX - 10)) | (1L << (PHY - 10)) | (1L << (PHP - 10)) | (1L << (PLA - 10)) | (1L << (PLP - 10)) | (1L << (PLY - 10)) | (1L << (ROL - 10)) | (1L << (ROR - 10)) | (1L << (RTI - 10)) | (1L << (RTS - 10)) | (1L << (SBC - 10)) | (1L << (SEC - 10)) | (1L << (SED - 10)) | (1L << (SEI - 10)) | (1L << (STA - 10)) | (1L << (STX - 10)) | (1L << (STY - 10)) | (1L << (STZ - 10)) | (1L << (TAX - 10)) | (1L << (TAY - 10)) | (1L << (TSX - 10)) | (1L << (TXA - 10)) | (1L << (TXS - 10)) | (1L << (TYA - 10)))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Nn\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\5\2\"\n\2\3\2\6\2%\n\2"+
		"\r\2\16\2&\3\3\3\3\3\3\3\3\5\3-\n\3\3\4\5\4\60\n\4\3\4\3\4\5\4\64\n\4"+
		"\3\4\5\4\67\n\4\3\5\5\5:\n\5\3\5\3\5\5\5>\n\5\3\5\5\5A\n\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\5\bK\n\b\3\t\3\t\3\n\5\nP\n\n\3\n\3\n\3\n\3\n\5\n"+
		"V\n\n\3\n\3\n\5\nZ\n\n\3\n\3\n\3\n\3\n\5\n`\n\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36\2\4\3\2\6\7\3\2\fH\2p\2$\3\2\2\2\4,\3\2\2\2\6/\3\2\2\2"+
		"\b9\3\2\2\2\nB\3\2\2\2\fD\3\2\2\2\16G\3\2\2\2\20L\3\2\2\2\22_\3\2\2\2"+
		"\24a\3\2\2\2\26c\3\2\2\2\30e\3\2\2\2\32g\3\2\2\2\34i\3\2\2\2\36k\3\2\2"+
		"\2 \"\5\4\3\2! \3\2\2\2!\"\3\2\2\2\"#\3\2\2\2#%\7M\2\2$!\3\2\2\2%&\3\2"+
		"\2\2&$\3\2\2\2&\'\3\2\2\2\'\3\3\2\2\2(-\5\34\17\2)-\5\6\4\2*-\5\b\5\2"+
		"+-\5\f\7\2,(\3\2\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\5\3\2\2\2.\60\5\20"+
		"\t\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\63\5\36\20\2\62\64\5\16\b"+
		"\2\63\62\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\67\5\34\17\2\66\65\3\2"+
		"\2\2\66\67\3\2\2\2\67\7\3\2\2\28:\5\22\n\298\3\2\2\29:\3\2\2\2:;\3\2\2"+
		"\2;=\5\n\6\2<>\5\16\b\2=<\3\2\2\2=>\3\2\2\2>@\3\2\2\2?A\5\34\17\2@?\3"+
		"\2\2\2@A\3\2\2\2A\t\3\2\2\2BC\7\13\2\2C\13\3\2\2\2DE\5\20\t\2EF\7\3\2"+
		"\2F\r\3\2\2\2GJ\5\22\n\2HI\7\4\2\2IK\5\16\b\2JH\3\2\2\2JK\3\2\2\2K\17"+
		"\3\2\2\2LM\5\30\r\2M\21\3\2\2\2NP\5\24\13\2ON\3\2\2\2OP\3\2\2\2PU\3\2"+
		"\2\2QV\5\32\16\2RV\5\30\r\2SV\5\26\f\2TV\7\5\2\2UQ\3\2\2\2UR\3\2\2\2U"+
		"S\3\2\2\2UT\3\2\2\2VY\3\2\2\2WX\t\2\2\2XZ\5\32\16\2YW\3\2\2\2YZ\3\2\2"+
		"\2Z`\3\2\2\2[\\\7\b\2\2\\]\5\22\n\2]^\7\t\2\2^`\3\2\2\2_O\3\2\2\2_[\3"+
		"\2\2\2`\23\3\2\2\2ab\7\n\2\2b\25\3\2\2\2cd\7L\2\2d\27\3\2\2\2ef\7I\2\2"+
		"f\31\3\2\2\2gh\7J\2\2h\33\3\2\2\2ij\7K\2\2j\35\3\2\2\2kl\t\3\2\2l\37\3"+
		"\2\2\2\20!&,/\63\669=@JOUY_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}