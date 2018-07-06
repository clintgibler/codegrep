// Generated from emailaddress/emailaddress.g4 by ANTLR 4.7.1
package parsers.emailaddress;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class emailaddressLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, CHAR=13, ALPHA=14, DIGIT=15, CTL=16, CR=17, 
		LF=18, SPACE=19, HTAB=20, CRLF=21, SPECIALS=22, QUOTE=23, QTEXT=24, DTEXT=25, 
		CTEXT=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "CHAR", "ALPHA", "DIGIT", "CTL", "CR", "LF", 
		"SPACE", "HTAB", "CRLF", "SPECIALS", "QUOTE", "QTEXT", "DTEXT", "CTEXT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "':'", "';'", "'<'", "'>'", "'@'", "'.'", "'\\'", "'['", "']'", 
		"'''", "'('", "')'", null, null, null, null, "'\n'", "'\r'", "' '", "'\t'", 
		"'\r\n'", null, "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "CHAR", "ALPHA", "DIGIT", "CTL", "CR", "LF", "SPACE", "HTAB", "CRLF", 
		"SPECIALS", "QUOTE", "QTEXT", "DTEXT", "CTEXT"
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


	public emailaddressLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "emailaddress.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34l\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3"+
		"\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\2\2\34\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\3\2\n\3\2\2\u0129\3\2"+
		"g\u0092\3\2JY\3\2\2\63\t\2)+..\60\60<>@@BB]_\4\2\f\f\17\17\4\2\f\f]_\5"+
		"\2\f\f*+^^\2k\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2"+
		"\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\59\3"+
		"\2\2\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21E\3"+
		"\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27K\3\2\2\2\31M\3\2\2\2\33O\3\2\2\2\35"+
		"Q\3\2\2\2\37S\3\2\2\2!U\3\2\2\2#W\3\2\2\2%Y\3\2\2\2\'[\3\2\2\2)]\3\2\2"+
		"\2+_\3\2\2\2-b\3\2\2\2/d\3\2\2\2\61f\3\2\2\2\63h\3\2\2\2\65j\3\2\2\2\67"+
		"8\7<\2\28\4\3\2\2\29:\7=\2\2:\6\3\2\2\2;<\7>\2\2<\b\3\2\2\2=>\7@\2\2>"+
		"\n\3\2\2\2?@\7B\2\2@\f\3\2\2\2AB\7\60\2\2B\16\3\2\2\2CD\7^\2\2D\20\3\2"+
		"\2\2EF\7]\2\2F\22\3\2\2\2GH\7_\2\2H\24\3\2\2\2IJ\7)\2\2J\26\3\2\2\2KL"+
		"\7*\2\2L\30\3\2\2\2MN\7+\2\2N\32\3\2\2\2OP\t\2\2\2P\34\3\2\2\2QR\t\3\2"+
		"\2R\36\3\2\2\2ST\t\4\2\2T \3\2\2\2UV\t\5\2\2V\"\3\2\2\2WX\7\f\2\2X$\3"+
		"\2\2\2YZ\7\17\2\2Z&\3\2\2\2[\\\7\"\2\2\\(\3\2\2\2]^\7\13\2\2^*\3\2\2\2"+
		"_`\7\17\2\2`a\7\f\2\2a,\3\2\2\2bc\t\6\2\2c.\3\2\2\2de\7$\2\2e\60\3\2\2"+
		"\2fg\n\7\2\2g\62\3\2\2\2hi\n\b\2\2i\64\3\2\2\2jk\n\t\2\2k\66\3\2\2\2\3"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}