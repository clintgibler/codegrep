// Generated from robotwars/robotwar.g4 by ANTLR 4.7.1
package parsers.robotwars;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class robotwarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, A=14, B=15, C=16, D=17, E=18, F=19, 
		G=20, H=21, I=22, J=23, K=24, L=25, M=26, N=27, O=28, P=29, Q=30, R=31, 
		S=32, T=33, U=34, V=35, W=36, X=37, Y=38, Z=39, AIM=40, SHOT=41, RADAR=42, 
		DAMAGE=43, SPEEDX=44, SPEEDY=45, RANDOM=46, INDEX=47, DATA=48, DOT=49, 
		COMMA=50, ID=51, NUMBER=52, COMMENT=53, EOL=54, WS=55;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_label = 2, RULE_statement = 3, RULE_accumstatement = 4, 
		RULE_accumexpression = 5, RULE_gosubstatement = 6, RULE_gotostatement = 7, 
		RULE_tostatement = 8, RULE_endsubstatement = 9, RULE_ifstatement = 10, 
		RULE_condition = 11, RULE_expression = 12, RULE_operation = 13, RULE_comparison = 14, 
		RULE_argument = 15, RULE_register = 16, RULE_number = 17, RULE_comment = 18;
	public static final String[] ruleNames = {
		"program", "line", "label", "statement", "accumstatement", "accumexpression", 
		"gosubstatement", "gotostatement", "tostatement", "endsubstatement", "ifstatement", 
		"condition", "expression", "operation", "comparison", "argument", "register", 
		"number", "comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'#'", "'<'", "'>'", "'GOSUB'", "'GOTO'", "'TO'", "'ENDSUB'", 
		"'IF'", "'+'", "'-'", "'*'", "'/'", "'A'", "'B'", "'C'", "'D'", "'E'", 
		"'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", 
		"'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", 
		"'Z'", "'AIM'", "'SHOT'", "'RADAR'", "'DAMAGE'", "'SPEEDX'", "'SPEEDY'", 
		"'RANDOM'", "'INDEX'", "'DATA'", "'.'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
		"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
		"AIM", "SHOT", "RADAR", "DAMAGE", "SPEEDX", "SPEEDY", "RANDOM", "INDEX", 
		"DATA", "DOT", "COMMA", "ID", "NUMBER", "COMMENT", "EOL", "WS"
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
	public String getGrammarFileName() { return "robotwar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public robotwarParser(TokenStream input) {
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
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38);
				line();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << AIM) | (1L << SHOT) | (1L << RADAR) | (1L << DAMAGE) | (1L << SPEEDX) | (1L << SPEEDY) | (1L << RANDOM) | (1L << INDEX) | (1L << DATA) | (1L << ID) | (1L << NUMBER) | (1L << COMMENT) | (1L << EOL))) != 0) );
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
		public TerminalNode EOL() { return getToken(robotwarParser.EOL, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(43);
				label();
				}
				break;
			case COMMENT:
				{
				setState(44);
				comment();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case A:
			case B:
			case C:
			case D:
			case E:
			case F:
			case G:
			case H:
			case I:
			case J:
			case K:
			case L:
			case M:
			case N:
			case O:
			case P:
			case Q:
			case R:
			case S:
			case T:
			case U:
			case V:
			case W:
			case X:
			case Y:
			case Z:
			case AIM:
			case SHOT:
			case RADAR:
			case DAMAGE:
			case SPEEDX:
			case SPEEDY:
			case RANDOM:
			case INDEX:
			case DATA:
			case NUMBER:
				{
				setState(45);
				statement();
				}
				break;
			case EOL:
				break;
			default:
				break;
			}
			setState(48);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(robotwarParser.ID, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(ID);
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
		public IfstatementContext ifstatement() {
			return getRuleContext(IfstatementContext.class,0);
		}
		public TostatementContext tostatement() {
			return getRuleContext(TostatementContext.class,0);
		}
		public GosubstatementContext gosubstatement() {
			return getRuleContext(GosubstatementContext.class,0);
		}
		public GotostatementContext gotostatement() {
			return getRuleContext(GotostatementContext.class,0);
		}
		public EndsubstatementContext endsubstatement() {
			return getRuleContext(EndsubstatementContext.class,0);
		}
		public AccumstatementContext accumstatement() {
			return getRuleContext(AccumstatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				ifstatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				tostatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				gosubstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				gotostatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				endsubstatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(57);
				accumstatement();
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

	public static class AccumstatementContext extends ParserRuleContext {
		public AccumexpressionContext accumexpression() {
			return getRuleContext(AccumexpressionContext.class,0);
		}
		public AccumstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accumstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).enterAccumstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).exitAccumstatement(this);
		}
	}

	public final AccumstatementContext accumstatement() throws RecognitionException {
		AccumstatementContext _localctx = new AccumstatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_accumstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			accumexpression();
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

	public static class AccumexpressionContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AccumexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accumexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).enterAccumexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).exitAccumexpression(this);
		}
	}

	public final AccumexpressionContext accumexpression() throws RecognitionException {
		AccumexpressionContext _localctx = new AccumexpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_accumexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(62);
				match(T__0);
				}
				break;
			case T__1:
				{
				setState(63);
				match(T__1);
				}
				break;
			case T__2:
				{
				{
				setState(64);
				match(T__2);
				setState(65);
				expression();
				}
				}
				break;
			case T__3:
				{
				{
				setState(66);
				match(T__3);
				setState(67);
				expression();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(70);
			statement();
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

	public static class GosubstatementContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public GosubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gosubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).enterGosubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).exitGosubstatement(this);
		}
	}

	public final GosubstatementContext gosubstatement() throws RecognitionException {
		GosubstatementContext _localctx = new GosubstatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_gosubstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__4);
			setState(73);
			label();
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

	public static class GotostatementContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public GotostatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotostatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).enterGotostatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).exitGotostatement(this);
		}
	}

	public final GotostatementContext gotostatement() throws RecognitionException {
		GotostatementContext _localctx = new GotostatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_gotostatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__5);
			setState(76);
			label();
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

	public static class TostatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public TostatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tostatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).enterTostatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).exitTostatement(this);
		}
	}

	public final TostatementContext tostatement() throws RecognitionException {
		TostatementContext _localctx = new TostatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tostatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << AIM) | (1L << SHOT) | (1L << RADAR) | (1L << DAMAGE) | (1L << SPEEDX) | (1L << SPEEDY) | (1L << RANDOM) | (1L << INDEX) | (1L << DATA) | (1L << NUMBER))) != 0)) {
				{
				setState(78);
				expression();
				}
			}

			setState(83); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				match(T__6);
				setState(82);
				register();
				}
				}
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
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

	public static class EndsubstatementContext extends ParserRuleContext {
		public EndsubstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endsubstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).enterEndsubstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).exitEndsubstatement(this);
		}
	}

	public final EndsubstatementContext endsubstatement() throws RecognitionException {
		EndsubstatementContext _localctx = new EndsubstatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_endsubstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
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

	public static class IfstatementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOL() { return getToken(robotwarParser.EOL, 0); }
		public TerminalNode COMMA() { return getToken(robotwarParser.COMMA, 0); }
		public TerminalNode DOT() { return getToken(robotwarParser.DOT, 0); }
		public IfstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).enterIfstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).exitIfstatement(this);
		}
	}

	public final IfstatementContext ifstatement() throws RecognitionException {
		IfstatementContext _localctx = new IfstatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ifstatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(89);
				match(T__8);
				}
			}

			setState(92);
			condition();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << COMMA) | (1L << EOL))) != 0)) {
				{
				setState(93);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOT) | (1L << COMMA) | (1L << EOL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(96);
			statement();
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

	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			expression();
			setState(99);
			comparison();
			setState(100);
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
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression);
		try {
			int _alt;
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(102);
				argument();
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(103);
						operation();
						setState(104);
						argument();
						}
						} 
					}
					setState(110);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(111);
				operation();
				setState(112);
				argument();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				argument();
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

	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
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

	public static class ComparisonContext extends ParserRuleContext {
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
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

	public static class ArgumentContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public TerminalNode DATA() { return getToken(robotwarParser.DATA, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argument);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				register();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(DATA);
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

	public static class RegisterContext extends ParserRuleContext {
		public TerminalNode A() { return getToken(robotwarParser.A, 0); }
		public TerminalNode B() { return getToken(robotwarParser.B, 0); }
		public TerminalNode C() { return getToken(robotwarParser.C, 0); }
		public TerminalNode D() { return getToken(robotwarParser.D, 0); }
		public TerminalNode E() { return getToken(robotwarParser.E, 0); }
		public TerminalNode F() { return getToken(robotwarParser.F, 0); }
		public TerminalNode G() { return getToken(robotwarParser.G, 0); }
		public TerminalNode H() { return getToken(robotwarParser.H, 0); }
		public TerminalNode I() { return getToken(robotwarParser.I, 0); }
		public TerminalNode J() { return getToken(robotwarParser.J, 0); }
		public TerminalNode K() { return getToken(robotwarParser.K, 0); }
		public TerminalNode L() { return getToken(robotwarParser.L, 0); }
		public TerminalNode M() { return getToken(robotwarParser.M, 0); }
		public TerminalNode N() { return getToken(robotwarParser.N, 0); }
		public TerminalNode O() { return getToken(robotwarParser.O, 0); }
		public TerminalNode P() { return getToken(robotwarParser.P, 0); }
		public TerminalNode Q() { return getToken(robotwarParser.Q, 0); }
		public TerminalNode R() { return getToken(robotwarParser.R, 0); }
		public TerminalNode S() { return getToken(robotwarParser.S, 0); }
		public TerminalNode T() { return getToken(robotwarParser.T, 0); }
		public TerminalNode U() { return getToken(robotwarParser.U, 0); }
		public TerminalNode V() { return getToken(robotwarParser.V, 0); }
		public TerminalNode W() { return getToken(robotwarParser.W, 0); }
		public TerminalNode X() { return getToken(robotwarParser.X, 0); }
		public TerminalNode Y() { return getToken(robotwarParser.Y, 0); }
		public TerminalNode Z() { return getToken(robotwarParser.Z, 0); }
		public TerminalNode AIM() { return getToken(robotwarParser.AIM, 0); }
		public TerminalNode SHOT() { return getToken(robotwarParser.SHOT, 0); }
		public TerminalNode RADAR() { return getToken(robotwarParser.RADAR, 0); }
		public TerminalNode SPEEDX() { return getToken(robotwarParser.SPEEDX, 0); }
		public TerminalNode SPEEDY() { return getToken(robotwarParser.SPEEDY, 0); }
		public TerminalNode RANDOM() { return getToken(robotwarParser.RANDOM, 0); }
		public TerminalNode INDEX() { return getToken(robotwarParser.INDEX, 0); }
		public TerminalNode DATA() { return getToken(robotwarParser.DATA, 0); }
		public TerminalNode DAMAGE() { return getToken(robotwarParser.DAMAGE, 0); }
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).enterRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).exitRegister(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_register);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << AIM) | (1L << SHOT) | (1L << RADAR) | (1L << DAMAGE) | (1L << SPEEDX) | (1L << SPEEDY) | (1L << RANDOM) | (1L << INDEX) | (1L << DATA))) != 0)) ) {
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
		public TerminalNode NUMBER() { return getToken(robotwarParser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9 || _la==T__10) {
				{
				setState(128);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(131);
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
		public TerminalNode COMMENT() { return getToken(robotwarParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof robotwarListener ) ((robotwarListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u008a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\6\2*\n\2\r\2\16\2+\3\3\3\3\3\3\5\3\61\n\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7G\n\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\5\nR\n\n\3\n\3\n"+
		"\6\nV\n\n\r\n\16\nW\3\13\3\13\3\f\5\f]\n\f\3\f\3\f\5\fa\n\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\7\16m\n\16\f\16\16\16p\13\16\3\16\3"+
		"\16\3\16\3\16\5\16v\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\5\21\177\n"+
		"\21\3\22\3\22\3\23\5\23\u0084\n\23\3\23\3\23\3\24\3\24\3\24\2\2\25\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\7\4\2\63\6488\3\2\f\17\3\2"+
		"\3\6\3\2\20\62\3\2\f\r\2\u008c\2)\3\2\2\2\4\60\3\2\2\2\6\64\3\2\2\2\b"+
		"<\3\2\2\2\n>\3\2\2\2\fF\3\2\2\2\16J\3\2\2\2\20M\3\2\2\2\22Q\3\2\2\2\24"+
		"Y\3\2\2\2\26\\\3\2\2\2\30d\3\2\2\2\32u\3\2\2\2\34w\3\2\2\2\36y\3\2\2\2"+
		" ~\3\2\2\2\"\u0080\3\2\2\2$\u0083\3\2\2\2&\u0087\3\2\2\2(*\5\4\3\2)(\3"+
		"\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-\61\5\6\4\2.\61\5&\24"+
		"\2/\61\5\b\5\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\60\61\3\2\2\2\61\62"+
		"\3\2\2\2\62\63\78\2\2\63\5\3\2\2\2\64\65\7\65\2\2\65\7\3\2\2\2\66=\5\26"+
		"\f\2\67=\5\22\n\28=\5\16\b\29=\5\20\t\2:=\5\24\13\2;=\5\n\6\2<\66\3\2"+
		"\2\2<\67\3\2\2\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\t\3\2\2\2>?"+
		"\5\f\7\2?\13\3\2\2\2@G\7\3\2\2AG\7\4\2\2BC\7\5\2\2CG\5\32\16\2DE\7\6\2"+
		"\2EG\5\32\16\2F@\3\2\2\2FA\3\2\2\2FB\3\2\2\2FD\3\2\2\2GH\3\2\2\2HI\5\b"+
		"\5\2I\r\3\2\2\2JK\7\7\2\2KL\5\6\4\2L\17\3\2\2\2MN\7\b\2\2NO\5\6\4\2O\21"+
		"\3\2\2\2PR\5\32\16\2QP\3\2\2\2QR\3\2\2\2RU\3\2\2\2ST\7\t\2\2TV\5\"\22"+
		"\2US\3\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\23\3\2\2\2YZ\7\n\2\2Z\25\3"+
		"\2\2\2[]\7\13\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^`\5\30\r\2_a\t\2\2\2"+
		"`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\5\b\5\2c\27\3\2\2\2de\5\32\16\2ef\5\36"+
		"\20\2fg\5\32\16\2g\31\3\2\2\2hn\5 \21\2ij\5\34\17\2jk\5 \21\2km\3\2\2"+
		"\2li\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2ov\3\2\2\2pn\3\2\2\2qr\5\34"+
		"\17\2rs\5 \21\2sv\3\2\2\2tv\5 \21\2uh\3\2\2\2uq\3\2\2\2ut\3\2\2\2v\33"+
		"\3\2\2\2wx\t\3\2\2x\35\3\2\2\2yz\t\4\2\2z\37\3\2\2\2{\177\5$\23\2|\177"+
		"\5\"\22\2}\177\7\62\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177!\3\2\2\2\u0080"+
		"\u0081\t\5\2\2\u0081#\3\2\2\2\u0082\u0084\t\6\2\2\u0083\u0082\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\7\66\2\2\u0086%\3"+
		"\2\2\2\u0087\u0088\7\67\2\2\u0088\'\3\2\2\2\16+\60<FQW\\`nu~\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}