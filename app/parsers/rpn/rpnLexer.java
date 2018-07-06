// Generated from rpn/rpn.g4 by ANTLR 4.7.1
package parsers.rpn;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rpnLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCIENTIFIC_NUMBER=1, VARIABLE=2, POW=3, PLUS=4, MINUS=5, TIMES=6, DIV=7, 
		COS=8, SIN=9, TAN=10, ACOS=11, ASIN=12, ATAN=13, LN=14, LOG=15, POINT=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SCIENTIFIC_NUMBER", "NUMBER", "E", "SIGN", "VARIABLE", "VALID_ID_START", 
		"VALID_ID_CHAR", "POW", "PLUS", "MINUS", "TIMES", "DIV", "COS", "SIN", 
		"TAN", "ACOS", "ASIN", "ATAN", "LN", "LOG", "POINT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'^'", "'+'", "'-'", "'*'", "'/'", "'cos'", "'sin'", 
		"'tan'", "'acos'", "'asin'", "'atan'", "'ln'", "'log'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SCIENTIFIC_NUMBER", "VARIABLE", "POW", "PLUS", "MINUS", "TIMES", 
		"DIV", "COS", "SIN", "TAN", "ACOS", "ASIN", "ATAN", "LN", "LOG", "POINT", 
		"WS"
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


	public rpnLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "rpn.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\5"+
		"\2\63\n\2\3\2\3\2\5\2\67\n\2\3\3\6\3:\n\3\r\3\16\3;\3\3\3\3\6\3@\n\3\r"+
		"\3\16\3A\5\3D\n\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\7"+
		"\5\7R\n\7\3\b\3\b\5\bV\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\6\27\u0087\n\27\r\27\16\27"+
		"\u0088\3\27\3\27\2\2\30\3\3\5\2\7\2\t\2\13\4\r\2\17\2\21\5\23\6\25\7\27"+
		"\b\31\t\33\n\35\13\37\f!\r#\16%\17\'\20)\21+\22-\23\3\2\6\4\2GGgg\4\2"+
		"--//\5\2C\\aac|\5\2\13\f\17\17\"\"\2\u008e\2\3\3\2\2\2\2\13\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\59\3\2\2\2\7E\3\2"+
		"\2\2\tG\3\2\2\2\13I\3\2\2\2\rQ\3\2\2\2\17U\3\2\2\2\21W\3\2\2\2\23Y\3\2"+
		"\2\2\25[\3\2\2\2\27]\3\2\2\2\31_\3\2\2\2\33a\3\2\2\2\35e\3\2\2\2\37i\3"+
		"\2\2\2!m\3\2\2\2#r\3\2\2\2%w\3\2\2\2\'|\3\2\2\2)\177\3\2\2\2+\u0083\3"+
		"\2\2\2-\u0086\3\2\2\2/\66\5\5\3\2\60\62\5\7\4\2\61\63\5\t\5\2\62\61\3"+
		"\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\5\5\3\2\65\67\3\2\2\2\66\60\3"+
		"\2\2\2\66\67\3\2\2\2\67\4\3\2\2\28:\4\62;\298\3\2\2\2:;\3\2\2\2;9\3\2"+
		"\2\2;<\3\2\2\2<C\3\2\2\2=?\7\60\2\2>@\4\62;\2?>\3\2\2\2@A\3\2\2\2A?\3"+
		"\2\2\2AB\3\2\2\2BD\3\2\2\2C=\3\2\2\2CD\3\2\2\2D\6\3\2\2\2EF\t\2\2\2F\b"+
		"\3\2\2\2GH\t\3\2\2H\n\3\2\2\2IM\5\r\7\2JL\5\17\b\2KJ\3\2\2\2LO\3\2\2\2"+
		"MK\3\2\2\2MN\3\2\2\2N\f\3\2\2\2OM\3\2\2\2PR\t\4\2\2QP\3\2\2\2R\16\3\2"+
		"\2\2SV\5\r\7\2TV\4\62;\2US\3\2\2\2UT\3\2\2\2V\20\3\2\2\2WX\7`\2\2X\22"+
		"\3\2\2\2YZ\7-\2\2Z\24\3\2\2\2[\\\7/\2\2\\\26\3\2\2\2]^\7,\2\2^\30\3\2"+
		"\2\2_`\7\61\2\2`\32\3\2\2\2ab\7e\2\2bc\7q\2\2cd\7u\2\2d\34\3\2\2\2ef\7"+
		"u\2\2fg\7k\2\2gh\7p\2\2h\36\3\2\2\2ij\7v\2\2jk\7c\2\2kl\7p\2\2l \3\2\2"+
		"\2mn\7c\2\2no\7e\2\2op\7q\2\2pq\7u\2\2q\"\3\2\2\2rs\7c\2\2st\7u\2\2tu"+
		"\7k\2\2uv\7p\2\2v$\3\2\2\2wx\7c\2\2xy\7v\2\2yz\7c\2\2z{\7p\2\2{&\3\2\2"+
		"\2|}\7n\2\2}~\7p\2\2~(\3\2\2\2\177\u0080\7n\2\2\u0080\u0081\7q\2\2\u0081"+
		"\u0082\7i\2\2\u0082*\3\2\2\2\u0083\u0084\7\60\2\2\u0084,\3\2\2\2\u0085"+
		"\u0087\t\5\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b\27\2\2\u008b"+
		".\3\2\2\2\f\2\62\66;ACMQU\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}