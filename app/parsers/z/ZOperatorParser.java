// Generated from z/ZOperatorParser.g4 by ANTLR 4.7.1
package parsers.z;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ZOperatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ZED=1, SCH=2, AX=3, TEXT=4, NUMERAL=5, STROKE=6, LEFT_PARENTHESIS=7, RIGHT_PARENTHESIS=8, 
		LEFT_SQUARE_BRACKET=9, RIGHT_SQUARE_BRACKET=10, LEFT_CURLY_BRACKET=11, 
		RIGHT_CURLY_BRACKET=12, LEFT_BINDING_BRACKET=13, RIGHT_BINDING_BRACKET=14, 
		LEFT_DOUBLE_ANGLE_BRACKET=15, RIGHT_DOUBLE_ANGLE_BRACKET=16, GEN=17, END=18, 
		WS=19, NL=20, IGNORE_NL=21, ELSE=22, FALSE=23, FUNCTION=24, GENERIC=25, 
		IF=26, LEFTASSOC=27, LET=28, POWERSET=29, PARENTS=30, PRE_KEY=31, RELATION=32, 
		RIGHTASSOC=33, SECTION=34, THEN=35, TRUE=36, COLON=37, DEFINE_EQUAL=38, 
		COMMA=39, FREE_EQUALS=40, VERTICAL_LINE=41, AMPERSAND=42, REVERSE_SOLIDUS=43, 
		SOLIDUS=44, FULL_STOP=45, SEMICOLON=46, ARGUMENT=47, LIST=48, EQUALS_SIGN=49, 
		CONJECTURE=50, FOR_ALL=51, SPOT=52, THERE_EXISTS=53, UNIQUE_EXISTS=54, 
		LEFT_RIGHT_DOUBLE_ARROW=55, RIGHTWARDS_DOUBLE_ARROW=56, LOGICAL_OR=57, 
		LOGICAL_AND=58, NOT_SIGN=59, ELEMENT_OF=60, SCHEMA_PROJECTION=61, MULTIPLICATION_SIGN=62, 
		GREEK_SMALL_LETTER_THETA=63, GREEK_SMALL_LETTER_LAMBDA=64, GREEK_SMALL_LETTER_MU=65, 
		SCHEMA_COMPOSITION=66, SCHEMA_PIPING=67, NAME=68, WORDPART=69, GREEK_CAPITAL_LETTER_DELTA=70, 
		GREEK_CAPITAL_LETTER_XI=71, MATHEMATICAL_DOUBLE_STRUCK_CAPITAL_A=72, DOUBLE_STRUCK_CAPITAL_N=73, 
		MODIFIER_LETTER_PRIME=74, EXCLAMATION_MARK=75, QUESTION_MARK=76, NORTH_EAST_ARROW=77, 
		SOUTH_WEST_ARROW=78, SOUTH_EAST_ARROW=79, NORTH_WEST_ARROW=80, RIGHT_TACK=81, 
		BIG_REVERSE_SOLIDUS=82, PLUS_SIGN=83, MATHEMATICAL_TOOLKIT_SYMBOLS=84, 
		LEFT_RIGHT_ARROW=85, RIGHTWARDS_ARROW=86, NOT_EQUAL_TO=87, NOT_AN_ELEMENT_OF=88, 
		EMPTY_SET=89, SUBSET_OF_OR_EQUAL_TO=90, SUBSET_OF=91, UNION=92, INTERSECTION=93, 
		SET_MINUS=94, CIRCLED_MINUS=95, N_ARY_UNION=96, N_ARY_INTERSECTION=97, 
		MATHEMATICAL_DOUBLE_STRUCK_CAPITAL_F=98, RIGHTWARDS_ARROW_FROM_BAR=99, 
		RELATIONAL_COMPOSITION=100, RING_OPERATOR=101, WHITE_LEFT_POINTING_TRIANGLE=102, 
		WHITE_RIGHT_POINTING_TRIANGLE=103, DOMAIN_ANTIRESTRICTION=104, RANGE_ANTIRESTRICTION=105, 
		TILDE_OPERATOR=106, LEFT_IMAGE_BRACKET=107, RIGHT_IMAGE_BRACKET=108, CIRCLED_PLUS=109, 
		RIGHTWARDS_ARROW_WITH_VERTICAL_STROKE=110, RIGHTWARDS_ARROW_WITH_TAIL_WITH_VERTICAL_STROKE=111, 
		RIGHTWARDS_ARROW_WITH_TAIL=112, RIGHTWARDS_TWO_HEADED_ARROW_WITH_VERTICAL_STROKE=113, 
		RIGHTWARDS_TWO_HEADED_ARROW=114, RIGHTWARDS_TWO_HEADED_ARROW_WITH_TAIL=115, 
		RIGHTWARDS_ARROW_WITH_DOUBLE_VERTICAL_STROKE=116, RIGHTWARDS_ARROW_WITH_TAIL_WITH_DOUBLE_VERTICAL_STROKE=117, 
		DOUBLE_STRUCK_CAPITAL_Z=118, HYPHEN_MINUS=119, MINUS_SIGN=120, LESS_THAN_OR_EQUAL_TO=121, 
		LESS_THAN_SIGN=122, GREATER_THAN_OR_EQUAL_TO=123, GREATER_THAN_SIGN=124, 
		ASTERISK=125, NUMBER_SIGN=126, CHARACTER_TIE=127, UPWARDS_HARPOON_WITH_BARB_LEFTWARDS=128, 
		UPWARDS_HARPOON_WITH_BARB_RIGHTWARDS=129, LEFT_ANGLE_BRACKET=130, RIGHT_ANGLE_BRACKET=131, 
		ID0=132, ID1=133, ID=134, PREP=135, PRE=136, POSTP=137, POST=138, IP=139, 
		I=140, LP=141, L=142, ELP=143, EL=144, ERP=145, ER=146, SRP=147, SR=148, 
		EREP=149, ERE=150, SREP=151, SRE=152, ES=153, SS=154, UNKNOWN=155, NLCHAR=156;
	public static final int
		RULE_specification = 0, RULE_section = 1, RULE_paragraph = 2, RULE_formals = 3, 
		RULE_operatorTemplate = 4, RULE_categoryTemplate = 5, RULE_prec = 6, RULE_assoc = 7, 
		RULE_template = 8, RULE_prefixTemplate = 9, RULE_postfixTemplate = 10, 
		RULE_infixTemplate = 11, RULE_nofixTemplate = 12, RULE_optArgName = 13, 
		RULE_optListName = 14, RULE_argName = 15, RULE_listName = 16, RULE_prefixName = 17, 
		RULE_postfixName = 18, RULE_infixName = 19, RULE_nofixName = 20;
	public static final String[] ruleNames = {
		"specification", "section", "paragraph", "formals", "operatorTemplate", 
		"categoryTemplate", "prec", "assoc", "template", "prefixTemplate", "postfixTemplate", 
		"infixTemplate", "nofixTemplate", "optArgName", "optListName", "argName", 
		"listName", "prefixName", "postfixName", "infixName", "nofixName"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u2500'", "'\u250C'", "'\u2577'", null, null, null, "'\u0028'", 
		"'\u0029'", "'\u005B'", "'\u005D'", "'\u007B'", "'\u007D'", "'\u2989'", 
		"'\u298A'", "'\u27EA'", "'\u27EB'", "'\u2550'", "'\u2514'", null, null, 
		null, "'else'", "'false'", "'function'", "'generic'", "'if'", "'leftassoc'", 
		"'let'", "'\u2119'", "'parents'", "'pre'", "'relation'", "'rightassoc'", 
		"'section'", "'then'", "'true'", "':'", "'=='", "','", "'::='", "'|'", 
		"'\u0026'", "'\u005C'", "'/'", "'.'", "';'", "'_'", "',,'", "'='", null, 
		"'\u2200'", "'\u2981'", "'\u2203'", null, "'\u21D4'", "'\u21D2'", "'\u2228'", 
		"'\u2227'", "'\u00AC'", "'\u2208'", "'\u2A21'", "'\u00D7'", "'\u03B8'", 
		"'\u03BB'", "'\u03BC'", "'\u2A1F'", "'\u2A20'", null, null, "'\u0394'", 
		"'\u039E'", "'\uD835\uDD38'", "'\u2115'", "'\u2032'", "'\u0021'", "'\u003F'", 
		"'\u2197'", "'\u2199'", "'\u2198'", "'\u2196'", "'\u22A2'", "'\u29F9'", 
		"'\u002B'", null, "'\u2194'", "'\u2192'", "'\u2260'", "'\u2209'", "'\u2205'", 
		"'\u2286'", "'\u2282'", "'\u222A'", "'\u2229'", "'\u2216'", "'\u2296'", 
		"'\u22C3'", "'\u22C2'", "'\uD835\uDD3D'", "'\u21A6'", "'\u2A3E'", "'\u2218'", 
		"'\u25C1'", "'\u25B7'", "'\u2A64'", "'\u2A65'", "'\u223C'", "'\u2987'", 
		"'\u2988'", "'\u2295'", "'\u21F8'", "'\u2914'", "'\u21A3'", "'\u2900'", 
		"'\u21A0'", "'\u2916'", "'\u21FB'", "'\u2915'", "'\u2124'", "'\u002D'", 
		"'\u2212'", "'\u2264'", "'\u003C'", "'\u2265'", "'\u003E'", "'\u002A'", 
		"'\u0023'", "'\u2040'", "'\u21BF'", "'\u21BE'", "'\u27E8'", "'\u27E9'", 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'\u2028'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ZED", "SCH", "AX", "TEXT", "NUMERAL", "STROKE", "LEFT_PARENTHESIS", 
		"RIGHT_PARENTHESIS", "LEFT_SQUARE_BRACKET", "RIGHT_SQUARE_BRACKET", "LEFT_CURLY_BRACKET", 
		"RIGHT_CURLY_BRACKET", "LEFT_BINDING_BRACKET", "RIGHT_BINDING_BRACKET", 
		"LEFT_DOUBLE_ANGLE_BRACKET", "RIGHT_DOUBLE_ANGLE_BRACKET", "GEN", "END", 
		"WS", "NL", "IGNORE_NL", "ELSE", "FALSE", "FUNCTION", "GENERIC", "IF", 
		"LEFTASSOC", "LET", "POWERSET", "PARENTS", "PRE_KEY", "RELATION", "RIGHTASSOC", 
		"SECTION", "THEN", "TRUE", "COLON", "DEFINE_EQUAL", "COMMA", "FREE_EQUALS", 
		"VERTICAL_LINE", "AMPERSAND", "REVERSE_SOLIDUS", "SOLIDUS", "FULL_STOP", 
		"SEMICOLON", "ARGUMENT", "LIST", "EQUALS_SIGN", "CONJECTURE", "FOR_ALL", 
		"SPOT", "THERE_EXISTS", "UNIQUE_EXISTS", "LEFT_RIGHT_DOUBLE_ARROW", "RIGHTWARDS_DOUBLE_ARROW", 
		"LOGICAL_OR", "LOGICAL_AND", "NOT_SIGN", "ELEMENT_OF", "SCHEMA_PROJECTION", 
		"MULTIPLICATION_SIGN", "GREEK_SMALL_LETTER_THETA", "GREEK_SMALL_LETTER_LAMBDA", 
		"GREEK_SMALL_LETTER_MU", "SCHEMA_COMPOSITION", "SCHEMA_PIPING", "NAME", 
		"WORDPART", "GREEK_CAPITAL_LETTER_DELTA", "GREEK_CAPITAL_LETTER_XI", "MATHEMATICAL_DOUBLE_STRUCK_CAPITAL_A", 
		"DOUBLE_STRUCK_CAPITAL_N", "MODIFIER_LETTER_PRIME", "EXCLAMATION_MARK", 
		"QUESTION_MARK", "NORTH_EAST_ARROW", "SOUTH_WEST_ARROW", "SOUTH_EAST_ARROW", 
		"NORTH_WEST_ARROW", "RIGHT_TACK", "BIG_REVERSE_SOLIDUS", "PLUS_SIGN", 
		"MATHEMATICAL_TOOLKIT_SYMBOLS", "LEFT_RIGHT_ARROW", "RIGHTWARDS_ARROW", 
		"NOT_EQUAL_TO", "NOT_AN_ELEMENT_OF", "EMPTY_SET", "SUBSET_OF_OR_EQUAL_TO", 
		"SUBSET_OF", "UNION", "INTERSECTION", "SET_MINUS", "CIRCLED_MINUS", "N_ARY_UNION", 
		"N_ARY_INTERSECTION", "MATHEMATICAL_DOUBLE_STRUCK_CAPITAL_F", "RIGHTWARDS_ARROW_FROM_BAR", 
		"RELATIONAL_COMPOSITION", "RING_OPERATOR", "WHITE_LEFT_POINTING_TRIANGLE", 
		"WHITE_RIGHT_POINTING_TRIANGLE", "DOMAIN_ANTIRESTRICTION", "RANGE_ANTIRESTRICTION", 
		"TILDE_OPERATOR", "LEFT_IMAGE_BRACKET", "RIGHT_IMAGE_BRACKET", "CIRCLED_PLUS", 
		"RIGHTWARDS_ARROW_WITH_VERTICAL_STROKE", "RIGHTWARDS_ARROW_WITH_TAIL_WITH_VERTICAL_STROKE", 
		"RIGHTWARDS_ARROW_WITH_TAIL", "RIGHTWARDS_TWO_HEADED_ARROW_WITH_VERTICAL_STROKE", 
		"RIGHTWARDS_TWO_HEADED_ARROW", "RIGHTWARDS_TWO_HEADED_ARROW_WITH_TAIL", 
		"RIGHTWARDS_ARROW_WITH_DOUBLE_VERTICAL_STROKE", "RIGHTWARDS_ARROW_WITH_TAIL_WITH_DOUBLE_VERTICAL_STROKE", 
		"DOUBLE_STRUCK_CAPITAL_Z", "HYPHEN_MINUS", "MINUS_SIGN", "LESS_THAN_OR_EQUAL_TO", 
		"LESS_THAN_SIGN", "GREATER_THAN_OR_EQUAL_TO", "GREATER_THAN_SIGN", "ASTERISK", 
		"NUMBER_SIGN", "CHARACTER_TIE", "UPWARDS_HARPOON_WITH_BARB_LEFTWARDS", 
		"UPWARDS_HARPOON_WITH_BARB_RIGHTWARDS", "LEFT_ANGLE_BRACKET", "RIGHT_ANGLE_BRACKET", 
		"ID0", "ID1", "ID", "PREP", "PRE", "POSTP", "POST", "IP", "I", "LP", "L", 
		"ELP", "EL", "ERP", "ER", "SRP", "SR", "EREP", "ERE", "SREP", "SRE", "ES", 
		"SS", "UNKNOWN", "NLCHAR"
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
	public String getGrammarFileName() { return "ZOperatorParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ZOperatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SpecificationContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ZOperatorParser.EOF, 0); }
		public List<TerminalNode> TEXT() { return getTokens(ZOperatorParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(ZOperatorParser.TEXT, i);
		}
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public List<ParagraphContext> paragraph() {
			return getRuleContexts(ParagraphContext.class);
		}
		public ParagraphContext paragraph(int i) {
			return getRuleContext(ParagraphContext.class,i);
		}
		public SpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitSpecification(this);
		}
	}

	public final SpecificationContext specification() throws RecognitionException {
		SpecificationContext _localctx = new SpecificationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ZED) | (1L << SCH) | (1L << AX) | (1L << TEXT))) != 0)) {
				{
				setState(45);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(42);
					match(TEXT);
					}
					break;
				case 2:
					{
					setState(43);
					section();
					}
					break;
				case 3:
					{
					setState(44);
					paragraph();
					}
					break;
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
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

	public static class SectionContext extends ParserRuleContext {
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
	 
		public SectionContext() { }
		public void copyFrom(SectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BaseSectionContext extends SectionContext {
		public TerminalNode ZED() { return getToken(ZOperatorParser.ZED, 0); }
		public TerminalNode SECTION() { return getToken(ZOperatorParser.SECTION, 0); }
		public TerminalNode NAME() { return getToken(ZOperatorParser.NAME, 0); }
		public TerminalNode END() { return getToken(ZOperatorParser.END, 0); }
		public List<ParagraphContext> paragraph() {
			return getRuleContexts(ParagraphContext.class);
		}
		public ParagraphContext paragraph(int i) {
			return getRuleContext(ParagraphContext.class,i);
		}
		public BaseSectionContext(SectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterBaseSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitBaseSection(this);
		}
	}
	public static class InheritingSectionContext extends SectionContext {
		public TerminalNode ZED() { return getToken(ZOperatorParser.ZED, 0); }
		public TerminalNode SECTION() { return getToken(ZOperatorParser.SECTION, 0); }
		public TerminalNode NAME() { return getToken(ZOperatorParser.NAME, 0); }
		public TerminalNode PARENTS() { return getToken(ZOperatorParser.PARENTS, 0); }
		public TerminalNode END() { return getToken(ZOperatorParser.END, 0); }
		public FormalsContext formals() {
			return getRuleContext(FormalsContext.class,0);
		}
		public List<ParagraphContext> paragraph() {
			return getRuleContexts(ParagraphContext.class);
		}
		public ParagraphContext paragraph(int i) {
			return getRuleContext(ParagraphContext.class,i);
		}
		public InheritingSectionContext(SectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterInheritingSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitInheritingSection(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_section);
		int _la;
		try {
			int _alt;
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new InheritingSectionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(ZED);
				setState(53);
				match(SECTION);
				setState(54);
				match(NAME);
				setState(55);
				match(PARENTS);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(56);
					formals();
					}
				}

				setState(59);
				match(END);
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(60);
						paragraph();
						}
						} 
					}
					setState(65);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new BaseSectionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(ZED);
				setState(67);
				match(SECTION);
				setState(68);
				match(NAME);
				setState(69);
				match(END);
				setState(73);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(70);
						paragraph();
						}
						} 
					}
					setState(75);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ParagraphContext extends ParserRuleContext {
		public ParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraph; }
	 
		public ParagraphContext() { }
		public void copyFrom(ParagraphContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NONOperatorTemplateParagraphContext extends ParagraphContext {
		public TerminalNode ZED() { return getToken(ZOperatorParser.ZED, 0); }
		public TerminalNode END() { return getToken(ZOperatorParser.END, 0); }
		public NONOperatorTemplateParagraphContext(ParagraphContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterNONOperatorTemplateParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitNONOperatorTemplateParagraph(this);
		}
	}
	public static class OperatorTemplateParagraphContext extends ParagraphContext {
		public TerminalNode ZED() { return getToken(ZOperatorParser.ZED, 0); }
		public OperatorTemplateContext operatorTemplate() {
			return getRuleContext(OperatorTemplateContext.class,0);
		}
		public TerminalNode END() { return getToken(ZOperatorParser.END, 0); }
		public OperatorTemplateParagraphContext(ParagraphContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterOperatorTemplateParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitOperatorTemplateParagraph(this);
		}
	}
	public static class SchemaDefinitionParagraphContext extends ParagraphContext {
		public TerminalNode SCH() { return getToken(ZOperatorParser.SCH, 0); }
		public TerminalNode END() { return getToken(ZOperatorParser.END, 0); }
		public SchemaDefinitionParagraphContext(ParagraphContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterSchemaDefinitionParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitSchemaDefinitionParagraph(this);
		}
	}
	public static class AxiomaticDescriptionParagraphContext extends ParagraphContext {
		public TerminalNode AX() { return getToken(ZOperatorParser.AX, 0); }
		public TerminalNode END() { return getToken(ZOperatorParser.END, 0); }
		public AxiomaticDescriptionParagraphContext(ParagraphContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterAxiomaticDescriptionParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitAxiomaticDescriptionParagraph(this);
		}
	}

	public final ParagraphContext paragraph() throws RecognitionException {
		ParagraphContext _localctx = new ParagraphContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paragraph);
		try {
			int _alt;
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new OperatorTemplateParagraphContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(ZED);
				setState(79);
				operatorTemplate();
				setState(80);
				match(END);
				}
				break;
			case 2:
				_localctx = new AxiomaticDescriptionParagraphContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(AX);
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(83);
						matchWildcard();
						}
						} 
					}
					setState(88);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(89);
				match(END);
				}
				break;
			case 3:
				_localctx = new SchemaDefinitionParagraphContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				match(SCH);
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(91);
						matchWildcard();
						}
						} 
					}
					setState(96);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(97);
				match(END);
				}
				break;
			case 4:
				_localctx = new NONOperatorTemplateParagraphContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				match(ZED);
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(99);
						matchWildcard();
						}
						} 
					}
					setState(104);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(105);
				match(END);
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

	public static class FormalsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ZOperatorParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ZOperatorParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ZOperatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ZOperatorParser.COMMA, i);
		}
		public FormalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterFormals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitFormals(this);
		}
	}

	public final FormalsContext formals() throws RecognitionException {
		FormalsContext _localctx = new FormalsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(NAME);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(109);
				match(COMMA);
				setState(110);
				match(NAME);
				}
				}
				setState(115);
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

	public static class OperatorTemplateContext extends ParserRuleContext {
		public OperatorTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorTemplate; }
	 
		public OperatorTemplateContext() { }
		public void copyFrom(OperatorTemplateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationOperatorTemplateContext extends OperatorTemplateContext {
		public TerminalNode RELATION() { return getToken(ZOperatorParser.RELATION, 0); }
		public TemplateContext template() {
			return getRuleContext(TemplateContext.class,0);
		}
		public RelationOperatorTemplateContext(OperatorTemplateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterRelationOperatorTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitRelationOperatorTemplate(this);
		}
	}
	public static class GenericOperatorTemplateContext extends OperatorTemplateContext {
		public TerminalNode GENERIC() { return getToken(ZOperatorParser.GENERIC, 0); }
		public CategoryTemplateContext categoryTemplate() {
			return getRuleContext(CategoryTemplateContext.class,0);
		}
		public GenericOperatorTemplateContext(OperatorTemplateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterGenericOperatorTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitGenericOperatorTemplate(this);
		}
	}
	public static class FunctionOperatorTemplateContext extends OperatorTemplateContext {
		public TerminalNode FUNCTION() { return getToken(ZOperatorParser.FUNCTION, 0); }
		public CategoryTemplateContext categoryTemplate() {
			return getRuleContext(CategoryTemplateContext.class,0);
		}
		public FunctionOperatorTemplateContext(OperatorTemplateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterFunctionOperatorTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitFunctionOperatorTemplate(this);
		}
	}

	public final OperatorTemplateContext operatorTemplate() throws RecognitionException {
		OperatorTemplateContext _localctx = new OperatorTemplateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operatorTemplate);
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELATION:
				_localctx = new RelationOperatorTemplateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(RELATION);
				setState(117);
				template();
				}
				break;
			case FUNCTION:
				_localctx = new FunctionOperatorTemplateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(FUNCTION);
				setState(119);
				categoryTemplate();
				}
				break;
			case GENERIC:
				_localctx = new GenericOperatorTemplateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				match(GENERIC);
				setState(121);
				categoryTemplate();
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

	public static class CategoryTemplateContext extends ParserRuleContext {
		public PrefixTemplateContext prefixTemplate() {
			return getRuleContext(PrefixTemplateContext.class,0);
		}
		public PostfixTemplateContext postfixTemplate() {
			return getRuleContext(PostfixTemplateContext.class,0);
		}
		public PrecContext prec() {
			return getRuleContext(PrecContext.class,0);
		}
		public AssocContext assoc() {
			return getRuleContext(AssocContext.class,0);
		}
		public InfixTemplateContext infixTemplate() {
			return getRuleContext(InfixTemplateContext.class,0);
		}
		public NofixTemplateContext nofixTemplate() {
			return getRuleContext(NofixTemplateContext.class,0);
		}
		public CategoryTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_categoryTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterCategoryTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitCategoryTemplate(this);
		}
	}

	public final CategoryTemplateContext categoryTemplate() throws RecognitionException {
		CategoryTemplateContext _localctx = new CategoryTemplateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_categoryTemplate);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				prefixTemplate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				postfixTemplate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				prec();
				setState(127);
				assoc();
				setState(128);
				infixTemplate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				nofixTemplate();
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

	public static class PrecContext extends ParserRuleContext {
		public TerminalNode NUMERAL() { return getToken(ZOperatorParser.NUMERAL, 0); }
		public PrecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterPrec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitPrec(this);
		}
	}

	public final PrecContext prec() throws RecognitionException {
		PrecContext _localctx = new PrecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_prec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(NUMERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssocContext extends ParserRuleContext {
		public TerminalNode LEFTASSOC() { return getToken(ZOperatorParser.LEFTASSOC, 0); }
		public TerminalNode RIGHTASSOC() { return getToken(ZOperatorParser.RIGHTASSOC, 0); }
		public AssocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterAssoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitAssoc(this);
		}
	}

	public final AssocContext assoc() throws RecognitionException {
		AssocContext _localctx = new AssocContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assoc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==LEFTASSOC || _la==RIGHTASSOC) ) {
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

	public static class TemplateContext extends ParserRuleContext {
		public PrefixTemplateContext prefixTemplate() {
			return getRuleContext(PrefixTemplateContext.class,0);
		}
		public PostfixTemplateContext postfixTemplate() {
			return getRuleContext(PostfixTemplateContext.class,0);
		}
		public InfixTemplateContext infixTemplate() {
			return getRuleContext(InfixTemplateContext.class,0);
		}
		public NofixTemplateContext nofixTemplate() {
			return getRuleContext(NofixTemplateContext.class,0);
		}
		public TemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitTemplate(this);
		}
	}

	public final TemplateContext template() throws RecognitionException {
		TemplateContext _localctx = new TemplateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_template);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				prefixTemplate();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				postfixTemplate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				infixTemplate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				nofixTemplate();
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

	public static class PrefixTemplateContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(ZOperatorParser.LEFT_PARENTHESIS, 0); }
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(ZOperatorParser.RIGHT_PARENTHESIS, 0); }
		public PrefixNameContext prefixName() {
			return getRuleContext(PrefixNameContext.class,0);
		}
		public TerminalNode POWERSET() { return getToken(ZOperatorParser.POWERSET, 0); }
		public TerminalNode ARGUMENT() { return getToken(ZOperatorParser.ARGUMENT, 0); }
		public PrefixTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterPrefixTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitPrefixTemplate(this);
		}
	}

	public final PrefixTemplateContext prefixTemplate() throws RecognitionException {
		PrefixTemplateContext _localctx = new PrefixTemplateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_prefixTemplate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(LEFT_PARENTHESIS);
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(144);
				prefixName();
				}
				break;
			case POWERSET:
				{
				setState(145);
				match(POWERSET);
				setState(146);
				match(ARGUMENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(149);
			match(RIGHT_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixTemplateContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(ZOperatorParser.LEFT_PARENTHESIS, 0); }
		public PostfixNameContext postfixName() {
			return getRuleContext(PostfixNameContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(ZOperatorParser.RIGHT_PARENTHESIS, 0); }
		public PostfixTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterPostfixTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitPostfixTemplate(this);
		}
	}

	public final PostfixTemplateContext postfixTemplate() throws RecognitionException {
		PostfixTemplateContext _localctx = new PostfixTemplateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_postfixTemplate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(LEFT_PARENTHESIS);
			setState(152);
			postfixName();
			setState(153);
			match(RIGHT_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixTemplateContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(ZOperatorParser.LEFT_PARENTHESIS, 0); }
		public InfixNameContext infixName() {
			return getRuleContext(InfixNameContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(ZOperatorParser.RIGHT_PARENTHESIS, 0); }
		public InfixTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterInfixTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitInfixTemplate(this);
		}
	}

	public final InfixTemplateContext infixTemplate() throws RecognitionException {
		InfixTemplateContext _localctx = new InfixTemplateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_infixTemplate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(LEFT_PARENTHESIS);
			setState(156);
			infixName();
			setState(157);
			match(RIGHT_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NofixTemplateContext extends ParserRuleContext {
		public TerminalNode LEFT_PARENTHESIS() { return getToken(ZOperatorParser.LEFT_PARENTHESIS, 0); }
		public NofixNameContext nofixName() {
			return getRuleContext(NofixNameContext.class,0);
		}
		public TerminalNode RIGHT_PARENTHESIS() { return getToken(ZOperatorParser.RIGHT_PARENTHESIS, 0); }
		public NofixTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nofixTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterNofixTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitNofixTemplate(this);
		}
	}

	public final NofixTemplateContext nofixTemplate() throws RecognitionException {
		NofixTemplateContext _localctx = new NofixTemplateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_nofixTemplate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(LEFT_PARENTHESIS);
			setState(160);
			nofixName();
			setState(161);
			match(RIGHT_PARENTHESIS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptArgNameContext extends ParserRuleContext {
		public TerminalNode ARGUMENT() { return getToken(ZOperatorParser.ARGUMENT, 0); }
		public TerminalNode NAME() { return getToken(ZOperatorParser.NAME, 0); }
		public OptArgNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optArgName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterOptArgName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitOptArgName(this);
		}
	}

	public final OptArgNameContext optArgName() throws RecognitionException {
		OptArgNameContext _localctx = new OptArgNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_optArgName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ARGUMENT);
			setState(164);
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

	public static class OptListNameContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(ZOperatorParser.LIST, 0); }
		public TerminalNode NAME() { return getToken(ZOperatorParser.NAME, 0); }
		public OptListNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optListName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterOptListName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitOptListName(this);
		}
	}

	public final OptListNameContext optListName() throws RecognitionException {
		OptListNameContext _localctx = new OptListNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_optListName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(LIST);
			setState(167);
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

	public static class ArgNameContext extends ParserRuleContext {
		public TerminalNode ARGUMENT() { return getToken(ZOperatorParser.ARGUMENT, 0); }
		public TerminalNode NAME() { return getToken(ZOperatorParser.NAME, 0); }
		public ArgNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterArgName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitArgName(this);
		}
	}

	public final ArgNameContext argName() throws RecognitionException {
		ArgNameContext _localctx = new ArgNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_argName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(ARGUMENT);
			setState(170);
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

	public static class ListNameContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(ZOperatorParser.LIST, 0); }
		public TerminalNode NAME() { return getToken(ZOperatorParser.NAME, 0); }
		public ListNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterListName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitListName(this);
		}
	}

	public final ListNameContext listName() throws RecognitionException {
		ListNameContext _localctx = new ListNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(LIST);
			setState(173);
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

	public static class PrefixNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ZOperatorParser.NAME, 0); }
		public TerminalNode ARGUMENT() { return getToken(ZOperatorParser.ARGUMENT, 0); }
		public ArgNameContext argName() {
			return getRuleContext(ArgNameContext.class,0);
		}
		public ListNameContext listName() {
			return getRuleContext(ListNameContext.class,0);
		}
		public List<OptArgNameContext> optArgName() {
			return getRuleContexts(OptArgNameContext.class);
		}
		public OptArgNameContext optArgName(int i) {
			return getRuleContext(OptArgNameContext.class,i);
		}
		public List<OptListNameContext> optListName() {
			return getRuleContexts(OptListNameContext.class);
		}
		public OptListNameContext optListName(int i) {
			return getRuleContext(OptListNameContext.class,i);
		}
		public PrefixNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterPrefixName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitPrefixName(this);
		}
	}

	public final PrefixNameContext prefixName() throws RecognitionException {
		PrefixNameContext _localctx = new PrefixNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_prefixName);
		try {
			int _alt;
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(NAME);
				setState(176);
				match(ARGUMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(NAME);
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(180);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ARGUMENT:
							{
							setState(178);
							optArgName();
							}
							break;
						case LIST:
							{
							setState(179);
							optListName();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(184);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(187);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ARGUMENT:
					{
					setState(185);
					argName();
					}
					break;
				case LIST:
					{
					setState(186);
					listName();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(189);
				match(ARGUMENT);
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

	public static class PostfixNameContext extends ParserRuleContext {
		public TerminalNode ARGUMENT() { return getToken(ZOperatorParser.ARGUMENT, 0); }
		public TerminalNode NAME() { return getToken(ZOperatorParser.NAME, 0); }
		public ArgNameContext argName() {
			return getRuleContext(ArgNameContext.class,0);
		}
		public ListNameContext listName() {
			return getRuleContext(ListNameContext.class,0);
		}
		public List<OptArgNameContext> optArgName() {
			return getRuleContexts(OptArgNameContext.class);
		}
		public OptArgNameContext optArgName(int i) {
			return getRuleContext(OptArgNameContext.class,i);
		}
		public List<OptListNameContext> optListName() {
			return getRuleContexts(OptListNameContext.class);
		}
		public OptListNameContext optListName(int i) {
			return getRuleContext(OptListNameContext.class,i);
		}
		public PostfixNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterPostfixName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitPostfixName(this);
		}
	}

	public final PostfixNameContext postfixName() throws RecognitionException {
		PostfixNameContext _localctx = new PostfixNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_postfixName);
		try {
			int _alt;
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(ARGUMENT);
				setState(194);
				match(NAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(ARGUMENT);
				setState(196);
				match(NAME);
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(199);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ARGUMENT:
							{
							setState(197);
							optArgName();
							}
							break;
						case LIST:
							{
							setState(198);
							optListName();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(203);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(206);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ARGUMENT:
					{
					setState(204);
					argName();
					}
					break;
				case LIST:
					{
					setState(205);
					listName();
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class InfixNameContext extends ParserRuleContext {
		public List<TerminalNode> ARGUMENT() { return getTokens(ZOperatorParser.ARGUMENT); }
		public TerminalNode ARGUMENT(int i) {
			return getToken(ZOperatorParser.ARGUMENT, i);
		}
		public TerminalNode NAME() { return getToken(ZOperatorParser.NAME, 0); }
		public ArgNameContext argName() {
			return getRuleContext(ArgNameContext.class,0);
		}
		public ListNameContext listName() {
			return getRuleContext(ListNameContext.class,0);
		}
		public List<OptArgNameContext> optArgName() {
			return getRuleContexts(OptArgNameContext.class);
		}
		public OptArgNameContext optArgName(int i) {
			return getRuleContext(OptArgNameContext.class,i);
		}
		public List<OptListNameContext> optListName() {
			return getRuleContexts(OptListNameContext.class);
		}
		public OptListNameContext optListName(int i) {
			return getRuleContext(OptListNameContext.class,i);
		}
		public InfixNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterInfixName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitInfixName(this);
		}
	}

	public final InfixNameContext infixName() throws RecognitionException {
		InfixNameContext _localctx = new InfixNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_infixName);
		try {
			int _alt;
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(ARGUMENT);
				setState(211);
				match(NAME);
				setState(212);
				match(ARGUMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(ARGUMENT);
				setState(214);
				match(NAME);
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(217);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case ARGUMENT:
							{
							setState(215);
							optArgName();
							}
							break;
						case LIST:
							{
							setState(216);
							optListName();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(221);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(224);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ARGUMENT:
					{
					setState(222);
					argName();
					}
					break;
				case LIST:
					{
					setState(223);
					listName();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(226);
				match(ARGUMENT);
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

	public static class NofixNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ZOperatorParser.NAME, 0); }
		public ArgNameContext argName() {
			return getRuleContext(ArgNameContext.class,0);
		}
		public ListNameContext listName() {
			return getRuleContext(ListNameContext.class,0);
		}
		public List<OptArgNameContext> optArgName() {
			return getRuleContexts(OptArgNameContext.class);
		}
		public OptArgNameContext optArgName(int i) {
			return getRuleContext(OptArgNameContext.class,i);
		}
		public List<OptListNameContext> optListName() {
			return getRuleContexts(OptListNameContext.class);
		}
		public OptListNameContext optListName(int i) {
			return getRuleContext(OptListNameContext.class,i);
		}
		public NofixNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nofixName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).enterNofixName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ZOperatorParserListener ) ((ZOperatorParserListener)listener).exitNofixName(this);
		}
	}

	public final NofixNameContext nofixName() throws RecognitionException {
		NofixNameContext _localctx = new NofixNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nofixName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(NAME);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(233);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ARGUMENT:
						{
						setState(231);
						optArgName();
						}
						break;
					case LIST:
						{
						setState(232);
						optListName();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARGUMENT:
				{
				setState(238);
				argName();
				}
				break;
			case LIST:
				{
				setState(239);
				listName();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u009e\u00f5\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\3\3\3\7\3@\n\3\f\3\16"+
		"\3C\13\3\3\3\3\3\3\3\3\3\3\3\7\3J\n\3\f\3\16\3M\13\3\5\3O\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4W\n\4\f\4\16\4Z\13\4\3\4\3\4\3\4\7\4_\n\4\f\4\16\4"+
		"b\13\4\3\4\3\4\3\4\7\4g\n\4\f\4\16\4j\13\4\3\4\5\4m\n\4\3\5\3\5\3\5\7"+
		"\5r\n\5\f\5\16\5u\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6}\n\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u0086\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0090"+
		"\n\n\3\13\3\13\3\13\3\13\5\13\u0096\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u00b7\n\23\f\23"+
		"\16\23\u00ba\13\23\3\23\3\23\5\23\u00be\n\23\3\23\3\23\5\23\u00c2\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00ca\n\24\f\24\16\24\u00cd\13\24"+
		"\3\24\3\24\5\24\u00d1\n\24\5\24\u00d3\n\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\7\25\u00dc\n\25\f\25\16\25\u00df\13\25\3\25\3\25\5\25\u00e3\n"+
		"\25\3\25\3\25\5\25\u00e7\n\25\3\26\3\26\3\26\7\26\u00ec\n\26\f\26\16\26"+
		"\u00ef\13\26\3\26\3\26\5\26\u00f3\n\26\3\26\5X`h\2\27\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*\2\3\4\2\35\35##\2\u0105\2\61\3\2\2\2\4N\3"+
		"\2\2\2\6l\3\2\2\2\bn\3\2\2\2\n|\3\2\2\2\f\u0085\3\2\2\2\16\u0087\3\2\2"+
		"\2\20\u0089\3\2\2\2\22\u008f\3\2\2\2\24\u0091\3\2\2\2\26\u0099\3\2\2\2"+
		"\30\u009d\3\2\2\2\32\u00a1\3\2\2\2\34\u00a5\3\2\2\2\36\u00a8\3\2\2\2 "+
		"\u00ab\3\2\2\2\"\u00ae\3\2\2\2$\u00c1\3\2\2\2&\u00d2\3\2\2\2(\u00e6\3"+
		"\2\2\2*\u00e8\3\2\2\2,\60\7\6\2\2-\60\5\4\3\2.\60\5\6\4\2/,\3\2\2\2/-"+
		"\3\2\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\64\3\2\2"+
		"\2\63\61\3\2\2\2\64\65\7\2\2\3\65\3\3\2\2\2\66\67\7\3\2\2\678\7$\2\28"+
		"9\7F\2\29;\7 \2\2:<\5\b\5\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=A\7\24\2\2>"+
		"@\5\6\4\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BO\3\2\2\2CA\3\2\2\2"+
		"DE\7\3\2\2EF\7$\2\2FG\7F\2\2GK\7\24\2\2HJ\5\6\4\2IH\3\2\2\2JM\3\2\2\2"+
		"KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2MK\3\2\2\2N\66\3\2\2\2ND\3\2\2\2O\5\3\2"+
		"\2\2PQ\7\3\2\2QR\5\n\6\2RS\7\24\2\2Sm\3\2\2\2TX\7\5\2\2UW\13\2\2\2VU\3"+
		"\2\2\2WZ\3\2\2\2XY\3\2\2\2XV\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[m\7\24\2\2\\"+
		"`\7\4\2\2]_\13\2\2\2^]\3\2\2\2_b\3\2\2\2`a\3\2\2\2`^\3\2\2\2ac\3\2\2\2"+
		"b`\3\2\2\2cm\7\24\2\2dh\7\3\2\2eg\13\2\2\2fe\3\2\2\2gj\3\2\2\2hi\3\2\2"+
		"\2hf\3\2\2\2ik\3\2\2\2jh\3\2\2\2km\7\24\2\2lP\3\2\2\2lT\3\2\2\2l\\\3\2"+
		"\2\2ld\3\2\2\2m\7\3\2\2\2ns\7F\2\2op\7)\2\2pr\7F\2\2qo\3\2\2\2ru\3\2\2"+
		"\2sq\3\2\2\2st\3\2\2\2t\t\3\2\2\2us\3\2\2\2vw\7\"\2\2w}\5\22\n\2xy\7\32"+
		"\2\2y}\5\f\7\2z{\7\33\2\2{}\5\f\7\2|v\3\2\2\2|x\3\2\2\2|z\3\2\2\2}\13"+
		"\3\2\2\2~\u0086\5\24\13\2\177\u0086\5\26\f\2\u0080\u0081\5\16\b\2\u0081"+
		"\u0082\5\20\t\2\u0082\u0083\5\30\r\2\u0083\u0086\3\2\2\2\u0084\u0086\5"+
		"\32\16\2\u0085~\3\2\2\2\u0085\177\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0084"+
		"\3\2\2\2\u0086\r\3\2\2\2\u0087\u0088\7\7\2\2\u0088\17\3\2\2\2\u0089\u008a"+
		"\t\2\2\2\u008a\21\3\2\2\2\u008b\u0090\5\24\13\2\u008c\u0090\5\26\f\2\u008d"+
		"\u0090\5\30\r\2\u008e\u0090\5\32\16\2\u008f\u008b\3\2\2\2\u008f\u008c"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\23\3\2\2\2\u0091"+
		"\u0095\7\t\2\2\u0092\u0096\5$\23\2\u0093\u0094\7\37\2\2\u0094\u0096\7"+
		"\61\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\7\n\2\2\u0098\25\3\2\2\2\u0099\u009a\7\t\2\2\u009a\u009b\5&\24"+
		"\2\u009b\u009c\7\n\2\2\u009c\27\3\2\2\2\u009d\u009e\7\t\2\2\u009e\u009f"+
		"\5(\25\2\u009f\u00a0\7\n\2\2\u00a0\31\3\2\2\2\u00a1\u00a2\7\t\2\2\u00a2"+
		"\u00a3\5*\26\2\u00a3\u00a4\7\n\2\2\u00a4\33\3\2\2\2\u00a5\u00a6\7\61\2"+
		"\2\u00a6\u00a7\7F\2\2\u00a7\35\3\2\2\2\u00a8\u00a9\7\62\2\2\u00a9\u00aa"+
		"\7F\2\2\u00aa\37\3\2\2\2\u00ab\u00ac\7\61\2\2\u00ac\u00ad\7F\2\2\u00ad"+
		"!\3\2\2\2\u00ae\u00af\7\62\2\2\u00af\u00b0\7F\2\2\u00b0#\3\2\2\2\u00b1"+
		"\u00b2\7F\2\2\u00b2\u00c2\7\61\2\2\u00b3\u00b8\7F\2\2\u00b4\u00b7\5\34"+
		"\17\2\u00b5\u00b7\5\36\20\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bd\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00be\5 \21\2\u00bc\u00be\5\"\22\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\61"+
		"\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00b1\3\2\2\2\u00c1\u00b3\3\2\2\2\u00c2"+
		"%\3\2\2\2\u00c3\u00c4\7\61\2\2\u00c4\u00d3\7F\2\2\u00c5\u00c6\7\61\2\2"+
		"\u00c6\u00cb\7F\2\2\u00c7\u00ca\5\34\17\2\u00c8\u00ca\5\36\20\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d0\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00d1\5 \21\2\u00cf\u00d1\5\"\22\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3"+
		"\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00c3\3\2\2\2\u00d2\u00c5\3\2\2\2\u00d3"+
		"\'\3\2\2\2\u00d4\u00d5\7\61\2\2\u00d5\u00d6\7F\2\2\u00d6\u00e7\7\61\2"+
		"\2\u00d7\u00d8\7\61\2\2\u00d8\u00dd\7F\2\2\u00d9\u00dc\5\34\17\2\u00da"+
		"\u00dc\5\36\20\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3"+
		"\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e2\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e3\5 \21\2\u00e1\u00e3\5\"\22\2\u00e2\u00e0\3"+
		"\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7\61\2\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00d4\3\2\2\2\u00e6\u00d7\3\2\2\2\u00e7)\3\2\2\2"+
		"\u00e8\u00ed\7F\2\2\u00e9\u00ec\5\34\17\2\u00ea\u00ec\5\36\20\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f2\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f3\5 \21\2\u00f1\u00f3\5\"\22\2\u00f2\u00f0\3\2\2\2\u00f2\u00f1\3"+
		"\2\2\2\u00f3+\3\2\2\2 /\61;AKNX`hls|\u0085\u008f\u0095\u00b6\u00b8\u00bd"+
		"\u00c1\u00c9\u00cb\u00d0\u00d2\u00db\u00dd\u00e2\u00e6\u00eb\u00ed\u00f2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}