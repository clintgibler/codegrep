// Generated from molecule/molecule.g4 by ANTLR 4.7.1
package parsers.molecule;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class moleculeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, ELEMENT=6, NUMBER=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "ELEMENT", "NUMBER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\u00B7'", "'('", "')'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "ELEMENT", "NUMBER", "WS"
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


	public moleculeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "molecule.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u0108\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00fb\n\7\3\b\6\b\u00fe\n\b\r\b\16\b\u00ff\3\t\6\t\u0103\n\t\r"+
		"\t\16\t\u0104\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\5\5"+
		"\2DEHHPQ\4\2RRUU\5\2\13\f\17\17\"\"\2\u0179\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\3\23\3\2\2\2\5\25\3\2\2\2\7\27\3\2\2\2\t\31\3\2\2\2\13\33\3\2\2\2"+
		"\r\u00fa\3\2\2\2\17\u00fd\3\2\2\2\21\u0102\3\2\2\2\23\24\7\u00b9\2\2\24"+
		"\4\3\2\2\2\25\26\7*\2\2\26\6\3\2\2\2\27\30\7+\2\2\30\b\3\2\2\2\31\32\7"+
		"]\2\2\32\n\3\2\2\2\33\34\7_\2\2\34\f\3\2\2\2\35\u00fb\7J\2\2\36\37\7J"+
		"\2\2\37\u00fb\7g\2\2 !\7N\2\2!\u00fb\7k\2\2\"#\7D\2\2#\u00fb\7g\2\2$\u00fb"+
		"\t\2\2\2%&\7P\2\2&\u00fb\7g\2\2\'(\7P\2\2(\u00fb\7c\2\2)*\7O\2\2*\u00fb"+
		"\7i\2\2+,\7C\2\2,\u00fb\7n\2\2-.\7U\2\2.\u00fb\7k\2\2/\u00fb\t\3\2\2\60"+
		"\61\7E\2\2\61\u00fb\7n\2\2\62\63\7C\2\2\63\u00fb\7t\2\2\64\u00fb\7M\2"+
		"\2\65\66\7E\2\2\66\u00fb\7c\2\2\678\7U\2\28\u00fb\7e\2\29:\7V\2\2:\u00fb"+
		"\7k\2\2;\u00fb\7X\2\2<=\7E\2\2=\u00fb\7t\2\2>?\7O\2\2?\u00fb\7p\2\2@A"+
		"\7H\2\2A\u00fb\7g\2\2BC\7E\2\2C\u00fb\7q\2\2DE\7P\2\2E\u00fb\7k\2\2FG"+
		"\7E\2\2G\u00fb\7w\2\2HI\7\\\2\2I\u00fb\7p\2\2JK\7I\2\2K\u00fb\7c\2\2L"+
		"M\7I\2\2M\u00fb\7g\2\2NO\7C\2\2O\u00fb\7u\2\2PQ\7U\2\2Q\u00fb\7g\2\2R"+
		"S\7D\2\2S\u00fb\7t\2\2TU\7M\2\2U\u00fb\7t\2\2VW\7T\2\2W\u00fb\7d\2\2X"+
		"Y\7U\2\2Y\u00fb\7t\2\2Z\u00fb\7[\2\2[\\\7\\\2\2\\\u00fb\7t\2\2]^\7P\2"+
		"\2^\u00fb\7d\2\2_`\7O\2\2`\u00fb\7q\2\2ab\7V\2\2b\u00fb\7e\2\2cd\7T\2"+
		"\2d\u00fb\7w\2\2ef\7T\2\2f\u00fb\7j\2\2gh\7R\2\2h\u00fb\7f\2\2ij\7C\2"+
		"\2j\u00fb\7i\2\2kl\7E\2\2l\u00fb\7f\2\2mn\7K\2\2n\u00fb\7p\2\2op\7U\2"+
		"\2p\u00fb\7p\2\2qr\7U\2\2r\u00fb\7d\2\2st\7V\2\2t\u00fb\7g\2\2u\u00fb"+
		"\7K\2\2vw\7Z\2\2w\u00fb\7g\2\2xy\7E\2\2y\u00fb\7u\2\2z{\7D\2\2{\u00fb"+
		"\7c\2\2|}\7N\2\2}\u00fb\7c\2\2~\177\7E\2\2\177\u00fb\7g\2\2\u0080\u0081"+
		"\7R\2\2\u0081\u00fb\7t\2\2\u0082\u0083\7P\2\2\u0083\u00fb\7f\2\2\u0084"+
		"\u0085\7R\2\2\u0085\u00fb\7o\2\2\u0086\u0087\7U\2\2\u0087\u00fb\7o\2\2"+
		"\u0088\u0089\7G\2\2\u0089\u00fb\7w\2\2\u008a\u008b\7I\2\2\u008b\u00fb"+
		"\7f\2\2\u008c\u008d\7V\2\2\u008d\u00fb\7d\2\2\u008e\u008f\7F\2\2\u008f"+
		"\u00fb\7{\2\2\u0090\u0091\7J\2\2\u0091\u00fb\7q\2\2\u0092\u0093\7G\2\2"+
		"\u0093\u00fb\7t\2\2\u0094\u0095\7V\2\2\u0095\u00fb\7o\2\2\u0096\u0097"+
		"\7[\2\2\u0097\u00fb\7d\2\2\u0098\u0099\7N\2\2\u0099\u00fb\7w\2\2\u009a"+
		"\u009b\7J\2\2\u009b\u00fb\7h\2\2\u009c\u009d\7V\2\2\u009d\u00fb\7c\2\2"+
		"\u009e\u00fb\7Y\2\2\u009f\u00a0\7T\2\2\u00a0\u00fb\7g\2\2\u00a1\u00a2"+
		"\7Q\2\2\u00a2\u00fb\7u\2\2\u00a3\u00a4\7K\2\2\u00a4\u00fb\7t\2\2\u00a5"+
		"\u00a6\7R\2\2\u00a6\u00fb\7v\2\2\u00a7\u00a8\7C\2\2\u00a8\u00fb\7w\2\2"+
		"\u00a9\u00aa\7J\2\2\u00aa\u00fb\7i\2\2\u00ab\u00ac\7V\2\2\u00ac\u00fb"+
		"\7n\2\2\u00ad\u00ae\7R\2\2\u00ae\u00fb\7d\2\2\u00af\u00b0\7D\2\2\u00b0"+
		"\u00fb\7k\2\2\u00b1\u00b2\7R\2\2\u00b2\u00fb\7q\2\2\u00b3\u00b4\7C\2\2"+
		"\u00b4\u00fb\7v\2\2\u00b5\u00b6\7T\2\2\u00b6\u00fb\7p\2\2\u00b7\u00b8"+
		"\7H\2\2\u00b8\u00fb\7t\2\2\u00b9\u00ba\7T\2\2\u00ba\u00fb\7c\2\2\u00bb"+
		"\u00bc\7C\2\2\u00bc\u00fb\7e\2\2\u00bd\u00be\7V\2\2\u00be\u00fb\7j\2\2"+
		"\u00bf\u00c0\7R\2\2\u00c0\u00fb\7c\2\2\u00c1\u00fb\7W\2\2\u00c2\u00c3"+
		"\7P\2\2\u00c3\u00fb\7r\2\2\u00c4\u00c5\7R\2\2\u00c5\u00fb\7w\2\2\u00c6"+
		"\u00c7\7C\2\2\u00c7\u00fb\7o\2\2\u00c8\u00c9\7E\2\2\u00c9\u00fb\7o\2\2"+
		"\u00ca\u00cb\7D\2\2\u00cb\u00fb\7m\2\2\u00cc\u00cd\7E\2\2\u00cd\u00fb"+
		"\7h\2\2\u00ce\u00cf\7G\2\2\u00cf\u00fb\7u\2\2\u00d0\u00d1\7H\2\2\u00d1"+
		"\u00fb\7o\2\2\u00d2\u00d3\7O\2\2\u00d3\u00fb\7f\2\2\u00d4\u00d5\7P\2\2"+
		"\u00d5\u00fb\7q\2\2\u00d6\u00d7\7N\2\2\u00d7\u00fb\7t\2\2\u00d8\u00d9"+
		"\7T\2\2\u00d9\u00fb\7h\2\2\u00da\u00db\7F\2\2\u00db\u00fb\7d\2\2\u00dc"+
		"\u00dd\7U\2\2\u00dd\u00fb\7i\2\2\u00de\u00df\7D\2\2\u00df\u00fb\7j\2\2"+
		"\u00e0\u00e1\7J\2\2\u00e1\u00fb\7u\2\2\u00e2\u00e3\7O\2\2\u00e3\u00fb"+
		"\7v\2\2\u00e4\u00e5\7F\2\2\u00e5\u00fb\7u\2\2\u00e6\u00e7\7T\2\2\u00e7"+
		"\u00fb\7i\2\2\u00e8\u00e9\7E\2\2\u00e9\u00fb\7p\2\2\u00ea\u00eb\7W\2\2"+
		"\u00eb\u00ec\7w\2\2\u00ec\u00fb\7v\2\2\u00ed\u00ee\7H\2\2\u00ee\u00fb"+
		"\7n\2\2\u00ef\u00f0\7W\2\2\u00f0\u00f1\7w\2\2\u00f1\u00fb\7r\2\2\u00f2"+
		"\u00f3\7N\2\2\u00f3\u00fb\7x\2\2\u00f4\u00f5\7W\2\2\u00f5\u00f6\7w\2\2"+
		"\u00f6\u00fb\7u\2\2\u00f7\u00f8\7W\2\2\u00f8\u00f9\7w\2\2\u00f9\u00fb"+
		"\7q\2\2\u00fa\35\3\2\2\2\u00fa\36\3\2\2\2\u00fa \3\2\2\2\u00fa\"\3\2\2"+
		"\2\u00fa$\3\2\2\2\u00fa%\3\2\2\2\u00fa\'\3\2\2\2\u00fa)\3\2\2\2\u00fa"+
		"+\3\2\2\2\u00fa-\3\2\2\2\u00fa/\3\2\2\2\u00fa\60\3\2\2\2\u00fa\62\3\2"+
		"\2\2\u00fa\64\3\2\2\2\u00fa\65\3\2\2\2\u00fa\67\3\2\2\2\u00fa9\3\2\2\2"+
		"\u00fa;\3\2\2\2\u00fa<\3\2\2\2\u00fa>\3\2\2\2\u00fa@\3\2\2\2\u00faB\3"+
		"\2\2\2\u00faD\3\2\2\2\u00faF\3\2\2\2\u00faH\3\2\2\2\u00faJ\3\2\2\2\u00fa"+
		"L\3\2\2\2\u00faN\3\2\2\2\u00faP\3\2\2\2\u00faR\3\2\2\2\u00faT\3\2\2\2"+
		"\u00faV\3\2\2\2\u00faX\3\2\2\2\u00faZ\3\2\2\2\u00fa[\3\2\2\2\u00fa]\3"+
		"\2\2\2\u00fa_\3\2\2\2\u00faa\3\2\2\2\u00fac\3\2\2\2\u00fae\3\2\2\2\u00fa"+
		"g\3\2\2\2\u00fai\3\2\2\2\u00fak\3\2\2\2\u00fam\3\2\2\2\u00fao\3\2\2\2"+
		"\u00faq\3\2\2\2\u00fas\3\2\2\2\u00fau\3\2\2\2\u00fav\3\2\2\2\u00fax\3"+
		"\2\2\2\u00faz\3\2\2\2\u00fa|\3\2\2\2\u00fa~\3\2\2\2\u00fa\u0080\3\2\2"+
		"\2\u00fa\u0082\3\2\2\2\u00fa\u0084\3\2\2\2\u00fa\u0086\3\2\2\2\u00fa\u0088"+
		"\3\2\2\2\u00fa\u008a\3\2\2\2\u00fa\u008c\3\2\2\2\u00fa\u008e\3\2\2\2\u00fa"+
		"\u0090\3\2\2\2\u00fa\u0092\3\2\2\2\u00fa\u0094\3\2\2\2\u00fa\u0096\3\2"+
		"\2\2\u00fa\u0098\3\2\2\2\u00fa\u009a\3\2\2\2\u00fa\u009c\3\2\2\2\u00fa"+
		"\u009e\3\2\2\2\u00fa\u009f\3\2\2\2\u00fa\u00a1\3\2\2\2\u00fa\u00a3\3\2"+
		"\2\2\u00fa\u00a5\3\2\2\2\u00fa\u00a7\3\2\2\2\u00fa\u00a9\3\2\2\2\u00fa"+
		"\u00ab\3\2\2\2\u00fa\u00ad\3\2\2\2\u00fa\u00af\3\2\2\2\u00fa\u00b1\3\2"+
		"\2\2\u00fa\u00b3\3\2\2\2\u00fa\u00b5\3\2\2\2\u00fa\u00b7\3\2\2\2\u00fa"+
		"\u00b9\3\2\2\2\u00fa\u00bb\3\2\2\2\u00fa\u00bd\3\2\2\2\u00fa\u00bf\3\2"+
		"\2\2\u00fa\u00c1\3\2\2\2\u00fa\u00c2\3\2\2\2\u00fa\u00c4\3\2\2\2\u00fa"+
		"\u00c6\3\2\2\2\u00fa\u00c8\3\2\2\2\u00fa\u00ca\3\2\2\2\u00fa\u00cc\3\2"+
		"\2\2\u00fa\u00ce\3\2\2\2\u00fa\u00d0\3\2\2\2\u00fa\u00d2\3\2\2\2\u00fa"+
		"\u00d4\3\2\2\2\u00fa\u00d6\3\2\2\2\u00fa\u00d8\3\2\2\2\u00fa\u00da\3\2"+
		"\2\2\u00fa\u00dc\3\2\2\2\u00fa\u00de\3\2\2\2\u00fa\u00e0\3\2\2\2\u00fa"+
		"\u00e2\3\2\2\2\u00fa\u00e4\3\2\2\2\u00fa\u00e6\3\2\2\2\u00fa\u00e8\3\2"+
		"\2\2\u00fa\u00ea\3\2\2\2\u00fa\u00ed\3\2\2\2\u00fa\u00ef\3\2\2\2\u00fa"+
		"\u00f2\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fb\16\3\2\2"+
		"\2\u00fc\u00fe\4\62;\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\20\3\2\2\2\u0101\u0103\t\4\2\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\u0107\b\t\2\2\u0107\22\3\2\2\2\6\2\u00fa"+
		"\u00ff\u0104\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}