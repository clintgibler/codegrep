// Generated from informix/informix.g4 by ANTLR 4.7.1
package parsers.informix;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class informixParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ABSOLUTE=1, AFTER=2, ACCEPT=3, AGGREGATE=4, ALLOCATE=5, ALL=6, ALL_ROWS=7, 
		AND=8, ANY=9, AS=10, ASC=11, ASCII=12, AT=13, ATTRIBUTE=14, ATTRIBUTES=15, 
		AVERAGE=16, AVG=17, ARRAY=18, BEFORE=19, BEGIN=20, BETWEEN=21, BIGINT=22, 
		BLACK=23, BLINK=24, BLUE=25, BOLD=26, BORDER=27, BOTTOM=28, BUFFERED=29, 
		BY=30, BYTE=31, CACHE=32, CALL=33, CASE=34, CHAR=35, CHARARACTER=36, CHAR_LENGTH=37, 
		CHECK=38, CLEAR=39, CLIPPED=40, CLOSE=41, CLUSTER=42, COLUMN=43, COLUMNS=44, 
		COMMAND=45, COMMENT=46, COMMIT=47, COMMITTED=48, CONSTANT=49, CONSTRAINED=50, 
		CONSTRAINT=51, CONSTRUCT=52, CONTINUE=53, COUNT=54, COPY=55, CRCOLS=56, 
		CREATE=57, CURRENT=58, CURSOR=59, CYAN=60, DATABASE=61, DATE=62, DATETIME=63, 
		DAY=64, DEALLOCATE=65, DEC=66, DECIMAL=67, DECODE=68, DECLARE=69, DEFAULT=70, 
		DEFAULTS=71, DEFER=72, DEFINE=73, DELETE=74, DELIMITER=75, DESC=76, DIM=77, 
		DIMENSIONS=78, DIRTY=79, DISPLAY=80, DISTINCT=81, DO=82, DOUBLE=83, DOWN=84, 
		DROP=85, DYNAMIC=86, ELSE=87, END=88, ERROR=89, ESCAPE=90, EVERY=91, EXCLUSIVE=92, 
		EXEC=93, EXECUTE=94, EXIT=95, EXISTS=96, EXPLAIN=97, EXTEND=98, EXTENT=99, 
		EXTERNAL=100, FALSE=101, FETCH=102, FIELD=103, FIELD_TOUCHED=104, FILE=105, 
		FINISH=106, FIRST=107, FIRST_ROWS=108, FLOAT=109, FLUSH=110, FOR=111, 
		FORM=112, FORMAT=113, FORMONLY=114, FOREACH=115, FOUND=116, FRACTION=117, 
		FREE=118, FROM=119, FUNCTION=120, GET_FLDBUF=121, GLOBALS=122, GO=123, 
		GOTO=124, GREEN=125, GROUP=126, HAVING=127, HEADER=128, HELP=129, HIDE=130, 
		HOLD=131, HOUR=132, IF=133, IN=134, INNER=135, INDEX=136, INDICATOR=137, 
		INFIELD=138, INITIALIZE=139, INPUT=140, INSERT=141, INSTRUCTIONS=142, 
		INTO=143, INT=144, INT_FLAG=145, INTEGER=146, INTERRUPT=147, INTERVAL=148, 
		INVISIBLE=149, IS=150, ISNULL=151, ISOLATION=152, JOIN=153, KEY=154, LABEL=155, 
		LAST=156, LEFT=157, LENGTH=158, LET=159, LIKE=160, LINE=161, LINENO=162, 
		LINES=163, LOAD=164, LOCATE=165, LOCK=166, LOG=167, LONG=168, MAGENTA=169, 
		MATCHES=170, MENU=171, MESSAGE=172, MAIN=173, MARGIN=174, MAX=175, MDY=176, 
		MIN=177, MINUTE=178, MOD=179, MODE=180, MODULE=181, MONTH=182, MONEY=183, 
		NCHAR=184, NAME=185, NEED=186, NEXT=187, NEW=188, NORMAL=189, NO=190, 
		NOT=191, NOTFOUND=192, NOW=193, NUMERIC=194, NULL=195, NVARCHAR=196, NVL=197, 
		OF=198, OFF=199, ON=200, OPEN=201, OPTION=202, OPTIONS=203, OR=204, ORD=205, 
		ORDER=206, OUTPUT=207, OUTER=208, OTHERWISE=209, PAGE=210, PAGENO=211, 
		PAUSE=212, PERCENT=213, PIPE=214, PRECISION=215, PREPARE=216, PREVIOUS=217, 
		PRINT=218, PRINTER=219, PROGRAM=220, PROMPT=221, PUT=222, QUIT=223, QUIT_FLAG=224, 
		RECORD=225, REAL=226, READ=227, RED=228, RELATIVE=229, REMOVE=230, REOPTIMIZATION=231, 
		REPEATABLE=232, REPEAT=233, REPORT=234, RESIZE=235, RETURN=236, RETURNING=237, 
		REVERSE=238, RIGHT=239, ROLLBACK=240, ROW=241, ROWS=242, RUN=243, SCREEN=244, 
		SCROLL=245, SECOND=246, SKIP2=247, SELECT=248, SET=249, SHARE=250, SHOW=251, 
		SIZE=252, SLEEP=253, SMALLFLOAT=254, SMALLINT=255, SPACE=256, SPACES=257, 
		SQL=258, SQLERROR=259, SQLWARNING=260, START=261, STABILITY=262, STATISTICS=263, 
		STATUS=264, STOP=265, SUM=266, TABLE=267, TABLES=268, TERMINATE=269, TEMP=270, 
		TEXT=271, THEN=272, THROUGH=273, THRU=274, TIME=275, TO=276, TODAY=277, 
		TOP=278, TRAILER=279, TRUE=280, TYPE=281, UNCONSTRAINED=282, UNDERLINE=283, 
		UNION=284, UNIQUE=285, UNITS=286, UNLOAD=287, UP=288, UPDATE=289, USER=290, 
		USING=291, VALIDATE=292, VALUES=293, VARCHAR=294, WEEKDAY=295, VIEW=296, 
		WAIT=297, WAITING=298, WARNING=299, WHEN=300, WHENEVER=301, WHERE=302, 
		WHILE=303, WHITE=304, WITH=305, WITHOUT=306, WINDOW=307, WORDWRAP=308, 
		WORK=309, YEAR=310, YELLOW=311, PLUS=312, MINUS=313, STAR=314, SLASH=315, 
		COMMA=316, SEMI=317, COLON=318, EQUAL=319, NOT_EQUAL=320, LT=321, LE=322, 
		GE=323, GT=324, LPAREN=325, RPAREN=326, LBRACK=327, RBRACK=328, DOT=329, 
		ATSYMBOL=330, DOUBLEVERTBAR=331, IDENT=332, STRING_LITERAL=333, NUM_INT=334, 
		NUM_REAL=335, HEX_DIGIT=336, SL_COMMENT=337, SL_COMMENT_2=338, EOL=339, 
		WS=340, CHARACTER=341, ESC=342, QUOTED_STRING=343, DIV=344, STEP=345, 
		MEMORY=346, SAME=347, WRAP=348, PRIOR=349, SECONDS=350;
	public static final int
		RULE_compilation_unit = 0, RULE_identifier = 1, RULE_mainBlock = 2, RULE_mainStatements = 3, 
		RULE_deferStatement = 4, RULE_functionOrReportDefinitions = 5, RULE_returnStatement = 6, 
		RULE_functionDefinition = 7, RULE_parameterList = 8, RULE_parameterGroup = 9, 
		RULE_globalDeclaration = 10, RULE_typeDeclarations = 11, RULE_typeDeclaration = 12, 
		RULE_variableDeclaration = 13, RULE_type = 14, RULE_indirectType = 15, 
		RULE_typeIdentifier = 16, RULE_largeType = 17, RULE_numberType = 18, RULE_charType = 19, 
		RULE_timeType = 20, RULE_datetimeQualifier = 21, RULE_intervalQualifier = 22, 
		RULE_unitType = 23, RULE_yearQualifier = 24, RULE_monthQualifier = 25, 
		RULE_dayQualifier = 26, RULE_hourQualifier = 27, RULE_minuteQualifier = 28, 
		RULE_secondQualifier = 29, RULE_fractionQualifier = 30, RULE_structuredType = 31, 
		RULE_recordType = 32, RULE_arrayIndexer = 33, RULE_arrayType = 34, RULE_dynArrayType = 35, 
		RULE_string = 36, RULE_statement = 37, RULE_codeBlock = 38, RULE_label = 39, 
		RULE_unlabelledStatement = 40, RULE_simpleStatement = 41, RULE_runStatement = 42, 
		RULE_assignmentStatement = 43, RULE_procedureStatement = 44, RULE_procedureIdentifier = 45, 
		RULE_actualParameter = 46, RULE_gotoStatement = 47, RULE_condition = 48, 
		RULE_logicalTerm = 49, RULE_logicalFactor = 50, RULE_quantifiedFactor = 51, 
		RULE_expressionSet = 52, RULE_subquery = 53, RULE_sqlExpression = 54, 
		RULE_sqlAlias = 55, RULE_sqlTerm = 56, RULE_sqlMultiply = 57, RULE_sqlFactor = 58, 
		RULE_sqlFactor2 = 59, RULE_sqlExpressionList = 60, RULE_sqlLiteral = 61, 
		RULE_sqlVariable = 62, RULE_sqlFunction = 63, RULE_dateFunction = 64, 
		RULE_numberFunction = 65, RULE_charFunction = 66, RULE_groupFunction = 67, 
		RULE_otherFunction = 68, RULE_sqlPseudoColumn = 69, RULE_relationalOperator = 70, 
		RULE_ifCondition = 71, RULE_ifCondition2 = 72, RULE_ifLogicalTerm = 73, 
		RULE_expression = 74, RULE_ifLogicalFactor = 75, RULE_simpleExpression = 76, 
		RULE_addingOperator = 77, RULE_term = 78, RULE_multiplyingOperator = 79, 
		RULE_factor = 80, RULE_functionDesignator = 81, RULE_functionIdentifier = 82, 
		RULE_unsignedConstant = 83, RULE_constant = 84, RULE_numericConstant = 85, 
		RULE_variable = 86, RULE_entireVariable = 87, RULE_variableIdentifier = 88, 
		RULE_indexingVariable = 89, RULE_componentVariable = 90, RULE_recordVariable = 91, 
		RULE_fieldIdentifier = 92, RULE_structuredStatement = 93, RULE_conditionalStatement = 94, 
		RULE_ifStatement = 95, RULE_repetetiveStatement = 96, RULE_whileStatement = 97, 
		RULE_forStatement = 98, RULE_forList = 99, RULE_controlVariable = 100, 
		RULE_initialValue = 101, RULE_finalValue = 102, RULE_forEachStatement = 103, 
		RULE_variableList = 104, RULE_variableOrConstantList = 105, RULE_caseStatement = 106, 
		RULE_otherFGLStatement = 107, RULE_otherProgramFlowStatement = 108, RULE_exitTypes = 109, 
		RULE_exitStatements = 110, RULE_continueStatements = 111, RULE_otherStorageStatement = 112, 
		RULE_printExpressionItem = 113, RULE_printExpressionList = 114, RULE_reportStatement = 115, 
		RULE_fieldName = 116, RULE_thruNotation = 117, RULE_fieldList = 118, RULE_keyList = 119, 
		RULE_constructEvents = 120, RULE_constructInsideStatement = 121, RULE_specialAttribute = 122, 
		RULE_attribute = 123, RULE_attributeList = 124, RULE_constructGroupStatement = 125, 
		RULE_constructStatement = 126, RULE_displayArrayStatement = 127, RULE_displayInsideStatement = 128, 
		RULE_displayEvents = 129, RULE_displayStatement = 130, RULE_errorStatement = 131, 
		RULE_messageStatement = 132, RULE_promptStatement = 133, RULE_inputEvents = 134, 
		RULE_inputInsideStatement = 135, RULE_inputGroupStatement = 136, RULE_inputStatement = 137, 
		RULE_inputArrayStatement = 138, RULE_menuEvents = 139, RULE_menuInsideStatement = 140, 
		RULE_menuGroupStatement = 141, RULE_menuStatement = 142, RULE_reservedLinePosition = 143, 
		RULE_specialWindowAttribute = 144, RULE_windowAttribute = 145, RULE_windowAttributeList = 146, 
		RULE_optionStatement = 147, RULE_optionsStatement = 148, RULE_screenStatement = 149, 
		RULE_sqlStatements = 150, RULE_cursorManipulationStatement = 151, RULE_columnsList = 152, 
		RULE_statementId = 153, RULE_cursorName = 154, RULE_dataType = 155, RULE_columnItem = 156, 
		RULE_dataDefinitionStatement = 157, RULE_dataManipulationStatement = 158, 
		RULE_sqlSelectStatement = 159, RULE_columnsTableId = 160, RULE_selectList = 161, 
		RULE_headSelectStatement = 162, RULE_tableQualifier = 163, RULE_tableIdentifier = 164, 
		RULE_fromTable = 165, RULE_tableExpression = 166, RULE_fromSelectStatement = 167, 
		RULE_aliasName = 168, RULE_mainSelectStatement = 169, RULE_unionSelectStatement = 170, 
		RULE_simpleSelectStatement = 171, RULE_whereStatement = 172, RULE_groupByStatement = 173, 
		RULE_havingStatement = 174, RULE_orderbyColumn = 175, RULE_orderbyStatement = 176, 
		RULE_sqlLoadStatement = 177, RULE_sqlUnLoadStatement = 178, RULE_sqlInsertStatement = 179, 
		RULE_sqlUpdateStatement = 180, RULE_sqlDeleteStatement = 181, RULE_actualParameterList = 182, 
		RULE_dynamicManagementStatement = 183, RULE_queryOptimizationStatement = 184, 
		RULE_databaseDeclaration = 185, RULE_clientServerStatement = 186, RULE_dataIntegrityStatement = 187, 
		RULE_wheneverStatement = 188, RULE_wheneverType = 189, RULE_wheneverFlow = 190, 
		RULE_reportDefinition = 191, RULE_outputReport = 192, RULE_formatReport = 193, 
		RULE_eol = 194, RULE_unsignedNumber = 195, RULE_unsignedInteger = 196, 
		RULE_unsignedReal = 197, RULE_sign = 198, RULE_constantIdentifier = 199;
	public static final String[] ruleNames = {
		"compilation_unit", "identifier", "mainBlock", "mainStatements", "deferStatement", 
		"functionOrReportDefinitions", "returnStatement", "functionDefinition", 
		"parameterList", "parameterGroup", "globalDeclaration", "typeDeclarations", 
		"typeDeclaration", "variableDeclaration", "type", "indirectType", "typeIdentifier", 
		"largeType", "numberType", "charType", "timeType", "datetimeQualifier", 
		"intervalQualifier", "unitType", "yearQualifier", "monthQualifier", "dayQualifier", 
		"hourQualifier", "minuteQualifier", "secondQualifier", "fractionQualifier", 
		"structuredType", "recordType", "arrayIndexer", "arrayType", "dynArrayType", 
		"string", "statement", "codeBlock", "label", "unlabelledStatement", "simpleStatement", 
		"runStatement", "assignmentStatement", "procedureStatement", "procedureIdentifier", 
		"actualParameter", "gotoStatement", "condition", "logicalTerm", "logicalFactor", 
		"quantifiedFactor", "expressionSet", "subquery", "sqlExpression", "sqlAlias", 
		"sqlTerm", "sqlMultiply", "sqlFactor", "sqlFactor2", "sqlExpressionList", 
		"sqlLiteral", "sqlVariable", "sqlFunction", "dateFunction", "numberFunction", 
		"charFunction", "groupFunction", "otherFunction", "sqlPseudoColumn", "relationalOperator", 
		"ifCondition", "ifCondition2", "ifLogicalTerm", "expression", "ifLogicalFactor", 
		"simpleExpression", "addingOperator", "term", "multiplyingOperator", "factor", 
		"functionDesignator", "functionIdentifier", "unsignedConstant", "constant", 
		"numericConstant", "variable", "entireVariable", "variableIdentifier", 
		"indexingVariable", "componentVariable", "recordVariable", "fieldIdentifier", 
		"structuredStatement", "conditionalStatement", "ifStatement", "repetetiveStatement", 
		"whileStatement", "forStatement", "forList", "controlVariable", "initialValue", 
		"finalValue", "forEachStatement", "variableList", "variableOrConstantList", 
		"caseStatement", "otherFGLStatement", "otherProgramFlowStatement", "exitTypes", 
		"exitStatements", "continueStatements", "otherStorageStatement", "printExpressionItem", 
		"printExpressionList", "reportStatement", "fieldName", "thruNotation", 
		"fieldList", "keyList", "constructEvents", "constructInsideStatement", 
		"specialAttribute", "attribute", "attributeList", "constructGroupStatement", 
		"constructStatement", "displayArrayStatement", "displayInsideStatement", 
		"displayEvents", "displayStatement", "errorStatement", "messageStatement", 
		"promptStatement", "inputEvents", "inputInsideStatement", "inputGroupStatement", 
		"inputStatement", "inputArrayStatement", "menuEvents", "menuInsideStatement", 
		"menuGroupStatement", "menuStatement", "reservedLinePosition", "specialWindowAttribute", 
		"windowAttribute", "windowAttributeList", "optionStatement", "optionsStatement", 
		"screenStatement", "sqlStatements", "cursorManipulationStatement", "columnsList", 
		"statementId", "cursorName", "dataType", "columnItem", "dataDefinitionStatement", 
		"dataManipulationStatement", "sqlSelectStatement", "columnsTableId", "selectList", 
		"headSelectStatement", "tableQualifier", "tableIdentifier", "fromTable", 
		"tableExpression", "fromSelectStatement", "aliasName", "mainSelectStatement", 
		"unionSelectStatement", "simpleSelectStatement", "whereStatement", "groupByStatement", 
		"havingStatement", "orderbyColumn", "orderbyStatement", "sqlLoadStatement", 
		"sqlUnLoadStatement", "sqlInsertStatement", "sqlUpdateStatement", "sqlDeleteStatement", 
		"actualParameterList", "dynamicManagementStatement", "queryOptimizationStatement", 
		"databaseDeclaration", "clientServerStatement", "dataIntegrityStatement", 
		"wheneverStatement", "wheneverType", "wheneverFlow", "reportDefinition", 
		"outputReport", "formatReport", "eol", "unsignedNumber", "unsignedInteger", 
		"unsignedReal", "sign", "constantIdentifier"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'+'", "'-'", "'*'", "'/'", "','", "';'", "':'", "'='", null, "'<'", "'<='", 
		"'>='", "'>'", "'('", "')'", "'['", "']'", "'.'", "'@'", "'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ABSOLUTE", "AFTER", "ACCEPT", "AGGREGATE", "ALLOCATE", "ALL", "ALL_ROWS", 
		"AND", "ANY", "AS", "ASC", "ASCII", "AT", "ATTRIBUTE", "ATTRIBUTES", "AVERAGE", 
		"AVG", "ARRAY", "BEFORE", "BEGIN", "BETWEEN", "BIGINT", "BLACK", "BLINK", 
		"BLUE", "BOLD", "BORDER", "BOTTOM", "BUFFERED", "BY", "BYTE", "CACHE", 
		"CALL", "CASE", "CHAR", "CHARARACTER", "CHAR_LENGTH", "CHECK", "CLEAR", 
		"CLIPPED", "CLOSE", "CLUSTER", "COLUMN", "COLUMNS", "COMMAND", "COMMENT", 
		"COMMIT", "COMMITTED", "CONSTANT", "CONSTRAINED", "CONSTRAINT", "CONSTRUCT", 
		"CONTINUE", "COUNT", "COPY", "CRCOLS", "CREATE", "CURRENT", "CURSOR", 
		"CYAN", "DATABASE", "DATE", "DATETIME", "DAY", "DEALLOCATE", "DEC", "DECIMAL", 
		"DECODE", "DECLARE", "DEFAULT", "DEFAULTS", "DEFER", "DEFINE", "DELETE", 
		"DELIMITER", "DESC", "DIM", "DIMENSIONS", "DIRTY", "DISPLAY", "DISTINCT", 
		"DO", "DOUBLE", "DOWN", "DROP", "DYNAMIC", "ELSE", "END", "ERROR", "ESCAPE", 
		"EVERY", "EXCLUSIVE", "EXEC", "EXECUTE", "EXIT", "EXISTS", "EXPLAIN", 
		"EXTEND", "EXTENT", "EXTERNAL", "FALSE", "FETCH", "FIELD", "FIELD_TOUCHED", 
		"FILE", "FINISH", "FIRST", "FIRST_ROWS", "FLOAT", "FLUSH", "FOR", "FORM", 
		"FORMAT", "FORMONLY", "FOREACH", "FOUND", "FRACTION", "FREE", "FROM", 
		"FUNCTION", "GET_FLDBUF", "GLOBALS", "GO", "GOTO", "GREEN", "GROUP", "HAVING", 
		"HEADER", "HELP", "HIDE", "HOLD", "HOUR", "IF", "IN", "INNER", "INDEX", 
		"INDICATOR", "INFIELD", "INITIALIZE", "INPUT", "INSERT", "INSTRUCTIONS", 
		"INTO", "INT", "INT_FLAG", "INTEGER", "INTERRUPT", "INTERVAL", "INVISIBLE", 
		"IS", "ISNULL", "ISOLATION", "JOIN", "KEY", "LABEL", "LAST", "LEFT", "LENGTH", 
		"LET", "LIKE", "LINE", "LINENO", "LINES", "LOAD", "LOCATE", "LOCK", "LOG", 
		"LONG", "MAGENTA", "MATCHES", "MENU", "MESSAGE", "MAIN", "MARGIN", "MAX", 
		"MDY", "MIN", "MINUTE", "MOD", "MODE", "MODULE", "MONTH", "MONEY", "NCHAR", 
		"NAME", "NEED", "NEXT", "NEW", "NORMAL", "NO", "NOT", "NOTFOUND", "NOW", 
		"NUMERIC", "NULL", "NVARCHAR", "NVL", "OF", "OFF", "ON", "OPEN", "OPTION", 
		"OPTIONS", "OR", "ORD", "ORDER", "OUTPUT", "OUTER", "OTHERWISE", "PAGE", 
		"PAGENO", "PAUSE", "PERCENT", "PIPE", "PRECISION", "PREPARE", "PREVIOUS", 
		"PRINT", "PRINTER", "PROGRAM", "PROMPT", "PUT", "QUIT", "QUIT_FLAG", "RECORD", 
		"REAL", "READ", "RED", "RELATIVE", "REMOVE", "REOPTIMIZATION", "REPEATABLE", 
		"REPEAT", "REPORT", "RESIZE", "RETURN", "RETURNING", "REVERSE", "RIGHT", 
		"ROLLBACK", "ROW", "ROWS", "RUN", "SCREEN", "SCROLL", "SECOND", "SKIP2", 
		"SELECT", "SET", "SHARE", "SHOW", "SIZE", "SLEEP", "SMALLFLOAT", "SMALLINT", 
		"SPACE", "SPACES", "SQL", "SQLERROR", "SQLWARNING", "START", "STABILITY", 
		"STATISTICS", "STATUS", "STOP", "SUM", "TABLE", "TABLES", "TERMINATE", 
		"TEMP", "TEXT", "THEN", "THROUGH", "THRU", "TIME", "TO", "TODAY", "TOP", 
		"TRAILER", "TRUE", "TYPE", "UNCONSTRAINED", "UNDERLINE", "UNION", "UNIQUE", 
		"UNITS", "UNLOAD", "UP", "UPDATE", "USER", "USING", "VALIDATE", "VALUES", 
		"VARCHAR", "WEEKDAY", "VIEW", "WAIT", "WAITING", "WARNING", "WHEN", "WHENEVER", 
		"WHERE", "WHILE", "WHITE", "WITH", "WITHOUT", "WINDOW", "WORDWRAP", "WORK", 
		"YEAR", "YELLOW", "PLUS", "MINUS", "STAR", "SLASH", "COMMA", "SEMI", "COLON", 
		"EQUAL", "NOT_EQUAL", "LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", 
		"RBRACK", "DOT", "ATSYMBOL", "DOUBLEVERTBAR", "IDENT", "STRING_LITERAL", 
		"NUM_INT", "NUM_REAL", "HEX_DIGIT", "SL_COMMENT", "SL_COMMENT_2", "EOL", 
		"WS", "CHARACTER", "ESC", "QUOTED_STRING", "DIV", "STEP", "MEMORY", "SAME", 
		"WRAP", "PRIOR", "SECONDS"
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

	@Override
	public String getGrammarFileName() { return "informix.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public informixParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Compilation_unitContext extends ParserRuleContext {
		public MainBlockContext mainBlock() {
			return getRuleContext(MainBlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(informixParser.EOF, 0); }
		public DatabaseDeclarationContext databaseDeclaration() {
			return getRuleContext(DatabaseDeclarationContext.class,0);
		}
		public GlobalDeclarationContext globalDeclaration() {
			return getRuleContext(GlobalDeclarationContext.class,0);
		}
		public TypeDeclarationsContext typeDeclarations() {
			return getRuleContext(TypeDeclarationsContext.class,0);
		}
		public FunctionOrReportDefinitionsContext functionOrReportDefinitions() {
			return getRuleContext(FunctionOrReportDefinitionsContext.class,0);
		}
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterCompilation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitCompilation_unit(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilation_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DATABASE) {
				{
				setState(400);
				databaseDeclaration();
				}
			}

			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GLOBALS) {
				{
				setState(403);
				globalDeclaration();
				}
			}

			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFINE) {
				{
				setState(406);
				typeDeclarations();
				}
			}

			setState(409);
			mainBlock();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION || _la==REPORT) {
				{
				setState(410);
				functionOrReportDefinitions();
				}
			}

			setState(413);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(informixParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainBlockContext extends ParserRuleContext {
		public List<TerminalNode> MAIN() { return getTokens(informixParser.MAIN); }
		public TerminalNode MAIN(int i) {
			return getToken(informixParser.MAIN, i);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public TerminalNode END() { return getToken(informixParser.END, 0); }
		public TypeDeclarationsContext typeDeclarations() {
			return getRuleContext(TypeDeclarationsContext.class,0);
		}
		public MainStatementsContext mainStatements() {
			return getRuleContext(MainStatementsContext.class,0);
		}
		public MainBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterMainBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitMainBlock(this);
		}
	}

	public final MainBlockContext mainBlock() throws RecognitionException {
		MainBlockContext _localctx = new MainBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EOL) {
				{
				setState(417);
				eol();
				}
			}

			setState(420);
			match(MAIN);
			setState(421);
			eol();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFINE) {
				{
				setState(422);
				typeDeclarations();
				}
			}

			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLOCATE) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEALLOCATE - 65)) | (1L << (DECLARE - 65)) | (1L << (DEFER - 65)) | (1L << (DELETE - 65)) | (1L << (DISPLAY - 65)) | (1L << (DROP - 65)) | (1L << (ERROR - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIT - 65)) | (1L << (FETCH - 65)) | (1L << (FINISH - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FREE - 65)) | (1L << (GOTO - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (HIDE - 130)) | (1L << (IF - 130)) | (1L << (INITIALIZE - 130)) | (1L << (INPUT - 130)) | (1L << (INSERT - 130)) | (1L << (LET - 130)) | (1L << (LOAD - 130)) | (1L << (LOCATE - 130)) | (1L << (LOCK - 130)) | (1L << (MENU - 130)) | (1L << (MESSAGE - 130)) | (1L << (NEED - 130)) | (1L << (NEXT - 130)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (OPEN - 201)) | (1L << (OPTIONS - 201)) | (1L << (OUTPUT - 201)) | (1L << (PAUSE - 201)) | (1L << (PREPARE - 201)) | (1L << (PRINT - 201)) | (1L << (PROMPT - 201)) | (1L << (PUT - 201)) | (1L << (RESIZE - 201)) | (1L << (RETURN - 201)) | (1L << (ROLLBACK - 201)) | (1L << (RUN - 201)) | (1L << (SCROLL - 201)) | (1L << (SKIP2 - 201)) | (1L << (SELECT - 201)) | (1L << (SET - 201)) | (1L << (SHOW - 201)) | (1L << (SLEEP - 201)) | (1L << (START - 201)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (TERMINATE - 269)) | (1L << (UNLOAD - 269)) | (1L << (UPDATE - 269)) | (1L << (VALIDATE - 269)) | (1L << (WHENEVER - 269)) | (1L << (WHILE - 269)) | (1L << (IDENT - 269)))) != 0) || _la==EOL) {
				{
				setState(425);
				mainStatements();
				}
			}

			setState(428);
			match(END);
			setState(429);
			match(MAIN);
			setState(430);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainStatementsContext extends ParserRuleContext {
		public List<DeferStatementContext> deferStatement() {
			return getRuleContexts(DeferStatementContext.class);
		}
		public DeferStatementContext deferStatement(int i) {
			return getRuleContext(DeferStatementContext.class,i);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public MainStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterMainStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitMainStatements(this);
		}
	}

	public final MainStatementsContext mainStatements() throws RecognitionException {
		MainStatementsContext _localctx = new MainStatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mainStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(435);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DEFER:
					{
					setState(432);
					deferStatement();
					}
					break;
				case ALLOCATE:
				case BEGIN:
				case CALL:
				case CASE:
				case CLEAR:
				case CLOSE:
				case COMMIT:
				case CONSTRUCT:
				case CONTINUE:
				case CREATE:
				case CURRENT:
				case DATABASE:
				case DEALLOCATE:
				case DECLARE:
				case DELETE:
				case DISPLAY:
				case DROP:
				case ERROR:
				case EXECUTE:
				case EXIT:
				case FETCH:
				case FINISH:
				case FLUSH:
				case FOR:
				case FOREACH:
				case FREE:
				case GOTO:
				case HIDE:
				case IF:
				case INITIALIZE:
				case INPUT:
				case INSERT:
				case LET:
				case LOAD:
				case LOCATE:
				case LOCK:
				case MENU:
				case MESSAGE:
				case NEED:
				case NEXT:
				case OPEN:
				case OPTIONS:
				case OUTPUT:
				case PAUSE:
				case PREPARE:
				case PRINT:
				case PROMPT:
				case PUT:
				case RESIZE:
				case RETURN:
				case ROLLBACK:
				case RUN:
				case SCROLL:
				case SKIP2:
				case SELECT:
				case SET:
				case SHOW:
				case SLEEP:
				case START:
				case TERMINATE:
				case UNLOAD:
				case UPDATE:
				case VALIDATE:
				case WHENEVER:
				case WHILE:
				case IDENT:
					{
					setState(433);
					codeBlock();
					}
					break;
				case EOL:
					{
					setState(434);
					eol();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(437); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLOCATE) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEALLOCATE - 65)) | (1L << (DECLARE - 65)) | (1L << (DEFER - 65)) | (1L << (DELETE - 65)) | (1L << (DISPLAY - 65)) | (1L << (DROP - 65)) | (1L << (ERROR - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIT - 65)) | (1L << (FETCH - 65)) | (1L << (FINISH - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FREE - 65)) | (1L << (GOTO - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (HIDE - 130)) | (1L << (IF - 130)) | (1L << (INITIALIZE - 130)) | (1L << (INPUT - 130)) | (1L << (INSERT - 130)) | (1L << (LET - 130)) | (1L << (LOAD - 130)) | (1L << (LOCATE - 130)) | (1L << (LOCK - 130)) | (1L << (MENU - 130)) | (1L << (MESSAGE - 130)) | (1L << (NEED - 130)) | (1L << (NEXT - 130)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (OPEN - 201)) | (1L << (OPTIONS - 201)) | (1L << (OUTPUT - 201)) | (1L << (PAUSE - 201)) | (1L << (PREPARE - 201)) | (1L << (PRINT - 201)) | (1L << (PROMPT - 201)) | (1L << (PUT - 201)) | (1L << (RESIZE - 201)) | (1L << (RETURN - 201)) | (1L << (ROLLBACK - 201)) | (1L << (RUN - 201)) | (1L << (SCROLL - 201)) | (1L << (SKIP2 - 201)) | (1L << (SELECT - 201)) | (1L << (SET - 201)) | (1L << (SHOW - 201)) | (1L << (SLEEP - 201)) | (1L << (START - 201)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (TERMINATE - 269)) | (1L << (UNLOAD - 269)) | (1L << (UPDATE - 269)) | (1L << (VALIDATE - 269)) | (1L << (WHENEVER - 269)) | (1L << (WHILE - 269)) | (1L << (IDENT - 269)))) != 0) || _la==EOL );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeferStatementContext extends ParserRuleContext {
		public TerminalNode DEFER() { return getToken(informixParser.DEFER, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode INTERRUPT() { return getToken(informixParser.INTERRUPT, 0); }
		public TerminalNode QUIT() { return getToken(informixParser.QUIT, 0); }
		public DeferStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deferStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterDeferStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitDeferStatement(this);
		}
	}

	public final DeferStatementContext deferStatement() throws RecognitionException {
		DeferStatementContext _localctx = new DeferStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_deferStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(DEFER);
			setState(440);
			_la = _input.LA(1);
			if ( !(_la==INTERRUPT || _la==QUIT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(441);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionOrReportDefinitionsContext extends ParserRuleContext {
		public List<ReportDefinitionContext> reportDefinition() {
			return getRuleContexts(ReportDefinitionContext.class);
		}
		public ReportDefinitionContext reportDefinition(int i) {
			return getRuleContext(ReportDefinitionContext.class,i);
		}
		public List<FunctionDefinitionContext> functionDefinition() {
			return getRuleContexts(FunctionDefinitionContext.class);
		}
		public FunctionDefinitionContext functionDefinition(int i) {
			return getRuleContext(FunctionDefinitionContext.class,i);
		}
		public FunctionOrReportDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionOrReportDefinitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterFunctionOrReportDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitFunctionOrReportDefinitions(this);
		}
	}

	public final FunctionOrReportDefinitionsContext functionOrReportDefinitions() throws RecognitionException {
		FunctionOrReportDefinitionsContext _localctx = new FunctionOrReportDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionOrReportDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(445);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case REPORT:
					{
					setState(443);
					reportDefinition();
					}
					break;
				case FUNCTION:
					{
					setState(444);
					functionDefinition();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(447); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTION || _la==REPORT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(informixParser.RETURN, 0); }
		public VariableOrConstantListContext variableOrConstantList() {
			return getRuleContext(VariableOrConstantListContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(RETURN);
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(450);
				variableOrConstantList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> FUNCTION() { return getTokens(informixParser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(informixParser.FUNCTION, i);
		}
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public TypeDeclarationsContext typeDeclarations() {
			return getRuleContext(TypeDeclarationsContext.class,0);
		}
		public TerminalNode END() { return getToken(informixParser.END, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitFunctionDefinition(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(FUNCTION);
			setState(454);
			functionIdentifier();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(455);
				parameterList();
				}
			}

			setState(458);
			eol();
			setState(459);
			typeDeclarations();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLOCATE) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEALLOCATE - 65)) | (1L << (DECLARE - 65)) | (1L << (DELETE - 65)) | (1L << (DISPLAY - 65)) | (1L << (DROP - 65)) | (1L << (ERROR - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIT - 65)) | (1L << (FETCH - 65)) | (1L << (FINISH - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FREE - 65)) | (1L << (GOTO - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (HIDE - 130)) | (1L << (IF - 130)) | (1L << (INITIALIZE - 130)) | (1L << (INPUT - 130)) | (1L << (INSERT - 130)) | (1L << (LET - 130)) | (1L << (LOAD - 130)) | (1L << (LOCATE - 130)) | (1L << (LOCK - 130)) | (1L << (MENU - 130)) | (1L << (MESSAGE - 130)) | (1L << (NEED - 130)) | (1L << (NEXT - 130)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (OPEN - 201)) | (1L << (OPTIONS - 201)) | (1L << (OUTPUT - 201)) | (1L << (PAUSE - 201)) | (1L << (PREPARE - 201)) | (1L << (PRINT - 201)) | (1L << (PROMPT - 201)) | (1L << (PUT - 201)) | (1L << (RESIZE - 201)) | (1L << (RETURN - 201)) | (1L << (ROLLBACK - 201)) | (1L << (RUN - 201)) | (1L << (SCROLL - 201)) | (1L << (SKIP2 - 201)) | (1L << (SELECT - 201)) | (1L << (SET - 201)) | (1L << (SHOW - 201)) | (1L << (SLEEP - 201)) | (1L << (START - 201)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (TERMINATE - 269)) | (1L << (UNLOAD - 269)) | (1L << (UPDATE - 269)) | (1L << (VALIDATE - 269)) | (1L << (WHENEVER - 269)) | (1L << (WHILE - 269)) | (1L << (IDENT - 269)))) != 0)) {
				{
				setState(460);
				codeBlock();
				}
			}

			setState(463);
			match(END);
			setState(464);
			match(FUNCTION);
			setState(465);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public List<ParameterGroupContext> parameterGroup() {
			return getRuleContexts(ParameterGroupContext.class);
		}
		public ParameterGroupContext parameterGroup(int i) {
			return getRuleContext(ParameterGroupContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(LPAREN);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(468);
				parameterGroup();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterGroupContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterParameterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitParameterGroup(this);
		}
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameterGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			identifier();
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(477);
				match(COMMA);
				setState(478);
				identifier();
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlobalDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> GLOBALS() { return getTokens(informixParser.GLOBALS); }
		public TerminalNode GLOBALS(int i) {
			return getToken(informixParser.GLOBALS, i);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TypeDeclarationsContext typeDeclarations() {
			return getRuleContext(TypeDeclarationsContext.class,0);
		}
		public TerminalNode END() { return getToken(informixParser.END, 0); }
		public GlobalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterGlobalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitGlobalDeclaration(this);
		}
	}

	public final GlobalDeclarationContext globalDeclaration() throws RecognitionException {
		GlobalDeclarationContext _localctx = new GlobalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_globalDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(GLOBALS);
			setState(491);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				{
				setState(485);
				string();
				}
				break;
			case EOL:
				{
				setState(486);
				eol();
				setState(487);
				typeDeclarations();
				setState(488);
				match(END);
				setState(489);
				match(GLOBALS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(493);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationsContext extends ParserRuleContext {
		public List<TypeDeclarationContext> typeDeclaration() {
			return getRuleContexts(TypeDeclarationContext.class);
		}
		public TypeDeclarationContext typeDeclaration(int i) {
			return getRuleContext(TypeDeclarationContext.class,i);
		}
		public TypeDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterTypeDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitTypeDeclarations(this);
		}
	}

	public final TypeDeclarationsContext typeDeclarations() throws RecognitionException {
		TypeDeclarationsContext _localctx = new TypeDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(495);
				typeDeclaration();
				}
				}
				setState(498); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DEFINE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(informixParser.DEFINE, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(DEFINE);
			setState(501);
			variableDeclaration();
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(502);
				match(COMMA);
				setState(503);
				variableDeclaration();
				}
				}
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public List<ConstantIdentifierContext> constantIdentifier() {
			return getRuleContexts(ConstantIdentifierContext.class);
		}
		public ConstantIdentifierContext constantIdentifier(int i) {
			return getRuleContext(ConstantIdentifierContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclaration);
		int _la;
		try {
			int _alt;
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				constantIdentifier();
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(510);
					match(COMMA);
					setState(511);
					constantIdentifier();
					}
					}
					setState(516);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(517);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				constantIdentifier();
				setState(520);
				type();
				setState(527);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(521);
						match(COMMA);
						setState(522);
						constantIdentifier();
						setState(523);
						type();
						}
						} 
					}
					setState(529);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public IndirectTypeContext indirectType() {
			return getRuleContext(IndirectTypeContext.class,0);
		}
		public LargeTypeContext largeType() {
			return getRuleContext(LargeTypeContext.class,0);
		}
		public StructuredTypeContext structuredType() {
			return getRuleContext(StructuredTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_type);
		try {
			setState(536);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BIGINT:
			case CHAR:
			case DATE:
			case DATETIME:
			case DEC:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case INTEGER:
			case INTERVAL:
			case MONEY:
			case NCHAR:
			case NUMERIC:
			case NVARCHAR:
			case REAL:
			case SMALLFLOAT:
			case SMALLINT:
			case VARCHAR:
			case CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				typeIdentifier();
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				indirectType();
				}
				break;
			case BYTE:
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(534);
				largeType();
				}
				break;
			case ARRAY:
			case DYNAMIC:
			case RECORD:
				enterOuterAlt(_localctx, 4);
				{
				setState(535);
				structuredType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndirectTypeContext extends ParserRuleContext {
		public TerminalNode LIKE() { return getToken(informixParser.LIKE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(informixParser.DOT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IndirectTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indirectType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterIndirectType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitIndirectType(this);
		}
	}

	public final IndirectTypeContext indirectType() throws RecognitionException {
		IndirectTypeContext _localctx = new IndirectTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_indirectType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(LIKE);
			setState(539);
			tableIdentifier();
			setState(540);
			match(DOT);
			setState(541);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIdentifierContext extends ParserRuleContext {
		public CharTypeContext charType() {
			return getRuleContext(CharTypeContext.class,0);
		}
		public NumberTypeContext numberType() {
			return getRuleContext(NumberTypeContext.class,0);
		}
		public TimeTypeContext timeType() {
			return getRuleContext(TimeTypeContext.class,0);
		}
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitTypeIdentifier(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeIdentifier);
		try {
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case NCHAR:
			case NVARCHAR:
			case VARCHAR:
			case CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				charType();
				}
				break;
			case BIGINT:
			case DEC:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case INTEGER:
			case MONEY:
			case NUMERIC:
			case REAL:
			case SMALLFLOAT:
			case SMALLINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				numberType();
				}
				break;
			case DATE:
			case DATETIME:
			case INTERVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(545);
				timeType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LargeTypeContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(informixParser.TEXT, 0); }
		public TerminalNode BYTE() { return getToken(informixParser.BYTE, 0); }
		public LargeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_largeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterLargeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitLargeType(this);
		}
	}

	public final LargeTypeContext largeType() throws RecognitionException {
		LargeTypeContext _localctx = new LargeTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_largeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			_la = _input.LA(1);
			if ( !(_la==BYTE || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberTypeContext extends ParserRuleContext {
		public TerminalNode BIGINT() { return getToken(informixParser.BIGINT, 0); }
		public TerminalNode INTEGER() { return getToken(informixParser.INTEGER, 0); }
		public TerminalNode INT() { return getToken(informixParser.INT, 0); }
		public TerminalNode SMALLINT() { return getToken(informixParser.SMALLINT, 0); }
		public TerminalNode REAL() { return getToken(informixParser.REAL, 0); }
		public TerminalNode SMALLFLOAT() { return getToken(informixParser.SMALLFLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(informixParser.DECIMAL, 0); }
		public TerminalNode DEC() { return getToken(informixParser.DEC, 0); }
		public TerminalNode NUMERIC() { return getToken(informixParser.NUMERIC, 0); }
		public TerminalNode MONEY() { return getToken(informixParser.MONEY, 0); }
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public List<NumericConstantContext> numericConstant() {
			return getRuleContexts(NumericConstantContext.class);
		}
		public NumericConstantContext numericConstant(int i) {
			return getRuleContext(NumericConstantContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(informixParser.COMMA, 0); }
		public TerminalNode FLOAT() { return getToken(informixParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(informixParser.DOUBLE, 0); }
		public NumberTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterNumberType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitNumberType(this);
		}
	}

	public final NumberTypeContext numberType() throws RecognitionException {
		NumberTypeContext _localctx = new NumberTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_numberType);
		int _la;
		try {
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BIGINT:
			case INT:
			case INTEGER:
			case REAL:
			case SMALLFLOAT:
			case SMALLINT:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				_la = _input.LA(1);
				if ( !(_la==BIGINT || _la==INT || _la==INTEGER || ((((_la - 226)) & ~0x3f) == 0 && ((1L << (_la - 226)) & ((1L << (REAL - 226)) | (1L << (SMALLFLOAT - 226)) | (1L << (SMALLINT - 226)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DEC:
			case DECIMAL:
			case MONEY:
			case NUMERIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				_la = _input.LA(1);
				if ( !(_la==DEC || _la==DECIMAL || _la==MONEY || _la==NUMERIC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(552);
					match(LPAREN);
					setState(553);
					numericConstant();
					setState(556);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(554);
						match(COMMA);
						setState(555);
						numericConstant();
						}
					}

					setState(558);
					match(RPAREN);
					}
				}

				}
				break;
			case DOUBLE:
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(562);
				_la = _input.LA(1);
				if ( !(_la==DOUBLE || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(563);
					match(LPAREN);
					setState(564);
					numericConstant();
					setState(565);
					match(RPAREN);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public List<NumericConstantContext> numericConstant() {
			return getRuleContexts(NumericConstantContext.class);
		}
		public NumericConstantContext numericConstant(int i) {
			return getRuleContext(NumericConstantContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public TerminalNode VARCHAR() { return getToken(informixParser.VARCHAR, 0); }
		public TerminalNode NVARCHAR() { return getToken(informixParser.NVARCHAR, 0); }
		public TerminalNode COMMA() { return getToken(informixParser.COMMA, 0); }
		public TerminalNode CHAR() { return getToken(informixParser.CHAR, 0); }
		public TerminalNode NCHAR() { return getToken(informixParser.NCHAR, 0); }
		public TerminalNode CHARACTER() { return getToken(informixParser.CHARACTER, 0); }
		public CharTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterCharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitCharType(this);
		}
	}

	public final CharTypeContext charType() throws RecognitionException {
		CharTypeContext _localctx = new CharTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_charType);
		int _la;
		try {
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NVARCHAR:
			case VARCHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(571);
				_la = _input.LA(1);
				if ( !(_la==NVARCHAR || _la==VARCHAR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(572);
				match(LPAREN);
				setState(573);
				numericConstant();
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(574);
					match(COMMA);
					setState(575);
					numericConstant();
					}
				}

				setState(578);
				match(RPAREN);
				}
				break;
			case CHAR:
			case NCHAR:
			case CHARACTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				_la = _input.LA(1);
				if ( !(_la==CHAR || _la==NCHAR || _la==CHARACTER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(581);
					match(LPAREN);
					setState(582);
					numericConstant();
					setState(583);
					match(RPAREN);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeTypeContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(informixParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(informixParser.DATETIME, 0); }
		public DatetimeQualifierContext datetimeQualifier() {
			return getRuleContext(DatetimeQualifierContext.class,0);
		}
		public TerminalNode INTERVAL() { return getToken(informixParser.INTERVAL, 0); }
		public IntervalQualifierContext intervalQualifier() {
			return getRuleContext(IntervalQualifierContext.class,0);
		}
		public TimeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterTimeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitTimeType(this);
		}
	}

	public final TimeTypeContext timeType() throws RecognitionException {
		TimeTypeContext _localctx = new TimeTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_timeType);
		try {
			setState(594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				match(DATE);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				match(DATETIME);
				setState(591);
				datetimeQualifier();
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(592);
				match(INTERVAL);
				setState(593);
				intervalQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatetimeQualifierContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(informixParser.YEAR, 0); }
		public TerminalNode TO() { return getToken(informixParser.TO, 0); }
		public YearQualifierContext yearQualifier() {
			return getRuleContext(YearQualifierContext.class,0);
		}
		public TerminalNode MONTH() { return getToken(informixParser.MONTH, 0); }
		public MonthQualifierContext monthQualifier() {
			return getRuleContext(MonthQualifierContext.class,0);
		}
		public TerminalNode DAY() { return getToken(informixParser.DAY, 0); }
		public DayQualifierContext dayQualifier() {
			return getRuleContext(DayQualifierContext.class,0);
		}
		public TerminalNode HOUR() { return getToken(informixParser.HOUR, 0); }
		public HourQualifierContext hourQualifier() {
			return getRuleContext(HourQualifierContext.class,0);
		}
		public TerminalNode MINUTE() { return getToken(informixParser.MINUTE, 0); }
		public MinuteQualifierContext minuteQualifier() {
			return getRuleContext(MinuteQualifierContext.class,0);
		}
		public TerminalNode SECOND() { return getToken(informixParser.SECOND, 0); }
		public SecondQualifierContext secondQualifier() {
			return getRuleContext(SecondQualifierContext.class,0);
		}
		public TerminalNode FRACTION() { return getToken(informixParser.FRACTION, 0); }
		public FractionQualifierContext fractionQualifier() {
			return getRuleContext(FractionQualifierContext.class,0);
		}
		public DatetimeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetimeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterDatetimeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitDatetimeQualifier(this);
		}
	}

	public final DatetimeQualifierContext datetimeQualifier() throws RecognitionException {
		DatetimeQualifierContext _localctx = new DatetimeQualifierContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_datetimeQualifier);
		try {
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				match(YEAR);
				setState(597);
				match(TO);
				setState(598);
				yearQualifier();
				}
				break;
			case MONTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				match(MONTH);
				setState(600);
				match(TO);
				setState(601);
				monthQualifier();
				}
				break;
			case DAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(602);
				match(DAY);
				setState(603);
				match(TO);
				setState(604);
				dayQualifier();
				}
				break;
			case HOUR:
				enterOuterAlt(_localctx, 4);
				{
				setState(605);
				match(HOUR);
				setState(606);
				match(TO);
				setState(607);
				hourQualifier();
				}
				break;
			case MINUTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(608);
				match(MINUTE);
				setState(609);
				match(TO);
				setState(610);
				minuteQualifier();
				}
				break;
			case SECOND:
				enterOuterAlt(_localctx, 6);
				{
				setState(611);
				match(SECOND);
				setState(612);
				match(TO);
				setState(613);
				secondQualifier();
				}
				break;
			case FRACTION:
				enterOuterAlt(_localctx, 7);
				{
				setState(614);
				match(FRACTION);
				setState(615);
				match(TO);
				setState(616);
				fractionQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalQualifierContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(informixParser.YEAR, 0); }
		public TerminalNode TO() { return getToken(informixParser.TO, 0); }
		public YearQualifierContext yearQualifier() {
			return getRuleContext(YearQualifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public TerminalNode MONTH() { return getToken(informixParser.MONTH, 0); }
		public MonthQualifierContext monthQualifier() {
			return getRuleContext(MonthQualifierContext.class,0);
		}
		public TerminalNode DAY() { return getToken(informixParser.DAY, 0); }
		public DayQualifierContext dayQualifier() {
			return getRuleContext(DayQualifierContext.class,0);
		}
		public TerminalNode HOUR() { return getToken(informixParser.HOUR, 0); }
		public HourQualifierContext hourQualifier() {
			return getRuleContext(HourQualifierContext.class,0);
		}
		public TerminalNode MINUTE() { return getToken(informixParser.MINUTE, 0); }
		public MinuteQualifierContext minuteQualifier() {
			return getRuleContext(MinuteQualifierContext.class,0);
		}
		public TerminalNode SECOND() { return getToken(informixParser.SECOND, 0); }
		public SecondQualifierContext secondQualifier() {
			return getRuleContext(SecondQualifierContext.class,0);
		}
		public TerminalNode FRACTION() { return getToken(informixParser.FRACTION, 0); }
		public FractionQualifierContext fractionQualifier() {
			return getRuleContext(FractionQualifierContext.class,0);
		}
		public IntervalQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterIntervalQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitIntervalQualifier(this);
		}
	}

	public final IntervalQualifierContext intervalQualifier() throws RecognitionException {
		IntervalQualifierContext _localctx = new IntervalQualifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_intervalQualifier);
		int _la;
		try {
			setState(676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				match(YEAR);
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(620);
					match(LPAREN);
					setState(621);
					numericConstant();
					setState(622);
					match(RPAREN);
					}
				}

				setState(626);
				match(TO);
				setState(627);
				yearQualifier();
				}
				break;
			case MONTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(628);
				match(MONTH);
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(629);
					match(LPAREN);
					setState(630);
					numericConstant();
					setState(631);
					match(RPAREN);
					}
				}

				setState(635);
				match(TO);
				setState(636);
				monthQualifier();
				}
				break;
			case DAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				match(DAY);
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(638);
					match(LPAREN);
					setState(639);
					numericConstant();
					setState(640);
					match(RPAREN);
					}
				}

				setState(644);
				match(TO);
				setState(645);
				dayQualifier();
				}
				break;
			case HOUR:
				enterOuterAlt(_localctx, 4);
				{
				setState(646);
				match(HOUR);
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(647);
					match(LPAREN);
					setState(648);
					numericConstant();
					setState(649);
					match(RPAREN);
					}
				}

				setState(653);
				match(TO);
				setState(654);
				hourQualifier();
				}
				break;
			case MINUTE:
				enterOuterAlt(_localctx, 5);
				{
				setState(655);
				match(MINUTE);
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(656);
					match(LPAREN);
					setState(657);
					numericConstant();
					setState(658);
					match(RPAREN);
					}
				}

				setState(662);
				match(TO);
				setState(663);
				minuteQualifier();
				}
				break;
			case SECOND:
				enterOuterAlt(_localctx, 6);
				{
				setState(664);
				match(SECOND);
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(665);
					match(LPAREN);
					setState(666);
					numericConstant();
					setState(667);
					match(RPAREN);
					}
				}

				setState(671);
				match(TO);
				setState(672);
				secondQualifier();
				}
				break;
			case FRACTION:
				enterOuterAlt(_localctx, 7);
				{
				setState(673);
				match(FRACTION);
				setState(674);
				match(TO);
				setState(675);
				fractionQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitTypeContext extends ParserRuleContext {
		public YearQualifierContext yearQualifier() {
			return getRuleContext(YearQualifierContext.class,0);
		}
		public UnitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterUnitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitUnitType(this);
		}
	}

	public final UnitTypeContext unitType() throws RecognitionException {
		UnitTypeContext _localctx = new UnitTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_unitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			yearQualifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YearQualifierContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(informixParser.YEAR, 0); }
		public MonthQualifierContext monthQualifier() {
			return getRuleContext(MonthQualifierContext.class,0);
		}
		public YearQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_yearQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterYearQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitYearQualifier(this);
		}
	}

	public final YearQualifierContext yearQualifier() throws RecognitionException {
		YearQualifierContext _localctx = new YearQualifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_yearQualifier);
		try {
			setState(682);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case YEAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				match(YEAR);
				}
				break;
			case DAY:
			case FRACTION:
			case HOUR:
			case MINUTE:
			case MONTH:
			case SECOND:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				monthQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MonthQualifierContext extends ParserRuleContext {
		public TerminalNode MONTH() { return getToken(informixParser.MONTH, 0); }
		public DayQualifierContext dayQualifier() {
			return getRuleContext(DayQualifierContext.class,0);
		}
		public MonthQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monthQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterMonthQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitMonthQualifier(this);
		}
	}

	public final MonthQualifierContext monthQualifier() throws RecognitionException {
		MonthQualifierContext _localctx = new MonthQualifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_monthQualifier);
		try {
			setState(686);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MONTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(684);
				match(MONTH);
				}
				break;
			case DAY:
			case FRACTION:
			case HOUR:
			case MINUTE:
			case SECOND:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				dayQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DayQualifierContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(informixParser.DAY, 0); }
		public HourQualifierContext hourQualifier() {
			return getRuleContext(HourQualifierContext.class,0);
		}
		public DayQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dayQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterDayQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitDayQualifier(this);
		}
	}

	public final DayQualifierContext dayQualifier() throws RecognitionException {
		DayQualifierContext _localctx = new DayQualifierContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dayQualifier);
		try {
			setState(690);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				match(DAY);
				}
				break;
			case FRACTION:
			case HOUR:
			case MINUTE:
			case SECOND:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				hourQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HourQualifierContext extends ParserRuleContext {
		public TerminalNode HOUR() { return getToken(informixParser.HOUR, 0); }
		public MinuteQualifierContext minuteQualifier() {
			return getRuleContext(MinuteQualifierContext.class,0);
		}
		public HourQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hourQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterHourQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitHourQualifier(this);
		}
	}

	public final HourQualifierContext hourQualifier() throws RecognitionException {
		HourQualifierContext _localctx = new HourQualifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_hourQualifier);
		try {
			setState(694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HOUR:
				enterOuterAlt(_localctx, 1);
				{
				setState(692);
				match(HOUR);
				}
				break;
			case FRACTION:
			case MINUTE:
			case SECOND:
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				minuteQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MinuteQualifierContext extends ParserRuleContext {
		public TerminalNode MINUTE() { return getToken(informixParser.MINUTE, 0); }
		public SecondQualifierContext secondQualifier() {
			return getRuleContext(SecondQualifierContext.class,0);
		}
		public MinuteQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minuteQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterMinuteQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitMinuteQualifier(this);
		}
	}

	public final MinuteQualifierContext minuteQualifier() throws RecognitionException {
		MinuteQualifierContext _localctx = new MinuteQualifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_minuteQualifier);
		try {
			setState(698);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(696);
				match(MINUTE);
				}
				break;
			case FRACTION:
			case SECOND:
				enterOuterAlt(_localctx, 2);
				{
				setState(697);
				secondQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SecondQualifierContext extends ParserRuleContext {
		public TerminalNode SECOND() { return getToken(informixParser.SECOND, 0); }
		public FractionQualifierContext fractionQualifier() {
			return getRuleContext(FractionQualifierContext.class,0);
		}
		public SecondQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secondQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSecondQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSecondQualifier(this);
		}
	}

	public final SecondQualifierContext secondQualifier() throws RecognitionException {
		SecondQualifierContext _localctx = new SecondQualifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_secondQualifier);
		try {
			setState(702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECOND:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				match(SECOND);
				}
				break;
			case FRACTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				fractionQualifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FractionQualifierContext extends ParserRuleContext {
		public TerminalNode FRACTION() { return getToken(informixParser.FRACTION, 0); }
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public FractionQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fractionQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterFractionQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitFractionQualifier(this);
		}
	}

	public final FractionQualifierContext fractionQualifier() throws RecognitionException {
		FractionQualifierContext _localctx = new FractionQualifierContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_fractionQualifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(704);
			match(FRACTION);
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(705);
				match(LPAREN);
				setState(706);
				numericConstant();
				setState(707);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructuredTypeContext extends ParserRuleContext {
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public DynArrayTypeContext dynArrayType() {
			return getRuleContext(DynArrayTypeContext.class,0);
		}
		public StructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterStructuredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitStructuredType(this);
		}
	}

	public final StructuredTypeContext structuredType() throws RecognitionException {
		StructuredTypeContext _localctx = new StructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_structuredType);
		try {
			setState(714);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(711);
				recordType();
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(712);
				arrayType();
				}
				break;
			case DYNAMIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(713);
				dynArrayType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordTypeContext extends ParserRuleContext {
		public List<TerminalNode> RECORD() { return getTokens(informixParser.RECORD); }
		public TerminalNode RECORD(int i) {
			return getToken(informixParser.RECORD, i);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode END() { return getToken(informixParser.END, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(informixParser.LIKE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(informixParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(informixParser.STAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterRecordType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitRecordType(this);
		}
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_recordType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(RECORD);
			setState(734);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOL:
				{
				setState(717);
				eol();
				{
				setState(718);
				variableDeclaration();
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(719);
					match(COMMA);
					setState(720);
					variableDeclaration();
					}
					}
					setState(725);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(726);
				match(END);
				setState(727);
				match(RECORD);
				}
				break;
			case LIKE:
				{
				{
				setState(729);
				match(LIKE);
				setState(730);
				tableIdentifier();
				setState(731);
				match(DOT);
				setState(732);
				match(STAR);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayIndexerContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(informixParser.LBRACK, 0); }
		public List<NumericConstantContext> numericConstant() {
			return getRuleContexts(NumericConstantContext.class);
		}
		public NumericConstantContext numericConstant(int i) {
			return getRuleContext(NumericConstantContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(informixParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public ArrayIndexerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndexer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterArrayIndexer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitArrayIndexer(this);
		}
	}

	public final ArrayIndexerContext arrayIndexer() throws RecognitionException {
		ArrayIndexerContext _localctx = new ArrayIndexerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_arrayIndexer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(LBRACK);
			setState(737);
			numericConstant();
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(738);
				match(COMMA);
				setState(739);
				numericConstant();
				}
				break;
			case 2:
				{
				setState(740);
				match(COMMA);
				setState(741);
				numericConstant();
				setState(742);
				match(COMMA);
				setState(743);
				numericConstant();
				}
				break;
			}
			setState(747);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(informixParser.ARRAY, 0); }
		public ArrayIndexerContext arrayIndexer() {
			return getRuleContext(ArrayIndexerContext.class,0);
		}
		public TerminalNode OF() { return getToken(informixParser.OF, 0); }
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public LargeTypeContext largeType() {
			return getRuleContext(LargeTypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			match(ARRAY);
			setState(750);
			arrayIndexer();
			setState(751);
			match(OF);
			setState(755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECORD:
				{
				setState(752);
				recordType();
				}
				break;
			case BIGINT:
			case CHAR:
			case DATE:
			case DATETIME:
			case DEC:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case INTEGER:
			case INTERVAL:
			case MONEY:
			case NCHAR:
			case NUMERIC:
			case NVARCHAR:
			case REAL:
			case SMALLFLOAT:
			case SMALLINT:
			case VARCHAR:
			case CHARACTER:
				{
				setState(753);
				typeIdentifier();
				}
				break;
			case BYTE:
			case TEXT:
				{
				setState(754);
				largeType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DynArrayTypeContext extends ParserRuleContext {
		public TerminalNode DYNAMIC() { return getToken(informixParser.DYNAMIC, 0); }
		public TerminalNode ARRAY() { return getToken(informixParser.ARRAY, 0); }
		public TerminalNode WITH() { return getToken(informixParser.WITH, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public TerminalNode DIMENSIONS() { return getToken(informixParser.DIMENSIONS, 0); }
		public TerminalNode OF() { return getToken(informixParser.OF, 0); }
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public DynArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynArrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterDynArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitDynArrayType(this);
		}
	}

	public final DynArrayTypeContext dynArrayType() throws RecognitionException {
		DynArrayTypeContext _localctx = new DynArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_dynArrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(DYNAMIC);
			setState(758);
			match(ARRAY);
			setState(759);
			match(WITH);
			setState(760);
			numericConstant();
			setState(761);
			match(DIMENSIONS);
			setState(762);
			match(OF);
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RECORD:
				{
				setState(763);
				recordType();
				}
				break;
			case BIGINT:
			case CHAR:
			case DATE:
			case DATETIME:
			case DEC:
			case DECIMAL:
			case DOUBLE:
			case FLOAT:
			case INT:
			case INTEGER:
			case INTERVAL:
			case MONEY:
			case NCHAR:
			case NUMERIC:
			case NVARCHAR:
			case REAL:
			case SMALLFLOAT:
			case SMALLINT:
			case VARCHAR:
			case CHARACTER:
				{
				setState(764);
				typeIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(informixParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public UnlabelledStatementContext unlabelledStatement() {
			return getRuleContext(UnlabelledStatementContext.class,0);
		}
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(informixParser.COLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(769);
				label();
				setState(770);
				match(COLON);
				}
			}

			setState(774);
			unlabelledStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<DatabaseDeclarationContext> databaseDeclaration() {
			return getRuleContexts(DatabaseDeclarationContext.class);
		}
		public DatabaseDeclarationContext databaseDeclaration(int i) {
			return getRuleContext(DatabaseDeclarationContext.class,i);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitCodeBlock(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_codeBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(778); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(778);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ALLOCATE:
					case BEGIN:
					case CALL:
					case CASE:
					case CLEAR:
					case CLOSE:
					case COMMIT:
					case CONSTRUCT:
					case CONTINUE:
					case CREATE:
					case CURRENT:
					case DEALLOCATE:
					case DECLARE:
					case DELETE:
					case DISPLAY:
					case DROP:
					case ERROR:
					case EXECUTE:
					case EXIT:
					case FETCH:
					case FINISH:
					case FLUSH:
					case FOR:
					case FOREACH:
					case FREE:
					case GOTO:
					case HIDE:
					case IF:
					case INITIALIZE:
					case INPUT:
					case INSERT:
					case LET:
					case LOAD:
					case LOCATE:
					case LOCK:
					case MENU:
					case MESSAGE:
					case NEED:
					case NEXT:
					case OPEN:
					case OPTIONS:
					case OUTPUT:
					case PAUSE:
					case PREPARE:
					case PRINT:
					case PROMPT:
					case PUT:
					case RESIZE:
					case RETURN:
					case ROLLBACK:
					case RUN:
					case SCROLL:
					case SKIP2:
					case SELECT:
					case SET:
					case SHOW:
					case SLEEP:
					case START:
					case TERMINATE:
					case UNLOAD:
					case UPDATE:
					case VALIDATE:
					case WHENEVER:
					case WHILE:
					case IDENT:
						{
						setState(776);
						statement();
						}
						break;
					case DATABASE:
						{
						setState(777);
						databaseDeclaration();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(780); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnlabelledStatementContext extends ParserRuleContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StructuredStatementContext structuredStatement() {
			return getRuleContext(StructuredStatementContext.class,0);
		}
		public UnlabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlabelledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterUnlabelledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitUnlabelledStatement(this);
		}
	}

	public final UnlabelledStatementContext unlabelledStatement() throws RecognitionException {
		UnlabelledStatementContext _localctx = new UnlabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_unlabelledStatement);
		try {
			setState(786);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALLOCATE:
			case BEGIN:
			case CALL:
			case CLEAR:
			case CLOSE:
			case COMMIT:
			case CONSTRUCT:
			case CONTINUE:
			case CREATE:
			case CURRENT:
			case DEALLOCATE:
			case DECLARE:
			case DELETE:
			case DISPLAY:
			case DROP:
			case ERROR:
			case EXECUTE:
			case EXIT:
			case FETCH:
			case FINISH:
			case FLUSH:
			case FREE:
			case GOTO:
			case HIDE:
			case INITIALIZE:
			case INPUT:
			case INSERT:
			case LET:
			case LOAD:
			case LOCATE:
			case LOCK:
			case MENU:
			case MESSAGE:
			case NEED:
			case NEXT:
			case OPEN:
			case OPTIONS:
			case OUTPUT:
			case PAUSE:
			case PREPARE:
			case PRINT:
			case PROMPT:
			case PUT:
			case RESIZE:
			case RETURN:
			case ROLLBACK:
			case RUN:
			case SCROLL:
			case SKIP2:
			case SELECT:
			case SET:
			case SHOW:
			case SLEEP:
			case START:
			case TERMINATE:
			case UNLOAD:
			case UPDATE:
			case VALIDATE:
			case WHENEVER:
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				simpleStatement();
				}
				break;
			case CASE:
			case FOR:
			case FOREACH:
			case IF:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				structuredStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ProcedureStatementContext procedureStatement() {
			return getRuleContext(ProcedureStatementContext.class,0);
		}
		public SqlStatementsContext sqlStatements() {
			return getRuleContext(SqlStatementsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(informixParser.SEMI, 0); }
		public OtherFGLStatementContext otherFGLStatement() {
			return getRuleContext(OtherFGLStatementContext.class,0);
		}
		public MenuInsideStatementContext menuInsideStatement() {
			return getRuleContext(MenuInsideStatementContext.class,0);
		}
		public ConstructInsideStatementContext constructInsideStatement() {
			return getRuleContext(ConstructInsideStatementContext.class,0);
		}
		public DisplayInsideStatementContext displayInsideStatement() {
			return getRuleContext(DisplayInsideStatementContext.class,0);
		}
		public InputInsideStatementContext inputInsideStatement() {
			return getRuleContext(InputInsideStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSimpleStatement(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_simpleStatement);
		int _la;
		try {
			setState(799);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(788);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(789);
				procedureStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(790);
				sqlStatements();
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(791);
					match(SEMI);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(794);
				otherFGLStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(795);
				menuInsideStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(796);
				constructInsideStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(797);
				displayInsideStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(798);
				inputInsideStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RunStatementContext extends ParserRuleContext {
		public TerminalNode RUN() { return getToken(informixParser.RUN, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode IN() { return getToken(informixParser.IN, 0); }
		public TerminalNode FORM() { return getToken(informixParser.FORM, 0); }
		public TerminalNode MODE() { return getToken(informixParser.MODE, 0); }
		public TerminalNode LINE() { return getToken(informixParser.LINE, 0); }
		public TerminalNode WITHOUT() { return getToken(informixParser.WITHOUT, 0); }
		public TerminalNode WAITING() { return getToken(informixParser.WAITING, 0); }
		public TerminalNode RETURNING() { return getToken(informixParser.RETURNING, 0); }
		public RunStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_runStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterRunStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitRunStatement(this);
		}
	}

	public final RunStatementContext runStatement() throws RecognitionException {
		RunStatementContext _localctx = new RunStatementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_runStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(801);
			match(RUN);
			setState(804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCEPT:
			case ASCII:
			case COUNT:
			case CURRENT:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MDY:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case IDENT:
				{
				setState(802);
				variable();
				}
				break;
			case STRING_LITERAL:
				{
				setState(803);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(806);
				match(IN);
				setState(807);
				match(FORM);
				setState(808);
				match(MODE);
				}
				break;
			case 2:
				{
				setState(809);
				match(IN);
				setState(810);
				match(LINE);
				setState(811);
				match(MODE);
				}
				break;
			}
			setState(818);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITHOUT:
				{
				setState(814);
				match(WITHOUT);
				setState(815);
				match(WAITING);
				}
				break;
			case RETURNING:
				{
				setState(816);
				match(RETURNING);
				setState(817);
				variable();
				}
				break;
			case AFTER:
			case ALLOCATE:
			case BEFORE:
			case BEGIN:
			case CALL:
			case CASE:
			case CLEAR:
			case CLOSE:
			case COMMAND:
			case COMMIT:
			case CONSTRUCT:
			case CONTINUE:
			case CREATE:
			case CURRENT:
			case DATABASE:
			case DEALLOCATE:
			case DECLARE:
			case DEFER:
			case DELETE:
			case DISPLAY:
			case DROP:
			case ELSE:
			case END:
			case ERROR:
			case EXECUTE:
			case EXIT:
			case FETCH:
			case FINISH:
			case FIRST:
			case FLUSH:
			case FOR:
			case FOREACH:
			case FREE:
			case GOTO:
			case HIDE:
			case IF:
			case INITIALIZE:
			case INPUT:
			case INSERT:
			case LET:
			case LOAD:
			case LOCATE:
			case LOCK:
			case MENU:
			case MESSAGE:
			case NEED:
			case NEXT:
			case ON:
			case OPEN:
			case OPTIONS:
			case OUTPUT:
			case OTHERWISE:
			case PAGE:
			case PAUSE:
			case PREPARE:
			case PRINT:
			case PROMPT:
			case PUT:
			case RESIZE:
			case RETURN:
			case ROLLBACK:
			case RUN:
			case SCROLL:
			case SKIP2:
			case SELECT:
			case SET:
			case SHOW:
			case SLEEP:
			case START:
			case TERMINATE:
			case UNLOAD:
			case UPDATE:
			case VALIDATE:
			case WHEN:
			case WHENEVER:
			case WHILE:
			case IDENT:
			case EOL:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(informixParser.LET, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(informixParser.EQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_assignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(LET);
			setState(821);
			variable();
			setState(822);
			match(EQUAL);
			setState(823);
			expression();
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(824);
				match(COMMA);
				setState(825);
				expression();
				}
				}
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureStatementContext extends ParserRuleContext {
		public TerminalNode CALL() { return getToken(informixParser.CALL, 0); }
		public ProcedureIdentifierContext procedureIdentifier() {
			return getRuleContext(ProcedureIdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public TerminalNode RETURNING() { return getToken(informixParser.RETURNING, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public ProcedureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterProcedureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitProcedureStatement(this);
		}
	}

	public final ProcedureStatementContext procedureStatement() throws RecognitionException {
		ProcedureStatementContext _localctx = new ProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_procedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(CALL);
			setState(832);
			procedureIdentifier();
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(833);
				match(LPAREN);
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (ACCEPT - 3)) | (1L << (ASCII - 3)) | (1L << (AVG - 3)) | (1L << (COLUMN - 3)) | (1L << (COUNT - 3)) | (1L << (CURRENT - 3)) | (1L << (DATE - 3)) | (1L << (DAY - 3)))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXTEND - 98)) | (1L << (FALSE - 98)) | (1L << (FIRST - 98)) | (1L << (FOUND - 98)) | (1L << (GROUP - 98)) | (1L << (HIDE - 98)) | (1L << (INDEX - 98)) | (1L << (INFIELD - 98)) | (1L << (INT_FLAG - 98)) | (1L << (INTERRUPT - 98)) | (1L << (LAST - 98)) | (1L << (LENGTH - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (LINENO - 162)) | (1L << (MAX - 162)) | (1L << (MDY - 162)) | (1L << (MIN - 162)) | (1L << (MONTH - 162)) | (1L << (NO - 162)) | (1L << (NOT - 162)) | (1L << (NOTFOUND - 162)) | (1L << (NULL - 162)) | (1L << (PAGENO - 162)) | (1L << (PREPARE - 162)))) != 0) || ((((_la - 226)) & ~0x3f) == 0 && ((1L << (_la - 226)) & ((1L << (REAL - 226)) | (1L << (SIZE - 226)) | (1L << (SQL - 226)) | (1L << (STATUS - 226)) | (1L << (SUM - 226)) | (1L << (TEMP - 226)) | (1L << (TIME - 226)) | (1L << (TODAY - 226)) | (1L << (TRUE - 226)))) != 0) || ((((_la - 290)) & ~0x3f) == 0 && ((1L << (_la - 290)) & ((1L << (USER - 290)) | (1L << (WEEKDAY - 290)) | (1L << (WAIT - 290)) | (1L << (WORK - 290)) | (1L << (YEAR - 290)) | (1L << (PLUS - 290)) | (1L << (MINUS - 290)) | (1L << (STAR - 290)) | (1L << (LPAREN - 290)) | (1L << (IDENT - 290)) | (1L << (STRING_LITERAL - 290)) | (1L << (NUM_INT - 290)) | (1L << (NUM_REAL - 290)))) != 0)) {
					{
					setState(834);
					actualParameter();
					setState(839);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(835);
						match(COMMA);
						setState(836);
						actualParameter();
						}
						}
						setState(841);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(844);
				match(RPAREN);
				}
			}

			setState(856);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURNING) {
				{
				setState(847);
				match(RETURNING);
				setState(848);
				variable();
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(849);
					match(COMMA);
					setState(850);
					variable();
					}
					}
					setState(855);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProcedureIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public ProcedureIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterProcedureIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitProcedureIdentifier(this);
		}
	}

	public final ProcedureIdentifierContext procedureIdentifier() throws RecognitionException {
		ProcedureIdentifierContext _localctx = new ProcedureIdentifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_procedureIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			functionIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActualParameterContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(informixParser.STAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterActualParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitActualParameter(this);
		}
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_actualParameter);
		try {
			setState(862);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(860);
				match(STAR);
				}
				break;
			case ACCEPT:
			case ASCII:
			case AVG:
			case COLUMN:
			case COUNT:
			case CURRENT:
			case DATE:
			case DAY:
			case EXTEND:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INFIELD:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MAX:
			case MDY:
			case MIN:
			case MONTH:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case PREPARE:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case SUM:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case YEAR:
			case PLUS:
			case MINUS:
			case LPAREN:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GotoStatementContext extends ParserRuleContext {
		public TerminalNode GOTO() { return getToken(informixParser.GOTO, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode COLON() { return getToken(informixParser.COLON, 0); }
		public GotoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterGotoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitGotoStatement(this);
		}
	}

	public final GotoStatementContext gotoStatement() throws RecognitionException {
		GotoStatementContext _localctx = new GotoStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_gotoStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			match(GOTO);
			setState(866);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(865);
				match(COLON);
				}
			}

			setState(868);
			label();
			setState(869);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(informixParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(informixParser.FALSE, 0); }
		public List<LogicalTermContext> logicalTerm() {
			return getRuleContexts(LogicalTermContext.class);
		}
		public LogicalTermContext logicalTerm(int i) {
			return getRuleContext(LogicalTermContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(informixParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(informixParser.OR, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_condition);
		int _la;
		try {
			int _alt;
			setState(880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(871);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(872);
				logicalTerm();
				setState(877);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(873);
						match(OR);
						setState(874);
						logicalTerm();
						}
						} 
					}
					setState(879);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalTermContext extends ParserRuleContext {
		public List<LogicalFactorContext> logicalFactor() {
			return getRuleContexts(LogicalFactorContext.class);
		}
		public LogicalFactorContext logicalFactor(int i) {
			return getRuleContext(LogicalFactorContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(informixParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(informixParser.AND, i);
		}
		public LogicalTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterLogicalTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitLogicalTerm(this);
		}
	}

	public final LogicalTermContext logicalTerm() throws RecognitionException {
		LogicalTermContext _localctx = new LogicalTermContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_logicalTerm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			logicalFactor();
			setState(887);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(883);
					match(AND);
					setState(884);
					logicalFactor();
					}
					} 
				}
				setState(889);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalFactorContext extends ParserRuleContext {
		public List<SqlExpressionContext> sqlExpression() {
			return getRuleContexts(SqlExpressionContext.class);
		}
		public SqlExpressionContext sqlExpression(int i) {
			return getRuleContext(SqlExpressionContext.class,i);
		}
		public List<TerminalNode> LIKE() { return getTokens(informixParser.LIKE); }
		public TerminalNode LIKE(int i) {
			return getToken(informixParser.LIKE, i);
		}
		public List<TerminalNode> NOT() { return getTokens(informixParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(informixParser.NOT, i);
		}
		public TerminalNode ESC() { return getToken(informixParser.ESC, 0); }
		public TerminalNode QUOTED_STRING() { return getToken(informixParser.QUOTED_STRING, 0); }
		public List<TerminalNode> BETWEEN() { return getTokens(informixParser.BETWEEN); }
		public TerminalNode BETWEEN(int i) {
			return getToken(informixParser.BETWEEN, i);
		}
		public TerminalNode AND() { return getToken(informixParser.AND, 0); }
		public List<TerminalNode> IS() { return getTokens(informixParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(informixParser.IS, i);
		}
		public List<TerminalNode> NULL() { return getTokens(informixParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(informixParser.NULL, i);
		}
		public List<QuantifiedFactorContext> quantifiedFactor() {
			return getRuleContexts(QuantifiedFactorContext.class);
		}
		public QuantifiedFactorContext quantifiedFactor(int i) {
			return getRuleContext(QuantifiedFactorContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public RelationalOperatorContext relationalOperator() {
			return getRuleContext(RelationalOperatorContext.class,0);
		}
		public LogicalFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterLogicalFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitLogicalFactor(this);
		}
	}

	public final LogicalFactorContext logicalFactor() throws RecognitionException {
		LogicalFactorContext _localctx = new LogicalFactorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_logicalFactor);
		int _la;
		try {
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(891);
				sqlExpression();
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(892);
					match(NOT);
					}
				}

				setState(895);
				match(LIKE);
				}
				setState(897);
				sqlExpression();
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(898);
					match(NOT);
					}
				}

				setState(901);
				match(LIKE);
				setState(902);
				sqlExpression();
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ESC) {
					{
					setState(903);
					match(ESC);
					setState(904);
					match(QUOTED_STRING);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(907);
				sqlExpression();
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(908);
					match(NOT);
					}
				}

				setState(911);
				match(BETWEEN);
				}
				setState(913);
				sqlExpression();
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(914);
					match(NOT);
					}
				}

				setState(917);
				match(BETWEEN);
				setState(918);
				sqlExpression();
				setState(919);
				match(AND);
				setState(920);
				sqlExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(922);
				sqlExpression();
				setState(923);
				match(IS);
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(924);
					match(NOT);
					}
				}

				setState(927);
				match(NULL);
				}
				setState(929);
				sqlExpression();
				setState(930);
				match(IS);
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(931);
					match(NOT);
					}
				}

				setState(934);
				match(NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(936);
				quantifiedFactor();
				setState(937);
				quantifiedFactor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(939);
				match(NOT);
				setState(940);
				condition();
				}
				setState(942);
				match(NOT);
				setState(943);
				condition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(945);
				match(LPAREN);
				setState(946);
				condition();
				setState(947);
				match(RPAREN);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(949);
				sqlExpression();
				setState(950);
				relationalOperator();
				setState(951);
				sqlExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantifiedFactorContext extends ParserRuleContext {
		public List<SqlExpressionContext> sqlExpression() {
			return getRuleContexts(SqlExpressionContext.class);
		}
		public SqlExpressionContext sqlExpression(int i) {
			return getRuleContext(SqlExpressionContext.class,i);
		}
		public List<RelationalOperatorContext> relationalOperator() {
			return getRuleContexts(RelationalOperatorContext.class);
		}
		public RelationalOperatorContext relationalOperator(int i) {
			return getRuleContext(RelationalOperatorContext.class,i);
		}
		public List<SubqueryContext> subquery() {
			return getRuleContexts(SubqueryContext.class);
		}
		public SubqueryContext subquery(int i) {
			return getRuleContext(SubqueryContext.class,i);
		}
		public List<TerminalNode> ALL() { return getTokens(informixParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(informixParser.ALL, i);
		}
		public List<TerminalNode> ANY() { return getTokens(informixParser.ANY); }
		public TerminalNode ANY(int i) {
			return getToken(informixParser.ANY, i);
		}
		public List<TerminalNode> EXISTS() { return getTokens(informixParser.EXISTS); }
		public TerminalNode EXISTS(int i) {
			return getToken(informixParser.EXISTS, i);
		}
		public List<TerminalNode> NOT() { return getTokens(informixParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(informixParser.NOT, i);
		}
		public QuantifiedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifiedFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterQuantifiedFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitQuantifiedFactor(this);
		}
	}

	public final QuantifiedFactorContext quantifiedFactor() throws RecognitionException {
		QuantifiedFactorContext _localctx = new QuantifiedFactorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_quantifiedFactor);
		int _la;
		try {
			setState(982);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(955);
				sqlExpression();
				setState(956);
				relationalOperator();
				setState(958);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL || _la==ANY) {
					{
					setState(957);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==ANY) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(960);
				subquery();
				}
				setState(962);
				sqlExpression();
				setState(963);
				relationalOperator();
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ALL || _la==ANY) {
					{
					setState(964);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==ANY) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(967);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(970);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(969);
					match(NOT);
					}
				}

				setState(972);
				match(EXISTS);
				setState(973);
				subquery();
				}
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(975);
					match(NOT);
					}
				}

				setState(978);
				match(EXISTS);
				setState(979);
				subquery();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(981);
				subquery();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionSetContext extends ParserRuleContext {
		public List<SqlExpressionContext> sqlExpression() {
			return getRuleContexts(SqlExpressionContext.class);
		}
		public SqlExpressionContext sqlExpression(int i) {
			return getRuleContext(SqlExpressionContext.class,i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public ExpressionSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterExpressionSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitExpressionSet(this);
		}
	}

	public final ExpressionSetContext expressionSet() throws RecognitionException {
		ExpressionSetContext _localctx = new ExpressionSetContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_expressionSet);
		try {
			setState(988);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(984);
				sqlExpression();
				setState(985);
				sqlExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(987);
				subquery();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public SqlSelectStatementContext sqlSelectStatement() {
			return getRuleContext(SqlSelectStatementContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSubquery(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(LPAREN);
			setState(991);
			sqlSelectStatement();
			setState(992);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlExpressionContext extends ParserRuleContext {
		public List<SqlTermContext> sqlTerm() {
			return getRuleContexts(SqlTermContext.class);
		}
		public SqlTermContext sqlTerm(int i) {
			return getRuleContext(SqlTermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(informixParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(informixParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(informixParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(informixParser.MINUS, i);
		}
		public SqlExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSqlExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSqlExpression(this);
		}
	}

	public final SqlExpressionContext sqlExpression() throws RecognitionException {
		SqlExpressionContext _localctx = new SqlExpressionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_sqlExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			sqlTerm();
			setState(999);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(995);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(996);
					sqlTerm();
					}
					} 
				}
				setState(1001);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlAliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(informixParser.AS, 0); }
		public SqlAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSqlAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSqlAlias(this);
		}
	}

	public final SqlAliasContext sqlAlias() throws RecognitionException {
		SqlAliasContext _localctx = new SqlAliasContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_sqlAlias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1002);
				match(AS);
				}
			}

			setState(1005);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlTermContext extends ParserRuleContext {
		public List<SqlFactorContext> sqlFactor() {
			return getRuleContexts(SqlFactorContext.class);
		}
		public SqlFactorContext sqlFactor(int i) {
			return getRuleContext(SqlFactorContext.class,i);
		}
		public List<SqlMultiplyContext> sqlMultiply() {
			return getRuleContexts(SqlMultiplyContext.class);
		}
		public SqlMultiplyContext sqlMultiply(int i) {
			return getRuleContext(SqlMultiplyContext.class,i);
		}
		public List<TerminalNode> DIV() { return getTokens(informixParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(informixParser.DIV, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(informixParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(informixParser.SLASH, i);
		}
		public SqlTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSqlTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSqlTerm(this);
		}
	}

	public final SqlTermContext sqlTerm() throws RecognitionException {
		SqlTermContext _localctx = new SqlTermContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_sqlTerm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1007);
			sqlFactor();
			setState(1016);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1011);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(1008);
						sqlMultiply();
						}
						break;
					case DIV:
						{
						setState(1009);
						match(DIV);
						}
						break;
					case SLASH:
						{
						setState(1010);
						match(SLASH);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1013);
					sqlFactor();
					}
					} 
				}
				setState(1018);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlMultiplyContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(informixParser.STAR, 0); }
		public SqlMultiplyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlMultiply; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSqlMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSqlMultiply(this);
		}
	}

	public final SqlMultiplyContext sqlMultiply() throws RecognitionException {
		SqlMultiplyContext _localctx = new SqlMultiplyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_sqlMultiply);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			match(STAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlFactorContext extends ParserRuleContext {
		public List<SqlFactor2Context> sqlFactor2() {
			return getRuleContexts(SqlFactor2Context.class);
		}
		public SqlFactor2Context sqlFactor2(int i) {
			return getRuleContext(SqlFactor2Context.class,i);
		}
		public List<TerminalNode> DOUBLEVERTBAR() { return getTokens(informixParser.DOUBLEVERTBAR); }
		public TerminalNode DOUBLEVERTBAR(int i) {
			return getToken(informixParser.DOUBLEVERTBAR, i);
		}
		public SqlFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSqlFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSqlFactor(this);
		}
	}

	public final SqlFactorContext sqlFactor() throws RecognitionException {
		SqlFactorContext _localctx = new SqlFactorContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_sqlFactor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			sqlFactor2();
			setState(1026);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1022);
					match(DOUBLEVERTBAR);
					setState(1023);
					sqlFactor2();
					}
					} 
				}
				setState(1028);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlFactor2Context extends ParserRuleContext {
		public List<SqlVariableContext> sqlVariable() {
			return getRuleContexts(SqlVariableContext.class);
		}
		public SqlVariableContext sqlVariable(int i) {
			return getRuleContext(SqlVariableContext.class,i);
		}
		public List<TerminalNode> UNITS() { return getTokens(informixParser.UNITS); }
		public TerminalNode UNITS(int i) {
			return getToken(informixParser.UNITS, i);
		}
		public List<UnitTypeContext> unitType() {
			return getRuleContexts(UnitTypeContext.class);
		}
		public UnitTypeContext unitType(int i) {
			return getRuleContext(UnitTypeContext.class,i);
		}
		public List<SqlLiteralContext> sqlLiteral() {
			return getRuleContexts(SqlLiteralContext.class);
		}
		public SqlLiteralContext sqlLiteral(int i) {
			return getRuleContext(SqlLiteralContext.class,i);
		}
		public List<GroupFunctionContext> groupFunction() {
			return getRuleContexts(GroupFunctionContext.class);
		}
		public GroupFunctionContext groupFunction(int i) {
			return getRuleContext(GroupFunctionContext.class,i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(informixParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(informixParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(informixParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(informixParser.RPAREN, i);
		}
		public List<SqlExpressionContext> sqlExpression() {
			return getRuleContexts(SqlExpressionContext.class);
		}
		public SqlExpressionContext sqlExpression(int i) {
			return getRuleContext(SqlExpressionContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(informixParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(informixParser.STAR, i);
		}
		public List<TerminalNode> ALL() { return getTokens(informixParser.ALL); }
		public TerminalNode ALL(int i) {
			return getToken(informixParser.ALL, i);
		}
		public List<TerminalNode> DISTINCT() { return getTokens(informixParser.DISTINCT); }
		public TerminalNode DISTINCT(int i) {
			return getToken(informixParser.DISTINCT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public List<SqlFunctionContext> sqlFunction() {
			return getRuleContexts(SqlFunctionContext.class);
		}
		public SqlFunctionContext sqlFunction(int i) {
			return getRuleContext(SqlFunctionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(informixParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(informixParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(informixParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(informixParser.MINUS, i);
		}
		public SqlExpressionListContext sqlExpressionList() {
			return getRuleContext(SqlExpressionListContext.class,0);
		}
		public SqlFactor2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlFactor2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSqlFactor2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSqlFactor2(this);
		}
	}

	public final SqlFactor2Context sqlFactor2() throws RecognitionException {
		SqlFactor2Context _localctx = new SqlFactor2Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_sqlFactor2);
		int _la;
		try {
			setState(1122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1029);
				sqlVariable();
				setState(1032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNITS) {
					{
					setState(1030);
					match(UNITS);
					setState(1031);
					unitType();
					}
				}

				}
				setState(1034);
				sqlVariable();
				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNITS) {
					{
					setState(1035);
					match(UNITS);
					setState(1036);
					unitType();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1039);
				sqlLiteral();
				setState(1042);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNITS) {
					{
					setState(1040);
					match(UNITS);
					setState(1041);
					unitType();
					}
				}

				}
				setState(1044);
				sqlLiteral();
				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNITS) {
					{
					setState(1045);
					match(UNITS);
					setState(1046);
					unitType();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1049);
				groupFunction();
				setState(1050);
				match(LPAREN);
				setState(1052);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(1051);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT || _la==STAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (ACCEPT - 3)) | (1L << (ASCII - 3)) | (1L << (AVG - 3)) | (1L << (COUNT - 3)) | (1L << (CURRENT - 3)) | (1L << (DATE - 3)) | (1L << (DAY - 3)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECODE - 68)) | (1L << (FALSE - 68)) | (1L << (FIRST - 68)) | (1L << (FOUND - 68)) | (1L << (GROUP - 68)) | (1L << (HIDE - 68)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (INDEX - 136)) | (1L << (INT_FLAG - 136)) | (1L << (INTERRUPT - 136)) | (1L << (LAST - 136)) | (1L << (LENGTH - 136)) | (1L << (LINENO - 136)) | (1L << (MAX - 136)) | (1L << (MDY - 136)) | (1L << (MIN - 136)) | (1L << (MOD - 136)) | (1L << (MONTH - 136)) | (1L << (NO - 136)) | (1L << (NOT - 136)) | (1L << (NOTFOUND - 136)) | (1L << (NULL - 136)) | (1L << (NVL - 136)))) != 0) || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (PAGENO - 211)) | (1L << (REAL - 211)) | (1L << (SIZE - 211)) | (1L << (SQL - 211)) | (1L << (STATUS - 211)) | (1L << (SUM - 211)) | (1L << (TEMP - 211)))) != 0) || ((((_la - 275)) & ~0x3f) == 0 && ((1L << (_la - 275)) & ((1L << (TIME - 275)) | (1L << (TODAY - 275)) | (1L << (TRUE - 275)) | (1L << (USER - 275)) | (1L << (WEEKDAY - 275)) | (1L << (WAIT - 275)) | (1L << (WORK - 275)) | (1L << (YEAR - 275)) | (1L << (PLUS - 275)) | (1L << (MINUS - 275)) | (1L << (STAR - 275)) | (1L << (LPAREN - 275)) | (1L << (IDENT - 275)) | (1L << (STRING_LITERAL - 275)) | (1L << (NUM_INT - 275)) | (1L << (NUM_REAL - 275)))) != 0)) {
					{
					setState(1054);
					sqlExpression();
					setState(1059);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1055);
						match(COMMA);
						setState(1056);
						sqlExpression();
						}
						}
						setState(1061);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1064);
				match(RPAREN);
				}
				setState(1066);
				groupFunction();
				setState(1067);
				match(LPAREN);
				setState(1069);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(1068);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT || _la==STAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (ACCEPT - 3)) | (1L << (ASCII - 3)) | (1L << (AVG - 3)) | (1L << (COUNT - 3)) | (1L << (CURRENT - 3)) | (1L << (DATE - 3)) | (1L << (DAY - 3)))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (DECODE - 68)) | (1L << (FALSE - 68)) | (1L << (FIRST - 68)) | (1L << (FOUND - 68)) | (1L << (GROUP - 68)) | (1L << (HIDE - 68)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (INDEX - 136)) | (1L << (INT_FLAG - 136)) | (1L << (INTERRUPT - 136)) | (1L << (LAST - 136)) | (1L << (LENGTH - 136)) | (1L << (LINENO - 136)) | (1L << (MAX - 136)) | (1L << (MDY - 136)) | (1L << (MIN - 136)) | (1L << (MOD - 136)) | (1L << (MONTH - 136)) | (1L << (NO - 136)) | (1L << (NOT - 136)) | (1L << (NOTFOUND - 136)) | (1L << (NULL - 136)) | (1L << (NVL - 136)))) != 0) || ((((_la - 211)) & ~0x3f) == 0 && ((1L << (_la - 211)) & ((1L << (PAGENO - 211)) | (1L << (REAL - 211)) | (1L << (SIZE - 211)) | (1L << (SQL - 211)) | (1L << (STATUS - 211)) | (1L << (SUM - 211)) | (1L << (TEMP - 211)))) != 0) || ((((_la - 275)) & ~0x3f) == 0 && ((1L << (_la - 275)) & ((1L << (TIME - 275)) | (1L << (TODAY - 275)) | (1L << (TRUE - 275)) | (1L << (USER - 275)) | (1L << (WEEKDAY - 275)) | (1L << (WAIT - 275)) | (1L << (WORK - 275)) | (1L << (YEAR - 275)) | (1L << (PLUS - 275)) | (1L << (MINUS - 275)) | (1L << (STAR - 275)) | (1L << (LPAREN - 275)) | (1L << (IDENT - 275)) | (1L << (STRING_LITERAL - 275)) | (1L << (NUM_INT - 275)) | (1L << (NUM_REAL - 275)))) != 0)) {
					{
					setState(1071);
					sqlExpression();
					setState(1076);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1072);
						match(COMMA);
						setState(1073);
						sqlExpression();
						}
						}
						setState(1078);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1081);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1083);
				sqlFunction();
				{
				setState(1084);
				match(LPAREN);
				setState(1085);
				sqlExpression();
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1086);
					match(COMMA);
					setState(1087);
					sqlExpression();
					}
					}
					setState(1092);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1093);
				match(RPAREN);
				}
				}
				setState(1095);
				sqlFunction();
				{
				setState(1096);
				match(LPAREN);
				setState(1097);
				sqlExpression();
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1098);
					match(COMMA);
					setState(1099);
					sqlExpression();
					}
					}
					setState(1104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1105);
				match(RPAREN);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1107);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1108);
				sqlExpression();
				}
				setState(1110);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1111);
				sqlExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1113);
				match(LPAREN);
				setState(1114);
				sqlExpression();
				setState(1115);
				match(RPAREN);
				}
				setState(1117);
				match(LPAREN);
				setState(1118);
				sqlExpression();
				setState(1119);
				match(RPAREN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1121);
				sqlExpressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlExpressionListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public List<SqlExpressionContext> sqlExpression() {
			return getRuleContexts(SqlExpressionContext.class);
		}
		public SqlExpressionContext sqlExpression(int i) {
			return getRuleContext(SqlExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public SqlExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSqlExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSqlExpressionList(this);
		}
	}

	public final SqlExpressionListContext sqlExpressionList() throws RecognitionException {
		SqlExpressionListContext _localctx = new SqlExpressionListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_sqlExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			match(LPAREN);
			setState(1125);
			sqlExpression();
			setState(1128); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1126);
				match(COMMA);
				setState(1127);
				sqlExpression();
				}
				}
				setState(1130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==COMMA );
			setState(1132);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlLiteralContext extends ParserRuleContext {
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NULL() { return getToken(informixParser.NULL, 0); }
		public TerminalNode FALSE() { return getToken(informixParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(informixParser.TRUE, 0); }
		public SqlLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSqlLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSqlLiteral(this);
		}
	}

	public final SqlLiteralContext sqlLiteral() throws RecognitionException {
		SqlLiteralContext _localctx = new SqlLiteralContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_sqlLiteral);
		try {
			setState(1139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1134);
				unsignedConstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1135);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1136);
				match(NULL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1137);
				match(FALSE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1138);
				match(TRUE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlVariableContext extends ParserRuleContext {
		public List<ColumnsTableIdContext> columnsTableId() {
			return getRuleContexts(ColumnsTableIdContext.class);
		}
		public ColumnsTableIdContext columnsTableId(int i) {
			return getRuleContext(ColumnsTableIdContext.class,i);
		}
		public SqlVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSqlVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSqlVariable(this);
		}
	}

	public final SqlVariableContext sqlVariable() throws RecognitionException {
		SqlVariableContext _localctx = new SqlVariableContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_sqlVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			columnsTableId();
			setState(1142);
			columnsTableId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlFunctionContext extends ParserRuleContext {
		public NumberFunctionContext numberFunction() {
			return getRuleContext(NumberFunctionContext.class,0);
		}
		public CharFunctionContext charFunction() {
			return getRuleContext(CharFunctionContext.class,0);
		}
		public DateFunctionContext dateFunction() {
			return getRuleContext(DateFunctionContext.class,0);
		}
		public OtherFunctionContext otherFunction() {
			return getRuleContext(OtherFunctionContext.class,0);
		}
		public SqlFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSqlFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSqlFunction(this);
		}
	}

	public final SqlFunctionContext sqlFunction() throws RecognitionException {
		SqlFunctionContext _localctx = new SqlFunctionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_sqlFunction);
		try {
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1144);
				numberFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1145);
				charFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1146);
				dateFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1147);
				otherFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateFunctionContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(informixParser.YEAR, 0); }
		public TerminalNode DATE() { return getToken(informixParser.DATE, 0); }
		public TerminalNode DAY() { return getToken(informixParser.DAY, 0); }
		public TerminalNode MONTH() { return getToken(informixParser.MONTH, 0); }
		public DateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterDateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitDateFunction(this);
		}
	}

	public final DateFunctionContext dateFunction() throws RecognitionException {
		DateFunctionContext _localctx = new DateFunctionContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_dateFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			_la = _input.LA(1);
			if ( !(_la==DATE || _la==DAY || _la==MONTH || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberFunctionContext extends ParserRuleContext {
		public TerminalNode MOD() { return getToken(informixParser.MOD, 0); }
		public NumberFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterNumberFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitNumberFunction(this);
		}
	}

	public final NumberFunctionContext numberFunction() throws RecognitionException {
		NumberFunctionContext _localctx = new NumberFunctionContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_numberFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1152);
			match(MOD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharFunctionContext extends ParserRuleContext {
		public TerminalNode LENGTH() { return getToken(informixParser.LENGTH, 0); }
		public CharFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterCharFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitCharFunction(this);
		}
	}

	public final CharFunctionContext charFunction() throws RecognitionException {
		CharFunctionContext _localctx = new CharFunctionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_charFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			match(LENGTH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupFunctionContext extends ParserRuleContext {
		public TerminalNode AVG() { return getToken(informixParser.AVG, 0); }
		public TerminalNode COUNT() { return getToken(informixParser.COUNT, 0); }
		public TerminalNode MAX() { return getToken(informixParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(informixParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(informixParser.SUM, 0); }
		public GroupFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterGroupFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitGroupFunction(this);
		}
	}

	public final GroupFunctionContext groupFunction() throws RecognitionException {
		GroupFunctionContext _localctx = new GroupFunctionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_groupFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1156);
			_la = _input.LA(1);
			if ( !(_la==AVG || _la==COUNT || _la==MAX || _la==MIN || _la==SUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherFunctionContext extends ParserRuleContext {
		public TerminalNode DECODE() { return getToken(informixParser.DECODE, 0); }
		public TerminalNode NVL() { return getToken(informixParser.NVL, 0); }
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public OtherFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterOtherFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitOtherFunction(this);
		}
	}

	public final OtherFunctionContext otherFunction() throws RecognitionException {
		OtherFunctionContext _localctx = new OtherFunctionContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_otherFunction);
		int _la;
		try {
			setState(1160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECODE:
			case NVL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1158);
				_la = _input.LA(1);
				if ( !(_la==DECODE || _la==NVL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ACCEPT:
			case ASCII:
			case COUNT:
			case CURRENT:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MDY:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1159);
				constantIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlPseudoColumnContext extends ParserRuleContext {
		public TerminalNode USER() { return getToken(informixParser.USER, 0); }
		public SqlPseudoColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlPseudoColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSqlPseudoColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSqlPseudoColumn(this);
		}
	}

	public final SqlPseudoColumnContext sqlPseudoColumn() throws RecognitionException {
		SqlPseudoColumnContext _localctx = new SqlPseudoColumnContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_sqlPseudoColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			match(USER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationalOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(informixParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(informixParser.NOT_EQUAL, 0); }
		public TerminalNode LE() { return getToken(informixParser.LE, 0); }
		public TerminalNode LT() { return getToken(informixParser.LT, 0); }
		public TerminalNode GE() { return getToken(informixParser.GE, 0); }
		public TerminalNode GT() { return getToken(informixParser.GT, 0); }
		public TerminalNode LIKE() { return getToken(informixParser.LIKE, 0); }
		public TerminalNode MATCHES() { return getToken(informixParser.MATCHES, 0); }
		public TerminalNode NOT() { return getToken(informixParser.NOT, 0); }
		public RelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterRelationalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitRelationalOperator(this);
		}
	}

	public final RelationalOperatorContext relationalOperator() throws RecognitionException {
		RelationalOperatorContext _localctx = new RelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_relationalOperator);
		int _la;
		try {
			setState(1175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1164);
				match(EQUAL);
				}
				break;
			case NOT_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1165);
				match(NOT_EQUAL);
				}
				break;
			case LE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1166);
				match(LE);
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1167);
				match(LT);
				}
				break;
			case GE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1168);
				match(GE);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1169);
				match(GT);
				}
				break;
			case LIKE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1170);
				match(LIKE);
				}
				break;
			case MATCHES:
			case NOT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(1171);
					match(NOT);
					}
				}

				setState(1174);
				match(MATCHES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfConditionContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(informixParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(informixParser.FALSE, 0); }
		public List<IfCondition2Context> ifCondition2() {
			return getRuleContexts(IfCondition2Context.class);
		}
		public IfCondition2Context ifCondition2(int i) {
			return getRuleContext(IfCondition2Context.class,i);
		}
		public List<RelationalOperatorContext> relationalOperator() {
			return getRuleContexts(RelationalOperatorContext.class);
		}
		public RelationalOperatorContext relationalOperator(int i) {
			return getRuleContext(RelationalOperatorContext.class,i);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitIfCondition(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_ifCondition);
		try {
			int _alt;
			setState(1188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1177);
				match(TRUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1178);
				match(FALSE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1179);
				ifCondition2();
				setState(1185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1180);
						relationalOperator();
						setState(1181);
						ifCondition2();
						}
						} 
					}
					setState(1187);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,111,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfCondition2Context extends ParserRuleContext {
		public List<IfLogicalTermContext> ifLogicalTerm() {
			return getRuleContexts(IfLogicalTermContext.class);
		}
		public IfLogicalTermContext ifLogicalTerm(int i) {
			return getRuleContext(IfLogicalTermContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(informixParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(informixParser.OR, i);
		}
		public IfCondition2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterIfCondition2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitIfCondition2(this);
		}
	}

	public final IfCondition2Context ifCondition2() throws RecognitionException {
		IfCondition2Context _localctx = new IfCondition2Context(_ctx, getState());
		enterRule(_localctx, 144, RULE_ifCondition2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			ifLogicalTerm();
			setState(1195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1191);
					match(OR);
					setState(1192);
					ifLogicalTerm();
					}
					} 
				}
				setState(1197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,113,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfLogicalTermContext extends ParserRuleContext {
		public List<IfLogicalFactorContext> ifLogicalFactor() {
			return getRuleContexts(IfLogicalFactorContext.class);
		}
		public IfLogicalFactorContext ifLogicalFactor(int i) {
			return getRuleContext(IfLogicalFactorContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(informixParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(informixParser.AND, i);
		}
		public IfLogicalTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLogicalTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterIfLogicalTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitIfLogicalTerm(this);
		}
	}

	public final IfLogicalTermContext ifLogicalTerm() throws RecognitionException {
		IfLogicalTermContext _localctx = new IfLogicalTermContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_ifLogicalTerm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			ifLogicalFactor();
			setState(1203);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1199);
					match(AND);
					setState(1200);
					ifLogicalFactor();
					}
					} 
				}
				setState(1205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public List<TerminalNode> CLIPPED() { return getTokens(informixParser.CLIPPED); }
		public TerminalNode CLIPPED(int i) {
			return getToken(informixParser.CLIPPED, i);
		}
		public List<TerminalNode> USING() { return getTokens(informixParser.USING); }
		public TerminalNode USING(int i) {
			return getToken(informixParser.USING, i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			simpleExpression();
			setState(1212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLIPPED || _la==USING) {
				{
				setState(1210);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLIPPED:
					{
					setState(1207);
					match(CLIPPED);
					}
					break;
				case USING:
					{
					setState(1208);
					match(USING);
					setState(1209);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfLogicalFactorContext extends ParserRuleContext {
		public List<TerminalNode> NOT() { return getTokens(informixParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(informixParser.NOT, i);
		}
		public List<IfConditionContext> ifCondition() {
			return getRuleContexts(IfConditionContext.class);
		}
		public IfConditionContext ifCondition(int i) {
			return getRuleContext(IfConditionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public IfLogicalFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLogicalFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterIfLogicalFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitIfLogicalFactor(this);
		}
	}

	public final IfLogicalFactorContext ifLogicalFactor() throws RecognitionException {
		IfLogicalFactorContext _localctx = new IfLogicalFactorContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_ifLogicalFactor);
		try {
			setState(1229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1216);
				match(NOT);
				setState(1217);
				ifCondition();
				}
				setState(1219);
				match(NOT);
				setState(1220);
				ifCondition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1222);
				match(LPAREN);
				setState(1223);
				ifCondition();
				setState(1224);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1226);
				simpleExpression();
				setState(1227);
				simpleExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public List<AddingOperatorContext> addingOperator() {
			return getRuleContexts(AddingOperatorContext.class);
		}
		public AddingOperatorContext addingOperator(int i) {
			return getRuleContext(AddingOperatorContext.class,i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_simpleExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1231);
				sign();
				}
				break;
			}
			setState(1234);
			term();
			setState(1240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1235);
					addingOperator();
					setState(1236);
					term();
					}
					} 
				}
				setState(1242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddingOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(informixParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(informixParser.MINUS, 0); }
		public AddingOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addingOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterAddingOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitAddingOperator(this);
		}
	}

	public final AddingOperatorContext addingOperator() throws RecognitionException {
		AddingOperatorContext _localctx = new AddingOperatorContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_addingOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<MultiplyingOperatorContext> multiplyingOperator() {
			return getRuleContexts(MultiplyingOperatorContext.class);
		}
		public MultiplyingOperatorContext multiplyingOperator(int i) {
			return getRuleContext(MultiplyingOperatorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1245);
			factor();
			setState(1251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MOD || ((((_la - 314)) & ~0x3f) == 0 && ((1L << (_la - 314)) & ((1L << (STAR - 314)) | (1L << (SLASH - 314)) | (1L << (DIV - 314)))) != 0)) {
				{
				{
				setState(1246);
				multiplyingOperator();
				setState(1247);
				factor();
				}
				}
				setState(1253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplyingOperatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(informixParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(informixParser.SLASH, 0); }
		public TerminalNode DIV() { return getToken(informixParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(informixParser.MOD, 0); }
		public MultiplyingOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyingOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterMultiplyingOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitMultiplyingOperator(this);
		}
	}

	public final MultiplyingOperatorContext multiplyingOperator() throws RecognitionException {
		MultiplyingOperatorContext _localctx = new MultiplyingOperatorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_multiplyingOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			_la = _input.LA(1);
			if ( !(_la==MOD || ((((_la - 314)) & ~0x3f) == 0 && ((1L << (_la - 314)) & ((1L << (STAR - 314)) | (1L << (SLASH - 314)) | (1L << (DIV - 314)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public FunctionDesignatorContext functionDesignator() {
			return getRuleContext(FunctionDesignatorContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(informixParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode UNITS() { return getToken(informixParser.UNITS, 0); }
		public UnitTypeContext unitType() {
			return getRuleContext(UnitTypeContext.class,0);
		}
		public TerminalNode GROUP() { return getToken(informixParser.GROUP, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				{
				setState(1257);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1256);
					match(GROUP);
					}
					break;
				}
				setState(1259);
				functionDesignator();
				}
				break;
			case 2:
				{
				setState(1260);
				variable();
				}
				break;
			case 3:
				{
				setState(1261);
				constant();
				}
				break;
			case 4:
				{
				setState(1262);
				match(LPAREN);
				setState(1263);
				expression();
				setState(1264);
				match(RPAREN);
				}
				break;
			case 5:
				{
				setState(1266);
				match(NOT);
				setState(1267);
				factor();
				}
				break;
			}
			setState(1272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1270);
				match(UNITS);
				setState(1271);
				unitType();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDesignatorContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public FunctionDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDesignator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterFunctionDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitFunctionDesignator(this);
		}
	}

	public final FunctionDesignatorContext functionDesignator() throws RecognitionException {
		FunctionDesignatorContext _localctx = new FunctionDesignatorContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_functionDesignator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			functionIdentifier();
			setState(1287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1275);
				match(LPAREN);
				setState(1284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (ACCEPT - 3)) | (1L << (ASCII - 3)) | (1L << (AVG - 3)) | (1L << (COLUMN - 3)) | (1L << (COUNT - 3)) | (1L << (CURRENT - 3)) | (1L << (DATE - 3)) | (1L << (DAY - 3)))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXTEND - 98)) | (1L << (FALSE - 98)) | (1L << (FIRST - 98)) | (1L << (FOUND - 98)) | (1L << (GROUP - 98)) | (1L << (HIDE - 98)) | (1L << (INDEX - 98)) | (1L << (INFIELD - 98)) | (1L << (INT_FLAG - 98)) | (1L << (INTERRUPT - 98)) | (1L << (LAST - 98)) | (1L << (LENGTH - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (LINENO - 162)) | (1L << (MAX - 162)) | (1L << (MDY - 162)) | (1L << (MIN - 162)) | (1L << (MONTH - 162)) | (1L << (NO - 162)) | (1L << (NOT - 162)) | (1L << (NOTFOUND - 162)) | (1L << (NULL - 162)) | (1L << (PAGENO - 162)) | (1L << (PREPARE - 162)))) != 0) || ((((_la - 226)) & ~0x3f) == 0 && ((1L << (_la - 226)) & ((1L << (REAL - 226)) | (1L << (SIZE - 226)) | (1L << (SQL - 226)) | (1L << (STATUS - 226)) | (1L << (SUM - 226)) | (1L << (TEMP - 226)) | (1L << (TIME - 226)) | (1L << (TODAY - 226)) | (1L << (TRUE - 226)))) != 0) || ((((_la - 290)) & ~0x3f) == 0 && ((1L << (_la - 290)) & ((1L << (USER - 290)) | (1L << (WEEKDAY - 290)) | (1L << (WAIT - 290)) | (1L << (WORK - 290)) | (1L << (YEAR - 290)) | (1L << (PLUS - 290)) | (1L << (MINUS - 290)) | (1L << (STAR - 290)) | (1L << (LPAREN - 290)) | (1L << (IDENT - 290)) | (1L << (STRING_LITERAL - 290)) | (1L << (NUM_INT - 290)) | (1L << (NUM_REAL - 290)))) != 0)) {
					{
					setState(1276);
					actualParameter();
					setState(1281);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1277);
						match(COMMA);
						setState(1278);
						actualParameter();
						}
						}
						setState(1283);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1286);
				match(RPAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public TerminalNode DAY() { return getToken(informixParser.DAY, 0); }
		public TerminalNode YEAR() { return getToken(informixParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(informixParser.MONTH, 0); }
		public TerminalNode TODAY() { return getToken(informixParser.TODAY, 0); }
		public TerminalNode WEEKDAY() { return getToken(informixParser.WEEKDAY, 0); }
		public TerminalNode MDY() { return getToken(informixParser.MDY, 0); }
		public TerminalNode COLUMN() { return getToken(informixParser.COLUMN, 0); }
		public TerminalNode SUM() { return getToken(informixParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(informixParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(informixParser.AVG, 0); }
		public TerminalNode MIN() { return getToken(informixParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(informixParser.MAX, 0); }
		public TerminalNode EXTEND() { return getToken(informixParser.EXTEND, 0); }
		public TerminalNode DATE() { return getToken(informixParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(informixParser.TIME, 0); }
		public TerminalNode INFIELD() { return getToken(informixParser.INFIELD, 0); }
		public TerminalNode PREPARE() { return getToken(informixParser.PREPARE, 0); }
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitFunctionIdentifier(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_functionIdentifier);
		int _la;
		try {
			setState(1291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1289);
				_la = _input.LA(1);
				if ( !(((((_la - 17)) & ~0x3f) == 0 && ((1L << (_la - 17)) & ((1L << (AVG - 17)) | (1L << (COLUMN - 17)) | (1L << (COUNT - 17)) | (1L << (DATE - 17)) | (1L << (DAY - 17)))) != 0) || _la==EXTEND || _la==INFIELD || ((((_la - 175)) & ~0x3f) == 0 && ((1L << (_la - 175)) & ((1L << (MAX - 175)) | (1L << (MDY - 175)) | (1L << (MIN - 175)) | (1L << (MONTH - 175)) | (1L << (PREPARE - 175)))) != 0) || ((((_la - 266)) & ~0x3f) == 0 && ((1L << (_la - 266)) & ((1L << (SUM - 266)) | (1L << (TIME - 266)) | (1L << (TODAY - 266)) | (1L << (WEEKDAY - 266)) | (1L << (YEAR - 266)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1290);
				constantIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public TerminalNode NULL() { return getToken(informixParser.NULL, 0); }
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterUnsignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitUnsignedConstant(this);
		}
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_unsignedConstant);
		try {
			setState(1297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1293);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1294);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1295);
				constantIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1296);
				match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_constant);
		try {
			setState(1305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1299);
				numericConstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1300);
				constantIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1301);
				sign();
				setState(1302);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1304);
				string();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public NumericConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterNumericConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitNumericConstant(this);
		}
	}

	public final NumericConstantContext numericConstant() throws RecognitionException {
		NumericConstantContext _localctx = new NumericConstantContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_numericConstant);
		try {
			setState(1311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1307);
				unsignedNumber();
				}
				break;
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1308);
				sign();
				setState(1309);
				unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public EntireVariableContext entireVariable() {
			return getRuleContext(EntireVariableContext.class,0);
		}
		public ComponentVariableContext componentVariable() {
			return getRuleContext(ComponentVariableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_variable);
		try {
			setState(1315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1313);
				entireVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1314);
				componentVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EntireVariableContext extends ParserRuleContext {
		public VariableIdentifierContext variableIdentifier() {
			return getRuleContext(VariableIdentifierContext.class,0);
		}
		public EntireVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entireVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterEntireVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitEntireVariable(this);
		}
	}

	public final EntireVariableContext entireVariable() throws RecognitionException {
		EntireVariableContext _localctx = new EntireVariableContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_entireVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1317);
			variableIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableIdentifierContext extends ParserRuleContext {
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public VariableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterVariableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitVariableIdentifier(this);
		}
	}

	public final VariableIdentifierContext variableIdentifier() throws RecognitionException {
		VariableIdentifierContext _localctx = new VariableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_variableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			constantIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IndexingVariableContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(informixParser.LBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(informixParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public IndexingVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexingVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterIndexingVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitIndexingVariable(this);
		}
	}

	public final IndexingVariableContext indexingVariable() throws RecognitionException {
		IndexingVariableContext _localctx = new IndexingVariableContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_indexingVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			match(LBRACK);
			setState(1322);
			expression();
			setState(1327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1323);
				match(COMMA);
				setState(1324);
				expression();
				}
				}
				setState(1329);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1330);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComponentVariableContext extends ParserRuleContext {
		public RecordVariableContext recordVariable() {
			return getRuleContext(RecordVariableContext.class,0);
		}
		public IndexingVariableContext indexingVariable() {
			return getRuleContext(IndexingVariableContext.class,0);
		}
		public TerminalNode DOT() { return getToken(informixParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(informixParser.STAR, 0); }
		public List<ComponentVariableContext> componentVariable() {
			return getRuleContexts(ComponentVariableContext.class);
		}
		public ComponentVariableContext componentVariable(int i) {
			return getRuleContext(ComponentVariableContext.class,i);
		}
		public TerminalNode THROUGH() { return getToken(informixParser.THROUGH, 0); }
		public TerminalNode THRU() { return getToken(informixParser.THRU, 0); }
		public ComponentVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterComponentVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitComponentVariable(this);
		}
	}

	public final ComponentVariableContext componentVariable() throws RecognitionException {
		ComponentVariableContext _localctx = new ComponentVariableContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_componentVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1332);
			recordVariable();
			setState(1334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(1333);
				indexingVariable();
				}
			}

			}
			setState(1344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				{
				{
				setState(1336);
				match(DOT);
				setState(1337);
				match(STAR);
				}
				}
				break;
			case 2:
				{
				{
				setState(1338);
				match(DOT);
				setState(1339);
				componentVariable();
				setState(1342);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
				case 1:
					{
					setState(1340);
					_la = _input.LA(1);
					if ( !(_la==THROUGH || _la==THRU) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1341);
					componentVariable();
					}
					break;
				}
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordVariableContext extends ParserRuleContext {
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public RecordVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterRecordVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitRecordVariable(this);
		}
	}

	public final RecordVariableContext recordVariable() throws RecognitionException {
		RecordVariableContext _localctx = new RecordVariableContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_recordVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			constantIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldIdentifierContext extends ParserRuleContext {
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public FieldIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterFieldIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitFieldIdentifier(this);
		}
	}

	public final FieldIdentifierContext fieldIdentifier() throws RecognitionException {
		FieldIdentifierContext _localctx = new FieldIdentifierContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_fieldIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1348);
			constantIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructuredStatementContext extends ParserRuleContext {
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public RepetetiveStatementContext repetetiveStatement() {
			return getRuleContext(RepetetiveStatementContext.class,0);
		}
		public StructuredStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterStructuredStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitStructuredStatement(this);
		}
	}

	public final StructuredStatementContext structuredStatement() throws RecognitionException {
		StructuredStatementContext _localctx = new StructuredStatementContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_structuredStatement);
		try {
			setState(1352);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1350);
				conditionalStatement();
				}
				break;
			case FOR:
			case FOREACH:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1351);
				repetetiveStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitConditionalStatement(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_conditionalStatement);
		try {
			setState(1356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(1354);
				ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1355);
				caseStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(informixParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(informixParser.IF, i);
		}
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(informixParser.THEN, 0); }
		public TerminalNode END() { return getToken(informixParser.END, 0); }
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(informixParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1358);
			match(IF);
			setState(1359);
			ifCondition();
			setState(1360);
			match(THEN);
			setState(1362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLOCATE) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEALLOCATE - 65)) | (1L << (DECLARE - 65)) | (1L << (DELETE - 65)) | (1L << (DISPLAY - 65)) | (1L << (DROP - 65)) | (1L << (ERROR - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIT - 65)) | (1L << (FETCH - 65)) | (1L << (FINISH - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FREE - 65)) | (1L << (GOTO - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (HIDE - 130)) | (1L << (IF - 130)) | (1L << (INITIALIZE - 130)) | (1L << (INPUT - 130)) | (1L << (INSERT - 130)) | (1L << (LET - 130)) | (1L << (LOAD - 130)) | (1L << (LOCATE - 130)) | (1L << (LOCK - 130)) | (1L << (MENU - 130)) | (1L << (MESSAGE - 130)) | (1L << (NEED - 130)) | (1L << (NEXT - 130)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (OPEN - 201)) | (1L << (OPTIONS - 201)) | (1L << (OUTPUT - 201)) | (1L << (PAUSE - 201)) | (1L << (PREPARE - 201)) | (1L << (PRINT - 201)) | (1L << (PROMPT - 201)) | (1L << (PUT - 201)) | (1L << (RESIZE - 201)) | (1L << (RETURN - 201)) | (1L << (ROLLBACK - 201)) | (1L << (RUN - 201)) | (1L << (SCROLL - 201)) | (1L << (SKIP2 - 201)) | (1L << (SELECT - 201)) | (1L << (SET - 201)) | (1L << (SHOW - 201)) | (1L << (SLEEP - 201)) | (1L << (START - 201)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (TERMINATE - 269)) | (1L << (UNLOAD - 269)) | (1L << (UPDATE - 269)) | (1L << (VALIDATE - 269)) | (1L << (WHENEVER - 269)) | (1L << (WHILE - 269)) | (1L << (IDENT - 269)))) != 0)) {
				{
				setState(1361);
				codeBlock();
				}
			}

			setState(1368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1364);
				match(ELSE);
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLOCATE) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEALLOCATE - 65)) | (1L << (DECLARE - 65)) | (1L << (DELETE - 65)) | (1L << (DISPLAY - 65)) | (1L << (DROP - 65)) | (1L << (ERROR - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIT - 65)) | (1L << (FETCH - 65)) | (1L << (FINISH - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FREE - 65)) | (1L << (GOTO - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (HIDE - 130)) | (1L << (IF - 130)) | (1L << (INITIALIZE - 130)) | (1L << (INPUT - 130)) | (1L << (INSERT - 130)) | (1L << (LET - 130)) | (1L << (LOAD - 130)) | (1L << (LOCATE - 130)) | (1L << (LOCK - 130)) | (1L << (MENU - 130)) | (1L << (MESSAGE - 130)) | (1L << (NEED - 130)) | (1L << (NEXT - 130)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (OPEN - 201)) | (1L << (OPTIONS - 201)) | (1L << (OUTPUT - 201)) | (1L << (PAUSE - 201)) | (1L << (PREPARE - 201)) | (1L << (PRINT - 201)) | (1L << (PROMPT - 201)) | (1L << (PUT - 201)) | (1L << (RESIZE - 201)) | (1L << (RETURN - 201)) | (1L << (ROLLBACK - 201)) | (1L << (RUN - 201)) | (1L << (SCROLL - 201)) | (1L << (SKIP2 - 201)) | (1L << (SELECT - 201)) | (1L << (SET - 201)) | (1L << (SHOW - 201)) | (1L << (SLEEP - 201)) | (1L << (START - 201)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (TERMINATE - 269)) | (1L << (UNLOAD - 269)) | (1L << (UPDATE - 269)) | (1L << (VALIDATE - 269)) | (1L << (WHENEVER - 269)) | (1L << (WHILE - 269)) | (1L << (IDENT - 269)))) != 0)) {
					{
					setState(1365);
					codeBlock();
					}
				}

				}
			}

			setState(1370);
			match(END);
			setState(1371);
			match(IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepetetiveStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForEachStatementContext forEachStatement() {
			return getRuleContext(ForEachStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public RepetetiveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetetiveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterRepetetiveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitRepetetiveStatement(this);
		}
	}

	public final RepetetiveStatementContext repetetiveStatement() throws RecognitionException {
		RepetetiveStatementContext _localctx = new RepetetiveStatementContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_repetetiveStatement);
		try {
			setState(1376);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1373);
				whileStatement();
				}
				break;
			case FOREACH:
				enterOuterAlt(_localctx, 2);
				{
				setState(1374);
				forEachStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1375);
				forStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public List<TerminalNode> WHILE() { return getTokens(informixParser.WHILE); }
		public TerminalNode WHILE(int i) {
			return getToken(informixParser.WHILE, i);
		}
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public TerminalNode END() { return getToken(informixParser.END, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			match(WHILE);
			setState(1379);
			ifCondition();
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLOCATE) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEALLOCATE - 65)) | (1L << (DECLARE - 65)) | (1L << (DELETE - 65)) | (1L << (DISPLAY - 65)) | (1L << (DROP - 65)) | (1L << (ERROR - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIT - 65)) | (1L << (FETCH - 65)) | (1L << (FINISH - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FREE - 65)) | (1L << (GOTO - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (HIDE - 130)) | (1L << (IF - 130)) | (1L << (INITIALIZE - 130)) | (1L << (INPUT - 130)) | (1L << (INSERT - 130)) | (1L << (LET - 130)) | (1L << (LOAD - 130)) | (1L << (LOCATE - 130)) | (1L << (LOCK - 130)) | (1L << (MENU - 130)) | (1L << (MESSAGE - 130)) | (1L << (NEED - 130)) | (1L << (NEXT - 130)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (OPEN - 201)) | (1L << (OPTIONS - 201)) | (1L << (OUTPUT - 201)) | (1L << (PAUSE - 201)) | (1L << (PREPARE - 201)) | (1L << (PRINT - 201)) | (1L << (PROMPT - 201)) | (1L << (PUT - 201)) | (1L << (RESIZE - 201)) | (1L << (RETURN - 201)) | (1L << (ROLLBACK - 201)) | (1L << (RUN - 201)) | (1L << (SCROLL - 201)) | (1L << (SKIP2 - 201)) | (1L << (SELECT - 201)) | (1L << (SET - 201)) | (1L << (SHOW - 201)) | (1L << (SLEEP - 201)) | (1L << (START - 201)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (TERMINATE - 269)) | (1L << (UNLOAD - 269)) | (1L << (UPDATE - 269)) | (1L << (VALIDATE - 269)) | (1L << (WHENEVER - 269)) | (1L << (WHILE - 269)) | (1L << (IDENT - 269)))) != 0)) {
				{
				setState(1380);
				codeBlock();
				}
			}

			setState(1383);
			match(END);
			setState(1384);
			match(WHILE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public List<TerminalNode> FOR() { return getTokens(informixParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(informixParser.FOR, i);
		}
		public ControlVariableContext controlVariable() {
			return getRuleContext(ControlVariableContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(informixParser.EQUAL, 0); }
		public ForListContext forList() {
			return getRuleContext(ForListContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public TerminalNode END() { return getToken(informixParser.END, 0); }
		public TerminalNode STEP() { return getToken(informixParser.STEP, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			match(FOR);
			setState(1387);
			controlVariable();
			setState(1388);
			match(EQUAL);
			setState(1389);
			forList();
			setState(1392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STEP) {
				{
				setState(1390);
				match(STEP);
				setState(1391);
				numericConstant();
				}
			}

			setState(1394);
			eol();
			setState(1396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLOCATE) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEALLOCATE - 65)) | (1L << (DECLARE - 65)) | (1L << (DELETE - 65)) | (1L << (DISPLAY - 65)) | (1L << (DROP - 65)) | (1L << (ERROR - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIT - 65)) | (1L << (FETCH - 65)) | (1L << (FINISH - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FREE - 65)) | (1L << (GOTO - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (HIDE - 130)) | (1L << (IF - 130)) | (1L << (INITIALIZE - 130)) | (1L << (INPUT - 130)) | (1L << (INSERT - 130)) | (1L << (LET - 130)) | (1L << (LOAD - 130)) | (1L << (LOCATE - 130)) | (1L << (LOCK - 130)) | (1L << (MENU - 130)) | (1L << (MESSAGE - 130)) | (1L << (NEED - 130)) | (1L << (NEXT - 130)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (OPEN - 201)) | (1L << (OPTIONS - 201)) | (1L << (OUTPUT - 201)) | (1L << (PAUSE - 201)) | (1L << (PREPARE - 201)) | (1L << (PRINT - 201)) | (1L << (PROMPT - 201)) | (1L << (PUT - 201)) | (1L << (RESIZE - 201)) | (1L << (RETURN - 201)) | (1L << (ROLLBACK - 201)) | (1L << (RUN - 201)) | (1L << (SCROLL - 201)) | (1L << (SKIP2 - 201)) | (1L << (SELECT - 201)) | (1L << (SET - 201)) | (1L << (SHOW - 201)) | (1L << (SLEEP - 201)) | (1L << (START - 201)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (TERMINATE - 269)) | (1L << (UNLOAD - 269)) | (1L << (UPDATE - 269)) | (1L << (VALIDATE - 269)) | (1L << (WHENEVER - 269)) | (1L << (WHILE - 269)) | (1L << (IDENT - 269)))) != 0)) {
				{
				setState(1395);
				codeBlock();
				}
			}

			setState(1398);
			match(END);
			setState(1399);
			match(FOR);
			setState(1400);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForListContext extends ParserRuleContext {
		public InitialValueContext initialValue() {
			return getRuleContext(InitialValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(informixParser.TO, 0); }
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public ForListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterForList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitForList(this);
		}
	}

	public final ForListContext forList() throws RecognitionException {
		ForListContext _localctx = new ForListContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_forList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1402);
			initialValue();
			setState(1403);
			match(TO);
			setState(1404);
			finalValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlVariableContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ControlVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterControlVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitControlVariable(this);
		}
	}

	public final ControlVariableContext controlVariable() throws RecognitionException {
		ControlVariableContext _localctx = new ControlVariableContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_controlVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1406);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterInitialValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitInitialValue(this);
		}
	}

	public final InitialValueContext initialValue() throws RecognitionException {
		InitialValueContext _localctx = new InitialValueContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinalValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterFinalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitFinalValue(this);
		}
	}

	public final FinalValueContext finalValue() throws RecognitionException {
		FinalValueContext _localctx = new FinalValueContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1410);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForEachStatementContext extends ParserRuleContext {
		public List<TerminalNode> FOREACH() { return getTokens(informixParser.FOREACH); }
		public TerminalNode FOREACH(int i) {
			return getToken(informixParser.FOREACH, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<EolContext> eol() {
			return getRuleContexts(EolContext.class);
		}
		public EolContext eol(int i) {
			return getRuleContext(EolContext.class,i);
		}
		public TerminalNode END() { return getToken(informixParser.END, 0); }
		public TerminalNode USING() { return getToken(informixParser.USING, 0); }
		public List<VariableListContext> variableList() {
			return getRuleContexts(VariableListContext.class);
		}
		public VariableListContext variableList(int i) {
			return getRuleContext(VariableListContext.class,i);
		}
		public TerminalNode INTO() { return getToken(informixParser.INTO, 0); }
		public TerminalNode WITH() { return getToken(informixParser.WITH, 0); }
		public TerminalNode REOPTIMIZATION() { return getToken(informixParser.REOPTIMIZATION, 0); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ForEachStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forEachStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterForEachStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitForEachStatement(this);
		}
	}

	public final ForEachStatementContext forEachStatement() throws RecognitionException {
		ForEachStatementContext _localctx = new ForEachStatementContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_forEachStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			match(FOREACH);
			setState(1413);
			identifier();
			setState(1416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1414);
				match(USING);
				setState(1415);
				variableList();
				}
			}

			setState(1420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(1418);
				match(INTO);
				setState(1419);
				variableList();
				}
			}

			setState(1424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1422);
				match(WITH);
				setState(1423);
				match(REOPTIMIZATION);
				}
			}

			setState(1426);
			eol();
			setState(1428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLOCATE) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEALLOCATE - 65)) | (1L << (DECLARE - 65)) | (1L << (DELETE - 65)) | (1L << (DISPLAY - 65)) | (1L << (DROP - 65)) | (1L << (ERROR - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIT - 65)) | (1L << (FETCH - 65)) | (1L << (FINISH - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FREE - 65)) | (1L << (GOTO - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (HIDE - 130)) | (1L << (IF - 130)) | (1L << (INITIALIZE - 130)) | (1L << (INPUT - 130)) | (1L << (INSERT - 130)) | (1L << (LET - 130)) | (1L << (LOAD - 130)) | (1L << (LOCATE - 130)) | (1L << (LOCK - 130)) | (1L << (MENU - 130)) | (1L << (MESSAGE - 130)) | (1L << (NEED - 130)) | (1L << (NEXT - 130)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (OPEN - 201)) | (1L << (OPTIONS - 201)) | (1L << (OUTPUT - 201)) | (1L << (PAUSE - 201)) | (1L << (PREPARE - 201)) | (1L << (PRINT - 201)) | (1L << (PROMPT - 201)) | (1L << (PUT - 201)) | (1L << (RESIZE - 201)) | (1L << (RETURN - 201)) | (1L << (ROLLBACK - 201)) | (1L << (RUN - 201)) | (1L << (SCROLL - 201)) | (1L << (SKIP2 - 201)) | (1L << (SELECT - 201)) | (1L << (SET - 201)) | (1L << (SHOW - 201)) | (1L << (SLEEP - 201)) | (1L << (START - 201)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (TERMINATE - 269)) | (1L << (UNLOAD - 269)) | (1L << (UPDATE - 269)) | (1L << (VALIDATE - 269)) | (1L << (WHENEVER - 269)) | (1L << (WHILE - 269)) | (1L << (IDENT - 269)))) != 0)) {
				{
				setState(1427);
				codeBlock();
				}
			}

			setState(1430);
			match(END);
			setState(1431);
			match(FOREACH);
			setState(1432);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableListContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public VariableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterVariableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitVariableList(this);
		}
	}

	public final VariableListContext variableList() throws RecognitionException {
		VariableListContext _localctx = new VariableListContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_variableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			variable();
			setState(1439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1435);
				match(COMMA);
				setState(1436);
				variable();
				}
				}
				setState(1441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableOrConstantListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public VariableOrConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOrConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterVariableOrConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitVariableOrConstantList(this);
		}
	}

	public final VariableOrConstantListContext variableOrConstantList() throws RecognitionException {
		VariableOrConstantListContext _localctx = new VariableOrConstantListContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_variableOrConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			expression();
			setState(1447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1443);
				match(COMMA);
				setState(1444);
				expression();
				}
				}
				setState(1449);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseStatementContext extends ParserRuleContext {
		public List<TerminalNode> CASE() { return getTokens(informixParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(informixParser.CASE, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode END() { return getToken(informixParser.END, 0); }
		public List<TerminalNode> WHEN() { return getTokens(informixParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(informixParser.WHEN, i);
		}
		public TerminalNode OTHERWISE() { return getToken(informixParser.OTHERWISE, 0); }
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public List<IfConditionContext> ifCondition() {
			return getRuleContexts(IfConditionContext.class);
		}
		public IfConditionContext ifCondition(int i) {
			return getRuleContext(IfConditionContext.class,i);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitCaseStatement(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_caseStatement);
		int _la;
		try {
			setState(1487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1450);
				match(CASE);
				setState(1451);
				expression();
				setState(1459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1452);
					match(WHEN);
					setState(1453);
					expression();
					setState(1455);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLOCATE) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEALLOCATE - 65)) | (1L << (DECLARE - 65)) | (1L << (DELETE - 65)) | (1L << (DISPLAY - 65)) | (1L << (DROP - 65)) | (1L << (ERROR - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIT - 65)) | (1L << (FETCH - 65)) | (1L << (FINISH - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FREE - 65)) | (1L << (GOTO - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (HIDE - 130)) | (1L << (IF - 130)) | (1L << (INITIALIZE - 130)) | (1L << (INPUT - 130)) | (1L << (INSERT - 130)) | (1L << (LET - 130)) | (1L << (LOAD - 130)) | (1L << (LOCATE - 130)) | (1L << (LOCK - 130)) | (1L << (MENU - 130)) | (1L << (MESSAGE - 130)) | (1L << (NEED - 130)) | (1L << (NEXT - 130)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (OPEN - 201)) | (1L << (OPTIONS - 201)) | (1L << (OUTPUT - 201)) | (1L << (PAUSE - 201)) | (1L << (PREPARE - 201)) | (1L << (PRINT - 201)) | (1L << (PROMPT - 201)) | (1L << (PUT - 201)) | (1L << (RESIZE - 201)) | (1L << (RETURN - 201)) | (1L << (ROLLBACK - 201)) | (1L << (RUN - 201)) | (1L << (SCROLL - 201)) | (1L << (SKIP2 - 201)) | (1L << (SELECT - 201)) | (1L << (SET - 201)) | (1L << (SHOW - 201)) | (1L << (SLEEP - 201)) | (1L << (START - 201)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (TERMINATE - 269)) | (1L << (UNLOAD - 269)) | (1L << (UPDATE - 269)) | (1L << (VALIDATE - 269)) | (1L << (WHENEVER - 269)) | (1L << (WHILE - 269)) | (1L << (IDENT - 269)))) != 0)) {
						{
						setState(1454);
						codeBlock();
						}
					}

					}
					}
					setState(1461);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OTHERWISE) {
					{
					setState(1462);
					match(OTHERWISE);
					setState(1464);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLOCATE) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEALLOCATE - 65)) | (1L << (DECLARE - 65)) | (1L << (DELETE - 65)) | (1L << (DISPLAY - 65)) | (1L << (DROP - 65)) | (1L << (ERROR - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIT - 65)) | (1L << (FETCH - 65)) | (1L << (FINISH - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FREE - 65)) | (1L << (GOTO - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (HIDE - 130)) | (1L << (IF - 130)) | (1L << (INITIALIZE - 130)) | (1L << (INPUT - 130)) | (1L << (INSERT - 130)) | (1L << (LET - 130)) | (1L << (LOAD - 130)) | (1L << (LOCATE - 130)) | (1L << (LOCK - 130)) | (1L << (MENU - 130)) | (1L << (MESSAGE - 130)) | (1L << (NEED - 130)) | (1L << (NEXT - 130)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (OPEN - 201)) | (1L << (OPTIONS - 201)) | (1L << (OUTPUT - 201)) | (1L << (PAUSE - 201)) | (1L << (PREPARE - 201)) | (1L << (PRINT - 201)) | (1L << (PROMPT - 201)) | (1L << (PUT - 201)) | (1L << (RESIZE - 201)) | (1L << (RETURN - 201)) | (1L << (ROLLBACK - 201)) | (1L << (RUN - 201)) | (1L << (SCROLL - 201)) | (1L << (SKIP2 - 201)) | (1L << (SELECT - 201)) | (1L << (SET - 201)) | (1L << (SHOW - 201)) | (1L << (SLEEP - 201)) | (1L << (START - 201)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (TERMINATE - 269)) | (1L << (UNLOAD - 269)) | (1L << (UPDATE - 269)) | (1L << (VALIDATE - 269)) | (1L << (WHENEVER - 269)) | (1L << (WHILE - 269)) | (1L << (IDENT - 269)))) != 0)) {
						{
						setState(1463);
						codeBlock();
						}
					}

					}
				}

				setState(1468);
				match(END);
				setState(1469);
				match(CASE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1471);
				match(CASE);
				setState(1478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1472);
					match(WHEN);
					setState(1473);
					ifCondition();
					setState(1474);
					codeBlock();
					}
					}
					setState(1480);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OTHERWISE) {
					{
					setState(1481);
					match(OTHERWISE);
					setState(1482);
					codeBlock();
					}
				}

				setState(1485);
				match(END);
				setState(1486);
				match(CASE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherFGLStatementContext extends ParserRuleContext {
		public OtherProgramFlowStatementContext otherProgramFlowStatement() {
			return getRuleContext(OtherProgramFlowStatementContext.class,0);
		}
		public OtherStorageStatementContext otherStorageStatement() {
			return getRuleContext(OtherStorageStatementContext.class,0);
		}
		public ReportStatementContext reportStatement() {
			return getRuleContext(ReportStatementContext.class,0);
		}
		public ScreenStatementContext screenStatement() {
			return getRuleContext(ScreenStatementContext.class,0);
		}
		public OtherFGLStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherFGLStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterOtherFGLStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitOtherFGLStatement(this);
		}
	}

	public final OtherFGLStatementContext otherFGLStatement() throws RecognitionException {
		OtherFGLStatementContext _localctx = new OtherFGLStatementContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_otherFGLStatement);
		try {
			setState(1493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
			case EXIT:
			case GOTO:
			case RETURN:
			case RUN:
			case SLEEP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1489);
				otherProgramFlowStatement();
				}
				break;
			case ALLOCATE:
			case DEALLOCATE:
			case FREE:
			case INITIALIZE:
			case LOCATE:
			case RESIZE:
			case VALIDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1490);
				otherStorageStatement();
				}
				break;
			case FINISH:
			case NEED:
			case OUTPUT:
			case PAUSE:
			case PRINT:
			case SKIP2:
			case START:
			case TERMINATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1491);
				reportStatement();
				}
				break;
			case CLEAR:
			case CLOSE:
			case CONSTRUCT:
			case CURRENT:
			case DISPLAY:
			case ERROR:
			case INPUT:
			case MENU:
			case MESSAGE:
			case OPEN:
			case OPTIONS:
			case PROMPT:
			case SCROLL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1492);
				screenStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherProgramFlowStatementContext extends ParserRuleContext {
		public RunStatementContext runStatement() {
			return getRuleContext(RunStatementContext.class,0);
		}
		public GotoStatementContext gotoStatement() {
			return getRuleContext(GotoStatementContext.class,0);
		}
		public TerminalNode SLEEP() { return getToken(informixParser.SLEEP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExitStatementsContext exitStatements() {
			return getRuleContext(ExitStatementsContext.class,0);
		}
		public ContinueStatementsContext continueStatements() {
			return getRuleContext(ContinueStatementsContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public OtherProgramFlowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherProgramFlowStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterOtherProgramFlowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitOtherProgramFlowStatement(this);
		}
	}

	public final OtherProgramFlowStatementContext otherProgramFlowStatement() throws RecognitionException {
		OtherProgramFlowStatementContext _localctx = new OtherProgramFlowStatementContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_otherProgramFlowStatement);
		try {
			setState(1502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RUN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1495);
				runStatement();
				}
				break;
			case GOTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(1496);
				gotoStatement();
				}
				break;
			case SLEEP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1497);
				match(SLEEP);
				setState(1498);
				expression();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(1499);
				exitStatements();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1500);
				continueStatements();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 6);
				{
				setState(1501);
				returnStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitTypesContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(informixParser.FOREACH, 0); }
		public TerminalNode FOR() { return getToken(informixParser.FOR, 0); }
		public TerminalNode CASE() { return getToken(informixParser.CASE, 0); }
		public TerminalNode CONSTRUCT() { return getToken(informixParser.CONSTRUCT, 0); }
		public TerminalNode DISPLAY() { return getToken(informixParser.DISPLAY, 0); }
		public TerminalNode INPUT() { return getToken(informixParser.INPUT, 0); }
		public TerminalNode MENU() { return getToken(informixParser.MENU, 0); }
		public TerminalNode REPORT() { return getToken(informixParser.REPORT, 0); }
		public TerminalNode WHILE() { return getToken(informixParser.WHILE, 0); }
		public ExitTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterExitTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitExitTypes(this);
		}
	}

	public final ExitTypesContext exitTypes() throws RecognitionException {
		ExitTypesContext _localctx = new ExitTypesContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_exitTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1504);
			_la = _input.LA(1);
			if ( !(_la==CASE || _la==CONSTRUCT || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (DISPLAY - 80)) | (1L << (FOR - 80)) | (1L << (FOREACH - 80)) | (1L << (INPUT - 80)))) != 0) || _la==MENU || _la==REPORT || _la==WHILE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExitStatementsContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(informixParser.EXIT, 0); }
		public ExitTypesContext exitTypes() {
			return getRuleContext(ExitTypesContext.class,0);
		}
		public TerminalNode PROGRAM() { return getToken(informixParser.PROGRAM, 0); }
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public ExitStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exitStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterExitStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitExitStatements(this);
		}
	}

	public final ExitStatementsContext exitStatements() throws RecognitionException {
		ExitStatementsContext _localctx = new ExitStatementsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_exitStatements);
		try {
			setState(1517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1506);
				match(EXIT);
				setState(1507);
				exitTypes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1508);
				match(EXIT);
				setState(1509);
				match(PROGRAM);
				setState(1515);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1510);
					match(LPAREN);
					setState(1511);
					expression();
					setState(1512);
					match(RPAREN);
					}
					break;
				case 2:
					{
					setState(1514);
					expression();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementsContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(informixParser.CONTINUE, 0); }
		public ExitTypesContext exitTypes() {
			return getRuleContext(ExitTypesContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public ContinueStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterContinueStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitContinueStatements(this);
		}
	}

	public final ContinueStatementsContext continueStatements() throws RecognitionException {
		ContinueStatementsContext _localctx = new ContinueStatementsContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_continueStatements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1519);
			match(CONTINUE);
			setState(1520);
			exitTypes();
			setState(1521);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherStorageStatementContext extends ParserRuleContext {
		public TerminalNode ALLOCATE() { return getToken(informixParser.ALLOCATE, 0); }
		public TerminalNode ARRAY() { return getToken(informixParser.ARRAY, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayIndexerContext arrayIndexer() {
			return getRuleContext(ArrayIndexerContext.class,0);
		}
		public TerminalNode LOCATE() { return getToken(informixParser.LOCATE, 0); }
		public VariableListContext variableList() {
			return getRuleContext(VariableListContext.class,0);
		}
		public TerminalNode IN() { return getToken(informixParser.IN, 0); }
		public TerminalNode MEMORY() { return getToken(informixParser.MEMORY, 0); }
		public TerminalNode FILE() { return getToken(informixParser.FILE, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode DEALLOCATE() { return getToken(informixParser.DEALLOCATE, 0); }
		public TerminalNode RESIZE() { return getToken(informixParser.RESIZE, 0); }
		public TerminalNode FREE() { return getToken(informixParser.FREE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public TerminalNode INITIALIZE() { return getToken(informixParser.INITIALIZE, 0); }
		public TerminalNode TO() { return getToken(informixParser.TO, 0); }
		public TerminalNode NULL() { return getToken(informixParser.NULL, 0); }
		public TerminalNode LIKE() { return getToken(informixParser.LIKE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode VALIDATE() { return getToken(informixParser.VALIDATE, 0); }
		public OtherStorageStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherStorageStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterOtherStorageStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitOtherStorageStatement(this);
		}
	}

	public final OtherStorageStatementContext otherStorageStatement() throws RecognitionException {
		OtherStorageStatementContext _localctx = new OtherStorageStatementContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_otherStorageStatement);
		int _la;
		try {
			setState(1596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALLOCATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1523);
				match(ALLOCATE);
				setState(1524);
				match(ARRAY);
				setState(1525);
				identifier();
				setState(1526);
				arrayIndexer();
				}
				break;
			case LOCATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1528);
				match(LOCATE);
				setState(1529);
				variableList();
				setState(1530);
				match(IN);
				setState(1537);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MEMORY:
					{
					setState(1531);
					match(MEMORY);
					}
					break;
				case FILE:
					{
					setState(1532);
					match(FILE);
					setState(1535);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
					case 1:
						{
						setState(1533);
						variable();
						}
						break;
					case 2:
						{
						setState(1534);
						string();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case DEALLOCATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1539);
				match(DEALLOCATE);
				setState(1540);
				match(ARRAY);
				setState(1541);
				identifier();
				}
				break;
			case RESIZE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1542);
				match(RESIZE);
				setState(1543);
				match(ARRAY);
				setState(1544);
				identifier();
				setState(1545);
				arrayIndexer();
				}
				break;
			case FREE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1547);
				match(FREE);
				setState(1548);
				variable();
				setState(1553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1549);
					match(COMMA);
					setState(1550);
					variable();
					}
					}
					setState(1555);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case INITIALIZE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1556);
				match(INITIALIZE);
				setState(1557);
				variable();
				setState(1562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1558);
					match(COMMA);
					setState(1559);
					variable();
					}
					}
					setState(1564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1576);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TO:
					{
					setState(1565);
					match(TO);
					setState(1566);
					match(NULL);
					}
					break;
				case LIKE:
					{
					setState(1567);
					match(LIKE);
					setState(1568);
					expression();
					setState(1573);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1569);
						match(COMMA);
						setState(1570);
						expression();
						}
						}
						setState(1575);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case VALIDATE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1578);
				match(VALIDATE);
				setState(1579);
				variable();
				setState(1584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1580);
					match(COMMA);
					setState(1581);
					variable();
					}
					}
					setState(1586);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1587);
				match(LIKE);
				setState(1588);
				expression();
				setState(1593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1589);
					match(COMMA);
					setState(1590);
					expression();
					}
					}
					setState(1595);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintExpressionItemContext extends ParserRuleContext {
		public TerminalNode COLUMN() { return getToken(informixParser.COLUMN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PAGENO() { return getToken(informixParser.PAGENO, 0); }
		public TerminalNode LINENO() { return getToken(informixParser.LINENO, 0); }
		public TerminalNode BYTE() { return getToken(informixParser.BYTE, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(informixParser.TEXT, 0); }
		public TerminalNode WORDWRAP() { return getToken(informixParser.WORDWRAP, 0); }
		public TerminalNode SPACE() { return getToken(informixParser.SPACE, 0); }
		public TerminalNode SPACES() { return getToken(informixParser.SPACES, 0); }
		public TerminalNode RIGHT() { return getToken(informixParser.RIGHT, 0); }
		public TerminalNode MARGIN() { return getToken(informixParser.MARGIN, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public PrintExpressionItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpressionItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterPrintExpressionItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitPrintExpressionItem(this);
		}
	}

	public final PrintExpressionItemContext printExpressionItem() throws RecognitionException {
		PrintExpressionItemContext _localctx = new PrintExpressionItemContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_printExpressionItem);
		int _la;
		try {
			setState(1617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1598);
				match(COLUMN);
				setState(1599);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1600);
				_la = _input.LA(1);
				if ( !(_la==LINENO || _la==PAGENO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1601);
				match(BYTE);
				setState(1602);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1603);
				match(TEXT);
				setState(1604);
				variable();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1605);
				expression();
				setState(1607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE || _la==SPACES) {
					{
					setState(1606);
					_la = _input.LA(1);
					if ( !(_la==SPACE || _la==SPACES) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WORDWRAP) {
					{
					setState(1609);
					match(WORDWRAP);
					setState(1613);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==RIGHT) {
						{
						setState(1610);
						match(RIGHT);
						setState(1611);
						match(MARGIN);
						setState(1612);
						numericConstant();
						}
					}

					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintExpressionListContext extends ParserRuleContext {
		public List<PrintExpressionItemContext> printExpressionItem() {
			return getRuleContexts(PrintExpressionItemContext.class);
		}
		public PrintExpressionItemContext printExpressionItem(int i) {
			return getRuleContext(PrintExpressionItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public PrintExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterPrintExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitPrintExpressionList(this);
		}
	}

	public final PrintExpressionListContext printExpressionList() throws RecognitionException {
		PrintExpressionListContext _localctx = new PrintExpressionListContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_printExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			printExpressionItem();
			setState(1624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1620);
				match(COMMA);
				setState(1621);
				printExpressionItem();
				}
				}
				setState(1626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReportStatementContext extends ParserRuleContext {
		public TerminalNode START() { return getToken(informixParser.START, 0); }
		public TerminalNode REPORT() { return getToken(informixParser.REPORT, 0); }
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public TerminalNode TO() { return getToken(informixParser.TO, 0); }
		public TerminalNode WITH() { return getToken(informixParser.WITH, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PIPE() { return getToken(informixParser.PIPE, 0); }
		public TerminalNode PRINTER() { return getToken(informixParser.PRINTER, 0); }
		public List<TerminalNode> LEFT() { return getTokens(informixParser.LEFT); }
		public TerminalNode LEFT(int i) {
			return getToken(informixParser.LEFT, i);
		}
		public List<TerminalNode> MARGIN() { return getTokens(informixParser.MARGIN); }
		public TerminalNode MARGIN(int i) {
			return getToken(informixParser.MARGIN, i);
		}
		public List<NumericConstantContext> numericConstant() {
			return getRuleContexts(NumericConstantContext.class);
		}
		public NumericConstantContext numericConstant(int i) {
			return getRuleContext(NumericConstantContext.class,i);
		}
		public List<TerminalNode> RIGHT() { return getTokens(informixParser.RIGHT); }
		public TerminalNode RIGHT(int i) {
			return getToken(informixParser.RIGHT, i);
		}
		public List<TerminalNode> TOP() { return getTokens(informixParser.TOP); }
		public TerminalNode TOP(int i) {
			return getToken(informixParser.TOP, i);
		}
		public List<TerminalNode> BOTTOM() { return getTokens(informixParser.BOTTOM); }
		public TerminalNode BOTTOM(int i) {
			return getToken(informixParser.BOTTOM, i);
		}
		public List<TerminalNode> PAGE() { return getTokens(informixParser.PAGE); }
		public TerminalNode PAGE(int i) {
			return getToken(informixParser.PAGE, i);
		}
		public List<TerminalNode> LENGTH() { return getTokens(informixParser.LENGTH); }
		public TerminalNode LENGTH(int i) {
			return getToken(informixParser.LENGTH, i);
		}
		public List<TerminalNode> OF() { return getTokens(informixParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(informixParser.OF, i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode TERMINATE() { return getToken(informixParser.TERMINATE, 0); }
		public TerminalNode FINISH() { return getToken(informixParser.FINISH, 0); }
		public TerminalNode PAUSE() { return getToken(informixParser.PAUSE, 0); }
		public TerminalNode NEED() { return getToken(informixParser.NEED, 0); }
		public TerminalNode LINES() { return getToken(informixParser.LINES, 0); }
		public TerminalNode PRINT() { return getToken(informixParser.PRINT, 0); }
		public TerminalNode FILE() { return getToken(informixParser.FILE, 0); }
		public PrintExpressionListContext printExpressionList() {
			return getRuleContext(PrintExpressionListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(informixParser.SEMI, 0); }
		public TerminalNode SKIP2() { return getToken(informixParser.SKIP2, 0); }
		public TerminalNode LINE() { return getToken(informixParser.LINE, 0); }
		public TerminalNode OUTPUT() { return getToken(informixParser.OUTPUT, 0); }
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public ReportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reportStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterReportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitReportStatement(this);
		}
	}

	public final ReportStatementContext reportStatement() throws RecognitionException {
		ReportStatementContext _localctx = new ReportStatementContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_reportStatement);
		int _la;
		try {
			int _alt;
			setState(1718);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case START:
				enterOuterAlt(_localctx, 1);
				{
				setState(1627);
				match(START);
				setState(1628);
				match(REPORT);
				setState(1629);
				constantIdentifier();
				setState(1637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TO) {
					{
					setState(1630);
					match(TO);
					setState(1635);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ACCEPT:
					case ASCII:
					case AVG:
					case COLUMN:
					case COUNT:
					case CURRENT:
					case DATE:
					case DAY:
					case EXTEND:
					case FALSE:
					case FIRST:
					case FOUND:
					case GROUP:
					case HIDE:
					case INDEX:
					case INFIELD:
					case INT_FLAG:
					case INTERRUPT:
					case LAST:
					case LENGTH:
					case LINENO:
					case MAX:
					case MDY:
					case MIN:
					case MONTH:
					case NO:
					case NOT:
					case NOTFOUND:
					case NULL:
					case PAGENO:
					case PREPARE:
					case REAL:
					case SIZE:
					case SQL:
					case STATUS:
					case SUM:
					case TEMP:
					case TIME:
					case TODAY:
					case TRUE:
					case USER:
					case WEEKDAY:
					case WAIT:
					case WORK:
					case YEAR:
					case PLUS:
					case MINUS:
					case LPAREN:
					case IDENT:
					case STRING_LITERAL:
					case NUM_INT:
					case NUM_REAL:
						{
						setState(1631);
						expression();
						}
						break;
					case PIPE:
						{
						setState(1632);
						match(PIPE);
						setState(1633);
						expression();
						}
						break;
					case PRINTER:
						{
						setState(1634);
						match(PRINTER);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(1664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1639);
					match(WITH);
					setState(1661);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							setState(1659);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
							case 1:
								{
								{
								setState(1640);
								match(LEFT);
								setState(1641);
								match(MARGIN);
								setState(1642);
								numericConstant();
								}
								}
								break;
							case 2:
								{
								{
								setState(1643);
								match(RIGHT);
								setState(1644);
								match(MARGIN);
								setState(1645);
								numericConstant();
								}
								}
								break;
							case 3:
								{
								{
								setState(1646);
								match(TOP);
								setState(1647);
								match(MARGIN);
								setState(1648);
								numericConstant();
								}
								}
								break;
							case 4:
								{
								{
								setState(1649);
								match(BOTTOM);
								setState(1650);
								match(MARGIN);
								setState(1651);
								numericConstant();
								}
								}
								break;
							case 5:
								{
								{
								setState(1652);
								match(PAGE);
								setState(1653);
								match(LENGTH);
								setState(1654);
								numericConstant();
								}
								}
								break;
							case 6:
								{
								{
								setState(1655);
								match(TOP);
								setState(1656);
								match(OF);
								setState(1657);
								match(PAGE);
								setState(1658);
								string();
								}
								}
								break;
							}
							} 
						}
						setState(1663);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
					}
					}
				}

				}
				break;
			case TERMINATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1666);
				match(TERMINATE);
				setState(1667);
				match(REPORT);
				setState(1668);
				constantIdentifier();
				}
				break;
			case FINISH:
				enterOuterAlt(_localctx, 3);
				{
				setState(1669);
				match(FINISH);
				setState(1670);
				match(REPORT);
				setState(1671);
				constantIdentifier();
				}
				break;
			case PAUSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1672);
				match(PAUSE);
				setState(1674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING_LITERAL) {
					{
					setState(1673);
					string();
					}
				}

				}
				break;
			case NEED:
				enterOuterAlt(_localctx, 5);
				{
				setState(1676);
				match(NEED);
				setState(1677);
				expression();
				setState(1678);
				match(LINES);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1680);
				match(PRINT);
				setState(1689);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1682);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
					case 1:
						{
						setState(1681);
						printExpressionList();
						}
						break;
					}
					setState(1685);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(1684);
						match(SEMI);
						}
					}

					}
					break;
				case 2:
					{
					setState(1687);
					match(FILE);
					setState(1688);
					string();
					}
					break;
				}
				}
				break;
			case SKIP2:
				enterOuterAlt(_localctx, 7);
				{
				setState(1691);
				match(SKIP2);
				setState(1699);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACCEPT:
				case ASCII:
				case AVG:
				case COLUMN:
				case COUNT:
				case CURRENT:
				case DATE:
				case DAY:
				case EXTEND:
				case FALSE:
				case FIRST:
				case FOUND:
				case GROUP:
				case HIDE:
				case INDEX:
				case INFIELD:
				case INT_FLAG:
				case INTERRUPT:
				case LAST:
				case LENGTH:
				case LINENO:
				case MAX:
				case MDY:
				case MIN:
				case MONTH:
				case NO:
				case NOT:
				case NOTFOUND:
				case NULL:
				case PAGENO:
				case PREPARE:
				case REAL:
				case SIZE:
				case SQL:
				case STATUS:
				case SUM:
				case TEMP:
				case TIME:
				case TODAY:
				case TRUE:
				case USER:
				case WEEKDAY:
				case WAIT:
				case WORK:
				case YEAR:
				case PLUS:
				case MINUS:
				case LPAREN:
				case IDENT:
				case STRING_LITERAL:
				case NUM_INT:
				case NUM_REAL:
					{
					setState(1692);
					expression();
					setState(1693);
					_la = _input.LA(1);
					if ( !(_la==LINE || _la==LINES) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case TO:
					{
					setState(1695);
					match(TO);
					setState(1696);
					match(TOP);
					setState(1697);
					match(OF);
					setState(1698);
					match(PAGE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1701);
				match(OUTPUT);
				setState(1702);
				match(TO);
				setState(1703);
				match(REPORT);
				setState(1704);
				constantIdentifier();
				setState(1705);
				match(LPAREN);
				setState(1714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (ACCEPT - 3)) | (1L << (ASCII - 3)) | (1L << (AVG - 3)) | (1L << (COLUMN - 3)) | (1L << (COUNT - 3)) | (1L << (CURRENT - 3)) | (1L << (DATE - 3)) | (1L << (DAY - 3)))) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (EXTEND - 98)) | (1L << (FALSE - 98)) | (1L << (FIRST - 98)) | (1L << (FOUND - 98)) | (1L << (GROUP - 98)) | (1L << (HIDE - 98)) | (1L << (INDEX - 98)) | (1L << (INFIELD - 98)) | (1L << (INT_FLAG - 98)) | (1L << (INTERRUPT - 98)) | (1L << (LAST - 98)) | (1L << (LENGTH - 98)))) != 0) || ((((_la - 162)) & ~0x3f) == 0 && ((1L << (_la - 162)) & ((1L << (LINENO - 162)) | (1L << (MAX - 162)) | (1L << (MDY - 162)) | (1L << (MIN - 162)) | (1L << (MONTH - 162)) | (1L << (NO - 162)) | (1L << (NOT - 162)) | (1L << (NOTFOUND - 162)) | (1L << (NULL - 162)) | (1L << (PAGENO - 162)) | (1L << (PREPARE - 162)))) != 0) || ((((_la - 226)) & ~0x3f) == 0 && ((1L << (_la - 226)) & ((1L << (REAL - 226)) | (1L << (SIZE - 226)) | (1L << (SQL - 226)) | (1L << (STATUS - 226)) | (1L << (SUM - 226)) | (1L << (TEMP - 226)) | (1L << (TIME - 226)) | (1L << (TODAY - 226)) | (1L << (TRUE - 226)))) != 0) || ((((_la - 290)) & ~0x3f) == 0 && ((1L << (_la - 290)) & ((1L << (USER - 290)) | (1L << (WEEKDAY - 290)) | (1L << (WAIT - 290)) | (1L << (WORK - 290)) | (1L << (YEAR - 290)) | (1L << (PLUS - 290)) | (1L << (MINUS - 290)) | (1L << (LPAREN - 290)) | (1L << (IDENT - 290)) | (1L << (STRING_LITERAL - 290)) | (1L << (NUM_INT - 290)) | (1L << (NUM_REAL - 290)))) != 0)) {
					{
					setState(1706);
					expression();
					setState(1711);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1707);
						match(COMMA);
						setState(1708);
						expression();
						}
						}
						setState(1713);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1716);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(informixParser.DOT, 0); }
		public TerminalNode LBRACK() { return getToken(informixParser.LBRACK, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(informixParser.RBRACK, 0); }
		public TerminalNode STAR() { return getToken(informixParser.STAR, 0); }
		public ThruNotationContext thruNotation() {
			return getRuleContext(ThruNotationContext.class,0);
		}
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitFieldName(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_fieldName);
		int _la;
		try {
			setState(1747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1729);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					{
					setState(1720);
					identifier();
					setState(1725);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LBRACK) {
						{
						setState(1721);
						match(LBRACK);
						setState(1722);
						numericConstant();
						setState(1723);
						match(RBRACK);
						}
					}

					}
					setState(1727);
					match(DOT);
					}
					break;
				}
				setState(1731);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1732);
				identifier();
				setState(1737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(1733);
					match(LBRACK);
					setState(1734);
					numericConstant();
					setState(1735);
					match(RBRACK);
					}
				}

				}
				setState(1739);
				match(DOT);
				setState(1745);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(1740);
					match(STAR);
					}
					break;
				case IDENT:
					{
					setState(1741);
					identifier();
					setState(1743);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==THROUGH || _la==THRU) {
						{
						setState(1742);
						thruNotation();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThruNotationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode THROUGH() { return getToken(informixParser.THROUGH, 0); }
		public TerminalNode THRU() { return getToken(informixParser.THRU, 0); }
		public TerminalNode SAME() { return getToken(informixParser.SAME, 0); }
		public TerminalNode DOT() { return getToken(informixParser.DOT, 0); }
		public ThruNotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thruNotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterThruNotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitThruNotation(this);
		}
	}

	public final ThruNotationContext thruNotation() throws RecognitionException {
		ThruNotationContext _localctx = new ThruNotationContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_thruNotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1749);
			_la = _input.LA(1);
			if ( !(_la==THROUGH || _la==THRU) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SAME) {
				{
				setState(1750);
				match(SAME);
				setState(1751);
				match(DOT);
				}
			}

			setState(1754);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitFieldList(this);
		}
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_fieldList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1756);
			expression();
			setState(1761);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1757);
					match(COMMA);
					setState(1758);
					expression();
					}
					} 
				}
				setState(1763);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public KeyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterKeyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitKeyList(this);
		}
	}

	public final KeyListContext keyList() throws RecognitionException {
		KeyListContext _localctx = new KeyListContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_keyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			expression();
			setState(1769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1765);
				match(COMMA);
				setState(1766);
				expression();
				}
				}
				setState(1771);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructEventsContext extends ParserRuleContext {
		public TerminalNode BEFORE() { return getToken(informixParser.BEFORE, 0); }
		public TerminalNode CONSTRUCT() { return getToken(informixParser.CONSTRUCT, 0); }
		public TerminalNode AFTER() { return getToken(informixParser.AFTER, 0); }
		public TerminalNode FIELD() { return getToken(informixParser.FIELD, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode ON() { return getToken(informixParser.ON, 0); }
		public TerminalNode KEY() { return getToken(informixParser.KEY, 0); }
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public KeyListContext keyList() {
			return getRuleContext(KeyListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public ConstructEventsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructEvents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterConstructEvents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitConstructEvents(this);
		}
	}

	public final ConstructEventsContext constructEvents() throws RecognitionException {
		ConstructEventsContext _localctx = new ConstructEventsContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_constructEvents);
		try {
			setState(1788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1772);
				match(BEFORE);
				setState(1773);
				match(CONSTRUCT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1774);
				match(AFTER);
				setState(1775);
				match(CONSTRUCT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1776);
				match(BEFORE);
				setState(1777);
				match(FIELD);
				setState(1778);
				fieldList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1779);
				match(AFTER);
				setState(1780);
				match(FIELD);
				setState(1781);
				fieldList();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1782);
				match(ON);
				setState(1783);
				match(KEY);
				setState(1784);
				match(LPAREN);
				setState(1785);
				keyList();
				setState(1786);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructInsideStatementContext extends ParserRuleContext {
		public List<TerminalNode> NEXT() { return getTokens(informixParser.NEXT); }
		public TerminalNode NEXT(int i) {
			return getToken(informixParser.NEXT, i);
		}
		public TerminalNode FIELD() { return getToken(informixParser.FIELD, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public TerminalNode PREVIOUS() { return getToken(informixParser.PREVIOUS, 0); }
		public TerminalNode CONTINUE() { return getToken(informixParser.CONTINUE, 0); }
		public TerminalNode CONSTRUCT() { return getToken(informixParser.CONSTRUCT, 0); }
		public TerminalNode EXIT() { return getToken(informixParser.EXIT, 0); }
		public ConstructInsideStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructInsideStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterConstructInsideStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitConstructInsideStatement(this);
		}
	}

	public final ConstructInsideStatementContext constructInsideStatement() throws RecognitionException {
		ConstructInsideStatementContext _localctx = new ConstructInsideStatementContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_constructInsideStatement);
		try {
			setState(1804);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1790);
				match(NEXT);
				setState(1791);
				match(FIELD);
				setState(1795);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(1792);
					fieldName();
					}
					break;
				case NEXT:
					{
					setState(1793);
					match(NEXT);
					}
					break;
				case PREVIOUS:
					{
					setState(1794);
					match(PREVIOUS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1797);
				eol();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1798);
				match(CONTINUE);
				setState(1799);
				match(CONSTRUCT);
				setState(1800);
				eol();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1801);
				match(EXIT);
				setState(1802);
				match(CONSTRUCT);
				setState(1803);
				eol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialAttributeContext extends ParserRuleContext {
		public TerminalNode REVERSE() { return getToken(informixParser.REVERSE, 0); }
		public TerminalNode BLINK() { return getToken(informixParser.BLINK, 0); }
		public TerminalNode UNDERLINE() { return getToken(informixParser.UNDERLINE, 0); }
		public SpecialAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSpecialAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSpecialAttribute(this);
		}
	}

	public final SpecialAttributeContext specialAttribute() throws RecognitionException {
		SpecialAttributeContext _localctx = new SpecialAttributeContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_specialAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1806);
			_la = _input.LA(1);
			if ( !(_la==BLINK || _la==REVERSE || _la==UNDERLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public List<SpecialAttributeContext> specialAttribute() {
			return getRuleContexts(SpecialAttributeContext.class);
		}
		public SpecialAttributeContext specialAttribute(int i) {
			return getRuleContext(SpecialAttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public TerminalNode BLACK() { return getToken(informixParser.BLACK, 0); }
		public TerminalNode BLUE() { return getToken(informixParser.BLUE, 0); }
		public TerminalNode CYAN() { return getToken(informixParser.CYAN, 0); }
		public TerminalNode GREEN() { return getToken(informixParser.GREEN, 0); }
		public TerminalNode MAGENTA() { return getToken(informixParser.MAGENTA, 0); }
		public TerminalNode RED() { return getToken(informixParser.RED, 0); }
		public TerminalNode WHITE() { return getToken(informixParser.WHITE, 0); }
		public TerminalNode YELLOW() { return getToken(informixParser.YELLOW, 0); }
		public TerminalNode BOLD() { return getToken(informixParser.BOLD, 0); }
		public TerminalNode DIM() { return getToken(informixParser.DIM, 0); }
		public TerminalNode NORMAL() { return getToken(informixParser.NORMAL, 0); }
		public TerminalNode INVISIBLE() { return getToken(informixParser.INVISIBLE, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (BLACK - 23)) | (1L << (BLUE - 23)) | (1L << (BOLD - 23)) | (1L << (CYAN - 23)) | (1L << (DIM - 23)))) != 0) || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (GREEN - 125)) | (1L << (INVISIBLE - 125)) | (1L << (MAGENTA - 125)))) != 0) || _la==NORMAL || _la==RED || _la==WHITE || _la==YELLOW) {
				{
				setState(1808);
				_la = _input.LA(1);
				if ( !(((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (BLACK - 23)) | (1L << (BLUE - 23)) | (1L << (BOLD - 23)) | (1L << (CYAN - 23)) | (1L << (DIM - 23)))) != 0) || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (GREEN - 125)) | (1L << (INVISIBLE - 125)) | (1L << (MAGENTA - 125)))) != 0) || _la==NORMAL || _la==RED || _la==WHITE || _la==YELLOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1811);
			specialAttribute();
			setState(1816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1812);
				match(COMMA);
				setState(1813);
				specialAttribute();
				}
				}
				setState(1818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(informixParser.ATTRIBUTE, 0); }
		public TerminalNode ATTRIBUTES() { return getToken(informixParser.ATTRIBUTES, 0); }
		public AttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitAttributeList(this);
		}
	}

	public final AttributeListContext attributeList() throws RecognitionException {
		AttributeListContext _localctx = new AttributeListContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_attributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1819);
			_la = _input.LA(1);
			if ( !(_la==ATTRIBUTE || _la==ATTRIBUTES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1820);
			match(LPAREN);
			setState(1821);
			attribute();
			setState(1822);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructGroupStatementContext extends ParserRuleContext {
		public ConstructEventsContext constructEvents() {
			return getRuleContext(ConstructEventsContext.class,0);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public ConstructGroupStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructGroupStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterConstructGroupStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitConstructGroupStatement(this);
		}
	}

	public final ConstructGroupStatementContext constructGroupStatement() throws RecognitionException {
		ConstructGroupStatementContext _localctx = new ConstructGroupStatementContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_constructGroupStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1824);
			constructEvents();
			setState(1826); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1825);
				codeBlock();
				}
				}
				setState(1828); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLOCATE) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEALLOCATE - 65)) | (1L << (DECLARE - 65)) | (1L << (DELETE - 65)) | (1L << (DISPLAY - 65)) | (1L << (DROP - 65)) | (1L << (ERROR - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIT - 65)) | (1L << (FETCH - 65)) | (1L << (FINISH - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FREE - 65)) | (1L << (GOTO - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (HIDE - 130)) | (1L << (IF - 130)) | (1L << (INITIALIZE - 130)) | (1L << (INPUT - 130)) | (1L << (INSERT - 130)) | (1L << (LET - 130)) | (1L << (LOAD - 130)) | (1L << (LOCATE - 130)) | (1L << (LOCK - 130)) | (1L << (MENU - 130)) | (1L << (MESSAGE - 130)) | (1L << (NEED - 130)) | (1L << (NEXT - 130)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (OPEN - 201)) | (1L << (OPTIONS - 201)) | (1L << (OUTPUT - 201)) | (1L << (PAUSE - 201)) | (1L << (PREPARE - 201)) | (1L << (PRINT - 201)) | (1L << (PROMPT - 201)) | (1L << (PUT - 201)) | (1L << (RESIZE - 201)) | (1L << (RETURN - 201)) | (1L << (ROLLBACK - 201)) | (1L << (RUN - 201)) | (1L << (SCROLL - 201)) | (1L << (SKIP2 - 201)) | (1L << (SELECT - 201)) | (1L << (SET - 201)) | (1L << (SHOW - 201)) | (1L << (SLEEP - 201)) | (1L << (START - 201)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (TERMINATE - 269)) | (1L << (UNLOAD - 269)) | (1L << (UPDATE - 269)) | (1L << (VALIDATE - 269)) | (1L << (WHENEVER - 269)) | (1L << (WHILE - 269)) | (1L << (IDENT - 269)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructStatementContext extends ParserRuleContext {
		public List<TerminalNode> CONSTRUCT() { return getTokens(informixParser.CONSTRUCT); }
		public TerminalNode CONSTRUCT(int i) {
			return getToken(informixParser.CONSTRUCT, i);
		}
		public TerminalNode BY() { return getToken(informixParser.BY, 0); }
		public TerminalNode NAME() { return getToken(informixParser.NAME, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ON() { return getToken(informixParser.ON, 0); }
		public ColumnsListContext columnsList() {
			return getRuleContext(ColumnsListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(informixParser.FROM, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public TerminalNode HELP() { return getToken(informixParser.HELP, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public TerminalNode END() { return getToken(informixParser.END, 0); }
		public List<ConstructGroupStatementContext> constructGroupStatement() {
			return getRuleContexts(ConstructGroupStatementContext.class);
		}
		public ConstructGroupStatementContext constructGroupStatement(int i) {
			return getRuleContext(ConstructGroupStatementContext.class,i);
		}
		public ConstructStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterConstructStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitConstructStatement(this);
		}
	}

	public final ConstructStatementContext constructStatement() throws RecognitionException {
		ConstructStatementContext _localctx = new ConstructStatementContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_constructStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1830);
			match(CONSTRUCT);
			setState(1843);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BY:
				{
				setState(1831);
				match(BY);
				setState(1832);
				match(NAME);
				setState(1833);
				variable();
				setState(1834);
				match(ON);
				setState(1835);
				columnsList();
				}
				break;
			case ACCEPT:
			case ASCII:
			case COUNT:
			case CURRENT:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MDY:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case IDENT:
				{
				setState(1837);
				variable();
				setState(1838);
				match(ON);
				setState(1839);
				columnsList();
				setState(1840);
				match(FROM);
				setState(1841);
				fieldList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
				{
				setState(1845);
				attributeList();
				}
			}

			setState(1850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HELP) {
				{
				setState(1848);
				match(HELP);
				setState(1849);
				numericConstant();
				}
			}

			setState(1860);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1853); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1852);
					constructGroupStatement();
					}
					}
					setState(1855); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AFTER || _la==BEFORE || _la==ON );
				setState(1857);
				match(END);
				setState(1858);
				match(CONSTRUCT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisplayArrayStatementContext extends ParserRuleContext {
		public List<TerminalNode> DISPLAY() { return getTokens(informixParser.DISPLAY); }
		public TerminalNode DISPLAY(int i) {
			return getToken(informixParser.DISPLAY, i);
		}
		public TerminalNode ARRAY() { return getToken(informixParser.ARRAY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(informixParser.TO, 0); }
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public List<DisplayEventsContext> displayEvents() {
			return getRuleContexts(DisplayEventsContext.class);
		}
		public DisplayEventsContext displayEvents(int i) {
			return getRuleContext(DisplayEventsContext.class,i);
		}
		public TerminalNode END() { return getToken(informixParser.END, 0); }
		public DisplayArrayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayArrayStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterDisplayArrayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitDisplayArrayStatement(this);
		}
	}

	public final DisplayArrayStatementContext displayArrayStatement() throws RecognitionException {
		DisplayArrayStatementContext _localctx = new DisplayArrayStatementContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_displayArrayStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
			match(DISPLAY);
			setState(1863);
			match(ARRAY);
			setState(1864);
			expression();
			setState(1865);
			match(TO);
			setState(1866);
			expression();
			setState(1868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
				{
				setState(1867);
				attributeList();
				}
			}

			setState(1873);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1870);
					displayEvents();
					}
					} 
				}
				setState(1875);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			}
			setState(1878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
			case 1:
				{
				setState(1876);
				match(END);
				setState(1877);
				match(DISPLAY);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisplayInsideStatementContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(informixParser.CONTINUE, 0); }
		public TerminalNode DISPLAY() { return getToken(informixParser.DISPLAY, 0); }
		public TerminalNode EXIT() { return getToken(informixParser.EXIT, 0); }
		public DisplayInsideStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayInsideStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterDisplayInsideStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitDisplayInsideStatement(this);
		}
	}

	public final DisplayInsideStatementContext displayInsideStatement() throws RecognitionException {
		DisplayInsideStatementContext _localctx = new DisplayInsideStatementContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_displayInsideStatement);
		try {
			setState(1884);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1880);
				match(CONTINUE);
				setState(1881);
				match(DISPLAY);
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1882);
				match(EXIT);
				setState(1883);
				match(DISPLAY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisplayEventsContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(informixParser.ON, 0); }
		public TerminalNode KEY() { return getToken(informixParser.KEY, 0); }
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public KeyListContext keyList() {
			return getRuleContext(KeyListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public DisplayEventsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayEvents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterDisplayEvents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitDisplayEvents(this);
		}
	}

	public final DisplayEventsContext displayEvents() throws RecognitionException {
		DisplayEventsContext _localctx = new DisplayEventsContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_displayEvents);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			match(ON);
			setState(1887);
			match(KEY);
			setState(1888);
			match(LPAREN);
			setState(1889);
			keyList();
			setState(1890);
			match(RPAREN);
			setState(1892); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1891);
					codeBlock();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1894); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DisplayStatementContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(informixParser.DISPLAY, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode BY() { return getToken(informixParser.BY, 0); }
		public TerminalNode NAME() { return getToken(informixParser.NAME, 0); }
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode TO() { return getToken(informixParser.TO, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode AT() { return getToken(informixParser.AT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public DisplayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterDisplayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitDisplayStatement(this);
		}
	}

	public final DisplayStatementContext displayStatement() throws RecognitionException {
		DisplayStatementContext _localctx = new DisplayStatementContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_displayStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
			match(DISPLAY);
			setState(1924);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BY:
				{
				setState(1897);
				match(BY);
				setState(1898);
				match(NAME);
				{
				setState(1899);
				expression();
				setState(1904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1900);
					match(COMMA);
					setState(1901);
					expression();
					}
					}
					setState(1906);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case ACCEPT:
			case ASCII:
			case AVG:
			case COLUMN:
			case COUNT:
			case CURRENT:
			case DATE:
			case DAY:
			case EXTEND:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INFIELD:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MAX:
			case MDY:
			case MIN:
			case MONTH:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case PREPARE:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case SUM:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case YEAR:
			case PLUS:
			case MINUS:
			case LPAREN:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				{
				{
				setState(1907);
				expression();
				setState(1912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1908);
					match(COMMA);
					setState(1909);
					expression();
					}
					}
					setState(1914);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(1922);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TO:
					{
					setState(1915);
					match(TO);
					setState(1916);
					fieldList();
					}
					break;
				case AT:
					{
					setState(1917);
					match(AT);
					setState(1918);
					expression();
					setState(1919);
					match(COMMA);
					setState(1920);
					expression();
					}
					break;
				case ATTRIBUTE:
				case ATTRIBUTES:
				case EOL:
					break;
				default:
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
				{
				setState(1926);
				attributeList();
				}
			}

			setState(1929);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorStatementContext extends ParserRuleContext {
		public TerminalNode ERROR() { return getToken(informixParser.ERROR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public ErrorStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterErrorStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitErrorStatement(this);
		}
	}

	public final ErrorStatementContext errorStatement() throws RecognitionException {
		ErrorStatementContext _localctx = new ErrorStatementContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_errorStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1931);
			match(ERROR);
			setState(1932);
			expression();
			setState(1937);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1933);
				match(COMMA);
				setState(1934);
				expression();
				}
				}
				setState(1939);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1941);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
				{
				setState(1940);
				attributeList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MessageStatementContext extends ParserRuleContext {
		public TerminalNode MESSAGE() { return getToken(informixParser.MESSAGE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public MessageStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterMessageStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitMessageStatement(this);
		}
	}

	public final MessageStatementContext messageStatement() throws RecognitionException {
		MessageStatementContext _localctx = new MessageStatementContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_messageStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			match(MESSAGE);
			setState(1944);
			expression();
			setState(1949);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1945);
				match(COMMA);
				setState(1946);
				expression();
				}
				}
				setState(1951);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1953);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
				{
				setState(1952);
				attributeList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PromptStatementContext extends ParserRuleContext {
		public List<TerminalNode> PROMPT() { return getTokens(informixParser.PROMPT); }
		public TerminalNode PROMPT(int i) {
			return getToken(informixParser.PROMPT, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(informixParser.FOR, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public List<AttributeListContext> attributeList() {
			return getRuleContexts(AttributeListContext.class);
		}
		public AttributeListContext attributeList(int i) {
			return getRuleContext(AttributeListContext.class,i);
		}
		public TerminalNode CHAR() { return getToken(informixParser.CHAR, 0); }
		public TerminalNode HELP() { return getToken(informixParser.HELP, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public TerminalNode END() { return getToken(informixParser.END, 0); }
		public List<TerminalNode> ON() { return getTokens(informixParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(informixParser.ON, i);
		}
		public List<TerminalNode> KEY() { return getTokens(informixParser.KEY); }
		public TerminalNode KEY(int i) {
			return getToken(informixParser.KEY, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(informixParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(informixParser.LPAREN, i);
		}
		public List<KeyListContext> keyList() {
			return getRuleContexts(KeyListContext.class);
		}
		public KeyListContext keyList(int i) {
			return getRuleContext(KeyListContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(informixParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(informixParser.RPAREN, i);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public PromptStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_promptStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterPromptStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitPromptStatement(this);
		}
	}

	public final PromptStatementContext promptStatement() throws RecognitionException {
		PromptStatementContext _localctx = new PromptStatementContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_promptStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			match(PROMPT);
			setState(1956);
			expression();
			setState(1961);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1957);
				match(COMMA);
				setState(1958);
				expression();
				}
				}
				setState(1963);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
				{
				setState(1964);
				attributeList();
				}
			}

			setState(1967);
			match(FOR);
			setState(1969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CHAR) {
				{
				setState(1968);
				match(CHAR);
				}
			}

			setState(1971);
			variable();
			setState(1974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HELP) {
				{
				setState(1972);
				match(HELP);
				setState(1973);
				numericConstant();
				}
			}

			setState(1977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
				{
				setState(1976);
				attributeList();
				}
			}

			setState(1994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ON) {
					{
					{
					setState(1979);
					match(ON);
					setState(1980);
					match(KEY);
					setState(1981);
					match(LPAREN);
					setState(1982);
					keyList();
					setState(1983);
					match(RPAREN);
					setState(1985);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLOCATE) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEALLOCATE - 65)) | (1L << (DECLARE - 65)) | (1L << (DELETE - 65)) | (1L << (DISPLAY - 65)) | (1L << (DROP - 65)) | (1L << (ERROR - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIT - 65)) | (1L << (FETCH - 65)) | (1L << (FINISH - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FREE - 65)) | (1L << (GOTO - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (HIDE - 130)) | (1L << (IF - 130)) | (1L << (INITIALIZE - 130)) | (1L << (INPUT - 130)) | (1L << (INSERT - 130)) | (1L << (LET - 130)) | (1L << (LOAD - 130)) | (1L << (LOCATE - 130)) | (1L << (LOCK - 130)) | (1L << (MENU - 130)) | (1L << (MESSAGE - 130)) | (1L << (NEED - 130)) | (1L << (NEXT - 130)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (OPEN - 201)) | (1L << (OPTIONS - 201)) | (1L << (OUTPUT - 201)) | (1L << (PAUSE - 201)) | (1L << (PREPARE - 201)) | (1L << (PRINT - 201)) | (1L << (PROMPT - 201)) | (1L << (PUT - 201)) | (1L << (RESIZE - 201)) | (1L << (RETURN - 201)) | (1L << (ROLLBACK - 201)) | (1L << (RUN - 201)) | (1L << (SCROLL - 201)) | (1L << (SKIP2 - 201)) | (1L << (SELECT - 201)) | (1L << (SET - 201)) | (1L << (SHOW - 201)) | (1L << (SLEEP - 201)) | (1L << (START - 201)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (TERMINATE - 269)) | (1L << (UNLOAD - 269)) | (1L << (UPDATE - 269)) | (1L << (VALIDATE - 269)) | (1L << (WHENEVER - 269)) | (1L << (WHILE - 269)) | (1L << (IDENT - 269)))) != 0)) {
						{
						setState(1984);
						codeBlock();
						}
					}

					}
					}
					setState(1991);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1992);
				match(END);
				setState(1993);
				match(PROMPT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputEventsContext extends ParserRuleContext {
		public TerminalNode BEFORE() { return getToken(informixParser.BEFORE, 0); }
		public TerminalNode AFTER() { return getToken(informixParser.AFTER, 0); }
		public TerminalNode INPUT() { return getToken(informixParser.INPUT, 0); }
		public TerminalNode ROW() { return getToken(informixParser.ROW, 0); }
		public TerminalNode INSERT() { return getToken(informixParser.INSERT, 0); }
		public TerminalNode DELETE() { return getToken(informixParser.DELETE, 0); }
		public TerminalNode FIELD() { return getToken(informixParser.FIELD, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode ON() { return getToken(informixParser.ON, 0); }
		public TerminalNode KEY() { return getToken(informixParser.KEY, 0); }
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public KeyListContext keyList() {
			return getRuleContext(KeyListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public InputEventsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputEvents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterInputEvents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitInputEvents(this);
		}
	}

	public final InputEventsContext inputEvents() throws RecognitionException {
		InputEventsContext _localctx = new InputEventsContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_inputEvents);
		int _la;
		try {
			setState(2010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1996);
				_la = _input.LA(1);
				if ( !(_la==AFTER || _la==BEFORE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1997);
				_la = _input.LA(1);
				if ( !(_la==DELETE || _la==INPUT || _la==INSERT || _la==ROW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1998);
				match(BEFORE);
				setState(1999);
				match(FIELD);
				setState(2000);
				fieldList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2001);
				match(AFTER);
				setState(2002);
				match(FIELD);
				setState(2003);
				fieldList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2004);
				match(ON);
				setState(2005);
				match(KEY);
				setState(2006);
				match(LPAREN);
				setState(2007);
				keyList();
				setState(2008);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputInsideStatementContext extends ParserRuleContext {
		public List<TerminalNode> NEXT() { return getTokens(informixParser.NEXT); }
		public TerminalNode NEXT(int i) {
			return getToken(informixParser.NEXT, i);
		}
		public TerminalNode FIELD() { return getToken(informixParser.FIELD, 0); }
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public TerminalNode PREVIOUS() { return getToken(informixParser.PREVIOUS, 0); }
		public TerminalNode CONTINUE() { return getToken(informixParser.CONTINUE, 0); }
		public TerminalNode INPUT() { return getToken(informixParser.INPUT, 0); }
		public TerminalNode EXIT() { return getToken(informixParser.EXIT, 0); }
		public InputInsideStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputInsideStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterInputInsideStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitInputInsideStatement(this);
		}
	}

	public final InputInsideStatementContext inputInsideStatement() throws RecognitionException {
		InputInsideStatementContext _localctx = new InputInsideStatementContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_inputInsideStatement);
		int _la;
		try {
			setState(2024);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2012);
				match(NEXT);
				setState(2013);
				match(FIELD);
				setState(2016);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENT:
					{
					setState(2014);
					fieldName();
					}
					break;
				case NEXT:
				case PREVIOUS:
					{
					setState(2015);
					_la = _input.LA(1);
					if ( !(_la==NEXT || _la==PREVIOUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case CONTINUE:
			case EXIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2022);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTINUE:
					{
					setState(2018);
					match(CONTINUE);
					setState(2019);
					match(INPUT);
					}
					break;
				case EXIT:
					{
					setState(2020);
					match(EXIT);
					setState(2021);
					match(INPUT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputGroupStatementContext extends ParserRuleContext {
		public InputEventsContext inputEvents() {
			return getRuleContext(InputEventsContext.class,0);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public InputGroupStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputGroupStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterInputGroupStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitInputGroupStatement(this);
		}
	}

	public final InputGroupStatementContext inputGroupStatement() throws RecognitionException {
		InputGroupStatementContext _localctx = new InputGroupStatementContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_inputGroupStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2026);
			inputEvents();
			setState(2030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLOCATE) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEALLOCATE - 65)) | (1L << (DECLARE - 65)) | (1L << (DELETE - 65)) | (1L << (DISPLAY - 65)) | (1L << (DROP - 65)) | (1L << (ERROR - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIT - 65)) | (1L << (FETCH - 65)) | (1L << (FINISH - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FREE - 65)) | (1L << (GOTO - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (HIDE - 130)) | (1L << (IF - 130)) | (1L << (INITIALIZE - 130)) | (1L << (INPUT - 130)) | (1L << (INSERT - 130)) | (1L << (LET - 130)) | (1L << (LOAD - 130)) | (1L << (LOCATE - 130)) | (1L << (LOCK - 130)) | (1L << (MENU - 130)) | (1L << (MESSAGE - 130)) | (1L << (NEED - 130)) | (1L << (NEXT - 130)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (OPEN - 201)) | (1L << (OPTIONS - 201)) | (1L << (OUTPUT - 201)) | (1L << (PAUSE - 201)) | (1L << (PREPARE - 201)) | (1L << (PRINT - 201)) | (1L << (PROMPT - 201)) | (1L << (PUT - 201)) | (1L << (RESIZE - 201)) | (1L << (RETURN - 201)) | (1L << (ROLLBACK - 201)) | (1L << (RUN - 201)) | (1L << (SCROLL - 201)) | (1L << (SKIP2 - 201)) | (1L << (SELECT - 201)) | (1L << (SET - 201)) | (1L << (SHOW - 201)) | (1L << (SLEEP - 201)) | (1L << (START - 201)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (TERMINATE - 269)) | (1L << (UNLOAD - 269)) | (1L << (UPDATE - 269)) | (1L << (VALIDATE - 269)) | (1L << (WHENEVER - 269)) | (1L << (WHILE - 269)) | (1L << (IDENT - 269)))) != 0)) {
				{
				{
				setState(2027);
				codeBlock();
				}
				}
				setState(2032);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputStatementContext extends ParserRuleContext {
		public List<TerminalNode> INPUT() { return getTokens(informixParser.INPUT); }
		public TerminalNode INPUT(int i) {
			return getToken(informixParser.INPUT, i);
		}
		public TerminalNode BY() { return getToken(informixParser.BY, 0); }
		public TerminalNode NAME() { return getToken(informixParser.NAME, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(informixParser.FROM, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public TerminalNode HELP() { return getToken(informixParser.HELP, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public TerminalNode END() { return getToken(informixParser.END, 0); }
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public TerminalNode WITHOUT() { return getToken(informixParser.WITHOUT, 0); }
		public TerminalNode DEFAULTS() { return getToken(informixParser.DEFAULTS, 0); }
		public List<InputGroupStatementContext> inputGroupStatement() {
			return getRuleContexts(InputGroupStatementContext.class);
		}
		public InputGroupStatementContext inputGroupStatement(int i) {
			return getRuleContext(InputGroupStatementContext.class,i);
		}
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitInputStatement(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_inputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2033);
			match(INPUT);
			setState(2063);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BY:
				{
				setState(2034);
				match(BY);
				setState(2035);
				match(NAME);
				setState(2036);
				expression();
				setState(2041);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2037);
					match(COMMA);
					setState(2038);
					expression();
					}
					}
					setState(2043);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2046);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITHOUT) {
					{
					setState(2044);
					match(WITHOUT);
					setState(2045);
					match(DEFAULTS);
					}
				}

				}
				break;
			case ACCEPT:
			case ASCII:
			case AVG:
			case COLUMN:
			case COUNT:
			case CURRENT:
			case DATE:
			case DAY:
			case EXTEND:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INFIELD:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MAX:
			case MDY:
			case MIN:
			case MONTH:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case PREPARE:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case SUM:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case YEAR:
			case PLUS:
			case MINUS:
			case LPAREN:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				{
				setState(2048);
				expression();
				setState(2053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2049);
					match(COMMA);
					setState(2050);
					expression();
					}
					}
					setState(2055);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITHOUT) {
					{
					setState(2056);
					match(WITHOUT);
					setState(2057);
					match(DEFAULTS);
					}
				}

				setState(2060);
				match(FROM);
				setState(2061);
				fieldList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2066);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
				{
				setState(2065);
				attributeList();
				}
			}

			setState(2070);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HELP) {
				{
				setState(2068);
				match(HELP);
				setState(2069);
				numericConstant();
				}
			}

			setState(2080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(2073); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2072);
					inputGroupStatement();
					}
					}
					setState(2075); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AFTER || _la==BEFORE || _la==ON );
				setState(2077);
				match(END);
				setState(2078);
				match(INPUT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputArrayStatementContext extends ParserRuleContext {
		public List<TerminalNode> INPUT() { return getTokens(informixParser.INPUT); }
		public TerminalNode INPUT(int i) {
			return getToken(informixParser.INPUT, i);
		}
		public TerminalNode ARRAY() { return getToken(informixParser.ARRAY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(informixParser.FROM, 0); }
		public TerminalNode WITHOUT() { return getToken(informixParser.WITHOUT, 0); }
		public TerminalNode DEFAULTS() { return getToken(informixParser.DEFAULTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public TerminalNode HELP() { return getToken(informixParser.HELP, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public TerminalNode END() { return getToken(informixParser.END, 0); }
		public List<InputGroupStatementContext> inputGroupStatement() {
			return getRuleContexts(InputGroupStatementContext.class);
		}
		public InputGroupStatementContext inputGroupStatement(int i) {
			return getRuleContext(InputGroupStatementContext.class,i);
		}
		public InputArrayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputArrayStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterInputArrayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitInputArrayStatement(this);
		}
	}

	public final InputArrayStatementContext inputArrayStatement() throws RecognitionException {
		InputArrayStatementContext _localctx = new InputArrayStatementContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_inputArrayStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2082);
			match(INPUT);
			setState(2083);
			match(ARRAY);
			setState(2084);
			expression();
			setState(2087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITHOUT) {
				{
				setState(2085);
				match(WITHOUT);
				setState(2086);
				match(DEFAULTS);
				}
			}

			setState(2089);
			match(FROM);
			setState(2090);
			expression();
			setState(2095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2091);
				match(COMMA);
				setState(2092);
				expression();
				}
				}
				setState(2097);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HELP) {
				{
				setState(2098);
				match(HELP);
				setState(2099);
				numericConstant();
				}
			}

			setState(2103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
				{
				setState(2102);
				attributeList();
				}
			}

			setState(2113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				setState(2106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2105);
					inputGroupStatement();
					}
					}
					setState(2108); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AFTER || _la==BEFORE || _la==ON );
				setState(2110);
				match(END);
				setState(2111);
				match(INPUT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MenuEventsContext extends ParserRuleContext {
		public TerminalNode BEFORE() { return getToken(informixParser.BEFORE, 0); }
		public TerminalNode MENU() { return getToken(informixParser.MENU, 0); }
		public TerminalNode COMMAND() { return getToken(informixParser.COMMAND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode KEY() { return getToken(informixParser.KEY, 0); }
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public KeyListContext keyList() {
			return getRuleContext(KeyListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public TerminalNode HELP() { return getToken(informixParser.HELP, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public MenuEventsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menuEvents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterMenuEvents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitMenuEvents(this);
		}
	}

	public final MenuEventsContext menuEvents() throws RecognitionException {
		MenuEventsContext _localctx = new MenuEventsContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_menuEvents);
		int _la;
		try {
			setState(2133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEFORE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2115);
				match(BEFORE);
				setState(2116);
				match(MENU);
				}
				break;
			case COMMAND:
				enterOuterAlt(_localctx, 2);
				{
				setState(2117);
				match(COMMAND);
				{
				setState(2123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(2118);
					match(KEY);
					setState(2119);
					match(LPAREN);
					setState(2120);
					keyList();
					setState(2121);
					match(RPAREN);
					}
				}

				setState(2125);
				expression();
				setState(2127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
				case 1:
					{
					setState(2126);
					expression();
					}
					break;
				}
				setState(2131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HELP) {
					{
					setState(2129);
					match(HELP);
					setState(2130);
					numericConstant();
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MenuInsideStatementContext extends ParserRuleContext {
		public TerminalNode NEXT() { return getToken(informixParser.NEXT, 0); }
		public TerminalNode OPTION() { return getToken(informixParser.OPTION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(informixParser.ALL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public TerminalNode SHOW() { return getToken(informixParser.SHOW, 0); }
		public TerminalNode HIDE() { return getToken(informixParser.HIDE, 0); }
		public TerminalNode CONTINUE() { return getToken(informixParser.CONTINUE, 0); }
		public TerminalNode MENU() { return getToken(informixParser.MENU, 0); }
		public TerminalNode EXIT() { return getToken(informixParser.EXIT, 0); }
		public MenuInsideStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menuInsideStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterMenuInsideStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitMenuInsideStatement(this);
		}
	}

	public final MenuInsideStatementContext menuInsideStatement() throws RecognitionException {
		MenuInsideStatementContext _localctx = new MenuInsideStatementContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_menuInsideStatement);
		int _la;
		try {
			setState(2178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2135);
				match(NEXT);
				setState(2136);
				match(OPTION);
				setState(2139);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACCEPT:
				case ASCII:
				case AVG:
				case COLUMN:
				case COUNT:
				case CURRENT:
				case DATE:
				case DAY:
				case EXTEND:
				case FALSE:
				case FIRST:
				case FOUND:
				case GROUP:
				case HIDE:
				case INDEX:
				case INFIELD:
				case INT_FLAG:
				case INTERRUPT:
				case LAST:
				case LENGTH:
				case LINENO:
				case MAX:
				case MDY:
				case MIN:
				case MONTH:
				case NO:
				case NOT:
				case NOTFOUND:
				case NULL:
				case PAGENO:
				case PREPARE:
				case REAL:
				case SIZE:
				case SQL:
				case STATUS:
				case SUM:
				case TEMP:
				case TIME:
				case TODAY:
				case TRUE:
				case USER:
				case WEEKDAY:
				case WAIT:
				case WORK:
				case YEAR:
				case PLUS:
				case MINUS:
				case LPAREN:
				case IDENT:
				case STRING_LITERAL:
				case NUM_INT:
				case NUM_REAL:
					{
					setState(2137);
					expression();
					}
					break;
				case ALL:
					{
					setState(2138);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2141);
					match(COMMA);
					setState(2142);
					expression();
					}
					}
					setState(2147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 2);
				{
				setState(2148);
				match(SHOW);
				setState(2149);
				match(OPTION);
				setState(2152);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACCEPT:
				case ASCII:
				case AVG:
				case COLUMN:
				case COUNT:
				case CURRENT:
				case DATE:
				case DAY:
				case EXTEND:
				case FALSE:
				case FIRST:
				case FOUND:
				case GROUP:
				case HIDE:
				case INDEX:
				case INFIELD:
				case INT_FLAG:
				case INTERRUPT:
				case LAST:
				case LENGTH:
				case LINENO:
				case MAX:
				case MDY:
				case MIN:
				case MONTH:
				case NO:
				case NOT:
				case NOTFOUND:
				case NULL:
				case PAGENO:
				case PREPARE:
				case REAL:
				case SIZE:
				case SQL:
				case STATUS:
				case SUM:
				case TEMP:
				case TIME:
				case TODAY:
				case TRUE:
				case USER:
				case WEEKDAY:
				case WAIT:
				case WORK:
				case YEAR:
				case PLUS:
				case MINUS:
				case LPAREN:
				case IDENT:
				case STRING_LITERAL:
				case NUM_INT:
				case NUM_REAL:
					{
					setState(2150);
					expression();
					}
					break;
				case ALL:
					{
					setState(2151);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2154);
					match(COMMA);
					setState(2155);
					expression();
					}
					}
					setState(2160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case HIDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2161);
				match(HIDE);
				setState(2162);
				match(OPTION);
				setState(2165);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACCEPT:
				case ASCII:
				case AVG:
				case COLUMN:
				case COUNT:
				case CURRENT:
				case DATE:
				case DAY:
				case EXTEND:
				case FALSE:
				case FIRST:
				case FOUND:
				case GROUP:
				case HIDE:
				case INDEX:
				case INFIELD:
				case INT_FLAG:
				case INTERRUPT:
				case LAST:
				case LENGTH:
				case LINENO:
				case MAX:
				case MDY:
				case MIN:
				case MONTH:
				case NO:
				case NOT:
				case NOTFOUND:
				case NULL:
				case PAGENO:
				case PREPARE:
				case REAL:
				case SIZE:
				case SQL:
				case STATUS:
				case SUM:
				case TEMP:
				case TIME:
				case TODAY:
				case TRUE:
				case USER:
				case WEEKDAY:
				case WAIT:
				case WORK:
				case YEAR:
				case PLUS:
				case MINUS:
				case LPAREN:
				case IDENT:
				case STRING_LITERAL:
				case NUM_INT:
				case NUM_REAL:
					{
					setState(2163);
					expression();
					}
					break;
				case ALL:
					{
					setState(2164);
					match(ALL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2167);
					match(COMMA);
					setState(2168);
					expression();
					}
					}
					setState(2173);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2174);
				match(CONTINUE);
				setState(2175);
				match(MENU);
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2176);
				match(EXIT);
				setState(2177);
				match(MENU);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MenuGroupStatementContext extends ParserRuleContext {
		public MenuEventsContext menuEvents() {
			return getRuleContext(MenuEventsContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public MenuGroupStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menuGroupStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterMenuGroupStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitMenuGroupStatement(this);
		}
	}

	public final MenuGroupStatementContext menuGroupStatement() throws RecognitionException {
		MenuGroupStatementContext _localctx = new MenuGroupStatementContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_menuGroupStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2180);
			menuEvents();
			setState(2182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ALLOCATE) | (1L << BEGIN) | (1L << CALL) | (1L << CASE) | (1L << CLEAR) | (1L << CLOSE) | (1L << COMMIT) | (1L << CONSTRUCT) | (1L << CONTINUE) | (1L << CREATE) | (1L << CURRENT) | (1L << DATABASE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (DEALLOCATE - 65)) | (1L << (DECLARE - 65)) | (1L << (DELETE - 65)) | (1L << (DISPLAY - 65)) | (1L << (DROP - 65)) | (1L << (ERROR - 65)) | (1L << (EXECUTE - 65)) | (1L << (EXIT - 65)) | (1L << (FETCH - 65)) | (1L << (FINISH - 65)) | (1L << (FLUSH - 65)) | (1L << (FOR - 65)) | (1L << (FOREACH - 65)) | (1L << (FREE - 65)) | (1L << (GOTO - 65)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (HIDE - 130)) | (1L << (IF - 130)) | (1L << (INITIALIZE - 130)) | (1L << (INPUT - 130)) | (1L << (INSERT - 130)) | (1L << (LET - 130)) | (1L << (LOAD - 130)) | (1L << (LOCATE - 130)) | (1L << (LOCK - 130)) | (1L << (MENU - 130)) | (1L << (MESSAGE - 130)) | (1L << (NEED - 130)) | (1L << (NEXT - 130)))) != 0) || ((((_la - 201)) & ~0x3f) == 0 && ((1L << (_la - 201)) & ((1L << (OPEN - 201)) | (1L << (OPTIONS - 201)) | (1L << (OUTPUT - 201)) | (1L << (PAUSE - 201)) | (1L << (PREPARE - 201)) | (1L << (PRINT - 201)) | (1L << (PROMPT - 201)) | (1L << (PUT - 201)) | (1L << (RESIZE - 201)) | (1L << (RETURN - 201)) | (1L << (ROLLBACK - 201)) | (1L << (RUN - 201)) | (1L << (SCROLL - 201)) | (1L << (SKIP2 - 201)) | (1L << (SELECT - 201)) | (1L << (SET - 201)) | (1L << (SHOW - 201)) | (1L << (SLEEP - 201)) | (1L << (START - 201)))) != 0) || ((((_la - 269)) & ~0x3f) == 0 && ((1L << (_la - 269)) & ((1L << (TERMINATE - 269)) | (1L << (UNLOAD - 269)) | (1L << (UPDATE - 269)) | (1L << (VALIDATE - 269)) | (1L << (WHENEVER - 269)) | (1L << (WHILE - 269)) | (1L << (IDENT - 269)))) != 0)) {
				{
				setState(2181);
				codeBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MenuStatementContext extends ParserRuleContext {
		public List<TerminalNode> MENU() { return getTokens(informixParser.MENU); }
		public TerminalNode MENU(int i) {
			return getToken(informixParser.MENU, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(informixParser.END, 0); }
		public List<MenuGroupStatementContext> menuGroupStatement() {
			return getRuleContexts(MenuGroupStatementContext.class);
		}
		public MenuGroupStatementContext menuGroupStatement(int i) {
			return getRuleContext(MenuGroupStatementContext.class,i);
		}
		public MenuStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menuStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterMenuStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitMenuStatement(this);
		}
	}

	public final MenuStatementContext menuStatement() throws RecognitionException {
		MenuStatementContext _localctx = new MenuStatementContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_menuStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2184);
			match(MENU);
			setState(2185);
			expression();
			setState(2189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BEFORE || _la==COMMAND) {
				{
				{
				setState(2186);
				menuGroupStatement();
				}
				}
				setState(2191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2192);
			match(END);
			setState(2193);
			match(MENU);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReservedLinePositionContext extends ParserRuleContext {
		public TerminalNode FIRST() { return getToken(informixParser.FIRST, 0); }
		public TerminalNode PLUS() { return getToken(informixParser.PLUS, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public TerminalNode LAST() { return getToken(informixParser.LAST, 0); }
		public TerminalNode MINUS() { return getToken(informixParser.MINUS, 0); }
		public ReservedLinePositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedLinePosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterReservedLinePosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitReservedLinePosition(this);
		}
	}

	public final ReservedLinePositionContext reservedLinePosition() throws RecognitionException {
		ReservedLinePositionContext _localctx = new ReservedLinePositionContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_reservedLinePosition);
		int _la;
		try {
			setState(2206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2195);
				match(FIRST);
				setState(2198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS) {
					{
					setState(2196);
					match(PLUS);
					setState(2197);
					numericConstant();
					}
				}

				}
				break;
			case PLUS:
			case MINUS:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2200);
				numericConstant();
				}
				break;
			case LAST:
				enterOuterAlt(_localctx, 3);
				{
				setState(2201);
				match(LAST);
				setState(2204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2202);
					match(MINUS);
					setState(2203);
					numericConstant();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialWindowAttributeContext extends ParserRuleContext {
		public TerminalNode BLACK() { return getToken(informixParser.BLACK, 0); }
		public TerminalNode BLUE() { return getToken(informixParser.BLUE, 0); }
		public TerminalNode CYAN() { return getToken(informixParser.CYAN, 0); }
		public TerminalNode GREEN() { return getToken(informixParser.GREEN, 0); }
		public TerminalNode MAGENTA() { return getToken(informixParser.MAGENTA, 0); }
		public TerminalNode RED() { return getToken(informixParser.RED, 0); }
		public TerminalNode WHITE() { return getToken(informixParser.WHITE, 0); }
		public TerminalNode YELLOW() { return getToken(informixParser.YELLOW, 0); }
		public TerminalNode BOLD() { return getToken(informixParser.BOLD, 0); }
		public TerminalNode DIM() { return getToken(informixParser.DIM, 0); }
		public TerminalNode NORMAL() { return getToken(informixParser.NORMAL, 0); }
		public TerminalNode INVISIBLE() { return getToken(informixParser.INVISIBLE, 0); }
		public TerminalNode REVERSE() { return getToken(informixParser.REVERSE, 0); }
		public TerminalNode BORDER() { return getToken(informixParser.BORDER, 0); }
		public TerminalNode LINE() { return getToken(informixParser.LINE, 0); }
		public ReservedLinePositionContext reservedLinePosition() {
			return getRuleContext(ReservedLinePositionContext.class,0);
		}
		public TerminalNode PROMPT() { return getToken(informixParser.PROMPT, 0); }
		public TerminalNode FORM() { return getToken(informixParser.FORM, 0); }
		public TerminalNode MENU() { return getToken(informixParser.MENU, 0); }
		public TerminalNode MESSAGE() { return getToken(informixParser.MESSAGE, 0); }
		public TerminalNode COMMENT() { return getToken(informixParser.COMMENT, 0); }
		public TerminalNode OFF() { return getToken(informixParser.OFF, 0); }
		public SpecialWindowAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialWindowAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSpecialWindowAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSpecialWindowAttribute(this);
		}
	}

	public final SpecialWindowAttributeContext specialWindowAttribute() throws RecognitionException {
		SpecialWindowAttributeContext _localctx = new SpecialWindowAttributeContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_specialWindowAttribute);
		int _la;
		try {
			setState(2220);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BLACK:
			case BLUE:
			case BOLD:
			case CYAN:
			case DIM:
			case GREEN:
			case INVISIBLE:
			case MAGENTA:
			case NORMAL:
			case RED:
			case WHITE:
			case YELLOW:
				enterOuterAlt(_localctx, 1);
				{
				setState(2208);
				_la = _input.LA(1);
				if ( !(((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & ((1L << (BLACK - 23)) | (1L << (BLUE - 23)) | (1L << (BOLD - 23)) | (1L << (CYAN - 23)) | (1L << (DIM - 23)))) != 0) || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & ((1L << (GREEN - 125)) | (1L << (INVISIBLE - 125)) | (1L << (MAGENTA - 125)))) != 0) || _la==NORMAL || _la==RED || _la==WHITE || _la==YELLOW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case REVERSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2209);
				match(REVERSE);
				}
				break;
			case BORDER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2210);
				match(BORDER);
				}
				break;
			case FORM:
			case MENU:
			case MESSAGE:
			case PROMPT:
				enterOuterAlt(_localctx, 4);
				{
				setState(2211);
				_la = _input.LA(1);
				if ( !(((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (FORM - 112)) | (1L << (MENU - 112)) | (1L << (MESSAGE - 112)))) != 0) || _la==PROMPT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2212);
				match(LINE);
				setState(2213);
				reservedLinePosition();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(2214);
				match(COMMENT);
				setState(2215);
				match(LINE);
				setState(2218);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FIRST:
				case LAST:
				case PLUS:
				case MINUS:
				case NUM_INT:
				case NUM_REAL:
					{
					setState(2216);
					reservedLinePosition();
					}
					break;
				case OFF:
					{
					setState(2217);
					match(OFF);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowAttributeContext extends ParserRuleContext {
		public List<SpecialWindowAttributeContext> specialWindowAttribute() {
			return getRuleContexts(SpecialWindowAttributeContext.class);
		}
		public SpecialWindowAttributeContext specialWindowAttribute(int i) {
			return getRuleContext(SpecialWindowAttributeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public WindowAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterWindowAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitWindowAttribute(this);
		}
	}

	public final WindowAttributeContext windowAttribute() throws RecognitionException {
		WindowAttributeContext _localctx = new WindowAttributeContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_windowAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2222);
			specialWindowAttribute();
			setState(2227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2223);
				match(COMMA);
				setState(2224);
				specialWindowAttribute();
				}
				}
				setState(2229);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowAttributeListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public WindowAttributeContext windowAttribute() {
			return getRuleContext(WindowAttributeContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(informixParser.ATTRIBUTE, 0); }
		public TerminalNode ATTRIBUTES() { return getToken(informixParser.ATTRIBUTES, 0); }
		public WindowAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterWindowAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitWindowAttributeList(this);
		}
	}

	public final WindowAttributeListContext windowAttributeList() throws RecognitionException {
		WindowAttributeListContext _localctx = new WindowAttributeListContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_windowAttributeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2230);
			_la = _input.LA(1);
			if ( !(_la==ATTRIBUTE || _la==ATTRIBUTES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2231);
			match(LPAREN);
			setState(2232);
			windowAttribute();
			setState(2233);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionStatementContext extends ParserRuleContext {
		public TerminalNode MESSAGE() { return getToken(informixParser.MESSAGE, 0); }
		public TerminalNode LINE() { return getToken(informixParser.LINE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PROMPT() { return getToken(informixParser.PROMPT, 0); }
		public TerminalNode MENU() { return getToken(informixParser.MENU, 0); }
		public TerminalNode COMMENT() { return getToken(informixParser.COMMENT, 0); }
		public TerminalNode ERROR() { return getToken(informixParser.ERROR, 0); }
		public TerminalNode FORM() { return getToken(informixParser.FORM, 0); }
		public TerminalNode INPUT() { return getToken(informixParser.INPUT, 0); }
		public TerminalNode INSERT() { return getToken(informixParser.INSERT, 0); }
		public TerminalNode KEY() { return getToken(informixParser.KEY, 0); }
		public TerminalNode DELETE() { return getToken(informixParser.DELETE, 0); }
		public TerminalNode NEXT() { return getToken(informixParser.NEXT, 0); }
		public TerminalNode PREVIOUS() { return getToken(informixParser.PREVIOUS, 0); }
		public TerminalNode ACCEPT() { return getToken(informixParser.ACCEPT, 0); }
		public TerminalNode HELP() { return getToken(informixParser.HELP, 0); }
		public TerminalNode FILE() { return getToken(informixParser.FILE, 0); }
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public TerminalNode DISPLAY() { return getToken(informixParser.DISPLAY, 0); }
		public TerminalNode SQL() { return getToken(informixParser.SQL, 0); }
		public TerminalNode INTERRUPT() { return getToken(informixParser.INTERRUPT, 0); }
		public TerminalNode FIELD() { return getToken(informixParser.FIELD, 0); }
		public TerminalNode ORDER() { return getToken(informixParser.ORDER, 0); }
		public TerminalNode ON() { return getToken(informixParser.ON, 0); }
		public TerminalNode OFF() { return getToken(informixParser.OFF, 0); }
		public TerminalNode CONSTRAINED() { return getToken(informixParser.CONSTRAINED, 0); }
		public TerminalNode UNCONSTRAINED() { return getToken(informixParser.UNCONSTRAINED, 0); }
		public TerminalNode WRAP() { return getToken(informixParser.WRAP, 0); }
		public TerminalNode NO() { return getToken(informixParser.NO, 0); }
		public OptionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterOptionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitOptionStatement(this);
		}
	}

	public final OptionStatementContext optionStatement() throws RecognitionException {
		OptionStatementContext _localctx = new OptionStatementContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_optionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				setState(2235);
				match(MESSAGE);
				setState(2236);
				match(LINE);
				setState(2237);
				expression();
				}
				break;
			case 2:
				{
				setState(2238);
				match(PROMPT);
				setState(2239);
				match(LINE);
				setState(2240);
				expression();
				}
				break;
			case 3:
				{
				setState(2241);
				match(MENU);
				setState(2242);
				match(LINE);
				setState(2243);
				expression();
				}
				break;
			case 4:
				{
				setState(2244);
				match(COMMENT);
				setState(2245);
				match(LINE);
				setState(2246);
				expression();
				}
				break;
			case 5:
				{
				setState(2247);
				match(ERROR);
				setState(2248);
				match(LINE);
				setState(2249);
				expression();
				}
				break;
			case 6:
				{
				setState(2250);
				match(FORM);
				setState(2251);
				match(LINE);
				setState(2252);
				expression();
				}
				break;
			case 7:
				{
				setState(2253);
				match(INPUT);
				setState(2257);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WRAP:
					{
					setState(2254);
					match(WRAP);
					}
					break;
				case NO:
					{
					setState(2255);
					match(NO);
					setState(2256);
					match(WRAP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				{
				setState(2259);
				match(INSERT);
				setState(2260);
				match(KEY);
				setState(2261);
				expression();
				}
				break;
			case 9:
				{
				setState(2262);
				match(DELETE);
				setState(2263);
				match(KEY);
				setState(2264);
				expression();
				}
				break;
			case 10:
				{
				setState(2265);
				match(NEXT);
				setState(2266);
				match(KEY);
				setState(2267);
				expression();
				}
				break;
			case 11:
				{
				setState(2268);
				match(PREVIOUS);
				setState(2269);
				match(KEY);
				setState(2270);
				expression();
				}
				break;
			case 12:
				{
				setState(2271);
				match(ACCEPT);
				setState(2272);
				match(KEY);
				setState(2273);
				expression();
				}
				break;
			case 13:
				{
				setState(2274);
				match(HELP);
				setState(2275);
				match(FILE);
				setState(2276);
				expression();
				}
				break;
			case 14:
				{
				setState(2277);
				match(HELP);
				setState(2278);
				match(KEY);
				setState(2279);
				expression();
				}
				break;
			case 15:
				{
				setState(2280);
				match(INPUT);
				setState(2281);
				attributeList();
				}
				break;
			case 16:
				{
				setState(2282);
				match(DISPLAY);
				setState(2283);
				attributeList();
				}
				break;
			case 17:
				{
				setState(2284);
				match(SQL);
				setState(2285);
				match(INTERRUPT);
				setState(2286);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 18:
				{
				setState(2287);
				match(FIELD);
				setState(2288);
				match(ORDER);
				setState(2289);
				_la = _input.LA(1);
				if ( !(_la==CONSTRAINED || _la==UNCONSTRAINED) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionsStatementContext extends ParserRuleContext {
		public TerminalNode OPTIONS() { return getToken(informixParser.OPTIONS, 0); }
		public List<OptionStatementContext> optionStatement() {
			return getRuleContexts(OptionStatementContext.class);
		}
		public OptionStatementContext optionStatement(int i) {
			return getRuleContext(OptionStatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public OptionsStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionsStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterOptionsStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitOptionsStatement(this);
		}
	}

	public final OptionsStatementContext optionsStatement() throws RecognitionException {
		OptionsStatementContext _localctx = new OptionsStatementContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_optionsStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2292);
			match(OPTIONS);
			setState(2293);
			optionStatement();
			setState(2298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2294);
				match(COMMA);
				setState(2295);
				optionStatement();
				}
				}
				setState(2300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScreenStatementContext extends ParserRuleContext {
		public TerminalNode CLEAR() { return getToken(informixParser.CLEAR, 0); }
		public TerminalNode FORM() { return getToken(informixParser.FORM, 0); }
		public TerminalNode WINDOW() { return getToken(informixParser.WINDOW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SCREEN() { return getToken(informixParser.SCREEN, 0); }
		public List<FieldListContext> fieldList() {
			return getRuleContexts(FieldListContext.class);
		}
		public FieldListContext fieldList(int i) {
			return getRuleContext(FieldListContext.class,i);
		}
		public TerminalNode CLOSE() { return getToken(informixParser.CLOSE, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public ConstructStatementContext constructStatement() {
			return getRuleContext(ConstructStatementContext.class,0);
		}
		public TerminalNode CURRENT() { return getToken(informixParser.CURRENT, 0); }
		public TerminalNode IS() { return getToken(informixParser.IS, 0); }
		public DisplayStatementContext displayStatement() {
			return getRuleContext(DisplayStatementContext.class,0);
		}
		public DisplayArrayStatementContext displayArrayStatement() {
			return getRuleContext(DisplayArrayStatementContext.class,0);
		}
		public TerminalNode DISPLAY() { return getToken(informixParser.DISPLAY, 0); }
		public AttributeListContext attributeList() {
			return getRuleContext(AttributeListContext.class,0);
		}
		public ErrorStatementContext errorStatement() {
			return getRuleContext(ErrorStatementContext.class,0);
		}
		public MessageStatementContext messageStatement() {
			return getRuleContext(MessageStatementContext.class,0);
		}
		public PromptStatementContext promptStatement() {
			return getRuleContext(PromptStatementContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public InputArrayStatementContext inputArrayStatement() {
			return getRuleContext(InputArrayStatementContext.class,0);
		}
		public MenuStatementContext menuStatement() {
			return getRuleContext(MenuStatementContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(informixParser.OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(informixParser.FROM, 0); }
		public TerminalNode AT() { return getToken(informixParser.AT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public TerminalNode WITH() { return getToken(informixParser.WITH, 0); }
		public TerminalNode ROWS() { return getToken(informixParser.ROWS, 0); }
		public TerminalNode COLUMNS() { return getToken(informixParser.COLUMNS, 0); }
		public WindowAttributeListContext windowAttributeList() {
			return getRuleContext(WindowAttributeListContext.class,0);
		}
		public OptionsStatementContext optionsStatement() {
			return getRuleContext(OptionsStatementContext.class,0);
		}
		public TerminalNode SCROLL() { return getToken(informixParser.SCROLL, 0); }
		public TerminalNode UP() { return getToken(informixParser.UP, 0); }
		public TerminalNode DOWN() { return getToken(informixParser.DOWN, 0); }
		public TerminalNode BY() { return getToken(informixParser.BY, 0); }
		public NumericConstantContext numericConstant() {
			return getRuleContext(NumericConstantContext.class,0);
		}
		public ScreenStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_screenStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterScreenStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitScreenStatement(this);
		}
	}

	public final ScreenStatementContext screenStatement() throws RecognitionException {
		ScreenStatementContext _localctx = new ScreenStatementContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_screenStatement);
		int _la;
		try {
			setState(2390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,281,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2301);
				match(CLEAR);
				setState(2310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
				case 1:
					{
					setState(2302);
					match(FORM);
					}
					break;
				case 2:
					{
					setState(2303);
					match(WINDOW);
					setState(2304);
					identifier();
					}
					break;
				case 3:
					{
					setState(2306);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WINDOW) {
						{
						setState(2305);
						match(WINDOW);
						}
					}

					setState(2308);
					match(SCREEN);
					}
					break;
				case 4:
					{
					setState(2309);
					fieldList();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2312);
				match(CLOSE);
				setState(2313);
				match(WINDOW);
				setState(2314);
				identifier();
				setState(2315);
				eol();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2317);
				match(CLOSE);
				setState(2318);
				match(FORM);
				setState(2319);
				identifier();
				setState(2320);
				eol();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2322);
				constructStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2323);
				match(CURRENT);
				setState(2324);
				match(WINDOW);
				setState(2325);
				match(IS);
				setState(2328);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCREEN:
					{
					setState(2326);
					match(SCREEN);
					}
					break;
				case IDENT:
					{
					setState(2327);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2330);
				eol();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2331);
				displayStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2332);
				displayArrayStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2333);
				match(DISPLAY);
				setState(2334);
				match(FORM);
				setState(2335);
				identifier();
				setState(2337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
					{
					setState(2336);
					attributeList();
					}
				}

				setState(2339);
				eol();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2341);
				errorStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2342);
				messageStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2343);
				promptStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2344);
				inputStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2345);
				inputArrayStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2346);
				menuStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2347);
				match(OPEN);
				setState(2348);
				match(FORM);
				setState(2349);
				expression();
				setState(2350);
				match(FROM);
				setState(2351);
				expression();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2353);
				match(OPEN);
				setState(2354);
				match(WINDOW);
				setState(2355);
				expression();
				setState(2356);
				match(AT);
				setState(2357);
				expression();
				setState(2358);
				match(COMMA);
				setState(2359);
				expression();
				setState(2370);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
				case 1:
					{
					setState(2360);
					match(WITH);
					setState(2361);
					match(FORM);
					setState(2362);
					expression();
					}
					break;
				case 2:
					{
					setState(2363);
					match(WITH);
					setState(2364);
					expression();
					setState(2365);
					match(ROWS);
					setState(2366);
					match(COMMA);
					setState(2367);
					expression();
					setState(2368);
					match(COLUMNS);
					}
					break;
				}
				setState(2373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ATTRIBUTE || _la==ATTRIBUTES) {
					{
					setState(2372);
					windowAttributeList();
					}
				}

				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2375);
				optionsStatement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2376);
				match(SCROLL);
				setState(2377);
				fieldList();
				setState(2382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2378);
					match(COMMA);
					setState(2379);
					fieldList();
					}
					}
					setState(2384);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2385);
				_la = _input.LA(1);
				if ( !(_la==DOWN || _la==UP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(2386);
					match(BY);
					setState(2387);
					numericConstant();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlStatementsContext extends ParserRuleContext {
		public CursorManipulationStatementContext cursorManipulationStatement() {
			return getRuleContext(CursorManipulationStatementContext.class,0);
		}
		public DataDefinitionStatementContext dataDefinitionStatement() {
			return getRuleContext(DataDefinitionStatementContext.class,0);
		}
		public DataManipulationStatementContext dataManipulationStatement() {
			return getRuleContext(DataManipulationStatementContext.class,0);
		}
		public DynamicManagementStatementContext dynamicManagementStatement() {
			return getRuleContext(DynamicManagementStatementContext.class,0);
		}
		public QueryOptimizationStatementContext queryOptimizationStatement() {
			return getRuleContext(QueryOptimizationStatementContext.class,0);
		}
		public DataIntegrityStatementContext dataIntegrityStatement() {
			return getRuleContext(DataIntegrityStatementContext.class,0);
		}
		public ClientServerStatementContext clientServerStatement() {
			return getRuleContext(ClientServerStatementContext.class,0);
		}
		public SqlStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSqlStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSqlStatements(this);
		}
	}

	public final SqlStatementsContext sqlStatements() throws RecognitionException {
		SqlStatementsContext _localctx = new SqlStatementsContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_sqlStatements);
		try {
			setState(2399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,282,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2392);
				cursorManipulationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2393);
				dataDefinitionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2394);
				dataManipulationStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2395);
				dynamicManagementStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2396);
				queryOptimizationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2397);
				dataIntegrityStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2398);
				clientServerStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CursorManipulationStatementContext extends ParserRuleContext {
		public TerminalNode CLOSE() { return getToken(informixParser.CLOSE, 0); }
		public CursorNameContext cursorName() {
			return getRuleContext(CursorNameContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode DECLARE() { return getToken(informixParser.DECLARE, 0); }
		public TerminalNode CURSOR() { return getToken(informixParser.CURSOR, 0); }
		public List<TerminalNode> FOR() { return getTokens(informixParser.FOR); }
		public TerminalNode FOR(int i) {
			return getToken(informixParser.FOR, i);
		}
		public TerminalNode SCROLL() { return getToken(informixParser.SCROLL, 0); }
		public SqlSelectStatementContext sqlSelectStatement() {
			return getRuleContext(SqlSelectStatementContext.class,0);
		}
		public SqlInsertStatementContext sqlInsertStatement() {
			return getRuleContext(SqlInsertStatementContext.class,0);
		}
		public StatementIdContext statementId() {
			return getRuleContext(StatementIdContext.class,0);
		}
		public TerminalNode WITH() { return getToken(informixParser.WITH, 0); }
		public TerminalNode HOLD() { return getToken(informixParser.HOLD, 0); }
		public TerminalNode UPDATE() { return getToken(informixParser.UPDATE, 0); }
		public TerminalNode OF() { return getToken(informixParser.OF, 0); }
		public ColumnsListContext columnsList() {
			return getRuleContext(ColumnsListContext.class,0);
		}
		public TerminalNode FETCH() { return getToken(informixParser.FETCH, 0); }
		public TerminalNode NEXT() { return getToken(informixParser.NEXT, 0); }
		public TerminalNode FIRST() { return getToken(informixParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(informixParser.LAST, 0); }
		public TerminalNode CURRENT() { return getToken(informixParser.CURRENT, 0); }
		public TerminalNode RELATIVE() { return getToken(informixParser.RELATIVE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ABSOLUTE() { return getToken(informixParser.ABSOLUTE, 0); }
		public TerminalNode INTO() { return getToken(informixParser.INTO, 0); }
		public VariableListContext variableList() {
			return getRuleContext(VariableListContext.class,0);
		}
		public TerminalNode PREVIOUS() { return getToken(informixParser.PREVIOUS, 0); }
		public TerminalNode PRIOR() { return getToken(informixParser.PRIOR, 0); }
		public TerminalNode FLUSH() { return getToken(informixParser.FLUSH, 0); }
		public TerminalNode OPEN() { return getToken(informixParser.OPEN, 0); }
		public TerminalNode USING() { return getToken(informixParser.USING, 0); }
		public TerminalNode PUT() { return getToken(informixParser.PUT, 0); }
		public TerminalNode FROM() { return getToken(informixParser.FROM, 0); }
		public VariableOrConstantListContext variableOrConstantList() {
			return getRuleContext(VariableOrConstantListContext.class,0);
		}
		public CursorManipulationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursorManipulationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterCursorManipulationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitCursorManipulationStatement(this);
		}
	}

	public final CursorManipulationStatementContext cursorManipulationStatement() throws RecognitionException {
		CursorManipulationStatementContext _localctx = new CursorManipulationStatementContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_cursorManipulationStatement);
		int _la;
		try {
			setState(2472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLOSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2401);
				match(CLOSE);
				setState(2402);
				cursorName();
				setState(2403);
				eol();
				}
				break;
			case DECLARE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2405);
				match(DECLARE);
				setState(2406);
				cursorName();
				setState(2437);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CURSOR:
					{
					setState(2407);
					match(CURSOR);
					setState(2410);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(2408);
						match(WITH);
						setState(2409);
						match(HOLD);
						}
					}

					setState(2412);
					match(FOR);
					setState(2424);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SELECT:
						{
						setState(2413);
						sqlSelectStatement();
						setState(2420);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
						case 1:
							{
							setState(2414);
							match(FOR);
							setState(2415);
							match(UPDATE);
							setState(2418);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==OF) {
								{
								setState(2416);
								match(OF);
								setState(2417);
								columnsList();
								}
							}

							}
							break;
						}
						}
						break;
					case INSERT:
						{
						setState(2422);
						sqlInsertStatement();
						}
						break;
					case ACCEPT:
					case ASCII:
					case COUNT:
					case CURRENT:
					case FALSE:
					case FIRST:
					case FOUND:
					case GROUP:
					case HIDE:
					case INDEX:
					case INT_FLAG:
					case INTERRUPT:
					case LAST:
					case LENGTH:
					case LINENO:
					case MDY:
					case NO:
					case NOT:
					case NOTFOUND:
					case NULL:
					case PAGENO:
					case REAL:
					case SIZE:
					case SQL:
					case STATUS:
					case TEMP:
					case TIME:
					case TODAY:
					case TRUE:
					case USER:
					case WEEKDAY:
					case WAIT:
					case WORK:
					case IDENT:
						{
						setState(2423);
						statementId();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case SCROLL:
					{
					setState(2426);
					match(SCROLL);
					setState(2427);
					match(CURSOR);
					setState(2430);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(2428);
						match(WITH);
						setState(2429);
						match(HOLD);
						}
					}

					setState(2432);
					match(FOR);
					setState(2435);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SELECT:
						{
						setState(2433);
						sqlSelectStatement();
						}
						break;
					case ACCEPT:
					case ASCII:
					case COUNT:
					case CURRENT:
					case FALSE:
					case FIRST:
					case FOUND:
					case GROUP:
					case HIDE:
					case INDEX:
					case INT_FLAG:
					case INTERRUPT:
					case LAST:
					case LENGTH:
					case LINENO:
					case MDY:
					case NO:
					case NOT:
					case NOTFOUND:
					case NULL:
					case PAGENO:
					case REAL:
					case SIZE:
					case SQL:
					case STATUS:
					case TEMP:
					case TIME:
					case TODAY:
					case TRUE:
					case USER:
					case WEEKDAY:
					case WAIT:
					case WORK:
					case IDENT:
						{
						setState(2434);
						statementId();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case FETCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(2439);
				match(FETCH);
				setState(2449);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEXT:
					{
					setState(2440);
					match(NEXT);
					}
					break;
				case PREVIOUS:
				case PRIOR:
					{
					setState(2441);
					_la = _input.LA(1);
					if ( !(_la==PREVIOUS || _la==PRIOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case FIRST:
					{
					setState(2442);
					match(FIRST);
					}
					break;
				case LAST:
					{
					setState(2443);
					match(LAST);
					}
					break;
				case CURRENT:
					{
					setState(2444);
					match(CURRENT);
					}
					break;
				case RELATIVE:
					{
					setState(2445);
					match(RELATIVE);
					setState(2446);
					expression();
					}
					break;
				case ABSOLUTE:
					{
					setState(2447);
					match(ABSOLUTE);
					setState(2448);
					expression();
					}
					break;
				case IDENT:
					break;
				default:
					break;
				}
				setState(2451);
				cursorName();
				setState(2454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTO) {
					{
					setState(2452);
					match(INTO);
					setState(2453);
					variableList();
					}
				}

				}
				break;
			case FLUSH:
				enterOuterAlt(_localctx, 4);
				{
				setState(2456);
				match(FLUSH);
				setState(2457);
				cursorName();
				setState(2458);
				eol();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(2460);
				match(OPEN);
				setState(2461);
				cursorName();
				setState(2464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(2462);
					match(USING);
					setState(2463);
					variableList();
					}
				}

				}
				break;
			case PUT:
				enterOuterAlt(_localctx, 6);
				{
				setState(2466);
				match(PUT);
				setState(2467);
				cursorName();
				setState(2470);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(2468);
					match(FROM);
					setState(2469);
					variableOrConstantList();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnsListContext extends ParserRuleContext {
		public List<ColumnsTableIdContext> columnsTableId() {
			return getRuleContexts(ColumnsTableIdContext.class);
		}
		public ColumnsTableIdContext columnsTableId(int i) {
			return getRuleContext(ColumnsTableIdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public ColumnsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterColumnsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitColumnsList(this);
		}
	}

	public final ColumnsListContext columnsList() throws RecognitionException {
		ColumnsListContext _localctx = new ColumnsListContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_columnsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2474);
			columnsTableId();
			setState(2479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2475);
				match(COMMA);
				setState(2476);
				columnsTableId();
				}
				}
				setState(2481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementIdContext extends ParserRuleContext {
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public StatementIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterStatementId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitStatementId(this);
		}
	}

	public final StatementIdContext statementId() throws RecognitionException {
		StatementIdContext _localctx = new StatementIdContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_statementId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2482);
			constantIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CursorNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CursorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterCursorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitCursorName(this);
		}
	}

	public final CursorNameContext cursorName() throws RecognitionException {
		CursorNameContext _localctx = new CursorNameContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_cursorName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2484);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitDataType(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_dataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2486);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnItemContext extends ParserRuleContext {
		public List<ConstantIdentifierContext> constantIdentifier() {
			return getRuleContexts(ConstantIdentifierContext.class);
		}
		public ConstantIdentifierContext constantIdentifier(int i) {
			return getRuleContext(ConstantIdentifierContext.class,i);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode BYTE() { return getToken(informixParser.BYTE, 0); }
		public TerminalNode TEXT() { return getToken(informixParser.TEXT, 0); }
		public TerminalNode NOT() { return getToken(informixParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(informixParser.NULL, 0); }
		public TerminalNode IN() { return getToken(informixParser.IN, 0); }
		public TerminalNode TABLE() { return getToken(informixParser.TABLE, 0); }
		public TerminalNode UNIQUE() { return getToken(informixParser.UNIQUE, 0); }
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public TerminalNode CONSTRAINT() { return getToken(informixParser.CONSTRAINT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public ColumnItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterColumnItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitColumnItem(this);
		}
	}

	public final ColumnItemContext columnItem() throws RecognitionException {
		ColumnItemContext _localctx = new ColumnItemContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_columnItem);
		int _la;
		try {
			setState(2521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCEPT:
			case ASCII:
			case COUNT:
			case CURRENT:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MDY:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2488);
				constantIdentifier();
				setState(2498);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2489);
					dataType();
					}
					break;
				case 2:
					{
					setState(2490);
					_la = _input.LA(1);
					if ( !(_la==BYTE || _la==TEXT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2496);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IN) {
						{
						setState(2491);
						match(IN);
						setState(2494);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case TABLE:
							{
							setState(2492);
							match(TABLE);
							}
							break;
						case ACCEPT:
						case ASCII:
						case COUNT:
						case CURRENT:
						case FALSE:
						case FIRST:
						case FOUND:
						case GROUP:
						case HIDE:
						case INDEX:
						case INT_FLAG:
						case INTERRUPT:
						case LAST:
						case LENGTH:
						case LINENO:
						case MDY:
						case NO:
						case NOT:
						case NOTFOUND:
						case NULL:
						case PAGENO:
						case REAL:
						case SIZE:
						case SQL:
						case STATUS:
						case TEMP:
						case TIME:
						case TODAY:
						case TRUE:
						case USER:
						case WEEKDAY:
						case WAIT:
						case WORK:
						case IDENT:
							{
							setState(2493);
							constantIdentifier();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
					}

					}
					break;
				}
				setState(2502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2500);
					match(NOT);
					setState(2501);
					match(NULL);
					}
				}

				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2504);
				match(UNIQUE);
				setState(2505);
				match(LPAREN);
				setState(2514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ASCII) | (1L << COUNT) | (1L << CURRENT))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (FALSE - 101)) | (1L << (FIRST - 101)) | (1L << (FOUND - 101)) | (1L << (GROUP - 101)) | (1L << (HIDE - 101)) | (1L << (INDEX - 101)) | (1L << (INT_FLAG - 101)) | (1L << (INTERRUPT - 101)) | (1L << (LAST - 101)) | (1L << (LENGTH - 101)) | (1L << (LINENO - 101)))) != 0) || ((((_la - 176)) & ~0x3f) == 0 && ((1L << (_la - 176)) & ((1L << (MDY - 176)) | (1L << (NO - 176)) | (1L << (NOT - 176)) | (1L << (NOTFOUND - 176)) | (1L << (NULL - 176)) | (1L << (PAGENO - 176)) | (1L << (REAL - 176)))) != 0) || ((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & ((1L << (SIZE - 252)) | (1L << (SQL - 252)) | (1L << (STATUS - 252)) | (1L << (TEMP - 252)) | (1L << (TIME - 252)) | (1L << (TODAY - 252)) | (1L << (TRUE - 252)) | (1L << (USER - 252)) | (1L << (WEEKDAY - 252)) | (1L << (WAIT - 252)) | (1L << (WORK - 252)))) != 0) || _la==IDENT) {
					{
					setState(2506);
					constantIdentifier();
					setState(2511);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2507);
						match(COMMA);
						setState(2508);
						constantIdentifier();
						}
						}
						setState(2513);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2516);
				match(RPAREN);
				setState(2519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CONSTRAINT) {
					{
					setState(2517);
					match(CONSTRAINT);
					setState(2518);
					constantIdentifier();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataDefinitionStatementContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(informixParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(informixParser.TABLE, 0); }
		public List<ConstantIdentifierContext> constantIdentifier() {
			return getRuleContexts(ConstantIdentifierContext.class);
		}
		public ConstantIdentifierContext constantIdentifier(int i) {
			return getRuleContext(ConstantIdentifierContext.class,i);
		}
		public TerminalNode CREATE() { return getToken(informixParser.CREATE, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(informixParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(informixParser.LPAREN, i);
		}
		public List<ColumnItemContext> columnItem() {
			return getRuleContexts(ColumnItemContext.class);
		}
		public ColumnItemContext columnItem(int i) {
			return getRuleContext(ColumnItemContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(informixParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(informixParser.RPAREN, i);
		}
		public TerminalNode TEMP() { return getToken(informixParser.TEMP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public TerminalNode WITH() { return getToken(informixParser.WITH, 0); }
		public TerminalNode NO() { return getToken(informixParser.NO, 0); }
		public TerminalNode LOG() { return getToken(informixParser.LOG, 0); }
		public TerminalNode IN() { return getToken(informixParser.IN, 0); }
		public TerminalNode EXTENT() { return getToken(informixParser.EXTENT, 0); }
		public List<TerminalNode> SIZE() { return getTokens(informixParser.SIZE); }
		public TerminalNode SIZE(int i) {
			return getToken(informixParser.SIZE, i);
		}
		public List<NumericConstantContext> numericConstant() {
			return getRuleContexts(NumericConstantContext.class);
		}
		public NumericConstantContext numericConstant(int i) {
			return getRuleContext(NumericConstantContext.class,i);
		}
		public TerminalNode NEXT() { return getToken(informixParser.NEXT, 0); }
		public TerminalNode LOCK() { return getToken(informixParser.LOCK, 0); }
		public TerminalNode MODE() { return getToken(informixParser.MODE, 0); }
		public TerminalNode PAGE() { return getToken(informixParser.PAGE, 0); }
		public TerminalNode ROW() { return getToken(informixParser.ROW, 0); }
		public TerminalNode INDEX() { return getToken(informixParser.INDEX, 0); }
		public TerminalNode ON() { return getToken(informixParser.ON, 0); }
		public TerminalNode UNIQUE() { return getToken(informixParser.UNIQUE, 0); }
		public TerminalNode CLUSTER() { return getToken(informixParser.CLUSTER, 0); }
		public List<TerminalNode> ASC() { return getTokens(informixParser.ASC); }
		public TerminalNode ASC(int i) {
			return getToken(informixParser.ASC, i);
		}
		public List<TerminalNode> DESC() { return getTokens(informixParser.DESC); }
		public TerminalNode DESC(int i) {
			return getToken(informixParser.DESC, i);
		}
		public DataDefinitionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataDefinitionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterDataDefinitionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitDataDefinitionStatement(this);
		}
	}

	public final DataDefinitionStatementContext dataDefinitionStatement() throws RecognitionException {
		DataDefinitionStatementContext _localctx = new DataDefinitionStatementContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_dataDefinitionStatement);
		int _la;
		try {
			setState(2599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,316,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2523);
				match(DROP);
				setState(2524);
				match(TABLE);
				setState(2525);
				constantIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2526);
				match(CREATE);
				setState(2528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMP) {
					{
					setState(2527);
					match(TEMP);
					}
				}

				setState(2530);
				match(TABLE);
				setState(2531);
				constantIdentifier();
				setState(2532);
				match(LPAREN);
				setState(2533);
				columnItem();
				setState(2538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2534);
					match(COMMA);
					setState(2535);
					columnItem();
					}
					}
					setState(2540);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2541);
				match(RPAREN);
				setState(2545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(2542);
					match(WITH);
					setState(2543);
					match(NO);
					setState(2544);
					match(LOG);
					}
				}

				setState(2549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN) {
					{
					setState(2547);
					match(IN);
					setState(2548);
					constantIdentifier();
					}
				}

				setState(2554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENT) {
					{
					setState(2551);
					match(EXTENT);
					setState(2552);
					match(SIZE);
					setState(2553);
					numericConstant();
					}
				}

				setState(2559);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
				case 1:
					{
					setState(2556);
					match(NEXT);
					setState(2557);
					match(SIZE);
					setState(2558);
					numericConstant();
					}
					break;
				}
				setState(2566);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
				case 1:
					{
					setState(2561);
					match(LOCK);
					setState(2562);
					match(MODE);
					setState(2563);
					match(LPAREN);
					setState(2564);
					_la = _input.LA(1);
					if ( !(_la==PAGE || _la==ROW) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2565);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2568);
				match(CREATE);
				setState(2570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIQUE) {
					{
					setState(2569);
					match(UNIQUE);
					}
				}

				setState(2573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLUSTER) {
					{
					setState(2572);
					match(CLUSTER);
					}
				}

				setState(2575);
				match(INDEX);
				setState(2576);
				constantIdentifier();
				setState(2577);
				match(ON);
				setState(2578);
				constantIdentifier();
				setState(2579);
				match(LPAREN);
				setState(2580);
				constantIdentifier();
				setState(2582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(2581);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(2591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2584);
					match(COMMA);
					setState(2585);
					constantIdentifier();
					setState(2587);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASC || _la==DESC) {
						{
						setState(2586);
						_la = _input.LA(1);
						if ( !(_la==ASC || _la==DESC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					}
					setState(2593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2594);
				match(RPAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2596);
				match(DROP);
				setState(2597);
				match(INDEX);
				setState(2598);
				constantIdentifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataManipulationStatementContext extends ParserRuleContext {
		public SqlInsertStatementContext sqlInsertStatement() {
			return getRuleContext(SqlInsertStatementContext.class,0);
		}
		public SqlDeleteStatementContext sqlDeleteStatement() {
			return getRuleContext(SqlDeleteStatementContext.class,0);
		}
		public SqlSelectStatementContext sqlSelectStatement() {
			return getRuleContext(SqlSelectStatementContext.class,0);
		}
		public SqlUpdateStatementContext sqlUpdateStatement() {
			return getRuleContext(SqlUpdateStatementContext.class,0);
		}
		public SqlLoadStatementContext sqlLoadStatement() {
			return getRuleContext(SqlLoadStatementContext.class,0);
		}
		public SqlUnLoadStatementContext sqlUnLoadStatement() {
			return getRuleContext(SqlUnLoadStatementContext.class,0);
		}
		public DataManipulationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataManipulationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterDataManipulationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitDataManipulationStatement(this);
		}
	}

	public final DataManipulationStatementContext dataManipulationStatement() throws RecognitionException {
		DataManipulationStatementContext _localctx = new DataManipulationStatementContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_dataManipulationStatement);
		try {
			setState(2607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(2601);
				sqlInsertStatement();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2602);
				sqlDeleteStatement();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2603);
				sqlSelectStatement();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(2604);
				sqlUpdateStatement();
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 5);
				{
				setState(2605);
				sqlLoadStatement();
				}
				break;
			case UNLOAD:
				enterOuterAlt(_localctx, 6);
				{
				setState(2606);
				sqlUnLoadStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlSelectStatementContext extends ParserRuleContext {
		public MainSelectStatementContext mainSelectStatement() {
			return getRuleContext(MainSelectStatementContext.class,0);
		}
		public SqlSelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlSelectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSqlSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSqlSelectStatement(this);
		}
	}

	public final SqlSelectStatementContext sqlSelectStatement() throws RecognitionException {
		SqlSelectStatementContext _localctx = new SqlSelectStatementContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_sqlSelectStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2609);
			mainSelectStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnsTableIdContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(informixParser.STAR, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(informixParser.DOT, 0); }
		public ColumnsTableIdContext columnsTableId() {
			return getRuleContext(ColumnsTableIdContext.class,0);
		}
		public IndexingVariableContext indexingVariable() {
			return getRuleContext(IndexingVariableContext.class,0);
		}
		public ColumnsTableIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnsTableId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterColumnsTableId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitColumnsTableId(this);
		}
	}

	public final ColumnsTableIdContext columnsTableId() throws RecognitionException {
		ColumnsTableIdContext _localctx = new ColumnsTableIdContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_columnsTableId);
		int _la;
		try {
			setState(2622);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(2611);
				match(STAR);
				}
				break;
			case ACCEPT:
			case ASCII:
			case COUNT:
			case CURRENT:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MDY:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case IDENT:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2612);
				tableIdentifier();
				setState(2614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(2613);
					indexingVariable();
					}
				}

				}
				setState(2620);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
				case 1:
					{
					setState(2616);
					match(DOT);
					setState(2617);
					match(STAR);
					}
					break;
				case 2:
					{
					setState(2618);
					match(DOT);
					setState(2619);
					columnsTableId();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectListContext extends ParserRuleContext {
		public List<SqlExpressionContext> sqlExpression() {
			return getRuleContexts(SqlExpressionContext.class);
		}
		public SqlExpressionContext sqlExpression(int i) {
			return getRuleContext(SqlExpressionContext.class,i);
		}
		public List<SqlAliasContext> sqlAlias() {
			return getRuleContexts(SqlAliasContext.class);
		}
		public SqlAliasContext sqlAlias(int i) {
			return getRuleContext(SqlAliasContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSelectList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSelectList(this);
		}
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_selectList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2624);
			sqlExpression();
			setState(2626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS || _la==IDENT) {
				{
				setState(2625);
				sqlAlias();
				}
			}

			setState(2635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2628);
				match(COMMA);
				setState(2629);
				sqlExpression();
				setState(2631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS || _la==IDENT) {
					{
					setState(2630);
					sqlAlias();
					}
				}

				}
				}
				setState(2637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeadSelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(informixParser.SELECT, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode ALL() { return getToken(informixParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(informixParser.DISTINCT, 0); }
		public TerminalNode UNIQUE() { return getToken(informixParser.UNIQUE, 0); }
		public HeadSelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headSelectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterHeadSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitHeadSelectStatement(this);
		}
	}

	public final HeadSelectStatementContext headSelectStatement() throws RecognitionException {
		HeadSelectStatementContext _localctx = new HeadSelectStatementContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_headSelectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2638);
			match(SELECT);
			setState(2641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				{
				setState(2639);
				match(ALL);
				}
				break;
			case DISTINCT:
			case UNIQUE:
				{
				setState(2640);
				_la = _input.LA(1);
				if ( !(_la==DISTINCT || _la==UNIQUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ACCEPT:
			case ASCII:
			case AVG:
			case COUNT:
			case CURRENT:
			case DATE:
			case DAY:
			case DECODE:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MAX:
			case MDY:
			case MIN:
			case MOD:
			case MONTH:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case NVL:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case SUM:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case YEAR:
			case PLUS:
			case MINUS:
			case STAR:
			case LPAREN:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				break;
			default:
				break;
			}
			setState(2643);
			selectList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableQualifierContext extends ParserRuleContext {
		public List<ConstantIdentifierContext> constantIdentifier() {
			return getRuleContexts(ConstantIdentifierContext.class);
		}
		public ConstantIdentifierContext constantIdentifier(int i) {
			return getRuleContext(ConstantIdentifierContext.class,i);
		}
		public TerminalNode COLON() { return getToken(informixParser.COLON, 0); }
		public TerminalNode ATSYMBOL() { return getToken(informixParser.ATSYMBOL, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TableQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterTableQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitTableQualifier(this);
		}
	}

	public final TableQualifierContext tableQualifier() throws RecognitionException {
		TableQualifierContext _localctx = new TableQualifierContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_tableQualifier);
		try {
			setState(2654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,325,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2645);
				constantIdentifier();
				setState(2646);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2648);
				constantIdentifier();
				setState(2649);
				match(ATSYMBOL);
				setState(2650);
				constantIdentifier();
				setState(2651);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2653);
				string();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public ConstantIdentifierContext constantIdentifier() {
			return getRuleContext(ConstantIdentifierContext.class,0);
		}
		public TableQualifierContext tableQualifier() {
			return getRuleContext(TableQualifierContext.class,0);
		}
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitTableIdentifier(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,326,_ctx) ) {
			case 1:
				{
				setState(2656);
				tableQualifier();
				}
				break;
			}
			setState(2659);
			constantIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromTableContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode OUTER() { return getToken(informixParser.OUTER, 0); }
		public SqlAliasContext sqlAlias() {
			return getRuleContext(SqlAliasContext.class,0);
		}
		public FromTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitFromTable(this);
		}
	}

	public final FromTableContext fromTable() throws RecognitionException {
		FromTableContext _localctx = new FromTableContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_fromTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTER) {
				{
				setState(2661);
				match(OUTER);
				}
			}

			setState(2664);
			tableIdentifier();
			setState(2666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,328,_ctx) ) {
			case 1:
				{
				setState(2665);
				sqlAlias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableExpressionContext extends ParserRuleContext {
		public SimpleSelectStatementContext simpleSelectStatement() {
			return getRuleContext(SimpleSelectStatementContext.class,0);
		}
		public TableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterTableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitTableExpression(this);
		}
	}

	public final TableExpressionContext tableExpression() throws RecognitionException {
		TableExpressionContext _localctx = new TableExpressionContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_tableExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2668);
			simpleSelectStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromSelectStatementContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(informixParser.FROM, 0); }
		public List<FromTableContext> fromTable() {
			return getRuleContexts(FromTableContext.class);
		}
		public FromTableContext fromTable(int i) {
			return getRuleContext(FromTableContext.class,i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(informixParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(informixParser.LPAREN, i);
		}
		public List<TableExpressionContext> tableExpression() {
			return getRuleContexts(TableExpressionContext.class);
		}
		public TableExpressionContext tableExpression(int i) {
			return getRuleContext(TableExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(informixParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(informixParser.RPAREN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public List<SqlAliasContext> sqlAlias() {
			return getRuleContexts(SqlAliasContext.class);
		}
		public SqlAliasContext sqlAlias(int i) {
			return getRuleContext(SqlAliasContext.class,i);
		}
		public FromSelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromSelectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterFromSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitFromSelectStatement(this);
		}
	}

	public final FromSelectStatementContext fromSelectStatement() throws RecognitionException {
		FromSelectStatementContext _localctx = new FromSelectStatementContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_fromSelectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2670);
			match(FROM);
			setState(2678);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCEPT:
			case ASCII:
			case COUNT:
			case CURRENT:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MDY:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case OUTER:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case IDENT:
			case STRING_LITERAL:
				{
				setState(2671);
				fromTable();
				}
				break;
			case LPAREN:
				{
				setState(2672);
				match(LPAREN);
				setState(2673);
				tableExpression();
				setState(2674);
				match(RPAREN);
				setState(2676);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
				case 1:
					{
					setState(2675);
					sqlAlias();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2680);
				match(COMMA);
				setState(2688);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACCEPT:
				case ASCII:
				case COUNT:
				case CURRENT:
				case FALSE:
				case FIRST:
				case FOUND:
				case GROUP:
				case HIDE:
				case INDEX:
				case INT_FLAG:
				case INTERRUPT:
				case LAST:
				case LENGTH:
				case LINENO:
				case MDY:
				case NO:
				case NOT:
				case NOTFOUND:
				case NULL:
				case OUTER:
				case PAGENO:
				case REAL:
				case SIZE:
				case SQL:
				case STATUS:
				case TEMP:
				case TIME:
				case TODAY:
				case TRUE:
				case USER:
				case WEEKDAY:
				case WAIT:
				case WORK:
				case IDENT:
				case STRING_LITERAL:
					{
					setState(2681);
					fromTable();
					}
					break;
				case LPAREN:
					{
					setState(2682);
					match(LPAREN);
					setState(2683);
					tableExpression();
					setState(2684);
					match(RPAREN);
					setState(2686);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,331,_ctx) ) {
					case 1:
						{
						setState(2685);
						sqlAlias();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(2694);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AliasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterAliasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitAliasName(this);
		}
	}

	public final AliasNameContext aliasName() throws RecognitionException {
		AliasNameContext _localctx = new AliasNameContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_aliasName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2695);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainSelectStatementContext extends ParserRuleContext {
		public HeadSelectStatementContext headSelectStatement() {
			return getRuleContext(HeadSelectStatementContext.class,0);
		}
		public FromSelectStatementContext fromSelectStatement() {
			return getRuleContext(FromSelectStatementContext.class,0);
		}
		public List<TerminalNode> INTO() { return getTokens(informixParser.INTO); }
		public TerminalNode INTO(int i) {
			return getToken(informixParser.INTO, i);
		}
		public VariableListContext variableList() {
			return getRuleContext(VariableListContext.class,0);
		}
		public WhereStatementContext whereStatement() {
			return getRuleContext(WhereStatementContext.class,0);
		}
		public GroupByStatementContext groupByStatement() {
			return getRuleContext(GroupByStatementContext.class,0);
		}
		public HavingStatementContext havingStatement() {
			return getRuleContext(HavingStatementContext.class,0);
		}
		public UnionSelectStatementContext unionSelectStatement() {
			return getRuleContext(UnionSelectStatementContext.class,0);
		}
		public OrderbyStatementContext orderbyStatement() {
			return getRuleContext(OrderbyStatementContext.class,0);
		}
		public TerminalNode TEMP() { return getToken(informixParser.TEMP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WITH() { return getToken(informixParser.WITH, 0); }
		public TerminalNode NO() { return getToken(informixParser.NO, 0); }
		public TerminalNode LOG() { return getToken(informixParser.LOG, 0); }
		public MainSelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainSelectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterMainSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitMainSelectStatement(this);
		}
	}

	public final MainSelectStatementContext mainSelectStatement() throws RecognitionException {
		MainSelectStatementContext _localctx = new MainSelectStatementContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_mainSelectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2697);
			headSelectStatement();
			setState(2700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(2698);
				match(INTO);
				setState(2699);
				variableList();
				}
			}

			setState(2702);
			fromSelectStatement();
			setState(2704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2703);
				whereStatement();
				}
			}

			setState(2707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(2706);
				groupByStatement();
				}
			}

			setState(2710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(2709);
				havingStatement();
				}
			}

			setState(2713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNION) {
				{
				setState(2712);
				unionSelectStatement();
				}
			}

			setState(2716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(2715);
				orderbyStatement();
				}
			}

			setState(2721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTO) {
				{
				setState(2718);
				match(INTO);
				setState(2719);
				match(TEMP);
				setState(2720);
				identifier();
				}
			}

			setState(2726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(2723);
				match(WITH);
				setState(2724);
				match(NO);
				setState(2725);
				match(LOG);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionSelectStatementContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(informixParser.UNION, 0); }
		public SimpleSelectStatementContext simpleSelectStatement() {
			return getRuleContext(SimpleSelectStatementContext.class,0);
		}
		public TerminalNode ALL() { return getToken(informixParser.ALL, 0); }
		public UnionSelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionSelectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterUnionSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitUnionSelectStatement(this);
		}
	}

	public final UnionSelectStatementContext unionSelectStatement() throws RecognitionException {
		UnionSelectStatementContext _localctx = new UnionSelectStatementContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_unionSelectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(2728);
			match(UNION);
			setState(2730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL) {
				{
				setState(2729);
				match(ALL);
				}
			}

			setState(2732);
			simpleSelectStatement();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleSelectStatementContext extends ParserRuleContext {
		public HeadSelectStatementContext headSelectStatement() {
			return getRuleContext(HeadSelectStatementContext.class,0);
		}
		public FromSelectStatementContext fromSelectStatement() {
			return getRuleContext(FromSelectStatementContext.class,0);
		}
		public WhereStatementContext whereStatement() {
			return getRuleContext(WhereStatementContext.class,0);
		}
		public GroupByStatementContext groupByStatement() {
			return getRuleContext(GroupByStatementContext.class,0);
		}
		public HavingStatementContext havingStatement() {
			return getRuleContext(HavingStatementContext.class,0);
		}
		public UnionSelectStatementContext unionSelectStatement() {
			return getRuleContext(UnionSelectStatementContext.class,0);
		}
		public SimpleSelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSimpleSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSimpleSelectStatement(this);
		}
	}

	public final SimpleSelectStatementContext simpleSelectStatement() throws RecognitionException {
		SimpleSelectStatementContext _localctx = new SimpleSelectStatementContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_simpleSelectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2734);
			headSelectStatement();
			setState(2735);
			fromSelectStatement();
			setState(2737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2736);
				whereStatement();
				}
			}

			setState(2740);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(2739);
				groupByStatement();
				}
			}

			setState(2743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(2742);
				havingStatement();
				}
			}

			setState(2746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNION) {
				{
				setState(2745);
				unionSelectStatement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereStatementContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(informixParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhereStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterWhereStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitWhereStatement(this);
		}
	}

	public final WhereStatementContext whereStatement() throws RecognitionException {
		WhereStatementContext _localctx = new WhereStatementContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_whereStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2748);
			match(WHERE);
			setState(2749);
			condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByStatementContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(informixParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(informixParser.BY, 0); }
		public VariableOrConstantListContext variableOrConstantList() {
			return getRuleContext(VariableOrConstantListContext.class,0);
		}
		public GroupByStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterGroupByStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitGroupByStatement(this);
		}
	}

	public final GroupByStatementContext groupByStatement() throws RecognitionException {
		GroupByStatementContext _localctx = new GroupByStatementContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_groupByStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2751);
			match(GROUP);
			setState(2752);
			match(BY);
			setState(2753);
			variableOrConstantList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingStatementContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(informixParser.HAVING, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public HavingStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterHavingStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitHavingStatement(this);
		}
	}

	public final HavingStatementContext havingStatement() throws RecognitionException {
		HavingStatementContext _localctx = new HavingStatementContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_havingStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2755);
			match(HAVING);
			setState(2756);
			condition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderbyColumnContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(informixParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(informixParser.DESC, 0); }
		public OrderbyColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderbyColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterOrderbyColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitOrderbyColumn(this);
		}
	}

	public final OrderbyColumnContext orderbyColumn() throws RecognitionException {
		OrderbyColumnContext _localctx = new OrderbyColumnContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_orderbyColumn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2758);
			expression();
			setState(2760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2759);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderbyStatementContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(informixParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(informixParser.BY, 0); }
		public List<OrderbyColumnContext> orderbyColumn() {
			return getRuleContexts(OrderbyColumnContext.class);
		}
		public OrderbyColumnContext orderbyColumn(int i) {
			return getRuleContext(OrderbyColumnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public OrderbyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderbyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterOrderbyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitOrderbyStatement(this);
		}
	}

	public final OrderbyStatementContext orderbyStatement() throws RecognitionException {
		OrderbyStatementContext _localctx = new OrderbyStatementContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_orderbyStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2762);
			match(ORDER);
			setState(2763);
			match(BY);
			setState(2764);
			orderbyColumn();
			setState(2769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2765);
				match(COMMA);
				setState(2766);
				orderbyColumn();
				}
				}
				setState(2771);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlLoadStatementContext extends ParserRuleContext {
		public TerminalNode LOAD() { return getToken(informixParser.LOAD, 0); }
		public TerminalNode FROM() { return getToken(informixParser.FROM, 0); }
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode INSERT() { return getToken(informixParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(informixParser.INTO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public SqlInsertStatementContext sqlInsertStatement() {
			return getRuleContext(SqlInsertStatementContext.class,0);
		}
		public TerminalNode DELIMITER() { return getToken(informixParser.DELIMITER, 0); }
		public TerminalNode LPAREN() { return getToken(informixParser.LPAREN, 0); }
		public ColumnsListContext columnsList() {
			return getRuleContext(ColumnsListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(informixParser.RPAREN, 0); }
		public SqlLoadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlLoadStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSqlLoadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSqlLoadStatement(this);
		}
	}

	public final SqlLoadStatementContext sqlLoadStatement() throws RecognitionException {
		SqlLoadStatementContext _localctx = new SqlLoadStatementContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_sqlLoadStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2772);
			match(LOAD);
			setState(2773);
			match(FROM);
			setState(2776);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCEPT:
			case ASCII:
			case COUNT:
			case CURRENT:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MDY:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case IDENT:
				{
				setState(2774);
				variable();
				}
				break;
			case STRING_LITERAL:
				{
				setState(2775);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DELIMITER) {
				{
				setState(2778);
				match(DELIMITER);
				setState(2781);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACCEPT:
				case ASCII:
				case COUNT:
				case CURRENT:
				case FALSE:
				case FIRST:
				case FOUND:
				case GROUP:
				case HIDE:
				case INDEX:
				case INT_FLAG:
				case INTERRUPT:
				case LAST:
				case LENGTH:
				case LINENO:
				case MDY:
				case NO:
				case NOT:
				case NOTFOUND:
				case NULL:
				case PAGENO:
				case REAL:
				case SIZE:
				case SQL:
				case STATUS:
				case TEMP:
				case TIME:
				case TODAY:
				case TRUE:
				case USER:
				case WEEKDAY:
				case WAIT:
				case WORK:
				case IDENT:
					{
					setState(2779);
					variable();
					}
					break;
				case STRING_LITERAL:
					{
					setState(2780);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(2795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,353,_ctx) ) {
			case 1:
				{
				setState(2785);
				match(INSERT);
				setState(2786);
				match(INTO);
				setState(2787);
				tableIdentifier();
				setState(2792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(2788);
					match(LPAREN);
					setState(2789);
					columnsList();
					setState(2790);
					match(RPAREN);
					}
				}

				}
				break;
			case 2:
				{
				setState(2794);
				sqlInsertStatement();
				}
				break;
			}
			setState(2797);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlUnLoadStatementContext extends ParserRuleContext {
		public TerminalNode UNLOAD() { return getToken(informixParser.UNLOAD, 0); }
		public TerminalNode TO() { return getToken(informixParser.TO, 0); }
		public SqlSelectStatementContext sqlSelectStatement() {
			return getRuleContext(SqlSelectStatementContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode DELIMITER() { return getToken(informixParser.DELIMITER, 0); }
		public SqlUnLoadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlUnLoadStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSqlUnLoadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSqlUnLoadStatement(this);
		}
	}

	public final SqlUnLoadStatementContext sqlUnLoadStatement() throws RecognitionException {
		SqlUnLoadStatementContext _localctx = new SqlUnLoadStatementContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_sqlUnLoadStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2799);
			match(UNLOAD);
			setState(2800);
			match(TO);
			setState(2803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCEPT:
			case ASCII:
			case COUNT:
			case CURRENT:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MDY:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
			case IDENT:
				{
				setState(2801);
				variable();
				}
				break;
			case STRING_LITERAL:
				{
				setState(2802);
				string();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DELIMITER) {
				{
				setState(2805);
				match(DELIMITER);
				setState(2808);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACCEPT:
				case ASCII:
				case COUNT:
				case CURRENT:
				case FALSE:
				case FIRST:
				case FOUND:
				case GROUP:
				case HIDE:
				case INDEX:
				case INT_FLAG:
				case INTERRUPT:
				case LAST:
				case LENGTH:
				case LINENO:
				case MDY:
				case NO:
				case NOT:
				case NOTFOUND:
				case NULL:
				case PAGENO:
				case REAL:
				case SIZE:
				case SQL:
				case STATUS:
				case TEMP:
				case TIME:
				case TODAY:
				case TRUE:
				case USER:
				case WEEKDAY:
				case WAIT:
				case WORK:
				case IDENT:
					{
					setState(2806);
					variable();
					}
					break;
				case STRING_LITERAL:
					{
					setState(2807);
					string();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(2812);
			sqlSelectStatement();
			setState(2813);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlInsertStatementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(informixParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(informixParser.INTO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(informixParser.VALUES, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(informixParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(informixParser.LPAREN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(informixParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(informixParser.RPAREN, i);
		}
		public SimpleSelectStatementContext simpleSelectStatement() {
			return getRuleContext(SimpleSelectStatementContext.class,0);
		}
		public ColumnsListContext columnsList() {
			return getRuleContext(ColumnsListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public SqlInsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlInsertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSqlInsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSqlInsertStatement(this);
		}
	}

	public final SqlInsertStatementContext sqlInsertStatement() throws RecognitionException {
		SqlInsertStatementContext _localctx = new SqlInsertStatementContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_sqlInsertStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2815);
			match(INSERT);
			setState(2816);
			match(INTO);
			setState(2817);
			tableIdentifier();
			setState(2822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(2818);
				match(LPAREN);
				setState(2819);
				columnsList();
				setState(2820);
				match(RPAREN);
				}
			}

			setState(2837);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES:
				{
				setState(2824);
				match(VALUES);
				setState(2825);
				match(LPAREN);
				setState(2826);
				expression();
				setState(2831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2827);
					match(COMMA);
					setState(2828);
					expression();
					}
					}
					setState(2833);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2834);
				match(RPAREN);
				}
				break;
			case SELECT:
				{
				setState(2836);
				simpleSelectStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlUpdateStatementContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(informixParser.UPDATE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(informixParser.SET, 0); }
		public TerminalNode WHERE() { return getToken(informixParser.WHERE, 0); }
		public List<ColumnsTableIdContext> columnsTableId() {
			return getRuleContexts(ColumnsTableIdContext.class);
		}
		public ColumnsTableIdContext columnsTableId(int i) {
			return getRuleContext(ColumnsTableIdContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(informixParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(informixParser.EQUAL, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CURRENT() { return getToken(informixParser.CURRENT, 0); }
		public TerminalNode OF() { return getToken(informixParser.OF, 0); }
		public CursorNameContext cursorName() {
			return getRuleContext(CursorNameContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(informixParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(informixParser.LPAREN, i);
		}
		public ColumnsListContext columnsList() {
			return getRuleContext(ColumnsListContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(informixParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(informixParser.RPAREN, i);
		}
		public List<TerminalNode> STAR() { return getTokens(informixParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(informixParser.STAR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public List<AliasNameContext> aliasName() {
			return getRuleContexts(AliasNameContext.class);
		}
		public AliasNameContext aliasName(int i) {
			return getRuleContext(AliasNameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(informixParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(informixParser.DOT, i);
		}
		public SqlUpdateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlUpdateStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSqlUpdateStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSqlUpdateStatement(this);
		}
	}

	public final SqlUpdateStatementContext sqlUpdateStatement() throws RecognitionException {
		SqlUpdateStatementContext _localctx = new SqlUpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_sqlUpdateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2839);
			match(UPDATE);
			setState(2840);
			tableIdentifier();
			setState(2841);
			match(SET);
			setState(2887);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
			case 1:
				{
				{
				setState(2842);
				columnsTableId();
				setState(2843);
				match(EQUAL);
				setState(2844);
				expression();
				setState(2852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2845);
					match(COMMA);
					setState(2846);
					columnsTableId();
					setState(2847);
					match(EQUAL);
					setState(2848);
					expression();
					}
					}
					setState(2854);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(2865);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					setState(2855);
					match(LPAREN);
					setState(2856);
					columnsList();
					setState(2857);
					match(RPAREN);
					}
					break;
				case STAR:
				case IDENT:
					{
					setState(2862);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENT) {
						{
						setState(2859);
						aliasName();
						setState(2860);
						match(DOT);
						}
					}

					setState(2864);
					match(STAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2867);
				match(EQUAL);
				setState(2885);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LPAREN:
					{
					setState(2868);
					match(LPAREN);
					setState(2869);
					expression();
					setState(2874);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2870);
						match(COMMA);
						setState(2871);
						expression();
						}
						}
						setState(2876);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2877);
					match(RPAREN);
					}
					break;
				case STAR:
				case IDENT:
					{
					setState(2882);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IDENT) {
						{
						setState(2879);
						aliasName();
						setState(2880);
						match(DOT);
						}
					}

					setState(2884);
					match(STAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			}
			setState(2896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2889);
				match(WHERE);
				setState(2894);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
				case 1:
					{
					setState(2890);
					condition();
					}
					break;
				case 2:
					{
					setState(2891);
					match(CURRENT);
					setState(2892);
					match(OF);
					setState(2893);
					cursorName();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqlDeleteStatementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(informixParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(informixParser.FROM, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(informixParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CURRENT() { return getToken(informixParser.CURRENT, 0); }
		public TerminalNode OF() { return getToken(informixParser.OF, 0); }
		public CursorNameContext cursorName() {
			return getRuleContext(CursorNameContext.class,0);
		}
		public SqlDeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqlDeleteStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSqlDeleteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSqlDeleteStatement(this);
		}
	}

	public final SqlDeleteStatementContext sqlDeleteStatement() throws RecognitionException {
		SqlDeleteStatementContext _localctx = new SqlDeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_sqlDeleteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2898);
			match(DELETE);
			setState(2899);
			match(FROM);
			setState(2900);
			tableIdentifier();
			setState(2908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(2901);
				match(WHERE);
				setState(2906);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,369,_ctx) ) {
				case 1:
					{
					setState(2902);
					condition();
					}
					break;
				case 2:
					{
					setState(2903);
					match(CURRENT);
					setState(2904);
					match(OF);
					setState(2905);
					cursorName();
					}
					break;
				}
				}
			}

			setState(2910);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActualParameterListContext extends ParserRuleContext {
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(informixParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(informixParser.COMMA, i);
		}
		public ActualParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterActualParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitActualParameterList(this);
		}
	}

	public final ActualParameterListContext actualParameterList() throws RecognitionException {
		ActualParameterListContext _localctx = new ActualParameterListContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_actualParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2912);
			actualParameter();
			setState(2917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2913);
				match(COMMA);
				setState(2914);
				actualParameter();
				}
				}
				setState(2919);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DynamicManagementStatementContext extends ParserRuleContext {
		public TerminalNode PREPARE() { return getToken(informixParser.PREPARE, 0); }
		public CursorNameContext cursorName() {
			return getRuleContext(CursorNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(informixParser.FROM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EXECUTE() { return getToken(informixParser.EXECUTE, 0); }
		public TerminalNode USING() { return getToken(informixParser.USING, 0); }
		public VariableListContext variableList() {
			return getRuleContext(VariableListContext.class,0);
		}
		public TerminalNode FREE() { return getToken(informixParser.FREE, 0); }
		public StatementIdContext statementId() {
			return getRuleContext(StatementIdContext.class,0);
		}
		public TerminalNode LOCK() { return getToken(informixParser.LOCK, 0); }
		public TerminalNode TABLE() { return getToken(informixParser.TABLE, 0); }
		public TerminalNode IN() { return getToken(informixParser.IN, 0); }
		public TerminalNode MODE() { return getToken(informixParser.MODE, 0); }
		public TerminalNode SHARE() { return getToken(informixParser.SHARE, 0); }
		public TerminalNode EXCLUSIVE() { return getToken(informixParser.EXCLUSIVE, 0); }
		public DynamicManagementStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamicManagementStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterDynamicManagementStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitDynamicManagementStatement(this);
		}
	}

	public final DynamicManagementStatementContext dynamicManagementStatement() throws RecognitionException {
		DynamicManagementStatementContext _localctx = new DynamicManagementStatementContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_dynamicManagementStatement);
		int _la;
		try {
			setState(2943);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PREPARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(2920);
				match(PREPARE);
				setState(2921);
				cursorName();
				setState(2922);
				match(FROM);
				setState(2923);
				expression();
				}
				break;
			case EXECUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(2925);
				match(EXECUTE);
				setState(2926);
				cursorName();
				setState(2929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(2927);
					match(USING);
					setState(2928);
					variableList();
					}
				}

				}
				break;
			case FREE:
				enterOuterAlt(_localctx, 3);
				{
				setState(2931);
				match(FREE);
				setState(2934);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
				case 1:
					{
					setState(2932);
					cursorName();
					}
					break;
				case 2:
					{
					setState(2933);
					statementId();
					}
					break;
				}
				}
				break;
			case LOCK:
				enterOuterAlt(_localctx, 4);
				{
				setState(2936);
				match(LOCK);
				setState(2937);
				match(TABLE);
				setState(2938);
				expression();
				setState(2939);
				match(IN);
				setState(2940);
				_la = _input.LA(1);
				if ( !(_la==EXCLUSIVE || _la==SHARE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2941);
				match(MODE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOptimizationStatementContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(informixParser.UPDATE, 0); }
		public TerminalNode STATISTICS() { return getToken(informixParser.STATISTICS, 0); }
		public TerminalNode FOR() { return getToken(informixParser.FOR, 0); }
		public TerminalNode TABLE() { return getToken(informixParser.TABLE, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(informixParser.SET, 0); }
		public TerminalNode LOCK() { return getToken(informixParser.LOCK, 0); }
		public TerminalNode MODE() { return getToken(informixParser.MODE, 0); }
		public TerminalNode TO() { return getToken(informixParser.TO, 0); }
		public TerminalNode WAIT() { return getToken(informixParser.WAIT, 0); }
		public TerminalNode NOT() { return getToken(informixParser.NOT, 0); }
		public TerminalNode SECONDS() { return getToken(informixParser.SECONDS, 0); }
		public TerminalNode EXPLAIN() { return getToken(informixParser.EXPLAIN, 0); }
		public TerminalNode ON() { return getToken(informixParser.ON, 0); }
		public TerminalNode OFF() { return getToken(informixParser.OFF, 0); }
		public TerminalNode ISOLATION() { return getToken(informixParser.ISOLATION, 0); }
		public TerminalNode CURSOR() { return getToken(informixParser.CURSOR, 0); }
		public TerminalNode STABILITY() { return getToken(informixParser.STABILITY, 0); }
		public TerminalNode READ() { return getToken(informixParser.READ, 0); }
		public TerminalNode DIRTY() { return getToken(informixParser.DIRTY, 0); }
		public TerminalNode COMMITTED() { return getToken(informixParser.COMMITTED, 0); }
		public TerminalNode REPEATABLE() { return getToken(informixParser.REPEATABLE, 0); }
		public TerminalNode LOG() { return getToken(informixParser.LOG, 0); }
		public TerminalNode BUFFERED() { return getToken(informixParser.BUFFERED, 0); }
		public QueryOptimizationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOptimizationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterQueryOptimizationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitQueryOptimizationStatement(this);
		}
	}

	public final QueryOptimizationStatementContext queryOptimizationStatement() throws RecognitionException {
		QueryOptimizationStatementContext _localctx = new QueryOptimizationStatementContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_queryOptimizationStatement);
		int _la;
		try {
			setState(2981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2945);
				match(UPDATE);
				setState(2946);
				match(STATISTICS);
				setState(2950);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
				case 1:
					{
					setState(2947);
					match(FOR);
					setState(2948);
					match(TABLE);
					setState(2949);
					tableIdentifier();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2952);
				match(SET);
				setState(2953);
				match(LOCK);
				setState(2954);
				match(MODE);
				setState(2955);
				match(TO);
				setState(2962);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WAIT:
					{
					setState(2956);
					match(WAIT);
					setState(2958);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SECONDS) {
						{
						setState(2957);
						match(SECONDS);
						}
					}

					}
					break;
				case NOT:
					{
					setState(2960);
					match(NOT);
					setState(2961);
					match(WAIT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2964);
				match(SET);
				setState(2965);
				match(EXPLAIN);
				setState(2966);
				_la = _input.LA(1);
				if ( !(_la==OFF || _la==ON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2967);
				match(SET);
				setState(2968);
				match(ISOLATION);
				setState(2969);
				match(TO);
				setState(2974);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CURSOR:
					{
					setState(2970);
					match(CURSOR);
					setState(2971);
					match(STABILITY);
					}
					break;
				case COMMITTED:
				case DIRTY:
				case REPEATABLE:
					{
					setState(2972);
					_la = _input.LA(1);
					if ( !(_la==COMMITTED || _la==DIRTY || _la==REPEATABLE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2973);
					match(READ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2976);
				match(SET);
				setState(2978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BUFFERED) {
					{
					setState(2977);
					match(BUFFERED);
					}
				}

				setState(2980);
				match(LOG);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatabaseDeclarationContext extends ParserRuleContext {
		public TerminalNode DATABASE() { return getToken(informixParser.DATABASE, 0); }
		public List<ConstantIdentifierContext> constantIdentifier() {
			return getRuleContexts(ConstantIdentifierContext.class);
		}
		public ConstantIdentifierContext constantIdentifier(int i) {
			return getRuleContext(ConstantIdentifierContext.class,i);
		}
		public TerminalNode EXCLUSIVE() { return getToken(informixParser.EXCLUSIVE, 0); }
		public TerminalNode SEMI() { return getToken(informixParser.SEMI, 0); }
		public TerminalNode ATSYMBOL() { return getToken(informixParser.ATSYMBOL, 0); }
		public DatabaseDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_databaseDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterDatabaseDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitDatabaseDeclaration(this);
		}
	}

	public final DatabaseDeclarationContext databaseDeclaration() throws RecognitionException {
		DatabaseDeclarationContext _localctx = new DatabaseDeclarationContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_databaseDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2983);
			match(DATABASE);
			{
			setState(2984);
			constantIdentifier();
			setState(2987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ATSYMBOL) {
				{
				setState(2985);
				match(ATSYMBOL);
				setState(2986);
				constantIdentifier();
				}
			}

			}
			setState(2990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLUSIVE) {
				{
				setState(2989);
				match(EXCLUSIVE);
				}
			}

			setState(2993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(2992);
				match(SEMI);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClientServerStatementContext extends ParserRuleContext {
		public TerminalNode CLOSE() { return getToken(informixParser.CLOSE, 0); }
		public TerminalNode DATABASE() { return getToken(informixParser.DATABASE, 0); }
		public ClientServerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clientServerStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterClientServerStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitClientServerStatement(this);
		}
	}

	public final ClientServerStatementContext clientServerStatement() throws RecognitionException {
		ClientServerStatementContext _localctx = new ClientServerStatementContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_clientServerStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2995);
			match(CLOSE);
			setState(2996);
			match(DATABASE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataIntegrityStatementContext extends ParserRuleContext {
		public WheneverStatementContext wheneverStatement() {
			return getRuleContext(WheneverStatementContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(informixParser.BEGIN, 0); }
		public TerminalNode WORK() { return getToken(informixParser.WORK, 0); }
		public TerminalNode COMMIT() { return getToken(informixParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(informixParser.ROLLBACK, 0); }
		public DataIntegrityStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataIntegrityStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterDataIntegrityStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitDataIntegrityStatement(this);
		}
	}

	public final DataIntegrityStatementContext dataIntegrityStatement() throws RecognitionException {
		DataIntegrityStatementContext _localctx = new DataIntegrityStatementContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_dataIntegrityStatement);
		try {
			setState(3005);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHENEVER:
				enterOuterAlt(_localctx, 1);
				{
				setState(2998);
				wheneverStatement();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(2999);
				match(BEGIN);
				setState(3000);
				match(WORK);
				}
				break;
			case COMMIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(3001);
				match(COMMIT);
				setState(3002);
				match(WORK);
				}
				break;
			case ROLLBACK:
				enterOuterAlt(_localctx, 4);
				{
				setState(3003);
				match(ROLLBACK);
				setState(3004);
				match(WORK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WheneverStatementContext extends ParserRuleContext {
		public TerminalNode WHENEVER() { return getToken(informixParser.WHENEVER, 0); }
		public WheneverTypeContext wheneverType() {
			return getRuleContext(WheneverTypeContext.class,0);
		}
		public WheneverFlowContext wheneverFlow() {
			return getRuleContext(WheneverFlowContext.class,0);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public WheneverStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wheneverStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterWheneverStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitWheneverStatement(this);
		}
	}

	public final WheneverStatementContext wheneverStatement() throws RecognitionException {
		WheneverStatementContext _localctx = new WheneverStatementContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_wheneverStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3007);
			match(WHENEVER);
			setState(3008);
			wheneverType();
			setState(3009);
			wheneverFlow();
			setState(3010);
			eol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WheneverTypeContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(informixParser.NOT, 0); }
		public TerminalNode FOUND() { return getToken(informixParser.FOUND, 0); }
		public TerminalNode SQLERROR() { return getToken(informixParser.SQLERROR, 0); }
		public TerminalNode ERROR() { return getToken(informixParser.ERROR, 0); }
		public TerminalNode ANY() { return getToken(informixParser.ANY, 0); }
		public TerminalNode SQLWARNING() { return getToken(informixParser.SQLWARNING, 0); }
		public TerminalNode WARNING() { return getToken(informixParser.WARNING, 0); }
		public WheneverTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wheneverType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterWheneverType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitWheneverType(this);
		}
	}

	public final WheneverTypeContext wheneverType() throws RecognitionException {
		WheneverTypeContext _localctx = new WheneverTypeContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_wheneverType);
		int _la;
		try {
			setState(3019);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3012);
				match(NOT);
				setState(3013);
				match(FOUND);
				}
				break;
			case ANY:
			case ERROR:
			case SQLERROR:
				enterOuterAlt(_localctx, 2);
				{
				setState(3015);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ANY) {
					{
					setState(3014);
					match(ANY);
					}
				}

				setState(3017);
				_la = _input.LA(1);
				if ( !(_la==ERROR || _la==SQLERROR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case SQLWARNING:
			case WARNING:
				enterOuterAlt(_localctx, 3);
				{
				setState(3018);
				_la = _input.LA(1);
				if ( !(_la==SQLWARNING || _la==WARNING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WheneverFlowContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(informixParser.CONTINUE, 0); }
		public TerminalNode STOP() { return getToken(informixParser.STOP, 0); }
		public TerminalNode CALL() { return getToken(informixParser.CALL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode GO() { return getToken(informixParser.GO, 0); }
		public TerminalNode TO() { return getToken(informixParser.TO, 0); }
		public TerminalNode GOTO() { return getToken(informixParser.GOTO, 0); }
		public TerminalNode COLON() { return getToken(informixParser.COLON, 0); }
		public WheneverFlowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wheneverFlow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterWheneverFlow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitWheneverFlow(this);
		}
	}

	public final WheneverFlowContext wheneverFlow() throws RecognitionException {
		WheneverFlowContext _localctx = new WheneverFlowContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_wheneverFlow);
		int _la;
		try {
			setState(3033);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTINUE:
			case STOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(3021);
				_la = _input.LA(1);
				if ( !(_la==CONTINUE || _la==STOP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 2);
				{
				setState(3022);
				match(CALL);
				setState(3023);
				identifier();
				}
				break;
			case GO:
			case GOTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(3027);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GO:
					{
					setState(3024);
					match(GO);
					setState(3025);
					match(TO);
					}
					break;
				case GOTO:
					{
					setState(3026);
					match(GOTO);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(3029);
					match(COLON);
					}
				}

				setState(3032);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReportDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> REPORT() { return getTokens(informixParser.REPORT); }
		public TerminalNode REPORT(int i) {
			return getToken(informixParser.REPORT, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode END() { return getToken(informixParser.END, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TypeDeclarationsContext typeDeclarations() {
			return getRuleContext(TypeDeclarationsContext.class,0);
		}
		public OutputReportContext outputReport() {
			return getRuleContext(OutputReportContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(informixParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(informixParser.BY, 0); }
		public VariableListContext variableList() {
			return getRuleContext(VariableListContext.class,0);
		}
		public FormatReportContext formatReport() {
			return getRuleContext(FormatReportContext.class,0);
		}
		public TerminalNode EXTERNAL() { return getToken(informixParser.EXTERNAL, 0); }
		public ReportDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reportDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterReportDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitReportDefinition(this);
		}
	}

	public final ReportDefinitionContext reportDefinition() throws RecognitionException {
		ReportDefinitionContext _localctx = new ReportDefinitionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_reportDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3035);
			match(REPORT);
			setState(3036);
			identifier();
			setState(3038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(3037);
				parameterList();
				}
			}

			setState(3041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFINE) {
				{
				setState(3040);
				typeDeclarations();
				}
			}

			setState(3044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(3043);
				outputReport();
				}
			}

			setState(3052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(3046);
				match(ORDER);
				setState(3048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTERNAL) {
					{
					setState(3047);
					match(EXTERNAL);
					}
				}

				setState(3050);
				match(BY);
				setState(3051);
				variableList();
				}
			}

			setState(3055);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FORMAT) {
				{
				setState(3054);
				formatReport();
				}
			}

			setState(3057);
			match(END);
			setState(3058);
			match(REPORT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputReportContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(informixParser.OUTPUT, 0); }
		public TerminalNode REPORT() { return getToken(informixParser.REPORT, 0); }
		public TerminalNode TO() { return getToken(informixParser.TO, 0); }
		public List<StringContext> string() {
			return getRuleContexts(StringContext.class);
		}
		public StringContext string(int i) {
			return getRuleContext(StringContext.class,i);
		}
		public TerminalNode PIPE() { return getToken(informixParser.PIPE, 0); }
		public TerminalNode PRINTER() { return getToken(informixParser.PRINTER, 0); }
		public List<TerminalNode> LEFT() { return getTokens(informixParser.LEFT); }
		public TerminalNode LEFT(int i) {
			return getToken(informixParser.LEFT, i);
		}
		public List<TerminalNode> MARGIN() { return getTokens(informixParser.MARGIN); }
		public TerminalNode MARGIN(int i) {
			return getToken(informixParser.MARGIN, i);
		}
		public List<NumericConstantContext> numericConstant() {
			return getRuleContexts(NumericConstantContext.class);
		}
		public NumericConstantContext numericConstant(int i) {
			return getRuleContext(NumericConstantContext.class,i);
		}
		public List<TerminalNode> RIGHT() { return getTokens(informixParser.RIGHT); }
		public TerminalNode RIGHT(int i) {
			return getToken(informixParser.RIGHT, i);
		}
		public List<TerminalNode> TOP() { return getTokens(informixParser.TOP); }
		public TerminalNode TOP(int i) {
			return getToken(informixParser.TOP, i);
		}
		public List<TerminalNode> BOTTOM() { return getTokens(informixParser.BOTTOM); }
		public TerminalNode BOTTOM(int i) {
			return getToken(informixParser.BOTTOM, i);
		}
		public List<TerminalNode> PAGE() { return getTokens(informixParser.PAGE); }
		public TerminalNode PAGE(int i) {
			return getToken(informixParser.PAGE, i);
		}
		public List<TerminalNode> LENGTH() { return getTokens(informixParser.LENGTH); }
		public TerminalNode LENGTH(int i) {
			return getToken(informixParser.LENGTH, i);
		}
		public List<TerminalNode> OF() { return getTokens(informixParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(informixParser.OF, i);
		}
		public OutputReportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputReport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterOutputReport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitOutputReport(this);
		}
	}

	public final OutputReportContext outputReport() throws RecognitionException {
		OutputReportContext _localctx = new OutputReportContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_outputReport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3060);
			match(OUTPUT);
			setState(3069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPORT) {
				{
				setState(3061);
				match(REPORT);
				setState(3062);
				match(TO);
				setState(3067);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING_LITERAL:
					{
					setState(3063);
					string();
					}
					break;
				case PIPE:
					{
					setState(3064);
					match(PIPE);
					setState(3065);
					string();
					}
					break;
				case PRINTER:
					{
					setState(3066);
					match(PRINTER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(3092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOTTOM || _la==LEFT || _la==PAGE || _la==RIGHT || _la==TOP) {
				{
				setState(3090);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
				case 1:
					{
					{
					setState(3071);
					match(LEFT);
					setState(3072);
					match(MARGIN);
					setState(3073);
					numericConstant();
					}
					}
					break;
				case 2:
					{
					{
					setState(3074);
					match(RIGHT);
					setState(3075);
					match(MARGIN);
					setState(3076);
					numericConstant();
					}
					}
					break;
				case 3:
					{
					{
					setState(3077);
					match(TOP);
					setState(3078);
					match(MARGIN);
					setState(3079);
					numericConstant();
					}
					}
					break;
				case 4:
					{
					{
					setState(3080);
					match(BOTTOM);
					setState(3081);
					match(MARGIN);
					setState(3082);
					numericConstant();
					}
					}
					break;
				case 5:
					{
					{
					setState(3083);
					match(PAGE);
					setState(3084);
					match(LENGTH);
					setState(3085);
					numericConstant();
					}
					}
					break;
				case 6:
					{
					{
					setState(3086);
					match(TOP);
					setState(3087);
					match(OF);
					setState(3088);
					match(PAGE);
					setState(3089);
					string();
					}
					}
					break;
				}
				}
				setState(3094);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormatReportContext extends ParserRuleContext {
		public TerminalNode FORMAT() { return getToken(informixParser.FORMAT, 0); }
		public List<TerminalNode> EVERY() { return getTokens(informixParser.EVERY); }
		public TerminalNode EVERY(int i) {
			return getToken(informixParser.EVERY, i);
		}
		public List<TerminalNode> ROW() { return getTokens(informixParser.ROW); }
		public TerminalNode ROW(int i) {
			return getToken(informixParser.ROW, i);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public List<TerminalNode> PAGE() { return getTokens(informixParser.PAGE); }
		public TerminalNode PAGE(int i) {
			return getToken(informixParser.PAGE, i);
		}
		public List<TerminalNode> HEADER() { return getTokens(informixParser.HEADER); }
		public TerminalNode HEADER(int i) {
			return getToken(informixParser.HEADER, i);
		}
		public List<TerminalNode> TRAILER() { return getTokens(informixParser.TRAILER); }
		public TerminalNode TRAILER(int i) {
			return getToken(informixParser.TRAILER, i);
		}
		public List<TerminalNode> ON() { return getTokens(informixParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(informixParser.ON, i);
		}
		public List<TerminalNode> GROUP() { return getTokens(informixParser.GROUP); }
		public TerminalNode GROUP(int i) {
			return getToken(informixParser.GROUP, i);
		}
		public List<TerminalNode> OF() { return getTokens(informixParser.OF); }
		public TerminalNode OF(int i) {
			return getToken(informixParser.OF, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> BEFORE() { return getTokens(informixParser.BEFORE); }
		public TerminalNode BEFORE(int i) {
			return getToken(informixParser.BEFORE, i);
		}
		public List<TerminalNode> AFTER() { return getTokens(informixParser.AFTER); }
		public TerminalNode AFTER(int i) {
			return getToken(informixParser.AFTER, i);
		}
		public List<TerminalNode> LAST() { return getTokens(informixParser.LAST); }
		public TerminalNode LAST(int i) {
			return getToken(informixParser.LAST, i);
		}
		public List<TerminalNode> FIRST() { return getTokens(informixParser.FIRST); }
		public TerminalNode FIRST(int i) {
			return getToken(informixParser.FIRST, i);
		}
		public FormatReportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formatReport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterFormatReport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitFormatReport(this);
		}
	}

	public final FormatReportContext formatReport() throws RecognitionException {
		FormatReportContext _localctx = new FormatReportContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_formatReport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3095);
			match(FORMAT);
			setState(3123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EVERY:
				{
				setState(3096);
				match(EVERY);
				setState(3097);
				match(ROW);
				}
				break;
			case AFTER:
			case BEFORE:
			case FIRST:
			case ON:
			case PAGE:
				{
				setState(3119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(3116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,402,_ctx) ) {
					case 1:
						{
						setState(3099);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==FIRST) {
							{
							setState(3098);
							match(FIRST);
							}
						}

						setState(3101);
						match(PAGE);
						setState(3102);
						match(HEADER);
						}
						break;
					case 2:
						{
						setState(3103);
						match(PAGE);
						setState(3104);
						match(TRAILER);
						}
						break;
					case 3:
						{
						setState(3105);
						match(ON);
						setState(3110);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case EVERY:
							{
							setState(3106);
							match(EVERY);
							setState(3107);
							match(ROW);
							}
							break;
						case LAST:
							{
							setState(3108);
							match(LAST);
							setState(3109);
							match(ROW);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 4:
						{
						setState(3112);
						_la = _input.LA(1);
						if ( !(_la==AFTER || _la==BEFORE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(3113);
						match(GROUP);
						setState(3114);
						match(OF);
						setState(3115);
						variable();
						}
						break;
					}
					setState(3118);
					codeBlock();
					}
					}
					setState(3121); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AFTER || _la==BEFORE || _la==FIRST || _la==ON || _la==PAGE );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EolContext extends ParserRuleContext {
		public TerminalNode EOL() { return getToken(informixParser.EOL, 0); }
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterEol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitEol(this);
		}
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_eol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3125);
			match(EOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedNumberContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public UnsignedRealContext unsignedReal() {
			return getRuleContext(UnsignedRealContext.class,0);
		}
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterUnsignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitUnsignedNumber(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_unsignedNumber);
		try {
			setState(3129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(3127);
				unsignedInteger();
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(3128);
				unsignedReal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedIntegerContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(informixParser.NUM_INT, 0); }
		public UnsignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterUnsignedInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitUnsignedInteger(this);
		}
	}

	public final UnsignedIntegerContext unsignedInteger() throws RecognitionException {
		UnsignedIntegerContext _localctx = new UnsignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3131);
			match(NUM_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsignedRealContext extends ParserRuleContext {
		public TerminalNode NUM_REAL() { return getToken(informixParser.NUM_REAL, 0); }
		public UnsignedRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterUnsignedReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitUnsignedReal(this);
		}
	}

	public final UnsignedRealContext unsignedReal() throws RecognitionException {
		UnsignedRealContext _localctx = new UnsignedRealContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_unsignedReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3133);
			match(NUM_REAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(informixParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(informixParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3135);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantIdentifierContext extends ParserRuleContext {
		public TerminalNode ACCEPT() { return getToken(informixParser.ACCEPT, 0); }
		public TerminalNode ASCII() { return getToken(informixParser.ASCII, 0); }
		public TerminalNode COUNT() { return getToken(informixParser.COUNT, 0); }
		public TerminalNode CURRENT() { return getToken(informixParser.CURRENT, 0); }
		public TerminalNode FALSE() { return getToken(informixParser.FALSE, 0); }
		public TerminalNode FIRST() { return getToken(informixParser.FIRST, 0); }
		public TerminalNode FOUND() { return getToken(informixParser.FOUND, 0); }
		public TerminalNode GROUP() { return getToken(informixParser.GROUP, 0); }
		public TerminalNode HIDE() { return getToken(informixParser.HIDE, 0); }
		public TerminalNode INDEX() { return getToken(informixParser.INDEX, 0); }
		public TerminalNode INT_FLAG() { return getToken(informixParser.INT_FLAG, 0); }
		public TerminalNode INTERRUPT() { return getToken(informixParser.INTERRUPT, 0); }
		public TerminalNode LAST() { return getToken(informixParser.LAST, 0); }
		public TerminalNode LENGTH() { return getToken(informixParser.LENGTH, 0); }
		public TerminalNode LINENO() { return getToken(informixParser.LINENO, 0); }
		public TerminalNode MDY() { return getToken(informixParser.MDY, 0); }
		public TerminalNode NO() { return getToken(informixParser.NO, 0); }
		public TerminalNode NOT() { return getToken(informixParser.NOT, 0); }
		public TerminalNode NOTFOUND() { return getToken(informixParser.NOTFOUND, 0); }
		public TerminalNode NULL() { return getToken(informixParser.NULL, 0); }
		public TerminalNode PAGENO() { return getToken(informixParser.PAGENO, 0); }
		public TerminalNode REAL() { return getToken(informixParser.REAL, 0); }
		public TerminalNode SIZE() { return getToken(informixParser.SIZE, 0); }
		public TerminalNode SQL() { return getToken(informixParser.SQL, 0); }
		public TerminalNode STATUS() { return getToken(informixParser.STATUS, 0); }
		public TerminalNode TEMP() { return getToken(informixParser.TEMP, 0); }
		public TerminalNode TIME() { return getToken(informixParser.TIME, 0); }
		public TerminalNode TODAY() { return getToken(informixParser.TODAY, 0); }
		public TerminalNode TRUE() { return getToken(informixParser.TRUE, 0); }
		public TerminalNode USER() { return getToken(informixParser.USER, 0); }
		public TerminalNode WAIT() { return getToken(informixParser.WAIT, 0); }
		public TerminalNode WEEKDAY() { return getToken(informixParser.WEEKDAY, 0); }
		public TerminalNode WORK() { return getToken(informixParser.WORK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstantIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).enterConstantIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof informixListener ) ((informixListener)listener).exitConstantIdentifier(this);
		}
	}

	public final ConstantIdentifierContext constantIdentifier() throws RecognitionException {
		ConstantIdentifierContext _localctx = new ConstantIdentifierContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_constantIdentifier);
		int _la;
		try {
			setState(3139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCEPT:
			case ASCII:
			case COUNT:
			case CURRENT:
			case FALSE:
			case FIRST:
			case FOUND:
			case GROUP:
			case HIDE:
			case INDEX:
			case INT_FLAG:
			case INTERRUPT:
			case LAST:
			case LENGTH:
			case LINENO:
			case MDY:
			case NO:
			case NOT:
			case NOTFOUND:
			case NULL:
			case PAGENO:
			case REAL:
			case SIZE:
			case SQL:
			case STATUS:
			case TEMP:
			case TIME:
			case TODAY:
			case TRUE:
			case USER:
			case WEEKDAY:
			case WAIT:
			case WORK:
				enterOuterAlt(_localctx, 1);
				{
				setState(3137);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ASCII) | (1L << COUNT) | (1L << CURRENT))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (FALSE - 101)) | (1L << (FIRST - 101)) | (1L << (FOUND - 101)) | (1L << (GROUP - 101)) | (1L << (HIDE - 101)) | (1L << (INDEX - 101)) | (1L << (INT_FLAG - 101)) | (1L << (INTERRUPT - 101)) | (1L << (LAST - 101)) | (1L << (LENGTH - 101)) | (1L << (LINENO - 101)))) != 0) || ((((_la - 176)) & ~0x3f) == 0 && ((1L << (_la - 176)) & ((1L << (MDY - 176)) | (1L << (NO - 176)) | (1L << (NOT - 176)) | (1L << (NOTFOUND - 176)) | (1L << (NULL - 176)) | (1L << (PAGENO - 176)) | (1L << (REAL - 176)))) != 0) || ((((_la - 252)) & ~0x3f) == 0 && ((1L << (_la - 252)) & ((1L << (SIZE - 252)) | (1L << (SQL - 252)) | (1L << (STATUS - 252)) | (1L << (TEMP - 252)) | (1L << (TIME - 252)) | (1L << (TODAY - 252)) | (1L << (TRUE - 252)) | (1L << (USER - 252)) | (1L << (WEEKDAY - 252)) | (1L << (WAIT - 252)) | (1L << (WORK - 252)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(3138);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0160\u0c48\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\3\2\5\2\u0194\n\2\3\2\5\2\u0197\n\2\3\2\5\2\u019a\n\2"+
		"\3\2\3\2\5\2\u019e\n\2\3\2\3\2\3\3\3\3\3\4\5\4\u01a5\n\4\3\4\3\4\3\4\5"+
		"\4\u01aa\n\4\3\4\5\4\u01ad\n\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\6\5\u01b6\n"+
		"\5\r\5\16\5\u01b7\3\6\3\6\3\6\3\6\3\7\3\7\6\7\u01c0\n\7\r\7\16\7\u01c1"+
		"\3\b\3\b\5\b\u01c6\n\b\3\t\3\t\3\t\5\t\u01cb\n\t\3\t\3\t\3\t\5\t\u01d0"+
		"\n\t\3\t\3\t\3\t\3\t\3\n\3\n\7\n\u01d8\n\n\f\n\16\n\u01db\13\n\3\n\3\n"+
		"\3\13\3\13\3\13\7\13\u01e2\n\13\f\13\16\13\u01e5\13\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u01ee\n\f\3\f\3\f\3\r\6\r\u01f3\n\r\r\r\16\r\u01f4\3"+
		"\16\3\16\3\16\3\16\7\16\u01fb\n\16\f\16\16\16\u01fe\13\16\3\17\3\17\3"+
		"\17\7\17\u0203\n\17\f\17\16\17\u0206\13\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\7\17\u0210\n\17\f\17\16\17\u0213\13\17\5\17\u0215\n\17\3"+
		"\20\3\20\3\20\3\20\5\20\u021b\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\5\22\u0225\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u022f"+
		"\n\24\3\24\3\24\5\24\u0233\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u023a\n"+
		"\24\5\24\u023c\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u0243\n\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u024c\n\25\5\25\u024e\n\25\3\26\3\26\3"+
		"\26\3\26\3\26\5\26\u0255\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u026c\n\27\3\30\3\30\3\30\3\30\3\30\5\30\u0273\n\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\5\30\u027c\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0285\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u028e\n\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0297\n\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u02a0\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u02a7\n"+
		"\30\3\31\3\31\3\32\3\32\5\32\u02ad\n\32\3\33\3\33\5\33\u02b1\n\33\3\34"+
		"\3\34\5\34\u02b5\n\34\3\35\3\35\5\35\u02b9\n\35\3\36\3\36\5\36\u02bd\n"+
		"\36\3\37\3\37\5\37\u02c1\n\37\3 \3 \3 \3 \3 \5 \u02c8\n \3!\3!\3!\5!\u02cd"+
		"\n!\3\"\3\"\3\"\3\"\3\"\7\"\u02d4\n\"\f\"\16\"\u02d7\13\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u02e1\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u02ec"+
		"\n#\3#\3#\3$\3$\3$\3$\3$\3$\5$\u02f6\n$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0300"+
		"\n%\3&\3&\3\'\3\'\3\'\5\'\u0307\n\'\3\'\3\'\3(\3(\6(\u030d\n(\r(\16(\u030e"+
		"\3)\3)\3*\3*\5*\u0315\n*\3+\3+\3+\3+\5+\u031b\n+\3+\3+\3+\3+\3+\5+\u0322"+
		"\n+\3,\3,\3,\5,\u0327\n,\3,\3,\3,\3,\3,\3,\5,\u032f\n,\3,\3,\3,\3,\5,"+
		"\u0335\n,\3-\3-\3-\3-\3-\3-\7-\u033d\n-\f-\16-\u0340\13-\3.\3.\3.\3.\3"+
		".\3.\7.\u0348\n.\f.\16.\u034b\13.\5.\u034d\n.\3.\5.\u0350\n.\3.\3.\3."+
		"\3.\7.\u0356\n.\f.\16.\u0359\13.\5.\u035b\n.\3/\3/\3\60\3\60\5\60\u0361"+
		"\n\60\3\61\3\61\5\61\u0365\n\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\7\62"+
		"\u036e\n\62\f\62\16\62\u0371\13\62\5\62\u0373\n\62\3\63\3\63\3\63\7\63"+
		"\u0378\n\63\f\63\16\63\u037b\13\63\3\64\3\64\3\64\5\64\u0380\n\64\3\64"+
		"\3\64\3\64\3\64\5\64\u0386\n\64\3\64\3\64\3\64\3\64\5\64\u038c\n\64\3"+
		"\64\3\64\5\64\u0390\n\64\3\64\3\64\3\64\3\64\5\64\u0396\n\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u03a0\n\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u03a7\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u03bc\n\64\3\65\3\65\3\65"+
		"\5\65\u03c1\n\65\3\65\3\65\3\65\3\65\3\65\5\65\u03c8\n\65\3\65\3\65\3"+
		"\65\5\65\u03cd\n\65\3\65\3\65\3\65\3\65\5\65\u03d3\n\65\3\65\3\65\3\65"+
		"\3\65\5\65\u03d9\n\65\3\66\3\66\3\66\3\66\5\66\u03df\n\66\3\67\3\67\3"+
		"\67\3\67\38\38\38\78\u03e8\n8\f8\168\u03eb\138\39\59\u03ee\n9\39\39\3"+
		":\3:\3:\3:\5:\u03f6\n:\3:\7:\u03f9\n:\f:\16:\u03fc\13:\3;\3;\3<\3<\3<"+
		"\7<\u0403\n<\f<\16<\u0406\13<\3=\3=\3=\5=\u040b\n=\3=\3=\3=\5=\u0410\n"+
		"=\3=\3=\3=\5=\u0415\n=\3=\3=\3=\5=\u041a\n=\3=\3=\3=\5=\u041f\n=\3=\3"+
		"=\3=\7=\u0424\n=\f=\16=\u0427\13=\5=\u0429\n=\3=\3=\3=\3=\3=\5=\u0430"+
		"\n=\3=\3=\3=\7=\u0435\n=\f=\16=\u0438\13=\5=\u043a\n=\3=\3=\3=\3=\3=\3"+
		"=\3=\7=\u0443\n=\f=\16=\u0446\13=\3=\3=\3=\3=\3=\3=\3=\7=\u044f\n=\f="+
		"\16=\u0452\13=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0465"+
		"\n=\3>\3>\3>\3>\6>\u046b\n>\r>\16>\u046c\3>\3>\3?\3?\3?\3?\3?\5?\u0476"+
		"\n?\3@\3@\3@\3A\3A\3A\3A\5A\u047f\nA\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\5F"+
		"\u048b\nF\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\5H\u0497\nH\3H\5H\u049a\nH\3I"+
		"\3I\3I\3I\3I\3I\7I\u04a2\nI\fI\16I\u04a5\13I\5I\u04a7\nI\3J\3J\3J\7J\u04ac"+
		"\nJ\fJ\16J\u04af\13J\3K\3K\3K\7K\u04b4\nK\fK\16K\u04b7\13K\3L\3L\3L\3"+
		"L\7L\u04bd\nL\fL\16L\u04c0\13L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M\3M"+
		"\3M\5M\u04d0\nM\3N\5N\u04d3\nN\3N\3N\3N\3N\7N\u04d9\nN\fN\16N\u04dc\13"+
		"N\3O\3O\3P\3P\3P\3P\7P\u04e4\nP\fP\16P\u04e7\13P\3Q\3Q\3R\5R\u04ec\nR"+
		"\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u04f7\nR\3R\3R\5R\u04fb\nR\3S\3S\3S\3S"+
		"\3S\7S\u0502\nS\fS\16S\u0505\13S\5S\u0507\nS\3S\5S\u050a\nS\3T\3T\5T\u050e"+
		"\nT\3U\3U\3U\3U\5U\u0514\nU\3V\3V\3V\3V\3V\3V\5V\u051c\nV\3W\3W\3W\3W"+
		"\5W\u0522\nW\3X\3X\5X\u0526\nX\3Y\3Y\3Z\3Z\3[\3[\3[\3[\7[\u0530\n[\f["+
		"\16[\u0533\13[\3[\3[\3\\\3\\\5\\\u0539\n\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\"+
		"\u0541\n\\\5\\\u0543\n\\\3]\3]\3^\3^\3_\3_\5_\u054b\n_\3`\3`\5`\u054f"+
		"\n`\3a\3a\3a\3a\5a\u0555\na\3a\3a\5a\u0559\na\5a\u055b\na\3a\3a\3a\3b"+
		"\3b\3b\5b\u0563\nb\3c\3c\3c\5c\u0568\nc\3c\3c\3c\3d\3d\3d\3d\3d\3d\5d"+
		"\u0573\nd\3d\3d\5d\u0577\nd\3d\3d\3d\3d\3e\3e\3e\3e\3f\3f\3g\3g\3h\3h"+
		"\3i\3i\3i\3i\5i\u058b\ni\3i\3i\5i\u058f\ni\3i\3i\5i\u0593\ni\3i\3i\5i"+
		"\u0597\ni\3i\3i\3i\3i\3j\3j\3j\7j\u05a0\nj\fj\16j\u05a3\13j\3k\3k\3k\7"+
		"k\u05a8\nk\fk\16k\u05ab\13k\3l\3l\3l\3l\3l\5l\u05b2\nl\7l\u05b4\nl\fl"+
		"\16l\u05b7\13l\3l\3l\5l\u05bb\nl\5l\u05bd\nl\3l\3l\3l\3l\3l\3l\3l\3l\7"+
		"l\u05c7\nl\fl\16l\u05ca\13l\3l\3l\5l\u05ce\nl\3l\3l\5l\u05d2\nl\3m\3m"+
		"\3m\3m\5m\u05d8\nm\3n\3n\3n\3n\3n\3n\3n\5n\u05e1\nn\3o\3o\3p\3p\3p\3p"+
		"\3p\3p\3p\3p\3p\5p\u05ee\np\5p\u05f0\np\3q\3q\3q\3q\3r\3r\3r\3r\3r\3r"+
		"\3r\3r\3r\3r\3r\3r\5r\u0602\nr\5r\u0604\nr\3r\3r\3r\3r\3r\3r\3r\3r\3r"+
		"\3r\3r\3r\7r\u0612\nr\fr\16r\u0615\13r\3r\3r\3r\3r\7r\u061b\nr\fr\16r"+
		"\u061e\13r\3r\3r\3r\3r\3r\3r\7r\u0626\nr\fr\16r\u0629\13r\5r\u062b\nr"+
		"\3r\3r\3r\3r\7r\u0631\nr\fr\16r\u0634\13r\3r\3r\3r\3r\7r\u063a\nr\fr\16"+
		"r\u063d\13r\5r\u063f\nr\3s\3s\3s\3s\3s\3s\3s\3s\3s\5s\u064a\ns\3s\3s\3"+
		"s\3s\5s\u0650\ns\5s\u0652\ns\5s\u0654\ns\3t\3t\3t\7t\u0659\nt\ft\16t\u065c"+
		"\13t\3u\3u\3u\3u\3u\3u\3u\3u\5u\u0666\nu\5u\u0668\nu\3u\3u\3u\3u\3u\3"+
		"u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\3u\7u\u067e\nu\fu\16u\u0681\13"+
		"u\5u\u0683\nu\3u\3u\3u\3u\3u\3u\3u\3u\5u\u068d\nu\3u\3u\3u\3u\3u\3u\5"+
		"u\u0695\nu\3u\5u\u0698\nu\3u\3u\5u\u069c\nu\3u\3u\3u\3u\3u\3u\3u\3u\5"+
		"u\u06a6\nu\3u\3u\3u\3u\3u\3u\3u\3u\7u\u06b0\nu\fu\16u\u06b3\13u\5u\u06b5"+
		"\nu\3u\3u\5u\u06b9\nu\3v\3v\3v\3v\3v\5v\u06c0\nv\3v\3v\5v\u06c4\nv\3v"+
		"\3v\3v\3v\3v\3v\5v\u06cc\nv\3v\3v\3v\3v\5v\u06d2\nv\5v\u06d4\nv\5v\u06d6"+
		"\nv\3w\3w\3w\5w\u06db\nw\3w\3w\3x\3x\3x\7x\u06e2\nx\fx\16x\u06e5\13x\3"+
		"y\3y\3y\7y\u06ea\ny\fy\16y\u06ed\13y\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z\3z"+
		"\3z\3z\3z\3z\3z\5z\u06ff\nz\3{\3{\3{\3{\3{\5{\u0706\n{\3{\3{\3{\3{\3{"+
		"\3{\3{\5{\u070f\n{\3|\3|\3}\5}\u0714\n}\3}\3}\3}\7}\u0719\n}\f}\16}\u071c"+
		"\13}\3~\3~\3~\3~\3~\3\177\3\177\6\177\u0725\n\177\r\177\16\177\u0726\3"+
		"\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u0736\n\u0080\3\u0080\5\u0080"+
		"\u0739\n\u0080\3\u0080\3\u0080\5\u0080\u073d\n\u0080\3\u0080\6\u0080\u0740"+
		"\n\u0080\r\u0080\16\u0080\u0741\3\u0080\3\u0080\3\u0080\5\u0080\u0747"+
		"\n\u0080\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u074f"+
		"\n\u0081\3\u0081\7\u0081\u0752\n\u0081\f\u0081\16\u0081\u0755\13\u0081"+
		"\3\u0081\3\u0081\5\u0081\u0759\n\u0081\3\u0082\3\u0082\3\u0082\3\u0082"+
		"\5\u0082\u075f\n\u0082\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\6\u0083\u0767\n\u0083\r\u0083\16\u0083\u0768\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\7\u0084\u0771\n\u0084\f\u0084\16\u0084\u0774"+
		"\13\u0084\3\u0084\3\u0084\3\u0084\7\u0084\u0779\n\u0084\f\u0084\16\u0084"+
		"\u077c\13\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\5\u0084\u0785\n\u0084\5\u0084\u0787\n\u0084\3\u0084\5\u0084\u078a\n\u0084"+
		"\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0085\7\u0085\u0792\n\u0085"+
		"\f\u0085\16\u0085\u0795\13\u0085\3\u0085\5\u0085\u0798\n\u0085\3\u0086"+
		"\3\u0086\3\u0086\3\u0086\7\u0086\u079e\n\u0086\f\u0086\16\u0086\u07a1"+
		"\13\u0086\3\u0086\5\u0086\u07a4\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087"+
		"\7\u0087\u07aa\n\u0087\f\u0087\16\u0087\u07ad\13\u0087\3\u0087\5\u0087"+
		"\u07b0\n\u0087\3\u0087\3\u0087\5\u0087\u07b4\n\u0087\3\u0087\3\u0087\3"+
		"\u0087\5\u0087\u07b9\n\u0087\3\u0087\5\u0087\u07bc\n\u0087\3\u0087\3\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\5\u0087\u07c4\n\u0087\7\u0087\u07c6\n"+
		"\u0087\f\u0087\16\u0087\u07c9\13\u0087\3\u0087\3\u0087\5\u0087\u07cd\n"+
		"\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088"+
		"\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u07dd\n\u0088"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\5\u0089\u07e3\n\u0089\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\5\u0089\u07e9\n\u0089\5\u0089\u07eb\n\u0089\3\u008a\3"+
		"\u008a\7\u008a\u07ef\n\u008a\f\u008a\16\u008a\u07f2\13\u008a\3\u008b\3"+
		"\u008b\3\u008b\3\u008b\3\u008b\3\u008b\7\u008b\u07fa\n\u008b\f\u008b\16"+
		"\u008b\u07fd\13\u008b\3\u008b\3\u008b\5\u008b\u0801\n\u008b\3\u008b\3"+
		"\u008b\3\u008b\7\u008b\u0806\n\u008b\f\u008b\16\u008b\u0809\13\u008b\3"+
		"\u008b\3\u008b\5\u008b\u080d\n\u008b\3\u008b\3\u008b\3\u008b\5\u008b\u0812"+
		"\n\u008b\3\u008b\5\u008b\u0815\n\u008b\3\u008b\3\u008b\5\u008b\u0819\n"+
		"\u008b\3\u008b\6\u008b\u081c\n\u008b\r\u008b\16\u008b\u081d\3\u008b\3"+
		"\u008b\3\u008b\5\u008b\u0823\n\u008b\3\u008c\3\u008c\3\u008c\3\u008c\3"+
		"\u008c\5\u008c\u082a\n\u008c\3\u008c\3\u008c\3\u008c\3\u008c\7\u008c\u0830"+
		"\n\u008c\f\u008c\16\u008c\u0833\13\u008c\3\u008c\3\u008c\5\u008c\u0837"+
		"\n\u008c\3\u008c\5\u008c\u083a\n\u008c\3\u008c\6\u008c\u083d\n\u008c\r"+
		"\u008c\16\u008c\u083e\3\u008c\3\u008c\3\u008c\5\u008c\u0844\n\u008c\3"+
		"\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d"+
		"\u084e\n\u008d\3\u008d\3\u008d\5\u008d\u0852\n\u008d\3\u008d\3\u008d\5"+
		"\u008d\u0856\n\u008d\5\u008d\u0858\n\u008d\3\u008e\3\u008e\3\u008e\3\u008e"+
		"\5\u008e\u085e\n\u008e\3\u008e\3\u008e\7\u008e\u0862\n\u008e\f\u008e\16"+
		"\u008e\u0865\13\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u086b\n"+
		"\u008e\3\u008e\3\u008e\7\u008e\u086f\n\u008e\f\u008e\16\u008e\u0872\13"+
		"\u008e\3\u008e\3\u008e\3\u008e\3\u008e\5\u008e\u0878\n\u008e\3\u008e\3"+
		"\u008e\7\u008e\u087c\n\u008e\f\u008e\16\u008e\u087f\13\u008e\3\u008e\3"+
		"\u008e\3\u008e\3\u008e\5\u008e\u0885\n\u008e\3\u008f\3\u008f\5\u008f\u0889"+
		"\n\u008f\3\u0090\3\u0090\3\u0090\7\u0090\u088e\n\u0090\f\u0090\16\u0090"+
		"\u0891\13\u0090\3\u0090\3\u0090\3\u0090\3\u0091\3\u0091\3\u0091\5\u0091"+
		"\u0899\n\u0091\3\u0091\3\u0091\3\u0091\3\u0091\5\u0091\u089f\n\u0091\5"+
		"\u0091\u08a1\n\u0091\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3"+
		"\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u08ad\n\u0092\5\u0092\u08af\n\u0092"+
		"\3\u0093\3\u0093\3\u0093\7\u0093\u08b4\n\u0093\f\u0093\16\u0093\u08b7"+
		"\13\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\5\u0095\u08d4\n\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\5\u0095"+
		"\u08f5\n\u0095\3\u0096\3\u0096\3\u0096\3\u0096\7\u0096\u08fb\n\u0096\f"+
		"\u0096\16\u0096\u08fe\13\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\5\u0097\u0905\n\u0097\3\u0097\3\u0097\5\u0097\u0909\n\u0097\3\u0097\3"+
		"\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u091b\n\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u0924"+
		"\n\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097"+
		"\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\5\u0097\u0945\n\u0097\3\u0097"+
		"\5\u0097\u0948\n\u0097\3\u0097\3\u0097\3\u0097\3\u0097\3\u0097\7\u0097"+
		"\u094f\n\u0097\f\u0097\16\u0097\u0952\13\u0097\3\u0097\3\u0097\3\u0097"+
		"\5\u0097\u0957\n\u0097\5\u0097\u0959\n\u0097\3\u0098\3\u0098\3\u0098\3"+
		"\u0098\3\u0098\3\u0098\3\u0098\5\u0098\u0962\n\u0098\3\u0099\3\u0099\3"+
		"\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u096d\n"+
		"\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0975\n"+
		"\u0099\5\u0099\u0977\n\u0099\3\u0099\3\u0099\5\u0099\u097b\n\u0099\3\u0099"+
		"\3\u0099\3\u0099\3\u0099\5\u0099\u0981\n\u0099\3\u0099\3\u0099\3\u0099"+
		"\5\u0099\u0986\n\u0099\5\u0099\u0988\n\u0099\3\u0099\3\u0099\3\u0099\3"+
		"\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0994\n"+
		"\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u0999\n\u0099\3\u0099\3\u0099\3"+
		"\u0099\3\u0099\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u09a3\n\u0099\3"+
		"\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u09a9\n\u0099\5\u0099\u09ab\n\u0099"+
		"\3\u009a\3\u009a\3\u009a\7\u009a\u09b0\n\u009a\f\u009a\16\u009a\u09b3"+
		"\13\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009d\3\u009d\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\5\u009e\u09c1\n\u009e\5\u009e\u09c3\n"+
		"\u009e\5\u009e\u09c5\n\u009e\3\u009e\3\u009e\5\u009e\u09c9\n\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009e\3\u009e\7\u009e\u09d0\n\u009e\f\u009e\16\u009e"+
		"\u09d3\13\u009e\5\u009e\u09d5\n\u009e\3\u009e\3\u009e\3\u009e\5\u009e"+
		"\u09da\n\u009e\5\u009e\u09dc\n\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3"+
		"\u009f\5\u009f\u09e3\n\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3"+
		"\u009f\7\u009f\u09eb\n\u009f\f\u009f\16\u009f\u09ee\13\u009f\3\u009f\3"+
		"\u009f\3\u009f\3\u009f\5\u009f\u09f4\n\u009f\3\u009f\3\u009f\5\u009f\u09f8"+
		"\n\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u09fd\n\u009f\3\u009f\3\u009f"+
		"\3\u009f\5\u009f\u0a02\n\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f"+
		"\5\u009f\u0a09\n\u009f\3\u009f\3\u009f\5\u009f\u0a0d\n\u009f\3\u009f\5"+
		"\u009f\u0a10\n\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3\u009f\3"+
		"\u009f\5\u009f\u0a19\n\u009f\3\u009f\3\u009f\3\u009f\5\u009f\u0a1e\n\u009f"+
		"\7\u009f\u0a20\n\u009f\f\u009f\16\u009f\u0a23\13\u009f\3\u009f\3\u009f"+
		"\3\u009f\3\u009f\3\u009f\5\u009f\u0a2a\n\u009f\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a0\3\u00a0\5\u00a0\u0a32\n\u00a0\3\u00a1\3\u00a1\3\u00a2"+
		"\3\u00a2\3\u00a2\5\u00a2\u0a39\n\u00a2\3\u00a2\3\u00a2\3\u00a2\3\u00a2"+
		"\5\u00a2\u0a3f\n\u00a2\5\u00a2\u0a41\n\u00a2\3\u00a3\3\u00a3\5\u00a3\u0a45"+
		"\n\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u0a4a\n\u00a3\7\u00a3\u0a4c\n"+
		"\u00a3\f\u00a3\16\u00a3\u0a4f\13\u00a3\3\u00a4\3\u00a4\3\u00a4\5\u00a4"+
		"\u0a54\n\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a5"+
		"\3\u00a5\3\u00a5\3\u00a5\3\u00a5\5\u00a5\u0a61\n\u00a5\3\u00a6\5\u00a6"+
		"\u0a64\n\u00a6\3\u00a6\3\u00a6\3\u00a7\5\u00a7\u0a69\n\u00a7\3\u00a7\3"+
		"\u00a7\5\u00a7\u0a6d\n\u00a7\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00a9\3"+
		"\u00a9\3\u00a9\3\u00a9\5\u00a9\u0a77\n\u00a9\5\u00a9\u0a79\n\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\3\u00a9\3\u00a9\3\u00a9\5\u00a9\u0a81\n\u00a9\5\u00a9"+
		"\u0a83\n\u00a9\7\u00a9\u0a85\n\u00a9\f\u00a9\16\u00a9\u0a88\13\u00a9\3"+
		"\u00aa\3\u00aa\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0a8f\n\u00ab\3\u00ab\3"+
		"\u00ab\5\u00ab\u0a93\n\u00ab\3\u00ab\5\u00ab\u0a96\n\u00ab\3\u00ab\5\u00ab"+
		"\u0a99\n\u00ab\3\u00ab\5\u00ab\u0a9c\n\u00ab\3\u00ab\5\u00ab\u0a9f\n\u00ab"+
		"\3\u00ab\3\u00ab\3\u00ab\5\u00ab\u0aa4\n\u00ab\3\u00ab\3\u00ab\3\u00ab"+
		"\5\u00ab\u0aa9\n\u00ab\3\u00ac\3\u00ac\5\u00ac\u0aad\n\u00ac\3\u00ac\3"+
		"\u00ac\3\u00ad\3\u00ad\3\u00ad\5\u00ad\u0ab4\n\u00ad\3\u00ad\5\u00ad\u0ab7"+
		"\n\u00ad\3\u00ad\5\u00ad\u0aba\n\u00ad\3\u00ad\5\u00ad\u0abd\n\u00ad\3"+
		"\u00ae\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0"+
		"\3\u00b0\3\u00b1\3\u00b1\5\u00b1\u0acb\n\u00b1\3\u00b2\3\u00b2\3\u00b2"+
		"\3\u00b2\3\u00b2\7\u00b2\u0ad2\n\u00b2\f\u00b2\16\u00b2\u0ad5\13\u00b2"+
		"\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0adb\n\u00b3\3\u00b3\3\u00b3"+
		"\3\u00b3\5\u00b3\u0ae0\n\u00b3\5\u00b3\u0ae2\n\u00b3\3\u00b3\3\u00b3\3"+
		"\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b3\5\u00b3\u0aeb\n\u00b3\3\u00b3\5"+
		"\u00b3\u0aee\n\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5"+
		"\u00b4\u0af6\n\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0afb\n\u00b4\5\u00b4"+
		"\u0afd\n\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0b09\n\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\7\u00b5\u0b10\n\u00b5\f\u00b5\16\u00b5\u0b13\13\u00b5"+
		"\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0b18\n\u00b5\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\7\u00b6"+
		"\u0b25\n\u00b6\f\u00b6\16\u00b6\u0b28\13\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0b31\n\u00b6\3\u00b6\5\u00b6"+
		"\u0b34\n\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\7\u00b6\u0b3b\n"+
		"\u00b6\f\u00b6\16\u00b6\u0b3e\13\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6"+
		"\3\u00b6\5\u00b6\u0b45\n\u00b6\3\u00b6\5\u00b6\u0b48\n\u00b6\5\u00b6\u0b4a"+
		"\n\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0b51\n\u00b6"+
		"\5\u00b6\u0b53\n\u00b6\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\5\u00b7\u0b5d\n\u00b7\5\u00b7\u0b5f\n\u00b7\3\u00b7\3"+
		"\u00b7\3\u00b8\3\u00b8\3\u00b8\7\u00b8\u0b66\n\u00b8\f\u00b8\16\u00b8"+
		"\u0b69\13\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\5\u00b9\u0b74\n\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9"+
		"\u0b79\n\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\5\u00b9\u0b82\n\u00b9\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba"+
		"\u0b89\n\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba"+
		"\u0b91\n\u00ba\3\u00ba\3\u00ba\5\u00ba\u0b95\n\u00ba\3\u00ba\3\u00ba\3"+
		"\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba"+
		"\u0ba1\n\u00ba\3\u00ba\3\u00ba\5\u00ba\u0ba5\n\u00ba\3\u00ba\5\u00ba\u0ba8"+
		"\n\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\5\u00bb\u0bae\n\u00bb\3\u00bb"+
		"\5\u00bb\u0bb1\n\u00bb\3\u00bb\5\u00bb\u0bb4\n\u00bb\3\u00bc\3\u00bc\3"+
		"\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd"+
		"\u0bc0\n\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00bf\3\u00bf"+
		"\3\u00bf\5\u00bf\u0bca\n\u00bf\3\u00bf\3\u00bf\5\u00bf\u0bce\n\u00bf\3"+
		"\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0bd6\n\u00c0\3"+
		"\u00c0\5\u00c0\u0bd9\n\u00c0\3\u00c0\5\u00c0\u0bdc\n\u00c0\3\u00c1\3\u00c1"+
		"\3\u00c1\5\u00c1\u0be1\n\u00c1\3\u00c1\5\u00c1\u0be4\n\u00c1\3\u00c1\5"+
		"\u00c1\u0be7\n\u00c1\3\u00c1\3\u00c1\5\u00c1\u0beb\n\u00c1\3\u00c1\3\u00c1"+
		"\5\u00c1\u0bef\n\u00c1\3\u00c1\5\u00c1\u0bf2\n\u00c1\3\u00c1\3\u00c1\3"+
		"\u00c1\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2"+
		"\u0bfe\n\u00c2\5\u00c2\u0c00\n\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3"+
		"\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\7\u00c2\u0c15\n\u00c2"+
		"\f\u00c2\16\u00c2\u0c18\13\u00c2\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3"+
		"\u0c1e\n\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\5\u00c3\u0c29\n\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3"+
		"\5\u00c3\u0c2f\n\u00c3\3\u00c3\6\u00c3\u0c32\n\u00c3\r\u00c3\16\u00c3"+
		"\u0c33\5\u00c3\u0c36\n\u00c3\3\u00c4\3\u00c4\3\u00c5\3\u00c5\5\u00c5\u0c3c"+
		"\n\u00c5\3\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c9\3\u00c9"+
		"\5\u00c9\u0c46\n\u00c9\3\u00c9\2\2\u00ca\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140"+
		"\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158"+
		"\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170"+
		"\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188"+
		"\u018a\u018c\u018e\u0190\2+\4\2\u0095\u0095\u00e1\u00e1\4\2!!\u0111\u0111"+
		"\7\2\30\30\u0092\u0092\u0094\u0094\u00e4\u00e4\u0100\u0101\5\2DE\u00b9"+
		"\u00b9\u00c4\u00c4\4\2UUoo\4\2\u00c6\u00c6\u0128\u0128\5\2%%\u00ba\u00ba"+
		"\u0157\u0157\4\2gg\u011a\u011a\4\2\b\b\13\13\3\2\u013a\u013b\5\2\b\bS"+
		"S\u013c\u013c\6\2@@BB\u00b8\u00b8\u0138\u0138\7\2\23\2388\u00b1\u00b1"+
		"\u00b3\u00b3\u010c\u010c\4\2FF\u00c7\u00c7\5\2\u00b5\u00b5\u013c\u013d"+
		"\u015a\u015a\21\2\23\23--88@@BBdd\u008c\u008c\u00b1\u00b3\u00b8\u00b8"+
		"\u00da\u00da\u010c\u010c\u0115\u0115\u0117\u0117\u0129\u0129\u0138\u0138"+
		"\3\2\u0113\u0114\13\2$$\66\66RRqquu\u008e\u008e\u00ad\u00ad\u00ec\u00ec"+
		"\u0131\u0131\4\2\u00a4\u00a4\u00d5\u00d5\3\2\u0102\u0103\4\2\u00a3\u00a3"+
		"\u00a5\u00a5\5\2\32\32\u00f0\u00f0\u011d\u011d\r\2\31\31\33\34>>OO\177"+
		"\177\u0097\u0097\u00ab\u00ab\u00bf\u00bf\u00e6\u00e6\u0132\u0132\u0139"+
		"\u0139\3\2\20\21\4\2\4\4\25\25\5\2LL\u008e\u008f\u00f3\u00f3\4\2\u00bd"+
		"\u00bd\u00db\u00db\5\2rr\u00ad\u00ae\u00df\u00df\3\2\u00c9\u00ca\4\2\64"+
		"\64\u011c\u011c\4\2VV\u0122\u0122\4\2\u00db\u00db\u015f\u015f\4\2\u00d4"+
		"\u00d4\u00f3\u00f3\4\2\r\rNN\4\2SS\u011f\u011f\4\2^^\u00fc\u00fc\5\2\62"+
		"\62QQ\u00ea\u00ea\4\2[[\u0105\u0105\4\2\u0106\u0106\u012d\u012d\4\2\67"+
		"\67\u010b\u010b!\2\5\5\16\1688<<ggmmvv\u0080\u0080\u0084\u0084\u008a\u008a"+
		"\u0093\u0093\u0095\u0095\u009e\u009e\u00a0\u00a0\u00a4\u00a4\u00b2\u00b2"+
		"\u00c0\u00c2\u00c5\u00c5\u00d5\u00d5\u00e4\u00e4\u00fe\u00fe\u0104\u0104"+
		"\u010a\u010a\u0110\u0110\u0115\u0115\u0117\u0117\u011a\u011a\u0124\u0124"+
		"\u0129\u0129\u012b\u012b\u0137\u0137\2\u0dcb\2\u0193\3\2\2\2\4\u01a1\3"+
		"\2\2\2\6\u01a4\3\2\2\2\b\u01b5\3\2\2\2\n\u01b9\3\2\2\2\f\u01bf\3\2\2\2"+
		"\16\u01c3\3\2\2\2\20\u01c7\3\2\2\2\22\u01d5\3\2\2\2\24\u01de\3\2\2\2\26"+
		"\u01e6\3\2\2\2\30\u01f2\3\2\2\2\32\u01f6\3\2\2\2\34\u0214\3\2\2\2\36\u021a"+
		"\3\2\2\2 \u021c\3\2\2\2\"\u0224\3\2\2\2$\u0226\3\2\2\2&\u023b\3\2\2\2"+
		"(\u024d\3\2\2\2*\u0254\3\2\2\2,\u026b\3\2\2\2.\u02a6\3\2\2\2\60\u02a8"+
		"\3\2\2\2\62\u02ac\3\2\2\2\64\u02b0\3\2\2\2\66\u02b4\3\2\2\28\u02b8\3\2"+
		"\2\2:\u02bc\3\2\2\2<\u02c0\3\2\2\2>\u02c2\3\2\2\2@\u02cc\3\2\2\2B\u02ce"+
		"\3\2\2\2D\u02e2\3\2\2\2F\u02ef\3\2\2\2H\u02f7\3\2\2\2J\u0301\3\2\2\2L"+
		"\u0306\3\2\2\2N\u030c\3\2\2\2P\u0310\3\2\2\2R\u0314\3\2\2\2T\u0321\3\2"+
		"\2\2V\u0323\3\2\2\2X\u0336\3\2\2\2Z\u0341\3\2\2\2\\\u035c\3\2\2\2^\u0360"+
		"\3\2\2\2`\u0362\3\2\2\2b\u0372\3\2\2\2d\u0374\3\2\2\2f\u03bb\3\2\2\2h"+
		"\u03d8\3\2\2\2j\u03de\3\2\2\2l\u03e0\3\2\2\2n\u03e4\3\2\2\2p\u03ed\3\2"+
		"\2\2r\u03f1\3\2\2\2t\u03fd\3\2\2\2v\u03ff\3\2\2\2x\u0464\3\2\2\2z\u0466"+
		"\3\2\2\2|\u0475\3\2\2\2~\u0477\3\2\2\2\u0080\u047e\3\2\2\2\u0082\u0480"+
		"\3\2\2\2\u0084\u0482\3\2\2\2\u0086\u0484\3\2\2\2\u0088\u0486\3\2\2\2\u008a"+
		"\u048a\3\2\2\2\u008c\u048c\3\2\2\2\u008e\u0499\3\2\2\2\u0090\u04a6\3\2"+
		"\2\2\u0092\u04a8\3\2\2\2\u0094\u04b0\3\2\2\2\u0096\u04b8\3\2\2\2\u0098"+
		"\u04cf\3\2\2\2\u009a\u04d2\3\2\2\2\u009c\u04dd\3\2\2\2\u009e\u04df\3\2"+
		"\2\2\u00a0\u04e8\3\2\2\2\u00a2\u04f6\3\2\2\2\u00a4\u04fc\3\2\2\2\u00a6"+
		"\u050d\3\2\2\2\u00a8\u0513\3\2\2\2\u00aa\u051b\3\2\2\2\u00ac\u0521\3\2"+
		"\2\2\u00ae\u0525\3\2\2\2\u00b0\u0527\3\2\2\2\u00b2\u0529\3\2\2\2\u00b4"+
		"\u052b\3\2\2\2\u00b6\u0536\3\2\2\2\u00b8\u0544\3\2\2\2\u00ba\u0546\3\2"+
		"\2\2\u00bc\u054a\3\2\2\2\u00be\u054e\3\2\2\2\u00c0\u0550\3\2\2\2\u00c2"+
		"\u0562\3\2\2\2\u00c4\u0564\3\2\2\2\u00c6\u056c\3\2\2\2\u00c8\u057c\3\2"+
		"\2\2\u00ca\u0580\3\2\2\2\u00cc\u0582\3\2\2\2\u00ce\u0584\3\2\2\2\u00d0"+
		"\u0586\3\2\2\2\u00d2\u059c\3\2\2\2\u00d4\u05a4\3\2\2\2\u00d6\u05d1\3\2"+
		"\2\2\u00d8\u05d7\3\2\2\2\u00da\u05e0\3\2\2\2\u00dc\u05e2\3\2\2\2\u00de"+
		"\u05ef\3\2\2\2\u00e0\u05f1\3\2\2\2\u00e2\u063e\3\2\2\2\u00e4\u0653\3\2"+
		"\2\2\u00e6\u0655\3\2\2\2\u00e8\u06b8\3\2\2\2\u00ea\u06d5\3\2\2\2\u00ec"+
		"\u06d7\3\2\2\2\u00ee\u06de\3\2\2\2\u00f0\u06e6\3\2\2\2\u00f2\u06fe\3\2"+
		"\2\2\u00f4\u070e\3\2\2\2\u00f6\u0710\3\2\2\2\u00f8\u0713\3\2\2\2\u00fa"+
		"\u071d\3\2\2\2\u00fc\u0722\3\2\2\2\u00fe\u0728\3\2\2\2\u0100\u0748\3\2"+
		"\2\2\u0102\u075e\3\2\2\2\u0104\u0760\3\2\2\2\u0106\u076a\3\2\2\2\u0108"+
		"\u078d\3\2\2\2\u010a\u0799\3\2\2\2\u010c\u07a5\3\2\2\2\u010e\u07dc\3\2"+
		"\2\2\u0110\u07ea\3\2\2\2\u0112\u07ec\3\2\2\2\u0114\u07f3\3\2\2\2\u0116"+
		"\u0824\3\2\2\2\u0118\u0857\3\2\2\2\u011a\u0884\3\2\2\2\u011c\u0886\3\2"+
		"\2\2\u011e\u088a\3\2\2\2\u0120\u08a0\3\2\2\2\u0122\u08ae\3\2\2\2\u0124"+
		"\u08b0\3\2\2\2\u0126\u08b8\3\2\2\2\u0128\u08f4\3\2\2\2\u012a\u08f6\3\2"+
		"\2\2\u012c\u0958\3\2\2\2\u012e\u0961\3\2\2\2\u0130\u09aa\3\2\2\2\u0132"+
		"\u09ac\3\2\2\2\u0134\u09b4\3\2\2\2\u0136\u09b6\3\2\2\2\u0138\u09b8\3\2"+
		"\2\2\u013a\u09db\3\2\2\2\u013c\u0a29\3\2\2\2\u013e\u0a31\3\2\2\2\u0140"+
		"\u0a33\3\2\2\2\u0142\u0a40\3\2\2\2\u0144\u0a42\3\2\2\2\u0146\u0a50\3\2"+
		"\2\2\u0148\u0a60\3\2\2\2\u014a\u0a63\3\2\2\2\u014c\u0a68\3\2\2\2\u014e"+
		"\u0a6e\3\2\2\2\u0150\u0a70\3\2\2\2\u0152\u0a89\3\2\2\2\u0154\u0a8b\3\2"+
		"\2\2\u0156\u0aaa\3\2\2\2\u0158\u0ab0\3\2\2\2\u015a\u0abe\3\2\2\2\u015c"+
		"\u0ac1\3\2\2\2\u015e\u0ac5\3\2\2\2\u0160\u0ac8\3\2\2\2\u0162\u0acc\3\2"+
		"\2\2\u0164\u0ad6\3\2\2\2\u0166\u0af1\3\2\2\2\u0168\u0b01\3\2\2\2\u016a"+
		"\u0b19\3\2\2\2\u016c\u0b54\3\2\2\2\u016e\u0b62\3\2\2\2\u0170\u0b81\3\2"+
		"\2\2\u0172\u0ba7\3\2\2\2\u0174\u0ba9\3\2\2\2\u0176\u0bb5\3\2\2\2\u0178"+
		"\u0bbf\3\2\2\2\u017a\u0bc1\3\2\2\2\u017c\u0bcd\3\2\2\2\u017e\u0bdb\3\2"+
		"\2\2\u0180\u0bdd\3\2\2\2\u0182\u0bf6\3\2\2\2\u0184\u0c19\3\2\2\2\u0186"+
		"\u0c37\3\2\2\2\u0188\u0c3b\3\2\2\2\u018a\u0c3d\3\2\2\2\u018c\u0c3f\3\2"+
		"\2\2\u018e\u0c41\3\2\2\2\u0190\u0c45\3\2\2\2\u0192\u0194\5\u0174\u00bb"+
		"\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0196\3\2\2\2\u0195\u0197"+
		"\5\26\f\2\u0196\u0195\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0199\3\2\2\2"+
		"\u0198\u019a\5\30\r\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b"+
		"\3\2\2\2\u019b\u019d\5\6\4\2\u019c\u019e\5\f\7\2\u019d\u019c\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a0\7\2\2\3\u01a0\3\3\2\2\2"+
		"\u01a1\u01a2\7\u014e\2\2\u01a2\5\3\2\2\2\u01a3\u01a5\5\u0186\u00c4\2\u01a4"+
		"\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7\u00af"+
		"\2\2\u01a7\u01a9\5\u0186\u00c4\2\u01a8\u01aa\5\30\r\2\u01a9\u01a8\3\2"+
		"\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01ad\5\b\5\2\u01ac"+
		"\u01ab\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\7Z"+
		"\2\2\u01af\u01b0\7\u00af\2\2\u01b0\u01b1\5\u0186\u00c4\2\u01b1\7\3\2\2"+
		"\2\u01b2\u01b6\5\n\6\2\u01b3\u01b6\5N(\2\u01b4\u01b6\5\u0186\u00c4\2\u01b5"+
		"\u01b2\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b7\3\2"+
		"\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\t\3\2\2\2\u01b9\u01ba"+
		"\7J\2\2\u01ba\u01bb\t\2\2\2\u01bb\u01bc\5\u0186\u00c4\2\u01bc\13\3\2\2"+
		"\2\u01bd\u01c0\5\u0180\u00c1\2\u01be\u01c0\5\20\t\2\u01bf\u01bd\3\2\2"+
		"\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2"+
		"\3\2\2\2\u01c2\r\3\2\2\2\u01c3\u01c5\7\u00ee\2\2\u01c4\u01c6\5\u00d4k"+
		"\2\u01c5\u01c4\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\17\3\2\2\2\u01c7\u01c8"+
		"\7z\2\2\u01c8\u01ca\5\u00a6T\2\u01c9\u01cb\5\22\n\2\u01ca\u01c9\3\2\2"+
		"\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\5\u0186\u00c4\2"+
		"\u01cd\u01cf\5\30\r\2\u01ce\u01d0\5N(\2\u01cf\u01ce\3\2\2\2\u01cf\u01d0"+
		"\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d2\7Z\2\2\u01d2\u01d3\7z\2\2\u01d3"+
		"\u01d4\5\u0186\u00c4\2\u01d4\21\3\2\2\2\u01d5\u01d9\7\u0147\2\2\u01d6"+
		"\u01d8\5\24\13\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3"+
		"\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc"+
		"\u01dd\7\u0148\2\2\u01dd\23\3\2\2\2\u01de\u01e3\5\4\3\2\u01df\u01e0\7"+
		"\u013e\2\2\u01e0\u01e2\5\4\3\2\u01e1\u01df\3\2\2\2\u01e2\u01e5\3\2\2\2"+
		"\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\25\3\2\2\2\u01e5\u01e3"+
		"\3\2\2\2\u01e6\u01ed\7|\2\2\u01e7\u01ee\5J&\2\u01e8\u01e9\5\u0186\u00c4"+
		"\2\u01e9\u01ea\5\30\r\2\u01ea\u01eb\7Z\2\2\u01eb\u01ec\7|\2\2\u01ec\u01ee"+
		"\3\2\2\2\u01ed\u01e7\3\2\2\2\u01ed\u01e8\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u01f0\5\u0186\u00c4\2\u01f0\27\3\2\2\2\u01f1\u01f3\5\32\16\2\u01f2\u01f1"+
		"\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\31\3\2\2\2\u01f6\u01f7\7K\2\2\u01f7\u01fc\5\34\17\2\u01f8\u01f9\7\u013e"+
		"\2\2\u01f9\u01fb\5\34\17\2\u01fa\u01f8\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc"+
		"\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\33\3\2\2\2\u01fe\u01fc\3\2\2"+
		"\2\u01ff\u0204\5\u0190\u00c9\2\u0200\u0201\7\u013e\2\2\u0201\u0203\5\u0190"+
		"\u00c9\2\u0202\u0200\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\5\36"+
		"\20\2\u0208\u0215\3\2\2\2\u0209\u020a\5\u0190\u00c9\2\u020a\u0211\5\36"+
		"\20\2\u020b\u020c\7\u013e\2\2\u020c\u020d\5\u0190\u00c9\2\u020d\u020e"+
		"\5\36\20\2\u020e\u0210\3\2\2\2\u020f\u020b\3\2\2\2\u0210\u0213\3\2\2\2"+
		"\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0215\3\2\2\2\u0213\u0211"+
		"\3\2\2\2\u0214\u01ff\3\2\2\2\u0214\u0209\3\2\2\2\u0215\35\3\2\2\2\u0216"+
		"\u021b\5\"\22\2\u0217\u021b\5 \21\2\u0218\u021b\5$\23\2\u0219\u021b\5"+
		"@!\2\u021a\u0216\3\2\2\2\u021a\u0217\3\2\2\2\u021a\u0218\3\2\2\2\u021a"+
		"\u0219\3\2\2\2\u021b\37\3\2\2\2\u021c\u021d\7\u00a2\2\2\u021d\u021e\5"+
		"\u014a\u00a6\2\u021e\u021f\7\u014b\2\2\u021f\u0220\5\4\3\2\u0220!\3\2"+
		"\2\2\u0221\u0225\5(\25\2\u0222\u0225\5&\24\2\u0223\u0225\5*\26\2\u0224"+
		"\u0221\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0223\3\2\2\2\u0225#\3\2\2\2"+
		"\u0226\u0227\t\3\2\2\u0227%\3\2\2\2\u0228\u023c\t\4\2\2\u0229\u0232\t"+
		"\5\2\2\u022a\u022b\7\u0147\2\2\u022b\u022e\5\u00acW\2\u022c\u022d\7\u013e"+
		"\2\2\u022d\u022f\5\u00acW\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u0230\3\2\2\2\u0230\u0231\7\u0148\2\2\u0231\u0233\3\2\2\2\u0232\u022a"+
		"\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u023c\3\2\2\2\u0234\u0239\t\6\2\2\u0235"+
		"\u0236\7\u0147\2\2\u0236\u0237\5\u00acW\2\u0237\u0238\7\u0148\2\2\u0238"+
		"\u023a\3\2\2\2\u0239\u0235\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\3\2"+
		"\2\2\u023b\u0228\3\2\2\2\u023b\u0229\3\2\2\2\u023b\u0234\3\2\2\2\u023c"+
		"\'\3\2\2\2\u023d\u023e\t\7\2\2\u023e\u023f\7\u0147\2\2\u023f\u0242\5\u00ac"+
		"W\2\u0240\u0241\7\u013e\2\2\u0241\u0243\5\u00acW\2\u0242\u0240\3\2\2\2"+
		"\u0242\u0243\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\7\u0148\2\2\u0245"+
		"\u024e\3\2\2\2\u0246\u024b\t\b\2\2\u0247\u0248\7\u0147\2\2\u0248\u0249"+
		"\5\u00acW\2\u0249\u024a\7\u0148\2\2\u024a\u024c\3\2\2\2\u024b\u0247\3"+
		"\2\2\2\u024b\u024c\3\2\2\2\u024c\u024e\3\2\2\2\u024d\u023d\3\2\2\2\u024d"+
		"\u0246\3\2\2\2\u024e)\3\2\2\2\u024f\u0255\7@\2\2\u0250\u0251\7A\2\2\u0251"+
		"\u0255\5,\27\2\u0252\u0253\7\u0096\2\2\u0253\u0255\5.\30\2\u0254\u024f"+
		"\3\2\2\2\u0254\u0250\3\2\2\2\u0254\u0252\3\2\2\2\u0255+\3\2\2\2\u0256"+
		"\u0257\7\u0138\2\2\u0257\u0258\7\u0116\2\2\u0258\u026c\5\62\32\2\u0259"+
		"\u025a\7\u00b8\2\2\u025a\u025b\7\u0116\2\2\u025b\u026c\5\64\33\2\u025c"+
		"\u025d\7B\2\2\u025d\u025e\7\u0116\2\2\u025e\u026c\5\66\34\2\u025f\u0260"+
		"\7\u0086\2\2\u0260\u0261\7\u0116\2\2\u0261\u026c\58\35\2\u0262\u0263\7"+
		"\u00b4\2\2\u0263\u0264\7\u0116\2\2\u0264\u026c\5:\36\2\u0265\u0266\7\u00f8"+
		"\2\2\u0266\u0267\7\u0116\2\2\u0267\u026c\5<\37\2\u0268\u0269\7w\2\2\u0269"+
		"\u026a\7\u0116\2\2\u026a\u026c\5> \2\u026b\u0256\3\2\2\2\u026b\u0259\3"+
		"\2\2\2\u026b\u025c\3\2\2\2\u026b\u025f\3\2\2\2\u026b\u0262\3\2\2\2\u026b"+
		"\u0265\3\2\2\2\u026b\u0268\3\2\2\2\u026c-\3\2\2\2\u026d\u0272\7\u0138"+
		"\2\2\u026e\u026f\7\u0147\2\2\u026f\u0270\5\u00acW\2\u0270\u0271\7\u0148"+
		"\2\2\u0271\u0273\3\2\2\2\u0272\u026e\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0274\3\2\2\2\u0274\u0275\7\u0116\2\2\u0275\u02a7\5\62\32\2\u0276\u027b"+
		"\7\u00b8\2\2\u0277\u0278\7\u0147\2\2\u0278\u0279\5\u00acW\2\u0279\u027a"+
		"\7\u0148\2\2\u027a\u027c\3\2\2\2\u027b\u0277\3\2\2\2\u027b\u027c\3\2\2"+
		"\2\u027c\u027d\3\2\2\2\u027d\u027e\7\u0116\2\2\u027e\u02a7\5\64\33\2\u027f"+
		"\u0284\7B\2\2\u0280\u0281\7\u0147\2\2\u0281\u0282\5\u00acW\2\u0282\u0283"+
		"\7\u0148\2\2\u0283\u0285\3\2\2\2\u0284\u0280\3\2\2\2\u0284\u0285\3\2\2"+
		"\2\u0285\u0286\3\2\2\2\u0286\u0287\7\u0116\2\2\u0287\u02a7\5\66\34\2\u0288"+
		"\u028d\7\u0086\2\2\u0289\u028a\7\u0147\2\2\u028a\u028b\5\u00acW\2\u028b"+
		"\u028c\7\u0148\2\2\u028c\u028e\3\2\2\2\u028d\u0289\3\2\2\2\u028d\u028e"+
		"\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\7\u0116\2\2\u0290\u02a7\58\35"+
		"\2\u0291\u0296\7\u00b4\2\2\u0292\u0293\7\u0147\2\2\u0293\u0294\5\u00ac"+
		"W\2\u0294\u0295\7\u0148\2\2\u0295\u0297\3\2\2\2\u0296\u0292\3\2\2\2\u0296"+
		"\u0297\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\7\u0116\2\2\u0299\u02a7"+
		"\5:\36\2\u029a\u029f\7\u00f8\2\2\u029b\u029c\7\u0147\2\2\u029c\u029d\5"+
		"\u00acW\2\u029d\u029e\7\u0148\2\2\u029e\u02a0\3\2\2\2\u029f\u029b\3\2"+
		"\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\7\u0116\2\2\u02a2"+
		"\u02a7\5<\37\2\u02a3\u02a4\7w\2\2\u02a4\u02a5\7\u0116\2\2\u02a5\u02a7"+
		"\5> \2\u02a6\u026d\3\2\2\2\u02a6\u0276\3\2\2\2\u02a6\u027f\3\2\2\2\u02a6"+
		"\u0288\3\2\2\2\u02a6\u0291\3\2\2\2\u02a6\u029a\3\2\2\2\u02a6\u02a3\3\2"+
		"\2\2\u02a7/\3\2\2\2\u02a8\u02a9\5\62\32\2\u02a9\61\3\2\2\2\u02aa\u02ad"+
		"\7\u0138\2\2\u02ab\u02ad\5\64\33\2\u02ac\u02aa\3\2\2\2\u02ac\u02ab\3\2"+
		"\2\2\u02ad\63\3\2\2\2\u02ae\u02b1\7\u00b8\2\2\u02af\u02b1\5\66\34\2\u02b0"+
		"\u02ae\3\2\2\2\u02b0\u02af\3\2\2\2\u02b1\65\3\2\2\2\u02b2\u02b5\7B\2\2"+
		"\u02b3\u02b5\58\35\2\u02b4\u02b2\3\2\2\2\u02b4\u02b3\3\2\2\2\u02b5\67"+
		"\3\2\2\2\u02b6\u02b9\7\u0086\2\2\u02b7\u02b9\5:\36\2\u02b8\u02b6\3\2\2"+
		"\2\u02b8\u02b7\3\2\2\2\u02b99\3\2\2\2\u02ba\u02bd\7\u00b4\2\2\u02bb\u02bd"+
		"\5<\37\2\u02bc\u02ba\3\2\2\2\u02bc\u02bb\3\2\2\2\u02bd;\3\2\2\2\u02be"+
		"\u02c1\7\u00f8\2\2\u02bf\u02c1\5> \2\u02c0\u02be\3\2\2\2\u02c0\u02bf\3"+
		"\2\2\2\u02c1=\3\2\2\2\u02c2\u02c7\7w\2\2\u02c3\u02c4\7\u0147\2\2\u02c4"+
		"\u02c5\5\u00acW\2\u02c5\u02c6\7\u0148\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c3"+
		"\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8?\3\2\2\2\u02c9\u02cd\5B\"\2\u02ca\u02cd"+
		"\5F$\2\u02cb\u02cd\5H%\2\u02cc\u02c9\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc"+
		"\u02cb\3\2\2\2\u02cdA\3\2\2\2\u02ce\u02e0\7\u00e3\2\2\u02cf\u02d0\5\u0186"+
		"\u00c4\2\u02d0\u02d5\5\34\17\2\u02d1\u02d2\7\u013e\2\2\u02d2\u02d4\5\34"+
		"\17\2\u02d3\u02d1\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5"+
		"\u02d6\3\2\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8\u02d9\7Z"+
		"\2\2\u02d9\u02da\7\u00e3\2\2\u02da\u02e1\3\2\2\2\u02db\u02dc\7\u00a2\2"+
		"\2\u02dc\u02dd\5\u014a\u00a6\2\u02dd\u02de\7\u014b\2\2\u02de\u02df\7\u013c"+
		"\2\2\u02df\u02e1\3\2\2\2\u02e0\u02cf\3\2\2\2\u02e0\u02db\3\2\2\2\u02e1"+
		"C\3\2\2\2\u02e2\u02e3\7\u0149\2\2\u02e3\u02eb\5\u00acW\2\u02e4\u02e5\7"+
		"\u013e\2\2\u02e5\u02ec\5\u00acW\2\u02e6\u02e7\7\u013e\2\2\u02e7\u02e8"+
		"\5\u00acW\2\u02e8\u02e9\7\u013e\2\2\u02e9\u02ea\5\u00acW\2\u02ea\u02ec"+
		"\3\2\2\2\u02eb\u02e4\3\2\2\2\u02eb\u02e6\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec"+
		"\u02ed\3\2\2\2\u02ed\u02ee\7\u014a\2\2\u02eeE\3\2\2\2\u02ef\u02f0\7\24"+
		"\2\2\u02f0\u02f1\5D#\2\u02f1\u02f5\7\u00c8\2\2\u02f2\u02f6\5B\"\2\u02f3"+
		"\u02f6\5\"\22\2\u02f4\u02f6\5$\23\2\u02f5\u02f2\3\2\2\2\u02f5\u02f3\3"+
		"\2\2\2\u02f5\u02f4\3\2\2\2\u02f6G\3\2\2\2\u02f7\u02f8\7X\2\2\u02f8\u02f9"+
		"\7\24\2\2\u02f9\u02fa\7\u0133\2\2\u02fa\u02fb\5\u00acW\2\u02fb\u02fc\7"+
		"P\2\2\u02fc\u02ff\7\u00c8\2\2\u02fd\u0300\5B\"\2\u02fe\u0300\5\"\22\2"+
		"\u02ff\u02fd\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300I\3\2\2\2\u0301\u0302\7"+
		"\u014f\2\2\u0302K\3\2\2\2\u0303\u0304\5P)\2\u0304\u0305\7\u0140\2\2\u0305"+
		"\u0307\3\2\2\2\u0306\u0303\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\3\2"+
		"\2\2\u0308\u0309\5R*\2\u0309M\3\2\2\2\u030a\u030d\5L\'\2\u030b\u030d\5"+
		"\u0174\u00bb\2\u030c\u030a\3\2\2\2\u030c\u030b\3\2\2\2\u030d\u030e\3\2"+
		"\2\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030fO\3\2\2\2\u0310\u0311"+
		"\5\4\3\2\u0311Q\3\2\2\2\u0312\u0315\5T+\2\u0313\u0315\5\u00bc_\2\u0314"+
		"\u0312\3\2\2\2\u0314\u0313\3\2\2\2\u0315S\3\2\2\2\u0316\u0322\5X-\2\u0317"+
		"\u0322\5Z.\2\u0318\u031a\5\u012e\u0098\2\u0319\u031b\7\u013f\2\2\u031a"+
		"\u0319\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u0322\3\2\2\2\u031c\u0322\5\u00d8"+
		"m\2\u031d\u0322\5\u011a\u008e\2\u031e\u0322\5\u00f4{\2\u031f\u0322\5\u0102"+
		"\u0082\2\u0320\u0322\5\u0110\u0089\2\u0321\u0316\3\2\2\2\u0321\u0317\3"+
		"\2\2\2\u0321\u0318\3\2\2\2\u0321\u031c\3\2\2\2\u0321\u031d\3\2\2\2\u0321"+
		"\u031e\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0320\3\2\2\2\u0322U\3\2\2\2"+
		"\u0323\u0326\7\u00f5\2\2\u0324\u0327\5\u00aeX\2\u0325\u0327\5J&\2\u0326"+
		"\u0324\3\2\2\2\u0326\u0325\3\2\2\2\u0327\u032e\3\2\2\2\u0328\u0329\7\u0088"+
		"\2\2\u0329\u032a\7r\2\2\u032a\u032f\7\u00b6\2\2\u032b\u032c\7\u0088\2"+
		"\2\u032c\u032d\7\u00a3\2\2\u032d\u032f\7\u00b6\2\2\u032e\u0328\3\2\2\2"+
		"\u032e\u032b\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0334\3\2\2\2\u0330\u0331"+
		"\7\u0134\2\2\u0331\u0335\7\u012c\2\2\u0332\u0333\7\u00ef\2\2\u0333\u0335"+
		"\5\u00aeX\2\u0334\u0330\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2"+
		"\2\u0335W\3\2\2\2\u0336\u0337\7\u00a1\2\2\u0337\u0338\5\u00aeX\2\u0338"+
		"\u0339\7\u0141\2\2\u0339\u033e\5\u0096L\2\u033a\u033b\7\u013e\2\2\u033b"+
		"\u033d\5\u0096L\2\u033c\u033a\3\2\2\2\u033d\u0340\3\2\2\2\u033e\u033c"+
		"\3\2\2\2\u033e\u033f\3\2\2\2\u033fY\3\2\2\2\u0340\u033e\3\2\2\2\u0341"+
		"\u0342\7#\2\2\u0342\u034f\5\\/\2\u0343\u034c\7\u0147\2\2\u0344\u0349\5"+
		"^\60\2\u0345\u0346\7\u013e\2\2\u0346\u0348\5^\60\2\u0347\u0345\3\2\2\2"+
		"\u0348\u034b\3\2\2\2\u0349\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034d"+
		"\3\2\2\2\u034b\u0349\3\2\2\2\u034c\u0344\3\2\2\2\u034c\u034d\3\2\2\2\u034d"+
		"\u034e\3\2\2\2\u034e\u0350\7\u0148\2\2\u034f\u0343\3\2\2\2\u034f\u0350"+
		"\3\2\2\2\u0350\u035a\3\2\2\2\u0351\u0352\7\u00ef\2\2\u0352\u0357\5\u00ae"+
		"X\2\u0353\u0354\7\u013e\2\2\u0354\u0356\5\u00aeX\2\u0355\u0353\3\2\2\2"+
		"\u0356\u0359\3\2\2\2\u0357\u0355\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u035b"+
		"\3\2\2\2\u0359\u0357\3\2\2\2\u035a\u0351\3\2\2\2\u035a\u035b\3\2\2\2\u035b"+
		"[\3\2\2\2\u035c\u035d\5\u00a6T\2\u035d]\3\2\2\2\u035e\u0361\7\u013c\2"+
		"\2\u035f\u0361\5\u0096L\2\u0360\u035e\3\2\2\2\u0360\u035f\3\2\2\2\u0361"+
		"_\3\2\2\2\u0362\u0364\7~\2\2\u0363\u0365\7\u0140\2\2\u0364\u0363\3\2\2"+
		"\2\u0364\u0365\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0367\5P)\2\u0367\u0368"+
		"\5\u0186\u00c4\2\u0368a\3\2\2\2\u0369\u0373\t\t\2\2\u036a\u036f\5d\63"+
		"\2\u036b\u036c\7\u00ce\2\2\u036c\u036e\5d\63\2\u036d\u036b\3\2\2\2\u036e"+
		"\u0371\3\2\2\2\u036f\u036d\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0373\3\2"+
		"\2\2\u0371\u036f\3\2\2\2\u0372\u0369\3\2\2\2\u0372\u036a\3\2\2\2\u0373"+
		"c\3\2\2\2\u0374\u0379\5f\64\2\u0375\u0376\7\n\2\2\u0376\u0378\5f\64\2"+
		"\u0377\u0375\3\2\2\2\u0378\u037b\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a"+
		"\3\2\2\2\u037ae\3\2\2\2\u037b\u0379\3\2\2\2\u037c\u03bc\3\2\2\2\u037d"+
		"\u037f\5n8\2\u037e\u0380\7\u00c1\2\2\u037f\u037e\3\2\2\2\u037f\u0380\3"+
		"\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\7\u00a2\2\2\u0382\u0383\3\2\2\2"+
		"\u0383\u0385\5n8\2\u0384\u0386\7\u00c1\2\2\u0385\u0384\3\2\2\2\u0385\u0386"+
		"\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0388\7\u00a2\2\2\u0388\u038b\5n8\2"+
		"\u0389\u038a\7\u0158\2\2\u038a\u038c\7\u0159\2\2\u038b\u0389\3\2\2\2\u038b"+
		"\u038c\3\2\2\2\u038c\u03bc\3\2\2\2\u038d\u038f\5n8\2\u038e\u0390\7\u00c1"+
		"\2\2\u038f\u038e\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0391\3\2\2\2\u0391"+
		"\u0392\7\27\2\2\u0392\u0393\3\2\2\2\u0393\u0395\5n8\2\u0394\u0396\7\u00c1"+
		"\2\2\u0395\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\3\2\2\2\u0397"+
		"\u0398\7\27\2\2\u0398\u0399\5n8\2\u0399\u039a\7\n\2\2\u039a\u039b\5n8"+
		"\2\u039b\u03bc\3\2\2\2\u039c\u039d\5n8\2\u039d\u039f\7\u0098\2\2\u039e"+
		"\u03a0\7\u00c1\2\2\u039f\u039e\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a1"+
		"\3\2\2\2\u03a1\u03a2\7\u00c5\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a4\5n8\2"+
		"\u03a4\u03a6\7\u0098\2\2\u03a5\u03a7\7\u00c1\2\2\u03a6\u03a5\3\2\2\2\u03a6"+
		"\u03a7\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9\7\u00c5\2\2\u03a9\u03bc"+
		"\3\2\2\2\u03aa\u03ab\5h\65\2\u03ab\u03ac\5h\65\2\u03ac\u03bc\3\2\2\2\u03ad"+
		"\u03ae\7\u00c1\2\2\u03ae\u03af\5b\62\2\u03af\u03b0\3\2\2\2\u03b0\u03b1"+
		"\7\u00c1\2\2\u03b1\u03b2\5b\62\2\u03b2\u03bc\3\2\2\2\u03b3\u03b4\7\u0147"+
		"\2\2\u03b4\u03b5\5b\62\2\u03b5\u03b6\7\u0148\2\2\u03b6\u03bc\3\2\2\2\u03b7"+
		"\u03b8\5n8\2\u03b8\u03b9\5\u008eH\2\u03b9\u03ba\5n8\2\u03ba\u03bc\3\2"+
		"\2\2\u03bb\u037c\3\2\2\2\u03bb\u037d\3\2\2\2\u03bb\u038d\3\2\2\2\u03bb"+
		"\u039c\3\2\2\2\u03bb\u03aa\3\2\2\2\u03bb\u03ad\3\2\2\2\u03bb\u03b3\3\2"+
		"\2\2\u03bb\u03b7\3\2\2\2\u03bcg\3\2\2\2\u03bd\u03be\5n8\2\u03be\u03c0"+
		"\5\u008eH\2\u03bf\u03c1\t\n\2\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2"+
		"\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\5l\67\2\u03c3\u03c4\3\2\2\2\u03c4\u03c5"+
		"\5n8\2\u03c5\u03c7\5\u008eH\2\u03c6\u03c8\t\n\2\2\u03c7\u03c6\3\2\2\2"+
		"\u03c7\u03c8\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03ca\5l\67\2\u03ca\u03d9"+
		"\3\2\2\2\u03cb\u03cd\7\u00c1\2\2\u03cc\u03cb\3\2\2\2\u03cc\u03cd\3\2\2"+
		"\2\u03cd\u03ce\3\2\2\2\u03ce\u03cf\7b\2\2\u03cf\u03d0\5l\67\2\u03d0\u03d2"+
		"\3\2\2\2\u03d1\u03d3\7\u00c1\2\2\u03d2\u03d1\3\2\2\2\u03d2\u03d3\3\2\2"+
		"\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5\7b\2\2\u03d5\u03d6\5l\67\2\u03d6\u03d9"+
		"\3\2\2\2\u03d7\u03d9\5l\67\2\u03d8\u03bd\3\2\2\2\u03d8\u03cc\3\2\2\2\u03d8"+
		"\u03d7\3\2\2\2\u03d9i\3\2\2\2\u03da\u03db\5n8\2\u03db\u03dc\5n8\2\u03dc"+
		"\u03df\3\2\2\2\u03dd\u03df\5l\67\2\u03de\u03da\3\2\2\2\u03de\u03dd\3\2"+
		"\2\2\u03dfk\3\2\2\2\u03e0\u03e1\7\u0147\2\2\u03e1\u03e2\5\u0140\u00a1"+
		"\2\u03e2\u03e3\7\u0148\2\2\u03e3m\3\2\2\2\u03e4\u03e9\5r:\2\u03e5\u03e6"+
		"\t\13\2\2\u03e6\u03e8\5r:\2\u03e7\u03e5\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9"+
		"\u03e7\3\2\2\2\u03e9\u03ea\3\2\2\2\u03eao\3\2\2\2\u03eb\u03e9\3\2\2\2"+
		"\u03ec\u03ee\7\f\2\2\u03ed\u03ec\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03ef"+
		"\3\2\2\2\u03ef\u03f0\5\4\3\2\u03f0q\3\2\2\2\u03f1\u03fa\5v<\2\u03f2\u03f6"+
		"\5t;\2\u03f3\u03f6\7\u015a\2\2\u03f4\u03f6\7\u013d\2\2\u03f5\u03f2\3\2"+
		"\2\2\u03f5\u03f3\3\2\2\2\u03f5\u03f4\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7"+
		"\u03f9\5v<\2\u03f8\u03f5\3\2\2\2\u03f9\u03fc\3\2\2\2\u03fa\u03f8\3\2\2"+
		"\2\u03fa\u03fb\3\2\2\2\u03fbs\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fd\u03fe"+
		"\7\u013c\2\2\u03feu\3\2\2\2\u03ff\u0404\5x=\2\u0400\u0401\7\u014d\2\2"+
		"\u0401\u0403\5x=\2\u0402\u0400\3\2\2\2\u0403\u0406\3\2\2\2\u0404\u0402"+
		"\3\2\2\2\u0404\u0405\3\2\2\2\u0405w\3\2\2\2\u0406\u0404\3\2\2\2\u0407"+
		"\u040a\5~@\2\u0408\u0409\7\u0120\2\2\u0409\u040b\5\60\31\2\u040a\u0408"+
		"\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040f\5~@\2\u040d"+
		"\u040e\7\u0120\2\2\u040e\u0410\5\60\31\2\u040f\u040d\3\2\2\2\u040f\u0410"+
		"\3\2\2\2\u0410\u0465\3\2\2\2\u0411\u0414\5|?\2\u0412\u0413\7\u0120\2\2"+
		"\u0413\u0415\5\60\31\2\u0414\u0412\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0416"+
		"\3\2\2\2\u0416\u0419\5|?\2\u0417\u0418\7\u0120\2\2\u0418\u041a\5\60\31"+
		"\2\u0419\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u0465\3\2\2\2\u041b\u041c"+
		"\5\u0088E\2\u041c\u041e\7\u0147\2\2\u041d\u041f\t\f\2\2\u041e\u041d\3"+
		"\2\2\2\u041e\u041f\3\2\2\2\u041f\u0428\3\2\2\2\u0420\u0425\5n8\2\u0421"+
		"\u0422\7\u013e\2\2\u0422\u0424\5n8\2\u0423\u0421\3\2\2\2\u0424\u0427\3"+
		"\2\2\2\u0425\u0423\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0429\3\2\2\2\u0427"+
		"\u0425\3\2\2\2\u0428\u0420\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\3\2"+
		"\2\2\u042a\u042b\7\u0148\2\2\u042b\u042c\3\2\2\2\u042c\u042d\5\u0088E"+
		"\2\u042d\u042f\7\u0147\2\2\u042e\u0430\t\f\2\2\u042f\u042e\3\2\2\2\u042f"+
		"\u0430\3\2\2\2\u0430\u0439\3\2\2\2\u0431\u0436\5n8\2\u0432\u0433\7\u013e"+
		"\2\2\u0433\u0435\5n8\2\u0434\u0432\3\2\2\2\u0435\u0438\3\2\2\2\u0436\u0434"+
		"\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u043a\3\2\2\2\u0438\u0436\3\2\2\2\u0439"+
		"\u0431\3\2\2\2\u0439\u043a\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043c\7\u0148"+
		"\2\2\u043c\u0465\3\2\2\2\u043d\u043e\5\u0080A\2\u043e\u043f\7\u0147\2"+
		"\2\u043f\u0444\5n8\2\u0440\u0441\7\u013e\2\2\u0441\u0443\5n8\2\u0442\u0440"+
		"\3\2\2\2\u0443\u0446\3\2\2\2\u0444\u0442\3\2\2\2\u0444\u0445\3\2\2\2\u0445"+
		"\u0447\3\2\2\2\u0446\u0444\3\2\2\2\u0447\u0448\7\u0148\2\2\u0448\u0449"+
		"\3\2\2\2\u0449\u044a\5\u0080A\2\u044a\u044b\7\u0147\2\2\u044b\u0450\5"+
		"n8\2\u044c\u044d\7\u013e\2\2\u044d\u044f\5n8\2\u044e\u044c\3\2\2\2\u044f"+
		"\u0452\3\2\2\2\u0450\u044e\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0453\3\2"+
		"\2\2\u0452\u0450\3\2\2\2\u0453\u0454\7\u0148\2\2\u0454\u0465\3\2\2\2\u0455"+
		"\u0456\t\13\2\2\u0456\u0457\5n8\2\u0457\u0458\3\2\2\2\u0458\u0459\t\13"+
		"\2\2\u0459\u045a\5n8\2\u045a\u0465\3\2\2\2\u045b\u045c\7\u0147\2\2\u045c"+
		"\u045d\5n8\2\u045d\u045e\7\u0148\2\2\u045e\u045f\3\2\2\2\u045f\u0460\7"+
		"\u0147\2\2\u0460\u0461\5n8\2\u0461\u0462\7\u0148\2\2\u0462\u0465\3\2\2"+
		"\2\u0463\u0465\5z>\2\u0464\u0407\3\2\2\2\u0464\u0411\3\2\2\2\u0464\u041b"+
		"\3\2\2\2\u0464\u043d\3\2\2\2\u0464\u0455\3\2\2\2\u0464\u045b\3\2\2\2\u0464"+
		"\u0463\3\2\2\2\u0465y\3\2\2\2\u0466\u0467\7\u0147\2\2\u0467\u046a\5n8"+
		"\2\u0468\u0469\7\u013e\2\2\u0469\u046b\5n8\2\u046a\u0468\3\2\2\2\u046b"+
		"\u046c\3\2\2\2\u046c\u046a\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046e\3\2"+
		"\2\2\u046e\u046f\7\u0148\2\2\u046f{\3\2\2\2\u0470\u0476\5\u00a8U\2\u0471"+
		"\u0476\5J&\2\u0472\u0476\7\u00c5\2\2\u0473\u0476\7g\2\2\u0474\u0476\7"+
		"\u011a\2\2\u0475\u0470\3\2\2\2\u0475\u0471\3\2\2\2\u0475\u0472\3\2\2\2"+
		"\u0475\u0473\3\2\2\2\u0475\u0474\3\2\2\2\u0476}\3\2\2\2\u0477\u0478\5"+
		"\u0142\u00a2\2\u0478\u0479\5\u0142\u00a2\2\u0479\177\3\2\2\2\u047a\u047f"+
		"\5\u0084C\2\u047b\u047f\5\u0086D\2\u047c\u047f\5\u0082B\2\u047d\u047f"+
		"\5\u008aF\2\u047e\u047a\3\2\2\2\u047e\u047b\3\2\2\2\u047e\u047c\3\2\2"+
		"\2\u047e\u047d\3\2\2\2\u047f\u0081\3\2\2\2\u0480\u0481\t\r\2\2\u0481\u0083"+
		"\3\2\2\2\u0482\u0483\7\u00b5\2\2\u0483\u0085\3\2\2\2\u0484\u0485\7\u00a0"+
		"\2\2\u0485\u0087\3\2\2\2\u0486\u0487\t\16\2\2\u0487\u0089\3\2\2\2\u0488"+
		"\u048b\t\17\2\2\u0489\u048b\5\u0190\u00c9\2\u048a\u0488\3\2\2\2\u048a"+
		"\u0489\3\2\2\2\u048b\u008b\3\2\2\2\u048c\u048d\7\u0124\2\2\u048d\u008d"+
		"\3\2\2\2\u048e\u049a\7\u0141\2\2\u048f\u049a\7\u0142\2\2\u0490\u049a\7"+
		"\u0144\2\2\u0491\u049a\7\u0143\2\2\u0492\u049a\7\u0145\2\2\u0493\u049a"+
		"\7\u0146\2\2\u0494\u049a\7\u00a2\2\2\u0495\u0497\7\u00c1\2\2\u0496\u0495"+
		"\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0498\3\2\2\2\u0498\u049a\7\u00ac\2"+
		"\2\u0499\u048e\3\2\2\2\u0499\u048f\3\2\2\2\u0499\u0490\3\2\2\2\u0499\u0491"+
		"\3\2\2\2\u0499\u0492\3\2\2\2\u0499\u0493\3\2\2\2\u0499\u0494\3\2\2\2\u0499"+
		"\u0496\3\2\2\2\u049a\u008f\3\2\2\2\u049b\u04a7\7\u011a\2\2\u049c\u04a7"+
		"\7g\2\2\u049d\u04a3\5\u0092J\2\u049e\u049f\5\u008eH\2\u049f\u04a0\5\u0092"+
		"J\2\u04a0\u04a2\3\2\2\2\u04a1\u049e\3\2\2\2\u04a2\u04a5\3\2\2\2\u04a3"+
		"\u04a1\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04a7\3\2\2\2\u04a5\u04a3\3\2"+
		"\2\2\u04a6\u049b\3\2\2\2\u04a6\u049c\3\2\2\2\u04a6\u049d\3\2\2\2\u04a7"+
		"\u0091\3\2\2\2\u04a8\u04ad\5\u0094K\2\u04a9\u04aa\7\u00ce\2\2\u04aa\u04ac"+
		"\5\u0094K\2\u04ab\u04a9\3\2\2\2\u04ac\u04af\3\2\2\2\u04ad\u04ab\3\2\2"+
		"\2\u04ad\u04ae\3\2\2\2\u04ae\u0093\3\2\2\2\u04af\u04ad\3\2\2\2\u04b0\u04b5"+
		"\5\u0098M\2\u04b1\u04b2\7\n\2\2\u04b2\u04b4\5\u0098M\2\u04b3\u04b1\3\2"+
		"\2\2\u04b4\u04b7\3\2\2\2\u04b5\u04b3\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6"+
		"\u0095\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b8\u04be\5\u009aN\2\u04b9\u04bd"+
		"\7*\2\2\u04ba\u04bb\7\u0125\2\2\u04bb\u04bd\5J&\2\u04bc\u04b9\3\2\2\2"+
		"\u04bc\u04ba\3\2\2\2\u04bd\u04c0\3\2\2\2\u04be\u04bc\3\2\2\2\u04be\u04bf"+
		"\3\2\2\2\u04bf\u0097\3\2\2\2\u04c0\u04be\3\2\2\2\u04c1\u04d0\3\2\2\2\u04c2"+
		"\u04c3\7\u00c1\2\2\u04c3\u04c4\5\u0090I\2\u04c4\u04c5\3\2\2\2\u04c5\u04c6"+
		"\7\u00c1\2\2\u04c6\u04c7\5\u0090I\2\u04c7\u04d0\3\2\2\2\u04c8\u04c9\7"+
		"\u0147\2\2\u04c9\u04ca\5\u0090I\2\u04ca\u04cb\7\u0148\2\2\u04cb\u04d0"+
		"\3\2\2\2\u04cc\u04cd\5\u009aN\2\u04cd\u04ce\5\u009aN\2\u04ce\u04d0\3\2"+
		"\2\2\u04cf\u04c1\3\2\2\2\u04cf\u04c2\3\2\2\2\u04cf\u04c8\3\2\2\2\u04cf"+
		"\u04cc\3\2\2\2\u04d0\u0099\3\2\2\2\u04d1\u04d3\5\u018e\u00c8\2\u04d2\u04d1"+
		"\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04da\5\u009eP"+
		"\2\u04d5\u04d6\5\u009cO\2\u04d6\u04d7\5\u009eP\2\u04d7\u04d9\3\2\2\2\u04d8"+
		"\u04d5\3\2\2\2\u04d9\u04dc\3\2\2\2\u04da\u04d8\3\2\2\2\u04da\u04db\3\2"+
		"\2\2\u04db\u009b\3\2\2\2\u04dc\u04da\3\2\2\2\u04dd\u04de\t\13\2\2\u04de"+
		"\u009d\3\2\2\2\u04df\u04e5\5\u00a2R\2\u04e0\u04e1\5\u00a0Q\2\u04e1\u04e2"+
		"\5\u00a2R\2\u04e2\u04e4\3\2\2\2\u04e3\u04e0\3\2\2\2\u04e4\u04e7\3\2\2"+
		"\2\u04e5\u04e3\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u009f\3\2\2\2\u04e7\u04e5"+
		"\3\2\2\2\u04e8\u04e9\t\20\2\2\u04e9\u00a1\3\2\2\2\u04ea\u04ec\7\u0080"+
		"\2\2\u04eb\u04ea\3\2\2\2\u04eb\u04ec\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed"+
		"\u04f7\5\u00a4S\2\u04ee\u04f7\5\u00aeX\2\u04ef\u04f7\5\u00aaV\2\u04f0"+
		"\u04f1\7\u0147\2\2\u04f1\u04f2\5\u0096L\2\u04f2\u04f3\7\u0148\2\2\u04f3"+
		"\u04f7\3\2\2\2\u04f4\u04f5\7\u00c1\2\2\u04f5\u04f7\5\u00a2R\2\u04f6\u04eb"+
		"\3\2\2\2\u04f6\u04ee\3\2\2\2\u04f6\u04ef\3\2\2\2\u04f6\u04f0\3\2\2\2\u04f6"+
		"\u04f4\3\2\2\2\u04f7\u04fa\3\2\2\2\u04f8\u04f9\7\u0120\2\2\u04f9\u04fb"+
		"\5\60\31\2\u04fa\u04f8\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u00a3\3\2\2\2"+
		"\u04fc\u0509\5\u00a6T\2\u04fd\u0506\7\u0147\2\2\u04fe\u0503\5^\60\2\u04ff"+
		"\u0500\7\u013e\2\2\u0500\u0502\5^\60\2\u0501\u04ff\3\2\2\2\u0502\u0505"+
		"\3\2\2\2\u0503\u0501\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0507\3\2\2\2\u0505"+
		"\u0503\3\2\2\2\u0506\u04fe\3\2\2\2\u0506\u0507\3\2\2\2\u0507\u0508\3\2"+
		"\2\2\u0508\u050a\7\u0148\2\2\u0509\u04fd\3\2\2\2\u0509\u050a\3\2\2\2\u050a"+
		"\u00a5\3\2\2\2\u050b\u050e\t\21\2\2\u050c\u050e\5\u0190\u00c9\2\u050d"+
		"\u050b\3\2\2\2\u050d\u050c\3\2\2\2\u050e\u00a7\3\2\2\2\u050f\u0514\5\u0188"+
		"\u00c5\2\u0510\u0514\5J&\2\u0511\u0514\5\u0190\u00c9\2\u0512\u0514\7\u00c5"+
		"\2\2\u0513\u050f\3\2\2\2\u0513\u0510\3\2\2\2\u0513\u0511\3\2\2\2\u0513"+
		"\u0512\3\2\2\2\u0514\u00a9\3\2\2\2\u0515\u051c\5\u00acW\2\u0516\u051c"+
		"\5\u0190\u00c9\2\u0517\u0518\5\u018e\u00c8\2\u0518\u0519\5\4\3\2\u0519"+
		"\u051c\3\2\2\2\u051a\u051c\5J&\2\u051b\u0515\3\2\2\2\u051b\u0516\3\2\2"+
		"\2\u051b\u0517\3\2\2\2\u051b\u051a\3\2\2\2\u051c\u00ab\3\2\2\2\u051d\u0522"+
		"\5\u0188\u00c5\2\u051e\u051f\5\u018e\u00c8\2\u051f\u0520\5\u0188\u00c5"+
		"\2\u0520\u0522\3\2\2\2\u0521\u051d\3\2\2\2\u0521\u051e\3\2\2\2\u0522\u00ad"+
		"\3\2\2\2\u0523\u0526\5\u00b0Y\2\u0524\u0526\5\u00b6\\\2\u0525\u0523\3"+
		"\2\2\2\u0525\u0524\3\2\2\2\u0526\u00af\3\2\2\2\u0527\u0528\5\u00b2Z\2"+
		"\u0528\u00b1\3\2\2\2\u0529\u052a\5\u0190\u00c9\2\u052a\u00b3\3\2\2\2\u052b"+
		"\u052c\7\u0149\2\2\u052c\u0531\5\u0096L\2\u052d\u052e\7\u013e\2\2\u052e"+
		"\u0530\5\u0096L\2\u052f\u052d\3\2\2\2\u0530\u0533\3\2\2\2\u0531\u052f"+
		"\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0534\3\2\2\2\u0533\u0531\3\2\2\2\u0534"+
		"\u0535\7\u014a\2\2\u0535\u00b5\3\2\2\2\u0536\u0538\5\u00b8]\2\u0537\u0539"+
		"\5\u00b4[\2\u0538\u0537\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u0542\3\2\2"+
		"\2\u053a\u053b\7\u014b\2\2\u053b\u0543\7\u013c\2\2\u053c\u053d\7\u014b"+
		"\2\2\u053d\u0540\5\u00b6\\\2\u053e\u053f\t\22\2\2\u053f\u0541\5\u00b6"+
		"\\\2\u0540\u053e\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0543\3\2\2\2\u0542"+
		"\u053a\3\2\2\2\u0542\u053c\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u00b7\3\2"+
		"\2\2\u0544\u0545\5\u0190\u00c9\2\u0545\u00b9\3\2\2\2\u0546\u0547\5\u0190"+
		"\u00c9\2\u0547\u00bb\3\2\2\2\u0548\u054b\5\u00be`\2\u0549\u054b\5\u00c2"+
		"b\2\u054a\u0548\3\2\2\2\u054a\u0549\3\2\2\2\u054b\u00bd\3\2\2\2\u054c"+
		"\u054f\5\u00c0a\2\u054d\u054f\5\u00d6l\2\u054e\u054c\3\2\2\2\u054e\u054d"+
		"\3\2\2\2\u054f\u00bf\3\2\2\2\u0550\u0551\7\u0087\2\2\u0551\u0552\5\u0090"+
		"I\2\u0552\u0554\7\u0112\2\2\u0553\u0555\5N(\2\u0554\u0553\3\2\2\2\u0554"+
		"\u0555\3\2\2\2\u0555\u055a\3\2\2\2\u0556\u0558\7Y\2\2\u0557\u0559\5N("+
		"\2\u0558\u0557\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055b\3\2\2\2\u055a\u0556"+
		"\3\2\2\2\u055a\u055b\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055d\7Z\2\2\u055d"+
		"\u055e\7\u0087\2\2\u055e\u00c1\3\2\2\2\u055f\u0563\5\u00c4c\2\u0560\u0563"+
		"\5\u00d0i\2\u0561\u0563\5\u00c6d\2\u0562\u055f\3\2\2\2\u0562\u0560\3\2"+
		"\2\2\u0562\u0561\3\2\2\2\u0563\u00c3\3\2\2\2\u0564\u0565\7\u0131\2\2\u0565"+
		"\u0567\5\u0090I\2\u0566\u0568\5N(\2\u0567\u0566\3\2\2\2\u0567\u0568\3"+
		"\2\2\2\u0568\u0569\3\2\2\2\u0569\u056a\7Z\2\2\u056a\u056b\7\u0131\2\2"+
		"\u056b\u00c5\3\2\2\2\u056c\u056d\7q\2\2\u056d\u056e\5\u00caf\2\u056e\u056f"+
		"\7\u0141\2\2\u056f\u0572\5\u00c8e\2\u0570\u0571\7\u015b\2\2\u0571\u0573"+
		"\5\u00acW\2\u0572\u0570\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u0574\3\2\2"+
		"\2\u0574\u0576\5\u0186\u00c4\2\u0575\u0577\5N(\2\u0576\u0575\3\2\2\2\u0576"+
		"\u0577\3\2\2\2\u0577\u0578\3\2\2\2\u0578\u0579\7Z\2\2\u0579\u057a\7q\2"+
		"\2\u057a\u057b\5\u0186\u00c4\2\u057b\u00c7\3\2\2\2\u057c\u057d\5\u00cc"+
		"g\2\u057d\u057e\7\u0116\2\2\u057e\u057f\5\u00ceh\2\u057f\u00c9\3\2\2\2"+
		"\u0580\u0581\5\4\3\2\u0581\u00cb\3\2\2\2\u0582\u0583\5\u0096L\2\u0583"+
		"\u00cd\3\2\2\2\u0584\u0585\5\u0096L\2\u0585\u00cf\3\2\2\2\u0586\u0587"+
		"\7u\2\2\u0587\u058a\5\4\3\2\u0588\u0589\7\u0125\2\2\u0589\u058b\5\u00d2"+
		"j\2\u058a\u0588\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058e\3\2\2\2\u058c"+
		"\u058d\7\u0091\2\2\u058d\u058f\5\u00d2j\2\u058e\u058c\3\2\2\2\u058e\u058f"+
		"\3\2\2\2\u058f\u0592\3\2\2\2\u0590\u0591\7\u0133\2\2\u0591\u0593\7\u00e9"+
		"\2\2\u0592\u0590\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0594\3\2\2\2\u0594"+
		"\u0596\5\u0186\u00c4\2\u0595\u0597\5N(\2\u0596\u0595\3\2\2\2\u0596\u0597"+
		"\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\7Z\2\2\u0599\u059a\7u\2\2\u059a"+
		"\u059b\5\u0186\u00c4\2\u059b\u00d1\3\2\2\2\u059c\u05a1\5\u00aeX\2\u059d"+
		"\u059e\7\u013e\2\2\u059e\u05a0\5\u00aeX\2\u059f\u059d\3\2\2\2\u05a0\u05a3"+
		"\3\2\2\2\u05a1\u059f\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u00d3\3\2\2\2\u05a3"+
		"\u05a1\3\2\2\2\u05a4\u05a9\5\u0096L\2\u05a5\u05a6\7\u013e\2\2\u05a6\u05a8"+
		"\5\u0096L\2\u05a7\u05a5\3\2\2\2\u05a8\u05ab\3\2\2\2\u05a9\u05a7\3\2\2"+
		"\2\u05a9\u05aa\3\2\2\2\u05aa\u00d5\3\2\2\2\u05ab\u05a9\3\2\2\2\u05ac\u05ad"+
		"\7$\2\2\u05ad\u05b5\5\u0096L\2\u05ae\u05af\7\u012e\2\2\u05af\u05b1\5\u0096"+
		"L\2\u05b0\u05b2\5N(\2\u05b1\u05b0\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b4"+
		"\3\2\2\2\u05b3\u05ae\3\2\2\2\u05b4\u05b7\3\2\2\2\u05b5\u05b3\3\2\2\2\u05b5"+
		"\u05b6\3\2\2\2\u05b6\u05bc\3\2\2\2\u05b7\u05b5\3\2\2\2\u05b8\u05ba\7\u00d3"+
		"\2\2\u05b9\u05bb\5N(\2\u05ba\u05b9\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bd"+
		"\3\2\2\2\u05bc\u05b8\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05be\3\2\2\2\u05be"+
		"\u05bf\7Z\2\2\u05bf\u05c0\7$\2\2\u05c0\u05d2\3\2\2\2\u05c1\u05c8\7$\2"+
		"\2\u05c2\u05c3\7\u012e\2\2\u05c3\u05c4\5\u0090I\2\u05c4\u05c5\5N(\2\u05c5"+
		"\u05c7\3\2\2\2\u05c6\u05c2\3\2\2\2\u05c7\u05ca\3\2\2\2\u05c8\u05c6\3\2"+
		"\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05cd\3\2\2\2\u05ca\u05c8\3\2\2\2\u05cb"+
		"\u05cc\7\u00d3\2\2\u05cc\u05ce\5N(\2\u05cd\u05cb\3\2\2\2\u05cd\u05ce\3"+
		"\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d0\7Z\2\2\u05d0\u05d2\7$\2\2\u05d1"+
		"\u05ac\3\2\2\2\u05d1\u05c1\3\2\2\2\u05d2\u00d7\3\2\2\2\u05d3\u05d8\5\u00da"+
		"n\2\u05d4\u05d8\5\u00e2r\2\u05d5\u05d8\5\u00e8u\2\u05d6\u05d8\5\u012c"+
		"\u0097\2\u05d7\u05d3\3\2\2\2\u05d7\u05d4\3\2\2\2\u05d7\u05d5\3\2\2\2\u05d7"+
		"\u05d6\3\2\2\2\u05d8\u00d9\3\2\2\2\u05d9\u05e1\5V,\2\u05da\u05e1\5`\61"+
		"\2\u05db\u05dc\7\u00ff\2\2\u05dc\u05e1\5\u0096L\2\u05dd\u05e1\5\u00de"+
		"p\2\u05de\u05e1\5\u00e0q\2\u05df\u05e1\5\16\b\2\u05e0\u05d9\3\2\2\2\u05e0"+
		"\u05da\3\2\2\2\u05e0\u05db\3\2\2\2\u05e0\u05dd\3\2\2\2\u05e0\u05de\3\2"+
		"\2\2\u05e0\u05df\3\2\2\2\u05e1\u00db\3\2\2\2\u05e2\u05e3\t\23\2\2\u05e3"+
		"\u00dd\3\2\2\2\u05e4\u05e5\7a\2\2\u05e5\u05f0\5\u00dco\2\u05e6\u05e7\7"+
		"a\2\2\u05e7\u05ed\7\u00de\2\2\u05e8\u05e9\7\u0147\2\2\u05e9\u05ea\5\u0096"+
		"L\2\u05ea\u05eb\7\u0148\2\2\u05eb\u05ee\3\2\2\2\u05ec\u05ee\5\u0096L\2"+
		"\u05ed\u05e8\3\2\2\2\u05ed\u05ec\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05f0"+
		"\3\2\2\2\u05ef\u05e4\3\2\2\2\u05ef\u05e6\3\2\2\2\u05f0\u00df\3\2\2\2\u05f1"+
		"\u05f2\7\67\2\2\u05f2\u05f3\5\u00dco\2\u05f3\u05f4\5\u0186\u00c4\2\u05f4"+
		"\u00e1\3\2\2\2\u05f5\u05f6\7\7\2\2\u05f6\u05f7\7\24\2\2\u05f7\u05f8\5"+
		"\4\3\2\u05f8\u05f9\5D#\2\u05f9\u063f\3\2\2\2\u05fa\u05fb\7\u00a7\2\2\u05fb"+
		"\u05fc\5\u00d2j\2\u05fc\u0603\7\u0088\2\2\u05fd\u0604\7\u015c\2\2\u05fe"+
		"\u0601\7k\2\2\u05ff\u0602\5\u00aeX\2\u0600\u0602\5J&\2\u0601\u05ff\3\2"+
		"\2\2\u0601\u0600\3\2\2\2\u0601\u0602\3\2\2\2\u0602\u0604\3\2\2\2\u0603"+
		"\u05fd\3\2\2\2\u0603\u05fe\3\2\2\2\u0604\u063f\3\2\2\2\u0605\u0606\7C"+
		"\2\2\u0606\u0607\7\24\2\2\u0607\u063f\5\4\3\2\u0608\u0609\7\u00ed\2\2"+
		"\u0609\u060a\7\24\2\2\u060a\u060b\5\4\3\2\u060b\u060c\5D#\2\u060c\u063f"+
		"\3\2\2\2\u060d\u060e\7x\2\2\u060e\u0613\5\u00aeX\2\u060f\u0610\7\u013e"+
		"\2\2\u0610\u0612\5\u00aeX\2\u0611\u060f\3\2\2\2\u0612\u0615\3\2\2\2\u0613"+
		"\u0611\3\2\2\2\u0613\u0614\3\2\2\2\u0614\u063f\3\2\2\2\u0615\u0613\3\2"+
		"\2\2\u0616\u0617\7\u008d\2\2\u0617\u061c\5\u00aeX\2\u0618\u0619\7\u013e"+
		"\2\2\u0619\u061b\5\u00aeX\2\u061a\u0618\3\2\2\2\u061b\u061e\3\2\2\2\u061c"+
		"\u061a\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u062a\3\2\2\2\u061e\u061c\3\2"+
		"\2\2\u061f\u0620\7\u0116\2\2\u0620\u062b\7\u00c5\2\2\u0621\u0622\7\u00a2"+
		"\2\2\u0622\u0627\5\u0096L\2\u0623\u0624\7\u013e\2\2\u0624\u0626\5\u0096"+
		"L\2\u0625\u0623\3\2\2\2\u0626\u0629\3\2\2\2\u0627\u0625\3\2\2\2\u0627"+
		"\u0628\3\2\2\2\u0628\u062b\3\2\2\2\u0629\u0627\3\2\2\2\u062a\u061f\3\2"+
		"\2\2\u062a\u0621\3\2\2\2\u062b\u063f\3\2\2\2\u062c\u062d\7\u0126\2\2\u062d"+
		"\u0632\5\u00aeX\2\u062e\u062f\7\u013e\2\2\u062f\u0631\5\u00aeX\2\u0630"+
		"\u062e\3\2\2\2\u0631\u0634\3\2\2\2\u0632\u0630\3\2\2\2\u0632\u0633\3\2"+
		"\2\2\u0633\u0635\3\2\2\2\u0634\u0632\3\2\2\2\u0635\u0636\7\u00a2\2\2\u0636"+
		"\u063b\5\u0096L\2\u0637\u0638\7\u013e\2\2\u0638\u063a\5\u0096L\2\u0639"+
		"\u0637\3\2\2\2\u063a\u063d\3\2\2\2\u063b\u0639\3\2\2\2\u063b\u063c\3\2"+
		"\2\2\u063c\u063f\3\2\2\2\u063d\u063b\3\2\2\2\u063e\u05f5\3\2\2\2\u063e"+
		"\u05fa\3\2\2\2\u063e\u0605\3\2\2\2\u063e\u0608\3\2\2\2\u063e\u060d\3\2"+
		"\2\2\u063e\u0616\3\2\2\2\u063e\u062c\3\2\2\2\u063f\u00e3\3\2\2\2\u0640"+
		"\u0641\7-\2\2\u0641\u0654\5\u0096L\2\u0642\u0654\t\24\2\2\u0643\u0644"+
		"\7!\2\2\u0644\u0654\5\u00aeX\2\u0645\u0646\7\u0111\2\2\u0646\u0654\5\u00ae"+
		"X\2\u0647\u0649\5\u0096L\2\u0648\u064a\t\25\2\2\u0649\u0648\3\2\2\2\u0649"+
		"\u064a\3\2\2\2\u064a\u0651\3\2\2\2\u064b\u064f\7\u0136\2\2\u064c\u064d"+
		"\7\u00f1\2\2\u064d\u064e\7\u00b0\2\2\u064e\u0650\5\u00acW\2\u064f\u064c"+
		"\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0652\3\2\2\2\u0651\u064b\3\2\2\2\u0651"+
		"\u0652\3\2\2\2\u0652\u0654\3\2\2\2\u0653\u0640\3\2\2\2\u0653\u0642\3\2"+
		"\2\2\u0653\u0643\3\2\2\2\u0653\u0645\3\2\2\2\u0653\u0647\3\2\2\2\u0654"+
		"\u00e5\3\2\2\2\u0655\u065a\5\u00e4s\2\u0656\u0657\7\u013e\2\2\u0657\u0659"+
		"\5\u00e4s\2\u0658\u0656\3\2\2\2\u0659\u065c\3\2\2\2\u065a\u0658\3\2\2"+
		"\2\u065a\u065b\3\2\2\2\u065b\u00e7\3\2\2\2\u065c\u065a\3\2\2\2\u065d\u065e"+
		"\7\u0107\2\2\u065e\u065f\7\u00ec\2\2\u065f\u0667\5\u0190\u00c9\2\u0660"+
		"\u0665\7\u0116\2\2\u0661\u0666\5\u0096L\2\u0662\u0663\7\u00d8\2\2\u0663"+
		"\u0666\5\u0096L\2\u0664\u0666\7\u00dd\2\2\u0665\u0661\3\2\2\2\u0665\u0662"+
		"\3\2\2\2\u0665\u0664\3\2\2\2\u0666\u0668\3\2\2\2\u0667\u0660\3\2\2\2\u0667"+
		"\u0668\3\2\2\2\u0668\u0682\3\2\2\2\u0669\u067f\7\u0133\2\2\u066a\u066b"+
		"\7\u009f\2\2\u066b\u066c\7\u00b0\2\2\u066c\u067e\5\u00acW\2\u066d\u066e"+
		"\7\u00f1\2\2\u066e\u066f\7\u00b0\2\2\u066f\u067e\5\u00acW\2\u0670\u0671"+
		"\7\u0118\2\2\u0671\u0672\7\u00b0\2\2\u0672\u067e\5\u00acW\2\u0673\u0674"+
		"\7\36\2\2\u0674\u0675\7\u00b0\2\2\u0675\u067e\5\u00acW\2\u0676\u0677\7"+
		"\u00d4\2\2\u0677\u0678\7\u00a0\2\2\u0678\u067e\5\u00acW\2\u0679\u067a"+
		"\7\u0118\2\2\u067a\u067b\7\u00c8\2\2\u067b\u067c\7\u00d4\2\2\u067c\u067e"+
		"\5J&\2\u067d\u066a\3\2\2\2\u067d\u066d\3\2\2\2\u067d\u0670\3\2\2\2\u067d"+
		"\u0673\3\2\2\2\u067d\u0676\3\2\2\2\u067d\u0679\3\2\2\2\u067e\u0681\3\2"+
		"\2\2\u067f\u067d\3\2\2\2\u067f\u0680\3\2\2\2\u0680\u0683\3\2\2\2\u0681"+
		"\u067f\3\2\2\2\u0682\u0669\3\2\2\2\u0682\u0683\3\2\2\2\u0683\u06b9\3\2"+
		"\2\2\u0684\u0685\7\u010f\2\2\u0685\u0686\7\u00ec\2\2\u0686\u06b9\5\u0190"+
		"\u00c9\2\u0687\u0688\7l\2\2\u0688\u0689\7\u00ec\2\2\u0689\u06b9\5\u0190"+
		"\u00c9\2\u068a\u068c\7\u00d6\2\2\u068b\u068d\5J&\2\u068c\u068b\3\2\2\2"+
		"\u068c\u068d\3\2\2\2\u068d\u06b9\3\2\2\2\u068e\u068f\7\u00bc\2\2\u068f"+
		"\u0690\5\u0096L\2\u0690\u0691\7\u00a5\2\2\u0691\u06b9\3\2\2\2\u0692\u069b"+
		"\7\u00dc\2\2\u0693\u0695\5\u00e6t\2\u0694\u0693\3\2\2\2\u0694\u0695\3"+
		"\2\2\2\u0695\u0697\3\2\2\2\u0696\u0698\7\u013f\2\2\u0697\u0696\3\2\2\2"+
		"\u0697\u0698\3\2\2\2\u0698\u069c\3\2\2\2\u0699\u069a\7k\2\2\u069a\u069c"+
		"\5J&\2\u069b\u0694\3\2\2\2\u069b\u0699\3\2\2\2\u069b\u069c\3\2\2\2\u069c"+
		"\u06b9\3\2\2\2\u069d\u06a5\7\u00f9\2\2\u069e\u069f\5\u0096L\2\u069f\u06a0"+
		"\t\26\2\2\u06a0\u06a6\3\2\2\2\u06a1\u06a2\7\u0116\2\2\u06a2\u06a3\7\u0118"+
		"\2\2\u06a3\u06a4\7\u00c8\2\2\u06a4\u06a6\7\u00d4\2\2\u06a5\u069e\3\2\2"+
		"\2\u06a5\u06a1\3\2\2\2\u06a6\u06b9\3\2\2\2\u06a7\u06a8\7\u00d1\2\2\u06a8"+
		"\u06a9\7\u0116\2\2\u06a9\u06aa\7\u00ec\2\2\u06aa\u06ab\5\u0190\u00c9\2"+
		"\u06ab\u06b4\7\u0147\2\2\u06ac\u06b1\5\u0096L\2\u06ad\u06ae\7\u013e\2"+
		"\2\u06ae\u06b0\5\u0096L\2\u06af\u06ad\3\2\2\2\u06b0\u06b3\3\2\2\2\u06b1"+
		"\u06af\3\2\2\2\u06b1\u06b2\3\2\2\2\u06b2\u06b5\3\2\2\2\u06b3\u06b1\3\2"+
		"\2\2\u06b4\u06ac\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b6\3\2\2\2\u06b6"+
		"\u06b7\7\u0148\2\2\u06b7\u06b9\3\2\2\2\u06b8\u065d\3\2\2\2\u06b8\u0684"+
		"\3\2\2\2\u06b8\u0687\3\2\2\2\u06b8\u068a\3\2\2\2\u06b8\u068e\3\2\2\2\u06b8"+
		"\u0692\3\2\2\2\u06b8\u069d\3\2\2\2\u06b8\u06a7\3\2\2\2\u06b9\u00e9\3\2"+
		"\2\2\u06ba\u06bf\5\4\3\2\u06bb\u06bc\7\u0149\2\2\u06bc\u06bd\5\u00acW"+
		"\2\u06bd\u06be\7\u014a\2\2\u06be\u06c0\3\2\2\2\u06bf\u06bb\3\2\2\2\u06bf"+
		"\u06c0\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c2\7\u014b\2\2\u06c2\u06c4"+
		"\3\2\2\2\u06c3\u06ba\3\2\2\2\u06c3\u06c4\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5"+
		"\u06d6\5\4\3\2\u06c6\u06cb\5\4\3\2\u06c7\u06c8\7\u0149\2\2\u06c8\u06c9"+
		"\5\u00acW\2\u06c9\u06ca\7\u014a\2\2\u06ca\u06cc\3\2\2\2\u06cb\u06c7\3"+
		"\2\2\2\u06cb\u06cc\3\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06d3\7\u014b\2\2"+
		"\u06ce\u06d4\7\u013c\2\2\u06cf\u06d1\5\4\3\2\u06d0\u06d2\5\u00ecw\2\u06d1"+
		"\u06d0\3\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d4\3\2\2\2\u06d3\u06ce\3\2"+
		"\2\2\u06d3\u06cf\3\2\2\2\u06d4\u06d6\3\2\2\2\u06d5\u06c3\3\2\2\2\u06d5"+
		"\u06c6\3\2\2\2\u06d6\u00eb\3\2\2\2\u06d7\u06da\t\22\2\2\u06d8\u06d9\7"+
		"\u015d\2\2\u06d9\u06db\7\u014b\2\2\u06da\u06d8\3\2\2\2\u06da\u06db\3\2"+
		"\2\2\u06db\u06dc\3\2\2\2\u06dc\u06dd\5\4\3\2\u06dd\u00ed\3\2\2\2\u06de"+
		"\u06e3\5\u0096L\2\u06df\u06e0\7\u013e\2\2\u06e0\u06e2\5\u0096L\2\u06e1"+
		"\u06df\3\2\2\2\u06e2\u06e5\3\2\2\2\u06e3\u06e1\3\2\2\2\u06e3\u06e4\3\2"+
		"\2\2\u06e4\u00ef\3\2\2\2\u06e5\u06e3\3\2\2\2\u06e6\u06eb\5\u0096L\2\u06e7"+
		"\u06e8\7\u013e\2\2\u06e8\u06ea\5\u0096L\2\u06e9\u06e7\3\2\2\2\u06ea\u06ed"+
		"\3\2\2\2\u06eb\u06e9\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u00f1\3\2\2\2\u06ed"+
		"\u06eb\3\2\2\2\u06ee\u06ef\7\25\2\2\u06ef\u06ff\7\66\2\2\u06f0\u06f1\7"+
		"\4\2\2\u06f1\u06ff\7\66\2\2\u06f2\u06f3\7\25\2\2\u06f3\u06f4\7i\2\2\u06f4"+
		"\u06ff\5\u00eex\2\u06f5\u06f6\7\4\2\2\u06f6\u06f7\7i\2\2\u06f7\u06ff\5"+
		"\u00eex\2\u06f8\u06f9\7\u00ca\2\2\u06f9\u06fa\7\u009c\2\2\u06fa\u06fb"+
		"\7\u0147\2\2\u06fb\u06fc\5\u00f0y\2\u06fc\u06fd\7\u0148\2\2\u06fd\u06ff"+
		"\3\2\2\2\u06fe\u06ee\3\2\2\2\u06fe\u06f0\3\2\2\2\u06fe\u06f2\3\2\2\2\u06fe"+
		"\u06f5\3\2\2\2\u06fe\u06f8\3\2\2\2\u06ff\u00f3\3\2\2\2\u0700\u0701\7\u00bd"+
		"\2\2\u0701\u0705\7i\2\2\u0702\u0706\5\u00eav\2\u0703\u0706\7\u00bd\2\2"+
		"\u0704\u0706\7\u00db\2\2\u0705\u0702\3\2\2\2\u0705\u0703\3\2\2\2\u0705"+
		"\u0704\3\2\2\2\u0706\u0707\3\2\2\2\u0707\u070f\5\u0186\u00c4\2\u0708\u0709"+
		"\7\67\2\2\u0709\u070a\7\66\2\2\u070a\u070f\5\u0186\u00c4\2\u070b\u070c"+
		"\7a\2\2\u070c\u070d\7\66\2\2\u070d\u070f\5\u0186\u00c4\2\u070e\u0700\3"+
		"\2\2\2\u070e\u0708\3\2\2\2\u070e\u070b\3\2\2\2\u070f\u00f5\3\2\2\2\u0710"+
		"\u0711\t\27\2\2\u0711\u00f7\3\2\2\2\u0712\u0714\t\30\2\2\u0713\u0712\3"+
		"\2\2\2\u0713\u0714\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u071a\5\u00f6|\2"+
		"\u0716\u0717\7\u013e\2\2\u0717\u0719\5\u00f6|\2\u0718\u0716\3\2\2\2\u0719"+
		"\u071c\3\2\2\2\u071a\u0718\3\2\2\2\u071a\u071b\3\2\2\2\u071b\u00f9\3\2"+
		"\2\2\u071c\u071a\3\2\2\2\u071d\u071e\t\31\2\2\u071e\u071f\7\u0147\2\2"+
		"\u071f\u0720\5\u00f8}\2\u0720\u0721\7\u0148\2\2\u0721\u00fb\3\2\2\2\u0722"+
		"\u0724\5\u00f2z\2\u0723\u0725\5N(\2\u0724\u0723\3\2\2\2\u0725\u0726\3"+
		"\2\2\2\u0726\u0724\3\2\2\2\u0726\u0727\3\2\2\2\u0727\u00fd\3\2\2\2\u0728"+
		"\u0735\7\66\2\2\u0729\u072a\7 \2\2\u072a\u072b\7\u00bb\2\2\u072b\u072c"+
		"\5\u00aeX\2\u072c\u072d\7\u00ca\2\2\u072d\u072e\5\u0132\u009a\2\u072e"+
		"\u0736\3\2\2\2\u072f\u0730\5\u00aeX\2\u0730\u0731\7\u00ca\2\2\u0731\u0732"+
		"\5\u0132\u009a\2\u0732\u0733\7y\2\2\u0733\u0734\5\u00eex\2\u0734\u0736"+
		"\3\2\2\2\u0735\u0729\3\2\2\2\u0735\u072f\3\2\2\2\u0736\u0738\3\2\2\2\u0737"+
		"\u0739\5\u00fa~\2\u0738\u0737\3\2\2\2\u0738\u0739\3\2\2\2\u0739\u073c"+
		"\3\2\2\2\u073a\u073b\7\u0083\2\2\u073b\u073d\5\u00acW\2\u073c\u073a\3"+
		"\2\2\2\u073c\u073d\3\2\2\2\u073d\u0746\3\2\2\2\u073e\u0740\5\u00fc\177"+
		"\2\u073f\u073e\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u073f\3\2\2\2\u0741\u0742"+
		"\3\2\2\2\u0742\u0743\3\2\2\2\u0743\u0744\7Z\2\2\u0744\u0745\7\66\2\2\u0745"+
		"\u0747\3\2\2\2\u0746\u073f\3\2\2\2\u0746\u0747\3\2\2\2\u0747\u00ff\3\2"+
		"\2\2\u0748\u0749\7R\2\2\u0749\u074a\7\24\2\2\u074a\u074b\5\u0096L\2\u074b"+
		"\u074c\7\u0116\2\2\u074c\u074e\5\u0096L\2\u074d\u074f\5\u00fa~\2\u074e"+
		"\u074d\3\2\2\2\u074e\u074f\3\2\2\2\u074f\u0753\3\2\2\2\u0750\u0752\5\u0104"+
		"\u0083\2\u0751\u0750\3\2\2\2\u0752\u0755\3\2\2\2\u0753\u0751\3\2\2\2\u0753"+
		"\u0754\3\2\2\2\u0754\u0758\3\2\2\2\u0755\u0753\3\2\2\2\u0756\u0757\7Z"+
		"\2\2\u0757\u0759\7R\2\2\u0758\u0756\3\2\2\2\u0758\u0759\3\2\2\2\u0759"+
		"\u0101\3\2\2\2\u075a\u075b\7\67\2\2\u075b\u075f\7R\2\2\u075c\u075d\7a"+
		"\2\2\u075d\u075f\7R\2\2\u075e\u075a\3\2\2\2\u075e\u075c\3\2\2\2\u075f"+
		"\u0103\3\2\2\2\u0760\u0761\7\u00ca\2\2\u0761\u0762\7\u009c\2\2\u0762\u0763"+
		"\7\u0147\2\2\u0763\u0764\5\u00f0y\2\u0764\u0766\7\u0148\2\2\u0765\u0767"+
		"\5N(\2\u0766\u0765\3\2\2\2\u0767\u0768\3\2\2\2\u0768\u0766\3\2\2\2\u0768"+
		"\u0769\3\2\2\2\u0769\u0105\3\2\2\2\u076a\u0786\7R\2\2\u076b\u076c\7 \2"+
		"\2\u076c\u076d\7\u00bb\2\2\u076d\u0772\5\u0096L\2\u076e\u076f\7\u013e"+
		"\2\2\u076f\u0771\5\u0096L\2\u0770\u076e\3\2\2\2\u0771\u0774\3\2\2\2\u0772"+
		"\u0770\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0787\3\2\2\2\u0774\u0772\3\2"+
		"\2\2\u0775\u077a\5\u0096L\2\u0776\u0777\7\u013e\2\2\u0777\u0779\5\u0096"+
		"L\2\u0778\u0776\3\2\2\2\u0779\u077c\3\2\2\2\u077a\u0778\3\2\2\2\u077a"+
		"\u077b\3\2\2\2\u077b\u0784\3\2\2\2\u077c\u077a\3\2\2\2\u077d\u077e\7\u0116"+
		"\2\2\u077e\u0785\5\u00eex\2\u077f\u0780\7\17\2\2\u0780\u0781\5\u0096L"+
		"\2\u0781\u0782\7\u013e\2\2\u0782\u0783\5\u0096L\2\u0783\u0785\3\2\2\2"+
		"\u0784\u077d\3\2\2\2\u0784\u077f\3\2\2\2\u0784\u0785\3\2\2\2\u0785\u0787"+
		"\3\2\2\2\u0786\u076b\3\2\2\2\u0786\u0775\3\2\2\2\u0787\u0789\3\2\2\2\u0788"+
		"\u078a\5\u00fa~\2\u0789\u0788\3\2\2\2\u0789\u078a\3\2\2\2\u078a\u078b"+
		"\3\2\2\2\u078b\u078c\5\u0186\u00c4\2\u078c\u0107\3\2\2\2\u078d\u078e\7"+
		"[\2\2\u078e\u0793\5\u0096L\2\u078f\u0790\7\u013e\2\2\u0790\u0792\5\u0096"+
		"L\2\u0791\u078f\3\2\2\2\u0792\u0795\3\2\2\2\u0793\u0791\3\2\2\2\u0793"+
		"\u0794\3\2\2\2\u0794\u0797\3\2\2\2\u0795\u0793\3\2\2\2\u0796\u0798\5\u00fa"+
		"~\2\u0797\u0796\3\2\2\2\u0797\u0798\3\2\2\2\u0798\u0109\3\2\2\2\u0799"+
		"\u079a\7\u00ae\2\2\u079a\u079f\5\u0096L\2\u079b\u079c\7\u013e\2\2\u079c"+
		"\u079e\5\u0096L\2\u079d\u079b\3\2\2\2\u079e\u07a1\3\2\2\2\u079f\u079d"+
		"\3\2\2\2\u079f\u07a0\3\2\2\2\u07a0\u07a3\3\2\2\2\u07a1\u079f\3\2\2\2\u07a2"+
		"\u07a4\5\u00fa~\2\u07a3\u07a2\3\2\2\2\u07a3\u07a4\3\2\2\2\u07a4\u010b"+
		"\3\2\2\2\u07a5\u07a6\7\u00df\2\2\u07a6\u07ab\5\u0096L\2\u07a7\u07a8\7"+
		"\u013e\2\2\u07a8\u07aa\5\u0096L\2\u07a9\u07a7\3\2\2\2\u07aa\u07ad\3\2"+
		"\2\2\u07ab\u07a9\3\2\2\2\u07ab\u07ac\3\2\2\2\u07ac\u07af\3\2\2\2\u07ad"+
		"\u07ab\3\2\2\2\u07ae\u07b0\5\u00fa~\2\u07af\u07ae\3\2\2\2\u07af\u07b0"+
		"\3\2\2\2\u07b0\u07b1\3\2\2\2\u07b1\u07b3\7q\2\2\u07b2\u07b4\7%\2\2\u07b3"+
		"\u07b2\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u07b5\3\2\2\2\u07b5\u07b8\5\u00ae"+
		"X\2\u07b6\u07b7\7\u0083\2\2\u07b7\u07b9\5\u00acW\2\u07b8\u07b6\3\2\2\2"+
		"\u07b8\u07b9\3\2\2\2\u07b9\u07bb\3\2\2\2\u07ba\u07bc\5\u00fa~\2\u07bb"+
		"\u07ba\3\2\2\2\u07bb\u07bc\3\2\2\2\u07bc\u07cc\3\2\2\2\u07bd\u07be\7\u00ca"+
		"\2\2\u07be\u07bf\7\u009c\2\2\u07bf\u07c0\7\u0147\2\2\u07c0\u07c1\5\u00f0"+
		"y\2\u07c1\u07c3\7\u0148\2\2\u07c2\u07c4\5N(\2\u07c3\u07c2\3\2\2\2\u07c3"+
		"\u07c4\3\2\2\2\u07c4\u07c6\3\2\2\2\u07c5\u07bd\3\2\2\2\u07c6\u07c9\3\2"+
		"\2\2\u07c7\u07c5\3\2\2\2\u07c7\u07c8\3\2\2\2\u07c8\u07ca\3\2\2\2\u07c9"+
		"\u07c7\3\2\2\2\u07ca\u07cb\7Z\2\2\u07cb\u07cd\7\u00df\2\2\u07cc\u07c7"+
		"\3\2\2\2\u07cc\u07cd\3\2\2\2\u07cd\u010d\3\2\2\2\u07ce\u07cf\t\32\2\2"+
		"\u07cf\u07dd\t\33\2\2\u07d0\u07d1\7\25\2\2\u07d1\u07d2\7i\2\2\u07d2\u07dd"+
		"\5\u00eex\2\u07d3\u07d4\7\4\2\2\u07d4\u07d5\7i\2\2\u07d5\u07dd\5\u00ee"+
		"x\2\u07d6\u07d7\7\u00ca\2\2\u07d7\u07d8\7\u009c\2\2\u07d8\u07d9\7\u0147"+
		"\2\2\u07d9\u07da\5\u00f0y\2\u07da\u07db\7\u0148\2\2\u07db\u07dd\3\2\2"+
		"\2\u07dc\u07ce\3\2\2\2\u07dc\u07d0\3\2\2\2\u07dc\u07d3\3\2\2\2\u07dc\u07d6"+
		"\3\2\2\2\u07dd\u010f\3\2\2\2\u07de\u07df\7\u00bd\2\2\u07df\u07e2\7i\2"+
		"\2\u07e0\u07e3\5\u00eav\2\u07e1\u07e3\t\34\2\2\u07e2\u07e0\3\2\2\2\u07e2"+
		"\u07e1\3\2\2\2\u07e3\u07eb\3\2\2\2\u07e4\u07e5\7\67\2\2\u07e5\u07e9\7"+
		"\u008e\2\2\u07e6\u07e7\7a\2\2\u07e7\u07e9\7\u008e\2\2\u07e8\u07e4\3\2"+
		"\2\2\u07e8\u07e6\3\2\2\2\u07e9\u07eb\3\2\2\2\u07ea\u07de\3\2\2\2\u07ea"+
		"\u07e8\3\2\2\2\u07eb\u0111\3\2\2\2\u07ec\u07f0\5\u010e\u0088\2\u07ed\u07ef"+
		"\5N(\2\u07ee\u07ed\3\2\2\2\u07ef\u07f2\3\2\2\2\u07f0\u07ee\3\2\2\2\u07f0"+
		"\u07f1\3\2\2\2\u07f1\u0113\3\2\2\2\u07f2\u07f0\3\2\2\2\u07f3\u0811\7\u008e"+
		"\2\2\u07f4\u07f5\7 \2\2\u07f5\u07f6\7\u00bb\2\2\u07f6\u07fb\5\u0096L\2"+
		"\u07f7\u07f8\7\u013e\2\2\u07f8\u07fa\5\u0096L\2\u07f9\u07f7\3\2\2\2\u07fa"+
		"\u07fd\3\2\2\2\u07fb\u07f9\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc\u0800\3\2"+
		"\2\2\u07fd\u07fb\3\2\2\2\u07fe\u07ff\7\u0134\2\2\u07ff\u0801\7I\2\2\u0800"+
		"\u07fe\3\2\2\2\u0800\u0801\3\2\2\2\u0801\u0812\3\2\2\2\u0802\u0807\5\u0096"+
		"L\2\u0803\u0804\7\u013e\2\2\u0804\u0806\5\u0096L\2\u0805\u0803\3\2\2\2"+
		"\u0806\u0809\3\2\2\2\u0807\u0805\3\2\2\2\u0807\u0808\3\2\2\2\u0808\u080c"+
		"\3\2\2\2\u0809\u0807\3\2\2\2\u080a\u080b\7\u0134\2\2\u080b\u080d\7I\2"+
		"\2\u080c\u080a\3\2\2\2\u080c\u080d\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u080f"+
		"\7y\2\2\u080f\u0810\5\u00eex\2\u0810\u0812\3\2\2\2\u0811\u07f4\3\2\2\2"+
		"\u0811\u0802\3\2\2\2\u0812\u0814\3\2\2\2\u0813\u0815\5\u00fa~\2\u0814"+
		"\u0813\3\2\2\2\u0814\u0815\3\2\2\2\u0815\u0818\3\2\2\2\u0816\u0817\7\u0083"+
		"\2\2\u0817\u0819\5\u00acW\2\u0818\u0816\3\2\2\2\u0818\u0819\3\2\2\2\u0819"+
		"\u0822\3\2\2\2\u081a\u081c\5\u0112\u008a\2\u081b\u081a\3\2\2\2\u081c\u081d"+
		"\3\2\2\2\u081d\u081b\3\2\2\2\u081d\u081e\3\2\2\2\u081e\u081f\3\2\2\2\u081f"+
		"\u0820\7Z\2\2\u0820\u0821\7\u008e\2\2\u0821\u0823\3\2\2\2\u0822\u081b"+
		"\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u0115\3\2\2\2\u0824\u0825\7\u008e\2"+
		"\2\u0825\u0826\7\24\2\2\u0826\u0829\5\u0096L\2\u0827\u0828\7\u0134\2\2"+
		"\u0828\u082a\7I\2\2\u0829\u0827\3\2\2\2\u0829\u082a\3\2\2\2\u082a\u082b"+
		"\3\2\2\2\u082b\u082c\7y\2\2\u082c\u0831\5\u0096L\2\u082d\u082e\7\u013e"+
		"\2\2\u082e\u0830\5\u0096L\2\u082f\u082d\3\2\2\2\u0830\u0833\3\2\2\2\u0831"+
		"\u082f\3\2\2\2\u0831\u0832\3\2\2\2\u0832\u0836\3\2\2\2\u0833\u0831\3\2"+
		"\2\2\u0834\u0835\7\u0083\2\2\u0835\u0837\5\u00acW\2\u0836\u0834\3\2\2"+
		"\2\u0836\u0837\3\2\2\2\u0837\u0839\3\2\2\2\u0838\u083a\5\u00fa~\2\u0839"+
		"\u0838\3\2\2\2\u0839\u083a\3\2\2\2\u083a\u0843\3\2\2\2\u083b\u083d\5\u0112"+
		"\u008a\2\u083c\u083b\3\2\2\2\u083d\u083e\3\2\2\2\u083e\u083c\3\2\2\2\u083e"+
		"\u083f\3\2\2\2\u083f\u0840\3\2\2\2\u0840\u0841\7Z\2\2\u0841\u0842\7\u008e"+
		"\2\2\u0842\u0844\3\2\2\2\u0843\u083c\3\2\2\2\u0843\u0844\3\2\2\2\u0844"+
		"\u0117\3\2\2\2\u0845\u0846\7\25\2\2\u0846\u0858\7\u00ad\2\2\u0847\u084d"+
		"\7/\2\2\u0848\u0849\7\u009c\2\2\u0849\u084a\7\u0147\2\2\u084a\u084b\5"+
		"\u00f0y\2\u084b\u084c\7\u0148\2\2\u084c\u084e\3\2\2\2\u084d\u0848\3\2"+
		"\2\2\u084d\u084e\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u0851\5\u0096L\2\u0850"+
		"\u0852\5\u0096L\2\u0851\u0850\3\2\2\2\u0851\u0852\3\2\2\2\u0852\u0855"+
		"\3\2\2\2\u0853\u0854\7\u0083\2\2\u0854\u0856\5\u00acW\2\u0855\u0853\3"+
		"\2\2\2\u0855\u0856\3\2\2\2\u0856\u0858\3\2\2\2\u0857\u0845\3\2\2\2\u0857"+
		"\u0847\3\2\2\2\u0858\u0119\3\2\2\2\u0859\u085a\7\u00bd\2\2\u085a\u085d"+
		"\7\u00cc\2\2\u085b\u085e\5\u0096L\2\u085c\u085e\7\b\2\2\u085d\u085b\3"+
		"\2\2\2\u085d\u085c\3\2\2\2\u085e\u0863\3\2\2\2\u085f\u0860\7\u013e\2\2"+
		"\u0860\u0862\5\u0096L\2\u0861\u085f\3\2\2\2\u0862\u0865\3\2\2\2\u0863"+
		"\u0861\3\2\2\2\u0863\u0864\3\2\2\2\u0864\u0885\3\2\2\2\u0865\u0863\3\2"+
		"\2\2\u0866\u0867\7\u00fd\2\2\u0867\u086a\7\u00cc\2\2\u0868\u086b\5\u0096"+
		"L\2\u0869\u086b\7\b\2\2\u086a\u0868\3\2\2\2\u086a\u0869\3\2\2\2\u086b"+
		"\u0870\3\2\2\2\u086c\u086d\7\u013e\2\2\u086d\u086f\5\u0096L\2\u086e\u086c"+
		"\3\2\2\2\u086f\u0872\3\2\2\2\u0870\u086e\3\2\2\2\u0870\u0871\3\2\2\2\u0871"+
		"\u0885\3\2\2\2\u0872\u0870\3\2\2\2\u0873\u0874\7\u0084\2\2\u0874\u0877"+
		"\7\u00cc\2\2\u0875\u0878\5\u0096L\2\u0876\u0878\7\b\2\2\u0877\u0875\3"+
		"\2\2\2\u0877\u0876\3\2\2\2\u0878\u087d\3\2\2\2\u0879\u087a\7\u013e\2\2"+
		"\u087a\u087c\5\u0096L\2\u087b\u0879\3\2\2\2\u087c\u087f\3\2\2\2\u087d"+
		"\u087b\3\2\2\2\u087d\u087e\3\2\2\2\u087e\u0885\3\2\2\2\u087f\u087d\3\2"+
		"\2\2\u0880\u0881\7\67\2\2\u0881\u0885\7\u00ad\2\2\u0882\u0883\7a\2\2\u0883"+
		"\u0885\7\u00ad\2\2\u0884\u0859\3\2\2\2\u0884\u0866\3\2\2\2\u0884\u0873"+
		"\3\2\2\2\u0884\u0880\3\2\2\2\u0884\u0882\3\2\2\2\u0885\u011b\3\2\2\2\u0886"+
		"\u0888\5\u0118\u008d\2\u0887\u0889\5N(\2\u0888\u0887\3\2\2\2\u0888\u0889"+
		"\3\2\2\2\u0889\u011d\3\2\2\2\u088a\u088b\7\u00ad\2\2\u088b\u088f\5\u0096"+
		"L\2\u088c\u088e\5\u011c\u008f\2\u088d\u088c\3\2\2\2\u088e\u0891\3\2\2"+
		"\2\u088f\u088d\3\2\2\2\u088f\u0890\3\2\2\2\u0890\u0892\3\2\2\2\u0891\u088f"+
		"\3\2\2\2\u0892\u0893\7Z\2\2\u0893\u0894\7\u00ad\2\2\u0894\u011f\3\2\2"+
		"\2\u0895\u0898\7m\2\2\u0896\u0897\7\u013a\2\2\u0897\u0899\5\u00acW\2\u0898"+
		"\u0896\3\2\2\2\u0898\u0899\3\2\2\2\u0899\u08a1\3\2\2\2\u089a\u08a1\5\u00ac"+
		"W\2\u089b\u089e\7\u009e\2\2\u089c\u089d\7\u013b\2\2\u089d\u089f\5\u00ac"+
		"W\2\u089e\u089c\3\2\2\2\u089e\u089f\3\2\2\2\u089f\u08a1\3\2\2\2\u08a0"+
		"\u0895\3\2\2\2\u08a0\u089a\3\2\2\2\u08a0\u089b\3\2\2\2\u08a1\u0121\3\2"+
		"\2\2\u08a2\u08af\t\30\2\2\u08a3\u08af\7\u00f0\2\2\u08a4\u08af\7\35\2\2"+
		"\u08a5\u08a6\t\35\2\2\u08a6\u08a7\7\u00a3\2\2\u08a7\u08af\5\u0120\u0091"+
		"\2\u08a8\u08a9\7\60\2\2\u08a9\u08ac\7\u00a3\2\2\u08aa\u08ad\5\u0120\u0091"+
		"\2\u08ab\u08ad\7\u00c9\2\2\u08ac\u08aa\3\2\2\2\u08ac\u08ab\3\2\2\2\u08ad"+
		"\u08af\3\2\2\2\u08ae\u08a2\3\2\2\2\u08ae\u08a3\3\2\2\2\u08ae\u08a4\3\2"+
		"\2\2\u08ae\u08a5\3\2\2\2\u08ae\u08a8\3\2\2\2\u08af\u0123\3\2\2\2\u08b0"+
		"\u08b5\5\u0122\u0092\2\u08b1\u08b2\7\u013e\2\2\u08b2\u08b4\5\u0122\u0092"+
		"\2\u08b3\u08b1\3\2\2\2\u08b4\u08b7\3\2\2\2\u08b5\u08b3\3\2\2\2\u08b5\u08b6"+
		"\3\2\2\2\u08b6\u0125\3\2\2\2\u08b7\u08b5\3\2\2\2\u08b8\u08b9\t\31\2\2"+
		"\u08b9\u08ba\7\u0147\2\2\u08ba\u08bb\5\u0124\u0093\2\u08bb\u08bc\7\u0148"+
		"\2\2\u08bc\u0127\3\2\2\2\u08bd\u08be\7\u00ae\2\2\u08be\u08bf\7";
	private static final String _serializedATNSegment1 =
		"\u00a3\2\2\u08bf\u08f5\5\u0096L\2\u08c0\u08c1\7\u00df\2\2\u08c1\u08c2"+
		"\7\u00a3\2\2\u08c2\u08f5\5\u0096L\2\u08c3\u08c4\7\u00ad\2\2\u08c4\u08c5"+
		"\7\u00a3\2\2\u08c5\u08f5\5\u0096L\2\u08c6\u08c7\7\60\2\2\u08c7\u08c8\7"+
		"\u00a3\2\2\u08c8\u08f5\5\u0096L\2\u08c9\u08ca\7[\2\2\u08ca\u08cb\7\u00a3"+
		"\2\2\u08cb\u08f5\5\u0096L\2\u08cc\u08cd\7r\2\2\u08cd\u08ce\7\u00a3\2\2"+
		"\u08ce\u08f5\5\u0096L\2\u08cf\u08d3\7\u008e\2\2\u08d0\u08d4\7\u015e\2"+
		"\2\u08d1\u08d2\7\u00c0\2\2\u08d2\u08d4\7\u015e\2\2\u08d3\u08d0\3\2\2\2"+
		"\u08d3\u08d1\3\2\2\2\u08d4\u08f5\3\2\2\2\u08d5\u08d6\7\u008f\2\2\u08d6"+
		"\u08d7\7\u009c\2\2\u08d7\u08f5\5\u0096L\2\u08d8\u08d9\7L\2\2\u08d9\u08da"+
		"\7\u009c\2\2\u08da\u08f5\5\u0096L\2\u08db\u08dc\7\u00bd\2\2\u08dc\u08dd"+
		"\7\u009c\2\2\u08dd\u08f5\5\u0096L\2\u08de\u08df\7\u00db\2\2\u08df\u08e0"+
		"\7\u009c\2\2\u08e0\u08f5\5\u0096L\2\u08e1\u08e2\7\5\2\2\u08e2\u08e3\7"+
		"\u009c\2\2\u08e3\u08f5\5\u0096L\2\u08e4\u08e5\7\u0083\2\2\u08e5\u08e6"+
		"\7k\2\2\u08e6\u08f5\5\u0096L\2\u08e7\u08e8\7\u0083\2\2\u08e8\u08e9\7\u009c"+
		"\2\2\u08e9\u08f5\5\u0096L\2\u08ea\u08eb\7\u008e\2\2\u08eb\u08f5\5\u00fa"+
		"~\2\u08ec\u08ed\7R\2\2\u08ed\u08f5\5\u00fa~\2\u08ee\u08ef\7\u0104\2\2"+
		"\u08ef\u08f0\7\u0095\2\2\u08f0\u08f5\t\36\2\2\u08f1\u08f2\7i\2\2\u08f2"+
		"\u08f3\7\u00d0\2\2\u08f3\u08f5\t\37\2\2\u08f4\u08bd\3\2\2\2\u08f4\u08c0"+
		"\3\2\2\2\u08f4\u08c3\3\2\2\2\u08f4\u08c6\3\2\2\2\u08f4\u08c9\3\2\2\2\u08f4"+
		"\u08cc\3\2\2\2\u08f4\u08cf\3\2\2\2\u08f4\u08d5\3\2\2\2\u08f4\u08d8\3\2"+
		"\2\2\u08f4\u08db\3\2\2\2\u08f4\u08de\3\2\2\2\u08f4\u08e1\3\2\2\2\u08f4"+
		"\u08e4\3\2\2\2\u08f4\u08e7\3\2\2\2\u08f4\u08ea\3\2\2\2\u08f4\u08ec\3\2"+
		"\2\2\u08f4\u08ee\3\2\2\2\u08f4\u08f1\3\2\2\2\u08f5\u0129\3\2\2\2\u08f6"+
		"\u08f7\7\u00cd\2\2\u08f7\u08fc\5\u0128\u0095\2\u08f8\u08f9\7\u013e\2\2"+
		"\u08f9\u08fb\5\u0128\u0095\2\u08fa\u08f8\3\2\2\2\u08fb\u08fe\3\2\2\2\u08fc"+
		"\u08fa\3\2\2\2\u08fc\u08fd\3\2\2\2\u08fd\u012b\3\2\2\2\u08fe\u08fc\3\2"+
		"\2\2\u08ff\u0908\7)\2\2\u0900\u0909\7r\2\2\u0901\u0902\7\u0135\2\2\u0902"+
		"\u0909\5\4\3\2\u0903\u0905\7\u0135\2\2\u0904\u0903\3\2\2\2\u0904\u0905"+
		"\3\2\2\2\u0905\u0906\3\2\2\2\u0906\u0909\7\u00f6\2\2\u0907\u0909\5\u00ee"+
		"x\2\u0908\u0900\3\2\2\2\u0908\u0901\3\2\2\2\u0908\u0904\3\2\2\2\u0908"+
		"\u0907\3\2\2\2\u0909\u0959\3\2\2\2\u090a\u090b\7+\2\2\u090b\u090c\7\u0135"+
		"\2\2\u090c\u090d\5\4\3\2\u090d\u090e\5\u0186\u00c4\2\u090e\u0959\3\2\2"+
		"\2\u090f\u0910\7+\2\2\u0910\u0911\7r\2\2\u0911\u0912\5\4\3\2\u0912\u0913"+
		"\5\u0186\u00c4\2\u0913\u0959\3\2\2\2\u0914\u0959\5\u00fe\u0080\2\u0915"+
		"\u0916\7<\2\2\u0916\u0917\7\u0135\2\2\u0917\u091a\7\u0098\2\2\u0918\u091b"+
		"\7\u00f6\2\2\u0919\u091b\5\4\3\2\u091a\u0918\3\2\2\2\u091a\u0919\3\2\2"+
		"\2\u091b\u091c\3\2\2\2\u091c\u0959\5\u0186\u00c4\2\u091d\u0959\5\u0106"+
		"\u0084\2\u091e\u0959\5\u0100\u0081\2\u091f\u0920\7R\2\2\u0920\u0921\7"+
		"r\2\2\u0921\u0923\5\4\3\2\u0922\u0924\5\u00fa~\2\u0923\u0922\3\2\2\2\u0923"+
		"\u0924\3\2\2\2\u0924\u0925\3\2\2\2\u0925\u0926\5\u0186\u00c4\2\u0926\u0959"+
		"\3\2\2\2\u0927\u0959\5\u0108\u0085\2\u0928\u0959\5\u010a\u0086\2\u0929"+
		"\u0959\5\u010c\u0087\2\u092a\u0959\5\u0114\u008b\2\u092b\u0959\5\u0116"+
		"\u008c\2\u092c\u0959\5\u011e\u0090\2\u092d\u092e\7\u00cb\2\2\u092e\u092f"+
		"\7r\2\2\u092f\u0930\5\u0096L\2\u0930\u0931\7y\2\2\u0931\u0932\5\u0096"+
		"L\2\u0932\u0959\3\2\2\2\u0933\u0934\7\u00cb\2\2\u0934\u0935\7\u0135\2"+
		"\2\u0935\u0936\5\u0096L\2\u0936\u0937\7\17\2\2\u0937\u0938\5\u0096L\2"+
		"\u0938\u0939\7\u013e\2\2\u0939\u0944\5\u0096L\2\u093a\u093b\7\u0133\2"+
		"\2\u093b\u093c\7r\2\2\u093c\u0945\5\u0096L\2\u093d\u093e\7\u0133\2\2\u093e"+
		"\u093f\5\u0096L\2\u093f\u0940\7\u00f4\2\2\u0940\u0941\7\u013e\2\2\u0941"+
		"\u0942\5\u0096L\2\u0942\u0943\7.\2\2\u0943\u0945\3\2\2\2\u0944\u093a\3"+
		"\2\2\2\u0944\u093d\3\2\2\2\u0945\u0947\3\2\2\2\u0946\u0948\5\u0126\u0094"+
		"\2\u0947\u0946\3\2\2\2\u0947\u0948\3\2\2\2\u0948\u0959\3\2\2\2\u0949\u0959"+
		"\5\u012a\u0096\2\u094a\u094b\7\u00f7\2\2\u094b\u0950\5\u00eex\2\u094c"+
		"\u094d\7\u013e\2\2\u094d\u094f\5\u00eex\2\u094e\u094c\3\2\2\2\u094f\u0952"+
		"\3\2\2\2\u0950\u094e\3\2\2\2\u0950\u0951\3\2\2\2\u0951\u0953\3\2\2\2\u0952"+
		"\u0950\3\2\2\2\u0953\u0956\t \2\2\u0954\u0955\7 \2\2\u0955\u0957\5\u00ac"+
		"W\2\u0956\u0954\3\2\2\2\u0956\u0957\3\2\2\2\u0957\u0959\3\2\2\2\u0958"+
		"\u08ff\3\2\2\2\u0958\u090a\3\2\2\2\u0958\u090f\3\2\2\2\u0958\u0914\3\2"+
		"\2\2\u0958\u0915\3\2\2\2\u0958\u091d\3\2\2\2\u0958\u091e\3\2\2\2\u0958"+
		"\u091f\3\2\2\2\u0958\u0927\3\2\2\2\u0958\u0928\3\2\2\2\u0958\u0929\3\2"+
		"\2\2\u0958\u092a\3\2\2\2\u0958\u092b\3\2\2\2\u0958\u092c\3\2\2\2\u0958"+
		"\u092d\3\2\2\2\u0958\u0933\3\2\2\2\u0958\u0949\3\2\2\2\u0958\u094a\3\2"+
		"\2\2\u0959\u012d\3\2\2\2\u095a\u0962\5\u0130\u0099\2\u095b\u0962\5\u013c"+
		"\u009f\2\u095c\u0962\5\u013e\u00a0\2\u095d\u0962\5\u0170\u00b9\2\u095e"+
		"\u0962\5\u0172\u00ba\2\u095f\u0962\5\u0178\u00bd\2\u0960\u0962\5\u0176"+
		"\u00bc\2\u0961\u095a\3\2\2\2\u0961\u095b\3\2\2\2\u0961\u095c\3\2\2\2\u0961"+
		"\u095d\3\2\2\2\u0961\u095e\3\2\2\2\u0961\u095f\3\2\2\2\u0961\u0960\3\2"+
		"\2\2\u0962\u012f\3\2\2\2\u0963\u0964\7+\2\2\u0964\u0965\5\u0136\u009c"+
		"\2\u0965\u0966\5\u0186\u00c4\2\u0966\u09ab\3\2\2\2\u0967\u0968\7G\2\2"+
		"\u0968\u0987\5\u0136\u009c\2\u0969\u096c\7=\2\2\u096a\u096b\7\u0133\2"+
		"\2\u096b\u096d\7\u0085\2\2\u096c\u096a\3\2\2\2\u096c\u096d\3\2\2\2\u096d"+
		"\u096e\3\2\2\2\u096e\u097a\7q\2\2\u096f\u0976\5\u0140\u00a1\2\u0970\u0971"+
		"\7q\2\2\u0971\u0974\7\u0123\2\2\u0972\u0973\7\u00c8\2\2\u0973\u0975\5"+
		"\u0132\u009a\2\u0974\u0972\3\2\2\2\u0974\u0975\3\2\2\2\u0975\u0977\3\2"+
		"\2\2\u0976\u0970\3\2\2\2\u0976\u0977\3\2\2\2\u0977\u097b\3\2\2\2\u0978"+
		"\u097b\5\u0168\u00b5\2\u0979\u097b\5\u0134\u009b\2\u097a\u096f\3\2\2\2"+
		"\u097a\u0978\3\2\2\2\u097a\u0979\3\2\2\2\u097b\u0988\3\2\2\2\u097c\u097d"+
		"\7\u00f7\2\2\u097d\u0980\7=\2\2\u097e\u097f\7\u0133\2\2\u097f\u0981\7"+
		"\u0085\2\2\u0980\u097e\3\2\2\2\u0980\u0981\3\2\2\2\u0981\u0982\3\2\2\2"+
		"\u0982\u0985\7q\2\2\u0983\u0986\5\u0140\u00a1\2\u0984\u0986\5\u0134\u009b"+
		"\2\u0985\u0983\3\2\2\2\u0985\u0984\3\2\2\2\u0986\u0988\3\2\2\2\u0987\u0969"+
		"\3\2\2\2\u0987\u097c\3\2\2\2\u0988\u09ab\3\2\2\2\u0989\u0993\7h\2\2\u098a"+
		"\u0994\7\u00bd\2\2\u098b\u0994\t!\2\2\u098c\u0994\7m\2\2\u098d\u0994\7"+
		"\u009e\2\2\u098e\u0994\7<\2\2\u098f\u0990\7\u00e7\2\2\u0990\u0994\5\u0096"+
		"L\2\u0991\u0992\7\3\2\2\u0992\u0994\5\u0096L\2\u0993\u098a\3\2\2\2\u0993"+
		"\u098b\3\2\2\2\u0993\u098c\3\2\2\2\u0993\u098d\3\2\2\2\u0993\u098e\3\2"+
		"\2\2\u0993\u098f\3\2\2\2\u0993\u0991\3\2\2\2\u0993\u0994\3\2\2\2\u0994"+
		"\u0995\3\2\2\2\u0995\u0998\5\u0136\u009c\2\u0996\u0997\7\u0091\2\2\u0997"+
		"\u0999\5\u00d2j\2\u0998\u0996\3\2\2\2\u0998\u0999\3\2\2\2\u0999\u09ab"+
		"\3\2\2\2\u099a\u099b\7p\2\2\u099b\u099c\5\u0136\u009c\2\u099c\u099d\5"+
		"\u0186\u00c4\2\u099d\u09ab\3\2\2\2\u099e\u099f\7\u00cb\2\2\u099f\u09a2"+
		"\5\u0136\u009c\2\u09a0\u09a1\7\u0125\2\2\u09a1\u09a3\5\u00d2j\2\u09a2"+
		"\u09a0\3\2\2\2\u09a2\u09a3\3\2\2\2\u09a3\u09ab\3\2\2\2\u09a4\u09a5\7\u00e0"+
		"\2\2\u09a5\u09a8\5\u0136\u009c\2\u09a6\u09a7\7y\2\2\u09a7\u09a9\5\u00d4"+
		"k\2\u09a8\u09a6\3\2\2\2\u09a8\u09a9\3\2\2\2\u09a9\u09ab\3\2\2\2\u09aa"+
		"\u0963\3\2\2\2\u09aa\u0967\3\2\2\2\u09aa\u0989\3\2\2\2\u09aa\u099a\3\2"+
		"\2\2\u09aa\u099e\3\2\2\2\u09aa\u09a4\3\2\2\2\u09ab\u0131\3\2\2\2\u09ac"+
		"\u09b1\5\u0142\u00a2\2\u09ad\u09ae\7\u013e\2\2\u09ae\u09b0\5\u0142\u00a2"+
		"\2\u09af\u09ad\3\2\2\2\u09b0\u09b3\3\2\2\2\u09b1\u09af\3\2\2\2\u09b1\u09b2"+
		"\3\2\2\2\u09b2\u0133\3\2\2\2\u09b3\u09b1\3\2\2\2\u09b4\u09b5\5\u0190\u00c9"+
		"\2\u09b5\u0135\3\2\2\2\u09b6\u09b7\5\4\3\2\u09b7\u0137\3\2\2\2\u09b8\u09b9"+
		"\5\36\20\2\u09b9\u0139\3\2\2\2\u09ba\u09c4\5\u0190\u00c9\2\u09bb\u09c5"+
		"\5\u0138\u009d\2\u09bc\u09c2\t\3\2\2\u09bd\u09c0\7\u0088\2\2\u09be\u09c1"+
		"\7\u010d\2\2\u09bf\u09c1\5\u0190\u00c9\2\u09c0\u09be\3\2\2\2\u09c0\u09bf"+
		"\3\2\2\2\u09c1\u09c3\3\2\2\2\u09c2\u09bd\3\2\2\2\u09c2\u09c3\3\2\2\2\u09c3"+
		"\u09c5\3\2\2\2\u09c4\u09bb\3\2\2\2\u09c4\u09bc\3\2\2\2\u09c5\u09c8\3\2"+
		"\2\2\u09c6\u09c7\7\u00c1\2\2\u09c7\u09c9\7\u00c5\2\2\u09c8\u09c6\3\2\2"+
		"\2\u09c8\u09c9\3\2\2\2\u09c9\u09dc\3\2\2\2\u09ca\u09cb\7\u011f\2\2\u09cb"+
		"\u09d4\7\u0147\2\2\u09cc\u09d1\5\u0190\u00c9\2\u09cd\u09ce\7\u013e\2\2"+
		"\u09ce\u09d0\5\u0190\u00c9\2\u09cf\u09cd\3\2\2\2\u09d0\u09d3\3\2\2\2\u09d1"+
		"\u09cf\3\2\2\2\u09d1\u09d2\3\2\2\2\u09d2\u09d5\3\2\2\2\u09d3\u09d1\3\2"+
		"\2\2\u09d4\u09cc\3\2\2\2\u09d4\u09d5\3\2\2\2\u09d5\u09d6\3\2\2\2\u09d6"+
		"\u09d9\7\u0148\2\2\u09d7\u09d8\7\65\2\2\u09d8\u09da\5\u0190\u00c9\2\u09d9"+
		"\u09d7\3\2\2\2\u09d9\u09da\3\2\2\2\u09da\u09dc\3\2\2\2\u09db\u09ba\3\2"+
		"\2\2\u09db\u09ca\3\2\2\2\u09dc\u013b\3\2\2\2\u09dd\u09de\7W\2\2\u09de"+
		"\u09df\7\u010d\2\2\u09df\u0a2a\5\u0190\u00c9\2\u09e0\u09e2\7;\2\2\u09e1"+
		"\u09e3\7\u0110\2\2\u09e2\u09e1\3\2\2\2\u09e2\u09e3\3\2\2\2\u09e3\u09e4"+
		"\3\2\2\2\u09e4\u09e5\7\u010d\2\2\u09e5\u09e6\5\u0190\u00c9\2\u09e6\u09e7"+
		"\7\u0147\2\2\u09e7\u09ec\5\u013a\u009e\2\u09e8\u09e9\7\u013e\2\2\u09e9"+
		"\u09eb\5\u013a\u009e\2\u09ea\u09e8\3\2\2\2\u09eb\u09ee\3\2\2\2\u09ec\u09ea"+
		"\3\2\2\2\u09ec\u09ed\3\2\2\2\u09ed\u09ef\3\2\2\2\u09ee\u09ec\3\2\2\2\u09ef"+
		"\u09f3\7\u0148\2\2\u09f0\u09f1\7\u0133\2\2\u09f1\u09f2\7\u00c0\2\2\u09f2"+
		"\u09f4\7\u00a9\2\2\u09f3\u09f0\3\2\2\2\u09f3\u09f4\3\2\2\2\u09f4\u09f7"+
		"\3\2\2\2\u09f5\u09f6\7\u0088\2\2\u09f6\u09f8\5\u0190\u00c9\2\u09f7\u09f5"+
		"\3\2\2\2\u09f7\u09f8\3\2\2\2\u09f8\u09fc\3\2\2\2\u09f9\u09fa\7e\2\2\u09fa"+
		"\u09fb\7\u00fe\2\2\u09fb\u09fd\5\u00acW\2\u09fc\u09f9\3\2\2\2\u09fc\u09fd"+
		"\3\2\2\2\u09fd\u0a01\3\2\2\2\u09fe\u09ff\7\u00bd\2\2\u09ff\u0a00\7\u00fe"+
		"\2\2\u0a00\u0a02\5\u00acW\2\u0a01\u09fe\3\2\2\2\u0a01\u0a02\3\2\2\2\u0a02"+
		"\u0a08\3\2\2\2\u0a03\u0a04\7\u00a8\2\2\u0a04\u0a05\7\u00b6\2\2\u0a05\u0a06"+
		"\7\u0147\2\2\u0a06\u0a07\t\"\2\2\u0a07\u0a09\7\u0148\2\2\u0a08\u0a03\3"+
		"\2\2\2\u0a08\u0a09\3\2\2\2\u0a09\u0a2a\3\2\2\2\u0a0a\u0a0c\7;\2\2\u0a0b"+
		"\u0a0d\7\u011f\2\2\u0a0c\u0a0b\3\2\2\2\u0a0c\u0a0d\3\2\2\2\u0a0d\u0a0f"+
		"\3\2\2\2\u0a0e\u0a10\7,\2\2\u0a0f\u0a0e\3\2\2\2\u0a0f\u0a10\3\2\2\2\u0a10"+
		"\u0a11\3\2\2\2\u0a11\u0a12\7\u008a\2\2\u0a12\u0a13\5\u0190\u00c9\2\u0a13"+
		"\u0a14\7\u00ca\2\2\u0a14\u0a15\5\u0190\u00c9\2\u0a15\u0a16\7\u0147\2\2"+
		"\u0a16\u0a18\5\u0190\u00c9\2\u0a17\u0a19\t#\2\2\u0a18\u0a17\3\2\2\2\u0a18"+
		"\u0a19\3\2\2\2\u0a19\u0a21\3\2\2\2\u0a1a\u0a1b\7\u013e\2\2\u0a1b\u0a1d"+
		"\5\u0190\u00c9\2\u0a1c\u0a1e\t#\2\2\u0a1d\u0a1c\3\2\2\2\u0a1d\u0a1e\3"+
		"\2\2\2\u0a1e\u0a20\3\2\2\2\u0a1f\u0a1a\3\2\2\2\u0a20\u0a23\3\2\2\2\u0a21"+
		"\u0a1f\3\2\2\2\u0a21\u0a22\3\2\2\2\u0a22\u0a24\3\2\2\2\u0a23\u0a21\3\2"+
		"\2\2\u0a24\u0a25\7\u0148\2\2\u0a25\u0a2a\3\2\2\2\u0a26\u0a27\7W\2\2\u0a27"+
		"\u0a28\7\u008a\2\2\u0a28\u0a2a\5\u0190\u00c9\2\u0a29\u09dd\3\2\2\2\u0a29"+
		"\u09e0\3\2\2\2\u0a29\u0a0a\3\2\2\2\u0a29\u0a26\3\2\2\2\u0a2a\u013d\3\2"+
		"\2\2\u0a2b\u0a32\5\u0168\u00b5\2\u0a2c\u0a32\5\u016c\u00b7\2\u0a2d\u0a32"+
		"\5\u0140\u00a1\2\u0a2e\u0a32\5\u016a\u00b6\2\u0a2f\u0a32\5\u0164\u00b3"+
		"\2\u0a30\u0a32\5\u0166\u00b4\2\u0a31\u0a2b\3\2\2\2\u0a31\u0a2c\3\2\2\2"+
		"\u0a31\u0a2d\3\2\2\2\u0a31\u0a2e\3\2\2\2\u0a31\u0a2f\3\2\2\2\u0a31\u0a30"+
		"\3\2\2\2\u0a32\u013f\3\2\2\2\u0a33\u0a34\5\u0154\u00ab\2\u0a34\u0141\3"+
		"\2\2\2\u0a35\u0a41\7\u013c\2\2\u0a36\u0a38\5\u014a\u00a6\2\u0a37\u0a39"+
		"\5\u00b4[\2\u0a38\u0a37\3\2\2\2\u0a38\u0a39\3\2\2\2\u0a39\u0a3e\3\2\2"+
		"\2\u0a3a\u0a3b\7\u014b\2\2\u0a3b\u0a3f\7\u013c\2\2\u0a3c\u0a3d\7\u014b"+
		"\2\2\u0a3d\u0a3f\5\u0142\u00a2\2\u0a3e\u0a3a\3\2\2\2\u0a3e\u0a3c\3\2\2"+
		"\2\u0a3e\u0a3f\3\2\2\2\u0a3f\u0a41\3\2\2\2\u0a40\u0a35\3\2\2\2\u0a40\u0a36"+
		"\3\2\2\2\u0a41\u0143\3\2\2\2\u0a42\u0a44\5n8\2\u0a43\u0a45\5p9\2\u0a44"+
		"\u0a43\3\2\2\2\u0a44\u0a45\3\2\2\2\u0a45\u0a4d\3\2\2\2\u0a46\u0a47\7\u013e"+
		"\2\2\u0a47\u0a49\5n8\2\u0a48\u0a4a\5p9\2\u0a49\u0a48\3\2\2\2\u0a49\u0a4a"+
		"\3\2\2\2\u0a4a\u0a4c\3\2\2\2\u0a4b\u0a46\3\2\2\2\u0a4c\u0a4f\3\2\2\2\u0a4d"+
		"\u0a4b\3\2\2\2\u0a4d\u0a4e\3\2\2\2\u0a4e\u0145\3\2\2\2\u0a4f\u0a4d\3\2"+
		"\2\2\u0a50\u0a53\7\u00fa\2\2\u0a51\u0a54\7\b\2\2\u0a52\u0a54\t$\2\2\u0a53"+
		"\u0a51\3\2\2\2\u0a53\u0a52\3\2\2\2\u0a53\u0a54\3\2\2\2\u0a54\u0a55\3\2"+
		"\2\2\u0a55\u0a56\5\u0144\u00a3\2\u0a56\u0147\3\2\2\2\u0a57\u0a58\5\u0190"+
		"\u00c9\2\u0a58\u0a59\7\u0140\2\2\u0a59\u0a61\3\2\2\2\u0a5a\u0a5b\5\u0190"+
		"\u00c9\2\u0a5b\u0a5c\7\u014c\2\2\u0a5c\u0a5d\5\u0190\u00c9\2\u0a5d\u0a5e"+
		"\7\u0140\2\2\u0a5e\u0a61\3\2\2\2\u0a5f\u0a61\5J&\2\u0a60\u0a57\3\2\2\2"+
		"\u0a60\u0a5a\3\2\2\2\u0a60\u0a5f\3\2\2\2\u0a61\u0149\3\2\2\2\u0a62\u0a64"+
		"\5\u0148\u00a5\2\u0a63\u0a62\3\2\2\2\u0a63\u0a64\3\2\2\2\u0a64\u0a65\3"+
		"\2\2\2\u0a65\u0a66\5\u0190\u00c9\2\u0a66\u014b\3\2\2\2\u0a67\u0a69\7\u00d2"+
		"\2\2\u0a68\u0a67\3\2\2\2\u0a68\u0a69\3\2\2\2\u0a69\u0a6a\3\2\2\2\u0a6a"+
		"\u0a6c\5\u014a\u00a6\2\u0a6b\u0a6d\5p9\2\u0a6c\u0a6b\3\2\2\2\u0a6c\u0a6d"+
		"\3\2\2\2\u0a6d\u014d\3\2\2\2\u0a6e\u0a6f\5\u0158\u00ad\2\u0a6f\u014f\3"+
		"\2\2\2\u0a70\u0a78\7y\2\2\u0a71\u0a79\5\u014c\u00a7\2\u0a72\u0a73\7\u0147"+
		"\2\2\u0a73\u0a74\5\u014e\u00a8\2\u0a74\u0a76\7\u0148\2\2\u0a75\u0a77\5"+
		"p9\2\u0a76\u0a75\3\2\2\2\u0a76\u0a77\3\2\2\2\u0a77\u0a79\3\2\2\2\u0a78"+
		"\u0a71\3\2\2\2\u0a78\u0a72\3\2\2\2\u0a79\u0a86\3\2\2\2\u0a7a\u0a82\7\u013e"+
		"\2\2\u0a7b\u0a83\5\u014c\u00a7\2\u0a7c\u0a7d\7\u0147\2\2\u0a7d\u0a7e\5"+
		"\u014e\u00a8\2\u0a7e\u0a80\7\u0148\2\2\u0a7f\u0a81\5p9\2\u0a80\u0a7f\3"+
		"\2\2\2\u0a80\u0a81\3\2\2\2\u0a81\u0a83\3\2\2\2\u0a82\u0a7b\3\2\2\2\u0a82"+
		"\u0a7c\3\2\2\2\u0a83\u0a85\3\2\2\2\u0a84\u0a7a\3\2\2\2\u0a85\u0a88\3\2"+
		"\2\2\u0a86\u0a84\3\2\2\2\u0a86\u0a87\3\2\2\2\u0a87\u0151\3\2\2\2\u0a88"+
		"\u0a86\3\2\2\2\u0a89\u0a8a\5\4\3\2\u0a8a\u0153\3\2\2\2\u0a8b\u0a8e\5\u0146"+
		"\u00a4\2\u0a8c\u0a8d\7\u0091\2\2\u0a8d\u0a8f\5\u00d2j\2\u0a8e\u0a8c\3"+
		"\2\2\2\u0a8e\u0a8f\3\2\2\2\u0a8f\u0a90\3\2\2\2\u0a90\u0a92\5\u0150\u00a9"+
		"\2\u0a91\u0a93\5\u015a\u00ae\2\u0a92\u0a91\3\2\2\2\u0a92\u0a93\3\2\2\2"+
		"\u0a93\u0a95\3\2\2\2\u0a94\u0a96\5\u015c\u00af\2\u0a95\u0a94\3\2\2\2\u0a95"+
		"\u0a96\3\2\2\2\u0a96\u0a98\3\2\2\2\u0a97\u0a99\5\u015e\u00b0\2\u0a98\u0a97"+
		"\3\2\2\2\u0a98\u0a99\3\2\2\2\u0a99\u0a9b\3\2\2\2\u0a9a\u0a9c\5\u0156\u00ac"+
		"\2\u0a9b\u0a9a\3\2\2\2\u0a9b\u0a9c\3\2\2\2\u0a9c\u0a9e\3\2\2\2\u0a9d\u0a9f"+
		"\5\u0162\u00b2\2\u0a9e\u0a9d\3\2\2\2\u0a9e\u0a9f\3\2\2\2\u0a9f\u0aa3\3"+
		"\2\2\2\u0aa0\u0aa1\7\u0091\2\2\u0aa1\u0aa2\7\u0110\2\2\u0aa2\u0aa4\5\4"+
		"\3\2\u0aa3\u0aa0\3\2\2\2\u0aa3\u0aa4\3\2\2\2\u0aa4\u0aa8\3\2\2\2\u0aa5"+
		"\u0aa6\7\u0133\2\2\u0aa6\u0aa7\7\u00c0\2\2\u0aa7\u0aa9\7\u00a9\2\2\u0aa8"+
		"\u0aa5\3\2\2\2\u0aa8\u0aa9\3\2\2\2\u0aa9\u0155\3\2\2\2\u0aaa\u0aac\7\u011e"+
		"\2\2\u0aab\u0aad\7\b\2\2\u0aac\u0aab\3\2\2\2\u0aac\u0aad\3\2\2\2\u0aad"+
		"\u0aae\3\2\2\2\u0aae\u0aaf\5\u0158\u00ad\2\u0aaf\u0157\3\2\2\2\u0ab0\u0ab1"+
		"\5\u0146\u00a4\2\u0ab1\u0ab3\5\u0150\u00a9\2\u0ab2\u0ab4\5\u015a\u00ae"+
		"\2\u0ab3\u0ab2\3\2\2\2\u0ab3\u0ab4\3\2\2\2\u0ab4\u0ab6\3\2\2\2\u0ab5\u0ab7"+
		"\5\u015c\u00af\2\u0ab6\u0ab5\3\2\2\2\u0ab6\u0ab7\3\2\2\2\u0ab7\u0ab9\3"+
		"\2\2\2\u0ab8\u0aba\5\u015e\u00b0\2\u0ab9\u0ab8\3\2\2\2\u0ab9\u0aba\3\2"+
		"\2\2\u0aba\u0abc\3\2\2\2\u0abb\u0abd\5\u0156\u00ac\2\u0abc\u0abb\3\2\2"+
		"\2\u0abc\u0abd\3\2\2\2\u0abd\u0159\3\2\2\2\u0abe\u0abf\7\u0130\2\2\u0abf"+
		"\u0ac0\5b\62\2\u0ac0\u015b\3\2\2\2\u0ac1\u0ac2\7\u0080\2\2\u0ac2\u0ac3"+
		"\7 \2\2\u0ac3\u0ac4\5\u00d4k\2\u0ac4\u015d\3\2\2\2\u0ac5\u0ac6\7\u0081"+
		"\2\2\u0ac6\u0ac7\5b\62\2\u0ac7\u015f\3\2\2\2\u0ac8\u0aca\5\u0096L\2\u0ac9"+
		"\u0acb\t#\2\2\u0aca\u0ac9\3\2\2\2\u0aca\u0acb\3\2\2\2\u0acb\u0161\3\2"+
		"\2\2\u0acc\u0acd\7\u00d0\2\2\u0acd\u0ace\7 \2\2\u0ace\u0ad3\5\u0160\u00b1"+
		"\2\u0acf\u0ad0\7\u013e\2\2\u0ad0\u0ad2\5\u0160\u00b1\2\u0ad1\u0acf\3\2"+
		"\2\2\u0ad2\u0ad5\3\2\2\2\u0ad3\u0ad1\3\2\2\2\u0ad3\u0ad4\3\2\2\2\u0ad4"+
		"\u0163\3\2\2\2\u0ad5\u0ad3\3\2\2\2\u0ad6\u0ad7\7\u00a6\2\2\u0ad7\u0ada"+
		"\7y\2\2\u0ad8\u0adb\5\u00aeX\2\u0ad9\u0adb\5J&\2\u0ada\u0ad8\3\2\2\2\u0ada"+
		"\u0ad9\3\2\2\2\u0adb\u0ae1\3\2\2\2\u0adc\u0adf\7M\2\2\u0add\u0ae0\5\u00ae"+
		"X\2\u0ade\u0ae0\5J&\2\u0adf\u0add\3\2\2\2\u0adf\u0ade\3\2\2\2\u0ae0\u0ae2"+
		"\3\2\2\2\u0ae1\u0adc\3\2\2\2\u0ae1\u0ae2\3\2\2\2\u0ae2\u0aed\3\2\2\2\u0ae3"+
		"\u0ae4\7\u008f\2\2\u0ae4\u0ae5\7\u0091\2\2\u0ae5\u0aea\5\u014a\u00a6\2"+
		"\u0ae6\u0ae7\7\u0147\2\2\u0ae7\u0ae8\5\u0132\u009a\2\u0ae8\u0ae9\7\u0148"+
		"\2\2\u0ae9\u0aeb\3\2\2\2\u0aea\u0ae6\3\2\2\2\u0aea\u0aeb\3\2\2\2\u0aeb"+
		"\u0aee\3\2\2\2\u0aec\u0aee\5\u0168\u00b5\2\u0aed\u0ae3\3\2\2\2\u0aed\u0aec"+
		"\3\2\2\2\u0aee\u0aef\3\2\2\2\u0aef\u0af0\5\u0186\u00c4\2\u0af0\u0165\3"+
		"\2\2\2\u0af1\u0af2\7\u0121\2\2\u0af2\u0af5\7\u0116\2\2\u0af3\u0af6\5\u00ae"+
		"X\2\u0af4\u0af6\5J&\2\u0af5\u0af3\3\2\2\2\u0af5\u0af4\3\2\2\2\u0af6\u0afc"+
		"\3\2\2\2\u0af7\u0afa\7M\2\2\u0af8\u0afb\5\u00aeX\2\u0af9\u0afb\5J&\2\u0afa"+
		"\u0af8\3\2\2\2\u0afa\u0af9\3\2\2\2\u0afb\u0afd\3\2\2\2\u0afc\u0af7\3\2"+
		"\2\2\u0afc\u0afd\3\2\2\2\u0afd\u0afe\3\2\2\2\u0afe\u0aff\5\u0140\u00a1"+
		"\2\u0aff\u0b00\5\u0186\u00c4\2\u0b00\u0167\3\2\2\2\u0b01\u0b02\7\u008f"+
		"\2\2\u0b02\u0b03\7\u0091\2\2\u0b03\u0b08\5\u014a\u00a6\2\u0b04\u0b05\7"+
		"\u0147\2\2\u0b05\u0b06\5\u0132\u009a\2\u0b06\u0b07\7\u0148\2\2\u0b07\u0b09"+
		"\3\2\2\2\u0b08\u0b04\3\2\2\2\u0b08\u0b09\3\2\2\2\u0b09\u0b17\3\2\2\2\u0b0a"+
		"\u0b0b\7\u0127\2\2\u0b0b\u0b0c\7\u0147\2\2\u0b0c\u0b11\5\u0096L\2\u0b0d"+
		"\u0b0e\7\u013e\2\2\u0b0e\u0b10\5\u0096L\2\u0b0f\u0b0d\3\2\2\2\u0b10\u0b13"+
		"\3\2\2\2\u0b11\u0b0f\3\2\2\2\u0b11\u0b12\3\2\2\2\u0b12\u0b14\3\2\2\2\u0b13"+
		"\u0b11\3\2\2\2\u0b14\u0b15\7\u0148\2\2\u0b15\u0b18\3\2\2\2\u0b16\u0b18"+
		"\5\u0158\u00ad\2\u0b17\u0b0a\3\2\2\2\u0b17\u0b16\3\2\2\2\u0b18\u0169\3"+
		"\2\2\2\u0b19\u0b1a\7\u0123\2\2\u0b1a\u0b1b\5\u014a\u00a6\2\u0b1b\u0b49"+
		"\7\u00fb\2\2\u0b1c\u0b1d\5\u0142\u00a2\2\u0b1d\u0b1e\7\u0141\2\2\u0b1e"+
		"\u0b26\5\u0096L\2\u0b1f\u0b20\7\u013e\2\2\u0b20\u0b21\5\u0142\u00a2\2"+
		"\u0b21\u0b22\7\u0141\2\2\u0b22\u0b23\5\u0096L\2\u0b23\u0b25\3\2\2\2\u0b24"+
		"\u0b1f\3\2\2\2\u0b25\u0b28\3\2\2\2\u0b26\u0b24\3\2\2\2\u0b26\u0b27\3\2"+
		"\2\2\u0b27\u0b4a\3\2\2\2\u0b28\u0b26\3\2\2\2\u0b29\u0b2a\7\u0147\2\2\u0b2a"+
		"\u0b2b\5\u0132\u009a\2\u0b2b\u0b2c\7\u0148\2\2\u0b2c\u0b34\3\2\2\2\u0b2d"+
		"\u0b2e\5\u0152\u00aa\2\u0b2e\u0b2f\7\u014b\2\2\u0b2f\u0b31\3\2\2\2\u0b30"+
		"\u0b2d\3\2\2\2\u0b30\u0b31\3\2\2\2\u0b31\u0b32\3\2\2\2\u0b32\u0b34\7\u013c"+
		"\2\2\u0b33\u0b29\3\2\2\2\u0b33\u0b30\3\2\2\2\u0b34\u0b35\3\2\2\2\u0b35"+
		"\u0b47\7\u0141\2\2\u0b36\u0b37\7\u0147\2\2\u0b37\u0b3c\5\u0096L\2\u0b38"+
		"\u0b39\7\u013e\2\2\u0b39\u0b3b\5\u0096L\2\u0b3a\u0b38\3\2\2\2\u0b3b\u0b3e"+
		"\3\2\2\2\u0b3c\u0b3a\3\2\2\2\u0b3c\u0b3d\3\2\2\2\u0b3d\u0b3f\3\2\2\2\u0b3e"+
		"\u0b3c\3\2\2\2\u0b3f\u0b40\7\u0148\2\2\u0b40\u0b48\3\2\2\2\u0b41\u0b42"+
		"\5\u0152\u00aa\2\u0b42\u0b43\7\u014b\2\2\u0b43\u0b45\3\2\2\2\u0b44\u0b41"+
		"\3\2\2\2\u0b44\u0b45\3\2\2\2\u0b45\u0b46\3\2\2\2\u0b46\u0b48\7\u013c\2"+
		"\2\u0b47\u0b36\3\2\2\2\u0b47\u0b44\3\2\2\2\u0b48\u0b4a\3\2\2\2\u0b49\u0b1c"+
		"\3\2\2\2\u0b49\u0b33\3\2\2\2\u0b4a\u0b52\3\2\2\2\u0b4b\u0b50\7\u0130\2"+
		"\2\u0b4c\u0b51\5b\62\2\u0b4d\u0b4e\7<\2\2\u0b4e\u0b4f\7\u00c8\2\2\u0b4f"+
		"\u0b51\5\u0136\u009c\2\u0b50\u0b4c\3\2\2\2\u0b50\u0b4d\3\2\2\2\u0b51\u0b53"+
		"\3\2\2\2\u0b52\u0b4b\3\2\2\2\u0b52\u0b53\3\2\2\2\u0b53\u016b\3\2\2\2\u0b54"+
		"\u0b55\7L\2\2\u0b55\u0b56\7y\2\2\u0b56\u0b5e\5\u014a\u00a6\2\u0b57\u0b5c"+
		"\7\u0130\2\2\u0b58\u0b5d\5b\62\2\u0b59\u0b5a\7<\2\2\u0b5a\u0b5b\7\u00c8"+
		"\2\2\u0b5b\u0b5d\5\u0136\u009c\2\u0b5c\u0b58\3\2\2\2\u0b5c\u0b59\3\2\2"+
		"\2\u0b5d\u0b5f\3\2\2\2\u0b5e\u0b57\3\2\2\2\u0b5e\u0b5f\3\2\2\2\u0b5f\u0b60"+
		"\3\2\2\2\u0b60\u0b61\5\u0186\u00c4\2\u0b61\u016d\3\2\2\2\u0b62\u0b67\5"+
		"^\60\2\u0b63\u0b64\7\u013e\2\2\u0b64\u0b66\5^\60\2\u0b65\u0b63\3\2\2\2"+
		"\u0b66\u0b69\3\2\2\2\u0b67\u0b65\3\2\2\2\u0b67\u0b68\3\2\2\2\u0b68\u016f"+
		"\3\2\2\2\u0b69\u0b67\3\2\2\2\u0b6a\u0b6b\7\u00da\2\2\u0b6b\u0b6c\5\u0136"+
		"\u009c\2\u0b6c\u0b6d\7y\2\2\u0b6d\u0b6e\5\u0096L\2\u0b6e\u0b82\3\2\2\2"+
		"\u0b6f\u0b70\7`\2\2\u0b70\u0b73\5\u0136\u009c\2\u0b71\u0b72\7\u0125\2"+
		"\2\u0b72\u0b74\5\u00d2j\2\u0b73\u0b71\3\2\2\2\u0b73\u0b74\3\2\2\2\u0b74"+
		"\u0b82\3\2\2\2\u0b75\u0b78\7x\2\2\u0b76\u0b79\5\u0136\u009c\2\u0b77\u0b79"+
		"\5\u0134\u009b\2\u0b78\u0b76\3\2\2\2\u0b78\u0b77\3\2\2\2\u0b79\u0b82\3"+
		"\2\2\2\u0b7a\u0b7b\7\u00a8\2\2\u0b7b\u0b7c\7\u010d\2\2\u0b7c\u0b7d\5\u0096"+
		"L\2\u0b7d\u0b7e\7\u0088\2\2\u0b7e\u0b7f\t%\2\2\u0b7f\u0b80\7\u00b6\2\2"+
		"\u0b80\u0b82\3\2\2\2\u0b81\u0b6a\3\2\2\2\u0b81\u0b6f\3\2\2\2\u0b81\u0b75"+
		"\3\2\2\2\u0b81\u0b7a\3\2\2\2\u0b82\u0171\3\2\2\2\u0b83\u0b84\7\u0123\2"+
		"\2\u0b84\u0b88\7\u0109\2\2\u0b85\u0b86\7q\2\2\u0b86\u0b87\7\u010d\2\2"+
		"\u0b87\u0b89\5\u014a\u00a6\2\u0b88\u0b85\3\2\2\2\u0b88\u0b89\3\2\2\2\u0b89"+
		"\u0ba8\3\2\2\2\u0b8a\u0b8b\7\u00fb\2\2\u0b8b\u0b8c\7\u00a8\2\2\u0b8c\u0b8d"+
		"\7\u00b6\2\2\u0b8d\u0b94\7\u0116\2\2\u0b8e\u0b90\7\u012b\2\2\u0b8f\u0b91"+
		"\7\u0160\2\2\u0b90\u0b8f\3\2\2\2\u0b90\u0b91\3\2\2\2\u0b91\u0b95\3\2\2"+
		"\2\u0b92\u0b93\7\u00c1\2\2\u0b93\u0b95\7\u012b\2\2\u0b94\u0b8e\3\2\2\2"+
		"\u0b94\u0b92\3\2\2\2\u0b95\u0ba8\3\2\2\2\u0b96\u0b97\7\u00fb\2\2\u0b97"+
		"\u0b98\7c\2\2\u0b98\u0ba8\t\36\2\2\u0b99\u0b9a\7\u00fb\2\2\u0b9a\u0b9b"+
		"\7\u009a\2\2\u0b9b\u0ba0\7\u0116\2\2\u0b9c\u0b9d\7=\2\2\u0b9d\u0ba1\7"+
		"\u0108\2\2\u0b9e\u0b9f\t&\2\2\u0b9f\u0ba1\7\u00e5\2\2\u0ba0\u0b9c\3\2"+
		"\2\2\u0ba0\u0b9e\3\2\2\2\u0ba1\u0ba8\3\2\2\2\u0ba2\u0ba4\7\u00fb\2\2\u0ba3"+
		"\u0ba5\7\37\2\2\u0ba4\u0ba3\3\2\2\2\u0ba4\u0ba5\3\2\2\2\u0ba5\u0ba6\3"+
		"\2\2\2\u0ba6\u0ba8\7\u00a9\2\2\u0ba7\u0b83\3\2\2\2\u0ba7\u0b8a\3\2\2\2"+
		"\u0ba7\u0b96\3\2\2\2\u0ba7\u0b99\3\2\2\2\u0ba7\u0ba2\3\2\2\2\u0ba8\u0173"+
		"\3\2\2\2\u0ba9\u0baa\7?\2\2\u0baa\u0bad\5\u0190\u00c9\2\u0bab\u0bac\7"+
		"\u014c\2\2\u0bac\u0bae\5\u0190\u00c9\2\u0bad\u0bab\3\2\2\2\u0bad\u0bae"+
		"\3\2\2\2\u0bae\u0bb0\3\2\2\2\u0baf\u0bb1\7^\2\2\u0bb0\u0baf\3\2\2\2\u0bb0"+
		"\u0bb1\3\2\2\2\u0bb1\u0bb3\3\2\2\2\u0bb2\u0bb4\7\u013f\2\2\u0bb3\u0bb2"+
		"\3\2\2\2\u0bb3\u0bb4\3\2\2\2\u0bb4\u0175\3\2\2\2\u0bb5\u0bb6\7+\2\2\u0bb6"+
		"\u0bb7\7?\2\2\u0bb7\u0177\3\2\2\2\u0bb8\u0bc0\5\u017a\u00be\2\u0bb9\u0bba"+
		"\7\26\2\2\u0bba\u0bc0\7\u0137\2\2\u0bbb\u0bbc\7\61\2\2\u0bbc\u0bc0\7\u0137"+
		"\2\2\u0bbd\u0bbe\7\u00f2\2\2\u0bbe\u0bc0\7\u0137\2\2\u0bbf\u0bb8\3\2\2"+
		"\2\u0bbf\u0bb9\3\2\2\2\u0bbf\u0bbb\3\2\2\2\u0bbf\u0bbd\3\2\2\2\u0bc0\u0179"+
		"\3\2\2\2\u0bc1\u0bc2\7\u012f\2\2\u0bc2\u0bc3\5\u017c\u00bf\2\u0bc3\u0bc4"+
		"\5\u017e\u00c0\2\u0bc4\u0bc5\5\u0186\u00c4\2\u0bc5\u017b\3\2\2\2\u0bc6"+
		"\u0bc7\7\u00c1\2\2\u0bc7\u0bce\7v\2\2\u0bc8\u0bca\7\13\2\2\u0bc9\u0bc8"+
		"\3\2\2\2\u0bc9\u0bca\3\2\2\2\u0bca\u0bcb\3\2\2\2\u0bcb\u0bce\t\'\2\2\u0bcc"+
		"\u0bce\t(\2\2\u0bcd\u0bc6\3\2\2\2\u0bcd\u0bc9\3\2\2\2\u0bcd\u0bcc\3\2"+
		"\2\2\u0bce\u017d\3\2\2\2\u0bcf\u0bdc\t)\2\2\u0bd0\u0bd1\7#\2\2\u0bd1\u0bdc"+
		"\5\4\3\2\u0bd2\u0bd3\7}\2\2\u0bd3\u0bd6\7\u0116\2\2\u0bd4\u0bd6\7~\2\2"+
		"\u0bd5\u0bd2\3\2\2\2\u0bd5\u0bd4\3\2\2\2\u0bd6\u0bd8\3\2\2\2\u0bd7\u0bd9"+
		"\7\u0140\2\2\u0bd8\u0bd7\3\2\2\2\u0bd8\u0bd9\3\2\2\2\u0bd9\u0bda\3\2\2"+
		"\2\u0bda\u0bdc\5\4\3\2\u0bdb\u0bcf\3\2\2\2\u0bdb\u0bd0\3\2\2\2\u0bdb\u0bd5"+
		"\3\2\2\2\u0bdc\u017f\3\2\2\2\u0bdd\u0bde\7\u00ec\2\2\u0bde\u0be0\5\4\3"+
		"\2\u0bdf\u0be1\5\22\n\2\u0be0\u0bdf\3\2\2\2\u0be0\u0be1\3\2\2\2\u0be1"+
		"\u0be3\3\2\2\2\u0be2\u0be4\5\30\r\2\u0be3\u0be2\3\2\2\2\u0be3\u0be4\3"+
		"\2\2\2\u0be4\u0be6\3\2\2\2\u0be5\u0be7\5\u0182\u00c2\2\u0be6\u0be5\3\2"+
		"\2\2\u0be6\u0be7\3\2\2\2\u0be7\u0bee\3\2\2\2\u0be8\u0bea\7\u00d0\2\2\u0be9"+
		"\u0beb\7f\2\2\u0bea\u0be9\3\2\2\2\u0bea\u0beb\3\2\2\2\u0beb\u0bec\3\2"+
		"\2\2\u0bec\u0bed\7 \2\2\u0bed\u0bef\5\u00d2j\2\u0bee\u0be8\3\2\2\2\u0bee"+
		"\u0bef\3\2\2\2\u0bef\u0bf1\3\2\2\2\u0bf0\u0bf2\5\u0184\u00c3\2\u0bf1\u0bf0"+
		"\3\2\2\2\u0bf1\u0bf2\3\2\2\2\u0bf2\u0bf3\3\2\2\2\u0bf3\u0bf4\7Z\2\2\u0bf4"+
		"\u0bf5\7\u00ec\2\2\u0bf5\u0181\3\2\2\2\u0bf6\u0bff\7\u00d1\2\2\u0bf7\u0bf8"+
		"\7\u00ec\2\2\u0bf8\u0bfd\7\u0116\2\2\u0bf9\u0bfe\5J&\2\u0bfa\u0bfb\7\u00d8"+
		"\2\2\u0bfb\u0bfe\5J&\2\u0bfc\u0bfe\7\u00dd\2\2\u0bfd\u0bf9\3\2\2\2\u0bfd"+
		"\u0bfa\3\2\2\2\u0bfd\u0bfc\3\2\2\2\u0bfe\u0c00\3\2\2\2\u0bff\u0bf7\3\2"+
		"\2\2\u0bff\u0c00\3\2\2\2\u0c00\u0c16\3\2\2\2\u0c01\u0c02\7\u009f\2\2\u0c02"+
		"\u0c03\7\u00b0\2\2\u0c03\u0c15\5\u00acW\2\u0c04\u0c05\7\u00f1\2\2\u0c05"+
		"\u0c06\7\u00b0\2\2\u0c06\u0c15\5\u00acW\2\u0c07\u0c08\7\u0118\2\2\u0c08"+
		"\u0c09\7\u00b0\2\2\u0c09\u0c15\5\u00acW\2\u0c0a\u0c0b\7\36\2\2\u0c0b\u0c0c"+
		"\7\u00b0\2\2\u0c0c\u0c15\5\u00acW\2\u0c0d\u0c0e\7\u00d4\2\2\u0c0e\u0c0f"+
		"\7\u00a0\2\2\u0c0f\u0c15\5\u00acW\2\u0c10\u0c11\7\u0118\2\2\u0c11\u0c12"+
		"\7\u00c8\2\2\u0c12\u0c13\7\u00d4\2\2\u0c13\u0c15\5J&\2\u0c14\u0c01\3\2"+
		"\2\2\u0c14\u0c04\3\2\2\2\u0c14\u0c07\3\2\2\2\u0c14\u0c0a\3\2\2\2\u0c14"+
		"\u0c0d\3\2\2\2\u0c14\u0c10\3\2\2\2\u0c15\u0c18\3\2\2\2\u0c16\u0c14\3\2"+
		"\2\2\u0c16\u0c17\3\2\2\2\u0c17\u0183\3\2\2\2\u0c18\u0c16\3\2\2\2\u0c19"+
		"\u0c35\7s\2\2\u0c1a\u0c1b\7]\2\2\u0c1b\u0c36\7\u00f3\2\2\u0c1c\u0c1e\7"+
		"m\2\2\u0c1d\u0c1c\3\2\2\2\u0c1d\u0c1e\3\2\2\2\u0c1e\u0c1f\3\2\2\2\u0c1f"+
		"\u0c20\7\u00d4\2\2\u0c20\u0c2f\7\u0082\2\2\u0c21\u0c22\7\u00d4\2\2\u0c22"+
		"\u0c2f\7\u0119\2\2\u0c23\u0c28\7\u00ca\2\2\u0c24\u0c25\7]\2\2\u0c25\u0c29"+
		"\7\u00f3\2\2\u0c26\u0c27\7\u009e\2\2\u0c27\u0c29\7\u00f3\2\2\u0c28\u0c24"+
		"\3\2\2\2\u0c28\u0c26\3\2\2\2\u0c29\u0c2f\3\2\2\2\u0c2a\u0c2b\t\32\2\2"+
		"\u0c2b\u0c2c\7\u0080\2\2\u0c2c\u0c2d\7\u00c8\2\2\u0c2d\u0c2f\5\u00aeX"+
		"\2\u0c2e\u0c1d\3\2\2\2\u0c2e\u0c21\3\2\2\2\u0c2e\u0c23\3\2\2\2\u0c2e\u0c2a"+
		"\3\2\2\2\u0c2f\u0c30\3\2\2\2\u0c30\u0c32\5N(\2\u0c31\u0c2e\3\2\2\2\u0c32"+
		"\u0c33\3\2\2\2\u0c33\u0c31\3\2\2\2\u0c33\u0c34\3\2\2\2\u0c34\u0c36\3\2"+
		"\2\2\u0c35\u0c1a\3\2\2\2\u0c35\u0c31\3\2\2\2\u0c36\u0185\3\2\2\2\u0c37"+
		"\u0c38\7\u0155\2\2\u0c38\u0187\3\2\2\2\u0c39\u0c3c\5\u018a\u00c6\2\u0c3a"+
		"\u0c3c\5\u018c\u00c7\2\u0c3b\u0c39\3\2\2\2\u0c3b\u0c3a\3\2\2\2\u0c3c\u0189"+
		"\3\2\2\2\u0c3d\u0c3e\7\u0150\2\2\u0c3e\u018b\3\2\2\2\u0c3f\u0c40\7\u0151"+
		"\2\2\u0c40\u018d\3\2\2\2\u0c41\u0c42\t\13\2\2\u0c42\u018f\3\2\2\2\u0c43"+
		"\u0c46\t*\2\2\u0c44\u0c46\5\4\3\2\u0c45\u0c43\3\2\2\2\u0c45\u0c44\3\2"+
		"\2\2\u0c46\u0191\3\2\2\2\u0199\u0193\u0196\u0199\u019d\u01a4\u01a9\u01ac"+
		"\u01b5\u01b7\u01bf\u01c1\u01c5\u01ca\u01cf\u01d9\u01e3\u01ed\u01f4\u01fc"+
		"\u0204\u0211\u0214\u021a\u0224\u022e\u0232\u0239\u023b\u0242\u024b\u024d"+
		"\u0254\u026b\u0272\u027b\u0284\u028d\u0296\u029f\u02a6\u02ac\u02b0\u02b4"+
		"\u02b8\u02bc\u02c0\u02c7\u02cc\u02d5\u02e0\u02eb\u02f5\u02ff\u0306\u030c"+
		"\u030e\u0314\u031a\u0321\u0326\u032e\u0334\u033e\u0349\u034c\u034f\u0357"+
		"\u035a\u0360\u0364\u036f\u0372\u0379\u037f\u0385\u038b\u038f\u0395\u039f"+
		"\u03a6\u03bb\u03c0\u03c7\u03cc\u03d2\u03d8\u03de\u03e9\u03ed\u03f5\u03fa"+
		"\u0404\u040a\u040f\u0414\u0419\u041e\u0425\u0428\u042f\u0436\u0439\u0444"+
		"\u0450\u0464\u046c\u0475\u047e\u048a\u0496\u0499\u04a3\u04a6\u04ad\u04b5"+
		"\u04bc\u04be\u04cf\u04d2\u04da\u04e5\u04eb\u04f6\u04fa\u0503\u0506\u0509"+
		"\u050d\u0513\u051b\u0521\u0525\u0531\u0538\u0540\u0542\u054a\u054e\u0554"+
		"\u0558\u055a\u0562\u0567\u0572\u0576\u058a\u058e\u0592\u0596\u05a1\u05a9"+
		"\u05b1\u05b5\u05ba\u05bc\u05c8\u05cd\u05d1\u05d7\u05e0\u05ed\u05ef\u0601"+
		"\u0603\u0613\u061c\u0627\u062a\u0632\u063b\u063e\u0649\u064f\u0651\u0653"+
		"\u065a\u0665\u0667\u067d\u067f\u0682\u068c\u0694\u0697\u069b\u06a5\u06b1"+
		"\u06b4\u06b8\u06bf\u06c3\u06cb\u06d1\u06d3\u06d5\u06da\u06e3\u06eb\u06fe"+
		"\u0705\u070e\u0713\u071a\u0726\u0735\u0738\u073c\u0741\u0746\u074e\u0753"+
		"\u0758\u075e\u0768\u0772\u077a\u0784\u0786\u0789\u0793\u0797\u079f\u07a3"+
		"\u07ab\u07af\u07b3\u07b8\u07bb\u07c3\u07c7\u07cc\u07dc\u07e2\u07e8\u07ea"+
		"\u07f0\u07fb\u0800\u0807\u080c\u0811\u0814\u0818\u081d\u0822\u0829\u0831"+
		"\u0836\u0839\u083e\u0843\u084d\u0851\u0855\u0857\u085d\u0863\u086a\u0870"+
		"\u0877\u087d\u0884\u0888\u088f\u0898\u089e\u08a0\u08ac\u08ae\u08b5\u08d3"+
		"\u08f4\u08fc\u0904\u0908\u091a\u0923\u0944\u0947\u0950\u0956\u0958\u0961"+
		"\u096c\u0974\u0976\u097a\u0980\u0985\u0987\u0993\u0998\u09a2\u09a8\u09aa"+
		"\u09b1\u09c0\u09c2\u09c4\u09c8\u09d1\u09d4\u09d9\u09db\u09e2\u09ec\u09f3"+
		"\u09f7\u09fc\u0a01\u0a08\u0a0c\u0a0f\u0a18\u0a1d\u0a21\u0a29\u0a31\u0a38"+
		"\u0a3e\u0a40\u0a44\u0a49\u0a4d\u0a53\u0a60\u0a63\u0a68\u0a6c\u0a76\u0a78"+
		"\u0a80\u0a82\u0a86\u0a8e\u0a92\u0a95\u0a98\u0a9b\u0a9e\u0aa3\u0aa8\u0aac"+
		"\u0ab3\u0ab6\u0ab9\u0abc\u0aca\u0ad3\u0ada\u0adf\u0ae1\u0aea\u0aed\u0af5"+
		"\u0afa\u0afc\u0b08\u0b11\u0b17\u0b26\u0b30\u0b33\u0b3c\u0b44\u0b47\u0b49"+
		"\u0b50\u0b52\u0b5c\u0b5e\u0b67\u0b73\u0b78\u0b81\u0b88\u0b90\u0b94\u0ba0"+
		"\u0ba4\u0ba7\u0bad\u0bb0\u0bb3\u0bbf\u0bc9\u0bcd\u0bd5\u0bd8\u0bdb\u0be0"+
		"\u0be3\u0be6\u0bea\u0bee\u0bf1\u0bfd\u0bff\u0c14\u0c16\u0c1d\u0c28\u0c2e"+
		"\u0c33\u0c35\u0c3b\u0c45";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}