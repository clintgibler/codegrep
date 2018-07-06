// Generated from gtin/gtin.g4 by ANTLR 4.7.1
package parsers.gtin;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gtinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DIGIT_0=1, DIGIT_1=2, DIGIT_2=3, DIGIT_3=4, DIGIT_4=5, DIGIT_5=6, DIGIT_6=7, 
		DIGIT_7=8, DIGIT_8=9, DIGIT_9=10, HYPHEN=11, WS=12;
	public static final int
		RULE_gtin = 0, RULE_gtin8 = 1, RULE_ean8 = 2, RULE_gtin12 = 3, RULE_gtin13 = 4, 
		RULE_gtin14 = 5, RULE_upc = 6, RULE_upc_a = 7, RULE_upc_a_manufacturer = 8, 
		RULE_upc_a_product = 9, RULE_upc_a_5 = 10, RULE_upc_e = 11, RULE_num_system = 12, 
		RULE_check_code = 13, RULE_supplemental_code = 14, RULE_supplemental_code_5 = 15, 
		RULE_supplemental_code_2 = 16, RULE_ean13 = 17, RULE_ean13_generic = 18, 
		RULE_ean13_ismn = 19, RULE_gs1_prefix_ismn = 20, RULE_ismn_publisher_number = 21, 
		RULE_ismn_item_number = 22, RULE_ean13_bookland = 23, RULE_bookland_isbn = 24, 
		RULE_gs1_prefix_bookland_1 = 25, RULE_gs1_prefix_bookland_2 = 26, RULE_gs1_prefix_issn = 27, 
		RULE_ean13_issn = 28, RULE_issn = 29, RULE_ean_13_manprod = 30, RULE_gs1_prefix = 31, 
		RULE_ean14 = 32, RULE_ean14_appid = 33, RULE_ean14_packaging = 34, RULE_ean14_product = 35, 
		RULE_any_digit = 36;
	public static final String[] ruleNames = {
		"gtin", "gtin8", "ean8", "gtin12", "gtin13", "gtin14", "upc", "upc_a", 
		"upc_a_manufacturer", "upc_a_product", "upc_a_5", "upc_e", "num_system", 
		"check_code", "supplemental_code", "supplemental_code_5", "supplemental_code_2", 
		"ean13", "ean13_generic", "ean13_ismn", "gs1_prefix_ismn", "ismn_publisher_number", 
		"ismn_item_number", "ean13_bookland", "bookland_isbn", "gs1_prefix_bookland_1", 
		"gs1_prefix_bookland_2", "gs1_prefix_issn", "ean13_issn", "issn", "ean_13_manprod", 
		"gs1_prefix", "ean14", "ean14_appid", "ean14_packaging", "ean14_product", 
		"any_digit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'9'", 
		"'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DIGIT_0", "DIGIT_1", "DIGIT_2", "DIGIT_3", "DIGIT_4", "DIGIT_5", 
		"DIGIT_6", "DIGIT_7", "DIGIT_8", "DIGIT_9", "HYPHEN", "WS"
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
	public String getGrammarFileName() { return "gtin.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gtinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GtinContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(gtinParser.EOF, 0); }
		public Gtin8Context gtin8() {
			return getRuleContext(Gtin8Context.class,0);
		}
		public Gtin12Context gtin12() {
			return getRuleContext(Gtin12Context.class,0);
		}
		public Gtin13Context gtin13() {
			return getRuleContext(Gtin13Context.class,0);
		}
		public Gtin14Context gtin14() {
			return getRuleContext(Gtin14Context.class,0);
		}
		public Supplemental_codeContext supplemental_code() {
			return getRuleContext(Supplemental_codeContext.class,0);
		}
		public GtinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gtin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterGtin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitGtin(this);
		}
	}

	public final GtinContext gtin() throws RecognitionException {
		GtinContext _localctx = new GtinContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gtin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(74);
				gtin8();
				}
				break;
			case 2:
				{
				setState(75);
				gtin12();
				}
				break;
			case 3:
				{
				setState(76);
				gtin13();
				}
				break;
			case 4:
				{
				setState(77);
				gtin14();
				}
				break;
			case 5:
				{
				setState(78);
				supplemental_code();
				}
				break;
			}
			setState(81);
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

	public static class Gtin8Context extends ParserRuleContext {
		public Ean8Context ean8() {
			return getRuleContext(Ean8Context.class,0);
		}
		public Gtin8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gtin8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterGtin8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitGtin8(this);
		}
	}

	public final Gtin8Context gtin8() throws RecognitionException {
		Gtin8Context _localctx = new Gtin8Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_gtin8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			ean8();
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

	public static class Ean8Context extends ParserRuleContext {
		public List<Any_digitContext> any_digit() {
			return getRuleContexts(Any_digitContext.class);
		}
		public Any_digitContext any_digit(int i) {
			return getRuleContext(Any_digitContext.class,i);
		}
		public Ean8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ean8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterEan8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitEan8(this);
		}
	}

	public final Ean8Context ean8() throws RecognitionException {
		Ean8Context _localctx = new Ean8Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_ean8);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			any_digit();
			setState(86);
			any_digit();
			setState(87);
			any_digit();
			setState(88);
			any_digit();
			setState(89);
			any_digit();
			setState(90);
			any_digit();
			setState(91);
			any_digit();
			setState(92);
			any_digit();
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

	public static class Gtin12Context extends ParserRuleContext {
		public UpcContext upc() {
			return getRuleContext(UpcContext.class,0);
		}
		public Gtin12Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gtin12; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterGtin12(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitGtin12(this);
		}
	}

	public final Gtin12Context gtin12() throws RecognitionException {
		Gtin12Context _localctx = new Gtin12Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_gtin12);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			upc();
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

	public static class Gtin13Context extends ParserRuleContext {
		public Ean13Context ean13() {
			return getRuleContext(Ean13Context.class,0);
		}
		public Gtin13Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gtin13; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterGtin13(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitGtin13(this);
		}
	}

	public final Gtin13Context gtin13() throws RecognitionException {
		Gtin13Context _localctx = new Gtin13Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_gtin13);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			ean13();
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

	public static class Gtin14Context extends ParserRuleContext {
		public Ean14Context ean14() {
			return getRuleContext(Ean14Context.class,0);
		}
		public Gtin14Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gtin14; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterGtin14(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitGtin14(this);
		}
	}

	public final Gtin14Context gtin14() throws RecognitionException {
		Gtin14Context _localctx = new Gtin14Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_gtin14);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			ean14();
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

	public static class UpcContext extends ParserRuleContext {
		public Upc_aContext upc_a() {
			return getRuleContext(Upc_aContext.class,0);
		}
		public Upc_eContext upc_e() {
			return getRuleContext(Upc_eContext.class,0);
		}
		public UpcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterUpc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitUpc(this);
		}
	}

	public final UpcContext upc() throws RecognitionException {
		UpcContext _localctx = new UpcContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_upc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(100);
				upc_a();
				}
				break;
			case 2:
				{
				setState(101);
				upc_e();
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

	public static class Upc_aContext extends ParserRuleContext {
		public Num_systemContext num_system() {
			return getRuleContext(Num_systemContext.class,0);
		}
		public Upc_a_manufacturerContext upc_a_manufacturer() {
			return getRuleContext(Upc_a_manufacturerContext.class,0);
		}
		public Upc_a_productContext upc_a_product() {
			return getRuleContext(Upc_a_productContext.class,0);
		}
		public Check_codeContext check_code() {
			return getRuleContext(Check_codeContext.class,0);
		}
		public Upc_aContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upc_a; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterUpc_a(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitUpc_a(this);
		}
	}

	public final Upc_aContext upc_a() throws RecognitionException {
		Upc_aContext _localctx = new Upc_aContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_upc_a);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			num_system();
			setState(105);
			upc_a_manufacturer();
			setState(106);
			upc_a_product();
			setState(107);
			check_code();
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

	public static class Upc_a_manufacturerContext extends ParserRuleContext {
		public Upc_a_5Context upc_a_5() {
			return getRuleContext(Upc_a_5Context.class,0);
		}
		public Upc_a_manufacturerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upc_a_manufacturer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterUpc_a_manufacturer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitUpc_a_manufacturer(this);
		}
	}

	public final Upc_a_manufacturerContext upc_a_manufacturer() throws RecognitionException {
		Upc_a_manufacturerContext _localctx = new Upc_a_manufacturerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_upc_a_manufacturer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			upc_a_5();
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

	public static class Upc_a_productContext extends ParserRuleContext {
		public Upc_a_5Context upc_a_5() {
			return getRuleContext(Upc_a_5Context.class,0);
		}
		public Upc_a_productContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upc_a_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterUpc_a_product(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitUpc_a_product(this);
		}
	}

	public final Upc_a_productContext upc_a_product() throws RecognitionException {
		Upc_a_productContext _localctx = new Upc_a_productContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_upc_a_product);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			upc_a_5();
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

	public static class Upc_a_5Context extends ParserRuleContext {
		public List<Any_digitContext> any_digit() {
			return getRuleContexts(Any_digitContext.class);
		}
		public Any_digitContext any_digit(int i) {
			return getRuleContext(Any_digitContext.class,i);
		}
		public Upc_a_5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upc_a_5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterUpc_a_5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitUpc_a_5(this);
		}
	}

	public final Upc_a_5Context upc_a_5() throws RecognitionException {
		Upc_a_5Context _localctx = new Upc_a_5Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_upc_a_5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			any_digit();
			setState(114);
			any_digit();
			setState(115);
			any_digit();
			setState(116);
			any_digit();
			setState(117);
			any_digit();
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

	public static class Upc_eContext extends ParserRuleContext {
		public List<Any_digitContext> any_digit() {
			return getRuleContexts(Any_digitContext.class);
		}
		public Any_digitContext any_digit(int i) {
			return getRuleContext(Any_digitContext.class,i);
		}
		public Upc_eContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upc_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterUpc_e(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitUpc_e(this);
		}
	}

	public final Upc_eContext upc_e() throws RecognitionException {
		Upc_eContext _localctx = new Upc_eContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_upc_e);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			any_digit();
			setState(120);
			any_digit();
			setState(121);
			any_digit();
			setState(122);
			any_digit();
			setState(123);
			any_digit();
			setState(124);
			any_digit();
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

	public static class Num_systemContext extends ParserRuleContext {
		public Any_digitContext any_digit() {
			return getRuleContext(Any_digitContext.class,0);
		}
		public Num_systemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_system; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterNum_system(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitNum_system(this);
		}
	}

	public final Num_systemContext num_system() throws RecognitionException {
		Num_systemContext _localctx = new Num_systemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_num_system);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			any_digit();
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

	public static class Check_codeContext extends ParserRuleContext {
		public Any_digitContext any_digit() {
			return getRuleContext(Any_digitContext.class,0);
		}
		public Check_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterCheck_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitCheck_code(this);
		}
	}

	public final Check_codeContext check_code() throws RecognitionException {
		Check_codeContext _localctx = new Check_codeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_check_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			any_digit();
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

	public static class Supplemental_codeContext extends ParserRuleContext {
		public Supplemental_code_5Context supplemental_code_5() {
			return getRuleContext(Supplemental_code_5Context.class,0);
		}
		public Supplemental_code_2Context supplemental_code_2() {
			return getRuleContext(Supplemental_code_2Context.class,0);
		}
		public Supplemental_codeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supplemental_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterSupplemental_code(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitSupplemental_code(this);
		}
	}

	public final Supplemental_codeContext supplemental_code() throws RecognitionException {
		Supplemental_codeContext _localctx = new Supplemental_codeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_supplemental_code);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				supplemental_code_5();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				supplemental_code_2();
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

	public static class Supplemental_code_5Context extends ParserRuleContext {
		public List<Any_digitContext> any_digit() {
			return getRuleContexts(Any_digitContext.class);
		}
		public Any_digitContext any_digit(int i) {
			return getRuleContext(Any_digitContext.class,i);
		}
		public Supplemental_code_5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supplemental_code_5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterSupplemental_code_5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitSupplemental_code_5(this);
		}
	}

	public final Supplemental_code_5Context supplemental_code_5() throws RecognitionException {
		Supplemental_code_5Context _localctx = new Supplemental_code_5Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_supplemental_code_5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			any_digit();
			setState(135);
			any_digit();
			setState(136);
			any_digit();
			setState(137);
			any_digit();
			setState(138);
			any_digit();
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

	public static class Supplemental_code_2Context extends ParserRuleContext {
		public List<Any_digitContext> any_digit() {
			return getRuleContexts(Any_digitContext.class);
		}
		public Any_digitContext any_digit(int i) {
			return getRuleContext(Any_digitContext.class,i);
		}
		public Supplemental_code_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supplemental_code_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterSupplemental_code_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitSupplemental_code_2(this);
		}
	}

	public final Supplemental_code_2Context supplemental_code_2() throws RecognitionException {
		Supplemental_code_2Context _localctx = new Supplemental_code_2Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_supplemental_code_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			any_digit();
			setState(141);
			any_digit();
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

	public static class Ean13Context extends ParserRuleContext {
		public Ean13_ismnContext ean13_ismn() {
			return getRuleContext(Ean13_ismnContext.class,0);
		}
		public Ean13_issnContext ean13_issn() {
			return getRuleContext(Ean13_issnContext.class,0);
		}
		public Ean13_booklandContext ean13_bookland() {
			return getRuleContext(Ean13_booklandContext.class,0);
		}
		public Ean13_genericContext ean13_generic() {
			return getRuleContext(Ean13_genericContext.class,0);
		}
		public Ean13Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ean13; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterEan13(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitEan13(this);
		}
	}

	public final Ean13Context ean13() throws RecognitionException {
		Ean13Context _localctx = new Ean13Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_ean13);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(143);
				ean13_ismn();
				}
				break;
			case 2:
				{
				setState(144);
				ean13_issn();
				}
				break;
			case 3:
				{
				setState(145);
				ean13_bookland();
				}
				break;
			case 4:
				{
				setState(146);
				ean13_generic();
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

	public static class Ean13_genericContext extends ParserRuleContext {
		public Gs1_prefixContext gs1_prefix() {
			return getRuleContext(Gs1_prefixContext.class,0);
		}
		public Ean_13_manprodContext ean_13_manprod() {
			return getRuleContext(Ean_13_manprodContext.class,0);
		}
		public Check_codeContext check_code() {
			return getRuleContext(Check_codeContext.class,0);
		}
		public Ean13_genericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ean13_generic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterEan13_generic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitEan13_generic(this);
		}
	}

	public final Ean13_genericContext ean13_generic() throws RecognitionException {
		Ean13_genericContext _localctx = new Ean13_genericContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ean13_generic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			gs1_prefix();
			setState(150);
			ean_13_manprod();
			setState(151);
			check_code();
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

	public static class Ean13_ismnContext extends ParserRuleContext {
		public Gs1_prefix_ismnContext gs1_prefix_ismn() {
			return getRuleContext(Gs1_prefix_ismnContext.class,0);
		}
		public Ismn_publisher_numberContext ismn_publisher_number() {
			return getRuleContext(Ismn_publisher_numberContext.class,0);
		}
		public Ismn_item_numberContext ismn_item_number() {
			return getRuleContext(Ismn_item_numberContext.class,0);
		}
		public Check_codeContext check_code() {
			return getRuleContext(Check_codeContext.class,0);
		}
		public Ean13_ismnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ean13_ismn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterEan13_ismn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitEan13_ismn(this);
		}
	}

	public final Ean13_ismnContext ean13_ismn() throws RecognitionException {
		Ean13_ismnContext _localctx = new Ean13_ismnContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ean13_ismn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			gs1_prefix_ismn();
			setState(154);
			ismn_publisher_number();
			setState(155);
			ismn_item_number();
			setState(156);
			check_code();
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

	public static class Gs1_prefix_ismnContext extends ParserRuleContext {
		public Gs1_prefix_ismnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gs1_prefix_ismn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterGs1_prefix_ismn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitGs1_prefix_ismn(this);
		}
	}

	public final Gs1_prefix_ismnContext gs1_prefix_ismn() throws RecognitionException {
		Gs1_prefix_ismnContext _localctx = new Gs1_prefix_ismnContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_gs1_prefix_ismn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(DIGIT_9);
			setState(159);
			match(DIGIT_7);
			setState(160);
			match(DIGIT_9);
			setState(161);
			match(DIGIT_0);
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

	public static class Ismn_publisher_numberContext extends ParserRuleContext {
		public List<Any_digitContext> any_digit() {
			return getRuleContexts(Any_digitContext.class);
		}
		public Any_digitContext any_digit(int i) {
			return getRuleContext(Any_digitContext.class,i);
		}
		public Ismn_publisher_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ismn_publisher_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterIsmn_publisher_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitIsmn_publisher_number(this);
		}
	}

	public final Ismn_publisher_numberContext ismn_publisher_number() throws RecognitionException {
		Ismn_publisher_numberContext _localctx = new Ismn_publisher_numberContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ismn_publisher_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			any_digit();
			setState(164);
			any_digit();
			setState(165);
			any_digit();
			setState(166);
			any_digit();
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

	public static class Ismn_item_numberContext extends ParserRuleContext {
		public List<Any_digitContext> any_digit() {
			return getRuleContexts(Any_digitContext.class);
		}
		public Any_digitContext any_digit(int i) {
			return getRuleContext(Any_digitContext.class,i);
		}
		public Ismn_item_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ismn_item_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterIsmn_item_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitIsmn_item_number(this);
		}
	}

	public final Ismn_item_numberContext ismn_item_number() throws RecognitionException {
		Ismn_item_numberContext _localctx = new Ismn_item_numberContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ismn_item_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			any_digit();
			setState(169);
			any_digit();
			setState(170);
			any_digit();
			setState(171);
			any_digit();
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

	public static class Ean13_booklandContext extends ParserRuleContext {
		public Bookland_isbnContext bookland_isbn() {
			return getRuleContext(Bookland_isbnContext.class,0);
		}
		public Gs1_prefix_bookland_1Context gs1_prefix_bookland_1() {
			return getRuleContext(Gs1_prefix_bookland_1Context.class,0);
		}
		public Gs1_prefix_bookland_2Context gs1_prefix_bookland_2() {
			return getRuleContext(Gs1_prefix_bookland_2Context.class,0);
		}
		public Ean13_booklandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ean13_bookland; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterEan13_bookland(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitEan13_bookland(this);
		}
	}

	public final Ean13_booklandContext ean13_bookland() throws RecognitionException {
		Ean13_booklandContext _localctx = new Ean13_booklandContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ean13_bookland);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(173);
				gs1_prefix_bookland_1();
				}
				break;
			case 2:
				{
				setState(174);
				gs1_prefix_bookland_2();
				}
				break;
			}
			setState(177);
			bookland_isbn();
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

	public static class Bookland_isbnContext extends ParserRuleContext {
		public List<Any_digitContext> any_digit() {
			return getRuleContexts(Any_digitContext.class);
		}
		public Any_digitContext any_digit(int i) {
			return getRuleContext(Any_digitContext.class,i);
		}
		public Bookland_isbnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bookland_isbn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterBookland_isbn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitBookland_isbn(this);
		}
	}

	public final Bookland_isbnContext bookland_isbn() throws RecognitionException {
		Bookland_isbnContext _localctx = new Bookland_isbnContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bookland_isbn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			any_digit();
			setState(180);
			any_digit();
			setState(181);
			any_digit();
			setState(182);
			any_digit();
			setState(183);
			any_digit();
			setState(184);
			any_digit();
			setState(185);
			any_digit();
			setState(186);
			any_digit();
			setState(187);
			any_digit();
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

	public static class Gs1_prefix_bookland_1Context extends ParserRuleContext {
		public Gs1_prefix_bookland_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gs1_prefix_bookland_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterGs1_prefix_bookland_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitGs1_prefix_bookland_1(this);
		}
	}

	public final Gs1_prefix_bookland_1Context gs1_prefix_bookland_1() throws RecognitionException {
		Gs1_prefix_bookland_1Context _localctx = new Gs1_prefix_bookland_1Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_gs1_prefix_bookland_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(DIGIT_9);
			setState(190);
			match(DIGIT_7);
			setState(191);
			match(DIGIT_9);
			setState(192);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT_1) | (1L << DIGIT_2) | (1L << DIGIT_3) | (1L << DIGIT_4) | (1L << DIGIT_5) | (1L << DIGIT_6) | (1L << DIGIT_7) | (1L << DIGIT_8) | (1L << DIGIT_9))) != 0)) ) {
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

	public static class Gs1_prefix_bookland_2Context extends ParserRuleContext {
		public Any_digitContext any_digit() {
			return getRuleContext(Any_digitContext.class,0);
		}
		public Gs1_prefix_bookland_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gs1_prefix_bookland_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterGs1_prefix_bookland_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitGs1_prefix_bookland_2(this);
		}
	}

	public final Gs1_prefix_bookland_2Context gs1_prefix_bookland_2() throws RecognitionException {
		Gs1_prefix_bookland_2Context _localctx = new Gs1_prefix_bookland_2Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_gs1_prefix_bookland_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(DIGIT_9);
			setState(195);
			match(DIGIT_7);
			setState(196);
			match(DIGIT_8);
			setState(197);
			any_digit();
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

	public static class Gs1_prefix_issnContext extends ParserRuleContext {
		public Gs1_prefix_issnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gs1_prefix_issn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterGs1_prefix_issn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitGs1_prefix_issn(this);
		}
	}

	public final Gs1_prefix_issnContext gs1_prefix_issn() throws RecognitionException {
		Gs1_prefix_issnContext _localctx = new Gs1_prefix_issnContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_gs1_prefix_issn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(DIGIT_9);
			setState(200);
			match(DIGIT_7);
			setState(201);
			match(DIGIT_7);
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

	public static class Ean13_issnContext extends ParserRuleContext {
		public Gs1_prefix_issnContext gs1_prefix_issn() {
			return getRuleContext(Gs1_prefix_issnContext.class,0);
		}
		public IssnContext issn() {
			return getRuleContext(IssnContext.class,0);
		}
		public Check_codeContext check_code() {
			return getRuleContext(Check_codeContext.class,0);
		}
		public Ean13_issnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ean13_issn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterEan13_issn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitEan13_issn(this);
		}
	}

	public final Ean13_issnContext ean13_issn() throws RecognitionException {
		Ean13_issnContext _localctx = new Ean13_issnContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ean13_issn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			gs1_prefix_issn();
			setState(204);
			issn();
			setState(205);
			check_code();
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

	public static class IssnContext extends ParserRuleContext {
		public List<Any_digitContext> any_digit() {
			return getRuleContexts(Any_digitContext.class);
		}
		public Any_digitContext any_digit(int i) {
			return getRuleContext(Any_digitContext.class,i);
		}
		public IssnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_issn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterIssn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitIssn(this);
		}
	}

	public final IssnContext issn() throws RecognitionException {
		IssnContext _localctx = new IssnContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_issn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			any_digit();
			setState(208);
			any_digit();
			setState(209);
			any_digit();
			setState(210);
			any_digit();
			setState(211);
			any_digit();
			setState(212);
			any_digit();
			setState(213);
			any_digit();
			setState(214);
			any_digit();
			setState(215);
			any_digit();
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

	public static class Ean_13_manprodContext extends ParserRuleContext {
		public List<Any_digitContext> any_digit() {
			return getRuleContexts(Any_digitContext.class);
		}
		public Any_digitContext any_digit(int i) {
			return getRuleContext(Any_digitContext.class,i);
		}
		public Ean_13_manprodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ean_13_manprod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterEan_13_manprod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitEan_13_manprod(this);
		}
	}

	public final Ean_13_manprodContext ean_13_manprod() throws RecognitionException {
		Ean_13_manprodContext _localctx = new Ean_13_manprodContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ean_13_manprod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			any_digit();
			setState(218);
			any_digit();
			setState(219);
			any_digit();
			setState(220);
			any_digit();
			setState(221);
			any_digit();
			setState(222);
			any_digit();
			setState(223);
			any_digit();
			setState(224);
			any_digit();
			setState(225);
			any_digit();
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

	public static class Gs1_prefixContext extends ParserRuleContext {
		public List<Any_digitContext> any_digit() {
			return getRuleContexts(Any_digitContext.class);
		}
		public Any_digitContext any_digit(int i) {
			return getRuleContext(Any_digitContext.class,i);
		}
		public Gs1_prefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gs1_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterGs1_prefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitGs1_prefix(this);
		}
	}

	public final Gs1_prefixContext gs1_prefix() throws RecognitionException {
		Gs1_prefixContext _localctx = new Gs1_prefixContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_gs1_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			any_digit();
			setState(228);
			any_digit();
			setState(229);
			any_digit();
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

	public static class Ean14Context extends ParserRuleContext {
		public Ean14_packagingContext ean14_packaging() {
			return getRuleContext(Ean14_packagingContext.class,0);
		}
		public Ean14_productContext ean14_product() {
			return getRuleContext(Ean14_productContext.class,0);
		}
		public Check_codeContext check_code() {
			return getRuleContext(Check_codeContext.class,0);
		}
		public Ean14Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ean14; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterEan14(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitEan14(this);
		}
	}

	public final Ean14Context ean14() throws RecognitionException {
		Ean14Context _localctx = new Ean14Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_ean14);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			ean14_packaging();
			setState(232);
			ean14_product();
			setState(233);
			check_code();
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

	public static class Ean14_appidContext extends ParserRuleContext {
		public List<Any_digitContext> any_digit() {
			return getRuleContexts(Any_digitContext.class);
		}
		public Any_digitContext any_digit(int i) {
			return getRuleContext(Any_digitContext.class,i);
		}
		public Ean14_appidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ean14_appid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterEan14_appid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitEan14_appid(this);
		}
	}

	public final Ean14_appidContext ean14_appid() throws RecognitionException {
		Ean14_appidContext _localctx = new Ean14_appidContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ean14_appid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			any_digit();
			setState(236);
			any_digit();
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

	public static class Ean14_packagingContext extends ParserRuleContext {
		public Ean14_packagingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ean14_packaging; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterEan14_packaging(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitEan14_packaging(this);
		}
	}

	public final Ean14_packagingContext ean14_packaging() throws RecognitionException {
		Ean14_packagingContext _localctx = new Ean14_packagingContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ean14_packaging);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT_0) | (1L << DIGIT_1) | (1L << DIGIT_2) | (1L << DIGIT_3) | (1L << DIGIT_4) | (1L << DIGIT_5) | (1L << DIGIT_6) | (1L << DIGIT_7) | (1L << DIGIT_8))) != 0)) ) {
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

	public static class Ean14_productContext extends ParserRuleContext {
		public List<Any_digitContext> any_digit() {
			return getRuleContexts(Any_digitContext.class);
		}
		public Any_digitContext any_digit(int i) {
			return getRuleContext(Any_digitContext.class,i);
		}
		public Ean14_productContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ean14_product; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterEan14_product(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitEan14_product(this);
		}
	}

	public final Ean14_productContext ean14_product() throws RecognitionException {
		Ean14_productContext _localctx = new Ean14_productContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ean14_product);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			any_digit();
			setState(241);
			any_digit();
			setState(242);
			any_digit();
			setState(243);
			any_digit();
			setState(244);
			any_digit();
			setState(245);
			any_digit();
			setState(246);
			any_digit();
			setState(247);
			any_digit();
			setState(248);
			any_digit();
			setState(249);
			any_digit();
			setState(250);
			any_digit();
			setState(251);
			any_digit();
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

	public static class Any_digitContext extends ParserRuleContext {
		public TerminalNode DIGIT_0() { return getToken(gtinParser.DIGIT_0, 0); }
		public TerminalNode DIGIT_1() { return getToken(gtinParser.DIGIT_1, 0); }
		public TerminalNode DIGIT_2() { return getToken(gtinParser.DIGIT_2, 0); }
		public TerminalNode DIGIT_3() { return getToken(gtinParser.DIGIT_3, 0); }
		public TerminalNode DIGIT_4() { return getToken(gtinParser.DIGIT_4, 0); }
		public TerminalNode DIGIT_5() { return getToken(gtinParser.DIGIT_5, 0); }
		public TerminalNode DIGIT_6() { return getToken(gtinParser.DIGIT_6, 0); }
		public TerminalNode DIGIT_7() { return getToken(gtinParser.DIGIT_7, 0); }
		public TerminalNode DIGIT_8() { return getToken(gtinParser.DIGIT_8, 0); }
		public TerminalNode DIGIT_9() { return getToken(gtinParser.DIGIT_9, 0); }
		public Any_digitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).enterAny_digit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gtinListener ) ((gtinListener)listener).exitAny_digit(this);
		}
	}

	public final Any_digitContext any_digit() throws RecognitionException {
		Any_digitContext _localctx = new Any_digitContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_any_digit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT_0) | (1L << DIGIT_1) | (1L << DIGIT_2) | (1L << DIGIT_3) | (1L << DIGIT_4) | (1L << DIGIT_5) | (1L << DIGIT_6) | (1L << DIGIT_7) | (1L << DIGIT_8) | (1L << DIGIT_9))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16\u0102\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\5\2R\n\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\5\bi\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\5"+
		"\20\u0087\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\5\23\u0096\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\5\31\u00b2\n\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3"+
		"&\2\2\'\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BDFHJ\2\5\3\2\4\f\3\2\3\13\3\2\3\f\2\u00e6\2Q\3\2\2\2\4U\3\2\2\2\6"+
		"W\3\2\2\2\b`\3\2\2\2\nb\3\2\2\2\fd\3\2\2\2\16h\3\2\2\2\20j\3\2\2\2\22"+
		"o\3\2\2\2\24q\3\2\2\2\26s\3\2\2\2\30y\3\2\2\2\32\u0080\3\2\2\2\34\u0082"+
		"\3\2\2\2\36\u0086\3\2\2\2 \u0088\3\2\2\2\"\u008e\3\2\2\2$\u0095\3\2\2"+
		"\2&\u0097\3\2\2\2(\u009b\3\2\2\2*\u00a0\3\2\2\2,\u00a5\3\2\2\2.\u00aa"+
		"\3\2\2\2\60\u00b1\3\2\2\2\62\u00b5\3\2\2\2\64\u00bf\3\2\2\2\66\u00c4\3"+
		"\2\2\28\u00c9\3\2\2\2:\u00cd\3\2\2\2<\u00d1\3\2\2\2>\u00db\3\2\2\2@\u00e5"+
		"\3\2\2\2B\u00e9\3\2\2\2D\u00ed\3\2\2\2F\u00f0\3\2\2\2H\u00f2\3\2\2\2J"+
		"\u00ff\3\2\2\2LR\5\4\3\2MR\5\b\5\2NR\5\n\6\2OR\5\f\7\2PR\5\36\20\2QL\3"+
		"\2\2\2QM\3\2\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2RS\3\2\2\2ST\7\2\2\3T\3"+
		"\3\2\2\2UV\5\6\4\2V\5\3\2\2\2WX\5J&\2XY\5J&\2YZ\5J&\2Z[\5J&\2[\\\5J&\2"+
		"\\]\5J&\2]^\5J&\2^_\5J&\2_\7\3\2\2\2`a\5\16\b\2a\t\3\2\2\2bc\5$\23\2c"+
		"\13\3\2\2\2de\5B\"\2e\r\3\2\2\2fi\5\20\t\2gi\5\30\r\2hf\3\2\2\2hg\3\2"+
		"\2\2i\17\3\2\2\2jk\5\32\16\2kl\5\22\n\2lm\5\24\13\2mn\5\34\17\2n\21\3"+
		"\2\2\2op\5\26\f\2p\23\3\2\2\2qr\5\26\f\2r\25\3\2\2\2st\5J&\2tu\5J&\2u"+
		"v\5J&\2vw\5J&\2wx\5J&\2x\27\3\2\2\2yz\5J&\2z{\5J&\2{|\5J&\2|}\5J&\2}~"+
		"\5J&\2~\177\5J&\2\177\31\3\2\2\2\u0080\u0081\5J&\2\u0081\33\3\2\2\2\u0082"+
		"\u0083\5J&\2\u0083\35\3\2\2\2\u0084\u0087\5 \21\2\u0085\u0087\5\"\22\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\37\3\2\2\2\u0088\u0089"+
		"\5J&\2\u0089\u008a\5J&\2\u008a\u008b\5J&\2\u008b\u008c\5J&\2\u008c\u008d"+
		"\5J&\2\u008d!\3\2\2\2\u008e\u008f\5J&\2\u008f\u0090\5J&\2\u0090#\3\2\2"+
		"\2\u0091\u0096\5(\25\2\u0092\u0096\5:\36\2\u0093\u0096\5\60\31\2\u0094"+
		"\u0096\5&\24\2\u0095\u0091\3\2\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0095\u0094\3\2\2\2\u0096%\3\2\2\2\u0097\u0098\5@!\2\u0098\u0099"+
		"\5> \2\u0099\u009a\5\34\17\2\u009a\'\3\2\2\2\u009b\u009c\5*\26\2\u009c"+
		"\u009d\5,\27\2\u009d\u009e\5.\30\2\u009e\u009f\5\34\17\2\u009f)\3\2\2"+
		"\2\u00a0\u00a1\7\f\2\2\u00a1\u00a2\7\n\2\2\u00a2\u00a3\7\f\2\2\u00a3\u00a4"+
		"\7\3\2\2\u00a4+\3\2\2\2\u00a5\u00a6\5J&\2\u00a6\u00a7\5J&\2\u00a7\u00a8"+
		"\5J&\2\u00a8\u00a9\5J&\2\u00a9-\3\2\2\2\u00aa\u00ab\5J&\2\u00ab\u00ac"+
		"\5J&\2\u00ac\u00ad\5J&\2\u00ad\u00ae\5J&\2\u00ae/\3\2\2\2\u00af\u00b2"+
		"\5\64\33\2\u00b0\u00b2\5\66\34\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2"+
		"\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\5\62\32\2\u00b4\61\3\2\2\2\u00b5\u00b6"+
		"\5J&\2\u00b6\u00b7\5J&\2\u00b7\u00b8\5J&\2\u00b8\u00b9\5J&\2\u00b9\u00ba"+
		"\5J&\2\u00ba\u00bb\5J&\2\u00bb\u00bc\5J&\2\u00bc\u00bd\5J&\2\u00bd\u00be"+
		"\5J&\2\u00be\63\3\2\2\2\u00bf\u00c0\7\f\2\2\u00c0\u00c1\7\n\2\2\u00c1"+
		"\u00c2\7\f\2\2\u00c2\u00c3\t\2\2\2\u00c3\65\3\2\2\2\u00c4\u00c5\7\f\2"+
		"\2\u00c5\u00c6\7\n\2\2\u00c6\u00c7\7\13\2\2\u00c7\u00c8\5J&\2\u00c8\67"+
		"\3\2\2\2\u00c9\u00ca\7\f\2\2\u00ca\u00cb\7\n\2\2\u00cb\u00cc\7\n\2\2\u00cc"+
		"9\3\2\2\2\u00cd\u00ce\58\35\2\u00ce\u00cf\5<\37\2\u00cf\u00d0\5\34\17"+
		"\2\u00d0;\3\2\2\2\u00d1\u00d2\5J&\2\u00d2\u00d3\5J&\2\u00d3\u00d4\5J&"+
		"\2\u00d4\u00d5\5J&\2\u00d5\u00d6\5J&\2\u00d6\u00d7\5J&\2\u00d7\u00d8\5"+
		"J&\2\u00d8\u00d9\5J&\2\u00d9\u00da\5J&\2\u00da=\3\2\2\2\u00db\u00dc\5"+
		"J&\2\u00dc\u00dd\5J&\2\u00dd\u00de\5J&\2\u00de\u00df\5J&\2\u00df\u00e0"+
		"\5J&\2\u00e0\u00e1\5J&\2\u00e1\u00e2\5J&\2\u00e2\u00e3\5J&\2\u00e3\u00e4"+
		"\5J&\2\u00e4?\3\2\2\2\u00e5\u00e6\5J&\2\u00e6\u00e7\5J&\2\u00e7\u00e8"+
		"\5J&\2\u00e8A\3\2\2\2\u00e9\u00ea\5F$\2\u00ea\u00eb\5H%\2\u00eb\u00ec"+
		"\5\34\17\2\u00ecC\3\2\2\2\u00ed\u00ee\5J&\2\u00ee\u00ef\5J&\2\u00efE\3"+
		"\2\2\2\u00f0\u00f1\t\3\2\2\u00f1G\3\2\2\2\u00f2\u00f3\5J&\2\u00f3\u00f4"+
		"\5J&\2\u00f4\u00f5\5J&\2\u00f5\u00f6\5J&\2\u00f6\u00f7\5J&\2\u00f7\u00f8"+
		"\5J&\2\u00f8\u00f9\5J&\2\u00f9\u00fa\5J&\2\u00fa\u00fb\5J&\2\u00fb\u00fc"+
		"\5J&\2\u00fc\u00fd\5J&\2\u00fd\u00fe\5J&\2\u00feI\3\2\2\2\u00ff\u0100"+
		"\t\4\2\2\u0100K\3\2\2\2\7Qh\u0086\u0095\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}