// Generated from atl/ATL.g4 by ANTLR 4.7.1
package parsers.atl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ATLParser extends Parser {
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
		STRING=81, INTEGER=82, FLOAT=83, IDENTIFIER=84, WS=85, COMMENT=86, LINE_COMMENT=87;
	public static final int
		RULE_unit = 0, RULE_module = 1, RULE_targetModelPattern = 2, RULE_sourceModelPattern = 3, 
		RULE_transformationMode = 4, RULE_library = 5, RULE_query = 6, RULE_libraryRef = 7, 
		RULE_moduleElement = 8, RULE_helper = 9, RULE_oclFeatureDefinition = 10, 
		RULE_oclContextDefinition = 11, RULE_oclFeature = 12, RULE_operation = 13, 
		RULE_parameter = 14, RULE_attribute = 15, RULE_arule = 16, RULE_matchedRule = 17, 
		RULE_lazyMatchedRule = 18, RULE_ruleVariableDeclaration = 19, RULE_calledRule = 20, 
		RULE_inPattern = 21, RULE_inPatternElement = 22, RULE_simpleInPatternElement = 23, 
		RULE_outPattern = 24, RULE_outPatternElement = 25, RULE_simpleOutPatternElement = 26, 
		RULE_forEachOutPatternElement = 27, RULE_binding = 28, RULE_actionBlock = 29, 
		RULE_statement = 30, RULE_bindingStat = 31, RULE_expressionStat = 32, 
		RULE_ifStat = 33, RULE_forStat = 34, RULE_oclModel = 35, RULE_oclModelElement = 36, 
		RULE_oclExpression = 37, RULE_iteratorExp = 38, RULE_iterateExp = 39, 
		RULE_collectionOperationCallExp = 40, RULE_operationCallExp = 41, RULE_navigationOrAttributeCallExp = 42, 
		RULE_iterator = 43, RULE_oclUndefinedExp = 44, RULE_primitiveExp = 45, 
		RULE_numericExp = 46, RULE_booleanExp = 47, RULE_integerExp = 48, RULE_realExp = 49, 
		RULE_stringExp = 50, RULE_ifExp = 51, RULE_variableExp = 52, RULE_superExp = 53, 
		RULE_letExp = 54, RULE_variableDeclaration = 55, RULE_enumLiteralExp = 56, 
		RULE_collectionExp = 57, RULE_bagExp = 58, RULE_setExp = 59, RULE_orderedSetExp = 60, 
		RULE_sequenceExp = 61, RULE_mapExp = 62, RULE_mapElement = 63, RULE_tupleExp = 64, 
		RULE_tuplePart = 65, RULE_oclType = 66, RULE_oclAnyType = 67, RULE_tupleType = 68, 
		RULE_tupleTypeAttribute = 69, RULE_mapType = 70, RULE_primitive = 71, 
		RULE_numericType = 72, RULE_integerType = 73, RULE_realType = 74, RULE_booleanType = 75, 
		RULE_stringType = 76, RULE_collectionType = 77, RULE_bagType = 78, RULE_setType = 79, 
		RULE_orderedSetType = 80, RULE_sequenceType = 81, RULE_priority_0 = 82, 
		RULE_priority_1 = 83, RULE_priority_2 = 84, RULE_priority_3 = 85, RULE_priority_4 = 86, 
		RULE_priority_5 = 87, RULE_matchedRule_abstractContents = 88, RULE_oclType_abstractContents = 89, 
		RULE_oclAnyType_abstractContents = 90, RULE_collectionType_abstractContents = 91, 
		RULE_primary_oclExpression = 92;
	public static final String[] ruleNames = {
		"unit", "module", "targetModelPattern", "sourceModelPattern", "transformationMode", 
		"library", "query", "libraryRef", "moduleElement", "helper", "oclFeatureDefinition", 
		"oclContextDefinition", "oclFeature", "operation", "parameter", "attribute", 
		"arule", "matchedRule", "lazyMatchedRule", "ruleVariableDeclaration", 
		"calledRule", "inPattern", "inPatternElement", "simpleInPatternElement", 
		"outPattern", "outPatternElement", "simpleOutPatternElement", "forEachOutPatternElement", 
		"binding", "actionBlock", "statement", "bindingStat", "expressionStat", 
		"ifStat", "forStat", "oclModel", "oclModelElement", "oclExpression", "iteratorExp", 
		"iterateExp", "collectionOperationCallExp", "operationCallExp", "navigationOrAttributeCallExp", 
		"iterator", "oclUndefinedExp", "primitiveExp", "numericExp", "booleanExp", 
		"integerExp", "realExp", "stringExp", "ifExp", "variableExp", "superExp", 
		"letExp", "variableDeclaration", "enumLiteralExp", "collectionExp", "bagExp", 
		"setExp", "orderedSetExp", "sequenceExp", "mapExp", "mapElement", "tupleExp", 
		"tuplePart", "oclType", "oclAnyType", "tupleType", "tupleTypeAttribute", 
		"mapType", "primitive", "numericType", "integerType", "realType", "booleanType", 
		"stringType", "collectionType", "bagType", "setType", "orderedSetType", 
		"sequenceType", "priority_0", "priority_1", "priority_2", "priority_3", 
		"priority_4", "priority_5", "matchedRule_abstractContents", "oclType_abstractContents", 
		"oclAnyType_abstractContents", "collectionType_abstractContents", "primary_oclExpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'module'", "';'", "'create'", "','", "'refining'", "'from'", "'library'", 
		"'query'", "'='", "'uses'", "'helper'", "'def'", "':'", "'context'", "'('", 
		"')'", "'unique'", "'lazy'", "'abstract'", "'rule'", "'extends'", "'{'", 
		"'using'", "'}'", "'entrypoint'", "'endpoint'", "'in'", "'to'", "'mapsTo'", 
		"'distinct'", "'foreach'", "'<-'", "'do'", "'if'", "'else'", "'for'", 
		"'!'", "'|'", "'iterate'", "'OclUndefined'", "'true'", "'false'", "'then'", 
		"'endif'", "'super'", "'let'", "'#'", "'Bag'", "'Set'", "'OrderedSet'", 
		"'Sequence'", "'Map'", "'Tuple'", "'TupleType'", "'Integer'", "'Real'", 
		"'Boolean'", "'String'", "'.'", "'->'", "'not'", "'-'", "'*'", "'/'", 
		"'div'", "'mod'", "'+'", "'>'", "'<'", "'>='", "'<='", "'<>'", "'and'", 
		"'or'", "'xor'", "'implies'", "'nodefault'", "'OclType'", "'OclAny'", 
		"'Collection'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "STRING", "INTEGER", 
		"FLOAT", "IDENTIFIER", "WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "ATL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ATLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class UnitContext extends ParserRuleContext {
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public LibraryContext library() {
			return getRuleContext(LibraryContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitUnit(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_unit);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				module();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				library();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				query();
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

	public static class ModuleContext extends ParserRuleContext {
		public TargetModelPatternContext targetModelPattern() {
			return getRuleContext(TargetModelPatternContext.class,0);
		}
		public TransformationModeContext transformationMode() {
			return getRuleContext(TransformationModeContext.class,0);
		}
		public SourceModelPatternContext sourceModelPattern() {
			return getRuleContext(SourceModelPatternContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ATLParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ATLParser.IDENTIFIER, 0); }
		public List<LibraryRefContext> libraryRef() {
			return getRuleContexts(LibraryRefContext.class);
		}
		public LibraryRefContext libraryRef(int i) {
			return getRuleContext(LibraryRefContext.class,i);
		}
		public List<ModuleElementContext> moduleElement() {
			return getRuleContexts(ModuleElementContext.class);
		}
		public ModuleElementContext moduleElement(int i) {
			return getRuleContext(ModuleElementContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitModule(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(T__0);
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(193);
			match(T__1);
			setState(194);
			match(T__2);
			setState(195);
			targetModelPattern();
			setState(196);
			transformationMode();
			setState(197);
			sourceModelPattern();
			setState(198);
			match(T__1);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(199);
				libraryRef();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__10) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__24) | (1L << T__25))) != 0) || _la==T__76) {
				{
				{
				setState(205);
				moduleElement();
				}
				}
				setState(210);
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

	public static class TargetModelPatternContext extends ParserRuleContext {
		public List<OclModelContext> oclModel() {
			return getRuleContexts(OclModelContext.class);
		}
		public OclModelContext oclModel(int i) {
			return getRuleContext(OclModelContext.class,i);
		}
		public TargetModelPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetModelPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterTargetModelPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitTargetModelPattern(this);
		}
	}

	public final TargetModelPatternContext targetModelPattern() throws RecognitionException {
		TargetModelPatternContext _localctx = new TargetModelPatternContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_targetModelPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			oclModel();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(212);
				match(T__3);
				setState(213);
				oclModel();
				}
				}
				setState(218);
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

	public static class SourceModelPatternContext extends ParserRuleContext {
		public List<OclModelContext> oclModel() {
			return getRuleContexts(OclModelContext.class);
		}
		public OclModelContext oclModel(int i) {
			return getRuleContext(OclModelContext.class,i);
		}
		public SourceModelPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceModelPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterSourceModelPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitSourceModelPattern(this);
		}
	}

	public final SourceModelPatternContext sourceModelPattern() throws RecognitionException {
		SourceModelPatternContext _localctx = new SourceModelPatternContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sourceModelPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			oclModel();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(220);
				match(T__3);
				setState(221);
				oclModel();
				}
				}
				setState(226);
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

	public static class TransformationModeContext extends ParserRuleContext {
		public TransformationModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformationMode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterTransformationMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitTransformationMode(this);
		}
	}

	public final TransformationModeContext transformationMode() throws RecognitionException {
		TransformationModeContext _localctx = new TransformationModeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_transformationMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !(_la==T__4 || _la==T__5) ) {
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

	public static class LibraryContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ATLParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ATLParser.IDENTIFIER, 0); }
		public List<LibraryRefContext> libraryRef() {
			return getRuleContexts(LibraryRefContext.class);
		}
		public LibraryRefContext libraryRef(int i) {
			return getRuleContext(LibraryRefContext.class,i);
		}
		public List<HelperContext> helper() {
			return getRuleContexts(HelperContext.class);
		}
		public HelperContext helper(int i) {
			return getRuleContext(HelperContext.class,i);
		}
		public LibraryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_library; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterLibrary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitLibrary(this);
		}
	}

	public final LibraryContext library() throws RecognitionException {
		LibraryContext _localctx = new LibraryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_library);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(T__6);
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(231);
			match(T__1);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(232);
				libraryRef();
				}
				}
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(238);
				helper();
				}
				}
				setState(243);
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

	public static class QueryContext extends ParserRuleContext {
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ATLParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ATLParser.IDENTIFIER, 0); }
		public List<LibraryRefContext> libraryRef() {
			return getRuleContexts(LibraryRefContext.class);
		}
		public LibraryRefContext libraryRef(int i) {
			return getRuleContext(LibraryRefContext.class,i);
		}
		public List<HelperContext> helper() {
			return getRuleContexts(HelperContext.class);
		}
		public HelperContext helper(int i) {
			return getRuleContext(HelperContext.class,i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__7);
			setState(245);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(246);
			match(T__8);
			setState(247);
			oclExpression();
			setState(248);
			match(T__1);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(249);
				libraryRef();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(255);
				helper();
				}
				}
				setState(260);
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

	public static class LibraryRefContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ATLParser.STRING, 0); }
		public LibraryRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_libraryRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterLibraryRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitLibraryRef(this);
		}
	}

	public final LibraryRefContext libraryRef() throws RecognitionException {
		LibraryRefContext _localctx = new LibraryRefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_libraryRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(T__9);
			setState(262);
			match(STRING);
			setState(263);
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

	public static class ModuleElementContext extends ParserRuleContext {
		public HelperContext helper() {
			return getRuleContext(HelperContext.class,0);
		}
		public AruleContext arule() {
			return getRuleContext(AruleContext.class,0);
		}
		public ModuleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterModuleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitModuleElement(this);
		}
	}

	public final ModuleElementContext moduleElement() throws RecognitionException {
		ModuleElementContext _localctx = new ModuleElementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_moduleElement);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				helper();
				}
				break;
			case T__4:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__24:
			case T__25:
			case T__76:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				arule();
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

	public static class HelperContext extends ParserRuleContext {
		public OclFeatureDefinitionContext oclFeatureDefinition() {
			return getRuleContext(OclFeatureDefinitionContext.class,0);
		}
		public HelperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_helper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterHelper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitHelper(this);
		}
	}

	public final HelperContext helper() throws RecognitionException {
		HelperContext _localctx = new HelperContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_helper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(T__10);
			setState(270);
			oclFeatureDefinition();
			setState(271);
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

	public static class OclFeatureDefinitionContext extends ParserRuleContext {
		public OclFeatureContext oclFeature() {
			return getRuleContext(OclFeatureContext.class,0);
		}
		public OclContextDefinitionContext oclContextDefinition() {
			return getRuleContext(OclContextDefinitionContext.class,0);
		}
		public OclFeatureDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclFeatureDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterOclFeatureDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitOclFeatureDefinition(this);
		}
	}

	public final OclFeatureDefinitionContext oclFeatureDefinition() throws RecognitionException {
		OclFeatureDefinitionContext _localctx = new OclFeatureDefinitionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_oclFeatureDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(273);
				oclContextDefinition();
				}
			}

			setState(276);
			match(T__11);
			setState(277);
			match(T__12);
			setState(278);
			oclFeature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OclContextDefinitionContext extends ParserRuleContext {
		public OclTypeContext oclType() {
			return getRuleContext(OclTypeContext.class,0);
		}
		public OclContextDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclContextDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterOclContextDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitOclContextDefinition(this);
		}
	}

	public final OclContextDefinitionContext oclContextDefinition() throws RecognitionException {
		OclContextDefinitionContext _localctx = new OclContextDefinitionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_oclContextDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(T__13);
			setState(281);
			oclType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OclFeatureContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public OclFeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclFeature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterOclFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitOclFeature(this);
		}
	}

	public final OclFeatureContext oclFeature() throws RecognitionException {
		OclFeatureContext _localctx = new OclFeatureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_oclFeature);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				operation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				attribute();
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

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ATLParser.IDENTIFIER, 0); }
		public OclTypeContext oclType() {
			return getRuleContext(OclTypeContext.class,0);
		}
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitOperation(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(IDENTIFIER);
			setState(288);
			match(T__14);
			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(289);
				parameter();
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(290);
					match(T__3);
					setState(291);
					parameter();
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(299);
			match(T__15);
			setState(300);
			match(T__12);
			setState(301);
			oclType();
			setState(302);
			match(T__8);
			setState(303);
			oclExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ATLParser.IDENTIFIER, 0); }
		public OclTypeContext oclType() {
			return getRuleContext(OclTypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(IDENTIFIER);
			setState(306);
			match(T__12);
			setState(307);
			oclType();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IDENTIFIER() { return getToken(ATLParser.IDENTIFIER, 0); }
		public OclTypeContext oclType() {
			return getRuleContext(OclTypeContext.class,0);
		}
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(IDENTIFIER);
			setState(310);
			match(T__12);
			setState(311);
			oclType();
			setState(312);
			match(T__8);
			setState(313);
			oclExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AruleContext extends ParserRuleContext {
		public CalledRuleContext calledRule() {
			return getRuleContext(CalledRuleContext.class,0);
		}
		public MatchedRuleContext matchedRule() {
			return getRuleContext(MatchedRuleContext.class,0);
		}
		public AruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterArule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitArule(this);
		}
	}

	public final AruleContext arule() throws RecognitionException {
		AruleContext _localctx = new AruleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arule);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				calledRule();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(316);
				matchedRule();
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

	public static class MatchedRuleContext extends ParserRuleContext {
		public LazyMatchedRuleContext lazyMatchedRule() {
			return getRuleContext(LazyMatchedRuleContext.class,0);
		}
		public MatchedRule_abstractContentsContext matchedRule_abstractContents() {
			return getRuleContext(MatchedRule_abstractContentsContext.class,0);
		}
		public MatchedRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterMatchedRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitMatchedRule(this);
		}
	}

	public final MatchedRuleContext matchedRule() throws RecognitionException {
		MatchedRuleContext _localctx = new MatchedRuleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_matchedRule);
		try {
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				lazyMatchedRule();
				}
				break;
			case T__4:
			case T__18:
			case T__19:
			case T__76:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				matchedRule_abstractContents();
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

	public static class LazyMatchedRuleContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ATLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ATLParser.IDENTIFIER, i);
		}
		public InPatternContext inPattern() {
			return getRuleContext(InPatternContext.class,0);
		}
		public OutPatternContext outPattern() {
			return getRuleContext(OutPatternContext.class,0);
		}
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public List<RuleVariableDeclarationContext> ruleVariableDeclaration() {
			return getRuleContexts(RuleVariableDeclarationContext.class);
		}
		public RuleVariableDeclarationContext ruleVariableDeclaration(int i) {
			return getRuleContext(RuleVariableDeclarationContext.class,i);
		}
		public LazyMatchedRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lazyMatchedRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterLazyMatchedRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitLazyMatchedRule(this);
		}
	}

	public final LazyMatchedRuleContext lazyMatchedRule() throws RecognitionException {
		LazyMatchedRuleContext _localctx = new LazyMatchedRuleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lazyMatchedRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(323);
				match(T__16);
				}
			}

			setState(326);
			match(T__17);
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(327);
				match(T__18);
				}
			}

			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(330);
				match(T__4);
				}
			}

			setState(333);
			match(T__19);
			setState(334);
			match(IDENTIFIER);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(335);
				match(T__20);
				setState(336);
				match(IDENTIFIER);
				}
			}

			setState(339);
			match(T__21);
			setState(340);
			inPattern();
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(341);
				match(T__22);
				setState(342);
				match(T__21);
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(343);
					ruleVariableDeclaration();
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(349);
				match(T__23);
				}
			}

			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(352);
				outPattern();
				}
			}

			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(355);
				actionBlock();
				}
			}

			setState(358);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ATLParser.IDENTIFIER, 0); }
		public OclTypeContext oclType() {
			return getRuleContext(OclTypeContext.class,0);
		}
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public RuleVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterRuleVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitRuleVariableDeclaration(this);
		}
	}

	public final RuleVariableDeclarationContext ruleVariableDeclaration() throws RecognitionException {
		RuleVariableDeclarationContext _localctx = new RuleVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ruleVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(IDENTIFIER);
			setState(361);
			match(T__12);
			setState(362);
			oclType();
			setState(363);
			match(T__8);
			setState(364);
			oclExpression();
			setState(365);
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

	public static class CalledRuleContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ATLParser.IDENTIFIER, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public OutPatternContext outPattern() {
			return getRuleContext(OutPatternContext.class,0);
		}
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public List<RuleVariableDeclarationContext> ruleVariableDeclaration() {
			return getRuleContexts(RuleVariableDeclarationContext.class);
		}
		public RuleVariableDeclarationContext ruleVariableDeclaration(int i) {
			return getRuleContext(RuleVariableDeclarationContext.class,i);
		}
		public CalledRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calledRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterCalledRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitCalledRule(this);
		}
	}

	public final CalledRuleContext calledRule() throws RecognitionException {
		CalledRuleContext _localctx = new CalledRuleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_calledRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(367);
				match(T__24);
				}
			}

			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(370);
				match(T__25);
				}
			}

			setState(373);
			match(T__19);
			setState(374);
			match(IDENTIFIER);
			setState(375);
			match(T__14);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(376);
				parameter();
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(377);
					match(T__3);
					setState(378);
					parameter();
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(386);
			match(T__15);
			setState(387);
			match(T__21);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(388);
				match(T__22);
				setState(389);
				match(T__21);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(390);
					ruleVariableDeclaration();
					}
					}
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(396);
				match(T__23);
				}
			}

			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(399);
				outPattern();
				}
			}

			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(402);
				actionBlock();
				}
			}

			setState(405);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InPatternContext extends ParserRuleContext {
		public List<InPatternElementContext> inPatternElement() {
			return getRuleContexts(InPatternElementContext.class);
		}
		public InPatternElementContext inPatternElement(int i) {
			return getRuleContext(InPatternElementContext.class,i);
		}
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public InPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterInPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitInPattern(this);
		}
	}

	public final InPatternContext inPattern() throws RecognitionException {
		InPatternContext _localctx = new InPatternContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_inPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(T__5);
			setState(408);
			inPatternElement();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(409);
				match(T__3);
				setState(410);
				inPatternElement();
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(416);
				match(T__14);
				setState(417);
				oclExpression();
				setState(418);
				match(T__15);
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

	public static class InPatternElementContext extends ParserRuleContext {
		public SimpleInPatternElementContext simpleInPatternElement() {
			return getRuleContext(SimpleInPatternElementContext.class,0);
		}
		public InPatternElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inPatternElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterInPatternElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitInPatternElement(this);
		}
	}

	public final InPatternElementContext inPatternElement() throws RecognitionException {
		InPatternElementContext _localctx = new InPatternElementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_inPatternElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			simpleInPatternElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleInPatternElementContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ATLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ATLParser.IDENTIFIER, i);
		}
		public OclTypeContext oclType() {
			return getRuleContext(OclTypeContext.class,0);
		}
		public SimpleInPatternElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleInPatternElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterSimpleInPatternElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitSimpleInPatternElement(this);
		}
	}

	public final SimpleInPatternElementContext simpleInPatternElement() throws RecognitionException {
		SimpleInPatternElementContext _localctx = new SimpleInPatternElementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_simpleInPatternElement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(IDENTIFIER);
			setState(425);
			match(T__12);
			setState(426);
			oclType();
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(427);
				match(T__26);
				setState(428);
				match(IDENTIFIER);
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(429);
						match(T__3);
						setState(430);
						match(IDENTIFIER);
						}
						} 
					}
					setState(435);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	public static class OutPatternContext extends ParserRuleContext {
		public List<OutPatternElementContext> outPatternElement() {
			return getRuleContexts(OutPatternElementContext.class);
		}
		public OutPatternElementContext outPatternElement(int i) {
			return getRuleContext(OutPatternElementContext.class,i);
		}
		public OutPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterOutPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitOutPattern(this);
		}
	}

	public final OutPatternContext outPattern() throws RecognitionException {
		OutPatternContext _localctx = new OutPatternContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_outPattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(T__27);
			setState(439);
			outPatternElement();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(440);
				match(T__3);
				setState(441);
				outPatternElement();
				}
				}
				setState(446);
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

	public static class OutPatternElementContext extends ParserRuleContext {
		public SimpleOutPatternElementContext simpleOutPatternElement() {
			return getRuleContext(SimpleOutPatternElementContext.class,0);
		}
		public ForEachOutPatternElementContext forEachOutPatternElement() {
			return getRuleContext(ForEachOutPatternElementContext.class,0);
		}
		public OutPatternElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outPatternElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterOutPatternElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitOutPatternElement(this);
		}
	}

	public final OutPatternElementContext outPatternElement() throws RecognitionException {
		OutPatternElementContext _localctx = new OutPatternElementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_outPatternElement);
		try {
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(447);
				simpleOutPatternElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				forEachOutPatternElement();
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

	public static class SimpleOutPatternElementContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ATLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ATLParser.IDENTIFIER, i);
		}
		public OclTypeContext oclType() {
			return getRuleContext(OclTypeContext.class,0);
		}
		public List<BindingContext> binding() {
			return getRuleContexts(BindingContext.class);
		}
		public BindingContext binding(int i) {
			return getRuleContext(BindingContext.class,i);
		}
		public SimpleOutPatternElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleOutPatternElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterSimpleOutPatternElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitSimpleOutPatternElement(this);
		}
	}

	public final SimpleOutPatternElementContext simpleOutPatternElement() throws RecognitionException {
		SimpleOutPatternElementContext _localctx = new SimpleOutPatternElementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_simpleOutPatternElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(IDENTIFIER);
			setState(452);
			match(T__12);
			setState(453);
			oclType();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(454);
				match(T__26);
				setState(455);
				match(IDENTIFIER);
				}
			}

			setState(460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(458);
				match(T__28);
				setState(459);
				match(IDENTIFIER);
				}
			}

			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(462);
				match(T__14);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(463);
					binding();
					setState(468);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(464);
						match(T__3);
						setState(465);
						binding();
						}
						}
						setState(470);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(473);
				match(T__15);
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

	public static class ForEachOutPatternElementContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ATLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ATLParser.IDENTIFIER, i);
		}
		public OclTypeContext oclType() {
			return getRuleContext(OclTypeContext.class,0);
		}
		public IteratorContext iterator() {
			return getRuleContext(IteratorContext.class,0);
		}
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public List<BindingContext> binding() {
			return getRuleContexts(BindingContext.class);
		}
		public BindingContext binding(int i) {
			return getRuleContext(BindingContext.class,i);
		}
		public ForEachOutPatternElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEachOutPatternElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterForEachOutPatternElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitForEachOutPatternElement(this);
		}
	}

	public final ForEachOutPatternElementContext forEachOutPatternElement() throws RecognitionException {
		ForEachOutPatternElementContext _localctx = new ForEachOutPatternElementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_forEachOutPatternElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(IDENTIFIER);
			setState(477);
			match(T__12);
			setState(478);
			match(T__29);
			setState(479);
			oclType();
			setState(480);
			match(T__30);
			setState(481);
			match(T__14);
			setState(482);
			iterator();
			setState(483);
			match(T__26);
			setState(484);
			oclExpression();
			setState(485);
			match(T__15);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(486);
				match(T__28);
				setState(487);
				match(IDENTIFIER);
				}
			}

			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(490);
				match(T__14);
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IDENTIFIER) {
					{
					setState(491);
					binding();
					setState(496);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(492);
						match(T__3);
						setState(493);
						binding();
						}
						}
						setState(498);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(501);
				match(T__15);
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

	public static class BindingContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ATLParser.IDENTIFIER, 0); }
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitBinding(this);
		}
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(IDENTIFIER);
			setState(505);
			match(T__31);
			setState(506);
			oclExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ActionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterActionBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitActionBlock(this);
		}
	}

	public final ActionBlockContext actionBlock() throws RecognitionException {
		ActionBlockContext _localctx = new ActionBlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_actionBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(T__32);
			setState(509);
			match(T__21);
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)) | (1L << (STRING - 78)) | (1L << (INTEGER - 78)) | (1L << (FLOAT - 78)) | (1L << (IDENTIFIER - 78)))) != 0)) {
				{
				{
				setState(510);
				statement();
				}
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(516);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
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
		public IfStatContext ifStat() {
			return getRuleContext(IfStatContext.class,0);
		}
		public ExpressionStatContext expressionStat() {
			return getRuleContext(ExpressionStatContext.class,0);
		}
		public BindingStatContext bindingStat() {
			return getRuleContext(BindingStatContext.class,0);
		}
		public ForStatContext forStat() {
			return getRuleContext(ForStatContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement);
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(518);
				ifStat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				expressionStat();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(520);
				bindingStat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(521);
				forStat();
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

	public static class BindingStatContext extends ParserRuleContext {
		public List<OclExpressionContext> oclExpression() {
			return getRuleContexts(OclExpressionContext.class);
		}
		public OclExpressionContext oclExpression(int i) {
			return getRuleContext(OclExpressionContext.class,i);
		}
		public BindingStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bindingStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterBindingStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitBindingStat(this);
		}
	}

	public final BindingStatContext bindingStat() throws RecognitionException {
		BindingStatContext _localctx = new BindingStatContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bindingStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			oclExpression();
			setState(525);
			match(T__31);
			setState(526);
			oclExpression();
			setState(527);
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

	public static class ExpressionStatContext extends ParserRuleContext {
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public ExpressionStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterExpressionStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitExpressionStat(this);
		}
	}

	public final ExpressionStatContext expressionStat() throws RecognitionException {
		ExpressionStatContext _localctx = new ExpressionStatContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expressionStat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			oclExpression();
			setState(530);
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

	public static class IfStatContext extends ParserRuleContext {
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterIfStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitIfStat(this);
		}
	}

	public final IfStatContext ifStat() throws RecognitionException {
		IfStatContext _localctx = new IfStatContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ifStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(T__33);
			setState(533);
			match(T__14);
			setState(534);
			oclExpression();
			setState(535);
			match(T__15);
			setState(545);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__33:
			case T__35:
			case T__39:
			case T__40:
			case T__41:
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
			case T__60:
			case T__61:
			case T__77:
			case T__78:
			case T__79:
			case STRING:
			case INTEGER:
			case FLOAT:
			case IDENTIFIER:
				{
				setState(536);
				statement();
				}
				break;
			case T__21:
				{
				setState(537);
				match(T__21);
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)) | (1L << (STRING - 78)) | (1L << (INTEGER - 78)) | (1L << (FLOAT - 78)) | (1L << (IDENTIFIER - 78)))) != 0)) {
					{
					{
					setState(538);
					statement();
					}
					}
					setState(543);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(544);
				match(T__23);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(547);
				match(T__34);
				setState(557);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
				case T__33:
				case T__35:
				case T__39:
				case T__40:
				case T__41:
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
				case T__60:
				case T__61:
				case T__77:
				case T__78:
				case T__79:
				case STRING:
				case INTEGER:
				case FLOAT:
				case IDENTIFIER:
					{
					setState(548);
					statement();
					}
					break;
				case T__21:
					{
					setState(549);
					match(T__21);
					setState(553);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)) | (1L << (STRING - 78)) | (1L << (INTEGER - 78)) | (1L << (FLOAT - 78)) | (1L << (IDENTIFIER - 78)))) != 0)) {
						{
						{
						setState(550);
						statement();
						}
						}
						setState(555);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(556);
					match(T__23);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	public static class ForStatContext extends ParserRuleContext {
		public IteratorContext iterator() {
			return getRuleContext(IteratorContext.class,0);
		}
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForStatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterForStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitForStat(this);
		}
	}

	public final ForStatContext forStat() throws RecognitionException {
		ForStatContext _localctx = new ForStatContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_forStat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(T__35);
			setState(562);
			match(T__14);
			setState(563);
			iterator();
			setState(564);
			match(T__26);
			setState(565);
			oclExpression();
			setState(566);
			match(T__15);
			setState(567);
			match(T__21);
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__33) | (1L << T__35) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)) | (1L << (STRING - 78)) | (1L << (INTEGER - 78)) | (1L << (FLOAT - 78)) | (1L << (IDENTIFIER - 78)))) != 0)) {
				{
				{
				setState(568);
				statement();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(574);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OclModelContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ATLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ATLParser.IDENTIFIER, i);
		}
		public OclModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclModel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterOclModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitOclModel(this);
		}
	}

	public final OclModelContext oclModel() throws RecognitionException {
		OclModelContext _localctx = new OclModelContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_oclModel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(IDENTIFIER);
			setState(577);
			match(T__12);
			setState(578);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OclModelElementContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ATLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ATLParser.IDENTIFIER, i);
		}
		public TerminalNode STRING() { return getToken(ATLParser.STRING, 0); }
		public OclModelElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclModelElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterOclModelElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitOclModelElement(this);
		}
	}

	public final OclModelElementContext oclModelElement() throws RecognitionException {
		OclModelElementContext _localctx = new OclModelElementContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_oclModelElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(IDENTIFIER);
			setState(581);
			match(T__36);
			setState(582);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENTIFIER) ) {
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

	public static class OclExpressionContext extends ParserRuleContext {
		public Priority_5Context priority_5() {
			return getRuleContext(Priority_5Context.class,0);
		}
		public LetExpContext letExp() {
			return getRuleContext(LetExpContext.class,0);
		}
		public OclExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterOclExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitOclExpression(this);
		}
	}

	public final OclExpressionContext oclExpression() throws RecognitionException {
		OclExpressionContext _localctx = new OclExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_oclExpression);
		try {
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__33:
			case T__39:
			case T__40:
			case T__41:
			case T__44:
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
			case T__60:
			case T__61:
			case T__77:
			case T__78:
			case T__79:
			case STRING:
			case INTEGER:
			case FLOAT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				priority_5();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				letExp();
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

	public static class IteratorExpContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ATLParser.IDENTIFIER, 0); }
		public List<IteratorContext> iterator() {
			return getRuleContexts(IteratorContext.class);
		}
		public IteratorContext iterator(int i) {
			return getRuleContext(IteratorContext.class,i);
		}
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public IteratorExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iteratorExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterIteratorExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitIteratorExp(this);
		}
	}

	public final IteratorExpContext iteratorExp() throws RecognitionException {
		IteratorExpContext _localctx = new IteratorExpContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_iteratorExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(IDENTIFIER);
			setState(589);
			match(T__14);
			setState(590);
			iterator();
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(591);
				match(T__3);
				setState(592);
				iterator();
				}
				}
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(598);
			match(T__37);
			setState(599);
			oclExpression();
			setState(600);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterateExpContext extends ParserRuleContext {
		public List<IteratorContext> iterator() {
			return getRuleContexts(IteratorContext.class);
		}
		public IteratorContext iterator(int i) {
			return getRuleContext(IteratorContext.class,i);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public IterateExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterateExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterIterateExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitIterateExp(this);
		}
	}

	public final IterateExpContext iterateExp() throws RecognitionException {
		IterateExpContext _localctx = new IterateExpContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_iterateExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(T__38);
			setState(603);
			match(T__14);
			setState(604);
			iterator();
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(605);
				match(T__3);
				setState(606);
				iterator();
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(612);
			match(T__1);
			setState(613);
			variableDeclaration();
			setState(614);
			match(T__37);
			setState(615);
			oclExpression();
			setState(616);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionOperationCallExpContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ATLParser.IDENTIFIER, 0); }
		public List<OclExpressionContext> oclExpression() {
			return getRuleContexts(OclExpressionContext.class);
		}
		public OclExpressionContext oclExpression(int i) {
			return getRuleContext(OclExpressionContext.class,i);
		}
		public CollectionOperationCallExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionOperationCallExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterCollectionOperationCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitCollectionOperationCallExp(this);
		}
	}

	public final CollectionOperationCallExpContext collectionOperationCallExp() throws RecognitionException {
		CollectionOperationCallExpContext _localctx = new CollectionOperationCallExpContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_collectionOperationCallExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(IDENTIFIER);
			setState(619);
			match(T__14);
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)) | (1L << (STRING - 78)) | (1L << (INTEGER - 78)) | (1L << (FLOAT - 78)) | (1L << (IDENTIFIER - 78)))) != 0)) {
				{
				setState(620);
				oclExpression();
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(621);
					match(T__3);
					setState(622);
					oclExpression();
					}
					}
					setState(627);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(630);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationCallExpContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ATLParser.IDENTIFIER, 0); }
		public List<OclExpressionContext> oclExpression() {
			return getRuleContexts(OclExpressionContext.class);
		}
		public OclExpressionContext oclExpression(int i) {
			return getRuleContext(OclExpressionContext.class,i);
		}
		public OperationCallExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationCallExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterOperationCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitOperationCallExp(this);
		}
	}

	public final OperationCallExpContext operationCallExp() throws RecognitionException {
		OperationCallExpContext _localctx = new OperationCallExpContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_operationCallExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(IDENTIFIER);
			setState(633);
			match(T__14);
			setState(642);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)) | (1L << (STRING - 78)) | (1L << (INTEGER - 78)) | (1L << (FLOAT - 78)) | (1L << (IDENTIFIER - 78)))) != 0)) {
				{
				setState(634);
				oclExpression();
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(635);
					match(T__3);
					setState(636);
					oclExpression();
					}
					}
					setState(641);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(644);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NavigationOrAttributeCallExpContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ATLParser.IDENTIFIER, 0); }
		public NavigationOrAttributeCallExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigationOrAttributeCallExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterNavigationOrAttributeCallExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitNavigationOrAttributeCallExp(this);
		}
	}

	public final NavigationOrAttributeCallExpContext navigationOrAttributeCallExp() throws RecognitionException {
		NavigationOrAttributeCallExpContext _localctx = new NavigationOrAttributeCallExpContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_navigationOrAttributeCallExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IteratorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ATLParser.IDENTIFIER, 0); }
		public IteratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterIterator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitIterator(this);
		}
	}

	public final IteratorContext iterator() throws RecognitionException {
		IteratorContext _localctx = new IteratorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_iterator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OclUndefinedExpContext extends ParserRuleContext {
		public OclUndefinedExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclUndefinedExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterOclUndefinedExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitOclUndefinedExp(this);
		}
	}

	public final OclUndefinedExpContext oclUndefinedExp() throws RecognitionException {
		OclUndefinedExpContext _localctx = new OclUndefinedExpContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_oclUndefinedExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(T__39);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveExpContext extends ParserRuleContext {
		public NumericExpContext numericExp() {
			return getRuleContext(NumericExpContext.class,0);
		}
		public BooleanExpContext booleanExp() {
			return getRuleContext(BooleanExpContext.class,0);
		}
		public StringExpContext stringExp() {
			return getRuleContext(StringExpContext.class,0);
		}
		public PrimitiveExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterPrimitiveExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitPrimitiveExp(this);
		}
	}

	public final PrimitiveExpContext primitiveExp() throws RecognitionException {
		PrimitiveExpContext _localctx = new PrimitiveExpContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_primitiveExp);
		try {
			setState(655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(652);
				numericExp();
				}
				break;
			case T__40:
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				booleanExp();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(654);
				stringExp();
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

	public static class NumericExpContext extends ParserRuleContext {
		public IntegerExpContext integerExp() {
			return getRuleContext(IntegerExpContext.class,0);
		}
		public RealExpContext realExp() {
			return getRuleContext(RealExpContext.class,0);
		}
		public NumericExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterNumericExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitNumericExp(this);
		}
	}

	public final NumericExpContext numericExp() throws RecognitionException {
		NumericExpContext _localctx = new NumericExpContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_numericExp);
		try {
			setState(659);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				integerExp();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(658);
				realExp();
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

	public static class BooleanExpContext extends ParserRuleContext {
		public BooleanExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterBooleanExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitBooleanExp(this);
		}
	}

	public final BooleanExpContext booleanExp() throws RecognitionException {
		BooleanExpContext _localctx = new BooleanExpContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_booleanExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			_la = _input.LA(1);
			if ( !(_la==T__40 || _la==T__41) ) {
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

	public static class IntegerExpContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(ATLParser.INTEGER, 0); }
		public IntegerExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterIntegerExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitIntegerExp(this);
		}
	}

	public final IntegerExpContext integerExp() throws RecognitionException {
		IntegerExpContext _localctx = new IntegerExpContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_integerExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealExpContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(ATLParser.FLOAT, 0); }
		public RealExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterRealExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitRealExp(this);
		}
	}

	public final RealExpContext realExp() throws RecognitionException {
		RealExpContext _localctx = new RealExpContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_realExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringExpContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ATLParser.STRING, 0); }
		public StringExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterStringExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitStringExp(this);
		}
	}

	public final StringExpContext stringExp() throws RecognitionException {
		StringExpContext _localctx = new StringExpContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_stringExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfExpContext extends ParserRuleContext {
		public List<OclExpressionContext> oclExpression() {
			return getRuleContexts(OclExpressionContext.class);
		}
		public OclExpressionContext oclExpression(int i) {
			return getRuleContext(OclExpressionContext.class,i);
		}
		public IfExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterIfExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitIfExp(this);
		}
	}

	public final IfExpContext ifExp() throws RecognitionException {
		IfExpContext _localctx = new IfExpContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_ifExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			match(T__33);
			setState(670);
			oclExpression();
			setState(671);
			match(T__42);
			setState(672);
			oclExpression();
			setState(673);
			match(T__34);
			setState(674);
			oclExpression();
			setState(675);
			match(T__43);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableExpContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ATLParser.IDENTIFIER, 0); }
		public VariableExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterVariableExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitVariableExp(this);
		}
	}

	public final VariableExpContext variableExp() throws RecognitionException {
		VariableExpContext _localctx = new VariableExpContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_variableExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperExpContext extends ParserRuleContext {
		public SuperExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterSuperExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitSuperExp(this);
		}
	}

	public final SuperExpContext superExp() throws RecognitionException {
		SuperExpContext _localctx = new SuperExpContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_superExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(T__44);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetExpContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public LetExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterLetExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitLetExp(this);
		}
	}

	public final LetExpContext letExp() throws RecognitionException {
		LetExpContext _localctx = new LetExpContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_letExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(T__45);
			setState(682);
			variableDeclaration();
			setState(683);
			match(T__26);
			setState(684);
			oclExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ATLParser.IDENTIFIER, 0); }
		public OclTypeContext oclType() {
			return getRuleContext(OclTypeContext.class,0);
		}
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(IDENTIFIER);
			setState(687);
			match(T__12);
			setState(688);
			oclType();
			setState(689);
			match(T__8);
			setState(690);
			oclExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumLiteralExpContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ATLParser.IDENTIFIER, 0); }
		public EnumLiteralExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumLiteralExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterEnumLiteralExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitEnumLiteralExp(this);
		}
	}

	public final EnumLiteralExpContext enumLiteralExp() throws RecognitionException {
		EnumLiteralExpContext _localctx = new EnumLiteralExpContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_enumLiteralExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(T__46);
			setState(693);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionExpContext extends ParserRuleContext {
		public BagExpContext bagExp() {
			return getRuleContext(BagExpContext.class,0);
		}
		public SetExpContext setExp() {
			return getRuleContext(SetExpContext.class,0);
		}
		public OrderedSetExpContext orderedSetExp() {
			return getRuleContext(OrderedSetExpContext.class,0);
		}
		public SequenceExpContext sequenceExp() {
			return getRuleContext(SequenceExpContext.class,0);
		}
		public CollectionExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterCollectionExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitCollectionExp(this);
		}
	}

	public final CollectionExpContext collectionExp() throws RecognitionException {
		CollectionExpContext _localctx = new CollectionExpContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_collectionExp);
		try {
			setState(699);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				bagExp();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(696);
				setExp();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 3);
				{
				setState(697);
				orderedSetExp();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 4);
				{
				setState(698);
				sequenceExp();
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

	public static class BagExpContext extends ParserRuleContext {
		public List<OclExpressionContext> oclExpression() {
			return getRuleContexts(OclExpressionContext.class);
		}
		public OclExpressionContext oclExpression(int i) {
			return getRuleContext(OclExpressionContext.class,i);
		}
		public BagExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bagExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterBagExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitBagExp(this);
		}
	}

	public final BagExpContext bagExp() throws RecognitionException {
		BagExpContext _localctx = new BagExpContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_bagExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			match(T__47);
			setState(702);
			match(T__21);
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)) | (1L << (STRING - 78)) | (1L << (INTEGER - 78)) | (1L << (FLOAT - 78)) | (1L << (IDENTIFIER - 78)))) != 0)) {
				{
				setState(703);
				oclExpression();
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(704);
					match(T__3);
					setState(705);
					oclExpression();
					}
					}
					setState(710);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(713);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetExpContext extends ParserRuleContext {
		public List<OclExpressionContext> oclExpression() {
			return getRuleContexts(OclExpressionContext.class);
		}
		public OclExpressionContext oclExpression(int i) {
			return getRuleContext(OclExpressionContext.class,i);
		}
		public SetExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterSetExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitSetExp(this);
		}
	}

	public final SetExpContext setExp() throws RecognitionException {
		SetExpContext _localctx = new SetExpContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_setExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			match(T__48);
			setState(716);
			match(T__21);
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)) | (1L << (STRING - 78)) | (1L << (INTEGER - 78)) | (1L << (FLOAT - 78)) | (1L << (IDENTIFIER - 78)))) != 0)) {
				{
				setState(717);
				oclExpression();
				setState(722);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(718);
					match(T__3);
					setState(719);
					oclExpression();
					}
					}
					setState(724);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(727);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedSetExpContext extends ParserRuleContext {
		public List<OclExpressionContext> oclExpression() {
			return getRuleContexts(OclExpressionContext.class);
		}
		public OclExpressionContext oclExpression(int i) {
			return getRuleContext(OclExpressionContext.class,i);
		}
		public OrderedSetExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedSetExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterOrderedSetExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitOrderedSetExp(this);
		}
	}

	public final OrderedSetExpContext orderedSetExp() throws RecognitionException {
		OrderedSetExpContext _localctx = new OrderedSetExpContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_orderedSetExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			match(T__49);
			setState(730);
			match(T__21);
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)) | (1L << (STRING - 78)) | (1L << (INTEGER - 78)) | (1L << (FLOAT - 78)) | (1L << (IDENTIFIER - 78)))) != 0)) {
				{
				setState(731);
				oclExpression();
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(732);
					match(T__3);
					setState(733);
					oclExpression();
					}
					}
					setState(738);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(741);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceExpContext extends ParserRuleContext {
		public List<OclExpressionContext> oclExpression() {
			return getRuleContexts(OclExpressionContext.class);
		}
		public OclExpressionContext oclExpression(int i) {
			return getRuleContext(OclExpressionContext.class,i);
		}
		public SequenceExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterSequenceExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitSequenceExp(this);
		}
	}

	public final SequenceExpContext sequenceExp() throws RecognitionException {
		SequenceExpContext _localctx = new SequenceExpContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_sequenceExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			match(T__50);
			setState(744);
			match(T__21);
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__33) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__60) | (1L << T__61))) != 0) || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (T__77 - 78)) | (1L << (T__78 - 78)) | (1L << (T__79 - 78)) | (1L << (STRING - 78)) | (1L << (INTEGER - 78)) | (1L << (FLOAT - 78)) | (1L << (IDENTIFIER - 78)))) != 0)) {
				{
				setState(745);
				oclExpression();
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(746);
					match(T__3);
					setState(747);
					oclExpression();
					}
					}
					setState(752);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(755);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapExpContext extends ParserRuleContext {
		public List<MapElementContext> mapElement() {
			return getRuleContexts(MapElementContext.class);
		}
		public MapElementContext mapElement(int i) {
			return getRuleContext(MapElementContext.class,i);
		}
		public MapExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterMapExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitMapExp(this);
		}
	}

	public final MapExpContext mapExp() throws RecognitionException {
		MapExpContext _localctx = new MapExpContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_mapExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(T__51);
			setState(758);
			match(T__21);
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(759);
				mapElement();
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(760);
					match(T__3);
					setState(761);
					mapElement();
					}
					}
					setState(766);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(769);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapElementContext extends ParserRuleContext {
		public List<OclExpressionContext> oclExpression() {
			return getRuleContexts(OclExpressionContext.class);
		}
		public OclExpressionContext oclExpression(int i) {
			return getRuleContext(OclExpressionContext.class,i);
		}
		public MapElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterMapElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitMapElement(this);
		}
	}

	public final MapElementContext mapElement() throws RecognitionException {
		MapElementContext _localctx = new MapElementContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_mapElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(T__14);
			setState(772);
			oclExpression();
			setState(773);
			match(T__3);
			setState(774);
			oclExpression();
			setState(775);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleExpContext extends ParserRuleContext {
		public List<TuplePartContext> tuplePart() {
			return getRuleContexts(TuplePartContext.class);
		}
		public TuplePartContext tuplePart(int i) {
			return getRuleContext(TuplePartContext.class,i);
		}
		public TupleExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterTupleExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitTupleExp(this);
		}
	}

	public final TupleExpContext tupleExp() throws RecognitionException {
		TupleExpContext _localctx = new TupleExpContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_tupleExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(T__52);
			setState(778);
			match(T__21);
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(779);
				tuplePart();
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(780);
					match(T__3);
					setState(781);
					tuplePart();
					}
					}
					setState(786);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(789);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TuplePartContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ATLParser.IDENTIFIER, 0); }
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public OclTypeContext oclType() {
			return getRuleContext(OclTypeContext.class,0);
		}
		public TuplePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterTuplePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitTuplePart(this);
		}
	}

	public final TuplePartContext tuplePart() throws RecognitionException {
		TuplePartContext _localctx = new TuplePartContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_tuplePart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(IDENTIFIER);
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(792);
				match(T__12);
				setState(793);
				oclType();
				}
			}

			setState(796);
			match(T__8);
			setState(797);
			oclExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OclTypeContext extends ParserRuleContext {
		public OclModelElementContext oclModelElement() {
			return getRuleContext(OclModelElementContext.class,0);
		}
		public OclAnyTypeContext oclAnyType() {
			return getRuleContext(OclAnyTypeContext.class,0);
		}
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public MapTypeContext mapType() {
			return getRuleContext(MapTypeContext.class,0);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public CollectionTypeContext collectionType() {
			return getRuleContext(CollectionTypeContext.class,0);
		}
		public OclType_abstractContentsContext oclType_abstractContents() {
			return getRuleContext(OclType_abstractContentsContext.class,0);
		}
		public OclTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterOclType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitOclType(this);
		}
	}

	public final OclTypeContext oclType() throws RecognitionException {
		OclTypeContext _localctx = new OclTypeContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_oclType);
		try {
			setState(806);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(799);
				oclModelElement();
				}
				break;
			case T__78:
				enterOuterAlt(_localctx, 2);
				{
				setState(800);
				oclAnyType();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 3);
				{
				setState(801);
				tupleType();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 4);
				{
				setState(802);
				mapType();
				}
				break;
			case T__54:
			case T__55:
			case T__56:
			case T__57:
				enterOuterAlt(_localctx, 5);
				{
				setState(803);
				primitive();
				}
				break;
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__79:
				enterOuterAlt(_localctx, 6);
				{
				setState(804);
				collectionType();
				}
				break;
			case T__77:
				enterOuterAlt(_localctx, 7);
				{
				setState(805);
				oclType_abstractContents();
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

	public static class OclAnyTypeContext extends ParserRuleContext {
		public OclAnyType_abstractContentsContext oclAnyType_abstractContents() {
			return getRuleContext(OclAnyType_abstractContentsContext.class,0);
		}
		public OclAnyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclAnyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterOclAnyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitOclAnyType(this);
		}
	}

	public final OclAnyTypeContext oclAnyType() throws RecognitionException {
		OclAnyTypeContext _localctx = new OclAnyTypeContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_oclAnyType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			oclAnyType_abstractContents();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeContext extends ParserRuleContext {
		public List<TupleTypeAttributeContext> tupleTypeAttribute() {
			return getRuleContexts(TupleTypeAttributeContext.class);
		}
		public TupleTypeAttributeContext tupleTypeAttribute(int i) {
			return getRuleContext(TupleTypeAttributeContext.class,i);
		}
		public TupleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitTupleType(this);
		}
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_tupleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(T__53);
			setState(811);
			match(T__14);
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(812);
				tupleTypeAttribute();
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(813);
					match(T__3);
					setState(814);
					tupleTypeAttribute();
					}
					}
					setState(819);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(822);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeAttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ATLParser.IDENTIFIER, 0); }
		public OclTypeContext oclType() {
			return getRuleContext(OclTypeContext.class,0);
		}
		public TupleTypeAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleTypeAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterTupleTypeAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitTupleTypeAttribute(this);
		}
	}

	public final TupleTypeAttributeContext tupleTypeAttribute() throws RecognitionException {
		TupleTypeAttributeContext _localctx = new TupleTypeAttributeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_tupleTypeAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			match(IDENTIFIER);
			setState(825);
			match(T__12);
			setState(826);
			oclType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapTypeContext extends ParserRuleContext {
		public List<OclTypeContext> oclType() {
			return getRuleContexts(OclTypeContext.class);
		}
		public OclTypeContext oclType(int i) {
			return getRuleContext(OclTypeContext.class,i);
		}
		public MapTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterMapType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitMapType(this);
		}
	}

	public final MapTypeContext mapType() throws RecognitionException {
		MapTypeContext _localctx = new MapTypeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_mapType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(T__51);
			setState(829);
			match(T__14);
			setState(830);
			oclType();
			setState(831);
			match(T__3);
			setState(832);
			oclType();
			setState(833);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveContext extends ParserRuleContext {
		public NumericTypeContext numericType() {
			return getRuleContext(NumericTypeContext.class,0);
		}
		public BooleanTypeContext booleanType() {
			return getRuleContext(BooleanTypeContext.class,0);
		}
		public StringTypeContext stringType() {
			return getRuleContext(StringTypeContext.class,0);
		}
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitPrimitive(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_primitive);
		try {
			setState(838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__54:
			case T__55:
				enterOuterAlt(_localctx, 1);
				{
				setState(835);
				numericType();
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 2);
				{
				setState(836);
				booleanType();
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 3);
				{
				setState(837);
				stringType();
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

	public static class NumericTypeContext extends ParserRuleContext {
		public IntegerTypeContext integerType() {
			return getRuleContext(IntegerTypeContext.class,0);
		}
		public RealTypeContext realType() {
			return getRuleContext(RealTypeContext.class,0);
		}
		public NumericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterNumericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitNumericType(this);
		}
	}

	public final NumericTypeContext numericType() throws RecognitionException {
		NumericTypeContext _localctx = new NumericTypeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_numericType);
		try {
			setState(842);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__54:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				integerType();
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				realType();
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

	public static class IntegerTypeContext extends ParserRuleContext {
		public IntegerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitIntegerType(this);
		}
	}

	public final IntegerTypeContext integerType() throws RecognitionException {
		IntegerTypeContext _localctx = new IntegerTypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_integerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(T__54);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RealTypeContext extends ParserRuleContext {
		public RealTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_realType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterRealType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitRealType(this);
		}
	}

	public final RealTypeContext realType() throws RecognitionException {
		RealTypeContext _localctx = new RealTypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_realType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(T__55);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanTypeContext extends ParserRuleContext {
		public BooleanTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterBooleanType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitBooleanType(this);
		}
	}

	public final BooleanTypeContext booleanType() throws RecognitionException {
		BooleanTypeContext _localctx = new BooleanTypeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_booleanType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(T__56);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringTypeContext extends ParserRuleContext {
		public StringTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitStringType(this);
		}
	}

	public final StringTypeContext stringType() throws RecognitionException {
		StringTypeContext _localctx = new StringTypeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_stringType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(T__57);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionTypeContext extends ParserRuleContext {
		public BagTypeContext bagType() {
			return getRuleContext(BagTypeContext.class,0);
		}
		public SetTypeContext setType() {
			return getRuleContext(SetTypeContext.class,0);
		}
		public OrderedSetTypeContext orderedSetType() {
			return getRuleContext(OrderedSetTypeContext.class,0);
		}
		public SequenceTypeContext sequenceType() {
			return getRuleContext(SequenceTypeContext.class,0);
		}
		public CollectionType_abstractContentsContext collectionType_abstractContents() {
			return getRuleContext(CollectionType_abstractContentsContext.class,0);
		}
		public CollectionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterCollectionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitCollectionType(this);
		}
	}

	public final CollectionTypeContext collectionType() throws RecognitionException {
		CollectionTypeContext _localctx = new CollectionTypeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_collectionType);
		try {
			setState(857);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__47:
				enterOuterAlt(_localctx, 1);
				{
				setState(852);
				bagType();
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 2);
				{
				setState(853);
				setType();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 3);
				{
				setState(854);
				orderedSetType();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 4);
				{
				setState(855);
				sequenceType();
				}
				break;
			case T__79:
				enterOuterAlt(_localctx, 5);
				{
				setState(856);
				collectionType_abstractContents();
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

	public static class BagTypeContext extends ParserRuleContext {
		public OclTypeContext oclType() {
			return getRuleContext(OclTypeContext.class,0);
		}
		public BagTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bagType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterBagType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitBagType(this);
		}
	}

	public final BagTypeContext bagType() throws RecognitionException {
		BagTypeContext _localctx = new BagTypeContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_bagType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(T__47);
			setState(860);
			match(T__14);
			setState(861);
			oclType();
			setState(862);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetTypeContext extends ParserRuleContext {
		public OclTypeContext oclType() {
			return getRuleContext(OclTypeContext.class,0);
		}
		public SetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitSetType(this);
		}
	}

	public final SetTypeContext setType() throws RecognitionException {
		SetTypeContext _localctx = new SetTypeContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(T__48);
			setState(865);
			match(T__14);
			setState(866);
			oclType();
			setState(867);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedSetTypeContext extends ParserRuleContext {
		public OclTypeContext oclType() {
			return getRuleContext(OclTypeContext.class,0);
		}
		public OrderedSetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedSetType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterOrderedSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitOrderedSetType(this);
		}
	}

	public final OrderedSetTypeContext orderedSetType() throws RecognitionException {
		OrderedSetTypeContext _localctx = new OrderedSetTypeContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_orderedSetType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(T__49);
			setState(870);
			match(T__14);
			setState(871);
			oclType();
			setState(872);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceTypeContext extends ParserRuleContext {
		public OclTypeContext oclType() {
			return getRuleContext(OclTypeContext.class,0);
		}
		public SequenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterSequenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitSequenceType(this);
		}
	}

	public final SequenceTypeContext sequenceType() throws RecognitionException {
		SequenceTypeContext _localctx = new SequenceTypeContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_sequenceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			match(T__50);
			setState(875);
			match(T__14);
			setState(876);
			oclType();
			setState(877);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Priority_0Context extends ParserRuleContext {
		public Primary_oclExpressionContext primary_oclExpression() {
			return getRuleContext(Primary_oclExpressionContext.class,0);
		}
		public List<OperationCallExpContext> operationCallExp() {
			return getRuleContexts(OperationCallExpContext.class);
		}
		public OperationCallExpContext operationCallExp(int i) {
			return getRuleContext(OperationCallExpContext.class,i);
		}
		public List<NavigationOrAttributeCallExpContext> navigationOrAttributeCallExp() {
			return getRuleContexts(NavigationOrAttributeCallExpContext.class);
		}
		public NavigationOrAttributeCallExpContext navigationOrAttributeCallExp(int i) {
			return getRuleContext(NavigationOrAttributeCallExpContext.class,i);
		}
		public List<IteratorExpContext> iteratorExp() {
			return getRuleContexts(IteratorExpContext.class);
		}
		public IteratorExpContext iteratorExp(int i) {
			return getRuleContext(IteratorExpContext.class,i);
		}
		public List<IterateExpContext> iterateExp() {
			return getRuleContexts(IterateExpContext.class);
		}
		public IterateExpContext iterateExp(int i) {
			return getRuleContext(IterateExpContext.class,i);
		}
		public List<CollectionOperationCallExpContext> collectionOperationCallExp() {
			return getRuleContexts(CollectionOperationCallExpContext.class);
		}
		public CollectionOperationCallExpContext collectionOperationCallExp(int i) {
			return getRuleContext(CollectionOperationCallExpContext.class,i);
		}
		public Priority_0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priority_0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterPriority_0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitPriority_0(this);
		}
	}

	public final Priority_0Context priority_0() throws RecognitionException {
		Priority_0Context _localctx = new Priority_0Context(_ctx, getState());
		enterRule(_localctx, 164, RULE_priority_0);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			primary_oclExpression();
			setState(893);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__58 || _la==T__59) {
				{
				setState(891);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__58:
					{
					setState(880);
					match(T__58);
					setState(883);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						setState(881);
						operationCallExp();
						}
						break;
					case 2:
						{
						setState(882);
						navigationOrAttributeCallExp();
						}
						break;
					}
					}
					break;
				case T__59:
					{
					setState(885);
					match(T__59);
					setState(889);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						setState(886);
						iteratorExp();
						}
						break;
					case 2:
						{
						setState(887);
						iterateExp();
						}
						break;
					case 3:
						{
						setState(888);
						collectionOperationCallExp();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(895);
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

	public static class Priority_1Context extends ParserRuleContext {
		public Priority_0Context priority_0() {
			return getRuleContext(Priority_0Context.class,0);
		}
		public Priority_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priority_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterPriority_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitPriority_1(this);
		}
	}

	public final Priority_1Context priority_1() throws RecognitionException {
		Priority_1Context _localctx = new Priority_1Context(_ctx, getState());
		enterRule(_localctx, 166, RULE_priority_1);
		try {
			setState(901);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__60:
				enterOuterAlt(_localctx, 1);
				{
				setState(896);
				match(T__60);
				setState(897);
				priority_0();
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 2);
				{
				setState(898);
				match(T__61);
				setState(899);
				priority_0();
				}
				break;
			case T__14:
			case T__33:
			case T__39:
			case T__40:
			case T__41:
			case T__44:
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
			case T__77:
			case T__78:
			case T__79:
			case STRING:
			case INTEGER:
			case FLOAT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(900);
				priority_0();
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

	public static class Priority_2Context extends ParserRuleContext {
		public List<Priority_1Context> priority_1() {
			return getRuleContexts(Priority_1Context.class);
		}
		public Priority_1Context priority_1(int i) {
			return getRuleContext(Priority_1Context.class,i);
		}
		public Priority_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priority_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterPriority_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitPriority_2(this);
		}
	}

	public final Priority_2Context priority_2() throws RecognitionException {
		Priority_2Context _localctx = new Priority_2Context(_ctx, getState());
		enterRule(_localctx, 168, RULE_priority_2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			priority_1();
			setState(914);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & ((1L << (T__62 - 63)) | (1L << (T__63 - 63)) | (1L << (T__64 - 63)) | (1L << (T__65 - 63)))) != 0)) {
				{
				setState(912);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__62:
					{
					setState(904);
					match(T__62);
					setState(905);
					priority_1();
					}
					break;
				case T__63:
					{
					setState(906);
					match(T__63);
					setState(907);
					priority_1();
					}
					break;
				case T__64:
					{
					setState(908);
					match(T__64);
					setState(909);
					priority_1();
					}
					break;
				case T__65:
					{
					setState(910);
					match(T__65);
					setState(911);
					priority_1();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(916);
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

	public static class Priority_3Context extends ParserRuleContext {
		public List<Priority_2Context> priority_2() {
			return getRuleContexts(Priority_2Context.class);
		}
		public Priority_2Context priority_2(int i) {
			return getRuleContext(Priority_2Context.class,i);
		}
		public Priority_3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priority_3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterPriority_3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitPriority_3(this);
		}
	}

	public final Priority_3Context priority_3() throws RecognitionException {
		Priority_3Context _localctx = new Priority_3Context(_ctx, getState());
		enterRule(_localctx, 170, RULE_priority_3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			priority_2();
			setState(924);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__61 || _la==T__66) {
				{
				setState(922);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__66:
					{
					setState(918);
					match(T__66);
					setState(919);
					priority_2();
					}
					break;
				case T__61:
					{
					setState(920);
					match(T__61);
					setState(921);
					priority_2();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(926);
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

	public static class Priority_4Context extends ParserRuleContext {
		public List<Priority_3Context> priority_3() {
			return getRuleContexts(Priority_3Context.class);
		}
		public Priority_3Context priority_3(int i) {
			return getRuleContext(Priority_3Context.class,i);
		}
		public Priority_4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priority_4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterPriority_4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitPriority_4(this);
		}
	}

	public final Priority_4Context priority_4() throws RecognitionException {
		Priority_4Context _localctx = new Priority_4Context(_ctx, getState());
		enterRule(_localctx, 172, RULE_priority_4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			priority_3();
			setState(942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__67 - 9)) | (1L << (T__68 - 9)) | (1L << (T__69 - 9)) | (1L << (T__70 - 9)) | (1L << (T__71 - 9)))) != 0)) {
				{
				setState(940);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(928);
					match(T__8);
					setState(929);
					priority_3();
					}
					break;
				case T__67:
					{
					setState(930);
					match(T__67);
					setState(931);
					priority_3();
					}
					break;
				case T__68:
					{
					setState(932);
					match(T__68);
					setState(933);
					priority_3();
					}
					break;
				case T__69:
					{
					setState(934);
					match(T__69);
					setState(935);
					priority_3();
					}
					break;
				case T__70:
					{
					setState(936);
					match(T__70);
					setState(937);
					priority_3();
					}
					break;
				case T__71:
					{
					setState(938);
					match(T__71);
					setState(939);
					priority_3();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(944);
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

	public static class Priority_5Context extends ParserRuleContext {
		public List<Priority_4Context> priority_4() {
			return getRuleContexts(Priority_4Context.class);
		}
		public Priority_4Context priority_4(int i) {
			return getRuleContext(Priority_4Context.class,i);
		}
		public Priority_5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_priority_5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterPriority_5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitPriority_5(this);
		}
	}

	public final Priority_5Context priority_5() throws RecognitionException {
		Priority_5Context _localctx = new Priority_5Context(_ctx, getState());
		enterRule(_localctx, 174, RULE_priority_5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			priority_4();
			setState(956);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (T__72 - 73)) | (1L << (T__73 - 73)) | (1L << (T__74 - 73)) | (1L << (T__75 - 73)))) != 0)) {
				{
				setState(954);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__72:
					{
					setState(946);
					match(T__72);
					setState(947);
					priority_4();
					}
					break;
				case T__73:
					{
					setState(948);
					match(T__73);
					setState(949);
					priority_4();
					}
					break;
				case T__74:
					{
					setState(950);
					match(T__74);
					setState(951);
					priority_4();
					}
					break;
				case T__75:
					{
					setState(952);
					match(T__75);
					setState(953);
					priority_4();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(958);
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

	public static class MatchedRule_abstractContentsContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ATLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ATLParser.IDENTIFIER, i);
		}
		public InPatternContext inPattern() {
			return getRuleContext(InPatternContext.class,0);
		}
		public OutPatternContext outPattern() {
			return getRuleContext(OutPatternContext.class,0);
		}
		public ActionBlockContext actionBlock() {
			return getRuleContext(ActionBlockContext.class,0);
		}
		public List<RuleVariableDeclarationContext> ruleVariableDeclaration() {
			return getRuleContexts(RuleVariableDeclarationContext.class);
		}
		public RuleVariableDeclarationContext ruleVariableDeclaration(int i) {
			return getRuleContext(RuleVariableDeclarationContext.class,i);
		}
		public MatchedRule_abstractContentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedRule_abstractContents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterMatchedRule_abstractContents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitMatchedRule_abstractContents(this);
		}
	}

	public final MatchedRule_abstractContentsContext matchedRule_abstractContents() throws RecognitionException {
		MatchedRule_abstractContentsContext _localctx = new MatchedRule_abstractContentsContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_matchedRule_abstractContents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__76) {
				{
				setState(959);
				match(T__76);
				}
			}

			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(962);
				match(T__18);
				}
			}

			setState(966);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(965);
				match(T__4);
				}
			}

			setState(968);
			match(T__19);
			setState(969);
			match(IDENTIFIER);
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(970);
				match(T__20);
				setState(971);
				match(IDENTIFIER);
				}
			}

			setState(974);
			match(T__21);
			setState(975);
			inPattern();
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(976);
				match(T__22);
				setState(977);
				match(T__21);
				setState(981);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(978);
					ruleVariableDeclaration();
					}
					}
					setState(983);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(984);
				match(T__23);
				}
			}

			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(987);
				outPattern();
				}
			}

			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(990);
				actionBlock();
				}
			}

			setState(993);
			match(T__23);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OclType_abstractContentsContext extends ParserRuleContext {
		public OclType_abstractContentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclType_abstractContents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterOclType_abstractContents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitOclType_abstractContents(this);
		}
	}

	public final OclType_abstractContentsContext oclType_abstractContents() throws RecognitionException {
		OclType_abstractContentsContext _localctx = new OclType_abstractContentsContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_oclType_abstractContents);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			match(T__77);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OclAnyType_abstractContentsContext extends ParserRuleContext {
		public OclAnyType_abstractContentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oclAnyType_abstractContents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterOclAnyType_abstractContents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitOclAnyType_abstractContents(this);
		}
	}

	public final OclAnyType_abstractContentsContext oclAnyType_abstractContents() throws RecognitionException {
		OclAnyType_abstractContentsContext _localctx = new OclAnyType_abstractContentsContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_oclAnyType_abstractContents);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(T__78);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectionType_abstractContentsContext extends ParserRuleContext {
		public OclTypeContext oclType() {
			return getRuleContext(OclTypeContext.class,0);
		}
		public CollectionType_abstractContentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionType_abstractContents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterCollectionType_abstractContents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitCollectionType_abstractContents(this);
		}
	}

	public final CollectionType_abstractContentsContext collectionType_abstractContents() throws RecognitionException {
		CollectionType_abstractContentsContext _localctx = new CollectionType_abstractContentsContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_collectionType_abstractContents);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
			match(T__79);
			setState(1000);
			match(T__14);
			setState(1001);
			oclType();
			setState(1002);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Primary_oclExpressionContext extends ParserRuleContext {
		public VariableExpContext variableExp() {
			return getRuleContext(VariableExpContext.class,0);
		}
		public OclUndefinedExpContext oclUndefinedExp() {
			return getRuleContext(OclUndefinedExpContext.class,0);
		}
		public PrimitiveExpContext primitiveExp() {
			return getRuleContext(PrimitiveExpContext.class,0);
		}
		public IfExpContext ifExp() {
			return getRuleContext(IfExpContext.class,0);
		}
		public SuperExpContext superExp() {
			return getRuleContext(SuperExpContext.class,0);
		}
		public EnumLiteralExpContext enumLiteralExp() {
			return getRuleContext(EnumLiteralExpContext.class,0);
		}
		public CollectionExpContext collectionExp() {
			return getRuleContext(CollectionExpContext.class,0);
		}
		public MapExpContext mapExp() {
			return getRuleContext(MapExpContext.class,0);
		}
		public TupleExpContext tupleExp() {
			return getRuleContext(TupleExpContext.class,0);
		}
		public OclTypeContext oclType() {
			return getRuleContext(OclTypeContext.class,0);
		}
		public OclExpressionContext oclExpression() {
			return getRuleContext(OclExpressionContext.class,0);
		}
		public Primary_oclExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_oclExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).enterPrimary_oclExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ATLListener ) ((ATLListener)listener).exitPrimary_oclExpression(this);
		}
	}

	public final Primary_oclExpressionContext primary_oclExpression() throws RecognitionException {
		Primary_oclExpressionContext _localctx = new Primary_oclExpressionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_primary_oclExpression);
		try {
			setState(1018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1004);
				variableExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1005);
				oclUndefinedExp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1006);
				primitiveExp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1007);
				ifExp();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1008);
				superExp();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1009);
				enumLiteralExp();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1010);
				collectionExp();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1011);
				mapExp();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1012);
				tupleExp();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1013);
				oclType();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1014);
				match(T__14);
				setState(1015);
				oclExpression();
				setState(1016);
				match(T__15);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Y\u03ff\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\3\2\3\2"+
		"\3\2\5\2\u00c0\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00cb\n\3\f"+
		"\3\16\3\u00ce\13\3\3\3\7\3\u00d1\n\3\f\3\16\3\u00d4\13\3\3\4\3\4\3\4\7"+
		"\4\u00d9\n\4\f\4\16\4\u00dc\13\4\3\5\3\5\3\5\7\5\u00e1\n\5\f\5\16\5\u00e4"+
		"\13\5\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u00ec\n\7\f\7\16\7\u00ef\13\7\3\7\7"+
		"\7\u00f2\n\7\f\7\16\7\u00f5\13\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00fd\n\b"+
		"\f\b\16\b\u0100\13\b\3\b\7\b\u0103\n\b\f\b\16\b\u0106\13\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\5\n\u010e\n\n\3\13\3\13\3\13\3\13\3\f\5\f\u0115\n\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\5\16\u0120\n\16\3\17\3\17\3\17\3\17\3"+
		"\17\7\17\u0127\n\17\f\17\16\17\u012a\13\17\5\17\u012c\n\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\5\22\u0140\n\22\3\23\3\23\5\23\u0144\n\23\3\24\5\24\u0147\n\24"+
		"\3\24\3\24\5\24\u014b\n\24\3\24\5\24\u014e\n\24\3\24\3\24\3\24\3\24\5"+
		"\24\u0154\n\24\3\24\3\24\3\24\3\24\3\24\7\24\u015b\n\24\f\24\16\24\u015e"+
		"\13\24\3\24\5\24\u0161\n\24\3\24\5\24\u0164\n\24\3\24\5\24\u0167\n\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\5\26\u0173\n\26\3\26"+
		"\5\26\u0176\n\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u017e\n\26\f\26\16"+
		"\26\u0181\13\26\5\26\u0183\n\26\3\26\3\26\3\26\3\26\3\26\7\26\u018a\n"+
		"\26\f\26\16\26\u018d\13\26\3\26\5\26\u0190\n\26\3\26\5\26\u0193\n\26\3"+
		"\26\5\26\u0196\n\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u019e\n\27\f\27"+
		"\16\27\u01a1\13\27\3\27\3\27\3\27\3\27\5\27\u01a7\n\27\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u01b2\n\31\f\31\16\31\u01b5\13\31"+
		"\5\31\u01b7\n\31\3\32\3\32\3\32\3\32\7\32\u01bd\n\32\f\32\16\32\u01c0"+
		"\13\32\3\33\3\33\5\33\u01c4\n\33\3\34\3\34\3\34\3\34\3\34\5\34\u01cb\n"+
		"\34\3\34\3\34\5\34\u01cf\n\34\3\34\3\34\3\34\3\34\7\34\u01d5\n\34\f\34"+
		"\16\34\u01d8\13\34\5\34\u01da\n\34\3\34\5\34\u01dd\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01eb\n\35\3\35\3\35"+
		"\3\35\3\35\7\35\u01f1\n\35\f\35\16\35\u01f4\13\35\5\35\u01f6\n\35\3\35"+
		"\5\35\u01f9\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u0202\n\37\f"+
		"\37\16\37\u0205\13\37\3\37\3\37\3 \3 \3 \3 \5 \u020d\n \3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\7#\u021e\n#\f#\16#\u0221\13#\3#\5#"+
		"\u0224\n#\3#\3#\3#\3#\7#\u022a\n#\f#\16#\u022d\13#\3#\5#\u0230\n#\5#\u0232"+
		"\n#\3$\3$\3$\3$\3$\3$\3$\3$\7$\u023c\n$\f$\16$\u023f\13$\3$\3$\3%\3%\3"+
		"%\3%\3&\3&\3&\3&\3\'\3\'\5\'\u024d\n\'\3(\3(\3(\3(\3(\7(\u0254\n(\f(\16"+
		"(\u0257\13(\3(\3(\3(\3(\3)\3)\3)\3)\3)\7)\u0262\n)\f)\16)\u0265\13)\3"+
		")\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\7*\u0272\n*\f*\16*\u0275\13*\5*\u0277"+
		"\n*\3*\3*\3+\3+\3+\3+\3+\7+\u0280\n+\f+\16+\u0283\13+\5+\u0285\n+\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3/\5/\u0292\n/\3\60\3\60\5\60\u0296\n\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3"+
		";\3;\3;\3;\5;\u02be\n;\3<\3<\3<\3<\3<\7<\u02c5\n<\f<\16<\u02c8\13<\5<"+
		"\u02ca\n<\3<\3<\3=\3=\3=\3=\3=\7=\u02d3\n=\f=\16=\u02d6\13=\5=\u02d8\n"+
		"=\3=\3=\3>\3>\3>\3>\3>\7>\u02e1\n>\f>\16>\u02e4\13>\5>\u02e6\n>\3>\3>"+
		"\3?\3?\3?\3?\3?\7?\u02ef\n?\f?\16?\u02f2\13?\5?\u02f4\n?\3?\3?\3@\3@\3"+
		"@\3@\3@\7@\u02fd\n@\f@\16@\u0300\13@\5@\u0302\n@\3@\3@\3A\3A\3A\3A\3A"+
		"\3A\3B\3B\3B\3B\3B\7B\u0311\nB\fB\16B\u0314\13B\5B\u0316\nB\3B\3B\3C\3"+
		"C\3C\5C\u031d\nC\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\5D\u0329\nD\3E\3E\3F\3"+
		"F\3F\3F\3F\7F\u0332\nF\fF\16F\u0335\13F\5F\u0337\nF\3F\3F\3G\3G\3G\3G"+
		"\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\5I\u0349\nI\3J\3J\5J\u034d\nJ\3K\3K\3L"+
		"\3L\3M\3M\3N\3N\3O\3O\3O\3O\3O\5O\u035c\nO\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q"+
		"\3Q\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3T\3T\3T\3T\5T\u0376\nT\3T\3T\3T\3T"+
		"\5T\u037c\nT\7T\u037e\nT\fT\16T\u0381\13T\3U\3U\3U\3U\3U\5U\u0388\nU\3"+
		"V\3V\3V\3V\3V\3V\3V\3V\3V\7V\u0393\nV\fV\16V\u0396\13V\3W\3W\3W\3W\3W"+
		"\7W\u039d\nW\fW\16W\u03a0\13W\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\3X\7"+
		"X\u03af\nX\fX\16X\u03b2\13X\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\3Y\7Y\u03bd\nY\fY"+
		"\16Y\u03c0\13Y\3Z\5Z\u03c3\nZ\3Z\5Z\u03c6\nZ\3Z\5Z\u03c9\nZ\3Z\3Z\3Z\3"+
		"Z\5Z\u03cf\nZ\3Z\3Z\3Z\3Z\3Z\7Z\u03d6\nZ\fZ\16Z\u03d9\13Z\3Z\5Z\u03dc"+
		"\nZ\3Z\5Z\u03df\nZ\3Z\5Z\u03e2\nZ\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3]\3]\3]\3"+
		"^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\3^\5^\u03fd\n^\3^\2\2_\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090"+
		"\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8"+
		"\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\2\5\4\2SSVV\3\2"+
		"\7\b\3\2+,\2\u042d\2\u00bf\3\2\2\2\4\u00c1\3\2\2\2\6\u00d5\3\2\2\2\b\u00dd"+
		"\3\2\2\2\n\u00e5\3\2\2\2\f\u00e7\3\2\2\2\16\u00f6\3\2\2\2\20\u0107\3\2"+
		"\2\2\22\u010d\3\2\2\2\24\u010f\3\2\2\2\26\u0114\3\2\2\2\30\u011a\3\2\2"+
		"\2\32\u011f\3\2\2\2\34\u0121\3\2\2\2\36\u0133\3\2\2\2 \u0137\3\2\2\2\""+
		"\u013f\3\2\2\2$\u0143\3\2\2\2&\u0146\3\2\2\2(\u016a\3\2\2\2*\u0172\3\2"+
		"\2\2,\u0199\3\2\2\2.\u01a8\3\2\2\2\60\u01aa\3\2\2\2\62\u01b8\3\2\2\2\64"+
		"\u01c3\3\2\2\2\66\u01c5\3\2\2\28\u01de\3\2\2\2:\u01fa\3\2\2\2<\u01fe\3"+
		"\2\2\2>\u020c\3\2\2\2@\u020e\3\2\2\2B\u0213\3\2\2\2D\u0216\3\2\2\2F\u0233"+
		"\3\2\2\2H\u0242\3\2\2\2J\u0246\3\2\2\2L\u024c\3\2\2\2N\u024e\3\2\2\2P"+
		"\u025c\3\2\2\2R\u026c\3\2\2\2T\u027a\3\2\2\2V\u0288\3\2\2\2X\u028a\3\2"+
		"\2\2Z\u028c\3\2\2\2\\\u0291\3\2\2\2^\u0295\3\2\2\2`\u0297\3\2\2\2b\u0299"+
		"\3\2\2\2d\u029b\3\2\2\2f\u029d\3\2\2\2h\u029f\3\2\2\2j\u02a7\3\2\2\2l"+
		"\u02a9\3\2\2\2n\u02ab\3\2\2\2p\u02b0\3\2\2\2r\u02b6\3\2\2\2t\u02bd\3\2"+
		"\2\2v\u02bf\3\2\2\2x\u02cd\3\2\2\2z\u02db\3\2\2\2|\u02e9\3\2\2\2~\u02f7"+
		"\3\2\2\2\u0080\u0305\3\2\2\2\u0082\u030b\3\2\2\2\u0084\u0319\3\2\2\2\u0086"+
		"\u0328\3\2\2\2\u0088\u032a\3\2\2\2\u008a\u032c\3\2\2\2\u008c\u033a\3\2"+
		"\2\2\u008e\u033e\3\2\2\2\u0090\u0348\3\2\2\2\u0092\u034c\3\2\2\2\u0094"+
		"\u034e\3\2\2\2\u0096\u0350\3\2\2\2\u0098\u0352\3\2\2\2\u009a\u0354\3\2"+
		"\2\2\u009c\u035b\3\2\2\2\u009e\u035d\3\2\2\2\u00a0\u0362\3\2\2\2\u00a2"+
		"\u0367\3\2\2\2\u00a4\u036c\3\2\2\2\u00a6\u0371\3\2\2\2\u00a8\u0387\3\2"+
		"\2\2\u00aa\u0389\3\2\2\2\u00ac\u0397\3\2\2\2\u00ae\u03a1\3\2\2\2\u00b0"+
		"\u03b3\3\2\2\2\u00b2\u03c2\3\2\2\2\u00b4\u03e5\3\2\2\2\u00b6\u03e7\3\2"+
		"\2\2\u00b8\u03e9\3\2\2\2\u00ba\u03fc\3\2\2\2\u00bc\u00c0\5\4\3\2\u00bd"+
		"\u00c0\5\f\7\2\u00be\u00c0\5\16\b\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3"+
		"\2\2\2\u00bf\u00be\3\2\2\2\u00c0\3\3\2\2\2\u00c1\u00c2\7\3\2\2\u00c2\u00c3"+
		"\t\2\2\2\u00c3\u00c4\7\4\2\2\u00c4\u00c5\7\5\2\2\u00c5\u00c6\5\6\4\2\u00c6"+
		"\u00c7\5\n\6\2\u00c7\u00c8\5\b\5\2\u00c8\u00cc\7\4\2\2\u00c9\u00cb\5\20"+
		"\t\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00d2\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d1\5\22"+
		"\n\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00da\5H%\2\u00d6"+
		"\u00d7\7\6\2\2\u00d7\u00d9\5H%\2\u00d8\u00d6\3\2\2\2\u00d9\u00dc\3\2\2"+
		"\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\7\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dd\u00e2\5H%\2\u00de\u00df\7\6\2\2\u00df\u00e1\5H%\2\u00e0"+
		"\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\t\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\t\3\2\2\u00e6\13"+
		"\3\2\2\2\u00e7\u00e8\7\t\2\2\u00e8\u00e9\t\2\2\2\u00e9\u00ed\7\4\2\2\u00ea"+
		"\u00ec\5\20\t\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3"+
		"\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f3\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f2\5\24\13\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3"+
		"\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\r\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7"+
		"\7\n\2\2\u00f7\u00f8\t\2\2\2\u00f8\u00f9\7\13\2\2\u00f9\u00fa\5L\'\2\u00fa"+
		"\u00fe\7\4\2\2\u00fb\u00fd\5\20\t\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3"+
		"\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0104\3\2\2\2\u0100"+
		"\u00fe\3\2\2\2\u0101\u0103\5\24\13\2\u0102\u0101\3\2\2\2\u0103\u0106\3"+
		"\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\17\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u0108\7\f\2\2\u0108\u0109\7S\2\2\u0109\u010a\7\4"+
		"\2\2\u010a\21\3\2\2\2\u010b\u010e\5\24\13\2\u010c\u010e\5\"\22\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\23\3\2\2\2\u010f\u0110\7\r\2"+
		"\2\u0110\u0111\5\26\f\2\u0111\u0112\7\4\2\2\u0112\25\3\2\2\2\u0113\u0115"+
		"\5\30\r\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2"+
		"\u0116\u0117\7\16\2\2\u0117\u0118\7\17\2\2\u0118\u0119\5\32\16\2\u0119"+
		"\27\3\2\2\2\u011a\u011b\7\20\2\2\u011b\u011c\5\u0086D\2\u011c\31\3\2\2"+
		"\2\u011d\u0120\5\34\17\2\u011e\u0120\5 \21\2\u011f\u011d\3\2\2\2\u011f"+
		"\u011e\3\2\2\2\u0120\33\3\2\2\2\u0121\u0122\7V\2\2\u0122\u012b\7\21\2"+
		"\2\u0123\u0128\5\36\20\2\u0124\u0125\7\6\2\2\u0125\u0127\5\36\20\2\u0126"+
		"\u0124\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u0123\3\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\7\22\2\2\u012e\u012f\7"+
		"\17\2\2\u012f\u0130\5\u0086D\2\u0130\u0131\7\13\2\2\u0131\u0132\5L\'\2"+
		"\u0132\35\3\2\2\2\u0133\u0134\7V\2\2\u0134\u0135\7\17\2\2\u0135\u0136"+
		"\5\u0086D\2\u0136\37\3\2\2\2\u0137\u0138\7V\2\2\u0138\u0139\7\17\2\2\u0139"+
		"\u013a\5\u0086D\2\u013a\u013b\7\13\2\2\u013b\u013c\5L\'\2\u013c!\3\2\2"+
		"\2\u013d\u0140\5*\26\2\u013e\u0140\5$\23\2\u013f\u013d\3\2\2\2\u013f\u013e"+
		"\3\2\2\2\u0140#\3\2\2\2\u0141\u0144\5&\24\2\u0142\u0144\5\u00b2Z\2\u0143"+
		"\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144%\3\2\2\2\u0145\u0147\7\23\2\2"+
		"\u0146\u0145\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a"+
		"\7\24\2\2\u0149\u014b\7\25\2\2\u014a\u0149\3\2\2\2\u014a\u014b\3\2\2\2"+
		"\u014b\u014d\3\2\2\2\u014c\u014e\7\7\2\2\u014d\u014c\3\2\2\2\u014d\u014e"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\7\26\2\2\u0150\u0153\7V\2\2\u0151"+
		"\u0152\7\27\2\2\u0152\u0154\7V\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0155\3\2\2\2\u0155\u0156\7\30\2\2\u0156\u0160\5,\27\2\u0157"+
		"\u0158\7\31\2\2\u0158\u015c\7\30\2\2\u0159\u015b\5(\25\2\u015a\u0159\3"+
		"\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0161\7\32\2\2\u0160\u0157\3"+
		"\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0164\5\62\32\2\u0163"+
		"\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0167\5<"+
		"\37\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u0169\7\32\2\2\u0169\'\3\2\2\2\u016a\u016b\7V\2\2\u016b\u016c\7\17\2"+
		"\2\u016c\u016d\5\u0086D\2\u016d\u016e\7\13\2\2\u016e\u016f\5L\'\2\u016f"+
		"\u0170\7\4\2\2\u0170)\3\2\2\2\u0171\u0173\7\33\2\2\u0172\u0171\3\2\2\2"+
		"\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0176\7\34\2\2\u0175\u0174"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\7\26\2\2"+
		"\u0178\u0179\7V\2\2\u0179\u0182\7\21\2\2\u017a\u017f\5\36\20\2\u017b\u017c"+
		"\7\6\2\2\u017c\u017e\5\36\20\2\u017d\u017b\3\2\2\2\u017e\u0181\3\2\2\2"+
		"\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f"+
		"\3\2\2\2\u0182\u017a\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184"+
		"\u0185\7\22\2\2\u0185\u018f\7\30\2\2\u0186\u0187\7\31\2\2\u0187\u018b"+
		"\7\30\2\2\u0188\u018a\5(\25\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2"+
		"\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b"+
		"\3\2\2\2\u018e\u0190\7\32\2\2\u018f\u0186\3\2\2\2\u018f\u0190\3\2\2\2"+
		"\u0190\u0192\3\2\2\2\u0191\u0193\5\62\32\2\u0192\u0191\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0196\5<\37\2\u0195\u0194\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\7\32\2\2\u0198+\3\2\2\2"+
		"\u0199\u019a\7\b\2\2\u019a\u019f\5.\30\2\u019b\u019c\7\6\2\2\u019c\u019e"+
		"\5.\30\2\u019d\u019b\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u01a6\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\7\21"+
		"\2\2\u01a3\u01a4\5L\'\2\u01a4\u01a5\7\22\2\2\u01a5\u01a7\3\2\2\2\u01a6"+
		"\u01a2\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7-\3\2\2\2\u01a8\u01a9\5\60\31"+
		"\2\u01a9/\3\2\2\2\u01aa\u01ab\7V\2\2\u01ab\u01ac\7\17\2\2\u01ac\u01b6"+
		"\5\u0086D\2\u01ad\u01ae\7\35\2\2\u01ae\u01b3\7V\2\2\u01af\u01b0\7\6\2"+
		"\2\u01b0\u01b2\7V\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1"+
		"\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6"+
		"\u01ad\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\61\3\2\2\2\u01b8\u01b9\7\36\2"+
		"\2\u01b9\u01be\5\64\33\2\u01ba\u01bb\7\6\2\2\u01bb\u01bd\5\64\33\2\u01bc"+
		"\u01ba\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2"+
		"\2\2\u01bf\63\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c4\5\66\34\2\u01c2"+
		"\u01c4\58\35\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4\65\3\2\2"+
		"\2\u01c5\u01c6\7V\2\2\u01c6\u01c7\7\17\2\2\u01c7\u01ca\5\u0086D\2\u01c8"+
		"\u01c9\7\35\2\2\u01c9\u01cb\7V\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2"+
		"\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01cd\7\37\2\2\u01cd\u01cf\7V\2\2\u01ce"+
		"\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01dc\3\2\2\2\u01d0\u01d9\7\21"+
		"\2\2\u01d1\u01d6\5:\36\2\u01d2\u01d3\7\6\2\2\u01d3\u01d5\5:\36\2\u01d4"+
		"\u01d2\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2"+
		"\2\2\u01d7\u01da\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01d1\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dd\7\22\2\2\u01dc\u01d0\3"+
		"\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\67\3\2\2\2\u01de\u01df\7V\2\2\u01df\u01e0"+
		"\7\17\2\2\u01e0\u01e1\7 \2\2\u01e1\u01e2\5\u0086D\2\u01e2\u01e3\7!\2\2"+
		"\u01e3\u01e4\7\21\2\2\u01e4\u01e5\5X-\2\u01e5\u01e6\7\35\2\2\u01e6\u01e7"+
		"\5L\'\2\u01e7\u01ea\7\22\2\2\u01e8\u01e9\7\37\2\2\u01e9\u01eb\7V\2\2\u01ea"+
		"\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01f8\3\2\2\2\u01ec\u01f5\7\21"+
		"\2\2\u01ed\u01f2\5:\36\2\u01ee\u01ef\7\6\2\2\u01ef\u01f1\5:\36\2\u01f0"+
		"\u01ee\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2"+
		"\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01ed\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f9\7\22\2\2\u01f8\u01ec\3"+
		"\2\2\2\u01f8\u01f9\3\2\2\2\u01f99\3\2\2\2\u01fa\u01fb\7V\2\2\u01fb\u01fc"+
		"\7\"\2\2\u01fc\u01fd\5L\'\2\u01fd;\3\2\2\2\u01fe\u01ff\7#\2\2\u01ff\u0203"+
		"\7\30\2\2\u0200\u0202\5> \2\u0201\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u0203\3\2"+
		"\2\2\u0206\u0207\7\32\2\2\u0207=\3\2\2\2\u0208\u020d\5D#\2\u0209\u020d"+
		"\5B\"\2\u020a\u020d\5@!\2\u020b\u020d\5F$\2\u020c\u0208\3\2\2\2\u020c"+
		"\u0209\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020d?\3\2\2\2"+
		"\u020e\u020f\5L\'\2\u020f\u0210\7\"\2\2\u0210\u0211\5L\'\2\u0211\u0212"+
		"\7\4\2\2\u0212A\3\2\2\2\u0213\u0214\5L\'\2\u0214\u0215\7\4\2\2\u0215C"+
		"\3\2\2\2\u0216\u0217\7$\2\2\u0217\u0218\7\21\2\2\u0218\u0219\5L\'\2\u0219"+
		"\u0223\7\22\2\2\u021a\u0224\5> \2\u021b\u021f\7\30\2\2\u021c\u021e\5>"+
		" \2\u021d\u021c\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f"+
		"\u0220\3\2\2\2\u0220\u0222\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0224\7\32"+
		"\2\2\u0223\u021a\3\2\2\2\u0223\u021b\3\2\2\2\u0224\u0231\3\2\2\2\u0225"+
		"\u022f\7%\2\2\u0226\u0230\5> \2\u0227\u022b\7\30\2\2\u0228\u022a\5> \2"+
		"\u0229\u0228\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c"+
		"\3\2\2\2\u022c\u022e\3\2\2\2\u022d\u022b\3\2\2\2\u022e\u0230\7\32\2\2"+
		"\u022f\u0226\3\2\2\2\u022f\u0227\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u0225"+
		"\3\2\2\2\u0231\u0232\3\2\2\2\u0232E\3\2\2\2\u0233\u0234\7&\2\2\u0234\u0235"+
		"\7\21\2\2\u0235\u0236\5X-\2\u0236\u0237\7\35\2\2\u0237\u0238\5L\'\2\u0238"+
		"\u0239\7\22\2\2\u0239\u023d\7\30\2\2\u023a\u023c\5> \2\u023b\u023a\3\2"+
		"\2\2\u023c\u023f\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e"+
		"\u0240\3\2\2\2\u023f\u023d\3\2\2\2\u0240\u0241\7\32\2\2\u0241G\3\2\2\2"+
		"\u0242\u0243\7V\2\2\u0243\u0244\7\17\2\2\u0244\u0245\7V\2\2\u0245I\3\2"+
		"\2\2\u0246\u0247\7V\2\2\u0247\u0248\7\'\2\2\u0248\u0249\t\2\2\2\u0249"+
		"K\3\2\2\2\u024a\u024d\5\u00b0Y\2\u024b\u024d\5n8\2\u024c\u024a\3\2\2\2"+
		"\u024c\u024b\3\2\2\2\u024dM\3\2\2\2\u024e\u024f\7V\2\2\u024f\u0250\7\21"+
		"\2\2\u0250\u0255\5X-\2\u0251\u0252\7\6\2\2\u0252\u0254\5X-\2\u0253\u0251"+
		"\3\2\2\2\u0254\u0257\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"\u0258\3\2\2\2\u0257\u0255\3\2\2\2\u0258\u0259\7(\2\2\u0259\u025a\5L\'"+
		"\2\u025a\u025b\7\22\2\2\u025bO\3\2\2\2\u025c\u025d\7)\2\2\u025d\u025e"+
		"\7\21\2\2\u025e\u0263\5X-\2\u025f\u0260\7\6\2\2\u0260\u0262\5X-\2\u0261"+
		"\u025f\3\2\2\2\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2"+
		"\2\2\u0264\u0266\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u0267\7\4\2\2\u0267"+
		"\u0268\5p9\2\u0268\u0269\7(\2\2\u0269\u026a\5L\'\2\u026a\u026b\7\22\2"+
		"\2\u026bQ\3\2\2\2\u026c\u026d\7V\2\2\u026d\u0276\7\21\2\2\u026e\u0273"+
		"\5L\'\2\u026f\u0270\7\6\2\2\u0270\u0272\5L\'\2\u0271\u026f\3\2\2\2\u0272"+
		"\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0277\3\2"+
		"\2\2\u0275\u0273\3\2\2\2\u0276\u026e\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"\u0278\3\2\2\2\u0278\u0279\7\22\2\2\u0279S\3\2\2\2\u027a\u027b\7V\2\2"+
		"\u027b\u0284\7\21\2\2\u027c\u0281\5L\'\2\u027d\u027e\7\6\2\2\u027e\u0280"+
		"\5L\'\2\u027f\u027d\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u027c\3\2"+
		"\2\2\u0284\u0285\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\7\22\2\2\u0287"+
		"U\3\2\2\2\u0288\u0289\7V\2\2\u0289W\3\2\2\2\u028a\u028b\7V\2\2\u028bY"+
		"\3\2\2\2\u028c\u028d\7*\2\2\u028d[\3\2\2\2\u028e\u0292\5^\60\2\u028f\u0292"+
		"\5`\61\2\u0290\u0292\5f\64\2\u0291\u028e\3\2\2\2\u0291\u028f\3\2\2\2\u0291"+
		"\u0290\3\2\2\2\u0292]\3\2\2\2\u0293\u0296\5b\62\2\u0294\u0296\5d\63\2"+
		"\u0295\u0293\3\2\2\2\u0295\u0294\3\2\2\2\u0296_\3\2\2\2\u0297\u0298\t"+
		"\4\2\2\u0298a\3\2\2\2\u0299\u029a\7T\2\2\u029ac\3\2\2\2\u029b\u029c\7"+
		"U\2\2\u029ce\3\2\2\2\u029d\u029e\7S\2\2\u029eg\3\2\2\2\u029f\u02a0\7$"+
		"\2\2\u02a0\u02a1\5L\'\2\u02a1\u02a2\7-\2\2\u02a2\u02a3\5L\'\2\u02a3\u02a4"+
		"\7%\2\2\u02a4\u02a5\5L\'\2\u02a5\u02a6\7.\2\2\u02a6i\3\2\2\2\u02a7\u02a8"+
		"\7V\2\2\u02a8k\3\2\2\2\u02a9\u02aa\7/\2\2\u02aam\3\2\2\2\u02ab\u02ac\7"+
		"\60\2\2\u02ac\u02ad\5p9\2\u02ad\u02ae\7\35\2\2\u02ae\u02af\5L\'\2\u02af"+
		"o\3\2\2\2\u02b0\u02b1\7V\2\2\u02b1\u02b2\7\17\2\2\u02b2\u02b3\5\u0086"+
		"D\2\u02b3\u02b4\7\13\2\2\u02b4\u02b5\5L\'\2\u02b5q\3\2\2\2\u02b6\u02b7"+
		"\7\61\2\2\u02b7\u02b8\7V\2\2\u02b8s\3\2\2\2\u02b9\u02be\5v<\2\u02ba\u02be"+
		"\5x=\2\u02bb\u02be\5z>\2\u02bc\u02be\5|?\2\u02bd\u02b9\3\2\2\2\u02bd\u02ba"+
		"\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02bc\3\2\2\2\u02beu\3\2\2\2\u02bf"+
		"\u02c0\7\62\2\2\u02c0\u02c9\7\30\2\2\u02c1\u02c6\5L\'\2\u02c2\u02c3\7"+
		"\6\2\2\u02c3\u02c5\5L\'\2\u02c4\u02c2\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6"+
		"\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02ca\3\2\2\2\u02c8\u02c6\3\2"+
		"\2\2\u02c9\u02c1\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb"+
		"\u02cc\7\32\2\2\u02ccw\3\2\2\2\u02cd\u02ce\7\63\2\2\u02ce\u02d7\7\30\2"+
		"\2\u02cf\u02d4\5L\'\2\u02d0\u02d1\7\6\2\2\u02d1\u02d3\5L\'\2\u02d2\u02d0"+
		"\3\2\2\2\u02d3\u02d6\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5"+
		"\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d7\u02cf\3\2\2\2\u02d7\u02d8\3\2"+
		"\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02da\7\32\2\2\u02day\3\2\2\2\u02db\u02dc"+
		"\7\64\2\2\u02dc\u02e5\7\30\2\2\u02dd\u02e2\5L\'\2\u02de\u02df\7\6\2\2"+
		"\u02df\u02e1\5L\'\2\u02e0\u02de\3\2\2\2\u02e1\u02e4\3\2\2\2\u02e2\u02e0"+
		"\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e6\3\2\2\2\u02e4\u02e2\3\2\2\2\u02e5"+
		"\u02dd\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\7\32"+
		"\2\2\u02e8{\3\2\2\2\u02e9\u02ea\7\65\2\2\u02ea\u02f3\7\30\2\2\u02eb\u02f0"+
		"\5L\'\2\u02ec\u02ed\7\6\2\2\u02ed\u02ef\5L\'\2\u02ee\u02ec\3\2\2\2\u02ef"+
		"\u02f2\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f4\3\2"+
		"\2\2\u02f2\u02f0\3\2\2\2\u02f3\u02eb\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u02f5\3\2\2\2\u02f5\u02f6\7\32\2\2\u02f6}\3\2\2\2\u02f7\u02f8\7\66\2"+
		"\2\u02f8\u0301\7\30\2\2\u02f9\u02fe\5\u0080A\2\u02fa\u02fb\7\6\2\2\u02fb"+
		"\u02fd\5\u0080A\2\u02fc\u02fa\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc"+
		"\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0301"+
		"\u02f9\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\7\32"+
		"\2\2\u0304\177\3\2\2\2\u0305\u0306\7\21\2\2\u0306\u0307\5L\'\2\u0307\u0308"+
		"\7\6\2\2\u0308\u0309\5L\'\2\u0309\u030a\7\22\2\2\u030a\u0081\3\2\2\2\u030b"+
		"\u030c\7\67\2\2\u030c\u0315\7\30\2\2\u030d\u0312\5\u0084C\2\u030e\u030f"+
		"\7\6\2\2\u030f\u0311\5\u0084C\2\u0310\u030e\3\2\2\2\u0311\u0314\3\2\2"+
		"\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0316\3\2\2\2\u0314\u0312"+
		"\3\2\2\2\u0315\u030d\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\3\2\2\2\u0317"+
		"\u0318\7\32\2\2\u0318\u0083\3\2\2\2\u0319\u031c\7V\2\2\u031a\u031b\7\17"+
		"\2\2\u031b\u031d\5\u0086D\2\u031c\u031a\3\2\2\2\u031c\u031d\3\2\2\2\u031d"+
		"\u031e\3\2\2\2\u031e\u031f\7\13\2\2\u031f\u0320\5L\'\2\u0320\u0085\3\2"+
		"\2\2\u0321\u0329\5J&\2\u0322\u0329\5\u0088E\2\u0323\u0329\5\u008aF\2\u0324"+
		"\u0329\5\u008eH\2\u0325\u0329\5\u0090I\2\u0326\u0329\5\u009cO\2\u0327"+
		"\u0329\5\u00b4[\2\u0328\u0321\3\2\2\2\u0328\u0322\3\2\2\2\u0328\u0323"+
		"\3\2\2\2\u0328\u0324\3\2\2\2\u0328\u0325\3\2\2\2\u0328\u0326\3\2\2\2\u0328"+
		"\u0327\3\2\2\2\u0329\u0087\3\2\2\2\u032a\u032b\5\u00b6\\\2\u032b\u0089"+
		"\3\2\2\2\u032c\u032d\78\2\2\u032d\u0336\7\21\2\2\u032e\u0333\5\u008cG"+
		"\2\u032f\u0330\7\6\2\2\u0330\u0332\5\u008cG\2\u0331\u032f\3\2\2\2\u0332"+
		"\u0335\3\2\2\2\u0333\u0331\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0337\3\2"+
		"\2\2\u0335\u0333\3\2\2\2\u0336\u032e\3\2\2\2\u0336\u0337\3\2\2\2\u0337"+
		"\u0338\3\2\2\2\u0338\u0339\7\22\2\2\u0339\u008b\3\2\2\2\u033a\u033b\7"+
		"V\2\2\u033b\u033c\7\17\2\2\u033c\u033d\5\u0086D\2\u033d\u008d\3\2\2\2"+
		"\u033e\u033f\7\66\2\2\u033f\u0340\7\21\2\2\u0340\u0341\5\u0086D\2\u0341"+
		"\u0342\7\6\2\2\u0342\u0343\5\u0086D\2\u0343\u0344\7\22\2\2\u0344\u008f"+
		"\3\2\2\2\u0345\u0349\5\u0092J\2\u0346\u0349\5\u0098M\2\u0347\u0349\5\u009a"+
		"N\2\u0348\u0345\3\2\2\2\u0348\u0346\3\2\2\2\u0348\u0347\3\2\2\2\u0349"+
		"\u0091\3\2\2\2\u034a\u034d\5\u0094K\2\u034b\u034d\5\u0096L\2\u034c\u034a"+
		"\3\2\2\2\u034c\u034b\3\2\2\2\u034d\u0093\3\2\2\2\u034e\u034f\79\2\2\u034f"+
		"\u0095\3\2\2\2\u0350\u0351\7:\2\2\u0351\u0097\3\2\2\2\u0352\u0353\7;\2"+
		"\2\u0353\u0099\3\2\2\2\u0354\u0355\7<\2\2\u0355\u009b\3\2\2\2\u0356\u035c"+
		"\5\u009eP\2\u0357\u035c\5\u00a0Q\2\u0358\u035c\5\u00a2R\2\u0359\u035c"+
		"\5\u00a4S\2\u035a\u035c\5\u00b8]\2\u035b\u0356\3\2\2\2\u035b\u0357\3\2"+
		"\2\2\u035b\u0358\3\2\2\2\u035b\u0359\3\2\2\2\u035b\u035a\3\2\2\2\u035c"+
		"\u009d\3\2\2\2\u035d\u035e\7\62\2\2\u035e\u035f\7\21\2\2\u035f\u0360\5"+
		"\u0086D\2\u0360\u0361\7\22\2\2\u0361\u009f\3\2\2\2\u0362\u0363\7\63\2"+
		"\2\u0363\u0364\7\21\2\2\u0364\u0365\5\u0086D\2\u0365\u0366\7\22\2\2\u0366"+
		"\u00a1\3\2\2\2\u0367\u0368\7\64\2\2\u0368\u0369\7\21\2\2\u0369\u036a\5"+
		"\u0086D\2\u036a\u036b\7\22\2\2\u036b\u00a3\3\2\2\2\u036c\u036d\7\65\2"+
		"\2\u036d\u036e\7\21\2\2\u036e\u036f\5\u0086D\2\u036f\u0370\7\22\2\2\u0370"+
		"\u00a5\3\2\2\2\u0371\u037f\5\u00ba^\2\u0372\u0375\7=\2\2\u0373\u0376\5"+
		"T+\2\u0374\u0376\5V,\2\u0375\u0373\3\2\2\2\u0375\u0374\3\2\2\2\u0376\u037e"+
		"\3\2\2\2\u0377\u037b\7>\2\2\u0378\u037c\5N(\2\u0379\u037c\5P)\2\u037a"+
		"\u037c\5R*\2\u037b\u0378\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037a\3\2\2"+
		"\2\u037c\u037e\3\2\2\2\u037d\u0372\3\2\2\2\u037d\u0377\3\2\2\2\u037e\u0381"+
		"\3\2\2\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u00a7\3\2\2\2\u0381"+
		"\u037f\3\2\2\2\u0382\u0383\7?\2\2\u0383\u0388\5\u00a6T\2\u0384\u0385\7"+
		"@\2\2\u0385\u0388\5\u00a6T\2\u0386\u0388\5\u00a6T\2\u0387\u0382\3\2\2"+
		"\2\u0387\u0384\3\2\2\2\u0387\u0386\3\2\2\2\u0388\u00a9\3\2\2\2\u0389\u0394"+
		"\5\u00a8U\2\u038a\u038b\7A\2\2\u038b\u0393\5\u00a8U\2\u038c\u038d\7B\2"+
		"\2\u038d\u0393\5\u00a8U\2\u038e\u038f\7C\2\2\u038f\u0393\5\u00a8U\2\u0390"+
		"\u0391\7D\2\2\u0391\u0393\5\u00a8U\2\u0392\u038a\3\2\2\2\u0392\u038c\3"+
		"\2\2\2\u0392\u038e\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0396\3\2\2\2\u0394"+
		"\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u00ab\3\2\2\2\u0396\u0394\3\2"+
		"\2\2\u0397\u039e\5\u00aaV\2\u0398\u0399\7E\2\2\u0399\u039d\5\u00aaV\2"+
		"\u039a\u039b\7@\2\2\u039b\u039d\5\u00aaV\2\u039c\u0398\3\2\2\2\u039c\u039a"+
		"\3\2\2\2\u039d\u03a0\3\2\2\2\u039e\u039c\3\2\2\2\u039e\u039f\3\2\2\2\u039f"+
		"\u00ad\3\2\2\2\u03a0\u039e\3\2\2\2\u03a1\u03b0\5\u00acW\2\u03a2\u03a3"+
		"\7\13\2\2\u03a3\u03af\5\u00acW\2\u03a4\u03a5\7F\2\2\u03a5\u03af\5\u00ac"+
		"W\2\u03a6\u03a7\7G\2\2\u03a7\u03af\5\u00acW\2\u03a8\u03a9\7H\2\2\u03a9"+
		"\u03af\5\u00acW\2\u03aa\u03ab\7I\2\2\u03ab\u03af\5\u00acW\2\u03ac\u03ad"+
		"\7J\2\2\u03ad\u03af\5\u00acW\2\u03ae\u03a2\3\2\2\2\u03ae\u03a4\3\2\2\2"+
		"\u03ae\u03a6\3\2\2\2\u03ae\u03a8\3\2\2\2\u03ae\u03aa\3\2\2\2\u03ae\u03ac"+
		"\3\2\2\2\u03af\u03b2\3\2\2\2\u03b0\u03ae\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1"+
		"\u00af\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b3\u03be\5\u00aeX\2\u03b4\u03b5"+
		"\7K\2\2\u03b5\u03bd\5\u00aeX\2\u03b6\u03b7\7L\2\2\u03b7\u03bd\5\u00ae"+
		"X\2\u03b8\u03b9\7M\2\2\u03b9\u03bd\5\u00aeX\2\u03ba\u03bb\7N\2\2\u03bb"+
		"\u03bd\5\u00aeX\2\u03bc\u03b4\3\2\2\2\u03bc\u03b6\3\2\2\2\u03bc\u03b8"+
		"\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be\u03bc\3\2\2\2\u03be"+
		"\u03bf\3\2\2\2\u03bf\u00b1\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1\u03c3\7O"+
		"\2\2\u03c2\u03c1\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c5\3\2\2\2\u03c4"+
		"\u03c6\7\25\2\2\u03c5\u03c4\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c8\3"+
		"\2\2\2\u03c7\u03c9\7\7\2\2\u03c8\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9"+
		"\u03ca\3\2\2\2\u03ca\u03cb\7\26\2\2\u03cb\u03ce\7V\2\2\u03cc\u03cd\7\27"+
		"\2\2\u03cd\u03cf\7V\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf"+
		"\u03d0\3\2\2\2\u03d0\u03d1\7\30\2\2\u03d1\u03db\5,\27\2\u03d2\u03d3\7"+
		"\31\2\2\u03d3\u03d7\7\30\2\2\u03d4\u03d6\5(\25\2\u03d5\u03d4\3\2\2\2\u03d6"+
		"\u03d9\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da\3\2"+
		"\2\2\u03d9\u03d7\3\2\2\2\u03da\u03dc\7\32\2\2\u03db\u03d2\3\2\2\2\u03db"+
		"\u03dc\3\2\2\2\u03dc\u03de\3\2\2\2\u03dd\u03df\5\62\32\2\u03de\u03dd\3"+
		"\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e1\3\2\2\2\u03e0\u03e2\5<\37\2\u03e1"+
		"\u03e0\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\7\32"+
		"\2\2\u03e4\u00b3\3\2\2\2\u03e5\u03e6\7P\2\2\u03e6\u00b5\3\2\2\2\u03e7"+
		"\u03e8\7Q\2\2\u03e8\u00b7\3\2\2\2\u03e9\u03ea\7R\2\2\u03ea\u03eb\7\21"+
		"\2\2\u03eb\u03ec\5\u0086D\2\u03ec\u03ed\7\22\2\2\u03ed\u00b9\3\2\2\2\u03ee"+
		"\u03fd\5j\66\2\u03ef\u03fd\5Z.\2\u03f0\u03fd\5\\/\2\u03f1\u03fd\5h\65"+
		"\2\u03f2\u03fd\5l\67\2\u03f3\u03fd\5r:\2\u03f4\u03fd\5t;\2\u03f5\u03fd"+
		"\5~@\2\u03f6\u03fd\5\u0082B\2\u03f7\u03fd\5\u0086D\2\u03f8\u03f9\7\21"+
		"\2\2\u03f9\u03fa\5L\'\2\u03fa\u03fb\7\22\2\2\u03fb\u03fd\3\2\2\2\u03fc"+
		"\u03ee\3\2\2\2\u03fc\u03ef\3\2\2\2\u03fc\u03f0\3\2\2\2\u03fc\u03f1\3\2"+
		"\2\2\u03fc\u03f2\3\2\2\2\u03fc\u03f3\3\2\2\2\u03fc\u03f4\3\2\2\2\u03fc"+
		"\u03f5\3\2\2\2\u03fc\u03f6\3\2\2\2\u03fc\u03f7\3\2\2\2\u03fc\u03f8\3\2"+
		"\2\2\u03fd\u00bb\3\2\2\2l\u00bf\u00cc\u00d2\u00da\u00e2\u00ed\u00f3\u00fe"+
		"\u0104\u010d\u0114\u011f\u0128\u012b\u013f\u0143\u0146\u014a\u014d\u0153"+
		"\u015c\u0160\u0163\u0166\u0172\u0175\u017f\u0182\u018b\u018f\u0192\u0195"+
		"\u019f\u01a6\u01b3\u01b6\u01be\u01c3\u01ca\u01ce\u01d6\u01d9\u01dc\u01ea"+
		"\u01f2\u01f5\u01f8\u0203\u020c\u021f\u0223\u022b\u022f\u0231\u023d\u024c"+
		"\u0255\u0263\u0273\u0276\u0281\u0284\u0291\u0295\u02bd\u02c6\u02c9\u02d4"+
		"\u02d7\u02e2\u02e5\u02f0\u02f3\u02fe\u0301\u0312\u0315\u031c\u0328\u0333"+
		"\u0336\u0348\u034c\u035b\u0375\u037b\u037d\u037f\u0387\u0392\u0394\u039c"+
		"\u039e\u03ae\u03b0\u03bc\u03be\u03c2\u03c5\u03c8\u03ce\u03d7\u03db\u03de"+
		"\u03e1\u03fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}