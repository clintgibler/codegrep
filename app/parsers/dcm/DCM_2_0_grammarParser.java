// Generated from dcm/DCM_2_0_grammar.g4 by ANTLR 4.7.1
package parsers.dcm;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DCM_2_0_grammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, NAME=34, TEXT=35, INT=36, FLOAT=37, MINUS=38, WS=39, 
		COMMENT=40;
	public static final int
		RULE_konservierung = 0, RULE_kons_kopf = 1, RULE_modulkopf_info = 2, RULE_mod_zeile = 3, 
		RULE_mod_anf_zeile = 4, RULE_mod_fort_zeile = 5, RULE_mod_ele_name = 6, 
		RULE_mod_ele_wert = 7, RULE_funktionsdef = 8, RULE_funktionszeile = 9, 
		RULE_fkt_version = 10, RULE_fkt_langname = 11, RULE_variantendef = 12, 
		RULE_variantenkrit = 13, RULE_krit_name = 14, RULE_krit_wert = 15, RULE_kons_rumpf = 16, 
		RULE_kenngroesse = 17, RULE_kennwert = 18, RULE_kennwerteblock = 19, RULE_kennlinie = 20, 
		RULE_kennfeld = 21, RULE_gruppenstuetzstellen = 22, RULE_kenntext = 23, 
		RULE_kgr_info = 24, RULE_einheit_x = 25, RULE_einheit_y = 26, RULE_einheit_w = 27, 
		RULE_langname = 28, RULE_displayname = 29, RULE_var_abhangigkeiten = 30, 
		RULE_var_abh = 31, RULE_funktionszugehorigkeit = 32, RULE_anzahl_x = 33, 
		RULE_anzahl_y = 34, RULE_werteliste = 35, RULE_werteliste_kwb = 36, RULE_sst_liste_x = 37, 
		RULE_kf_zeile_liste = 38, RULE_kf_zeile_liste_r = 39, RULE_kf_zeile_liste_tx = 40, 
		RULE_realzahl = 41;
	public static final String[] ruleNames = {
		"konservierung", "kons_kopf", "modulkopf_info", "mod_zeile", "mod_anf_zeile", 
		"mod_fort_zeile", "mod_ele_name", "mod_ele_wert", "funktionsdef", "funktionszeile", 
		"fkt_version", "fkt_langname", "variantendef", "variantenkrit", "krit_name", 
		"krit_wert", "kons_rumpf", "kenngroesse", "kennwert", "kennwerteblock", 
		"kennlinie", "kennfeld", "gruppenstuetzstellen", "kenntext", "kgr_info", 
		"einheit_x", "einheit_y", "einheit_w", "langname", "displayname", "var_abhangigkeiten", 
		"var_abh", "funktionszugehorigkeit", "anzahl_x", "anzahl_y", "werteliste", 
		"werteliste_kwb", "sst_liste_x", "kf_zeile_liste", "kf_zeile_liste_r", 
		"kf_zeile_liste_tx", "realzahl"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "'KONSERVIERUNG_FORMAT 2.0'", "'MODULKOPF'", "'FUNKTIONEN'", 
		"'END'", "'FKT'", "'VARIANTENKODIERUNG'", "'KRITERIUM'", "'FESTWERT'", 
		"'WERT'", "'TEXT'", "'FESTWERTEBLOCK'", "'KENNLINIE'", "'FESTKENNLINIE'", 
		"'GRUPPENKENNLINIE'", "'KENNFELD'", "'FESTKENNFELD'", "'GRUPPENKENNFELD'", 
		"'STUETZSTELLENVERTEILUNG'", "'TEXTSTRING'", "'EINHEIT_X'", "'EINHEIT_Y'", 
		"'EINHEIT_W'", "'LANGNAME'", "'DISPLAYNAME'", "'VAR'", "','", "'='", "'FUNKTION'", 
		"'ST/X'", "'ST_TX/X'", "'ST/Y'", "'ST_TX/Y'", null, null, null, null, 
		"'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "NAME", "TEXT", 
		"INT", "FLOAT", "MINUS", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "DCM_2_0_grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DCM_2_0_grammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class KonservierungContext extends ParserRuleContext {
		public Kons_kopfContext kons_kopf() {
			return getRuleContext(Kons_kopfContext.class,0);
		}
		public Kons_rumpfContext kons_rumpf() {
			return getRuleContext(Kons_rumpfContext.class,0);
		}
		public KonservierungContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_konservierung; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterKonservierung(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitKonservierung(this);
		}
	}

	public final KonservierungContext konservierung() throws RecognitionException {
		KonservierungContext _localctx = new KonservierungContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_konservierung);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(84);
				match(T__0);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(T__1);
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				match(T__0);
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(96);
			kons_kopf();
			setState(97);
			kons_rumpf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kons_kopfContext extends ParserRuleContext {
		public Modulkopf_infoContext modulkopf_info() {
			return getRuleContext(Modulkopf_infoContext.class,0);
		}
		public FunktionsdefContext funktionsdef() {
			return getRuleContext(FunktionsdefContext.class,0);
		}
		public VariantendefContext variantendef() {
			return getRuleContext(VariantendefContext.class,0);
		}
		public Kons_kopfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kons_kopf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterKons_kopf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitKons_kopf(this);
		}
	}

	public final Kons_kopfContext kons_kopf() throws RecognitionException {
		Kons_kopfContext _localctx = new Kons_kopfContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_kons_kopf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(99);
				modulkopf_info();
				}
			}

			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(102);
				funktionsdef();
				}
			}

			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(105);
				variantendef();
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

	public static class Modulkopf_infoContext extends ParserRuleContext {
		public List<Mod_zeileContext> mod_zeile() {
			return getRuleContexts(Mod_zeileContext.class);
		}
		public Mod_zeileContext mod_zeile(int i) {
			return getRuleContext(Mod_zeileContext.class,i);
		}
		public Modulkopf_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulkopf_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterModulkopf_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitModulkopf_info(this);
		}
	}

	public final Modulkopf_infoContext modulkopf_info() throws RecognitionException {
		Modulkopf_infoContext _localctx = new Modulkopf_infoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_modulkopf_info);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				mod_zeile();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mod_zeileContext extends ParserRuleContext {
		public Mod_anf_zeileContext mod_anf_zeile() {
			return getRuleContext(Mod_anf_zeileContext.class,0);
		}
		public List<Mod_fort_zeileContext> mod_fort_zeile() {
			return getRuleContexts(Mod_fort_zeileContext.class);
		}
		public Mod_fort_zeileContext mod_fort_zeile(int i) {
			return getRuleContext(Mod_fort_zeileContext.class,i);
		}
		public Mod_zeileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_zeile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterMod_zeile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitMod_zeile(this);
		}
	}

	public final Mod_zeileContext mod_zeile() throws RecognitionException {
		Mod_zeileContext _localctx = new Mod_zeileContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mod_zeile);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			mod_anf_zeile();
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(114);
					mod_fort_zeile();
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Mod_anf_zeileContext extends ParserRuleContext {
		public Mod_ele_nameContext mod_ele_name() {
			return getRuleContext(Mod_ele_nameContext.class,0);
		}
		public Mod_ele_wertContext mod_ele_wert() {
			return getRuleContext(Mod_ele_wertContext.class,0);
		}
		public Mod_anf_zeileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_anf_zeile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterMod_anf_zeile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitMod_anf_zeile(this);
		}
	}

	public final Mod_anf_zeileContext mod_anf_zeile() throws RecognitionException {
		Mod_anf_zeileContext _localctx = new Mod_anf_zeileContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mod_anf_zeile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__2);
			setState(121);
			mod_ele_name();
			setState(122);
			mod_ele_wert();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mod_fort_zeileContext extends ParserRuleContext {
		public Mod_ele_wertContext mod_ele_wert() {
			return getRuleContext(Mod_ele_wertContext.class,0);
		}
		public Mod_fort_zeileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_fort_zeile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterMod_fort_zeile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitMod_fort_zeile(this);
		}
	}

	public final Mod_fort_zeileContext mod_fort_zeile() throws RecognitionException {
		Mod_fort_zeileContext _localctx = new Mod_fort_zeileContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mod_fort_zeile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__2);
			setState(125);
			mod_ele_wert();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mod_ele_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DCM_2_0_grammarParser.NAME, 0); }
		public Mod_ele_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_ele_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterMod_ele_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitMod_ele_name(this);
		}
	}

	public final Mod_ele_nameContext mod_ele_name() throws RecognitionException {
		Mod_ele_nameContext _localctx = new Mod_ele_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mod_ele_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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

	public static class Mod_ele_wertContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(DCM_2_0_grammarParser.TEXT, 0); }
		public Mod_ele_wertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_ele_wert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterMod_ele_wert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitMod_ele_wert(this);
		}
	}

	public final Mod_ele_wertContext mod_ele_wert() throws RecognitionException {
		Mod_ele_wertContext _localctx = new Mod_ele_wertContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mod_ele_wert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(TEXT);
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				match(T__0);
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunktionsdefContext extends ParserRuleContext {
		public List<FunktionszeileContext> funktionszeile() {
			return getRuleContexts(FunktionszeileContext.class);
		}
		public FunktionszeileContext funktionszeile(int i) {
			return getRuleContext(FunktionszeileContext.class,i);
		}
		public FunktionsdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funktionsdef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterFunktionsdef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitFunktionsdef(this);
		}
	}

	public final FunktionsdefContext funktionsdef() throws RecognitionException {
		FunktionsdefContext _localctx = new FunktionsdefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funktionsdef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__3);
			setState(136);
			match(T__0);
			setState(138); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				funktionszeile();
				}
				}
				setState(140); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(142);
			match(T__4);
			setState(144); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(143);
				match(T__0);
				}
				}
				setState(146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunktionszeileContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DCM_2_0_grammarParser.NAME, 0); }
		public Fkt_versionContext fkt_version() {
			return getRuleContext(Fkt_versionContext.class,0);
		}
		public Fkt_langnameContext fkt_langname() {
			return getRuleContext(Fkt_langnameContext.class,0);
		}
		public FunktionszeileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funktionszeile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterFunktionszeile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitFunktionszeile(this);
		}
	}

	public final FunktionszeileContext funktionszeile() throws RecognitionException {
		FunktionszeileContext _localctx = new FunktionszeileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funktionszeile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__5);
			setState(149);
			match(NAME);
			setState(150);
			fkt_version();
			setState(151);
			fkt_langname();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fkt_versionContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(DCM_2_0_grammarParser.TEXT, 0); }
		public Fkt_versionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fkt_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterFkt_version(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitFkt_version(this);
		}
	}

	public final Fkt_versionContext fkt_version() throws RecognitionException {
		Fkt_versionContext _localctx = new Fkt_versionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fkt_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fkt_langnameContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(DCM_2_0_grammarParser.TEXT, 0); }
		public Fkt_langnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fkt_langname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterFkt_langname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitFkt_langname(this);
		}
	}

	public final Fkt_langnameContext fkt_langname() throws RecognitionException {
		Fkt_langnameContext _localctx = new Fkt_langnameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_fkt_langname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(TEXT);
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156);
				match(T__0);
				}
				}
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariantendefContext extends ParserRuleContext {
		public List<VariantenkritContext> variantenkrit() {
			return getRuleContexts(VariantenkritContext.class);
		}
		public VariantenkritContext variantenkrit(int i) {
			return getRuleContext(VariantenkritContext.class,i);
		}
		public VariantendefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantendef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterVariantendef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitVariantendef(this);
		}
	}

	public final VariantendefContext variantendef() throws RecognitionException {
		VariantendefContext _localctx = new VariantendefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variantendef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(T__6);
			setState(162);
			match(T__0);
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				variantenkrit();
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
			setState(168);
			match(T__4);
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				match(T__0);
				}
				}
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariantenkritContext extends ParserRuleContext {
		public Krit_nameContext krit_name() {
			return getRuleContext(Krit_nameContext.class,0);
		}
		public List<Krit_wertContext> krit_wert() {
			return getRuleContexts(Krit_wertContext.class);
		}
		public Krit_wertContext krit_wert(int i) {
			return getRuleContext(Krit_wertContext.class,i);
		}
		public VariantenkritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantenkrit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterVariantenkrit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitVariantenkrit(this);
		}
	}

	public final VariantenkritContext variantenkrit() throws RecognitionException {
		VariantenkritContext _localctx = new VariantenkritContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variantenkrit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__7);
			setState(175);
			krit_name();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(176);
				krit_wert();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				match(T__0);
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Krit_nameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DCM_2_0_grammarParser.NAME, 0); }
		public Krit_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_krit_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterKrit_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitKrit_name(this);
		}
	}

	public final Krit_nameContext krit_name() throws RecognitionException {
		Krit_nameContext _localctx = new Krit_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_krit_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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

	public static class Krit_wertContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DCM_2_0_grammarParser.NAME, 0); }
		public Krit_wertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_krit_wert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterKrit_wert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitKrit_wert(this);
		}
	}

	public final Krit_wertContext krit_wert() throws RecognitionException {
		Krit_wertContext _localctx = new Krit_wertContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_krit_wert);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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

	public static class Kons_rumpfContext extends ParserRuleContext {
		public List<KenngroesseContext> kenngroesse() {
			return getRuleContexts(KenngroesseContext.class);
		}
		public KenngroesseContext kenngroesse(int i) {
			return getRuleContext(KenngroesseContext.class,i);
		}
		public Kons_rumpfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kons_rumpf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterKons_rumpf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitKons_rumpf(this);
		}
	}

	public final Kons_rumpfContext kons_rumpf() throws RecognitionException {
		Kons_rumpfContext _localctx = new Kons_rumpfContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_kons_rumpf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) {
				{
				{
				setState(191);
				kenngroesse();
				}
				}
				setState(196);
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

	public static class KenngroesseContext extends ParserRuleContext {
		public KennwertContext kennwert() {
			return getRuleContext(KennwertContext.class,0);
		}
		public KennwerteblockContext kennwerteblock() {
			return getRuleContext(KennwerteblockContext.class,0);
		}
		public KennlinieContext kennlinie() {
			return getRuleContext(KennlinieContext.class,0);
		}
		public KennfeldContext kennfeld() {
			return getRuleContext(KennfeldContext.class,0);
		}
		public GruppenstuetzstellenContext gruppenstuetzstellen() {
			return getRuleContext(GruppenstuetzstellenContext.class,0);
		}
		public KenntextContext kenntext() {
			return getRuleContext(KenntextContext.class,0);
		}
		public KenngroesseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kenngroesse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterKenngroesse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitKenngroesse(this);
		}
	}

	public final KenngroesseContext kenngroesse() throws RecognitionException {
		KenngroesseContext _localctx = new KenngroesseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_kenngroesse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				setState(197);
				kennwert();
				}
				break;
			case T__11:
				{
				setState(198);
				kennwerteblock();
				}
				break;
			case T__12:
			case T__13:
			case T__14:
				{
				setState(199);
				kennlinie();
				}
				break;
			case T__15:
			case T__16:
			case T__17:
				{
				setState(200);
				kennfeld();
				}
				break;
			case T__18:
				{
				setState(201);
				gruppenstuetzstellen();
				}
				break;
			case T__19:
				{
				setState(202);
				kenntext();
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

	public static class KennwertContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DCM_2_0_grammarParser.NAME, 0); }
		public Kgr_infoContext kgr_info() {
			return getRuleContext(Kgr_infoContext.class,0);
		}
		public RealzahlContext realzahl() {
			return getRuleContext(RealzahlContext.class,0);
		}
		public Einheit_wContext einheit_w() {
			return getRuleContext(Einheit_wContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(DCM_2_0_grammarParser.TEXT, 0); }
		public KennwertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kennwert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterKennwert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitKennwert(this);
		}
	}

	public final KennwertContext kennwert() throws RecognitionException {
		KennwertContext _localctx = new KennwertContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_kennwert);
		int _la;
		try {
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(T__8);
				setState(206);
				match(NAME);
				setState(207);
				match(T__0);
				setState(208);
				kgr_info();
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(209);
					einheit_w();
					}
				}

				setState(212);
				match(T__9);
				setState(213);
				realzahl();
				setState(214);
				match(T__0);
				setState(215);
				match(T__4);
				setState(217); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(216);
					match(T__0);
					}
					}
					setState(219); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(T__8);
				setState(222);
				match(NAME);
				setState(223);
				match(T__0);
				setState(224);
				kgr_info();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(225);
					einheit_w();
					}
				}

				setState(228);
				match(T__10);
				setState(229);
				match(TEXT);
				setState(230);
				match(T__0);
				setState(231);
				match(T__4);
				setState(233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(232);
					match(T__0);
					}
					}
					setState(235); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
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

	public static class KennwerteblockContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DCM_2_0_grammarParser.NAME, 0); }
		public Anzahl_xContext anzahl_x() {
			return getRuleContext(Anzahl_xContext.class,0);
		}
		public Kgr_infoContext kgr_info() {
			return getRuleContext(Kgr_infoContext.class,0);
		}
		public Einheit_wContext einheit_w() {
			return getRuleContext(Einheit_wContext.class,0);
		}
		public List<Werteliste_kwbContext> werteliste_kwb() {
			return getRuleContexts(Werteliste_kwbContext.class);
		}
		public Werteliste_kwbContext werteliste_kwb(int i) {
			return getRuleContext(Werteliste_kwbContext.class,i);
		}
		public KennwerteblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kennwerteblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterKennwerteblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitKennwerteblock(this);
		}
	}

	public final KennwerteblockContext kennwerteblock() throws RecognitionException {
		KennwerteblockContext _localctx = new KennwerteblockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_kennwerteblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__11);
			setState(240);
			match(NAME);
			setState(241);
			anzahl_x();
			setState(242);
			match(T__0);
			setState(243);
			kgr_info();
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(244);
				einheit_w();
				}
			}

			setState(248); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(247);
				werteliste_kwb();
				}
				}
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__9 || _la==T__10 );
			setState(252);
			match(T__4);
			setState(254); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(253);
				match(T__0);
				}
				}
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KennlinieContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DCM_2_0_grammarParser.NAME, 0); }
		public Anzahl_xContext anzahl_x() {
			return getRuleContext(Anzahl_xContext.class,0);
		}
		public Kgr_infoContext kgr_info() {
			return getRuleContext(Kgr_infoContext.class,0);
		}
		public Einheit_xContext einheit_x() {
			return getRuleContext(Einheit_xContext.class,0);
		}
		public Einheit_wContext einheit_w() {
			return getRuleContext(Einheit_wContext.class,0);
		}
		public List<Sst_liste_xContext> sst_liste_x() {
			return getRuleContexts(Sst_liste_xContext.class);
		}
		public Sst_liste_xContext sst_liste_x(int i) {
			return getRuleContext(Sst_liste_xContext.class,i);
		}
		public List<WertelisteContext> werteliste() {
			return getRuleContexts(WertelisteContext.class);
		}
		public WertelisteContext werteliste(int i) {
			return getRuleContext(WertelisteContext.class,i);
		}
		public KennlinieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kennlinie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterKennlinie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitKennlinie(this);
		}
	}

	public final KennlinieContext kennlinie() throws RecognitionException {
		KennlinieContext _localctx = new KennlinieContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_kennlinie);
		int _la;
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(258);
				match(T__12);
				}
				setState(259);
				match(NAME);
				setState(260);
				anzahl_x();
				setState(261);
				match(T__0);
				setState(262);
				kgr_info();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(263);
					einheit_x();
					}
				}

				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(266);
					einheit_w();
					}
				}

				setState(270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(269);
					sst_liste_x();
					}
					}
					setState(272); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__29 || _la==T__30 );
				setState(275); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(274);
					werteliste();
					}
					}
					setState(277); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 );
				setState(279);
				match(T__4);
				setState(281); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(280);
					match(T__0);
					}
					}
					setState(283); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(285);
				match(T__13);
				}
				setState(286);
				match(NAME);
				setState(287);
				anzahl_x();
				setState(288);
				match(T__0);
				setState(289);
				kgr_info();
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(290);
					einheit_x();
					}
				}

				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(293);
					einheit_w();
					}
				}

				setState(297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(296);
					sst_liste_x();
					}
					}
					setState(299); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__29 || _la==T__30 );
				setState(302); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(301);
					werteliste();
					}
					}
					setState(304); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 );
				setState(306);
				match(T__4);
				setState(308); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(307);
					match(T__0);
					}
					}
					setState(310); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(312);
				match(T__14);
				}
				setState(313);
				match(NAME);
				setState(314);
				anzahl_x();
				setState(315);
				match(T__0);
				setState(316);
				kgr_info();
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(317);
					einheit_x();
					}
				}

				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(320);
					einheit_w();
					}
				}

				setState(324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(323);
					sst_liste_x();
					}
					}
					setState(326); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__29 || _la==T__30 );
				setState(329); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(328);
					werteliste();
					}
					}
					setState(331); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__9 );
				setState(333);
				match(T__4);
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(334);
					match(T__0);
					}
					}
					setState(337); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
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

	public static class KennfeldContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DCM_2_0_grammarParser.NAME, 0); }
		public Anzahl_xContext anzahl_x() {
			return getRuleContext(Anzahl_xContext.class,0);
		}
		public Anzahl_yContext anzahl_y() {
			return getRuleContext(Anzahl_yContext.class,0);
		}
		public Kgr_infoContext kgr_info() {
			return getRuleContext(Kgr_infoContext.class,0);
		}
		public Kf_zeile_listeContext kf_zeile_liste() {
			return getRuleContext(Kf_zeile_listeContext.class,0);
		}
		public Einheit_xContext einheit_x() {
			return getRuleContext(Einheit_xContext.class,0);
		}
		public Einheit_yContext einheit_y() {
			return getRuleContext(Einheit_yContext.class,0);
		}
		public Einheit_wContext einheit_w() {
			return getRuleContext(Einheit_wContext.class,0);
		}
		public List<Sst_liste_xContext> sst_liste_x() {
			return getRuleContexts(Sst_liste_xContext.class);
		}
		public Sst_liste_xContext sst_liste_x(int i) {
			return getRuleContext(Sst_liste_xContext.class,i);
		}
		public KennfeldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kennfeld; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterKennfeld(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitKennfeld(this);
		}
	}

	public final KennfeldContext kennfeld() throws RecognitionException {
		KennfeldContext _localctx = new KennfeldContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_kennfeld);
		int _la;
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(341);
				match(T__15);
				}
				setState(342);
				match(NAME);
				setState(343);
				anzahl_x();
				setState(344);
				anzahl_y();
				setState(345);
				match(T__0);
				setState(346);
				kgr_info();
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(347);
					einheit_x();
					}
				}

				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(350);
					einheit_y();
					}
				}

				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(353);
					einheit_w();
					}
				}

				setState(357); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(356);
					sst_liste_x();
					}
					}
					setState(359); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__29 || _la==T__30 );
				setState(361);
				kf_zeile_liste();
				setState(362);
				match(T__4);
				setState(364); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(363);
					match(T__0);
					}
					}
					setState(366); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(368);
				match(T__16);
				}
				setState(369);
				match(NAME);
				setState(370);
				anzahl_x();
				setState(371);
				anzahl_y();
				setState(372);
				match(T__0);
				setState(373);
				kgr_info();
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(374);
					einheit_x();
					}
				}

				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(377);
					einheit_y();
					}
				}

				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(380);
					einheit_w();
					}
				}

				setState(384); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(383);
					sst_liste_x();
					}
					}
					setState(386); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__29 || _la==T__30 );
				setState(388);
				kf_zeile_liste();
				setState(389);
				match(T__4);
				setState(391); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(390);
					match(T__0);
					}
					}
					setState(393); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(395);
				match(T__17);
				}
				setState(396);
				match(NAME);
				setState(397);
				anzahl_x();
				setState(398);
				anzahl_y();
				setState(399);
				match(T__0);
				setState(400);
				kgr_info();
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__20) {
					{
					setState(401);
					einheit_x();
					}
				}

				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(404);
					einheit_y();
					}
				}

				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__22) {
					{
					setState(407);
					einheit_w();
					}
				}

				setState(411); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(410);
					sst_liste_x();
					}
					}
					setState(413); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__29 || _la==T__30 );
				setState(415);
				kf_zeile_liste();
				setState(416);
				match(T__4);
				setState(418); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(417);
					match(T__0);
					}
					}
					setState(420); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
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

	public static class GruppenstuetzstellenContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DCM_2_0_grammarParser.NAME, 0); }
		public Anzahl_xContext anzahl_x() {
			return getRuleContext(Anzahl_xContext.class,0);
		}
		public Kgr_infoContext kgr_info() {
			return getRuleContext(Kgr_infoContext.class,0);
		}
		public Einheit_xContext einheit_x() {
			return getRuleContext(Einheit_xContext.class,0);
		}
		public List<Sst_liste_xContext> sst_liste_x() {
			return getRuleContexts(Sst_liste_xContext.class);
		}
		public Sst_liste_xContext sst_liste_x(int i) {
			return getRuleContext(Sst_liste_xContext.class,i);
		}
		public GruppenstuetzstellenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gruppenstuetzstellen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterGruppenstuetzstellen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitGruppenstuetzstellen(this);
		}
	}

	public final GruppenstuetzstellenContext gruppenstuetzstellen() throws RecognitionException {
		GruppenstuetzstellenContext _localctx = new GruppenstuetzstellenContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_gruppenstuetzstellen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(T__18);
			setState(425);
			match(NAME);
			setState(426);
			anzahl_x();
			setState(427);
			match(T__0);
			setState(428);
			kgr_info();
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(429);
				einheit_x();
				}
			}

			setState(433); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(432);
				sst_liste_x();
				}
				}
				setState(435); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__29 || _la==T__30 );
			setState(437);
			match(T__4);
			setState(439); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(438);
				match(T__0);
				}
				}
				setState(441); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KenntextContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DCM_2_0_grammarParser.NAME, 0); }
		public Kgr_infoContext kgr_info() {
			return getRuleContext(Kgr_infoContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(DCM_2_0_grammarParser.TEXT, 0); }
		public KenntextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kenntext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterKenntext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitKenntext(this);
		}
	}

	public final KenntextContext kenntext() throws RecognitionException {
		KenntextContext _localctx = new KenntextContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_kenntext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(T__19);
			setState(444);
			match(NAME);
			setState(445);
			match(T__0);
			setState(446);
			kgr_info();
			setState(447);
			match(T__10);
			setState(448);
			match(TEXT);
			setState(449);
			match(T__0);
			setState(450);
			match(T__4);
			setState(452); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(451);
				match(T__0);
				}
				}
				setState(454); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kgr_infoContext extends ParserRuleContext {
		public LangnameContext langname() {
			return getRuleContext(LangnameContext.class,0);
		}
		public DisplaynameContext displayname() {
			return getRuleContext(DisplaynameContext.class,0);
		}
		public Var_abhangigkeitenContext var_abhangigkeiten() {
			return getRuleContext(Var_abhangigkeitenContext.class,0);
		}
		public FunktionszugehorigkeitContext funktionszugehorigkeit() {
			return getRuleContext(FunktionszugehorigkeitContext.class,0);
		}
		public Kgr_infoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kgr_info; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterKgr_info(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitKgr_info(this);
		}
	}

	public final Kgr_infoContext kgr_info() throws RecognitionException {
		Kgr_infoContext _localctx = new Kgr_infoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_kgr_info);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(456);
				langname();
				}
			}

			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(459);
				displayname();
				}
			}

			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(462);
				var_abhangigkeiten();
				}
			}

			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(465);
				funktionszugehorigkeit();
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

	public static class Einheit_xContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(DCM_2_0_grammarParser.TEXT, 0); }
		public Einheit_xContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_einheit_x; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterEinheit_x(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitEinheit_x(this);
		}
	}

	public final Einheit_xContext einheit_x() throws RecognitionException {
		Einheit_xContext _localctx = new Einheit_xContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_einheit_x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(T__20);
			setState(469);
			match(TEXT);
			setState(470);
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

	public static class Einheit_yContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(DCM_2_0_grammarParser.TEXT, 0); }
		public Einheit_yContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_einheit_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterEinheit_y(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitEinheit_y(this);
		}
	}

	public final Einheit_yContext einheit_y() throws RecognitionException {
		Einheit_yContext _localctx = new Einheit_yContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_einheit_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(T__21);
			setState(473);
			match(TEXT);
			setState(474);
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

	public static class Einheit_wContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(DCM_2_0_grammarParser.TEXT, 0); }
		public Einheit_wContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_einheit_w; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterEinheit_w(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitEinheit_w(this);
		}
	}

	public final Einheit_wContext einheit_w() throws RecognitionException {
		Einheit_wContext _localctx = new Einheit_wContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_einheit_w);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(T__22);
			setState(477);
			match(TEXT);
			setState(478);
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

	public static class LangnameContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(DCM_2_0_grammarParser.TEXT, 0); }
		public LangnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_langname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterLangname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitLangname(this);
		}
	}

	public final LangnameContext langname() throws RecognitionException {
		LangnameContext _localctx = new LangnameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_langname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			match(T__23);
			setState(481);
			match(TEXT);
			setState(482);
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

	public static class DisplaynameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(DCM_2_0_grammarParser.NAME, 0); }
		public TerminalNode TEXT() { return getToken(DCM_2_0_grammarParser.TEXT, 0); }
		public DisplaynameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterDisplayname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitDisplayname(this);
		}
	}

	public final DisplaynameContext displayname() throws RecognitionException {
		DisplaynameContext _localctx = new DisplaynameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_displayname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(T__24);
			setState(485);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(486);
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

	public static class Var_abhangigkeitenContext extends ParserRuleContext {
		public List<Var_abhContext> var_abh() {
			return getRuleContexts(Var_abhContext.class);
		}
		public Var_abhContext var_abh(int i) {
			return getRuleContext(Var_abhContext.class,i);
		}
		public Var_abhangigkeitenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_abhangigkeiten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterVar_abhangigkeiten(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitVar_abhangigkeiten(this);
		}
	}

	public final Var_abhangigkeitenContext var_abhangigkeiten() throws RecognitionException {
		Var_abhangigkeitenContext _localctx = new Var_abhangigkeitenContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_var_abhangigkeiten);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488);
			match(T__25);
			setState(489);
			var_abh();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__26) {
				{
				{
				setState(490);
				match(T__26);
				setState(491);
				var_abh();
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(497);
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

	public static class Var_abhContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(DCM_2_0_grammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(DCM_2_0_grammarParser.NAME, i);
		}
		public Var_abhContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_abh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterVar_abh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitVar_abh(this);
		}
	}

	public final Var_abhContext var_abh() throws RecognitionException {
		Var_abhContext _localctx = new Var_abhContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_var_abh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(NAME);
			setState(500);
			match(T__27);
			setState(501);
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

	public static class FunktionszugehorigkeitContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(DCM_2_0_grammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(DCM_2_0_grammarParser.NAME, i);
		}
		public FunktionszugehorigkeitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funktionszugehorigkeit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterFunktionszugehorigkeit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitFunktionszugehorigkeit(this);
		}
	}

	public final FunktionszugehorigkeitContext funktionszugehorigkeit() throws RecognitionException {
		FunktionszugehorigkeitContext _localctx = new FunktionszugehorigkeitContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_funktionszugehorigkeit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			match(T__28);
			setState(505); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(504);
				match(NAME);
				}
				}
				setState(507); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(509);
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

	public static class Anzahl_xContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DCM_2_0_grammarParser.INT, 0); }
		public Anzahl_xContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anzahl_x; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterAnzahl_x(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitAnzahl_x(this);
		}
	}

	public final Anzahl_xContext anzahl_x() throws RecognitionException {
		Anzahl_xContext _localctx = new Anzahl_xContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_anzahl_x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anzahl_yContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DCM_2_0_grammarParser.INT, 0); }
		public Anzahl_yContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anzahl_y; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterAnzahl_y(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitAnzahl_y(this);
		}
	}

	public final Anzahl_yContext anzahl_y() throws RecognitionException {
		Anzahl_yContext _localctx = new Anzahl_yContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_anzahl_y);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WertelisteContext extends ParserRuleContext {
		public List<RealzahlContext> realzahl() {
			return getRuleContexts(RealzahlContext.class);
		}
		public RealzahlContext realzahl(int i) {
			return getRuleContext(RealzahlContext.class,i);
		}
		public WertelisteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_werteliste; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterWerteliste(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitWerteliste(this);
		}
	}

	public final WertelisteContext werteliste() throws RecognitionException {
		WertelisteContext _localctx = new WertelisteContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_werteliste);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(T__9);
			setState(517); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(516);
				realzahl();
				}
				}
				setState(519); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT || _la==FLOAT );
			setState(521);
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

	public static class Werteliste_kwbContext extends ParserRuleContext {
		public List<RealzahlContext> realzahl() {
			return getRuleContexts(RealzahlContext.class);
		}
		public RealzahlContext realzahl(int i) {
			return getRuleContext(RealzahlContext.class,i);
		}
		public List<TerminalNode> TEXT() { return getTokens(DCM_2_0_grammarParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(DCM_2_0_grammarParser.TEXT, i);
		}
		public Werteliste_kwbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_werteliste_kwb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterWerteliste_kwb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitWerteliste_kwb(this);
		}
	}

	public final Werteliste_kwbContext werteliste_kwb() throws RecognitionException {
		Werteliste_kwbContext _localctx = new Werteliste_kwbContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_werteliste_kwb);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				setState(523);
				match(T__9);
				setState(525); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(524);
					realzahl();
					}
					}
					setState(527); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT || _la==FLOAT );
				setState(529);
				match(T__0);
				}
				break;
			case T__10:
				{
				setState(531);
				match(T__10);
				setState(533); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(532);
					match(TEXT);
					}
					}
					setState(535); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				setState(537);
				match(T__0);
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

	public static class Sst_liste_xContext extends ParserRuleContext {
		public List<RealzahlContext> realzahl() {
			return getRuleContexts(RealzahlContext.class);
		}
		public RealzahlContext realzahl(int i) {
			return getRuleContext(RealzahlContext.class,i);
		}
		public List<TerminalNode> TEXT() { return getTokens(DCM_2_0_grammarParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(DCM_2_0_grammarParser.TEXT, i);
		}
		public Sst_liste_xContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sst_liste_x; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterSst_liste_x(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitSst_liste_x(this);
		}
	}

	public final Sst_liste_xContext sst_liste_x() throws RecognitionException {
		Sst_liste_xContext _localctx = new Sst_liste_xContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sst_liste_x);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
				{
				setState(540);
				match(T__29);
				setState(542); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(541);
					realzahl();
					}
					}
					setState(544); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT || _la==FLOAT );
				setState(546);
				match(T__0);
				}
				break;
			case T__30:
				{
				setState(548);
				match(T__30);
				setState(550); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(549);
					match(TEXT);
					}
					}
					setState(552); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				setState(554);
				match(T__0);
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

	public static class Kf_zeile_listeContext extends ParserRuleContext {
		public List<Kf_zeile_liste_rContext> kf_zeile_liste_r() {
			return getRuleContexts(Kf_zeile_liste_rContext.class);
		}
		public Kf_zeile_liste_rContext kf_zeile_liste_r(int i) {
			return getRuleContext(Kf_zeile_liste_rContext.class,i);
		}
		public List<Kf_zeile_liste_txContext> kf_zeile_liste_tx() {
			return getRuleContexts(Kf_zeile_liste_txContext.class);
		}
		public Kf_zeile_liste_txContext kf_zeile_liste_tx(int i) {
			return getRuleContext(Kf_zeile_liste_txContext.class,i);
		}
		public Kf_zeile_listeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kf_zeile_liste; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterKf_zeile_liste(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitKf_zeile_liste(this);
		}
	}

	public final Kf_zeile_listeContext kf_zeile_liste() throws RecognitionException {
		Kf_zeile_listeContext _localctx = new Kf_zeile_listeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_kf_zeile_liste);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__31:
				{
				setState(558); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(557);
					kf_zeile_liste_r();
					}
					}
					setState(560); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__31 );
				}
				break;
			case T__32:
				{
				setState(563); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(562);
					kf_zeile_liste_tx();
					}
					}
					setState(565); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__32 );
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

	public static class Kf_zeile_liste_rContext extends ParserRuleContext {
		public RealzahlContext realzahl() {
			return getRuleContext(RealzahlContext.class,0);
		}
		public List<WertelisteContext> werteliste() {
			return getRuleContexts(WertelisteContext.class);
		}
		public WertelisteContext werteliste(int i) {
			return getRuleContext(WertelisteContext.class,i);
		}
		public Kf_zeile_liste_rContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kf_zeile_liste_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterKf_zeile_liste_r(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitKf_zeile_liste_r(this);
		}
	}

	public final Kf_zeile_liste_rContext kf_zeile_liste_r() throws RecognitionException {
		Kf_zeile_liste_rContext _localctx = new Kf_zeile_liste_rContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_kf_zeile_liste_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(569);
			match(T__31);
			setState(570);
			realzahl();
			setState(571);
			match(T__0);
			setState(573); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(572);
				werteliste();
				}
				}
				setState(575); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__9 );
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

	public static class Kf_zeile_liste_txContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(DCM_2_0_grammarParser.TEXT, 0); }
		public List<WertelisteContext> werteliste() {
			return getRuleContexts(WertelisteContext.class);
		}
		public WertelisteContext werteliste(int i) {
			return getRuleContext(WertelisteContext.class,i);
		}
		public Kf_zeile_liste_txContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kf_zeile_liste_tx; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterKf_zeile_liste_tx(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitKf_zeile_liste_tx(this);
		}
	}

	public final Kf_zeile_liste_txContext kf_zeile_liste_tx() throws RecognitionException {
		Kf_zeile_liste_txContext _localctx = new Kf_zeile_liste_txContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_kf_zeile_liste_tx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(577);
			match(T__32);
			setState(578);
			match(TEXT);
			setState(579);
			match(T__0);
			setState(581); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(580);
				werteliste();
				}
				}
				setState(583); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__9 );
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

	public static class RealzahlContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(DCM_2_0_grammarParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(DCM_2_0_grammarParser.FLOAT, 0); }
		public RealzahlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realzahl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).enterRealzahl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DCM_2_0_grammarListener ) ((DCM_2_0_grammarListener)listener).exitRealzahl(this);
		}
	}

	public final RealzahlContext realzahl() throws RecognitionException {
		RealzahlContext _localctx = new RealzahlContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_realzahl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u024e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\7\2X\n\2\f\2\16\2[\13\2\3\2\3\2\6\2_\n\2\r\2\16\2`\3\2\3\2\3\2\3\3"+
		"\5\3g\n\3\3\3\5\3j\n\3\3\3\5\3m\n\3\3\4\6\4p\n\4\r\4\16\4q\3\5\3\5\7\5"+
		"v\n\5\f\5\16\5y\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\6\t\u0086"+
		"\n\t\r\t\16\t\u0087\3\n\3\n\3\n\6\n\u008d\n\n\r\n\16\n\u008e\3\n\3\n\6"+
		"\n\u0093\n\n\r\n\16\n\u0094\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\6"+
		"\r\u00a0\n\r\r\r\16\r\u00a1\3\16\3\16\3\16\6\16\u00a7\n\16\r\16\16\16"+
		"\u00a8\3\16\3\16\6\16\u00ad\n\16\r\16\16\16\u00ae\3\17\3\17\3\17\7\17"+
		"\u00b4\n\17\f\17\16\17\u00b7\13\17\3\17\6\17\u00ba\n\17\r\17\16\17\u00bb"+
		"\3\20\3\20\3\21\3\21\3\22\7\22\u00c3\n\22\f\22\16\22\u00c6\13\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00ce\n\23\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00d5\n\24\3\24\3\24\3\24\3\24\3\24\6\24\u00dc\n\24\r\24\16\24\u00dd"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u00e5\n\24\3\24\3\24\3\24\3\24\3\24\6\24"+
		"\u00ec\n\24\r\24\16\24\u00ed\5\24\u00f0\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u00f8\n\25\3\25\6\25\u00fb\n\25\r\25\16\25\u00fc\3\25\3\25"+
		"\6\25\u0101\n\25\r\25\16\25\u0102\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u010b"+
		"\n\26\3\26\5\26\u010e\n\26\3\26\6\26\u0111\n\26\r\26\16\26\u0112\3\26"+
		"\6\26\u0116\n\26\r\26\16\26\u0117\3\26\3\26\6\26\u011c\n\26\r\26\16\26"+
		"\u011d\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0126\n\26\3\26\5\26\u0129\n"+
		"\26\3\26\6\26\u012c\n\26\r\26\16\26\u012d\3\26\6\26\u0131\n\26\r\26\16"+
		"\26\u0132\3\26\3\26\6\26\u0137\n\26\r\26\16\26\u0138\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u0141\n\26\3\26\5\26\u0144\n\26\3\26\6\26\u0147\n\26"+
		"\r\26\16\26\u0148\3\26\6\26\u014c\n\26\r\26\16\26\u014d\3\26\3\26\6\26"+
		"\u0152\n\26\r\26\16\26\u0153\5\26\u0156\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u015f\n\27\3\27\5\27\u0162\n\27\3\27\5\27\u0165\n\27\3"+
		"\27\6\27\u0168\n\27\r\27\16\27\u0169\3\27\3\27\3\27\6\27\u016f\n\27\r"+
		"\27\16\27\u0170\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u017a\n\27\3\27"+
		"\5\27\u017d\n\27\3\27\5\27\u0180\n\27\3\27\6\27\u0183\n\27\r\27\16\27"+
		"\u0184\3\27\3\27\3\27\6\27\u018a\n\27\r\27\16\27\u018b\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0195\n\27\3\27\5\27\u0198\n\27\3\27\5\27\u019b"+
		"\n\27\3\27\6\27\u019e\n\27\r\27\16\27\u019f\3\27\3\27\3\27\6\27\u01a5"+
		"\n\27\r\27\16\27\u01a6\5\27\u01a9\n\27\3\30\3\30\3\30\3\30\3\30\3\30\5"+
		"\30\u01b1\n\30\3\30\6\30\u01b4\n\30\r\30\16\30\u01b5\3\30\3\30\6\30\u01ba"+
		"\n\30\r\30\16\30\u01bb\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\6"+
		"\31\u01c7\n\31\r\31\16\31\u01c8\3\32\5\32\u01cc\n\32\3\32\5\32\u01cf\n"+
		"\32\3\32\5\32\u01d2\n\32\3\32\5\32\u01d5\n\32\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \7 \u01ef\n \f \16 \u01f2\13 \3 \3 \3!\3!\3!\3!\3\"\3"+
		"\"\6\"\u01fc\n\"\r\"\16\"\u01fd\3\"\3\"\3#\3#\3$\3$\3%\3%\6%\u0208\n%"+
		"\r%\16%\u0209\3%\3%\3&\3&\6&\u0210\n&\r&\16&\u0211\3&\3&\3&\3&\6&\u0218"+
		"\n&\r&\16&\u0219\3&\5&\u021d\n&\3\'\3\'\6\'\u0221\n\'\r\'\16\'\u0222\3"+
		"\'\3\'\3\'\3\'\6\'\u0229\n\'\r\'\16\'\u022a\3\'\5\'\u022e\n\'\3(\6(\u0231"+
		"\n(\r(\16(\u0232\3(\6(\u0236\n(\r(\16(\u0237\5(\u023a\n(\3)\3)\3)\3)\6"+
		")\u0240\n)\r)\16)\u0241\3*\3*\3*\3*\6*\u0248\n*\r*\16*\u0249\3+\3+\3+"+
		"\2\2,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BDFHJLNPRT\2\4\3\2$%\3\2&\'\2\u0278\2Y\3\2\2\2\4f\3\2\2\2\6o\3\2\2\2"+
		"\bs\3\2\2\2\nz\3\2\2\2\f~\3\2\2\2\16\u0081\3\2\2\2\20\u0083\3\2\2\2\22"+
		"\u0089\3\2\2\2\24\u0096\3\2\2\2\26\u009b\3\2\2\2\30\u009d\3\2\2\2\32\u00a3"+
		"\3\2\2\2\34\u00b0\3\2\2\2\36\u00bd\3\2\2\2 \u00bf\3\2\2\2\"\u00c4\3\2"+
		"\2\2$\u00cd\3\2\2\2&\u00ef\3\2\2\2(\u00f1\3\2\2\2*\u0155\3\2\2\2,\u01a8"+
		"\3\2\2\2.\u01aa\3\2\2\2\60\u01bd\3\2\2\2\62\u01cb\3\2\2\2\64\u01d6\3\2"+
		"\2\2\66\u01da\3\2\2\28\u01de\3\2\2\2:\u01e2\3\2\2\2<\u01e6\3\2\2\2>\u01ea"+
		"\3\2\2\2@\u01f5\3\2\2\2B\u01f9\3\2\2\2D\u0201\3\2\2\2F\u0203\3\2\2\2H"+
		"\u0205\3\2\2\2J\u021c\3\2\2\2L\u022d\3\2\2\2N\u0239\3\2\2\2P\u023b\3\2"+
		"\2\2R\u0243\3\2\2\2T\u024b\3\2\2\2VX\7\3\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\^\7\4\2\2]_\7\3\2\2^]\3\2\2\2_`\3"+
		"\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\5\4\3\2cd\5\"\22\2d\3\3\2\2\2e"+
		"g\5\6\4\2fe\3\2\2\2fg\3\2\2\2gi\3\2\2\2hj\5\22\n\2ih\3\2\2\2ij\3\2\2\2"+
		"jl\3\2\2\2km\5\32\16\2lk\3\2\2\2lm\3\2\2\2m\5\3\2\2\2np\5\b\5\2on\3\2"+
		"\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\7\3\2\2\2sw\5\n\6\2tv\5\f\7\2ut\3"+
		"\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\t\3\2\2\2yw\3\2\2\2z{\7\5\2\2{|"+
		"\5\16\b\2|}\5\20\t\2}\13\3\2\2\2~\177\7\5\2\2\177\u0080\5\20\t\2\u0080"+
		"\r\3\2\2\2\u0081\u0082\7$\2\2\u0082\17\3\2\2\2\u0083\u0085\7%\2\2\u0084"+
		"\u0086\7\3\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\21\3\2\2\2\u0089\u008a\7\6\2\2\u008a\u008c"+
		"\7\3\2\2\u008b\u008d\5\24\13\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2"+
		"\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092"+
		"\7\7\2\2\u0091\u0093\7\3\2\2\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\23\3\2\2\2\u0096\u0097\7\b\2"+
		"\2\u0097\u0098\7$\2\2\u0098\u0099\5\26\f\2\u0099\u009a\5\30\r\2\u009a"+
		"\25\3\2\2\2\u009b\u009c\7%\2\2\u009c\27\3\2\2\2\u009d\u009f\7%\2\2\u009e"+
		"\u00a0\7\3\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\31\3\2\2\2\u00a3\u00a4\7\t\2\2\u00a4\u00a6"+
		"\7\3\2\2\u00a5\u00a7\5\34\17\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2"+
		"\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac"+
		"\7\7\2\2\u00ab\u00ad\7\3\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\33\3\2\2\2\u00b0\u00b1\7\n\2"+
		"\2\u00b1\u00b5\5\36\20\2\u00b2\u00b4\5 \21\2\u00b3\u00b2\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\7\3\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\35\3\2\2"+
		"\2\u00bd\u00be\7$\2\2\u00be\37\3\2\2\2\u00bf\u00c0\7$\2\2\u00c0!\3\2\2"+
		"\2\u00c1\u00c3\5$\23\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5#\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7"+
		"\u00ce\5&\24\2\u00c8\u00ce\5(\25\2\u00c9\u00ce\5*\26\2\u00ca\u00ce\5,"+
		"\27\2\u00cb\u00ce\5.\30\2\u00cc\u00ce\5\60\31\2\u00cd\u00c7\3\2\2\2\u00cd"+
		"\u00c8\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00cd\u00cc\3\2\2\2\u00ce%\3\2\2\2\u00cf\u00d0\7\13\2\2\u00d0\u00d1"+
		"\7$\2\2\u00d1\u00d2\7\3\2\2\u00d2\u00d4\5\62\32\2\u00d3\u00d5\58\35\2"+
		"\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7"+
		"\7\f\2\2\u00d7\u00d8\5T+\2\u00d8\u00d9\7\3\2\2\u00d9\u00db\7\7\2\2\u00da"+
		"\u00dc\7\3\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00f0\3\2\2\2\u00df\u00e0\7\13\2\2\u00e0"+
		"\u00e1\7$\2\2\u00e1\u00e2\7\3\2\2\u00e2\u00e4\5\62\32\2\u00e3\u00e5\5"+
		"8\35\2\u00e4\u00e3\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\7\r\2\2\u00e7\u00e8\7%\2\2\u00e8\u00e9\7\3\2\2\u00e9\u00eb\7\7"+
		"\2\2\u00ea\u00ec\7\3\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00cf\3\2"+
		"\2\2\u00ef\u00df\3\2\2\2\u00f0\'\3\2\2\2\u00f1\u00f2\7\16\2\2\u00f2\u00f3"+
		"\7$\2\2\u00f3\u00f4\5D#\2\u00f4\u00f5\7\3\2\2\u00f5\u00f7\5\62\32\2\u00f6"+
		"\u00f8\58\35\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2"+
		"\2\2\u00f9\u00fb\5J&\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\7\7\2\2\u00ff"+
		"\u0101\7\3\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103)\3\2\2\2\u0104\u0105\7\17\2\2\u0105\u0106"+
		"\7$\2\2\u0106\u0107\5D#\2\u0107\u0108\7\3\2\2\u0108\u010a\5\62\32\2\u0109"+
		"\u010b\5\64\33\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3"+
		"\2\2\2\u010c\u010e\58\35\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u0110\3\2\2\2\u010f\u0111\5L\'\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114"+
		"\u0116\5H%\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0115\3\2\2"+
		"\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\7\7\2\2\u011a\u011c"+
		"\7\3\2\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u0156\3\2\2\2\u011f\u0120\7\20\2\2\u0120\u0121\7"+
		"$\2\2\u0121\u0122\5D#\2\u0122\u0123\7\3\2\2\u0123\u0125\5\62\32\2\u0124"+
		"\u0126\5\64\33\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3"+
		"\2\2\2\u0127\u0129\58\35\2\u0128\u0127\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012b\3\2\2\2\u012a\u012c\5L\'\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f"+
		"\u0131\5H%\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0130\3\2\2"+
		"\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\7\7\2\2\u0135\u0137"+
		"\7\3\2\2\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u0156\3\2\2\2\u013a\u013b\7\21\2\2\u013b\u013c\7"+
		"$\2\2\u013c\u013d\5D#\2\u013d\u013e\7\3\2\2\u013e\u0140\5\62\32\2\u013f"+
		"\u0141\5\64\33\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3"+
		"\2\2\2\u0142\u0144\58\35\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0146\3\2\2\2\u0145\u0147\5L\'\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2"+
		"\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a"+
		"\u014c\5H%\2\u014b\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014b\3\2\2"+
		"\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\7\7\2\2\u0150\u0152"+
		"\7\3\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0151\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155\u0104\3\2\2\2\u0155\u011f\3\2"+
		"\2\2\u0155\u013a\3\2\2\2\u0156+\3\2\2\2\u0157\u0158\7\22\2\2\u0158\u0159"+
		"\7$\2\2\u0159\u015a\5D#\2\u015a\u015b\5F$\2\u015b\u015c\7\3\2\2\u015c"+
		"\u015e\5\62\32\2\u015d\u015f\5\64\33\2\u015e\u015d\3\2\2\2\u015e\u015f"+
		"\3\2\2\2\u015f\u0161\3\2\2\2\u0160\u0162\5\66\34\2\u0161\u0160\3\2\2\2"+
		"\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0165\58\35\2\u0164\u0163"+
		"\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0168\5L\'\2\u0167"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b\u016c\5N(\2\u016c\u016e\7\7\2\2\u016d\u016f"+
		"\7\3\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u01a9\3\2\2\2\u0172\u0173\7\23\2\2\u0173\u0174\7"+
		"$\2\2\u0174\u0175\5D#\2\u0175\u0176\5F$\2\u0176\u0177\7\3\2\2\u0177\u0179"+
		"\5\62\32\2\u0178\u017a\5\64\33\2\u0179\u0178\3\2\2\2\u0179\u017a\3\2\2"+
		"\2\u017a\u017c\3\2\2\2\u017b\u017d\5\66\34\2\u017c\u017b\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u0180\58\35\2\u017f\u017e\3\2"+
		"\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u0183\5L\'\2\u0182"+
		"\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u0186\3\2\2\2\u0186\u0187\5N(\2\u0187\u0189\7\7\2\2\u0188\u018a"+
		"\7\3\2\2\u0189\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u01a9\3\2\2\2\u018d\u018e\7\24\2\2\u018e\u018f\7"+
		"$\2\2\u018f\u0190\5D#\2\u0190\u0191\5F$\2\u0191\u0192\7\3\2\2\u0192\u0194"+
		"\5\62\32\2\u0193\u0195\5\64\33\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2"+
		"\2\u0195\u0197\3\2\2\2\u0196\u0198\5\66\34\2\u0197\u0196\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u019b\58\35\2\u019a\u0199\3\2"+
		"\2\2\u019a\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019e\5L\'\2\u019d"+
		"\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2"+
		"\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\5N(\2\u01a2\u01a4\7\7\2\2\u01a3\u01a5"+
		"\7\3\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u0157\3\2\2\2\u01a8\u0172\3\2"+
		"\2\2\u01a8\u018d\3\2\2\2\u01a9-\3\2\2\2\u01aa\u01ab\7\25\2\2\u01ab\u01ac"+
		"\7$\2\2\u01ac\u01ad\5D#\2\u01ad\u01ae\7\3\2\2\u01ae\u01b0\5\62\32\2\u01af"+
		"\u01b1\5\64\33\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3"+
		"\2\2\2\u01b2\u01b4\5L\'\2\u01b3\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b9\7\7"+
		"\2\2\u01b8\u01ba\7\3\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb"+
		"\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc/\3\2\2\2\u01bd\u01be\7\26\2\2"+
		"\u01be\u01bf\7$\2\2\u01bf\u01c0\7\3\2\2\u01c0\u01c1\5\62\32\2\u01c1\u01c2"+
		"\7\r\2\2\u01c2\u01c3\7%\2\2\u01c3\u01c4\7\3\2\2\u01c4\u01c6\7\7\2\2\u01c5"+
		"\u01c7\7\3\2\2\u01c6\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c6\3\2"+
		"\2\2\u01c8\u01c9\3\2\2\2\u01c9\61\3\2\2\2\u01ca\u01cc\5:\36\2\u01cb\u01ca"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cf\5<\37\2\u01ce"+
		"\u01cd\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01d2\5>"+
		" \2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3"+
		"\u01d5\5B\"\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\63\3\2\2\2"+
		"\u01d6\u01d7\7\27\2\2\u01d7\u01d8\7%\2\2\u01d8\u01d9\7\3\2\2\u01d9\65"+
		"\3\2\2\2\u01da\u01db\7\30\2\2\u01db\u01dc\7%\2\2\u01dc\u01dd\7\3\2\2\u01dd"+
		"\67\3\2\2\2\u01de\u01df\7\31\2\2\u01df\u01e0\7%\2\2\u01e0\u01e1\7\3\2"+
		"\2\u01e19\3\2\2\2\u01e2\u01e3\7\32\2\2\u01e3\u01e4\7%\2\2\u01e4\u01e5"+
		"\7\3\2\2\u01e5;\3\2\2\2\u01e6\u01e7\7\33\2\2\u01e7\u01e8\t\2\2\2\u01e8"+
		"\u01e9\7\3\2\2\u01e9=\3\2\2\2\u01ea\u01eb\7\34\2\2\u01eb\u01f0\5@!\2\u01ec"+
		"\u01ed\7\35\2\2\u01ed\u01ef\5@!\2\u01ee\u01ec\3\2\2\2\u01ef\u01f2\3\2"+
		"\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\3\2\2\2\u01f2"+
		"\u01f0\3\2\2\2\u01f3\u01f4\7\3\2\2\u01f4?\3\2\2\2\u01f5\u01f6\7$\2\2\u01f6"+
		"\u01f7\7\36\2\2\u01f7\u01f8\7$\2\2\u01f8A\3\2\2\2\u01f9\u01fb\7\37\2\2"+
		"\u01fa\u01fc\7$\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fb"+
		"\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\7\3\2\2\u0200"+
		"C\3\2\2\2\u0201\u0202\7&\2\2\u0202E\3\2\2\2\u0203\u0204\7&\2\2\u0204G"+
		"\3\2\2\2\u0205\u0207\7\f\2\2\u0206\u0208\5T+\2\u0207\u0206\3\2\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b\u020c\7\3\2\2\u020cI\3\2\2\2\u020d\u020f\7\f\2\2\u020e\u0210"+
		"\5T+\2\u020f\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u020f\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\7\3\2\2\u0214\u021d\3\2"+
		"\2\2\u0215\u0217\7\r\2\2\u0216\u0218\7%\2\2\u0217\u0216\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\3\2"+
		"\2\2\u021b\u021d\7\3\2\2\u021c\u020d\3\2\2\2\u021c\u0215\3\2\2\2\u021d"+
		"K\3\2\2\2\u021e\u0220\7 \2\2\u021f\u0221\5T+\2\u0220\u021f\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224\u0225\7\3\2\2\u0225\u022e\3\2\2\2\u0226\u0228\7!\2\2\u0227"+
		"\u0229\7%\2\2\u0228\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u0228\3\2"+
		"\2\2\u022a\u022b\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\7\3\2\2\u022d"+
		"\u021e\3\2\2\2\u022d\u0226\3\2\2\2\u022eM\3\2\2\2\u022f\u0231\5P)\2\u0230"+
		"\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2"+
		"\2\2\u0233\u023a\3\2\2\2\u0234\u0236\5R*\2\u0235\u0234\3\2\2\2\u0236\u0237"+
		"\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239"+
		"\u0230\3\2\2\2\u0239\u0235\3\2\2\2\u023aO\3\2\2\2\u023b\u023c\7\"\2\2"+
		"\u023c\u023d\5T+\2\u023d\u023f\7\3\2\2\u023e\u0240\5H%\2\u023f\u023e\3"+
		"\2\2\2\u0240\u0241\3\2\2\2\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"Q\3\2\2\2\u0243\u0244\7#\2\2\u0244\u0245\7%\2\2\u0245\u0247\7\3\2\2\u0246"+
		"\u0248\5H%\2\u0247\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0247\3\2\2"+
		"\2\u0249\u024a\3\2\2\2\u024aS\3\2\2\2\u024b\u024c\t\3\2\2\u024cU\3\2\2"+
		"\2QY`filqw\u0087\u008e\u0094\u00a1\u00a8\u00ae\u00b5\u00bb\u00c4\u00cd"+
		"\u00d4\u00dd\u00e4\u00ed\u00ef\u00f7\u00fc\u0102\u010a\u010d\u0112\u0117"+
		"\u011d\u0125\u0128\u012d\u0132\u0138\u0140\u0143\u0148\u014d\u0153\u0155"+
		"\u015e\u0161\u0164\u0169\u0170\u0179\u017c\u017f\u0184\u018b\u0194\u0197"+
		"\u019a\u019f\u01a6\u01a8\u01b0\u01b5\u01bb\u01c8\u01cb\u01ce\u01d1\u01d4"+
		"\u01f0\u01fd\u0209\u0211\u0219\u021c\u0222\u022a\u022d\u0232\u0237\u0239"+
		"\u0241\u0249";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}