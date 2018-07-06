// Generated from smiles/smiles.g4 by ANTLR 4.7.1
package parsers.smiles;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class smilesParser extends Parser {
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
		T__179=180, T__180=181, T__181=182, T__182=183, T__183=184, T__184=185, 
		T__185=186, T__186=187, T__187=188, T__188=189, T__189=190, T__190=191, 
		T__191=192, T__192=193, T__193=194, T__194=195, T__195=196, T__196=197, 
		T__197=198, T__198=199, T__199=200, T__200=201, T__201=202, T__202=203, 
		T__203=204, DOT=205, LINEFEED=206, CARRIAGE_RETURN=207, SPACE=208, DIGIT=209, 
		NUMBER=210, TAB=211;
	public static final int
		RULE_smiles = 0, RULE_atom = 1, RULE_aliphatic_organic = 2, RULE_aromatic_organic = 3, 
		RULE_bracket_atom = 4, RULE_symbol = 5, RULE_isotope = 6, RULE_element_symbols = 7, 
		RULE_aromatic_symbols = 8, RULE_chiral = 9, RULE_hcount = 10, RULE_charge = 11, 
		RULE_class_ = 12, RULE_bond = 13, RULE_ringbond = 14, RULE_branched_atom = 15, 
		RULE_branch = 16, RULE_chain = 17, RULE_terminator = 18;
	public static final String[] ruleNames = {
		"smiles", "atom", "aliphatic_organic", "aromatic_organic", "bracket_atom", 
		"symbol", "isotope", "element_symbols", "aromatic_symbols", "chiral", 
		"hcount", "charge", "class_", "bond", "ringbond", "branched_atom", "branch", 
		"chain", "terminator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'*'", "'B'", "'C'", "'N'", "'O'", "'S'", "'P'", "'F'", "'Cl'", 
		"'Br'", "'I'", "'b'", "'c'", "'n'", "'o'", "'s'", "'p'", "'['", "']'", 
		"'H'", "'He'", "'Li'", "'Be'", "'Ne'", "'Na'", "'Mg'", "'Al'", "'Si'", 
		"'Ar'", "'K'", "'Ca'", "'Sc'", "'Ti'", "'V'", "'Cr'", "'Mn'", "'Fe'", 
		"'Co'", "'Ni'", "'Cu'", "'Zn'", "'Ga'", "'Ge'", "'As'", "'Se'", "'Kr'", 
		"'Rb'", "'Sr'", "'Y'", "'Zr'", "'Nb'", "'Mo'", "'Tc'", "'Ru'", "'Rh'", 
		"'Pd'", "'Ag'", "'Cd'", "'In'", "'Sn'", "'Sb'", "'Te'", "'Xe'", "'Cs'", 
		"'Ba'", "'Hf'", "'Ta'", "'W'", "'Re'", "'Os'", "'Ir'", "'Pt'", "'Au'", 
		"'Hg'", "'Tl'", "'Pb'", "'Bi'", "'Po'", "'At'", "'Rn'", "'Fr'", "'Ra'", 
		"'Rf'", "'Db'", "'Sg'", "'Bh'", "'Hs'", "'Mt'", "'Ds'", "'Rg'", "'La'", 
		"'Ce'", "'Pr'", "'Nd'", "'Pm'", "'Sm'", "'Eu'", "'Gd'", "'Tb'", "'Dy'", 
		"'Ho'", "'Er'", "'Tm'", "'Yb'", "'Lu'", "'Ac'", "'Th'", "'Pa'", "'U'", 
		"'Np'", "'Pu'", "'Am'", "'Cm'", "'Bk'", "'Cf'", "'Es'", "'Fm'", "'Md'", 
		"'No'", "'Lr'", "'se'", "'as'", "'@'", "'@@'", "'@TH1'", "'@TH2'", "'@AL1'", 
		"'@AL2'", "'@SP1'", "'@SP2'", "'@SP3'", "'@TB1'", "'@TB2'", "'@TB3'", 
		"'@TB4'", "'@TB5'", "'@TB6'", "'@TB7'", "'@TB8'", "'@TB9'", "'@TB10'", 
		"'@TB11'", "'@TB12'", "'@TB13'", "'@TB14'", "'@TB15'", "'@TB16'", "'@TB17'", 
		"'@TB18'", "'@TB19'", "'@TB20'", "'@TB21'", "'@TB22'", "'@TB23'", "'@TB24'", 
		"'@TB25'", "'@TB26'", "'@TB27'", "'@TB28'", "'@TB29'", "'@TB30'", "'@OH1'", 
		"'@OH2'", "'@OH3'", "'@OH4'", "'@OH5'", "'@OH6'", "'@OH7'", "'@OH8'", 
		"'@OH9'", "'@OH10'", "'@OH11'", "'@OH12'", "'@OH13'", "'@OH14'", "'@OH15'", 
		"'@OH16'", "'@OH17'", "'@OH18'", "'@OH19'", "'@OH20'", "'@OH21'", "'@OH22'", 
		"'@OH23'", "'@OH24'", "'@OH25'", "'@OH26'", "'@OH27'", "'@OH28'", "'@OH29'", 
		"'@OH30'", "'-'", "'+'", "'--'", "'++'", "':'", "'='", "'#'", "'$'", "'/'", 
		"'\\'", "'%'", "'('", "')'", "'.'", "'\r'", "'\n'", "' '", null, null, 
		"'\t'"
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
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "DOT", "LINEFEED", "CARRIAGE_RETURN", "SPACE", "DIGIT", "NUMBER", 
		"TAB"
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
	public String getGrammarFileName() { return "smiles.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public smilesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SmilesContext extends ParserRuleContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public TerminatorContext terminator() {
			return getRuleContext(TerminatorContext.class,0);
		}
		public SmilesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smiles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).enterSmiles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).exitSmiles(this);
		}
	}

	public final SmilesContext smiles() throws RecognitionException {
		SmilesContext _localctx = new SmilesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_smiles);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			chain(0);
			setState(39);
			terminator();
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
		public Bracket_atomContext bracket_atom() {
			return getRuleContext(Bracket_atomContext.class,0);
		}
		public Aliphatic_organicContext aliphatic_organic() {
			return getRuleContext(Aliphatic_organicContext.class,0);
		}
		public Aromatic_organicContext aromatic_organic() {
			return getRuleContext(Aromatic_organicContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_atom);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				bracket_atom();
				}
				break;
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
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				aliphatic_organic();
				}
				break;
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				aromatic_organic();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				match(T__0);
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

	public static class Aliphatic_organicContext extends ParserRuleContext {
		public Aliphatic_organicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliphatic_organic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).enterAliphatic_organic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).exitAliphatic_organic(this);
		}
	}

	public final Aliphatic_organicContext aliphatic_organic() throws RecognitionException {
		Aliphatic_organicContext _localctx = new Aliphatic_organicContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_aliphatic_organic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
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

	public static class Aromatic_organicContext extends ParserRuleContext {
		public Aromatic_organicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aromatic_organic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).enterAromatic_organic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).exitAromatic_organic(this);
		}
	}

	public final Aromatic_organicContext aromatic_organic() throws RecognitionException {
		Aromatic_organicContext _localctx = new Aromatic_organicContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_aromatic_organic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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

	public static class Bracket_atomContext extends ParserRuleContext {
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public IsotopeContext isotope() {
			return getRuleContext(IsotopeContext.class,0);
		}
		public ChiralContext chiral() {
			return getRuleContext(ChiralContext.class,0);
		}
		public HcountContext hcount() {
			return getRuleContext(HcountContext.class,0);
		}
		public ChargeContext charge() {
			return getRuleContext(ChargeContext.class,0);
		}
		public Class_Context class_() {
			return getRuleContext(Class_Context.class,0);
		}
		public Bracket_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracket_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).enterBracket_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).exitBracket_atom(this);
		}
	}

	public final Bracket_atomContext bracket_atom() throws RecognitionException {
		Bracket_atomContext _localctx = new Bracket_atomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bracket_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__17);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(52);
				isotope();
				}
			}

			setState(55);
			symbol();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (T__122 - 123)) | (1L << (T__123 - 123)) | (1L << (T__124 - 123)) | (1L << (T__125 - 123)) | (1L << (T__126 - 123)) | (1L << (T__127 - 123)) | (1L << (T__128 - 123)) | (1L << (T__129 - 123)) | (1L << (T__130 - 123)) | (1L << (T__131 - 123)) | (1L << (T__132 - 123)) | (1L << (T__133 - 123)) | (1L << (T__134 - 123)) | (1L << (T__135 - 123)) | (1L << (T__136 - 123)) | (1L << (T__137 - 123)) | (1L << (T__138 - 123)) | (1L << (T__139 - 123)) | (1L << (T__140 - 123)) | (1L << (T__141 - 123)) | (1L << (T__142 - 123)) | (1L << (T__143 - 123)) | (1L << (T__144 - 123)) | (1L << (T__145 - 123)) | (1L << (T__146 - 123)) | (1L << (T__147 - 123)) | (1L << (T__148 - 123)) | (1L << (T__149 - 123)) | (1L << (T__150 - 123)) | (1L << (T__151 - 123)) | (1L << (T__152 - 123)) | (1L << (T__153 - 123)) | (1L << (T__154 - 123)) | (1L << (T__155 - 123)) | (1L << (T__156 - 123)) | (1L << (T__157 - 123)) | (1L << (T__158 - 123)) | (1L << (T__159 - 123)) | (1L << (T__160 - 123)) | (1L << (T__161 - 123)) | (1L << (T__162 - 123)) | (1L << (T__163 - 123)) | (1L << (T__164 - 123)) | (1L << (T__165 - 123)) | (1L << (T__166 - 123)) | (1L << (T__167 - 123)) | (1L << (T__168 - 123)) | (1L << (T__169 - 123)) | (1L << (T__170 - 123)) | (1L << (T__171 - 123)) | (1L << (T__172 - 123)) | (1L << (T__173 - 123)) | (1L << (T__174 - 123)) | (1L << (T__175 - 123)) | (1L << (T__176 - 123)) | (1L << (T__177 - 123)) | (1L << (T__178 - 123)) | (1L << (T__179 - 123)) | (1L << (T__180 - 123)) | (1L << (T__181 - 123)) | (1L << (T__182 - 123)) | (1L << (T__183 - 123)) | (1L << (T__184 - 123)) | (1L << (T__185 - 123)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (T__186 - 187)) | (1L << (T__187 - 187)) | (1L << (T__188 - 187)) | (1L << (T__189 - 187)) | (1L << (T__190 - 187)))) != 0)) {
				{
				setState(56);
				chiral();
				}
			}

			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(59);
				hcount();
				}
			}

			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__192 - 192)) | (1L << (T__193 - 192)) | (1L << (T__194 - 192)))) != 0)) {
				{
				setState(62);
				charge();
				}
			}

			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__195) {
				{
				setState(65);
				class_();
				}
			}

			setState(68);
			match(T__18);
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
		public Element_symbolsContext element_symbols() {
			return getRuleContext(Element_symbolsContext.class,0);
		}
		public Aromatic_symbolsContext aromatic_symbols() {
			return getRuleContext(Aromatic_symbolsContext.class,0);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).exitSymbol(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_symbol);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
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
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				element_symbols();
				}
				break;
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__120:
			case T__121:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				aromatic_symbols();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 3);
				{
				setState(72);
				match(T__0);
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

	public static class IsotopeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(smilesParser.NUMBER, 0); }
		public IsotopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isotope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).enterIsotope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).exitIsotope(this);
		}
	}

	public final IsotopeContext isotope() throws RecognitionException {
		IsotopeContext _localctx = new IsotopeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_isotope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
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

	public static class Element_symbolsContext extends ParserRuleContext {
		public Element_symbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element_symbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).enterElement_symbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).exitElement_symbols(this);
		}
	}

	public final Element_symbolsContext element_symbols() throws RecognitionException {
		Element_symbolsContext _localctx = new Element_symbolsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_element_symbols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__103 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)))) != 0)) ) {
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

	public static class Aromatic_symbolsContext extends ParserRuleContext {
		public Aromatic_symbolsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aromatic_symbols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).enterAromatic_symbols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).exitAromatic_symbols(this);
		}
	}

	public final Aromatic_symbolsContext aromatic_symbols() throws RecognitionException {
		Aromatic_symbolsContext _localctx = new Aromatic_symbolsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_aromatic_symbols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0) || _la==T__120 || _la==T__121) ) {
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

	public static class ChiralContext extends ParserRuleContext {
		public ChiralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chiral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).enterChiral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).exitChiral(this);
		}
	}

	public final ChiralContext chiral() throws RecognitionException {
		ChiralContext _localctx = new ChiralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_chiral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !(((((_la - 123)) & ~0x3f) == 0 && ((1L << (_la - 123)) & ((1L << (T__122 - 123)) | (1L << (T__123 - 123)) | (1L << (T__124 - 123)) | (1L << (T__125 - 123)) | (1L << (T__126 - 123)) | (1L << (T__127 - 123)) | (1L << (T__128 - 123)) | (1L << (T__129 - 123)) | (1L << (T__130 - 123)) | (1L << (T__131 - 123)) | (1L << (T__132 - 123)) | (1L << (T__133 - 123)) | (1L << (T__134 - 123)) | (1L << (T__135 - 123)) | (1L << (T__136 - 123)) | (1L << (T__137 - 123)) | (1L << (T__138 - 123)) | (1L << (T__139 - 123)) | (1L << (T__140 - 123)) | (1L << (T__141 - 123)) | (1L << (T__142 - 123)) | (1L << (T__143 - 123)) | (1L << (T__144 - 123)) | (1L << (T__145 - 123)) | (1L << (T__146 - 123)) | (1L << (T__147 - 123)) | (1L << (T__148 - 123)) | (1L << (T__149 - 123)) | (1L << (T__150 - 123)) | (1L << (T__151 - 123)) | (1L << (T__152 - 123)) | (1L << (T__153 - 123)) | (1L << (T__154 - 123)) | (1L << (T__155 - 123)) | (1L << (T__156 - 123)) | (1L << (T__157 - 123)) | (1L << (T__158 - 123)) | (1L << (T__159 - 123)) | (1L << (T__160 - 123)) | (1L << (T__161 - 123)) | (1L << (T__162 - 123)) | (1L << (T__163 - 123)) | (1L << (T__164 - 123)) | (1L << (T__165 - 123)) | (1L << (T__166 - 123)) | (1L << (T__167 - 123)) | (1L << (T__168 - 123)) | (1L << (T__169 - 123)) | (1L << (T__170 - 123)) | (1L << (T__171 - 123)) | (1L << (T__172 - 123)) | (1L << (T__173 - 123)) | (1L << (T__174 - 123)) | (1L << (T__175 - 123)) | (1L << (T__176 - 123)) | (1L << (T__177 - 123)) | (1L << (T__178 - 123)) | (1L << (T__179 - 123)) | (1L << (T__180 - 123)) | (1L << (T__181 - 123)) | (1L << (T__182 - 123)) | (1L << (T__183 - 123)) | (1L << (T__184 - 123)) | (1L << (T__185 - 123)))) != 0) || ((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (T__186 - 187)) | (1L << (T__187 - 187)) | (1L << (T__188 - 187)) | (1L << (T__189 - 187)) | (1L << (T__190 - 187)))) != 0)) ) {
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

	public static class HcountContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(smilesParser.DIGIT, 0); }
		public HcountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hcount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).enterHcount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).exitHcount(this);
		}
	}

	public final HcountContext hcount() throws RecognitionException {
		HcountContext _localctx = new HcountContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_hcount);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(T__19);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__19);
				setState(85);
				match(DIGIT);
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

	public static class ChargeContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(smilesParser.DIGIT, 0); }
		public ChargeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).enterCharge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).exitCharge(this);
		}
	}

	public final ChargeContext charge() throws RecognitionException {
		ChargeContext _localctx = new ChargeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_charge);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(T__191);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(T__191);
				setState(90);
				match(DIGIT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(T__192);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				match(T__192);
				setState(93);
				match(DIGIT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				match(T__193);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				match(T__194);
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

	public static class Class_Context extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(smilesParser.NUMBER, 0); }
		public Class_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).enterClass_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).exitClass_(this);
		}
	}

	public final Class_Context class_() throws RecognitionException {
		Class_Context _localctx = new Class_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_class_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__195);
			setState(99);
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

	public static class BondContext extends ParserRuleContext {
		public BondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).enterBond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).exitBond(this);
		}
	}

	public final BondContext bond() throws RecognitionException {
		BondContext _localctx = new BondContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !(((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)))) != 0)) ) {
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

	public static class RingbondContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(smilesParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(smilesParser.DIGIT, i);
		}
		public BondContext bond() {
			return getRuleContext(BondContext.class,0);
		}
		public RingbondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ringbond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).enterRingbond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).exitRingbond(this);
		}
	}

	public final RingbondContext ringbond() throws RecognitionException {
		RingbondContext _localctx = new RingbondContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ringbond);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)))) != 0)) {
					{
					setState(103);
					bond();
					}
				}

				setState(106);
				match(DIGIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (T__191 - 192)) | (1L << (T__195 - 192)) | (1L << (T__196 - 192)) | (1L << (T__197 - 192)) | (1L << (T__198 - 192)) | (1L << (T__199 - 192)) | (1L << (T__200 - 192)))) != 0)) {
					{
					setState(107);
					bond();
					}
				}

				setState(110);
				match(T__201);
				setState(111);
				match(DIGIT);
				setState(112);
				match(DIGIT);
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

	public static class Branched_atomContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<RingbondContext> ringbond() {
			return getRuleContexts(RingbondContext.class);
		}
		public RingbondContext ringbond(int i) {
			return getRuleContext(RingbondContext.class,i);
		}
		public List<BranchContext> branch() {
			return getRuleContexts(BranchContext.class);
		}
		public BranchContext branch(int i) {
			return getRuleContext(BranchContext.class,i);
		}
		public Branched_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branched_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).enterBranched_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).exitBranched_atom(this);
		}
	}

	public final Branched_atomContext branched_atom() throws RecognitionException {
		Branched_atomContext _localctx = new Branched_atomContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_branched_atom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			atom();
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					ringbond();
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(122);
					branch();
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class BranchContext extends ParserRuleContext {
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public BondContext bond() {
			return getRuleContext(BondContext.class,0);
		}
		public TerminalNode DOT() { return getToken(smilesParser.DOT, 0); }
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).enterBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).exitBranch(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_branch);
		try {
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__202);
				setState(129);
				chain(0);
				setState(130);
				match(T__203);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T__202);
				setState(133);
				bond();
				setState(134);
				chain(0);
				setState(135);
				match(T__203);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(T__202);
				setState(138);
				match(DOT);
				setState(139);
				chain(0);
				setState(140);
				match(T__203);
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

	public static class ChainContext extends ParserRuleContext {
		public Branched_atomContext branched_atom() {
			return getRuleContext(Branched_atomContext.class,0);
		}
		public ChainContext chain() {
			return getRuleContext(ChainContext.class,0);
		}
		public BondContext bond() {
			return getRuleContext(BondContext.class,0);
		}
		public TerminalNode DOT() { return getToken(smilesParser.DOT, 0); }
		public ChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).enterChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).exitChain(this);
		}
	}

	public final ChainContext chain() throws RecognitionException {
		return chain(0);
	}

	private ChainContext chain(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ChainContext _localctx = new ChainContext(_ctx, _parentState);
		ChainContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_chain, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(145);
			branched_atom();
			}
			_ctx.stop = _input.LT(-1);
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(156);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ChainContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_chain);
						setState(147);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(148);
						branched_atom();
						}
						break;
					case 2:
						{
						_localctx = new ChainContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_chain);
						setState(149);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(150);
						bond();
						setState(151);
						branched_atom();
						}
						break;
					case 3:
						{
						_localctx = new ChainContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_chain);
						setState(153);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(154);
						match(DOT);
						setState(155);
						branched_atom();
						}
						break;
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TerminatorContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(smilesParser.SPACE, 0); }
		public TerminalNode TAB() { return getToken(smilesParser.TAB, 0); }
		public TerminalNode LINEFEED() { return getToken(smilesParser.LINEFEED, 0); }
		public TerminalNode CARRIAGE_RETURN() { return getToken(smilesParser.CARRIAGE_RETURN, 0); }
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).enterTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof smilesListener ) ((smilesListener)listener).exitTerminator(this);
		}
	}

	public final TerminatorContext terminator() throws RecognitionException {
		TerminatorContext _localctx = new TerminatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_terminator);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SPACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(SPACE);
				setState(162);
				match(TAB);
				}
				break;
			case LINEFEED:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(LINEFEED);
				}
				break;
			case CARRIAGE_RETURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(CARRIAGE_RETURN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return chain_sempred((ChainContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean chain_sempred(ChainContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00d5\u00aa\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\5\68\n\6\3\6\3\6\5\6<\n\6\3\6\5\6?\n\6\3\6\5\6B\n\6\3\6"+
		"\5\6E\n\6\3\6\3\6\3\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\f\5\fY\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rc\n\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\20\5\20k\n\20\3\20\3\20\5\20o\n\20\3\20\3\20\3"+
		"\20\5\20t\n\20\3\21\3\21\7\21x\n\21\f\21\16\21{\13\21\3\21\7\21~\n\21"+
		"\f\21\16\21\u0081\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u0091\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u009f\n\23\f\23\16\23\u00a2\13\23"+
		"\3\24\3\24\3\24\3\24\5\24\u00a8\n\24\3\24\2\3$\25\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&\2\b\3\2\4\r\3\2\16\23\4\2\4\r\26z\4\2\17\23{|"+
		"\3\2}\u00c1\4\2\u00c2\u00c2\u00c6\u00cb\2\u00b2\2(\3\2\2\2\4/\3\2\2\2"+
		"\6\61\3\2\2\2\b\63\3\2\2\2\n\65\3\2\2\2\fK\3\2\2\2\16M\3\2\2\2\20O\3\2"+
		"\2\2\22Q\3\2\2\2\24S\3\2\2\2\26X\3\2\2\2\30b\3\2\2\2\32d\3\2\2\2\34g\3"+
		"\2\2\2\36s\3\2\2\2 u\3\2\2\2\"\u0090\3\2\2\2$\u0092\3\2\2\2&\u00a7\3\2"+
		"\2\2()\5$\23\2)*\5&\24\2*\3\3\2\2\2+\60\5\n\6\2,\60\5\6\4\2-\60\5\b\5"+
		"\2.\60\7\3\2\2/+\3\2\2\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\5\3\2\2\2\61"+
		"\62\t\2\2\2\62\7\3\2\2\2\63\64\t\3\2\2\64\t\3\2\2\2\65\67\7\24\2\2\66"+
		"8\5\16\b\2\67\66\3\2\2\2\678\3\2\2\289\3\2\2\29;\5\f\7\2:<\5\24\13\2;"+
		":\3\2\2\2;<\3\2\2\2<>\3\2\2\2=?\5\26\f\2>=\3\2\2\2>?\3\2\2\2?A\3\2\2\2"+
		"@B\5\30\r\2A@\3\2\2\2AB\3\2\2\2BD\3\2\2\2CE\5\32\16\2DC\3\2\2\2DE\3\2"+
		"\2\2EF\3\2\2\2FG\7\25\2\2G\13\3\2\2\2HL\5\20\t\2IL\5\22\n\2JL\7\3\2\2"+
		"KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\r\3\2\2\2MN\7\u00d4\2\2N\17\3\2\2\2OP"+
		"\t\4\2\2P\21\3\2\2\2QR\t\5\2\2R\23\3\2\2\2ST\t\6\2\2T\25\3\2\2\2UY\7\26"+
		"\2\2VW\7\26\2\2WY\7\u00d3\2\2XU\3\2\2\2XV\3\2\2\2Y\27\3\2\2\2Zc\7\u00c2"+
		"\2\2[\\\7\u00c2\2\2\\c\7\u00d3\2\2]c\7\u00c3\2\2^_\7\u00c3\2\2_c\7\u00d3"+
		"\2\2`c\7\u00c4\2\2ac\7\u00c5\2\2bZ\3\2\2\2b[\3\2\2\2b]\3\2\2\2b^\3\2\2"+
		"\2b`\3\2\2\2ba\3\2\2\2c\31\3\2\2\2de\7\u00c6\2\2ef\7\u00d4\2\2f\33\3\2"+
		"\2\2gh\t\7\2\2h\35\3\2\2\2ik\5\34\17\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2l"+
		"t\7\u00d3\2\2mo\5\34\17\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\u00cc\2\2"+
		"qr\7\u00d3\2\2rt\7\u00d3\2\2sj\3\2\2\2sn\3\2\2\2t\37\3\2\2\2uy\5\4\3\2"+
		"vx\5\36\20\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\177\3\2\2\2{y\3"+
		"\2\2\2|~\5\"\22\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080!\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\u00cd\2\2\u0083\u0084"+
		"\5$\23\2\u0084\u0085\7\u00ce\2\2\u0085\u0091\3\2\2\2\u0086\u0087\7\u00cd"+
		"\2\2\u0087\u0088\5\34\17\2\u0088\u0089\5$\23\2\u0089\u008a\7\u00ce\2\2"+
		"\u008a\u0091\3\2\2\2\u008b\u008c\7\u00cd\2\2\u008c\u008d\7\u00cf\2\2\u008d"+
		"\u008e\5$\23\2\u008e\u008f\7\u00ce\2\2\u008f\u0091\3\2\2\2\u0090\u0082"+
		"\3\2\2\2\u0090\u0086\3\2\2\2\u0090\u008b\3\2\2\2\u0091#\3\2\2\2\u0092"+
		"\u0093\b\23\1\2\u0093\u0094\5 \21\2\u0094\u00a0\3\2\2\2\u0095\u0096\f"+
		"\5\2\2\u0096\u009f\5 \21\2\u0097\u0098\f\4\2\2\u0098\u0099\5\34\17\2\u0099"+
		"\u009a\5 \21\2\u009a\u009f\3\2\2\2\u009b\u009c\f\3\2\2\u009c\u009d\7\u00cf"+
		"\2\2\u009d\u009f\5 \21\2\u009e\u0095\3\2\2\2\u009e\u0097\3\2\2\2\u009e"+
		"\u009b\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1%\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7\u00d2\2\2\u00a4"+
		"\u00a8\7\u00d5\2\2\u00a5\u00a8\7\u00d0\2\2\u00a6\u00a8\7\u00d1\2\2\u00a7"+
		"\u00a3\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\'\3\2\2\2"+
		"\24/\67;>ADKXbjnsy\177\u0090\u009e\u00a0\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}