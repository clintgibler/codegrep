// Generated from mps/mps.g4 by ANTLR 4.7.1
package parsers.mps;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mpsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAMEINDICATORCARD=1, ROWINDICATORCARD=2, COLUMNINDICATORCARD=3, RHSINDICATORCARD=4, 
		RANGESINDICATORCARD=5, BOUNDSINDICATORCARD=6, ENDATAINDICATORCARD=7, KEYWORDMARKER=8, 
		STARTMARKER=9, ENDMARKER=10, KEYWORDFREE=11, BOUNDKEY=12, ROWTYPE=13, 
		IDENTIFIER=14, NUMERICALVALUE=15, WS=16, LINE_COMMENT=17;
	public static final int
		RULE_modell = 0, RULE_firstrow = 1, RULE_rows = 2, RULE_columns = 3, RULE_rhs = 4, 
		RULE_ranges = 5, RULE_bounds = 6, RULE_endata = 7, RULE_rowdatacard = 8, 
		RULE_columndatacards = 9, RULE_rhsdatacards = 10, RULE_rangesdatacards = 11, 
		RULE_boundsdatacards = 12, RULE_columndatacard = 13, RULE_rhsdatacard = 14, 
		RULE_rangesdatacard = 15, RULE_boundsdatacard = 16, RULE_intblock = 17, 
		RULE_startmarker = 18, RULE_endmarker = 19;
	public static final String[] ruleNames = {
		"modell", "firstrow", "rows", "columns", "rhs", "ranges", "bounds", "endata", 
		"rowdatacard", "columndatacards", "rhsdatacards", "rangesdatacards", "boundsdatacards", 
		"columndatacard", "rhsdatacard", "rangesdatacard", "boundsdatacard", "intblock", 
		"startmarker", "endmarker"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'NAME'", "'ROWS'", "'COLUMNS'", "'RHS'", "'RANGES'", "'BOUNDS'", 
		"'ENDATA'", "''MARKER''", "''INTORG''", "''INTEND''", "'FREE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NAMEINDICATORCARD", "ROWINDICATORCARD", "COLUMNINDICATORCARD", 
		"RHSINDICATORCARD", "RANGESINDICATORCARD", "BOUNDSINDICATORCARD", "ENDATAINDICATORCARD", 
		"KEYWORDMARKER", "STARTMARKER", "ENDMARKER", "KEYWORDFREE", "BOUNDKEY", 
		"ROWTYPE", "IDENTIFIER", "NUMERICALVALUE", "WS", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "mps.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public mpsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModellContext extends ParserRuleContext {
		public FirstrowContext firstrow() {
			return getRuleContext(FirstrowContext.class,0);
		}
		public RowsContext rows() {
			return getRuleContext(RowsContext.class,0);
		}
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public EndataContext endata() {
			return getRuleContext(EndataContext.class,0);
		}
		public TerminalNode EOF() { return getToken(mpsParser.EOF, 0); }
		public RangesContext ranges() {
			return getRuleContext(RangesContext.class,0);
		}
		public BoundsContext bounds() {
			return getRuleContext(BoundsContext.class,0);
		}
		public ModellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterModell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitModell(this);
		}
	}

	public final ModellContext modell() throws RecognitionException {
		ModellContext _localctx = new ModellContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_modell);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			firstrow();
			setState(41);
			rows();
			setState(42);
			columns();
			setState(43);
			rhs();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGESINDICATORCARD) {
				{
				setState(44);
				ranges();
				}
			}

			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOUNDSINDICATORCARD) {
				{
				setState(47);
				bounds();
				}
			}

			setState(50);
			endata();
			setState(51);
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

	public static class FirstrowContext extends ParserRuleContext {
		public TerminalNode NAMEINDICATORCARD() { return getToken(mpsParser.NAMEINDICATORCARD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(mpsParser.IDENTIFIER, 0); }
		public TerminalNode KEYWORDFREE() { return getToken(mpsParser.KEYWORDFREE, 0); }
		public FirstrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterFirstrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitFirstrow(this);
		}
	}

	public final FirstrowContext firstrow() throws RecognitionException {
		FirstrowContext _localctx = new FirstrowContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_firstrow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(NAMEINDICATORCARD);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(54);
				match(IDENTIFIER);
				}
			}

			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KEYWORDFREE) {
				{
				setState(57);
				match(KEYWORDFREE);
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

	public static class RowsContext extends ParserRuleContext {
		public TerminalNode ROWINDICATORCARD() { return getToken(mpsParser.ROWINDICATORCARD, 0); }
		public List<RowdatacardContext> rowdatacard() {
			return getRuleContexts(RowdatacardContext.class);
		}
		public RowdatacardContext rowdatacard(int i) {
			return getRuleContext(RowdatacardContext.class,i);
		}
		public RowsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rows; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitRows(this);
		}
	}

	public final RowsContext rows() throws RecognitionException {
		RowsContext _localctx = new RowsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rows);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ROWINDICATORCARD);
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				rowdatacard();
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ROWTYPE );
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

	public static class ColumnsContext extends ParserRuleContext {
		public TerminalNode COLUMNINDICATORCARD() { return getToken(mpsParser.COLUMNINDICATORCARD, 0); }
		public ColumndatacardsContext columndatacards() {
			return getRuleContext(ColumndatacardsContext.class,0);
		}
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitColumns(this);
		}
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_columns);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(COLUMNINDICATORCARD);
			setState(67);
			columndatacards();
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

	public static class RhsContext extends ParserRuleContext {
		public TerminalNode RHSINDICATORCARD() { return getToken(mpsParser.RHSINDICATORCARD, 0); }
		public RhsdatacardsContext rhsdatacards() {
			return getRuleContext(RhsdatacardsContext.class,0);
		}
		public RhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterRhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitRhs(this);
		}
	}

	public final RhsContext rhs() throws RecognitionException {
		RhsContext _localctx = new RhsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rhs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(RHSINDICATORCARD);
			setState(70);
			rhsdatacards();
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

	public static class RangesContext extends ParserRuleContext {
		public TerminalNode RANGESINDICATORCARD() { return getToken(mpsParser.RANGESINDICATORCARD, 0); }
		public RangesdatacardsContext rangesdatacards() {
			return getRuleContext(RangesdatacardsContext.class,0);
		}
		public RangesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ranges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterRanges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitRanges(this);
		}
	}

	public final RangesContext ranges() throws RecognitionException {
		RangesContext _localctx = new RangesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ranges);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(RANGESINDICATORCARD);
			setState(73);
			rangesdatacards();
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

	public static class BoundsContext extends ParserRuleContext {
		public TerminalNode BOUNDSINDICATORCARD() { return getToken(mpsParser.BOUNDSINDICATORCARD, 0); }
		public BoundsdatacardsContext boundsdatacards() {
			return getRuleContext(BoundsdatacardsContext.class,0);
		}
		public BoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitBounds(this);
		}
	}

	public final BoundsContext bounds() throws RecognitionException {
		BoundsContext _localctx = new BoundsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_bounds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(BOUNDSINDICATORCARD);
			setState(76);
			boundsdatacards();
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

	public static class EndataContext extends ParserRuleContext {
		public TerminalNode ENDATAINDICATORCARD() { return getToken(mpsParser.ENDATAINDICATORCARD, 0); }
		public EndataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterEndata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitEndata(this);
		}
	}

	public final EndataContext endata() throws RecognitionException {
		EndataContext _localctx = new EndataContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_endata);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ENDATAINDICATORCARD);
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

	public static class RowdatacardContext extends ParserRuleContext {
		public TerminalNode ROWTYPE() { return getToken(mpsParser.ROWTYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(mpsParser.IDENTIFIER, 0); }
		public RowdatacardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowdatacard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterRowdatacard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitRowdatacard(this);
		}
	}

	public final RowdatacardContext rowdatacard() throws RecognitionException {
		RowdatacardContext _localctx = new RowdatacardContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rowdatacard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(ROWTYPE);
			setState(81);
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

	public static class ColumndatacardsContext extends ParserRuleContext {
		public List<ColumndatacardContext> columndatacard() {
			return getRuleContexts(ColumndatacardContext.class);
		}
		public ColumndatacardContext columndatacard(int i) {
			return getRuleContext(ColumndatacardContext.class,i);
		}
		public List<IntblockContext> intblock() {
			return getRuleContexts(IntblockContext.class);
		}
		public IntblockContext intblock(int i) {
			return getRuleContext(IntblockContext.class,i);
		}
		public ColumndatacardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columndatacards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterColumndatacards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitColumndatacards(this);
		}
	}

	public final ColumndatacardsContext columndatacards() throws RecognitionException {
		ColumndatacardsContext _localctx = new ColumndatacardsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_columndatacards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(85);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(83);
					columndatacard();
					}
					break;
				case 2:
					{
					setState(84);
					intblock();
					}
					break;
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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

	public static class RhsdatacardsContext extends ParserRuleContext {
		public List<RhsdatacardContext> rhsdatacard() {
			return getRuleContexts(RhsdatacardContext.class);
		}
		public RhsdatacardContext rhsdatacard(int i) {
			return getRuleContext(RhsdatacardContext.class,i);
		}
		public RhsdatacardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhsdatacards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterRhsdatacards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitRhsdatacards(this);
		}
	}

	public final RhsdatacardsContext rhsdatacards() throws RecognitionException {
		RhsdatacardsContext _localctx = new RhsdatacardsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rhsdatacards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				rhsdatacard();
				}
				}
				setState(92); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RHSINDICATORCARD || _la==IDENTIFIER );
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

	public static class RangesdatacardsContext extends ParserRuleContext {
		public List<RangesdatacardContext> rangesdatacard() {
			return getRuleContexts(RangesdatacardContext.class);
		}
		public RangesdatacardContext rangesdatacard(int i) {
			return getRuleContext(RangesdatacardContext.class,i);
		}
		public RangesdatacardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangesdatacards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterRangesdatacards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitRangesdatacards(this);
		}
	}

	public final RangesdatacardsContext rangesdatacards() throws RecognitionException {
		RangesdatacardsContext _localctx = new RangesdatacardsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_rangesdatacards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(94);
				rangesdatacard();
				}
				}
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RANGESINDICATORCARD || _la==IDENTIFIER );
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

	public static class BoundsdatacardsContext extends ParserRuleContext {
		public List<BoundsdatacardContext> boundsdatacard() {
			return getRuleContexts(BoundsdatacardContext.class);
		}
		public BoundsdatacardContext boundsdatacard(int i) {
			return getRuleContext(BoundsdatacardContext.class,i);
		}
		public BoundsdatacardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundsdatacards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterBoundsdatacards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitBoundsdatacards(this);
		}
	}

	public final BoundsdatacardsContext boundsdatacards() throws RecognitionException {
		BoundsdatacardsContext _localctx = new BoundsdatacardsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_boundsdatacards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				boundsdatacard();
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BOUNDKEY );
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

	public static class ColumndatacardContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(mpsParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(mpsParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NUMERICALVALUE() { return getTokens(mpsParser.NUMERICALVALUE); }
		public TerminalNode NUMERICALVALUE(int i) {
			return getToken(mpsParser.NUMERICALVALUE, i);
		}
		public ColumndatacardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columndatacard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterColumndatacard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitColumndatacard(this);
		}
	}

	public final ColumndatacardContext columndatacard() throws RecognitionException {
		ColumndatacardContext _localctx = new ColumndatacardContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_columndatacard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(IDENTIFIER);
			setState(105);
			match(IDENTIFIER);
			setState(106);
			match(NUMERICALVALUE);
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(107);
				match(IDENTIFIER);
				setState(108);
				match(NUMERICALVALUE);
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

	public static class RhsdatacardContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(mpsParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(mpsParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NUMERICALVALUE() { return getTokens(mpsParser.NUMERICALVALUE); }
		public TerminalNode NUMERICALVALUE(int i) {
			return getToken(mpsParser.NUMERICALVALUE, i);
		}
		public TerminalNode RHSINDICATORCARD() { return getToken(mpsParser.RHSINDICATORCARD, 0); }
		public RhsdatacardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhsdatacard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterRhsdatacard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitRhsdatacard(this);
		}
	}

	public final RhsdatacardContext rhsdatacard() throws RecognitionException {
		RhsdatacardContext _localctx = new RhsdatacardContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rhsdatacard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_la = _input.LA(1);
			if ( !(_la==RHSINDICATORCARD || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(112);
			match(IDENTIFIER);
			setState(113);
			match(NUMERICALVALUE);
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(114);
				match(IDENTIFIER);
				setState(115);
				match(NUMERICALVALUE);
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

	public static class RangesdatacardContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(mpsParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(mpsParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NUMERICALVALUE() { return getTokens(mpsParser.NUMERICALVALUE); }
		public TerminalNode NUMERICALVALUE(int i) {
			return getToken(mpsParser.NUMERICALVALUE, i);
		}
		public TerminalNode RANGESINDICATORCARD() { return getToken(mpsParser.RANGESINDICATORCARD, 0); }
		public RangesdatacardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangesdatacard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterRangesdatacard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitRangesdatacard(this);
		}
	}

	public final RangesdatacardContext rangesdatacard() throws RecognitionException {
		RangesdatacardContext _localctx = new RangesdatacardContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rangesdatacard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==RANGESINDICATORCARD || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(119);
			match(IDENTIFIER);
			setState(120);
			match(NUMERICALVALUE);
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(121);
				match(IDENTIFIER);
				setState(122);
				match(NUMERICALVALUE);
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

	public static class BoundsdatacardContext extends ParserRuleContext {
		public TerminalNode BOUNDKEY() { return getToken(mpsParser.BOUNDKEY, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(mpsParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(mpsParser.IDENTIFIER, i);
		}
		public TerminalNode BOUNDSINDICATORCARD() { return getToken(mpsParser.BOUNDSINDICATORCARD, 0); }
		public TerminalNode NUMERICALVALUE() { return getToken(mpsParser.NUMERICALVALUE, 0); }
		public BoundsdatacardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundsdatacard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterBoundsdatacard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitBoundsdatacard(this);
		}
	}

	public final BoundsdatacardContext boundsdatacard() throws RecognitionException {
		BoundsdatacardContext _localctx = new BoundsdatacardContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_boundsdatacard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(BOUNDKEY);
			setState(126);
			_la = _input.LA(1);
			if ( !(_la==BOUNDSINDICATORCARD || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(127);
			match(IDENTIFIER);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMERICALVALUE) {
				{
				setState(128);
				match(NUMERICALVALUE);
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

	public static class IntblockContext extends ParserRuleContext {
		public StartmarkerContext startmarker() {
			return getRuleContext(StartmarkerContext.class,0);
		}
		public EndmarkerContext endmarker() {
			return getRuleContext(EndmarkerContext.class,0);
		}
		public List<ColumndatacardContext> columndatacard() {
			return getRuleContexts(ColumndatacardContext.class);
		}
		public ColumndatacardContext columndatacard(int i) {
			return getRuleContext(ColumndatacardContext.class,i);
		}
		public IntblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterIntblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitIntblock(this);
		}
	}

	public final IntblockContext intblock() throws RecognitionException {
		IntblockContext _localctx = new IntblockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_intblock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			startmarker();
			setState(133); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(132);
					columndatacard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(135); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(137);
			endmarker();
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

	public static class StartmarkerContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(mpsParser.IDENTIFIER, 0); }
		public TerminalNode KEYWORDMARKER() { return getToken(mpsParser.KEYWORDMARKER, 0); }
		public TerminalNode STARTMARKER() { return getToken(mpsParser.STARTMARKER, 0); }
		public StartmarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startmarker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterStartmarker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitStartmarker(this);
		}
	}

	public final StartmarkerContext startmarker() throws RecognitionException {
		StartmarkerContext _localctx = new StartmarkerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_startmarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(IDENTIFIER);
			setState(140);
			match(KEYWORDMARKER);
			setState(141);
			match(STARTMARKER);
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

	public static class EndmarkerContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(mpsParser.IDENTIFIER, 0); }
		public TerminalNode KEYWORDMARKER() { return getToken(mpsParser.KEYWORDMARKER, 0); }
		public TerminalNode ENDMARKER() { return getToken(mpsParser.ENDMARKER, 0); }
		public EndmarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endmarker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).enterEndmarker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mpsListener ) ((mpsListener)listener).exitEndmarker(this);
		}
	}

	public final EndmarkerContext endmarker() throws RecognitionException {
		EndmarkerContext _localctx = new EndmarkerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_endmarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(IDENTIFIER);
			setState(144);
			match(KEYWORDMARKER);
			setState(145);
			match(ENDMARKER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u0096\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\5\2\60\n\2\3\2\5\2"+
		"\63\n\2\3\2\3\2\3\2\3\3\3\3\5\3:\n\3\3\3\5\3=\n\3\3\4\3\4\6\4A\n\4\r\4"+
		"\16\4B\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\6\13X\n\13\r\13\16\13Y\3\f\6\f]\n\f\r\f\16\f^\3\r\6\rb"+
		"\n\r\r\r\16\rc\3\16\6\16g\n\16\r\16\16\16h\3\17\3\17\3\17\3\17\3\17\5"+
		"\17p\n\17\3\20\3\20\3\20\3\20\3\20\5\20w\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\5\21~\n\21\3\22\3\22\3\22\3\22\5\22\u0084\n\22\3\23\3\23\6\23\u0088\n"+
		"\23\r\23\16\23\u0089\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\5\4\2\6\6"+
		"\20\20\4\2\7\7\20\20\4\2\b\b\20\20\2\u0090\2*\3\2\2\2\4\67\3\2\2\2\6>"+
		"\3\2\2\2\bD\3\2\2\2\nG\3\2\2\2\fJ\3\2\2\2\16M\3\2\2\2\20P\3\2\2\2\22R"+
		"\3\2\2\2\24W\3\2\2\2\26\\\3\2\2\2\30a\3\2\2\2\32f\3\2\2\2\34j\3\2\2\2"+
		"\36q\3\2\2\2 x\3\2\2\2\"\177\3\2\2\2$\u0085\3\2\2\2&\u008d\3\2\2\2(\u0091"+
		"\3\2\2\2*+\5\4\3\2+,\5\6\4\2,-\5\b\5\2-/\5\n\6\2.\60\5\f\7\2/.\3\2\2\2"+
		"/\60\3\2\2\2\60\62\3\2\2\2\61\63\5\16\b\2\62\61\3\2\2\2\62\63\3\2\2\2"+
		"\63\64\3\2\2\2\64\65\5\20\t\2\65\66\7\2\2\3\66\3\3\2\2\2\679\7\3\2\28"+
		":\7\20\2\298\3\2\2\29:\3\2\2\2:<\3\2\2\2;=\7\r\2\2<;\3\2\2\2<=\3\2\2\2"+
		"=\5\3\2\2\2>@\7\4\2\2?A\5\22\n\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2"+
		"\2C\7\3\2\2\2DE\7\5\2\2EF\5\24\13\2F\t\3\2\2\2GH\7\6\2\2HI\5\26\f\2I\13"+
		"\3\2\2\2JK\7\7\2\2KL\5\30\r\2L\r\3\2\2\2MN\7\b\2\2NO\5\32\16\2O\17\3\2"+
		"\2\2PQ\7\t\2\2Q\21\3\2\2\2RS\7\17\2\2ST\7\20\2\2T\23\3\2\2\2UX\5\34\17"+
		"\2VX\5$\23\2WU\3\2\2\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\25\3\2"+
		"\2\2[]\5\36\20\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\27\3\2\2\2"+
		"`b\5 \21\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\31\3\2\2\2eg\5\"\22"+
		"\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i\33\3\2\2\2jk\7\20\2\2kl\7"+
		"\20\2\2lo\7\21\2\2mn\7\20\2\2np\7\21\2\2om\3\2\2\2op\3\2\2\2p\35\3\2\2"+
		"\2qr\t\2\2\2rs\7\20\2\2sv\7\21\2\2tu\7\20\2\2uw\7\21\2\2vt\3\2\2\2vw\3"+
		"\2\2\2w\37\3\2\2\2xy\t\3\2\2yz\7\20\2\2z}\7\21\2\2{|\7\20\2\2|~\7\21\2"+
		"\2}{\3\2\2\2}~\3\2\2\2~!\3\2\2\2\177\u0080\7\16\2\2\u0080\u0081\t\4\2"+
		"\2\u0081\u0083\7\20\2\2\u0082\u0084\7\21\2\2\u0083\u0082\3\2\2\2\u0083"+
		"\u0084\3\2\2\2\u0084#\3\2\2\2\u0085\u0087\5&\24\2\u0086\u0088\5\34\17"+
		"\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\5(\25\2\u008c%\3\2\2\2\u008d"+
		"\u008e\7\20\2\2\u008e\u008f\7\n\2\2\u008f\u0090\7\13\2\2\u0090\'\3\2\2"+
		"\2\u0091\u0092\7\20\2\2\u0092\u0093\7\n\2\2\u0093\u0094\7\f\2\2\u0094"+
		")\3\2\2\2\21/\629<BWY^chov}\u0083\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}