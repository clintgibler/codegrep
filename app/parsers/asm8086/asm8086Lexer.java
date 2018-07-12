// Generated from asm8086/asm8086.g4 by ANTLR 4.7.1
package parsers.asm8086;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class asm8086Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BYTE=15, WORD=16, DWORD=17, 
		DSEG=18, CSEG=19, INCLUDE=20, TITLE=21, END=22, ORG=23, ENDIF=24, IF=25, 
		EQU=26, DW=27, DB=28, DD=29, PTR=30, NOT=31, OFFSET=32, RW=33, RB=34, 
		RS=35, LENGTH=36, COMMENT=37, REGISTER=38, OPCODE=39, REP=40, DOLLAR=41, 
		SIGN=42, NAME=43, NUMBER=44, STRING=45, EOL=46, WS=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "BYTE", "WORD", "DWORD", "DSEG", 
		"CSEG", "INCLUDE", "TITLE", "END", "ORG", "ENDIF", "IF", "EQU", "DW", 
		"DB", "DD", "PTR", "NOT", "OFFSET", "RW", "RB", "RS", "LENGTH", "COMMENT", 
		"REGISTER", "OPCODE", "REP", "DOLLAR", "SIGN", "NAME", "NUMBER", "STRING", 
		"EOL", "WS", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
		"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", "':'", "'.'", "'('", "')'", "'eq'", "'ne'", "','", "'*'", 
		"'/'", "'mod'", "'and'", "'['", "']'", null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "BYTE", "WORD", "DWORD", "DSEG", "CSEG", "INCLUDE", 
		"TITLE", "END", "ORG", "ENDIF", "IF", "EQU", "DW", "DB", "DD", "PTR", 
		"NOT", "OFFSET", "RW", "RB", "RS", "LENGTH", "COMMENT", "REGISTER", "OPCODE", 
		"REP", "DOLLAR", "SIGN", "NAME", "NUMBER", "STRING", "EOL", "WS"
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


	public asm8086Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "asm8086.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u03e4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\7&\u011f\n&\f&\16"+
		"&\u0122\13&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0165"+
		"\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u036e\n(\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u038a"+
		"\n)\3*\3*\3+\3+\3,\3,\7,\u0392\n,\f,\16,\u0395\13,\3-\6-\u0398\n-\r-\16"+
		"-\u0399\3-\5-\u039d\n-\3.\3.\7.\u03a1\n.\f.\16.\u03a4\13.\3.\3.\3/\6/"+
		"\u03a9\n/\r/\16/\u03aa\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3"+
		"<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3"+
		"G\3H\3H\3I\3I\3J\3J\2\2K\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\2c"+
		"\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085"+
		"\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\3\2#\4\2\f"+
		"\f\17\17\4\2--//\5\2\60\60C\\c|\b\2$$\60\60\62;C\\aac|\5\2\62;CHch\4\2"+
		"JJjj\3\2))\4\2\13\13\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2H"+
		"Hhh\4\2IIii\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4"+
		"\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZz"+
		"z\4\2[[{{\4\2\\\\||\2\u045c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\3\u0095\3\2\2\2\5\u0097\3\2\2\2\7\u0099\3\2\2\2"+
		"\t\u009b\3\2\2\2\13\u009d\3\2\2\2\r\u009f\3\2\2\2\17\u00a2\3\2\2\2\21"+
		"\u00a5\3\2\2\2\23\u00a7\3\2\2\2\25\u00a9\3\2\2\2\27\u00ab\3\2\2\2\31\u00af"+
		"\3\2\2\2\33\u00b3\3\2\2\2\35\u00b5\3\2\2\2\37\u00b7\3\2\2\2!\u00bc\3\2"+
		"\2\2#\u00c1\3\2\2\2%\u00c7\3\2\2\2\'\u00cc\3\2\2\2)\u00d1\3\2\2\2+\u00d9"+
		"\3\2\2\2-\u00df\3\2\2\2/\u00e3\3\2\2\2\61\u00e7\3\2\2\2\63\u00ed\3\2\2"+
		"\2\65\u00f0\3\2\2\2\67\u00f4\3\2\2\29\u00f7\3\2\2\2;\u00fa\3\2\2\2=\u00fd"+
		"\3\2\2\2?\u0101\3\2\2\2A\u0105\3\2\2\2C\u010c\3\2\2\2E\u010f\3\2\2\2G"+
		"\u0112\3\2\2\2I\u0115\3\2\2\2K\u011c\3\2\2\2M\u0164\3\2\2\2O\u036d\3\2"+
		"\2\2Q\u0389\3\2\2\2S\u038b\3\2\2\2U\u038d\3\2\2\2W\u038f\3\2\2\2Y\u0397"+
		"\3\2\2\2[\u039e\3\2\2\2]\u03a8\3\2\2\2_\u03ac\3\2\2\2a\u03b0\3\2\2\2c"+
		"\u03b2\3\2\2\2e\u03b4\3\2\2\2g\u03b6\3\2\2\2i\u03b8\3\2\2\2k\u03ba\3\2"+
		"\2\2m\u03bc\3\2\2\2o\u03be\3\2\2\2q\u03c0\3\2\2\2s\u03c2\3\2\2\2u\u03c4"+
		"\3\2\2\2w\u03c6\3\2\2\2y\u03c8\3\2\2\2{\u03ca\3\2\2\2}\u03cc\3\2\2\2\177"+
		"\u03ce\3\2\2\2\u0081\u03d0\3\2\2\2\u0083\u03d2\3\2\2\2\u0085\u03d4\3\2"+
		"\2\2\u0087\u03d6\3\2\2\2\u0089\u03d8\3\2\2\2\u008b\u03da\3\2\2\2\u008d"+
		"\u03dc\3\2\2\2\u008f\u03de\3\2\2\2\u0091\u03e0\3\2\2\2\u0093\u03e2\3\2"+
		"\2\2\u0095\u0096\7#\2\2\u0096\4\3\2\2\2\u0097\u0098\7<\2\2\u0098\6\3\2"+
		"\2\2\u0099\u009a\7\60\2\2\u009a\b\3\2\2\2\u009b\u009c\7*\2\2\u009c\n\3"+
		"\2\2\2\u009d\u009e\7+\2\2\u009e\f\3\2\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1"+
		"\7s\2\2\u00a1\16\3\2\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7g\2\2\u00a4\20"+
		"\3\2\2\2\u00a5\u00a6\7.\2\2\u00a6\22\3\2\2\2\u00a7\u00a8\7,\2\2\u00a8"+
		"\24\3\2\2\2\u00a9\u00aa\7\61\2\2\u00aa\26\3\2\2\2\u00ab\u00ac\7o\2\2\u00ac"+
		"\u00ad\7q\2\2\u00ad\u00ae\7f\2\2\u00ae\30\3\2\2\2\u00af\u00b0\7c\2\2\u00b0"+
		"\u00b1\7p\2\2\u00b1\u00b2\7f\2\2\u00b2\32\3\2\2\2\u00b3\u00b4\7]\2\2\u00b4"+
		"\34\3\2\2\2\u00b5\u00b6\7_\2\2\u00b6\36\3\2\2\2\u00b7\u00b8\5c\62\2\u00b8"+
		"\u00b9\5\u0091I\2\u00b9\u00ba\5\u0087D\2\u00ba\u00bb\5i\65\2\u00bb \3"+
		"\2\2\2\u00bc\u00bd\5\u008dG\2\u00bd\u00be\5}?\2\u00be\u00bf\5\u0083B\2"+
		"\u00bf\u00c0\5g\64\2\u00c0\"\3\2\2\2\u00c1\u00c2\5g\64\2\u00c2\u00c3\5"+
		"\u008dG\2\u00c3\u00c4\5}?\2\u00c4\u00c5\5\u0083B\2\u00c5\u00c6\5g\64\2"+
		"\u00c6$\3\2\2\2\u00c7\u00c8\5g\64\2\u00c8\u00c9\5\u0085C\2\u00c9\u00ca"+
		"\5i\65\2\u00ca\u00cb\5m\67\2\u00cb&\3\2\2\2\u00cc\u00cd\5e\63\2\u00cd"+
		"\u00ce\5\u0085C\2\u00ce\u00cf\5i\65\2\u00cf\u00d0\5m\67\2\u00d0(\3\2\2"+
		"\2\u00d1\u00d2\5q9\2\u00d2\u00d3\5{>\2\u00d3\u00d4\5e\63\2\u00d4\u00d5"+
		"\5w<\2\u00d5\u00d6\5\u0089E\2\u00d6\u00d7\5g\64\2\u00d7\u00d8\5i\65\2"+
		"\u00d8*\3\2\2\2\u00d9\u00da\5\u0087D\2\u00da\u00db\5q9\2\u00db\u00dc\5"+
		"\u0087D\2\u00dc\u00dd\5w<\2\u00dd\u00de\5i\65\2\u00de,\3\2\2\2\u00df\u00e0"+
		"\5i\65\2\u00e0\u00e1\5{>\2\u00e1\u00e2\5g\64\2\u00e2.\3\2\2\2\u00e3\u00e4"+
		"\5}?\2\u00e4\u00e5\5\u0083B\2\u00e5\u00e6\5m\67\2\u00e6\60\3\2\2\2\u00e7"+
		"\u00e8\5i\65\2\u00e8\u00e9\5{>\2\u00e9\u00ea\5g\64\2\u00ea\u00eb\5q9\2"+
		"\u00eb\u00ec\5k\66\2\u00ec\62\3\2\2\2\u00ed\u00ee\5q9\2\u00ee\u00ef\5"+
		"k\66\2\u00ef\64\3\2\2\2\u00f0\u00f1\5i\65\2\u00f1\u00f2\5\u0081A\2\u00f2"+
		"\u00f3\5\u0089E\2\u00f3\66\3\2\2\2\u00f4\u00f5\5g\64\2\u00f5\u00f6\5\u008d"+
		"G\2\u00f68\3\2\2\2\u00f7\u00f8\5g\64\2\u00f8\u00f9\5c\62\2\u00f9:\3\2"+
		"\2\2\u00fa\u00fb\5g\64\2\u00fb\u00fc\5g\64\2\u00fc<\3\2\2\2\u00fd\u00fe"+
		"\5\177@\2\u00fe\u00ff\5\u0087D\2\u00ff\u0100\5\u0083B\2\u0100>\3\2\2\2"+
		"\u0101\u0102\5{>\2\u0102\u0103\5}?\2\u0103\u0104\5\u0087D\2\u0104@\3\2"+
		"\2\2\u0105\u0106\5}?\2\u0106\u0107\5k\66\2\u0107\u0108\5k\66\2\u0108\u0109"+
		"\5\u0085C\2\u0109\u010a\5i\65\2\u010a\u010b\5\u0087D\2\u010bB\3\2\2\2"+
		"\u010c\u010d\5\u0083B\2\u010d\u010e\5\u008dG\2\u010eD\3\2\2\2\u010f\u0110"+
		"\5\u0083B\2\u0110\u0111\5c\62\2\u0111F\3\2\2\2\u0112\u0113\5\u0083B\2"+
		"\u0113\u0114\5\u0085C\2\u0114H\3\2\2\2\u0115\u0116\5w<\2\u0116\u0117\5"+
		"i\65\2\u0117\u0118\5{>\2\u0118\u0119\5m\67\2\u0119\u011a\5\u0087D\2\u011a"+
		"\u011b\5o8\2\u011bJ\3\2\2\2\u011c\u0120\7=\2\2\u011d\u011f\n\2\2\2\u011e"+
		"\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\b&\2\2\u0124"+
		"L\3\2\2\2\u0125\u0126\5a\61\2\u0126\u0127\5o8\2\u0127\u0165\3\2\2\2\u0128"+
		"\u0129\5a\61\2\u0129\u012a\5w<\2\u012a\u0165\3\2\2\2\u012b\u012c\5c\62"+
		"\2\u012c\u012d\5o8\2\u012d\u0165\3\2\2\2\u012e\u012f\5c\62\2\u012f\u0130"+
		"\5w<\2\u0130\u0165\3\2\2\2\u0131\u0132\5e\63\2\u0132\u0133\5o8\2\u0133"+
		"\u0165\3\2\2\2\u0134\u0135\5e\63\2\u0135\u0136\5w<\2\u0136\u0165\3\2\2"+
		"\2\u0137\u0138\5g\64\2\u0138\u0139\5o8\2\u0139\u0165\3\2\2\2\u013a\u013b"+
		"\5g\64\2\u013b\u013c\5w<\2\u013c\u0165\3\2\2\2\u013d\u013e\5a\61\2\u013e"+
		"\u013f\5\u008fH\2\u013f\u0165\3\2\2\2\u0140\u0141\5c\62\2\u0141\u0142"+
		"\5\u008fH\2\u0142\u0165\3\2\2\2\u0143\u0144\5e\63\2\u0144\u0145\5\u008f"+
		"H\2\u0145\u0165\3\2\2\2\u0146\u0147\5g\64\2\u0147\u0148\5\u008fH\2\u0148"+
		"\u0165\3\2\2\2\u0149\u014a\5e\63\2\u014a\u014b\5q9\2\u014b\u0165\3\2\2"+
		"\2\u014c\u014d\5g\64\2\u014d\u014e\5q9\2\u014e\u0165\3\2\2\2\u014f\u0150"+
		"\5c\62\2\u0150\u0151\5\177@\2\u0151\u0165\3\2\2\2\u0152\u0153\5\u0085"+
		"C\2\u0153\u0154\5\177@\2\u0154\u0165\3\2\2\2\u0155\u0156\5q9\2\u0156\u0157"+
		"\5\177@\2\u0157\u0165\3\2\2\2\u0158\u0159\5e\63\2\u0159\u015a\5\u0085"+
		"C\2\u015a\u0165\3\2\2\2\u015b\u015c\5g\64\2\u015c\u015d\5\u0085C\2\u015d"+
		"\u0165\3\2\2\2\u015e\u015f\5i\65\2\u015f\u0160\5\u0085C\2\u0160\u0165"+
		"\3\2\2\2\u0161\u0162\5\u0085C\2\u0162\u0163\5\u0085C\2\u0163\u0165\3\2"+
		"\2\2\u0164\u0125\3\2\2\2\u0164\u0128\3\2\2\2\u0164\u012b\3\2\2\2\u0164"+
		"\u012e\3\2\2\2\u0164\u0131\3\2\2\2\u0164\u0134\3\2\2\2\u0164\u0137\3\2"+
		"\2\2\u0164\u013a\3\2\2\2\u0164\u013d\3\2\2\2\u0164\u0140\3\2\2\2\u0164"+
		"\u0143\3\2\2\2\u0164\u0146\3\2\2\2\u0164\u0149\3\2\2\2\u0164\u014c\3\2"+
		"\2\2\u0164\u014f\3\2\2\2\u0164\u0152\3\2\2\2\u0164\u0155\3\2\2\2\u0164"+
		"\u0158\3\2\2\2\u0164\u015b\3\2\2\2\u0164\u015e\3\2\2\2\u0164\u0161\3\2"+
		"\2\2\u0165N\3\2\2\2\u0166\u0167\5a\61\2\u0167\u0168\5a\61\2\u0168\u0169"+
		"\5a\61\2\u0169\u036e\3\2\2\2\u016a\u016b\5a\61\2\u016b\u016c\5a\61\2\u016c"+
		"\u016d\5g\64\2\u016d\u036e\3\2\2\2\u016e\u016f\5a\61\2\u016f\u0170\5a"+
		"\61\2\u0170\u0171\5y=\2\u0171\u036e\3\2\2\2\u0172\u0173\5a\61\2\u0173"+
		"\u0174\5a\61\2\u0174\u0175\5\u0085C\2\u0175\u036e\3\2\2\2\u0176\u0177"+
		"\5a\61\2\u0177\u0178\5g\64\2\u0178\u0179\5e\63\2\u0179\u036e\3\2\2\2\u017a"+
		"\u017b\5a\61\2\u017b\u017c\5g\64\2\u017c\u017d\5g\64\2\u017d\u036e\3\2"+
		"\2\2\u017e\u017f\5a\61\2\u017f\u0180\5{>\2\u0180\u0181\5g\64\2\u0181\u036e"+
		"\3\2\2\2\u0182\u0183\5e\63\2\u0183\u0184\5a\61\2\u0184\u0185\5w<\2\u0185"+
		"\u0186\5w<\2\u0186\u036e\3\2\2\2\u0187\u0188\5e\63\2\u0188\u0189\5c\62"+
		"\2\u0189\u018a\5\u008dG\2\u018a\u036e\3\2\2\2\u018b\u018c\5e\63\2\u018c"+
		"\u018d\5w<\2\u018d\u018e\5e\63\2\u018e\u036e\3\2\2\2\u018f\u0190\5e\63"+
		"\2\u0190\u0191\5w<\2\u0191\u0192\5g\64\2\u0192\u036e\3\2\2\2\u0193\u0194"+
		"\5e\63\2\u0194\u0195\5w<\2\u0195\u0196\5q9\2\u0196\u036e\3\2\2\2\u0197"+
		"\u0198\5e\63\2\u0198\u0199\5y=\2\u0199\u019a\5e\63\2\u019a\u036e\3\2\2"+
		"\2\u019b\u019c\5e\63\2\u019c\u019d\5y=\2\u019d\u019e\5\177@\2\u019e\u036e"+
		"\3\2\2\2\u019f\u01a0\5e\63\2\u01a0\u01a1\5y=\2\u01a1\u01a2\5\177@\2\u01a2"+
		"\u01a3\5\u0085C\2\u01a3\u01a4\5c\62\2\u01a4\u036e\3\2\2\2\u01a5\u01a6"+
		"\5e\63\2\u01a6\u01a7\5y=\2\u01a7\u01a8\5\177@\2\u01a8\u01a9\5\u0085C\2"+
		"\u01a9\u01aa\5\u008dG\2\u01aa\u036e\3\2\2\2\u01ab\u01ac\5e\63\2\u01ac"+
		"\u01ad\5\u008dG\2\u01ad\u01ae\5g\64\2\u01ae\u036e\3\2\2\2\u01af\u01b0"+
		"\5g\64\2\u01b0\u01b1\5a\61\2\u01b1\u01b2\5a\61\2\u01b2\u036e\3\2\2\2\u01b3"+
		"\u01b4\5g\64\2\u01b4\u01b5\5a\61\2\u01b5\u01b6\5\u0085C\2\u01b6\u036e"+
		"\3\2\2\2\u01b7\u01b8\5g\64\2\u01b8\u01b9\5i\65\2\u01b9\u01ba\5e\63\2\u01ba"+
		"\u036e\3\2\2\2\u01bb\u01bc\5g\64\2\u01bc\u01bd\5q9\2\u01bd\u01be\5\u008b"+
		"F\2\u01be\u036e\3\2\2\2\u01bf\u01c0\5i\65\2\u01c0\u01c1\5\u0085C\2\u01c1"+
		"\u01c2\5e\63\2\u01c2\u036e\3\2\2\2\u01c3\u01c4\5o8\2\u01c4\u01c5\5w<\2"+
		"\u01c5\u01c6\5\u0087D\2\u01c6\u036e\3\2\2\2\u01c7\u01c8\5q9\2\u01c8\u01c9"+
		"\5g\64\2\u01c9\u01ca\5q9\2\u01ca\u01cb\5\u008bF\2\u01cb\u036e\3\2\2\2"+
		"\u01cc\u01cd\5q9\2\u01cd\u01ce\5y=\2\u01ce\u01cf\5\u0089E\2\u01cf\u01d0"+
		"\5w<\2\u01d0\u036e\3\2\2\2\u01d1\u01d2\5q9\2\u01d2\u01d3\5{>\2\u01d3\u036e"+
		"\3\2\2\2\u01d4\u01d5\5q9\2\u01d5\u01d6\5{>\2\u01d6\u01d7\5e\63\2\u01d7"+
		"\u036e\3\2\2\2\u01d8\u01d9\5q9\2\u01d9\u01da\5{>\2\u01da\u01db\5\u0087"+
		"D\2\u01db\u036e\3\2\2\2\u01dc\u01dd\5q9\2\u01dd\u01de\5{>\2\u01de\u01df"+
		"\5\u0087D\2\u01df\u01e0\5}?\2\u01e0\u036e\3\2\2\2\u01e1\u01e2\5q9\2\u01e2"+
		"\u01e3\5\u0083B\2\u01e3\u01e4\5i\65\2\u01e4\u01e5\5\u0087D\2\u01e5\u036e"+
		"\3\2\2\2\u01e6\u01e7\5s:\2\u01e7\u01e8\5a\61\2\u01e8\u036e\3\2\2\2\u01e9"+
		"\u01ea\5s:\2\u01ea\u01eb\5a\61\2\u01eb\u01ec\5i\65\2\u01ec\u036e\3\2\2"+
		"\2\u01ed\u01ee\5s:\2\u01ee\u01ef\5c\62\2\u01ef\u036e\3\2\2\2\u01f0\u01f1"+
		"\5s:\2\u01f1\u01f2\5c\62\2\u01f2\u01f3\5i\65\2\u01f3\u036e\3\2\2\2\u01f4"+
		"\u01f5\5s:\2\u01f5\u01f6\5e\63\2\u01f6\u036e\3\2\2\2\u01f7\u01f8\5s:\2"+
		"\u01f8\u01f9\5i\65\2\u01f9\u036e\3\2\2\2\u01fa\u01fb\5s:\2\u01fb\u01fc"+
		"\5m\67\2\u01fc\u036e\3\2\2\2\u01fd\u01fe\5s:\2\u01fe\u01ff\5m\67\2\u01ff"+
		"\u0200\5i\65\2\u0200\u036e\3\2\2\2\u0201\u0202\5s:\2\u0202\u0203\5w<\2"+
		"\u0203\u036e\3\2\2\2\u0204\u0205\5s:\2\u0205\u0206\5w<\2\u0206\u0207\5"+
		"i\65\2\u0207\u036e\3\2\2\2\u0208\u0209\5s:\2\u0209\u020a\5{>\2\u020a\u020b"+
		"\5a\61\2\u020b\u036e\3\2\2\2\u020c\u020d\5s:\2\u020d\u020e\5{>\2\u020e"+
		"\u020f\5a\61\2\u020f\u0210\5i\65\2\u0210\u036e\3\2\2\2\u0211\u0212\5s"+
		":\2\u0212\u0213\5{>\2\u0213\u0214\5c\62\2\u0214\u036e\3\2\2\2\u0215\u0216"+
		"\5s:\2\u0216\u0217\5{>\2\u0217\u0218\5c\62\2\u0218\u0219\5i\65\2\u0219"+
		"\u036e\3\2\2\2\u021a\u021b\5s:\2\u021b\u021c\5{>\2\u021c\u021d\5e\63\2"+
		"\u021d\u036e\3\2\2\2\u021e\u021f\5s:\2\u021f\u0220\5{>\2\u0220\u0221\5"+
		"i\65\2\u0221\u036e\3\2\2\2\u0222\u0223\5s:\2\u0223\u0224\5{>\2\u0224\u0225"+
		"\5m\67\2\u0225\u036e\3\2\2\2\u0226\u0227\5s:\2\u0227\u0228\5{>\2\u0228"+
		"\u0229\5m\67\2\u0229\u022a\5i\65\2\u022a\u036e\3\2\2\2\u022b\u022c\5s"+
		":\2\u022c\u022d\5{>\2\u022d\u022e\5w<\2\u022e\u036e\3\2\2\2\u022f\u0230"+
		"\5s:\2\u0230\u0231\5{>\2\u0231\u0232\5w<\2\u0232\u0233\5i\65\2\u0233\u036e"+
		"\3\2\2\2\u0234\u0235\5s:\2\u0235\u0236\5{>\2\u0236\u0237\5}?\2\u0237\u036e"+
		"\3\2\2\2\u0238\u0239\5s:\2\u0239\u023a\5{>\2\u023a\u023b\5\177@\2\u023b"+
		"\u036e\3\2\2\2\u023c\u023d\5s:\2\u023d\u023e\5{>\2\u023e\u023f\5\u0085"+
		"C\2\u023f\u036e\3\2\2\2\u0240\u0241\5s:\2\u0241\u0242\5{>\2\u0242\u0243"+
		"\5\u0093J\2\u0243\u036e\3\2\2\2\u0244\u0245\5s:\2\u0245\u0246\5}?\2\u0246"+
		"\u036e\3\2\2\2\u0247\u0248\5s:\2\u0248\u0249\5\177@\2\u0249\u036e\3\2"+
		"\2\2\u024a\u024b\5s:\2\u024b\u024c\5\177@\2\u024c\u024d\5i\65\2\u024d"+
		"\u036e\3\2\2\2\u024e\u024f\5s:\2\u024f\u0250\5\177@\2\u0250\u0251\5}?"+
		"\2\u0251\u036e\3\2\2\2\u0252\u0253\5s:\2\u0253\u0254\5\u0085C\2\u0254"+
		"\u036e\3\2\2\2\u0255\u0256\5s:\2\u0256\u0257\5\u0093J\2\u0257\u036e\3"+
		"\2\2\2\u0258\u0259\5s:\2\u0259\u025a\5e\63\2\u025a\u025b\5\u008fH\2\u025b"+
		"\u025c\5\u0093J\2\u025c\u036e\3\2\2\2\u025d\u025e\5s:\2\u025e\u025f\5"+
		"y=\2\u025f\u0260\5\177@\2\u0260\u036e\3\2\2\2\u0261\u0262\5s:\2\u0262"+
		"\u0263\5y=\2\u0263\u0264\5\177@\2\u0264\u0265\5\u0085C\2\u0265\u036e\3"+
		"\2\2\2\u0266\u0267\5s:\2\u0267\u0268\5y=\2\u0268\u0269\5\177@\2\u0269"+
		"\u026a\5k\66\2\u026a\u036e\3\2\2\2\u026b\u026c\5w<\2\u026c\u026d\5a\61"+
		"\2\u026d\u026e\5o8\2\u026e\u026f\5k\66\2\u026f\u036e\3\2\2\2\u0270\u0271"+
		"\5w<\2\u0271\u0272\5g\64\2\u0272\u0273\5\u0085C\2\u0273\u036e\3\2\2\2"+
		"\u0274\u0275\5w<\2\u0275\u0276\5i\65\2\u0276\u0277\5a\61\2\u0277\u036e"+
		"\3\2\2\2\u0278\u0279\5w<\2\u0279\u027a\5i\65\2\u027a\u027b\5\u0085C\2"+
		"\u027b\u036e\3\2\2\2\u027c\u027d\5w<\2\u027d\u027e\5}?\2\u027e\u027f\5"+
		"e\63\2\u027f\u0280\5u;\2\u0280\u036e\3\2\2\2\u0281\u0282\5w<\2\u0282\u0283"+
		"\5}?\2\u0283\u0284\5g\64\2\u0284\u0285\5\u0085C\2\u0285\u036e\3\2\2\2"+
		"\u0286\u0287\5w<\2\u0287\u0288\5}?\2\u0288\u0289\5g\64\2\u0289\u028a\5"+
		"\u0085C\2\u028a\u028b\5c\62\2\u028b\u036e\3\2\2\2\u028c\u028d\5w<\2\u028d"+
		"\u028e\5}?\2\u028e\u028f\5g\64\2\u028f\u0290\5\u0085C\2\u0290\u0291\5"+
		"\u008dG\2\u0291\u036e\3\2\2\2\u0292\u0293\5w<\2\u0293\u0294\5}?\2\u0294"+
		"\u0295\5}?\2\u0295\u0296\5\177@\2\u0296\u036e\3\2\2\2\u0297\u0298\5w<"+
		"\2\u0298\u0299\5}?\2\u0299\u029a\5}?\2\u029a\u029b\5\177@\2\u029b\u029c"+
		"\5i\65\2\u029c\u036e\3\2\2\2\u029d\u029e\5w<\2\u029e\u029f\5}?\2\u029f"+
		"\u02a0\5}?\2\u02a0\u02a1\5\177@\2\u02a1\u02a2\5{>\2\u02a2\u02a3\5i\65"+
		"\2\u02a3\u036e\3\2\2\2\u02a4\u02a5\5w<\2\u02a5\u02a6\5}?\2\u02a6\u02a7"+
		"\5}?\2\u02a7\u02a8\5\177@\2\u02a8\u02a9\5{>\2\u02a9\u02aa\5\u0093J\2\u02aa"+
		"\u036e\3\2\2\2\u02ab\u02ac\5w<\2\u02ac\u02ad\5}?\2\u02ad\u02ae\5}?\2\u02ae"+
		"\u02af\5\177@\2\u02af\u02b0\5\u0093J\2\u02b0\u036e\3\2\2\2\u02b1\u02b2"+
		"\5y=\2\u02b2\u02b3\5}?\2\u02b3\u02b4\5\u008bF\2\u02b4\u036e\3\2\2\2\u02b5"+
		"\u02b6\5y=\2\u02b6\u02b7\5}?\2\u02b7\u02b8\5\u008bF\2\u02b8\u02b9\5\u0085"+
		"C\2\u02b9\u036e\3\2\2\2\u02ba\u02bb\5y=\2\u02bb\u02bc\5}?\2\u02bc\u02bd"+
		"\5\u008bF\2\u02bd\u02be\5\u0085C\2\u02be\u02bf\5c\62\2\u02bf\u036e\3\2"+
		"\2\2\u02c0\u02c1\5y=\2\u02c1\u02c2\5}?\2\u02c2\u02c3\5\u008bF\2\u02c3"+
		"\u02c4\5\u0085C\2\u02c4\u02c5\5\u008dG\2\u02c5\u036e\3\2\2\2\u02c6\u02c7"+
		"\5y=\2\u02c7\u02c8\5\u0089E\2\u02c8\u02c9\5w<\2\u02c9\u036e\3\2\2\2\u02ca"+
		"\u02cb\5{>\2\u02cb\u02cc\5i\65\2\u02cc\u02cd\5m\67\2\u02cd\u036e\3\2\2"+
		"\2\u02ce\u02cf\5{>\2\u02cf\u02d0\5}?\2\u02d0\u02d1\5\177@\2\u02d1\u036e"+
		"\3\2\2\2\u02d2\u02d3\5{>\2\u02d3\u02d4\5}?\2\u02d4\u02d5\5\u0087D\2\u02d5"+
		"\u036e\3\2\2\2\u02d6\u02d7\5}?\2\u02d7\u02d8\5\u0083B\2\u02d8\u036e\3"+
		"\2\2\2\u02d9\u02da\5}?\2\u02da\u02db\5\u0089E\2\u02db\u02dc\5\u0087D\2"+
		"\u02dc\u036e\3\2\2\2\u02dd\u02de\5\177@\2\u02de\u02df\5}?\2\u02df\u02e0"+
		"\5\177@\2\u02e0\u036e\3\2\2\2\u02e1\u02e2\5\177@\2\u02e2\u02e3\5}?\2\u02e3"+
		"\u02e4\5\177@\2\u02e4\u02e5\5k\66\2\u02e5\u036e\3\2\2\2\u02e6\u02e7\5"+
		"\177@\2\u02e7\u02e8\5\u0089E\2\u02e8\u02e9\5\u0085C\2\u02e9\u02ea\5o8"+
		"\2\u02ea\u036e\3\2\2\2\u02eb\u02ec\5\177@\2\u02ec\u02ed\5\u0089E\2\u02ed"+
		"\u02ee\5\u0085C\2\u02ee\u02ef\5o8\2\u02ef\u02f0\5k\66\2\u02f0\u036e\3"+
		"\2\2\2\u02f1\u02f2\5\u0083B\2\u02f2\u02f3\5e\63\2\u02f3\u02f4\5w<\2\u02f4"+
		"\u036e\3\2\2\2\u02f5\u02f6\5\u0083B\2\u02f6\u02f7\5e\63\2\u02f7\u02f8"+
		"\5\u0083B\2\u02f8\u036e\3\2\2\2\u02f9\u02fa\5\u0083B\2\u02fa\u02fb\5i"+
		"\65\2\u02fb\u02fc\5\u0087D\2\u02fc\u036e\3\2\2\2\u02fd\u02fe\5\u0083B"+
		"\2\u02fe\u02ff\5i\65\2\u02ff\u0300\5\u0087D\2\u0300\u0301\5{>\2\u0301"+
		"\u036e\3\2\2\2\u0302\u0303\5\u0083B\2\u0303\u0304\5i\65\2\u0304\u0305"+
		"\5\u0087D\2\u0305\u0306\5k\66\2\u0306\u036e\3\2\2\2\u0307\u0308\5\u0083"+
		"B\2\u0308\u0309\5}?\2\u0309\u030a\5w<\2\u030a\u036e\3\2\2\2\u030b\u030c"+
		"\5\u0083B\2\u030c\u030d\5}?\2\u030d\u030e\5\u0083B\2\u030e\u036e\3\2\2"+
		"\2\u030f\u0310\5\u0085C\2\u0310\u0311\5a\61\2\u0311\u0312\5o8\2\u0312"+
		"\u0313\5k\66\2\u0313\u036e\3\2\2\2\u0314\u0315\5\u0085C\2\u0315\u0316"+
		"\5a\61\2\u0316\u0317\5w<\2\u0317\u036e\3\2\2\2\u0318\u0319\5\u0085C\2"+
		"\u0319\u031a\5a\61\2\u031a\u031b\5\u0083B\2\u031b\u036e\3\2\2\2\u031c"+
		"\u031d\5\u0085C\2\u031d\u031e\5a\61\2\u031e\u031f\5w<\2\u031f\u0320\5"+
		"e\63\2\u0320\u036e\3\2\2\2\u0321\u0322\5\u0085C\2\u0322\u0323\5c\62\2"+
		"\u0323\u0324\5c\62\2\u0324\u036e\3\2\2\2\u0325\u0326\5\u0085C\2\u0326"+
		"\u0327\5e\63\2\u0327\u0328\5a\61\2\u0328\u0329\5\u0085C\2\u0329\u032a"+
		"\5c\62\2\u032a\u036e\3\2\2\2\u032b\u032c\5\u0085C\2\u032c\u032d\5e\63"+
		"\2\u032d\u032e\5a\61\2\u032e\u032f\5\u0085C\2\u032f\u0330\5\u008dG\2\u0330"+
		"\u036e\3\2\2\2\u0331\u0332\5\u0085C\2\u0332\u0333\5o8\2\u0333\u0334\5"+
		"w<\2\u0334\u036e\3\2\2\2\u0335\u0336\5\u0085C\2\u0336\u0337\5o8\2\u0337"+
		"\u0338\5\u0083B\2\u0338\u036e\3\2\2\2\u0339\u033a\5\u0085C\2\u033a\u033b"+
		"\5\u0087D\2\u033b\u033c\5e\63\2\u033c\u036e\3\2\2\2\u033d\u033e\5\u0085"+
		"C\2\u033e\u033f\5\u0087D\2\u033f\u0340\5g\64\2\u0340\u036e\3\2\2\2\u0341"+
		"\u0342\5\u0085C\2\u0342\u0343\5\u0087D\2\u0343\u0344\5q9\2\u0344\u036e"+
		"\3\2\2\2\u0345\u0346\5\u0085C\2\u0346\u0347\5\u0087D\2\u0347\u0348\5}"+
		"?\2\u0348\u0349\5\u0085C\2\u0349\u034a\5c\62\2\u034a\u036e\3\2\2\2\u034b"+
		"\u034c\5\u0085C\2\u034c\u034d\5\u0087D\2\u034d\u034e\5}?\2\u034e\u034f"+
		"\5\u0085C\2\u034f\u0350\5\u008dG\2\u0350\u036e\3\2\2\2\u0351\u0352\5\u0085"+
		"C\2\u0352\u0353\5\u0089E\2\u0353\u0354\5c\62\2\u0354\u036e\3\2\2\2\u0355"+
		"\u0356\5\u0087D\2\u0356\u0357\5i\65\2\u0357\u0358\5\u0085C\2\u0358\u0359"+
		"\5\u0087D\2\u0359\u036e\3\2\2\2\u035a\u035b\5\u008dG\2\u035b\u035c\5a"+
		"\61\2\u035c\u035d\5q9\2\u035d\u035e\5\u0087D\2\u035e\u036e\3\2\2\2\u035f"+
		"\u0360\5\u008fH\2\u0360\u0361\5e\63\2\u0361\u0362\5o8\2\u0362\u0363\5"+
		"m\67\2\u0363\u036e\3\2\2\2\u0364\u0365\5\u008fH\2\u0365\u0366\5w<\2\u0366"+
		"\u0367\5a\61\2\u0367\u0368\5\u0087D\2\u0368\u036e\3\2\2\2\u0369\u036a"+
		"\5\u008fH\2\u036a\u036b\5}?\2\u036b\u036c\5\u0083B\2\u036c\u036e\3\2\2"+
		"\2\u036d\u0166\3\2\2\2\u036d\u016a\3\2\2\2\u036d\u016e\3\2\2\2\u036d\u0172"+
		"\3\2\2\2\u036d\u0176\3\2\2\2\u036d\u017a\3\2\2\2\u036d\u017e\3\2\2\2\u036d"+
		"\u0182\3\2\2\2\u036d\u0187\3\2\2\2\u036d\u018b\3\2\2\2\u036d\u018f\3\2"+
		"\2\2\u036d\u0193\3\2\2\2\u036d\u0197\3\2\2\2\u036d\u019b\3\2\2\2\u036d"+
		"\u019f\3\2\2\2\u036d\u01a5\3\2\2\2\u036d\u01ab\3\2\2\2\u036d\u01af\3\2"+
		"\2\2\u036d\u01b3\3\2\2\2\u036d\u01b7\3\2\2\2\u036d\u01bb\3\2\2\2\u036d"+
		"\u01bf\3\2\2\2\u036d\u01c3\3\2\2\2\u036d\u01c7\3\2\2\2\u036d\u01cc\3\2"+
		"\2\2\u036d\u01d1\3\2\2\2\u036d\u01d4\3\2\2\2\u036d\u01d8\3\2\2\2\u036d"+
		"\u01dc\3\2\2\2\u036d\u01e1\3\2\2\2\u036d\u01e6\3\2\2\2\u036d\u01e9\3\2"+
		"\2\2\u036d\u01ed\3\2\2\2\u036d\u01f0\3\2\2\2\u036d\u01f4\3\2\2\2\u036d"+
		"\u01f7\3\2\2\2\u036d\u01fa\3\2\2\2\u036d\u01fd\3\2\2\2\u036d\u0201\3\2"+
		"\2\2\u036d\u0204\3\2\2\2\u036d\u0208\3\2\2\2\u036d\u020c\3\2\2\2\u036d"+
		"\u0211\3\2\2\2\u036d\u0215\3\2\2\2\u036d\u021a\3\2\2\2\u036d\u021e\3\2"+
		"\2\2\u036d\u0222\3\2\2\2\u036d\u0226\3\2\2\2\u036d\u022b\3\2\2\2\u036d"+
		"\u022f\3\2\2\2\u036d\u0234\3\2\2\2\u036d\u0238\3\2\2\2\u036d\u023c\3\2"+
		"\2\2\u036d\u0240\3\2\2\2\u036d\u0244\3\2\2\2\u036d\u0247\3\2\2\2\u036d"+
		"\u024a\3\2\2\2\u036d\u024e\3\2\2\2\u036d\u0252\3\2\2\2\u036d\u0255\3\2"+
		"\2\2\u036d\u0258\3\2\2\2\u036d\u025d\3\2\2\2\u036d\u0261\3\2\2\2\u036d"+
		"\u0266\3\2\2\2\u036d\u026b\3\2\2\2\u036d\u0270\3\2\2\2\u036d\u0274\3\2"+
		"\2\2\u036d\u0278\3\2\2\2\u036d\u027c\3\2\2\2\u036d\u0281\3\2\2\2\u036d"+
		"\u0286\3\2\2\2\u036d\u028c\3\2\2\2\u036d\u0292\3\2\2\2\u036d\u0297\3\2"+
		"\2\2\u036d\u029d\3\2\2\2\u036d\u02a4\3\2\2\2\u036d\u02ab\3\2\2\2\u036d"+
		"\u02b1\3\2\2\2\u036d\u02b5\3\2\2\2\u036d\u02ba\3\2\2\2\u036d\u02c0\3\2"+
		"\2\2\u036d\u02c6\3\2\2\2\u036d\u02ca\3\2\2\2\u036d\u02ce\3\2\2\2\u036d"+
		"\u02d2\3\2\2\2\u036d\u02d6\3\2\2\2\u036d\u02d9\3\2\2\2\u036d\u02dd\3\2"+
		"\2\2\u036d\u02e1\3\2\2\2\u036d\u02e6\3\2\2\2\u036d\u02eb\3\2\2\2\u036d"+
		"\u02f1\3\2\2\2\u036d\u02f5\3\2\2\2\u036d\u02f9\3\2\2\2\u036d\u02fd\3\2"+
		"\2\2\u036d\u0302\3\2\2\2\u036d\u0307\3\2\2\2\u036d\u030b\3\2\2\2\u036d"+
		"\u030f\3\2\2\2\u036d\u0314\3\2\2\2\u036d\u0318\3\2\2\2\u036d\u031c\3\2"+
		"\2\2\u036d\u0321\3\2\2\2\u036d\u0325\3\2\2\2\u036d\u032b\3\2\2\2\u036d"+
		"\u0331\3\2\2\2\u036d\u0335\3\2\2\2\u036d\u0339\3\2\2\2\u036d\u033d\3\2"+
		"\2\2\u036d\u0341\3\2\2\2\u036d\u0345\3\2\2\2\u036d\u034b\3\2\2\2\u036d"+
		"\u0351\3\2\2\2\u036d\u0355\3\2\2\2\u036d\u035a\3\2\2\2\u036d\u035f\3\2"+
		"\2\2\u036d\u0364\3\2\2\2\u036d\u0369\3\2\2\2\u036eP\3\2\2\2\u036f\u0370"+
		"\5\u0083B\2\u0370\u0371\5i\65\2\u0371\u0372\5\177@\2\u0372\u038a\3\2\2"+
		"\2\u0373\u0374\5\u0083B\2\u0374\u0375\5i\65\2\u0375\u0376\5\177@\2\u0376"+
		"\u0377\5i\65\2\u0377\u038a\3\2\2\2\u0378\u0379\5\u0083B\2\u0379\u037a"+
		"\5i\65\2\u037a\u037b\5\177@\2\u037b\u037c\5{>\2\u037c\u037d\5i\65\2\u037d"+
		"\u038a\3\2\2\2\u037e\u037f\5\u0083B\2\u037f\u0380\5i\65\2\u0380\u0381"+
		"\5\177@\2\u0381\u0382\5{>\2\u0382\u0383\5\u0093J\2\u0383\u038a\3\2\2\2"+
		"\u0384\u0385\5\u0083B\2\u0385\u0386\5i\65\2\u0386\u0387\5\177@\2\u0387"+
		"\u0388\5\u0093J\2\u0388\u038a\3\2\2\2\u0389\u036f\3\2\2\2\u0389\u0373"+
		"\3\2\2\2\u0389\u0378\3\2\2\2\u0389\u037e\3\2\2\2\u0389\u0384\3\2\2\2\u038a"+
		"R\3\2\2\2\u038b\u038c\7&\2\2\u038cT\3\2\2\2\u038d\u038e\t\3\2\2\u038e"+
		"V\3\2\2\2\u038f\u0393\t\4\2\2\u0390\u0392\t\5\2\2\u0391\u0390\3\2\2\2"+
		"\u0392\u0395\3\2\2\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394X\3"+
		"\2\2\2\u0395\u0393\3\2\2\2\u0396\u0398\t\6\2\2\u0397\u0396\3\2\2\2\u0398"+
		"\u0399\3\2\2\2\u0399\u0397\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039c\3\2"+
		"\2\2\u039b\u039d\t\7\2\2\u039c\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d"+
		"Z\3\2\2\2\u039e\u03a2\7)\2\2\u039f\u03a1\n\b\2\2\u03a0\u039f\3\2\2\2\u03a1"+
		"\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a5\3\2"+
		"\2\2\u03a4\u03a2\3\2\2\2\u03a5\u03a6\7)\2\2\u03a6\\\3\2\2\2\u03a7\u03a9"+
		"\t\2\2\2\u03a8\u03a7\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa\u03a8\3\2\2\2\u03aa"+
		"\u03ab\3\2\2\2\u03ab^\3\2\2\2\u03ac\u03ad\t\t\2\2\u03ad\u03ae\3\2\2\2"+
		"\u03ae\u03af\b\60\2\2\u03af`\3\2\2\2\u03b0\u03b1\t\n\2\2\u03b1b\3\2\2"+
		"\2\u03b2\u03b3\t\13\2\2\u03b3d\3\2\2\2\u03b4\u03b5\t\f\2\2\u03b5f\3\2"+
		"\2\2\u03b6\u03b7\t\r\2\2\u03b7h\3\2\2\2\u03b8\u03b9\t\16\2\2\u03b9j\3"+
		"\2\2\2\u03ba\u03bb\t\17\2\2\u03bbl\3\2\2\2\u03bc\u03bd\t\20\2\2\u03bd"+
		"n\3\2\2\2\u03be\u03bf\t\7\2\2\u03bfp\3\2\2\2\u03c0\u03c1\t\21\2\2\u03c1"+
		"r\3\2\2\2\u03c2\u03c3\t\22\2\2\u03c3t\3\2\2\2\u03c4\u03c5\t\23\2\2\u03c5"+
		"v\3\2\2\2\u03c6\u03c7\t\24\2\2\u03c7x\3\2\2\2\u03c8\u03c9\t\25\2\2\u03c9"+
		"z\3\2\2\2\u03ca\u03cb\t\26\2\2\u03cb|\3\2\2\2\u03cc\u03cd\t\27\2\2\u03cd"+
		"~\3\2\2\2\u03ce\u03cf\t\30\2\2\u03cf\u0080\3\2\2\2\u03d0\u03d1\t\31\2"+
		"\2\u03d1\u0082\3\2\2\2\u03d2\u03d3\t\32\2\2\u03d3\u0084\3\2\2\2\u03d4"+
		"\u03d5\t\33\2\2\u03d5\u0086\3\2\2\2\u03d6\u03d7\t\34\2\2\u03d7\u0088\3"+
		"\2\2\2\u03d8\u03d9\t\35\2\2\u03d9\u008a\3\2\2\2\u03da\u03db\t\36\2\2\u03db"+
		"\u008c\3\2\2\2\u03dc\u03dd\t\37\2\2\u03dd\u008e\3\2\2\2\u03de\u03df\t"+
		" \2\2\u03df\u0090\3\2\2\2\u03e0\u03e1\t!\2\2\u03e1\u0092\3\2\2\2\u03e2"+
		"\u03e3\t\"\2\2\u03e3\u0094\3\2\2\2\f\2\u0120\u0164\u036d\u0389\u0393\u0399"+
		"\u039c\u03a2\u03aa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}