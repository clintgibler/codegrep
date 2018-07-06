// Generated from mdx/mdx.g4 by ANTLR 4.7.1
package parsers.mdx;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mdxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		QUOTE=1, ASTERISK=2, COLON=3, SEMICOLON=4, COMMA=5, CONCAT=6, DOT=7, EQ=8, 
		GE=9, GT=10, LBRACE=11, LE=12, LPAREN=13, LT=14, MINUS=15, NE=16, PLUS=17, 
		RBRACE=18, RPAREN=19, SOLIDUS=20, AND=21, AS=22, CASE=23, CELL=24, CELL_ORDINAL=25, 
		CREATE=26, DIMENSION=27, ELSE=28, EMPTY=29, END=30, FORMATTED_VALUE=31, 
		FROM=32, GLOBAL=33, MEMBER=34, NON=35, NOT=36, ON=37, OR=38, PROPERTIES=39, 
		SELECT=40, SESSION=41, SET=42, THEN=43, VALUE=44, WHEN=45, WHERE=46, XOR=47, 
		WITH=48, NUMBER=49, F=50, ID=51, AMP_QUOTED_ID=52, QUOTED_ID=53, STRING=54, 
		WS=55;
	public static final int
		RULE_mdx_statement = 0, RULE_select_statement = 1, RULE_formula_specification = 2, 
		RULE_single_formula_specification = 3, RULE_set_specification = 4, RULE_member_specification = 5, 
		RULE_axis_specification_list = 6, RULE_member_property_def_list = 7, RULE_member_name = 8, 
		RULE_member_property_definition = 9, RULE_set_name = 10, RULE_compound_id = 11, 
		RULE_axis_specification = 12, RULE_axis_name = 13, RULE_dim_props = 14, 
		RULE_property_list = 15, RULE_property = 16, RULE_cube_specification = 17, 
		RULE_cube_name = 18, RULE_slicer_specification = 19, RULE_cell_props = 20, 
		RULE_cell_property_list = 21, RULE_cell_property = 22, RULE_mandatory_cell_property = 23, 
		RULE_provider_specific_cell_property = 24, RULE_expression = 25, RULE_value_expression = 26, 
		RULE_value_xor_expression = 27, RULE_value_or_expression = 28, RULE_term5 = 29, 
		RULE_term4 = 30, RULE_term3 = 31, RULE_term2 = 32, RULE_term = 33, RULE_factor = 34, 
		RULE_function = 35, RULE_value_expression_primary = 36, RULE_value_expression_primary0 = 37, 
		RULE_exp_list = 38, RULE_case_expression = 39, RULE_when_list = 40, RULE_when_clause = 41, 
		RULE_comp_op = 42, RULE_identifier = 43, RULE_unquoted_identifier = 44, 
		RULE_amp_quoted_identifier = 45, RULE_quoted_identifier = 46, RULE_keyword = 47;
	public static final String[] ruleNames = {
		"mdx_statement", "select_statement", "formula_specification", "single_formula_specification", 
		"set_specification", "member_specification", "axis_specification_list", 
		"member_property_def_list", "member_name", "member_property_definition", 
		"set_name", "compound_id", "axis_specification", "axis_name", "dim_props", 
		"property_list", "property", "cube_specification", "cube_name", "slicer_specification", 
		"cell_props", "cell_property_list", "cell_property", "mandatory_cell_property", 
		"provider_specific_cell_property", "expression", "value_expression", "value_xor_expression", 
		"value_or_expression", "term5", "term4", "term3", "term2", "term", "factor", 
		"function", "value_expression_primary", "value_expression_primary0", "exp_list", 
		"case_expression", "when_list", "when_clause", "comp_op", "identifier", 
		"unquoted_identifier", "amp_quoted_identifier", "quoted_identifier", "keyword"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'''", "'*'", "':'", "';'", "','", "'||'", "'.'", "'='", "'>='", 
		"'>'", "'{'", "'<='", "'('", "'<'", "'-'", "'<>'", "'+'", "'}'", "')'", 
		"'/'", "'AND'", "'AS'", "'CASE'", "'CELL'", "'CELL_ORDINAL'", "'CREATE'", 
		"'DIMENSION'", "'ELSE'", "'EMPTY'", "'END'", "'FORMATTED_VALUE'", "'FROM'", 
		"'GLOBAL'", "'MEMBER'", "'NON'", "'NOT'", "'ON'", "'OR'", "'PROPERTIES'", 
		"'SELECT'", "'SESSION'", "'SET'", "'THEN'", "'VALUE'", "'WHEN'", "'WHERE'", 
		"'XOR'", "'WITH'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "QUOTE", "ASTERISK", "COLON", "SEMICOLON", "COMMA", "CONCAT", "DOT", 
		"EQ", "GE", "GT", "LBRACE", "LE", "LPAREN", "LT", "MINUS", "NE", "PLUS", 
		"RBRACE", "RPAREN", "SOLIDUS", "AND", "AS", "CASE", "CELL", "CELL_ORDINAL", 
		"CREATE", "DIMENSION", "ELSE", "EMPTY", "END", "FORMATTED_VALUE", "FROM", 
		"GLOBAL", "MEMBER", "NON", "NOT", "ON", "OR", "PROPERTIES", "SELECT", 
		"SESSION", "SET", "THEN", "VALUE", "WHEN", "WHERE", "XOR", "WITH", "NUMBER", 
		"F", "ID", "AMP_QUOTED_ID", "QUOTED_ID", "STRING", "WS"
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
	public String getGrammarFileName() { return "mdx.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mdxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Mdx_statementContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(mdxParser.EOF, 0); }
		public Select_statementContext select_statement() {
			return getRuleContext(Select_statementContext.class,0);
		}
		public Mdx_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mdx_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterMdx_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitMdx_statement(this);
		}
	}

	public final Mdx_statementContext mdx_statement() throws RecognitionException {
		Mdx_statementContext _localctx = new Mdx_statementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mdx_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(96);
			select_statement();
			}
			setState(97);
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

	public static class Select_statementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(mdxParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(mdxParser.FROM, 0); }
		public Cube_specificationContext cube_specification() {
			return getRuleContext(Cube_specificationContext.class,0);
		}
		public TerminalNode WITH() { return getToken(mdxParser.WITH, 0); }
		public Formula_specificationContext formula_specification() {
			return getRuleContext(Formula_specificationContext.class,0);
		}
		public Axis_specification_listContext axis_specification_list() {
			return getRuleContext(Axis_specification_listContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(mdxParser.WHERE, 0); }
		public Slicer_specificationContext slicer_specification() {
			return getRuleContext(Slicer_specificationContext.class,0);
		}
		public Cell_propsContext cell_props() {
			return getRuleContext(Cell_propsContext.class,0);
		}
		public Select_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterSelect_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitSelect_statement(this);
		}
	}

	public final Select_statementContext select_statement() throws RecognitionException {
		Select_statementContext _localctx = new Select_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_select_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(99);
				match(WITH);
				setState(100);
				formula_specification();
				}
			}

			setState(103);
			match(SELECT);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LPAREN) | (1L << MINUS) | (1L << PLUS) | (1L << CASE) | (1L << DIMENSION) | (1L << NON) | (1L << NOT) | (1L << PROPERTIES) | (1L << NUMBER) | (1L << ID) | (1L << QUOTED_ID) | (1L << STRING))) != 0)) {
				{
				setState(104);
				axis_specification_list();
				}
			}

			setState(107);
			match(FROM);
			setState(108);
			cube_specification();
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(109);
				match(WHERE);
				setState(110);
				slicer_specification();
				}
			}

			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CELL || _la==PROPERTIES) {
				{
				setState(113);
				cell_props();
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

	public static class Formula_specificationContext extends ParserRuleContext {
		public List<Single_formula_specificationContext> single_formula_specification() {
			return getRuleContexts(Single_formula_specificationContext.class);
		}
		public Single_formula_specificationContext single_formula_specification(int i) {
			return getRuleContext(Single_formula_specificationContext.class,i);
		}
		public Formula_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterFormula_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitFormula_specification(this);
		}
	}

	public final Formula_specificationContext formula_specification() throws RecognitionException {
		Formula_specificationContext _localctx = new Formula_specificationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_formula_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				single_formula_specification();
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MEMBER || _la==SET );
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

	public static class Single_formula_specificationContext extends ParserRuleContext {
		public Member_specificationContext member_specification() {
			return getRuleContext(Member_specificationContext.class,0);
		}
		public Set_specificationContext set_specification() {
			return getRuleContext(Set_specificationContext.class,0);
		}
		public Single_formula_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_formula_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterSingle_formula_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitSingle_formula_specification(this);
		}
	}

	public final Single_formula_specificationContext single_formula_specification() throws RecognitionException {
		Single_formula_specificationContext _localctx = new Single_formula_specificationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_formula_specification);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MEMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				member_specification();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				set_specification();
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

	public static class Set_specificationContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(mdxParser.SET, 0); }
		public Set_nameContext set_name() {
			return getRuleContext(Set_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(mdxParser.AS, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(mdxParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(mdxParser.QUOTE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Set_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterSet_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitSet_specification(this);
		}
	}

	public final Set_specificationContext set_specification() throws RecognitionException {
		Set_specificationContext _localctx = new Set_specificationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_set_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(SET);
			setState(126);
			set_name();
			setState(127);
			match(AS);
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
				{
				setState(128);
				match(QUOTE);
				setState(129);
				expression();
				setState(130);
				match(QUOTE);
				}
				break;
			case LBRACE:
			case LPAREN:
			case MINUS:
			case PLUS:
			case CASE:
			case DIMENSION:
			case NOT:
			case PROPERTIES:
			case NUMBER:
			case ID:
			case QUOTED_ID:
			case STRING:
				{
				setState(132);
				expression();
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

	public static class Member_specificationContext extends ParserRuleContext {
		public TerminalNode MEMBER() { return getToken(mdxParser.MEMBER, 0); }
		public Member_nameContext member_name() {
			return getRuleContext(Member_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(mdxParser.AS, 0); }
		public TerminalNode COMMA() { return getToken(mdxParser.COMMA, 0); }
		public List<TerminalNode> QUOTE() { return getTokens(mdxParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(mdxParser.QUOTE, i);
		}
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Member_property_def_listContext member_property_def_list() {
			return getRuleContext(Member_property_def_listContext.class,0);
		}
		public Member_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterMember_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitMember_specification(this);
		}
	}

	public final Member_specificationContext member_specification() throws RecognitionException {
		Member_specificationContext _localctx = new Member_specificationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_member_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(MEMBER);
			setState(136);
			member_name();
			setState(137);
			match(AS);
			{
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTE:
				{
				setState(138);
				match(QUOTE);
				setState(139);
				value_expression();
				setState(140);
				match(QUOTE);
				}
				break;
			case LBRACE:
			case LPAREN:
			case MINUS:
			case PLUS:
			case CASE:
			case DIMENSION:
			case NOT:
			case PROPERTIES:
			case NUMBER:
			case ID:
			case QUOTED_ID:
			case STRING:
				{
				setState(142);
				value_expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(145);
			match(COMMA);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIMENSION) | (1L << PROPERTIES) | (1L << ID) | (1L << QUOTED_ID))) != 0)) {
				{
				setState(146);
				member_property_def_list();
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

	public static class Axis_specification_listContext extends ParserRuleContext {
		public List<Axis_specificationContext> axis_specification() {
			return getRuleContexts(Axis_specificationContext.class);
		}
		public Axis_specificationContext axis_specification(int i) {
			return getRuleContext(Axis_specificationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mdxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mdxParser.COMMA, i);
		}
		public Axis_specification_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axis_specification_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterAxis_specification_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitAxis_specification_list(this);
		}
	}

	public final Axis_specification_listContext axis_specification_list() throws RecognitionException {
		Axis_specification_listContext _localctx = new Axis_specification_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_axis_specification_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			axis_specification();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(150);
				match(COMMA);
				setState(151);
				axis_specification();
				}
				}
				setState(156);
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

	public static class Member_property_def_listContext extends ParserRuleContext {
		public List<Member_property_definitionContext> member_property_definition() {
			return getRuleContexts(Member_property_definitionContext.class);
		}
		public Member_property_definitionContext member_property_definition(int i) {
			return getRuleContext(Member_property_definitionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mdxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mdxParser.COMMA, i);
		}
		public Member_property_def_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_property_def_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterMember_property_def_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitMember_property_def_list(this);
		}
	}

	public final Member_property_def_listContext member_property_def_list() throws RecognitionException {
		Member_property_def_listContext _localctx = new Member_property_def_listContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_member_property_def_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			member_property_definition();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(158);
				match(COMMA);
				setState(159);
				member_property_definition();
				}
				}
				setState(164);
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

	public static class Member_nameContext extends ParserRuleContext {
		public Compound_idContext compound_id() {
			return getRuleContext(Compound_idContext.class,0);
		}
		public Member_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterMember_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitMember_name(this);
		}
	}

	public final Member_nameContext member_name() throws RecognitionException {
		Member_nameContext _localctx = new Member_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_member_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			compound_id();
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

	public static class Member_property_definitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(mdxParser.EQ, 0); }
		public Value_expressionContext value_expression() {
			return getRuleContext(Value_expressionContext.class,0);
		}
		public Member_property_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member_property_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterMember_property_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitMember_property_definition(this);
		}
	}

	public final Member_property_definitionContext member_property_definition() throws RecognitionException {
		Member_property_definitionContext _localctx = new Member_property_definitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_member_property_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			identifier();
			setState(168);
			match(EQ);
			setState(169);
			value_expression();
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

	public static class Set_nameContext extends ParserRuleContext {
		public Compound_idContext compound_id() {
			return getRuleContext(Compound_idContext.class,0);
		}
		public Set_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterSet_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitSet_name(this);
		}
	}

	public final Set_nameContext set_name() throws RecognitionException {
		Set_nameContext _localctx = new Set_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_set_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			compound_id();
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

	public static class Compound_idContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(mdxParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(mdxParser.DOT, i);
		}
		public Compound_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterCompound_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitCompound_id(this);
		}
	}

	public final Compound_idContext compound_id() throws RecognitionException {
		Compound_idContext _localctx = new Compound_idContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compound_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			identifier();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(174);
				match(DOT);
				setState(175);
				identifier();
				}
				}
				setState(180);
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

	public static class Axis_specificationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ON() { return getToken(mdxParser.ON, 0); }
		public Axis_nameContext axis_name() {
			return getRuleContext(Axis_nameContext.class,0);
		}
		public TerminalNode NON() { return getToken(mdxParser.NON, 0); }
		public TerminalNode EMPTY() { return getToken(mdxParser.EMPTY, 0); }
		public Dim_propsContext dim_props() {
			return getRuleContext(Dim_propsContext.class,0);
		}
		public Axis_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axis_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterAxis_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitAxis_specification(this);
		}
	}

	public final Axis_specificationContext axis_specification() throws RecognitionException {
		Axis_specificationContext _localctx = new Axis_specificationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_axis_specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NON) {
				{
				setState(181);
				match(NON);
				setState(182);
				match(EMPTY);
				}
			}

			setState(185);
			expression();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIMENSION || _la==PROPERTIES) {
				{
				setState(186);
				dim_props();
				}
			}

			setState(189);
			match(ON);
			setState(190);
			axis_name();
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

	public static class Axis_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Axis_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axis_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterAxis_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitAxis_name(this);
		}
	}

	public final Axis_nameContext axis_name() throws RecognitionException {
		Axis_nameContext _localctx = new Axis_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_axis_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
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

	public static class Dim_propsContext extends ParserRuleContext {
		public TerminalNode PROPERTIES() { return getToken(mdxParser.PROPERTIES, 0); }
		public Property_listContext property_list() {
			return getRuleContext(Property_listContext.class,0);
		}
		public TerminalNode DIMENSION() { return getToken(mdxParser.DIMENSION, 0); }
		public Dim_propsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim_props; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterDim_props(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitDim_props(this);
		}
	}

	public final Dim_propsContext dim_props() throws RecognitionException {
		Dim_propsContext _localctx = new Dim_propsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dim_props);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIMENSION) {
				{
				setState(194);
				match(DIMENSION);
				}
			}

			setState(197);
			match(PROPERTIES);
			setState(198);
			property_list();
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

	public static class Property_listContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mdxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mdxParser.COMMA, i);
		}
		public Property_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterProperty_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitProperty_list(this);
		}
	}

	public final Property_listContext property_list() throws RecognitionException {
		Property_listContext _localctx = new Property_listContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_property_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			property();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(201);
				match(COMMA);
				setState(202);
				property();
				}
				}
				setState(207);
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

	public static class PropertyContext extends ParserRuleContext {
		public Compound_idContext compound_id() {
			return getRuleContext(Compound_idContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			compound_id();
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

	public static class Cube_specificationContext extends ParserRuleContext {
		public Cube_nameContext cube_name() {
			return getRuleContext(Cube_nameContext.class,0);
		}
		public Cube_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cube_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterCube_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitCube_specification(this);
		}
	}

	public final Cube_specificationContext cube_specification() throws RecognitionException {
		Cube_specificationContext _localctx = new Cube_specificationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cube_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			cube_name();
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

	public static class Cube_nameContext extends ParserRuleContext {
		public Compound_idContext compound_id() {
			return getRuleContext(Compound_idContext.class,0);
		}
		public Cube_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cube_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterCube_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitCube_name(this);
		}
	}

	public final Cube_nameContext cube_name() throws RecognitionException {
		Cube_nameContext _localctx = new Cube_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cube_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			compound_id();
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

	public static class Slicer_specificationContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Slicer_specificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slicer_specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterSlicer_specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitSlicer_specification(this);
		}
	}

	public final Slicer_specificationContext slicer_specification() throws RecognitionException {
		Slicer_specificationContext _localctx = new Slicer_specificationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_slicer_specification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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

	public static class Cell_propsContext extends ParserRuleContext {
		public TerminalNode PROPERTIES() { return getToken(mdxParser.PROPERTIES, 0); }
		public Cell_property_listContext cell_property_list() {
			return getRuleContext(Cell_property_listContext.class,0);
		}
		public TerminalNode CELL() { return getToken(mdxParser.CELL, 0); }
		public Cell_propsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell_props; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterCell_props(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitCell_props(this);
		}
	}

	public final Cell_propsContext cell_props() throws RecognitionException {
		Cell_propsContext _localctx = new Cell_propsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cell_props);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CELL) {
				{
				setState(216);
				match(CELL);
				}
			}

			setState(219);
			match(PROPERTIES);
			setState(220);
			cell_property_list();
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

	public static class Cell_property_listContext extends ParserRuleContext {
		public List<Cell_propertyContext> cell_property() {
			return getRuleContexts(Cell_propertyContext.class);
		}
		public Cell_propertyContext cell_property(int i) {
			return getRuleContext(Cell_propertyContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(mdxParser.COMMA, 0); }
		public Cell_property_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell_property_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterCell_property_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitCell_property_list(this);
		}
	}

	public final Cell_property_listContext cell_property_list() throws RecognitionException {
		Cell_property_listContext _localctx = new Cell_property_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cell_property_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			cell_property();
			setState(223);
			match(COMMA);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CELL_ORDINAL) | (1L << DIMENSION) | (1L << FORMATTED_VALUE) | (1L << PROPERTIES) | (1L << VALUE) | (1L << ID) | (1L << QUOTED_ID))) != 0)) {
				{
				{
				setState(224);
				cell_property();
				}
				}
				setState(229);
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

	public static class Cell_propertyContext extends ParserRuleContext {
		public Mandatory_cell_propertyContext mandatory_cell_property() {
			return getRuleContext(Mandatory_cell_propertyContext.class,0);
		}
		public Provider_specific_cell_propertyContext provider_specific_cell_property() {
			return getRuleContext(Provider_specific_cell_propertyContext.class,0);
		}
		public Cell_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cell_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterCell_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitCell_property(this);
		}
	}

	public final Cell_propertyContext cell_property() throws RecognitionException {
		Cell_propertyContext _localctx = new Cell_propertyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cell_property);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CELL_ORDINAL:
			case FORMATTED_VALUE:
			case VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				mandatory_cell_property();
				}
				break;
			case DIMENSION:
			case PROPERTIES:
			case ID:
			case QUOTED_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				provider_specific_cell_property();
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

	public static class Mandatory_cell_propertyContext extends ParserRuleContext {
		public TerminalNode CELL_ORDINAL() { return getToken(mdxParser.CELL_ORDINAL, 0); }
		public TerminalNode VALUE() { return getToken(mdxParser.VALUE, 0); }
		public TerminalNode FORMATTED_VALUE() { return getToken(mdxParser.FORMATTED_VALUE, 0); }
		public Mandatory_cell_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mandatory_cell_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterMandatory_cell_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitMandatory_cell_property(this);
		}
	}

	public final Mandatory_cell_propertyContext mandatory_cell_property() throws RecognitionException {
		Mandatory_cell_propertyContext _localctx = new Mandatory_cell_propertyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mandatory_cell_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CELL_ORDINAL) | (1L << FORMATTED_VALUE) | (1L << VALUE))) != 0)) ) {
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

	public static class Provider_specific_cell_propertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Provider_specific_cell_propertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_provider_specific_cell_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterProvider_specific_cell_property(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitProvider_specific_cell_property(this);
		}
	}

	public final Provider_specific_cell_propertyContext provider_specific_cell_property() throws RecognitionException {
		Provider_specific_cell_propertyContext _localctx = new Provider_specific_cell_propertyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_provider_specific_cell_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<Value_expressionContext> value_expression() {
			return getRuleContexts(Value_expressionContext.class);
		}
		public Value_expressionContext value_expression(int i) {
			return getRuleContext(Value_expressionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(mdxParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(mdxParser.COLON, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			value_expression();
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(239);
				match(COLON);
				setState(240);
				value_expression();
				}
				}
				setState(245);
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

	public static class Value_expressionContext extends ParserRuleContext {
		public Term5Context term5() {
			return getRuleContext(Term5Context.class,0);
		}
		public List<Value_xor_expressionContext> value_xor_expression() {
			return getRuleContexts(Value_xor_expressionContext.class);
		}
		public Value_xor_expressionContext value_xor_expression(int i) {
			return getRuleContext(Value_xor_expressionContext.class,i);
		}
		public List<Value_or_expressionContext> value_or_expression() {
			return getRuleContexts(Value_or_expressionContext.class);
		}
		public Value_or_expressionContext value_or_expression(int i) {
			return getRuleContext(Value_or_expressionContext.class,i);
		}
		public Value_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterValue_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitValue_expression(this);
		}
	}

	public final Value_expressionContext value_expression() throws RecognitionException {
		Value_expressionContext _localctx = new Value_expressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_value_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			term5();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==XOR) {
				{
				setState(249);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case XOR:
					{
					setState(247);
					value_xor_expression();
					}
					break;
				case OR:
					{
					setState(248);
					value_or_expression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(253);
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

	public static class Value_xor_expressionContext extends ParserRuleContext {
		public TerminalNode XOR() { return getToken(mdxParser.XOR, 0); }
		public Term5Context term5() {
			return getRuleContext(Term5Context.class,0);
		}
		public Value_xor_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_xor_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterValue_xor_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitValue_xor_expression(this);
		}
	}

	public final Value_xor_expressionContext value_xor_expression() throws RecognitionException {
		Value_xor_expressionContext _localctx = new Value_xor_expressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_value_xor_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(XOR);
			setState(255);
			term5();
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

	public static class Value_or_expressionContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(mdxParser.OR, 0); }
		public Term5Context term5() {
			return getRuleContext(Term5Context.class,0);
		}
		public Value_or_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_or_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterValue_or_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitValue_or_expression(this);
		}
	}

	public final Value_or_expressionContext value_or_expression() throws RecognitionException {
		Value_or_expressionContext _localctx = new Value_or_expressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_value_or_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(OR);
			setState(258);
			term5();
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

	public static class Term5Context extends ParserRuleContext {
		public List<Term4Context> term4() {
			return getRuleContexts(Term4Context.class);
		}
		public Term4Context term4(int i) {
			return getRuleContext(Term4Context.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(mdxParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(mdxParser.AND, i);
		}
		public Term5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterTerm5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitTerm5(this);
		}
	}

	public final Term5Context term5() throws RecognitionException {
		Term5Context _localctx = new Term5Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_term5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			term4();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(261);
				match(AND);
				setState(262);
				term4();
				}
				}
				setState(267);
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

	public static class Term4Context extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(mdxParser.NOT, 0); }
		public Term4Context term4() {
			return getRuleContext(Term4Context.class,0);
		}
		public Term3Context term3() {
			return getRuleContext(Term3Context.class,0);
		}
		public Term4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterTerm4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitTerm4(this);
		}
	}

	public final Term4Context term4() throws RecognitionException {
		Term4Context _localctx = new Term4Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_term4);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(NOT);
				setState(269);
				term4();
				}
				break;
			case LBRACE:
			case LPAREN:
			case MINUS:
			case PLUS:
			case CASE:
			case DIMENSION:
			case PROPERTIES:
			case NUMBER:
			case ID:
			case QUOTED_ID:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				term3();
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

	public static class Term3Context extends ParserRuleContext {
		public List<Term2Context> term2() {
			return getRuleContexts(Term2Context.class);
		}
		public Term2Context term2(int i) {
			return getRuleContext(Term2Context.class,i);
		}
		public List<Comp_opContext> comp_op() {
			return getRuleContexts(Comp_opContext.class);
		}
		public Comp_opContext comp_op(int i) {
			return getRuleContext(Comp_opContext.class,i);
		}
		public Term3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterTerm3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitTerm3(this);
		}
	}

	public final Term3Context term3() throws RecognitionException {
		Term3Context _localctx = new Term3Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_term3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			term2();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << GE) | (1L << GT) | (1L << LE) | (1L << LT) | (1L << NE))) != 0)) {
				{
				{
				setState(274);
				comp_op();
				setState(275);
				term2();
				}
				}
				setState(281);
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

	public static class Term2Context extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> CONCAT() { return getTokens(mdxParser.CONCAT); }
		public TerminalNode CONCAT(int i) {
			return getToken(mdxParser.CONCAT, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(mdxParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(mdxParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(mdxParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(mdxParser.MINUS, i);
		}
		public Term2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterTerm2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitTerm2(this);
		}
	}

	public final Term2Context term2() throws RecognitionException {
		Term2Context _localctx = new Term2Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_term2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			term();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONCAT) | (1L << MINUS) | (1L << PLUS))) != 0)) {
				{
				{
				setState(283);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONCAT) | (1L << MINUS) | (1L << PLUS))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(284);
				term();
				}
				}
				setState(289);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> SOLIDUS() { return getTokens(mdxParser.SOLIDUS); }
		public TerminalNode SOLIDUS(int i) {
			return getToken(mdxParser.SOLIDUS, i);
		}
		public List<TerminalNode> ASTERISK() { return getTokens(mdxParser.ASTERISK); }
		public TerminalNode ASTERISK(int i) {
			return getToken(mdxParser.ASTERISK, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			factor();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASTERISK || _la==SOLIDUS) {
				{
				{
				setState(291);
				_la = _input.LA(1);
				if ( !(_la==ASTERISK || _la==SOLIDUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(292);
				factor();
				}
				}
				setState(297);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(mdxParser.MINUS, 0); }
		public Value_expression_primaryContext value_expression_primary() {
			return getRuleContext(Value_expression_primaryContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(mdxParser.PLUS, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_factor);
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(MINUS);
				setState(299);
				value_expression_primary();
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(PLUS);
				setState(301);
				value_expression_primary();
				}
				break;
			case LBRACE:
			case LPAREN:
			case CASE:
			case DIMENSION:
			case PROPERTIES:
			case NUMBER:
			case ID:
			case QUOTED_ID:
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				value_expression_primary();
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

	public static class FunctionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(mdxParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(mdxParser.RPAREN, 0); }
		public Exp_listContext exp_list() {
			return getRuleContext(Exp_listContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			identifier();
			setState(306);
			match(LPAREN);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LPAREN) | (1L << MINUS) | (1L << PLUS) | (1L << CASE) | (1L << DIMENSION) | (1L << NOT) | (1L << PROPERTIES) | (1L << NUMBER) | (1L << ID) | (1L << QUOTED_ID) | (1L << STRING))) != 0)) {
				{
				setState(307);
				exp_list();
				}
			}

			setState(310);
			match(RPAREN);
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

	public static class Value_expression_primaryContext extends ParserRuleContext {
		public Value_expression_primary0Context value_expression_primary0() {
			return getRuleContext(Value_expression_primary0Context.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(mdxParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(mdxParser.DOT, i);
		}
		public List<Unquoted_identifierContext> unquoted_identifier() {
			return getRuleContexts(Unquoted_identifierContext.class);
		}
		public Unquoted_identifierContext unquoted_identifier(int i) {
			return getRuleContext(Unquoted_identifierContext.class,i);
		}
		public List<Quoted_identifierContext> quoted_identifier() {
			return getRuleContexts(Quoted_identifierContext.class);
		}
		public Quoted_identifierContext quoted_identifier(int i) {
			return getRuleContext(Quoted_identifierContext.class,i);
		}
		public List<Amp_quoted_identifierContext> amp_quoted_identifier() {
			return getRuleContexts(Amp_quoted_identifierContext.class);
		}
		public Amp_quoted_identifierContext amp_quoted_identifier(int i) {
			return getRuleContext(Amp_quoted_identifierContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public Value_expression_primaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_expression_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterValue_expression_primary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitValue_expression_primary(this);
		}
	}

	public final Value_expression_primaryContext value_expression_primary() throws RecognitionException {
		Value_expression_primaryContext _localctx = new Value_expression_primaryContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_value_expression_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			value_expression_primary0();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(313);
				match(DOT);
				setState(318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(314);
					unquoted_identifier();
					}
					break;
				case 2:
					{
					setState(315);
					quoted_identifier();
					}
					break;
				case 3:
					{
					setState(316);
					amp_quoted_identifier();
					}
					break;
				case 4:
					{
					setState(317);
					function();
					}
					break;
				}
				}
				}
				setState(324);
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

	public static class Value_expression_primary0Context extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(mdxParser.LPAREN, 0); }
		public Exp_listContext exp_list() {
			return getRuleContext(Exp_listContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(mdxParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(mdxParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(mdxParser.RBRACE, 0); }
		public Case_expressionContext case_expression() {
			return getRuleContext(Case_expressionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(mdxParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(mdxParser.NUMBER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Value_expression_primary0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_expression_primary0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterValue_expression_primary0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitValue_expression_primary0(this);
		}
	}

	public final Value_expression_primary0Context value_expression_primary0() throws RecognitionException {
		Value_expression_primary0Context _localctx = new Value_expression_primary0Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_value_expression_primary0);
		int _la;
		try {
			setState(339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				function();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(326);
				match(LPAREN);
				setState(327);
				exp_list();
				setState(328);
				match(RPAREN);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(330);
				match(LBRACE);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LPAREN) | (1L << MINUS) | (1L << PLUS) | (1L << CASE) | (1L << DIMENSION) | (1L << NOT) | (1L << PROPERTIES) | (1L << NUMBER) | (1L << ID) | (1L << QUOTED_ID) | (1L << STRING))) != 0)) {
					{
					setState(331);
					exp_list();
					}
				}

				setState(334);
				match(RBRACE);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(335);
				case_expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(336);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(337);
				match(NUMBER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(338);
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

	public static class Exp_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(mdxParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(mdxParser.COMMA, i);
		}
		public Exp_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterExp_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitExp_list(this);
		}
	}

	public final Exp_listContext exp_list() throws RecognitionException {
		Exp_listContext _localctx = new Exp_listContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exp_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			expression();
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(342);
				match(COMMA);
				setState(343);
				expression();
				}
				}
				setState(348);
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

	public static class Case_expressionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(mdxParser.CASE, 0); }
		public TerminalNode END() { return getToken(mdxParser.END, 0); }
		public List<Value_expressionContext> value_expression() {
			return getRuleContexts(Value_expressionContext.class);
		}
		public Value_expressionContext value_expression(int i) {
			return getRuleContext(Value_expressionContext.class,i);
		}
		public When_listContext when_list() {
			return getRuleContext(When_listContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(mdxParser.ELSE, 0); }
		public Case_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterCase_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitCase_expression(this);
		}
	}

	public final Case_expressionContext case_expression() throws RecognitionException {
		Case_expressionContext _localctx = new Case_expressionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_case_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(CASE);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACE) | (1L << LPAREN) | (1L << MINUS) | (1L << PLUS) | (1L << CASE) | (1L << DIMENSION) | (1L << NOT) | (1L << PROPERTIES) | (1L << NUMBER) | (1L << ID) | (1L << QUOTED_ID) | (1L << STRING))) != 0)) {
				{
				setState(350);
				value_expression();
				}
			}

			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(353);
				when_list();
				}
			}

			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(356);
				match(ELSE);
				setState(357);
				value_expression();
				}
			}

			setState(360);
			match(END);
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

	public static class When_listContext extends ParserRuleContext {
		public List<When_clauseContext> when_clause() {
			return getRuleContexts(When_clauseContext.class);
		}
		public When_clauseContext when_clause(int i) {
			return getRuleContext(When_clauseContext.class,i);
		}
		public When_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterWhen_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitWhen_list(this);
		}
	}

	public final When_listContext when_list() throws RecognitionException {
		When_listContext _localctx = new When_listContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_when_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			when_clause();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(363);
				when_clause();
				}
				}
				setState(368);
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

	public static class When_clauseContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(mdxParser.WHEN, 0); }
		public List<Value_expressionContext> value_expression() {
			return getRuleContexts(Value_expressionContext.class);
		}
		public Value_expressionContext value_expression(int i) {
			return getRuleContext(Value_expressionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(mdxParser.THEN, 0); }
		public When_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_when_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterWhen_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitWhen_clause(this);
		}
	}

	public final When_clauseContext when_clause() throws RecognitionException {
		When_clauseContext _localctx = new When_clauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_when_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(WHEN);
			setState(370);
			value_expression();
			setState(371);
			match(THEN);
			setState(372);
			value_expression();
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

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(mdxParser.EQ, 0); }
		public TerminalNode NE() { return getToken(mdxParser.NE, 0); }
		public TerminalNode LT() { return getToken(mdxParser.LT, 0); }
		public TerminalNode GT() { return getToken(mdxParser.GT, 0); }
		public TerminalNode LE() { return getToken(mdxParser.LE, 0); }
		public TerminalNode GE() { return getToken(mdxParser.GE, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitComp_op(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << GE) | (1L << GT) | (1L << LE) | (1L << LT) | (1L << NE))) != 0)) ) {
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
		public Unquoted_identifierContext unquoted_identifier() {
			return getRuleContext(Unquoted_identifierContext.class,0);
		}
		public Quoted_identifierContext quoted_identifier() {
			return getRuleContext(Quoted_identifierContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIMENSION:
			case PROPERTIES:
			case ID:
				{
				setState(376);
				unquoted_identifier();
				}
				break;
			case QUOTED_ID:
				{
				setState(377);
				quoted_identifier();
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

	public static class Unquoted_identifierContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode ID() { return getToken(mdxParser.ID, 0); }
		public Unquoted_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unquoted_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterUnquoted_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitUnquoted_identifier(this);
		}
	}

	public final Unquoted_identifierContext unquoted_identifier() throws RecognitionException {
		Unquoted_identifierContext _localctx = new Unquoted_identifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_unquoted_identifier);
		try {
			setState(382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIMENSION:
			case PROPERTIES:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				keyword();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				match(ID);
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

	public static class Amp_quoted_identifierContext extends ParserRuleContext {
		public TerminalNode AMP_QUOTED_ID() { return getToken(mdxParser.AMP_QUOTED_ID, 0); }
		public Amp_quoted_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amp_quoted_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterAmp_quoted_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitAmp_quoted_identifier(this);
		}
	}

	public final Amp_quoted_identifierContext amp_quoted_identifier() throws RecognitionException {
		Amp_quoted_identifierContext _localctx = new Amp_quoted_identifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_amp_quoted_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(AMP_QUOTED_ID);
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

	public static class Quoted_identifierContext extends ParserRuleContext {
		public TerminalNode QUOTED_ID() { return getToken(mdxParser.QUOTED_ID, 0); }
		public Quoted_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quoted_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterQuoted_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitQuoted_identifier(this);
		}
	}

	public final Quoted_identifierContext quoted_identifier() throws RecognitionException {
		Quoted_identifierContext _localctx = new Quoted_identifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_quoted_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(QUOTED_ID);
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode DIMENSION() { return getToken(mdxParser.DIMENSION, 0); }
		public TerminalNode PROPERTIES() { return getToken(mdxParser.PROPERTIES, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mdxListener ) ((mdxListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !(_la==DIMENSION || _la==PROPERTIES) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0189\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\3\3\3\5\3h\n"+
		"\3\3\3\3\3\5\3l\n\3\3\3\3\3\3\3\3\3\5\3r\n\3\3\3\5\3u\n\3\3\4\6\4x\n\4"+
		"\r\4\16\4y\3\5\3\5\5\5~\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0088"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0092\n\7\3\7\3\7\5\7\u0096\n"+
		"\7\3\b\3\b\3\b\7\b\u009b\n\b\f\b\16\b\u009e\13\b\3\t\3\t\3\t\7\t\u00a3"+
		"\n\t\f\t\16\t\u00a6\13\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\7\r\u00b3\n\r\f\r\16\r\u00b6\13\r\3\16\3\16\5\16\u00ba\n\16\3\16\3"+
		"\16\5\16\u00be\n\16\3\16\3\16\3\16\3\17\3\17\3\20\5\20\u00c6\n\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\7\21\u00ce\n\21\f\21\16\21\u00d1\13\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\5\26\u00dc\n\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\7\27\u00e4\n\27\f\27\16\27\u00e7\13\27\3\30\3\30\5\30"+
		"\u00eb\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\7\33\u00f4\n\33\f\33\16"+
		"\33\u00f7\13\33\3\34\3\34\3\34\7\34\u00fc\n\34\f\34\16\34\u00ff\13\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u010a\n\37\f\37\16"+
		"\37\u010d\13\37\3 \3 \3 \5 \u0112\n \3!\3!\3!\3!\7!\u0118\n!\f!\16!\u011b"+
		"\13!\3\"\3\"\3\"\7\"\u0120\n\"\f\"\16\"\u0123\13\"\3#\3#\3#\7#\u0128\n"+
		"#\f#\16#\u012b\13#\3$\3$\3$\3$\3$\5$\u0132\n$\3%\3%\3%\5%\u0137\n%\3%"+
		"\3%\3&\3&\3&\3&\3&\3&\5&\u0141\n&\7&\u0143\n&\f&\16&\u0146\13&\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\5\'\u014f\n\'\3\'\3\'\3\'\3\'\3\'\5\'\u0156\n\'\3"+
		"(\3(\3(\7(\u015b\n(\f(\16(\u015e\13(\3)\3)\5)\u0162\n)\3)\5)\u0165\n)"+
		"\3)\3)\5)\u0169\n)\3)\3)\3*\3*\7*\u016f\n*\f*\16*\u0172\13*\3+\3+\3+\3"+
		"+\3+\3,\3,\3-\3-\5-\u017d\n-\3.\3.\5.\u0181\n.\3/\3/\3\60\3\60\3\61\3"+
		"\61\3\61\2\2\62\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`\2\7\5\2\33\33!!..\5\2\b\b\21\21\23\23\4\2"+
		"\4\4\26\26\6\2\n\f\16\16\20\20\22\22\4\2\35\35))\2\u0188\2b\3\2\2\2\4"+
		"g\3\2\2\2\6w\3\2\2\2\b}\3\2\2\2\n\177\3\2\2\2\f\u0089\3\2\2\2\16\u0097"+
		"\3\2\2\2\20\u009f\3\2\2\2\22\u00a7\3\2\2\2\24\u00a9\3\2\2\2\26\u00ad\3"+
		"\2\2\2\30\u00af\3\2\2\2\32\u00b9\3\2\2\2\34\u00c2\3\2\2\2\36\u00c5\3\2"+
		"\2\2 \u00ca\3\2\2\2\"\u00d2\3\2\2\2$\u00d4\3\2\2\2&\u00d6\3\2\2\2(\u00d8"+
		"\3\2\2\2*\u00db\3\2\2\2,\u00e0\3\2\2\2.\u00ea\3\2\2\2\60\u00ec\3\2\2\2"+
		"\62\u00ee\3\2\2\2\64\u00f0\3\2\2\2\66\u00f8\3\2\2\28\u0100\3\2\2\2:\u0103"+
		"\3\2\2\2<\u0106\3\2\2\2>\u0111\3\2\2\2@\u0113\3\2\2\2B\u011c\3\2\2\2D"+
		"\u0124\3\2\2\2F\u0131\3\2\2\2H\u0133\3\2\2\2J\u013a\3\2\2\2L\u0155\3\2"+
		"\2\2N\u0157\3\2\2\2P\u015f\3\2\2\2R\u016c\3\2\2\2T\u0173\3\2\2\2V\u0178"+
		"\3\2\2\2X\u017c\3\2\2\2Z\u0180\3\2\2\2\\\u0182\3\2\2\2^\u0184\3\2\2\2"+
		"`\u0186\3\2\2\2bc\5\4\3\2cd\7\2\2\3d\3\3\2\2\2ef\7\62\2\2fh\5\6\4\2ge"+
		"\3\2\2\2gh\3\2\2\2hi\3\2\2\2ik\7*\2\2jl\5\16\b\2kj\3\2\2\2kl\3\2\2\2l"+
		"m\3\2\2\2mn\7\"\2\2nq\5$\23\2op\7\60\2\2pr\5(\25\2qo\3\2\2\2qr\3\2\2\2"+
		"rt\3\2\2\2su\5*\26\2ts\3\2\2\2tu\3\2\2\2u\5\3\2\2\2vx\5\b\5\2wv\3\2\2"+
		"\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z\7\3\2\2\2{~\5\f\7\2|~\5\n\6\2}{\3\2"+
		"\2\2}|\3\2\2\2~\t\3\2\2\2\177\u0080\7,\2\2\u0080\u0081\5\26\f\2\u0081"+
		"\u0087\7\30\2\2\u0082\u0083\7\3\2\2\u0083\u0084\5\64\33\2\u0084\u0085"+
		"\7\3\2\2\u0085\u0088\3\2\2\2\u0086\u0088\5\64\33\2\u0087\u0082\3\2\2\2"+
		"\u0087\u0086\3\2\2\2\u0088\13\3\2\2\2\u0089\u008a\7$\2\2\u008a\u008b\5"+
		"\22\n\2\u008b\u0091\7\30\2\2\u008c\u008d\7\3\2\2\u008d\u008e\5\66\34\2"+
		"\u008e\u008f\7\3\2\2\u008f\u0092\3\2\2\2\u0090\u0092\5\66\34\2\u0091\u008c"+
		"\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\7\7\2\2\u0094"+
		"\u0096\5\20\t\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\r\3\2\2"+
		"\2\u0097\u009c\5\32\16\2\u0098\u0099\7\7\2\2\u0099\u009b\5\32\16\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\17\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a4\5\24\13\2\u00a0"+
		"\u00a1\7\7\2\2\u00a1\u00a3\5\24\13\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\3"+
		"\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\21\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a7\u00a8\5\30\r\2\u00a8\23\3\2\2\2\u00a9\u00aa\5X-\2"+
		"\u00aa\u00ab\7\n\2\2\u00ab\u00ac\5\66\34\2\u00ac\25\3\2\2\2\u00ad\u00ae"+
		"\5\30\r\2\u00ae\27\3\2\2\2\u00af\u00b4\5X-\2\u00b0\u00b1\7\t\2\2\u00b1"+
		"\u00b3\5X-\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2"+
		"\2\u00b4\u00b5\3\2\2\2\u00b5\31\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8"+
		"\7%\2\2\u00b8\u00ba\7\37\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bd\5\64\33\2\u00bc\u00be\5\36\20\2\u00bd\u00bc"+
		"\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7\'\2\2\u00c0"+
		"\u00c1\5\34\17\2\u00c1\33\3\2\2\2\u00c2\u00c3\5X-\2\u00c3\35\3\2\2\2\u00c4"+
		"\u00c6\7\35\2\2\u00c5\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3"+
		"\2\2\2\u00c7\u00c8\7)\2\2\u00c8\u00c9\5 \21\2\u00c9\37\3\2\2\2\u00ca\u00cf"+
		"\5\"\22\2\u00cb\u00cc\7\7\2\2\u00cc\u00ce\5\"\22\2\u00cd\u00cb\3\2\2\2"+
		"\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0!\3"+
		"\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\5\30\r\2\u00d3#\3\2\2\2\u00d4\u00d5"+
		"\5&\24\2\u00d5%\3\2\2\2\u00d6\u00d7\5\30\r\2\u00d7\'\3\2\2\2\u00d8\u00d9"+
		"\5\64\33\2\u00d9)\3\2\2\2\u00da\u00dc\7\32\2\2\u00db\u00da\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\7)\2\2\u00de\u00df\5,\27"+
		"\2\u00df+\3\2\2\2\u00e0\u00e1\5.\30\2\u00e1\u00e5\7\7\2\2\u00e2\u00e4"+
		"\5.\30\2\u00e3\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6-\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\5\60\31"+
		"\2\u00e9\u00eb\5\62\32\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb"+
		"/\3\2\2\2\u00ec\u00ed\t\2\2\2\u00ed\61\3\2\2\2\u00ee\u00ef\5X-\2\u00ef"+
		"\63\3\2\2\2\u00f0\u00f5\5\66\34\2\u00f1\u00f2\7\5\2\2\u00f2\u00f4\5\66"+
		"\34\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\65\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fd\5<\37"+
		"\2\u00f9\u00fc\58\35\2\u00fa\u00fc\5:\36\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa"+
		"\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\67\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\61\2\2\u0101\u0102\5<\37"+
		"\2\u01029\3\2\2\2\u0103\u0104\7(\2\2\u0104\u0105\5<\37\2\u0105;\3\2\2"+
		"\2\u0106\u010b\5> \2\u0107\u0108\7\27\2\2\u0108\u010a\5> \2\u0109\u0107"+
		"\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"=\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\7&\2\2\u010f\u0112\5> \2\u0110"+
		"\u0112\5@!\2\u0111\u010e\3\2\2\2\u0111\u0110\3\2\2\2\u0112?\3\2\2\2\u0113"+
		"\u0119\5B\"\2\u0114\u0115\5V,\2\u0115\u0116\5B\"\2\u0116\u0118\3\2\2\2"+
		"\u0117\u0114\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011aA\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u0121\5D#\2\u011d\u011e"+
		"\t\3\2\2\u011e\u0120\5D#\2\u011f\u011d\3\2\2\2\u0120\u0123\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122C\3\2\2\2\u0123\u0121\3\2\2\2"+
		"\u0124\u0129\5F$\2\u0125\u0126\t\4\2\2\u0126\u0128\5F$\2\u0127\u0125\3"+
		"\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"E\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7\21\2\2\u012d\u0132\5J&\2\u012e"+
		"\u012f\7\23\2\2\u012f\u0132\5J&\2\u0130\u0132\5J&\2\u0131\u012c\3\2\2"+
		"\2\u0131\u012e\3\2\2\2\u0131\u0130\3\2\2\2\u0132G\3\2\2\2\u0133\u0134"+
		"\5X-\2\u0134\u0136\7\17\2\2\u0135\u0137\5N(\2\u0136\u0135\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7\25\2\2\u0139I\3\2\2\2"+
		"\u013a\u0144\5L\'\2\u013b\u0140\7\t\2\2\u013c\u0141\5Z.\2\u013d\u0141"+
		"\5^\60\2\u013e\u0141\5\\/\2\u013f\u0141\5H%\2\u0140\u013c\3\2\2\2\u0140"+
		"\u013d\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\u0143\3\2"+
		"\2\2\u0142\u013b\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144"+
		"\u0145\3\2\2\2\u0145K\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0156\5H%\2\u0148"+
		"\u0149\7\17\2\2\u0149\u014a\5N(\2\u014a\u014b\7\25\2\2\u014b\u0156\3\2"+
		"\2\2\u014c\u014e\7\r\2\2\u014d\u014f\5N(\2\u014e\u014d\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0156\7\24\2\2\u0151\u0156\5P)\2\u0152"+
		"\u0156\78\2\2\u0153\u0156\7\63\2\2\u0154\u0156\5X-\2\u0155\u0147\3\2\2"+
		"\2\u0155\u0148\3\2\2\2\u0155\u014c\3\2\2\2\u0155\u0151\3\2\2\2\u0155\u0152"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0154\3\2\2\2\u0156M\3\2\2\2\u0157"+
		"\u015c\5\64\33\2\u0158\u0159\7\7\2\2\u0159\u015b\5\64\33\2\u015a\u0158"+
		"\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"O\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0161\7\31\2\2\u0160\u0162\5\66\34"+
		"\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0165"+
		"\5R*\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0168\3\2\2\2\u0166"+
		"\u0167\7\36\2\2\u0167\u0169\5\66\34\2\u0168\u0166\3\2\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\7 \2\2\u016bQ\3\2\2\2\u016c\u0170"+
		"\5T+\2\u016d\u016f\5T+\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171S\3\2\2\2\u0172\u0170\3\2\2\2"+
		"\u0173\u0174\7/\2\2\u0174\u0175\5\66\34\2\u0175\u0176\7-\2\2\u0176\u0177"+
		"\5\66\34\2\u0177U\3\2\2\2\u0178\u0179\t\5\2\2\u0179W\3\2\2\2\u017a\u017d"+
		"\5Z.\2\u017b\u017d\5^\60\2\u017c\u017a\3\2\2\2\u017c\u017b\3\2\2\2\u017d"+
		"Y\3\2\2\2\u017e\u0181\5`\61\2\u017f\u0181\7\65\2\2\u0180\u017e\3\2\2\2"+
		"\u0180\u017f\3\2\2\2\u0181[\3\2\2\2\u0182\u0183\7\66\2\2\u0183]\3\2\2"+
		"\2\u0184\u0185\7\67\2\2\u0185_\3\2\2\2\u0186\u0187\t\6\2\2\u0187a\3\2"+
		"\2\2*gkqty}\u0087\u0091\u0095\u009c\u00a4\u00b4\u00b9\u00bd\u00c5\u00cf"+
		"\u00db\u00e5\u00ea\u00f5\u00fb\u00fd\u010b\u0111\u0119\u0121\u0129\u0131"+
		"\u0136\u0140\u0144\u014e\u0155\u015c\u0161\u0164\u0168\u0170\u017c\u0180";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}