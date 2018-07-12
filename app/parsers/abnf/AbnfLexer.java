// Generated from abnf/Abnf.g4 by ANTLR 4.7.1
package parsers.abnf;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AbnfLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NumberValue=9, 
		ProseValue=10, ID=11, INT=12, COMMENT=13, WS=14, STRING=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "NumberValue", 
		"BinaryValue", "DecimalValue", "HexValue", "ProseValue", "ID", "INT", 
		"COMMENT", "WS", "STRING", "BIT", "DIGIT", "HEX_DIGIT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'=/'", "'/'", "'*'", "'('", "')'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "NumberValue", "ProseValue", 
		"ID", "INT", "COMMENT", "WS", "STRING"
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


	public AbnfLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Abnf.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u00c8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\5\nC\n\n"+
		"\3\13\3\13\6\13G\n\13\r\13\16\13H\3\13\3\13\6\13M\n\13\r\13\16\13N\6\13"+
		"Q\n\13\r\13\16\13R\3\13\3\13\6\13W\n\13\r\13\16\13X\5\13[\n\13\3\f\3\f"+
		"\6\f_\n\f\r\f\16\f`\3\f\3\f\6\fe\n\f\r\f\16\ff\6\fi\n\f\r\f\16\fj\3\f"+
		"\3\f\6\fo\n\f\r\f\16\fp\5\fs\n\f\3\r\3\r\6\rw\n\r\r\r\16\rx\3\r\3\r\6"+
		"\r}\n\r\r\r\16\r~\6\r\u0081\n\r\r\r\16\r\u0082\3\r\3\r\6\r\u0087\n\r\r"+
		"\r\16\r\u0088\5\r\u008b\n\r\3\16\3\16\7\16\u008f\n\16\f\16\16\16\u0092"+
		"\13\16\3\16\3\16\3\17\3\17\7\17\u0098\n\17\f\17\16\17\u009b\13\17\3\20"+
		"\6\20\u009e\n\20\r\20\16\20\u009f\3\21\3\21\7\21\u00a4\n\21\f\21\16\21"+
		"\u00a7\13\21\3\21\5\21\u00aa\n\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\5\23\u00b8\n\23\3\23\3\23\7\23\u00bc\n\23\f\23"+
		"\16\23\u00bf\13\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\2\2\27\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2\31\2\33\f\35\r\37\16!"+
		"\17#\20%\21\'\2)\2+\2\3\2\t\3\2@@\4\2C\\c|\6\2//\62;C\\c|\4\2\f\f\17\17"+
		"\5\2\13\f\17\17\"\"\3\2$$\5\2\62;CHch\2\u00dd\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\62\3\2\2\2\t\64\3\2\2\2"+
		"\13\66\3\2\2\2\r8\3\2\2\2\17:\3\2\2\2\21<\3\2\2\2\23>\3\2\2\2\25D\3\2"+
		"\2\2\27\\\3\2\2\2\31t\3\2\2\2\33\u008c\3\2\2\2\35\u0095\3\2\2\2\37\u009d"+
		"\3\2\2\2!\u00a1\3\2\2\2#\u00af\3\2\2\2%\u00b7\3\2\2\2\'\u00c2\3\2\2\2"+
		")\u00c4\3\2\2\2+\u00c6\3\2\2\2-.\7?\2\2.\4\3\2\2\2/\60\7?\2\2\60\61\7"+
		"\61\2\2\61\6\3\2\2\2\62\63\7\61\2\2\63\b\3\2\2\2\64\65\7,\2\2\65\n\3\2"+
		"\2\2\66\67\7*\2\2\67\f\3\2\2\289\7+\2\29\16\3\2\2\2:;\7]\2\2;\20\3\2\2"+
		"\2<=\7_\2\2=\22\3\2\2\2>B\7\'\2\2?C\5\25\13\2@C\5\27\f\2AC\5\31\r\2B?"+
		"\3\2\2\2B@\3\2\2\2BA\3\2\2\2C\24\3\2\2\2DF\7d\2\2EG\5\'\24\2FE\3\2\2\2"+
		"GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IZ\3\2\2\2JL\7\60\2\2KM\5\'\24\2LK\3\2\2"+
		"\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PJ\3\2\2\2QR\3\2\2\2RP\3\2\2"+
		"\2RS\3\2\2\2S[\3\2\2\2TV\7/\2\2UW\5\'\24\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2"+
		"\2XY\3\2\2\2Y[\3\2\2\2ZP\3\2\2\2ZT\3\2\2\2Z[\3\2\2\2[\26\3\2\2\2\\^\7"+
		"f\2\2]_\5)\25\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ar\3\2\2\2bd\7"+
		"\60\2\2ce\5)\25\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hb"+
		"\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2ks\3\2\2\2ln\7/\2\2mo\5)\25\2nm"+
		"\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rh\3\2\2\2rl\3\2\2\2r"+
		"s\3\2\2\2s\30\3\2\2\2tv\7z\2\2uw\5+\26\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2"+
		"xy\3\2\2\2y\u008a\3\2\2\2z|\7\60\2\2{}\5+\26\2|{\3\2\2\2}~\3\2\2\2~|\3"+
		"\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080z\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u008b\3\2\2\2\u0084\u0086"+
		"\7/\2\2\u0085\u0087\5+\26\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0080\3\2"+
		"\2\2\u008a\u0084\3\2\2\2\u008a\u008b\3\2\2\2\u008b\32\3\2\2\2\u008c\u0090"+
		"\7>\2\2\u008d\u008f\n\2\2\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0093\u0094\7@\2\2\u0094\34\3\2\2\2\u0095\u0099\t\3\2\2\u0096\u0098"+
		"\t\4\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\36\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\4\62;"+
		"\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0 \3\2\2\2\u00a1\u00a5\7=\2\2\u00a2\u00a4\n\5\2\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\7\17\2\2\u00a9\u00a8\3"+
		"\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\7\f\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\b\21\2\2\u00ae\"\3\2\2\2\u00af\u00b0\t\6\2"+
		"\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\b\22\2\2\u00b2$\3\2\2\2\u00b3\u00b4"+
		"\7\'\2\2\u00b4\u00b8\7u\2\2\u00b5\u00b6\7\'\2\2\u00b6\u00b8\7k\2\2\u00b7"+
		"\u00b3\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00bd\7$\2\2\u00ba\u00bc\n\7\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7$\2\2\u00c1&\3\2\2\2\u00c2\u00c3"+
		"\4\62\63\2\u00c3(\3\2\2\2\u00c4\u00c5\4\62;\2\u00c5*\3\2\2\2\u00c6\u00c7"+
		"\t\b\2\2\u00c7,\3\2\2\2\32\2BHNRXZ`fjprx~\u0082\u0088\u008a\u0090\u0099"+
		"\u009f\u00a5\u00a9\u00b7\u00bd\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}