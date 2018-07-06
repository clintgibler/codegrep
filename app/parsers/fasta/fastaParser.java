// Generated from fasta/fasta.g4 by ANTLR 4.7.1
package parsers.fasta;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class fastaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENTLINE=1, DESCRIPTIONLINE=2, TEXT=3, EOL=4, SEQUENCELINE=5;
	public static final int
		RULE_sequence = 0, RULE_section = 1, RULE_sequencelines = 2, RULE_descriptionline = 3, 
		RULE_commentline = 4;
	public static final String[] ruleNames = {
		"sequence", "section", "sequencelines", "descriptionline", "commentline"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENTLINE", "DESCRIPTIONLINE", "TEXT", "EOL", "SEQUENCELINE"
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
	public String getGrammarFileName() { return "fasta.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public fastaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SequenceContext extends ParserRuleContext {
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fastaListener ) ((fastaListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fastaListener ) ((fastaListener)listener).exitSequence(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				section();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMMENTLINE) | (1L << DESCRIPTIONLINE) | (1L << SEQUENCELINE))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		public DescriptionlineContext descriptionline() {
			return getRuleContext(DescriptionlineContext.class,0);
		}
		public SequencelinesContext sequencelines() {
			return getRuleContext(SequencelinesContext.class,0);
		}
		public CommentlineContext commentline() {
			return getRuleContext(CommentlineContext.class,0);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fastaListener ) ((fastaListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fastaListener ) ((fastaListener)listener).exitSection(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_section);
		try {
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DESCRIPTIONLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				descriptionline();
				}
				break;
			case SEQUENCELINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				sequencelines();
				}
				break;
			case COMMENTLINE:
				enterOuterAlt(_localctx, 3);
				{
				setState(17);
				commentline();
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

	public static class SequencelinesContext extends ParserRuleContext {
		public List<TerminalNode> SEQUENCELINE() { return getTokens(fastaParser.SEQUENCELINE); }
		public TerminalNode SEQUENCELINE(int i) {
			return getToken(fastaParser.SEQUENCELINE, i);
		}
		public SequencelinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequencelines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fastaListener ) ((fastaListener)listener).enterSequencelines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fastaListener ) ((fastaListener)listener).exitSequencelines(this);
		}
	}

	public final SequencelinesContext sequencelines() throws RecognitionException {
		SequencelinesContext _localctx = new SequencelinesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sequencelines);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(20);
					match(SEQUENCELINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(23); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class DescriptionlineContext extends ParserRuleContext {
		public TerminalNode DESCRIPTIONLINE() { return getToken(fastaParser.DESCRIPTIONLINE, 0); }
		public DescriptionlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_descriptionline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fastaListener ) ((fastaListener)listener).enterDescriptionline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fastaListener ) ((fastaListener)listener).exitDescriptionline(this);
		}
	}

	public final DescriptionlineContext descriptionline() throws RecognitionException {
		DescriptionlineContext _localctx = new DescriptionlineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_descriptionline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(DESCRIPTIONLINE);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode COMMENTLINE() { return getToken(fastaParser.COMMENTLINE, 0); }
		public CommentlineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof fastaListener ) ((fastaListener)listener).enterCommentline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof fastaListener ) ((fastaListener)listener).exitCommentline(this);
		}
	}

	public final CommentlineContext commentline() throws RecognitionException {
		CommentlineContext _localctx = new CommentlineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_commentline);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7 \4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\5\3"+
		"\25\n\3\3\4\6\4\30\n\4\r\4\16\4\31\3\5\3\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n"+
		"\2\2\2\36\2\r\3\2\2\2\4\24\3\2\2\2\6\27\3\2\2\2\b\33\3\2\2\2\n\35\3\2"+
		"\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2"+
		"\20\3\3\2\2\2\21\25\5\b\5\2\22\25\5\6\4\2\23\25\5\n\6\2\24\21\3\2\2\2"+
		"\24\22\3\2\2\2\24\23\3\2\2\2\25\5\3\2\2\2\26\30\7\7\2\2\27\26\3\2\2\2"+
		"\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\7\3\2\2\2\33\34\7\4\2\2"+
		"\34\t\3\2\2\2\35\36\7\3\2\2\36\13\3\2\2\2\5\17\24\31";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}