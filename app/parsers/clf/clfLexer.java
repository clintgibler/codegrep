// Generated from clf/clf.g4 by ANTLR 4.7.1
package parsers.clf;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class clfLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, DATE=4, TIME=5, TZ=6, LITERAL=7, IP=8, STRING=9, 
		EOL=10, WS=11;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "DATE", "TIME", "TZ", "LITERAL", "IP", "STRING", 
		"EOL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "':'", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "DATE", "TIME", "TZ", "LITERAL", "IP", "STRING", 
		"EOL", "WS"
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


	public clfLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "clf.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\rq\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6\5!\n\5\r\5\16\5\"\3\5\3\5\3"+
		"\5\3\5\6\5)\n\5\r\5\16\5*\3\6\6\6.\n\6\r\6\16\6/\3\6\3\6\6\6\64\n\6\r"+
		"\6\16\6\65\3\6\3\6\6\6:\n\6\r\6\16\6;\3\7\3\7\6\7@\n\7\r\7\16\7A\3\b\3"+
		"\b\7\bF\n\b\f\b\16\bI\13\b\3\b\3\b\3\t\6\tN\n\t\r\t\16\tO\3\t\3\t\6\t"+
		"T\n\t\r\t\16\tU\3\t\3\t\6\tZ\n\t\r\t\16\t[\3\t\3\t\6\t`\n\t\r\t\16\ta"+
		"\3\n\6\ne\n\n\r\n\16\nf\3\13\5\13j\n\13\3\13\3\13\3\f\3\f\3\f\3\f\2\2"+
		"\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\6\3\2\62;\3"+
		"\2$$\t\2*+/\60\62;==C\\aac|\5\2\13\f\17\17\"\"\2}\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\31\3\2\2\2\5\33\3\2"+
		"\2\2\7\35\3\2\2\2\t \3\2\2\2\13-\3\2\2\2\r=\3\2\2\2\17C\3\2\2\2\21M\3"+
		"\2\2\2\23d\3\2\2\2\25i\3\2\2\2\27m\3\2\2\2\31\32\7]\2\2\32\4\3\2\2\2\33"+
		"\34\7<\2\2\34\6\3\2\2\2\35\36\7_\2\2\36\b\3\2\2\2\37!\t\2\2\2 \37\3\2"+
		"\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3\2\2\2$%\7\61\2\2%&\5\23\n\2"+
		"&(\7\61\2\2\')\t\2\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\n\3\2"+
		"\2\2,.\t\2\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2"+
		"\61\63\7<\2\2\62\64\t\2\2\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2"+
		"\65\66\3\2\2\2\66\67\3\2\2\2\679\7<\2\28:\t\2\2\298\3\2\2\2:;\3\2\2\2"+
		";9\3\2\2\2;<\3\2\2\2<\f\3\2\2\2=?\7/\2\2>@\t\2\2\2?>\3\2\2\2@A\3\2\2\2"+
		"A?\3\2\2\2AB\3\2\2\2B\16\3\2\2\2CG\7$\2\2DF\n\3\2\2ED\3\2\2\2FI\3\2\2"+
		"\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7$\2\2K\20\3\2\2\2LN\t\2"+
		"\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QS\7\60\2\2RT\t"+
		"\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2VW\3\2\2\2WY\7\60\2\2XZ"+
		"\t\2\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]_\7\60\2"+
		"\2^`\t\2\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\22\3\2\2\2ce\t\4"+
		"\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\24\3\2\2\2hj\7\17\2\2ih"+
		"\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7\f\2\2l\26\3\2\2\2mn\t\5\2\2no\3\2\2\2"+
		"op\b\f\2\2p\30\3\2\2\2\20\2\"*/\65;AGOU[afi\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}