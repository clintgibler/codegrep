// Generated from sgf/sgf.g4 by ANTLR 4.7.1
package parsers.sgf;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class sgfParser extends Parser {
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
		COLOR=74, UCLETTER=75, NONE=76, TEXT=77, WS=78;
	public static final int
		RULE_collection = 0, RULE_gameTree = 1, RULE_sequence = 2, RULE_node = 3, 
		RULE_property = 4, RULE_move = 5, RULE_setup = 6, RULE_nodeAnnotation = 7, 
		RULE_moveAnnotation = 8, RULE_markup = 9, RULE_root = 10, RULE_gameInfo = 11, 
		RULE_timing = 12, RULE_misc = 13, RULE_loa = 14, RULE_go = 15, RULE_privateProp = 16;
	public static final String[] ruleNames = {
		"collection", "gameTree", "sequence", "node", "property", "move", "setup", 
		"nodeAnnotation", "moveAnnotation", "markup", "root", "gameInfo", "timing", 
		"misc", "loa", "go", "privateProp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "';'", "'KO'", "'MN'", "'AB'", "'AE'", "'AW'", "'PL'", 
		"'C'", "'DM'", "'GB'", "'GW'", "'HO'", "'N'", "'UC'", "'V'", "'BM'", "'DO'", 
		"'IT'", "'TE'", "'AR'", "'CR'", "'DD'", "'LB'", "'LN'", "'MA'", "'SL'", 
		"'SQ'", "'TR'", "'AP'", "'CA'", "'FF'", "'GM'", "'ST'", "'SZ'", "'AN'", 
		"'BR'", "'BT'", "'CP'", "'DT'", "'EV'", "'GN'", "'GC'", "'ON'", "'OT'", 
		"'PB'", "'PC'", "'PW'", "'RE'", "'RO'", "'RU'", "'SO'", "'TM'", "'US'", 
		"'WR'", "'WT'", "'BL'", "'OB'", "'OW'", "'WL'", "'FG'", "'PM'", "'VW'", 
		"'AS'", "'IP'", "'IY'", "'SE'", "'SU'", "'HA'", "'KM'", "'TB'", "'TW'", 
		null, null, "'[]'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "COLOR", "UCLETTER", "NONE", "TEXT", "WS"
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
	public String getGrammarFileName() { return "sgf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sgfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CollectionContext extends ParserRuleContext {
		public List<GameTreeContext> gameTree() {
			return getRuleContexts(GameTreeContext.class);
		}
		public GameTreeContext gameTree(int i) {
			return getRuleContext(GameTreeContext.class,i);
		}
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).enterCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).exitCollection(this);
		}
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_collection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				gameTree();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GameTreeContext extends ParserRuleContext {
		public SequenceContext sequence() {
			return getRuleContext(SequenceContext.class,0);
		}
		public List<GameTreeContext> gameTree() {
			return getRuleContexts(GameTreeContext.class);
		}
		public GameTreeContext gameTree(int i) {
			return getRuleContext(GameTreeContext.class,i);
		}
		public GameTreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameTree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).enterGameTree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).exitGameTree(this);
		}
	}

	public final GameTreeContext gameTree() throws RecognitionException {
		GameTreeContext _localctx = new GameTreeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_gameTree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(T__0);
			setState(40);
			sequence();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(41);
				gameTree();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
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

	public static class SequenceContext extends ParserRuleContext {
		public List<NodeContext> node() {
			return getRuleContexts(NodeContext.class);
		}
		public NodeContext node(int i) {
			return getRuleContext(NodeContext.class,i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).exitSequence(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				node();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodeContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).exitNode(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_node);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__2);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (COLOR - 64)) | (1L << (UCLETTER - 64)))) != 0)) {
				{
				{
				setState(55);
				property();
				}
				}
				setState(60);
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
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
		}
		public SetupContext setup() {
			return getRuleContext(SetupContext.class,0);
		}
		public NodeAnnotationContext nodeAnnotation() {
			return getRuleContext(NodeAnnotationContext.class,0);
		}
		public MoveAnnotationContext moveAnnotation() {
			return getRuleContext(MoveAnnotationContext.class,0);
		}
		public MarkupContext markup() {
			return getRuleContext(MarkupContext.class,0);
		}
		public RootContext root() {
			return getRuleContext(RootContext.class,0);
		}
		public GameInfoContext gameInfo() {
			return getRuleContext(GameInfoContext.class,0);
		}
		public TimingContext timing() {
			return getRuleContext(TimingContext.class,0);
		}
		public MiscContext misc() {
			return getRuleContext(MiscContext.class,0);
		}
		public LoaContext loa() {
			return getRuleContext(LoaContext.class,0);
		}
		public GoContext go() {
			return getRuleContext(GoContext.class,0);
		}
		public PrivatePropContext privateProp() {
			return getRuleContext(PrivatePropContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).exitProperty(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_property);
		try {
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
			case COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				move();
				}
				break;
			case T__5:
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				setup();
				}
				break;
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				nodeAnnotation();
				}
				break;
			case T__17:
			case T__18:
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				moveAnnotation();
				}
				break;
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				markup();
				}
				break;
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				root();
				}
				break;
			case T__36:
			case T__37:
			case T__38:
			case T__39:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
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
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				gameInfo();
				}
				break;
			case T__57:
			case T__58:
			case T__59:
			case T__60:
				enterOuterAlt(_localctx, 8);
				{
				setState(68);
				timing();
				}
				break;
			case T__61:
			case T__62:
			case T__63:
				enterOuterAlt(_localctx, 9);
				{
				setState(69);
				misc();
				}
				break;
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
				enterOuterAlt(_localctx, 10);
				{
				setState(70);
				loa();
				}
				break;
			case T__69:
			case T__70:
			case T__71:
			case T__72:
				enterOuterAlt(_localctx, 11);
				{
				setState(71);
				go();
				}
				break;
			case UCLETTER:
				enterOuterAlt(_localctx, 12);
				{
				setState(72);
				privateProp();
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

	public static class MoveContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(sgfParser.COLOR, 0); }
		public TerminalNode NONE() { return getToken(sgfParser.NONE, 0); }
		public TerminalNode TEXT() { return getToken(sgfParser.TEXT, 0); }
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).exitMove(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_move);
		int _la;
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(COLOR);
				setState(76);
				_la = _input.LA(1);
				if ( !(_la==NONE || _la==TEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(T__3);
				setState(78);
				match(NONE);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(T__4);
				setState(80);
				match(TEXT);
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

	public static class SetupContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(sgfParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(sgfParser.TEXT, i);
		}
		public SetupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).enterSetup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).exitSetup(this);
		}
	}

	public final SetupContext setup() throws RecognitionException {
		SetupContext _localctx = new SetupContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_setup);
		int _la;
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(T__5);
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(84);
					match(TEXT);
					}
					}
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(T__6);
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(90);
					match(TEXT);
					}
					}
					setState(93); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(T__7);
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96);
					match(TEXT);
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(T__8);
				setState(102);
				match(TEXT);
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

	public static class NodeAnnotationContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(sgfParser.TEXT, 0); }
		public NodeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).enterNodeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).exitNodeAnnotation(this);
		}
	}

	public final NodeAnnotationContext nodeAnnotation() throws RecognitionException {
		NodeAnnotationContext _localctx = new NodeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nodeAnnotation);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(T__9);
				setState(106);
				match(TEXT);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(T__10);
				setState(108);
				match(TEXT);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(T__11);
				setState(110);
				match(TEXT);
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				match(T__12);
				setState(112);
				match(TEXT);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(113);
				match(T__13);
				setState(114);
				match(TEXT);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				match(T__14);
				setState(116);
				match(TEXT);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				match(T__15);
				setState(118);
				match(TEXT);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 8);
				{
				setState(119);
				match(T__16);
				setState(120);
				match(TEXT);
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

	public static class MoveAnnotationContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(sgfParser.TEXT, 0); }
		public TerminalNode NONE() { return getToken(sgfParser.NONE, 0); }
		public MoveAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moveAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).enterMoveAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).exitMoveAnnotation(this);
		}
	}

	public final MoveAnnotationContext moveAnnotation() throws RecognitionException {
		MoveAnnotationContext _localctx = new MoveAnnotationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_moveAnnotation);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				match(T__17);
				setState(124);
				match(TEXT);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(T__18);
				setState(126);
				match(NONE);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				match(T__19);
				setState(128);
				match(NONE);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				match(T__20);
				setState(130);
				match(TEXT);
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

	public static class MarkupContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(sgfParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(sgfParser.TEXT, i);
		}
		public TerminalNode NONE() { return getToken(sgfParser.NONE, 0); }
		public MarkupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_markup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).enterMarkup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).exitMarkup(this);
		}
	}

	public final MarkupContext markup() throws RecognitionException {
		MarkupContext _localctx = new MarkupContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_markup);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(T__21);
				setState(135); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(134);
					match(TEXT);
					}
					}
					setState(137); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(T__22);
				setState(141); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(140);
					match(TEXT);
					}
					}
					setState(143); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				match(T__23);
				setState(152);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NONE:
					{
					setState(146);
					match(NONE);
					}
					break;
				case TEXT:
					{
					setState(148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(147);
						match(TEXT);
						}
						}
						setState(150); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TEXT );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(T__24);
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(155);
					match(TEXT);
					}
					}
					setState(158); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(160);
				match(T__25);
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(161);
					match(TEXT);
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
				match(T__26);
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(167);
					match(TEXT);
					}
					}
					setState(170); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				match(T__27);
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(173);
					match(TEXT);
					}
					}
					setState(176); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 8);
				{
				setState(178);
				match(T__28);
				setState(180); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(179);
					match(TEXT);
					}
					}
					setState(182); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 9);
				{
				setState(184);
				match(T__29);
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(185);
					match(TEXT);
					}
					}
					setState(188); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
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

	public static class RootContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(sgfParser.TEXT, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_root);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(T__30);
				setState(193);
				match(TEXT);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(T__31);
				setState(195);
				match(TEXT);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(T__32);
				setState(197);
				match(TEXT);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				match(T__33);
				setState(199);
				match(TEXT);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 5);
				{
				setState(200);
				match(T__34);
				setState(201);
				match(TEXT);
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				match(T__35);
				setState(203);
				match(TEXT);
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

	public static class GameInfoContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(sgfParser.TEXT, 0); }
		public GameInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).enterGameInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).exitGameInfo(this);
		}
	}

	public final GameInfoContext gameInfo() throws RecognitionException {
		GameInfoContext _localctx = new GameInfoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_gameInfo);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__36:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(T__36);
				setState(207);
				match(TEXT);
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__37);
				setState(209);
				match(TEXT);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				match(T__38);
				setState(211);
				match(TEXT);
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				match(T__39);
				setState(213);
				match(TEXT);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 5);
				{
				setState(214);
				match(T__40);
				setState(215);
				match(TEXT);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 6);
				{
				setState(216);
				match(T__41);
				setState(217);
				match(TEXT);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 7);
				{
				setState(218);
				match(T__42);
				setState(219);
				match(TEXT);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 8);
				{
				setState(220);
				match(T__43);
				setState(221);
				match(TEXT);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 9);
				{
				setState(222);
				match(T__44);
				setState(223);
				match(TEXT);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 10);
				{
				setState(224);
				match(T__45);
				setState(225);
				match(TEXT);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 11);
				{
				setState(226);
				match(T__46);
				setState(227);
				match(TEXT);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 12);
				{
				setState(228);
				match(T__47);
				setState(229);
				match(TEXT);
				}
				break;
			case T__48:
				enterOuterAlt(_localctx, 13);
				{
				setState(230);
				match(T__48);
				setState(231);
				match(TEXT);
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 14);
				{
				setState(232);
				match(T__49);
				setState(233);
				match(TEXT);
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 15);
				{
				setState(234);
				match(T__50);
				setState(235);
				match(TEXT);
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 16);
				{
				setState(236);
				match(T__51);
				setState(237);
				match(TEXT);
				}
				break;
			case T__52:
				enterOuterAlt(_localctx, 17);
				{
				setState(238);
				match(T__52);
				setState(239);
				match(TEXT);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 18);
				{
				setState(240);
				match(T__53);
				setState(241);
				match(TEXT);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 19);
				{
				setState(242);
				match(T__54);
				setState(243);
				match(TEXT);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 20);
				{
				setState(244);
				match(T__55);
				setState(245);
				match(TEXT);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 21);
				{
				setState(246);
				match(T__56);
				setState(247);
				match(TEXT);
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

	public static class TimingContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(sgfParser.TEXT, 0); }
		public TimingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).enterTiming(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).exitTiming(this);
		}
	}

	public final TimingContext timing() throws RecognitionException {
		TimingContext _localctx = new TimingContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_timing);
		try {
			setState(258);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__57:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				match(T__57);
				setState(251);
				match(TEXT);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				match(T__58);
				setState(253);
				match(TEXT);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 3);
				{
				setState(254);
				match(T__59);
				setState(255);
				match(TEXT);
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				match(T__60);
				setState(257);
				match(TEXT);
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

	public static class MiscContext extends ParserRuleContext {
		public TerminalNode NONE() { return getToken(sgfParser.NONE, 0); }
		public List<TerminalNode> TEXT() { return getTokens(sgfParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(sgfParser.TEXT, i);
		}
		public MiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_misc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).enterMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).exitMisc(this);
		}
	}

	public final MiscContext misc() throws RecognitionException {
		MiscContext _localctx = new MiscContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_misc);
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__61:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(T__61);
				setState(261);
				_la = _input.LA(1);
				if ( !(_la==NONE || _la==TEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(T__62);
				setState(263);
				match(TEXT);
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(T__63);
				setState(266); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(265);
					match(TEXT);
					}
					}
					setState(268); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
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

	public static class LoaContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(sgfParser.TEXT, 0); }
		public LoaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).enterLoa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).exitLoa(this);
		}
	}

	public final LoaContext loa() throws RecognitionException {
		LoaContext _localctx = new LoaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loa);
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__64:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(T__64);
				setState(273);
				match(TEXT);
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(T__65);
				setState(275);
				match(TEXT);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				match(T__66);
				setState(277);
				match(TEXT);
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 4);
				{
				setState(278);
				match(T__67);
				setState(279);
				match(TEXT);
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				match(T__68);
				setState(281);
				match(TEXT);
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

	public static class GoContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(sgfParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(sgfParser.TEXT, i);
		}
		public TerminalNode NONE() { return getToken(sgfParser.NONE, 0); }
		public GoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_go; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).enterGo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).exitGo(this);
		}
	}

	public final GoContext go() throws RecognitionException {
		GoContext _localctx = new GoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_go);
		int _la;
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__69:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(T__69);
				setState(285);
				match(TEXT);
				}
				break;
			case T__70:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				match(T__70);
				setState(287);
				match(TEXT);
				}
				break;
			case T__71:
				enterOuterAlt(_localctx, 3);
				{
				setState(288);
				match(T__71);
				setState(295);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NONE:
					{
					setState(289);
					match(NONE);
					}
					break;
				case TEXT:
					{
					setState(291); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(290);
						match(TEXT);
						}
						}
						setState(293); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TEXT );
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__72:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				match(T__72);
				setState(304);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NONE:
					{
					setState(298);
					match(NONE);
					}
					break;
				case TEXT:
					{
					setState(300); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(299);
						match(TEXT);
						}
						}
						setState(302); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==TEXT );
					}
					break;
				default:
					throw new NoViableAltException(this);
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

	public static class PrivatePropContext extends ParserRuleContext {
		public TerminalNode UCLETTER() { return getToken(sgfParser.UCLETTER, 0); }
		public TerminalNode NONE() { return getToken(sgfParser.NONE, 0); }
		public List<TerminalNode> TEXT() { return getTokens(sgfParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(sgfParser.TEXT, i);
		}
		public PrivatePropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privateProp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).enterPrivateProp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sgfListener ) ((sgfListener)listener).exitPrivateProp(this);
		}
	}

	public final PrivatePropContext privateProp() throws RecognitionException {
		PrivatePropContext _localctx = new PrivatePropContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_privateProp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(UCLETTER);
			setState(315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NONE:
				{
				setState(309);
				match(NONE);
				}
				break;
			case TEXT:
				{
				setState(311); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(310);
					match(TEXT);
					}
					}
					setState(313); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TEXT );
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u0140\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\6\2&\n\2\r\2\16\2\'\3\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\3\3"+
		"\3\4\6\4\65\n\4\r\4\16\4\66\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6L\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7T\n\7\3\b\3\b\6\bX\n\b\r\b\16\bY\3\b\3\b\6\b^\n\b\r\b\16\b_\3\b"+
		"\3\b\6\bd\n\b\r\b\16\be\3\b\3\b\5\bj\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t|\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u0086\n\n\3\13\3\13\6\13\u008a\n\13\r\13\16\13\u008b\3\13\3"+
		"\13\6\13\u0090\n\13\r\13\16\13\u0091\3\13\3\13\3\13\6\13\u0097\n\13\r"+
		"\13\16\13\u0098\5\13\u009b\n\13\3\13\3\13\6\13\u009f\n\13\r\13\16\13\u00a0"+
		"\3\13\3\13\6\13\u00a5\n\13\r\13\16\13\u00a6\3\13\3\13\6\13\u00ab\n\13"+
		"\r\13\16\13\u00ac\3\13\3\13\6\13\u00b1\n\13\r\13\16\13\u00b2\3\13\3\13"+
		"\6\13\u00b7\n\13\r\13\16\13\u00b8\3\13\3\13\6\13\u00bd\n\13\r\13\16\13"+
		"\u00be\5\13\u00c1\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00cf\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00fb\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u0105\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\6\17\u010d\n\17\r\17\16\17\u010e\5\17\u0111\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u011d\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\6\21\u0126\n\21\r\21\16\21\u0127\5\21\u012a\n\21\3\21\3\21"+
		"\3\21\6\21\u012f\n\21\r\21\16\21\u0130\5\21\u0133\n\21\5\21\u0135\n\21"+
		"\3\22\3\22\3\22\6\22\u013a\n\22\r\22\16\22\u013b\5\22\u013e\n\22\3\22"+
		"\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\3\3\2NO\2\u018d\2"+
		"%\3\2\2\2\4)\3\2\2\2\6\64\3\2\2\2\b8\3\2\2\2\nK\3\2\2\2\fS\3\2\2\2\16"+
		"i\3\2\2\2\20{\3\2\2\2\22\u0085\3\2\2\2\24\u00c0\3\2\2\2\26\u00ce\3\2\2"+
		"\2\30\u00fa\3\2\2\2\32\u0104\3\2\2\2\34\u0110\3\2\2\2\36\u011c\3\2\2\2"+
		" \u0134\3\2\2\2\"\u0136\3\2\2\2$&\5\4\3\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2"+
		"\2\2\'(\3\2\2\2(\3\3\2\2\2)*\7\3\2\2*.\5\6\4\2+-\5\4\3\2,+\3\2\2\2-\60"+
		"\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\7\4\2\2\62"+
		"\5\3\2\2\2\63\65\5\b\5\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66"+
		"\67\3\2\2\2\67\7\3\2\2\28<\7\5\2\29;\5\n\6\2:9\3\2\2\2;>\3\2\2\2<:\3\2"+
		"\2\2<=\3\2\2\2=\t\3\2\2\2><\3\2\2\2?L\5\f\7\2@L\5\16\b\2AL\5\20\t\2BL"+
		"\5\22\n\2CL\5\24\13\2DL\5\26\f\2EL\5\30\r\2FL\5\32\16\2GL\5\34\17\2HL"+
		"\5\36\20\2IL\5 \21\2JL\5\"\22\2K?\3\2\2\2K@\3\2\2\2KA\3\2\2\2KB\3\2\2"+
		"\2KC\3\2\2\2KD\3\2\2\2KE\3\2\2\2KF\3\2\2\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2"+
		"\2KJ\3\2\2\2L\13\3\2\2\2MN\7L\2\2NT\t\2\2\2OP\7\6\2\2PT\7N\2\2QR\7\7\2"+
		"\2RT\7O\2\2SM\3\2\2\2SO\3\2\2\2SQ\3\2\2\2T\r\3\2\2\2UW\7\b\2\2VX\7O\2"+
		"\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Zj\3\2\2\2[]\7\t\2\2\\^\7O\2"+
		"\2]\\\3\2\2\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`j\3\2\2\2ac\7\n\2\2bd\7O\2"+
		"\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fj\3\2\2\2gh\7\13\2\2hj\7O\2"+
		"\2iU\3\2\2\2i[\3\2\2\2ia\3\2\2\2ig\3\2\2\2j\17\3\2\2\2kl\7\f\2\2l|\7O"+
		"\2\2mn\7\r\2\2n|\7O\2\2op\7\16\2\2p|\7O\2\2qr\7\17\2\2r|\7O\2\2st\7\20"+
		"\2\2t|\7O\2\2uv\7\21\2\2v|\7O\2\2wx\7\22\2\2x|\7O\2\2yz\7\23\2\2z|\7O"+
		"\2\2{k\3\2\2\2{m\3\2\2\2{o\3\2\2\2{q\3\2\2\2{s\3\2\2\2{u\3\2\2\2{w\3\2"+
		"\2\2{y\3\2\2\2|\21\3\2\2\2}~\7\24\2\2~\u0086\7O\2\2\177\u0080\7\25\2\2"+
		"\u0080\u0086\7N\2\2\u0081\u0082\7\26\2\2\u0082\u0086\7N\2\2\u0083\u0084"+
		"\7\27\2\2\u0084\u0086\7O\2\2\u0085}\3\2\2\2\u0085\177\3\2\2\2\u0085\u0081"+
		"\3\2\2\2\u0085\u0083\3\2\2\2\u0086\23\3\2\2\2\u0087\u0089\7\30\2\2\u0088"+
		"\u008a\7O\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u00c1\3\2\2\2\u008d\u008f\7\31\2\2\u008e"+
		"\u0090\7O\2\2\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u00c1\3\2\2\2\u0093\u009a\7\32\2\2\u0094"+
		"\u009b\7N\2\2\u0095\u0097\7O\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2"+
		"\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0094"+
		"\3\2\2\2\u009a\u0096\3\2\2\2\u009b\u00c1\3\2\2\2\u009c\u009e\7\33\2\2"+
		"\u009d\u009f\7O\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e"+
		"\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00c1\3\2\2\2\u00a2\u00a4\7\34\2\2"+
		"\u00a3\u00a5\7O\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00c1\3\2\2\2\u00a8\u00aa\7\35\2\2"+
		"\u00a9\u00ab\7O\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00c1\3\2\2\2\u00ae\u00b0\7\36\2\2"+
		"\u00af\u00b1\7O\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00c1\3\2\2\2\u00b4\u00b6\7\37\2\2"+
		"\u00b5\u00b7\7O\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00c1\3\2\2\2\u00ba\u00bc\7 \2\2\u00bb"+
		"\u00bd\7O\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u0087\3\2\2\2\u00c0"+
		"\u008d\3\2\2\2\u00c0\u0093\3\2\2\2\u00c0\u009c\3\2\2\2\u00c0\u00a2\3\2"+
		"\2\2\u00c0\u00a8\3\2\2\2\u00c0\u00ae\3\2\2\2\u00c0\u00b4\3\2\2\2\u00c0"+
		"\u00ba\3\2\2\2\u00c1\25\3\2\2\2\u00c2\u00c3\7!\2\2\u00c3\u00cf\7O\2\2"+
		"\u00c4\u00c5\7\"\2\2\u00c5\u00cf\7O\2\2\u00c6\u00c7\7#\2\2\u00c7\u00cf"+
		"\7O\2\2\u00c8\u00c9\7$\2\2\u00c9\u00cf\7O\2\2\u00ca\u00cb\7%\2\2\u00cb"+
		"\u00cf\7O\2\2\u00cc\u00cd\7&\2\2\u00cd\u00cf\7O\2\2\u00ce\u00c2\3\2\2"+
		"\2\u00ce\u00c4\3\2\2\2\u00ce\u00c6\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00ca"+
		"\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\27\3\2\2\2\u00d0\u00d1\7\'\2\2\u00d1"+
		"\u00fb\7O\2\2\u00d2\u00d3\7(\2\2\u00d3\u00fb\7O\2\2\u00d4\u00d5\7)\2\2"+
		"\u00d5\u00fb\7O\2\2\u00d6\u00d7\7*\2\2\u00d7\u00fb\7O\2\2\u00d8\u00d9"+
		"\7+\2\2\u00d9\u00fb\7O\2\2\u00da\u00db\7,\2\2\u00db\u00fb\7O\2\2\u00dc"+
		"\u00dd\7-\2\2\u00dd\u00fb\7O\2\2\u00de\u00df\7.\2\2\u00df\u00fb\7O\2\2"+
		"\u00e0\u00e1\7/\2\2\u00e1\u00fb\7O\2\2\u00e2\u00e3\7\60\2\2\u00e3\u00fb"+
		"\7O\2\2\u00e4\u00e5\7\61\2\2\u00e5\u00fb\7O\2\2\u00e6\u00e7\7\62\2\2\u00e7"+
		"\u00fb\7O\2\2\u00e8\u00e9\7\63\2\2\u00e9\u00fb\7O\2\2\u00ea\u00eb\7\64"+
		"\2\2\u00eb\u00fb\7O\2\2\u00ec\u00ed\7\65\2\2\u00ed\u00fb\7O\2\2\u00ee"+
		"\u00ef\7\66\2\2\u00ef\u00fb\7O\2\2\u00f0\u00f1\7\67\2\2\u00f1\u00fb\7"+
		"O\2\2\u00f2\u00f3\78\2\2\u00f3\u00fb\7O\2\2\u00f4\u00f5\79\2\2\u00f5\u00fb"+
		"\7O\2\2\u00f6\u00f7\7:\2\2\u00f7\u00fb\7O\2\2\u00f8\u00f9\7;\2\2\u00f9"+
		"\u00fb\7O\2\2\u00fa\u00d0\3\2\2\2\u00fa\u00d2\3\2\2\2\u00fa\u00d4\3\2"+
		"\2\2\u00fa\u00d6\3\2\2\2\u00fa\u00d8\3\2\2\2\u00fa\u00da\3\2\2\2\u00fa"+
		"\u00dc\3\2\2\2\u00fa\u00de\3\2\2\2\u00fa\u00e0\3\2\2\2\u00fa\u00e2\3\2"+
		"\2\2\u00fa\u00e4\3\2\2\2\u00fa\u00e6\3\2\2\2\u00fa\u00e8\3\2\2\2\u00fa"+
		"\u00ea\3\2\2\2\u00fa\u00ec\3\2\2\2\u00fa\u00ee\3\2\2\2\u00fa\u00f0\3\2"+
		"\2\2\u00fa\u00f2\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f6\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\31\3\2\2\2\u00fc\u00fd\7<\2\2\u00fd\u0105\7O\2\2"+
		"\u00fe\u00ff\7=\2\2\u00ff\u0105\7O\2\2\u0100\u0101\7>\2\2\u0101\u0105"+
		"\7O\2\2\u0102\u0103\7?\2\2\u0103\u0105\7O\2\2\u0104\u00fc\3\2\2\2\u0104"+
		"\u00fe\3\2\2\2\u0104\u0100\3\2\2\2\u0104\u0102\3\2\2\2\u0105\33\3\2\2"+
		"\2\u0106\u0107\7@\2\2\u0107\u0111\t\2\2\2\u0108\u0109\7A\2\2\u0109\u0111"+
		"\7O\2\2\u010a\u010c\7B\2\2\u010b\u010d\7O\2\2\u010c\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2"+
		"\2\2\u0110\u0106\3\2\2\2\u0110\u0108\3\2\2\2\u0110\u010a\3\2\2\2\u0111"+
		"\35\3\2\2\2\u0112\u0113\7C\2\2\u0113\u011d\7O\2\2\u0114\u0115\7D\2\2\u0115"+
		"\u011d\7O\2\2\u0116\u0117\7E\2\2\u0117\u011d\7O\2\2\u0118\u0119\7F\2\2"+
		"\u0119\u011d\7O\2\2\u011a\u011b\7G\2\2\u011b\u011d\7O\2\2\u011c\u0112"+
		"\3\2\2\2\u011c\u0114\3\2\2\2\u011c\u0116\3\2\2\2\u011c\u0118\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011d\37\3\2\2\2\u011e\u011f\7H\2\2\u011f\u0135\7O\2\2"+
		"\u0120\u0121\7I\2\2\u0121\u0135\7O\2\2\u0122\u0129\7J\2\2\u0123\u012a"+
		"\7N\2\2\u0124\u0126\7O\2\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0123\3\2"+
		"\2\2\u0129\u0125\3\2\2\2\u012a\u0135\3\2\2\2\u012b\u0132\7K\2\2\u012c"+
		"\u0133\7N\2\2\u012d\u012f\7O\2\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2"+
		"\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132\u012c"+
		"\3\2\2\2\u0132\u012e\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u011e\3\2\2\2\u0134"+
		"\u0120\3\2\2\2\u0134\u0122\3\2\2\2\u0134\u012b\3\2\2\2\u0135!\3\2\2\2"+
		"\u0136\u013d\7M\2\2\u0137\u013e\7N\2\2\u0138\u013a\7O\2\2\u0139\u0138"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013e\3\2\2\2\u013d\u0137\3\2\2\2\u013d\u0139\3\2\2\2\u013e#\3\2\2\2"+
		"&\'.\66<KSY_ei{\u0085\u008b\u0091\u0098\u009a\u00a0\u00a6\u00ac\u00b2"+
		"\u00b8\u00be\u00c0\u00ce\u00fa\u0104\u010e\u0110\u011c\u0127\u0129\u0130"+
		"\u0132\u0134\u013b\u013d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}