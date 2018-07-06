// Generated from prolog/prolog.g4 by ANTLR 4.7.1
package parsers.prolog;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class prologParser extends Parser {
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
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, LETTER_DIGIT=52, 
		VARIABLE=53, DECIMAL=54, BINARY=55, OCTAL=56, HEX=57, CHARACTER_CODE_CONSTANT=58, 
		FLOAT=59, GRAPHIC_TOKEN=60, QUOTED=61, DOUBLE_QUOTED_LIST=62, BACK_QUOTED_STRING=63, 
		WS=64, COMMENT=65, MULTILINE_COMMENT=66;
	public static final int
		RULE_p_text = 0, RULE_directive = 1, RULE_clause = 2, RULE_termlist = 3, 
		RULE_term = 4, RULE_operator = 5, RULE_atom = 6, RULE_integer = 7;
	public static final String[] ruleNames = {
		"p_text", "directive", "clause", "termlist", "term", "operator", "atom", 
		"integer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':-'", "'.'", "','", "'('", "')'", "'-'", "'['", "'|'", "']'", 
		"'{'", "'}'", "'-->'", "'?-'", "'dynamic'", "'multifile'", "'discontiguous'", 
		"'public'", "';'", "'->'", "'\\+'", "'='", "'\\='", "'=='", "'\\=='", 
		"'@<'", "'@=<'", "'@>'", "'@>='", "'=..'", "'is'", "'=:='", "'=\\='", 
		"'<'", "'=<'", "'>'", "'>='", "':'", "'+'", "'/\\'", "'\\/'", "'*'", "'/'", 
		"'//'", "'rem'", "'mod'", "'<<'", "'>>'", "'**'", "'^'", "'\\'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "LETTER_DIGIT", "VARIABLE", "DECIMAL", "BINARY", 
		"OCTAL", "HEX", "CHARACTER_CODE_CONSTANT", "FLOAT", "GRAPHIC_TOKEN", "QUOTED", 
		"DOUBLE_QUOTED_LIST", "BACK_QUOTED_STRING", "WS", "COMMENT", "MULTILINE_COMMENT"
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
	public String getGrammarFileName() { return "prolog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public prologParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class P_textContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(prologParser.EOF, 0); }
		public List<DirectiveContext> directive() {
			return getRuleContexts(DirectiveContext.class);
		}
		public DirectiveContext directive(int i) {
			return getRuleContext(DirectiveContext.class,i);
		}
		public List<ClauseContext> clause() {
			return getRuleContexts(ClauseContext.class);
		}
		public ClauseContext clause(int i) {
			return getRuleContext(ClauseContext.class,i);
		}
		public P_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterP_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitP_text(this);
		}
	}

	public final P_textContext p_text() throws RecognitionException {
		P_textContext _localctx = new P_textContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_p_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << LETTER_DIGIT) | (1L << VARIABLE) | (1L << DECIMAL) | (1L << BINARY) | (1L << OCTAL) | (1L << HEX) | (1L << CHARACTER_CODE_CONSTANT) | (1L << FLOAT) | (1L << GRAPHIC_TOKEN) | (1L << QUOTED) | (1L << DOUBLE_QUOTED_LIST) | (1L << BACK_QUOTED_STRING))) != 0)) {
				{
				setState(18);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(16);
					directive();
					}
					break;
				case 2:
					{
					setState(17);
					clause();
					}
					break;
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
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

	public static class DirectiveContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitDirective(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(T__0);
			setState(26);
			term(0);
			setState(27);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClauseContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitClause(this);
		}
	}

	public final ClauseContext clause() throws RecognitionException {
		ClauseContext _localctx = new ClauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			term(0);
			setState(30);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermlistContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterTermlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitTermlist(this);
		}
	}

	public final TermlistContext termlist() throws RecognitionException {
		TermlistContext _localctx = new TermlistContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_termlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			term(0);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(33);
				match(T__2);
				setState(34);
				term(0);
				}
				}
				setState(39);
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
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Atom_termContext extends TermContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Atom_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterAtom_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitAtom_term(this);
		}
	}
	public static class Binary_operatorContext extends TermContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public Binary_operatorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterBinary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitBinary_operator(this);
		}
	}
	public static class Unary_operatorContext extends TermContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Unary_operatorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitUnary_operator(this);
		}
	}
	public static class Braced_termContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Braced_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterBraced_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitBraced_term(this);
		}
	}
	public static class List_termContext extends TermContext {
		public TermlistContext termlist() {
			return getRuleContext(TermlistContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterList_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitList_term(this);
		}
	}
	public static class VariableContext extends TermContext {
		public TerminalNode VARIABLE() { return getToken(prologParser.VARIABLE, 0); }
		public VariableContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitVariable(this);
		}
	}
	public static class FloatContext extends TermContext {
		public TerminalNode FLOAT() { return getToken(prologParser.FLOAT, 0); }
		public FloatContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitFloat(this);
		}
	}
	public static class Compound_termContext extends TermContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TermlistContext termlist() {
			return getRuleContext(TermlistContext.class,0);
		}
		public Compound_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterCompound_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitCompound_term(this);
		}
	}
	public static class Integer_termContext extends TermContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public Integer_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterInteger_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitInteger_term(this);
		}
	}
	public static class Curly_bracketed_termContext extends TermContext {
		public TermlistContext termlist() {
			return getRuleContext(TermlistContext.class,0);
		}
		public Curly_bracketed_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterCurly_bracketed_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitCurly_bracketed_term(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(41);
				match(VARIABLE);
				}
				break;
			case 2:
				{
				_localctx = new Braced_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(T__3);
				setState(43);
				term(0);
				setState(44);
				match(T__4);
				}
				break;
			case 3:
				{
				_localctx = new Integer_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(46);
					match(T__5);
					}
				}

				setState(49);
				integer();
				}
				break;
			case 4:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(50);
					match(T__5);
					}
				}

				setState(53);
				match(FLOAT);
				}
				break;
			case 5:
				{
				_localctx = new Compound_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				atom();
				setState(55);
				match(T__3);
				setState(56);
				termlist();
				setState(57);
				match(T__4);
				}
				break;
			case 6:
				{
				_localctx = new Unary_operatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59);
				operator();
				setState(60);
				term(4);
				}
				break;
			case 7:
				{
				_localctx = new List_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(T__6);
				setState(63);
				termlist();
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(64);
					match(T__7);
					setState(65);
					term(0);
					}
				}

				setState(68);
				match(T__8);
				}
				break;
			case 8:
				{
				_localctx = new Curly_bracketed_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(T__9);
				setState(71);
				termlist();
				setState(72);
				match(T__10);
				}
				break;
			case 9:
				{
				_localctx = new Atom_termContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Binary_operatorContext(new TermContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(77);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(78);
					operator();
					setState(79);
					term(5);
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49))) != 0)) ) {
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Backq_stringContext extends AtomContext {
		public TerminalNode BACK_QUOTED_STRING() { return getToken(prologParser.BACK_QUOTED_STRING, 0); }
		public Backq_stringContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterBackq_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitBackq_string(this);
		}
	}
	public static class CutContext extends AtomContext {
		public CutContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterCut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitCut(this);
		}
	}
	public static class Empty_bracesContext extends AtomContext {
		public Empty_bracesContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterEmpty_braces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitEmpty_braces(this);
		}
	}
	public static class Dq_stringContext extends AtomContext {
		public TerminalNode DOUBLE_QUOTED_LIST() { return getToken(prologParser.DOUBLE_QUOTED_LIST, 0); }
		public Dq_stringContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterDq_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitDq_string(this);
		}
	}
	public static class NameContext extends AtomContext {
		public TerminalNode LETTER_DIGIT() { return getToken(prologParser.LETTER_DIGIT, 0); }
		public NameContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitName(this);
		}
	}
	public static class Quoted_stringContext extends AtomContext {
		public TerminalNode QUOTED() { return getToken(prologParser.QUOTED, 0); }
		public Quoted_stringContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterQuoted_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitQuoted_string(this);
		}
	}
	public static class Empty_listContext extends AtomContext {
		public Empty_listContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterEmpty_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitEmpty_list(this);
		}
	}
	public static class GraphicContext extends AtomContext {
		public TerminalNode GRAPHIC_TOKEN() { return getToken(prologParser.GRAPHIC_TOKEN, 0); }
		public GraphicContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterGraphic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitGraphic(this);
		}
	}
	public static class SemicolonContext extends AtomContext {
		public SemicolonContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitSemicolon(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atom);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new Empty_listContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(T__6);
				setState(89);
				match(T__8);
				}
				break;
			case T__9:
				_localctx = new Empty_bracesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(T__9);
				setState(91);
				match(T__10);
				}
				break;
			case LETTER_DIGIT:
				_localctx = new NameContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(LETTER_DIGIT);
				}
				break;
			case GRAPHIC_TOKEN:
				_localctx = new GraphicContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(GRAPHIC_TOKEN);
				}
				break;
			case QUOTED:
				_localctx = new Quoted_stringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(94);
				match(QUOTED);
				}
				break;
			case DOUBLE_QUOTED_LIST:
				_localctx = new Dq_stringContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(95);
				match(DOUBLE_QUOTED_LIST);
				}
				break;
			case BACK_QUOTED_STRING:
				_localctx = new Backq_stringContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(96);
				match(BACK_QUOTED_STRING);
				}
				break;
			case T__17:
				_localctx = new SemicolonContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(97);
				match(T__17);
				}
				break;
			case T__50:
				_localctx = new CutContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(98);
				match(T__50);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(prologParser.DECIMAL, 0); }
		public TerminalNode CHARACTER_CODE_CONSTANT() { return getToken(prologParser.CHARACTER_CODE_CONSTANT, 0); }
		public TerminalNode BINARY() { return getToken(prologParser.BINARY, 0); }
		public TerminalNode OCTAL() { return getToken(prologParser.OCTAL, 0); }
		public TerminalNode HEX() { return getToken(prologParser.HEX, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof prologListener ) ((prologListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL) | (1L << BINARY) | (1L << OCTAL) | (1L << HEX) | (1L << CHARACTER_CODE_CONSTANT))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Dj\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25\n\2\f"+
		"\2\16\2\30\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\7\5&\n"+
		"\5\f\5\16\5)\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\62\n\6\3\6\3\6\5\6\66"+
		"\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6E\n\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6N\n\6\3\6\3\6\3\6\3\6\7\6T\n\6\f\6\16\6W\13"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bf\n\b\3\t\3"+
		"\t\3\t\2\3\n\n\2\4\6\b\n\f\16\20\2\4\6\2\3\3\5\5\b\b\16\64\3\28<\2x\2"+
		"\26\3\2\2\2\4\33\3\2\2\2\6\37\3\2\2\2\b\"\3\2\2\2\nM\3\2\2\2\fX\3\2\2"+
		"\2\16e\3\2\2\2\20g\3\2\2\2\22\25\5\4\3\2\23\25\5\6\4\2\24\22\3\2\2\2\24"+
		"\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30"+
		"\26\3\2\2\2\31\32\7\2\2\3\32\3\3\2\2\2\33\34\7\3\2\2\34\35\5\n\6\2\35"+
		"\36\7\4\2\2\36\5\3\2\2\2\37 \5\n\6\2 !\7\4\2\2!\7\3\2\2\2\"\'\5\n\6\2"+
		"#$\7\5\2\2$&\5\n\6\2%#\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\t\3\2"+
		"\2\2)\'\3\2\2\2*+\b\6\1\2+N\7\67\2\2,-\7\6\2\2-.\5\n\6\2./\7\7\2\2/N\3"+
		"\2\2\2\60\62\7\b\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63N\5\20"+
		"\t\2\64\66\7\b\2\2\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\67N\7=\2"+
		"\289\5\16\b\29:\7\6\2\2:;\5\b\5\2;<\7\7\2\2<N\3\2\2\2=>\5\f\7\2>?\5\n"+
		"\6\6?N\3\2\2\2@A\7\t\2\2AD\5\b\5\2BC\7\n\2\2CE\5\n\6\2DB\3\2\2\2DE\3\2"+
		"\2\2EF\3\2\2\2FG\7\13\2\2GN\3\2\2\2HI\7\f\2\2IJ\5\b\5\2JK\7\r\2\2KN\3"+
		"\2\2\2LN\5\16\b\2M*\3\2\2\2M,\3\2\2\2M\61\3\2\2\2M\65\3\2\2\2M8\3\2\2"+
		"\2M=\3\2\2\2M@\3\2\2\2MH\3\2\2\2ML\3\2\2\2NU\3\2\2\2OP\f\7\2\2PQ\5\f\7"+
		"\2QR\5\n\6\7RT\3\2\2\2SO\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\13\3\2"+
		"\2\2WU\3\2\2\2XY\t\2\2\2Y\r\3\2\2\2Z[\7\t\2\2[f\7\13\2\2\\]\7\f\2\2]f"+
		"\7\r\2\2^f\7\66\2\2_f\7>\2\2`f\7?\2\2af\7@\2\2bf\7A\2\2cf\7\24\2\2df\7"+
		"\65\2\2eZ\3\2\2\2e\\\3\2\2\2e^\3\2\2\2e_\3\2\2\2e`\3\2\2\2ea\3\2\2\2e"+
		"b\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\17\3\2\2\2gh\t\3\2\2h\21\3\2\2\2\13\24"+
		"\26\'\61\65DMUe";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}