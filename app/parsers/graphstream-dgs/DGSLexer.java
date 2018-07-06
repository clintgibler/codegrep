// Generated from graphstream-dgs/DGSLexer.g4 by ANTLR 4.7.1
package parsers.graphstream-dgs;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DGSLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAGIC=1, AN=2, CN=3, DN=4, AE=5, CE=6, DE=7, CG=8, ST=9, CL=10, INT=11, 
		REAL=12, PLUS=13, MINUS=14, COMMA=15, LBRACE=16, RBRACE=17, LBRACK=18, 
		RBRACK=19, DOT=20, LANGLE=21, RANGLE=22, EQUALS=23, COLON=24, EOL=25, 
		WORD=26, STRING=27, COLOR=28, START_COMMENT=29, WS=30, COMMENT=31;
	public static final int
		CMT=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "CMT"
	};

	public static final String[] ruleNames = {
		"MAGIC", "AN", "CN", "DN", "AE", "CE", "DE", "CG", "ST", "CL", "INT", 
		"REAL", "PLUS", "MINUS", "COMMA", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"DOT", "LANGLE", "RANGLE", "EQUALS", "COLON", "EOL", "WORD", "STRING", 
		"DQSTRING", "DQESC", "SQSTRING", "SQESC", "HEXBYTE", "COLOR", "START_COMMENT", 
		"WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'an'", "'cn'", "'dn'", "'ae'", "'ce'", "'de'", "'cg'", "'st'", 
		"'cl'", null, null, "'+'", "'-'", "','", "'{'", "'}'", "'['", "']'", "'.'", 
		"'<'", "'>'", "'='", "':'", null, null, null, null, "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "MAGIC", "AN", "CN", "DN", "AE", "CE", "DE", "CG", "ST", "CL", "INT", 
		"REAL", "PLUS", "MINUS", "COMMA", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"DOT", "LANGLE", "RANGLE", "EQUALS", "COLON", "EOL", "WORD", "STRING", 
		"COLOR", "START_COMMENT", "WS", "COMMENT"
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


	public DGSLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DGSLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u0101\b\1\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2Y\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\5"+
		"\fw\n\f\3\f\3\f\3\f\7\f|\n\f\f\f\16\f\177\13\f\5\f\u0081\n\f\3\r\3\r\3"+
		"\r\7\r\u0086\n\r\f\r\16\r\u0089\13\r\5\r\u008b\n\r\3\r\3\r\5\r\u008f\n"+
		"\r\3\r\7\r\u0092\n\r\f\r\16\r\u0095\13\r\3\r\5\r\u0098\n\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\5\32\u00b5\n\32"+
		"\3\33\3\33\7\33\u00b9\n\33\f\33\16\33\u00bc\13\33\3\34\3\34\5\34\u00c0"+
		"\n\34\3\35\3\35\3\35\7\35\u00c5\n\35\f\35\16\35\u00c8\13\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\5\36\u00d0\n\36\3\37\3\37\3\37\7\37\u00d5\n\37\f"+
		"\37\16\37\u00d8\13\37\3\37\3\37\3 \3 \3 \3 \5 \u00e0\n \3!\3!\3!\3\"\3"+
		"\"\3\"\3\"\3\"\5\"\u00ea\n\"\3#\3#\3#\3#\3#\3$\6$\u00f2\n$\r$\16$\u00f3"+
		"\3$\3$\3%\7%\u00f9\n%\f%\16%\u00fc\13%\3%\3%\3%\3%\5\u00c6\u00d6\u00fa"+
		"\2&\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36"+
		"\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32\64\33\66\348\35:\2<\2"+
		">\2@\2B\2D\36F\37H J!\4\2\3\13\4\2--//\3\2\63;\3\2\62;\4\2GGgg\4\2\f\f"+
		"\17\17\4\2C\\c|\7\2//\62;C\\aac|\5\2\62;CHch\4\2\13\13\"\"\2\u010f\2\4"+
		"\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2"+
		"\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32"+
		"\3\2\2\2\2\34\3\2\2\2\2\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\2"+
		"&\3\2\2\2\2(\3\2\2\2\2*\3\2\2\2\2,\3\2\2\2\2.\3\2\2\2\2\60\3\2\2\2\2\62"+
		"\3\2\2\2\2\64\3\2\2\2\2\66\3\2\2\2\28\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2"+
		"H\3\2\2\2\3J\3\2\2\2\4X\3\2\2\2\6Z\3\2\2\2\b]\3\2\2\2\n`\3\2\2\2\fc\3"+
		"\2\2\2\16f\3\2\2\2\20i\3\2\2\2\22l\3\2\2\2\24o\3\2\2\2\26r\3\2\2\2\30"+
		"v\3\2\2\2\32\u0082\3\2\2\2\34\u0099\3\2\2\2\36\u009b\3\2\2\2 \u009d\3"+
		"\2\2\2\"\u009f\3\2\2\2$\u00a1\3\2\2\2&\u00a3\3\2\2\2(\u00a5\3\2\2\2*\u00a7"+
		"\3\2\2\2,\u00a9\3\2\2\2.\u00ab\3\2\2\2\60\u00ad\3\2\2\2\62\u00af\3\2\2"+
		"\2\64\u00b4\3\2\2\2\66\u00b6\3\2\2\28\u00bf\3\2\2\2:\u00c1\3\2\2\2<\u00cf"+
		"\3\2\2\2>\u00d1\3\2\2\2@\u00df\3\2\2\2B\u00e1\3\2\2\2D\u00e4\3\2\2\2F"+
		"\u00eb\3\2\2\2H\u00f1\3\2\2\2J\u00fa\3\2\2\2LM\7F\2\2MN\7I\2\2NO\7U\2"+
		"\2OP\7\62\2\2PQ\7\62\2\2QY\7\66\2\2RS\7F\2\2ST\7I\2\2TU\7U\2\2UV\7\62"+
		"\2\2VW\7\62\2\2WY\7\65\2\2XL\3\2\2\2XR\3\2\2\2Y\5\3\2\2\2Z[\7c\2\2[\\"+
		"\7p\2\2\\\7\3\2\2\2]^\7e\2\2^_\7p\2\2_\t\3\2\2\2`a\7f\2\2ab\7p\2\2b\13"+
		"\3\2\2\2cd\7c\2\2de\7g\2\2e\r\3\2\2\2fg\7e\2\2gh\7g\2\2h\17\3\2\2\2ij"+
		"\7f\2\2jk\7g\2\2k\21\3\2\2\2lm\7e\2\2mn\7i\2\2n\23\3\2\2\2op\7u\2\2pq"+
		"\7v\2\2q\25\3\2\2\2rs\7e\2\2st\7n\2\2t\27\3\2\2\2uw\t\2\2\2vu\3\2\2\2"+
		"vw\3\2\2\2w\u0080\3\2\2\2x\u0081\7\62\2\2y}\t\3\2\2z|\t\4\2\2{z\3\2\2"+
		"\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\u0080"+
		"x\3\2\2\2\u0080y\3\2\2\2\u0081\31\3\2\2\2\u0082\u008a\5\30\f\2\u0083\u0087"+
		"\7\60\2\2\u0084\u0086\t\4\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2"+
		"\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u008a\u0083\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0097\3\2\2\2\u008c"+
		"\u008e\t\5\2\2\u008d\u008f\t\2\2\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\u0093\3\2\2\2\u0090\u0092\t\4\2\2\u0091\u0090\3\2\2\2\u0092"+
		"\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2"+
		"\2\2\u0095\u0093\3\2\2\2\u0096\u0098\t\3\2\2\u0097\u008c\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\33\3\2\2\2\u0099\u009a\7-\2\2\u009a\35\3\2\2\2\u009b"+
		"\u009c\7/\2\2\u009c\37\3\2\2\2\u009d\u009e\7.\2\2\u009e!\3\2\2\2\u009f"+
		"\u00a0\7}\2\2\u00a0#\3\2\2\2\u00a1\u00a2\7\177\2\2\u00a2%\3\2\2\2\u00a3"+
		"\u00a4\7]\2\2\u00a4\'\3\2\2\2\u00a5\u00a6\7_\2\2\u00a6)\3\2\2\2\u00a7"+
		"\u00a8\7\60\2\2\u00a8+\3\2\2\2\u00a9\u00aa\7>\2\2\u00aa-\3\2\2\2\u00ab"+
		"\u00ac\7@\2\2\u00ac/\3\2\2\2\u00ad\u00ae\7?\2\2\u00ae\61\3\2\2\2\u00af"+
		"\u00b0\7<\2\2\u00b0\63\3\2\2\2\u00b1\u00b5\t\6\2\2\u00b2\u00b3\7\17\2"+
		"\2\u00b3\u00b5\7\f\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\65"+
		"\3\2\2\2\u00b6\u00ba\t\7\2\2\u00b7\u00b9\t\b\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\67\3\2\2"+
		"\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\5>\37\2\u00be\u00c0\5:\35\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00be\3\2\2\2\u00c09\3\2\2\2\u00c1\u00c6\7$\2\2\u00c2\u00c5"+
		"\5<\36\2\u00c3\u00c5\13\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3\3\2\2\2"+
		"\u00c5\u00c8\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7$\2\2\u00ca;\3\2\2\2\u00cb\u00cc"+
		"\7^\2\2\u00cc\u00d0\7$\2\2\u00cd\u00ce\7^\2\2\u00ce\u00d0\7^\2\2\u00cf"+
		"\u00cb\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0=\3\2\2\2\u00d1\u00d6\7)\2\2\u00d2"+
		"\u00d5\5@ \2\u00d3\u00d5\13\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2"+
		"\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7)\2\2\u00da?\3\2\2\2\u00db"+
		"\u00dc\7^\2\2\u00dc\u00e0\7)\2\2\u00dd\u00de\7^\2\2\u00de\u00e0\7^\2\2"+
		"\u00df\u00db\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0A\3\2\2\2\u00e1\u00e2\t"+
		"\t\2\2\u00e2\u00e3\t\t\2\2\u00e3C\3\2\2\2\u00e4\u00e5\7%\2\2\u00e5\u00e6"+
		"\5B!\2\u00e6\u00e7\5B!\2\u00e7\u00e9\5B!\2\u00e8\u00ea\5B!\2\u00e9\u00e8"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00eaE\3\2\2\2\u00eb\u00ec\7%\2\2\u00ec\u00ed"+
		"\3\2\2\2\u00ed\u00ee\b#\2\2\u00ee\u00ef\b#\3\2\u00efG\3\2\2\2\u00f0\u00f2"+
		"\t\n\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b$\3\2\u00f6I\3\2\2\2\u00f7"+
		"\u00f9\13\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00fb\3"+
		"\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00fe\5\64\32\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\b%\4\2\u0100K\3\2\2\2"+
		"\31\2\3Xv}\u0080\u0087\u008a\u008e\u0093\u0097\u00b4\u00ba\u00bf\u00c4"+
		"\u00c6\u00cf\u00d4\u00d6\u00df\u00e9\u00f3\u00fa\5\7\3\2\b\2\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}