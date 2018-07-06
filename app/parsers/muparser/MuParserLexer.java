// Generated from muparser/MuParser.g4 by ANTLR 4.7.1
package parsers.muparser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MuParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, FUNCTION=3, FUNCTIONMULTI=4, ASSIGN=5, ASSIGNADD=6, ASSIGNSUB=7, 
		ASSIGNMUL=8, ASSIGNDIV=9, AND=10, OR=11, LTEQ=12, GTEQ=13, NEQ=14, EQ=15, 
		LT=16, GT=17, ADD=18, SUB=19, MUL=20, DIV=21, POW=22, NOT=23, QUESTION=24, 
		COLON=25, OPAR=26, CPAR=27, INT=28, FLOAT=29, TRUE=30, FALSE=31, E=32, 
		PI=33, ID=34, SPACE=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "FUNCTION", "FUNCTIONMULTI", "ASSIGN", "ASSIGNADD", "ASSIGNSUB", 
		"ASSIGNMUL", "ASSIGNDIV", "AND", "OR", "LTEQ", "GTEQ", "NEQ", "EQ", "LT", 
		"GT", "ADD", "SUB", "MUL", "DIV", "POW", "NOT", "QUESTION", "COLON", "OPAR", 
		"CPAR", "INT", "FLOAT", "TRUE", "FALSE", "E", "PI", "ID", "SPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\n'", "','", null, null, "'='", "'+='", "'-='", "'*='", "'/='", 
		"'&&'", "'||'", "'<='", "'>='", "'!='", "'=='", "'<'", "'>'", "'+'", "'-'", 
		"'*'", "'/'", "'^'", "'!'", "'?'", "':'", "'('", "')'", null, null, "'true'", 
		"'false'", "'_e'", "'_pi'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "FUNCTION", "FUNCTIONMULTI", "ASSIGN", "ASSIGNADD", 
		"ASSIGNSUB", "ASSIGNMUL", "ASSIGNDIV", "AND", "OR", "LTEQ", "GTEQ", "NEQ", 
		"EQ", "LT", "GT", "ADD", "SUB", "MUL", "DIV", "POW", "NOT", "QUESTION", 
		"COLON", "OPAR", "CPAR", "INT", "FLOAT", "TRUE", "FALSE", "E", "PI", "ID", 
		"SPACE"
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


	public MuParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MuParser.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u011b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4\u009e\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u00ac\n\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\6\35\u00e7\n\35\r\35\16\35\u00e8\3\36\6\36\u00ec\n\36\r\36\16\36\u00ed"+
		"\3\36\3\36\7\36\u00f2\n\36\f\36\16\36\u00f5\13\36\3\36\3\36\6\36\u00f9"+
		"\n\36\r\36\16\36\u00fa\5\36\u00fd\n\36\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\7#\u0113\n#\f#\16#\u0116\13"+
		"#\3$\3$\3$\3$\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\6\3\2\62;\5\2C\\aac|\6\2\62;C\\"+
		"aac|\5\2\13\f\17\17\"\"\2\u0137\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2\2\7\u009d\3\2\2"+
		"\2\t\u00ab\3\2\2\2\13\u00ad\3\2\2\2\r\u00af\3\2\2\2\17\u00b2\3\2\2\2\21"+
		"\u00b5\3\2\2\2\23\u00b8\3\2\2\2\25\u00bb\3\2\2\2\27\u00be\3\2\2\2\31\u00c1"+
		"\3\2\2\2\33\u00c4\3\2\2\2\35\u00c7\3\2\2\2\37\u00ca\3\2\2\2!\u00cd\3\2"+
		"\2\2#\u00cf\3\2\2\2%\u00d1\3\2\2\2\'\u00d3\3\2\2\2)\u00d5\3\2\2\2+\u00d7"+
		"\3\2\2\2-\u00d9\3\2\2\2/\u00db\3\2\2\2\61\u00dd\3\2\2\2\63\u00df\3\2\2"+
		"\2\65\u00e1\3\2\2\2\67\u00e3\3\2\2\29\u00e6\3\2\2\2;\u00fc\3\2\2\2=\u00fe"+
		"\3\2\2\2?\u0103\3\2\2\2A\u0109\3\2\2\2C\u010c\3\2\2\2E\u0110\3\2\2\2G"+
		"\u0117\3\2\2\2IJ\7\f\2\2J\4\3\2\2\2KL\7.\2\2L\6\3\2\2\2MN\7u\2\2NO\7k"+
		"\2\2O\u009e\7p\2\2PQ\7e\2\2QR\7q\2\2R\u009e\7u\2\2ST\7v\2\2TU\7c\2\2U"+
		"\u009e\7p\2\2VW\7c\2\2WX\7u\2\2XY\7k\2\2Y\u009e\7p\2\2Z[\7c\2\2[\\\7e"+
		"\2\2\\]\7q\2\2]\u009e\7u\2\2^_\7c\2\2_`\7v\2\2`a\7c\2\2a\u009e\7p\2\2"+
		"bc\7u\2\2cd\7k\2\2de\7p\2\2e\u009e\7j\2\2fg\7e\2\2gh\7q\2\2hi\7u\2\2i"+
		"\u009e\7j\2\2jk\7v\2\2kl\7c\2\2lm\7p\2\2m\u009e\7j\2\2no\7c\2\2op\7u\2"+
		"\2pq\7k\2\2qr\7p\2\2r\u009e\7j\2\2st\7c\2\2tu\7e\2\2uv\7q\2\2vw\7u\2\2"+
		"w\u009e\7j\2\2xy\7c\2\2yz\7v\2\2z{\7c\2\2{|\7p\2\2|\u009e\7j\2\2}~\7n"+
		"\2\2~\177\7q\2\2\177\u0080\7i\2\2\u0080\u009e\7\64\2\2\u0081\u0082\7n"+
		"\2\2\u0082\u0083\7q\2\2\u0083\u0084\7i\2\2\u0084\u0085\7\63\2\2\u0085"+
		"\u009e\7\62\2\2\u0086\u0087\7n\2\2\u0087\u0088\7q\2\2\u0088\u009e\7i\2"+
		"\2\u0089\u008a\7n\2\2\u008a\u009e\7p\2\2\u008b\u008c\7g\2\2\u008c\u008d"+
		"\7z\2\2\u008d\u009e\7r\2\2\u008e\u008f\7u\2\2\u008f\u0090\7s\2\2\u0090"+
		"\u0091\7t\2\2\u0091\u009e\7v\2\2\u0092\u0093\7u\2\2\u0093\u0094\7k\2\2"+
		"\u0094\u0095\7i\2\2\u0095\u009e\7p\2\2\u0096\u0097\7t\2\2\u0097\u0098"+
		"\7k\2\2\u0098\u0099\7p\2\2\u0099\u009e\7v\2\2\u009a\u009b\7c\2\2\u009b"+
		"\u009c\7d\2\2\u009c\u009e\7u\2\2\u009dM\3\2\2\2\u009dP\3\2\2\2\u009dS"+
		"\3\2\2\2\u009dV\3\2\2\2\u009dZ\3\2\2\2\u009d^\3\2\2\2\u009db\3\2\2\2\u009d"+
		"f\3\2\2\2\u009dj\3\2\2\2\u009dn\3\2\2\2\u009ds\3\2\2\2\u009dx\3\2\2\2"+
		"\u009d}\3\2\2\2\u009d\u0081\3\2\2\2\u009d\u0086\3\2\2\2\u009d\u0089\3"+
		"\2\2\2\u009d\u008b\3\2\2\2\u009d\u008e\3\2\2\2\u009d\u0092\3\2\2\2\u009d"+
		"\u0096\3\2\2\2\u009d\u009a\3\2\2\2\u009e\b\3\2\2\2\u009f\u00a0\7o\2\2"+
		"\u00a0\u00a1\7k\2\2\u00a1\u00ac\7p\2\2\u00a2\u00a3\7o\2\2\u00a3\u00a4"+
		"\7c\2\2\u00a4\u00ac\7z\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7w\2\2\u00a7"+
		"\u00ac\7o\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7x\2\2\u00aa\u00ac\7i\2\2"+
		"\u00ab\u009f\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ab\u00a8"+
		"\3\2\2\2\u00ac\n\3\2\2\2\u00ad\u00ae\7?\2\2\u00ae\f\3\2\2\2\u00af\u00b0"+
		"\7-\2\2\u00b0\u00b1\7?\2\2\u00b1\16\3\2\2\2\u00b2\u00b3\7/\2\2\u00b3\u00b4"+
		"\7?\2\2\u00b4\20\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6\u00b7\7?\2\2\u00b7\22"+
		"\3\2\2\2\u00b8\u00b9\7\61\2\2\u00b9\u00ba\7?\2\2\u00ba\24\3\2\2\2\u00bb"+
		"\u00bc\7(\2\2\u00bc\u00bd\7(\2\2\u00bd\26\3\2\2\2\u00be\u00bf\7~\2\2\u00bf"+
		"\u00c0\7~\2\2\u00c0\30\3\2\2\2\u00c1\u00c2\7>\2\2\u00c2\u00c3\7?\2\2\u00c3"+
		"\32\3\2\2\2\u00c4\u00c5\7@\2\2\u00c5\u00c6\7?\2\2\u00c6\34\3\2\2\2\u00c7"+
		"\u00c8\7#\2\2\u00c8\u00c9\7?\2\2\u00c9\36\3\2\2\2\u00ca\u00cb\7?\2\2\u00cb"+
		"\u00cc\7?\2\2\u00cc \3\2\2\2\u00cd\u00ce\7>\2\2\u00ce\"\3\2\2\2\u00cf"+
		"\u00d0\7@\2\2\u00d0$\3\2\2\2\u00d1\u00d2\7-\2\2\u00d2&\3\2\2\2\u00d3\u00d4"+
		"\7/\2\2\u00d4(\3\2\2\2\u00d5\u00d6\7,\2\2\u00d6*\3\2\2\2\u00d7\u00d8\7"+
		"\61\2\2\u00d8,\3\2\2\2\u00d9\u00da\7`\2\2\u00da.\3\2\2\2\u00db\u00dc\7"+
		"#\2\2\u00dc\60\3\2\2\2\u00dd\u00de\7A\2\2\u00de\62\3\2\2\2\u00df\u00e0"+
		"\7<\2\2\u00e0\64\3\2\2\2\u00e1\u00e2\7*\2\2\u00e2\66\3\2\2\2\u00e3\u00e4"+
		"\7+\2\2\u00e48\3\2\2\2\u00e5\u00e7\t\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9:\3\2\2\2\u00ea"+
		"\u00ec\t\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f3\7\60\2\2\u00f0"+
		"\u00f2\t\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00fd\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00f8\7\60\2\2\u00f7\u00f9\t\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3"+
		"\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc"+
		"\u00eb\3\2\2\2\u00fc\u00f6\3\2\2\2\u00fd<\3\2\2\2\u00fe\u00ff\7v\2\2\u00ff"+
		"\u0100\7t\2\2\u0100\u0101\7w\2\2\u0101\u0102\7g\2\2\u0102>\3\2\2\2\u0103"+
		"\u0104\7h\2\2\u0104\u0105\7c\2\2\u0105\u0106\7n\2\2\u0106\u0107\7u\2\2"+
		"\u0107\u0108\7g\2\2\u0108@\3\2\2\2\u0109\u010a\7a\2\2\u010a\u010b\7g\2"+
		"\2\u010bB\3\2\2\2\u010c\u010d\7a\2\2\u010d\u010e\7r\2\2\u010e\u010f\7"+
		"k\2\2\u010fD\3\2\2\2\u0110\u0114\t\3\2\2\u0111\u0113\t\4\2\2\u0112\u0111"+
		"\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"F\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0118\t\5\2\2\u0118\u0119\3\2\2\2"+
		"\u0119\u011a\b$\2\2\u011aH\3\2\2\2\13\2\u009d\u00ab\u00e8\u00ed\u00f3"+
		"\u00fa\u00fc\u0114\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}