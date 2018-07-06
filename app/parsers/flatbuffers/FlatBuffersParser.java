// Generated from flatbuffers/FlatBuffers.g4 by ANTLR 4.7.1
package parsers.flatbuffers;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FlatBuffersParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, STRING_CONSTANT=23, 
		BASE_TYPE_NAME=24, IDENT=25, INTEGER_CONSTANT=26, FLOAT_CONSTANT=27, COMMENT=28, 
		WHITESPACE=29;
	public static final int
		RULE_schema = 0, RULE_include = 1, RULE_namespace_decl = 2, RULE_attribute_decl = 3, 
		RULE_type_decl = 4, RULE_enum_decl = 5, RULE_root_decl = 6, RULE_field_decl = 7, 
		RULE_rpc_decl = 8, RULE_rpc_method = 9, RULE_type = 10, RULE_enumval_decl = 11, 
		RULE_commasep_enumval_decl = 12, RULE_ident_with_opt_single_value = 13, 
		RULE_commasep_ident_with_opt_single_value = 14, RULE_metadata = 15, RULE_scalar = 16, 
		RULE_object = 17, RULE_ident_with_value = 18, RULE_commasep_ident_with_value = 19, 
		RULE_single_value = 20, RULE_value = 21, RULE_commasep_value = 22, RULE_file_extension_decl = 23, 
		RULE_file_identifier_decl = 24, RULE_ns_ident = 25;
	public static final String[] ruleNames = {
		"schema", "include", "namespace_decl", "attribute_decl", "type_decl", 
		"enum_decl", "root_decl", "field_decl", "rpc_decl", "rpc_method", "type", 
		"enumval_decl", "commasep_enumval_decl", "ident_with_opt_single_value", 
		"commasep_ident_with_opt_single_value", "metadata", "scalar", "object", 
		"ident_with_value", "commasep_ident_with_value", "single_value", "value", 
		"commasep_value", "file_extension_decl", "file_identifier_decl", "ns_ident"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'include'", "';'", "'namespace'", "'.'", "'attribute'", "'table'", 
		"'struct'", "'{'", "'}'", "'enum'", "':'", "'union'", "'root_type'", "'='", 
		"'rpc_service'", "'('", "')'", "'['", "']'", "','", "'file_extension'", 
		"'file_identifier'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "STRING_CONSTANT", 
		"BASE_TYPE_NAME", "IDENT", "INTEGER_CONSTANT", "FLOAT_CONSTANT", "COMMENT", 
		"WHITESPACE"
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
	public String getGrammarFileName() { return "FlatBuffers.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FlatBuffersParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SchemaContext extends ParserRuleContext {
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public List<Namespace_declContext> namespace_decl() {
			return getRuleContexts(Namespace_declContext.class);
		}
		public Namespace_declContext namespace_decl(int i) {
			return getRuleContext(Namespace_declContext.class,i);
		}
		public List<Type_declContext> type_decl() {
			return getRuleContexts(Type_declContext.class);
		}
		public Type_declContext type_decl(int i) {
			return getRuleContext(Type_declContext.class,i);
		}
		public List<Enum_declContext> enum_decl() {
			return getRuleContexts(Enum_declContext.class);
		}
		public Enum_declContext enum_decl(int i) {
			return getRuleContext(Enum_declContext.class,i);
		}
		public List<Root_declContext> root_decl() {
			return getRuleContexts(Root_declContext.class);
		}
		public Root_declContext root_decl(int i) {
			return getRuleContext(Root_declContext.class,i);
		}
		public List<File_extension_declContext> file_extension_decl() {
			return getRuleContexts(File_extension_declContext.class);
		}
		public File_extension_declContext file_extension_decl(int i) {
			return getRuleContext(File_extension_declContext.class,i);
		}
		public List<File_identifier_declContext> file_identifier_decl() {
			return getRuleContexts(File_identifier_declContext.class);
		}
		public File_identifier_declContext file_identifier_decl(int i) {
			return getRuleContext(File_identifier_declContext.class,i);
		}
		public List<Attribute_declContext> attribute_decl() {
			return getRuleContexts(Attribute_declContext.class);
		}
		public Attribute_declContext attribute_decl(int i) {
			return getRuleContext(Attribute_declContext.class,i);
		}
		public List<Rpc_declContext> rpc_decl() {
			return getRuleContexts(Rpc_declContext.class);
		}
		public Rpc_declContext rpc_decl(int i) {
			return getRuleContext(Rpc_declContext.class,i);
		}
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public SchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitSchema(this);
		}
	}

	public final SchemaContext schema() throws RecognitionException {
		SchemaContext _localctx = new SchemaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_schema);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(52);
				include();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__20) | (1L << T__21))) != 0)) {
				{
				setState(67);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(58);
					namespace_decl();
					}
					break;
				case T__5:
				case T__6:
					{
					setState(59);
					type_decl();
					}
					break;
				case T__9:
				case T__11:
					{
					setState(60);
					enum_decl();
					}
					break;
				case T__12:
					{
					setState(61);
					root_decl();
					}
					break;
				case T__20:
					{
					setState(62);
					file_extension_decl();
					}
					break;
				case T__21:
					{
					setState(63);
					file_identifier_decl();
					}
					break;
				case T__4:
					{
					setState(64);
					attribute_decl();
					}
					break;
				case T__14:
					{
					setState(65);
					rpc_decl();
					}
					break;
				case T__7:
					{
					setState(66);
					object();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(71);
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

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode STRING_CONSTANT() { return getToken(FlatBuffersParser.STRING_CONSTANT, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitInclude(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__0);
			setState(73);
			match(STRING_CONSTANT);
			setState(74);
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

	public static class Namespace_declContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(FlatBuffersParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FlatBuffersParser.IDENT, i);
		}
		public Namespace_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterNamespace_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitNamespace_decl(this);
		}
	}

	public final Namespace_declContext namespace_decl() throws RecognitionException {
		Namespace_declContext _localctx = new Namespace_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_namespace_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__2);
			setState(77);
			match(IDENT);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(78);
				match(T__3);
				setState(79);
				match(IDENT);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
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

	public static class Attribute_declContext extends ParserRuleContext {
		public TerminalNode STRING_CONSTANT() { return getToken(FlatBuffersParser.STRING_CONSTANT, 0); }
		public Attribute_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterAttribute_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitAttribute_decl(this);
		}
	}

	public final Attribute_declContext attribute_decl() throws RecognitionException {
		Attribute_declContext _localctx = new Attribute_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attribute_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__4);
			setState(88);
			match(STRING_CONSTANT);
			setState(89);
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

	public static class Type_declContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(FlatBuffersParser.IDENT, 0); }
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public Type_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterType_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitType_decl(this);
		}
	}

	public final Type_declContext type_decl() throws RecognitionException {
		Type_declContext _localctx = new Type_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(92);
			match(IDENT);
			setState(93);
			metadata();
			setState(94);
			match(T__7);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(95);
				field_decl();
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Enum_declContext extends ParserRuleContext {
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public Commasep_enumval_declContext commasep_enumval_decl() {
			return getRuleContext(Commasep_enumval_declContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(FlatBuffersParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Enum_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterEnum_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitEnum_decl(this);
		}
	}

	public final Enum_declContext enum_decl() throws RecognitionException {
		Enum_declContext _localctx = new Enum_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_enum_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				setState(103);
				match(T__9);
				setState(104);
				match(IDENT);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(105);
					match(T__10);
					setState(106);
					type();
					}
				}

				}
				break;
			case T__11:
				{
				setState(109);
				match(T__11);
				setState(110);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(113);
			metadata();
			setState(114);
			match(T__7);
			setState(115);
			commasep_enumval_decl();
			setState(116);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Root_declContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(FlatBuffersParser.IDENT, 0); }
		public Root_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterRoot_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitRoot_decl(this);
		}
	}

	public final Root_declContext root_decl() throws RecognitionException {
		Root_declContext _localctx = new Root_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_root_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__12);
			setState(119);
			match(IDENT);
			setState(120);
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

	public static class Field_declContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(FlatBuffersParser.IDENT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitField_decl(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_field_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(IDENT);
			setState(123);
			match(T__10);
			setState(124);
			type();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(125);
				match(T__13);
				setState(126);
				scalar();
				}
			}

			setState(129);
			metadata();
			setState(130);
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

	public static class Rpc_declContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(FlatBuffersParser.IDENT, 0); }
		public List<Rpc_methodContext> rpc_method() {
			return getRuleContexts(Rpc_methodContext.class);
		}
		public Rpc_methodContext rpc_method(int i) {
			return getRuleContext(Rpc_methodContext.class,i);
		}
		public Rpc_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rpc_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterRpc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitRpc_decl(this);
		}
	}

	public final Rpc_declContext rpc_decl() throws RecognitionException {
		Rpc_declContext _localctx = new Rpc_declContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rpc_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__14);
			setState(133);
			match(IDENT);
			setState(134);
			match(T__7);
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				rpc_method();
				}
				}
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			setState(140);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rpc_methodContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(FlatBuffersParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FlatBuffersParser.IDENT, i);
		}
		public MetadataContext metadata() {
			return getRuleContext(MetadataContext.class,0);
		}
		public Rpc_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rpc_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterRpc_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitRpc_method(this);
		}
	}

	public final Rpc_methodContext rpc_method() throws RecognitionException {
		Rpc_methodContext _localctx = new Rpc_methodContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rpc_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(IDENT);
			setState(143);
			match(T__15);
			setState(144);
			match(IDENT);
			setState(145);
			match(T__16);
			setState(146);
			match(T__10);
			setState(147);
			match(IDENT);
			setState(148);
			metadata();
			setState(149);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode BASE_TYPE_NAME() { return getToken(FlatBuffersParser.BASE_TYPE_NAME, 0); }
		public Ns_identContext ns_ident() {
			return getRuleContext(Ns_identContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(T__17);
				setState(152);
				type();
				setState(153);
				match(T__18);
				}
				break;
			case BASE_TYPE_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(BASE_TYPE_NAME);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				ns_ident();
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

	public static class Enumval_declContext extends ParserRuleContext {
		public Ns_identContext ns_ident() {
			return getRuleContext(Ns_identContext.class,0);
		}
		public TerminalNode INTEGER_CONSTANT() { return getToken(FlatBuffersParser.INTEGER_CONSTANT, 0); }
		public Enumval_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumval_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterEnumval_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitEnumval_decl(this);
		}
	}

	public final Enumval_declContext enumval_decl() throws RecognitionException {
		Enumval_declContext _localctx = new Enumval_declContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumval_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			ns_ident();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(160);
				match(T__13);
				setState(161);
				match(INTEGER_CONSTANT);
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

	public static class Commasep_enumval_declContext extends ParserRuleContext {
		public List<Enumval_declContext> enumval_decl() {
			return getRuleContexts(Enumval_declContext.class);
		}
		public Enumval_declContext enumval_decl(int i) {
			return getRuleContext(Enumval_declContext.class,i);
		}
		public Commasep_enumval_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commasep_enumval_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterCommasep_enumval_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitCommasep_enumval_decl(this);
		}
	}

	public final Commasep_enumval_declContext commasep_enumval_decl() throws RecognitionException {
		Commasep_enumval_declContext _localctx = new Commasep_enumval_declContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_commasep_enumval_decl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			enumval_decl();
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					match(T__19);
					setState(166);
					enumval_decl();
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(172);
				match(T__19);
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

	public static class Ident_with_opt_single_valueContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(FlatBuffersParser.IDENT, 0); }
		public Single_valueContext single_value() {
			return getRuleContext(Single_valueContext.class,0);
		}
		public Ident_with_opt_single_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident_with_opt_single_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterIdent_with_opt_single_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitIdent_with_opt_single_value(this);
		}
	}

	public final Ident_with_opt_single_valueContext ident_with_opt_single_value() throws RecognitionException {
		Ident_with_opt_single_valueContext _localctx = new Ident_with_opt_single_valueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ident_with_opt_single_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(IDENT);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(176);
				match(T__10);
				setState(177);
				single_value();
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

	public static class Commasep_ident_with_opt_single_valueContext extends ParserRuleContext {
		public List<Ident_with_opt_single_valueContext> ident_with_opt_single_value() {
			return getRuleContexts(Ident_with_opt_single_valueContext.class);
		}
		public Ident_with_opt_single_valueContext ident_with_opt_single_value(int i) {
			return getRuleContext(Ident_with_opt_single_valueContext.class,i);
		}
		public Commasep_ident_with_opt_single_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commasep_ident_with_opt_single_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterCommasep_ident_with_opt_single_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitCommasep_ident_with_opt_single_value(this);
		}
	}

	public final Commasep_ident_with_opt_single_valueContext commasep_ident_with_opt_single_value() throws RecognitionException {
		Commasep_ident_with_opt_single_valueContext _localctx = new Commasep_ident_with_opt_single_valueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_commasep_ident_with_opt_single_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			ident_with_opt_single_value();
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19) {
				{
				{
				setState(181);
				match(T__19);
				setState(182);
				ident_with_opt_single_value();
				}
				}
				setState(187);
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

	public static class MetadataContext extends ParserRuleContext {
		public Commasep_ident_with_opt_single_valueContext commasep_ident_with_opt_single_value() {
			return getRuleContext(Commasep_ident_with_opt_single_valueContext.class,0);
		}
		public MetadataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metadata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterMetadata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitMetadata(this);
		}
	}

	public final MetadataContext metadata() throws RecognitionException {
		MetadataContext _localctx = new MetadataContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_metadata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(188);
				match(T__15);
				setState(189);
				commasep_ident_with_opt_single_value();
				setState(190);
				match(T__16);
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

	public static class ScalarContext extends ParserRuleContext {
		public TerminalNode INTEGER_CONSTANT() { return getToken(FlatBuffersParser.INTEGER_CONSTANT, 0); }
		public TerminalNode FLOAT_CONSTANT() { return getToken(FlatBuffersParser.FLOAT_CONSTANT, 0); }
		public TerminalNode IDENT() { return getToken(FlatBuffersParser.IDENT, 0); }
		public ScalarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterScalar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitScalar(this);
		}
	}

	public final ScalarContext scalar() throws RecognitionException {
		ScalarContext _localctx = new ScalarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_scalar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENT) | (1L << INTEGER_CONSTANT) | (1L << FLOAT_CONSTANT))) != 0)) ) {
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

	public static class ObjectContext extends ParserRuleContext {
		public Commasep_ident_with_valueContext commasep_ident_with_value() {
			return getRuleContext(Commasep_ident_with_valueContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__7);
			setState(197);
			commasep_ident_with_value();
			setState(198);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ident_with_valueContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(FlatBuffersParser.IDENT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Ident_with_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident_with_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterIdent_with_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitIdent_with_value(this);
		}
	}

	public final Ident_with_valueContext ident_with_value() throws RecognitionException {
		Ident_with_valueContext _localctx = new Ident_with_valueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ident_with_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(IDENT);
			setState(201);
			match(T__10);
			setState(202);
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

	public static class Commasep_ident_with_valueContext extends ParserRuleContext {
		public List<Ident_with_valueContext> ident_with_value() {
			return getRuleContexts(Ident_with_valueContext.class);
		}
		public Ident_with_valueContext ident_with_value(int i) {
			return getRuleContext(Ident_with_valueContext.class,i);
		}
		public Commasep_ident_with_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commasep_ident_with_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterCommasep_ident_with_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitCommasep_ident_with_value(this);
		}
	}

	public final Commasep_ident_with_valueContext commasep_ident_with_value() throws RecognitionException {
		Commasep_ident_with_valueContext _localctx = new Commasep_ident_with_valueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_commasep_ident_with_value);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			ident_with_value();
			setState(209);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					match(T__19);
					setState(206);
					ident_with_value();
					}
					} 
				}
				setState(211);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(212);
				match(T__19);
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

	public static class Single_valueContext extends ParserRuleContext {
		public ScalarContext scalar() {
			return getRuleContext(ScalarContext.class,0);
		}
		public TerminalNode STRING_CONSTANT() { return getToken(FlatBuffersParser.STRING_CONSTANT, 0); }
		public Single_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterSingle_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitSingle_value(this);
		}
	}

	public final Single_valueContext single_value() throws RecognitionException {
		Single_valueContext _localctx = new Single_valueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_single_value);
		try {
			setState(217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
			case INTEGER_CONSTANT:
			case FLOAT_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				scalar();
				}
				break;
			case STRING_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(STRING_CONSTANT);
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

	public static class ValueContext extends ParserRuleContext {
		public Single_valueContext single_value() {
			return getRuleContext(Single_valueContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Commasep_valueContext commasep_value() {
			return getRuleContext(Commasep_valueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_value);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_CONSTANT:
			case IDENT:
			case INTEGER_CONSTANT:
			case FLOAT_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				single_value();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				object();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(T__17);
				setState(222);
				commasep_value();
				setState(223);
				match(T__18);
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

	public static class Commasep_valueContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public Commasep_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commasep_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterCommasep_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitCommasep_value(this);
		}
	}

	public final Commasep_valueContext commasep_value() throws RecognitionException {
		Commasep_valueContext _localctx = new Commasep_valueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_commasep_value);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			value();
			setState(232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(228);
					match(T__19);
					setState(229);
					value();
					}
					} 
				}
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(235);
				match(T__19);
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

	public static class File_extension_declContext extends ParserRuleContext {
		public TerminalNode STRING_CONSTANT() { return getToken(FlatBuffersParser.STRING_CONSTANT, 0); }
		public File_extension_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_extension_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterFile_extension_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitFile_extension_decl(this);
		}
	}

	public final File_extension_declContext file_extension_decl() throws RecognitionException {
		File_extension_declContext _localctx = new File_extension_declContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_file_extension_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__20);
			setState(239);
			match(STRING_CONSTANT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class File_identifier_declContext extends ParserRuleContext {
		public TerminalNode STRING_CONSTANT() { return getToken(FlatBuffersParser.STRING_CONSTANT, 0); }
		public File_identifier_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_identifier_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterFile_identifier_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitFile_identifier_decl(this);
		}
	}

	public final File_identifier_declContext file_identifier_decl() throws RecognitionException {
		File_identifier_declContext _localctx = new File_identifier_declContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_file_identifier_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(T__21);
			setState(242);
			match(STRING_CONSTANT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ns_identContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(FlatBuffersParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(FlatBuffersParser.IDENT, i);
		}
		public Ns_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ns_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).enterNs_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FlatBuffersListener ) ((FlatBuffersListener)listener).exitNs_ident(this);
		}
	}

	public final Ns_identContext ns_ident() throws RecognitionException {
		Ns_identContext _localctx = new Ns_identContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ns_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(IDENT);
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(245);
				match(T__3);
				setState(246);
				match(IDENT);
				}
				}
				setState(251);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u00ff\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\7\4S\n\4\f\4\16\4V\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7"+
		"\6c\n\6\f\6\16\6f\13\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7n\n\7\3\7\3\7\5\7r\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\6\n\u008b\n\n\r\n\16\n\u008c\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00a0\n\f\3\r\3\r\3\r\5\r\u00a5\n\r\3\16\3\16\3\16\7\16\u00aa\n\16"+
		"\f\16\16\16\u00ad\13\16\3\16\5\16\u00b0\n\16\3\17\3\17\3\17\5\17\u00b5"+
		"\n\17\3\20\3\20\3\20\7\20\u00ba\n\20\f\20\16\20\u00bd\13\20\3\21\3\21"+
		"\3\21\3\21\5\21\u00c3\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\7\25\u00d2\n\25\f\25\16\25\u00d5\13\25\3\25\5\25"+
		"\u00d8\n\25\3\26\3\26\5\26\u00dc\n\26\3\27\3\27\3\27\3\27\3\27\3\27\5"+
		"\27\u00e4\n\27\3\30\3\30\3\30\7\30\u00e9\n\30\f\30\16\30\u00ec\13\30\3"+
		"\30\5\30\u00ef\n\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\7\33"+
		"\u00fa\n\33\f\33\16\33\u00fd\13\33\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\2\4\3\2\b\t\3\2\33\35\2\u0104\29\3\2"+
		"\2\2\4J\3\2\2\2\6N\3\2\2\2\bY\3\2\2\2\n]\3\2\2\2\fq\3\2\2\2\16x\3\2\2"+
		"\2\20|\3\2\2\2\22\u0086\3\2\2\2\24\u0090\3\2\2\2\26\u009f\3\2\2\2\30\u00a1"+
		"\3\2\2\2\32\u00a6\3\2\2\2\34\u00b1\3\2\2\2\36\u00b6\3\2\2\2 \u00c2\3\2"+
		"\2\2\"\u00c4\3\2\2\2$\u00c6\3\2\2\2&\u00ca\3\2\2\2(\u00ce\3\2\2\2*\u00db"+
		"\3\2\2\2,\u00e3\3\2\2\2.\u00e5\3\2\2\2\60\u00f0\3\2\2\2\62\u00f3\3\2\2"+
		"\2\64\u00f6\3\2\2\2\668\5\4\3\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:"+
		"\3\2\2\2:G\3\2\2\2;9\3\2\2\2<F\5\6\4\2=F\5\n\6\2>F\5\f\7\2?F\5\16\b\2"+
		"@F\5\60\31\2AF\5\62\32\2BF\5\b\5\2CF\5\22\n\2DF\5$\23\2E<\3\2\2\2E=\3"+
		"\2\2\2E>\3\2\2\2E?\3\2\2\2E@\3\2\2\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3"+
		"\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\3\3\2\2\2IG\3\2\2\2JK\7\3\2\2KL"+
		"\7\31\2\2LM\7\4\2\2M\5\3\2\2\2NO\7\5\2\2OT\7\33\2\2PQ\7\6\2\2QS\7\33\2"+
		"\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VT\3\2\2\2WX\7\4\2"+
		"\2X\7\3\2\2\2YZ\7\7\2\2Z[\7\31\2\2[\\\7\4\2\2\\\t\3\2\2\2]^\t\2\2\2^_"+
		"\7\33\2\2_`\5 \21\2`d\7\n\2\2ac\5\20\t\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\13\2\2h\13\3\2\2\2ij\7\f\2\2jm\7\33"+
		"\2\2kl\7\r\2\2ln\5\26\f\2mk\3\2\2\2mn\3\2\2\2nr\3\2\2\2op\7\16\2\2pr\7"+
		"\33\2\2qi\3\2\2\2qo\3\2\2\2rs\3\2\2\2st\5 \21\2tu\7\n\2\2uv\5\32\16\2"+
		"vw\7\13\2\2w\r\3\2\2\2xy\7\17\2\2yz\7\33\2\2z{\7\4\2\2{\17\3\2\2\2|}\7"+
		"\33\2\2}~\7\r\2\2~\u0081\5\26\f\2\177\u0080\7\20\2\2\u0080\u0082\5\"\22"+
		"\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084"+
		"\5 \21\2\u0084\u0085\7\4\2\2\u0085\21\3\2\2\2\u0086\u0087\7\21\2\2\u0087"+
		"\u0088\7\33\2\2\u0088\u008a\7\n\2\2\u0089\u008b\5\24\13\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\7\13\2\2\u008f\23\3\2\2\2\u0090\u0091\7\33"+
		"\2\2\u0091\u0092\7\22\2\2\u0092\u0093\7\33\2\2\u0093\u0094\7\23\2\2\u0094"+
		"\u0095\7\r\2\2\u0095\u0096\7\33\2\2\u0096\u0097\5 \21\2\u0097\u0098\7"+
		"\4\2\2\u0098\25\3\2\2\2\u0099\u009a\7\24\2\2\u009a\u009b\5\26\f\2\u009b"+
		"\u009c\7\25\2\2\u009c\u00a0\3\2\2\2\u009d\u00a0\7\32\2\2\u009e\u00a0\5"+
		"\64\33\2\u009f\u0099\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0"+
		"\27\3\2\2\2\u00a1\u00a4\5\64\33\2\u00a2\u00a3\7\20\2\2\u00a3\u00a5\7\34"+
		"\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\31\3\2\2\2\u00a6\u00ab"+
		"\5\30\r\2\u00a7\u00a8\7\26\2\2\u00a8\u00aa\5\30\r\2\u00a9\u00a7\3\2\2"+
		"\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00af"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae\u00b0\7\26\2\2\u00af\u00ae\3\2\2\2"+
		"\u00af\u00b0\3\2\2\2\u00b0\33\3\2\2\2\u00b1\u00b4\7\33\2\2\u00b2\u00b3"+
		"\7\r\2\2\u00b3\u00b5\5*\26\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\35\3\2\2\2\u00b6\u00bb\5\34\17\2\u00b7\u00b8\7\26\2\2\u00b8\u00ba\5\34"+
		"\17\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\37\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\22\2"+
		"\2\u00bf\u00c0\5\36\20\2\u00c0\u00c1\7\23\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00be\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3!\3\2\2\2\u00c4\u00c5\t\3\2\2"+
		"\u00c5#\3\2\2\2\u00c6\u00c7\7\n\2\2\u00c7\u00c8\5(\25\2\u00c8\u00c9\7"+
		"\13\2\2\u00c9%\3\2\2\2\u00ca\u00cb\7\33\2\2\u00cb\u00cc\7\r\2\2\u00cc"+
		"\u00cd\5,\27\2\u00cd\'\3\2\2\2\u00ce\u00d3\5&\24\2\u00cf\u00d0\7\26\2"+
		"\2\u00d0\u00d2\5&\24\2\u00d1\u00cf\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00d8\7\26\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8)\3\2\2\2"+
		"\u00d9\u00dc\5\"\22\2\u00da\u00dc\7\31\2\2\u00db\u00d9\3\2\2\2\u00db\u00da"+
		"\3\2\2\2\u00dc+\3\2\2\2\u00dd\u00e4\5*\26\2\u00de\u00e4\5$\23\2\u00df"+
		"\u00e0\7\24\2\2\u00e0\u00e1\5.\30\2\u00e1\u00e2\7\25\2\2\u00e2\u00e4\3"+
		"\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4"+
		"-\3\2\2\2\u00e5\u00ea\5,\27\2\u00e6\u00e7\7\26\2\2\u00e7\u00e9\5,\27\2"+
		"\u00e8\u00e6\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00ef\7\26\2\2"+
		"\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef/\3\2\2\2\u00f0\u00f1\7"+
		"\27\2\2\u00f1\u00f2\7\31\2\2\u00f2\61\3\2\2\2\u00f3\u00f4\7\30\2\2\u00f4"+
		"\u00f5\7\31\2\2\u00f5\63\3\2\2\2\u00f6\u00fb\7\33\2\2\u00f7\u00f8\7\6"+
		"\2\2\u00f8\u00fa\7\33\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\65\3\2\2\2\u00fd\u00fb\3\2\2"+
		"\2\319EGTdmq\u0081\u008c\u009f\u00a4\u00ab\u00af\u00b4\u00bb\u00c2\u00d3"+
		"\u00d7\u00db\u00e3\u00ea\u00ee\u00fb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}