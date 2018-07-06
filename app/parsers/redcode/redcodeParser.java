// Generated from redcode/redcode.g4 by ANTLR 4.7.1
package parsers.redcode;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class redcodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		A=10, B=11, AB=12, BA=13, F=14, X=15, I=16, DAT=17, MOV=18, ADD=19, SUB=20, 
		MUL=21, DIV=22, MOD=23, JMP=24, JMZ=25, JMN=26, DJN=27, CMP=28, SLT=29, 
		DJZ=30, SPL=31, ORG=32, NUMBER=33, COMMENT=34, EOL=35, WS=36;
	public static final int
		RULE_file = 0, RULE_line = 1, RULE_instruction = 2, RULE_opcode = 3, RULE_modifier = 4, 
		RULE_mmode = 5, RULE_number = 6, RULE_comment = 7;
	public static final String[] ruleNames = {
		"file", "line", "instruction", "opcode", "modifier", "mmode", "number", 
		"comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "','", "'#'", "'$'", "'@'", "'<'", "'>'", "'+'", "'-'", "'A'", 
		"'B'", "'AB'", "'BA'", "'F'", "'X'", "'I'", "'DAT'", "'MOV'", "'ADD'", 
		"'SUB'", "'MUL'", "'DIV'", "'MOD'", "'JMP'", "'JMZ'", "'JMN'", "'DJN'", 
		"'CMP'", "'SLT'", "'DJZ'", "'SPL'", "'ORG'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "A", "B", 
		"AB", "BA", "F", "X", "I", "DAT", "MOV", "ADD", "SUB", "MUL", "DIV", "MOD", 
		"JMP", "JMZ", "JMN", "DJN", "CMP", "SLT", "DJZ", "SPL", "ORG", "NUMBER", 
		"COMMENT", "EOL", "WS"
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
	public String getGrammarFileName() { return "redcode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public redcodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FileContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof redcodeListener ) ((redcodeListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof redcodeListener ) ((redcodeListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				line();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DAT) | (1L << MOV) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << JMP) | (1L << JMZ) | (1L << JMN) | (1L << DJN) | (1L << CMP) | (1L << SLT) | (1L << DJZ) | (1L << SPL) | (1L << ORG) | (1L << COMMENT))) != 0) );
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
		public TerminalNode EOL() { return getToken(redcodeParser.EOL, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof redcodeListener ) ((redcodeListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof redcodeListener ) ((redcodeListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
				{
				setState(21);
				comment();
				}
				break;
			case DAT:
			case MOV:
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case MOD:
			case JMP:
			case JMZ:
			case JMN:
			case DJN:
			case CMP:
			case SLT:
			case DJZ:
			case SPL:
			case ORG:
				{
				setState(22);
				instruction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(25);
			match(EOL);
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public ModifierContext modifier() {
			return getRuleContext(ModifierContext.class,0);
		}
		public List<MmodeContext> mmode() {
			return getRuleContexts(MmodeContext.class);
		}
		public MmodeContext mmode(int i) {
			return getRuleContext(MmodeContext.class,i);
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
			if ( listener instanceof redcodeListener ) ((redcodeListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof redcodeListener ) ((redcodeListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_instruction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			opcode();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(28);
				match(T__0);
				setState(29);
				modifier();
				}
			}

			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) {
				{
				setState(32);
				mmode();
				}
			}

			setState(35);
			number();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(36);
				match(T__1);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) {
					{
					setState(37);
					mmode();
					}
				}

				setState(40);
				number();
				}
			}

			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(43);
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

	public static class OpcodeContext extends ParserRuleContext {
		public TerminalNode DAT() { return getToken(redcodeParser.DAT, 0); }
		public TerminalNode MOV() { return getToken(redcodeParser.MOV, 0); }
		public TerminalNode ADD() { return getToken(redcodeParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(redcodeParser.SUB, 0); }
		public TerminalNode MUL() { return getToken(redcodeParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(redcodeParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(redcodeParser.MOD, 0); }
		public TerminalNode JMP() { return getToken(redcodeParser.JMP, 0); }
		public TerminalNode JMZ() { return getToken(redcodeParser.JMZ, 0); }
		public TerminalNode JMN() { return getToken(redcodeParser.JMN, 0); }
		public TerminalNode DJN() { return getToken(redcodeParser.DJN, 0); }
		public TerminalNode CMP() { return getToken(redcodeParser.CMP, 0); }
		public TerminalNode SLT() { return getToken(redcodeParser.SLT, 0); }
		public TerminalNode SPL() { return getToken(redcodeParser.SPL, 0); }
		public TerminalNode ORG() { return getToken(redcodeParser.ORG, 0); }
		public TerminalNode DJZ() { return getToken(redcodeParser.DJZ, 0); }
		public OpcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof redcodeListener ) ((redcodeListener)listener).enterOpcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof redcodeListener ) ((redcodeListener)listener).exitOpcode(this);
		}
	}

	public final OpcodeContext opcode() throws RecognitionException {
		OpcodeContext _localctx = new OpcodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_opcode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DAT) | (1L << MOV) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << JMP) | (1L << JMZ) | (1L << JMN) | (1L << DJN) | (1L << CMP) | (1L << SLT) | (1L << DJZ) | (1L << SPL) | (1L << ORG))) != 0)) ) {
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

	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode A() { return getToken(redcodeParser.A, 0); }
		public TerminalNode B() { return getToken(redcodeParser.B, 0); }
		public TerminalNode AB() { return getToken(redcodeParser.AB, 0); }
		public TerminalNode BA() { return getToken(redcodeParser.BA, 0); }
		public TerminalNode F() { return getToken(redcodeParser.F, 0); }
		public TerminalNode X() { return getToken(redcodeParser.X, 0); }
		public TerminalNode I() { return getToken(redcodeParser.I, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof redcodeListener ) ((redcodeListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof redcodeListener ) ((redcodeListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << B) | (1L << AB) | (1L << BA) | (1L << F) | (1L << X) | (1L << I))) != 0)) ) {
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

	public static class MmodeContext extends ParserRuleContext {
		public MmodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mmode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof redcodeListener ) ((redcodeListener)listener).enterMmode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof redcodeListener ) ((redcodeListener)listener).exitMmode(this);
		}
	}

	public final MmodeContext mmode() throws RecognitionException {
		MmodeContext _localctx = new MmodeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mmode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
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
		public TerminalNode NUMBER() { return getToken(redcodeParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof redcodeListener ) ((redcodeListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof redcodeListener ) ((redcodeListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7 || _la==T__8) {
				{
				setState(52);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(55);
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
		public TerminalNode COMMENT() { return getToken(redcodeParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof redcodeListener ) ((redcodeListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof redcodeListener ) ((redcodeListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&>\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n\2\r\2\16"+
		"\2\25\3\3\3\3\5\3\32\n\3\3\3\3\3\3\4\3\4\3\4\5\4!\n\4\3\4\5\4$\n\4\3\4"+
		"\3\4\3\4\5\4)\n\4\3\4\5\4,\n\4\3\4\5\4/\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\5\b8\n\b\3\b\3\b\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\6\3\2\23\"\3"+
		"\2\f\22\3\2\5\t\3\2\n\13\2=\2\23\3\2\2\2\4\31\3\2\2\2\6\35\3\2\2\2\b\60"+
		"\3\2\2\2\n\62\3\2\2\2\f\64\3\2\2\2\16\67\3\2\2\2\20;\3\2\2\2\22\24\5\4"+
		"\3\2\23\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2"+
		"\2\2\27\32\5\20\t\2\30\32\5\6\4\2\31\27\3\2\2\2\31\30\3\2\2\2\32\33\3"+
		"\2\2\2\33\34\7%\2\2\34\5\3\2\2\2\35 \5\b\5\2\36\37\7\3\2\2\37!\5\n\6\2"+
		" \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\"$\5\f\7\2#\"\3\2\2\2#$\3\2\2\2$%\3\2"+
		"\2\2%+\5\16\b\2&(\7\4\2\2\')\5\f\7\2(\'\3\2\2\2()\3\2\2\2)*\3\2\2\2*,"+
		"\5\16\b\2+&\3\2\2\2+,\3\2\2\2,.\3\2\2\2-/\5\20\t\2.-\3\2\2\2./\3\2\2\2"+
		"/\7\3\2\2\2\60\61\t\2\2\2\61\t\3\2\2\2\62\63\t\3\2\2\63\13\3\2\2\2\64"+
		"\65\t\4\2\2\65\r\3\2\2\2\668\t\5\2\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2"+
		"\29:\7#\2\2:\17\3\2\2\2;<\7$\2\2<\21\3\2\2\2\n\25\31 #(+.\67";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}