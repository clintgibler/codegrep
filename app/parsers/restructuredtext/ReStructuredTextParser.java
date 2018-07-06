// Generated from restructuredtext/ReStructuredText.g4 by ANTLR 4.7.1
package parsers.restructuredtext;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ReStructuredTextParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, SectionSeparator=2, Literal=3, TimeStar=4, Alphabet=5, Numbers=6, 
		Quote=7, SquareLeft=8, SquareRight=9, RoundLeft=10, RoundRight=11, AngleLeft=12, 
		AngleRight=13, Hat=14, QuotationDouble=15, QuotationSingle=16, Dot=17, 
		SemiColon=18, Colon=19, Equal=20, Plus=21, Minus=22, Block=23, Comment=24, 
		UnderScore=25, BackTick=26, Star=27, Space=28, LineBreak=29, Any=30;
	public static final int
		RULE_parse = 0, RULE_element = 1, RULE_sectionElement = 2, RULE_comment = 3, 
		RULE_commentParagraphs = 4, RULE_commentRest = 5, RULE_commentParagraph = 6, 
		RULE_commentLineNoBreak = 7, RULE_commentLine = 8, RULE_commentLineAtoms = 9, 
		RULE_paragraph = 10, RULE_section = 11, RULE_title = 12, RULE_lineBlock = 13, 
		RULE_lineBlockLine = 14, RULE_listItemBullet = 15, RULE_bulletCrossLine = 16, 
		RULE_bulletSimple = 17, RULE_bullet = 18, RULE_listItemEnumerated = 19, 
		RULE_paragraphNoBreak = 20, RULE_lineNoBreak = 21, RULE_lines = 22, RULE_linesNormal = 23, 
		RULE_linesStar = 24, RULE_lineNormal = 25, RULE_lineStar = 26, RULE_lineSpecial = 27, 
		RULE_empty_line = 28, RULE_indentation = 29, RULE_spanLineStartNoStar = 30, 
		RULE_textLineStart = 31, RULE_lineStart_fragment = 32, RULE_text = 33, 
		RULE_textStart = 34, RULE_forcedText = 35, RULE_spanNoStar = 36, RULE_span = 37, 
		RULE_quotedLiteral = 38, RULE_text_fragment_start = 39, RULE_text_fragment = 40, 
		RULE_starText = 41, RULE_starAtoms = 42, RULE_starNoSpace = 43, RULE_starAtom = 44, 
		RULE_backTickText = 45, RULE_body = 46, RULE_backTickAtoms = 47, RULE_backTickNoSpace = 48, 
		RULE_backTickAtom = 49, RULE_reference = 50, RULE_referenceIn = 51, RULE_hyperlinkTarget = 52, 
		RULE_hyperlink = 53, RULE_hyperlinkDoc = 54, RULE_url = 55, RULE_urlAtom = 56, 
		RULE_hyperlinkAtom = 57, RULE_separator = 58;
	public static final String[] ruleNames = {
		"parse", "element", "sectionElement", "comment", "commentParagraphs", 
		"commentRest", "commentParagraph", "commentLineNoBreak", "commentLine", 
		"commentLineAtoms", "paragraph", "section", "title", "lineBlock", "lineBlockLine", 
		"listItemBullet", "bulletCrossLine", "bulletSimple", "bullet", "listItemEnumerated", 
		"paragraphNoBreak", "lineNoBreak", "lines", "linesNormal", "linesStar", 
		"lineNormal", "lineStar", "lineSpecial", "empty_line", "indentation", 
		"spanLineStartNoStar", "textLineStart", "lineStart_fragment", "text", 
		"textStart", "forcedText", "spanNoStar", "span", "quotedLiteral", "text_fragment_start", 
		"text_fragment", "starText", "starAtoms", "starNoSpace", "starAtom", "backTickText", 
		"body", "backTickAtoms", "backTickNoSpace", "backTickAtom", "reference", 
		"referenceIn", "hyperlinkTarget", "hyperlink", "hyperlinkDoc", "url", 
		"urlAtom", "hyperlinkAtom", "separator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':doc:'", null, null, null, null, null, null, "'['", "']'", "'('", 
		"')'", "'<'", "'>'", "'^'", "'\"'", "'''", "'.'", "';'", "':'", "'='", 
		"'+'", "'-'", "'|'", null, "'_'", "'`'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "SectionSeparator", "Literal", "TimeStar", "Alphabet", "Numbers", 
		"Quote", "SquareLeft", "SquareRight", "RoundLeft", "RoundRight", "AngleLeft", 
		"AngleRight", "Hat", "QuotationDouble", "QuotationSingle", "Dot", "SemiColon", 
		"Colon", "Equal", "Plus", "Minus", "Block", "Comment", "UnderScore", "BackTick", 
		"Star", "Space", "LineBreak", "Any"
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
	public String getGrammarFileName() { return "ReStructuredText.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReStructuredTextParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ReStructuredTextParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<Empty_lineContext> empty_line() {
			return getRuleContexts(Empty_lineContext.class);
		}
		public Empty_lineContext empty_line(int i) {
			return getRuleContext(Empty_lineContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					setState(120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(118);
						element();
						}
						break;
					case 2:
						{
						setState(119);
						empty_line();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(122); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(124);
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

	public static class ElementContext extends ParserRuleContext {
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public SectionElementContext sectionElement() {
			return getRuleContext(SectionElementContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				section();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				sectionElement();
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

	public static class SectionElementContext extends ParserRuleContext {
		public ListItemBulletContext listItemBullet() {
			return getRuleContext(ListItemBulletContext.class,0);
		}
		public ListItemEnumeratedContext listItemEnumerated() {
			return getRuleContext(ListItemEnumeratedContext.class,0);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public LineBlockContext lineBlock() {
			return getRuleContext(LineBlockContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public SectionElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterSectionElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitSectionElement(this);
		}
	}

	public final SectionElementContext sectionElement() throws RecognitionException {
		SectionElementContext _localctx = new SectionElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sectionElement);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				listItemBullet();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				listItemEnumerated();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				paragraph();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				lineBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				comment();
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode Comment() { return getToken(ReStructuredTextParser.Comment, 0); }
		public List<TerminalNode> Space() { return getTokens(ReStructuredTextParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(ReStructuredTextParser.Space, i);
		}
		public CommentLineNoBreakContext commentLineNoBreak() {
			return getRuleContext(CommentLineNoBreakContext.class,0);
		}
		public CommentParagraphsContext commentParagraphs() {
			return getRuleContext(CommentParagraphsContext.class,0);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comment);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(137);
				match(Space);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(Comment);
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(144);
					match(Space);
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(150);
				commentLineNoBreak();
				setState(152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(151);
					commentParagraphs();
					}
					break;
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

	public static class CommentParagraphsContext extends ParserRuleContext {
		public CommentParagraphContext main;
		public CommentRestContext commentRest() {
			return getRuleContext(CommentRestContext.class,0);
		}
		public CommentParagraphContext commentParagraph() {
			return getRuleContext(CommentParagraphContext.class,0);
		}
		public CommentParagraphsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentParagraphs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterCommentParagraphs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitCommentParagraphs(this);
		}
	}

	public final CommentParagraphsContext commentParagraphs() throws RecognitionException {
		CommentParagraphsContext _localctx = new CommentParagraphsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_commentParagraphs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			((CommentParagraphsContext)_localctx).main = commentParagraph();
			setState(157);
			commentRest();
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

	public static class CommentRestContext extends ParserRuleContext {
		public List<Empty_lineContext> empty_line() {
			return getRuleContexts(Empty_lineContext.class);
		}
		public Empty_lineContext empty_line(int i) {
			return getRuleContext(Empty_lineContext.class,i);
		}
		public List<CommentParagraphContext> commentParagraph() {
			return getRuleContexts(CommentParagraphContext.class);
		}
		public CommentParagraphContext commentParagraph(int i) {
			return getRuleContext(CommentParagraphContext.class,i);
		}
		public CommentRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterCommentRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitCommentRest(this);
		}
	}

	public final CommentRestContext commentRest() throws RecognitionException {
		CommentRestContext _localctx = new CommentRestContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_commentRest);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					empty_line();
					setState(160);
					commentParagraph();
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class CommentParagraphContext extends ParserRuleContext {
		public List<CommentLineContext> commentLine() {
			return getRuleContexts(CommentLineContext.class);
		}
		public CommentLineContext commentLine(int i) {
			return getRuleContext(CommentLineContext.class,i);
		}
		public CommentParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentParagraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterCommentParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitCommentParagraph(this);
		}
	}

	public final CommentParagraphContext commentParagraph() throws RecognitionException {
		CommentParagraphContext _localctx = new CommentParagraphContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_commentParagraph);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(167);
					commentLine();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(170); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class CommentLineNoBreakContext extends ParserRuleContext {
		public CommentLineAtomsContext commentLineAtoms() {
			return getRuleContext(CommentLineAtomsContext.class,0);
		}
		public CommentLineNoBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentLineNoBreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterCommentLineNoBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitCommentLineNoBreak(this);
		}
	}

	public final CommentLineNoBreakContext commentLineNoBreak() throws RecognitionException {
		CommentLineNoBreakContext _localctx = new CommentLineNoBreakContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_commentLineNoBreak);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			commentLineAtoms();
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

	public static class CommentLineContext extends ParserRuleContext {
		public TerminalNode LineBreak() { return getToken(ReStructuredTextParser.LineBreak, 0); }
		public List<TerminalNode> Space() { return getTokens(ReStructuredTextParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(ReStructuredTextParser.Space, i);
		}
		public CommentLineNoBreakContext commentLineNoBreak() {
			return getRuleContext(CommentLineNoBreakContext.class,0);
		}
		public CommentLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterCommentLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitCommentLine(this);
		}
	}

	public final CommentLineContext commentLine() throws RecognitionException {
		CommentLineContext _localctx = new CommentLineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_commentLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(LineBreak);
			setState(175);
			match(Space);
			setState(176);
			match(Space);
			setState(177);
			match(Space);
			setState(178);
			commentLineNoBreak();
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

	public static class CommentLineAtomsContext extends ParserRuleContext {
		public List<TerminalNode> LineBreak() { return getTokens(ReStructuredTextParser.LineBreak); }
		public TerminalNode LineBreak(int i) {
			return getToken(ReStructuredTextParser.LineBreak, i);
		}
		public CommentLineAtomsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentLineAtoms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterCommentLineAtoms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitCommentLineAtoms(this);
		}
	}

	public final CommentLineAtomsContext commentLineAtoms() throws RecognitionException {
		CommentLineAtomsContext _localctx = new CommentLineAtomsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_commentLineAtoms);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(180);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LineBreak) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(183); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ParagraphContext extends ParserRuleContext {
		public LinesContext lines() {
			return getRuleContext(LinesContext.class,0);
		}
		public ParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitParagraph(this);
		}
	}

	public final ParagraphContext paragraph() throws RecognitionException {
		ParagraphContext _localctx = new ParagraphContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_paragraph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			lines();
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

	public static class SectionContext extends ParserRuleContext {
		public Token overline;
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public List<TerminalNode> SectionSeparator() { return getTokens(ReStructuredTextParser.SectionSeparator); }
		public TerminalNode SectionSeparator(int i) {
			return getToken(ReStructuredTextParser.SectionSeparator, i);
		}
		public List<TerminalNode> LineBreak() { return getTokens(ReStructuredTextParser.LineBreak); }
		public TerminalNode LineBreak(int i) {
			return getToken(ReStructuredTextParser.LineBreak, i);
		}
		public List<SectionElementContext> sectionElement() {
			return getRuleContexts(SectionElementContext.class);
		}
		public SectionElementContext sectionElement(int i) {
			return getRuleContext(SectionElementContext.class,i);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitSection(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_section);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(187);
				match(LineBreak);
				setState(188);
				((SectionContext)_localctx).overline = match(SectionSeparator);
				}
				break;
			}
			setState(191);
			title();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LineBreak) {
				{
				setState(192);
				match(LineBreak);
				}
			}

			setState(195);
			match(SectionSeparator);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					match(LineBreak);
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(202);
					sectionElement();
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode LineBreak() { return getToken(ReStructuredTextParser.LineBreak, 0); }
		public TextStartContext textStart() {
			return getRuleContext(TextStartContext.class,0);
		}
		public LineSpecialContext lineSpecial() {
			return getRuleContext(LineSpecialContext.class,0);
		}
		public List<TerminalNode> Space() { return getTokens(ReStructuredTextParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(ReStructuredTextParser.Space, i);
		}
		public ParagraphNoBreakContext paragraphNoBreak() {
			return getRuleContext(ParagraphNoBreakContext.class,0);
		}
		public LineNormalContext lineNormal() {
			return getRuleContext(LineNormalContext.class,0);
		}
		public LineStarContext lineStar() {
			return getRuleContext(LineStarContext.class,0);
		}
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitTitle(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_title);
		int _la;
		try {
			int _alt;
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(LineBreak);
				setState(209);
				textStart();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(LineBreak);
				setState(211);
				lineSpecial();
				setState(213); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(212);
						match(Space);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(215); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << TimeStar) | (1L << Alphabet) | (1L << Numbers) | (1L << SquareLeft) | (1L << SquareRight) | (1L << RoundLeft) | (1L << RoundRight) | (1L << AngleLeft) | (1L << AngleRight) | (1L << Hat) | (1L << QuotationDouble) | (1L << QuotationSingle) | (1L << Dot) | (1L << SemiColon) | (1L << Colon) | (1L << Equal) | (1L << Plus) | (1L << Minus) | (1L << Block) | (1L << UnderScore) | (1L << BackTick) | (1L << Space) | (1L << Any))) != 0)) {
					{
					setState(217);
					paragraphNoBreak();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				lineNormal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				lineStar();
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

	public static class LineBlockContext extends ParserRuleContext {
		public List<TerminalNode> LineBreak() { return getTokens(ReStructuredTextParser.LineBreak); }
		public TerminalNode LineBreak(int i) {
			return getToken(ReStructuredTextParser.LineBreak, i);
		}
		public List<LineBlockLineContext> lineBlockLine() {
			return getRuleContexts(LineBlockLineContext.class);
		}
		public LineBlockLineContext lineBlockLine(int i) {
			return getRuleContext(LineBlockLineContext.class,i);
		}
		public LineBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterLineBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitLineBlock(this);
		}
	}

	public final LineBlockContext lineBlock() throws RecognitionException {
		LineBlockContext _localctx = new LineBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_lineBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(LineBreak);
			setState(225);
			lineBlockLine();
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(226);
				match(LineBreak);
				}
				break;
			}
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Block) {
				{
				{
				setState(229);
				lineBlockLine();
				}
				}
				setState(234);
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

	public static class LineBlockLineContext extends ParserRuleContext {
		public TerminalNode Block() { return getToken(ReStructuredTextParser.Block, 0); }
		public TerminalNode Space() { return getToken(ReStructuredTextParser.Space, 0); }
		public StarTextContext starText() {
			return getRuleContext(StarTextContext.class,0);
		}
		public IndentationContext indentation() {
			return getRuleContext(IndentationContext.class,0);
		}
		public List<SpanContext> span() {
			return getRuleContexts(SpanContext.class);
		}
		public SpanContext span(int i) {
			return getRuleContext(SpanContext.class,i);
		}
		public LineBlockLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineBlockLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterLineBlockLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitLineBlockLine(this);
		}
	}

	public final LineBlockLineContext lineBlockLine() throws RecognitionException {
		LineBlockLineContext _localctx = new LineBlockLineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lineBlockLine);
		try {
			int _alt;
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(Block);
				setState(236);
				match(Space);
				setState(238);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(237);
					indentation();
					}
					break;
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(240);
						span();
						}
						} 
					}
					setState(245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(246);
				starText();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(Block);
				setState(248);
				match(Space);
				setState(250);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(249);
					indentation();
					}
					break;
				}
				setState(253); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(252);
						span();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(255); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ListItemBulletContext extends ParserRuleContext {
		public Token special;
		public BulletCrossLineContext bulletCrossLine() {
			return getRuleContext(BulletCrossLineContext.class,0);
		}
		public BulletSimpleContext bulletSimple() {
			return getRuleContext(BulletSimpleContext.class,0);
		}
		public TerminalNode LineBreak() { return getToken(ReStructuredTextParser.LineBreak, 0); }
		public TerminalNode Minus() { return getToken(ReStructuredTextParser.Minus, 0); }
		public TerminalNode Plus() { return getToken(ReStructuredTextParser.Plus, 0); }
		public List<TerminalNode> Space() { return getTokens(ReStructuredTextParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(ReStructuredTextParser.Space, i);
		}
		public ListItemBulletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItemBullet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterListItemBullet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitListItemBullet(this);
		}
	}

	public final ListItemBulletContext listItemBullet() throws RecognitionException {
		ListItemBulletContext _localctx = new ListItemBulletContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_listItemBullet);
		int _la;
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				bulletCrossLine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				bulletSimple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(261);
				match(LineBreak);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Space) {
					{
					{
					setState(262);
					match(Space);
					}
					}
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(268);
				((ListItemBulletContext)_localctx).special = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
					((ListItemBulletContext)_localctx).special = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class BulletCrossLineContext extends ParserRuleContext {
		public TerminalNode LineBreak() { return getToken(ReStructuredTextParser.LineBreak, 0); }
		public BulletContext bullet() {
			return getRuleContext(BulletContext.class,0);
		}
		public List<TerminalNode> Space() { return getTokens(ReStructuredTextParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(ReStructuredTextParser.Space, i);
		}
		public List<ParagraphContext> paragraph() {
			return getRuleContexts(ParagraphContext.class);
		}
		public ParagraphContext paragraph(int i) {
			return getRuleContext(ParagraphContext.class,i);
		}
		public BulletCrossLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bulletCrossLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterBulletCrossLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitBulletCrossLine(this);
		}
	}

	public final BulletCrossLineContext bulletCrossLine() throws RecognitionException {
		BulletCrossLineContext _localctx = new BulletCrossLineContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bulletCrossLine);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(LineBreak);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(272);
				match(Space);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			bullet();
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(279);
					match(Space);
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(286); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(285);
						paragraph();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(288); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class BulletSimpleContext extends ParserRuleContext {
		public TerminalNode LineBreak() { return getToken(ReStructuredTextParser.LineBreak, 0); }
		public BulletContext bullet() {
			return getRuleContext(BulletContext.class,0);
		}
		public ParagraphNoBreakContext paragraphNoBreak() {
			return getRuleContext(ParagraphNoBreakContext.class,0);
		}
		public List<TerminalNode> Space() { return getTokens(ReStructuredTextParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(ReStructuredTextParser.Space, i);
		}
		public List<ParagraphContext> paragraph() {
			return getRuleContexts(ParagraphContext.class);
		}
		public ParagraphContext paragraph(int i) {
			return getRuleContext(ParagraphContext.class,i);
		}
		public BulletSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bulletSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterBulletSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitBulletSimple(this);
		}
	}

	public final BulletSimpleContext bulletSimple() throws RecognitionException {
		BulletSimpleContext _localctx = new BulletSimpleContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bulletSimple);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(LineBreak);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space) {
				{
				{
				setState(293);
				match(Space);
				}
				}
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			bullet();
			setState(301); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(300);
					match(Space);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(303); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(305);
			paragraphNoBreak();
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(306);
					paragraph();
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class BulletContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(ReStructuredTextParser.Star, 0); }
		public TerminalNode Minus() { return getToken(ReStructuredTextParser.Minus, 0); }
		public TerminalNode Plus() { return getToken(ReStructuredTextParser.Plus, 0); }
		public BulletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bullet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterBullet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitBullet(this);
		}
	}

	public final BulletContext bullet() throws RecognitionException {
		BulletContext _localctx = new BulletContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bullet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Plus) | (1L << Minus) | (1L << Star))) != 0)) ) {
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

	public static class ListItemEnumeratedContext extends ParserRuleContext {
		public LineSpecialContext enumerated;
		public TerminalNode LineBreak() { return getToken(ReStructuredTextParser.LineBreak, 0); }
		public LineSpecialContext lineSpecial() {
			return getRuleContext(LineSpecialContext.class,0);
		}
		public List<TerminalNode> Space() { return getTokens(ReStructuredTextParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(ReStructuredTextParser.Space, i);
		}
		public ParagraphNoBreakContext paragraphNoBreak() {
			return getRuleContext(ParagraphNoBreakContext.class,0);
		}
		public List<ParagraphContext> paragraph() {
			return getRuleContexts(ParagraphContext.class);
		}
		public ParagraphContext paragraph(int i) {
			return getRuleContext(ParagraphContext.class,i);
		}
		public ListItemEnumeratedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItemEnumerated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterListItemEnumerated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitListItemEnumerated(this);
		}
	}

	public final ListItemEnumeratedContext listItemEnumerated() throws RecognitionException {
		ListItemEnumeratedContext _localctx = new ListItemEnumeratedContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_listItemEnumerated);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(LineBreak);
			setState(315);
			((ListItemEnumeratedContext)_localctx).enumerated = lineSpecial();
			setState(317); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(316);
					match(Space);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(319); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(321);
				paragraphNoBreak();
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(322);
						paragraph();
						}
						} 
					}
					setState(327);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class ParagraphNoBreakContext extends ParserRuleContext {
		public LineNoBreakContext lineNoBreak() {
			return getRuleContext(LineNoBreakContext.class,0);
		}
		public List<LinesContext> lines() {
			return getRuleContexts(LinesContext.class);
		}
		public LinesContext lines(int i) {
			return getRuleContext(LinesContext.class,i);
		}
		public ParagraphNoBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraphNoBreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterParagraphNoBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitParagraphNoBreak(this);
		}
	}

	public final ParagraphNoBreakContext paragraphNoBreak() throws RecognitionException {
		ParagraphNoBreakContext _localctx = new ParagraphNoBreakContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_paragraphNoBreak);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			lineNoBreak();
			setState(334);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(331);
					lines();
					}
					} 
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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

	public static class LineNoBreakContext extends ParserRuleContext {
		public SpanLineStartNoStarContext spanLineStartNoStar() {
			return getRuleContext(SpanLineStartNoStarContext.class,0);
		}
		public IndentationContext indentation() {
			return getRuleContext(IndentationContext.class,0);
		}
		public List<SpanContext> span() {
			return getRuleContexts(SpanContext.class);
		}
		public SpanContext span(int i) {
			return getRuleContext(SpanContext.class,i);
		}
		public LineNoBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineNoBreak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterLineNoBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitLineNoBreak(this);
		}
	}

	public final LineNoBreakContext lineNoBreak() throws RecognitionException {
		LineNoBreakContext _localctx = new LineNoBreakContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lineNoBreak);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Space) {
				{
				setState(337);
				indentation();
				}
			}

			setState(340);
			spanLineStartNoStar();
			setState(344);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(341);
					span();
					}
					} 
				}
				setState(346);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class LinesContext extends ParserRuleContext {
		public LinesStarContext linesStar() {
			return getRuleContext(LinesStarContext.class,0);
		}
		public LinesNormalContext linesNormal() {
			return getRuleContext(LinesNormalContext.class,0);
		}
		public LinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitLines(this);
		}
	}

	public final LinesContext lines() throws RecognitionException {
		LinesContext _localctx = new LinesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_lines);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				linesStar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				linesNormal();
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

	public static class LinesNormalContext extends ParserRuleContext {
		public LineNormalContext lineNormal() {
			return getRuleContext(LineNormalContext.class,0);
		}
		public LinesStarContext linesStar() {
			return getRuleContext(LinesStarContext.class,0);
		}
		public LinesNormalContext linesNormal() {
			return getRuleContext(LinesNormalContext.class,0);
		}
		public LinesNormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linesNormal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterLinesNormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitLinesNormal(this);
		}
	}

	public final LinesNormalContext linesNormal() throws RecognitionException {
		LinesNormalContext _localctx = new LinesNormalContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_linesNormal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			lineNormal();
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(352);
				linesStar();
				}
				break;
			case 2:
				{
				setState(354);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(353);
					linesNormal();
					}
					break;
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

	public static class LinesStarContext extends ParserRuleContext {
		public LineStarContext lineStar() {
			return getRuleContext(LineStarContext.class,0);
		}
		public LineNoBreakContext lineNoBreak() {
			return getRuleContext(LineNoBreakContext.class,0);
		}
		public LinesNormalContext linesNormal() {
			return getRuleContext(LinesNormalContext.class,0);
		}
		public LinesStarContext linesStar() {
			return getRuleContext(LinesStarContext.class,0);
		}
		public LinesStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linesStar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterLinesStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitLinesStar(this);
		}
	}

	public final LinesStarContext linesStar() throws RecognitionException {
		LinesStarContext _localctx = new LinesStarContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_linesStar);
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				lineStar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				lineStar();
				setState(360);
				lineNoBreak();
				setState(362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1+1:
					{
					setState(361);
					linesNormal();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				lineStar();
				setState(365);
				lineNoBreak();
				setState(366);
				linesStar();
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

	public static class LineNormalContext extends ParserRuleContext {
		public TerminalNode LineBreak() { return getToken(ReStructuredTextParser.LineBreak, 0); }
		public IndentationContext indentation() {
			return getRuleContext(IndentationContext.class,0);
		}
		public List<SpanLineStartNoStarContext> spanLineStartNoStar() {
			return getRuleContexts(SpanLineStartNoStarContext.class);
		}
		public SpanLineStartNoStarContext spanLineStartNoStar(int i) {
			return getRuleContext(SpanLineStartNoStarContext.class,i);
		}
		public List<SpanContext> span() {
			return getRuleContexts(SpanContext.class);
		}
		public SpanContext span(int i) {
			return getRuleContext(SpanContext.class,i);
		}
		public List<SpanNoStarContext> spanNoStar() {
			return getRuleContexts(SpanNoStarContext.class);
		}
		public SpanNoStarContext spanNoStar(int i) {
			return getRuleContext(SpanNoStarContext.class,i);
		}
		public LineSpecialContext lineSpecial() {
			return getRuleContext(LineSpecialContext.class,0);
		}
		public LineNormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineNormal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterLineNormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitLineNormal(this);
		}
	}

	public final LineNormalContext lineNormal() throws RecognitionException {
		LineNormalContext _localctx = new LineNormalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_lineNormal);
		int _la;
		try {
			int _alt;
			setState(393);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				match(LineBreak);
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Space) {
					{
					setState(371);
					indentation();
					}
				}

				setState(375); 
				_errHandler.sync(this);
				_alt = 1+1;
				do {
					switch (_alt) {
					case 1+1:
						{
						{
						setState(374);
						spanLineStartNoStar();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(377); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(382);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(379);
							span();
							}
							} 
						}
						setState(384);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
					}
					setState(386); 
					_errHandler.sync(this);
					_alt = 1+1;
					do {
						switch (_alt) {
						case 1+1:
							{
							{
							setState(385);
							spanNoStar();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(388); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
					} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				lineSpecial();
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

	public static class LineStarContext extends ParserRuleContext {
		public TerminalNode LineBreak() { return getToken(ReStructuredTextParser.LineBreak, 0); }
		public StarTextContext starText() {
			return getRuleContext(StarTextContext.class,0);
		}
		public IndentationContext indentation() {
			return getRuleContext(IndentationContext.class,0);
		}
		public List<SpanLineStartNoStarContext> spanLineStartNoStar() {
			return getRuleContexts(SpanLineStartNoStarContext.class);
		}
		public SpanLineStartNoStarContext spanLineStartNoStar(int i) {
			return getRuleContext(SpanLineStartNoStarContext.class,i);
		}
		public List<Text_fragmentContext> text_fragment() {
			return getRuleContexts(Text_fragmentContext.class);
		}
		public Text_fragmentContext text_fragment(int i) {
			return getRuleContext(Text_fragmentContext.class,i);
		}
		public LineStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterLineStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitLineStar(this);
		}
	}

	public final LineStarContext lineStar() throws RecognitionException {
		LineStarContext _localctx = new LineStarContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lineStar);
		int _la;
		try {
			int _alt;
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				match(LineBreak);
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Space) {
					{
					setState(396);
					indentation();
					}
				}

				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(399);
						spanLineStartNoStar();
						}
						} 
					}
					setState(404);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(405);
				starText();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				match(LineBreak);
				setState(408);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(407);
					indentation();
					}
					break;
				}
				setState(411); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(410);
						text_fragment();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(413); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(415);
				starText();
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

	public static class LineSpecialContext extends ParserRuleContext {
		public TerminalNode Numbers() { return getToken(ReStructuredTextParser.Numbers, 0); }
		public TerminalNode Dot() { return getToken(ReStructuredTextParser.Dot, 0); }
		public TerminalNode LineBreak() { return getToken(ReStructuredTextParser.LineBreak, 0); }
		public IndentationContext indentation() {
			return getRuleContext(IndentationContext.class,0);
		}
		public List<TerminalNode> SectionSeparator() { return getTokens(ReStructuredTextParser.SectionSeparator); }
		public TerminalNode SectionSeparator(int i) {
			return getToken(ReStructuredTextParser.SectionSeparator, i);
		}
		public List<TerminalNode> Space() { return getTokens(ReStructuredTextParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(ReStructuredTextParser.Space, i);
		}
		public LineSpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineSpecial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterLineSpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitLineSpecial(this);
		}
	}

	public final LineSpecialContext lineSpecial() throws RecognitionException {
		LineSpecialContext _localctx = new LineSpecialContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_lineSpecial);
		int _la;
		try {
			int _alt;
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				match(Numbers);
				setState(420);
				match(Dot);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				match(LineBreak);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Space) {
					{
					setState(422);
					indentation();
					}
				}

				setState(425);
				match(Numbers);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
				match(LineBreak);
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Space) {
					{
					setState(427);
					indentation();
					}
				}

				setState(430);
				match(SectionSeparator);
				{
				setState(432); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(431);
					match(Space);
					}
					}
					setState(434); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Space );
				setState(436);
				match(SectionSeparator);
				}
				setState(441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(438);
						match(Space);
						}
						} 
					}
					setState(443);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
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

	public static class Empty_lineContext extends ParserRuleContext {
		public TerminalNode LineBreak() { return getToken(ReStructuredTextParser.LineBreak, 0); }
		public List<TerminalNode> Space() { return getTokens(ReStructuredTextParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(ReStructuredTextParser.Space, i);
		}
		public Empty_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterEmpty_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitEmpty_line(this);
		}
	}

	public final Empty_lineContext empty_line() throws RecognitionException {
		Empty_lineContext _localctx = new Empty_lineContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_empty_line);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(LineBreak);
			setState(450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(447);
					match(Space);
					}
					} 
				}
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	public static class IndentationContext extends ParserRuleContext {
		public List<TerminalNode> Space() { return getTokens(ReStructuredTextParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(ReStructuredTextParser.Space, i);
		}
		public IndentationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indentation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterIndentation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitIndentation(this);
		}
	}

	public final IndentationContext indentation() throws RecognitionException {
		IndentationContext _localctx = new IndentationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_indentation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(454); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(453);
					match(Space);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(456); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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

	public static class SpanLineStartNoStarContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public ReferenceInContext referenceIn() {
			return getRuleContext(ReferenceInContext.class,0);
		}
		public HyperlinkTargetContext hyperlinkTarget() {
			return getRuleContext(HyperlinkTargetContext.class,0);
		}
		public HyperlinkContext hyperlink() {
			return getRuleContext(HyperlinkContext.class,0);
		}
		public HyperlinkDocContext hyperlinkDoc() {
			return getRuleContext(HyperlinkDocContext.class,0);
		}
		public BackTickTextContext backTickText() {
			return getRuleContext(BackTickTextContext.class,0);
		}
		public QuotedLiteralContext quotedLiteral() {
			return getRuleContext(QuotedLiteralContext.class,0);
		}
		public TextLineStartContext textLineStart() {
			return getRuleContext(TextLineStartContext.class,0);
		}
		public SpanLineStartNoStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spanLineStartNoStar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterSpanLineStartNoStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitSpanLineStartNoStar(this);
		}
	}

	public final SpanLineStartNoStarContext spanLineStartNoStar() throws RecognitionException {
		SpanLineStartNoStarContext _localctx = new SpanLineStartNoStarContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_spanLineStartNoStar);
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				reference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				referenceIn();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				hyperlinkTarget();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(461);
				hyperlink();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(462);
				hyperlinkDoc();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(463);
				backTickText();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(464);
				quotedLiteral();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(465);
				textLineStart();
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

	public static class TextLineStartContext extends ParserRuleContext {
		public List<LineStart_fragmentContext> lineStart_fragment() {
			return getRuleContexts(LineStart_fragmentContext.class);
		}
		public LineStart_fragmentContext lineStart_fragment(int i) {
			return getRuleContext(LineStart_fragmentContext.class,i);
		}
		public List<Text_fragmentContext> text_fragment() {
			return getRuleContexts(Text_fragmentContext.class);
		}
		public Text_fragmentContext text_fragment(int i) {
			return getRuleContext(Text_fragmentContext.class,i);
		}
		public TextLineStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textLineStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterTextLineStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitTextLineStart(this);
		}
	}

	public final TextLineStartContext textLineStart() throws RecognitionException {
		TextLineStartContext _localctx = new TextLineStartContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_textLineStart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(469); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(468);
					lineStart_fragment();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(471); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(473);
					text_fragment();
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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

	public static class LineStart_fragmentContext extends ParserRuleContext {
		public TerminalNode Minus() { return getToken(ReStructuredTextParser.Minus, 0); }
		public TerminalNode Space() { return getToken(ReStructuredTextParser.Space, 0); }
		public TerminalNode LineBreak() { return getToken(ReStructuredTextParser.LineBreak, 0); }
		public TerminalNode Star() { return getToken(ReStructuredTextParser.Star, 0); }
		public TerminalNode Plus() { return getToken(ReStructuredTextParser.Plus, 0); }
		public TerminalNode Numbers() { return getToken(ReStructuredTextParser.Numbers, 0); }
		public TerminalNode Dot() { return getToken(ReStructuredTextParser.Dot, 0); }
		public TerminalNode Alphabet() { return getToken(ReStructuredTextParser.Alphabet, 0); }
		public TerminalNode Block() { return getToken(ReStructuredTextParser.Block, 0); }
		public TerminalNode UnderScore() { return getToken(ReStructuredTextParser.UnderScore, 0); }
		public List<SeparatorContext> separator() {
			return getRuleContexts(SeparatorContext.class);
		}
		public SeparatorContext separator(int i) {
			return getRuleContext(SeparatorContext.class,i);
		}
		public TerminalNode TimeStar() { return getToken(ReStructuredTextParser.TimeStar, 0); }
		public TerminalNode SquareLeft() { return getToken(ReStructuredTextParser.SquareLeft, 0); }
		public TerminalNode SquareRight() { return getToken(ReStructuredTextParser.SquareRight, 0); }
		public TerminalNode RoundLeft() { return getToken(ReStructuredTextParser.RoundLeft, 0); }
		public TerminalNode RoundRight() { return getToken(ReStructuredTextParser.RoundRight, 0); }
		public TerminalNode SemiColon() { return getToken(ReStructuredTextParser.SemiColon, 0); }
		public TerminalNode Colon() { return getToken(ReStructuredTextParser.Colon, 0); }
		public TerminalNode QuotationDouble() { return getToken(ReStructuredTextParser.QuotationDouble, 0); }
		public TerminalNode QuotationSingle() { return getToken(ReStructuredTextParser.QuotationSingle, 0); }
		public TerminalNode AngleLeft() { return getToken(ReStructuredTextParser.AngleLeft, 0); }
		public TerminalNode AngleRight() { return getToken(ReStructuredTextParser.AngleRight, 0); }
		public TerminalNode Any() { return getToken(ReStructuredTextParser.Any, 0); }
		public LineStart_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineStart_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterLineStart_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitLineStart_fragment(this);
		}
	}

	public final LineStart_fragmentContext lineStart_fragment() throws RecognitionException {
		LineStart_fragmentContext _localctx = new LineStart_fragmentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_lineStart_fragment);
		int _la;
		try {
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(479);
				match(Minus);
				setState(480);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Space) | (1L << LineBreak))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(481);
				match(Plus);
				setState(482);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Star || _la==Space) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(483);
				match(Numbers);
				setState(484);
				match(Dot);
				setState(485);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Space) | (1L << LineBreak))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(486);
				match(Numbers);
				setState(487);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Dot) | (1L << Star) | (1L << LineBreak))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(488);
				match(Alphabet);
				setState(489);
				match(Dot);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(490);
				match(Block);
				setState(491);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Star || _la==Space) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(492);
				match(UnderScore);
				setState(493);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==Star || _la==Space) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(494);
				match(Alphabet);
				setState(495);
				_la = _input.LA(1);
				if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Dot) | (1L << Star) | (1L << LineBreak))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(496);
				match(Alphabet);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(497);
				separator();
				setState(498);
				separator();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(500);
				match(TimeStar);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(501);
				match(SquareLeft);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(502);
				match(SquareRight);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(503);
				match(RoundLeft);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(504);
				match(RoundRight);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(505);
				match(SemiColon);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(506);
				match(Colon);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(507);
				match(QuotationDouble);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(508);
				match(QuotationSingle);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(509);
				match(Dot);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(510);
				match(UnderScore);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(511);
				match(AngleLeft);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(512);
				match(AngleRight);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(513);
				match(Any);
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

	public static class TextContext extends ParserRuleContext {
		public List<TextStartContext> textStart() {
			return getRuleContexts(TextStartContext.class);
		}
		public TextStartContext textStart(int i) {
			return getRuleContext(TextStartContext.class,i);
		}
		public List<Text_fragmentContext> text_fragment() {
			return getRuleContexts(Text_fragmentContext.class);
		}
		public Text_fragmentContext text_fragment(int i) {
			return getRuleContext(Text_fragmentContext.class,i);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitText(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_text);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(517); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(516);
					textStart();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(519); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(521);
					text_fragment();
					}
					} 
				}
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class TextStartContext extends ParserRuleContext {
		public ForcedTextContext forcedText() {
			return getRuleContext(ForcedTextContext.class,0);
		}
		public LineStart_fragmentContext lineStart_fragment() {
			return getRuleContext(LineStart_fragmentContext.class,0);
		}
		public List<Text_fragment_startContext> text_fragment_start() {
			return getRuleContexts(Text_fragment_startContext.class);
		}
		public Text_fragment_startContext text_fragment_start(int i) {
			return getRuleContext(Text_fragment_startContext.class,i);
		}
		public TerminalNode Space() { return getToken(ReStructuredTextParser.Space, 0); }
		public TextStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterTextStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitTextStart(this);
		}
	}

	public final TextStartContext textStart() throws RecognitionException {
		TextStartContext _localctx = new TextStartContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_textStart);
		try {
			int _alt;
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(527);
				forcedText();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				lineStart_fragment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(529);
				text_fragment_start();
				setState(531); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(530);
						text_fragment_start();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(533); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
				match(Space);
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

	public static class ForcedTextContext extends ParserRuleContext {
		public TerminalNode RoundLeft() { return getToken(ReStructuredTextParser.RoundLeft, 0); }
		public TerminalNode Star() { return getToken(ReStructuredTextParser.Star, 0); }
		public TerminalNode RoundRight() { return getToken(ReStructuredTextParser.RoundRight, 0); }
		public TerminalNode SquareLeft() { return getToken(ReStructuredTextParser.SquareLeft, 0); }
		public TerminalNode SquareRight() { return getToken(ReStructuredTextParser.SquareRight, 0); }
		public List<TerminalNode> QuotationSingle() { return getTokens(ReStructuredTextParser.QuotationSingle); }
		public TerminalNode QuotationSingle(int i) {
			return getToken(ReStructuredTextParser.QuotationSingle, i);
		}
		public List<TerminalNode> QuotationDouble() { return getTokens(ReStructuredTextParser.QuotationDouble); }
		public TerminalNode QuotationDouble(int i) {
			return getToken(ReStructuredTextParser.QuotationDouble, i);
		}
		public ForcedTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forcedText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterForcedText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitForcedText(this);
		}
	}

	public final ForcedTextContext forcedText() throws RecognitionException {
		ForcedTextContext _localctx = new ForcedTextContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_forcedText);
		try {
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(538);
				match(RoundLeft);
				setState(539);
				match(Star);
				setState(540);
				match(RoundRight);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(541);
				match(SquareLeft);
				setState(542);
				match(Star);
				setState(543);
				match(SquareRight);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(544);
				match(QuotationSingle);
				setState(545);
				match(Star);
				setState(546);
				match(QuotationSingle);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(547);
				match(QuotationSingle);
				setState(548);
				match(QuotationDouble);
				setState(549);
				match(Star);
				setState(550);
				match(QuotationDouble);
				setState(551);
				match(QuotationSingle);
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

	public static class SpanNoStarContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public ReferenceInContext referenceIn() {
			return getRuleContext(ReferenceInContext.class,0);
		}
		public HyperlinkTargetContext hyperlinkTarget() {
			return getRuleContext(HyperlinkTargetContext.class,0);
		}
		public HyperlinkContext hyperlink() {
			return getRuleContext(HyperlinkContext.class,0);
		}
		public HyperlinkDocContext hyperlinkDoc() {
			return getRuleContext(HyperlinkDocContext.class,0);
		}
		public BackTickTextContext backTickText() {
			return getRuleContext(BackTickTextContext.class,0);
		}
		public QuotedLiteralContext quotedLiteral() {
			return getRuleContext(QuotedLiteralContext.class,0);
		}
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public SpanNoStarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spanNoStar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterSpanNoStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitSpanNoStar(this);
		}
	}

	public final SpanNoStarContext spanNoStar() throws RecognitionException {
		SpanNoStarContext _localctx = new SpanNoStarContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_spanNoStar);
		try {
			setState(562);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(554);
				reference();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				referenceIn();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				hyperlinkTarget();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(557);
				hyperlink();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(558);
				hyperlinkDoc();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(559);
				backTickText();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(560);
				quotedLiteral();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(561);
				text();
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

	public static class SpanContext extends ParserRuleContext {
		public StarTextContext starText() {
			return getRuleContext(StarTextContext.class,0);
		}
		public SpanNoStarContext spanNoStar() {
			return getRuleContext(SpanNoStarContext.class,0);
		}
		public SpanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_span; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterSpan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitSpan(this);
		}
	}

	public final SpanContext span() throws RecognitionException {
		SpanContext _localctx = new SpanContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_span);
		try {
			setState(566);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				starText();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				spanNoStar();
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

	public static class QuotedLiteralContext extends ParserRuleContext {
		public TerminalNode AngleRight() { return getToken(ReStructuredTextParser.AngleRight, 0); }
		public TerminalNode Space() { return getToken(ReStructuredTextParser.Space, 0); }
		public LineNoBreakContext lineNoBreak() {
			return getRuleContext(LineNoBreakContext.class,0);
		}
		public QuotedLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterQuotedLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitQuotedLiteral(this);
		}
	}

	public final QuotedLiteralContext quotedLiteral() throws RecognitionException {
		QuotedLiteralContext _localctx = new QuotedLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_quotedLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(AngleRight);
			setState(569);
			match(Space);
			setState(570);
			lineNoBreak();
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

	public static class Text_fragment_startContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(ReStructuredTextParser.SemiColon, 0); }
		public TerminalNode Numbers() { return getToken(ReStructuredTextParser.Numbers, 0); }
		public TerminalNode Alphabet() { return getToken(ReStructuredTextParser.Alphabet, 0); }
		public TerminalNode Space() { return getToken(ReStructuredTextParser.Space, 0); }
		public TerminalNode SquareLeft() { return getToken(ReStructuredTextParser.SquareLeft, 0); }
		public TerminalNode SquareRight() { return getToken(ReStructuredTextParser.SquareRight, 0); }
		public TerminalNode RoundLeft() { return getToken(ReStructuredTextParser.RoundLeft, 0); }
		public TerminalNode RoundRight() { return getToken(ReStructuredTextParser.RoundRight, 0); }
		public TerminalNode Colon() { return getToken(ReStructuredTextParser.Colon, 0); }
		public SeparatorContext separator() {
			return getRuleContext(SeparatorContext.class,0);
		}
		public TerminalNode AngleLeft() { return getToken(ReStructuredTextParser.AngleLeft, 0); }
		public TerminalNode AngleRight() { return getToken(ReStructuredTextParser.AngleRight, 0); }
		public TerminalNode QuotationDouble() { return getToken(ReStructuredTextParser.QuotationDouble, 0); }
		public TerminalNode Dot() { return getToken(ReStructuredTextParser.Dot, 0); }
		public TerminalNode Star() { return getToken(ReStructuredTextParser.Star, 0); }
		public TerminalNode Any() { return getToken(ReStructuredTextParser.Any, 0); }
		public Text_fragment_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_fragment_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterText_fragment_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitText_fragment_start(this);
		}
	}

	public final Text_fragment_startContext text_fragment_start() throws RecognitionException {
		Text_fragment_startContext _localctx = new Text_fragment_startContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_text_fragment_start);
		try {
			setState(589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SemiColon:
				enterOuterAlt(_localctx, 1);
				{
				setState(572);
				match(SemiColon);
				}
				break;
			case Numbers:
				enterOuterAlt(_localctx, 2);
				{
				setState(573);
				match(Numbers);
				}
				break;
			case Alphabet:
				enterOuterAlt(_localctx, 3);
				{
				setState(574);
				match(Alphabet);
				}
				break;
			case Space:
				enterOuterAlt(_localctx, 4);
				{
				setState(575);
				match(Space);
				}
				break;
			case SquareLeft:
				enterOuterAlt(_localctx, 5);
				{
				setState(576);
				match(SquareLeft);
				}
				break;
			case SquareRight:
				enterOuterAlt(_localctx, 6);
				{
				setState(577);
				match(SquareRight);
				}
				break;
			case RoundLeft:
				enterOuterAlt(_localctx, 7);
				{
				setState(578);
				match(RoundLeft);
				}
				break;
			case RoundRight:
				enterOuterAlt(_localctx, 8);
				{
				setState(579);
				match(RoundRight);
				}
				break;
			case Colon:
				enterOuterAlt(_localctx, 9);
				{
				setState(580);
				match(Colon);
				}
				break;
			case Hat:
			case Equal:
			case Plus:
			case Minus:
				enterOuterAlt(_localctx, 10);
				{
				setState(581);
				separator();
				}
				break;
			case AngleLeft:
				enterOuterAlt(_localctx, 11);
				{
				setState(582);
				match(AngleLeft);
				}
				break;
			case AngleRight:
				enterOuterAlt(_localctx, 12);
				{
				setState(583);
				match(AngleRight);
				}
				break;
			case QuotationDouble:
				enterOuterAlt(_localctx, 13);
				{
				setState(584);
				match(QuotationDouble);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 14);
				{
				setState(585);
				match(Dot);
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 15);
				{
				setState(586);
				match(Star);
				setState(587);
				match(Space);
				}
				break;
			case Any:
				enterOuterAlt(_localctx, 16);
				{
				setState(588);
				match(Any);
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

	public static class Text_fragmentContext extends ParserRuleContext {
		public Text_fragment_startContext text_fragment_start() {
			return getRuleContext(Text_fragment_startContext.class,0);
		}
		public ForcedTextContext forcedText() {
			return getRuleContext(ForcedTextContext.class,0);
		}
		public TerminalNode Block() { return getToken(ReStructuredTextParser.Block, 0); }
		public TerminalNode Literal() { return getToken(ReStructuredTextParser.Literal, 0); }
		public TerminalNode Comment() { return getToken(ReStructuredTextParser.Comment, 0); }
		public TerminalNode Dot() { return getToken(ReStructuredTextParser.Dot, 0); }
		public TerminalNode Quote() { return getToken(ReStructuredTextParser.Quote, 0); }
		public Text_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterText_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitText_fragment(this);
		}
	}

	public final Text_fragmentContext text_fragment() throws RecognitionException {
		Text_fragmentContext _localctx = new Text_fragmentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_text_fragment);
		try {
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				text_fragment_start();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				forcedText();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(593);
				match(Block);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(594);
				match(Literal);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(595);
				match(Comment);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(596);
				match(Dot);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(597);
				match(Quote);
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

	public static class StarTextContext extends ParserRuleContext {
		public List<TerminalNode> LineBreak() { return getTokens(ReStructuredTextParser.LineBreak); }
		public TerminalNode LineBreak(int i) {
			return getToken(ReStructuredTextParser.LineBreak, i);
		}
		public List<TerminalNode> Star() { return getTokens(ReStructuredTextParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(ReStructuredTextParser.Star, i);
		}
		public List<StarNoSpaceContext> starNoSpace() {
			return getRuleContexts(StarNoSpaceContext.class);
		}
		public StarNoSpaceContext starNoSpace(int i) {
			return getRuleContext(StarNoSpaceContext.class,i);
		}
		public List<StarAtomsContext> starAtoms() {
			return getRuleContexts(StarAtomsContext.class);
		}
		public StarAtomsContext starAtoms(int i) {
			return getRuleContext(StarAtomsContext.class,i);
		}
		public List<TerminalNode> Space() { return getTokens(ReStructuredTextParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(ReStructuredTextParser.Space, i);
		}
		public StarTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterStarText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitStarText(this);
		}
	}

	public final StarTextContext starText() throws RecognitionException {
		StarTextContext _localctx = new StarTextContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_starText);
		int _la;
		try {
			int _alt;
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(601); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(600);
					match(Star);
					}
					}
					setState(603); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Star );
				setState(605);
				match(LineBreak);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(606);
					match(Star);
					}
					}
					setState(609); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Star );
				setState(611);
				starNoSpace();
				setState(612);
				starAtoms();
				setState(625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(613);
						match(LineBreak);
						setState(617);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Star) {
							{
							{
							setState(614);
							match(Star);
							}
							}
							setState(619);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(620);
						starNoSpace();
						setState(621);
						starAtoms();
						}
						} 
					}
					setState(627);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
				}
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Star) {
					{
					{
					setState(628);
					match(Star);
					}
					}
					setState(633);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(634);
				match(LineBreak);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(637); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(636);
					match(Star);
					}
					}
					setState(639); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Star );
				setState(641);
				starNoSpace();
				setState(642);
				starAtoms();
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Star) {
					{
					{
					setState(643);
					match(Star);
					}
					}
					setState(648);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(649);
				match(LineBreak);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(652); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(651);
					match(Star);
					}
					}
					setState(654); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Star );
				setState(657); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(656);
						match(Space);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(659); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(661);
				starAtoms();
				setState(663); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(662);
					match(Star);
					}
					}
					setState(665); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Star );
				setState(667);
				match(LineBreak);
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

	public static class StarAtomsContext extends ParserRuleContext {
		public List<StarAtomContext> starAtom() {
			return getRuleContexts(StarAtomContext.class);
		}
		public StarAtomContext starAtom(int i) {
			return getRuleContext(StarAtomContext.class,i);
		}
		public List<TerminalNode> Star() { return getTokens(ReStructuredTextParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(ReStructuredTextParser.Star, i);
		}
		public StarAtomsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starAtoms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterStarAtoms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitStarAtoms(this);
		}
	}

	public final StarAtomsContext starAtoms() throws RecognitionException {
		StarAtomsContext _localctx = new StarAtomsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_starAtoms);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(671);
					starAtom();
					}
					} 
				}
				setState(676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			setState(686);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(680);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Star) {
						{
						{
						setState(677);
						match(Star);
						}
						}
						setState(682);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(683);
					starAtom();
					}
					} 
				}
				setState(688);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
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

	public static class StarNoSpaceContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(ReStructuredTextParser.Star, 0); }
		public TerminalNode LineBreak() { return getToken(ReStructuredTextParser.LineBreak, 0); }
		public TerminalNode Space() { return getToken(ReStructuredTextParser.Space, 0); }
		public TerminalNode SectionSeparator() { return getToken(ReStructuredTextParser.SectionSeparator, 0); }
		public StarNoSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starNoSpace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterStarNoSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitStarNoSpace(this);
		}
	}

	public final StarNoSpaceContext starNoSpace() throws RecognitionException {
		StarNoSpaceContext _localctx = new StarNoSpaceContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_starNoSpace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SectionSeparator) | (1L << Star) | (1L << Space) | (1L << LineBreak))) != 0)) ) {
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

	public static class StarAtomContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(ReStructuredTextParser.Star, 0); }
		public TerminalNode LineBreak() { return getToken(ReStructuredTextParser.LineBreak, 0); }
		public StarAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterStarAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitStarAtom(this);
		}
	}

	public final StarAtomContext starAtom() throws RecognitionException {
		StarAtomContext _localctx = new StarAtomContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_starAtom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==Star || _la==LineBreak) ) {
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

	public static class BackTickTextContext extends ParserRuleContext {
		public Token titled;
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> Colon() { return getTokens(ReStructuredTextParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(ReStructuredTextParser.Colon, i);
		}
		public TerminalNode UnderScore() { return getToken(ReStructuredTextParser.UnderScore, 0); }
		public TerminalNode Alphabet() { return getToken(ReStructuredTextParser.Alphabet, 0); }
		public BackTickTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backTickText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterBackTickText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitBackTickText(this);
		}
	}

	public final BackTickTextContext backTickText() throws RecognitionException {
		BackTickTextContext _localctx = new BackTickTextContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_backTickText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(693);
				match(Colon);
				setState(694);
				((BackTickTextContext)_localctx).titled = match(Alphabet);
				setState(695);
				match(Colon);
				}
			}

			setState(698);
			body();
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(699);
				match(UnderScore);
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

	public static class BodyContext extends ParserRuleContext {
		public List<TerminalNode> BackTick() { return getTokens(ReStructuredTextParser.BackTick); }
		public TerminalNode BackTick(int i) {
			return getToken(ReStructuredTextParser.BackTick, i);
		}
		public BackTickAtomsContext backTickAtoms() {
			return getRuleContext(BackTickAtomsContext.class,0);
		}
		public BackTickNoSpaceContext backTickNoSpace() {
			return getRuleContext(BackTickNoSpaceContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_body);
		try {
			int _alt;
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				match(BackTick);
				setState(706);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(703);
						match(BackTick);
						}
						} 
					}
					setState(708);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				setState(709);
				backTickAtoms();
				setState(711); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(710);
						match(BackTick);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(713); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
				match(BackTick);
				setState(716);
				backTickNoSpace();
				setState(717);
				backTickAtoms();
				setState(719); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(718);
						match(BackTick);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(721); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(723);
				match(BackTick);
				setState(724);
				match(BackTick);
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

	public static class BackTickAtomsContext extends ParserRuleContext {
		public List<BackTickAtomContext> backTickAtom() {
			return getRuleContexts(BackTickAtomContext.class);
		}
		public BackTickAtomContext backTickAtom(int i) {
			return getRuleContext(BackTickAtomContext.class,i);
		}
		public BackTickAtomsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backTickAtoms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterBackTickAtoms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitBackTickAtoms(this);
		}
	}

	public final BackTickAtomsContext backTickAtoms() throws RecognitionException {
		BackTickAtomsContext _localctx = new BackTickAtomsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_backTickAtoms);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(728); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(727);
					backTickAtom();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(730); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,96,_ctx);
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

	public static class BackTickNoSpaceContext extends ParserRuleContext {
		public TerminalNode BackTick() { return getToken(ReStructuredTextParser.BackTick, 0); }
		public TerminalNode LineBreak() { return getToken(ReStructuredTextParser.LineBreak, 0); }
		public TerminalNode Space() { return getToken(ReStructuredTextParser.Space, 0); }
		public BackTickNoSpaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backTickNoSpace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterBackTickNoSpace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitBackTickNoSpace(this);
		}
	}

	public final BackTickNoSpaceContext backTickNoSpace() throws RecognitionException {
		BackTickNoSpaceContext _localctx = new BackTickNoSpaceContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_backTickNoSpace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BackTick) | (1L << Space) | (1L << LineBreak))) != 0)) ) {
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

	public static class BackTickAtomContext extends ParserRuleContext {
		public List<TerminalNode> BackTick() { return getTokens(ReStructuredTextParser.BackTick); }
		public TerminalNode BackTick(int i) {
			return getToken(ReStructuredTextParser.BackTick, i);
		}
		public TerminalNode LineBreak() { return getToken(ReStructuredTextParser.LineBreak, 0); }
		public BackTickAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_backTickAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterBackTickAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitBackTickAtom(this);
		}
	}

	public final BackTickAtomContext backTickAtom() throws RecognitionException {
		BackTickAtomContext _localctx = new BackTickAtomContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_backTickAtom);
		int _la;
		try {
			setState(737);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case SectionSeparator:
			case Literal:
			case TimeStar:
			case Alphabet:
			case Numbers:
			case Quote:
			case SquareLeft:
			case SquareRight:
			case RoundLeft:
			case RoundRight:
			case AngleLeft:
			case AngleRight:
			case Hat:
			case QuotationDouble:
			case QuotationSingle:
			case Dot:
			case SemiColon:
			case Colon:
			case Equal:
			case Plus:
			case Minus:
			case Block:
			case Comment:
			case UnderScore:
			case Star:
			case Space:
			case Any:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==BackTick || _la==LineBreak) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case BackTick:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				match(BackTick);
				setState(736);
				_la = _input.LA(1);
				if ( _la <= 0 || (_la==BackTick || _la==LineBreak) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode UnderScore() { return getToken(ReStructuredTextParser.UnderScore, 0); }
		public List<TerminalNode> Any() { return getTokens(ReStructuredTextParser.Any); }
		public TerminalNode Any(int i) {
			return getToken(ReStructuredTextParser.Any, i);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitReference(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(739);
				match(Any);
				}
				}
				setState(742); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Any );
			setState(744);
			match(UnderScore);
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

	public static class ReferenceInContext extends ParserRuleContext {
		public TerminalNode UnderScore() { return getToken(ReStructuredTextParser.UnderScore, 0); }
		public TerminalNode Colon() { return getToken(ReStructuredTextParser.Colon, 0); }
		public TerminalNode Space() { return getToken(ReStructuredTextParser.Space, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public List<HyperlinkAtomContext> hyperlinkAtom() {
			return getRuleContexts(HyperlinkAtomContext.class);
		}
		public HyperlinkAtomContext hyperlinkAtom(int i) {
			return getRuleContext(HyperlinkAtomContext.class,i);
		}
		public ReferenceInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referenceIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterReferenceIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitReferenceIn(this);
		}
	}

	public final ReferenceInContext referenceIn() throws RecognitionException {
		ReferenceInContext _localctx = new ReferenceInContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_referenceIn);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(UnderScore);
			setState(748); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(747);
					hyperlinkAtom();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(750); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(752);
			match(Colon);
			setState(753);
			match(Space);
			setState(754);
			url();
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

	public static class HyperlinkTargetContext extends ParserRuleContext {
		public TerminalNode UnderScore() { return getToken(ReStructuredTextParser.UnderScore, 0); }
		public List<TerminalNode> Any() { return getTokens(ReStructuredTextParser.Any); }
		public TerminalNode Any(int i) {
			return getToken(ReStructuredTextParser.Any, i);
		}
		public HyperlinkTargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hyperlinkTarget; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterHyperlinkTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitHyperlinkTarget(this);
		}
	}

	public final HyperlinkTargetContext hyperlinkTarget() throws RecognitionException {
		HyperlinkTargetContext _localctx = new HyperlinkTargetContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_hyperlinkTarget);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(756);
			match(UnderScore);
			setState(758); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(757);
					match(Any);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(760); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
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

	public static class HyperlinkContext extends ParserRuleContext {
		public List<TerminalNode> BackTick() { return getTokens(ReStructuredTextParser.BackTick); }
		public TerminalNode BackTick(int i) {
			return getToken(ReStructuredTextParser.BackTick, i);
		}
		public List<TerminalNode> Space() { return getTokens(ReStructuredTextParser.Space); }
		public TerminalNode Space(int i) {
			return getToken(ReStructuredTextParser.Space, i);
		}
		public TerminalNode AngleLeft() { return getToken(ReStructuredTextParser.AngleLeft, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public TerminalNode AngleRight() { return getToken(ReStructuredTextParser.AngleRight, 0); }
		public TerminalNode UnderScore() { return getToken(ReStructuredTextParser.UnderScore, 0); }
		public List<HyperlinkAtomContext> hyperlinkAtom() {
			return getRuleContexts(HyperlinkAtomContext.class);
		}
		public HyperlinkAtomContext hyperlinkAtom(int i) {
			return getRuleContext(HyperlinkAtomContext.class,i);
		}
		public HyperlinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hyperlink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterHyperlink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitHyperlink(this);
		}
	}

	public final HyperlinkContext hyperlink() throws RecognitionException {
		HyperlinkContext _localctx = new HyperlinkContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_hyperlink);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			match(BackTick);
			setState(764); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(763);
					hyperlinkAtom();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(766); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(768);
			match(Space);
			setState(769);
			match(AngleLeft);
			setState(770);
			url();
			setState(771);
			match(AngleRight);
			setState(772);
			match(BackTick);
			setState(773);
			match(UnderScore);
			setState(774);
			match(Space);
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

	public static class HyperlinkDocContext extends ParserRuleContext {
		public List<TerminalNode> BackTick() { return getTokens(ReStructuredTextParser.BackTick); }
		public TerminalNode BackTick(int i) {
			return getToken(ReStructuredTextParser.BackTick, i);
		}
		public TerminalNode Space() { return getToken(ReStructuredTextParser.Space, 0); }
		public TerminalNode AngleLeft() { return getToken(ReStructuredTextParser.AngleLeft, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public TerminalNode AngleRight() { return getToken(ReStructuredTextParser.AngleRight, 0); }
		public List<HyperlinkAtomContext> hyperlinkAtom() {
			return getRuleContexts(HyperlinkAtomContext.class);
		}
		public HyperlinkAtomContext hyperlinkAtom(int i) {
			return getRuleContext(HyperlinkAtomContext.class,i);
		}
		public HyperlinkDocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hyperlinkDoc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterHyperlinkDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitHyperlinkDoc(this);
		}
	}

	public final HyperlinkDocContext hyperlinkDoc() throws RecognitionException {
		HyperlinkDocContext _localctx = new HyperlinkDocContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_hyperlinkDoc);
		try {
			int _alt;
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(776);
				match(T__0);
				setState(777);
				match(BackTick);
				setState(779); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(778);
						hyperlinkAtom();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(781); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(783);
				match(Space);
				setState(784);
				match(AngleLeft);
				setState(785);
				url();
				setState(786);
				match(AngleRight);
				setState(787);
				match(BackTick);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				match(T__0);
				setState(790);
				match(BackTick);
				setState(791);
				url();
				setState(792);
				match(BackTick);
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

	public static class UrlContext extends ParserRuleContext {
		public List<UrlAtomContext> urlAtom() {
			return getRuleContexts(UrlAtomContext.class);
		}
		public UrlAtomContext urlAtom(int i) {
			return getRuleContext(UrlAtomContext.class,i);
		}
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitUrl(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_url);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(797); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(796);
					urlAtom();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(799); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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

	public static class UrlAtomContext extends ParserRuleContext {
		public TerminalNode LineBreak() { return getToken(ReStructuredTextParser.LineBreak, 0); }
		public TerminalNode BackTick() { return getToken(ReStructuredTextParser.BackTick, 0); }
		public UrlAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_urlAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterUrlAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitUrlAtom(this);
		}
	}

	public final UrlAtomContext urlAtom() throws RecognitionException {
		UrlAtomContext _localctx = new UrlAtomContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_urlAtom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			_la = _input.LA(1);
			if ( _la <= 0 || (_la==BackTick || _la==LineBreak) ) {
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

	public static class HyperlinkAtomContext extends ParserRuleContext {
		public TerminalNode LineBreak() { return getToken(ReStructuredTextParser.LineBreak, 0); }
		public TerminalNode AngleLeft() { return getToken(ReStructuredTextParser.AngleLeft, 0); }
		public TerminalNode AngleRight() { return getToken(ReStructuredTextParser.AngleRight, 0); }
		public TerminalNode BackTick() { return getToken(ReStructuredTextParser.BackTick, 0); }
		public TerminalNode Star() { return getToken(ReStructuredTextParser.Star, 0); }
		public HyperlinkAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hyperlinkAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterHyperlinkAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitHyperlinkAtom(this);
		}
	}

	public final HyperlinkAtomContext hyperlinkAtom() throws RecognitionException {
		HyperlinkAtomContext _localctx = new HyperlinkAtomContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_hyperlinkAtom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			_la = _input.LA(1);
			if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AngleLeft) | (1L << AngleRight) | (1L << BackTick) | (1L << Star) | (1L << LineBreak))) != 0)) ) {
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

	public static class SeparatorContext extends ParserRuleContext {
		public TerminalNode Minus() { return getToken(ReStructuredTextParser.Minus, 0); }
		public TerminalNode Equal() { return getToken(ReStructuredTextParser.Equal, 0); }
		public TerminalNode Plus() { return getToken(ReStructuredTextParser.Plus, 0); }
		public TerminalNode Hat() { return getToken(ReStructuredTextParser.Hat, 0); }
		public SeparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).enterSeparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReStructuredTextListener ) ((ReStructuredTextListener)listener).exitSeparator(this);
		}
	}

	public final SeparatorContext separator() throws RecognitionException {
		SeparatorContext _localctx = new SeparatorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_separator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Hat) | (1L << Equal) | (1L << Plus) | (1L << Minus))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u032a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\6\2{\n\2\r\2\16\2|\3\2\3\2\3\3\3\3\5\3\u0083\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\5\4\u008a\n\4\3\5\7\5\u008d\n\5\f\5\16\5\u0090\13\5\3\5\3\5\7\5\u0094"+
		"\n\5\f\5\16\5\u0097\13\5\3\5\3\5\5\5\u009b\n\5\5\5\u009d\n\5\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\7\7\u00a5\n\7\f\7\16\7\u00a8\13\7\3\b\6\b\u00ab\n\b\r\b"+
		"\16\b\u00ac\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\6\13\u00b8\n\13\r\13"+
		"\16\13\u00b9\3\f\3\f\3\r\3\r\5\r\u00c0\n\r\3\r\3\r\5\r\u00c4\n\r\3\r\3"+
		"\r\7\r\u00c8\n\r\f\r\16\r\u00cb\13\r\3\r\7\r\u00ce\n\r\f\r\16\r\u00d1"+
		"\13\r\3\16\3\16\3\16\3\16\3\16\6\16\u00d8\n\16\r\16\16\16\u00d9\3\16\5"+
		"\16\u00dd\n\16\3\16\3\16\5\16\u00e1\n\16\3\17\3\17\3\17\5\17\u00e6\n\17"+
		"\3\17\7\17\u00e9\n\17\f\17\16\17\u00ec\13\17\3\20\3\20\3\20\5\20\u00f1"+
		"\n\20\3\20\7\20\u00f4\n\20\f\20\16\20\u00f7\13\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00fd\n\20\3\20\6\20\u0100\n\20\r\20\16\20\u0101\5\20\u0104\n\20"+
		"\3\21\3\21\3\21\3\21\7\21\u010a\n\21\f\21\16\21\u010d\13\21\3\21\5\21"+
		"\u0110\n\21\3\22\3\22\7\22\u0114\n\22\f\22\16\22\u0117\13\22\3\22\3\22"+
		"\7\22\u011b\n\22\f\22\16\22\u011e\13\22\3\22\6\22\u0121\n\22\r\22\16\22"+
		"\u0122\5\22\u0125\n\22\3\23\3\23\7\23\u0129\n\23\f\23\16\23\u012c\13\23"+
		"\3\23\3\23\6\23\u0130\n\23\r\23\16\23\u0131\3\23\3\23\7\23\u0136\n\23"+
		"\f\23\16\23\u0139\13\23\3\24\3\24\3\25\3\25\3\25\6\25\u0140\n\25\r\25"+
		"\16\25\u0141\3\25\3\25\7\25\u0146\n\25\f\25\16\25\u0149\13\25\5\25\u014b"+
		"\n\25\3\26\3\26\7\26\u014f\n\26\f\26\16\26\u0152\13\26\3\27\5\27\u0155"+
		"\n\27\3\27\3\27\7\27\u0159\n\27\f\27\16\27\u015c\13\27\3\30\3\30\5\30"+
		"\u0160\n\30\3\31\3\31\3\31\5\31\u0165\n\31\5\31\u0167\n\31\3\32\3\32\3"+
		"\32\3\32\5\32\u016d\n\32\3\32\3\32\3\32\3\32\5\32\u0173\n\32\3\33\3\33"+
		"\5\33\u0177\n\33\3\33\6\33\u017a\n\33\r\33\16\33\u017b\3\33\7\33\u017f"+
		"\n\33\f\33\16\33\u0182\13\33\3\33\6\33\u0185\n\33\r\33\16\33\u0186\5\33"+
		"\u0189\n\33\3\33\5\33\u018c\n\33\3\34\3\34\5\34\u0190\n\34\3\34\7\34\u0193"+
		"\n\34\f\34\16\34\u0196\13\34\3\34\3\34\3\34\5\34\u019b\n\34\3\34\6\34"+
		"\u019e\n\34\r\34\16\34\u019f\3\34\3\34\5\34\u01a4\n\34\3\35\3\35\3\35"+
		"\3\35\5\35\u01aa\n\35\3\35\3\35\3\35\5\35\u01af\n\35\3\35\3\35\6\35\u01b3"+
		"\n\35\r\35\16\35\u01b4\3\35\3\35\3\35\7\35\u01ba\n\35\f\35\16\35\u01bd"+
		"\13\35\5\35\u01bf\n\35\3\36\3\36\7\36\u01c3\n\36\f\36\16\36\u01c6\13\36"+
		"\3\37\6\37\u01c9\n\37\r\37\16\37\u01ca\3 \3 \3 \3 \3 \3 \3 \3 \5 \u01d5"+
		"\n \3!\6!\u01d8\n!\r!\16!\u01d9\3!\7!\u01dd\n!\f!\16!\u01e0\13!\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0205"+
		"\n\"\3#\6#\u0208\n#\r#\16#\u0209\3#\7#\u020d\n#\f#\16#\u0210\13#\3$\3"+
		"$\3$\3$\6$\u0216\n$\r$\16$\u0217\3$\5$\u021b\n$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\5%\u022b\n%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0235\n&\3"+
		"\'\3\'\5\'\u0239\n\'\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\5)\u0250\n)\3*\3*\3*\3*\3*\3*\3*\5*\u0259\n*\3+\6+\u025c"+
		"\n+\r+\16+\u025d\3+\3+\6+\u0262\n+\r+\16+\u0263\3+\3+\3+\3+\7+\u026a\n"+
		"+\f+\16+\u026d\13+\3+\3+\3+\7+\u0272\n+\f+\16+\u0275\13+\3+\7+\u0278\n"+
		"+\f+\16+\u027b\13+\3+\3+\3+\6+\u0280\n+\r+\16+\u0281\3+\3+\3+\7+\u0287"+
		"\n+\f+\16+\u028a\13+\3+\3+\3+\6+\u028f\n+\r+\16+\u0290\3+\6+\u0294\n+"+
		"\r+\16+\u0295\3+\3+\6+\u029a\n+\r+\16+\u029b\3+\3+\5+\u02a0\n+\3,\7,\u02a3"+
		"\n,\f,\16,\u02a6\13,\3,\7,\u02a9\n,\f,\16,\u02ac\13,\3,\7,\u02af\n,\f"+
		",\16,\u02b2\13,\3-\3-\3.\3.\3/\3/\3/\5/\u02bb\n/\3/\3/\5/\u02bf\n/\3\60"+
		"\3\60\7\60\u02c3\n\60\f\60\16\60\u02c6\13\60\3\60\3\60\6\60\u02ca\n\60"+
		"\r\60\16\60\u02cb\3\60\3\60\3\60\3\60\6\60\u02d2\n\60\r\60\16\60\u02d3"+
		"\3\60\3\60\5\60\u02d8\n\60\3\61\6\61\u02db\n\61\r\61\16\61\u02dc\3\62"+
		"\3\62\3\63\3\63\3\63\5\63\u02e4\n\63\3\64\6\64\u02e7\n\64\r\64\16\64\u02e8"+
		"\3\64\3\64\3\65\3\65\6\65\u02ef\n\65\r\65\16\65\u02f0\3\65\3\65\3\65\3"+
		"\65\3\66\3\66\6\66\u02f9\n\66\r\66\16\66\u02fa\3\67\3\67\6\67\u02ff\n"+
		"\67\r\67\16\67\u0300\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38"+
		"\68\u030e\n8\r8\168\u030f\38\38\38\38\38\38\38\38\38\38\38\58\u031d\n"+
		"8\39\69\u0320\n9\r9\169\u0321\3:\3:\3;\3;\3<\3<\3<\n|\u00f5\u015a\u016c"+
		"\u017b\u0180\u0186\u0194\2=\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\2\16\3\2\37\37\3\2"+
		"\27\30\4\2\27\30\35\35\3\2\35\37\3\2\35\36\5\2\23\23\35\35\37\37\4\2\4"+
		"\4\35\37\4\2\35\35\37\37\4\2\34\34\36\37\4\2\34\34\37\37\5\2\16\17\34"+
		"\35\37\37\4\2\20\20\26\30\2\u039b\2z\3\2\2\2\4\u0082\3\2\2\2\6\u0089\3"+
		"\2\2\2\b\u008e\3\2\2\2\n\u009e\3\2\2\2\f\u00a6\3\2\2\2\16\u00aa\3\2\2"+
		"\2\20\u00ae\3\2\2\2\22\u00b0\3\2\2\2\24\u00b7\3\2\2\2\26\u00bb\3\2\2\2"+
		"\30\u00bf\3\2\2\2\32\u00e0\3\2\2\2\34\u00e2\3\2\2\2\36\u0103\3\2\2\2 "+
		"\u010f\3\2\2\2\"\u0111\3\2\2\2$\u0126\3\2\2\2&\u013a\3\2\2\2(\u013c\3"+
		"\2\2\2*\u014c\3\2\2\2,\u0154\3\2\2\2.\u015f\3\2\2\2\60\u0161\3\2\2\2\62"+
		"\u0172\3\2\2\2\64\u018b\3\2\2\2\66\u01a3\3\2\2\28\u01be\3\2\2\2:\u01c0"+
		"\3\2\2\2<\u01c8\3\2\2\2>\u01d4\3\2\2\2@\u01d7\3\2\2\2B\u0204\3\2\2\2D"+
		"\u0207\3\2\2\2F\u021a\3\2\2\2H\u022a\3\2\2\2J\u0234\3\2\2\2L\u0238\3\2"+
		"\2\2N\u023a\3\2\2\2P\u024f\3\2\2\2R\u0258\3\2\2\2T\u029f\3\2\2\2V\u02a4"+
		"\3\2\2\2X\u02b3\3\2\2\2Z\u02b5\3\2\2\2\\\u02ba\3\2\2\2^\u02d7\3\2\2\2"+
		"`\u02da\3\2\2\2b\u02de\3\2\2\2d\u02e3\3\2\2\2f\u02e6\3\2\2\2h\u02ec\3"+
		"\2\2\2j\u02f6\3\2\2\2l\u02fc\3\2\2\2n\u031c\3\2\2\2p\u031f\3\2\2\2r\u0323"+
		"\3\2\2\2t\u0325\3\2\2\2v\u0327\3\2\2\2x{\5\4\3\2y{\5:\36\2zx\3\2\2\2z"+
		"y\3\2\2\2{|\3\2\2\2|}\3\2\2\2|z\3\2\2\2}~\3\2\2\2~\177\7\2\2\3\177\3\3"+
		"\2\2\2\u0080\u0083\5\30\r\2\u0081\u0083\5\6\4\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\5\3\2\2\2\u0084\u008a\5 \21\2\u0085\u008a\5(\25\2"+
		"\u0086\u008a\5\26\f\2\u0087\u008a\5\34\17\2\u0088\u008a\5\b\5\2\u0089"+
		"\u0084\3\2\2\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2"+
		"\2\2\u0089\u0088\3\2\2\2\u008a\7\3\2\2\2\u008b\u008d\7\36\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0095\7\32\2\2\u0092\u0094\7"+
		"\36\2\2\u0093\u0092\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u009c\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u009a\5\20"+
		"\t\2\u0099\u009b\5\n\6\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u0098\3\2\2\2\u009c\u009d\3\2\2\2\u009d\t\3\2\2\2"+
		"\u009e\u009f\5\16\b\2\u009f\u00a0\5\f\7\2\u00a0\13\3\2\2\2\u00a1\u00a2"+
		"\5:\36\2\u00a2\u00a3\5\16\b\2\u00a3\u00a5\3\2\2\2\u00a4\u00a1\3\2\2\2"+
		"\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\r\3"+
		"\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ab\5\22\n\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\17\3\2\2"+
		"\2\u00ae\u00af\5\24\13\2\u00af\21\3\2\2\2\u00b0\u00b1\7\37\2\2\u00b1\u00b2"+
		"\7\36\2\2\u00b2\u00b3\7\36\2\2\u00b3\u00b4\7\36\2\2\u00b4\u00b5\5\20\t"+
		"\2\u00b5\23\3\2\2\2\u00b6\u00b8\n\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\25\3\2\2\2\u00bb"+
		"\u00bc\5.\30\2\u00bc\27\3\2\2\2\u00bd\u00be\7\37\2\2\u00be\u00c0\7\4\2"+
		"\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3"+
		"\5\32\16\2\u00c2\u00c4\7\37\2\2\u00c3\u00c2\3\2\2\2\u00c3\u00c4\3\2\2"+
		"\2\u00c4\u00c5\3\2\2\2\u00c5\u00c9\7\4\2\2\u00c6\u00c8\7\37\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cf\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00ce\5\6\4\2\u00cd"+
		"\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\31\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7\37\2\2\u00d3\u00e1"+
		"\5F$\2\u00d4\u00d5\7\37\2\2\u00d5\u00d7\58\35\2\u00d6\u00d8\7\36\2\2\u00d7"+
		"\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2"+
		"\2\2\u00da\u00dc\3\2\2\2\u00db\u00dd\5*\26\2\u00dc\u00db\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00e1\3\2\2\2\u00de\u00e1\5\64\33\2\u00df\u00e1\5"+
		"\66\34\2\u00e0\u00d2\3\2\2\2\u00e0\u00d4\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\33\3\2\2\2\u00e2\u00e3\7\37\2\2\u00e3\u00e5\5\36"+
		"\20\2\u00e4\u00e6\7\37\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00ea\3\2\2\2\u00e7\u00e9\5\36\20\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3"+
		"\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\35\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00ee\7\31\2\2\u00ee\u00f0\7\36\2\2\u00ef\u00f1\5"+
		"<\37\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f5\3\2\2\2\u00f2"+
		"\u00f4\5L\'\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8"+
		"\u0104\5T+\2\u00f9\u00fa\7\31\2\2\u00fa\u00fc\7\36\2\2\u00fb\u00fd\5<"+
		"\37\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe"+
		"\u0100\5L\'\2\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u00ed\3\2\2\2\u0103"+
		"\u00f9\3\2\2\2\u0104\37\3\2\2\2\u0105\u0110\5\"\22\2\u0106\u0110\5$\23"+
		"\2\u0107\u010b\7\37\2\2\u0108\u010a\7\36\2\2\u0109\u0108\3\2\2\2\u010a"+
		"\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2"+
		"\2\2\u010d\u010b\3\2\2\2\u010e\u0110\t\3\2\2\u010f\u0105\3\2\2\2\u010f"+
		"\u0106\3\2\2\2\u010f\u0107\3\2\2\2\u0110!\3\2\2\2\u0111\u0115\7\37\2\2"+
		"\u0112\u0114\7\36\2\2\u0113\u0112\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113"+
		"\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118"+
		"\u011c\5&\24\2\u0119\u011b\7\36\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3"+
		"\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0124\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0121\5\26\f\2\u0120\u011f\3\2\2\2\u0121\u0122\3"+
		"\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124"+
		"\u0120\3\2\2\2\u0124\u0125\3\2\2\2\u0125#\3\2\2\2\u0126\u012a\7\37\2\2"+
		"\u0127\u0129\7\36\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128"+
		"\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d"+
		"\u012f\5&\24\2\u012e\u0130\7\36\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3"+
		"\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0137\5*\26\2\u0134\u0136\5\26\f\2\u0135\u0134\3\2\2\2\u0136\u0139\3"+
		"\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138%\3\2\2\2\u0139\u0137"+
		"\3\2\2\2\u013a\u013b\t\4\2\2\u013b\'\3\2\2\2\u013c\u013d\7\37\2\2\u013d"+
		"\u013f\58\35\2\u013e\u0140\7\36\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3"+
		"\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u014a\3\2\2\2\u0143"+
		"\u0147\5*\26\2\u0144\u0146\5\26\f\2\u0145\u0144\3\2\2\2\u0146\u0149\3"+
		"\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u0143\3\2\2\2\u014a\u014b\3\2\2\2\u014b)\3\2\2\2"+
		"\u014c\u0150\5,\27\2\u014d\u014f\5.\30\2\u014e\u014d\3\2\2\2\u014f\u0152"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151+\3\2\2\2\u0152"+
		"\u0150\3\2\2\2\u0153\u0155\5<\37\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156\u015a\5> \2\u0157\u0159\5L\'\2\u0158\u0157"+
		"\3\2\2\2\u0159\u015c\3\2\2\2\u015a\u015b\3\2\2\2\u015a\u0158\3\2\2\2\u015b"+
		"-\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0160\5\62\32\2\u015e\u0160\5\60\31"+
		"\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160/\3\2\2\2\u0161\u0166"+
		"\5\64\33\2\u0162\u0167\5\62\32\2\u0163\u0165\5\60\31\2\u0164\u0163\3\2"+
		"\2\2\u0164\u0165\3\2\2\2\u0165\u0167\3\2\2\2\u0166\u0162\3\2\2\2\u0166"+
		"\u0164\3\2\2\2\u0167\61\3\2\2\2\u0168\u0173\5\66\34\2\u0169\u016a\5\66"+
		"\34\2\u016a\u016c\5,\27\2\u016b\u016d\5\60\31\2\u016c\u016d\3\2\2\2\u016c"+
		"\u016b\3\2\2\2\u016d\u0173\3\2\2\2\u016e\u016f\5\66\34\2\u016f\u0170\5"+
		",\27\2\u0170\u0171\5\62\32\2\u0171\u0173\3\2\2\2\u0172\u0168\3\2\2\2\u0172"+
		"\u0169\3\2\2\2\u0172\u016e\3\2\2\2\u0173\63\3\2\2\2\u0174\u0176\7\37\2"+
		"\2\u0175\u0177\5<\37\2\u0176\u0175\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0179"+
		"\3\2\2\2\u0178\u017a\5> \2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017c\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u0188\3\2\2\2\u017d\u017f\5L"+
		"\'\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u0181\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0185\5J"+
		"&\2\u0184\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0186"+
		"\u0184\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u0180\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189\u018c\3\2\2\2\u018a\u018c\58\35\2\u018b\u0174\3\2\2\2\u018b"+
		"\u018a\3\2\2\2\u018c\65\3\2\2\2\u018d\u018f\7\37\2\2\u018e\u0190\5<\37"+
		"\2\u018f\u018e\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0194\3\2\2\2\u0191\u0193"+
		"\5> \2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0195\3\2\2\2\u0194"+
		"\u0192\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u01a4\5T"+
		"+\2\u0198\u019a\7\37\2\2\u0199\u019b\5<\37\2\u019a\u0199\3\2\2\2\u019a"+
		"\u019b\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019e\5R*\2\u019d\u019c\3\2\2"+
		"\2\u019e\u019f\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1"+
		"\3\2\2\2\u01a1\u01a2\5T+\2\u01a2\u01a4\3\2\2\2\u01a3\u018d\3\2\2\2\u01a3"+
		"\u0198\3\2\2\2\u01a4\67\3\2\2\2\u01a5\u01a6\7\b\2\2\u01a6\u01bf\7\23\2"+
		"\2\u01a7\u01a9\7\37\2\2\u01a8\u01aa\5<\37\2\u01a9\u01a8\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01bf\7\b\2\2\u01ac\u01ae\7\37"+
		"\2\2\u01ad\u01af\5<\37\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b2\7\4\2\2\u01b1\u01b3\7\36\2\2\u01b2\u01b1\3"+
		"\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01b7\7\4\2\2\u01b7\u01bb\3\2\2\2\u01b8\u01ba\7\36"+
		"\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01a5\3\2"+
		"\2\2\u01be\u01a7\3\2\2\2\u01be\u01ac\3\2\2\2\u01bf9\3\2\2\2\u01c0\u01c4"+
		"\7\37\2\2\u01c1\u01c3\7\36\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2"+
		"\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5;\3\2\2\2\u01c6\u01c4\3"+
		"\2\2\2\u01c7\u01c9\7\36\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb=\3\2\2\2\u01cc\u01d5\5f\64\2"+
		"\u01cd\u01d5\5h\65\2\u01ce\u01d5\5j\66\2\u01cf\u01d5\5l\67\2\u01d0\u01d5"+
		"\5n8\2\u01d1\u01d5\5\\/\2\u01d2\u01d5\5N(\2\u01d3\u01d5\5@!\2\u01d4\u01cc"+
		"\3\2\2\2\u01d4\u01cd\3\2\2\2\u01d4\u01ce\3\2\2\2\u01d4\u01cf\3\2\2\2\u01d4"+
		"\u01d0\3\2\2\2\u01d4\u01d1\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d3\3\2"+
		"\2\2\u01d5?\3\2\2\2\u01d6\u01d8\5B\"\2\u01d7\u01d6\3\2\2\2\u01d8\u01d9"+
		"\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01de\3\2\2\2\u01db"+
		"\u01dd\5R*\2\u01dc\u01db\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2\2"+
		"\2\u01de\u01df\3\2\2\2\u01dfA\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2"+
		"\7\30\2\2\u01e2\u0205\n\5\2\2\u01e3\u01e4\7\27\2\2\u01e4\u0205\n\6\2\2"+
		"\u01e5\u01e6\7\b\2\2\u01e6\u01e7\7\23\2\2\u01e7\u0205\n\5\2\2\u01e8\u01e9"+
		"\7\b\2\2\u01e9\u0205\n\7\2\2\u01ea\u01eb\7\7\2\2\u01eb\u0205\7\23\2\2"+
		"\u01ec\u01ed\7\31\2\2\u01ed\u0205\n\6\2\2\u01ee\u01ef\7\33\2\2\u01ef\u0205"+
		"\n\6\2\2\u01f0\u01f1\7\7\2\2\u01f1\u0205\n\7\2\2\u01f2\u0205\7\7\2\2\u01f3"+
		"\u01f4\5v<\2\u01f4\u01f5\5v<\2\u01f5\u0205\3\2\2\2\u01f6\u0205\7\6\2\2"+
		"\u01f7\u0205\7\n\2\2\u01f8\u0205\7\13\2\2\u01f9\u0205\7\f\2\2\u01fa\u0205"+
		"\7\r\2\2\u01fb\u0205\7\24\2\2\u01fc\u0205\7\25\2\2\u01fd\u0205\7\21\2"+
		"\2\u01fe\u0205\7\22\2\2\u01ff\u0205\7\23\2\2\u0200\u0205\7\33\2\2\u0201"+
		"\u0205\7\16\2\2\u0202\u0205\7\17\2\2\u0203\u0205\7 \2\2\u0204\u01e1\3"+
		"\2\2\2\u0204\u01e3\3\2\2\2\u0204\u01e5\3\2\2\2\u0204\u01e8\3\2\2\2\u0204"+
		"\u01ea\3\2\2\2\u0204\u01ec\3\2\2\2\u0204\u01ee\3\2\2\2\u0204\u01f0\3\2"+
		"\2\2\u0204\u01f2\3\2\2\2\u0204\u01f3\3\2\2\2\u0204\u01f6\3\2\2\2\u0204"+
		"\u01f7\3\2\2\2\u0204\u01f8\3\2\2\2\u0204\u01f9\3\2\2\2\u0204\u01fa\3\2"+
		"\2\2\u0204\u01fb\3\2\2\2\u0204\u01fc\3\2\2\2\u0204\u01fd\3\2\2\2\u0204"+
		"\u01fe\3\2\2\2\u0204\u01ff\3\2\2\2\u0204\u0200\3\2\2\2\u0204\u0201\3\2"+
		"\2\2\u0204\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205C\3\2\2\2\u0206\u0208"+
		"\5F$\2\u0207\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u0207\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020e\3\2\2\2\u020b\u020d\5R*\2\u020c\u020b\3\2\2"+
		"\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020fE"+
		"\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u021b\5H%\2\u0212\u021b\5B\"\2\u0213"+
		"\u0215\5P)\2\u0214\u0216\5P)\2\u0215\u0214\3\2\2\2\u0216\u0217\3\2\2\2"+
		"\u0217\u0215\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u021b"+
		"\7\36\2\2\u021a\u0211\3\2\2\2\u021a\u0212\3\2\2\2\u021a\u0213\3\2\2\2"+
		"\u021a\u0219\3\2\2\2\u021bG\3\2\2\2\u021c\u021d\7\f\2\2\u021d\u021e\7"+
		"\35\2\2\u021e\u022b\7\r\2\2\u021f\u0220\7\n\2\2\u0220\u0221\7\35\2\2\u0221"+
		"\u022b\7\13\2\2\u0222\u0223\7\22\2\2\u0223\u0224\7\35\2\2\u0224\u022b"+
		"\7\22\2\2\u0225\u0226\7\22\2\2\u0226\u0227\7\21\2\2\u0227\u0228\7\35\2"+
		"\2\u0228\u0229\7\21\2\2\u0229\u022b\7\22\2\2\u022a\u021c\3\2\2\2\u022a"+
		"\u021f\3\2\2\2\u022a\u0222\3\2\2\2\u022a\u0225\3\2\2\2\u022bI\3\2\2\2"+
		"\u022c\u0235\5f\64\2\u022d\u0235\5h\65\2\u022e\u0235\5j\66\2\u022f\u0235"+
		"\5l\67\2\u0230\u0235\5n8\2\u0231\u0235\5\\/\2\u0232\u0235\5N(\2\u0233"+
		"\u0235\5D#\2\u0234\u022c\3\2\2\2\u0234\u022d\3\2\2\2\u0234\u022e\3\2\2"+
		"\2\u0234\u022f\3\2\2\2\u0234\u0230\3\2\2\2\u0234\u0231\3\2\2\2\u0234\u0232"+
		"\3\2\2\2\u0234\u0233\3\2\2\2\u0235K\3\2\2\2\u0236\u0239\5T+\2\u0237\u0239"+
		"\5J&\2\u0238\u0236\3\2\2\2\u0238\u0237\3\2\2\2\u0239M\3\2\2\2\u023a\u023b"+
		"\7\17\2\2\u023b\u023c\7\36\2\2\u023c\u023d\5,\27\2\u023dO\3\2\2\2\u023e"+
		"\u0250\7\24\2\2\u023f\u0250\7\b\2\2\u0240\u0250\7\7\2\2\u0241\u0250\7"+
		"\36\2\2\u0242\u0250\7\n\2\2\u0243\u0250\7\13\2\2\u0244\u0250\7\f\2\2\u0245"+
		"\u0250\7\r\2\2\u0246\u0250\7\25\2\2\u0247\u0250\5v<\2\u0248\u0250\7\16"+
		"\2\2\u0249\u0250\7\17\2\2\u024a\u0250\7\21\2\2\u024b\u0250\7\23\2\2\u024c"+
		"\u024d\7\35\2\2\u024d\u0250\7\36\2\2\u024e\u0250\7 \2\2\u024f\u023e\3"+
		"\2\2\2\u024f\u023f\3\2\2\2\u024f\u0240\3\2\2\2\u024f\u0241\3\2\2\2\u024f"+
		"\u0242\3\2\2\2\u024f\u0243\3\2\2\2\u024f\u0244\3\2\2\2\u024f\u0245\3\2"+
		"\2\2\u024f\u0246\3\2\2\2\u024f\u0247\3\2\2\2\u024f\u0248\3\2\2\2\u024f"+
		"\u0249\3\2\2\2\u024f\u024a\3\2\2\2\u024f\u024b\3\2\2\2\u024f\u024c\3\2"+
		"\2\2\u024f\u024e\3\2\2\2\u0250Q\3\2\2\2\u0251\u0259\5P)\2\u0252\u0259"+
		"\5H%\2\u0253\u0259\7\31\2\2\u0254\u0259\7\5\2\2\u0255\u0259\7\32\2\2\u0256"+
		"\u0259\7\23\2\2\u0257\u0259\7\t\2\2\u0258\u0251\3\2\2\2\u0258\u0252\3"+
		"\2\2\2\u0258\u0253\3\2\2\2\u0258\u0254\3\2\2\2\u0258\u0255\3\2\2\2\u0258"+
		"\u0256\3\2\2\2\u0258\u0257\3\2\2\2\u0259S\3\2\2\2\u025a\u025c\7\35\2\2"+
		"\u025b\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e"+
		"\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u02a0\7\37\2\2\u0260\u0262\7\35\2\2"+
		"\u0261\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264"+
		"\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\5X-\2\u0266\u0273\5V,\2\u0267"+
		"\u026b\7\37\2\2\u0268\u026a\7\35\2\2\u0269\u0268\3\2\2\2\u026a\u026d\3"+
		"\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d"+
		"\u026b\3\2\2\2\u026e\u026f\5X-\2\u026f\u0270\5V,\2\u0270\u0272\3\2\2\2"+
		"\u0271\u0267\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274"+
		"\3\2\2\2\u0274\u0279\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u0278\7\35\2\2"+
		"\u0277\u0276\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a"+
		"\3\2\2\2\u027a\u027c\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u027d\7\37\2\2"+
		"\u027d\u02a0\3\2\2\2\u027e\u0280\7\35\2\2\u027f\u027e\3\2\2\2\u0280\u0281"+
		"\3\2\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0283\3\2\2\2\u0283"+
		"\u0284\5X-\2\u0284\u0288\5V,\2\u0285\u0287\7\35\2\2\u0286\u0285\3\2\2"+
		"\2\u0287\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028b"+
		"\3\2\2\2\u028a\u0288\3\2\2\2\u028b\u028c\7\37\2\2\u028c\u02a0\3\2\2\2"+
		"\u028d\u028f\7\35\2\2\u028e\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u028e"+
		"\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0293\3\2\2\2\u0292\u0294\7\36\2\2"+
		"\u0293\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0296"+
		"\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299\5V,\2\u0298\u029a\7\35\2\2\u0299"+
		"\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2"+
		"\2\2\u029c\u029d\3\2\2\2\u029d\u029e\7\37\2\2\u029e\u02a0\3\2\2\2\u029f"+
		"\u025b\3\2\2\2\u029f\u0261\3\2\2\2\u029f\u027f\3\2\2\2\u029f\u028e\3\2"+
		"\2\2\u02a0U\3\2\2\2\u02a1\u02a3\5Z.\2\u02a2\u02a1\3\2\2\2\u02a3\u02a6"+
		"\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02b0\3\2\2\2\u02a6"+
		"\u02a4\3\2\2\2\u02a7\u02a9\7\35\2\2\u02a8\u02a7\3\2\2\2\u02a9\u02ac\3"+
		"\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ad\3\2\2\2\u02ac"+
		"\u02aa\3\2\2\2\u02ad\u02af\5Z.\2\u02ae\u02aa\3\2\2\2\u02af\u02b2\3\2\2"+
		"\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1W\3\2\2\2\u02b2\u02b0"+
		"\3\2\2\2\u02b3\u02b4\n\b\2\2\u02b4Y\3\2\2\2\u02b5\u02b6\n\t\2\2\u02b6"+
		"[\3\2\2\2\u02b7\u02b8\7\25\2\2\u02b8\u02b9\7\7\2\2\u02b9\u02bb\7\25\2"+
		"\2\u02ba\u02b7\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be"+
		"\5^\60\2\u02bd\u02bf\7\33\2\2\u02be\u02bd\3\2\2\2\u02be\u02bf\3\2\2\2"+
		"\u02bf]\3\2\2\2\u02c0\u02c4\7\34\2\2\u02c1\u02c3\7\34\2\2\u02c2\u02c1"+
		"\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5"+
		"\u02c7\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02c9\5`\61\2\u02c8\u02ca\7\34"+
		"\2\2\u02c9\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb"+
		"\u02cc\3\2\2\2\u02cc\u02d8\3\2\2\2\u02cd\u02ce\7\34\2\2\u02ce\u02cf\5"+
		"b\62\2\u02cf\u02d1\5`\61\2\u02d0\u02d2\7\34\2\2\u02d1\u02d0\3\2\2\2\u02d2"+
		"\u02d3\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d8\3\2"+
		"\2\2\u02d5\u02d6\7\34\2\2\u02d6\u02d8\7\34\2\2\u02d7\u02c0\3\2\2\2\u02d7"+
		"\u02cd\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8_\3\2\2\2\u02d9\u02db\5d\63\2"+
		"\u02da\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd"+
		"\3\2\2\2\u02dda\3\2\2\2\u02de\u02df\n\n\2\2\u02dfc\3\2\2\2\u02e0\u02e4"+
		"\n\13\2\2\u02e1\u02e2\7\34\2\2\u02e2\u02e4\n\13\2\2\u02e3\u02e0\3\2\2"+
		"\2\u02e3\u02e1\3\2\2\2\u02e4e\3\2\2\2\u02e5\u02e7\7 \2\2\u02e6\u02e5\3"+
		"\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9"+
		"\u02ea\3\2\2\2\u02ea\u02eb\7\33\2\2\u02ebg\3\2\2\2\u02ec\u02ee\7\33\2"+
		"\2\u02ed\u02ef\5t;\2\u02ee\u02ed\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02ee"+
		"\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\7\25\2\2"+
		"\u02f3\u02f4\7\36\2\2\u02f4\u02f5\5p9\2\u02f5i\3\2\2\2\u02f6\u02f8\7\33"+
		"\2\2\u02f7\u02f9\7 \2\2\u02f8\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fbk\3\2\2\2\u02fc\u02fe\7\34\2\2"+
		"\u02fd\u02ff\5t;\2\u02fe\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u02fe"+
		"\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0303\7\36\2\2"+
		"\u0303\u0304\7\16\2\2\u0304\u0305\5p9\2\u0305\u0306\7\17\2\2\u0306\u0307"+
		"\7\34\2\2\u0307\u0308\7\33\2\2\u0308\u0309\7\36\2\2\u0309m\3\2\2\2\u030a"+
		"\u030b\7\3\2\2\u030b\u030d\7\34\2\2\u030c\u030e\5t;\2\u030d\u030c\3\2"+
		"\2\2\u030e\u030f\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310"+
		"\u0311\3\2\2\2\u0311\u0312\7\36\2\2\u0312\u0313\7\16\2\2\u0313\u0314\5"+
		"p9\2\u0314\u0315\7\17\2\2\u0315\u0316\7\34\2\2\u0316\u031d\3\2\2\2\u0317"+
		"\u0318\7\3\2\2\u0318\u0319\7\34\2\2\u0319\u031a\5p9\2\u031a\u031b\7\34"+
		"\2\2\u031b\u031d\3\2\2\2\u031c\u030a\3\2\2\2\u031c\u0317\3\2\2\2\u031d"+
		"o\3\2\2\2\u031e\u0320\5r:\2\u031f\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321"+
		"\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322q\3\2\2\2\u0323\u0324\n\13\2\2"+
		"\u0324s\3\2\2\2\u0325\u0326\n\f\2\2\u0326u\3\2\2\2\u0327\u0328\t\r\2\2"+
		"\u0328w\3\2\2\2kz|\u0082\u0089\u008e\u0095\u009a\u009c\u00a6\u00ac\u00b9"+
		"\u00bf\u00c3\u00c9\u00cf\u00d9\u00dc\u00e0\u00e5\u00ea\u00f0\u00f5\u00fc"+
		"\u0101\u0103\u010b\u010f\u0115\u011c\u0122\u0124\u012a\u0131\u0137\u0141"+
		"\u0147\u014a\u0150\u0154\u015a\u015f\u0164\u0166\u016c\u0172\u0176\u017b"+
		"\u0180\u0186\u0188\u018b\u018f\u0194\u019a\u019f\u01a3\u01a9\u01ae\u01b4"+
		"\u01bb\u01be\u01c4\u01ca\u01d4\u01d9\u01de\u0204\u0209\u020e\u0217\u021a"+
		"\u022a\u0234\u0238\u024f\u0258\u025d\u0263\u026b\u0273\u0279\u0281\u0288"+
		"\u0290\u0295\u029b\u029f\u02a4\u02aa\u02b0\u02ba\u02be\u02c4\u02cb\u02d3"+
		"\u02d7\u02dc\u02e3\u02e8\u02f0\u02fa\u0300\u030f\u031c\u0321";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}