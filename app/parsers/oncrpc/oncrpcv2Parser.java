// Generated from oncrpc/oncrpcv2.g4 by ANTLR 4.7.1
package parsers.oncrpc;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class oncrpcv2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, COMMENT=34, OCTAL=35, DECIMAL=36, HEXADECIMAL=37, 
		IDENTIFIER=38, WS=39;
	public static final int
		RULE_programDef = 0, RULE_versionDef = 1, RULE_procedureDef = 2, RULE_procReturn = 3, 
		RULE_procFirstArg = 4, RULE_oncrpcv2Specification = 5, RULE_declaration = 6, 
		RULE_value = 7, RULE_constant = 8, RULE_typeSpecifier = 9, RULE_enumTypeSpec = 10, 
		RULE_enumBody = 11, RULE_structTypeSpec = 12, RULE_structBody = 13, RULE_unionTypeSpec = 14, 
		RULE_unionBody = 15, RULE_caseSpec = 16, RULE_constantDef = 17, RULE_typeDef = 18, 
		RULE_definition = 19, RULE_xdrSpecification = 20;
	public static final String[] ruleNames = {
		"programDef", "versionDef", "procedureDef", "procReturn", "procFirstArg", 
		"oncrpcv2Specification", "declaration", "value", "constant", "typeSpecifier", 
		"enumTypeSpec", "enumBody", "structTypeSpec", "structBody", "unionTypeSpec", 
		"unionBody", "caseSpec", "constantDef", "typeDef", "definition", "xdrSpecification"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'program'", "'{'", "'}'", "'='", "';'", "'version'", "'('", "','", 
		"')'", "'void'", "'['", "']'", "'<'", "'>'", "'opaque'", "'string'", "'*'", 
		"'unsigned'", "'int'", "'hyper'", "'float'", "'double'", "'quadruple'", 
		"'bool'", "'enum'", "'struct'", "'union'", "'switch'", "'default'", "':'", 
		"'case'", "'const'", "'typedef'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "COMMENT", 
		"OCTAL", "DECIMAL", "HEXADECIMAL", "IDENTIFIER", "WS"
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
	public String getGrammarFileName() { return "oncrpcv2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public oncrpcv2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramDefContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(oncrpcv2Parser.IDENTIFIER, 0); }
		public List<VersionDefContext> versionDef() {
			return getRuleContexts(VersionDefContext.class);
		}
		public VersionDefContext versionDef(int i) {
			return getRuleContext(VersionDefContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ProgramDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterProgramDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitProgramDef(this);
		}
	}

	public final ProgramDefContext programDef() throws RecognitionException {
		ProgramDefContext _localctx = new ProgramDefContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			match(IDENTIFIER);
			setState(44);
			match(T__1);
			setState(45);
			versionDef();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(46);
				versionDef();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
			match(T__2);
			setState(53);
			match(T__3);
			setState(54);
			constant();
			setState(55);
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

	public static class VersionDefContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(oncrpcv2Parser.IDENTIFIER, 0); }
		public List<ProcedureDefContext> procedureDef() {
			return getRuleContexts(ProcedureDefContext.class);
		}
		public ProcedureDefContext procedureDef(int i) {
			return getRuleContext(ProcedureDefContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public VersionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterVersionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitVersionDef(this);
		}
	}

	public final VersionDefContext versionDef() throws RecognitionException {
		VersionDefContext _localctx = new VersionDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_versionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(T__5);
			setState(58);
			match(IDENTIFIER);
			setState(59);
			match(T__1);
			setState(60);
			procedureDef();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(61);
				procedureDef();
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(T__2);
			setState(68);
			match(T__3);
			setState(69);
			constant();
			setState(70);
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

	public static class ProcedureDefContext extends ParserRuleContext {
		public ProcReturnContext procReturn() {
			return getRuleContext(ProcReturnContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(oncrpcv2Parser.IDENTIFIER, 0); }
		public ProcFirstArgContext procFirstArg() {
			return getRuleContext(ProcFirstArgContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public List<TypeSpecifierContext> typeSpecifier() {
			return getRuleContexts(TypeSpecifierContext.class);
		}
		public TypeSpecifierContext typeSpecifier(int i) {
			return getRuleContext(TypeSpecifierContext.class,i);
		}
		public ProcedureDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterProcedureDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitProcedureDef(this);
		}
	}

	public final ProcedureDefContext procedureDef() throws RecognitionException {
		ProcedureDefContext _localctx = new ProcedureDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_procedureDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			procReturn();
			setState(73);
			match(IDENTIFIER);
			setState(74);
			match(T__6);
			setState(75);
			procFirstArg();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(76);
				match(T__7);
				setState(77);
				typeSpecifier();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(T__8);
			setState(84);
			match(T__3);
			setState(85);
			constant();
			setState(86);
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

	public static class ProcReturnContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ProcReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterProcReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitProcReturn(this);
		}
	}

	public final ProcReturnContext procReturn() throws RecognitionException {
		ProcReturnContext _localctx = new ProcReturnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_procReturn);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(T__9);
				}
				break;
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				typeSpecifier();
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

	public static class ProcFirstArgContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public ProcFirstArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procFirstArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterProcFirstArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitProcFirstArg(this);
		}
	}

	public final ProcFirstArgContext procFirstArg() throws RecognitionException {
		ProcFirstArgContext _localctx = new ProcFirstArgContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_procFirstArg);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__9);
				}
				break;
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				typeSpecifier();
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

	public static class Oncrpcv2SpecificationContext extends ParserRuleContext {
		public List<XdrSpecificationContext> xdrSpecification() {
			return getRuleContexts(XdrSpecificationContext.class);
		}
		public XdrSpecificationContext xdrSpecification(int i) {
			return getRuleContext(XdrSpecificationContext.class,i);
		}
		public List<ProgramDefContext> programDef() {
			return getRuleContexts(ProgramDefContext.class);
		}
		public ProgramDefContext programDef(int i) {
			return getRuleContext(ProgramDefContext.class,i);
		}
		public Oncrpcv2SpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oncrpcv2Specification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterOncrpcv2Specification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitOncrpcv2Specification(this);
		}
	}

	public final Oncrpcv2SpecificationContext oncrpcv2Specification() throws RecognitionException {
		Oncrpcv2SpecificationContext _localctx = new Oncrpcv2SpecificationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_oncrpcv2Specification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__31) | (1L << T__32))) != 0)) {
				{
				setState(98);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__24:
				case T__25:
				case T__26:
				case T__31:
				case T__32:
					{
					setState(96);
					xdrSpecification();
					}
					break;
				case T__0:
					{
					setState(97);
					programDef();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(102);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(oncrpcv2Parser.IDENTIFIER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaration);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				typeSpecifier();
				setState(104);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				typeSpecifier();
				setState(107);
				match(IDENTIFIER);
				setState(108);
				match(T__10);
				setState(109);
				value();
				setState(110);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				typeSpecifier();
				setState(113);
				match(IDENTIFIER);
				setState(114);
				match(T__12);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OCTAL) | (1L << DECIMAL) | (1L << HEXADECIMAL) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(115);
					value();
					}
				}

				setState(118);
				match(T__13);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(T__14);
				setState(121);
				match(IDENTIFIER);
				setState(122);
				match(T__10);
				setState(123);
				value();
				setState(124);
				match(T__11);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(T__14);
				setState(127);
				match(IDENTIFIER);
				setState(128);
				match(T__12);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OCTAL) | (1L << DECIMAL) | (1L << HEXADECIMAL) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(129);
					value();
					}
				}

				setState(132);
				match(T__13);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(133);
				match(T__15);
				setState(134);
				match(IDENTIFIER);
				setState(135);
				match(T__12);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OCTAL) | (1L << DECIMAL) | (1L << HEXADECIMAL) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(136);
					value();
					}
				}

				setState(139);
				match(T__13);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(140);
				typeSpecifier();
				setState(141);
				match(T__16);
				setState(142);
				match(IDENTIFIER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(144);
				match(T__9);
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

	public static class ValueContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(oncrpcv2Parser.IDENTIFIER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OCTAL:
			case DECIMAL:
			case HEXADECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				constant();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(IDENTIFIER);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(oncrpcv2Parser.DECIMAL, 0); }
		public TerminalNode HEXADECIMAL() { return getToken(oncrpcv2Parser.HEXADECIMAL, 0); }
		public TerminalNode OCTAL() { return getToken(oncrpcv2Parser.OCTAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OCTAL) | (1L << DECIMAL) | (1L << HEXADECIMAL))) != 0)) ) {
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public EnumTypeSpecContext enumTypeSpec() {
			return getRuleContext(EnumTypeSpecContext.class,0);
		}
		public StructTypeSpecContext structTypeSpec() {
			return getRuleContext(StructTypeSpecContext.class,0);
		}
		public UnionTypeSpecContext unionTypeSpec() {
			return getRuleContext(UnionTypeSpecContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(oncrpcv2Parser.IDENTIFIER, 0); }
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitTypeSpecifier(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeSpecifier);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(153);
					match(T__17);
					}
				}

				setState(156);
				match(T__18);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(157);
					match(T__17);
					}
				}

				setState(160);
				match(T__19);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(T__20);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				match(T__21);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163);
				match(T__22);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(164);
				match(T__23);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(165);
				enumTypeSpec();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(166);
				structTypeSpec();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(167);
				unionTypeSpec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(168);
				match(IDENTIFIER);
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

	public static class EnumTypeSpecContext extends ParserRuleContext {
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public EnumTypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumTypeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterEnumTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitEnumTypeSpec(this);
		}
	}

	public final EnumTypeSpecContext enumTypeSpec() throws RecognitionException {
		EnumTypeSpecContext _localctx = new EnumTypeSpecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_enumTypeSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__24);
			setState(172);
			enumBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(oncrpcv2Parser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(oncrpcv2Parser.IDENTIFIER, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitEnumBody(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__1);
			{
			setState(175);
			match(IDENTIFIER);
			setState(176);
			match(T__3);
			setState(177);
			value();
			}
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(179);
				match(T__7);
				setState(180);
				match(IDENTIFIER);
				setState(181);
				match(T__3);
				setState(182);
				value();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructTypeSpecContext extends ParserRuleContext {
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public StructTypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structTypeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterStructTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitStructTypeSpec(this);
		}
	}

	public final StructTypeSpecContext structTypeSpec() throws RecognitionException {
		StructTypeSpecContext _localctx = new StructTypeSpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_structTypeSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(T__25);
			setState(191);
			structBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructBodyContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitStructBody(this);
		}
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_structBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__1);
			{
			setState(194);
			declaration();
			setState(195);
			match(T__4);
			}
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(197);
				declaration();
				setState(198);
				match(T__4);
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionTypeSpecContext extends ParserRuleContext {
		public UnionBodyContext unionBody() {
			return getRuleContext(UnionBodyContext.class,0);
		}
		public UnionTypeSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionTypeSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterUnionTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitUnionTypeSpec(this);
		}
	}

	public final UnionTypeSpecContext unionTypeSpec() throws RecognitionException {
		UnionTypeSpecContext _localctx = new UnionTypeSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unionTypeSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(T__26);
			setState(208);
			unionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionBodyContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<CaseSpecContext> caseSpec() {
			return getRuleContexts(CaseSpecContext.class);
		}
		public CaseSpecContext caseSpec(int i) {
			return getRuleContext(CaseSpecContext.class,i);
		}
		public UnionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterUnionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitUnionBody(this);
		}
	}

	public final UnionBodyContext unionBody() throws RecognitionException {
		UnionBodyContext _localctx = new UnionBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__27);
			setState(211);
			match(T__6);
			setState(212);
			declaration();
			setState(213);
			match(T__8);
			setState(214);
			match(T__1);
			setState(215);
			caseSpec();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(216);
				caseSpec();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(222);
				match(T__28);
				setState(223);
				match(T__29);
				setState(224);
				declaration();
				setState(225);
				match(T__4);
				}
			}

			setState(229);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseSpecContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public CaseSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterCaseSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitCaseSpec(this);
		}
	}

	public final CaseSpecContext caseSpec() throws RecognitionException {
		CaseSpecContext _localctx = new CaseSpecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_caseSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(231);
			match(T__30);
			setState(232);
			value();
			setState(233);
			match(T__29);
			}
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__30) {
				{
				{
				setState(235);
				match(T__30);
				setState(236);
				value();
				setState(237);
				match(T__29);
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			declaration();
			setState(245);
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

	public static class ConstantDefContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(oncrpcv2Parser.IDENTIFIER, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterConstantDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitConstantDef(this);
		}
	}

	public final ConstantDefContext constantDef() throws RecognitionException {
		ConstantDefContext _localctx = new ConstantDefContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constantDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(T__31);
			setState(248);
			match(IDENTIFIER);
			setState(249);
			match(T__3);
			setState(250);
			constant();
			setState(251);
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

	public static class TypeDefContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(oncrpcv2Parser.IDENTIFIER, 0); }
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public UnionBodyContext unionBody() {
			return getRuleContext(UnionBodyContext.class,0);
		}
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitTypeDef(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeDef);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				match(T__32);
				setState(254);
				declaration();
				setState(255);
				match(T__4);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(T__24);
				setState(258);
				match(IDENTIFIER);
				setState(259);
				enumBody();
				setState(260);
				match(T__4);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(T__25);
				setState(263);
				match(IDENTIFIER);
				setState(264);
				structBody();
				setState(265);
				match(T__4);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
				match(T__26);
				setState(268);
				match(IDENTIFIER);
				setState(269);
				unionBody();
				setState(270);
				match(T__4);
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

	public static class DefinitionContext extends ParserRuleContext {
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public ConstantDefContext constantDef() {
			return getRuleContext(ConstantDefContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_definition);
		try {
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
			case T__25:
			case T__26:
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				typeDef();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				constantDef();
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

	public static class XdrSpecificationContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public XdrSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_xdrSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).enterXdrSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof oncrpcv2Listener ) ((oncrpcv2Listener)listener).exitXdrSpecification(this);
		}
	}

	public final XdrSpecificationContext xdrSpecification() throws RecognitionException {
		XdrSpecificationContext _localctx = new XdrSpecificationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_xdrSpecification);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(278);
					definition();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(281); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u011e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\7\2\62\n"+
		"\2\f\2\16\2\65\13\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3A\n\3\f"+
		"\3\16\3D\13\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4Q\n\4\f\4"+
		"\16\4T\13\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\5\5]\n\5\3\6\3\6\5\6a\n\6\3\7"+
		"\3\7\7\7e\n\7\f\7\16\7h\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\bw\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u0085\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u008c\n\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u0094\n\b\3\t\3\t\5\t\u0098\n\t\3\n\3\n\3\13\5\13\u009d\n\13\3\13"+
		"\3\13\5\13\u00a1\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00ac\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ba"+
		"\n\r\f\r\16\r\u00bd\13\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\7\17\u00cb\n\17\f\17\16\17\u00ce\13\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00dc\n\21\f\21\16\21"+
		"\u00df\13\21\3\21\3\21\3\21\3\21\3\21\5\21\u00e6\n\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00f2\n\22\f\22\16\22\u00f5\13"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\5\24\u0113\n\24\3\25\3\25\5\25\u0117\n\25\3\26\6\26\u011a\n\26\r\26"+
		"\16\26\u011b\3\26\2\2\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*\2\3\3\2%\'\2\u012f\2,\3\2\2\2\4;\3\2\2\2\6J\3\2\2\2\b\\\3\2\2\2\n`\3"+
		"\2\2\2\ff\3\2\2\2\16\u0093\3\2\2\2\20\u0097\3\2\2\2\22\u0099\3\2\2\2\24"+
		"\u00ab\3\2\2\2\26\u00ad\3\2\2\2\30\u00b0\3\2\2\2\32\u00c0\3\2\2\2\34\u00c3"+
		"\3\2\2\2\36\u00d1\3\2\2\2 \u00d4\3\2\2\2\"\u00e9\3\2\2\2$\u00f9\3\2\2"+
		"\2&\u0112\3\2\2\2(\u0116\3\2\2\2*\u0119\3\2\2\2,-\7\3\2\2-.\7(\2\2./\7"+
		"\4\2\2/\63\5\4\3\2\60\62\5\4\3\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2"+
		"\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\7\5\2\2\678\7\6\2"+
		"\289\5\22\n\29:\7\7\2\2:\3\3\2\2\2;<\7\b\2\2<=\7(\2\2=>\7\4\2\2>B\5\6"+
		"\4\2?A\5\6\4\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2"+
		"\2\2EF\7\5\2\2FG\7\6\2\2GH\5\22\n\2HI\7\7\2\2I\5\3\2\2\2JK\5\b\5\2KL\7"+
		"(\2\2LM\7\t\2\2MR\5\n\6\2NO\7\n\2\2OQ\5\24\13\2PN\3\2\2\2QT\3\2\2\2RP"+
		"\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\13\2\2VW\7\6\2\2WX\5\22\n\2"+
		"XY\7\7\2\2Y\7\3\2\2\2Z]\7\f\2\2[]\5\24\13\2\\Z\3\2\2\2\\[\3\2\2\2]\t\3"+
		"\2\2\2^a\7\f\2\2_a\5\24\13\2`^\3\2\2\2`_\3\2\2\2a\13\3\2\2\2be\5*\26\2"+
		"ce\5\2\2\2db\3\2\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\r\3\2\2"+
		"\2hf\3\2\2\2ij\5\24\13\2jk\7(\2\2k\u0094\3\2\2\2lm\5\24\13\2mn\7(\2\2"+
		"no\7\r\2\2op\5\20\t\2pq\7\16\2\2q\u0094\3\2\2\2rs\5\24\13\2st\7(\2\2t"+
		"v\7\17\2\2uw\5\20\t\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7\20\2\2y\u0094"+
		"\3\2\2\2z{\7\21\2\2{|\7(\2\2|}\7\r\2\2}~\5\20\t\2~\177\7\16\2\2\177\u0094"+
		"\3\2\2\2\u0080\u0081\7\21\2\2\u0081\u0082\7(\2\2\u0082\u0084\7\17\2\2"+
		"\u0083\u0085\5\20\t\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0094\7\20\2\2\u0087\u0088\7\22\2\2\u0088\u0089\7(\2\2"+
		"\u0089\u008b\7\17\2\2\u008a\u008c\5\20\t\2\u008b\u008a\3\2\2\2\u008b\u008c"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0094\7\20\2\2\u008e\u008f\5\24\13"+
		"\2\u008f\u0090\7\23\2\2\u0090\u0091\7(\2\2\u0091\u0094\3\2\2\2\u0092\u0094"+
		"\7\f\2\2\u0093i\3\2\2\2\u0093l\3\2\2\2\u0093r\3\2\2\2\u0093z\3\2\2\2\u0093"+
		"\u0080\3\2\2\2\u0093\u0087\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u0092\3\2"+
		"\2\2\u0094\17\3\2\2\2\u0095\u0098\5\22\n\2\u0096\u0098\7(\2\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0096\3\2\2\2\u0098\21\3\2\2\2\u0099\u009a\t\2\2\2\u009a"+
		"\23\3\2\2\2\u009b\u009d\7\24\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2"+
		"\2\u009d\u009e\3\2\2\2\u009e\u00ac\7\25\2\2\u009f\u00a1\7\24\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00ac\7\26"+
		"\2\2\u00a3\u00ac\7\27\2\2\u00a4\u00ac\7\30\2\2\u00a5\u00ac\7\31\2\2\u00a6"+
		"\u00ac\7\32\2\2\u00a7\u00ac\5\26\f\2\u00a8\u00ac\5\32\16\2\u00a9\u00ac"+
		"\5\36\20\2\u00aa\u00ac\7(\2\2\u00ab\u009c\3\2\2\2\u00ab\u00a0\3\2\2\2"+
		"\u00ab\u00a3\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a6"+
		"\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ac\25\3\2\2\2\u00ad\u00ae\7\33\2\2\u00ae\u00af\5\30"+
		"\r\2\u00af\27\3\2\2\2\u00b0\u00b1\7\4\2\2\u00b1\u00b2\7(\2\2\u00b2\u00b3"+
		"\7\6\2\2\u00b3\u00b4\5\20\t\2\u00b4\u00bb\3\2\2\2\u00b5\u00b6\7\n\2\2"+
		"\u00b6\u00b7\7(\2\2\u00b7\u00b8\7\6\2\2\u00b8\u00ba\5\20\t\2\u00b9\u00b5"+
		"\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\5\2\2\u00bf\31\3\2\2"+
		"\2\u00c0\u00c1\7\34\2\2\u00c1\u00c2\5\34\17\2\u00c2\33\3\2\2\2\u00c3\u00c4"+
		"\7\4\2\2\u00c4\u00c5\5\16\b\2\u00c5\u00c6\7\7\2\2\u00c6\u00cc\3\2\2\2"+
		"\u00c7\u00c8\5\16\b\2\u00c8\u00c9\7\7\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c7"+
		"\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7\5\2\2\u00d0\35\3\2\2"+
		"\2\u00d1\u00d2\7\35\2\2\u00d2\u00d3\5 \21\2\u00d3\37\3\2\2\2\u00d4\u00d5"+
		"\7\36\2\2\u00d5\u00d6\7\t\2\2\u00d6\u00d7\5\16\b\2\u00d7\u00d8\7\13\2"+
		"\2\u00d8\u00d9\7\4\2\2\u00d9\u00dd\5\"\22\2\u00da\u00dc\5\"\22\2\u00db"+
		"\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00e5\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\37\2\2\u00e1"+
		"\u00e2\7 \2\2\u00e2\u00e3\5\16\b\2\u00e3\u00e4\7\7\2\2\u00e4\u00e6\3\2"+
		"\2\2\u00e5\u00e0\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e8\7\5\2\2\u00e8!\3\2\2\2\u00e9\u00ea\7!\2\2\u00ea\u00eb\5\20\t\2"+
		"\u00eb\u00ec\7 \2\2\u00ec\u00f3\3\2\2\2\u00ed\u00ee\7!\2\2\u00ee\u00ef"+
		"\5\20\t\2\u00ef\u00f0\7 \2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ed\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\5\16\b\2\u00f7\u00f8\7\7\2\2\u00f8"+
		"#\3\2\2\2\u00f9\u00fa\7\"\2\2\u00fa\u00fb\7(\2\2\u00fb\u00fc\7\6\2\2\u00fc"+
		"\u00fd\5\22\n\2\u00fd\u00fe\7\7\2\2\u00fe%\3\2\2\2\u00ff\u0100\7#\2\2"+
		"\u0100\u0101\5\16\b\2\u0101\u0102\7\7\2\2\u0102\u0113\3\2\2\2\u0103\u0104"+
		"\7\33\2\2\u0104\u0105\7(\2\2\u0105\u0106\5\30\r\2\u0106\u0107\7\7\2\2"+
		"\u0107\u0113\3\2\2\2\u0108\u0109\7\34\2\2\u0109\u010a\7(\2\2\u010a\u010b"+
		"\5\34\17\2\u010b\u010c\7\7\2\2\u010c\u0113\3\2\2\2\u010d\u010e\7\35\2"+
		"\2\u010e\u010f\7(\2\2\u010f\u0110\5 \21\2\u0110\u0111\7\7\2\2\u0111\u0113"+
		"\3\2\2\2\u0112\u00ff\3\2\2\2\u0112\u0103\3\2\2\2\u0112\u0108\3\2\2\2\u0112"+
		"\u010d\3\2\2\2\u0113\'\3\2\2\2\u0114\u0117\5&\24\2\u0115\u0117\5$\23\2"+
		"\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117)\3\2\2\2\u0118\u011a\5"+
		"(\25\2\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c+\3\2\2\2\31\63BR\\`dfv\u0084\u008b\u0093\u0097\u009c"+
		"\u00a0\u00ab\u00bb\u00cc\u00dd\u00e5\u00f3\u0112\u0116\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}