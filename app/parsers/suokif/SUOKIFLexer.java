// Generated from suokif/SUOKIF.g4 by ANTLR 4.7.1
package parsers.suokif;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SUOKIFLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NOT=1, AND=2, OR=3, FORALL=4, EXISTS=5, WORD=6, STRING=7, VARIABLE=8, 
		NUMBER=9, WHITE=10, COMMENT=11, LPAREN=12, RPAREN=13, ASSIGN=14, GT=15, 
		LT=16, QUESTION=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NOT", "AND", "OR", "FORALL", "EXISTS", "UPPER", "LOWER", "DIGIT", "INITIALCHAR", 
		"WORDCHAR", "WORD", "STRING", "VARIABLE", "NUMBER", "EXPONENT", "WHITE", 
		"COMMENT", "LPAREN", "RPAREN", "ASSIGN", "GT", "LT", "QUESTION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'not'", "'and'", "'or'", "'forall'", "'exists'", null, null, null, 
		null, null, null, "'('", "')'", "'='", "'>'", "'<'", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NOT", "AND", "OR", "FORALL", "EXISTS", "WORD", "STRING", "VARIABLE", 
		"NUMBER", "WHITE", "COMMENT", "LPAREN", "RPAREN", "ASSIGN", "GT", "LT", 
		"QUESTION"
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


	public SUOKIFLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SUOKIF.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\5\nS\n\n\3"+
		"\13\3\13\3\13\3\13\5\13Y\n\13\3\f\3\f\7\f]\n\f\f\f\16\f`\13\f\3\r\3\r"+
		"\7\rd\n\r\f\r\16\rg\13\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16o\n\16\3\17\5"+
		"\17r\n\17\3\17\6\17u\n\17\r\17\16\17v\3\17\3\17\6\17{\n\17\r\17\16\17"+
		"|\5\17\177\n\17\3\17\5\17\u0082\n\17\3\20\3\20\5\20\u0086\n\20\3\20\6"+
		"\20\u0089\n\20\r\20\16\20\u008a\3\21\3\21\3\21\3\21\3\22\3\22\7\22\u0093"+
		"\n\22\f\22\16\22\u0096\13\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\2\17\2\21\2"+
		"\23\2\25\2\27\b\31\t\33\n\35\13\37\2!\f#\r%\16\'\17)\20+\21-\22/\23\3"+
		"\2\t\3\2C\\\3\2c|\3\2\62;\4\2//aa\4\2$$^^\5\2\13\r\17\17\"\"\4\2\f\f\17"+
		"\17\2\u00ad\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2!\3\2\2\2\2#\3"+
		"\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2"+
		"\2\2\3\61\3\2\2\2\5\65\3\2\2\2\79\3\2\2\2\t<\3\2\2\2\13C\3\2\2\2\rJ\3"+
		"\2\2\2\17L\3\2\2\2\21N\3\2\2\2\23R\3\2\2\2\25X\3\2\2\2\27Z\3\2\2\2\31"+
		"a\3\2\2\2\33n\3\2\2\2\35q\3\2\2\2\37\u0083\3\2\2\2!\u008c\3\2\2\2#\u0090"+
		"\3\2\2\2%\u0099\3\2\2\2\'\u009b\3\2\2\2)\u009d\3\2\2\2+\u009f\3\2\2\2"+
		"-\u00a1\3\2\2\2/\u00a3\3\2\2\2\61\62\7p\2\2\62\63\7q\2\2\63\64\7v\2\2"+
		"\64\4\3\2\2\2\65\66\7c\2\2\66\67\7p\2\2\678\7f\2\28\6\3\2\2\29:\7q\2\2"+
		":;\7t\2\2;\b\3\2\2\2<=\7h\2\2=>\7q\2\2>?\7t\2\2?@\7c\2\2@A\7n\2\2AB\7"+
		"n\2\2B\n\3\2\2\2CD\7g\2\2DE\7z\2\2EF\7k\2\2FG\7u\2\2GH\7v\2\2HI\7u\2\2"+
		"I\f\3\2\2\2JK\t\2\2\2K\16\3\2\2\2LM\t\3\2\2M\20\3\2\2\2NO\t\4\2\2O\22"+
		"\3\2\2\2PS\5\r\7\2QS\5\17\b\2RP\3\2\2\2RQ\3\2\2\2S\24\3\2\2\2TY\5\r\7"+
		"\2UY\5\17\b\2VY\5\21\t\2WY\t\5\2\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2"+
		"\2\2Y\26\3\2\2\2Z^\5\23\n\2[]\5\25\13\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2"+
		"\2^_\3\2\2\2_\30\3\2\2\2`^\3\2\2\2ae\7$\2\2bd\n\6\2\2cb\3\2\2\2dg\3\2"+
		"\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7$\2\2i\32\3\2\2\2jk\7"+
		"A\2\2ko\5\27\f\2lm\7B\2\2mo\5\27\f\2nj\3\2\2\2nl\3\2\2\2o\34\3\2\2\2p"+
		"r\7/\2\2qp\3\2\2\2qr\3\2\2\2rt\3\2\2\2su\5\21\t\2ts\3\2\2\2uv\3\2\2\2"+
		"vt\3\2\2\2vw\3\2\2\2w~\3\2\2\2xz\7\60\2\2y{\5\21\t\2zy\3\2\2\2{|\3\2\2"+
		"\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~x\3\2\2\2~\177\3\2\2\2\177\u0081\3"+
		"\2\2\2\u0080\u0082\5\37\20\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\36\3\2\2\2\u0083\u0085\7g\2\2\u0084\u0086\7/\2\2\u0085\u0084\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0089\5\21\t\2\u0088\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		" \3\2\2\2\u008c\u008d\t\7\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\21\2\2"+
		"\u008f\"\3\2\2\2\u0090\u0094\7=\2\2\u0091\u0093\n\b\2\2\u0092\u0091\3"+
		"\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\b\22\2\2\u0098$\3\2\2\2"+
		"\u0099\u009a\7*\2\2\u009a&\3\2\2\2\u009b\u009c\7+\2\2\u009c(\3\2\2\2\u009d"+
		"\u009e\7?\2\2\u009e*\3\2\2\2\u009f\u00a0\7@\2\2\u00a0,\3\2\2\2\u00a1\u00a2"+
		"\7>\2\2\u00a2.\3\2\2\2\u00a3\u00a4\7A\2\2\u00a4\60\3\2\2\2\20\2RX^enq"+
		"v|~\u0081\u0085\u008a\u0094\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}