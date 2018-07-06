// Generated from clif/CLIF.g4 by ANTLR 4.7.1
package parsers.clif;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLIFParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPEN=1, CLOSE=2, STRINGQUOTE=3, NAMEQUOTE=4, BACKSLASH=5, NUMERAL=6, SEQMARK=7, 
		QUOTEDSTRING=8, ENCLOSEDNAME=9, EQUAL=10, AND=11, OR=12, IFF=13, IF=14, 
		FORALL=15, EXISTS=16, NOT=17, CL_ROLESET=18, CL_TEXT=19, CL_IMPORTS=20, 
		CL_EXCLUDES=21, CL_MODULE=22, CL_COMMENT=23, CL_PREFIX=24, NAMECHARSEQUENCE=25, 
		WHITE=26, BLOCKCOMMENT=27, LineComment=28;
	public static final int
		RULE_termseq = 0, RULE_interpretedname = 1, RULE_interpretablename = 2, 
		RULE_name = 3, RULE_term = 4, RULE_operator = 5, RULE_equation = 6, RULE_sentence = 7, 
		RULE_atomsent = 8, RULE_atom = 9, RULE_predicate = 10, RULE_boolsent = 11, 
		RULE_quantsent = 12, RULE_boundlist = 13, RULE_commentsent = 14, RULE_module = 15, 
		RULE_phrase = 16, RULE_text = 17, RULE_cltext = 18, RULE_namedtext = 19;
	public static final String[] ruleNames = {
		"termseq", "interpretedname", "interpretablename", "name", "term", "operator", 
		"equation", "sentence", "atomsent", "atom", "predicate", "boolsent", "quantsent", 
		"boundlist", "commentsent", "module", "phrase", "text", "cltext", "namedtext"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'''", "'\"'", "'\\'", null, null, null, null, "'='", 
		"'and'", "'or'", "'iff'", "'if'", "'forall'", "'exists'", "'not'", "'cl-roleset'", 
		"'cl-text'", "'cl-imports'", "'cl-excludes'", "'cl-module'", "'cl-comment'", 
		"'cl-prefix'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OPEN", "CLOSE", "STRINGQUOTE", "NAMEQUOTE", "BACKSLASH", "NUMERAL", 
		"SEQMARK", "QUOTEDSTRING", "ENCLOSEDNAME", "EQUAL", "AND", "OR", "IFF", 
		"IF", "FORALL", "EXISTS", "NOT", "CL_ROLESET", "CL_TEXT", "CL_IMPORTS", 
		"CL_EXCLUDES", "CL_MODULE", "CL_COMMENT", "CL_PREFIX", "NAMECHARSEQUENCE", 
		"WHITE", "BLOCKCOMMENT", "LineComment"
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
	public String getGrammarFileName() { return "CLIF.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CLIFParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TermseqContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> SEQMARK() { return getTokens(CLIFParser.SEQMARK); }
		public TerminalNode SEQMARK(int i) {
			return getToken(CLIFParser.SEQMARK, i);
		}
		public TermseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterTermseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitTermseq(this);
		}
	}

	public final TermseqContext termseq() throws RecognitionException {
		TermseqContext _localctx = new TermseqContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_termseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN) | (1L << NUMERAL) | (1L << SEQMARK) | (1L << QUOTEDSTRING) | (1L << ENCLOSEDNAME) | (1L << NAMECHARSEQUENCE))) != 0)) {
				{
				setState(42);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN:
				case NUMERAL:
				case QUOTEDSTRING:
				case ENCLOSEDNAME:
				case NAMECHARSEQUENCE:
					{
					setState(40);
					term();
					}
					break;
				case SEQMARK:
					{
					setState(41);
					match(SEQMARK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(46);
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

	public static class InterpretednameContext extends ParserRuleContext {
		public TerminalNode NUMERAL() { return getToken(CLIFParser.NUMERAL, 0); }
		public TerminalNode QUOTEDSTRING() { return getToken(CLIFParser.QUOTEDSTRING, 0); }
		public InterpretednameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpretedname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterInterpretedname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitInterpretedname(this);
		}
	}

	public final InterpretednameContext interpretedname() throws RecognitionException {
		InterpretednameContext _localctx = new InterpretednameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_interpretedname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !(_la==NUMERAL || _la==QUOTEDSTRING) ) {
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

	public static class InterpretablenameContext extends ParserRuleContext {
		public TerminalNode NAMECHARSEQUENCE() { return getToken(CLIFParser.NAMECHARSEQUENCE, 0); }
		public TerminalNode ENCLOSEDNAME() { return getToken(CLIFParser.ENCLOSEDNAME, 0); }
		public InterpretablenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpretablename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterInterpretablename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitInterpretablename(this);
		}
	}

	public final InterpretablenameContext interpretablename() throws RecognitionException {
		InterpretablenameContext _localctx = new InterpretablenameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_interpretablename);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_la = _input.LA(1);
			if ( !(_la==ENCLOSEDNAME || _la==NAMECHARSEQUENCE) ) {
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

	public static class NameContext extends ParserRuleContext {
		public InterpretednameContext interpretedname() {
			return getRuleContext(InterpretednameContext.class,0);
		}
		public InterpretablenameContext interpretablename() {
			return getRuleContext(InterpretablenameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERAL:
			case QUOTEDSTRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				interpretedname();
				}
				break;
			case ENCLOSEDNAME:
			case NAMECHARSEQUENCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				interpretablename();
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

	public static class TermContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(CLIFParser.OPEN, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TermseqContext termseq() {
			return getRuleContext(TermseqContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(CLIFParser.CLOSE, 0); }
		public TerminalNode QUOTEDSTRING() { return getToken(CLIFParser.QUOTEDSTRING, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_term);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				match(OPEN);
				setState(57);
				operator();
				setState(58);
				termseq();
				setState(59);
				match(CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(OPEN);
				setState(62);
				match(CL_COMMENT);
				setState(63);
				match(QUOTEDSTRING);
				setState(64);
				term();
				setState(65);
				match(CLOSE);
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

	public static class OperatorContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EquationContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(CLIFParser.OPEN, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode CLOSE() { return getToken(CLIFParser.CLOSE, 0); }
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitEquation(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_equation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(OPEN);
			setState(72);
			match(EQUAL);
			setState(73);
			term();
			setState(74);
			term();
			setState(75);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SentenceContext extends ParserRuleContext {
		public AtomsentContext atomsent() {
			return getRuleContext(AtomsentContext.class,0);
		}
		public BoolsentContext boolsent() {
			return getRuleContext(BoolsentContext.class,0);
		}
		public QuantsentContext quantsent() {
			return getRuleContext(QuantsentContext.class,0);
		}
		public CommentsentContext commentsent() {
			return getRuleContext(CommentsentContext.class,0);
		}
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitSentence(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentence);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				atomsent();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				boolsent();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				quantsent();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				commentsent();
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

	public static class AtomsentContext extends ParserRuleContext {
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomsentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomsent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterAtomsent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitAtomsent(this);
		}
	}

	public final AtomsentContext atomsent() throws RecognitionException {
		AtomsentContext _localctx = new AtomsentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atomsent);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				equation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				atom();
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
		public List<TerminalNode> OPEN() { return getTokens(CLIFParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(CLIFParser.OPEN, i);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TermseqContext termseq() {
			return getRuleContext(TermseqContext.class,0);
		}
		public List<TerminalNode> CLOSE() { return getTokens(CLIFParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(CLIFParser.CLOSE, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atom);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(OPEN);
				setState(88);
				predicate();
				setState(89);
				termseq();
				setState(90);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(OPEN);
				setState(93);
				term();
				setState(94);
				match(OPEN);
				setState(95);
				match(CL_ROLESET);
				{
				setState(96);
				match(OPEN);
				setState(97);
				name();
				setState(98);
				term();
				setState(99);
				match(CLOSE);
				}
				setState(101);
				match(CLOSE);
				setState(102);
				match(CLOSE);
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

	public static class PredicateContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolsentContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(CLIFParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(CLIFParser.CLOSE, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public BoolsentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolsent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterBoolsent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitBoolsent(this);
		}
	}

	public final BoolsentContext boolsent() throws RecognitionException {
		BoolsentContext _localctx = new BoolsentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_boolsent);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(OPEN);
				setState(109);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN) {
					{
					{
					setState(110);
					sentence();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(OPEN);
				setState(118);
				_la = _input.LA(1);
				if ( !(_la==IFF || _la==IF) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(119);
				sentence();
				setState(120);
				sentence();
				setState(121);
				match(CLOSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(OPEN);
				setState(124);
				match(NOT);
				setState(125);
				sentence();
				setState(126);
				match(CLOSE);
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

	public static class QuantsentContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(CLIFParser.OPEN, 0); }
		public BoundlistContext boundlist() {
			return getRuleContext(BoundlistContext.class,0);
		}
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(CLIFParser.CLOSE, 0); }
		public InterpretablenameContext interpretablename() {
			return getRuleContext(InterpretablenameContext.class,0);
		}
		public QuantsentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantsent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterQuantsent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitQuantsent(this);
		}
	}

	public final QuantsentContext quantsent() throws RecognitionException {
		QuantsentContext _localctx = new QuantsentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_quantsent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(OPEN);
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==FORALL || _la==EXISTS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ENCLOSEDNAME || _la==NAMECHARSEQUENCE) {
				{
				setState(132);
				interpretablename();
				}
			}

			setState(135);
			boundlist();
			setState(136);
			sentence();
			setState(137);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoundlistContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(CLIFParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(CLIFParser.OPEN, i);
		}
		public List<TerminalNode> CLOSE() { return getTokens(CLIFParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(CLIFParser.CLOSE, i);
		}
		public List<InterpretablenameContext> interpretablename() {
			return getRuleContexts(InterpretablenameContext.class);
		}
		public InterpretablenameContext interpretablename(int i) {
			return getRuleContext(InterpretablenameContext.class,i);
		}
		public List<TerminalNode> SEQMARK() { return getTokens(CLIFParser.SEQMARK); }
		public TerminalNode SEQMARK(int i) {
			return getToken(CLIFParser.SEQMARK, i);
		}
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public BoundlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterBoundlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitBoundlist(this);
		}
	}

	public final BoundlistContext boundlist() throws RecognitionException {
		BoundlistContext _localctx = new BoundlistContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_boundlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(OPEN);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN) | (1L << SEQMARK) | (1L << ENCLOSEDNAME) | (1L << NAMECHARSEQUENCE))) != 0)) {
				{
				setState(150);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ENCLOSEDNAME:
				case NAMECHARSEQUENCE:
					{
					setState(140);
					interpretablename();
					}
					break;
				case SEQMARK:
					{
					setState(141);
					match(SEQMARK);
					}
					break;
				case OPEN:
					{
					setState(142);
					match(OPEN);
					setState(145);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ENCLOSEDNAME:
					case NAMECHARSEQUENCE:
						{
						setState(143);
						interpretablename();
						}
						break;
					case SEQMARK:
						{
						setState(144);
						match(SEQMARK);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(147);
					term();
					setState(148);
					match(CLOSE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentsentContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(CLIFParser.OPEN, 0); }
		public TerminalNode ENCLOSEDNAME() { return getToken(CLIFParser.ENCLOSEDNAME, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(CLIFParser.CLOSE, 0); }
		public CommentsentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentsent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterCommentsent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitCommentsent(this);
		}
	}

	public final CommentsentContext commentsent() throws RecognitionException {
		CommentsentContext _localctx = new CommentsentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_commentsent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(OPEN);
			setState(158);
			match(CL_COMMENT);
			setState(159);
			match(ENCLOSEDNAME);
			setState(160);
			sentence();
			setState(161);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public List<TerminalNode> OPEN() { return getTokens(CLIFParser.OPEN); }
		public TerminalNode OPEN(int i) {
			return getToken(CLIFParser.OPEN, i);
		}
		public InterpretablenameContext interpretablename() {
			return getRuleContext(InterpretablenameContext.class,0);
		}
		public List<TerminalNode> CLOSE() { return getTokens(CLIFParser.CLOSE); }
		public TerminalNode CLOSE(int i) {
			return getToken(CLIFParser.CLOSE, i);
		}
		public CltextContext cltext() {
			return getRuleContext(CltextContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(OPEN);
			setState(164);
			match(CL_MODULE);
			setState(165);
			interpretablename();
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(166);
				match(OPEN);
				setState(167);
				match(CL_EXCLUDES);
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERAL) | (1L << QUOTEDSTRING) | (1L << ENCLOSEDNAME) | (1L << NAMECHARSEQUENCE))) != 0)) {
					{
					{
					setState(168);
					name();
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(174);
				match(CLOSE);
				}
				break;
			}
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(177);
				cltext();
				}
			}

			setState(180);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PhraseContext extends ParserRuleContext {
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(CLIFParser.OPEN, 0); }
		public InterpretablenameContext interpretablename() {
			return getRuleContext(InterpretablenameContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(CLIFParser.CLOSE, 0); }
		public TerminalNode ENCLOSEDNAME() { return getToken(CLIFParser.ENCLOSEDNAME, 0); }
		public CltextContext cltext() {
			return getRuleContext(CltextContext.class,0);
		}
		public PhraseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phrase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterPhrase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitPhrase(this);
		}
	}

	public final PhraseContext phrase() throws RecognitionException {
		PhraseContext _localctx = new PhraseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_phrase);
		int _la;
		try {
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				sentence();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				module();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(OPEN);
				setState(185);
				match(CL_IMPORTS);
				setState(186);
				interpretablename();
				setState(187);
				match(CLOSE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(189);
				match(OPEN);
				setState(190);
				match(CL_COMMENT);
				setState(191);
				match(ENCLOSEDNAME);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN) {
					{
					setState(192);
					cltext();
					}
				}

				setState(195);
				match(CLOSE);
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

	public static class TextContext extends ParserRuleContext {
		public List<PhraseContext> phrase() {
			return getRuleContexts(PhraseContext.class);
		}
		public PhraseContext phrase(int i) {
			return getRuleContext(PhraseContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198);
				phrase();
				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OPEN );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CltextContext extends ParserRuleContext {
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public NamedtextContext namedtext() {
			return getRuleContext(NamedtextContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public CltextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cltext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterCltext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitCltext(this);
		}
	}

	public final CltextContext cltext() throws RecognitionException {
		CltextContext _localctx = new CltextContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cltext);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				module();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				namedtext();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				text();
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

	public static class NamedtextContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(CLIFParser.OPEN, 0); }
		public InterpretablenameContext interpretablename() {
			return getRuleContext(InterpretablenameContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(CLIFParser.CLOSE, 0); }
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public NamedtextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedtext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).enterNamedtext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLIFListener ) ((CLIFListener)listener).exitNamedtext(this);
		}
	}

	public final NamedtextContext namedtext() throws RecognitionException {
		NamedtextContext _localctx = new NamedtextContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_namedtext);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(OPEN);
			setState(209);
			match(CL_TEXT);
			setState(210);
			interpretablename();
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(211);
				text();
				}
			}

			setState(214);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00db\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\5\58\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6F\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\5\tT\n"+
		"\t\3\n\3\n\5\nX\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13k\n\13\3\f\3\f\3\r\3\r\3\r\7\r"+
		"r\n\r\f\r\16\ru\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u0083\n\r\3\16\3\16\3\16\5\16\u0088\n\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\5\17\u0094\n\17\3\17\3\17\3\17\7\17\u0099\n\17"+
		"\f\17\16\17\u009c\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\7\21\u00ac\n\21\f\21\16\21\u00af\13\21\3\21\5"+
		"\21\u00b2\n\21\3\21\5\21\u00b5\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00c4\n\22\3\22\5\22\u00c7\n\22\3"+
		"\23\6\23\u00ca\n\23\r\23\16\23\u00cb\3\24\3\24\3\24\5\24\u00d1\n\24\3"+
		"\25\3\25\3\25\3\25\5\25\u00d7\n\25\3\25\3\25\3\25\2\2\26\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(\2\7\4\2\b\b\n\n\4\2\13\13\33\33\3\2\r\16"+
		"\3\2\17\20\3\2\21\22\2\u00e3\2.\3\2\2\2\4\61\3\2\2\2\6\63\3\2\2\2\b\67"+
		"\3\2\2\2\nE\3\2\2\2\fG\3\2\2\2\16I\3\2\2\2\20S\3\2\2\2\22W\3\2\2\2\24"+
		"j\3\2\2\2\26l\3\2\2\2\30\u0082\3\2\2\2\32\u0084\3\2\2\2\34\u008d\3\2\2"+
		"\2\36\u009f\3\2\2\2 \u00a5\3\2\2\2\"\u00c6\3\2\2\2$\u00c9\3\2\2\2&\u00d0"+
		"\3\2\2\2(\u00d2\3\2\2\2*-\5\n\6\2+-\7\t\2\2,*\3\2\2\2,+\3\2\2\2-\60\3"+
		"\2\2\2.,\3\2\2\2./\3\2\2\2/\3\3\2\2\2\60.\3\2\2\2\61\62\t\2\2\2\62\5\3"+
		"\2\2\2\63\64\t\3\2\2\64\7\3\2\2\2\658\5\4\3\2\668\5\6\4\2\67\65\3\2\2"+
		"\2\67\66\3\2\2\28\t\3\2\2\29F\5\b\5\2:;\7\3\2\2;<\5\f\7\2<=\5\2\2\2=>"+
		"\7\4\2\2>F\3\2\2\2?@\7\3\2\2@A\7\31\2\2AB\7\n\2\2BC\5\n\6\2CD\7\4\2\2"+
		"DF\3\2\2\2E9\3\2\2\2E:\3\2\2\2E?\3\2\2\2F\13\3\2\2\2GH\5\n\6\2H\r\3\2"+
		"\2\2IJ\7\3\2\2JK\7\f\2\2KL\5\n\6\2LM\5\n\6\2MN\7\4\2\2N\17\3\2\2\2OT\5"+
		"\22\n\2PT\5\30\r\2QT\5\32\16\2RT\5\36\20\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2"+
		"\2SR\3\2\2\2T\21\3\2\2\2UX\5\16\b\2VX\5\24\13\2WU\3\2\2\2WV\3\2\2\2X\23"+
		"\3\2\2\2YZ\7\3\2\2Z[\5\26\f\2[\\\5\2\2\2\\]\7\4\2\2]k\3\2\2\2^_\7\3\2"+
		"\2_`\5\n\6\2`a\7\3\2\2ab\7\24\2\2bc\7\3\2\2cd\5\b\5\2de\5\n\6\2ef\7\4"+
		"\2\2fg\3\2\2\2gh\7\4\2\2hi\7\4\2\2ik\3\2\2\2jY\3\2\2\2j^\3\2\2\2k\25\3"+
		"\2\2\2lm\5\n\6\2m\27\3\2\2\2no\7\3\2\2os\t\4\2\2pr\5\20\t\2qp\3\2\2\2"+
		"ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2v\u0083\7\4\2\2wx\7"+
		"\3\2\2xy\t\5\2\2yz\5\20\t\2z{\5\20\t\2{|\7\4\2\2|\u0083\3\2\2\2}~\7\3"+
		"\2\2~\177\7\23\2\2\177\u0080\5\20\t\2\u0080\u0081\7\4\2\2\u0081\u0083"+
		"\3\2\2\2\u0082n\3\2\2\2\u0082w\3\2\2\2\u0082}\3\2\2\2\u0083\31\3\2\2\2"+
		"\u0084\u0085\7\3\2\2\u0085\u0087\t\6\2\2\u0086\u0088\5\6\4\2\u0087\u0086"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\5\34\17\2"+
		"\u008a\u008b\5\20\t\2\u008b\u008c\7\4\2\2\u008c\33\3\2\2\2\u008d\u009a"+
		"\7\3\2\2\u008e\u0099\5\6\4\2\u008f\u0099\7\t\2\2\u0090\u0093\7\3\2\2\u0091"+
		"\u0094\5\6\4\2\u0092\u0094\7\t\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0096\5\n\6\2\u0096\u0097\7\4\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u008e\3\2\2\2\u0098\u008f\3\2\2\2\u0098\u0090\3\2"+
		"\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\4\2\2\u009e\35\3\2\2"+
		"\2\u009f\u00a0\7\3\2\2\u00a0\u00a1\7\31\2\2\u00a1\u00a2\7\13\2\2\u00a2"+
		"\u00a3\5\20\t\2\u00a3\u00a4\7\4\2\2\u00a4\37\3\2\2\2\u00a5\u00a6\7\3\2"+
		"\2\u00a6\u00a7\7\30\2\2\u00a7\u00b1\5\6\4\2\u00a8\u00a9\7\3\2\2\u00a9"+
		"\u00ad\7\27\2\2\u00aa\u00ac\5\b\5\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3"+
		"\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b2\7\4\2\2\u00b1\u00a8\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00b5\5&\24\2\u00b4\u00b3\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\4\2\2\u00b7!\3\2\2\2"+
		"\u00b8\u00c7\5\20\t\2\u00b9\u00c7\5 \21\2\u00ba\u00bb\7\3\2\2\u00bb\u00bc"+
		"\7\26\2\2\u00bc\u00bd\5\6\4\2\u00bd\u00be\7\4\2\2\u00be\u00c7\3\2\2\2"+
		"\u00bf\u00c0\7\3\2\2\u00c0\u00c1\7\31\2\2\u00c1\u00c3\7\13\2\2\u00c2\u00c4"+
		"\5&\24\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\u00c7\7\4\2\2\u00c6\u00b8\3\2\2\2\u00c6\u00b9\3\2\2\2\u00c6\u00ba\3\2"+
		"\2\2\u00c6\u00bf\3\2\2\2\u00c7#\3\2\2\2\u00c8\u00ca\5\"\22\2\u00c9\u00c8"+
		"\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"%\3\2\2\2\u00cd\u00d1\5 \21\2\u00ce\u00d1\5(\25\2\u00cf\u00d1\5$\23\2"+
		"\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\'\3"+
		"\2\2\2\u00d2\u00d3\7\3\2\2\u00d3\u00d4\7\25\2\2\u00d4\u00d6\5\6\4\2\u00d5"+
		"\u00d7\5$\23\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00d9\7\4\2\2\u00d9)\3\2\2\2\27,.\67ESWjs\u0082\u0087\u0093"+
		"\u0098\u009a\u00ad\u00b1\u00b4\u00c3\u00c6\u00cb\u00d0\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}