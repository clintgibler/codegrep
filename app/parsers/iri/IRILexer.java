// Generated from iri/IRI.g4 by ANTLR 4.7.1
package parsers.iri;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IRILexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		UCSCHAR=1, IPRIVATE=2, D0=3, D1=4, D2=5, D3=6, D4=7, D5=8, D6=9, D7=10, 
		D8=11, D9=12, A=13, B=14, C=15, D=16, E=17, F=18, G=19, H=20, I=21, J=22, 
		K=23, L=24, M=25, N=26, O=27, P=28, Q=29, R=30, S=31, T=32, U=33, V=34, 
		W=35, X=36, Y=37, Z=38, COL2=39, COL=40, DOT=41, PERCENT=42, HYPHEN=43, 
		TILDE=44, USCORE=45, EXCL=46, DOLLAR=47, AMP=48, SQUOTE=49, OPAREN=50, 
		CPAREN=51, STAR=52, PLUS=53, COMMA=54, SCOL=55, EQUALS=56, FSLASH2=57, 
		FSLASH=58, QMARK=59, HASH=60, OBRACK=61, CBRACK=62, AT=63;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"UCSCHAR", "IPRIVATE", "D0", "D1", "D2", "D3", "D4", "D5", "D6", "D7", 
		"D8", "D9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
		"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
		"COL2", "COL", "DOT", "PERCENT", "HYPHEN", "TILDE", "USCORE", "EXCL", 
		"DOLLAR", "AMP", "SQUOTE", "OPAREN", "CPAREN", "STAR", "PLUS", "COMMA", 
		"SCOL", "EQUALS", "FSLASH2", "FSLASH", "QMARK", "HASH", "OBRACK", "CBRACK", 
		"AT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'0'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", 
		"'8'", "'9'", null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "'::'", "':'", "'.'", "'%'", "'-'", "'~'", "'_'", 
		"'!'", "'$'", "'&'", "'''", "'('", "')'", "'*'", "'+'", "','", "';'", 
		"'='", "'//'", "'/'", "'?'", "'#'", "'['", "']'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "UCSCHAR", "IPRIVATE", "D0", "D1", "D2", "D3", "D4", "D5", "D6", 
		"D7", "D8", "D9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", 
		"L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", 
		"Z", "COL2", "COL", "DOT", "PERCENT", "HYPHEN", "TILDE", "USCORE", "EXCL", 
		"DOLLAR", "AMP", "SQUOTE", "OPAREN", "CPAREN", "STAR", "PLUS", "COMMA", 
		"SCOL", "EQUALS", "FSLASH2", "FSLASH", "QMARK", "HASH", "OBRACK", "CBRACK", 
		"AT"
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


	public IRILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IRI.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2A\u0101\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61"+
		"\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39"+
		"\39\3:\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\2\2A\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\3\2\34\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2J"+
		"Jjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4"+
		"\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{"+
		"{\4\2\\\\||\4\23\2\u00a2\2\ud801\2\uf902\2\ufdd1\2\ufdf2\2\ufff1\2\2\3"+
		"\uffff\3\2\4\uffff\4\2\5\uffff\5\2\6\uffff\6\2\7\uffff\7\2\b\uffff\b\2"+
		"\t\uffff\t\2\n\uffff\n\2\13\uffff\13\2\f\uffff\f\2\r\uffff\r\2\16\uffff"+
		"\16\2\17\uffff\17\u1002\20\uffff\20\5\2\ue002\2\uf901\2\2\21\uffff\21"+
		"\2\22\uffff\22\u0100\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2"+
		"\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w"+
		"\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3\u0081\3\2\2"+
		"\2\5\u0083\3\2\2\2\7\u0085\3\2\2\2\t\u0087\3\2\2\2\13\u0089\3\2\2\2\r"+
		"\u008b\3\2\2\2\17\u008d\3\2\2\2\21\u008f\3\2\2\2\23\u0091\3\2\2\2\25\u0093"+
		"\3\2\2\2\27\u0095\3\2\2\2\31\u0097\3\2\2\2\33\u0099\3\2\2\2\35\u009b\3"+
		"\2\2\2\37\u009d\3\2\2\2!\u009f\3\2\2\2#\u00a1\3\2\2\2%\u00a3\3\2\2\2\'"+
		"\u00a5\3\2\2\2)\u00a7\3\2\2\2+\u00a9\3\2\2\2-\u00ab\3\2\2\2/\u00ad\3\2"+
		"\2\2\61\u00af\3\2\2\2\63\u00b1\3\2\2\2\65\u00b3\3\2\2\2\67\u00b5\3\2\2"+
		"\29\u00b7\3\2\2\2;\u00b9\3\2\2\2=\u00bb\3\2\2\2?\u00bd\3\2\2\2A\u00bf"+
		"\3\2\2\2C\u00c1\3\2\2\2E\u00c3\3\2\2\2G\u00c5\3\2\2\2I\u00c7\3\2\2\2K"+
		"\u00c9\3\2\2\2M\u00cb\3\2\2\2O\u00cd\3\2\2\2Q\u00d0\3\2\2\2S\u00d2\3\2"+
		"\2\2U\u00d4\3\2\2\2W\u00d6\3\2\2\2Y\u00d8\3\2\2\2[\u00da\3\2\2\2]\u00dc"+
		"\3\2\2\2_\u00de\3\2\2\2a\u00e0\3\2\2\2c\u00e2\3\2\2\2e\u00e4\3\2\2\2g"+
		"\u00e6\3\2\2\2i\u00e8\3\2\2\2k\u00ea\3\2\2\2m\u00ec\3\2\2\2o\u00ee\3\2"+
		"\2\2q\u00f0\3\2\2\2s\u00f2\3\2\2\2u\u00f5\3\2\2\2w\u00f7\3\2\2\2y\u00f9"+
		"\3\2\2\2{\u00fb\3\2\2\2}\u00fd\3\2\2\2\177\u00ff\3\2\2\2\u0081\u0082\t"+
		"\34\2\2\u0082\4\3\2\2\2\u0083\u0084\t\35\2\2\u0084\6\3\2\2\2\u0085\u0086"+
		"\7\62\2\2\u0086\b\3\2\2\2\u0087\u0088\7\63\2\2\u0088\n\3\2\2\2\u0089\u008a"+
		"\7\64\2\2\u008a\f\3\2\2\2\u008b\u008c\7\65\2\2\u008c\16\3\2\2\2\u008d"+
		"\u008e\7\66\2\2\u008e\20\3\2\2\2\u008f\u0090\7\67\2\2\u0090\22\3\2\2\2"+
		"\u0091\u0092\78\2\2\u0092\24\3\2\2\2\u0093\u0094\79\2\2\u0094\26\3\2\2"+
		"\2\u0095\u0096\7:\2\2\u0096\30\3\2\2\2\u0097\u0098\7;\2\2\u0098\32\3\2"+
		"\2\2\u0099\u009a\t\2\2\2\u009a\34\3\2\2\2\u009b\u009c\t\3\2\2\u009c\36"+
		"\3\2\2\2\u009d\u009e\t\4\2\2\u009e \3\2\2\2\u009f\u00a0\t\5\2\2\u00a0"+
		"\"\3\2\2\2\u00a1\u00a2\t\6\2\2\u00a2$\3\2\2\2\u00a3\u00a4\t\7\2\2\u00a4"+
		"&\3\2\2\2\u00a5\u00a6\t\b\2\2\u00a6(\3\2\2\2\u00a7\u00a8\t\t\2\2\u00a8"+
		"*\3\2\2\2\u00a9\u00aa\t\n\2\2\u00aa,\3\2\2\2\u00ab\u00ac\t\13\2\2\u00ac"+
		".\3\2\2\2\u00ad\u00ae\t\f\2\2\u00ae\60\3\2\2\2\u00af\u00b0\t\r\2\2\u00b0"+
		"\62\3\2\2\2\u00b1\u00b2\t\16\2\2\u00b2\64\3\2\2\2\u00b3\u00b4\t\17\2\2"+
		"\u00b4\66\3\2\2\2\u00b5\u00b6\t\20\2\2\u00b68\3\2\2\2\u00b7\u00b8\t\21"+
		"\2\2\u00b8:\3\2\2\2\u00b9\u00ba\t\22\2\2\u00ba<\3\2\2\2\u00bb\u00bc\t"+
		"\23\2\2\u00bc>\3\2\2\2\u00bd\u00be\t\24\2\2\u00be@\3\2\2\2\u00bf\u00c0"+
		"\t\25\2\2\u00c0B\3\2\2\2\u00c1\u00c2\t\26\2\2\u00c2D\3\2\2\2\u00c3\u00c4"+
		"\t\27\2\2\u00c4F\3\2\2\2\u00c5\u00c6\t\30\2\2\u00c6H\3\2\2\2\u00c7\u00c8"+
		"\t\31\2\2\u00c8J\3\2\2\2\u00c9\u00ca\t\32\2\2\u00caL\3\2\2\2\u00cb\u00cc"+
		"\t\33\2\2\u00ccN\3\2\2\2\u00cd\u00ce\7<\2\2\u00ce\u00cf\7<\2\2\u00cfP"+
		"\3\2\2\2\u00d0\u00d1\7<\2\2\u00d1R\3\2\2\2\u00d2\u00d3\7\60\2\2\u00d3"+
		"T\3\2\2\2\u00d4\u00d5\7\'\2\2\u00d5V\3\2\2\2\u00d6\u00d7\7/\2\2\u00d7"+
		"X\3\2\2\2\u00d8\u00d9\7\u0080\2\2\u00d9Z\3\2\2\2\u00da\u00db\7a\2\2\u00db"+
		"\\\3\2\2\2\u00dc\u00dd\7#\2\2\u00dd^\3\2\2\2\u00de\u00df\7&\2\2\u00df"+
		"`\3\2\2\2\u00e0\u00e1\7(\2\2\u00e1b\3\2\2\2\u00e2\u00e3\7)\2\2\u00e3d"+
		"\3\2\2\2\u00e4\u00e5\7*\2\2\u00e5f\3\2\2\2\u00e6\u00e7\7+\2\2\u00e7h\3"+
		"\2\2\2\u00e8\u00e9\7,\2\2\u00e9j\3\2\2\2\u00ea\u00eb\7-\2\2\u00ebl\3\2"+
		"\2\2\u00ec\u00ed\7.\2\2\u00edn\3\2\2\2\u00ee\u00ef\7=\2\2\u00efp\3\2\2"+
		"\2\u00f0\u00f1\7?\2\2\u00f1r\3\2\2\2\u00f2\u00f3\7\61\2\2\u00f3\u00f4"+
		"\7\61\2\2\u00f4t\3\2\2\2\u00f5\u00f6\7\61\2\2\u00f6v\3\2\2\2\u00f7\u00f8"+
		"\7A\2\2\u00f8x\3\2\2\2\u00f9\u00fa\7%\2\2\u00faz\3\2\2\2\u00fb\u00fc\7"+
		"]\2\2\u00fc|\3\2\2\2\u00fd\u00fe\7_\2\2\u00fe~\3\2\2\2\u00ff\u0100\7B"+
		"\2\2\u0100\u0080\3\2\2\2\3\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}