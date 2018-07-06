// Generated from fen/fen.g4 by ANTLR 4.7.1
package parsers.fen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fenParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, NUMBER=24, 
		WS=25;
	public static final int
		RULE_fen = 0, RULE_color = 1, RULE_castling = 2, RULE_enpassant = 3, RULE_position = 4, 
		RULE_halfmoveclock = 5, RULE_fullmoveclock = 6, RULE_placement = 7, RULE_rank = 8, 
		RULE_piece = 9;
	public static final String[] ruleNames = {
		"fen", "color", "castling", "enpassant", "position", "halfmoveclock", 
		"fullmoveclock", "placement", "rank", "piece"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'w'", "'b'", "'-'", "'Q'", "'K'", "'k'", "'q'", "'a'", "'c'", 
		"'d'", "'e'", "'f'", "'g'", "'h'", "'/'", "'p'", "'r'", "'n'", "'P'", 
		"'R'", "'N'", "'B'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"NUMBER", "WS"
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
	public String getGrammarFileName() { return "fen.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public fenParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class FenContext extends ParserRuleContext {
		public PlacementContext placement() {
			return getRuleContext(PlacementContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public CastlingContext castling() {
			return getRuleContext(CastlingContext.class,0);
		}
		public EnpassantContext enpassant() {
			return getRuleContext(EnpassantContext.class,0);
		}
		public HalfmoveclockContext halfmoveclock() {
			return getRuleContext(HalfmoveclockContext.class,0);
		}
		public FullmoveclockContext fullmoveclock() {
			return getRuleContext(FullmoveclockContext.class,0);
		}
		public FenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).enterFen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).exitFen(this);
		}
	}

	public final FenContext fen() throws RecognitionException {
		FenContext _localctx = new FenContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_fen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			placement();
			setState(21);
			match(T__0);
			setState(22);
			color();
			setState(23);
			match(T__0);
			setState(24);
			castling();
			setState(25);
			match(T__0);
			setState(26);
			enpassant();
			setState(27);
			match(T__0);
			setState(28);
			halfmoveclock();
			setState(29);
			match(T__0);
			setState(30);
			fullmoveclock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColorContext extends ParserRuleContext {
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).exitColor(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_color);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
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

	public static class CastlingContext extends ParserRuleContext {
		public CastlingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castling; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).enterCastling(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).exitCastling(this);
		}
	}

	public final CastlingContext castling() throws RecognitionException {
		CastlingContext _localctx = new CastlingContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_castling);
		int _la;
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(T__3);
				}
				break;
			case T__4:
			case T__5:
			case T__6:
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(35);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(38); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7))) != 0) );
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

	public static class EnpassantContext extends ParserRuleContext {
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public EnpassantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enpassant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).enterEnpassant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).exitEnpassant(this);
		}
	}

	public final EnpassantContext enpassant() throws RecognitionException {
		EnpassantContext _localctx = new EnpassantContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_enpassant);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(T__3);
				}
				break;
			case T__2:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				position();
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

	public static class PositionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(fenParser.NUMBER, 0); }
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).exitPosition(this);
		}
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_position);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(47);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HalfmoveclockContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(fenParser.NUMBER, 0); }
		public HalfmoveclockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_halfmoveclock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).enterHalfmoveclock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).exitHalfmoveclock(this);
		}
	}

	public final HalfmoveclockContext halfmoveclock() throws RecognitionException {
		HalfmoveclockContext _localctx = new HalfmoveclockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_halfmoveclock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FullmoveclockContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(fenParser.NUMBER, 0); }
		public FullmoveclockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullmoveclock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).enterFullmoveclock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).exitFullmoveclock(this);
		}
	}

	public final FullmoveclockContext fullmoveclock() throws RecognitionException {
		FullmoveclockContext _localctx = new FullmoveclockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fullmoveclock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlacementContext extends ParserRuleContext {
		public List<RankContext> rank() {
			return getRuleContexts(RankContext.class);
		}
		public RankContext rank(int i) {
			return getRuleContext(RankContext.class,i);
		}
		public PlacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).enterPlacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).exitPlacement(this);
		}
	}

	public final PlacementContext placement() throws RecognitionException {
		PlacementContext _localctx = new PlacementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_placement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			rank();
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54);
				match(T__15);
				setState(55);
				rank();
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__15 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RankContext extends ParserRuleContext {
		public List<PieceContext> piece() {
			return getRuleContexts(PieceContext.class);
		}
		public PieceContext piece(int i) {
			return getRuleContext(PieceContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(fenParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(fenParser.NUMBER, i);
		}
		public RankContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rank; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).enterRank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).exitRank(this);
		}
	}

	public final RankContext rank() throws RecognitionException {
		RankContext _localctx = new RankContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rank);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(62);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case T__21:
				case T__22:
					{
					setState(60);
					piece();
					}
					break;
				case NUMBER:
					{
					setState(61);
					match(NUMBER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << NUMBER))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PieceContext extends ParserRuleContext {
		public PieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piece; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).enterPiece(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fenListener ) ((fenListener)listener).exitPiece(this);
		}
	}

	public final PieceContext piece() throws RecognitionException {
		PieceContext _localctx = new PieceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_piece);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33G\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\6\4\'\n"+
		"\4\r\4\16\4(\5\4+\n\4\3\5\3\5\5\5/\n\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\t\6\t;\n\t\r\t\16\t<\3\n\3\n\6\nA\n\n\r\n\16\nB\3\13\3\13\3\13"+
		"\2\2\f\2\4\6\b\n\f\16\20\22\24\2\6\3\2\4\5\3\2\7\n\4\2\5\5\13\21\5\2\5"+
		"\5\7\n\23\31\2B\2\26\3\2\2\2\4\"\3\2\2\2\6*\3\2\2\2\b.\3\2\2\2\n\60\3"+
		"\2\2\2\f\63\3\2\2\2\16\65\3\2\2\2\20\67\3\2\2\2\22@\3\2\2\2\24D\3\2\2"+
		"\2\26\27\5\20\t\2\27\30\7\3\2\2\30\31\5\4\3\2\31\32\7\3\2\2\32\33\5\6"+
		"\4\2\33\34\7\3\2\2\34\35\5\b\5\2\35\36\7\3\2\2\36\37\5\f\7\2\37 \7\3\2"+
		"\2 !\5\16\b\2!\3\3\2\2\2\"#\t\2\2\2#\5\3\2\2\2$+\7\6\2\2%\'\t\3\2\2&%"+
		"\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)+\3\2\2\2*$\3\2\2\2*&\3\2\2\2"+
		"+\7\3\2\2\2,/\7\6\2\2-/\5\n\6\2.,\3\2\2\2.-\3\2\2\2/\t\3\2\2\2\60\61\t"+
		"\4\2\2\61\62\7\32\2\2\62\13\3\2\2\2\63\64\7\32\2\2\64\r\3\2\2\2\65\66"+
		"\7\32\2\2\66\17\3\2\2\2\67:\5\22\n\289\7\22\2\29;\5\22\n\2:8\3\2\2\2;"+
		"<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\21\3\2\2\2>A\5\24\13\2?A\7\32\2\2@>\3\2"+
		"\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\23\3\2\2\2DE\t\5\2\2E\25"+
		"\3\2\2\2\b(*.<@B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}