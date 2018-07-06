// Generated from creole/creole.g4 by ANTLR 4.7.1
package parsers.creole;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class creoleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, HASH=8, LBRACKET=9, 
		RBRACKET=10, LBRACE=11, RBRACE=12, TEXT=13, WS=14, CR=15, NOWIKI=16, RSLASH=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "HASH", "LBRACKET", 
		"RBRACKET", "LBRACE", "RBRACE", "TEXT", "WS", "CR", "NOWIKI", "RSLASH", 
		"LETTERS", "DIGITS", "SYMBOL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\\\\'", "'**'", "'|'", "'----'", "'*'", "'|='", "'='", "'#'", 
		"'[['", "']]'", "'{{'", "'}}'", null, null, null, null, "'/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "HASH", "LBRACKET", "RBRACKET", 
		"LBRACE", "RBRACE", "TEXT", "WS", "CR", "NOWIKI", "RSLASH"
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


	public creoleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "creole.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\6\16R\n\16\r\16\16\16"+
		"S\3\17\3\17\3\20\5\20Y\n\20\3\20\3\20\5\20]\n\20\3\21\3\21\3\21\3\21\3"+
		"\21\7\21d\n\21\f\21\16\21g\13\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\3e\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\'\2)\2\3\2\6\4\2\13\13"+
		"\"\"\4\2C\\c|\3\2\62;\b\2$$)+-\60<=^^\u0080\u0080\2w\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3+\3\2\2\2\5.\3"+
		"\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\138\3\2\2\2\r:\3\2\2\2\17=\3\2\2\2\21"+
		"?\3\2\2\2\23A\3\2\2\2\25D\3\2\2\2\27G\3\2\2\2\31J\3\2\2\2\33Q\3\2\2\2"+
		"\35U\3\2\2\2\37\\\3\2\2\2!^\3\2\2\2#l\3\2\2\2%n\3\2\2\2\'p\3\2\2\2)r\3"+
		"\2\2\2+,\7^\2\2,-\7^\2\2-\4\3\2\2\2./\7,\2\2/\60\7,\2\2\60\6\3\2\2\2\61"+
		"\62\7~\2\2\62\b\3\2\2\2\63\64\7/\2\2\64\65\7/\2\2\65\66\7/\2\2\66\67\7"+
		"/\2\2\67\n\3\2\2\289\7,\2\29\f\3\2\2\2:;\7~\2\2;<\7?\2\2<\16\3\2\2\2="+
		">\7?\2\2>\20\3\2\2\2?@\7%\2\2@\22\3\2\2\2AB\7]\2\2BC\7]\2\2C\24\3\2\2"+
		"\2DE\7_\2\2EF\7_\2\2F\26\3\2\2\2GH\7}\2\2HI\7}\2\2I\30\3\2\2\2JK\7\177"+
		"\2\2KL\7\177\2\2L\32\3\2\2\2MR\5%\23\2NR\5\'\24\2OR\5)\25\2PR\5\35\17"+
		"\2QM\3\2\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2"+
		"\2T\34\3\2\2\2UV\t\2\2\2V\36\3\2\2\2WY\7\17\2\2XW\3\2\2\2XY\3\2\2\2YZ"+
		"\3\2\2\2Z]\7\f\2\2[]\7\2\2\3\\X\3\2\2\2\\[\3\2\2\2] \3\2\2\2^_\7}\2\2"+
		"_`\7}\2\2`a\7}\2\2ae\3\2\2\2bd\13\2\2\2cb\3\2\2\2dg\3\2\2\2ef\3\2\2\2"+
		"ec\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\177\2\2ij\7\177\2\2jk\7\177\2\2k\""+
		"\3\2\2\2lm\7\61\2\2m$\3\2\2\2no\t\3\2\2o&\3\2\2\2pq\t\4\2\2q(\3\2\2\2"+
		"rs\t\5\2\2s*\3\2\2\2\b\2QSX\\e\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}