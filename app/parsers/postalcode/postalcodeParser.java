// Generated from postalcode/postalcode.g4 by ANTLR 4.7.1
package parsers.postalcode;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class postalcodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DIGIT=1, LETTER=2, WS=3;
	public static final int
		RULE_postalcode = 0;
	public static final String[] ruleNames = {
		"postalcode"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DIGIT", "LETTER", "WS"
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
	public String getGrammarFileName() { return "postalcode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public postalcodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PostalcodeContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(postalcodeParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(postalcodeParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(postalcodeParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(postalcodeParser.DIGIT, i);
		}
		public PostalcodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postalcode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof postalcodeListener ) ((postalcodeListener)listener).enterPostalcode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof postalcodeListener ) ((postalcodeListener)listener).exitPostalcode(this);
		}
	}

	public final PostalcodeContext postalcode() throws RecognitionException {
		PostalcodeContext _localctx = new PostalcodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_postalcode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(LETTER);
			setState(3);
			match(DIGIT);
			setState(4);
			match(LETTER);
			setState(5);
			match(DIGIT);
			setState(6);
			match(LETTER);
			setState(7);
			match(DIGIT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\5\f\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\2\n\2\4\3\2\2\2\4\5\7\4\2\2\5\6"+
		"\7\3\2\2\6\7\7\4\2\2\7\b\7\3\2\2\b\t\7\4\2\2\t\n\7\3\2\2\n\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}