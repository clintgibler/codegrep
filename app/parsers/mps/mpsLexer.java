// Generated from mps/mps.g4 by ANTLR 4.7.1
package parsers.mps;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mpsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAMEINDICATORCARD=1, ROWINDICATORCARD=2, COLUMNINDICATORCARD=3, RHSINDICATORCARD=4, 
		RANGESINDICATORCARD=5, BOUNDSINDICATORCARD=6, ENDATAINDICATORCARD=7, KEYWORDMARKER=8, 
		STARTMARKER=9, ENDMARKER=10, KEYWORDFREE=11, BOUNDKEY=12, ROWTYPE=13, 
		IDENTIFIER=14, NUMERICALVALUE=15, WS=16, LINE_COMMENT=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NAMEINDICATORCARD", "ROWINDICATORCARD", "COLUMNINDICATORCARD", "RHSINDICATORCARD", 
		"RANGESINDICATORCARD", "BOUNDSINDICATORCARD", "ENDATAINDICATORCARD", "KEYWORDMARKER", 
		"STARTMARKER", "ENDMARKER", "KEYWORDFREE", "BOUNDKEY", "ROWTYPE", "IDENTIFIER", 
		"NUMERICALVALUE", "WS", "LINE_COMMENT", "CHARACTER", "LETTER", "DIGIT", 
		"DIGITS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'NAME'", "'ROWS'", "'COLUMNS'", "'RHS'", "'RANGES'", "'BOUNDS'", 
		"'ENDATA'", "''MARKER''", "''INTORG''", "''INTEND''", "'FREE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NAMEINDICATORCARD", "ROWINDICATORCARD", "COLUMNINDICATORCARD", 
		"RHSINDICATORCARD", "RANGESINDICATORCARD", "BOUNDSINDICATORCARD", "ENDATAINDICATORCARD", 
		"KEYWORDMARKER", "STARTMARKER", "ENDMARKER", "KEYWORDFREE", "BOUNDKEY", 
		"ROWTYPE", "IDENTIFIER", "NUMERICALVALUE", "WS", "LINE_COMMENT"
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


	public mpsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "mps.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00bf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\5\r\u008d\n\r\3\16\3\16\3\17\3\17\7\17\u0093\n\17\f\17"+
		"\16\17\u0096\13\17\3\20\3\20\7\20\u009a\n\20\f\20\16\20\u009d\13\20\3"+
		"\21\6\21\u00a0\n\21\r\21\16\21\u00a1\3\21\3\21\3\22\3\22\7\22\u00a8\n"+
		"\22\f\22\16\22\u00ab\13\22\3\22\5\22\u00ae\n\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\5\23\u00b6\n\23\3\24\3\24\3\25\3\25\3\26\3\26\5\26\u00be\n\26"+
		"\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\2\'\2)\2+\2\3\2\t\6\2GGIINNPP\5\2\13\f\16\17\"\""+
		"\4\2&&,,\4\2\f\f\17\17\b\2%%*+\61\61B\\aac|\4\2-\60\62;\4\2FGfg\2\u00ca"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\3-\3\2\2\2\5\62\3\2\2\2\7\67\3\2\2\2\t?\3\2\2\2\13C\3\2\2\2\rJ\3"+
		"\2\2\2\17Q\3\2\2\2\21X\3\2\2\2\23a\3\2\2\2\25j\3\2\2\2\27s\3\2\2\2\31"+
		"\u008c\3\2\2\2\33\u008e\3\2\2\2\35\u0090\3\2\2\2\37\u0097\3\2\2\2!\u009f"+
		"\3\2\2\2#\u00a5\3\2\2\2%\u00b5\3\2\2\2\'\u00b7\3\2\2\2)\u00b9\3\2\2\2"+
		"+\u00bd\3\2\2\2-.\7P\2\2./\7C\2\2/\60\7O\2\2\60\61\7G\2\2\61\4\3\2\2\2"+
		"\62\63\7T\2\2\63\64\7Q\2\2\64\65\7Y\2\2\65\66\7U\2\2\66\6\3\2\2\2\678"+
		"\7E\2\289\7Q\2\29:\7N\2\2:;\7W\2\2;<\7O\2\2<=\7P\2\2=>\7U\2\2>\b\3\2\2"+
		"\2?@\7T\2\2@A\7J\2\2AB\7U\2\2B\n\3\2\2\2CD\7T\2\2DE\7C\2\2EF\7P\2\2FG"+
		"\7I\2\2GH\7G\2\2HI\7U\2\2I\f\3\2\2\2JK\7D\2\2KL\7Q\2\2LM\7W\2\2MN\7P\2"+
		"\2NO\7F\2\2OP\7U\2\2P\16\3\2\2\2QR\7G\2\2RS\7P\2\2ST\7F\2\2TU\7C\2\2U"+
		"V\7V\2\2VW\7C\2\2W\20\3\2\2\2XY\7)\2\2YZ\7O\2\2Z[\7C\2\2[\\\7T\2\2\\]"+
		"\7M\2\2]^\7G\2\2^_\7T\2\2_`\7)\2\2`\22\3\2\2\2ab\7)\2\2bc\7K\2\2cd\7P"+
		"\2\2de\7V\2\2ef\7Q\2\2fg\7T\2\2gh\7I\2\2hi\7)\2\2i\24\3\2\2\2jk\7)\2\2"+
		"kl\7K\2\2lm\7P\2\2mn\7V\2\2no\7G\2\2op\7P\2\2pq\7F\2\2qr\7)\2\2r\26\3"+
		"\2\2\2st\7H\2\2tu\7T\2\2uv\7G\2\2vw\7G\2\2w\30\3\2\2\2xy\7W\2\2y\u008d"+
		"\7R\2\2z{\7N\2\2{\u008d\7Q\2\2|}\7H\2\2}\u008d\7Z\2\2~\177\7N\2\2\177"+
		"\u008d\7K\2\2\u0080\u0081\7W\2\2\u0081\u008d\7K\2\2\u0082\u0083\7U\2\2"+
		"\u0083\u008d\7E\2\2\u0084\u0085\7H\2\2\u0085\u008d\7T\2\2\u0086\u0087"+
		"\7D\2\2\u0087\u008d\7X\2\2\u0088\u0089\7O\2\2\u0089\u008d\7K\2\2\u008a"+
		"\u008b\7R\2\2\u008b\u008d\7N\2\2\u008cx\3\2\2\2\u008cz\3\2\2\2\u008c|"+
		"\3\2\2\2\u008c~\3\2\2\2\u008c\u0080\3\2\2\2\u008c\u0082\3\2\2\2\u008c"+
		"\u0084\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\32\3\2\2\2\u008e\u008f\t\2\2\2\u008f\34\3\2\2\2\u0090\u0094"+
		"\5\'\24\2\u0091\u0093\5%\23\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2"+
		"\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\36\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0097\u009b\5)\25\2\u0098\u009a\5+\26\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c \3\2\2\2"+
		"\u009d\u009b\3\2\2\2\u009e\u00a0\t\3\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\b\21\2\2\u00a4\"\3\2\2\2\u00a5\u00a9\t\4\2\2\u00a6\u00a8\n\5\2"+
		"\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa"+
		"\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae\7\17\2\2"+
		"\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0"+
		"\7\f\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\22\2\2\u00b2$\3\2\2\2\u00b3"+
		"\u00b6\5\'\24\2\u00b4\u00b6\5)\25\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3"+
		"\2\2\2\u00b6&\3\2\2\2\u00b7\u00b8\t\6\2\2\u00b8(\3\2\2\2\u00b9\u00ba\t"+
		"\7\2\2\u00ba*\3\2\2\2\u00bb\u00be\5)\25\2\u00bc\u00be\t\b\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be,\3\2\2\2\13\2\u008c\u0094\u009b\u00a1"+
		"\u00a9\u00ad\u00b5\u00bd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}