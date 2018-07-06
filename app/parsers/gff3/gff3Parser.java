// Generated from gff3/gff3.g4 by ANTLR 4.7.1
package parsers.gff3;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gff3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, HEADER=4, COMMENTLINE=5, EOL=6, TEXT=7;
	public static final int
		RULE_document = 0, RULE_line = 1, RULE_dataline = 2, RULE_attributes = 3, 
		RULE_attribute = 4, RULE_seqid = 5, RULE_source = 6, RULE_type = 7, RULE_start = 8, 
		RULE_end = 9, RULE_strand = 10, RULE_score = 11, RULE_phase = 12, RULE_commentline = 13;
	public static final String[] ruleNames = {
		"document", "line", "dataline", "attributes", "attribute", "seqid", "source", 
		"type", "start", "end", "strand", "score", "phase", "commentline"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\t'", "';'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "HEADER", "COMMENTLINE", "EOL", "TEXT"
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
	public String getGrammarFileName() { return "gff3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gff3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode HEADER() { return getToken(gff3Parser.HEADER, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(HEADER);
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				line();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMENTLINE || _la==TEXT );
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
		public CommentlineContext commentline() {
			return getRuleContext(CommentlineContext.class,0);
		}
		public DatalineContext dataline() {
			return getRuleContext(DatalineContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENTLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				commentline();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				dataline();
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

	public static class DatalineContext extends ParserRuleContext {
		public SeqidContext seqid() {
			return getRuleContext(SeqidContext.class,0);
		}
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public EndContext end() {
			return getRuleContext(EndContext.class,0);
		}
		public ScoreContext score() {
			return getRuleContext(ScoreContext.class,0);
		}
		public StrandContext strand() {
			return getRuleContext(StrandContext.class,0);
		}
		public PhaseContext phase() {
			return getRuleContext(PhaseContext.class,0);
		}
		public TerminalNode EOL() { return getToken(gff3Parser.EOL, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DatalineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).enterDataline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).exitDataline(this);
		}
	}

	public final DatalineContext dataline() throws RecognitionException {
		DatalineContext _localctx = new DatalineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dataline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			seqid();
			setState(39);
			match(T__0);
			setState(40);
			source();
			setState(41);
			match(T__0);
			setState(42);
			type();
			setState(43);
			match(T__0);
			setState(44);
			start();
			setState(45);
			match(T__0);
			setState(46);
			end();
			setState(47);
			match(T__0);
			setState(48);
			score();
			setState(49);
			match(T__0);
			setState(50);
			strand();
			setState(51);
			match(T__0);
			setState(52);
			phase();
			setState(53);
			match(T__0);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXT) {
				{
				setState(54);
				attributes();
				}
			}

			setState(57);
			match(EOL);
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

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).exitAttributes(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			attribute();
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(60);
				match(T__1);
				setState(61);
				attribute();
				}
				}
				setState(66);
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

	public static class AttributeContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(gff3Parser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(gff3Parser.TEXT, i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(TEXT);
			setState(68);
			match(T__2);
			setState(69);
			match(TEXT);
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

	public static class SeqidContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(gff3Parser.TEXT, 0); }
		public SeqidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seqid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).enterSeqid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).exitSeqid(this);
		}
	}

	public final SeqidContext seqid() throws RecognitionException {
		SeqidContext _localctx = new SeqidContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_seqid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(TEXT);
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

	public static class SourceContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(gff3Parser.TEXT, 0); }
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).enterSource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).exitSource(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(TEXT);
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
		public TerminalNode TEXT() { return getToken(gff3Parser.TEXT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(TEXT);
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

	public static class StartContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(gff3Parser.TEXT, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(TEXT);
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

	public static class EndContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(gff3Parser.TEXT, 0); }
		public EndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).enterEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).exitEnd(this);
		}
	}

	public final EndContext end() throws RecognitionException {
		EndContext _localctx = new EndContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(TEXT);
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

	public static class StrandContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(gff3Parser.TEXT, 0); }
		public StrandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).enterStrand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).exitStrand(this);
		}
	}

	public final StrandContext strand() throws RecognitionException {
		StrandContext _localctx = new StrandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_strand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(TEXT);
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

	public static class ScoreContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(gff3Parser.TEXT, 0); }
		public ScoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_score; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).enterScore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).exitScore(this);
		}
	}

	public final ScoreContext score() throws RecognitionException {
		ScoreContext _localctx = new ScoreContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_score);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(TEXT);
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

	public static class PhaseContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(gff3Parser.TEXT, 0); }
		public PhaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_phase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).enterPhase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).exitPhase(this);
		}
	}

	public final PhaseContext phase() throws RecognitionException {
		PhaseContext _localctx = new PhaseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_phase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(TEXT);
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

	public static class CommentlineContext extends ParserRuleContext {
		public TerminalNode COMMENTLINE() { return getToken(gff3Parser.COMMENTLINE, 0); }
		public CommentlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).enterCommentline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gff3Listener ) ((gff3Listener)listener).exitCommentline(this);
		}
	}

	public final CommentlineContext commentline() throws RecognitionException {
		CommentlineContext _localctx = new CommentlineContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_commentline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(COMMENTLINE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\\\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\6\2!\n\2\r\2\16\2\"\3\3\3\3"+
		"\5\3\'\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4:\n\4\3\4\3\4\3\5\3\5\3\5\7\5A\n\5\f\5\16\5D\13\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2"+
		"Q\2\36\3\2\2\2\4&\3\2\2\2\6(\3\2\2\2\b=\3\2\2\2\nE\3\2\2\2\fI\3\2\2\2"+
		"\16K\3\2\2\2\20M\3\2\2\2\22O\3\2\2\2\24Q\3\2\2\2\26S\3\2\2\2\30U\3\2\2"+
		"\2\32W\3\2\2\2\34Y\3\2\2\2\36 \7\6\2\2\37!\5\4\3\2 \37\3\2\2\2!\"\3\2"+
		"\2\2\" \3\2\2\2\"#\3\2\2\2#\3\3\2\2\2$\'\5\34\17\2%\'\5\6\4\2&$\3\2\2"+
		"\2&%\3\2\2\2\'\5\3\2\2\2()\5\f\7\2)*\7\3\2\2*+\5\16\b\2+,\7\3\2\2,-\5"+
		"\20\t\2-.\7\3\2\2./\5\22\n\2/\60\7\3\2\2\60\61\5\24\13\2\61\62\7\3\2\2"+
		"\62\63\5\30\r\2\63\64\7\3\2\2\64\65\5\26\f\2\65\66\7\3\2\2\66\67\5\32"+
		"\16\2\679\7\3\2\28:\5\b\5\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\7\b\2\2<\7"+
		"\3\2\2\2=B\5\n\6\2>?\7\4\2\2?A\5\n\6\2@>\3\2\2\2AD\3\2\2\2B@\3\2\2\2B"+
		"C\3\2\2\2C\t\3\2\2\2DB\3\2\2\2EF\7\t\2\2FG\7\5\2\2GH\7\t\2\2H\13\3\2\2"+
		"\2IJ\7\t\2\2J\r\3\2\2\2KL\7\t\2\2L\17\3\2\2\2MN\7\t\2\2N\21\3\2\2\2OP"+
		"\7\t\2\2P\23\3\2\2\2QR\7\t\2\2R\25\3\2\2\2ST\7\t\2\2T\27\3\2\2\2UV\7\t"+
		"\2\2V\31\3\2\2\2WX\7\t\2\2X\33\3\2\2\2YZ\7\7\2\2Z\35\3\2\2\2\6\"&9B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}