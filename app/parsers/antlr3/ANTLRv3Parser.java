// Generated from antlr3/ANTLRv3.g4 by ANTLR 4.7.1
package parsers.antlr3;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ANTLRv3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, CHAR_LITERAL=30, STRING_LITERAL=31, 
		DOUBLE_QUOTE_STRING_LITERAL=32, DOUBLE_ANGLE_STRING_LITERAL=33, INT=34, 
		ARG_ACTION=35, ACTION=36, OPTIONS=37, TOKENS=38, DOC_COMMENT=39, PARSER=40, 
		LEXER=41, RULE=42, BLOCK=43, OPTIONAL=44, CLOSURE=45, POSITIVE_CLOSURE=46, 
		SYNPRED=47, CHAR_RANGE=48, EPSILON=49, ALT=50, EOR=51, EOB=52, EOA=53, 
		ID=54, ARG=55, ARGLIST=56, RET=57, LEXER_GRAMMAR=58, PARSER_GRAMMAR=59, 
		TREE_GRAMMAR=60, COMBINED_GRAMMAR=61, INITACTION=62, LABEL=63, TEMPLATE=64, 
		SCOPE=65, SEMPRED=66, GATED_SEMPRED=67, SYN_SEMPRED=68, BACKTRACK_SEMPRED=69, 
		FRAGMENT=70, TREE_BEGIN=71, ROOT=72, BANG=73, RANGE=74, REWRITE=75, SL_COMMENT=76, 
		ML_COMMENT=77, WS=78, TOKEN_REF=79, RULE_REF=80, SEMPREDrewrite_alternative=81;
	public static final int
		RULE_grammarDef = 0, RULE_tokensSpec = 1, RULE_tokenSpec = 2, RULE_attrScope = 3, 
		RULE_action = 4, RULE_actionScopeName = 5, RULE_optionsSpec = 6, RULE_option = 7, 
		RULE_optionValue = 8, RULE_rule_ = 9, RULE_ruleAction = 10, RULE_throwsSpec = 11, 
		RULE_ruleScopeSpec = 12, RULE_block = 13, RULE_altList = 14, RULE_alternative = 15, 
		RULE_exceptionGroup = 16, RULE_exceptionHandler = 17, RULE_finallyClause = 18, 
		RULE_element = 19, RULE_elementNoOptionSpec = 20, RULE_atom = 21, RULE_notSet = 22, 
		RULE_treeSpec = 23, RULE_ebnf = 24, RULE_range = 25, RULE_terminal_ = 26, 
		RULE_notTerminal = 27, RULE_ebnfSuffix = 28, RULE_rewrite = 29, RULE_rewrite_alternative = 30, 
		RULE_rewrite_tree_block = 31, RULE_rewrite_tree_alternative = 32, RULE_rewrite_tree_element = 33, 
		RULE_rewrite_tree_atom = 34, RULE_rewrite_tree_ebnf = 35, RULE_rewrite_tree = 36, 
		RULE_rewrite_template = 37, RULE_rewrite_template_ref = 38, RULE_rewrite_indirect_template_head = 39, 
		RULE_rewrite_template_args = 40, RULE_rewrite_template_arg = 41, RULE_id = 42;
	public static final String[] ruleNames = {
		"grammarDef", "tokensSpec", "tokenSpec", "attrScope", "action", "actionScopeName", 
		"optionsSpec", "option", "optionValue", "rule_", "ruleAction", "throwsSpec", 
		"ruleScopeSpec", "block", "altList", "alternative", "exceptionGroup", 
		"exceptionHandler", "finallyClause", "element", "elementNoOptionSpec", 
		"atom", "notSet", "treeSpec", "ebnf", "range", "terminal_", "notTerminal", 
		"ebnfSuffix", "rewrite", "rewrite_alternative", "rewrite_tree_block", 
		"rewrite_tree_alternative", "rewrite_tree_element", "rewrite_tree_atom", 
		"rewrite_tree_ebnf", "rewrite_tree", "rewrite_template", "rewrite_template_ref", 
		"rewrite_indirect_template_head", "rewrite_template_args", "rewrite_template_arg", 
		"id"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'lexer'", "'parser'", "'tree'", "'grammar'", "';'", "'}'", "'='", 
		"'@'", "'::'", "'*'", "'protected'", "'public'", "'private'", "'returns'", 
		"':'", "'throws'", "','", "'('", "'|'", "')'", "'catch'", "'finally'", 
		"'+='", "'=>'", "'~'", "'?'", "'+'", "'.'", "'$'", null, null, null, null, 
		null, null, null, null, null, "'DOC_COMMENT'", "'PARSER'", "'LEXER'", 
		"'RULE'", "'BLOCK'", "'OPTIONAL'", "'CLOSURE'", "'POSITIVE_CLOSURE'", 
		"'SYNPRED'", "'CHAR_RANGE'", "'EPSILON'", "'ALT'", "'EOR'", "'EOB'", "'EOA'", 
		"'ID'", "'ARG'", "'ARGLIST'", "'RET'", "'LEXER_GRAMMAR'", "'PARSER_GRAMMAR'", 
		"'TREE_GRAMMAR'", "'COMBINED_GRAMMAR'", "'INITACTION'", "'LABEL'", "'TEMPLATE'", 
		"'scope'", "'SEMPRED'", "'GATED_SEMPRED'", "'SYN_SEMPRED'", "'BACKTRACK_SEMPRED'", 
		"'fragment'", "'^('", "'^'", "'!'", "'..'", "'->'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "CHAR_LITERAL", "STRING_LITERAL", 
		"DOUBLE_QUOTE_STRING_LITERAL", "DOUBLE_ANGLE_STRING_LITERAL", "INT", "ARG_ACTION", 
		"ACTION", "OPTIONS", "TOKENS", "DOC_COMMENT", "PARSER", "LEXER", "RULE", 
		"BLOCK", "OPTIONAL", "CLOSURE", "POSITIVE_CLOSURE", "SYNPRED", "CHAR_RANGE", 
		"EPSILON", "ALT", "EOR", "EOB", "EOA", "ID", "ARG", "ARGLIST", "RET", 
		"LEXER_GRAMMAR", "PARSER_GRAMMAR", "TREE_GRAMMAR", "COMBINED_GRAMMAR", 
		"INITACTION", "LABEL", "TEMPLATE", "SCOPE", "SEMPRED", "GATED_SEMPRED", 
		"SYN_SEMPRED", "BACKTRACK_SEMPRED", "FRAGMENT", "TREE_BEGIN", "ROOT", 
		"BANG", "RANGE", "REWRITE", "SL_COMMENT", "ML_COMMENT", "WS", "TOKEN_REF", 
		"RULE_REF", "SEMPREDrewrite_alternative"
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
	public String getGrammarFileName() { return "ANTLRv3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ANTLRv3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GrammarDefContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode DOC_COMMENT() { return getToken(ANTLRv3Parser.DOC_COMMENT, 0); }
		public OptionsSpecContext optionsSpec() {
			return getRuleContext(OptionsSpecContext.class,0);
		}
		public TokensSpecContext tokensSpec() {
			return getRuleContext(TokensSpecContext.class,0);
		}
		public List<AttrScopeContext> attrScope() {
			return getRuleContexts(AttrScopeContext.class);
		}
		public AttrScopeContext attrScope(int i) {
			return getRuleContext(AttrScopeContext.class,i);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public List<Rule_Context> rule_() {
			return getRuleContexts(Rule_Context.class);
		}
		public Rule_Context rule_(int i) {
			return getRuleContext(Rule_Context.class,i);
		}
		public GrammarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterGrammarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitGrammarDef(this);
		}
	}

	public final GrammarDefContext grammarDef() throws RecognitionException {
		GrammarDefContext _localctx = new GrammarDefContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grammarDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(86);
				match(DOC_COMMENT);
				}
			}

			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) {
				{
				setState(89);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(92);
			match(T__3);
			setState(93);
			id();
			setState(94);
			match(T__4);
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONS) {
				{
				setState(95);
				optionsSpec();
				}
			}

			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOKENS) {
				{
				setState(98);
				tokensSpec();
				}
			}

			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOPE) {
				{
				{
				setState(101);
				attrScope();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(107);
				action();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(113);
				rule_();
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << DOC_COMMENT))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (FRAGMENT - 70)) | (1L << (TOKEN_REF - 70)) | (1L << (RULE_REF - 70)))) != 0) );
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

	public static class TokensSpecContext extends ParserRuleContext {
		public TerminalNode TOKENS() { return getToken(ANTLRv3Parser.TOKENS, 0); }
		public List<TokenSpecContext> tokenSpec() {
			return getRuleContexts(TokenSpecContext.class);
		}
		public TokenSpecContext tokenSpec(int i) {
			return getRuleContext(TokenSpecContext.class,i);
		}
		public TokensSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokensSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterTokensSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitTokensSpec(this);
		}
	}

	public final TokensSpecContext tokensSpec() throws RecognitionException {
		TokensSpecContext _localctx = new TokensSpecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tokensSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(TOKENS);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				tokenSpec();
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOKEN_REF );
			setState(124);
			match(T__5);
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

	public static class TokenSpecContext extends ParserRuleContext {
		public TerminalNode TOKEN_REF() { return getToken(ANTLRv3Parser.TOKEN_REF, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv3Parser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(ANTLRv3Parser.CHAR_LITERAL, 0); }
		public TokenSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterTokenSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitTokenSpec(this);
		}
	}

	public final TokenSpecContext tokenSpec() throws RecognitionException {
		TokenSpecContext _localctx = new TokenSpecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tokenSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(TOKEN_REF);
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				{
				setState(127);
				match(T__6);
				setState(128);
				_la = _input.LA(1);
				if ( !(_la==CHAR_LITERAL || _la==STRING_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__4:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(132);
			match(T__4);
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

	public static class AttrScopeContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ANTLRv3Parser.ACTION, 0); }
		public AttrScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterAttrScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitAttrScope(this);
		}
	}

	public final AttrScopeContext attrScope() throws RecognitionException {
		AttrScopeContext _localctx = new AttrScopeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attrScope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(SCOPE);
			setState(135);
			id();
			setState(136);
			match(ACTION);
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

	public static class ActionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ANTLRv3Parser.ACTION, 0); }
		public ActionScopeNameContext actionScopeName() {
			return getRuleContext(ActionScopeNameContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__7);
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(139);
				actionScopeName();
				setState(140);
				match(T__8);
				}
				break;
			}
			setState(144);
			id();
			setState(145);
			match(ACTION);
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

	public static class ActionScopeNameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ActionScopeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionScopeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterActionScopeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitActionScopeName(this);
		}
	}

	public final ActionScopeNameContext actionScopeName() throws RecognitionException {
		ActionScopeNameContext _localctx = new ActionScopeNameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_actionScopeName);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				id();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(T__1);
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

	public static class OptionsSpecContext extends ParserRuleContext {
		public TerminalNode OPTIONS() { return getToken(ANTLRv3Parser.OPTIONS, 0); }
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public OptionsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionsSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterOptionsSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitOptionsSpec(this);
		}
	}

	public final OptionsSpecContext optionsSpec() throws RecognitionException {
		OptionsSpecContext _localctx = new OptionsSpecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_optionsSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(OPTIONS);
			setState(156); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(153);
				option();
				setState(154);
				match(T__4);
				}
				}
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TOKEN_REF || _la==RULE_REF );
			setState(160);
			match(T__5);
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

	public static class OptionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public OptionValueContext optionValue() {
			return getRuleContext(OptionValueContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitOption(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			id();
			setState(163);
			match(T__6);
			setState(164);
			optionValue();
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

	public static class OptionValueContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv3Parser.STRING_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(ANTLRv3Parser.CHAR_LITERAL, 0); }
		public TerminalNode INT() { return getToken(ANTLRv3Parser.INT, 0); }
		public OptionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterOptionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitOptionValue(this);
		}
	}

	public final OptionValueContext optionValue() throws RecognitionException {
		OptionValueContext _localctx = new OptionValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_optionValue);
		try {
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				id();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(STRING_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				match(CHAR_LITERAL);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(INT);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				match(T__9);
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

	public static class Rule_Context extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode DOC_COMMENT() { return getToken(ANTLRv3Parser.DOC_COMMENT, 0); }
		public List<TerminalNode> ARG_ACTION() { return getTokens(ANTLRv3Parser.ARG_ACTION); }
		public TerminalNode ARG_ACTION(int i) {
			return getToken(ANTLRv3Parser.ARG_ACTION, i);
		}
		public ThrowsSpecContext throwsSpec() {
			return getRuleContext(ThrowsSpecContext.class,0);
		}
		public OptionsSpecContext optionsSpec() {
			return getRuleContext(OptionsSpecContext.class,0);
		}
		public RuleScopeSpecContext ruleScopeSpec() {
			return getRuleContext(RuleScopeSpecContext.class,0);
		}
		public List<RuleActionContext> ruleAction() {
			return getRuleContexts(RuleActionContext.class);
		}
		public RuleActionContext ruleAction(int i) {
			return getRuleContext(RuleActionContext.class,i);
		}
		public AltListContext altList() {
			return getRuleContext(AltListContext.class,0);
		}
		public ExceptionGroupContext exceptionGroup() {
			return getRuleContext(ExceptionGroupContext.class,0);
		}
		public Rule_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterRule_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitRule_(this);
		}
	}

	public final Rule_Context rule_() throws RecognitionException {
		Rule_Context _localctx = new Rule_Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_rule_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOC_COMMENT) {
				{
				setState(173);
				match(DOC_COMMENT);
				}
			}

			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (T__10 - 11)) | (1L << (T__11 - 11)) | (1L << (T__12 - 11)) | (1L << (FRAGMENT - 11)))) != 0)) {
				{
				setState(176);
				_la = _input.LA(1);
				if ( !(((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (T__10 - 11)) | (1L << (T__11 - 11)) | (1L << (T__12 - 11)) | (1L << (FRAGMENT - 11)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(179);
			id();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BANG) {
				{
				setState(180);
				match(BANG);
				}
			}

			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARG_ACTION) {
				{
				setState(183);
				match(ARG_ACTION);
				}
			}

			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(186);
				match(T__13);
				setState(187);
				match(ARG_ACTION);
				}
			}

			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(190);
				throwsSpec();
				}
			}

			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONS) {
				{
				setState(193);
				optionsSpec();
				}
			}

			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOPE) {
				{
				setState(196);
				ruleScopeSpec();
				}
			}

			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(199);
				ruleAction();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(T__14);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (T__17 - 18)) | (1L << (T__24 - 18)) | (1L << (T__27 - 18)) | (1L << (CHAR_LITERAL - 18)) | (1L << (STRING_LITERAL - 18)) | (1L << (ACTION - 18)) | (1L << (SEMPRED - 18)) | (1L << (TREE_BEGIN - 18)) | (1L << (TOKEN_REF - 18)) | (1L << (RULE_REF - 18)))) != 0)) {
				{
				setState(206);
				altList();
				}
			}

			setState(209);
			match(T__4);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20 || _la==T__21) {
				{
				setState(210);
				exceptionGroup();
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

	public static class RuleActionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ANTLRv3Parser.ACTION, 0); }
		public RuleActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterRuleAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitRuleAction(this);
		}
	}

	public final RuleActionContext ruleAction() throws RecognitionException {
		RuleActionContext _localctx = new RuleActionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ruleAction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(T__7);
			setState(214);
			id();
			setState(215);
			match(ACTION);
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

	public static class ThrowsSpecContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public ThrowsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwsSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterThrowsSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitThrowsSpec(this);
		}
	}

	public final ThrowsSpecContext throwsSpec() throws RecognitionException {
		ThrowsSpecContext _localctx = new ThrowsSpecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_throwsSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__15);
			setState(218);
			id();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(219);
				match(T__16);
				setState(220);
				id();
				}
				}
				setState(225);
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

	public static class RuleScopeSpecContext extends ParserRuleContext {
		public TerminalNode ACTION() { return getToken(ANTLRv3Parser.ACTION, 0); }
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public RuleScopeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleScopeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterRuleScopeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitRuleScopeSpec(this);
		}
	}

	public final RuleScopeSpecContext ruleScopeSpec() throws RecognitionException {
		RuleScopeSpecContext _localctx = new RuleScopeSpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ruleScopeSpec);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(SCOPE);
				setState(227);
				match(ACTION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				match(SCOPE);
				setState(229);
				id();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(230);
					match(T__16);
					setState(231);
					id();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(237);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(SCOPE);
				setState(240);
				match(ACTION);
				setState(241);
				match(SCOPE);
				setState(242);
				id();
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__16) {
					{
					{
					setState(243);
					match(T__16);
					setState(244);
					id();
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250);
				match(T__4);
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

	public static class BlockContext extends ParserRuleContext {
		public List<AlternativeContext> alternative() {
			return getRuleContexts(AlternativeContext.class);
		}
		public AlternativeContext alternative(int i) {
			return getRuleContext(AlternativeContext.class,i);
		}
		public List<RewriteContext> rewrite() {
			return getRuleContexts(RewriteContext.class);
		}
		public RewriteContext rewrite(int i) {
			return getRuleContext(RewriteContext.class,i);
		}
		public OptionsSpecContext optionsSpec() {
			return getRuleContext(OptionsSpecContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__17);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14 || _la==OPTIONS) {
				{
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(255);
					optionsSpec();
					}
				}

				setState(258);
				match(T__14);
				}
			}

			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (T__17 - 18)) | (1L << (T__24 - 18)) | (1L << (T__27 - 18)) | (1L << (CHAR_LITERAL - 18)) | (1L << (STRING_LITERAL - 18)) | (1L << (ACTION - 18)) | (1L << (SEMPRED - 18)) | (1L << (TREE_BEGIN - 18)) | (1L << (TOKEN_REF - 18)) | (1L << (RULE_REF - 18)))) != 0)) {
				{
				setState(261);
				alternative();
				}
			}

			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REWRITE) {
				{
				setState(264);
				rewrite();
				}
			}

			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(267);
				match(T__18);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (T__17 - 18)) | (1L << (T__24 - 18)) | (1L << (T__27 - 18)) | (1L << (CHAR_LITERAL - 18)) | (1L << (STRING_LITERAL - 18)) | (1L << (ACTION - 18)) | (1L << (SEMPRED - 18)) | (1L << (TREE_BEGIN - 18)) | (1L << (TOKEN_REF - 18)) | (1L << (RULE_REF - 18)))) != 0)) {
					{
					setState(268);
					alternative();
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==REWRITE) {
						{
						setState(269);
						rewrite();
						}
					}

					}
				}

				}
				}
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(279);
			match(T__19);
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

	public static class AltListContext extends ParserRuleContext {
		public List<AlternativeContext> alternative() {
			return getRuleContexts(AlternativeContext.class);
		}
		public AlternativeContext alternative(int i) {
			return getRuleContext(AlternativeContext.class,i);
		}
		public List<RewriteContext> rewrite() {
			return getRuleContexts(RewriteContext.class);
		}
		public RewriteContext rewrite(int i) {
			return getRuleContext(RewriteContext.class,i);
		}
		public AltListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterAltList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitAltList(this);
		}
	}

	public final AltListContext altList() throws RecognitionException {
		AltListContext _localctx = new AltListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_altList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			alternative();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REWRITE) {
				{
				setState(282);
				rewrite();
				}
			}

			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(285);
				match(T__18);
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (T__17 - 18)) | (1L << (T__24 - 18)) | (1L << (T__27 - 18)) | (1L << (CHAR_LITERAL - 18)) | (1L << (STRING_LITERAL - 18)) | (1L << (ACTION - 18)) | (1L << (SEMPRED - 18)) | (1L << (TREE_BEGIN - 18)) | (1L << (TOKEN_REF - 18)) | (1L << (RULE_REF - 18)))) != 0)) {
					{
					setState(286);
					alternative();
					setState(288);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==REWRITE) {
						{
						setState(287);
						rewrite();
						}
					}

					}
				}

				}
				}
				setState(296);
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

	public static class AlternativeContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public AlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitAlternative(this);
		}
	}

	public final AlternativeContext alternative() throws RecognitionException {
		AlternativeContext _localctx = new AlternativeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(297);
				element();
				}
				}
				setState(300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (T__17 - 18)) | (1L << (T__24 - 18)) | (1L << (T__27 - 18)) | (1L << (CHAR_LITERAL - 18)) | (1L << (STRING_LITERAL - 18)) | (1L << (ACTION - 18)) | (1L << (SEMPRED - 18)) | (1L << (TREE_BEGIN - 18)) | (1L << (TOKEN_REF - 18)) | (1L << (RULE_REF - 18)))) != 0) );
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

	public static class ExceptionGroupContext extends ParserRuleContext {
		public List<ExceptionHandlerContext> exceptionHandler() {
			return getRuleContexts(ExceptionHandlerContext.class);
		}
		public ExceptionHandlerContext exceptionHandler(int i) {
			return getRuleContext(ExceptionHandlerContext.class,i);
		}
		public FinallyClauseContext finallyClause() {
			return getRuleContext(FinallyClauseContext.class,0);
		}
		public ExceptionGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterExceptionGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitExceptionGroup(this);
		}
	}

	public final ExceptionGroupContext exceptionGroup() throws RecognitionException {
		ExceptionGroupContext _localctx = new ExceptionGroupContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exceptionGroup);
		int _la;
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(303); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(302);
					exceptionHandler();
					}
					}
					setState(305); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__20 );
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(307);
					finallyClause();
					}
				}

				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				finallyClause();
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

	public static class ExceptionHandlerContext extends ParserRuleContext {
		public TerminalNode ARG_ACTION() { return getToken(ANTLRv3Parser.ARG_ACTION, 0); }
		public TerminalNode ACTION() { return getToken(ANTLRv3Parser.ACTION, 0); }
		public ExceptionHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterExceptionHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitExceptionHandler(this);
		}
	}

	public final ExceptionHandlerContext exceptionHandler() throws RecognitionException {
		ExceptionHandlerContext _localctx = new ExceptionHandlerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exceptionHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(T__20);
			setState(314);
			match(ARG_ACTION);
			setState(315);
			match(ACTION);
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

	public static class FinallyClauseContext extends ParserRuleContext {
		public TerminalNode ACTION() { return getToken(ANTLRv3Parser.ACTION, 0); }
		public FinallyClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterFinallyClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitFinallyClause(this);
		}
	}

	public final FinallyClauseContext finallyClause() throws RecognitionException {
		FinallyClauseContext _localctx = new FinallyClauseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_finallyClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(T__21);
			setState(318);
			match(ACTION);
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

	public static class ElementContext extends ParserRuleContext {
		public ElementNoOptionSpecContext elementNoOptionSpec() {
			return getRuleContext(ElementNoOptionSpecContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			elementNoOptionSpec();
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

	public static class ElementNoOptionSpecContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EbnfContext ebnf() {
			return getRuleContext(EbnfContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ANTLRv3Parser.ACTION, 0); }
		public TerminalNode SEMPRED() { return getToken(ANTLRv3Parser.SEMPRED, 0); }
		public TreeSpecContext treeSpec() {
			return getRuleContext(TreeSpecContext.class,0);
		}
		public ElementNoOptionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementNoOptionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterElementNoOptionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitElementNoOptionSpec(this);
		}
	}

	public final ElementNoOptionSpecContext elementNoOptionSpec() throws RecognitionException {
		ElementNoOptionSpecContext _localctx = new ElementNoOptionSpecContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elementNoOptionSpec);
		int _la;
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				id();
				setState(323);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__22) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(324);
				atom();
				{
				setState(326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__25) | (1L << T__26))) != 0)) {
					{
					setState(325);
					ebnfSuffix();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				id();
				setState(329);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__22) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(330);
				block();
				{
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__25) | (1L << T__26))) != 0)) {
					{
					setState(331);
					ebnfSuffix();
					}
				}

				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				atom();
				{
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__25) | (1L << T__26))) != 0)) {
					{
					setState(335);
					ebnfSuffix();
					}
				}

				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(338);
				ebnf();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(339);
				match(ACTION);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(340);
				match(SEMPRED);
				{
				setState(341);
				match(T__23);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(342);
				treeSpec();
				{
				setState(343);
				ebnfSuffix();
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

	public static class AtomContext extends ParserRuleContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public Terminal_Context terminal_() {
			return getRuleContext(Terminal_Context.class,0);
		}
		public NotSetContext notSet() {
			return getRuleContext(NotSetContext.class,0);
		}
		public TerminalNode RULE_REF() { return getToken(ANTLRv3Parser.RULE_REF, 0); }
		public TerminalNode ARG_ACTION() { return getToken(ANTLRv3Parser.ARG_ACTION, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_atom);
		int _la;
		try {
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				terminal_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				notSet();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				match(RULE_REF);
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARG_ACTION) {
					{
					setState(351);
					match(ARG_ACTION);
					}
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

	public static class NotSetContext extends ParserRuleContext {
		public NotTerminalContext notTerminal() {
			return getRuleContext(NotTerminalContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public NotSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterNotSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitNotSet(this);
		}
	}

	public final NotSetContext notSet() throws RecognitionException {
		NotSetContext _localctx = new NotSetContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_notSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(T__24);
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case TOKEN_REF:
				{
				setState(357);
				notTerminal();
				}
				break;
			case T__17:
				{
				setState(358);
				block();
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

	public static class TreeSpecContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TreeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_treeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterTreeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitTreeSpec(this);
		}
	}

	public final TreeSpecContext treeSpec() throws RecognitionException {
		TreeSpecContext _localctx = new TreeSpecContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_treeSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			match(TREE_BEGIN);
			setState(362);
			element();
			setState(364); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(363);
				element();
				}
				}
				setState(366); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (T__17 - 18)) | (1L << (T__24 - 18)) | (1L << (T__27 - 18)) | (1L << (CHAR_LITERAL - 18)) | (1L << (STRING_LITERAL - 18)) | (1L << (ACTION - 18)) | (1L << (SEMPRED - 18)) | (1L << (TREE_BEGIN - 18)) | (1L << (TOKEN_REF - 18)) | (1L << (RULE_REF - 18)))) != 0) );
			setState(368);
			match(T__19);
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

	public static class EbnfContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public EbnfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ebnf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterEbnf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitEbnf(this);
		}
	}

	public final EbnfContext ebnf() throws RecognitionException {
		EbnfContext _localctx = new EbnfContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ebnf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			block();
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__23) | (1L << T__25) | (1L << T__26))) != 0)) {
				{
				setState(371);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__23) | (1L << T__25) | (1L << T__26))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class RangeContext extends ParserRuleContext {
		public List<TerminalNode> CHAR_LITERAL() { return getTokens(ANTLRv3Parser.CHAR_LITERAL); }
		public TerminalNode CHAR_LITERAL(int i) {
			return getToken(ANTLRv3Parser.CHAR_LITERAL, i);
		}
		public TerminalNode RANGE() { return getToken(ANTLRv3Parser.RANGE, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(CHAR_LITERAL);
			setState(375);
			match(RANGE);
			setState(376);
			match(CHAR_LITERAL);
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

	public static class Terminal_Context extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(ANTLRv3Parser.CHAR_LITERAL, 0); }
		public TerminalNode TOKEN_REF() { return getToken(ANTLRv3Parser.TOKEN_REF, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv3Parser.STRING_LITERAL, 0); }
		public TerminalNode ARG_ACTION() { return getToken(ANTLRv3Parser.ARG_ACTION, 0); }
		public Terminal_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterTerminal_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitTerminal_(this);
		}
	}

	public final Terminal_Context terminal_() throws RecognitionException {
		Terminal_Context _localctx = new Terminal_Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_terminal_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR_LITERAL:
				{
				setState(378);
				match(CHAR_LITERAL);
				}
				break;
			case TOKEN_REF:
				{
				setState(379);
				match(TOKEN_REF);
				{
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARG_ACTION) {
					{
					setState(380);
					match(ARG_ACTION);
					}
				}

				}
				}
				break;
			case STRING_LITERAL:
				{
				setState(383);
				match(STRING_LITERAL);
				}
				break;
			case T__27:
				{
				setState(384);
				match(T__27);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROOT || _la==BANG) {
				{
				setState(387);
				_la = _input.LA(1);
				if ( !(_la==ROOT || _la==BANG) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class NotTerminalContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(ANTLRv3Parser.CHAR_LITERAL, 0); }
		public TerminalNode TOKEN_REF() { return getToken(ANTLRv3Parser.TOKEN_REF, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv3Parser.STRING_LITERAL, 0); }
		public NotTerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notTerminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterNotTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitNotTerminal(this);
		}
	}

	public final NotTerminalContext notTerminal() throws RecognitionException {
		NotTerminalContext _localctx = new NotTerminalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_notTerminal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_la = _input.LA(1);
			if ( !(((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (CHAR_LITERAL - 30)) | (1L << (STRING_LITERAL - 30)) | (1L << (TOKEN_REF - 30)))) != 0)) ) {
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

	public static class EbnfSuffixContext extends ParserRuleContext {
		public EbnfSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ebnfSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterEbnfSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitEbnfSuffix(this);
		}
	}

	public final EbnfSuffixContext ebnfSuffix() throws RecognitionException {
		EbnfSuffixContext _localctx = new EbnfSuffixContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ebnfSuffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__25) | (1L << T__26))) != 0)) ) {
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

	public static class RewriteContext extends ParserRuleContext {
		public Rewrite_alternativeContext rewrite_alternative() {
			return getRuleContext(Rewrite_alternativeContext.class,0);
		}
		public List<TerminalNode> SEMPREDrewrite_alternative() { return getTokens(ANTLRv3Parser.SEMPREDrewrite_alternative); }
		public TerminalNode SEMPREDrewrite_alternative(int i) {
			return getToken(ANTLRv3Parser.SEMPREDrewrite_alternative, i);
		}
		public RewriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterRewrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitRewrite(this);
		}
	}

	public final RewriteContext rewrite() throws RecognitionException {
		RewriteContext _localctx = new RewriteContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_rewrite);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(394);
					match(REWRITE);
					setState(395);
					match(SEMPREDrewrite_alternative);
					}
					} 
				}
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(401);
			match(REWRITE);
			setState(402);
			rewrite_alternative();
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

	public static class Rewrite_alternativeContext extends ParserRuleContext {
		public Rewrite_templateContext rewrite_template() {
			return getRuleContext(Rewrite_templateContext.class,0);
		}
		public Rewrite_tree_alternativeContext rewrite_tree_alternative() {
			return getRuleContext(Rewrite_tree_alternativeContext.class,0);
		}
		public Rewrite_alternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewrite_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterRewrite_alternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitRewrite_alternative(this);
		}
	}

	public final Rewrite_alternativeContext rewrite_alternative() throws RecognitionException {
		Rewrite_alternativeContext _localctx = new Rewrite_alternativeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_rewrite_alternative);
		try {
			setState(406);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				rewrite_template();
				}
				break;
			case T__17:
			case T__28:
			case CHAR_LITERAL:
			case STRING_LITERAL:
			case ACTION:
			case TREE_BEGIN:
			case TOKEN_REF:
			case RULE_REF:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				rewrite_tree_alternative();
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

	public static class Rewrite_tree_blockContext extends ParserRuleContext {
		public Rewrite_tree_alternativeContext rewrite_tree_alternative() {
			return getRuleContext(Rewrite_tree_alternativeContext.class,0);
		}
		public Rewrite_tree_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewrite_tree_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterRewrite_tree_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitRewrite_tree_block(this);
		}
	}

	public final Rewrite_tree_blockContext rewrite_tree_block() throws RecognitionException {
		Rewrite_tree_blockContext _localctx = new Rewrite_tree_blockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_rewrite_tree_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(T__17);
			setState(409);
			rewrite_tree_alternative();
			setState(410);
			match(T__19);
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

	public static class Rewrite_tree_alternativeContext extends ParserRuleContext {
		public List<Rewrite_tree_elementContext> rewrite_tree_element() {
			return getRuleContexts(Rewrite_tree_elementContext.class);
		}
		public Rewrite_tree_elementContext rewrite_tree_element(int i) {
			return getRuleContext(Rewrite_tree_elementContext.class,i);
		}
		public Rewrite_tree_alternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewrite_tree_alternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterRewrite_tree_alternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitRewrite_tree_alternative(this);
		}
	}

	public final Rewrite_tree_alternativeContext rewrite_tree_alternative() throws RecognitionException {
		Rewrite_tree_alternativeContext _localctx = new Rewrite_tree_alternativeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_rewrite_tree_alternative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(412);
				rewrite_tree_element();
				}
				}
				setState(415); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (T__17 - 18)) | (1L << (T__28 - 18)) | (1L << (CHAR_LITERAL - 18)) | (1L << (STRING_LITERAL - 18)) | (1L << (ACTION - 18)) | (1L << (TREE_BEGIN - 18)) | (1L << (TOKEN_REF - 18)) | (1L << (RULE_REF - 18)))) != 0) );
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

	public static class Rewrite_tree_elementContext extends ParserRuleContext {
		public Rewrite_tree_atomContext rewrite_tree_atom() {
			return getRuleContext(Rewrite_tree_atomContext.class,0);
		}
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public Rewrite_treeContext rewrite_tree() {
			return getRuleContext(Rewrite_treeContext.class,0);
		}
		public Rewrite_tree_ebnfContext rewrite_tree_ebnf() {
			return getRuleContext(Rewrite_tree_ebnfContext.class,0);
		}
		public Rewrite_tree_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewrite_tree_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterRewrite_tree_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitRewrite_tree_element(this);
		}
	}

	public final Rewrite_tree_elementContext rewrite_tree_element() throws RecognitionException {
		Rewrite_tree_elementContext _localctx = new Rewrite_tree_elementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_rewrite_tree_element);
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(417);
				rewrite_tree_atom();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(418);
				rewrite_tree_atom();
				setState(419);
				ebnfSuffix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				rewrite_tree();
				{
				setState(422);
				ebnfSuffix();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
				rewrite_tree_ebnf();
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

	public static class Rewrite_tree_atomContext extends ParserRuleContext {
		public TerminalNode CHAR_LITERAL() { return getToken(ANTLRv3Parser.CHAR_LITERAL, 0); }
		public TerminalNode TOKEN_REF() { return getToken(ANTLRv3Parser.TOKEN_REF, 0); }
		public TerminalNode ARG_ACTION() { return getToken(ANTLRv3Parser.ARG_ACTION, 0); }
		public TerminalNode RULE_REF() { return getToken(ANTLRv3Parser.RULE_REF, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ANTLRv3Parser.STRING_LITERAL, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ANTLRv3Parser.ACTION, 0); }
		public Rewrite_tree_atomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewrite_tree_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterRewrite_tree_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitRewrite_tree_atom(this);
		}
	}

	public final Rewrite_tree_atomContext rewrite_tree_atom() throws RecognitionException {
		Rewrite_tree_atomContext _localctx = new Rewrite_tree_atomContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_rewrite_tree_atom);
		int _la;
		try {
			setState(437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(427);
				match(CHAR_LITERAL);
				}
				break;
			case TOKEN_REF:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				match(TOKEN_REF);
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARG_ACTION) {
					{
					setState(429);
					match(ARG_ACTION);
					}
				}

				}
				break;
			case RULE_REF:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				match(RULE_REF);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(433);
				match(STRING_LITERAL);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 5);
				{
				setState(434);
				match(T__28);
				setState(435);
				id();
				}
				break;
			case ACTION:
				enterOuterAlt(_localctx, 6);
				{
				setState(436);
				match(ACTION);
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

	public static class Rewrite_tree_ebnfContext extends ParserRuleContext {
		public Rewrite_tree_blockContext rewrite_tree_block() {
			return getRuleContext(Rewrite_tree_blockContext.class,0);
		}
		public EbnfSuffixContext ebnfSuffix() {
			return getRuleContext(EbnfSuffixContext.class,0);
		}
		public Rewrite_tree_ebnfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewrite_tree_ebnf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterRewrite_tree_ebnf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitRewrite_tree_ebnf(this);
		}
	}

	public final Rewrite_tree_ebnfContext rewrite_tree_ebnf() throws RecognitionException {
		Rewrite_tree_ebnfContext _localctx = new Rewrite_tree_ebnfContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_rewrite_tree_ebnf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			rewrite_tree_block();
			setState(440);
			ebnfSuffix();
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

	public static class Rewrite_treeContext extends ParserRuleContext {
		public Rewrite_tree_atomContext rewrite_tree_atom() {
			return getRuleContext(Rewrite_tree_atomContext.class,0);
		}
		public List<Rewrite_tree_elementContext> rewrite_tree_element() {
			return getRuleContexts(Rewrite_tree_elementContext.class);
		}
		public Rewrite_tree_elementContext rewrite_tree_element(int i) {
			return getRuleContext(Rewrite_tree_elementContext.class,i);
		}
		public Rewrite_treeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewrite_tree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterRewrite_tree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitRewrite_tree(this);
		}
	}

	public final Rewrite_treeContext rewrite_tree() throws RecognitionException {
		Rewrite_treeContext _localctx = new Rewrite_treeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_rewrite_tree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			match(TREE_BEGIN);
			setState(443);
			rewrite_tree_atom();
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 18)) & ~0x3f) == 0 && ((1L << (_la - 18)) & ((1L << (T__17 - 18)) | (1L << (T__28 - 18)) | (1L << (CHAR_LITERAL - 18)) | (1L << (STRING_LITERAL - 18)) | (1L << (ACTION - 18)) | (1L << (TREE_BEGIN - 18)) | (1L << (TOKEN_REF - 18)) | (1L << (RULE_REF - 18)))) != 0)) {
				{
				{
				setState(444);
				rewrite_tree_element();
				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(450);
			match(T__19);
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

	public static class Rewrite_templateContext extends ParserRuleContext {
		public Rewrite_templateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewrite_template; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterRewrite_template(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitRewrite_template(this);
		}
	}

	public final Rewrite_templateContext rewrite_template() throws RecognitionException {
		Rewrite_templateContext _localctx = new Rewrite_templateContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_rewrite_template);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Rewrite_template_refContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Rewrite_template_argsContext rewrite_template_args() {
			return getRuleContext(Rewrite_template_argsContext.class,0);
		}
		public Rewrite_template_refContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewrite_template_ref; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterRewrite_template_ref(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitRewrite_template_ref(this);
		}
	}

	public final Rewrite_template_refContext rewrite_template_ref() throws RecognitionException {
		Rewrite_template_refContext _localctx = new Rewrite_template_refContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_rewrite_template_ref);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			id();
			setState(455);
			match(T__17);
			setState(456);
			rewrite_template_args();
			setState(457);
			match(T__19);
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

	public static class Rewrite_indirect_template_headContext extends ParserRuleContext {
		public TerminalNode ACTION() { return getToken(ANTLRv3Parser.ACTION, 0); }
		public Rewrite_template_argsContext rewrite_template_args() {
			return getRuleContext(Rewrite_template_argsContext.class,0);
		}
		public Rewrite_indirect_template_headContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewrite_indirect_template_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterRewrite_indirect_template_head(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitRewrite_indirect_template_head(this);
		}
	}

	public final Rewrite_indirect_template_headContext rewrite_indirect_template_head() throws RecognitionException {
		Rewrite_indirect_template_headContext _localctx = new Rewrite_indirect_template_headContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_rewrite_indirect_template_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(T__17);
			setState(460);
			match(ACTION);
			setState(461);
			match(T__19);
			setState(462);
			match(T__17);
			setState(463);
			rewrite_template_args();
			setState(464);
			match(T__19);
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

	public static class Rewrite_template_argsContext extends ParserRuleContext {
		public List<Rewrite_template_argContext> rewrite_template_arg() {
			return getRuleContexts(Rewrite_template_argContext.class);
		}
		public Rewrite_template_argContext rewrite_template_arg(int i) {
			return getRuleContext(Rewrite_template_argContext.class,i);
		}
		public Rewrite_template_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewrite_template_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterRewrite_template_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitRewrite_template_args(this);
		}
	}

	public final Rewrite_template_argsContext rewrite_template_args() throws RecognitionException {
		Rewrite_template_argsContext _localctx = new Rewrite_template_argsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_rewrite_template_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			rewrite_template_arg();
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(467);
				match(T__16);
				setState(468);
				rewrite_template_arg();
				}
				}
				setState(473);
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

	public static class Rewrite_template_argContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ANTLRv3Parser.ACTION, 0); }
		public Rewrite_template_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rewrite_template_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterRewrite_template_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitRewrite_template_arg(this);
		}
	}

	public final Rewrite_template_argContext rewrite_template_arg() throws RecognitionException {
		Rewrite_template_argContext _localctx = new Rewrite_template_argContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_rewrite_template_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			id();
			setState(475);
			match(T__6);
			setState(476);
			match(ACTION);
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode TOKEN_REF() { return getToken(ANTLRv3Parser.TOKEN_REF, 0); }
		public TerminalNode RULE_REF() { return getToken(ANTLRv3Parser.RULE_REF, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ANTLRv3Listener ) ((ANTLRv3Listener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_la = _input.LA(1);
			if ( !(_la==TOKEN_REF || _la==RULE_REF) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3S\u01e3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\5\2Z\n\2\3\2\5\2]\n\2\3\2\3\2\3\2\3\2\5\2c\n\2\3\2\5\2f\n\2\3"+
		"\2\7\2i\n\2\f\2\16\2l\13\2\3\2\7\2o\n\2\f\2\16\2r\13\2\3\2\6\2u\n\2\r"+
		"\2\16\2v\3\3\3\3\6\3{\n\3\r\3\16\3|\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u0085"+
		"\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6\u0091\n\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\5\7\u0099\n\7\3\b\3\b\3\b\3\b\6\b\u009f\n\b\r\b\16\b\u00a0"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u00ae\n\n\3\13\5\13\u00b1"+
		"\n\13\3\13\5\13\u00b4\n\13\3\13\3\13\5\13\u00b8\n\13\3\13\5\13\u00bb\n"+
		"\13\3\13\3\13\5\13\u00bf\n\13\3\13\5\13\u00c2\n\13\3\13\5\13\u00c5\n\13"+
		"\3\13\5\13\u00c8\n\13\3\13\7\13\u00cb\n\13\f\13\16\13\u00ce\13\13\3\13"+
		"\3\13\5\13\u00d2\n\13\3\13\3\13\5\13\u00d6\n\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\7\r\u00e0\n\r\f\r\16\r\u00e3\13\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u00eb\n\16\f\16\16\16\u00ee\13\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u00f8\n\16\f\16\16\16\u00fb\13\16\3\16\3\16\5\16"+
		"\u00ff\n\16\3\17\3\17\5\17\u0103\n\17\3\17\5\17\u0106\n\17\3\17\5\17\u0109"+
		"\n\17\3\17\5\17\u010c\n\17\3\17\3\17\3\17\5\17\u0111\n\17\5\17\u0113\n"+
		"\17\7\17\u0115\n\17\f\17\16\17\u0118\13\17\3\17\3\17\3\20\3\20\5\20\u011e"+
		"\n\20\3\20\3\20\3\20\5\20\u0123\n\20\5\20\u0125\n\20\7\20\u0127\n\20\f"+
		"\20\16\20\u012a\13\20\3\21\6\21\u012d\n\21\r\21\16\21\u012e\3\22\6\22"+
		"\u0132\n\22\r\22\16\22\u0133\3\22\5\22\u0137\n\22\3\22\5\22\u013a\n\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\5\26"+
		"\u0149\n\26\3\26\3\26\3\26\3\26\5\26\u014f\n\26\3\26\3\26\5\26\u0153\n"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u015c\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u0163\n\27\5\27\u0165\n\27\3\30\3\30\3\30\5\30\u016a\n"+
		"\30\3\31\3\31\3\31\6\31\u016f\n\31\r\31\16\31\u0170\3\31\3\31\3\32\3\32"+
		"\5\32\u0177\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\5\34\u0180\n\34\3"+
		"\34\3\34\5\34\u0184\n\34\3\34\5\34\u0187\n\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\7\37\u018f\n\37\f\37\16\37\u0192\13\37\3\37\3\37\3\37\3 \3 \5 \u0199"+
		"\n \3!\3!\3!\3!\3\"\6\"\u01a0\n\"\r\"\16\"\u01a1\3#\3#\3#\3#\3#\3#\3#"+
		"\3#\5#\u01ac\n#\3$\3$\3$\5$\u01b1\n$\3$\3$\3$\3$\3$\5$\u01b8\n$\3%\3%"+
		"\3%\3&\3&\3&\7&\u01c0\n&\f&\16&\u01c3\13&\3&\3&\3\'\3\'\3(\3(\3(\3(\3"+
		"(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\7*\u01d8\n*\f*\16*\u01db\13*\3+\3+\3+"+
		"\3+\3,\3,\3,\2\2-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTV\2\13\3\2\3\5\3\2 !\4\2\r\17HH\4\2\t\t\31\31\5\2"+
		"\f\f\32\32\34\35\3\2JK\4\2 !QQ\4\2\f\f\34\35\3\2QR\2\u020a\2Y\3\2\2\2"+
		"\4x\3\2\2\2\6\u0080\3\2\2\2\b\u0088\3\2\2\2\n\u008c\3\2\2\2\f\u0098\3"+
		"\2\2\2\16\u009a\3\2\2\2\20\u00a4\3\2\2\2\22\u00ad\3\2\2\2\24\u00b0\3\2"+
		"\2\2\26\u00d7\3\2\2\2\30\u00db\3\2\2\2\32\u00fe\3\2\2\2\34\u0100\3\2\2"+
		"\2\36\u011b\3\2\2\2 \u012c\3\2\2\2\"\u0139\3\2\2\2$\u013b\3\2\2\2&\u013f"+
		"\3\2\2\2(\u0142\3\2\2\2*\u015b\3\2\2\2,\u0164\3\2\2\2.\u0166\3\2\2\2\60"+
		"\u016b\3\2\2\2\62\u0174\3\2\2\2\64\u0178\3\2\2\2\66\u0183\3\2\2\28\u0188"+
		"\3\2\2\2:\u018a\3\2\2\2<\u0190\3\2\2\2>\u0198\3\2\2\2@\u019a\3\2\2\2B"+
		"\u019f\3\2\2\2D\u01ab\3\2\2\2F\u01b7\3\2\2\2H\u01b9\3\2\2\2J\u01bc\3\2"+
		"\2\2L\u01c6\3\2\2\2N\u01c8\3\2\2\2P\u01cd\3\2\2\2R\u01d4\3\2\2\2T\u01dc"+
		"\3\2\2\2V\u01e0\3\2\2\2XZ\7)\2\2YX\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[]\t\2"+
		"\2\2\\[\3\2\2\2\\]\3\2\2\2]^\3\2\2\2^_\7\6\2\2_`\5V,\2`b\7\7\2\2ac\5\16"+
		"\b\2ba\3\2\2\2bc\3\2\2\2ce\3\2\2\2df\5\4\3\2ed\3\2\2\2ef\3\2\2\2fj\3\2"+
		"\2\2gi\5\b\5\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kp\3\2\2\2lj\3\2"+
		"\2\2mo\5\n\6\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qt\3\2\2\2rp\3\2"+
		"\2\2su\5\24\13\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\3\3\2\2\2xz"+
		"\7(\2\2y{\5\6\4\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177"+
		"\7\b\2\2\177\5\3\2\2\2\u0080\u0084\7Q\2\2\u0081\u0082\7\t\2\2\u0082\u0085"+
		"\t\3\2\2\u0083\u0085\3\2\2\2\u0084\u0081\3\2\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\7\7\2\2\u0087\7\3\2\2\2\u0088\u0089\7C\2\2"+
		"\u0089\u008a\5V,\2\u008a\u008b\7&\2\2\u008b\t\3\2\2\2\u008c\u0090\7\n"+
		"\2\2\u008d\u008e\5\f\7\2\u008e\u008f\7\13\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008d\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\5V"+
		",\2\u0093\u0094\7&\2\2\u0094\13\3\2\2\2\u0095\u0099\5V,\2\u0096\u0099"+
		"\7\3\2\2\u0097\u0099\7\4\2\2\u0098\u0095\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0097\3\2\2\2\u0099\r\3\2\2\2\u009a\u009e\7\'\2\2\u009b\u009c\5\20\t"+
		"\2\u009c\u009d\7\7\2\2\u009d\u009f\3\2\2\2\u009e\u009b\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\7\b\2\2\u00a3\17\3\2\2\2\u00a4\u00a5\5V,\2\u00a5\u00a6\7\t\2\2"+
		"\u00a6\u00a7\5\22\n\2\u00a7\21\3\2\2\2\u00a8\u00ae\5V,\2\u00a9\u00ae\7"+
		"!\2\2\u00aa\u00ae\7 \2\2\u00ab\u00ae\7$\2\2\u00ac\u00ae\7\f\2\2\u00ad"+
		"\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ac\3\2\2\2\u00ae\23\3\2\2\2\u00af\u00b1\7)\2\2\u00b0\u00af"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b4\t\4\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\5V"+
		",\2\u00b6\u00b8\7K\2\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba"+
		"\3\2\2\2\u00b9\u00bb\7%\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00bd\7\20\2\2\u00bd\u00bf\7%\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00c2\5\30\r\2\u00c1"+
		"\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c5\5\16"+
		"\b\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00c8\5\32\16\2\u00c7\u00c6\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cc\3"+
		"\2\2\2\u00c9\u00cb\5\26\f\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d1\7\21\2\2\u00d0\u00d2\5\36\20\2\u00d1\u00d0\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\7\7\2\2\u00d4\u00d6\5\""+
		"\22\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\25\3\2\2\2\u00d7\u00d8"+
		"\7\n\2\2\u00d8\u00d9\5V,\2\u00d9\u00da\7&\2\2\u00da\27\3\2\2\2\u00db\u00dc"+
		"\7\22\2\2\u00dc\u00e1\5V,\2\u00dd\u00de\7\23\2\2\u00de\u00e0\5V,\2\u00df"+
		"\u00dd\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\31\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7C\2\2\u00e5\u00ff"+
		"\7&\2\2\u00e6\u00e7\7C\2\2\u00e7\u00ec\5V,\2\u00e8\u00e9\7\23\2\2\u00e9"+
		"\u00eb\5V,\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2"+
		"\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0"+
		"\7\7\2\2\u00f0\u00ff\3\2\2\2\u00f1\u00f2\7C\2\2\u00f2\u00f3\7&\2\2\u00f3"+
		"\u00f4\7C\2\2\u00f4\u00f9\5V,\2\u00f5\u00f6\7\23\2\2\u00f6\u00f8\5V,\2"+
		"\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa"+
		"\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fd\7\7\2\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u00e4\3\2\2\2\u00fe\u00e6\3\2\2\2\u00fe\u00f1\3\2"+
		"\2\2\u00ff\33\3\2\2\2\u0100\u0105\7\24\2\2\u0101\u0103\5\16\b\2\u0102"+
		"\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\7\21"+
		"\2\2\u0105\u0102\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107"+
		"\u0109\5 \21\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2"+
		"\2\2\u010a\u010c\5<\37\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u0116\3\2\2\2\u010d\u0112\7\25\2\2\u010e\u0110\5 \21\2\u010f\u0111\5"+
		"<\37\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112"+
		"\u010e\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115\3\2\2\2\u0114\u010d\3\2"+
		"\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7\26\2\2\u011a\35\3\2\2"+
		"\2\u011b\u011d\5 \21\2\u011c\u011e\5<\37\2\u011d\u011c\3\2\2\2\u011d\u011e"+
		"\3\2\2\2\u011e\u0128\3\2\2\2\u011f\u0124\7\25\2\2\u0120\u0122\5 \21\2"+
		"\u0121\u0123\5<\37\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125"+
		"\3\2\2\2\u0124\u0120\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126"+
		"\u011f\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\37\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012d\5(\25\2\u012c\u012b"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"!\3\2\2\2\u0130\u0132\5$\23\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2"+
		"\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2\2\2\u0135\u0137"+
		"\5&\24\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013a\3\2\2\2\u0138"+
		"\u013a\5&\24\2\u0139\u0131\3\2\2\2\u0139\u0138\3\2\2\2\u013a#\3\2\2\2"+
		"\u013b\u013c\7\27\2\2\u013c\u013d\7%\2\2\u013d\u013e\7&\2\2\u013e%\3\2"+
		"\2\2\u013f\u0140\7\30\2\2\u0140\u0141\7&\2\2\u0141\'\3\2\2\2\u0142\u0143"+
		"\5*\26\2\u0143)\3\2\2\2\u0144\u0145\5V,\2\u0145\u0146\t\5\2\2\u0146\u0148"+
		"\5,\27\2\u0147\u0149\5:\36\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u015c\3\2\2\2\u014a\u014b\5V,\2\u014b\u014c\t\5\2\2\u014c\u014e\5\34"+
		"\17\2\u014d\u014f\5:\36\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u015c\3\2\2\2\u0150\u0152\5,\27\2\u0151\u0153\5:\36\2\u0152\u0151\3\2"+
		"\2\2\u0152\u0153\3\2\2\2\u0153\u015c\3\2\2\2\u0154\u015c\5\62\32\2\u0155"+
		"\u015c\7&\2\2\u0156\u0157\7D\2\2\u0157\u015c\7\32\2\2\u0158\u0159\5\60"+
		"\31\2\u0159\u015a\5:\36\2\u015a\u015c\3\2\2\2\u015b\u0144\3\2\2\2\u015b"+
		"\u014a\3\2\2\2\u015b\u0150\3\2\2\2\u015b\u0154\3\2\2\2\u015b\u0155\3\2"+
		"\2\2\u015b\u0156\3\2\2\2\u015b\u0158\3\2\2\2\u015c+\3\2\2\2\u015d\u0165"+
		"\5\64\33\2\u015e\u0165\5\66\34\2\u015f\u0165\5.\30\2\u0160\u0162\7R\2"+
		"\2\u0161\u0163\7%\2\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165"+
		"\3\2\2\2\u0164\u015d\3\2\2\2\u0164\u015e\3\2\2\2\u0164\u015f\3\2\2\2\u0164"+
		"\u0160\3\2\2\2\u0165-\3\2\2\2\u0166\u0169\7\33\2\2\u0167\u016a\58\35\2"+
		"\u0168\u016a\5\34\17\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a/"+
		"\3\2\2\2\u016b\u016c\7I\2\2\u016c\u016e\5(\25\2\u016d\u016f\5(\25\2\u016e"+
		"\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172\u0173\7\26\2\2\u0173\61\3\2\2\2\u0174\u0176"+
		"\5\34\17\2\u0175\u0177\t\6\2\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2"+
		"\u0177\63\3\2\2\2\u0178\u0179\7 \2\2\u0179\u017a\7L\2\2\u017a\u017b\7"+
		" \2\2\u017b\65\3\2\2\2\u017c\u0184\7 \2\2\u017d\u017f\7Q\2\2\u017e\u0180"+
		"\7%\2\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0184\3\2\2\2\u0181"+
		"\u0184\7!\2\2\u0182\u0184\7\36\2\2\u0183\u017c\3\2\2\2\u0183\u017d\3\2"+
		"\2\2\u0183\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184\u0186\3\2\2\2\u0185"+
		"\u0187\t\7\2\2\u0186\u0185\3\2\2\2\u0186\u0187\3\2\2\2\u0187\67\3\2\2"+
		"\2\u0188\u0189\t\b\2\2\u01899\3\2\2\2\u018a\u018b\t\t\2\2\u018b;\3\2\2"+
		"\2\u018c\u018d\7M\2\2\u018d\u018f\7S\2\2\u018e\u018c\3\2\2\2\u018f\u0192"+
		"\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0193\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0193\u0194\7M\2\2\u0194\u0195\5> \2\u0195=\3\2\2\2\u0196"+
		"\u0199\5L\'\2\u0197\u0199\5B\"\2\u0198\u0196\3\2\2\2\u0198\u0197\3\2\2"+
		"\2\u0199?\3\2\2\2\u019a\u019b\7\24\2\2\u019b\u019c\5B\"\2\u019c\u019d"+
		"\7\26\2\2\u019dA\3\2\2\2\u019e\u01a0\5D#\2\u019f\u019e\3\2\2\2\u01a0\u01a1"+
		"\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2C\3\2\2\2\u01a3"+
		"\u01ac\5F$\2\u01a4\u01a5\5F$\2\u01a5\u01a6\5:\36\2\u01a6\u01ac\3\2\2\2"+
		"\u01a7\u01a8\5J&\2\u01a8\u01a9\5:\36\2\u01a9\u01ac\3\2\2\2\u01aa\u01ac"+
		"\5H%\2\u01ab\u01a3\3\2\2\2\u01ab\u01a4\3\2\2\2\u01ab\u01a7\3\2\2\2\u01ab"+
		"\u01aa\3\2\2\2\u01acE\3\2\2\2\u01ad\u01b8\7 \2\2\u01ae\u01b0\7Q\2\2\u01af"+
		"\u01b1\7%\2\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b8\3\2"+
		"\2\2\u01b2\u01b8\7R\2\2\u01b3\u01b8\7!\2\2\u01b4\u01b5\7\37\2\2\u01b5"+
		"\u01b8\5V,\2\u01b6\u01b8\7&\2\2\u01b7\u01ad\3\2\2\2\u01b7\u01ae\3\2\2"+
		"\2\u01b7\u01b2\3\2\2\2\u01b7\u01b3\3\2\2\2\u01b7\u01b4\3\2\2\2\u01b7\u01b6"+
		"\3\2\2\2\u01b8G\3\2\2\2\u01b9\u01ba\5@!\2\u01ba\u01bb\5:\36\2\u01bbI\3"+
		"\2\2\2\u01bc\u01bd\7I\2\2\u01bd\u01c1\5F$\2\u01be\u01c0\5D#\2\u01bf\u01be"+
		"\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2"+
		"\u01c4\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5\7\26\2\2\u01c5K\3\2\2\2"+
		"\u01c6\u01c7\3\2\2\2\u01c7M\3\2\2\2\u01c8\u01c9\5V,\2\u01c9\u01ca\7\24"+
		"\2\2\u01ca\u01cb\5R*\2\u01cb\u01cc\7\26\2\2\u01ccO\3\2\2\2\u01cd\u01ce"+
		"\7\24\2\2\u01ce\u01cf\7&\2\2\u01cf\u01d0\7\26\2\2\u01d0\u01d1\7\24\2\2"+
		"\u01d1\u01d2\5R*\2\u01d2\u01d3\7\26\2\2\u01d3Q\3\2\2\2\u01d4\u01d9\5T"+
		"+\2\u01d5\u01d6\7\23\2\2\u01d6\u01d8\5T+\2\u01d7\u01d5\3\2\2\2\u01d8\u01db"+
		"\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01daS\3\2\2\2\u01db"+
		"\u01d9\3\2\2\2\u01dc\u01dd\5V,\2\u01dd\u01de\7\t\2\2\u01de\u01df\7&\2"+
		"\2\u01dfU\3\2\2\2\u01e0\u01e1\t\n\2\2\u01e1W\3\2\2\2AY\\bejpv|\u0084\u0090"+
		"\u0098\u00a0\u00ad\u00b0\u00b3\u00b7\u00ba\u00be\u00c1\u00c4\u00c7\u00cc"+
		"\u00d1\u00d5\u00e1\u00ec\u00f9\u00fe\u0102\u0105\u0108\u010b\u0110\u0112"+
		"\u0116\u011d\u0122\u0124\u0128\u012e\u0133\u0136\u0139\u0148\u014e\u0152"+
		"\u015b\u0162\u0164\u0169\u0170\u0176\u017f\u0183\u0186\u0190\u0198\u01a1"+
		"\u01ab\u01b0\u01b7\u01c1\u01d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}