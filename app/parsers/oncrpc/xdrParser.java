// Generated from oncrpc/xdr.g4 by ANTLR 4.7.1
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
public class xdrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		COMMENT=32, OCTAL=33, DECIMAL=34, HEXADECIMAL=35, IDENTIFIER=36, WS=37;
	public static final int
		RULE_declaration = 0, RULE_value = 1, RULE_constant = 2, RULE_typeSpecifier = 3, 
		RULE_enumTypeSpec = 4, RULE_enumBody = 5, RULE_structTypeSpec = 6, RULE_structBody = 7, 
		RULE_unionTypeSpec = 8, RULE_unionBody = 9, RULE_caseSpec = 10, RULE_constantDef = 11, 
		RULE_typeDef = 12, RULE_definition = 13, RULE_xdrSpecification = 14;
	public static final String[] ruleNames = {
		"declaration", "value", "constant", "typeSpecifier", "enumTypeSpec", "enumBody", 
		"structTypeSpec", "structBody", "unionTypeSpec", "unionBody", "caseSpec", 
		"constantDef", "typeDef", "definition", "xdrSpecification"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'<'", "'>'", "'opaque'", "'string'", "'*'", "'void'", 
		"'unsigned'", "'int'", "'hyper'", "'float'", "'double'", "'quadruple'", 
		"'bool'", "'enum'", "'{'", "'='", "','", "'}'", "'struct'", "';'", "'union'", 
		"'switch'", "'('", "')'", "'default'", "':'", "'case'", "'const'", "'typedef'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "COMMENT", "OCTAL", "DECIMAL", 
		"HEXADECIMAL", "IDENTIFIER", "WS"
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
	public String getGrammarFileName() { return "xdr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public xdrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DeclarationContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(xdrParser.IDENTIFIER, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_declaration);
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				typeSpecifier();
				setState(31);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				typeSpecifier();
				setState(34);
				match(IDENTIFIER);
				setState(35);
				match(T__0);
				setState(36);
				value();
				setState(37);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				typeSpecifier();
				setState(40);
				match(IDENTIFIER);
				setState(41);
				match(T__2);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OCTAL) | (1L << DECIMAL) | (1L << HEXADECIMAL) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(42);
					value();
					}
				}

				setState(45);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				match(T__4);
				setState(48);
				match(IDENTIFIER);
				setState(49);
				match(T__0);
				setState(50);
				value();
				setState(51);
				match(T__1);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				match(T__4);
				setState(54);
				match(IDENTIFIER);
				setState(55);
				match(T__2);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OCTAL) | (1L << DECIMAL) | (1L << HEXADECIMAL) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(56);
					value();
					}
				}

				setState(59);
				match(T__3);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				match(T__5);
				setState(61);
				match(IDENTIFIER);
				setState(62);
				match(T__2);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OCTAL) | (1L << DECIMAL) | (1L << HEXADECIMAL) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(63);
					value();
					}
				}

				setState(66);
				match(T__3);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				typeSpecifier();
				setState(68);
				match(T__6);
				setState(69);
				match(IDENTIFIER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(71);
				match(T__7);
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
		public TerminalNode IDENTIFIER() { return getToken(xdrParser.IDENTIFIER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_value);
		try {
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OCTAL:
			case DECIMAL:
			case HEXADECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				constant();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
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
		public TerminalNode DECIMAL() { return getToken(xdrParser.DECIMAL, 0); }
		public TerminalNode HEXADECIMAL() { return getToken(xdrParser.HEXADECIMAL, 0); }
		public TerminalNode OCTAL() { return getToken(xdrParser.OCTAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
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
		public TerminalNode IDENTIFIER() { return getToken(xdrParser.IDENTIFIER, 0); }
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).exitTypeSpecifier(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeSpecifier);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(80);
					match(T__8);
					}
				}

				setState(83);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(84);
					match(T__8);
					}
				}

				setState(87);
				match(T__10);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(T__11);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				match(T__12);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				match(T__13);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(91);
				match(T__14);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				enumTypeSpec();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(93);
				structTypeSpec();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(94);
				unionTypeSpec();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(95);
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
			if ( listener instanceof xdrListener ) ((xdrListener)listener).enterEnumTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).exitEnumTypeSpec(this);
		}
	}

	public final EnumTypeSpecContext enumTypeSpec() throws RecognitionException {
		EnumTypeSpecContext _localctx = new EnumTypeSpecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_enumTypeSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__15);
			setState(99);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(xdrParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(xdrParser.IDENTIFIER, i);
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
			if ( listener instanceof xdrListener ) ((xdrListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).exitEnumBody(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_enumBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__16);
			{
			setState(102);
			match(IDENTIFIER);
			setState(103);
			match(T__17);
			setState(104);
			value();
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(106);
				match(T__18);
				setState(107);
				match(IDENTIFIER);
				setState(108);
				match(T__17);
				setState(109);
				value();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
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
			if ( listener instanceof xdrListener ) ((xdrListener)listener).enterStructTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).exitStructTypeSpec(this);
		}
	}

	public final StructTypeSpecContext structTypeSpec() throws RecognitionException {
		StructTypeSpecContext _localctx = new StructTypeSpecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structTypeSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__20);
			setState(118);
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
			if ( listener instanceof xdrListener ) ((xdrListener)listener).enterStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).exitStructBody(this);
		}
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_structBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(T__16);
			{
			setState(121);
			declaration();
			setState(122);
			match(T__21);
			}
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__20) | (1L << T__22) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(124);
				declaration();
				setState(125);
				match(T__21);
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
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
			if ( listener instanceof xdrListener ) ((xdrListener)listener).enterUnionTypeSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).exitUnionTypeSpec(this);
		}
	}

	public final UnionTypeSpecContext unionTypeSpec() throws RecognitionException {
		UnionTypeSpecContext _localctx = new UnionTypeSpecContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unionTypeSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__22);
			setState(135);
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
			if ( listener instanceof xdrListener ) ((xdrListener)listener).enterUnionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).exitUnionBody(this);
		}
	}

	public final UnionBodyContext unionBody() throws RecognitionException {
		UnionBodyContext _localctx = new UnionBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_unionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__23);
			setState(138);
			match(T__24);
			setState(139);
			declaration();
			setState(140);
			match(T__25);
			setState(141);
			match(T__16);
			setState(142);
			caseSpec();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(143);
				caseSpec();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(149);
				match(T__26);
				setState(150);
				match(T__27);
				setState(151);
				declaration();
				setState(152);
				match(T__21);
				}
			}

			setState(156);
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
			if ( listener instanceof xdrListener ) ((xdrListener)listener).enterCaseSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).exitCaseSpec(this);
		}
	}

	public final CaseSpecContext caseSpec() throws RecognitionException {
		CaseSpecContext _localctx = new CaseSpecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_caseSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(158);
			match(T__28);
			setState(159);
			value();
			setState(160);
			match(T__27);
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__28) {
				{
				{
				setState(162);
				match(T__28);
				setState(163);
				value();
				setState(164);
				match(T__27);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			declaration();
			setState(172);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IDENTIFIER() { return getToken(xdrParser.IDENTIFIER, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).enterConstantDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).exitConstantDef(this);
		}
	}

	public final ConstantDefContext constantDef() throws RecognitionException {
		ConstantDefContext _localctx = new ConstantDefContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constantDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__29);
			setState(175);
			match(IDENTIFIER);
			setState(176);
			match(T__17);
			setState(177);
			constant();
			setState(178);
			match(T__21);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode IDENTIFIER() { return getToken(xdrParser.IDENTIFIER, 0); }
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
			if ( listener instanceof xdrListener ) ((xdrListener)listener).enterTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).exitTypeDef(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeDef);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(T__30);
				setState(181);
				declaration();
				setState(182);
				match(T__21);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(T__15);
				setState(185);
				match(IDENTIFIER);
				setState(186);
				enumBody();
				setState(187);
				match(T__21);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(T__20);
				setState(190);
				match(IDENTIFIER);
				setState(191);
				structBody();
				setState(192);
				match(T__21);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				match(T__22);
				setState(195);
				match(IDENTIFIER);
				setState(196);
				unionBody();
				setState(197);
				match(T__21);
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
			if ( listener instanceof xdrListener ) ((xdrListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).exitDefinition(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_definition);
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__20:
			case T__22:
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				typeDef();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
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
			if ( listener instanceof xdrListener ) ((xdrListener)listener).enterXdrSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof xdrListener ) ((xdrListener)listener).exitXdrSpecification(this);
		}
	}

	public final XdrSpecificationContext xdrSpecification() throws RecognitionException {
		XdrSpecificationContext _localctx = new XdrSpecificationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_xdrSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(205);
				definition();
				}
				}
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__20) | (1L << T__22) | (1L << T__29) | (1L << T__30))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00d5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2.\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2<\n\2\3\2\3\2\3\2\3\2\3\2\5\2C\n\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2K\n\2\3\3\3\3\5\3O\n\3\3\4\3\4\3\5\5\5T\n\5\3\5\3\5\5"+
		"\5X\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5c\n\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7q\n\7\f\7\16\7t\13\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0082\n\t\f\t\16\t\u0085\13\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0093\n\13\f"+
		"\13\16\13\u0096\13\13\3\13\3\13\3\13\3\13\3\13\5\13\u009d\n\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00a9\n\f\f\f\16\f\u00ac\13\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ca"+
		"\n\16\3\17\3\17\5\17\u00ce\n\17\3\20\6\20\u00d1\n\20\r\20\16\20\u00d2"+
		"\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\3\3\2#%\2\u00e5"+
		"\2J\3\2\2\2\4N\3\2\2\2\6P\3\2\2\2\bb\3\2\2\2\nd\3\2\2\2\fg\3\2\2\2\16"+
		"w\3\2\2\2\20z\3\2\2\2\22\u0088\3\2\2\2\24\u008b\3\2\2\2\26\u00a0\3\2\2"+
		"\2\30\u00b0\3\2\2\2\32\u00c9\3\2\2\2\34\u00cd\3\2\2\2\36\u00d0\3\2\2\2"+
		" !\5\b\5\2!\"\7&\2\2\"K\3\2\2\2#$\5\b\5\2$%\7&\2\2%&\7\3\2\2&\'\5\4\3"+
		"\2\'(\7\4\2\2(K\3\2\2\2)*\5\b\5\2*+\7&\2\2+-\7\5\2\2,.\5\4\3\2-,\3\2\2"+
		"\2-.\3\2\2\2./\3\2\2\2/\60\7\6\2\2\60K\3\2\2\2\61\62\7\7\2\2\62\63\7&"+
		"\2\2\63\64\7\3\2\2\64\65\5\4\3\2\65\66\7\4\2\2\66K\3\2\2\2\678\7\7\2\2"+
		"89\7&\2\29;\7\5\2\2:<\5\4\3\2;:\3\2\2\2;<\3\2\2\2<=\3\2\2\2=K\7\6\2\2"+
		">?\7\b\2\2?@\7&\2\2@B\7\5\2\2AC\5\4\3\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2"+
		"DK\7\6\2\2EF\5\b\5\2FG\7\t\2\2GH\7&\2\2HK\3\2\2\2IK\7\n\2\2J \3\2\2\2"+
		"J#\3\2\2\2J)\3\2\2\2J\61\3\2\2\2J\67\3\2\2\2J>\3\2\2\2JE\3\2\2\2JI\3\2"+
		"\2\2K\3\3\2\2\2LO\5\6\4\2MO\7&\2\2NL\3\2\2\2NM\3\2\2\2O\5\3\2\2\2PQ\t"+
		"\2\2\2Q\7\3\2\2\2RT\7\13\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2Uc\7\f\2\2V"+
		"X\7\13\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2Yc\7\r\2\2Zc\7\16\2\2[c\7\17\2"+
		"\2\\c\7\20\2\2]c\7\21\2\2^c\5\n\6\2_c\5\16\b\2`c\5\22\n\2ac\7&\2\2bS\3"+
		"\2\2\2bW\3\2\2\2bZ\3\2\2\2b[\3\2\2\2b\\\3\2\2\2b]\3\2\2\2b^\3\2\2\2b_"+
		"\3\2\2\2b`\3\2\2\2ba\3\2\2\2c\t\3\2\2\2de\7\22\2\2ef\5\f\7\2f\13\3\2\2"+
		"\2gh\7\23\2\2hi\7&\2\2ij\7\24\2\2jk\5\4\3\2kr\3\2\2\2lm\7\25\2\2mn\7&"+
		"\2\2no\7\24\2\2oq\5\4\3\2pl\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3"+
		"\2\2\2tr\3\2\2\2uv\7\26\2\2v\r\3\2\2\2wx\7\27\2\2xy\5\20\t\2y\17\3\2\2"+
		"\2z{\7\23\2\2{|\5\2\2\2|}\7\30\2\2}\u0083\3\2\2\2~\177\5\2\2\2\177\u0080"+
		"\7\30\2\2\u0080\u0082\3\2\2\2\u0081~\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0087\7\26\2\2\u0087\21\3\2\2\2\u0088\u0089\7\31\2\2\u0089"+
		"\u008a\5\24\13\2\u008a\23\3\2\2\2\u008b\u008c\7\32\2\2\u008c\u008d\7\33"+
		"\2\2\u008d\u008e\5\2\2\2\u008e\u008f\7\34\2\2\u008f\u0090\7\23\2\2\u0090"+
		"\u0094\5\26\f\2\u0091\u0093\5\26\f\2\u0092\u0091\3\2\2\2\u0093\u0096\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u009c\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u0098\7\35\2\2\u0098\u0099\7\36\2\2\u0099\u009a\5"+
		"\2\2\2\u009a\u009b\7\30\2\2\u009b\u009d\3\2\2\2\u009c\u0097\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\26\2\2\u009f\25\3\2\2"+
		"\2\u00a0\u00a1\7\37\2\2\u00a1\u00a2\5\4\3\2\u00a2\u00a3\7\36\2\2\u00a3"+
		"\u00aa\3\2\2\2\u00a4\u00a5\7\37\2\2\u00a5\u00a6\5\4\3\2\u00a6\u00a7\7"+
		"\36\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ad\u00ae\5\2\2\2\u00ae\u00af\7\30\2\2\u00af\27\3\2\2\2\u00b0\u00b1"+
		"\7 \2\2\u00b1\u00b2\7&\2\2\u00b2\u00b3\7\24\2\2\u00b3\u00b4\5\6\4\2\u00b4"+
		"\u00b5\7\30\2\2\u00b5\31\3\2\2\2\u00b6\u00b7\7!\2\2\u00b7\u00b8\5\2\2"+
		"\2\u00b8\u00b9\7\30\2\2\u00b9\u00ca\3\2\2\2\u00ba\u00bb\7\22\2\2\u00bb"+
		"\u00bc\7&\2\2\u00bc\u00bd\5\f\7\2\u00bd\u00be\7\30\2\2\u00be\u00ca\3\2"+
		"\2\2\u00bf\u00c0\7\27\2\2\u00c0\u00c1\7&\2\2\u00c1\u00c2\5\20\t\2\u00c2"+
		"\u00c3\7\30\2\2\u00c3\u00ca\3\2\2\2\u00c4\u00c5\7\31\2\2\u00c5\u00c6\7"+
		"&\2\2\u00c6\u00c7\5\24\13\2\u00c7\u00c8\7\30\2\2\u00c8\u00ca\3\2\2\2\u00c9"+
		"\u00b6\3\2\2\2\u00c9\u00ba\3\2\2\2\u00c9\u00bf\3\2\2\2\u00c9\u00c4\3\2"+
		"\2\2\u00ca\33\3\2\2\2\u00cb\u00ce\5\32\16\2\u00cc\u00ce\5\30\r\2\u00cd"+
		"\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\35\3\2\2\2\u00cf\u00d1\5\34\17"+
		"\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\37\3\2\2\2\22-;BJNSWbr\u0083\u0094\u009c\u00aa\u00c9\u00cd"+
		"\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}