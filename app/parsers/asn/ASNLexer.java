// Generated from asn/ASN.g4 by ANTLR 4.7.1
package parsers.asn;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ASNLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		A_ROND=1, STAR=2, ASSIGN_OP=3, BOOLEAN_LITERAL=4, TRUE_LITERAL=5, FALSE_LITERAL=6, 
		DOT=7, DOUBLE_DOT=8, ELLIPSIS=9, APOSTROPHE=10, AMPERSAND=11, LESS_THAN=12, 
		GREATER_THAN=13, LESS_THAN_SLASH=14, SLASH_GREATER_THAN=15, TRUE_SMALL_LITERAL=16, 
		FALSE_SMALL_LITERAL=17, INTEGER_LITERAL=18, L_BRACE=19, R_BRACE=20, COMMA=21, 
		L_PARAN=22, R_PARAN=23, MINUS=24, ENUMERATED_LITERAL=25, REAL_LITERAL=26, 
		PLUS_INFINITY_LITERAL=27, MINUS_INFINITY_LITERAL=28, BIT_LITERAL=29, STRING_LITERAL=30, 
		CONTAINING_LITERAL=31, OCTET_LITERAL=32, NULL_LITERAL=33, SEQUENCE_LITERAL=34, 
		OPTIONAL_LITERAL=35, DEFAULT_LITERAL=36, COMPONENTS_LITERAL=37, OF_LITERAL=38, 
		SET_LITERAL=39, EXCLAM=40, ALL_LITERAL=41, EXCEPT_LITERAL=42, POWER=43, 
		PIPE=44, UNION_LITERAL=45, INTERSECTION_LITERAL=46, INCLUDES_LITERAL=47, 
		MIN_LITERAL=48, MAX_LITERAL=49, SIZE_LITERAL=50, FROM_LITERAL=51, WITH_LITERAL=52, 
		COMPONENT_LITERAL=53, PRESENT_LITERAL=54, ABSENT_LITERAL=55, PATTERN_LITERAL=56, 
		TYPE_IDENTIFIER_LITERAL=57, ABSTRACT_SYNTAX_LITERAL=58, CLASS_LITERAL=59, 
		UNIQUE_LITERAL=60, SYNTAX_LITERAL=61, L_BRACKET=62, R_BRACKET=63, INSTANCE_LITERAL=64, 
		SEMI_COLON=65, IMPORTS_LITERAL=66, EXPORTS_LITERAL=67, EXTENSIBILITY_LITERAL=68, 
		IMPLIED_LITERAL=69, EXPLICIT_LITERAL=70, TAGS_LITERAL=71, IMPLICIT_LITERAL=72, 
		AUTOMATIC_LITERAL=73, DEFINITIONS_LITERAL=74, BEGIN_LITERAL=75, END_LITERAL=76, 
		DOUBLE_L_BRACKET=77, DOUBLE_R_BRACKET=78, COLON=79, CHOICE_LITERAL=80, 
		UNIVERSAL_LITERAL=81, APPLICATION_LITERAL=82, PRIVATE_LITERAL=83, EMBEDDED_LITERAL=84, 
		PDV_LITERAL=85, EXTERNAL_LITERAL=86, OBJECT_LITERAL=87, IDENTIFIER_LITERAL=88, 
		RELATIVE_OID_LITERAL=89, CHARACTER_LITERAL=90, CONSTRAINED_LITERAL=91, 
		BY_LITERAL=92, A_ROND_DOT=93, ENCODED_LITERAL=94, COMMENT=95, UNRESTRICTEDCHARACTERSTRINGTYPE=96, 
		EXTENSTIONENDMARKER=97, NUMBER=98, WS=99, LINE_COMMENT=100, BSTRING=101, 
		HSTRING=102, CSTRING=103, IDENTIFIER=104;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"A_ROND", "STAR", "ASSIGN_OP", "BOOLEAN_LITERAL", "TRUE_LITERAL", "FALSE_LITERAL", 
		"DOT", "DOUBLE_DOT", "ELLIPSIS", "APOSTROPHE", "AMPERSAND", "LESS_THAN", 
		"GREATER_THAN", "LESS_THAN_SLASH", "SLASH_GREATER_THAN", "TRUE_SMALL_LITERAL", 
		"FALSE_SMALL_LITERAL", "INTEGER_LITERAL", "L_BRACE", "R_BRACE", "COMMA", 
		"L_PARAN", "R_PARAN", "MINUS", "ENUMERATED_LITERAL", "REAL_LITERAL", "PLUS_INFINITY_LITERAL", 
		"MINUS_INFINITY_LITERAL", "BIT_LITERAL", "STRING_LITERAL", "CONTAINING_LITERAL", 
		"OCTET_LITERAL", "NULL_LITERAL", "SEQUENCE_LITERAL", "OPTIONAL_LITERAL", 
		"DEFAULT_LITERAL", "COMPONENTS_LITERAL", "OF_LITERAL", "SET_LITERAL", 
		"EXCLAM", "ALL_LITERAL", "EXCEPT_LITERAL", "POWER", "PIPE", "UNION_LITERAL", 
		"INTERSECTION_LITERAL", "INCLUDES_LITERAL", "MIN_LITERAL", "MAX_LITERAL", 
		"SIZE_LITERAL", "FROM_LITERAL", "WITH_LITERAL", "COMPONENT_LITERAL", "PRESENT_LITERAL", 
		"ABSENT_LITERAL", "PATTERN_LITERAL", "TYPE_IDENTIFIER_LITERAL", "ABSTRACT_SYNTAX_LITERAL", 
		"CLASS_LITERAL", "UNIQUE_LITERAL", "SYNTAX_LITERAL", "L_BRACKET", "R_BRACKET", 
		"INSTANCE_LITERAL", "SEMI_COLON", "IMPORTS_LITERAL", "EXPORTS_LITERAL", 
		"EXTENSIBILITY_LITERAL", "IMPLIED_LITERAL", "EXPLICIT_LITERAL", "TAGS_LITERAL", 
		"IMPLICIT_LITERAL", "AUTOMATIC_LITERAL", "DEFINITIONS_LITERAL", "BEGIN_LITERAL", 
		"END_LITERAL", "DOUBLE_L_BRACKET", "DOUBLE_R_BRACKET", "COLON", "CHOICE_LITERAL", 
		"UNIVERSAL_LITERAL", "APPLICATION_LITERAL", "PRIVATE_LITERAL", "EMBEDDED_LITERAL", 
		"PDV_LITERAL", "EXTERNAL_LITERAL", "OBJECT_LITERAL", "IDENTIFIER_LITERAL", 
		"RELATIVE_OID_LITERAL", "CHARACTER_LITERAL", "CONSTRAINED_LITERAL", "BY_LITERAL", 
		"A_ROND_DOT", "ENCODED_LITERAL", "COMMENT", "UNRESTRICTEDCHARACTERSTRINGTYPE", 
		"EXTENSTIONENDMARKER", "DIGIT", "UPPER", "LOWER", "NUMBER", "WS", "Exponent", 
		"LINE_COMMENT", "BSTRING", "HEXDIGIT", "HSTRING", "CSTRING", "EscapeSequence", 
		"LETTER", "JavaIDDigit", "IDENTIFIER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'@'", "'*'", "'::='", "'BOOLEAN'", "'TRUE'", "'FALSE'", "'.'", 
		"'..'", "'...'", "'''", "'&'", "'<'", "'>'", "'</'", "'/>'", "'true'", 
		"'false'", "'INTEGER'", "'{'", "'}'", "','", "'('", "')'", "'-'", "'ENUMERATED'", 
		"'REAL'", "'PLUS-INFINITY'", "'MINUS-INFINITY'", "'BIT'", "'STRING'", 
		"'CONTAINING'", "'OCTET'", "'NULL'", "'SEQUENCE'", "'OPTIONAL'", "'DEFAULT'", 
		"'COMPONENTS'", "'OF'", "'SET'", "'!'", "'ALL'", "'EXCEPT'", "'^'", "'|'", 
		"'UNION'", "'INTERSECTION'", "'INCLUDES'", "'MIN'", "'MAX'", "'SIZE'", 
		"'FROM'", "'WITH'", "'COMPONENT'", "'PRESENT'", "'ABSENT'", "'PATTERN'", 
		"'TYPE-Identifier'", "'ABSTRACT-SYNTAX'", "'CLASS'", "'UNIQUE'", "'SYNTAX'", 
		"'['", "']'", "'INSTANCE'", "';'", "'IMPORTS'", "'EXPORTS'", "'EXTENSIBILITY'", 
		"'IMPLIED'", "'EXPLICIT'", "'TAGS'", "'IMPLICIT'", "'AUTOMATIC'", "'DEFINITIONS'", 
		"'BEGIN'", "'END'", "'[['", "']]'", "':'", "'CHOICE'", "'UNIVERSAL'", 
		"'APPLICATION'", "'PRIVATE'", "'EMBEDDED'", "'PDV'", "'EXTERNAL'", "'OBJECT'", 
		"'IDENTIFIER'", "'RELATIVE-OID'", "'CHARACTER'", "'CONSTRAINED'", "'BY'", 
		"'@.'", "'ENCODED'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "A_ROND", "STAR", "ASSIGN_OP", "BOOLEAN_LITERAL", "TRUE_LITERAL", 
		"FALSE_LITERAL", "DOT", "DOUBLE_DOT", "ELLIPSIS", "APOSTROPHE", "AMPERSAND", 
		"LESS_THAN", "GREATER_THAN", "LESS_THAN_SLASH", "SLASH_GREATER_THAN", 
		"TRUE_SMALL_LITERAL", "FALSE_SMALL_LITERAL", "INTEGER_LITERAL", "L_BRACE", 
		"R_BRACE", "COMMA", "L_PARAN", "R_PARAN", "MINUS", "ENUMERATED_LITERAL", 
		"REAL_LITERAL", "PLUS_INFINITY_LITERAL", "MINUS_INFINITY_LITERAL", "BIT_LITERAL", 
		"STRING_LITERAL", "CONTAINING_LITERAL", "OCTET_LITERAL", "NULL_LITERAL", 
		"SEQUENCE_LITERAL", "OPTIONAL_LITERAL", "DEFAULT_LITERAL", "COMPONENTS_LITERAL", 
		"OF_LITERAL", "SET_LITERAL", "EXCLAM", "ALL_LITERAL", "EXCEPT_LITERAL", 
		"POWER", "PIPE", "UNION_LITERAL", "INTERSECTION_LITERAL", "INCLUDES_LITERAL", 
		"MIN_LITERAL", "MAX_LITERAL", "SIZE_LITERAL", "FROM_LITERAL", "WITH_LITERAL", 
		"COMPONENT_LITERAL", "PRESENT_LITERAL", "ABSENT_LITERAL", "PATTERN_LITERAL", 
		"TYPE_IDENTIFIER_LITERAL", "ABSTRACT_SYNTAX_LITERAL", "CLASS_LITERAL", 
		"UNIQUE_LITERAL", "SYNTAX_LITERAL", "L_BRACKET", "R_BRACKET", "INSTANCE_LITERAL", 
		"SEMI_COLON", "IMPORTS_LITERAL", "EXPORTS_LITERAL", "EXTENSIBILITY_LITERAL", 
		"IMPLIED_LITERAL", "EXPLICIT_LITERAL", "TAGS_LITERAL", "IMPLICIT_LITERAL", 
		"AUTOMATIC_LITERAL", "DEFINITIONS_LITERAL", "BEGIN_LITERAL", "END_LITERAL", 
		"DOUBLE_L_BRACKET", "DOUBLE_R_BRACKET", "COLON", "CHOICE_LITERAL", "UNIVERSAL_LITERAL", 
		"APPLICATION_LITERAL", "PRIVATE_LITERAL", "EMBEDDED_LITERAL", "PDV_LITERAL", 
		"EXTERNAL_LITERAL", "OBJECT_LITERAL", "IDENTIFIER_LITERAL", "RELATIVE_OID_LITERAL", 
		"CHARACTER_LITERAL", "CONSTRAINED_LITERAL", "BY_LITERAL", "A_ROND_DOT", 
		"ENCODED_LITERAL", "COMMENT", "UNRESTRICTEDCHARACTERSTRINGTYPE", "EXTENSTIONENDMARKER", 
		"NUMBER", "WS", "LINE_COMMENT", "BSTRING", "HSTRING", "CSTRING", "IDENTIFIER"
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


	public ASNLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ASN.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2j\u039b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#"+
		"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3*\3*\3*\3*"+
		"\3+\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38"+
		"\38\38\38\38\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:"+
		"\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<"+
		"\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3?\3?\3@\3@\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F"+
		"\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I"+
		"\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K"+
		"\3K\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3N\3N\3N\3O\3O\3O\3P\3P\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S"+
		"\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V"+
		"\3W\3W\3W\3W\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Y"+
		"\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3[\3["+
		"\3[\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]"+
		"\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3`\3`\3`\3a\3a\3a\3b\3b\3b\3c\3c\3d"+
		"\3d\3e\3e\3f\6f\u034a\nf\rf\16f\u034b\3g\3g\3g\3g\3h\3h\5h\u0354\nh\3"+
		"h\3h\3i\3i\3i\3i\7i\u035c\ni\fi\16i\u035f\13i\3i\5i\u0362\ni\3i\3i\3i"+
		"\3i\3j\3j\7j\u036a\nj\fj\16j\u036d\13j\3j\3j\3j\3k\3k\5k\u0374\nk\3l\3"+
		"l\7l\u0378\nl\fl\16l\u037b\13l\3l\3l\3l\3m\3m\3m\7m\u0383\nm\fm\16m\u0386"+
		"\13m\3m\3m\3n\3n\3n\3n\5n\u038e\nn\3o\3o\3p\3p\3q\3q\3q\7q\u0397\nq\f"+
		"q\16q\u039a\13q\2\2r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1"+
		"Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5"+
		"\2\u00c7\2\u00c9\2\u00cbd\u00cde\u00cf\2\u00d1f\u00d3g\u00d5\2\u00d7h"+
		"\u00d9i\u00db\2\u00dd\2\u00df\2\u00e1j\3\2\13\5\2\13\f\16\17\"\"\4\2G"+
		"Ggg\4\2--//\4\2\f\f\17\17\4\2CHch\4\2$$^^\b\2$$ddhhppttvv\17\2&&//C\\"+
		"aac|\u00c2\u00d8\u00da\u00f8\u00fa\u2001\u3042\u3191\u3302\u3381\u3402"+
		"\u3d2f\u4e02\ua001\uf902\ufb01\21\2\62;\u0662\u066b\u06f2\u06fb\u0968"+
		"\u0971\u09e8\u09f1\u0a68\u0a71\u0ae8\u0af1\u0b68\u0b71\u0be9\u0bf1\u0c68"+
		"\u0c71\u0ce8\u0cf1\u0d68\u0d71\u0e52\u0e5b\u0ed2\u0edb\u1042\u104b\2\u039f"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2"+
		"\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d7"+
		"\3\2\2\2\2\u00d9\3\2\2\2\2\u00e1\3\2\2\2\3\u00e3\3\2\2\2\5\u00e5\3\2\2"+
		"\2\7\u00e7\3\2\2\2\t\u00eb\3\2\2\2\13\u00f3\3\2\2\2\r\u00f8\3\2\2\2\17"+
		"\u00fe\3\2\2\2\21\u0100\3\2\2\2\23\u0103\3\2\2\2\25\u0107\3\2\2\2\27\u0109"+
		"\3\2\2\2\31\u010b\3\2\2\2\33\u010d\3\2\2\2\35\u010f\3\2\2\2\37\u0112\3"+
		"\2\2\2!\u0115\3\2\2\2#\u011a\3\2\2\2%\u0120\3\2\2\2\'\u0128\3\2\2\2)\u012a"+
		"\3\2\2\2+\u012c\3\2\2\2-\u012e\3\2\2\2/\u0130\3\2\2\2\61\u0132\3\2\2\2"+
		"\63\u0134\3\2\2\2\65\u013f\3\2\2\2\67\u0144\3\2\2\29\u0152\3\2\2\2;\u0161"+
		"\3\2\2\2=\u0165\3\2\2\2?\u016c\3\2\2\2A\u0177\3\2\2\2C\u017d\3\2\2\2E"+
		"\u0182\3\2\2\2G\u018b\3\2\2\2I\u0194\3\2\2\2K\u019c\3\2\2\2M\u01a7\3\2"+
		"\2\2O\u01aa\3\2\2\2Q\u01ae\3\2\2\2S\u01b0\3\2\2\2U\u01b4\3\2\2\2W\u01bb"+
		"\3\2\2\2Y\u01bd\3\2\2\2[\u01bf\3\2\2\2]\u01c5\3\2\2\2_\u01d2\3\2\2\2a"+
		"\u01db\3\2\2\2c\u01df\3\2\2\2e\u01e3\3\2\2\2g\u01e8\3\2\2\2i\u01ed\3\2"+
		"\2\2k\u01f2\3\2\2\2m\u01fc\3\2\2\2o\u0204\3\2\2\2q\u020b\3\2\2\2s\u0213"+
		"\3\2\2\2u\u0223\3\2\2\2w\u0233\3\2\2\2y\u0239\3\2\2\2{\u0240\3\2\2\2}"+
		"\u0247\3\2\2\2\177\u0249\3\2\2\2\u0081\u024b\3\2\2\2\u0083\u0254\3\2\2"+
		"\2\u0085\u0256\3\2\2\2\u0087\u025e\3\2\2\2\u0089\u0266\3\2\2\2\u008b\u0274"+
		"\3\2\2\2\u008d\u027c\3\2\2\2\u008f\u0285\3\2\2\2\u0091\u028a\3\2\2\2\u0093"+
		"\u0293\3\2\2\2\u0095\u029d\3\2\2\2\u0097\u02a9\3\2\2\2\u0099\u02af\3\2"+
		"\2\2\u009b\u02b3\3\2\2\2\u009d\u02b6\3\2\2\2\u009f\u02b9\3\2\2\2\u00a1"+
		"\u02bb\3\2\2\2\u00a3\u02c2\3\2\2\2\u00a5\u02cc\3\2\2\2\u00a7\u02d8\3\2"+
		"\2\2\u00a9\u02e0\3\2\2\2\u00ab\u02e9\3\2\2\2\u00ad\u02ed\3\2\2\2\u00af"+
		"\u02f6\3\2\2\2\u00b1\u02fd\3\2\2\2\u00b3\u0308\3\2\2\2\u00b5\u0315\3\2"+
		"\2\2\u00b7\u031f\3\2\2\2\u00b9\u032b\3\2\2\2\u00bb\u032e\3\2\2\2\u00bd"+
		"\u0331\3\2\2\2\u00bf\u0339\3\2\2\2\u00c1\u033c\3\2\2\2\u00c3\u033f\3\2"+
		"\2\2\u00c5\u0342\3\2\2\2\u00c7\u0344\3\2\2\2\u00c9\u0346\3\2\2\2\u00cb"+
		"\u0349\3\2\2\2\u00cd\u034d\3\2\2\2\u00cf\u0351\3\2\2\2\u00d1\u0357\3\2"+
		"\2\2\u00d3\u0367\3\2\2\2\u00d5\u0373\3\2\2\2\u00d7\u0375\3\2\2\2\u00d9"+
		"\u037f\3\2\2\2\u00db\u0389\3\2\2\2\u00dd\u038f\3\2\2\2\u00df\u0391\3\2"+
		"\2\2\u00e1\u0393\3\2\2\2\u00e3\u00e4\7B\2\2\u00e4\4\3\2\2\2\u00e5\u00e6"+
		"\7,\2\2\u00e6\6\3\2\2\2\u00e7\u00e8\7<\2\2\u00e8\u00e9\7<\2\2\u00e9\u00ea"+
		"\7?\2\2\u00ea\b\3\2\2\2\u00eb\u00ec\7D\2\2\u00ec\u00ed\7Q\2\2\u00ed\u00ee"+
		"\7Q\2\2\u00ee\u00ef\7N\2\2\u00ef\u00f0\7G\2\2\u00f0\u00f1\7C\2\2\u00f1"+
		"\u00f2\7P\2\2\u00f2\n\3\2\2\2\u00f3\u00f4\7V\2\2\u00f4\u00f5\7T\2\2\u00f5"+
		"\u00f6\7W\2\2\u00f6\u00f7\7G\2\2\u00f7\f\3\2\2\2\u00f8\u00f9\7H\2\2\u00f9"+
		"\u00fa\7C\2\2\u00fa\u00fb\7N\2\2\u00fb\u00fc\7U\2\2\u00fc\u00fd\7G\2\2"+
		"\u00fd\16\3\2\2\2\u00fe\u00ff\7\60\2\2\u00ff\20\3\2\2\2\u0100\u0101\7"+
		"\60\2\2\u0101\u0102\7\60\2\2\u0102\22\3\2\2\2\u0103\u0104\7\60\2\2\u0104"+
		"\u0105\7\60\2\2\u0105\u0106\7\60\2\2\u0106\24\3\2\2\2\u0107\u0108\7)\2"+
		"\2\u0108\26\3\2\2\2\u0109\u010a\7(\2\2\u010a\30\3\2\2\2\u010b\u010c\7"+
		">\2\2\u010c\32\3\2\2\2\u010d\u010e\7@\2\2\u010e\34\3\2\2\2\u010f\u0110"+
		"\7>\2\2\u0110\u0111\7\61\2\2\u0111\36\3\2\2\2\u0112\u0113\7\61\2\2\u0113"+
		"\u0114\7@\2\2\u0114 \3\2\2\2\u0115\u0116\7v\2\2\u0116\u0117\7t\2\2\u0117"+
		"\u0118\7w\2\2\u0118\u0119\7g\2\2\u0119\"\3\2\2\2\u011a\u011b\7h\2\2\u011b"+
		"\u011c\7c\2\2\u011c\u011d\7n\2\2\u011d\u011e\7u\2\2\u011e\u011f\7g\2\2"+
		"\u011f$\3\2\2\2\u0120\u0121\7K\2\2\u0121\u0122\7P\2\2\u0122\u0123\7V\2"+
		"\2\u0123\u0124\7G\2\2\u0124\u0125\7I\2\2\u0125\u0126\7G\2\2\u0126\u0127"+
		"\7T\2\2\u0127&\3\2\2\2\u0128\u0129\7}\2\2\u0129(\3\2\2\2\u012a\u012b\7"+
		"\177\2\2\u012b*\3\2\2\2\u012c\u012d\7.\2\2\u012d,\3\2\2\2\u012e\u012f"+
		"\7*\2\2\u012f.\3\2\2\2\u0130\u0131\7+\2\2\u0131\60\3\2\2\2\u0132\u0133"+
		"\7/\2\2\u0133\62\3\2\2\2\u0134\u0135\7G\2\2\u0135\u0136\7P\2\2\u0136\u0137"+
		"\7W\2\2\u0137\u0138\7O\2\2\u0138\u0139\7G\2\2\u0139\u013a\7T\2\2\u013a"+
		"\u013b\7C\2\2\u013b\u013c\7V\2\2\u013c\u013d\7G\2\2\u013d\u013e\7F\2\2"+
		"\u013e\64\3\2\2\2\u013f\u0140\7T\2\2\u0140\u0141\7G\2\2\u0141\u0142\7"+
		"C\2\2\u0142\u0143\7N\2\2\u0143\66\3\2\2\2\u0144\u0145\7R\2\2\u0145\u0146"+
		"\7N\2\2\u0146\u0147\7W\2\2\u0147\u0148\7U\2\2\u0148\u0149\7/\2\2\u0149"+
		"\u014a\7K\2\2\u014a\u014b\7P\2\2\u014b\u014c\7H\2\2\u014c\u014d\7K\2\2"+
		"\u014d\u014e\7P\2\2\u014e\u014f\7K\2\2\u014f\u0150\7V\2\2\u0150\u0151"+
		"\7[\2\2\u01518\3\2\2\2\u0152\u0153\7O\2\2\u0153\u0154\7K\2\2\u0154\u0155"+
		"\7P\2\2\u0155\u0156\7W\2\2\u0156\u0157\7U\2\2\u0157\u0158\7/\2\2\u0158"+
		"\u0159\7K\2\2\u0159\u015a\7P\2\2\u015a\u015b\7H\2\2\u015b\u015c\7K\2\2"+
		"\u015c\u015d\7P\2\2\u015d\u015e\7K\2\2\u015e\u015f\7V\2\2\u015f\u0160"+
		"\7[\2\2\u0160:\3\2\2\2\u0161\u0162\7D\2\2\u0162\u0163\7K\2\2\u0163\u0164"+
		"\7V\2\2\u0164<\3\2\2\2\u0165\u0166\7U\2\2\u0166\u0167\7V\2\2\u0167\u0168"+
		"\7T\2\2\u0168\u0169\7K\2\2\u0169\u016a\7P\2\2\u016a\u016b\7I\2\2\u016b"+
		">\3\2\2\2\u016c\u016d\7E\2\2\u016d\u016e\7Q\2\2\u016e\u016f\7P\2\2\u016f"+
		"\u0170\7V\2\2\u0170\u0171\7C\2\2\u0171\u0172\7K\2\2\u0172\u0173\7P\2\2"+
		"\u0173\u0174\7K\2\2\u0174\u0175\7P\2\2\u0175\u0176\7I\2\2\u0176@\3\2\2"+
		"\2\u0177\u0178\7Q\2\2\u0178\u0179\7E\2\2\u0179\u017a\7V\2\2\u017a\u017b"+
		"\7G\2\2\u017b\u017c\7V\2\2\u017cB\3\2\2\2\u017d\u017e\7P\2\2\u017e\u017f"+
		"\7W\2\2\u017f\u0180\7N\2\2\u0180\u0181\7N\2\2\u0181D\3\2\2\2\u0182\u0183"+
		"\7U\2\2\u0183\u0184\7G\2\2\u0184\u0185\7S\2\2\u0185\u0186\7W\2\2\u0186"+
		"\u0187\7G\2\2\u0187\u0188\7P\2\2\u0188\u0189\7E\2\2\u0189\u018a\7G\2\2"+
		"\u018aF\3\2\2\2\u018b\u018c\7Q\2\2\u018c\u018d\7R\2\2\u018d\u018e\7V\2"+
		"\2\u018e\u018f\7K\2\2\u018f\u0190\7Q\2\2\u0190\u0191\7P\2\2\u0191\u0192"+
		"\7C\2\2\u0192\u0193\7N\2\2\u0193H\3\2\2\2\u0194\u0195\7F\2\2\u0195\u0196"+
		"\7G\2\2\u0196\u0197\7H\2\2\u0197\u0198\7C\2\2\u0198\u0199\7W\2\2\u0199"+
		"\u019a\7N\2\2\u019a\u019b\7V\2\2\u019bJ\3\2\2\2\u019c\u019d\7E\2\2\u019d"+
		"\u019e\7Q\2\2\u019e\u019f\7O\2\2\u019f\u01a0\7R\2\2\u01a0\u01a1\7Q\2\2"+
		"\u01a1\u01a2\7P\2\2\u01a2\u01a3\7G\2\2\u01a3\u01a4\7P\2\2\u01a4\u01a5"+
		"\7V\2\2\u01a5\u01a6\7U\2\2\u01a6L\3\2\2\2\u01a7\u01a8\7Q\2\2\u01a8\u01a9"+
		"\7H\2\2\u01a9N\3\2\2\2\u01aa\u01ab\7U\2\2\u01ab\u01ac\7G\2\2\u01ac\u01ad"+
		"\7V\2\2\u01adP\3\2\2\2\u01ae\u01af\7#\2\2\u01afR\3\2\2\2\u01b0\u01b1\7"+
		"C\2\2\u01b1\u01b2\7N\2\2\u01b2\u01b3\7N\2\2\u01b3T\3\2\2\2\u01b4\u01b5"+
		"\7G\2\2\u01b5\u01b6\7Z\2\2\u01b6\u01b7\7E\2\2\u01b7\u01b8\7G\2\2\u01b8"+
		"\u01b9\7R\2\2\u01b9\u01ba\7V\2\2\u01baV\3\2\2\2\u01bb\u01bc\7`\2\2\u01bc"+
		"X\3\2\2\2\u01bd\u01be\7~\2\2\u01beZ\3\2\2\2\u01bf\u01c0\7W\2\2\u01c0\u01c1"+
		"\7P\2\2\u01c1\u01c2\7K\2\2\u01c2\u01c3\7Q\2\2\u01c3\u01c4\7P\2\2\u01c4"+
		"\\\3\2\2\2\u01c5\u01c6\7K\2\2\u01c6\u01c7\7P\2\2\u01c7\u01c8\7V\2\2\u01c8"+
		"\u01c9\7G\2\2\u01c9\u01ca\7T\2\2\u01ca\u01cb\7U\2\2\u01cb\u01cc\7G\2\2"+
		"\u01cc\u01cd\7E\2\2\u01cd\u01ce\7V\2\2\u01ce\u01cf\7K\2\2\u01cf\u01d0"+
		"\7Q\2\2\u01d0\u01d1\7P\2\2\u01d1^\3\2\2\2\u01d2\u01d3\7K\2\2\u01d3\u01d4"+
		"\7P\2\2\u01d4\u01d5\7E\2\2\u01d5\u01d6\7N\2\2\u01d6\u01d7\7W\2\2\u01d7"+
		"\u01d8\7F\2\2\u01d8\u01d9\7G\2\2\u01d9\u01da\7U\2\2\u01da`\3\2\2\2\u01db"+
		"\u01dc\7O\2\2\u01dc\u01dd\7K\2\2\u01dd\u01de\7P\2\2\u01deb\3\2\2\2\u01df"+
		"\u01e0\7O\2\2\u01e0\u01e1\7C\2\2\u01e1\u01e2\7Z\2\2\u01e2d\3\2\2\2\u01e3"+
		"\u01e4\7U\2\2\u01e4\u01e5\7K\2\2\u01e5\u01e6\7\\\2\2\u01e6\u01e7\7G\2"+
		"\2\u01e7f\3\2\2\2\u01e8\u01e9\7H\2\2\u01e9\u01ea\7T\2\2\u01ea\u01eb\7"+
		"Q\2\2\u01eb\u01ec\7O\2\2\u01ech\3\2\2\2\u01ed\u01ee\7Y\2\2\u01ee\u01ef"+
		"\7K\2\2\u01ef\u01f0\7V\2\2\u01f0\u01f1\7J\2\2\u01f1j\3\2\2\2\u01f2\u01f3"+
		"\7E\2\2\u01f3\u01f4\7Q\2\2\u01f4\u01f5\7O\2\2\u01f5\u01f6\7R\2\2\u01f6"+
		"\u01f7\7Q\2\2\u01f7\u01f8\7P\2\2\u01f8\u01f9\7G\2\2\u01f9\u01fa\7P\2\2"+
		"\u01fa\u01fb\7V\2\2\u01fbl\3\2\2\2\u01fc\u01fd\7R\2\2\u01fd\u01fe\7T\2"+
		"\2\u01fe\u01ff\7G\2\2\u01ff\u0200\7U\2\2\u0200\u0201\7G\2\2\u0201\u0202"+
		"\7P\2\2\u0202\u0203\7V\2\2\u0203n\3\2\2\2\u0204\u0205\7C\2\2\u0205\u0206"+
		"\7D\2\2\u0206\u0207\7U\2\2\u0207\u0208\7G\2\2\u0208\u0209\7P\2\2\u0209"+
		"\u020a\7V\2\2\u020ap\3\2\2\2\u020b\u020c\7R\2\2\u020c\u020d\7C\2\2\u020d"+
		"\u020e\7V\2\2\u020e\u020f\7V\2\2\u020f\u0210\7G\2\2\u0210\u0211\7T\2\2"+
		"\u0211\u0212\7P\2\2\u0212r\3\2\2\2\u0213\u0214\7V\2\2\u0214\u0215\7[\2"+
		"\2\u0215\u0216\7R\2\2\u0216\u0217\7G\2\2\u0217\u0218\7/\2\2\u0218\u0219"+
		"\7K\2\2\u0219\u021a\7f\2\2\u021a\u021b\7g\2\2\u021b\u021c\7p\2\2\u021c"+
		"\u021d\7v\2\2\u021d\u021e\7k\2\2\u021e\u021f\7h\2\2\u021f\u0220\7k\2\2"+
		"\u0220\u0221\7g\2\2\u0221\u0222\7t\2\2\u0222t\3\2\2\2\u0223\u0224\7C\2"+
		"\2\u0224\u0225\7D\2\2\u0225\u0226\7U\2\2\u0226\u0227\7V\2\2\u0227\u0228"+
		"\7T\2\2\u0228\u0229\7C\2\2\u0229\u022a\7E\2\2\u022a\u022b\7V\2\2\u022b"+
		"\u022c\7/\2\2\u022c\u022d\7U\2\2\u022d\u022e\7[\2\2\u022e\u022f\7P\2\2"+
		"\u022f\u0230\7V\2\2\u0230\u0231\7C\2\2\u0231\u0232\7Z\2\2\u0232v\3\2\2"+
		"\2\u0233\u0234\7E\2\2\u0234\u0235\7N\2\2\u0235\u0236\7C\2\2\u0236\u0237"+
		"\7U\2\2\u0237\u0238\7U\2\2\u0238x\3\2\2\2\u0239\u023a\7W\2\2\u023a\u023b"+
		"\7P\2\2\u023b\u023c\7K\2\2\u023c\u023d\7S\2\2\u023d\u023e\7W\2\2\u023e"+
		"\u023f\7G\2\2\u023fz\3\2\2\2\u0240\u0241\7U\2\2\u0241\u0242\7[\2\2\u0242"+
		"\u0243\7P\2\2\u0243\u0244\7V\2\2\u0244\u0245\7C\2\2\u0245\u0246\7Z\2\2"+
		"\u0246|\3\2\2\2\u0247\u0248\7]\2\2\u0248~\3\2\2\2\u0249\u024a\7_\2\2\u024a"+
		"\u0080\3\2\2\2\u024b\u024c\7K\2\2\u024c\u024d\7P\2\2\u024d\u024e\7U\2"+
		"\2\u024e\u024f\7V\2\2\u024f\u0250\7C\2\2\u0250\u0251\7P\2\2\u0251\u0252"+
		"\7E\2\2\u0252\u0253\7G\2\2\u0253\u0082\3\2\2\2\u0254\u0255\7=\2\2\u0255"+
		"\u0084\3\2\2\2\u0256\u0257\7K\2\2\u0257\u0258\7O\2\2\u0258\u0259\7R\2"+
		"\2\u0259\u025a\7Q\2\2\u025a\u025b\7T\2\2\u025b\u025c\7V\2\2\u025c\u025d"+
		"\7U\2\2\u025d\u0086\3\2\2\2\u025e\u025f\7G\2\2\u025f\u0260\7Z\2\2\u0260"+
		"\u0261\7R\2\2\u0261\u0262\7Q\2\2\u0262\u0263\7T\2\2\u0263\u0264\7V\2\2"+
		"\u0264\u0265\7U\2\2\u0265\u0088\3\2\2\2\u0266\u0267\7G\2\2\u0267\u0268"+
		"\7Z\2\2\u0268\u0269\7V\2\2\u0269\u026a\7G\2\2\u026a\u026b\7P\2\2\u026b"+
		"\u026c\7U\2\2\u026c\u026d\7K\2\2\u026d\u026e\7D\2\2\u026e\u026f\7K\2\2"+
		"\u026f\u0270\7N\2\2\u0270\u0271\7K\2\2\u0271\u0272\7V\2\2\u0272\u0273"+
		"\7[\2\2\u0273\u008a\3\2\2\2\u0274\u0275\7K\2\2\u0275\u0276\7O\2\2\u0276"+
		"\u0277\7R\2\2\u0277\u0278\7N\2\2\u0278\u0279\7K\2\2\u0279\u027a\7G\2\2"+
		"\u027a\u027b\7F\2\2\u027b\u008c\3\2\2\2\u027c\u027d\7G\2\2\u027d\u027e"+
		"\7Z\2\2\u027e\u027f\7R\2\2\u027f\u0280\7N\2\2\u0280\u0281\7K\2\2\u0281"+
		"\u0282\7E\2\2\u0282\u0283\7K\2\2\u0283\u0284\7V\2\2\u0284\u008e\3\2\2"+
		"\2\u0285\u0286\7V\2\2\u0286\u0287\7C\2\2\u0287\u0288\7I\2\2\u0288\u0289"+
		"\7U\2\2\u0289\u0090\3\2\2\2\u028a\u028b\7K\2\2\u028b\u028c\7O\2\2\u028c"+
		"\u028d\7R\2\2\u028d\u028e\7N\2\2\u028e\u028f\7K\2\2\u028f\u0290\7E\2\2"+
		"\u0290\u0291\7K\2\2\u0291\u0292\7V\2\2\u0292\u0092\3\2\2\2\u0293\u0294"+
		"\7C\2\2\u0294\u0295\7W\2\2\u0295\u0296\7V\2\2\u0296\u0297\7Q\2\2\u0297"+
		"\u0298\7O\2\2\u0298\u0299\7C\2\2\u0299\u029a\7V\2\2\u029a\u029b\7K\2\2"+
		"\u029b\u029c\7E\2\2\u029c\u0094\3\2\2\2\u029d\u029e\7F\2\2\u029e\u029f"+
		"\7G\2\2\u029f\u02a0\7H\2\2\u02a0\u02a1\7K\2\2\u02a1\u02a2\7P\2\2\u02a2"+
		"\u02a3\7K\2\2\u02a3\u02a4\7V\2\2\u02a4\u02a5\7K\2\2\u02a5\u02a6\7Q\2\2"+
		"\u02a6\u02a7\7P\2\2\u02a7\u02a8\7U\2\2\u02a8\u0096\3\2\2\2\u02a9\u02aa"+
		"\7D\2\2\u02aa\u02ab\7G\2\2\u02ab\u02ac\7I\2\2\u02ac\u02ad\7K\2\2\u02ad"+
		"\u02ae\7P\2\2\u02ae\u0098\3\2\2\2\u02af\u02b0\7G\2\2\u02b0\u02b1\7P\2"+
		"\2\u02b1\u02b2\7F\2\2\u02b2\u009a\3\2\2\2\u02b3\u02b4\7]\2\2\u02b4\u02b5"+
		"\7]\2\2\u02b5\u009c\3\2\2\2\u02b6\u02b7\7_\2\2\u02b7\u02b8\7_\2\2\u02b8"+
		"\u009e\3\2\2\2\u02b9\u02ba\7<\2\2\u02ba\u00a0\3\2\2\2\u02bb\u02bc\7E\2"+
		"\2\u02bc\u02bd\7J\2\2\u02bd\u02be\7Q\2\2\u02be\u02bf\7K\2\2\u02bf\u02c0"+
		"\7E\2\2\u02c0\u02c1\7G\2\2\u02c1\u00a2\3\2\2\2\u02c2\u02c3\7W\2\2\u02c3"+
		"\u02c4\7P\2\2\u02c4\u02c5\7K\2\2\u02c5\u02c6\7X\2\2\u02c6\u02c7\7G\2\2"+
		"\u02c7\u02c8\7T\2\2\u02c8\u02c9\7U\2\2\u02c9\u02ca\7C\2\2\u02ca\u02cb"+
		"\7N\2\2\u02cb\u00a4\3\2\2\2\u02cc\u02cd\7C\2\2\u02cd\u02ce\7R\2\2\u02ce"+
		"\u02cf\7R\2\2\u02cf\u02d0\7N\2\2\u02d0\u02d1\7K\2\2\u02d1\u02d2\7E\2\2"+
		"\u02d2\u02d3\7C\2\2\u02d3\u02d4\7V\2\2\u02d4\u02d5\7K\2\2\u02d5\u02d6"+
		"\7Q\2\2\u02d6\u02d7\7P\2\2\u02d7\u00a6\3\2\2\2\u02d8\u02d9\7R\2\2\u02d9"+
		"\u02da\7T\2\2\u02da\u02db\7K\2\2\u02db\u02dc\7X\2\2\u02dc\u02dd\7C\2\2"+
		"\u02dd\u02de\7V\2\2\u02de\u02df\7G\2\2\u02df\u00a8\3\2\2\2\u02e0\u02e1"+
		"\7G\2\2\u02e1\u02e2\7O\2\2\u02e2\u02e3\7D\2\2\u02e3\u02e4\7G\2\2\u02e4"+
		"\u02e5\7F\2\2\u02e5\u02e6\7F\2\2\u02e6\u02e7\7G\2\2\u02e7\u02e8\7F\2\2"+
		"\u02e8\u00aa\3\2\2\2\u02e9\u02ea\7R\2\2\u02ea\u02eb\7F\2\2\u02eb\u02ec"+
		"\7X\2\2\u02ec\u00ac\3\2\2\2\u02ed\u02ee\7G\2\2\u02ee\u02ef\7Z\2\2\u02ef"+
		"\u02f0\7V\2\2\u02f0\u02f1\7G\2\2\u02f1\u02f2\7T\2\2\u02f2\u02f3\7P\2\2"+
		"\u02f3\u02f4\7C\2\2\u02f4\u02f5\7N\2\2\u02f5\u00ae\3\2\2\2\u02f6\u02f7"+
		"\7Q\2\2\u02f7\u02f8\7D\2\2\u02f8\u02f9\7L\2\2\u02f9\u02fa\7G\2\2\u02fa"+
		"\u02fb\7E\2\2\u02fb\u02fc\7V\2\2\u02fc\u00b0\3\2\2\2\u02fd\u02fe\7K\2"+
		"\2\u02fe\u02ff\7F\2\2\u02ff\u0300\7G\2\2\u0300\u0301\7P\2\2\u0301\u0302"+
		"\7V\2\2\u0302\u0303\7K\2\2\u0303\u0304\7H\2\2\u0304\u0305\7K\2\2\u0305"+
		"\u0306\7G\2\2\u0306\u0307\7T\2\2\u0307\u00b2\3\2\2\2\u0308\u0309\7T\2"+
		"\2\u0309\u030a\7G\2\2\u030a\u030b\7N\2\2\u030b\u030c\7C\2\2\u030c\u030d"+
		"\7V\2\2\u030d\u030e\7K\2\2\u030e\u030f\7X\2\2\u030f\u0310\7G\2\2\u0310"+
		"\u0311\7/\2\2\u0311\u0312\7Q\2\2\u0312\u0313\7K\2\2\u0313\u0314\7F\2\2"+
		"\u0314\u00b4\3\2\2\2\u0315\u0316\7E\2\2\u0316\u0317\7J\2\2\u0317\u0318"+
		"\7C\2\2\u0318\u0319\7T\2\2\u0319\u031a\7C\2\2\u031a\u031b\7E\2\2\u031b"+
		"\u031c\7V\2\2\u031c\u031d\7G\2\2\u031d\u031e\7T\2\2\u031e\u00b6\3\2\2"+
		"\2\u031f\u0320\7E\2\2\u0320\u0321\7Q\2\2\u0321\u0322\7P\2\2\u0322\u0323"+
		"\7U\2\2\u0323\u0324\7V\2\2\u0324\u0325\7T\2\2\u0325\u0326\7C\2\2\u0326"+
		"\u0327\7K\2\2\u0327\u0328\7P\2\2\u0328\u0329\7G\2\2\u0329\u032a\7F\2\2"+
		"\u032a\u00b8\3\2\2\2\u032b\u032c\7D\2\2\u032c\u032d\7[\2\2\u032d\u00ba"+
		"\3\2\2\2\u032e\u032f\7B\2\2\u032f\u0330\7\60\2\2\u0330\u00bc\3\2\2\2\u0331"+
		"\u0332\7G\2\2\u0332\u0333\7P\2\2\u0333\u0334\7E\2\2\u0334\u0335\7Q\2\2"+
		"\u0335\u0336\7F\2\2\u0336\u0337\7G\2\2\u0337\u0338\7F\2\2\u0338\u00be"+
		"\3\2\2\2\u0339\u033a\7/\2\2\u033a\u033b\7/\2\2\u033b\u00c0\3\2\2\2\u033c"+
		"\u033d\5\u00b5[\2\u033d\u033e\5=\37\2\u033e\u00c2\3\2\2\2\u033f\u0340"+
		"\5+\26\2\u0340\u0341\5\23\n\2\u0341\u00c4\3\2\2\2\u0342\u0343\4\62;\2"+
		"\u0343\u00c6\3\2\2\2\u0344\u0345\4C\\\2\u0345\u00c8\3\2\2\2\u0346\u0347"+
		"\4c|\2\u0347\u00ca\3\2\2\2\u0348\u034a\5\u00c5c\2\u0349\u0348\3\2\2\2"+
		"\u034a\u034b\3\2\2\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u00cc"+
		"\3\2\2\2\u034d\u034e\t\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350\bg\2\2\u0350"+
		"\u00ce\3\2\2\2\u0351\u0353\t\3\2\2\u0352\u0354\t\4\2\2\u0353\u0352\3\2"+
		"\2\2\u0353\u0354\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\5\u00cbf\2\u0356"+
		"\u00d0\3\2\2\2\u0357\u0358\7/\2\2\u0358\u0359\7/\2\2\u0359\u035d\3\2\2"+
		"\2\u035a\u035c\n\5\2\2\u035b\u035a\3\2\2\2\u035c\u035f\3\2\2\2\u035d\u035b"+
		"\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u0361\3\2\2\2\u035f\u035d\3\2\2\2\u0360"+
		"\u0362\7\17\2\2\u0361\u0360\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0363\3"+
		"\2\2\2\u0363\u0364\7\f\2\2\u0364\u0365\3\2\2\2\u0365\u0366\bi\2\2\u0366"+
		"\u00d2\3\2\2\2\u0367\u036b\5\25\13\2\u0368\u036a\4\62\63\2\u0369\u0368"+
		"\3\2\2\2\u036a\u036d\3\2\2\2\u036b\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c"+
		"\u036e\3\2\2\2\u036d\u036b\3\2\2\2\u036e\u036f\7)\2\2\u036f\u0370\7D\2"+
		"\2\u0370\u00d4\3\2\2\2\u0371\u0374\5\u00c5c\2\u0372\u0374\t\6\2\2\u0373"+
		"\u0371\3\2\2\2\u0373\u0372\3\2\2\2\u0374\u00d6\3\2\2\2\u0375\u0379\5\25"+
		"\13\2\u0376\u0378\5\u00d5k\2\u0377\u0376\3\2\2\2\u0378\u037b\3\2\2\2\u0379"+
		"\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037c\3\2\2\2\u037b\u0379\3\2"+
		"\2\2\u037c\u037d\7)\2\2\u037d\u037e\7J\2\2\u037e\u00d8\3\2\2\2\u037f\u0384"+
		"\7$\2\2\u0380\u0383\5\u00dbn\2\u0381\u0383\n\7\2\2\u0382\u0380\3\2\2\2"+
		"\u0382\u0381\3\2\2\2\u0383\u0386\3\2\2\2\u0384\u0382\3\2\2\2\u0384\u0385"+
		"\3\2\2\2\u0385\u0387\3\2\2\2\u0386\u0384\3\2\2\2\u0387\u0388\7$\2\2\u0388"+
		"\u00da\3\2\2\2\u0389\u038d\7^\2\2\u038a\u038e\t\b\2\2\u038b\u038e\5\25"+
		"\13\2\u038c\u038e\7^\2\2\u038d\u038a\3\2\2\2\u038d\u038b\3\2\2\2\u038d"+
		"\u038c\3\2\2\2\u038e\u00dc\3\2\2\2\u038f\u0390\t\t\2\2\u0390\u00de\3\2"+
		"\2\2\u0391\u0392\t\n\2\2\u0392\u00e0\3\2\2\2\u0393\u0398\5\u00ddo\2\u0394"+
		"\u0397\5\u00ddo\2\u0395\u0397\5\u00dfp\2\u0396\u0394\3\2\2\2\u0396\u0395"+
		"\3\2\2\2\u0397\u039a\3\2\2\2\u0398\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399"+
		"\u00e2\3\2\2\2\u039a\u0398\3\2\2\2\17\2\u034b\u0353\u035d\u0361\u036b"+
		"\u0373\u0379\u0382\u0384\u038d\u0396\u0398\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}