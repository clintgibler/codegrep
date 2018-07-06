// Generated from turtle-doc/turtle.g4 by ANTLR 4.7.1
package parsers.turtle-doc;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class turtleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PNameLn=2, LetterA=3, Dot=4, Coma=5, LParen=6, RParen=7, LEnd=8, 
		REnd=9, IriRef=10, PNameNs=11, BlankNodeLabel=12, Integer=13, Decimal=14, 
		Double=15, Exponent=16, StringLiteralQuote=17, StringLiteralSingleQuote=18, 
		StringLiteralLongSingleQuote=19, StringLiteralLongQuote=20, Uchar=21, 
		ECHAR=22, WS=23, ANON=24, PN_CHARS_BASE=25, PNCharsU=26, PN_CHARS=27, 
		PN_Prefix=28, PNLocal=29, PLX=30, PERCENT=31, HEX=32, PN_LOCAL_ESC=33, 
		Semi=34, TrueKeyword=35, FalseKeyword=36, PrefixKeyword=37, BaseKeyword=38, 
		AtPrefixKeyword=39, AtBaseKeyword=40, LangTag=41;
	public static final int
		RULE_turtleDoc = 0, RULE_statement = 1, RULE_directive = 2, RULE_prefixID = 3, 
		RULE_base = 4, RULE_sparqlBase = 5, RULE_sparqlPrefix = 6, RULE_triples = 7, 
		RULE_predicateObjectList = 8, RULE_objectList = 9, RULE_predicateObject = 10, 
		RULE_subject = 11, RULE_predicate = 12, RULE_object = 13, RULE_literal = 14, 
		RULE_blankNodePropertyList = 15, RULE_collection = 16, RULE_numericLiteral = 17, 
		RULE_rDFLiteral = 18, RULE_bool = 19, RULE_string = 20, RULE_iri = 21, 
		RULE_blankNode = 22;
	public static final String[] ruleNames = {
		"turtleDoc", "statement", "directive", "prefixID", "base", "sparqlBase", 
		"sparqlPrefix", "triples", "predicateObjectList", "objectList", "predicateObject", 
		"subject", "predicate", "object", "literal", "blankNodePropertyList", 
		"collection", "numericLiteral", "rDFLiteral", "bool", "string", "iri", 
		"blankNode"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'^^'", null, "'a'", "'.'", "','", "'('", "')'", "'['", "']'", null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "PNameLn", "LetterA", "Dot", "Coma", "LParen", "RParen", "LEnd", 
		"REnd", "IriRef", "PNameNs", "BlankNodeLabel", "Integer", "Decimal", "Double", 
		"Exponent", "StringLiteralQuote", "StringLiteralSingleQuote", "StringLiteralLongSingleQuote", 
		"StringLiteralLongQuote", "Uchar", "ECHAR", "WS", "ANON", "PN_CHARS_BASE", 
		"PNCharsU", "PN_CHARS", "PN_Prefix", "PNLocal", "PLX", "PERCENT", "HEX", 
		"PN_LOCAL_ESC", "Semi", "TrueKeyword", "FalseKeyword", "PrefixKeyword", 
		"BaseKeyword", "AtPrefixKeyword", "AtBaseKeyword", "LangTag"
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
	public String getGrammarFileName() { return "turtle.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public turtleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TurtleDocContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TurtleDocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turtleDoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterTurtleDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitTurtleDoc(this);
		}
	}

	public final TurtleDocContext turtleDoc() throws RecognitionException {
		TurtleDocContext _localctx = new TurtleDocContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_turtleDoc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PNameLn) | (1L << LParen) | (1L << LEnd) | (1L << IriRef) | (1L << PNameNs) | (1L << BlankNodeLabel) | (1L << ANON) | (1L << PrefixKeyword) | (1L << BaseKeyword) | (1L << AtPrefixKeyword) | (1L << AtBaseKeyword))) != 0)) {
				{
				{
				setState(46);
				statement();
				}
				}
				setState(51);
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

	public static class StatementContext extends ParserRuleContext {
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public TriplesContext triples() {
			return getRuleContext(TriplesContext.class,0);
		}
		public TerminalNode Dot() { return getToken(turtleParser.Dot, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PrefixKeyword:
			case BaseKeyword:
			case AtPrefixKeyword:
			case AtBaseKeyword:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				directive();
				}
				break;
			case PNameLn:
			case LParen:
			case LEnd:
			case IriRef:
			case PNameNs:
			case BlankNodeLabel:
			case ANON:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				triples();
				setState(54);
				match(Dot);
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

	public static class DirectiveContext extends ParserRuleContext {
		public PrefixIDContext prefixID() {
			return getRuleContext(PrefixIDContext.class,0);
		}
		public BaseContext base() {
			return getRuleContext(BaseContext.class,0);
		}
		public SparqlPrefixContext sparqlPrefix() {
			return getRuleContext(SparqlPrefixContext.class,0);
		}
		public SparqlBaseContext sparqlBase() {
			return getRuleContext(SparqlBaseContext.class,0);
		}
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitDirective(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_directive);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AtPrefixKeyword:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				prefixID();
				}
				break;
			case AtBaseKeyword:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				base();
				}
				break;
			case PrefixKeyword:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				sparqlPrefix();
				}
				break;
			case BaseKeyword:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				sparqlBase();
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

	public static class PrefixIDContext extends ParserRuleContext {
		public TerminalNode AtPrefixKeyword() { return getToken(turtleParser.AtPrefixKeyword, 0); }
		public TerminalNode PNameNs() { return getToken(turtleParser.PNameNs, 0); }
		public TerminalNode IriRef() { return getToken(turtleParser.IriRef, 0); }
		public TerminalNode Dot() { return getToken(turtleParser.Dot, 0); }
		public PrefixIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterPrefixID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitPrefixID(this);
		}
	}

	public final PrefixIDContext prefixID() throws RecognitionException {
		PrefixIDContext _localctx = new PrefixIDContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prefixID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(AtPrefixKeyword);
			setState(65);
			match(PNameNs);
			setState(66);
			match(IriRef);
			setState(67);
			match(Dot);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseContext extends ParserRuleContext {
		public TerminalNode AtBaseKeyword() { return getToken(turtleParser.AtBaseKeyword, 0); }
		public TerminalNode IriRef() { return getToken(turtleParser.IriRef, 0); }
		public TerminalNode Dot() { return getToken(turtleParser.Dot, 0); }
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitBase(this);
		}
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(AtBaseKeyword);
			setState(70);
			match(IriRef);
			setState(71);
			match(Dot);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SparqlBaseContext extends ParserRuleContext {
		public TerminalNode BaseKeyword() { return getToken(turtleParser.BaseKeyword, 0); }
		public TerminalNode IriRef() { return getToken(turtleParser.IriRef, 0); }
		public SparqlBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sparqlBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterSparqlBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitSparqlBase(this);
		}
	}

	public final SparqlBaseContext sparqlBase() throws RecognitionException {
		SparqlBaseContext _localctx = new SparqlBaseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sparqlBase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(BaseKeyword);
			setState(74);
			match(IriRef);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SparqlPrefixContext extends ParserRuleContext {
		public TerminalNode PrefixKeyword() { return getToken(turtleParser.PrefixKeyword, 0); }
		public TerminalNode PNameNs() { return getToken(turtleParser.PNameNs, 0); }
		public TerminalNode IriRef() { return getToken(turtleParser.IriRef, 0); }
		public SparqlPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sparqlPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterSparqlPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitSparqlPrefix(this);
		}
	}

	public final SparqlPrefixContext sparqlPrefix() throws RecognitionException {
		SparqlPrefixContext _localctx = new SparqlPrefixContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sparqlPrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(PrefixKeyword);
			setState(77);
			match(PNameNs);
			setState(78);
			match(IriRef);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TriplesContext extends ParserRuleContext {
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public PredicateObjectListContext predicateObjectList() {
			return getRuleContext(PredicateObjectListContext.class,0);
		}
		public BlankNodePropertyListContext blankNodePropertyList() {
			return getRuleContext(BlankNodePropertyListContext.class,0);
		}
		public TriplesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triples; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterTriples(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitTriples(this);
		}
	}

	public final TriplesContext triples() throws RecognitionException {
		TriplesContext _localctx = new TriplesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_triples);
		int _la;
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PNameLn:
			case LParen:
			case IriRef:
			case PNameNs:
			case BlankNodeLabel:
			case ANON:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				subject();
				setState(81);
				predicateObjectList();
				}
				break;
			case LEnd:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				blankNodePropertyList();
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PNameLn) | (1L << LetterA) | (1L << IriRef) | (1L << PNameNs))) != 0)) {
					{
					setState(84);
					predicateObjectList();
					}
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

	public static class PredicateObjectListContext extends ParserRuleContext {
		public List<PredicateObjectContext> predicateObject() {
			return getRuleContexts(PredicateObjectContext.class);
		}
		public PredicateObjectContext predicateObject(int i) {
			return getRuleContext(PredicateObjectContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(turtleParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(turtleParser.Semi, i);
		}
		public PredicateObjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateObjectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterPredicateObjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitPredicateObjectList(this);
		}
	}

	public final PredicateObjectListContext predicateObjectList() throws RecognitionException {
		PredicateObjectListContext _localctx = new PredicateObjectListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_predicateObjectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			predicateObject();
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Semi) {
				{
				{
				setState(90);
				match(Semi);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PNameLn) | (1L << LetterA) | (1L << IriRef) | (1L << PNameNs))) != 0)) {
					{
					setState(91);
					predicateObject();
					}
				}

				}
				}
				setState(98);
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

	public static class ObjectListContext extends ParserRuleContext {
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public List<TerminalNode> Coma() { return getTokens(turtleParser.Coma); }
		public TerminalNode Coma(int i) {
			return getToken(turtleParser.Coma, i);
		}
		public ObjectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterObjectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitObjectList(this);
		}
	}

	public final ObjectListContext objectList() throws RecognitionException {
		ObjectListContext _localctx = new ObjectListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_objectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			object();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Coma) {
				{
				{
				setState(100);
				match(Coma);
				setState(101);
				object();
				}
				}
				setState(106);
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

	public static class PredicateObjectContext extends ParserRuleContext {
		public ObjectListContext objectList() {
			return getRuleContext(ObjectListContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode LetterA() { return getToken(turtleParser.LetterA, 0); }
		public PredicateObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterPredicateObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitPredicateObject(this);
		}
	}

	public final PredicateObjectContext predicateObject() throws RecognitionException {
		PredicateObjectContext _localctx = new PredicateObjectContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_predicateObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PNameLn:
			case IriRef:
			case PNameNs:
				{
				setState(107);
				predicate();
				}
				break;
			case LetterA:
				{
				setState(108);
				match(LetterA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(111);
			objectList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubjectContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public BlankNodeContext blankNode() {
			return getRuleContext(BlankNodeContext.class,0);
		}
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitSubject(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_subject);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PNameLn:
			case IriRef:
			case PNameNs:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				iri();
				}
				break;
			case BlankNodeLabel:
			case ANON:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				blankNode();
				}
				break;
			case LParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(115);
				collection();
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

	public static class PredicateContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			iri();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public BlankNodeContext blankNode() {
			return getRuleContext(BlankNodeContext.class,0);
		}
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public BlankNodePropertyListContext blankNodePropertyList() {
			return getRuleContext(BlankNodePropertyListContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_object);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PNameLn:
			case IriRef:
			case PNameNs:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				iri();
				}
				break;
			case BlankNodeLabel:
			case ANON:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				blankNode();
				}
				break;
			case LParen:
				enterOuterAlt(_localctx, 3);
				{
				setState(122);
				collection();
				}
				break;
			case LEnd:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				blankNodePropertyList();
				}
				break;
			case Integer:
			case Decimal:
			case Double:
			case StringLiteralQuote:
			case StringLiteralSingleQuote:
			case StringLiteralLongSingleQuote:
			case StringLiteralLongQuote:
			case TrueKeyword:
			case FalseKeyword:
				enterOuterAlt(_localctx, 5);
				{
				setState(124);
				literal();
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

	public static class LiteralContext extends ParserRuleContext {
		public RDFLiteralContext rDFLiteral() {
			return getRuleContext(RDFLiteralContext.class,0);
		}
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_literal);
		try {
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringLiteralQuote:
			case StringLiteralSingleQuote:
			case StringLiteralLongSingleQuote:
			case StringLiteralLongQuote:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				rDFLiteral();
				}
				break;
			case Integer:
			case Decimal:
			case Double:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				numericLiteral();
				}
				break;
			case TrueKeyword:
			case FalseKeyword:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				bool();
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

	public static class BlankNodePropertyListContext extends ParserRuleContext {
		public TerminalNode LEnd() { return getToken(turtleParser.LEnd, 0); }
		public PredicateObjectListContext predicateObjectList() {
			return getRuleContext(PredicateObjectListContext.class,0);
		}
		public TerminalNode REnd() { return getToken(turtleParser.REnd, 0); }
		public BlankNodePropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankNodePropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterBlankNodePropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitBlankNodePropertyList(this);
		}
	}

	public final BlankNodePropertyListContext blankNodePropertyList() throws RecognitionException {
		BlankNodePropertyListContext _localctx = new BlankNodePropertyListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_blankNodePropertyList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(LEnd);
			setState(133);
			predicateObjectList();
			setState(134);
			match(REnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionContext extends ParserRuleContext {
		public TerminalNode LParen() { return getToken(turtleParser.LParen, 0); }
		public TerminalNode RParen() { return getToken(turtleParser.RParen, 0); }
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitCollection(this);
		}
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(LParen);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PNameLn) | (1L << LParen) | (1L << LEnd) | (1L << IriRef) | (1L << PNameNs) | (1L << BlankNodeLabel) | (1L << Integer) | (1L << Decimal) | (1L << Double) | (1L << StringLiteralQuote) | (1L << StringLiteralSingleQuote) | (1L << StringLiteralLongSingleQuote) | (1L << StringLiteralLongQuote) | (1L << ANON) | (1L << TrueKeyword) | (1L << FalseKeyword))) != 0)) {
				{
				{
				setState(137);
				object();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(RParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(turtleParser.Integer, 0); }
		public TerminalNode Decimal() { return getToken(turtleParser.Decimal, 0); }
		public TerminalNode Double() { return getToken(turtleParser.Double, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Integer) | (1L << Decimal) | (1L << Double))) != 0)) ) {
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

	public static class RDFLiteralContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode LangTag() { return getToken(turtleParser.LangTag, 0); }
		public IriContext iri() {
			return getRuleContext(IriContext.class,0);
		}
		public RDFLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rDFLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterRDFLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitRDFLiteral(this);
		}
	}

	public final RDFLiteralContext rDFLiteral() throws RecognitionException {
		RDFLiteralContext _localctx = new RDFLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_rDFLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			string();
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LangTag:
				{
				setState(148);
				match(LangTag);
				}
				break;
			case T__0:
				{
				{
				setState(149);
				match(T__0);
				setState(150);
				iri();
				}
				}
				break;
			case PNameLn:
			case Dot:
			case Coma:
			case LParen:
			case RParen:
			case LEnd:
			case REnd:
			case IriRef:
			case PNameNs:
			case BlankNodeLabel:
			case Integer:
			case Decimal:
			case Double:
			case StringLiteralQuote:
			case StringLiteralSingleQuote:
			case StringLiteralLongSingleQuote:
			case StringLiteralLongQuote:
			case ANON:
			case Semi:
			case TrueKeyword:
			case FalseKeyword:
				break;
			default:
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TrueKeyword() { return getToken(turtleParser.TrueKeyword, 0); }
		public TerminalNode FalseKeyword() { return getToken(turtleParser.FalseKeyword, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !(_la==TrueKeyword || _la==FalseKeyword) ) {
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode StringLiteralQuote() { return getToken(turtleParser.StringLiteralQuote, 0); }
		public TerminalNode StringLiteralSingleQuote() { return getToken(turtleParser.StringLiteralSingleQuote, 0); }
		public TerminalNode StringLiteralLongSingleQuote() { return getToken(turtleParser.StringLiteralLongSingleQuote, 0); }
		public TerminalNode StringLiteralLongQuote() { return getToken(turtleParser.StringLiteralLongQuote, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << StringLiteralQuote) | (1L << StringLiteralSingleQuote) | (1L << StringLiteralLongSingleQuote) | (1L << StringLiteralLongQuote))) != 0)) ) {
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

	public static class IriContext extends ParserRuleContext {
		public TerminalNode IriRef() { return getToken(turtleParser.IriRef, 0); }
		public TerminalNode PNameLn() { return getToken(turtleParser.PNameLn, 0); }
		public TerminalNode PNameNs() { return getToken(turtleParser.PNameNs, 0); }
		public IriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterIri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitIri(this);
		}
	}

	public final IriContext iri() throws RecognitionException {
		IriContext _localctx = new IriContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_iri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PNameLn) | (1L << IriRef) | (1L << PNameNs))) != 0)) ) {
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

	public static class BlankNodeContext extends ParserRuleContext {
		public TerminalNode BlankNodeLabel() { return getToken(turtleParser.BlankNodeLabel, 0); }
		public TerminalNode ANON() { return getToken(turtleParser.ANON, 0); }
		public BlankNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blankNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).enterBlankNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof turtleListener ) ((turtleListener)listener).exitBlankNode(this);
		}
	}

	public final BlankNodeContext blankNode() throws RecognitionException {
		BlankNodeContext _localctx = new BlankNodeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_blankNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==BlankNodeLabel || _la==ANON) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00a4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\5\4A\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\5\tX\n\t\5\tZ\n\t\3\n\3\n\3\n\5\n_\n\n\7\na\n\n\f\n\16"+
		"\nd\13\n\3\13\3\13\3\13\7\13i\n\13\f\13\16\13l\13\13\3\f\3\f\5\fp\n\f"+
		"\3\f\3\f\3\r\3\r\3\r\5\rw\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u0080\n\17\3\20\3\20\3\20\5\20\u0085\n\20\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\7\22\u008d\n\22\f\22\16\22\u0090\13\22\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\5\24\u009a\n\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\7\3\2\17"+
		"\21\3\2%&\3\2\23\26\4\2\4\4\f\r\4\2\16\16\32\32\2\u00a2\2\63\3\2\2\2\4"+
		":\3\2\2\2\6@\3\2\2\2\bB\3\2\2\2\nG\3\2\2\2\fK\3\2\2\2\16N\3\2\2\2\20Y"+
		"\3\2\2\2\22[\3\2\2\2\24e\3\2\2\2\26o\3\2\2\2\30v\3\2\2\2\32x\3\2\2\2\34"+
		"\177\3\2\2\2\36\u0084\3\2\2\2 \u0086\3\2\2\2\"\u008a\3\2\2\2$\u0093\3"+
		"\2\2\2&\u0095\3\2\2\2(\u009b\3\2\2\2*\u009d\3\2\2\2,\u009f\3\2\2\2.\u00a1"+
		"\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64"+
		"\3\2\2\2\64\3\3\2\2\2\65\63\3\2\2\2\66;\5\6\4\2\678\5\20\t\289\7\6\2\2"+
		"9;\3\2\2\2:\66\3\2\2\2:\67\3\2\2\2;\5\3\2\2\2<A\5\b\5\2=A\5\n\6\2>A\5"+
		"\16\b\2?A\5\f\7\2@<\3\2\2\2@=\3\2\2\2@>\3\2\2\2@?\3\2\2\2A\7\3\2\2\2B"+
		"C\7)\2\2CD\7\r\2\2DE\7\f\2\2EF\7\6\2\2F\t\3\2\2\2GH\7*\2\2HI\7\f\2\2I"+
		"J\7\6\2\2J\13\3\2\2\2KL\7(\2\2LM\7\f\2\2M\r\3\2\2\2NO\7\'\2\2OP\7\r\2"+
		"\2PQ\7\f\2\2Q\17\3\2\2\2RS\5\30\r\2ST\5\22\n\2TZ\3\2\2\2UW\5 \21\2VX\5"+
		"\22\n\2WV\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YR\3\2\2\2YU\3\2\2\2Z\21\3\2\2\2"+
		"[b\5\26\f\2\\^\7$\2\2]_\5\26\f\2^]\3\2\2\2^_\3\2\2\2_a\3\2\2\2`\\\3\2"+
		"\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\23\3\2\2\2db\3\2\2\2ej\5\34\17\2f"+
		"g\7\7\2\2gi\5\34\17\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\25\3\2"+
		"\2\2lj\3\2\2\2mp\5\32\16\2np\7\5\2\2om\3\2\2\2on\3\2\2\2pq\3\2\2\2qr\5"+
		"\24\13\2r\27\3\2\2\2sw\5,\27\2tw\5.\30\2uw\5\"\22\2vs\3\2\2\2vt\3\2\2"+
		"\2vu\3\2\2\2w\31\3\2\2\2xy\5,\27\2y\33\3\2\2\2z\u0080\5,\27\2{\u0080\5"+
		".\30\2|\u0080\5\"\22\2}\u0080\5 \21\2~\u0080\5\36\20\2\177z\3\2\2\2\177"+
		"{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\35\3\2\2\2\u0081"+
		"\u0085\5&\24\2\u0082\u0085\5$\23\2\u0083\u0085\5(\25\2\u0084\u0081\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\37\3\2\2\2\u0086\u0087"+
		"\7\n\2\2\u0087\u0088\5\22\n\2\u0088\u0089\7\13\2\2\u0089!\3\2\2\2\u008a"+
		"\u008e\7\b\2\2\u008b\u008d\5\34\17\2\u008c\u008b\3\2\2\2\u008d\u0090\3"+
		"\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0092\7\t\2\2\u0092#\3\2\2\2\u0093\u0094\t\2\2\2"+
		"\u0094%\3\2\2\2\u0095\u0099\5*\26\2\u0096\u009a\7+\2\2\u0097\u0098\7\3"+
		"\2\2\u0098\u009a\5,\27\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\'\3\2\2\2\u009b\u009c\t\3\2\2\u009c)\3\2\2\2\u009d"+
		"\u009e\t\4\2\2\u009e+\3\2\2\2\u009f\u00a0\t\5\2\2\u00a0-\3\2\2\2\u00a1"+
		"\u00a2\t\6\2\2\u00a2/\3\2\2\2\20\63:@WY^bjov\177\u0084\u008e\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}