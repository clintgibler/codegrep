// Generated from pdn/pdn.g4 by ANTLR 4.7.1
package parsers.pdn;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pdnLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, MOVE1=8, MOVE2=9, 
		NUMBER=10, TEXT=11, STRING=12, COMMENT=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "MOVE1", "MOVE2", 
		"NUMBER", "TEXT", "STRING", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'['", "']'", "'.'", "'1/2-1/2'", "'1-0'", "'0-1'", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "MOVE1", "MOVE2", "NUMBER", 
		"TEXT", "STRING", "COMMENT", "WS"
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


	public pdnLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pdn.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20u\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\6\t9\n\t\r\t\16\t:\3\t\3\t\6\t?\n\t\r\t\16\t@\3\n\6\nD\n\n\r\n\16\nE"+
		"\3\n\3\n\6\nJ\n\n\r\n\16\nK\3\13\6\13O\n\13\r\13\16\13P\3\f\3\f\6\fU\n"+
		"\f\r\f\16\fV\3\r\3\r\3\r\3\r\7\r]\n\r\f\r\16\r`\13\r\3\r\3\r\3\16\3\16"+
		"\7\16f\n\16\f\16\16\16i\13\16\3\16\3\16\3\16\3\16\3\17\6\17p\n\17\r\17"+
		"\16\17q\3\17\3\17\3g\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\3\2\6\4\2C\\c|\6\2\62;C\\aac|\3\2$$\5\2\13\f"+
		"\17\17\"\"\2~\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2"+
		"\2\2\7#\3\2\2\2\t%\3\2\2\2\13-\3\2\2\2\r\61\3\2\2\2\17\65\3\2\2\2\218"+
		"\3\2\2\2\23C\3\2\2\2\25N\3\2\2\2\27R\3\2\2\2\31X\3\2\2\2\33c\3\2\2\2\35"+
		"o\3\2\2\2\37 \7]\2\2 \4\3\2\2\2!\"\7_\2\2\"\6\3\2\2\2#$\7\60\2\2$\b\3"+
		"\2\2\2%&\7\63\2\2&\'\7\61\2\2\'(\7\64\2\2()\7/\2\2)*\7\63\2\2*+\7\61\2"+
		"\2+,\7\64\2\2,\n\3\2\2\2-.\7\63\2\2./\7/\2\2/\60\7\62\2\2\60\f\3\2\2\2"+
		"\61\62\7\62\2\2\62\63\7/\2\2\63\64\7\63\2\2\64\16\3\2\2\2\65\66\7,\2\2"+
		"\66\20\3\2\2\2\679\4\62;\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;"+
		"<\3\2\2\2<>\7z\2\2=?\4\62;\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A"+
		"\22\3\2\2\2BD\4\62;\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2"+
		"\2GI\7/\2\2HJ\4\62;\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\24\3\2"+
		"\2\2MO\4\62;\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\26\3\2\2\2RT\t"+
		"\2\2\2SU\t\3\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\30\3\2\2\2X"+
		"^\7$\2\2YZ\7$\2\2Z]\7$\2\2[]\n\4\2\2\\Y\3\2\2\2\\[\3\2\2\2]`\3\2\2\2^"+
		"\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab\7$\2\2b\32\3\2\2\2cg\7}\2\2"+
		"df\13\2\2\2ed\3\2\2\2fi\3\2\2\2gh\3\2\2\2ge\3\2\2\2hj\3\2\2\2ig\3\2\2"+
		"\2jk\7\177\2\2kl\3\2\2\2lm\b\16\2\2m\34\3\2\2\2np\t\5\2\2on\3\2\2\2pq"+
		"\3\2\2\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2st\b\17\2\2t\36\3\2\2\2\r\2:@EK"+
		"PV\\^gq\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}