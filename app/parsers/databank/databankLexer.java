// Generated from databank/databank.g4 by ANTLR 4.7.1
package parsers.databank;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class databankLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, FLOATINGPOINT=5, COMMENT=6, EOL=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "FLOATINGPOINT", "NUMBER", "E", "SIGN", 
		"COMMENT", "EOL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-1'", "'-4'", "'-12'", "'NA'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "FLOATINGPOINT", "COMMENT", "EOL", "WS"
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


	public databankLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "databank.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\5\6*\n\6\3\6\3\6\5\6.\n\6\3\7\6\7\61\n\7\r\7\16\7\62\3\7\3\7\7"+
		"\7\67\n\7\f\7\16\7:\13\7\5\7<\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\7\n"+
		"F\n\n\f\n\16\nI\13\n\3\n\3\n\7\nM\n\n\f\n\16\nP\13\n\3\n\3\n\3\n\3\n\3"+
		"\13\6\13W\n\13\r\13\16\13X\3\f\3\f\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7"+
		"\r\2\17\2\21\2\23\b\25\t\27\n\3\2\7\4\2GGgg\4\2--//\3\2$$\4\2\f\f\17\17"+
		"\5\2\13\f\17\17\"\"\2b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\34"+
		"\3\2\2\2\7\37\3\2\2\2\t#\3\2\2\2\13&\3\2\2\2\r\60\3\2\2\2\17=\3\2\2\2"+
		"\21?\3\2\2\2\23A\3\2\2\2\25V\3\2\2\2\27Z\3\2\2\2\31\32\7/\2\2\32\33\7"+
		"\63\2\2\33\4\3\2\2\2\34\35\7/\2\2\35\36\7\66\2\2\36\6\3\2\2\2\37 \7/\2"+
		"\2 !\7\63\2\2!\"\7\64\2\2\"\b\3\2\2\2#$\7P\2\2$%\7C\2\2%\n\3\2\2\2&-\5"+
		"\r\7\2\')\5\17\b\2(*\5\21\t\2)(\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\5\r\7\2"+
		",.\3\2\2\2-\'\3\2\2\2-.\3\2\2\2.\f\3\2\2\2/\61\4\62;\2\60/\3\2\2\2\61"+
		"\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63;\3\2\2\2\648\7\60\2\2\65\67"+
		"\4\62;\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29<\3\2\2\2:8\3"+
		"\2\2\2;\64\3\2\2\2;<\3\2\2\2<\16\3\2\2\2=>\t\2\2\2>\20\3\2\2\2?@\t\3\2"+
		"\2@\22\3\2\2\2AB\7$\2\2BC\7e\2\2CG\3\2\2\2DF\n\4\2\2ED\3\2\2\2FI\3\2\2"+
		"\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JN\7$\2\2KM\7\"\2\2LK\3\2\2"+
		"\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\5\25\13\2RS\3\2"+
		"\2\2ST\b\n\2\2T\24\3\2\2\2UW\t\5\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3"+
		"\2\2\2Y\26\3\2\2\2Z[\t\6\2\2[\\\3\2\2\2\\]\b\f\2\2]\30\3\2\2\2\13\2)-"+
		"\628;GNX\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}