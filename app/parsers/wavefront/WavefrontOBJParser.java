// Generated from wavefront/WavefrontOBJ.g4 by ANTLR 4.7.1
package parsers.wavefront;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WavefrontOBJParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, GEOMETRIC_VERTEX=6, TEXTURE_VERTEX=7, 
		VERTEX_NORMAL=8, PARAMETER_SPACE_VERTEX=9, DEGREE=10, BASIS_MATRIX=11, 
		STEP_SIZE=12, CURVE_SURF_TYPE=13, POINT=14, LINE=15, FACE=16, CURVE=17, 
		CURVE2D=18, SURF=19, PARAM=20, OUTER_TRIMMING_HOLE=21, INNER_TRIMMING_HOLE=22, 
		SPECIAL_CURVE=23, SPECIAL_POINT=24, END=25, CONNECT=26, GROUP_NAME=27, 
		SMOOTHING_GROUP=28, MERGING_GROUP=29, OBJECT_NAME=30, BEVEL_INTERPOLATION=31, 
		COLOR_INTERPOLATION=32, DISSOLVE_INTERPOLATION=33, LEVEL_OF_DETAIL=34, 
		MATERIAL_NAME=35, MATERIAL_LIBRARY=36, SHADOW_CASTING=37, RAY_TRACING=38, 
		CURVE_APPROX=39, SURF_APPROX=40, INTEGER=41, DECIMAL=42, COMMENT=43, NAME=44, 
		WS=45;
	public static final int
		RULE_start = 0, RULE_line = 1, RULE_face = 2, RULE_vertex = 3, RULE_mtllib = 4, 
		RULE_object = 5, RULE_use_material = 6, RULE_group = 7;
	public static final String[] ruleNames = {
		"start", "line", "face", "vertex", "mtllib", "object", "use_material", 
		"group"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\r'", "'\n'", "'.mtl'", "'on'", "'off'", "'v'", "'vt'", "'vn'", 
		"'vp'", "'deg'", "'bmat'", "'step'", "'cstype'", "'p'", "'l'", "'f'", 
		"'curv'", "'curv2'", "'surf'", "'parm'", "'trim'", "'hole'", "'scrv'", 
		"'sp'", "'end'", "'con'", "'g'", "'s'", "'mg'", "'o'", "'bevel'", "'c_interp'", 
		"'d_interp'", "'lod'", "'usemtl'", "'mtllib'", "'shadow_obj'", "'trace_obj'", 
		"'ctech'", "'stech'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "GEOMETRIC_VERTEX", "TEXTURE_VERTEX", 
		"VERTEX_NORMAL", "PARAMETER_SPACE_VERTEX", "DEGREE", "BASIS_MATRIX", "STEP_SIZE", 
		"CURVE_SURF_TYPE", "POINT", "LINE", "FACE", "CURVE", "CURVE2D", "SURF", 
		"PARAM", "OUTER_TRIMMING_HOLE", "INNER_TRIMMING_HOLE", "SPECIAL_CURVE", 
		"SPECIAL_POINT", "END", "CONNECT", "GROUP_NAME", "SMOOTHING_GROUP", "MERGING_GROUP", 
		"OBJECT_NAME", "BEVEL_INTERPOLATION", "COLOR_INTERPOLATION", "DISSOLVE_INTERPOLATION", 
		"LEVEL_OF_DETAIL", "MATERIAL_NAME", "MATERIAL_LIBRARY", "SHADOW_CASTING", 
		"RAY_TRACING", "CURVE_APPROX", "SURF_APPROX", "INTEGER", "DECIMAL", "COMMENT", 
		"NAME", "WS"
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
	public String getGrammarFileName() { return "WavefrontOBJ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WavefrontOBJParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavefrontOBJListener ) ((WavefrontOBJListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavefrontOBJListener ) ((WavefrontOBJListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				line();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GEOMETRIC_VERTEX) | (1L << TEXTURE_VERTEX) | (1L << VERTEX_NORMAL) | (1L << PARAMETER_SPACE_VERTEX) | (1L << FACE) | (1L << SMOOTHING_GROUP) | (1L << OBJECT_NAME) | (1L << MATERIAL_NAME) | (1L << MATERIAL_LIBRARY))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public VertexContext vertex() {
			return getRuleContext(VertexContext.class,0);
		}
		public FaceContext face() {
			return getRuleContext(FaceContext.class,0);
		}
		public MtllibContext mtllib() {
			return getRuleContext(MtllibContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Use_materialContext use_material() {
			return getRuleContext(Use_materialContext.class,0);
		}
		public GroupContext group() {
			return getRuleContext(GroupContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavefrontOBJListener ) ((WavefrontOBJListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavefrontOBJListener ) ((WavefrontOBJListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GEOMETRIC_VERTEX:
			case TEXTURE_VERTEX:
			case VERTEX_NORMAL:
			case PARAMETER_SPACE_VERTEX:
				{
				setState(21);
				vertex();
				}
				break;
			case FACE:
				{
				setState(22);
				face();
				}
				break;
			case MATERIAL_LIBRARY:
				{
				setState(23);
				mtllib();
				}
				break;
			case OBJECT_NAME:
				{
				setState(24);
				object();
				}
				break;
			case MATERIAL_NAME:
				{
				setState(25);
				use_material();
				}
				break;
			case SMOOTHING_GROUP:
				{
				setState(26);
				group();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(29);
				match(T__0);
				}
			}

			setState(32);
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

	public static class FaceContext extends ParserRuleContext {
		public TerminalNode FACE() { return getToken(WavefrontOBJParser.FACE, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(WavefrontOBJParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(WavefrontOBJParser.INTEGER, i);
		}
		public FaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_face; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavefrontOBJListener ) ((WavefrontOBJListener)listener).enterFace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavefrontOBJListener ) ((WavefrontOBJListener)listener).exitFace(this);
		}
	}

	public final FaceContext face() throws RecognitionException {
		FaceContext _localctx = new FaceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_face);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(FACE);
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				match(INTEGER);
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INTEGER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VertexContext extends ParserRuleContext {
		public List<TerminalNode> DECIMAL() { return getTokens(WavefrontOBJParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(WavefrontOBJParser.DECIMAL, i);
		}
		public TerminalNode GEOMETRIC_VERTEX() { return getToken(WavefrontOBJParser.GEOMETRIC_VERTEX, 0); }
		public TerminalNode TEXTURE_VERTEX() { return getToken(WavefrontOBJParser.TEXTURE_VERTEX, 0); }
		public TerminalNode VERTEX_NORMAL() { return getToken(WavefrontOBJParser.VERTEX_NORMAL, 0); }
		public TerminalNode PARAMETER_SPACE_VERTEX() { return getToken(WavefrontOBJParser.PARAMETER_SPACE_VERTEX, 0); }
		public VertexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavefrontOBJListener ) ((WavefrontOBJListener)listener).enterVertex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavefrontOBJListener ) ((WavefrontOBJListener)listener).exitVertex(this);
		}
	}

	public final VertexContext vertex() throws RecognitionException {
		VertexContext _localctx = new VertexContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vertex);
		int _la;
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GEOMETRIC_VERTEX:
			case TEXTURE_VERTEX:
			case VERTEX_NORMAL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(40);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GEOMETRIC_VERTEX) | (1L << TEXTURE_VERTEX) | (1L << VERTEX_NORMAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(41);
				match(DECIMAL);
				setState(42);
				match(DECIMAL);
				setState(43);
				match(DECIMAL);
				}
				}
				break;
			case PARAMETER_SPACE_VERTEX:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(44);
				match(PARAMETER_SPACE_VERTEX);
				setState(45);
				match(DECIMAL);
				setState(46);
				match(DECIMAL);
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

	public static class MtllibContext extends ParserRuleContext {
		public Token a;
		public TerminalNode MATERIAL_LIBRARY() { return getToken(WavefrontOBJParser.MATERIAL_LIBRARY, 0); }
		public TerminalNode NAME() { return getToken(WavefrontOBJParser.NAME, 0); }
		public MtllibContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mtllib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavefrontOBJListener ) ((WavefrontOBJListener)listener).enterMtllib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavefrontOBJListener ) ((WavefrontOBJListener)listener).exitMtllib(this);
		}
	}

	public final MtllibContext mtllib() throws RecognitionException {
		MtllibContext _localctx = new MtllibContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mtllib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(MATERIAL_LIBRARY);
			setState(50);
			((MtllibContext)_localctx).a = match(NAME);
			setState(51);
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

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode OBJECT_NAME() { return getToken(WavefrontOBJParser.OBJECT_NAME, 0); }
		public TerminalNode NAME() { return getToken(WavefrontOBJParser.NAME, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavefrontOBJListener ) ((WavefrontOBJListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavefrontOBJListener ) ((WavefrontOBJListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(OBJECT_NAME);
			setState(54);
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

	public static class Use_materialContext extends ParserRuleContext {
		public TerminalNode MATERIAL_NAME() { return getToken(WavefrontOBJParser.MATERIAL_NAME, 0); }
		public TerminalNode NAME() { return getToken(WavefrontOBJParser.NAME, 0); }
		public Use_materialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_material; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavefrontOBJListener ) ((WavefrontOBJListener)listener).enterUse_material(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavefrontOBJListener ) ((WavefrontOBJListener)listener).exitUse_material(this);
		}
	}

	public final Use_materialContext use_material() throws RecognitionException {
		Use_materialContext _localctx = new Use_materialContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_use_material);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(MATERIAL_NAME);
			setState(57);
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

	public static class GroupContext extends ParserRuleContext {
		public TerminalNode SMOOTHING_GROUP() { return getToken(WavefrontOBJParser.SMOOTHING_GROUP, 0); }
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WavefrontOBJListener ) ((WavefrontOBJListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WavefrontOBJListener ) ((WavefrontOBJListener)listener).exitGroup(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(SMOOTHING_GROUP);
			setState(60);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__4) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/A\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\24\n\2\r\2\16"+
		"\2\25\3\3\3\3\3\3\3\3\3\3\3\3\5\3\36\n\3\3\3\5\3!\n\3\3\3\3\3\3\4\3\4"+
		"\6\4\'\n\4\r\4\16\4(\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\62\n\5\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20"+
		"\2\4\3\2\b\n\3\2\6\7\2A\2\23\3\2\2\2\4\35\3\2\2\2\6$\3\2\2\2\b\61\3\2"+
		"\2\2\n\63\3\2\2\2\f\67\3\2\2\2\16:\3\2\2\2\20=\3\2\2\2\22\24\5\4\3\2\23"+
		"\22\3\2\2\2\24\25\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\3\3\2\2\2\27"+
		"\36\5\b\5\2\30\36\5\6\4\2\31\36\5\n\6\2\32\36\5\f\7\2\33\36\5\16\b\2\34"+
		"\36\5\20\t\2\35\27\3\2\2\2\35\30\3\2\2\2\35\31\3\2\2\2\35\32\3\2\2\2\35"+
		"\33\3\2\2\2\35\34\3\2\2\2\36 \3\2\2\2\37!\7\3\2\2 \37\3\2\2\2 !\3\2\2"+
		"\2!\"\3\2\2\2\"#\7\4\2\2#\5\3\2\2\2$&\7\22\2\2%\'\7+\2\2&%\3\2\2\2\'("+
		"\3\2\2\2(&\3\2\2\2()\3\2\2\2)\7\3\2\2\2*+\t\2\2\2+,\7,\2\2,-\7,\2\2-\62"+
		"\7,\2\2./\7\13\2\2/\60\7,\2\2\60\62\7,\2\2\61*\3\2\2\2\61.\3\2\2\2\62"+
		"\t\3\2\2\2\63\64\7&\2\2\64\65\7.\2\2\65\66\7\5\2\2\66\13\3\2\2\2\678\7"+
		" \2\289\7.\2\29\r\3\2\2\2:;\7%\2\2;<\7.\2\2<\17\3\2\2\2=>\7\36\2\2>?\t"+
		"\3\2\2?\21\3\2\2\2\7\25\35 (\61";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}