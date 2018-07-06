// Generated from agc/agc.g4 by ANTLR 4.7.1
package parsers.agc;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class agcParser extends Parser {
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		T__131=132, T__132=133, T__133=134, T__134=135, T__135=136, T__136=137, 
		T__137=138, T__138=139, T__139=140, T__140=141, T__141=142, T__142=143, 
		T__143=144, T__144=145, T__145=146, T__146=147, T__147=148, T__148=149, 
		T__149=150, T__150=151, T__151=152, T__152=153, T__153=154, T__154=155, 
		T__155=156, T__156=157, T__157=158, T__158=159, T__159=160, T__160=161, 
		T__161=162, T__162=163, T__163=164, T__164=165, T__165=166, T__166=167, 
		T__167=168, T__168=169, T__169=170, T__170=171, T__171=172, T__172=173, 
		T__173=174, T__174=175, T__175=176, T__176=177, T__177=178, T__178=179, 
		T__179=180, T__180=181, T__181=182, T__182=183, LABEL=184, INTE=185, DECIMAL=186, 
		COMMENT=187, PLUS=188, MINUS=189, TIMES=190, DIV=191, COMMA=192, LPAREN=193, 
		RPAREN=194, EOL=195, WS=196;
	public static final int
		RULE_prog = 0, RULE_line = 1, RULE_blank_line = 2, RULE_comment_line = 3, 
		RULE_instruction_line = 4, RULE_erase_line = 5, RULE_assignment_line = 6, 
		RULE_opcodes = 7, RULE_argument = 8, RULE_ws = 9, RULE_eol = 10, RULE_comment = 11, 
		RULE_label = 12, RULE_variable = 13, RULE_expression = 14, RULE_multiplyingExpression = 15, 
		RULE_atom = 16, RULE_inte = 17, RULE_decimal = 18, RULE_register = 19, 
		RULE_opcode = 20, RULE_axt_opcode = 21, RULE_pseudo_opcode = 22, RULE_standard_opcode = 23;
	public static final String[] ruleNames = {
		"prog", "line", "blank_line", "comment_line", "instruction_line", "erase_line", 
		"assignment_line", "opcodes", "argument", "ws", "eol", "comment", "label", 
		"variable", "expression", "multiplyingExpression", "atom", "inte", "decimal", 
		"register", "opcode", "axt_opcode", "pseudo_opcode", "standard_opcode"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ERASE'", "'='", "'EQUALS'", "'A'", "'L'", "'Q'", "'EB'", "'FB'", 
		"'Z'", "'BB'", "'ARUPT'", "'LRUPT'", "'QRUPT'", "'BBRUPT'", "'BRUPT'", 
		"'CYR'", "'SR'", "'CYL'", "'EDOP'", "'TIME2'", "'TIME1'", "'TIME3'", "'TIME4'", 
		"'TIME5'", "'TIME6'", "'CDUX'", "'CDUY'", "'CDUZ'", "'OPTY'", "'OPTX'", 
		"'PIPAX'", "'PIPAY'", "'PIPAZ'", "'Q-RHCCTR'", "'RHCP'", "'P-RHCCTR'", 
		"'RHCY'", "'R-RHCCTR'", "'RHCR'", "'INLINK'", "'RNRAD'", "'GYROCTR'", 
		"'GYROCMD'", "'CDUXCMD'", "'CDUYCMD'", "'CDUZCMD'", "'OPTYCMD'", "'OPTXCMD'", 
		"'THRUST'", "'LEMONM'", "'OUTLINK'", "'ALTM'", "'AXT,1'", "'AXT,2'", "'1DNADR'", 
		"'2DNADR'", "'3DNADR'", "'4DNADR'", "'5DNADR'", "'6DNADR'", "'DNCHAN'", 
		"'DNPTR'", "'-1DNADR'", "'-2DNADR'", "'-3DNADR'", "'-4DNADR'", "'-5DNADR'", 
		"'-6DNADR'", "'-DNCHAN'", "'-DNPTR'", "'2DEC'", "'2DEC*'", "'2FCADR'", 
		"'BANK'", "'BLOCK'", "'BNKSUM'", "'COUNT'", "'COUNT*'", "'DEC'", "'OCT'", 
		"'SETLOC'", "'SUBRO'", "'TC'", "'TCR'", "'CCS'", "'TCF'", "'DAS'", "'LXCH'", 
		"'INCR'", "'AD'", "'ADS'", "'CA'", "'CS'", "'INDEX'", "'DXCH'", "'TS'", 
		"'XCH'", "'MASK'", "'MSK'", "'READ'", "'WRITE'", "'RAND'", "'WAND'", "'ROR'", 
		"'WOR'", "'RXOR'", "'EDRUPT'", "'BZF'", "'MSU'", "'QXCH'", "'AUG'", "'DIM'", 
		"'DCA'", "'DCS'", "'SU'", "'BZMF'", "'MP'", "'XXALQ'", "'XLQ'", "'RETURN'", 
		"'RELINT'", "'INHINT'", "'EXTEND'", "'NOOP'", "'DDOUBL'", "'DTCF'", "'COM'", 
		"'ZL'", "'RESUME'", "'DTCB'", "'OVSK'", "'TCAA'", "'DOUBLE'", "'ZQ'", 
		"'DCOM'", "'SQUARE'", "'PINC'", "'PCDU'", "'MINC'", "'MCDU'", "'DINC'", 
		"'SHINC'", "'SHANC'", "'INOTRD'", "'INOTLD'", "'FETCH'", "'STORE'", "'GOJ'", 
		"'TCSAJ'", "'CAF'", "'CAE'", "'CADR'", "'DMOVE'", "'VMOVE'", "'SMOVE'", 
		"'DSU'", "'RTB'", "'ITC'", "'NOLOD'", "'EXIT'", "'BPL'", "'SIN'", "'COS'", 
		"'CAD'", "'TEST'", "'VXSC'", "'DAD'", "'VXV'", "'VAD'", "'DMP'", "'BOV'", 
		"'UNIT'", "'OCTAL'", "'ADRES'", "'ABVAL'", "'COMP'", "'DV'", "'NDX'", 
		"'POUT'", "'MOUT'", "'ZOUT'", "'LODON'", "'TSLT'", null, null, null, null, 
		"'+'", "'-'", "'*'", "'/'", "','", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "LABEL", "INTE", "DECIMAL", "COMMENT", "PLUS", 
		"MINUS", "TIMES", "DIV", "COMMA", "LPAREN", "RPAREN", "EOL", "WS"
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
	public String getGrammarFileName() { return "agc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public agcParser(TokenStream input) {
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
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				line();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 184)) & ~0x3f) == 0 && ((1L << (_la - 184)) & ((1L << (LABEL - 184)) | (1L << (COMMENT - 184)) | (1L << (LPAREN - 184)) | (1L << (EOL - 184)) | (1L << (WS - 184)))) != 0) );
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
		public Comment_lineContext comment_line() {
			return getRuleContext(Comment_lineContext.class,0);
		}
		public Blank_lineContext blank_line() {
			return getRuleContext(Blank_lineContext.class,0);
		}
		public Instruction_lineContext instruction_line() {
			return getRuleContext(Instruction_lineContext.class,0);
		}
		public Erase_lineContext erase_line() {
			return getRuleContext(Erase_lineContext.class,0);
		}
		public Assignment_lineContext assignment_line() {
			return getRuleContext(Assignment_lineContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				comment_line();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				blank_line();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				instruction_line();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				erase_line();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				assignment_line();
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

	public static class Blank_lineContext extends ParserRuleContext {
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Blank_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blank_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterBlank_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitBlank_line(this);
		}
	}

	public final Blank_lineContext blank_line() throws RecognitionException {
		Blank_lineContext _localctx = new Blank_lineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_blank_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL) {
				{
				setState(60);
				label();
				}
			}

			setState(63);
			eol();
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

	public static class Comment_lineContext extends ParserRuleContext {
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public Comment_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterComment_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitComment_line(this);
		}
	}

	public final Comment_lineContext comment_line() throws RecognitionException {
		Comment_lineContext _localctx = new Comment_lineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comment_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(65);
				ws();
				}
			}

			setState(68);
			comment();
			setState(69);
			eol();
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

	public static class Instruction_lineContext extends ParserRuleContext {
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public OpcodesContext opcodes() {
			return getRuleContext(OpcodesContext.class,0);
		}
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public Comment_lineContext comment_line() {
			return getRuleContext(Comment_lineContext.class,0);
		}
		public Instruction_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterInstruction_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitInstruction_line(this);
		}
	}

	public final Instruction_lineContext instruction_line() throws RecognitionException {
		Instruction_lineContext _localctx = new Instruction_lineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instruction_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL) {
				{
				setState(71);
				label();
				}
			}

			setState(74);
			ws();
			setState(75);
			opcodes();
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(76);
				eol();
				setState(77);
				comment_line();
				}
				break;
			}
			setState(81);
			argument();
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					eol();
					setState(83);
					argument();
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(90);
			eol();
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

	public static class Erase_lineContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Erase_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_erase_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterErase_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitErase_line(this);
		}
	}

	public final Erase_lineContext erase_line() throws RecognitionException {
		Erase_lineContext _localctx = new Erase_lineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_erase_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LABEL || _la==LPAREN) {
				{
				setState(92);
				variable();
				}
			}

			setState(95);
			ws();
			setState(96);
			match(T__0);
			setState(103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(97);
						ws();
						}
					}

					setState(100);
					expression();
					}
					} 
				}
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(106);
				ws();
				setState(107);
				comment();
				}
				break;
			}
			setState(111);
			eol();
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

	public static class Assignment_lineContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public Assignment_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterAssignment_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitAssignment_line(this);
		}
	}

	public final Assignment_lineContext assignment_line() throws RecognitionException {
		Assignment_lineContext _localctx = new Assignment_lineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			variable();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(114);
				ws();
				}
			}

			setState(117);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WS) {
						{
						setState(118);
						ws();
						}
					}

					setState(121);
					expression();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(127);
				ws();
				setState(128);
				comment();
				}
				break;
			}
			setState(132);
			eol();
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

	public static class OpcodesContext extends ParserRuleContext {
		public List<OpcodeContext> opcode() {
			return getRuleContexts(OpcodeContext.class);
		}
		public OpcodeContext opcode(int i) {
			return getRuleContext(OpcodeContext.class,i);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public OpcodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterOpcodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitOpcodes(this);
		}
	}

	public final OpcodesContext opcodes() throws RecognitionException {
		OpcodesContext _localctx = new OpcodesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_opcodes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			opcode();
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(135);
				ws();
				setState(136);
				opcode();
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

	public static class ArgumentContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argument);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					ws();
					setState(141);
					expression();
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(148);
				ws();
				setState(149);
				comment();
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

	public static class WsContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(agcParser.WS, 0); }
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitWs(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ws);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(WS);
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

	public static class EolContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(agcParser.EOL, 0); }
		public TerminalNode WS() { return getToken(agcParser.WS, 0); }
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterEol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitEol(this);
		}
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_eol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(155);
				match(WS);
				}
			}

			setState(158);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(agcParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(agcParser.LABEL, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode LABEL() { return getToken(agcParser.LABEL, 0); }
		public TerminalNode LPAREN() { return getToken(agcParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(agcParser.RPAREN, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable);
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LABEL:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(LABEL);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(165);
				match(LPAREN);
				setState(166);
				match(LABEL);
				setState(167);
				match(RPAREN);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<MultiplyingExpressionContext> multiplyingExpression() {
			return getRuleContexts(MultiplyingExpressionContext.class);
		}
		public MultiplyingExpressionContext multiplyingExpression(int i) {
			return getRuleContext(MultiplyingExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(agcParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(agcParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(agcParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(agcParser.MINUS, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			multiplyingExpression();
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(171);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(172);
					multiplyingExpression();
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(agcParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(agcParser.TIMES, i);
		}
		public List<TerminalNode> DIV() { return getTokens(agcParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(agcParser.DIV, i);
		}
		public MultiplyingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterMultiplyingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitMultiplyingExpression(this);
		}
	}

	public final MultiplyingExpressionContext multiplyingExpression() throws RecognitionException {
		MultiplyingExpressionContext _localctx = new MultiplyingExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_multiplyingExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			atom();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIMES || _la==DIV) {
				{
				{
				setState(179);
				_la = _input.LA(1);
				if ( !(_la==TIMES || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(180);
				atom();
				}
				}
				setState(185);
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
		public InteContext inte() {
			return getRuleContext(InteContext.class,0);
		}
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atom);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				inte();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				decimal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				label();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				register();
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

	public static class InteContext extends ParserRuleContext {
		public TerminalNode INTE() { return getToken(agcParser.INTE, 0); }
		public InteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterInte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitInte(this);
		}
	}

	public final InteContext inte() throws RecognitionException {
		InteContext _localctx = new InteContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inte);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(INTE);
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

	public static class DecimalContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(agcParser.DECIMAL, 0); }
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitDecimal(this);
		}
	}

	public final DecimalContext decimal() throws RecognitionException {
		DecimalContext _localctx = new DecimalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_decimal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(195);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(198);
			match(DECIMAL);
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
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitRegister(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_register);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51))) != 0)) ) {
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

	public static class OpcodeContext extends ParserRuleContext {
		public Standard_opcodeContext standard_opcode() {
			return getRuleContext(Standard_opcodeContext.class,0);
		}
		public Pseudo_opcodeContext pseudo_opcode() {
			return getRuleContext(Pseudo_opcodeContext.class,0);
		}
		public Axt_opcodeContext axt_opcode() {
			return getRuleContext(Axt_opcodeContext.class,0);
		}
		public OpcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterOpcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitOpcode(this);
		}
	}

	public final OpcodeContext opcode() throws RecognitionException {
		OpcodeContext _localctx = new OpcodeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_opcode);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__82:
			case T__83:
			case T__84:
			case T__85:
			case T__86:
			case T__87:
			case T__88:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__99:
			case T__100:
			case T__101:
			case T__102:
			case T__103:
			case T__104:
			case T__105:
			case T__106:
			case T__107:
			case T__108:
			case T__109:
			case T__110:
			case T__111:
			case T__112:
			case T__113:
			case T__114:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__119:
			case T__120:
			case T__121:
			case T__122:
			case T__123:
			case T__124:
			case T__125:
			case T__126:
			case T__127:
			case T__128:
			case T__129:
			case T__130:
			case T__131:
			case T__132:
			case T__133:
			case T__134:
			case T__135:
			case T__136:
			case T__137:
			case T__138:
			case T__139:
			case T__140:
			case T__141:
			case T__142:
			case T__143:
			case T__144:
			case T__145:
			case T__146:
			case T__147:
			case T__148:
			case T__149:
			case T__150:
			case T__151:
			case T__152:
			case T__153:
			case T__154:
			case T__155:
			case T__156:
			case T__157:
			case T__158:
			case T__159:
			case T__160:
			case T__161:
			case T__162:
			case T__163:
			case T__164:
			case T__165:
			case T__166:
			case T__167:
			case T__168:
			case T__169:
			case T__170:
			case T__171:
			case T__172:
			case T__173:
			case T__174:
			case T__175:
			case T__176:
			case T__177:
			case T__178:
			case T__179:
			case T__180:
			case T__181:
			case T__182:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				standard_opcode();
				}
				break;
			case T__54:
			case T__55:
			case T__56:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__77:
			case T__78:
			case T__79:
			case T__80:
			case T__81:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				pseudo_opcode();
				}
				break;
			case T__52:
			case T__53:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				axt_opcode();
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

	public static class Axt_opcodeContext extends ParserRuleContext {
		public Axt_opcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axt_opcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterAxt_opcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitAxt_opcode(this);
		}
	}

	public final Axt_opcodeContext axt_opcode() throws RecognitionException {
		Axt_opcodeContext _localctx = new Axt_opcodeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_axt_opcode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !(_la==T__52 || _la==T__53) ) {
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

	public static class Pseudo_opcodeContext extends ParserRuleContext {
		public Pseudo_opcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo_opcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterPseudo_opcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitPseudo_opcode(this);
		}
	}

	public final Pseudo_opcodeContext pseudo_opcode() throws RecognitionException {
		Pseudo_opcodeContext _localctx = new Pseudo_opcodeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pseudo_opcode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !(((((_la - 55)) & ~0x3f) == 0 && ((1L << (_la - 55)) & ((1L << (T__54 - 55)) | (1L << (T__55 - 55)) | (1L << (T__56 - 55)) | (1L << (T__57 - 55)) | (1L << (T__58 - 55)) | (1L << (T__59 - 55)) | (1L << (T__60 - 55)) | (1L << (T__61 - 55)) | (1L << (T__62 - 55)) | (1L << (T__63 - 55)) | (1L << (T__64 - 55)) | (1L << (T__65 - 55)) | (1L << (T__66 - 55)) | (1L << (T__67 - 55)) | (1L << (T__68 - 55)) | (1L << (T__69 - 55)) | (1L << (T__70 - 55)) | (1L << (T__71 - 55)) | (1L << (T__72 - 55)) | (1L << (T__73 - 55)) | (1L << (T__74 - 55)) | (1L << (T__75 - 55)) | (1L << (T__76 - 55)) | (1L << (T__77 - 55)) | (1L << (T__78 - 55)) | (1L << (T__79 - 55)) | (1L << (T__80 - 55)) | (1L << (T__81 - 55)))) != 0)) ) {
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

	public static class Standard_opcodeContext extends ParserRuleContext {
		public Standard_opcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standard_opcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).enterStandard_opcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof agcListener ) ((agcListener)listener).exitStandard_opcode(this);
		}
	}

	public final Standard_opcodeContext standard_opcode() throws RecognitionException {
		Standard_opcodeContext _localctx = new Standard_opcodeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_standard_opcode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (T__82 - 83)) | (1L << (T__83 - 83)) | (1L << (T__84 - 83)) | (1L << (T__85 - 83)) | (1L << (T__86 - 83)) | (1L << (T__87 - 83)) | (1L << (T__88 - 83)) | (1L << (T__89 - 83)) | (1L << (T__90 - 83)) | (1L << (T__91 - 83)) | (1L << (T__92 - 83)) | (1L << (T__93 - 83)) | (1L << (T__94 - 83)) | (1L << (T__95 - 83)) | (1L << (T__96 - 83)) | (1L << (T__97 - 83)) | (1L << (T__98 - 83)) | (1L << (T__99 - 83)) | (1L << (T__100 - 83)) | (1L << (T__101 - 83)) | (1L << (T__102 - 83)) | (1L << (T__103 - 83)) | (1L << (T__104 - 83)) | (1L << (T__105 - 83)) | (1L << (T__106 - 83)) | (1L << (T__107 - 83)) | (1L << (T__108 - 83)) | (1L << (T__109 - 83)) | (1L << (T__110 - 83)) | (1L << (T__111 - 83)) | (1L << (T__112 - 83)) | (1L << (T__113 - 83)) | (1L << (T__114 - 83)) | (1L << (T__115 - 83)) | (1L << (T__116 - 83)) | (1L << (T__117 - 83)) | (1L << (T__118 - 83)) | (1L << (T__119 - 83)) | (1L << (T__120 - 83)) | (1L << (T__121 - 83)) | (1L << (T__122 - 83)) | (1L << (T__123 - 83)) | (1L << (T__124 - 83)) | (1L << (T__125 - 83)) | (1L << (T__126 - 83)) | (1L << (T__127 - 83)) | (1L << (T__128 - 83)) | (1L << (T__129 - 83)) | (1L << (T__130 - 83)) | (1L << (T__131 - 83)) | (1L << (T__132 - 83)) | (1L << (T__133 - 83)) | (1L << (T__134 - 83)) | (1L << (T__135 - 83)) | (1L << (T__136 - 83)) | (1L << (T__137 - 83)) | (1L << (T__138 - 83)) | (1L << (T__139 - 83)) | (1L << (T__140 - 83)) | (1L << (T__141 - 83)) | (1L << (T__142 - 83)) | (1L << (T__143 - 83)) | (1L << (T__144 - 83)) | (1L << (T__145 - 83)))) != 0) || ((((_la - 147)) & ~0x3f) == 0 && ((1L << (_la - 147)) & ((1L << (T__146 - 147)) | (1L << (T__147 - 147)) | (1L << (T__148 - 147)) | (1L << (T__149 - 147)) | (1L << (T__150 - 147)) | (1L << (T__151 - 147)) | (1L << (T__152 - 147)) | (1L << (T__153 - 147)) | (1L << (T__154 - 147)) | (1L << (T__155 - 147)) | (1L << (T__156 - 147)) | (1L << (T__157 - 147)) | (1L << (T__158 - 147)) | (1L << (T__159 - 147)) | (1L << (T__160 - 147)) | (1L << (T__161 - 147)) | (1L << (T__162 - 147)) | (1L << (T__163 - 147)) | (1L << (T__164 - 147)) | (1L << (T__165 - 147)) | (1L << (T__166 - 147)) | (1L << (T__167 - 147)) | (1L << (T__168 - 147)) | (1L << (T__169 - 147)) | (1L << (T__170 - 147)) | (1L << (T__171 - 147)) | (1L << (T__172 - 147)) | (1L << (T__173 - 147)) | (1L << (T__174 - 147)) | (1L << (T__175 - 147)) | (1L << (T__176 - 147)) | (1L << (T__177 - 147)) | (1L << (T__178 - 147)) | (1L << (T__179 - 147)) | (1L << (T__180 - 147)) | (1L << (T__181 - 147)) | (1L << (T__182 - 147)))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00c6\u00d8\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\6\2\64\n\2\r\2\16\2\65\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\5\4@\n\4"+
		"\3\4\3\4\3\5\5\5E\n\5\3\5\3\5\3\5\3\6\5\6K\n\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"R\n\6\3\6\3\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6\3\6\3\7\5\7`\n\7\3\7"+
		"\3\7\3\7\5\7e\n\7\3\7\7\7h\n\7\f\7\16\7k\13\7\3\7\3\7\3\7\5\7p\n\7\3\7"+
		"\3\7\3\b\3\b\5\bv\n\b\3\b\3\b\5\bz\n\b\3\b\7\b}\n\b\f\b\16\b\u0080\13"+
		"\b\3\b\3\b\3\b\5\b\u0085\n\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u008d\n\t\3\n"+
		"\3\n\3\n\7\n\u0092\n\n\f\n\16\n\u0095\13\n\3\n\3\n\3\n\5\n\u009a\n\n\3"+
		"\13\3\13\3\f\5\f\u009f\n\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\5\17\u00ab\n\17\3\20\3\20\3\20\7\20\u00b0\n\20\f\20\16\20\u00b3\13"+
		"\20\3\21\3\21\3\21\7\21\u00b8\n\21\f\21\16\21\u00bb\13\21\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u00c2\n\22\3\23\3\23\3\24\5\24\u00c7\n\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\5\26\u00d0\n\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\t\3"+
		"\2\4\5\3\2\u00be\u00bf\3\2\u00c0\u00c1\3\2\6\66\3\2\678\3\29T\3\2U\u00b9"+
		"\2\u00df\2\63\3\2\2\2\4<\3\2\2\2\6?\3\2\2\2\bD\3\2\2\2\nJ\3\2\2\2\f_\3"+
		"\2\2\2\16s\3\2\2\2\20\u0088\3\2\2\2\22\u0093\3\2\2\2\24\u009b\3\2\2\2"+
		"\26\u009e\3\2\2\2\30\u00a2\3\2\2\2\32\u00a4\3\2\2\2\34\u00aa\3\2\2\2\36"+
		"\u00ac\3\2\2\2 \u00b4\3\2\2\2\"\u00c1\3\2\2\2$\u00c3\3\2\2\2&\u00c6\3"+
		"\2\2\2(\u00ca\3\2\2\2*\u00cf\3\2\2\2,\u00d1\3\2\2\2.\u00d3\3\2\2\2\60"+
		"\u00d5\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2"+
		"\65\66\3\2\2\2\66\3\3\2\2\2\67=\5\b\5\28=\5\6\4\29=\5\n\6\2:=\5\f\7\2"+
		";=\5\16\b\2<\67\3\2\2\2<8\3\2\2\2<9\3\2\2\2<:\3\2\2\2<;\3\2\2\2=\5\3\2"+
		"\2\2>@\5\32\16\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\5\26\f\2B\7\3\2\2\2C"+
		"E\5\24\13\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\5\30\r\2GH\5\26\f\2H\t\3\2"+
		"\2\2IK\5\32\16\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\5\24\13\2MQ\5\20\t\2"+
		"NO\5\26\f\2OP\5\b\5\2PR\3\2\2\2QN\3\2\2\2QR\3\2\2\2RS\3\2\2\2SY\5\22\n"+
		"\2TU\5\26\f\2UV\5\22\n\2VX\3\2\2\2WT\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2"+
		"\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\5\26\f\2]\13\3\2\2\2^`\5\34\17\2_^\3\2\2"+
		"\2_`\3\2\2\2`a\3\2\2\2ab\5\24\13\2bi\7\3\2\2ce\5\24\13\2dc\3\2\2\2de\3"+
		"\2\2\2ef\3\2\2\2fh\5\36\20\2gd\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j"+
		"o\3\2\2\2ki\3\2\2\2lm\5\24\13\2mn\5\30\r\2np\3\2\2\2ol\3\2\2\2op\3\2\2"+
		"\2pq\3\2\2\2qr\5\26\f\2r\r\3\2\2\2su\5\34\17\2tv\5\24\13\2ut\3\2\2\2u"+
		"v\3\2\2\2vw\3\2\2\2w~\t\2\2\2xz\5\24\13\2yx\3\2\2\2yz\3\2\2\2z{\3\2\2"+
		"\2{}\5\36\20\2|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0084"+
		"\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\5\24\13\2\u0082\u0083\5\30\r\2\u0083"+
		"\u0085\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0087\5\26\f\2\u0087\17\3\2\2\2\u0088\u008c\5*\26\2\u0089\u008a"+
		"\5\24\13\2\u008a\u008b\5*\26\2\u008b\u008d\3\2\2\2\u008c\u0089\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\21\3\2\2\2\u008e\u008f\5\24\13\2\u008f\u0090"+
		"\5\36\20\2\u0090\u0092\3\2\2\2\u0091\u008e\3\2\2\2\u0092\u0095\3\2\2\2"+
		"\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0099\3\2\2\2\u0095\u0093"+
		"\3\2\2\2\u0096\u0097\5\24\13\2\u0097\u0098\5\30\r\2\u0098\u009a\3\2\2"+
		"\2\u0099\u0096\3\2\2\2\u0099\u009a\3\2\2\2\u009a\23\3\2\2\2\u009b\u009c"+
		"\7\u00c6\2\2\u009c\25\3\2\2\2\u009d\u009f\7\u00c6\2\2\u009e\u009d\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\7\u00c5\2\2\u00a1"+
		"\27\3\2\2\2\u00a2\u00a3\7\u00bd\2\2\u00a3\31\3\2\2\2\u00a4\u00a5\7\u00ba"+
		"\2\2\u00a5\33\3\2\2\2\u00a6\u00ab\7\u00ba\2\2\u00a7\u00a8\7\u00c3\2\2"+
		"\u00a8\u00a9\7\u00ba\2\2\u00a9\u00ab\7\u00c4\2\2\u00aa\u00a6\3\2\2\2\u00aa"+
		"\u00a7\3\2\2\2\u00ab\35\3\2\2\2\u00ac\u00b1\5 \21\2\u00ad\u00ae\t\3\2"+
		"\2\u00ae\u00b0\5 \21\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\37\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b9\5\"\22\2\u00b5\u00b6\t\4\2\2\u00b6\u00b8\5\"\22\2\u00b7\u00b5\3"+
		"\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"!\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c2\5$\23\2\u00bd\u00c2\5&\24\2"+
		"\u00be\u00c2\5\34\17\2\u00bf\u00c2\5\32\16\2\u00c0\u00c2\5(\25\2\u00c1"+
		"\u00bc\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c0\3\2\2\2\u00c2#\3\2\2\2\u00c3\u00c4\7\u00bb\2\2\u00c4"+
		"%\3\2\2\2\u00c5\u00c7\t\3\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2"+
		"\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\u00bc\2\2\u00c9\'\3\2\2\2\u00ca\u00cb"+
		"\t\5\2\2\u00cb)\3\2\2\2\u00cc\u00d0\5\60\31\2\u00cd\u00d0\5.\30\2\u00ce"+
		"\u00d0\5,\27\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2"+
		"\2\2\u00d0+\3\2\2\2\u00d1\u00d2\t\6\2\2\u00d2-\3\2\2\2\u00d3\u00d4\t\7"+
		"\2\2\u00d4/\3\2\2\2\u00d5\u00d6\t\b\2\2\u00d6\61\3\2\2\2\33\65<?DJQY_"+
		"diouy~\u0084\u008c\u0093\u0099\u009e\u00aa\u00b1\u00b9\u00c1\u00c6\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}