// Generated from robotwars/robotwar.g4 by ANTLR 4.7.1
package parsers.robotwars;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class robotwarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, A=14, B=15, C=16, D=17, E=18, F=19, 
		G=20, H=21, I=22, J=23, K=24, L=25, M=26, N=27, O=28, P=29, Q=30, R=31, 
		S=32, T=33, U=34, V=35, W=36, X=37, Y=38, Z=39, AIM=40, SHOT=41, RADAR=42, 
		DAMAGE=43, SPEEDX=44, SPEEDY=45, RANDOM=46, INDEX=47, DATA=48, DOT=49, 
		COMMA=50, ID=51, NUMBER=52, COMMENT=53, EOL=54, WS=55;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "A", "B", "C", "D", "E", "F", "G", 
		"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
		"V", "W", "X", "Y", "Z", "AIM", "SHOT", "RADAR", "DAMAGE", "SPEEDX", "SPEEDY", 
		"RANDOM", "INDEX", "DATA", "DOT", "COMMA", "ID", "NUMBER", "COMMENT", 
		"EOL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'#'", "'<'", "'>'", "'GOSUB'", "'GOTO'", "'TO'", "'ENDSUB'", 
		"'IF'", "'+'", "'-'", "'*'", "'/'", "'A'", "'B'", "'C'", "'D'", "'E'", 
		"'F'", "'G'", "'H'", "'I'", "'J'", "'K'", "'L'", "'M'", "'N'", "'O'", 
		"'P'", "'Q'", "'R'", "'S'", "'T'", "'U'", "'V'", "'W'", "'X'", "'Y'", 
		"'Z'", "'AIM'", "'SHOT'", "'RADAR'", "'DAMAGE'", "'SPEEDX'", "'SPEEDY'", 
		"'RANDOM'", "'INDEX'", "'DATA'", "'.'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
		"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
		"AIM", "SHOT", "RADAR", "DAMAGE", "SPEEDX", "SPEEDY", "RANDOM", "INDEX", 
		"DATA", "DOT", "COMMA", "ID", "NUMBER", "COMMENT", "EOL", "WS"
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


	public robotwarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "robotwar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\29\u0122\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\3\'\3\'\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3"+
		",\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3"+
		"/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\6\64\u010a\n\64\r\64\16\64\u010b\3\65\6\65\u010f"+
		"\n\65\r\65\16\65\u0110\3\66\3\66\7\66\u0115\n\66\f\66\16\66\u0118\13\66"+
		"\3\67\6\67\u011b\n\67\r\67\16\67\u011c\38\38\38\38\2\29\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9\3\2\7\4\2C"+
		"\\c|\5\2\62;C\\c|\3\2\62;\4\2\f\f\17\17\4\2\13\13\"\"\2\u0125\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2"+
		"c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3"+
		"\2\2\2\3q\3\2\2\2\5s\3\2\2\2\7u\3\2\2\2\tw\3\2\2\2\13y\3\2\2\2\r\177\3"+
		"\2\2\2\17\u0084\3\2\2\2\21\u0087\3\2\2\2\23\u008e\3\2\2\2\25\u0091\3\2"+
		"\2\2\27\u0093\3\2\2\2\31\u0095\3\2\2\2\33\u0097\3\2\2\2\35\u0099\3\2\2"+
		"\2\37\u009b\3\2\2\2!\u009d\3\2\2\2#\u009f\3\2\2\2%\u00a1\3\2\2\2\'\u00a3"+
		"\3\2\2\2)\u00a5\3\2\2\2+\u00a7\3\2\2\2-\u00a9\3\2\2\2/\u00ab\3\2\2\2\61"+
		"\u00ad\3\2\2\2\63\u00af\3\2\2\2\65\u00b1\3\2\2\2\67\u00b3\3\2\2\29\u00b5"+
		"\3\2\2\2;\u00b7\3\2\2\2=\u00b9\3\2\2\2?\u00bb\3\2\2\2A\u00bd\3\2\2\2C"+
		"\u00bf\3\2\2\2E\u00c1\3\2\2\2G\u00c3\3\2\2\2I\u00c5\3\2\2\2K\u00c7\3\2"+
		"\2\2M\u00c9\3\2\2\2O\u00cb\3\2\2\2Q\u00cd\3\2\2\2S\u00d1\3\2\2\2U\u00d6"+
		"\3\2\2\2W\u00dc\3\2\2\2Y\u00e3\3\2\2\2[\u00ea\3\2\2\2]\u00f1\3\2\2\2_"+
		"\u00f8\3\2\2\2a\u00fe\3\2\2\2c\u0103\3\2\2\2e\u0105\3\2\2\2g\u0107\3\2"+
		"\2\2i\u010e\3\2\2\2k\u0112\3\2\2\2m\u011a\3\2\2\2o\u011e\3\2\2\2qr\7?"+
		"\2\2r\4\3\2\2\2st\7%\2\2t\6\3\2\2\2uv\7>\2\2v\b\3\2\2\2wx\7@\2\2x\n\3"+
		"\2\2\2yz\7I\2\2z{\7Q\2\2{|\7U\2\2|}\7W\2\2}~\7D\2\2~\f\3\2\2\2\177\u0080"+
		"\7I\2\2\u0080\u0081\7Q\2\2\u0081\u0082\7V\2\2\u0082\u0083\7Q\2\2\u0083"+
		"\16\3\2\2\2\u0084\u0085\7V\2\2\u0085\u0086\7Q\2\2\u0086\20\3\2\2\2\u0087"+
		"\u0088\7G\2\2\u0088\u0089\7P\2\2\u0089\u008a\7F\2\2\u008a\u008b\7U\2\2"+
		"\u008b\u008c\7W\2\2\u008c\u008d\7D\2\2\u008d\22\3\2\2\2\u008e\u008f\7"+
		"K\2\2\u008f\u0090\7H\2\2\u0090\24\3\2\2\2\u0091\u0092\7-\2\2\u0092\26"+
		"\3\2\2\2\u0093\u0094\7/\2\2\u0094\30\3\2\2\2\u0095\u0096\7,\2\2\u0096"+
		"\32\3\2\2\2\u0097\u0098\7\61\2\2\u0098\34\3\2\2\2\u0099\u009a\7C\2\2\u009a"+
		"\36\3\2\2\2\u009b\u009c\7D\2\2\u009c \3\2\2\2\u009d\u009e\7E\2\2\u009e"+
		"\"\3\2\2\2\u009f\u00a0\7F\2\2\u00a0$\3\2\2\2\u00a1\u00a2\7G\2\2\u00a2"+
		"&\3\2\2\2\u00a3\u00a4\7H\2\2\u00a4(\3\2\2\2\u00a5\u00a6\7I\2\2\u00a6*"+
		"\3\2\2\2\u00a7\u00a8\7J\2\2\u00a8,\3\2\2\2\u00a9\u00aa\7K\2\2\u00aa.\3"+
		"\2\2\2\u00ab\u00ac\7L\2\2\u00ac\60\3\2\2\2\u00ad\u00ae\7M\2\2\u00ae\62"+
		"\3\2\2\2\u00af\u00b0\7N\2\2\u00b0\64\3\2\2\2\u00b1\u00b2\7O\2\2\u00b2"+
		"\66\3\2\2\2\u00b3\u00b4\7P\2\2\u00b48\3\2\2\2\u00b5\u00b6\7Q\2\2\u00b6"+
		":\3\2\2\2\u00b7\u00b8\7R\2\2\u00b8<\3\2\2\2\u00b9\u00ba\7S\2\2\u00ba>"+
		"\3\2\2\2\u00bb\u00bc\7T\2\2\u00bc@\3\2\2\2\u00bd\u00be\7U\2\2\u00beB\3"+
		"\2\2\2\u00bf\u00c0\7V\2\2\u00c0D\3\2\2\2\u00c1\u00c2\7W\2\2\u00c2F\3\2"+
		"\2\2\u00c3\u00c4\7X\2\2\u00c4H\3\2\2\2\u00c5\u00c6\7Y\2\2\u00c6J\3\2\2"+
		"\2\u00c7\u00c8\7Z\2\2\u00c8L\3\2\2\2\u00c9\u00ca\7[\2\2\u00caN\3\2\2\2"+
		"\u00cb\u00cc\7\\\2\2\u00ccP\3\2\2\2\u00cd\u00ce\7C\2\2\u00ce\u00cf\7K"+
		"\2\2\u00cf\u00d0\7O\2\2\u00d0R\3\2\2\2\u00d1\u00d2\7U\2\2\u00d2\u00d3"+
		"\7J\2\2\u00d3\u00d4\7Q\2\2\u00d4\u00d5\7V\2\2\u00d5T\3\2\2\2\u00d6\u00d7"+
		"\7T\2\2\u00d7\u00d8\7C\2\2\u00d8\u00d9\7F\2\2\u00d9\u00da\7C\2\2\u00da"+
		"\u00db\7T\2\2\u00dbV\3\2\2\2\u00dc\u00dd\7F\2\2\u00dd\u00de\7C\2\2\u00de"+
		"\u00df\7O\2\2\u00df\u00e0\7C\2\2\u00e0\u00e1\7I\2\2\u00e1\u00e2\7G\2\2"+
		"\u00e2X\3\2\2\2\u00e3\u00e4\7U\2\2\u00e4\u00e5\7R\2\2\u00e5\u00e6\7G\2"+
		"\2\u00e6\u00e7\7G\2\2\u00e7\u00e8\7F\2\2\u00e8\u00e9\7Z\2\2\u00e9Z\3\2"+
		"\2\2\u00ea\u00eb\7U\2\2\u00eb\u00ec\7R\2\2\u00ec\u00ed\7G\2\2\u00ed\u00ee"+
		"\7G\2\2\u00ee\u00ef\7F\2\2\u00ef\u00f0\7[\2\2\u00f0\\\3\2\2\2\u00f1\u00f2"+
		"\7T\2\2\u00f2\u00f3\7C\2\2\u00f3\u00f4\7P\2\2\u00f4\u00f5\7F\2\2\u00f5"+
		"\u00f6\7Q\2\2\u00f6\u00f7\7O\2\2\u00f7^\3\2\2\2\u00f8\u00f9\7K\2\2\u00f9"+
		"\u00fa\7P\2\2\u00fa\u00fb\7F\2\2\u00fb\u00fc\7G\2\2\u00fc\u00fd\7Z\2\2"+
		"\u00fd`\3\2\2\2\u00fe\u00ff\7F\2\2\u00ff\u0100\7C\2\2\u0100\u0101\7V\2"+
		"\2\u0101\u0102\7C\2\2\u0102b\3\2\2\2\u0103\u0104\7\60\2\2\u0104d\3\2\2"+
		"\2\u0105\u0106\7.\2\2\u0106f\3\2\2\2\u0107\u0109\t\2\2\2\u0108\u010a\t"+
		"\3\2\2\u0109\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010ch\3\2\2\2\u010d\u010f\t\4\2\2\u010e\u010d\3\2\2\2"+
		"\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111j\3"+
		"\2\2\2\u0112\u0116\7=\2\2\u0113\u0115\n\5\2\2\u0114\u0113\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117l\3\2\2\2"+
		"\u0118\u0116\3\2\2\2\u0119\u011b\t\5\2\2\u011a\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011dn\3\2\2\2\u011e"+
		"\u011f\t\6\2\2\u011f\u0120\3\2\2\2\u0120\u0121\b8\2\2\u0121p\3\2\2\2\7"+
		"\2\u010b\u0110\u0116\u011c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}