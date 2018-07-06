// Generated from graphstream-dgs/DGSParser.g4 by ANTLR 4.7.1
package parsers.graphstream-dgs;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DGSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAGIC=1, AN=2, CN=3, DN=4, AE=5, CE=6, DE=7, CG=8, ST=9, CL=10, INT=11, 
		REAL=12, PLUS=13, MINUS=14, COMMA=15, LBRACE=16, RBRACE=17, LBRACK=18, 
		RBRACK=19, DOT=20, LANGLE=21, RANGLE=22, EQUALS=23, COLON=24, EOL=25, 
		WORD=26, STRING=27, COLOR=28, START_COMMENT=29, WS=30, COMMENT=31;
	public static final int
		RULE_dgs = 0, RULE_header = 1, RULE_event = 2, RULE_an = 3, RULE_cn = 4, 
		RULE_dn = 5, RULE_ae = 6, RULE_ce = 7, RULE_de = 8, RULE_cg = 9, RULE_st = 10, 
		RULE_cl = 11, RULE_attributes = 12, RULE_attribute = 13, RULE_value = 14, 
		RULE_array = 15, RULE_a_map = 16, RULE_mapping = 17, RULE_direction = 18, 
		RULE_assign = 19, RULE_identifier = 20;
	public static final String[] ruleNames = {
		"dgs", "header", "event", "an", "cn", "dn", "ae", "ce", "de", "cg", "st", 
		"cl", "attributes", "attribute", "value", "array", "a_map", "mapping", 
		"direction", "assign", "identifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'an'", "'cn'", "'dn'", "'ae'", "'ce'", "'de'", "'cg'", "'st'", 
		"'cl'", null, null, "'+'", "'-'", "','", "'{'", "'}'", "'['", "']'", "'.'", 
		"'<'", "'>'", "'='", "':'", null, null, null, null, "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MAGIC", "AN", "CN", "DN", "AE", "CE", "DE", "CG", "ST", "CL", "INT", 
		"REAL", "PLUS", "MINUS", "COMMA", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"DOT", "LANGLE", "RANGLE", "EQUALS", "COLON", "EOL", "WORD", "STRING", 
		"COLOR", "START_COMMENT", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "DGSParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DGSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DgsContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public List<EventContext> event() {
			return getRuleContexts(EventContext.class);
		}
		public EventContext event(int i) {
			return getRuleContext(EventContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(DGSParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(DGSParser.COMMENT, i);
		}
		public List<TerminalNode> EOL() { return getTokens(DGSParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(DGSParser.EOL, i);
		}
		public DgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterDgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitDgs(this);
		}
	}

	public final DgsContext dgs() throws RecognitionException {
		DgsContext _localctx = new DgsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_dgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			header();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AN) | (1L << CN) | (1L << DN) | (1L << AE) | (1L << CE) | (1L << DE) | (1L << CG) | (1L << ST) | (1L << CL) | (1L << EOL) | (1L << COMMENT))) != 0)) {
				{
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AN:
				case CN:
				case DN:
				case AE:
				case CE:
				case DE:
				case CG:
				case ST:
				case CL:
					{
					setState(43);
					event();
					}
					break;
				case COMMENT:
					{
					setState(44);
					match(COMMENT);
					}
					break;
				case EOL:
					{
					setState(45);
					match(EOL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(50);
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode MAGIC() { return getToken(DGSParser.MAGIC, 0); }
		public List<TerminalNode> EOL() { return getTokens(DGSParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(DGSParser.EOL, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(DGSParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(DGSParser.INT, i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(MAGIC);
			setState(52);
			match(EOL);
			setState(53);
			identifier();
			setState(54);
			match(INT);
			setState(55);
			match(INT);
			setState(56);
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

	public static class EventContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(DGSParser.COMMENT, 0); }
		public TerminalNode EOL() { return getToken(DGSParser.EOL, 0); }
		public AnContext an() {
			return getRuleContext(AnContext.class,0);
		}
		public CnContext cn() {
			return getRuleContext(CnContext.class,0);
		}
		public DnContext dn() {
			return getRuleContext(DnContext.class,0);
		}
		public AeContext ae() {
			return getRuleContext(AeContext.class,0);
		}
		public CeContext ce() {
			return getRuleContext(CeContext.class,0);
		}
		public DeContext de() {
			return getRuleContext(DeContext.class,0);
		}
		public CgContext cg() {
			return getRuleContext(CgContext.class,0);
		}
		public StContext st() {
			return getRuleContext(StContext.class,0);
		}
		public ClContext cl() {
			return getRuleContext(ClContext.class,0);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitEvent(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_event);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AN:
				{
				setState(58);
				an();
				}
				break;
			case CN:
				{
				setState(59);
				cn();
				}
				break;
			case DN:
				{
				setState(60);
				dn();
				}
				break;
			case AE:
				{
				setState(61);
				ae();
				}
				break;
			case CE:
				{
				setState(62);
				ce();
				}
				break;
			case DE:
				{
				setState(63);
				de();
				}
				break;
			case CG:
				{
				setState(64);
				cg();
				}
				break;
			case ST:
				{
				setState(65);
				st();
				}
				break;
			case CL:
				{
				setState(66);
				cl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==EOL || _la==COMMENT) ) {
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

	public static class AnContext extends ParserRuleContext {
		public TerminalNode AN() { return getToken(DGSParser.AN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_an; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterAn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitAn(this);
		}
	}

	public final AnContext an() throws RecognitionException {
		AnContext _localctx = new AnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_an);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(AN);
			setState(72);
			identifier();
			setState(73);
			attributes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CnContext extends ParserRuleContext {
		public TerminalNode CN() { return getToken(DGSParser.CN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public CnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterCn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitCn(this);
		}
	}

	public final CnContext cn() throws RecognitionException {
		CnContext _localctx = new CnContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(CN);
			setState(76);
			identifier();
			setState(77);
			attributes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DnContext extends ParserRuleContext {
		public TerminalNode DN() { return getToken(DGSParser.DN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterDn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitDn(this);
		}
	}

	public final DnContext dn() throws RecognitionException {
		DnContext _localctx = new DnContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(DN);
			setState(80);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AeContext extends ParserRuleContext {
		public TerminalNode AE() { return getToken(DGSParser.AE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public AeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ae; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterAe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitAe(this);
		}
	}

	public final AeContext ae() throws RecognitionException {
		AeContext _localctx = new AeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ae);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(AE);
			setState(83);
			identifier();
			setState(84);
			identifier();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LANGLE || _la==RANGLE) {
				{
				setState(85);
				direction();
				}
			}

			setState(88);
			identifier();
			setState(89);
			attributes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CeContext extends ParserRuleContext {
		public TerminalNode CE() { return getToken(DGSParser.CE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public CeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ce; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterCe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitCe(this);
		}
	}

	public final CeContext ce() throws RecognitionException {
		CeContext _localctx = new CeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ce);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(CE);
			setState(92);
			identifier();
			setState(93);
			attributes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeContext extends ParserRuleContext {
		public TerminalNode DE() { return getToken(DGSParser.DE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_de; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitDe(this);
		}
	}

	public final DeContext de() throws RecognitionException {
		DeContext _localctx = new DeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_de);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(DE);
			setState(96);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CgContext extends ParserRuleContext {
		public TerminalNode CG() { return getToken(DGSParser.CG, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public CgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterCg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitCg(this);
		}
	}

	public final CgContext cg() throws RecognitionException {
		CgContext _localctx = new CgContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(CG);
			setState(99);
			attributes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StContext extends ParserRuleContext {
		public TerminalNode ST() { return getToken(DGSParser.ST, 0); }
		public TerminalNode REAL() { return getToken(DGSParser.REAL, 0); }
		public StContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitSt(this);
		}
	}

	public final StContext st() throws RecognitionException {
		StContext _localctx = new StContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ST);
			setState(102);
			match(REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClContext extends ParserRuleContext {
		public TerminalNode CL() { return getToken(DGSParser.CL, 0); }
		public ClContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterCl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitCl(this);
		}
	}

	public final ClContext cl() throws RecognitionException {
		ClContext _localctx = new ClContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(CL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitAttributes(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << PLUS) | (1L << MINUS) | (1L << WORD) | (1L << STRING))) != 0)) {
				{
				{
				setState(106);
				attribute();
				}
				}
				setState(111);
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

	public static class AttributeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(DGSParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(DGSParser.MINUS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(DGSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DGSParser.COMMA, i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(112);
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

			setState(115);
			identifier();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS || _la==COLON) {
				{
				setState(116);
				assign();
				setState(117);
				value();
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(118);
					match(COMMA);
					setState(119);
					value();
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DGSParser.STRING, 0); }
		public TerminalNode INT() { return getToken(DGSParser.INT, 0); }
		public TerminalNode REAL() { return getToken(DGSParser.REAL, 0); }
		public TerminalNode COLOR() { return getToken(DGSParser.COLOR, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public A_mapContext a_map() {
			return getRuleContext(A_mapContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_value);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				match(REAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				match(COLOR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				array();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				a_map();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(133);
				identifier();
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(DGSParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(DGSParser.RBRACE, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DGSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DGSParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(LBRACE);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << REAL) | (1L << LBRACE) | (1L << LBRACK) | (1L << WORD) | (1L << STRING) | (1L << COLOR))) != 0)) {
				{
				setState(137);
				value();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(138);
					match(COMMA);
					setState(139);
					value();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(147);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A_mapContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(DGSParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(DGSParser.RBRACK, 0); }
		public List<MappingContext> mapping() {
			return getRuleContexts(MappingContext.class);
		}
		public MappingContext mapping(int i) {
			return getRuleContext(MappingContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DGSParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DGSParser.COMMA, i);
		}
		public A_mapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterA_map(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitA_map(this);
		}
	}

	public final A_mapContext a_map() throws RecognitionException {
		A_mapContext _localctx = new A_mapContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_a_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(LBRACK);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << WORD) | (1L << STRING))) != 0)) {
				{
				setState(150);
				mapping();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(151);
					match(COMMA);
					setState(152);
					mapping();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(160);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MappingContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public MappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterMapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitMapping(this);
		}
	}

	public final MappingContext mapping() throws RecognitionException {
		MappingContext _localctx = new MappingContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mapping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			identifier();
			setState(163);
			assign();
			setState(164);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode LANGLE() { return getToken(DGSParser.LANGLE, 0); }
		public TerminalNode RANGLE() { return getToken(DGSParser.RANGLE, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitDirection(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !(_la==LANGLE || _la==RANGLE) ) {
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode EQUALS() { return getToken(DGSParser.EQUALS, 0); }
		public TerminalNode COLON() { return getToken(DGSParser.COLON, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==COLON) ) {
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DGSParser.STRING, 0); }
		public TerminalNode INT() { return getToken(DGSParser.INT, 0); }
		public List<TerminalNode> WORD() { return getTokens(DGSParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(DGSParser.WORD, i);
		}
		public List<TerminalNode> DOT() { return getTokens(DGSParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(DGSParser.DOT, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DGSParserListener ) ((DGSParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_identifier);
		int _la;
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(STRING);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(INT);
				}
				break;
			case WORD:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(WORD);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(173);
					match(DOT);
					setState(174);
					match(WORD);
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00b9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\7\2\61\n\2\f"+
		"\2\16\2\64\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4F\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\5\bY\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\7\16n\n\16\f\16\16\16q\13\16\3"+
		"\17\5\17t\n\17\3\17\3\17\3\17\3\17\3\17\7\17{\n\17\f\17\16\17~\13\17\5"+
		"\17\u0080\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0089\n\20\3\21"+
		"\3\21\3\21\3\21\7\21\u008f\n\21\f\21\16\21\u0092\13\21\5\21\u0094\n\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u009c\n\22\f\22\16\22\u009f\13\22"+
		"\5\22\u00a1\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\7\26\u00b2\n\26\f\26\16\26\u00b5\13\26\5\26\u00b7"+
		"\n\26\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\6\4"+
		"\2\33\33!!\3\2\17\20\3\2\27\30\3\2\31\32\2\u00c0\2,\3\2\2\2\4\65\3\2\2"+
		"\2\6E\3\2\2\2\bI\3\2\2\2\nM\3\2\2\2\fQ\3\2\2\2\16T\3\2\2\2\20]\3\2\2\2"+
		"\22a\3\2\2\2\24d\3\2\2\2\26g\3\2\2\2\30j\3\2\2\2\32o\3\2\2\2\34s\3\2\2"+
		"\2\36\u0088\3\2\2\2 \u008a\3\2\2\2\"\u0097\3\2\2\2$\u00a4\3\2\2\2&\u00a8"+
		"\3\2\2\2(\u00aa\3\2\2\2*\u00b6\3\2\2\2,\62\5\4\3\2-\61\5\6\4\2.\61\7!"+
		"\2\2/\61\7\33\2\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61\64\3\2\2\2\62"+
		"\60\3\2\2\2\62\63\3\2\2\2\63\3\3\2\2\2\64\62\3\2\2\2\65\66\7\3\2\2\66"+
		"\67\7\33\2\2\678\5*\26\289\7\r\2\29:\7\r\2\2:;\7\33\2\2;\5\3\2\2\2<F\5"+
		"\b\5\2=F\5\n\6\2>F\5\f\7\2?F\5\16\b\2@F\5\20\t\2AF\5\22\n\2BF\5\24\13"+
		"\2CF\5\26\f\2DF\5\30\r\2E<\3\2\2\2E=\3\2\2\2E>\3\2\2\2E?\3\2\2\2E@\3\2"+
		"\2\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2FG\3\2\2\2GH\t\2\2\2H\7\3"+
		"\2\2\2IJ\7\4\2\2JK\5*\26\2KL\5\32\16\2L\t\3\2\2\2MN\7\5\2\2NO\5*\26\2"+
		"OP\5\32\16\2P\13\3\2\2\2QR\7\6\2\2RS\5*\26\2S\r\3\2\2\2TU\7\7\2\2UV\5"+
		"*\26\2VX\5*\26\2WY\5&\24\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\5*\26\2[\\"+
		"\5\32\16\2\\\17\3\2\2\2]^\7\b\2\2^_\5*\26\2_`\5\32\16\2`\21\3\2\2\2ab"+
		"\7\t\2\2bc\5*\26\2c\23\3\2\2\2de\7\n\2\2ef\5\32\16\2f\25\3\2\2\2gh\7\13"+
		"\2\2hi\7\16\2\2i\27\3\2\2\2jk\7\f\2\2k\31\3\2\2\2ln\5\34\17\2ml\3\2\2"+
		"\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\33\3\2\2\2qo\3\2\2\2rt\t\3\2\2sr\3\2"+
		"\2\2st\3\2\2\2tu\3\2\2\2u\177\5*\26\2vw\5(\25\2w|\5\36\20\2xy\7\21\2\2"+
		"y{\5\36\20\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0080\3\2\2\2~|"+
		"\3\2\2\2\177v\3\2\2\2\177\u0080\3\2\2\2\u0080\35\3\2\2\2\u0081\u0089\7"+
		"\35\2\2\u0082\u0089\7\r\2\2\u0083\u0089\7\16\2\2\u0084\u0089\7\36\2\2"+
		"\u0085\u0089\5 \21\2\u0086\u0089\5\"\22\2\u0087\u0089\5*\26\2\u0088\u0081"+
		"\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0083\3\2\2\2\u0088\u0084\3\2\2\2\u0088"+
		"\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\37\3\2\2"+
		"\2\u008a\u0093\7\22\2\2\u008b\u0090\5\36\20\2\u008c\u008d\7\21\2\2\u008d"+
		"\u008f\5\36\20\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3"+
		"\2\2\2\u0090\u0091\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u008b\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\7\23"+
		"\2\2\u0096!\3\2\2\2\u0097\u00a0\7\24\2\2\u0098\u009d\5$\23\2\u0099\u009a"+
		"\7\21\2\2\u009a\u009c\5$\23\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2"+
		"\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d"+
		"\3\2\2\2\u00a0\u0098\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\7\25\2\2\u00a3#\3\2\2\2\u00a4\u00a5\5*\26\2\u00a5\u00a6\5(\25\2"+
		"\u00a6\u00a7\5\36\20\2\u00a7%\3\2\2\2\u00a8\u00a9\t\4\2\2\u00a9\'\3\2"+
		"\2\2\u00aa\u00ab\t\5\2\2\u00ab)\3\2\2\2\u00ac\u00b7\7\35\2\2\u00ad\u00b7"+
		"\7\r\2\2\u00ae\u00b3\7\34\2\2\u00af\u00b0\7\26\2\2\u00b0\u00b2\7\34\2"+
		"\2\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00ac\3\2\2\2\u00b6"+
		"\u00ad\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b7+\3\2\2\2\21\60\62EXos|\177\u0088"+
		"\u0090\u0093\u009d\u00a0\u00b3\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}