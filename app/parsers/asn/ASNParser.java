// Generated from asn/ASN.g4 by ANTLR 4.7.1
package parsers.asn;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ASNParser extends Parser {
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
	public static final int
		RULE_moduleDefinition = 0, RULE_tagDefault = 1, RULE_extensionDefault = 2, 
		RULE_moduleBody = 3, RULE_exports = 4, RULE_symbolsExported = 5, RULE_imports = 6, 
		RULE_symbolsImported = 7, RULE_symbolsFromModuleList = 8, RULE_symbolsFromModule = 9, 
		RULE_globalModuleReference = 10, RULE_assignedIdentifier = 11, RULE_symbolList = 12, 
		RULE_symbol = 13, RULE_assignmentList = 14, RULE_assignment = 15, RULE_sequenceType = 16, 
		RULE_extensionAndException = 17, RULE_optionalExtensionMarker = 18, RULE_componentTypeLists = 19, 
		RULE_rootComponentTypeList = 20, RULE_componentTypeList = 21, RULE_componentType = 22, 
		RULE_extensionAdditions = 23, RULE_extensionAdditionList = 24, RULE_extensionAddition = 25, 
		RULE_extensionAdditionGroup = 26, RULE_versionNumber = 27, RULE_sequenceOfType = 28, 
		RULE_sizeConstraint = 29, RULE_parameterizedAssignment = 30, RULE_parameterList = 31, 
		RULE_parameter = 32, RULE_paramGovernor = 33, RULE_governor = 34, RULE_objectClassAssignment = 35, 
		RULE_objectClass = 36, RULE_definedObjectClass = 37, RULE_usefulObjectClassReference = 38, 
		RULE_externalObjectClassReference = 39, RULE_objectClassDefn = 40, RULE_withSyntaxSpec = 41, 
		RULE_syntaxList = 42, RULE_tokenOrGroupSpec = 43, RULE_optionalGroup = 44, 
		RULE_requiredToken = 45, RULE_literal = 46, RULE_primitiveFieldName = 47, 
		RULE_fieldSpec = 48, RULE_typeFieldSpec = 49, RULE_typeOptionalitySpec = 50, 
		RULE_fixedTypeValueFieldSpec = 51, RULE_valueOptionalitySpec = 52, RULE_variableTypeValueFieldSpec = 53, 
		RULE_fixedTypeValueSetFieldSpec = 54, RULE_valueSetOptionalitySpec = 55, 
		RULE_object = 56, RULE_parameterizedObject = 57, RULE_definedObject = 58, 
		RULE_objectSet = 59, RULE_objectSetSpec = 60, RULE_fieldName = 61, RULE_valueSet = 62, 
		RULE_elementSetSpecs = 63, RULE_rootElementSetSpec = 64, RULE_additionalElementSetSpec = 65, 
		RULE_elementSetSpec = 66, RULE_unions = 67, RULE_exclusions = 68, RULE_intersections = 69, 
		RULE_unionMark = 70, RULE_intersectionMark = 71, RULE_elements = 72, RULE_objectSetElements = 73, 
		RULE_intersectionElements = 74, RULE_subtypeElements = 75, RULE_variableTypeValueSetFieldSpec = 76, 
		RULE_objectFieldSpec = 77, RULE_objectOptionalitySpec = 78, RULE_objectSetFieldSpec = 79, 
		RULE_objectSetOptionalitySpec = 80, RULE_typeAssignment = 81, RULE_valueAssignment = 82, 
		RULE_asnType = 83, RULE_builtinType = 84, RULE_objectClassFieldType = 85, 
		RULE_setType = 86, RULE_setOfType = 87, RULE_referencedType = 88, RULE_definedType = 89, 
		RULE_constraint = 90, RULE_constraintSpec = 91, RULE_userDefinedConstraint = 92, 
		RULE_generalConstraint = 93, RULE_userDefinedConstraintParameter = 94, 
		RULE_tableConstraint = 95, RULE_simpleTableConstraint = 96, RULE_contentsConstraint = 97, 
		RULE_subtypeConstraint = 98, RULE_value = 99, RULE_builtinValue = 100, 
		RULE_objectIdentifierValue = 101, RULE_objIdComponentsList = 102, RULE_objIdComponents = 103, 
		RULE_integerValue = 104, RULE_choiceValue = 105, RULE_enumeratedValue = 106, 
		RULE_signedNumber = 107, RULE_choiceType = 108, RULE_alternativeTypeLists = 109, 
		RULE_extensionAdditionAlternatives = 110, RULE_extensionAdditionAlternativesList = 111, 
		RULE_extensionAdditionAlternative = 112, RULE_extensionAdditionAlternativesGroup = 113, 
		RULE_rootAlternativeTypeList = 114, RULE_alternativeTypeList = 115, RULE_namedType = 116, 
		RULE_enumeratedType = 117, RULE_enumerations = 118, RULE_rootEnumeration = 119, 
		RULE_enumeration = 120, RULE_enumerationItem = 121, RULE_namedNumber = 122, 
		RULE_definedValue = 123, RULE_parameterizedValue = 124, RULE_simpleDefinedValue = 125, 
		RULE_actualParameterList = 126, RULE_actualParameter = 127, RULE_exceptionSpec = 128, 
		RULE_exceptionIdentification = 129, RULE_additionalEnumeration = 130, 
		RULE_integerType = 131, RULE_namedNumberList = 132, RULE_objectidentifiertype = 133, 
		RULE_componentRelationConstraint = 134, RULE_atNotation = 135, RULE_level = 136, 
		RULE_componentIdList = 137, RULE_octetStringType = 138, RULE_bitStringType = 139, 
		RULE_namedBitList = 140, RULE_namedBit = 141, RULE_booleanValue = 142;
	public static final String[] ruleNames = {
		"moduleDefinition", "tagDefault", "extensionDefault", "moduleBody", "exports", 
		"symbolsExported", "imports", "symbolsImported", "symbolsFromModuleList", 
		"symbolsFromModule", "globalModuleReference", "assignedIdentifier", "symbolList", 
		"symbol", "assignmentList", "assignment", "sequenceType", "extensionAndException", 
		"optionalExtensionMarker", "componentTypeLists", "rootComponentTypeList", 
		"componentTypeList", "componentType", "extensionAdditions", "extensionAdditionList", 
		"extensionAddition", "extensionAdditionGroup", "versionNumber", "sequenceOfType", 
		"sizeConstraint", "parameterizedAssignment", "parameterList", "parameter", 
		"paramGovernor", "governor", "objectClassAssignment", "objectClass", "definedObjectClass", 
		"usefulObjectClassReference", "externalObjectClassReference", "objectClassDefn", 
		"withSyntaxSpec", "syntaxList", "tokenOrGroupSpec", "optionalGroup", "requiredToken", 
		"literal", "primitiveFieldName", "fieldSpec", "typeFieldSpec", "typeOptionalitySpec", 
		"fixedTypeValueFieldSpec", "valueOptionalitySpec", "variableTypeValueFieldSpec", 
		"fixedTypeValueSetFieldSpec", "valueSetOptionalitySpec", "object", "parameterizedObject", 
		"definedObject", "objectSet", "objectSetSpec", "fieldName", "valueSet", 
		"elementSetSpecs", "rootElementSetSpec", "additionalElementSetSpec", "elementSetSpec", 
		"unions", "exclusions", "intersections", "unionMark", "intersectionMark", 
		"elements", "objectSetElements", "intersectionElements", "subtypeElements", 
		"variableTypeValueSetFieldSpec", "objectFieldSpec", "objectOptionalitySpec", 
		"objectSetFieldSpec", "objectSetOptionalitySpec", "typeAssignment", "valueAssignment", 
		"asnType", "builtinType", "objectClassFieldType", "setType", "setOfType", 
		"referencedType", "definedType", "constraint", "constraintSpec", "userDefinedConstraint", 
		"generalConstraint", "userDefinedConstraintParameter", "tableConstraint", 
		"simpleTableConstraint", "contentsConstraint", "subtypeConstraint", "value", 
		"builtinValue", "objectIdentifierValue", "objIdComponentsList", "objIdComponents", 
		"integerValue", "choiceValue", "enumeratedValue", "signedNumber", "choiceType", 
		"alternativeTypeLists", "extensionAdditionAlternatives", "extensionAdditionAlternativesList", 
		"extensionAdditionAlternative", "extensionAdditionAlternativesGroup", 
		"rootAlternativeTypeList", "alternativeTypeList", "namedType", "enumeratedType", 
		"enumerations", "rootEnumeration", "enumeration", "enumerationItem", "namedNumber", 
		"definedValue", "parameterizedValue", "simpleDefinedValue", "actualParameterList", 
		"actualParameter", "exceptionSpec", "exceptionIdentification", "additionalEnumeration", 
		"integerType", "namedNumberList", "objectidentifiertype", "componentRelationConstraint", 
		"atNotation", "level", "componentIdList", "octetStringType", "bitStringType", 
		"namedBitList", "namedBit", "booleanValue"
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

	@Override
	public String getGrammarFileName() { return "ASN.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ASNParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModuleDefinitionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ASNParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ASNParser.IDENTIFIER, i);
		}
		public TerminalNode DEFINITIONS_LITERAL() { return getToken(ASNParser.DEFINITIONS_LITERAL, 0); }
		public TagDefaultContext tagDefault() {
			return getRuleContext(TagDefaultContext.class,0);
		}
		public ExtensionDefaultContext extensionDefault() {
			return getRuleContext(ExtensionDefaultContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(ASNParser.ASSIGN_OP, 0); }
		public TerminalNode BEGIN_LITERAL() { return getToken(ASNParser.BEGIN_LITERAL, 0); }
		public ModuleBodyContext moduleBody() {
			return getRuleContext(ModuleBodyContext.class,0);
		}
		public TerminalNode END_LITERAL() { return getToken(ASNParser.END_LITERAL, 0); }
		public TerminalNode L_BRACE() { return getToken(ASNParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(ASNParser.R_BRACE, 0); }
		public List<TerminalNode> L_PARAN() { return getTokens(ASNParser.L_PARAN); }
		public TerminalNode L_PARAN(int i) {
			return getToken(ASNParser.L_PARAN, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ASNParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ASNParser.NUMBER, i);
		}
		public List<TerminalNode> R_PARAN() { return getTokens(ASNParser.R_PARAN); }
		public TerminalNode R_PARAN(int i) {
			return getToken(ASNParser.R_PARAN, i);
		}
		public ModuleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterModuleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitModuleDefinition(this);
		}
	}

	public final ModuleDefinitionContext moduleDefinition() throws RecognitionException {
		ModuleDefinitionContext _localctx = new ModuleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_moduleDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(IDENTIFIER);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_BRACE) {
				{
				setState(287);
				match(L_BRACE);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIER) {
					{
					{
					setState(288);
					match(IDENTIFIER);
					setState(289);
					match(L_PARAN);
					setState(290);
					match(NUMBER);
					setState(291);
					match(R_PARAN);
					}
					}
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(297);
				match(R_BRACE);
				}
			}

			setState(300);
			match(DEFINITIONS_LITERAL);
			setState(301);
			tagDefault();
			setState(302);
			extensionDefault();
			setState(303);
			match(ASSIGN_OP);
			setState(304);
			match(BEGIN_LITERAL);
			setState(305);
			moduleBody();
			setState(306);
			match(END_LITERAL);
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

	public static class TagDefaultContext extends ParserRuleContext {
		public TerminalNode TAGS_LITERAL() { return getToken(ASNParser.TAGS_LITERAL, 0); }
		public TerminalNode EXPLICIT_LITERAL() { return getToken(ASNParser.EXPLICIT_LITERAL, 0); }
		public TerminalNode IMPLICIT_LITERAL() { return getToken(ASNParser.IMPLICIT_LITERAL, 0); }
		public TerminalNode AUTOMATIC_LITERAL() { return getToken(ASNParser.AUTOMATIC_LITERAL, 0); }
		public TagDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterTagDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitTagDefault(this);
		}
	}

	public final TagDefaultContext tagDefault() throws RecognitionException {
		TagDefaultContext _localctx = new TagDefaultContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tagDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (EXPLICIT_LITERAL - 70)) | (1L << (IMPLICIT_LITERAL - 70)) | (1L << (AUTOMATIC_LITERAL - 70)))) != 0)) {
				{
				setState(308);
				_la = _input.LA(1);
				if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (EXPLICIT_LITERAL - 70)) | (1L << (IMPLICIT_LITERAL - 70)) | (1L << (AUTOMATIC_LITERAL - 70)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(309);
				match(TAGS_LITERAL);
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

	public static class ExtensionDefaultContext extends ParserRuleContext {
		public TerminalNode EXTENSIBILITY_LITERAL() { return getToken(ASNParser.EXTENSIBILITY_LITERAL, 0); }
		public TerminalNode IMPLIED_LITERAL() { return getToken(ASNParser.IMPLIED_LITERAL, 0); }
		public ExtensionDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterExtensionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitExtensionDefault(this);
		}
	}

	public final ExtensionDefaultContext extensionDefault() throws RecognitionException {
		ExtensionDefaultContext _localctx = new ExtensionDefaultContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_extensionDefault);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENSIBILITY_LITERAL) {
				{
				setState(312);
				match(EXTENSIBILITY_LITERAL);
				setState(313);
				match(IMPLIED_LITERAL);
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

	public static class ModuleBodyContext extends ParserRuleContext {
		public ExportsContext exports() {
			return getRuleContext(ExportsContext.class,0);
		}
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public ModuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moduleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterModuleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitModuleBody(this);
		}
	}

	public final ModuleBodyContext moduleBody() throws RecognitionException {
		ModuleBodyContext _localctx = new ModuleBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_moduleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IMPORTS_LITERAL - 66)) | (1L << (EXPORTS_LITERAL - 66)) | (1L << (IDENTIFIER - 66)))) != 0)) {
				{
				setState(316);
				exports();
				setState(317);
				imports();
				setState(318);
				assignmentList();
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

	public static class ExportsContext extends ParserRuleContext {
		public TerminalNode EXPORTS_LITERAL() { return getToken(ASNParser.EXPORTS_LITERAL, 0); }
		public SymbolsExportedContext symbolsExported() {
			return getRuleContext(SymbolsExportedContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(ASNParser.SEMI_COLON, 0); }
		public TerminalNode ALL_LITERAL() { return getToken(ASNParser.ALL_LITERAL, 0); }
		public ExportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterExports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitExports(this);
		}
	}

	public final ExportsContext exports() throws RecognitionException {
		ExportsContext _localctx = new ExportsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exports);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(322);
				match(EXPORTS_LITERAL);
				setState(323);
				symbolsExported();
				setState(324);
				match(SEMI_COLON);
				}
				break;
			case 2:
				{
				setState(326);
				match(EXPORTS_LITERAL);
				setState(327);
				match(ALL_LITERAL);
				setState(328);
				match(SEMI_COLON);
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

	public static class SymbolsExportedContext extends ParserRuleContext {
		public SymbolListContext symbolList() {
			return getRuleContext(SymbolListContext.class,0);
		}
		public SymbolsExportedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolsExported; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterSymbolsExported(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitSymbolsExported(this);
		}
	}

	public final SymbolsExportedContext symbolsExported() throws RecognitionException {
		SymbolsExportedContext _localctx = new SymbolsExportedContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_symbolsExported);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(331);
				symbolList();
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

	public static class ImportsContext extends ParserRuleContext {
		public TerminalNode IMPORTS_LITERAL() { return getToken(ASNParser.IMPORTS_LITERAL, 0); }
		public SymbolsImportedContext symbolsImported() {
			return getRuleContext(SymbolsImportedContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(ASNParser.SEMI_COLON, 0); }
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterImports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitImports(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_imports);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTS_LITERAL) {
				{
				setState(334);
				match(IMPORTS_LITERAL);
				setState(335);
				symbolsImported();
				setState(336);
				match(SEMI_COLON);
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

	public static class SymbolsImportedContext extends ParserRuleContext {
		public SymbolsFromModuleListContext symbolsFromModuleList() {
			return getRuleContext(SymbolsFromModuleListContext.class,0);
		}
		public SymbolsImportedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolsImported; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterSymbolsImported(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitSymbolsImported(this);
		}
	}

	public final SymbolsImportedContext symbolsImported() throws RecognitionException {
		SymbolsImportedContext _localctx = new SymbolsImportedContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_symbolsImported);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(340);
				symbolsFromModuleList();
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

	public static class SymbolsFromModuleListContext extends ParserRuleContext {
		public List<SymbolsFromModuleContext> symbolsFromModule() {
			return getRuleContexts(SymbolsFromModuleContext.class);
		}
		public SymbolsFromModuleContext symbolsFromModule(int i) {
			return getRuleContext(SymbolsFromModuleContext.class,i);
		}
		public SymbolsFromModuleListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolsFromModuleList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterSymbolsFromModuleList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitSymbolsFromModuleList(this);
		}
	}

	public final SymbolsFromModuleListContext symbolsFromModuleList() throws RecognitionException {
		SymbolsFromModuleListContext _localctx = new SymbolsFromModuleListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_symbolsFromModuleList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(343);
			symbolsFromModule();
			}
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(344);
				symbolsFromModule();
				}
				}
				setState(349);
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

	public static class SymbolsFromModuleContext extends ParserRuleContext {
		public SymbolListContext symbolList() {
			return getRuleContext(SymbolListContext.class,0);
		}
		public TerminalNode FROM_LITERAL() { return getToken(ASNParser.FROM_LITERAL, 0); }
		public GlobalModuleReferenceContext globalModuleReference() {
			return getRuleContext(GlobalModuleReferenceContext.class,0);
		}
		public SymbolsFromModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolsFromModule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterSymbolsFromModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitSymbolsFromModule(this);
		}
	}

	public final SymbolsFromModuleContext symbolsFromModule() throws RecognitionException {
		SymbolsFromModuleContext _localctx = new SymbolsFromModuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_symbolsFromModule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			symbolList();
			setState(351);
			match(FROM_LITERAL);
			setState(352);
			globalModuleReference();
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

	public static class GlobalModuleReferenceContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public AssignedIdentifierContext assignedIdentifier() {
			return getRuleContext(AssignedIdentifierContext.class,0);
		}
		public GlobalModuleReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globalModuleReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterGlobalModuleReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitGlobalModuleReference(this);
		}
	}

	public final GlobalModuleReferenceContext globalModuleReference() throws RecognitionException {
		GlobalModuleReferenceContext _localctx = new GlobalModuleReferenceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_globalModuleReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(IDENTIFIER);
			setState(355);
			assignedIdentifier();
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

	public static class AssignedIdentifierContext extends ParserRuleContext {
		public AssignedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterAssignedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitAssignedIdentifier(this);
		}
	}

	public final AssignedIdentifierContext assignedIdentifier() throws RecognitionException {
		AssignedIdentifierContext _localctx = new AssignedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class SymbolListContext extends ParserRuleContext {
		public List<SymbolContext> symbol() {
			return getRuleContexts(SymbolContext.class);
		}
		public SymbolContext symbol(int i) {
			return getRuleContext(SymbolContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ASNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASNParser.COMMA, i);
		}
		public SymbolListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbolList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterSymbolList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitSymbolList(this);
		}
	}

	public final SymbolListContext symbolList() throws RecognitionException {
		SymbolListContext _localctx = new SymbolListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_symbolList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(359);
			symbol();
			}
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(360);
				match(COMMA);
				setState(361);
				symbol();
				}
				}
				setState(366);
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

	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public TerminalNode L_BRACE() { return getToken(ASNParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(ASNParser.R_BRACE, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitSymbol(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(IDENTIFIER);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_BRACE) {
				{
				{
				setState(368);
				match(L_BRACE);
				setState(369);
				match(R_BRACE);
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

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitAssignmentList(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(372);
			assignment();
			}
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(373);
				assignment();
				}
				}
				setState(378);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public ValueAssignmentContext valueAssignment() {
			return getRuleContext(ValueAssignmentContext.class,0);
		}
		public TypeAssignmentContext typeAssignment() {
			return getRuleContext(TypeAssignmentContext.class,0);
		}
		public ParameterizedAssignmentContext parameterizedAssignment() {
			return getRuleContext(ParameterizedAssignmentContext.class,0);
		}
		public ObjectClassAssignmentContext objectClassAssignment() {
			return getRuleContext(ObjectClassAssignmentContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(379);
			match(IDENTIFIER);
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(380);
				valueAssignment();
				}
				break;
			case 2:
				{
				setState(381);
				typeAssignment();
				}
				break;
			case 3:
				{
				setState(382);
				parameterizedAssignment();
				}
				break;
			case 4:
				{
				setState(383);
				objectClassAssignment();
				}
				break;
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

	public static class SequenceTypeContext extends ParserRuleContext {
		public TerminalNode SEQUENCE_LITERAL() { return getToken(ASNParser.SEQUENCE_LITERAL, 0); }
		public TerminalNode L_BRACE() { return getToken(ASNParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(ASNParser.R_BRACE, 0); }
		public ExtensionAndExceptionContext extensionAndException() {
			return getRuleContext(ExtensionAndExceptionContext.class,0);
		}
		public OptionalExtensionMarkerContext optionalExtensionMarker() {
			return getRuleContext(OptionalExtensionMarkerContext.class,0);
		}
		public ComponentTypeListsContext componentTypeLists() {
			return getRuleContext(ComponentTypeListsContext.class,0);
		}
		public SequenceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterSequenceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitSequenceType(this);
		}
	}

	public final SequenceTypeContext sequenceType() throws RecognitionException {
		SequenceTypeContext _localctx = new SequenceTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sequenceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(SEQUENCE_LITERAL);
			setState(387);
			match(L_BRACE);
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(388);
				extensionAndException();
				setState(389);
				optionalExtensionMarker();
				}
				break;
			case 2:
				{
				setState(391);
				componentTypeLists();
				}
				break;
			}
			setState(394);
			match(R_BRACE);
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

	public static class ExtensionAndExceptionContext extends ParserRuleContext {
		public TerminalNode ELLIPSIS() { return getToken(ASNParser.ELLIPSIS, 0); }
		public ExceptionSpecContext exceptionSpec() {
			return getRuleContext(ExceptionSpecContext.class,0);
		}
		public ExtensionAndExceptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionAndException; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterExtensionAndException(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitExtensionAndException(this);
		}
	}

	public final ExtensionAndExceptionContext extensionAndException() throws RecognitionException {
		ExtensionAndExceptionContext _localctx = new ExtensionAndExceptionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_extensionAndException);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(ELLIPSIS);
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLAM) {
				{
				setState(397);
				exceptionSpec();
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

	public static class OptionalExtensionMarkerContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ASNParser.COMMA, 0); }
		public TerminalNode ELLIPSIS() { return getToken(ASNParser.ELLIPSIS, 0); }
		public OptionalExtensionMarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalExtensionMarker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterOptionalExtensionMarker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitOptionalExtensionMarker(this);
		}
	}

	public final OptionalExtensionMarkerContext optionalExtensionMarker() throws RecognitionException {
		OptionalExtensionMarkerContext _localctx = new OptionalExtensionMarkerContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_optionalExtensionMarker);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(400);
				match(COMMA);
				setState(401);
				match(ELLIPSIS);
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

	public static class ComponentTypeListsContext extends ParserRuleContext {
		public List<RootComponentTypeListContext> rootComponentTypeList() {
			return getRuleContexts(RootComponentTypeListContext.class);
		}
		public RootComponentTypeListContext rootComponentTypeList(int i) {
			return getRuleContext(RootComponentTypeListContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ASNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASNParser.COMMA, i);
		}
		public ExtensionAndExceptionContext extensionAndException() {
			return getRuleContext(ExtensionAndExceptionContext.class,0);
		}
		public ExtensionAdditionsContext extensionAdditions() {
			return getRuleContext(ExtensionAdditionsContext.class,0);
		}
		public OptionalExtensionMarkerContext optionalExtensionMarker() {
			return getRuleContext(OptionalExtensionMarkerContext.class,0);
		}
		public TerminalNode EXTENSTIONENDMARKER() { return getToken(ASNParser.EXTENSTIONENDMARKER, 0); }
		public ComponentTypeListsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentTypeLists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterComponentTypeLists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitComponentTypeLists(this);
		}
	}

	public final ComponentTypeListsContext componentTypeLists() throws RecognitionException {
		ComponentTypeListsContext _localctx = new ComponentTypeListsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_componentTypeLists);
		int _la;
		try {
			setState(424);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMPONENTS_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				rootComponentTypeList();
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(405);
					match(COMMA);
					setState(406);
					extensionAndException();
					setState(407);
					extensionAdditions();
					setState(412);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case R_BRACE:
					case COMMA:
						{
						setState(408);
						optionalExtensionMarker();
						}
						break;
					case EXTENSTIONENDMARKER:
						{
						{
						setState(409);
						match(EXTENSTIONENDMARKER);
						setState(410);
						match(COMMA);
						setState(411);
						rootComponentTypeList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				extensionAndException();
				setState(417);
				extensionAdditions();
				setState(422);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case R_BRACE:
				case COMMA:
					{
					setState(418);
					optionalExtensionMarker();
					}
					break;
				case EXTENSTIONENDMARKER:
					{
					{
					setState(419);
					match(EXTENSTIONENDMARKER);
					setState(420);
					match(COMMA);
					setState(421);
					rootComponentTypeList();
					}
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

	public static class RootComponentTypeListContext extends ParserRuleContext {
		public ComponentTypeListContext componentTypeList() {
			return getRuleContext(ComponentTypeListContext.class,0);
		}
		public RootComponentTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rootComponentTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterRootComponentTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitRootComponentTypeList(this);
		}
	}

	public final RootComponentTypeListContext rootComponentTypeList() throws RecognitionException {
		RootComponentTypeListContext _localctx = new RootComponentTypeListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_rootComponentTypeList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			componentTypeList();
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

	public static class ComponentTypeListContext extends ParserRuleContext {
		public List<ComponentTypeContext> componentType() {
			return getRuleContexts(ComponentTypeContext.class);
		}
		public ComponentTypeContext componentType(int i) {
			return getRuleContext(ComponentTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ASNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASNParser.COMMA, i);
		}
		public ComponentTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterComponentTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitComponentTypeList(this);
		}
	}

	public final ComponentTypeListContext componentTypeList() throws RecognitionException {
		ComponentTypeListContext _localctx = new ComponentTypeListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_componentTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(428);
			componentType();
			}
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(429);
					match(COMMA);
					setState(430);
					componentType();
					}
					} 
				}
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class ComponentTypeContext extends ParserRuleContext {
		public NamedTypeContext namedType() {
			return getRuleContext(NamedTypeContext.class,0);
		}
		public TerminalNode OPTIONAL_LITERAL() { return getToken(ASNParser.OPTIONAL_LITERAL, 0); }
		public TerminalNode DEFAULT_LITERAL() { return getToken(ASNParser.DEFAULT_LITERAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMPONENTS_LITERAL() { return getToken(ASNParser.COMPONENTS_LITERAL, 0); }
		public TerminalNode OF_LITERAL() { return getToken(ASNParser.OF_LITERAL, 0); }
		public AsnTypeContext asnType() {
			return getRuleContext(AsnTypeContext.class,0);
		}
		public ComponentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterComponentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitComponentType(this);
		}
	}

	public final ComponentTypeContext componentType() throws RecognitionException {
		ComponentTypeContext _localctx = new ComponentTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_componentType);
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				namedType();
				setState(440);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTIONAL_LITERAL:
					{
					setState(437);
					match(OPTIONAL_LITERAL);
					}
					break;
				case DEFAULT_LITERAL:
					{
					setState(438);
					match(DEFAULT_LITERAL);
					setState(439);
					value();
					}
					break;
				case R_BRACE:
				case COMMA:
				case DOUBLE_R_BRACKET:
				case EXTENSTIONENDMARKER:
					break;
				default:
					break;
				}
				}
				break;
			case COMPONENTS_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(442);
				match(COMPONENTS_LITERAL);
				setState(443);
				match(OF_LITERAL);
				setState(444);
				asnType();
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

	public static class ExtensionAdditionsContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ASNParser.COMMA, 0); }
		public ExtensionAdditionListContext extensionAdditionList() {
			return getRuleContext(ExtensionAdditionListContext.class,0);
		}
		public ExtensionAdditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionAdditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterExtensionAdditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitExtensionAdditions(this);
		}
	}

	public final ExtensionAdditionsContext extensionAdditions() throws RecognitionException {
		ExtensionAdditionsContext _localctx = new ExtensionAdditionsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_extensionAdditions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(447);
				match(COMMA);
				setState(448);
				extensionAdditionList();
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

	public static class ExtensionAdditionListContext extends ParserRuleContext {
		public List<ExtensionAdditionContext> extensionAddition() {
			return getRuleContexts(ExtensionAdditionContext.class);
		}
		public ExtensionAdditionContext extensionAddition(int i) {
			return getRuleContext(ExtensionAdditionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ASNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASNParser.COMMA, i);
		}
		public ExtensionAdditionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionAdditionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterExtensionAdditionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitExtensionAdditionList(this);
		}
	}

	public final ExtensionAdditionListContext extensionAdditionList() throws RecognitionException {
		ExtensionAdditionListContext _localctx = new ExtensionAdditionListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_extensionAdditionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(451);
			extensionAddition();
			}
			setState(456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(452);
					match(COMMA);
					setState(453);
					extensionAddition();
					}
					} 
				}
				setState(458);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	public static class ExtensionAdditionContext extends ParserRuleContext {
		public ComponentTypeContext componentType() {
			return getRuleContext(ComponentTypeContext.class,0);
		}
		public ExtensionAdditionGroupContext extensionAdditionGroup() {
			return getRuleContext(ExtensionAdditionGroupContext.class,0);
		}
		public ExtensionAdditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionAddition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterExtensionAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitExtensionAddition(this);
		}
	}

	public final ExtensionAdditionContext extensionAddition() throws RecognitionException {
		ExtensionAdditionContext _localctx = new ExtensionAdditionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_extensionAddition);
		try {
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMPONENTS_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				componentType();
				}
				break;
			case DOUBLE_L_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				extensionAdditionGroup();
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

	public static class ExtensionAdditionGroupContext extends ParserRuleContext {
		public TerminalNode DOUBLE_L_BRACKET() { return getToken(ASNParser.DOUBLE_L_BRACKET, 0); }
		public VersionNumberContext versionNumber() {
			return getRuleContext(VersionNumberContext.class,0);
		}
		public ComponentTypeListContext componentTypeList() {
			return getRuleContext(ComponentTypeListContext.class,0);
		}
		public TerminalNode DOUBLE_R_BRACKET() { return getToken(ASNParser.DOUBLE_R_BRACKET, 0); }
		public ExtensionAdditionGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionAdditionGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterExtensionAdditionGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitExtensionAdditionGroup(this);
		}
	}

	public final ExtensionAdditionGroupContext extensionAdditionGroup() throws RecognitionException {
		ExtensionAdditionGroupContext _localctx = new ExtensionAdditionGroupContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_extensionAdditionGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(DOUBLE_L_BRACKET);
			setState(464);
			versionNumber();
			setState(465);
			componentTypeList();
			setState(466);
			match(DOUBLE_R_BRACKET);
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

	public static class VersionNumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ASNParser.NUMBER, 0); }
		public TerminalNode COLON() { return getToken(ASNParser.COLON, 0); }
		public VersionNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versionNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterVersionNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitVersionNumber(this);
		}
	}

	public final VersionNumberContext versionNumber() throws RecognitionException {
		VersionNumberContext _localctx = new VersionNumberContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_versionNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(468);
				match(NUMBER);
				setState(469);
				match(COLON);
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

	public static class SequenceOfTypeContext extends ParserRuleContext {
		public TerminalNode SEQUENCE_LITERAL() { return getToken(ASNParser.SEQUENCE_LITERAL, 0); }
		public TerminalNode OF_LITERAL() { return getToken(ASNParser.OF_LITERAL, 0); }
		public AsnTypeContext asnType() {
			return getRuleContext(AsnTypeContext.class,0);
		}
		public NamedTypeContext namedType() {
			return getRuleContext(NamedTypeContext.class,0);
		}
		public TerminalNode L_PARAN() { return getToken(ASNParser.L_PARAN, 0); }
		public TerminalNode R_PARAN() { return getToken(ASNParser.R_PARAN, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public SizeConstraintContext sizeConstraint() {
			return getRuleContext(SizeConstraintContext.class,0);
		}
		public SequenceOfTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceOfType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterSequenceOfType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitSequenceOfType(this);
		}
	}

	public final SequenceOfTypeContext sequenceOfType() throws RecognitionException {
		SequenceOfTypeContext _localctx = new SequenceOfTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sequenceOfType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(SEQUENCE_LITERAL);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_PARAN) {
				{
				setState(473);
				match(L_PARAN);
				setState(476);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_PARAN:
					{
					setState(474);
					constraint();
					}
					break;
				case SIZE_LITERAL:
					{
					setState(475);
					sizeConstraint();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(478);
				match(R_PARAN);
				}
			}

			setState(482);
			match(OF_LITERAL);
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(483);
				asnType();
				}
				break;
			case 2:
				{
				setState(484);
				namedType();
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

	public static class SizeConstraintContext extends ParserRuleContext {
		public TerminalNode SIZE_LITERAL() { return getToken(ASNParser.SIZE_LITERAL, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public SizeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterSizeConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitSizeConstraint(this);
		}
	}

	public final SizeConstraintContext sizeConstraint() throws RecognitionException {
		SizeConstraintContext _localctx = new SizeConstraintContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sizeConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			match(SIZE_LITERAL);
			setState(488);
			constraint();
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

	public static class ParameterizedAssignmentContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(ASNParser.ASSIGN_OP, 0); }
		public AsnTypeContext asnType() {
			return getRuleContext(AsnTypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueSetContext valueSet() {
			return getRuleContext(ValueSetContext.class,0);
		}
		public DefinedObjectClassContext definedObjectClass() {
			return getRuleContext(DefinedObjectClassContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ObjectClassContext objectClass() {
			return getRuleContext(ObjectClassContext.class,0);
		}
		public ObjectSetContext objectSet() {
			return getRuleContext(ObjectSetContext.class,0);
		}
		public ParameterizedAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterizedAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterParameterizedAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitParameterizedAssignment(this);
		}
	}

	public final ParameterizedAssignmentContext parameterizedAssignment() throws RecognitionException {
		ParameterizedAssignmentContext _localctx = new ParameterizedAssignmentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parameterizedAssignment);
		try {
			setState(504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				parameterList();
				{
				setState(491);
				match(ASSIGN_OP);
				setState(495);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(492);
					asnType();
					}
					break;
				case 2:
					{
					setState(493);
					value();
					}
					break;
				case 3:
					{
					setState(494);
					valueSet();
					}
					break;
				}
				}
				}
				break;
			case TYPE_IDENTIFIER_LITERAL:
			case ABSTRACT_SYNTAX_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(497);
				definedObjectClass();
				setState(498);
				match(ASSIGN_OP);
				setState(502);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(499);
					object();
					}
					break;
				case 2:
					{
					setState(500);
					objectClass();
					}
					break;
				case 3:
					{
					setState(501);
					objectSet();
					}
					break;
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

	public static class ParameterListContext extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(ASNParser.L_BRACE, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode R_BRACE() { return getToken(ASNParser.R_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ASNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASNParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			match(L_BRACE);
			setState(507);
			parameter();
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(508);
				match(COMMA);
				setState(509);
				parameter();
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515);
			match(R_BRACE);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public ParamGovernorContext paramGovernor() {
			return getRuleContext(ParamGovernorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ASNParser.COLON, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(517);
				paramGovernor();
				setState(518);
				match(COLON);
				}
				break;
			}
			setState(522);
			match(IDENTIFIER);
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

	public static class ParamGovernorContext extends ParserRuleContext {
		public GovernorContext governor() {
			return getRuleContext(GovernorContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public ParamGovernorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramGovernor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterParamGovernor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitParamGovernor(this);
		}
	}

	public final ParamGovernorContext paramGovernor() throws RecognitionException {
		ParamGovernorContext _localctx = new ParamGovernorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_paramGovernor);
		try {
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(524);
				governor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(525);
				match(IDENTIFIER);
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

	public static class GovernorContext extends ParserRuleContext {
		public AsnTypeContext asnType() {
			return getRuleContext(AsnTypeContext.class,0);
		}
		public DefinedObjectClassContext definedObjectClass() {
			return getRuleContext(DefinedObjectClassContext.class,0);
		}
		public GovernorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_governor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterGovernor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitGovernor(this);
		}
	}

	public final GovernorContext governor() throws RecognitionException {
		GovernorContext _localctx = new GovernorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_governor);
		try {
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				asnType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				definedObjectClass();
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

	public static class ObjectClassAssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN_OP() { return getToken(ASNParser.ASSIGN_OP, 0); }
		public ObjectClassContext objectClass() {
			return getRuleContext(ObjectClassContext.class,0);
		}
		public ObjectClassAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectClassAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterObjectClassAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitObjectClassAssignment(this);
		}
	}

	public final ObjectClassAssignmentContext objectClassAssignment() throws RecognitionException {
		ObjectClassAssignmentContext _localctx = new ObjectClassAssignmentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_objectClassAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(ASSIGN_OP);
			setState(533);
			objectClass();
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

	public static class ObjectClassContext extends ParserRuleContext {
		public DefinedObjectClassContext definedObjectClass() {
			return getRuleContext(DefinedObjectClassContext.class,0);
		}
		public ObjectClassDefnContext objectClassDefn() {
			return getRuleContext(ObjectClassDefnContext.class,0);
		}
		public ObjectClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterObjectClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitObjectClass(this);
		}
	}

	public final ObjectClassContext objectClass() throws RecognitionException {
		ObjectClassContext _localctx = new ObjectClassContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_objectClass);
		try {
			setState(537);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE_IDENTIFIER_LITERAL:
			case ABSTRACT_SYNTAX_LITERAL:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(535);
				definedObjectClass();
				}
				break;
			case CLASS_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(536);
				objectClassDefn();
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

	public static class DefinedObjectClassContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ASNParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ASNParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(ASNParser.DOT, 0); }
		public TerminalNode TYPE_IDENTIFIER_LITERAL() { return getToken(ASNParser.TYPE_IDENTIFIER_LITERAL, 0); }
		public TerminalNode ABSTRACT_SYNTAX_LITERAL() { return getToken(ASNParser.ABSTRACT_SYNTAX_LITERAL, 0); }
		public DefinedObjectClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definedObjectClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterDefinedObjectClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitDefinedObjectClass(this);
		}
	}

	public final DefinedObjectClassContext definedObjectClass() throws RecognitionException {
		DefinedObjectClassContext _localctx = new DefinedObjectClassContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_definedObjectClass);
		try {
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(541);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(539);
					match(IDENTIFIER);
					setState(540);
					match(DOT);
					}
					break;
				}
				setState(543);
				match(IDENTIFIER);
				}
				break;
			case TYPE_IDENTIFIER_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(544);
				match(TYPE_IDENTIFIER_LITERAL);
				}
				break;
			case ABSTRACT_SYNTAX_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(545);
				match(ABSTRACT_SYNTAX_LITERAL);
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

	public static class UsefulObjectClassReferenceContext extends ParserRuleContext {
		public TerminalNode TYPE_IDENTIFIER_LITERAL() { return getToken(ASNParser.TYPE_IDENTIFIER_LITERAL, 0); }
		public TerminalNode ABSTRACT_SYNTAX_LITERAL() { return getToken(ASNParser.ABSTRACT_SYNTAX_LITERAL, 0); }
		public UsefulObjectClassReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usefulObjectClassReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterUsefulObjectClassReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitUsefulObjectClassReference(this);
		}
	}

	public final UsefulObjectClassReferenceContext usefulObjectClassReference() throws RecognitionException {
		UsefulObjectClassReferenceContext _localctx = new UsefulObjectClassReferenceContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_usefulObjectClassReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			_la = _input.LA(1);
			if ( !(_la==TYPE_IDENTIFIER_LITERAL || _la==ABSTRACT_SYNTAX_LITERAL) ) {
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

	public static class ExternalObjectClassReferenceContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ASNParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ASNParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(ASNParser.DOT, 0); }
		public ExternalObjectClassReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalObjectClassReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterExternalObjectClassReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitExternalObjectClassReference(this);
		}
	}

	public final ExternalObjectClassReferenceContext externalObjectClassReference() throws RecognitionException {
		ExternalObjectClassReferenceContext _localctx = new ExternalObjectClassReferenceContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_externalObjectClassReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(IDENTIFIER);
			setState(551);
			match(DOT);
			setState(552);
			match(IDENTIFIER);
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

	public static class ObjectClassDefnContext extends ParserRuleContext {
		public TerminalNode CLASS_LITERAL() { return getToken(ASNParser.CLASS_LITERAL, 0); }
		public TerminalNode L_BRACE() { return getToken(ASNParser.L_BRACE, 0); }
		public List<FieldSpecContext> fieldSpec() {
			return getRuleContexts(FieldSpecContext.class);
		}
		public FieldSpecContext fieldSpec(int i) {
			return getRuleContext(FieldSpecContext.class,i);
		}
		public TerminalNode R_BRACE() { return getToken(ASNParser.R_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ASNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASNParser.COMMA, i);
		}
		public WithSyntaxSpecContext withSyntaxSpec() {
			return getRuleContext(WithSyntaxSpecContext.class,0);
		}
		public ObjectClassDefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectClassDefn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterObjectClassDefn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitObjectClassDefn(this);
		}
	}

	public final ObjectClassDefnContext objectClassDefn() throws RecognitionException {
		ObjectClassDefnContext _localctx = new ObjectClassDefnContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_objectClassDefn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(CLASS_LITERAL);
			setState(555);
			match(L_BRACE);
			setState(556);
			fieldSpec();
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(557);
				match(COMMA);
				setState(558);
				fieldSpec();
				}
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(564);
			match(R_BRACE);
			setState(566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH_LITERAL) {
				{
				setState(565);
				withSyntaxSpec();
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

	public static class WithSyntaxSpecContext extends ParserRuleContext {
		public TerminalNode WITH_LITERAL() { return getToken(ASNParser.WITH_LITERAL, 0); }
		public TerminalNode SYNTAX_LITERAL() { return getToken(ASNParser.SYNTAX_LITERAL, 0); }
		public SyntaxListContext syntaxList() {
			return getRuleContext(SyntaxListContext.class,0);
		}
		public WithSyntaxSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withSyntaxSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterWithSyntaxSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitWithSyntaxSpec(this);
		}
	}

	public final WithSyntaxSpecContext withSyntaxSpec() throws RecognitionException {
		WithSyntaxSpecContext _localctx = new WithSyntaxSpecContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_withSyntaxSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(WITH_LITERAL);
			setState(569);
			match(SYNTAX_LITERAL);
			setState(570);
			syntaxList();
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

	public static class SyntaxListContext extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(ASNParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(ASNParser.R_BRACE, 0); }
		public List<TokenOrGroupSpecContext> tokenOrGroupSpec() {
			return getRuleContexts(TokenOrGroupSpecContext.class);
		}
		public TokenOrGroupSpecContext tokenOrGroupSpec(int i) {
			return getRuleContext(TokenOrGroupSpecContext.class,i);
		}
		public SyntaxListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntaxList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterSyntaxList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitSyntaxList(this);
		}
	}

	public final SyntaxListContext syntaxList() throws RecognitionException {
		SyntaxListContext _localctx = new SyntaxListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_syntaxList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			match(L_BRACE);
			setState(574); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(573);
				tokenOrGroupSpec();
				}
				}
				setState(576); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AMPERSAND) | (1L << COMMA) | (1L << L_BRACKET))) != 0) || _la==IDENTIFIER );
			setState(578);
			match(R_BRACE);
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

	public static class TokenOrGroupSpecContext extends ParserRuleContext {
		public RequiredTokenContext requiredToken() {
			return getRuleContext(RequiredTokenContext.class,0);
		}
		public OptionalGroupContext optionalGroup() {
			return getRuleContext(OptionalGroupContext.class,0);
		}
		public TokenOrGroupSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokenOrGroupSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterTokenOrGroupSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitTokenOrGroupSpec(this);
		}
	}

	public final TokenOrGroupSpecContext tokenOrGroupSpec() throws RecognitionException {
		TokenOrGroupSpecContext _localctx = new TokenOrGroupSpecContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_tokenOrGroupSpec);
		try {
			setState(582);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AMPERSAND:
			case COMMA:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				requiredToken();
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				optionalGroup();
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

	public static class OptionalGroupContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(ASNParser.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(ASNParser.R_BRACKET, 0); }
		public List<TokenOrGroupSpecContext> tokenOrGroupSpec() {
			return getRuleContexts(TokenOrGroupSpecContext.class);
		}
		public TokenOrGroupSpecContext tokenOrGroupSpec(int i) {
			return getRuleContext(TokenOrGroupSpecContext.class,i);
		}
		public OptionalGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterOptionalGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitOptionalGroup(this);
		}
	}

	public final OptionalGroupContext optionalGroup() throws RecognitionException {
		OptionalGroupContext _localctx = new OptionalGroupContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_optionalGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(L_BRACKET);
			setState(586); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(585);
				tokenOrGroupSpec();
				}
				}
				setState(588); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AMPERSAND) | (1L << COMMA) | (1L << L_BRACKET))) != 0) || _la==IDENTIFIER );
			setState(590);
			match(R_BRACKET);
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

	public static class RequiredTokenContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimitiveFieldNameContext primitiveFieldName() {
			return getRuleContext(PrimitiveFieldNameContext.class,0);
		}
		public RequiredTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requiredToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterRequiredToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitRequiredToken(this);
		}
	}

	public final RequiredTokenContext requiredToken() throws RecognitionException {
		RequiredTokenContext _localctx = new RequiredTokenContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_requiredToken);
		try {
			setState(594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				literal();
				}
				break;
			case AMPERSAND:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				primitiveFieldName();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(ASNParser.COMMA, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_la = _input.LA(1);
			if ( !(_la==COMMA || _la==IDENTIFIER) ) {
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

	public static class PrimitiveFieldNameContext extends ParserRuleContext {
		public TerminalNode AMPERSAND() { return getToken(ASNParser.AMPERSAND, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public PrimitiveFieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveFieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterPrimitiveFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitPrimitiveFieldName(this);
		}
	}

	public final PrimitiveFieldNameContext primitiveFieldName() throws RecognitionException {
		PrimitiveFieldNameContext _localctx = new PrimitiveFieldNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_primitiveFieldName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(AMPERSAND);
			setState(599);
			match(IDENTIFIER);
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

	public static class FieldSpecContext extends ParserRuleContext {
		public TerminalNode AMPERSAND() { return getToken(ASNParser.AMPERSAND, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public AsnTypeContext asnType() {
			return getRuleContext(AsnTypeContext.class,0);
		}
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public DefinedObjectClassContext definedObjectClass() {
			return getRuleContext(DefinedObjectClassContext.class,0);
		}
		public TypeOptionalitySpecContext typeOptionalitySpec() {
			return getRuleContext(TypeOptionalitySpecContext.class,0);
		}
		public TerminalNode OPTIONAL_LITERAL() { return getToken(ASNParser.OPTIONAL_LITERAL, 0); }
		public ValueSetOptionalitySpecContext valueSetOptionalitySpec() {
			return getRuleContext(ValueSetOptionalitySpecContext.class,0);
		}
		public TerminalNode UNIQUE_LITERAL() { return getToken(ASNParser.UNIQUE_LITERAL, 0); }
		public ValueOptionalitySpecContext valueOptionalitySpec() {
			return getRuleContext(ValueOptionalitySpecContext.class,0);
		}
		public TerminalNode DEFAULT_LITERAL() { return getToken(ASNParser.DEFAULT_LITERAL, 0); }
		public ValueSetContext valueSet() {
			return getRuleContext(ValueSetContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ObjectSetContext objectSet() {
			return getRuleContext(ObjectSetContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public FieldSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterFieldSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitFieldSpec(this);
		}
	}

	public final FieldSpecContext fieldSpec() throws RecognitionException {
		FieldSpecContext _localctx = new FieldSpecContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_fieldSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			match(AMPERSAND);
			setState(602);
			match(IDENTIFIER);
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONAL_LITERAL || _la==DEFAULT_LITERAL) {
					{
					setState(603);
					typeOptionalitySpec();
					}
				}

				}
				break;
			case 2:
				{
				setState(606);
				asnType();
				setState(616);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(608);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPTIONAL_LITERAL || _la==DEFAULT_LITERAL) {
						{
						setState(607);
						valueSetOptionalitySpec();
						}
					}

					}
					break;
				case 2:
					{
					setState(611);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==UNIQUE_LITERAL) {
						{
						setState(610);
						match(UNIQUE_LITERAL);
						}
					}

					setState(614);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPTIONAL_LITERAL || _la==DEFAULT_LITERAL) {
						{
						setState(613);
						valueOptionalitySpec();
						}
					}

					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(618);
				fieldName();
				setState(625);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTIONAL_LITERAL:
					{
					setState(619);
					match(OPTIONAL_LITERAL);
					}
					break;
				case DEFAULT_LITERAL:
					{
					{
					setState(620);
					match(DEFAULT_LITERAL);
					setState(623);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(621);
						valueSet();
						}
						break;
					case 2:
						{
						setState(622);
						value();
						}
						break;
					}
					}
					}
					break;
				case R_BRACE:
				case COMMA:
					break;
				default:
					break;
				}
				}
				break;
			case 4:
				{
				setState(627);
				definedObjectClass();
				setState(634);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPTIONAL_LITERAL:
					{
					setState(628);
					match(OPTIONAL_LITERAL);
					}
					break;
				case DEFAULT_LITERAL:
					{
					{
					setState(629);
					match(DEFAULT_LITERAL);
					setState(632);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case L_BRACE:
						{
						setState(630);
						objectSet();
						}
						break;
					case IDENTIFIER:
						{
						setState(631);
						object();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					break;
				case R_BRACE:
				case COMMA:
					break;
				default:
					break;
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

	public static class TypeFieldSpecContext extends ParserRuleContext {
		public TerminalNode AMPERSAND() { return getToken(ASNParser.AMPERSAND, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public TypeOptionalitySpecContext typeOptionalitySpec() {
			return getRuleContext(TypeOptionalitySpecContext.class,0);
		}
		public TypeFieldSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeFieldSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterTypeFieldSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitTypeFieldSpec(this);
		}
	}

	public final TypeFieldSpecContext typeFieldSpec() throws RecognitionException {
		TypeFieldSpecContext _localctx = new TypeFieldSpecContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_typeFieldSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			match(AMPERSAND);
			setState(639);
			match(IDENTIFIER);
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL_LITERAL || _la==DEFAULT_LITERAL) {
				{
				setState(640);
				typeOptionalitySpec();
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

	public static class TypeOptionalitySpecContext extends ParserRuleContext {
		public TerminalNode OPTIONAL_LITERAL() { return getToken(ASNParser.OPTIONAL_LITERAL, 0); }
		public TerminalNode DEFAULT_LITERAL() { return getToken(ASNParser.DEFAULT_LITERAL, 0); }
		public AsnTypeContext asnType() {
			return getRuleContext(AsnTypeContext.class,0);
		}
		public TypeOptionalitySpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeOptionalitySpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterTypeOptionalitySpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitTypeOptionalitySpec(this);
		}
	}

	public final TypeOptionalitySpecContext typeOptionalitySpec() throws RecognitionException {
		TypeOptionalitySpecContext _localctx = new TypeOptionalitySpecContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_typeOptionalitySpec);
		try {
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTIONAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				match(OPTIONAL_LITERAL);
				}
				break;
			case DEFAULT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(644);
				match(DEFAULT_LITERAL);
				setState(645);
				asnType();
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

	public static class FixedTypeValueFieldSpecContext extends ParserRuleContext {
		public TerminalNode AMPERSAND() { return getToken(ASNParser.AMPERSAND, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public AsnTypeContext asnType() {
			return getRuleContext(AsnTypeContext.class,0);
		}
		public TerminalNode UNIQUE_LITERAL() { return getToken(ASNParser.UNIQUE_LITERAL, 0); }
		public ValueOptionalitySpecContext valueOptionalitySpec() {
			return getRuleContext(ValueOptionalitySpecContext.class,0);
		}
		public FixedTypeValueFieldSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedTypeValueFieldSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterFixedTypeValueFieldSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitFixedTypeValueFieldSpec(this);
		}
	}

	public final FixedTypeValueFieldSpecContext fixedTypeValueFieldSpec() throws RecognitionException {
		FixedTypeValueFieldSpecContext _localctx = new FixedTypeValueFieldSpecContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_fixedTypeValueFieldSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(AMPERSAND);
			setState(649);
			match(IDENTIFIER);
			setState(650);
			asnType();
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE_LITERAL) {
				{
				setState(651);
				match(UNIQUE_LITERAL);
				}
			}

			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL_LITERAL || _la==DEFAULT_LITERAL) {
				{
				setState(654);
				valueOptionalitySpec();
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

	public static class ValueOptionalitySpecContext extends ParserRuleContext {
		public TerminalNode OPTIONAL_LITERAL() { return getToken(ASNParser.OPTIONAL_LITERAL, 0); }
		public TerminalNode DEFAULT_LITERAL() { return getToken(ASNParser.DEFAULT_LITERAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueOptionalitySpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueOptionalitySpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterValueOptionalitySpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitValueOptionalitySpec(this);
		}
	}

	public final ValueOptionalitySpecContext valueOptionalitySpec() throws RecognitionException {
		ValueOptionalitySpecContext _localctx = new ValueOptionalitySpecContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_valueOptionalitySpec);
		try {
			setState(660);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTIONAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				match(OPTIONAL_LITERAL);
				}
				break;
			case DEFAULT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(658);
				match(DEFAULT_LITERAL);
				setState(659);
				value();
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

	public static class VariableTypeValueFieldSpecContext extends ParserRuleContext {
		public TerminalNode AMPERSAND() { return getToken(ASNParser.AMPERSAND, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public ValueOptionalitySpecContext valueOptionalitySpec() {
			return getRuleContext(ValueOptionalitySpecContext.class,0);
		}
		public VariableTypeValueFieldSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableTypeValueFieldSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterVariableTypeValueFieldSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitVariableTypeValueFieldSpec(this);
		}
	}

	public final VariableTypeValueFieldSpecContext variableTypeValueFieldSpec() throws RecognitionException {
		VariableTypeValueFieldSpecContext _localctx = new VariableTypeValueFieldSpecContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_variableTypeValueFieldSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(AMPERSAND);
			setState(663);
			match(IDENTIFIER);
			setState(664);
			fieldName();
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL_LITERAL || _la==DEFAULT_LITERAL) {
				{
				setState(665);
				valueOptionalitySpec();
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

	public static class FixedTypeValueSetFieldSpecContext extends ParserRuleContext {
		public TerminalNode AMPERSAND() { return getToken(ASNParser.AMPERSAND, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public AsnTypeContext asnType() {
			return getRuleContext(AsnTypeContext.class,0);
		}
		public ValueSetOptionalitySpecContext valueSetOptionalitySpec() {
			return getRuleContext(ValueSetOptionalitySpecContext.class,0);
		}
		public FixedTypeValueSetFieldSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedTypeValueSetFieldSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterFixedTypeValueSetFieldSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitFixedTypeValueSetFieldSpec(this);
		}
	}

	public final FixedTypeValueSetFieldSpecContext fixedTypeValueSetFieldSpec() throws RecognitionException {
		FixedTypeValueSetFieldSpecContext _localctx = new FixedTypeValueSetFieldSpecContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_fixedTypeValueSetFieldSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(AMPERSAND);
			setState(669);
			match(IDENTIFIER);
			setState(670);
			asnType();
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL_LITERAL || _la==DEFAULT_LITERAL) {
				{
				setState(671);
				valueSetOptionalitySpec();
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

	public static class ValueSetOptionalitySpecContext extends ParserRuleContext {
		public TerminalNode OPTIONAL_LITERAL() { return getToken(ASNParser.OPTIONAL_LITERAL, 0); }
		public TerminalNode DEFAULT_LITERAL() { return getToken(ASNParser.DEFAULT_LITERAL, 0); }
		public ValueSetContext valueSet() {
			return getRuleContext(ValueSetContext.class,0);
		}
		public ValueSetOptionalitySpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueSetOptionalitySpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterValueSetOptionalitySpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitValueSetOptionalitySpec(this);
		}
	}

	public final ValueSetOptionalitySpecContext valueSetOptionalitySpec() throws RecognitionException {
		ValueSetOptionalitySpecContext _localctx = new ValueSetOptionalitySpecContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_valueSetOptionalitySpec);
		try {
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTIONAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				match(OPTIONAL_LITERAL);
				}
				break;
			case DEFAULT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				match(DEFAULT_LITERAL);
				setState(676);
				valueSet();
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

	public static class ObjectContext extends ParserRuleContext {
		public DefinedObjectContext definedObject() {
			return getRuleContext(DefinedObjectContext.class,0);
		}
		public ParameterizedObjectContext parameterizedObject() {
			return getRuleContext(ParameterizedObjectContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_object);
		try {
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(679);
				definedObject();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				parameterizedObject();
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

	public static class ParameterizedObjectContext extends ParserRuleContext {
		public DefinedObjectContext definedObject() {
			return getRuleContext(DefinedObjectContext.class,0);
		}
		public ActualParameterListContext actualParameterList() {
			return getRuleContext(ActualParameterListContext.class,0);
		}
		public ParameterizedObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterizedObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterParameterizedObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitParameterizedObject(this);
		}
	}

	public final ParameterizedObjectContext parameterizedObject() throws RecognitionException {
		ParameterizedObjectContext _localctx = new ParameterizedObjectContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_parameterizedObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			definedObject();
			setState(684);
			actualParameterList();
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

	public static class DefinedObjectContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(ASNParser.DOT, 0); }
		public DefinedObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definedObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterDefinedObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitDefinedObject(this);
		}
	}

	public final DefinedObjectContext definedObject() throws RecognitionException {
		DefinedObjectContext _localctx = new DefinedObjectContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_definedObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(IDENTIFIER);
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(687);
				match(DOT);
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

	public static class ObjectSetContext extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(ASNParser.L_BRACE, 0); }
		public ObjectSetSpecContext objectSetSpec() {
			return getRuleContext(ObjectSetSpecContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(ASNParser.R_BRACE, 0); }
		public ObjectSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterObjectSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitObjectSet(this);
		}
	}

	public final ObjectSetContext objectSet() throws RecognitionException {
		ObjectSetContext _localctx = new ObjectSetContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_objectSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690);
			match(L_BRACE);
			setState(691);
			objectSetSpec();
			setState(692);
			match(R_BRACE);
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

	public static class ObjectSetSpecContext extends ParserRuleContext {
		public RootElementSetSpecContext rootElementSetSpec() {
			return getRuleContext(RootElementSetSpecContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ASNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASNParser.COMMA, i);
		}
		public TerminalNode ELLIPSIS() { return getToken(ASNParser.ELLIPSIS, 0); }
		public AdditionalElementSetSpecContext additionalElementSetSpec() {
			return getRuleContext(AdditionalElementSetSpecContext.class,0);
		}
		public ObjectSetSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectSetSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterObjectSetSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitObjectSetSpec(this);
		}
	}

	public final ObjectSetSpecContext objectSetSpec() throws RecognitionException {
		ObjectSetSpecContext _localctx = new ObjectSetSpecContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_objectSetSpec);
		int _la;
		try {
			setState(708);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE_LITERAL:
			case FALSE_LITERAL:
			case TRUE_SMALL_LITERAL:
			case FALSE_SMALL_LITERAL:
			case L_BRACE:
			case MINUS:
			case ALL_LITERAL:
			case MIN_LITERAL:
			case SIZE_LITERAL:
			case PATTERN_LITERAL:
			case NUMBER:
			case CSTRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				rootElementSetSpec();
				setState(701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(695);
					match(COMMA);
					setState(696);
					match(ELLIPSIS);
					setState(699);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(697);
						match(COMMA);
						setState(698);
						additionalElementSetSpec();
						}
					}

					}
				}

				}
				break;
			case ELLIPSIS:
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
				match(ELLIPSIS);
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(704);
					match(COMMA);
					setState(705);
					additionalElementSetSpec();
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

	public static class FieldNameContext extends ParserRuleContext {
		public List<TerminalNode> AMPERSAND() { return getTokens(ASNParser.AMPERSAND); }
		public TerminalNode AMPERSAND(int i) {
			return getToken(ASNParser.AMPERSAND, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ASNParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ASNParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ASNParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ASNParser.DOT, i);
		}
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitFieldName(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_fieldName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(710);
			match(AMPERSAND);
			setState(711);
			match(IDENTIFIER);
			}
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AMPERSAND) {
				{
				{
				setState(713);
				match(AMPERSAND);
				setState(714);
				match(IDENTIFIER);
				setState(715);
				match(DOT);
				}
				}
				setState(720);
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

	public static class ValueSetContext extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(ASNParser.L_BRACE, 0); }
		public ElementSetSpecsContext elementSetSpecs() {
			return getRuleContext(ElementSetSpecsContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(ASNParser.R_BRACE, 0); }
		public ValueSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterValueSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitValueSet(this);
		}
	}

	public final ValueSetContext valueSet() throws RecognitionException {
		ValueSetContext _localctx = new ValueSetContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_valueSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(L_BRACE);
			setState(722);
			elementSetSpecs();
			setState(723);
			match(R_BRACE);
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

	public static class ElementSetSpecsContext extends ParserRuleContext {
		public RootElementSetSpecContext rootElementSetSpec() {
			return getRuleContext(RootElementSetSpecContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ASNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASNParser.COMMA, i);
		}
		public TerminalNode ELLIPSIS() { return getToken(ASNParser.ELLIPSIS, 0); }
		public AdditionalElementSetSpecContext additionalElementSetSpec() {
			return getRuleContext(AdditionalElementSetSpecContext.class,0);
		}
		public ElementSetSpecsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementSetSpecs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterElementSetSpecs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitElementSetSpecs(this);
		}
	}

	public final ElementSetSpecsContext elementSetSpecs() throws RecognitionException {
		ElementSetSpecsContext _localctx = new ElementSetSpecsContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_elementSetSpecs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			rootElementSetSpec();
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(726);
				match(COMMA);
				setState(727);
				match(ELLIPSIS);
				setState(730);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(728);
					match(COMMA);
					setState(729);
					additionalElementSetSpec();
					}
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

	public static class RootElementSetSpecContext extends ParserRuleContext {
		public ElementSetSpecContext elementSetSpec() {
			return getRuleContext(ElementSetSpecContext.class,0);
		}
		public RootElementSetSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rootElementSetSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterRootElementSetSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitRootElementSetSpec(this);
		}
	}

	public final RootElementSetSpecContext rootElementSetSpec() throws RecognitionException {
		RootElementSetSpecContext _localctx = new RootElementSetSpecContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_rootElementSetSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			elementSetSpec();
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

	public static class AdditionalElementSetSpecContext extends ParserRuleContext {
		public ElementSetSpecContext elementSetSpec() {
			return getRuleContext(ElementSetSpecContext.class,0);
		}
		public AdditionalElementSetSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalElementSetSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterAdditionalElementSetSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitAdditionalElementSetSpec(this);
		}
	}

	public final AdditionalElementSetSpecContext additionalElementSetSpec() throws RecognitionException {
		AdditionalElementSetSpecContext _localctx = new AdditionalElementSetSpecContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_additionalElementSetSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			elementSetSpec();
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

	public static class ElementSetSpecContext extends ParserRuleContext {
		public UnionsContext unions() {
			return getRuleContext(UnionsContext.class,0);
		}
		public TerminalNode ALL_LITERAL() { return getToken(ASNParser.ALL_LITERAL, 0); }
		public ExclusionsContext exclusions() {
			return getRuleContext(ExclusionsContext.class,0);
		}
		public ElementSetSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementSetSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterElementSetSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitElementSetSpec(this);
		}
	}

	public final ElementSetSpecContext elementSetSpec() throws RecognitionException {
		ElementSetSpecContext _localctx = new ElementSetSpecContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_elementSetSpec);
		try {
			setState(741);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE_LITERAL:
			case FALSE_LITERAL:
			case TRUE_SMALL_LITERAL:
			case FALSE_SMALL_LITERAL:
			case L_BRACE:
			case MINUS:
			case MIN_LITERAL:
			case SIZE_LITERAL:
			case PATTERN_LITERAL:
			case NUMBER:
			case CSTRING:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(738);
				unions();
				}
				break;
			case ALL_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(739);
				match(ALL_LITERAL);
				setState(740);
				exclusions();
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

	public static class UnionsContext extends ParserRuleContext {
		public List<IntersectionsContext> intersections() {
			return getRuleContexts(IntersectionsContext.class);
		}
		public IntersectionsContext intersections(int i) {
			return getRuleContext(IntersectionsContext.class,i);
		}
		public List<UnionMarkContext> unionMark() {
			return getRuleContexts(UnionMarkContext.class);
		}
		public UnionMarkContext unionMark(int i) {
			return getRuleContext(UnionMarkContext.class,i);
		}
		public UnionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterUnions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitUnions(this);
		}
	}

	public final UnionsContext unions() throws RecognitionException {
		UnionsContext _localctx = new UnionsContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_unions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(743);
			intersections();
			}
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PIPE || _la==UNION_LITERAL) {
				{
				{
				setState(744);
				unionMark();
				setState(745);
				intersections();
				}
				}
				setState(751);
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

	public static class ExclusionsContext extends ParserRuleContext {
		public TerminalNode EXCEPT_LITERAL() { return getToken(ASNParser.EXCEPT_LITERAL, 0); }
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public ExclusionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterExclusions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitExclusions(this);
		}
	}

	public final ExclusionsContext exclusions() throws RecognitionException {
		ExclusionsContext _localctx = new ExclusionsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_exclusions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			match(EXCEPT_LITERAL);
			setState(753);
			elements();
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

	public static class IntersectionsContext extends ParserRuleContext {
		public List<IntersectionElementsContext> intersectionElements() {
			return getRuleContexts(IntersectionElementsContext.class);
		}
		public IntersectionElementsContext intersectionElements(int i) {
			return getRuleContext(IntersectionElementsContext.class,i);
		}
		public List<IntersectionMarkContext> intersectionMark() {
			return getRuleContexts(IntersectionMarkContext.class);
		}
		public IntersectionMarkContext intersectionMark(int i) {
			return getRuleContext(IntersectionMarkContext.class,i);
		}
		public IntersectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterIntersections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitIntersections(this);
		}
	}

	public final IntersectionsContext intersections() throws RecognitionException {
		IntersectionsContext _localctx = new IntersectionsContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_intersections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(755);
			intersectionElements();
			}
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POWER || _la==INTERSECTION_LITERAL) {
				{
				{
				setState(756);
				intersectionMark();
				setState(757);
				intersectionElements();
				}
				}
				setState(763);
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

	public static class UnionMarkContext extends ParserRuleContext {
		public TerminalNode PIPE() { return getToken(ASNParser.PIPE, 0); }
		public TerminalNode UNION_LITERAL() { return getToken(ASNParser.UNION_LITERAL, 0); }
		public UnionMarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionMark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterUnionMark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitUnionMark(this);
		}
	}

	public final UnionMarkContext unionMark() throws RecognitionException {
		UnionMarkContext _localctx = new UnionMarkContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_unionMark);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			_la = _input.LA(1);
			if ( !(_la==PIPE || _la==UNION_LITERAL) ) {
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

	public static class IntersectionMarkContext extends ParserRuleContext {
		public TerminalNode POWER() { return getToken(ASNParser.POWER, 0); }
		public TerminalNode INTERSECTION_LITERAL() { return getToken(ASNParser.INTERSECTION_LITERAL, 0); }
		public IntersectionMarkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectionMark; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterIntersectionMark(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitIntersectionMark(this);
		}
	}

	public final IntersectionMarkContext intersectionMark() throws RecognitionException {
		IntersectionMarkContext _localctx = new IntersectionMarkContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_intersectionMark);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			_la = _input.LA(1);
			if ( !(_la==POWER || _la==INTERSECTION_LITERAL) ) {
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

	public static class ElementsContext extends ParserRuleContext {
		public SubtypeElementsContext subtypeElements() {
			return getRuleContext(SubtypeElementsContext.class,0);
		}
		public ElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitElements(this);
		}
	}

	public final ElementsContext elements() throws RecognitionException {
		ElementsContext _localctx = new ElementsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_elements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			subtypeElements();
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

	public static class ObjectSetElementsContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public DefinedObjectContext definedObject() {
			return getRuleContext(DefinedObjectContext.class,0);
		}
		public ObjectSetElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectSetElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterObjectSetElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitObjectSetElements(this);
		}
	}

	public final ObjectSetElementsContext objectSetElements() throws RecognitionException {
		ObjectSetElementsContext _localctx = new ObjectSetElementsContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_objectSetElements);
		try {
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				object();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				definedObject();
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

	public static class IntersectionElementsContext extends ParserRuleContext {
		public ElementsContext elements() {
			return getRuleContext(ElementsContext.class,0);
		}
		public ExclusionsContext exclusions() {
			return getRuleContext(ExclusionsContext.class,0);
		}
		public IntersectionElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectionElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterIntersectionElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitIntersectionElements(this);
		}
	}

	public final IntersectionElementsContext intersectionElements() throws RecognitionException {
		IntersectionElementsContext _localctx = new IntersectionElementsContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_intersectionElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			elements();
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPT_LITERAL) {
				{
				setState(775);
				exclusions();
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

	public static class SubtypeElementsContext extends ParserRuleContext {
		public TerminalNode DOUBLE_DOT() { return getToken(ASNParser.DOUBLE_DOT, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode MIN_LITERAL() { return getToken(ASNParser.MIN_LITERAL, 0); }
		public TerminalNode MAX_LITERAL() { return getToken(ASNParser.MAX_LITERAL, 0); }
		public List<TerminalNode> LESS_THAN() { return getTokens(ASNParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(ASNParser.LESS_THAN, i);
		}
		public SizeConstraintContext sizeConstraint() {
			return getRuleContext(SizeConstraintContext.class,0);
		}
		public TerminalNode PATTERN_LITERAL() { return getToken(ASNParser.PATTERN_LITERAL, 0); }
		public SubtypeElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtypeElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterSubtypeElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitSubtypeElements(this);
		}
	}

	public final SubtypeElementsContext subtypeElements() throws RecognitionException {
		SubtypeElementsContext _localctx = new SubtypeElementsContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_subtypeElements);
		int _la;
		try {
			setState(797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(780);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE_LITERAL:
				case FALSE_LITERAL:
				case TRUE_SMALL_LITERAL:
				case FALSE_SMALL_LITERAL:
				case L_BRACE:
				case MINUS:
				case NUMBER:
				case CSTRING:
				case IDENTIFIER:
					{
					setState(778);
					value();
					}
					break;
				case MIN_LITERAL:
					{
					setState(779);
					match(MIN_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESS_THAN) {
					{
					setState(782);
					match(LESS_THAN);
					}
				}

				setState(785);
				match(DOUBLE_DOT);
				setState(787);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESS_THAN) {
					{
					setState(786);
					match(LESS_THAN);
					}
				}

				setState(791);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE_LITERAL:
				case FALSE_LITERAL:
				case TRUE_SMALL_LITERAL:
				case FALSE_SMALL_LITERAL:
				case L_BRACE:
				case MINUS:
				case NUMBER:
				case CSTRING:
				case IDENTIFIER:
					{
					setState(789);
					value();
					}
					break;
				case MAX_LITERAL:
					{
					setState(790);
					match(MAX_LITERAL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				sizeConstraint();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(794);
				match(PATTERN_LITERAL);
				setState(795);
				value();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(796);
				value();
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

	public static class VariableTypeValueSetFieldSpecContext extends ParserRuleContext {
		public TerminalNode AMPERSAND() { return getToken(ASNParser.AMPERSAND, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public ValueSetOptionalitySpecContext valueSetOptionalitySpec() {
			return getRuleContext(ValueSetOptionalitySpecContext.class,0);
		}
		public VariableTypeValueSetFieldSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableTypeValueSetFieldSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterVariableTypeValueSetFieldSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitVariableTypeValueSetFieldSpec(this);
		}
	}

	public final VariableTypeValueSetFieldSpecContext variableTypeValueSetFieldSpec() throws RecognitionException {
		VariableTypeValueSetFieldSpecContext _localctx = new VariableTypeValueSetFieldSpecContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_variableTypeValueSetFieldSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(AMPERSAND);
			setState(800);
			match(IDENTIFIER);
			setState(801);
			fieldName();
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL_LITERAL || _la==DEFAULT_LITERAL) {
				{
				setState(802);
				valueSetOptionalitySpec();
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

	public static class ObjectFieldSpecContext extends ParserRuleContext {
		public TerminalNode AMPERSAND() { return getToken(ASNParser.AMPERSAND, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public DefinedObjectClassContext definedObjectClass() {
			return getRuleContext(DefinedObjectClassContext.class,0);
		}
		public ObjectOptionalitySpecContext objectOptionalitySpec() {
			return getRuleContext(ObjectOptionalitySpecContext.class,0);
		}
		public ObjectFieldSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectFieldSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterObjectFieldSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitObjectFieldSpec(this);
		}
	}

	public final ObjectFieldSpecContext objectFieldSpec() throws RecognitionException {
		ObjectFieldSpecContext _localctx = new ObjectFieldSpecContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_objectFieldSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(AMPERSAND);
			setState(806);
			match(IDENTIFIER);
			setState(807);
			definedObjectClass();
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL_LITERAL || _la==DEFAULT_LITERAL) {
				{
				setState(808);
				objectOptionalitySpec();
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

	public static class ObjectOptionalitySpecContext extends ParserRuleContext {
		public TerminalNode OPTIONAL_LITERAL() { return getToken(ASNParser.OPTIONAL_LITERAL, 0); }
		public TerminalNode DEFAULT_LITERAL() { return getToken(ASNParser.DEFAULT_LITERAL, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ObjectOptionalitySpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectOptionalitySpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterObjectOptionalitySpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitObjectOptionalitySpec(this);
		}
	}

	public final ObjectOptionalitySpecContext objectOptionalitySpec() throws RecognitionException {
		ObjectOptionalitySpecContext _localctx = new ObjectOptionalitySpecContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_objectOptionalitySpec);
		try {
			setState(814);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTIONAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(811);
				match(OPTIONAL_LITERAL);
				}
				break;
			case DEFAULT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(812);
				match(DEFAULT_LITERAL);
				setState(813);
				object();
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

	public static class ObjectSetFieldSpecContext extends ParserRuleContext {
		public TerminalNode AMPERSAND() { return getToken(ASNParser.AMPERSAND, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public DefinedObjectClassContext definedObjectClass() {
			return getRuleContext(DefinedObjectClassContext.class,0);
		}
		public ObjectSetOptionalitySpecContext objectSetOptionalitySpec() {
			return getRuleContext(ObjectSetOptionalitySpecContext.class,0);
		}
		public ObjectSetFieldSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectSetFieldSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterObjectSetFieldSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitObjectSetFieldSpec(this);
		}
	}

	public final ObjectSetFieldSpecContext objectSetFieldSpec() throws RecognitionException {
		ObjectSetFieldSpecContext _localctx = new ObjectSetFieldSpecContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_objectSetFieldSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(AMPERSAND);
			setState(817);
			match(IDENTIFIER);
			setState(818);
			definedObjectClass();
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONAL_LITERAL || _la==DEFAULT_LITERAL) {
				{
				setState(819);
				objectSetOptionalitySpec();
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

	public static class ObjectSetOptionalitySpecContext extends ParserRuleContext {
		public TerminalNode OPTIONAL_LITERAL() { return getToken(ASNParser.OPTIONAL_LITERAL, 0); }
		public TerminalNode DEFAULT_LITERAL() { return getToken(ASNParser.DEFAULT_LITERAL, 0); }
		public ObjectSetContext objectSet() {
			return getRuleContext(ObjectSetContext.class,0);
		}
		public ObjectSetOptionalitySpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectSetOptionalitySpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterObjectSetOptionalitySpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitObjectSetOptionalitySpec(this);
		}
	}

	public final ObjectSetOptionalitySpecContext objectSetOptionalitySpec() throws RecognitionException {
		ObjectSetOptionalitySpecContext _localctx = new ObjectSetOptionalitySpecContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_objectSetOptionalitySpec);
		try {
			setState(825);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPTIONAL_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(822);
				match(OPTIONAL_LITERAL);
				}
				break;
			case DEFAULT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(823);
				match(DEFAULT_LITERAL);
				setState(824);
				objectSet();
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

	public static class TypeAssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN_OP() { return getToken(ASNParser.ASSIGN_OP, 0); }
		public AsnTypeContext asnType() {
			return getRuleContext(AsnTypeContext.class,0);
		}
		public TypeAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterTypeAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitTypeAssignment(this);
		}
	}

	public final TypeAssignmentContext typeAssignment() throws RecognitionException {
		TypeAssignmentContext _localctx = new TypeAssignmentContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_typeAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(ASSIGN_OP);
			setState(828);
			asnType();
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

	public static class ValueAssignmentContext extends ParserRuleContext {
		public AsnTypeContext asnType() {
			return getRuleContext(AsnTypeContext.class,0);
		}
		public TerminalNode ASSIGN_OP() { return getToken(ASNParser.ASSIGN_OP, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterValueAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitValueAssignment(this);
		}
	}

	public final ValueAssignmentContext valueAssignment() throws RecognitionException {
		ValueAssignmentContext _localctx = new ValueAssignmentContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_valueAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			asnType();
			setState(831);
			match(ASSIGN_OP);
			setState(832);
			value();
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

	public static class AsnTypeContext extends ParserRuleContext {
		public BuiltinTypeContext builtinType() {
			return getRuleContext(BuiltinTypeContext.class,0);
		}
		public ReferencedTypeContext referencedType() {
			return getRuleContext(ReferencedTypeContext.class,0);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public AsnTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asnType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterAsnType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitAsnType(this);
		}
	}

	public final AsnTypeContext asnType() throws RecognitionException {
		AsnTypeContext _localctx = new AsnTypeContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_asnType);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(834);
				builtinType();
				}
				break;
			case 2:
				{
				setState(835);
				referencedType();
				}
				break;
			}
			setState(841);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(838);
					constraint();
					}
					} 
				}
				setState(843);
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

	public static class BuiltinTypeContext extends ParserRuleContext {
		public OctetStringTypeContext octetStringType() {
			return getRuleContext(OctetStringTypeContext.class,0);
		}
		public BitStringTypeContext bitStringType() {
			return getRuleContext(BitStringTypeContext.class,0);
		}
		public ChoiceTypeContext choiceType() {
			return getRuleContext(ChoiceTypeContext.class,0);
		}
		public EnumeratedTypeContext enumeratedType() {
			return getRuleContext(EnumeratedTypeContext.class,0);
		}
		public IntegerTypeContext integerType() {
			return getRuleContext(IntegerTypeContext.class,0);
		}
		public SequenceTypeContext sequenceType() {
			return getRuleContext(SequenceTypeContext.class,0);
		}
		public SequenceOfTypeContext sequenceOfType() {
			return getRuleContext(SequenceOfTypeContext.class,0);
		}
		public SetTypeContext setType() {
			return getRuleContext(SetTypeContext.class,0);
		}
		public SetOfTypeContext setOfType() {
			return getRuleContext(SetOfTypeContext.class,0);
		}
		public ObjectidentifiertypeContext objectidentifiertype() {
			return getRuleContext(ObjectidentifiertypeContext.class,0);
		}
		public ObjectClassFieldTypeContext objectClassFieldType() {
			return getRuleContext(ObjectClassFieldTypeContext.class,0);
		}
		public BuiltinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterBuiltinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitBuiltinType(this);
		}
	}

	public final BuiltinTypeContext builtinType() throws RecognitionException {
		BuiltinTypeContext _localctx = new BuiltinTypeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_builtinType);
		try {
			setState(855);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(844);
				octetStringType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				bitStringType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(846);
				choiceType();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(847);
				enumeratedType();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(848);
				integerType();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(849);
				sequenceType();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(850);
				sequenceOfType();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(851);
				setType();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(852);
				setOfType();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(853);
				objectidentifiertype();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(854);
				objectClassFieldType();
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

	public static class ObjectClassFieldTypeContext extends ParserRuleContext {
		public DefinedObjectClassContext definedObjectClass() {
			return getRuleContext(DefinedObjectClassContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ASNParser.DOT, 0); }
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public ObjectClassFieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectClassFieldType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterObjectClassFieldType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitObjectClassFieldType(this);
		}
	}

	public final ObjectClassFieldTypeContext objectClassFieldType() throws RecognitionException {
		ObjectClassFieldTypeContext _localctx = new ObjectClassFieldTypeContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_objectClassFieldType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			definedObjectClass();
			setState(858);
			match(DOT);
			setState(859);
			fieldName();
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

	public static class SetTypeContext extends ParserRuleContext {
		public TerminalNode SET_LITERAL() { return getToken(ASNParser.SET_LITERAL, 0); }
		public TerminalNode L_BRACE() { return getToken(ASNParser.L_BRACE, 0); }
		public TerminalNode R_BRACE() { return getToken(ASNParser.R_BRACE, 0); }
		public ExtensionAndExceptionContext extensionAndException() {
			return getRuleContext(ExtensionAndExceptionContext.class,0);
		}
		public OptionalExtensionMarkerContext optionalExtensionMarker() {
			return getRuleContext(OptionalExtensionMarkerContext.class,0);
		}
		public ComponentTypeListsContext componentTypeLists() {
			return getRuleContext(ComponentTypeListsContext.class,0);
		}
		public SetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterSetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitSetType(this);
		}
	}

	public final SetTypeContext setType() throws RecognitionException {
		SetTypeContext _localctx = new SetTypeContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_setType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			match(SET_LITERAL);
			setState(862);
			match(L_BRACE);
			setState(867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(863);
				extensionAndException();
				setState(864);
				optionalExtensionMarker();
				}
				break;
			case 2:
				{
				setState(866);
				componentTypeLists();
				}
				break;
			}
			setState(869);
			match(R_BRACE);
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

	public static class SetOfTypeContext extends ParserRuleContext {
		public TerminalNode SET_LITERAL() { return getToken(ASNParser.SET_LITERAL, 0); }
		public TerminalNode OF_LITERAL() { return getToken(ASNParser.OF_LITERAL, 0); }
		public AsnTypeContext asnType() {
			return getRuleContext(AsnTypeContext.class,0);
		}
		public NamedTypeContext namedType() {
			return getRuleContext(NamedTypeContext.class,0);
		}
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public SizeConstraintContext sizeConstraint() {
			return getRuleContext(SizeConstraintContext.class,0);
		}
		public SetOfTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setOfType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterSetOfType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitSetOfType(this);
		}
	}

	public final SetOfTypeContext setOfType() throws RecognitionException {
		SetOfTypeContext _localctx = new SetOfTypeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_setOfType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(871);
			match(SET_LITERAL);
			setState(874);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PARAN:
				{
				setState(872);
				constraint();
				}
				break;
			case SIZE_LITERAL:
				{
				setState(873);
				sizeConstraint();
				}
				break;
			case OF_LITERAL:
				break;
			default:
				break;
			}
			setState(876);
			match(OF_LITERAL);
			setState(879);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(877);
				asnType();
				}
				break;
			case 2:
				{
				setState(878);
				namedType();
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

	public static class ReferencedTypeContext extends ParserRuleContext {
		public DefinedTypeContext definedType() {
			return getRuleContext(DefinedTypeContext.class,0);
		}
		public ReferencedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_referencedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterReferencedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitReferencedType(this);
		}
	}

	public final ReferencedTypeContext referencedType() throws RecognitionException {
		ReferencedTypeContext _localctx = new ReferencedTypeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_referencedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			definedType();
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

	public static class DefinedTypeContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ASNParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ASNParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(ASNParser.DOT, 0); }
		public ActualParameterListContext actualParameterList() {
			return getRuleContext(ActualParameterListContext.class,0);
		}
		public DefinedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterDefinedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitDefinedType(this);
		}
	}

	public final DefinedTypeContext definedType() throws RecognitionException {
		DefinedTypeContext _localctx = new DefinedTypeContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_definedType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			match(IDENTIFIER);
			setState(886);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(884);
				match(DOT);
				setState(885);
				match(IDENTIFIER);
				}
			}

			setState(889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(888);
				actualParameterList();
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

	public static class ConstraintContext extends ParserRuleContext {
		public TerminalNode L_PARAN() { return getToken(ASNParser.L_PARAN, 0); }
		public ConstraintSpecContext constraintSpec() {
			return getRuleContext(ConstraintSpecContext.class,0);
		}
		public TerminalNode R_PARAN() { return getToken(ASNParser.R_PARAN, 0); }
		public ExceptionSpecContext exceptionSpec() {
			return getRuleContext(ExceptionSpecContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitConstraint(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(L_PARAN);
			setState(892);
			constraintSpec();
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCLAM) {
				{
				setState(893);
				exceptionSpec();
				}
			}

			setState(896);
			match(R_PARAN);
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

	public static class ConstraintSpecContext extends ParserRuleContext {
		public GeneralConstraintContext generalConstraint() {
			return getRuleContext(GeneralConstraintContext.class,0);
		}
		public SubtypeConstraintContext subtypeConstraint() {
			return getRuleContext(SubtypeConstraintContext.class,0);
		}
		public ConstraintSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterConstraintSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitConstraintSpec(this);
		}
	}

	public final ConstraintSpecContext constraintSpec() throws RecognitionException {
		ConstraintSpecContext _localctx = new ConstraintSpecContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_constraintSpec);
		try {
			setState(900);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(898);
				generalConstraint();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(899);
				subtypeConstraint();
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

	public static class UserDefinedConstraintContext extends ParserRuleContext {
		public TerminalNode CONSTRAINED_LITERAL() { return getToken(ASNParser.CONSTRAINED_LITERAL, 0); }
		public TerminalNode BY_LITERAL() { return getToken(ASNParser.BY_LITERAL, 0); }
		public TerminalNode L_BRACE() { return getToken(ASNParser.L_BRACE, 0); }
		public List<UserDefinedConstraintParameterContext> userDefinedConstraintParameter() {
			return getRuleContexts(UserDefinedConstraintParameterContext.class);
		}
		public UserDefinedConstraintParameterContext userDefinedConstraintParameter(int i) {
			return getRuleContext(UserDefinedConstraintParameterContext.class,i);
		}
		public TerminalNode R_BRACE() { return getToken(ASNParser.R_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ASNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASNParser.COMMA, i);
		}
		public UserDefinedConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterUserDefinedConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitUserDefinedConstraint(this);
		}
	}

	public final UserDefinedConstraintContext userDefinedConstraint() throws RecognitionException {
		UserDefinedConstraintContext _localctx = new UserDefinedConstraintContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_userDefinedConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(902);
			match(CONSTRAINED_LITERAL);
			setState(903);
			match(BY_LITERAL);
			setState(904);
			match(L_BRACE);
			setState(905);
			userDefinedConstraintParameter();
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(906);
				match(COMMA);
				setState(907);
				userDefinedConstraintParameter();
				}
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(913);
			match(R_BRACE);
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

	public static class GeneralConstraintContext extends ParserRuleContext {
		public UserDefinedConstraintContext userDefinedConstraint() {
			return getRuleContext(UserDefinedConstraintContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public ContentsConstraintContext contentsConstraint() {
			return getRuleContext(ContentsConstraintContext.class,0);
		}
		public GeneralConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterGeneralConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitGeneralConstraint(this);
		}
	}

	public final GeneralConstraintContext generalConstraint() throws RecognitionException {
		GeneralConstraintContext _localctx = new GeneralConstraintContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_generalConstraint);
		try {
			setState(918);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTRAINED_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(915);
				userDefinedConstraint();
				}
				break;
			case L_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(916);
				tableConstraint();
				}
				break;
			case CONTAINING_LITERAL:
			case ENCODED_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(917);
				contentsConstraint();
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

	public static class UserDefinedConstraintParameterContext extends ParserRuleContext {
		public GovernorContext governor() {
			return getRuleContext(GovernorContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ASNParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueSetContext valueSet() {
			return getRuleContext(ValueSetContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ObjectSetContext objectSet() {
			return getRuleContext(ObjectSetContext.class,0);
		}
		public UserDefinedConstraintParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userDefinedConstraintParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterUserDefinedConstraintParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitUserDefinedConstraintParameter(this);
		}
	}

	public final UserDefinedConstraintParameterContext userDefinedConstraintParameter() throws RecognitionException {
		UserDefinedConstraintParameterContext _localctx = new UserDefinedConstraintParameterContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_userDefinedConstraintParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			governor();
			setState(926);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(921);
				match(COLON);
				setState(922);
				value();
				}
				break;
			case 2:
				{
				setState(923);
				valueSet();
				}
				break;
			case 3:
				{
				setState(924);
				object();
				}
				break;
			case 4:
				{
				setState(925);
				objectSet();
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

	public static class TableConstraintContext extends ParserRuleContext {
		public ComponentRelationConstraintContext componentRelationConstraint() {
			return getRuleContext(ComponentRelationConstraintContext.class,0);
		}
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterTableConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitTableConstraint(this);
		}
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_tableConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			componentRelationConstraint();
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

	public static class SimpleTableConstraintContext extends ParserRuleContext {
		public ObjectSetContext objectSet() {
			return getRuleContext(ObjectSetContext.class,0);
		}
		public SimpleTableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTableConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterSimpleTableConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitSimpleTableConstraint(this);
		}
	}

	public final SimpleTableConstraintContext simpleTableConstraint() throws RecognitionException {
		SimpleTableConstraintContext _localctx = new SimpleTableConstraintContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_simpleTableConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			objectSet();
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

	public static class ContentsConstraintContext extends ParserRuleContext {
		public TerminalNode CONTAINING_LITERAL() { return getToken(ASNParser.CONTAINING_LITERAL, 0); }
		public AsnTypeContext asnType() {
			return getRuleContext(AsnTypeContext.class,0);
		}
		public TerminalNode ENCODED_LITERAL() { return getToken(ASNParser.ENCODED_LITERAL, 0); }
		public TerminalNode BY_LITERAL() { return getToken(ASNParser.BY_LITERAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ContentsConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentsConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterContentsConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitContentsConstraint(this);
		}
	}

	public final ContentsConstraintContext contentsConstraint() throws RecognitionException {
		ContentsConstraintContext _localctx = new ContentsConstraintContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_contentsConstraint);
		try {
			setState(943);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				match(CONTAINING_LITERAL);
				setState(933);
				asnType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(934);
				match(ENCODED_LITERAL);
				setState(935);
				match(BY_LITERAL);
				setState(936);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(937);
				match(CONTAINING_LITERAL);
				setState(938);
				asnType();
				setState(939);
				match(ENCODED_LITERAL);
				setState(940);
				match(BY_LITERAL);
				setState(941);
				value();
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

	public static class SubtypeConstraintContext extends ParserRuleContext {
		public ElementSetSpecsContext elementSetSpecs() {
			return getRuleContext(ElementSetSpecsContext.class,0);
		}
		public SubtypeConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtypeConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterSubtypeConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitSubtypeConstraint(this);
		}
	}

	public final SubtypeConstraintContext subtypeConstraint() throws RecognitionException {
		SubtypeConstraintContext _localctx = new SubtypeConstraintContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_subtypeConstraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			elementSetSpecs();
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

	public static class ValueContext extends ParserRuleContext {
		public BuiltinValueContext builtinValue() {
			return getRuleContext(BuiltinValueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			builtinValue();
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

	public static class BuiltinValueContext extends ParserRuleContext {
		public EnumeratedValueContext enumeratedValue() {
			return getRuleContext(EnumeratedValueContext.class,0);
		}
		public IntegerValueContext integerValue() {
			return getRuleContext(IntegerValueContext.class,0);
		}
		public ChoiceValueContext choiceValue() {
			return getRuleContext(ChoiceValueContext.class,0);
		}
		public ObjectIdentifierValueContext objectIdentifierValue() {
			return getRuleContext(ObjectIdentifierValueContext.class,0);
		}
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode CSTRING() { return getToken(ASNParser.CSTRING, 0); }
		public BuiltinValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtinValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterBuiltinValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitBuiltinValue(this);
		}
	}

	public final BuiltinValueContext builtinValue() throws RecognitionException {
		BuiltinValueContext _localctx = new BuiltinValueContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_builtinValue);
		try {
			setState(955);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(949);
				enumeratedValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(950);
				integerValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(951);
				choiceValue();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(952);
				objectIdentifierValue();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(953);
				booleanValue();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(954);
				match(CSTRING);
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

	public static class ObjectIdentifierValueContext extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(ASNParser.L_BRACE, 0); }
		public ObjIdComponentsListContext objIdComponentsList() {
			return getRuleContext(ObjIdComponentsListContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(ASNParser.R_BRACE, 0); }
		public ObjectIdentifierValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectIdentifierValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterObjectIdentifierValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitObjectIdentifierValue(this);
		}
	}

	public final ObjectIdentifierValueContext objectIdentifierValue() throws RecognitionException {
		ObjectIdentifierValueContext _localctx = new ObjectIdentifierValueContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_objectIdentifierValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(957);
			match(L_BRACE);
			setState(958);
			objIdComponentsList();
			setState(959);
			match(R_BRACE);
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

	public static class ObjIdComponentsListContext extends ParserRuleContext {
		public List<ObjIdComponentsContext> objIdComponents() {
			return getRuleContexts(ObjIdComponentsContext.class);
		}
		public ObjIdComponentsContext objIdComponents(int i) {
			return getRuleContext(ObjIdComponentsContext.class,i);
		}
		public ObjIdComponentsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objIdComponentsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterObjIdComponentsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitObjIdComponentsList(this);
		}
	}

	public final ObjIdComponentsListContext objIdComponentsList() throws RecognitionException {
		ObjIdComponentsListContext _localctx = new ObjIdComponentsListContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_objIdComponentsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(961);
			objIdComponents();
			}
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NUMBER || _la==IDENTIFIER) {
				{
				{
				setState(962);
				objIdComponents();
				}
				}
				setState(967);
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

	public static class ObjIdComponentsContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ASNParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public TerminalNode L_PARAN() { return getToken(ASNParser.L_PARAN, 0); }
		public TerminalNode R_PARAN() { return getToken(ASNParser.R_PARAN, 0); }
		public DefinedValueContext definedValue() {
			return getRuleContext(DefinedValueContext.class,0);
		}
		public ObjIdComponentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objIdComponents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterObjIdComponents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitObjIdComponents(this);
		}
	}

	public final ObjIdComponentsContext objIdComponents() throws RecognitionException {
		ObjIdComponentsContext _localctx = new ObjIdComponentsContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_objIdComponents);
		int _la;
		try {
			setState(979);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(968);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
				match(IDENTIFIER);
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==L_PARAN) {
					{
					setState(970);
					match(L_PARAN);
					setState(973);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NUMBER:
						{
						setState(971);
						match(NUMBER);
						}
						break;
					case IDENTIFIER:
						{
						setState(972);
						definedValue();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(975);
					match(R_PARAN);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(978);
				definedValue();
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

	public static class IntegerValueContext extends ParserRuleContext {
		public SignedNumberContext signedNumber() {
			return getRuleContext(SignedNumberContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public IntegerValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterIntegerValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitIntegerValue(this);
		}
	}

	public final IntegerValueContext integerValue() throws RecognitionException {
		IntegerValueContext _localctx = new IntegerValueContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_integerValue);
		try {
			setState(983);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(981);
				signedNumber();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(982);
				match(IDENTIFIER);
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

	public static class ChoiceValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(ASNParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ChoiceValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choiceValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterChoiceValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitChoiceValue(this);
		}
	}

	public final ChoiceValueContext choiceValue() throws RecognitionException {
		ChoiceValueContext _localctx = new ChoiceValueContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_choiceValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(IDENTIFIER);
			setState(986);
			match(COLON);
			setState(987);
			value();
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

	public static class EnumeratedValueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public EnumeratedValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratedValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterEnumeratedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitEnumeratedValue(this);
		}
	}

	public final EnumeratedValueContext enumeratedValue() throws RecognitionException {
		EnumeratedValueContext _localctx = new EnumeratedValueContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_enumeratedValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(IDENTIFIER);
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

	public static class SignedNumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ASNParser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(ASNParser.MINUS, 0); }
		public SignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterSignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitSignedNumber(this);
		}
	}

	public final SignedNumberContext signedNumber() throws RecognitionException {
		SignedNumberContext _localctx = new SignedNumberContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_signedNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(991);
				match(MINUS);
				}
			}

			setState(994);
			match(NUMBER);
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

	public static class ChoiceTypeContext extends ParserRuleContext {
		public TerminalNode CHOICE_LITERAL() { return getToken(ASNParser.CHOICE_LITERAL, 0); }
		public TerminalNode L_BRACE() { return getToken(ASNParser.L_BRACE, 0); }
		public AlternativeTypeListsContext alternativeTypeLists() {
			return getRuleContext(AlternativeTypeListsContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(ASNParser.R_BRACE, 0); }
		public ChoiceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choiceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterChoiceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitChoiceType(this);
		}
	}

	public final ChoiceTypeContext choiceType() throws RecognitionException {
		ChoiceTypeContext _localctx = new ChoiceTypeContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_choiceType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			match(CHOICE_LITERAL);
			setState(997);
			match(L_BRACE);
			setState(998);
			alternativeTypeLists();
			setState(999);
			match(R_BRACE);
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

	public static class AlternativeTypeListsContext extends ParserRuleContext {
		public RootAlternativeTypeListContext rootAlternativeTypeList() {
			return getRuleContext(RootAlternativeTypeListContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ASNParser.COMMA, 0); }
		public ExtensionAndExceptionContext extensionAndException() {
			return getRuleContext(ExtensionAndExceptionContext.class,0);
		}
		public ExtensionAdditionAlternativesContext extensionAdditionAlternatives() {
			return getRuleContext(ExtensionAdditionAlternativesContext.class,0);
		}
		public OptionalExtensionMarkerContext optionalExtensionMarker() {
			return getRuleContext(OptionalExtensionMarkerContext.class,0);
		}
		public AlternativeTypeListsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternativeTypeLists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterAlternativeTypeLists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitAlternativeTypeLists(this);
		}
	}

	public final AlternativeTypeListsContext alternativeTypeLists() throws RecognitionException {
		AlternativeTypeListsContext _localctx = new AlternativeTypeListsContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_alternativeTypeLists);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			rootAlternativeTypeList();
			setState(1007);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1002);
				match(COMMA);
				setState(1003);
				extensionAndException();
				setState(1004);
				extensionAdditionAlternatives();
				setState(1005);
				optionalExtensionMarker();
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

	public static class ExtensionAdditionAlternativesContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ASNParser.COMMA, 0); }
		public ExtensionAdditionAlternativesListContext extensionAdditionAlternativesList() {
			return getRuleContext(ExtensionAdditionAlternativesListContext.class,0);
		}
		public ExtensionAdditionAlternativesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionAdditionAlternatives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterExtensionAdditionAlternatives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitExtensionAdditionAlternatives(this);
		}
	}

	public final ExtensionAdditionAlternativesContext extensionAdditionAlternatives() throws RecognitionException {
		ExtensionAdditionAlternativesContext _localctx = new ExtensionAdditionAlternativesContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_extensionAdditionAlternatives);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(1009);
				match(COMMA);
				setState(1010);
				extensionAdditionAlternativesList();
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

	public static class ExtensionAdditionAlternativesListContext extends ParserRuleContext {
		public List<ExtensionAdditionAlternativeContext> extensionAdditionAlternative() {
			return getRuleContexts(ExtensionAdditionAlternativeContext.class);
		}
		public ExtensionAdditionAlternativeContext extensionAdditionAlternative(int i) {
			return getRuleContext(ExtensionAdditionAlternativeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ASNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASNParser.COMMA, i);
		}
		public ExtensionAdditionAlternativesListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionAdditionAlternativesList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterExtensionAdditionAlternativesList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitExtensionAdditionAlternativesList(this);
		}
	}

	public final ExtensionAdditionAlternativesListContext extensionAdditionAlternativesList() throws RecognitionException {
		ExtensionAdditionAlternativesListContext _localctx = new ExtensionAdditionAlternativesListContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_extensionAdditionAlternativesList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1013);
			extensionAdditionAlternative();
			}
			setState(1018);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1014);
					match(COMMA);
					setState(1015);
					extensionAdditionAlternative();
					}
					} 
				}
				setState(1020);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
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

	public static class ExtensionAdditionAlternativeContext extends ParserRuleContext {
		public ExtensionAdditionAlternativesGroupContext extensionAdditionAlternativesGroup() {
			return getRuleContext(ExtensionAdditionAlternativesGroupContext.class,0);
		}
		public NamedTypeContext namedType() {
			return getRuleContext(NamedTypeContext.class,0);
		}
		public ExtensionAdditionAlternativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionAdditionAlternative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterExtensionAdditionAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitExtensionAdditionAlternative(this);
		}
	}

	public final ExtensionAdditionAlternativeContext extensionAdditionAlternative() throws RecognitionException {
		ExtensionAdditionAlternativeContext _localctx = new ExtensionAdditionAlternativeContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_extensionAdditionAlternative);
		try {
			setState(1023);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_L_BRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(1021);
				extensionAdditionAlternativesGroup();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1022);
				namedType();
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

	public static class ExtensionAdditionAlternativesGroupContext extends ParserRuleContext {
		public TerminalNode DOUBLE_L_BRACKET() { return getToken(ASNParser.DOUBLE_L_BRACKET, 0); }
		public VersionNumberContext versionNumber() {
			return getRuleContext(VersionNumberContext.class,0);
		}
		public AlternativeTypeListContext alternativeTypeList() {
			return getRuleContext(AlternativeTypeListContext.class,0);
		}
		public TerminalNode DOUBLE_R_BRACKET() { return getToken(ASNParser.DOUBLE_R_BRACKET, 0); }
		public ExtensionAdditionAlternativesGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionAdditionAlternativesGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterExtensionAdditionAlternativesGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitExtensionAdditionAlternativesGroup(this);
		}
	}

	public final ExtensionAdditionAlternativesGroupContext extensionAdditionAlternativesGroup() throws RecognitionException {
		ExtensionAdditionAlternativesGroupContext _localctx = new ExtensionAdditionAlternativesGroupContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_extensionAdditionAlternativesGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1025);
			match(DOUBLE_L_BRACKET);
			setState(1026);
			versionNumber();
			setState(1027);
			alternativeTypeList();
			setState(1028);
			match(DOUBLE_R_BRACKET);
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

	public static class RootAlternativeTypeListContext extends ParserRuleContext {
		public AlternativeTypeListContext alternativeTypeList() {
			return getRuleContext(AlternativeTypeListContext.class,0);
		}
		public RootAlternativeTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rootAlternativeTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterRootAlternativeTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitRootAlternativeTypeList(this);
		}
	}

	public final RootAlternativeTypeListContext rootAlternativeTypeList() throws RecognitionException {
		RootAlternativeTypeListContext _localctx = new RootAlternativeTypeListContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_rootAlternativeTypeList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			alternativeTypeList();
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

	public static class AlternativeTypeListContext extends ParserRuleContext {
		public List<NamedTypeContext> namedType() {
			return getRuleContexts(NamedTypeContext.class);
		}
		public NamedTypeContext namedType(int i) {
			return getRuleContext(NamedTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ASNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASNParser.COMMA, i);
		}
		public AlternativeTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternativeTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterAlternativeTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitAlternativeTypeList(this);
		}
	}

	public final AlternativeTypeListContext alternativeTypeList() throws RecognitionException {
		AlternativeTypeListContext _localctx = new AlternativeTypeListContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_alternativeTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1032);
			namedType();
			}
			setState(1037);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1033);
					match(COMMA);
					setState(1034);
					namedType();
					}
					} 
				}
				setState(1039);
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

	public static class NamedTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public AsnTypeContext asnType() {
			return getRuleContext(AsnTypeContext.class,0);
		}
		public NamedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterNamedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitNamedType(this);
		}
	}

	public final NamedTypeContext namedType() throws RecognitionException {
		NamedTypeContext _localctx = new NamedTypeContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_namedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(IDENTIFIER);
			setState(1041);
			asnType();
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

	public static class EnumeratedTypeContext extends ParserRuleContext {
		public TerminalNode ENUMERATED_LITERAL() { return getToken(ASNParser.ENUMERATED_LITERAL, 0); }
		public TerminalNode L_BRACE() { return getToken(ASNParser.L_BRACE, 0); }
		public EnumerationsContext enumerations() {
			return getRuleContext(EnumerationsContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(ASNParser.R_BRACE, 0); }
		public EnumeratedTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratedType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterEnumeratedType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitEnumeratedType(this);
		}
	}

	public final EnumeratedTypeContext enumeratedType() throws RecognitionException {
		EnumeratedTypeContext _localctx = new EnumeratedTypeContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_enumeratedType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			match(ENUMERATED_LITERAL);
			setState(1044);
			match(L_BRACE);
			setState(1045);
			enumerations();
			setState(1046);
			match(R_BRACE);
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

	public static class EnumerationsContext extends ParserRuleContext {
		public RootEnumerationContext rootEnumeration() {
			return getRuleContext(RootEnumerationContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ASNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASNParser.COMMA, i);
		}
		public TerminalNode ELLIPSIS() { return getToken(ASNParser.ELLIPSIS, 0); }
		public ExceptionSpecContext exceptionSpec() {
			return getRuleContext(ExceptionSpecContext.class,0);
		}
		public AdditionalEnumerationContext additionalEnumeration() {
			return getRuleContext(AdditionalEnumerationContext.class,0);
		}
		public EnumerationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterEnumerations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitEnumerations(this);
		}
	}

	public final EnumerationsContext enumerations() throws RecognitionException {
		EnumerationsContext _localctx = new EnumerationsContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_enumerations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			rootEnumeration();
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1049);
				match(COMMA);
				setState(1050);
				match(ELLIPSIS);
				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXCLAM) {
					{
					setState(1051);
					exceptionSpec();
					}
				}

				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1054);
					match(COMMA);
					setState(1055);
					additionalEnumeration();
					}
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

	public static class RootEnumerationContext extends ParserRuleContext {
		public EnumerationContext enumeration() {
			return getRuleContext(EnumerationContext.class,0);
		}
		public RootEnumerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rootEnumeration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterRootEnumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitRootEnumeration(this);
		}
	}

	public final RootEnumerationContext rootEnumeration() throws RecognitionException {
		RootEnumerationContext _localctx = new RootEnumerationContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_rootEnumeration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			enumeration();
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

	public static class EnumerationContext extends ParserRuleContext {
		public List<EnumerationItemContext> enumerationItem() {
			return getRuleContexts(EnumerationItemContext.class);
		}
		public EnumerationItemContext enumerationItem(int i) {
			return getRuleContext(EnumerationItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ASNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASNParser.COMMA, i);
		}
		public EnumerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterEnumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitEnumeration(this);
		}
	}

	public final EnumerationContext enumeration() throws RecognitionException {
		EnumerationContext _localctx = new EnumerationContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_enumeration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			enumerationItem();
			setState(1067);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1063);
					match(COMMA);
					setState(1064);
					enumerationItem();
					}
					} 
				}
				setState(1069);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
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

	public static class EnumerationItemContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public NamedNumberContext namedNumber() {
			return getRuleContext(NamedNumberContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public EnumerationItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterEnumerationItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitEnumerationItem(this);
		}
	}

	public final EnumerationItemContext enumerationItem() throws RecognitionException {
		EnumerationItemContext _localctx = new EnumerationItemContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_enumerationItem);
		try {
			setState(1073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1070);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1071);
				namedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1072);
				value();
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

	public static class NamedNumberContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public TerminalNode L_PARAN() { return getToken(ASNParser.L_PARAN, 0); }
		public TerminalNode R_PARAN() { return getToken(ASNParser.R_PARAN, 0); }
		public SignedNumberContext signedNumber() {
			return getRuleContext(SignedNumberContext.class,0);
		}
		public DefinedValueContext definedValue() {
			return getRuleContext(DefinedValueContext.class,0);
		}
		public NamedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterNamedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitNamedNumber(this);
		}
	}

	public final NamedNumberContext namedNumber() throws RecognitionException {
		NamedNumberContext _localctx = new NamedNumberContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_namedNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			match(IDENTIFIER);
			setState(1076);
			match(L_PARAN);
			setState(1079);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NUMBER:
				{
				setState(1077);
				signedNumber();
				}
				break;
			case IDENTIFIER:
				{
				setState(1078);
				definedValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1081);
			match(R_PARAN);
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

	public static class DefinedValueContext extends ParserRuleContext {
		public ParameterizedValueContext parameterizedValue() {
			return getRuleContext(ParameterizedValueContext.class,0);
		}
		public DefinedValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definedValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterDefinedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitDefinedValue(this);
		}
	}

	public final DefinedValueContext definedValue() throws RecognitionException {
		DefinedValueContext _localctx = new DefinedValueContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_definedValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			parameterizedValue();
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

	public static class ParameterizedValueContext extends ParserRuleContext {
		public SimpleDefinedValueContext simpleDefinedValue() {
			return getRuleContext(SimpleDefinedValueContext.class,0);
		}
		public ActualParameterListContext actualParameterList() {
			return getRuleContext(ActualParameterListContext.class,0);
		}
		public ParameterizedValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterizedValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterParameterizedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitParameterizedValue(this);
		}
	}

	public final ParameterizedValueContext parameterizedValue() throws RecognitionException {
		ParameterizedValueContext _localctx = new ParameterizedValueContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_parameterizedValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			simpleDefinedValue();
			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_BRACE) {
				{
				setState(1086);
				actualParameterList();
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

	public static class SimpleDefinedValueContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ASNParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ASNParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(ASNParser.DOT, 0); }
		public SimpleDefinedValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDefinedValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterSimpleDefinedValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitSimpleDefinedValue(this);
		}
	}

	public final SimpleDefinedValueContext simpleDefinedValue() throws RecognitionException {
		SimpleDefinedValueContext _localctx = new SimpleDefinedValueContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_simpleDefinedValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1089);
			match(IDENTIFIER);
			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1090);
				match(DOT);
				setState(1091);
				match(IDENTIFIER);
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

	public static class ActualParameterListContext extends ParserRuleContext {
		public TerminalNode L_BRACE() { return getToken(ASNParser.L_BRACE, 0); }
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public TerminalNode R_BRACE() { return getToken(ASNParser.R_BRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ASNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASNParser.COMMA, i);
		}
		public ActualParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterActualParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitActualParameterList(this);
		}
	}

	public final ActualParameterListContext actualParameterList() throws RecognitionException {
		ActualParameterListContext _localctx = new ActualParameterListContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_actualParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			match(L_BRACE);
			setState(1095);
			actualParameter();
			setState(1100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1096);
				match(COMMA);
				setState(1097);
				actualParameter();
				}
				}
				setState(1102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1103);
			match(R_BRACE);
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
		public AsnTypeContext asnType() {
			return getRuleContext(AsnTypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterActualParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitActualParameter(this);
		}
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_actualParameter);
		try {
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1105);
				asnType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				value();
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

	public static class ExceptionSpecContext extends ParserRuleContext {
		public TerminalNode EXCLAM() { return getToken(ASNParser.EXCLAM, 0); }
		public ExceptionIdentificationContext exceptionIdentification() {
			return getRuleContext(ExceptionIdentificationContext.class,0);
		}
		public ExceptionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterExceptionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitExceptionSpec(this);
		}
	}

	public final ExceptionSpecContext exceptionSpec() throws RecognitionException {
		ExceptionSpecContext _localctx = new ExceptionSpecContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_exceptionSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			match(EXCLAM);
			setState(1110);
			exceptionIdentification();
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

	public static class ExceptionIdentificationContext extends ParserRuleContext {
		public SignedNumberContext signedNumber() {
			return getRuleContext(SignedNumberContext.class,0);
		}
		public DefinedValueContext definedValue() {
			return getRuleContext(DefinedValueContext.class,0);
		}
		public AsnTypeContext asnType() {
			return getRuleContext(AsnTypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ASNParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ExceptionIdentificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exceptionIdentification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterExceptionIdentification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitExceptionIdentification(this);
		}
	}

	public final ExceptionIdentificationContext exceptionIdentification() throws RecognitionException {
		ExceptionIdentificationContext _localctx = new ExceptionIdentificationContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_exceptionIdentification);
		try {
			setState(1118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1112);
				signedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1113);
				definedValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1114);
				asnType();
				setState(1115);
				match(COLON);
				setState(1116);
				value();
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

	public static class AdditionalEnumerationContext extends ParserRuleContext {
		public EnumerationContext enumeration() {
			return getRuleContext(EnumerationContext.class,0);
		}
		public AdditionalEnumerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionalEnumeration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterAdditionalEnumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitAdditionalEnumeration(this);
		}
	}

	public final AdditionalEnumerationContext additionalEnumeration() throws RecognitionException {
		AdditionalEnumerationContext _localctx = new AdditionalEnumerationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_additionalEnumeration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			enumeration();
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

	public static class IntegerTypeContext extends ParserRuleContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(ASNParser.INTEGER_LITERAL, 0); }
		public TerminalNode L_BRACE() { return getToken(ASNParser.L_BRACE, 0); }
		public NamedNumberListContext namedNumberList() {
			return getRuleContext(NamedNumberListContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(ASNParser.R_BRACE, 0); }
		public IntegerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterIntegerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitIntegerType(this);
		}
	}

	public final IntegerTypeContext integerType() throws RecognitionException {
		IntegerTypeContext _localctx = new IntegerTypeContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_integerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1122);
			match(INTEGER_LITERAL);
			setState(1127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				{
				setState(1123);
				match(L_BRACE);
				setState(1124);
				namedNumberList();
				setState(1125);
				match(R_BRACE);
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

	public static class NamedNumberListContext extends ParserRuleContext {
		public List<NamedNumberContext> namedNumber() {
			return getRuleContexts(NamedNumberContext.class);
		}
		public NamedNumberContext namedNumber(int i) {
			return getRuleContext(NamedNumberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ASNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASNParser.COMMA, i);
		}
		public NamedNumberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedNumberList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterNamedNumberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitNamedNumberList(this);
		}
	}

	public final NamedNumberListContext namedNumberList() throws RecognitionException {
		NamedNumberListContext _localctx = new NamedNumberListContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_namedNumberList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1129);
			namedNumber();
			}
			setState(1134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1130);
				match(COMMA);
				setState(1131);
				namedNumber();
				}
				}
				setState(1136);
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

	public static class ObjectidentifiertypeContext extends ParserRuleContext {
		public TerminalNode OBJECT_LITERAL() { return getToken(ASNParser.OBJECT_LITERAL, 0); }
		public TerminalNode IDENTIFIER_LITERAL() { return getToken(ASNParser.IDENTIFIER_LITERAL, 0); }
		public ObjectidentifiertypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectidentifiertype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterObjectidentifiertype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitObjectidentifiertype(this);
		}
	}

	public final ObjectidentifiertypeContext objectidentifiertype() throws RecognitionException {
		ObjectidentifiertypeContext _localctx = new ObjectidentifiertypeContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_objectidentifiertype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			match(OBJECT_LITERAL);
			setState(1138);
			match(IDENTIFIER_LITERAL);
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

	public static class ComponentRelationConstraintContext extends ParserRuleContext {
		public List<TerminalNode> L_BRACE() { return getTokens(ASNParser.L_BRACE); }
		public TerminalNode L_BRACE(int i) {
			return getToken(ASNParser.L_BRACE, i);
		}
		public List<TerminalNode> R_BRACE() { return getTokens(ASNParser.R_BRACE); }
		public TerminalNode R_BRACE(int i) {
			return getToken(ASNParser.R_BRACE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ASNParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ASNParser.IDENTIFIER, i);
		}
		public List<AtNotationContext> atNotation() {
			return getRuleContexts(AtNotationContext.class);
		}
		public AtNotationContext atNotation(int i) {
			return getRuleContext(AtNotationContext.class,i);
		}
		public TerminalNode DOT() { return getToken(ASNParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ASNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASNParser.COMMA, i);
		}
		public ComponentRelationConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentRelationConstraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterComponentRelationConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitComponentRelationConstraint(this);
		}
	}

	public final ComponentRelationConstraintContext componentRelationConstraint() throws RecognitionException {
		ComponentRelationConstraintContext _localctx = new ComponentRelationConstraintContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_componentRelationConstraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			match(L_BRACE);
			{
			setState(1141);
			match(IDENTIFIER);
			setState(1144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1142);
				match(DOT);
				setState(1143);
				match(IDENTIFIER);
				}
			}

			}
			setState(1146);
			match(R_BRACE);
			setState(1158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==L_BRACE) {
				{
				setState(1147);
				match(L_BRACE);
				setState(1148);
				atNotation();
				setState(1153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1149);
					match(COMMA);
					setState(1150);
					atNotation();
					}
					}
					setState(1155);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1156);
				match(R_BRACE);
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

	public static class AtNotationContext extends ParserRuleContext {
		public ComponentIdListContext componentIdList() {
			return getRuleContext(ComponentIdListContext.class,0);
		}
		public TerminalNode A_ROND() { return getToken(ASNParser.A_ROND, 0); }
		public TerminalNode A_ROND_DOT() { return getToken(ASNParser.A_ROND_DOT, 0); }
		public LevelContext level() {
			return getRuleContext(LevelContext.class,0);
		}
		public AtNotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atNotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterAtNotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitAtNotation(this);
		}
	}

	public final AtNotationContext atNotation() throws RecognitionException {
		AtNotationContext _localctx = new AtNotationContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_atNotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case A_ROND:
				{
				setState(1160);
				match(A_ROND);
				}
				break;
			case A_ROND_DOT:
				{
				{
				setState(1161);
				match(A_ROND_DOT);
				setState(1162);
				level();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1165);
			componentIdList();
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

	public static class LevelContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(ASNParser.DOT, 0); }
		public LevelContext level() {
			return getRuleContext(LevelContext.class,0);
		}
		public LevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitLevel(this);
		}
	}

	public final LevelContext level() throws RecognitionException {
		LevelContext _localctx = new LevelContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_level);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1167);
				match(DOT);
				setState(1168);
				level();
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

	public static class ComponentIdListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ASNParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ASNParser.IDENTIFIER, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ASNParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ASNParser.DOT, i);
		}
		public ComponentIdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentIdList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterComponentIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitComponentIdList(this);
		}
	}

	public final ComponentIdListContext componentIdList() throws RecognitionException {
		ComponentIdListContext _localctx = new ComponentIdListContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_componentIdList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1171);
			match(IDENTIFIER);
			setState(1176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1172);
				match(DOT);
				setState(1173);
				match(IDENTIFIER);
				}
				}
				setState(1178);
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

	public static class OctetStringTypeContext extends ParserRuleContext {
		public TerminalNode OCTET_LITERAL() { return getToken(ASNParser.OCTET_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ASNParser.STRING_LITERAL, 0); }
		public OctetStringTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octetStringType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterOctetStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitOctetStringType(this);
		}
	}

	public final OctetStringTypeContext octetStringType() throws RecognitionException {
		OctetStringTypeContext _localctx = new OctetStringTypeContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_octetStringType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			match(OCTET_LITERAL);
			setState(1180);
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

	public static class BitStringTypeContext extends ParserRuleContext {
		public TerminalNode BIT_LITERAL() { return getToken(ASNParser.BIT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ASNParser.STRING_LITERAL, 0); }
		public TerminalNode L_BRACE() { return getToken(ASNParser.L_BRACE, 0); }
		public NamedBitListContext namedBitList() {
			return getRuleContext(NamedBitListContext.class,0);
		}
		public TerminalNode R_BRACE() { return getToken(ASNParser.R_BRACE, 0); }
		public BitStringTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitStringType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterBitStringType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitBitStringType(this);
		}
	}

	public final BitStringTypeContext bitStringType() throws RecognitionException {
		BitStringTypeContext _localctx = new BitStringTypeContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_bitStringType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1182);
			match(BIT_LITERAL);
			setState(1183);
			match(STRING_LITERAL);
			}
			setState(1189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1185);
				match(L_BRACE);
				setState(1186);
				namedBitList();
				setState(1187);
				match(R_BRACE);
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

	public static class NamedBitListContext extends ParserRuleContext {
		public List<NamedBitContext> namedBit() {
			return getRuleContexts(NamedBitContext.class);
		}
		public NamedBitContext namedBit(int i) {
			return getRuleContext(NamedBitContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ASNParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ASNParser.COMMA, i);
		}
		public NamedBitListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedBitList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterNamedBitList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitNamedBitList(this);
		}
	}

	public final NamedBitListContext namedBitList() throws RecognitionException {
		NamedBitListContext _localctx = new NamedBitListContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_namedBitList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1191);
			namedBit();
			}
			setState(1196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1192);
				match(COMMA);
				setState(1193);
				namedBit();
				}
				}
				setState(1198);
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

	public static class NamedBitContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ASNParser.IDENTIFIER, 0); }
		public TerminalNode L_PARAN() { return getToken(ASNParser.L_PARAN, 0); }
		public TerminalNode R_PARAN() { return getToken(ASNParser.R_PARAN, 0); }
		public TerminalNode NUMBER() { return getToken(ASNParser.NUMBER, 0); }
		public DefinedValueContext definedValue() {
			return getRuleContext(DefinedValueContext.class,0);
		}
		public NamedBitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedBit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterNamedBit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitNamedBit(this);
		}
	}

	public final NamedBitContext namedBit() throws RecognitionException {
		NamedBitContext _localctx = new NamedBitContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_namedBit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1199);
			match(IDENTIFIER);
			setState(1200);
			match(L_PARAN);
			setState(1203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(1201);
				match(NUMBER);
				}
				break;
			case IDENTIFIER:
				{
				setState(1202);
				definedValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1205);
			match(R_PARAN);
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

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE_LITERAL() { return getToken(ASNParser.TRUE_LITERAL, 0); }
		public TerminalNode FALSE_LITERAL() { return getToken(ASNParser.FALSE_LITERAL, 0); }
		public TerminalNode TRUE_SMALL_LITERAL() { return getToken(ASNParser.TRUE_SMALL_LITERAL, 0); }
		public TerminalNode FALSE_SMALL_LITERAL() { return getToken(ASNParser.FALSE_SMALL_LITERAL, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ASNListener ) ((ASNListener)listener).exitBooleanValue(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE_LITERAL) | (1L << FALSE_LITERAL) | (1L << TRUE_SMALL_LITERAL) | (1L << FALSE_SMALL_LITERAL))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3j\u04bc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
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
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\3\2\3\2\3\2\3\2\3\2\3\2\7\2\u0127"+
		"\n\2\f\2\16\2\u012a\13\2\3\2\5\2\u012d\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\5\3\u0139\n\3\3\4\3\4\5\4\u013d\n\4\3\5\3\5\3\5\3\5\5\5\u0143"+
		"\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u014c\n\6\3\7\5\7\u014f\n\7\3\b\3"+
		"\b\3\b\3\b\5\b\u0155\n\b\3\t\5\t\u0158\n\t\3\n\3\n\7\n\u015c\n\n\f\n\16"+
		"\n\u015f\13\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\7"+
		"\16\u016d\n\16\f\16\16\16\u0170\13\16\3\17\3\17\3\17\5\17\u0175\n\17\3"+
		"\20\3\20\7\20\u0179\n\20\f\20\16\20\u017c\13\20\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u0183\n\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u018b\n\22\3\22"+
		"\3\22\3\23\3\23\5\23\u0191\n\23\3\24\3\24\5\24\u0195\n\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u019f\n\25\5\25\u01a1\n\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u01a9\n\25\5\25\u01ab\n\25\3\26\3\26\3\27\3"+
		"\27\3\27\7\27\u01b2\n\27\f\27\16\27\u01b5\13\27\3\30\3\30\3\30\3\30\5"+
		"\30\u01bb\n\30\3\30\3\30\3\30\5\30\u01c0\n\30\3\31\3\31\5\31\u01c4\n\31"+
		"\3\32\3\32\3\32\7\32\u01c9\n\32\f\32\16\32\u01cc\13\32\3\33\3\33\5\33"+
		"\u01d0\n\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\5\35\u01d9\n\35\3\36\3"+
		"\36\3\36\3\36\5\36\u01df\n\36\3\36\3\36\5\36\u01e3\n\36\3\36\3\36\3\36"+
		"\5\36\u01e8\n\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \5 \u01f2\n \3 \3 \3 \3"+
		" \3 \5 \u01f9\n \5 \u01fb\n \3!\3!\3!\3!\7!\u0201\n!\f!\16!\u0204\13!"+
		"\3!\3!\3\"\3\"\3\"\5\"\u020b\n\"\3\"\3\"\3#\3#\5#\u0211\n#\3$\3$\5$\u0215"+
		"\n$\3%\3%\3%\3&\3&\5&\u021c\n&\3\'\3\'\5\'\u0220\n\'\3\'\3\'\3\'\5\'\u0225"+
		"\n\'\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\7*\u0232\n*\f*\16*\u0235\13*\3*"+
		"\3*\5*\u0239\n*\3+\3+\3+\3+\3,\3,\6,\u0241\n,\r,\16,\u0242\3,\3,\3-\3"+
		"-\5-\u0249\n-\3.\3.\6.\u024d\n.\r.\16.\u024e\3.\3.\3/\3/\5/\u0255\n/\3"+
		"\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\5\62\u025f\n\62\3\62\3\62\5\62"+
		"\u0263\n\62\3\62\5\62\u0266\n\62\3\62\5\62\u0269\n\62\5\62\u026b\n\62"+
		"\3\62\3\62\3\62\3\62\3\62\5\62\u0272\n\62\5\62\u0274\n\62\3\62\3\62\3"+
		"\62\3\62\3\62\5\62\u027b\n\62\5\62\u027d\n\62\5\62\u027f\n\62\3\63\3\63"+
		"\3\63\5\63\u0284\n\63\3\64\3\64\3\64\5\64\u0289\n\64\3\65\3\65\3\65\3"+
		"\65\5\65\u028f\n\65\3\65\5\65\u0292\n\65\3\66\3\66\3\66\5\66\u0297\n\66"+
		"\3\67\3\67\3\67\3\67\5\67\u029d\n\67\38\38\38\38\58\u02a3\n8\39\39\39"+
		"\59\u02a8\n9\3:\3:\5:\u02ac\n:\3;\3;\3;\3<\3<\5<\u02b3\n<\3=\3=\3=\3="+
		"\3>\3>\3>\3>\3>\5>\u02be\n>\5>\u02c0\n>\3>\3>\3>\5>\u02c5\n>\5>\u02c7"+
		"\n>\3?\3?\3?\3?\3?\3?\7?\u02cf\n?\f?\16?\u02d2\13?\3@\3@\3@\3@\3A\3A\3"+
		"A\3A\3A\5A\u02dd\nA\5A\u02df\nA\3B\3B\3C\3C\3D\3D\3D\5D\u02e8\nD\3E\3"+
		"E\3E\3E\7E\u02ee\nE\fE\16E\u02f1\13E\3F\3F\3F\3G\3G\3G\3G\7G\u02fa\nG"+
		"\fG\16G\u02fd\13G\3H\3H\3I\3I\3J\3J\3K\3K\5K\u0307\nK\3L\3L\5L\u030b\n"+
		"L\3M\3M\5M\u030f\nM\3M\5M\u0312\nM\3M\3M\5M\u0316\nM\3M\3M\5M\u031a\n"+
		"M\3M\3M\3M\3M\5M\u0320\nM\3N\3N\3N\3N\5N\u0326\nN\3O\3O\3O\3O\5O\u032c"+
		"\nO\3P\3P\3P\5P\u0331\nP\3Q\3Q\3Q\3Q\5Q\u0337\nQ\3R\3R\3R\5R\u033c\nR"+
		"\3S\3S\3S\3T\3T\3T\3T\3U\3U\5U\u0347\nU\3U\7U\u034a\nU\fU\16U\u034d\13"+
		"U\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u035a\nV\3W\3W\3W\3W\3X\3X\3X\3"+
		"X\3X\3X\5X\u0366\nX\3X\3X\3Y\3Y\3Y\5Y\u036d\nY\3Y\3Y\3Y\5Y\u0372\nY\3"+
		"Z\3Z\3[\3[\3[\5[\u0379\n[\3[\5[\u037c\n[\3\\\3\\\3\\\5\\\u0381\n\\\3\\"+
		"\3\\\3]\3]\5]\u0387\n]\3^\3^\3^\3^\3^\3^\7^\u038f\n^\f^\16^\u0392\13^"+
		"\3^\3^\3_\3_\3_\5_\u0399\n_\3`\3`\3`\3`\3`\3`\5`\u03a1\n`\3a\3a\3b\3b"+
		"\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\3c\5c\u03b2\nc\3d\3d\3e\3e\3f\3f\3f\3f"+
		"\3f\3f\5f\u03be\nf\3g\3g\3g\3g\3h\3h\7h\u03c6\nh\fh\16h\u03c9\13h\3i\3"+
		"i\3i\3i\3i\5i\u03d0\ni\3i\5i\u03d3\ni\3i\5i\u03d6\ni\3j\3j\5j\u03da\n"+
		"j\3k\3k\3k\3k\3l\3l\3m\5m\u03e3\nm\3m\3m\3n\3n\3n\3n\3n\3o\3o\3o\3o\3"+
		"o\3o\5o\u03f2\no\3p\3p\5p\u03f6\np\3q\3q\3q\7q\u03fb\nq\fq\16q\u03fe\13"+
		"q\3r\3r\5r\u0402\nr\3s\3s\3s\3s\3s\3t\3t\3u\3u\3u\7u\u040e\nu\fu\16u\u0411"+
		"\13u\3v\3v\3v\3w\3w\3w\3w\3w\3x\3x\3x\3x\5x\u041f\nx\3x\3x\5x\u0423\n"+
		"x\5x\u0425\nx\3y\3y\3z\3z\3z\7z\u042c\nz\fz\16z\u042f\13z\3{\3{\3{\5{"+
		"\u0434\n{\3|\3|\3|\3|\5|\u043a\n|\3|\3|\3}\3}\3~\3~\5~\u0442\n~\3\177"+
		"\3\177\3\177\5\177\u0447\n\177\3\u0080\3\u0080\3\u0080\3\u0080\7\u0080"+
		"\u044d\n\u0080\f\u0080\16\u0080\u0450\13\u0080\3\u0080\3\u0080\3\u0081"+
		"\3\u0081\5\u0081\u0456\n\u0081\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083"+
		"\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0461\n\u0083\3\u0084\3\u0084"+
		"\3\u0085\3\u0085\3\u0085\3\u0085\3\u0085\5\u0085\u046a\n\u0085\3\u0086"+
		"\3\u0086\3\u0086\7\u0086\u046f\n\u0086\f\u0086\16\u0086\u0472\13\u0086"+
		"\3\u0087\3\u0087\3\u0087\3\u0088\3\u0088\3\u0088\3\u0088\5\u0088\u047b"+
		"\n\u0088\3\u0088\3\u0088\3\u0088\3\u0088\3\u0088\7\u0088\u0482\n\u0088"+
		"\f\u0088\16\u0088\u0485\13\u0088\3\u0088\3\u0088\5\u0088\u0489\n\u0088"+
		"\3\u0089\3\u0089\3\u0089\5\u0089\u048e\n\u0089\3\u0089\3\u0089\3\u008a"+
		"\3\u008a\5\u008a\u0494\n\u008a\3\u008b\3\u008b\3\u008b\7\u008b\u0499\n"+
		"\u008b\f\u008b\16\u008b\u049c\13\u008b\3\u008c\3\u008c\3\u008c\3\u008d"+
		"\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u04a8\n\u008d"+
		"\3\u008e\3\u008e\3\u008e\7\u008e\u04ad\n\u008e\f\u008e\16\u008e\u04b0"+
		"\13\u008e\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u04b6\n\u008f\3\u008f"+
		"\3\u008f\3\u0090\3\u0090\3\u0090\2\2\u0091\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e"+
		"\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\2\b\4\2HHJK\3\2;<\4\2"+
		"\27\27jj\3\2./\4\2--\60\60\4\2\7\b\22\23\2\u04da\2\u0120\3\2\2\2\4\u0138"+
		"\3\2\2\2\6\u013c\3\2\2\2\b\u0142\3\2\2\2\n\u014b\3\2\2\2\f\u014e\3\2\2"+
		"\2\16\u0154\3\2\2\2\20\u0157\3\2\2\2\22\u0159\3\2\2\2\24\u0160\3\2\2\2"+
		"\26\u0164\3\2\2\2\30\u0167\3\2\2\2\32\u0169\3\2\2\2\34\u0171\3\2\2\2\36"+
		"\u0176\3\2\2\2 \u017d\3\2\2\2\"\u0184\3\2\2\2$\u018e\3\2\2\2&\u0194\3"+
		"\2\2\2(\u01aa\3\2\2\2*\u01ac\3\2\2\2,\u01ae\3\2\2\2.\u01bf\3\2\2\2\60"+
		"\u01c3\3\2\2\2\62\u01c5\3\2\2\2\64\u01cf\3\2\2\2\66\u01d1\3\2\2\28\u01d8"+
		"\3\2\2\2:\u01da\3\2\2\2<\u01e9\3\2\2\2>\u01fa\3\2\2\2@\u01fc\3\2\2\2B"+
		"\u020a\3\2\2\2D\u0210\3\2\2\2F\u0214\3\2\2\2H\u0216\3\2\2\2J\u021b\3\2"+
		"\2\2L\u0224\3\2\2\2N\u0226\3\2\2\2P\u0228\3\2\2\2R\u022c\3\2\2\2T\u023a"+
		"\3\2\2\2V\u023e\3\2\2\2X\u0248\3\2\2\2Z\u024a\3\2\2\2\\\u0254\3\2\2\2"+
		"^\u0256\3\2\2\2`\u0258\3\2\2\2b\u025b\3\2\2\2d\u0280\3\2\2\2f\u0288\3"+
		"\2\2\2h\u028a\3\2\2\2j\u0296\3\2\2\2l\u0298\3\2\2\2n\u029e\3\2\2\2p\u02a7"+
		"\3\2\2\2r\u02ab\3\2\2\2t\u02ad\3\2\2\2v\u02b0\3\2\2\2x\u02b4\3\2\2\2z"+
		"\u02c6\3\2\2\2|\u02c8\3\2\2\2~\u02d3\3\2\2\2\u0080\u02d7\3\2\2\2\u0082"+
		"\u02e0\3\2\2\2\u0084\u02e2\3\2\2\2\u0086\u02e7\3\2\2\2\u0088\u02e9\3\2"+
		"\2\2\u008a\u02f2\3\2\2\2\u008c\u02f5\3\2\2\2\u008e\u02fe\3\2\2\2\u0090"+
		"\u0300\3\2\2\2\u0092\u0302\3\2\2\2\u0094\u0306\3\2\2\2\u0096\u0308\3\2"+
		"\2\2\u0098\u031f\3\2\2\2\u009a\u0321\3\2\2\2\u009c\u0327\3\2\2\2\u009e"+
		"\u0330\3\2\2\2\u00a0\u0332\3\2\2\2\u00a2\u033b\3\2\2\2\u00a4\u033d\3\2"+
		"\2\2\u00a6\u0340\3\2\2\2\u00a8\u0346\3\2\2\2\u00aa\u0359\3\2\2\2\u00ac"+
		"\u035b\3\2\2\2\u00ae\u035f\3\2\2\2\u00b0\u0369\3\2\2\2\u00b2\u0373\3\2"+
		"\2\2\u00b4\u0375\3\2\2\2\u00b6\u037d\3\2\2\2\u00b8\u0386\3\2\2\2\u00ba"+
		"\u0388\3\2\2\2\u00bc\u0398\3\2\2\2\u00be\u039a\3\2\2\2\u00c0\u03a2\3\2"+
		"\2\2\u00c2\u03a4\3\2\2\2\u00c4\u03b1\3\2\2\2\u00c6\u03b3\3\2\2\2\u00c8"+
		"\u03b5\3\2\2\2\u00ca\u03bd\3\2\2\2\u00cc\u03bf\3\2\2\2\u00ce\u03c3\3\2"+
		"\2\2\u00d0\u03d5\3\2\2\2\u00d2\u03d9\3\2\2\2\u00d4\u03db\3\2\2\2\u00d6"+
		"\u03df\3\2\2\2\u00d8\u03e2\3\2\2\2\u00da\u03e6\3\2\2\2\u00dc\u03eb\3\2"+
		"\2\2\u00de\u03f5\3\2\2\2\u00e0\u03f7\3\2\2\2\u00e2\u0401\3\2\2\2\u00e4"+
		"\u0403\3\2\2\2\u00e6\u0408\3\2\2\2\u00e8\u040a\3\2\2\2\u00ea\u0412\3\2"+
		"\2\2\u00ec\u0415\3\2\2\2\u00ee\u041a\3\2\2\2\u00f0\u0426\3\2\2\2\u00f2"+
		"\u0428\3\2\2\2\u00f4\u0433\3\2\2\2\u00f6\u0435\3\2\2\2\u00f8\u043d\3\2"+
		"\2\2\u00fa\u043f\3\2\2\2\u00fc\u0443\3\2\2\2\u00fe\u0448\3\2\2\2\u0100"+
		"\u0455\3\2\2\2\u0102\u0457\3\2\2\2\u0104\u0460\3\2\2\2\u0106\u0462\3\2"+
		"\2\2\u0108\u0464\3\2\2\2\u010a\u046b\3\2\2\2\u010c\u0473\3\2\2\2\u010e"+
		"\u0476\3\2\2\2\u0110\u048d\3\2\2\2\u0112\u0493\3\2\2\2\u0114\u0495\3\2"+
		"\2\2\u0116\u049d\3\2\2\2\u0118\u04a0\3\2\2\2\u011a\u04a9\3\2\2\2\u011c"+
		"\u04b1\3\2\2\2\u011e\u04b9\3\2\2\2\u0120\u012c\7j\2\2\u0121\u0128\7\25"+
		"\2\2\u0122\u0123\7j\2\2\u0123\u0124\7\30\2\2\u0124\u0125\7d\2\2\u0125"+
		"\u0127\7\31\2\2\u0126\u0122\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3"+
		"\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u012d\7\26\2\2\u012c\u0121\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3"+
		"\2\2\2\u012e\u012f\7L\2\2\u012f\u0130\5\4\3\2\u0130\u0131\5\6\4\2\u0131"+
		"\u0132\7\5\2\2\u0132\u0133\7M\2\2\u0133\u0134\5\b\5\2\u0134\u0135\7N\2"+
		"\2\u0135\3\3\2\2\2\u0136\u0137\t\2\2\2\u0137\u0139\7I\2\2\u0138\u0136"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139\5\3\2\2\2\u013a\u013b\7F\2\2\u013b"+
		"\u013d\7G\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\7\3\2\2\2"+
		"\u013e\u013f\5\n\6\2\u013f\u0140\5\16\b\2\u0140\u0141\5\36\20\2\u0141"+
		"\u0143\3\2\2\2\u0142\u013e\3\2\2\2\u0142\u0143\3\2\2\2\u0143\t\3\2\2\2"+
		"\u0144\u0145\7E\2\2\u0145\u0146\5\f\7\2\u0146\u0147\7C\2\2\u0147\u014c"+
		"\3\2\2\2\u0148\u0149\7E\2\2\u0149\u014a\7+\2\2\u014a\u014c\7C\2\2\u014b"+
		"\u0144\3\2\2\2\u014b\u0148\3\2\2\2\u014b\u014c\3\2\2\2\u014c\13\3\2\2"+
		"\2\u014d\u014f\5\32\16\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\r\3\2\2\2\u0150\u0151\7D\2\2\u0151\u0152\5\20\t\2\u0152\u0153\7C\2\2"+
		"\u0153\u0155\3\2\2\2\u0154\u0150\3\2\2\2\u0154\u0155\3\2\2\2\u0155\17"+
		"\3\2\2\2\u0156\u0158\5\22\n\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2\2\2"+
		"\u0158\21\3\2\2\2\u0159\u015d\5\24\13\2\u015a\u015c\5\24\13\2\u015b\u015a"+
		"\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\23\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\5\32\16\2\u0161\u0162\7\65"+
		"\2\2\u0162\u0163\5\26\f\2\u0163\25\3\2\2\2\u0164\u0165\7j\2\2\u0165\u0166"+
		"\5\30\r\2\u0166\27\3\2\2\2\u0167\u0168\3\2\2\2\u0168\31\3\2\2\2\u0169"+
		"\u016e\5\34\17\2\u016a\u016b\7\27\2\2\u016b\u016d\5\34\17\2\u016c\u016a"+
		"\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\33\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0174\7j\2\2\u0172\u0173\7\25\2"+
		"\2\u0173\u0175\7\26\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\35\3\2\2\2\u0176\u017a\5 \21\2\u0177\u0179\5 \21\2\u0178\u0177\3\2\2"+
		"\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b\37"+
		"\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u0182\7j\2\2\u017e\u0183\5\u00a6T\2"+
		"\u017f\u0183\5\u00a4S\2\u0180\u0183\5> \2\u0181\u0183\5H%\2\u0182\u017e"+
		"\3\2\2\2\u0182\u017f\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0181\3\2\2\2\u0183"+
		"!\3\2\2\2\u0184\u0185\7$\2\2\u0185\u018a\7\25\2\2\u0186\u0187\5$\23\2"+
		"\u0187\u0188\5&\24\2\u0188\u018b\3\2\2\2\u0189\u018b\5(\25\2\u018a\u0186"+
		"\3\2\2\2\u018a\u0189\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018d\7\26\2\2\u018d#\3\2\2\2\u018e\u0190\7\13\2\2\u018f\u0191\5\u0102"+
		"\u0082\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2\2\2\u0191%\3\2\2\2\u0192"+
		"\u0193\7\27\2\2\u0193\u0195\7\13\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3"+
		"\2\2\2\u0195\'\3\2\2\2\u0196\u01a0\5*\26\2\u0197\u0198\7\27\2\2\u0198"+
		"\u0199\5$\23\2\u0199\u019e\5\60\31\2\u019a\u019f\5&\24\2\u019b\u019c\7"+
		"c\2\2\u019c\u019d\7\27\2\2\u019d\u019f\5*\26\2\u019e\u019a\3\2\2\2\u019e"+
		"\u019b\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u0197\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01ab\3\2\2\2\u01a2\u01a3\5$\23\2\u01a3\u01a8\5\60\31\2\u01a4"+
		"\u01a9\5&\24\2\u01a5\u01a6\7c\2\2\u01a6\u01a7\7\27\2\2\u01a7\u01a9\5*"+
		"\26\2\u01a8\u01a4\3\2\2\2\u01a8\u01a5\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa"+
		"\u0196\3\2\2\2\u01aa\u01a2\3\2\2\2\u01ab)\3\2\2\2\u01ac\u01ad\5,\27\2"+
		"\u01ad+\3\2\2\2\u01ae\u01b3\5.\30\2\u01af\u01b0\7\27\2\2\u01b0\u01b2\5"+
		".\30\2\u01b1\u01af\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4-\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01ba\5\u00ea"+
		"v\2\u01b7\u01bb\7%\2\2\u01b8\u01b9\7&\2\2\u01b9\u01bb\5\u00c8e\2\u01ba"+
		"\u01b7\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01c0\3\2"+
		"\2\2\u01bc\u01bd\7\'\2\2\u01bd\u01be\7(\2\2\u01be\u01c0\5\u00a8U\2\u01bf"+
		"\u01b6\3\2\2\2\u01bf\u01bc\3\2\2\2\u01c0/\3\2\2\2\u01c1\u01c2\7\27\2\2"+
		"\u01c2\u01c4\5\62\32\2\u01c3\u01c1\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\61"+
		"\3\2\2\2\u01c5\u01ca\5\64\33\2\u01c6\u01c7\7\27\2\2\u01c7\u01c9\5\64\33"+
		"\2\u01c8\u01c6\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb\63\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01d0\5.\30\2\u01ce"+
		"\u01d0\5\66\34\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\65\3\2"+
		"\2\2\u01d1\u01d2\7O\2\2\u01d2\u01d3\58\35\2\u01d3\u01d4\5,\27\2\u01d4"+
		"\u01d5\7P\2\2\u01d5\67\3\2\2\2\u01d6\u01d7\7d\2\2\u01d7\u01d9\7Q\2\2\u01d8"+
		"\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d99\3\2\2\2\u01da\u01e2\7$\2\2\u01db"+
		"\u01de\7\30\2\2\u01dc\u01df\5\u00b6\\\2\u01dd\u01df\5<\37\2\u01de\u01dc"+
		"\3\2\2\2\u01de\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\7\31\2\2"+
		"\u01e1\u01e3\3\2\2\2\u01e2\u01db\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4"+
		"\3\2\2\2\u01e4\u01e7\7(\2\2\u01e5\u01e8\5\u00a8U\2\u01e6\u01e8\5\u00ea"+
		"v\2\u01e7\u01e5\3\2\2\2\u01e7\u01e6\3\2\2\2\u01e8;\3\2\2\2\u01e9\u01ea"+
		"\7\64\2\2\u01ea\u01eb\5\u00b6\\\2\u01eb=\3\2\2\2\u01ec\u01ed\5@!\2\u01ed"+
		"\u01f1\7\5\2\2\u01ee\u01f2\5\u00a8U\2\u01ef\u01f2\5\u00c8e\2\u01f0\u01f2"+
		"\5~@\2\u01f1\u01ee\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f0\3\2\2\2\u01f2"+
		"\u01fb\3\2\2\2\u01f3\u01f4\5L\'\2\u01f4\u01f8\7\5\2\2\u01f5\u01f9\5r:"+
		"\2\u01f6\u01f9\5J&\2\u01f7\u01f9\5x=\2\u01f8\u01f5\3\2\2\2\u01f8\u01f6"+
		"\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa\u01ec\3\2\2\2\u01fa"+
		"\u01f3\3\2\2\2\u01fb?\3\2\2\2\u01fc\u01fd\7\25\2\2\u01fd\u0202\5B\"\2"+
		"\u01fe\u01ff\7\27\2\2\u01ff\u0201\5B\"\2\u0200\u01fe\3\2\2\2\u0201\u0204"+
		"\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0205\u0206\7\26\2\2\u0206A\3\2\2\2\u0207\u0208\5D#\2\u0208"+
		"\u0209\7Q\2\2\u0209\u020b\3\2\2\2\u020a\u0207\3\2\2\2\u020a\u020b\3\2"+
		"\2\2\u020b\u020c\3\2\2\2\u020c\u020d\7j\2\2\u020dC\3\2\2\2\u020e\u0211"+
		"\5F$\2\u020f\u0211\7j\2\2\u0210\u020e\3\2\2\2\u0210\u020f\3\2\2\2\u0211"+
		"E\3\2\2\2\u0212\u0215\5\u00a8U\2\u0213\u0215\5L\'\2\u0214\u0212\3\2\2"+
		"\2\u0214\u0213\3\2\2\2\u0215G\3\2\2\2\u0216\u0217\7\5\2\2\u0217\u0218"+
		"\5J&\2\u0218I\3\2\2\2\u0219\u021c\5L\'\2\u021a\u021c\5R*\2\u021b\u0219"+
		"\3\2\2\2\u021b\u021a\3\2\2\2\u021cK\3\2\2\2\u021d\u021e\7j\2\2\u021e\u0220"+
		"\7\t\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0225\7j\2\2\u0222\u0225\7;\2\2\u0223\u0225\7<\2\2\u0224\u021f\3\2\2"+
		"\2\u0224\u0222\3\2\2\2\u0224\u0223\3\2\2\2\u0225M\3\2\2\2\u0226\u0227"+
		"\t\3\2\2\u0227O\3\2\2\2\u0228\u0229\7j\2\2\u0229\u022a\7\t\2\2\u022a\u022b"+
		"\7j\2\2\u022bQ\3\2\2\2\u022c\u022d\7=\2\2\u022d\u022e\7\25\2\2\u022e\u0233"+
		"\5b\62\2\u022f\u0230\7\27\2\2\u0230\u0232\5b\62\2\u0231\u022f\3\2\2\2"+
		"\u0232\u0235\3\2\2\2\u0233\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0236"+
		"\3\2\2\2\u0235\u0233\3\2\2\2\u0236\u0238\7\26\2\2\u0237\u0239\5T+\2\u0238"+
		"\u0237\3\2\2\2\u0238\u0239\3\2\2\2\u0239S\3\2\2\2\u023a\u023b\7\66\2\2"+
		"\u023b\u023c\7?\2\2\u023c\u023d\5V,\2\u023dU\3\2\2\2\u023e\u0240\7\25"+
		"\2\2\u023f\u0241\5X-\2\u0240\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0240"+
		"\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\7\26\2\2"+
		"\u0245W\3\2\2\2\u0246\u0249\5\\/\2\u0247\u0249\5Z.\2\u0248\u0246\3\2\2"+
		"\2\u0248\u0247\3\2\2\2\u0249Y\3\2\2\2\u024a\u024c\7@\2\2\u024b\u024d\5"+
		"X-\2\u024c\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024c\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u0251\7A\2\2\u0251[\3\2\2\2\u0252"+
		"\u0255\5^\60\2\u0253\u0255\5`\61\2\u0254\u0252\3\2\2\2\u0254\u0253\3\2"+
		"\2\2\u0255]\3\2\2\2\u0256\u0257\t\4\2\2\u0257_\3\2\2\2\u0258\u0259\7\r"+
		"\2\2\u0259\u025a\7j\2\2\u025aa\3\2\2\2\u025b\u025c\7\r\2\2\u025c\u027e"+
		"\7j\2\2\u025d\u025f\5f\64\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"\u027f\3\2\2\2\u0260\u026a\5\u00a8U\2\u0261\u0263\5p9\2\u0262\u0261\3"+
		"\2\2\2\u0262\u0263\3\2\2\2\u0263\u026b\3\2\2\2\u0264\u0266\7>\2\2\u0265"+
		"\u0264\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0269\5j"+
		"\66\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a"+
		"\u0262\3\2\2\2\u026a\u0265\3\2\2\2\u026b\u027f\3\2\2\2\u026c\u0273\5|"+
		"?\2\u026d\u0274\7%\2\2\u026e\u0271\7&\2\2\u026f\u0272\5~@\2\u0270\u0272"+
		"\5\u00c8e\2\u0271\u026f\3\2\2\2\u0271\u0270\3\2\2\2\u0272\u0274\3\2\2"+
		"\2\u0273\u026d\3\2\2\2\u0273\u026e\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u027f"+
		"\3\2\2\2\u0275\u027c\5L\'\2\u0276\u027d\7%\2\2\u0277\u027a\7&\2\2\u0278"+
		"\u027b\5x=\2\u0279\u027b\5r:\2\u027a\u0278\3\2\2\2\u027a\u0279\3\2\2\2"+
		"\u027b\u027d\3\2\2\2\u027c\u0276\3\2\2\2\u027c\u0277\3\2\2\2\u027c\u027d"+
		"\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u025e\3\2\2\2\u027e\u0260\3\2\2\2\u027e"+
		"\u026c\3\2\2\2\u027e\u0275\3\2\2\2\u027fc\3\2\2\2\u0280\u0281\7\r\2\2"+
		"\u0281\u0283\7j\2\2\u0282\u0284\5f\64\2\u0283\u0282\3\2\2\2\u0283\u0284"+
		"\3\2\2\2\u0284e\3\2\2\2\u0285\u0289\7%\2\2\u0286\u0287\7&\2\2\u0287\u0289"+
		"\5\u00a8U\2\u0288\u0285\3\2\2\2\u0288\u0286\3\2\2\2\u0289g\3\2\2\2\u028a"+
		"\u028b\7\r\2\2\u028b\u028c\7j\2\2\u028c\u028e\5\u00a8U\2\u028d\u028f\7"+
		">\2\2\u028e\u028d\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291\3\2\2\2\u0290"+
		"\u0292\5j\66\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292i\3\2\2\2"+
		"\u0293\u0297\7%\2\2\u0294\u0295\7&\2\2\u0295\u0297\5\u00c8e\2\u0296\u0293"+
		"\3\2\2\2\u0296\u0294\3\2\2\2\u0297k\3\2\2\2\u0298\u0299\7\r\2\2\u0299"+
		"\u029a\7j\2\2\u029a\u029c\5|?\2\u029b\u029d\5j\66\2\u029c\u029b\3\2\2"+
		"\2\u029c\u029d\3\2\2\2\u029dm\3\2\2\2\u029e\u029f\7\r\2\2\u029f\u02a0"+
		"\7j\2\2\u02a0\u02a2\5\u00a8U\2\u02a1\u02a3\5p9\2\u02a2\u02a1\3\2\2\2\u02a2"+
		"\u02a3\3\2\2\2\u02a3o\3\2\2\2\u02a4\u02a8\7%\2\2\u02a5\u02a6\7&\2\2\u02a6"+
		"\u02a8\5~@\2\u02a7\u02a4\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8q\3\2\2\2\u02a9"+
		"\u02ac\5v<\2\u02aa\u02ac\5t;\2\u02ab\u02a9\3\2\2\2\u02ab\u02aa\3\2\2\2"+
		"\u02acs\3\2\2\2\u02ad\u02ae\5v<\2\u02ae\u02af\5\u00fe\u0080\2\u02afu\3"+
		"\2\2\2\u02b0\u02b2\7j\2\2\u02b1\u02b3\7\t\2\2\u02b2\u02b1\3\2\2\2\u02b2"+
		"\u02b3\3\2\2\2\u02b3w\3\2\2\2\u02b4\u02b5\7\25\2\2\u02b5\u02b6\5z>\2\u02b6"+
		"\u02b7\7\26\2\2\u02b7y\3\2\2\2\u02b8\u02bf\5\u0082B\2\u02b9\u02ba\7\27"+
		"\2\2\u02ba\u02bd\7\13\2\2\u02bb\u02bc\7\27\2\2\u02bc\u02be\5\u0084C\2"+
		"\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c0\3\2\2\2\u02bf\u02b9"+
		"\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c7\3\2\2\2\u02c1\u02c4\7\13\2\2"+
		"\u02c2\u02c3\7\27\2\2\u02c3\u02c5\5\u0084C\2\u02c4\u02c2\3\2\2\2\u02c4"+
		"\u02c5\3\2\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02b8\3\2\2\2\u02c6\u02c1\3\2"+
		"\2\2\u02c7{\3\2\2\2\u02c8\u02c9\7\r\2\2\u02c9\u02ca\7j\2\2\u02ca\u02d0"+
		"\3\2\2\2\u02cb\u02cc\7\r\2\2\u02cc\u02cd\7j\2\2\u02cd\u02cf\7\t\2\2\u02ce"+
		"\u02cb\3\2\2\2\u02cf\u02d2\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2"+
		"\2\2\u02d1}\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d3\u02d4\7\25\2\2\u02d4\u02d5"+
		"\5\u0080A\2\u02d5\u02d6\7\26\2\2\u02d6\177\3\2\2\2\u02d7\u02de\5\u0082"+
		"B\2\u02d8\u02d9\7\27\2\2\u02d9\u02dc\7\13\2\2\u02da\u02db\7\27\2\2\u02db"+
		"\u02dd\5\u0084C\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02df"+
		"\3\2\2\2\u02de\u02d8\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u0081\3\2\2\2\u02e0"+
		"\u02e1\5\u0086D\2\u02e1\u0083\3\2\2\2\u02e2\u02e3\5\u0086D\2\u02e3\u0085"+
		"\3\2\2\2\u02e4\u02e8\5\u0088E\2\u02e5\u02e6\7+\2\2\u02e6\u02e8\5\u008a"+
		"F\2\u02e7\u02e4\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u0087\3\2\2\2\u02e9"+
		"\u02ef\5\u008cG\2\u02ea\u02eb\5\u008eH\2\u02eb\u02ec\5\u008cG\2\u02ec"+
		"\u02ee\3\2\2\2\u02ed\u02ea\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed\3\2"+
		"\2\2\u02ef\u02f0\3\2\2\2\u02f0\u0089\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2"+
		"\u02f3\7,\2\2\u02f3\u02f4\5\u0092J\2\u02f4\u008b\3\2\2\2\u02f5\u02fb\5"+
		"\u0096L\2\u02f6\u02f7\5\u0090I\2\u02f7\u02f8\5\u0096L\2\u02f8\u02fa\3"+
		"\2\2\2\u02f9\u02f6\3\2\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb"+
		"\u02fc\3\2\2\2\u02fc\u008d\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe\u02ff\t\5"+
		"\2\2\u02ff\u008f\3\2\2\2\u0300\u0301\t\6\2\2\u0301\u0091\3\2\2\2\u0302"+
		"\u0303\5\u0098M\2\u0303\u0093\3\2\2\2\u0304\u0307\5r:\2\u0305\u0307\5"+
		"v<\2\u0306\u0304\3\2\2\2\u0306\u0305\3\2\2\2\u0307\u0095\3\2\2\2\u0308"+
		"\u030a\5\u0092J\2\u0309\u030b\5\u008aF\2\u030a\u0309\3\2\2\2\u030a\u030b"+
		"\3\2\2\2\u030b\u0097\3\2\2\2\u030c\u030f\5\u00c8e\2\u030d\u030f\7\62\2"+
		"\2\u030e\u030c\3\2\2\2\u030e\u030d\3\2\2\2\u030f\u0311\3\2\2\2\u0310\u0312"+
		"\7\16\2\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\3\2\2\2"+
		"\u0313\u0315\7\n\2\2\u0314\u0316\7\16\2\2\u0315\u0314\3\2\2\2\u0315\u0316"+
		"\3\2\2\2\u0316\u0319\3\2\2\2\u0317\u031a\5\u00c8e\2\u0318\u031a\7\63\2"+
		"\2\u0319\u0317\3\2\2\2\u0319\u0318\3\2\2\2\u031a\u0320\3\2\2\2\u031b\u0320"+
		"\5<\37\2\u031c\u031d\7:\2\2\u031d\u0320\5\u00c8e\2\u031e\u0320\5\u00c8"+
		"e\2\u031f\u030e\3\2\2\2\u031f\u031b\3\2\2\2\u031f\u031c\3\2\2\2\u031f"+
		"\u031e\3\2\2\2\u0320\u0099\3\2\2\2\u0321\u0322\7\r\2\2\u0322\u0323\7j"+
		"\2\2\u0323\u0325\5|?\2\u0324\u0326\5p9\2\u0325\u0324\3\2\2\2\u0325\u0326"+
		"\3\2\2\2\u0326\u009b\3\2\2\2\u0327\u0328\7\r\2\2\u0328\u0329\7j\2\2\u0329"+
		"\u032b\5L\'\2\u032a\u032c\5\u009eP\2\u032b\u032a\3\2\2\2\u032b\u032c\3"+
		"\2\2\2\u032c\u009d\3\2\2\2\u032d\u0331\7%\2\2\u032e\u032f\7&\2\2\u032f"+
		"\u0331\5r:\2\u0330\u032d\3\2\2\2\u0330\u032e\3\2\2\2\u0331\u009f\3\2\2"+
		"\2\u0332\u0333\7\r\2\2\u0333\u0334\7j\2\2\u0334\u0336\5L\'\2\u0335\u0337"+
		"\5\u00a2R\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u00a1\3\2\2"+
		"\2\u0338\u033c\7%\2\2\u0339\u033a\7&\2\2\u033a\u033c\5x=\2\u033b\u0338"+
		"\3\2\2\2\u033b\u0339\3\2\2\2\u033c\u00a3\3\2\2\2\u033d\u033e\7\5\2\2\u033e"+
		"\u033f\5\u00a8U\2\u033f\u00a5\3\2\2\2\u0340\u0341\5\u00a8U\2\u0341\u0342"+
		"\7\5\2\2\u0342\u0343\5\u00c8e\2\u0343\u00a7\3\2\2\2\u0344\u0347\5\u00aa"+
		"V\2\u0345\u0347\5\u00b2Z\2\u0346\u0344\3\2\2\2\u0346\u0345\3\2\2\2\u0347"+
		"\u034b\3\2\2\2\u0348\u034a\5\u00b6\\\2\u0349\u0348\3\2\2\2\u034a\u034d"+
		"\3\2\2\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u00a9\3\2\2\2\u034d"+
		"\u034b\3\2\2\2\u034e\u035a\5\u0116\u008c\2\u034f\u035a\5\u0118\u008d\2"+
		"\u0350\u035a\5\u00dan\2\u0351\u035a\5\u00ecw\2\u0352\u035a\5\u0108\u0085"+
		"\2\u0353\u035a\5\"\22\2\u0354\u035a\5:\36\2\u0355\u035a\5\u00aeX\2\u0356"+
		"\u035a\5\u00b0Y\2\u0357\u035a\5\u010c\u0087\2\u0358\u035a\5\u00acW\2\u0359"+
		"\u034e\3\2\2\2\u0359\u034f\3\2\2\2\u0359\u0350\3\2\2\2\u0359\u0351\3\2"+
		"\2\2\u0359\u0352\3\2\2\2\u0359\u0353\3\2\2\2\u0359\u0354\3\2\2\2\u0359"+
		"\u0355\3\2\2\2\u0359\u0356\3\2\2\2\u0359\u0357\3\2\2\2\u0359\u0358\3\2"+
		"\2\2\u035a\u00ab\3\2\2\2\u035b\u035c\5L\'\2\u035c\u035d\7\t\2\2\u035d"+
		"\u035e\5|?\2\u035e\u00ad\3\2\2\2\u035f\u0360\7)\2\2\u0360\u0365\7\25\2"+
		"\2\u0361\u0362\5$\23\2\u0362\u0363\5&\24\2\u0363\u0366\3\2\2\2\u0364\u0366"+
		"\5(\25\2\u0365\u0361\3\2\2\2\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366"+
		"\u0367\3\2\2\2\u0367\u0368\7\26\2\2\u0368\u00af\3\2\2\2\u0369\u036c\7"+
		")\2\2\u036a\u036d\5\u00b6\\\2\u036b\u036d\5<\37\2\u036c\u036a\3\2\2\2"+
		"\u036c\u036b\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0371"+
		"\7(\2\2\u036f\u0372\5\u00a8U\2\u0370\u0372\5\u00eav\2\u0371\u036f\3\2"+
		"\2\2\u0371\u0370\3\2\2\2\u0372\u00b1\3\2\2\2\u0373\u0374\5\u00b4[\2\u0374"+
		"\u00b3\3\2\2\2\u0375\u0378\7j\2\2\u0376\u0377\7\t\2\2\u0377\u0379\7j\2"+
		"\2\u0378\u0376\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037b\3\2\2\2\u037a\u037c"+
		"\5\u00fe\u0080\2\u037b\u037a\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u00b5\3"+
		"\2\2\2\u037d\u037e\7\30\2\2\u037e\u0380\5\u00b8]\2\u037f\u0381\5\u0102"+
		"\u0082\2\u0380\u037f\3\2\2\2\u0380\u0381\3\2\2\2\u0381\u0382\3\2\2\2\u0382"+
		"\u0383\7\31\2\2\u0383\u00b7\3\2\2\2\u0384\u0387\5\u00bc_\2\u0385\u0387"+
		"\5\u00c6d\2\u0386\u0384\3\2\2\2\u0386\u0385\3\2\2\2\u0387\u00b9\3\2\2"+
		"\2\u0388\u0389\7]\2\2\u0389\u038a\7^\2\2\u038a\u038b\7\25\2\2\u038b\u0390"+
		"\5\u00be`\2\u038c\u038d\7\27\2\2\u038d\u038f\5\u00be`\2\u038e\u038c\3"+
		"\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391"+
		"\u0393\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0394\7\26\2\2\u0394\u00bb\3"+
		"\2\2\2\u0395\u0399\5\u00ba^\2\u0396\u0399\5\u00c0a\2\u0397\u0399\5\u00c4"+
		"c\2\u0398\u0395\3\2\2\2\u0398\u0396\3\2\2\2\u0398\u0397\3\2\2\2\u0399"+
		"\u00bd\3\2\2\2\u039a\u03a0\5F$\2\u039b\u039c\7Q\2\2\u039c\u03a1\5\u00c8"+
		"e\2\u039d\u03a1\5~@\2\u039e\u03a1\5r:\2\u039f\u03a1\5x=\2\u03a0\u039b"+
		"\3\2\2\2\u03a0\u039d\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u039f\3\2\2\2\u03a0"+
		"\u03a1\3\2\2\2\u03a1\u00bf\3\2\2\2\u03a2\u03a3\5\u010e\u0088\2\u03a3\u00c1"+
		"\3\2\2\2\u03a4\u03a5\5x=\2\u03a5\u00c3\3\2\2\2\u03a6\u03a7\7!\2\2\u03a7"+
		"\u03b2\5\u00a8U\2\u03a8\u03a9\7`\2\2\u03a9\u03aa\7^\2\2\u03aa\u03b2\5"+
		"\u00c8e\2\u03ab\u03ac\7!\2\2\u03ac\u03ad\5\u00a8U\2\u03ad\u03ae\7`\2\2"+
		"\u03ae\u03af\7^\2\2\u03af\u03b0\5\u00c8e\2\u03b0\u03b2\3\2\2\2\u03b1\u03a6"+
		"\3\2\2\2\u03b1\u03a8\3\2\2\2\u03b1\u03ab\3\2\2\2\u03b2\u00c5\3\2\2\2\u03b3"+
		"\u03b4\5\u0080A\2\u03b4\u00c7\3\2\2\2\u03b5\u03b6\5\u00caf\2\u03b6\u00c9"+
		"\3\2\2\2\u03b7\u03be\5\u00d6l\2\u03b8\u03be\5\u00d2j\2\u03b9\u03be\5\u00d4"+
		"k\2\u03ba\u03be\5\u00ccg\2\u03bb\u03be\5\u011e\u0090\2\u03bc\u03be\7i"+
		"\2\2\u03bd\u03b7\3\2\2\2\u03bd\u03b8\3\2\2\2\u03bd\u03b9\3\2\2\2\u03bd"+
		"\u03ba\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd\u03bc\3\2\2\2\u03be\u00cb\3\2"+
		"\2\2\u03bf\u03c0\7\25\2\2\u03c0\u03c1\5\u00ceh\2\u03c1\u03c2\7\26\2\2"+
		"\u03c2\u00cd\3\2\2\2\u03c3\u03c7\5\u00d0i\2\u03c4\u03c6\5\u00d0i\2\u03c5"+
		"\u03c4\3\2\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2"+
		"\2\2\u03c8\u00cf\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca\u03d6\7d\2\2\u03cb"+
		"\u03d2\7j\2\2\u03cc\u03cf\7\30\2\2\u03cd\u03d0\7d\2\2\u03ce\u03d0\5\u00f8"+
		"}\2\u03cf\u03cd\3\2\2\2\u03cf\u03ce\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1"+
		"\u03d3\7\31\2\2\u03d2\u03cc\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d6\3"+
		"\2\2\2\u03d4\u03d6\5\u00f8}\2\u03d5\u03ca\3\2\2\2\u03d5\u03cb\3\2\2\2"+
		"\u03d5\u03d4\3\2\2\2\u03d6\u00d1\3\2\2\2\u03d7\u03da\5\u00d8m\2\u03d8"+
		"\u03da\7j\2\2\u03d9\u03d7\3\2\2\2\u03d9\u03d8\3\2\2\2\u03da\u00d3\3\2"+
		"\2\2\u03db\u03dc\7j\2\2\u03dc\u03dd\7Q\2\2\u03dd\u03de\5\u00c8e\2\u03de"+
		"\u00d5\3\2\2\2\u03df\u03e0\7j\2\2\u03e0\u00d7\3\2\2\2\u03e1\u03e3\7\32"+
		"\2\2\u03e2\u03e1\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4"+
		"\u03e5\7d\2\2\u03e5\u00d9\3\2\2\2\u03e6\u03e7\7R\2\2\u03e7\u03e8\7\25"+
		"\2\2\u03e8\u03e9\5\u00dco\2\u03e9\u03ea\7\26\2\2\u03ea\u00db\3\2\2\2\u03eb"+
		"\u03f1\5\u00e6t\2\u03ec\u03ed\7\27\2\2\u03ed\u03ee\5$\23\2\u03ee\u03ef"+
		"\5\u00dep\2\u03ef\u03f0\5&\24\2\u03f0\u03f2\3\2\2\2\u03f1\u03ec\3\2\2"+
		"\2\u03f1\u03f2\3\2\2\2\u03f2\u00dd\3\2\2\2\u03f3\u03f4\7\27\2\2\u03f4"+
		"\u03f6\5\u00e0q\2\u03f5\u03f3\3\2\2\2\u03f5\u03f6\3\2\2\2\u03f6\u00df"+
		"\3\2\2\2\u03f7\u03fc\5\u00e2r\2\u03f8\u03f9\7\27\2\2\u03f9\u03fb\5\u00e2"+
		"r\2\u03fa\u03f8\3\2\2\2\u03fb\u03fe\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc"+
		"\u03fd\3\2\2\2\u03fd\u00e1\3\2\2\2\u03fe\u03fc\3\2\2\2\u03ff\u0402\5\u00e4"+
		"s\2\u0400\u0402\5\u00eav\2\u0401\u03ff\3\2\2\2\u0401\u0400\3\2\2\2\u0402"+
		"\u00e3\3\2\2\2\u0403\u0404\7O\2\2\u0404\u0405\58\35\2\u0405\u0406\5\u00e8"+
		"u\2\u0406\u0407\7P\2\2\u0407\u00e5\3\2\2\2\u0408\u0409\5\u00e8u\2\u0409"+
		"\u00e7\3\2\2\2\u040a\u040f\5\u00eav\2\u040b\u040c\7\27\2\2\u040c\u040e"+
		"\5\u00eav\2\u040d\u040b\3\2\2\2\u040e\u0411\3\2\2\2\u040f\u040d\3\2\2"+
		"\2\u040f\u0410\3\2\2\2\u0410\u00e9\3\2\2\2\u0411\u040f\3\2\2\2\u0412\u0413"+
		"\7j\2\2\u0413\u0414\5\u00a8U\2\u0414\u00eb\3\2\2\2\u0415\u0416\7\33\2"+
		"\2\u0416\u0417\7\25\2\2\u0417\u0418\5\u00eex\2\u0418\u0419\7\26\2\2\u0419"+
		"\u00ed\3\2\2\2\u041a\u0424\5\u00f0y\2\u041b\u041c\7\27\2\2\u041c\u041e"+
		"\7\13\2\2\u041d\u041f\5\u0102\u0082\2\u041e\u041d\3\2\2\2\u041e\u041f"+
		"\3\2\2\2\u041f\u0422\3\2\2\2\u0420\u0421\7\27\2\2\u0421\u0423\5\u0106"+
		"\u0084\2\u0422\u0420\3\2\2\2\u0422\u0423\3\2\2\2\u0423\u0425\3\2\2\2\u0424"+
		"\u041b\3\2\2\2\u0424\u0425\3\2\2\2\u0425\u00ef\3\2\2\2\u0426\u0427\5\u00f2"+
		"z\2\u0427\u00f1\3\2\2\2\u0428\u042d\5\u00f4{\2\u0429\u042a\7\27\2\2\u042a"+
		"\u042c\5\u00f4{\2\u042b\u0429\3\2\2\2\u042c\u042f\3\2\2\2\u042d\u042b"+
		"\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u00f3\3\2\2\2\u042f\u042d\3\2\2\2\u0430"+
		"\u0434\7j\2\2\u0431\u0434\5\u00f6|\2\u0432\u0434\5\u00c8e\2\u0433\u0430"+
		"\3\2\2\2\u0433\u0431\3\2\2\2\u0433\u0432\3\2\2\2\u0434\u00f5\3\2\2\2\u0435"+
		"\u0436\7j\2\2\u0436\u0439\7\30\2\2\u0437\u043a\5\u00d8m\2\u0438\u043a"+
		"\5\u00f8}\2\u0439\u0437\3\2\2\2\u0439\u0438\3\2\2\2\u043a\u043b\3\2\2"+
		"\2\u043b\u043c\7\31\2\2\u043c\u00f7\3\2\2\2\u043d\u043e\5\u00fa~\2\u043e"+
		"\u00f9\3\2\2\2\u043f\u0441\5\u00fc\177\2\u0440\u0442\5\u00fe\u0080\2\u0441"+
		"\u0440\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u00fb\3\2\2\2\u0443\u0446\7j"+
		"\2\2\u0444\u0445\7\t\2\2\u0445\u0447\7j\2\2\u0446\u0444\3\2\2\2\u0446"+
		"\u0447\3\2\2\2\u0447\u00fd\3\2\2\2\u0448\u0449\7\25\2\2\u0449\u044e\5"+
		"\u0100\u0081\2\u044a\u044b\7\27\2\2\u044b\u044d\5\u0100\u0081\2\u044c"+
		"\u044a\3\2\2\2\u044d\u0450\3\2\2\2\u044e\u044c\3\2\2\2\u044e\u044f\3\2"+
		"\2\2\u044f\u0451\3\2\2\2\u0450\u044e\3\2\2\2\u0451\u0452\7\26\2\2\u0452"+
		"\u00ff\3\2\2\2\u0453\u0456\5\u00a8U\2\u0454\u0456\5\u00c8e\2\u0455\u0453"+
		"\3\2\2\2\u0455\u0454\3\2\2\2\u0456\u0101\3\2\2\2\u0457\u0458\7*\2\2\u0458"+
		"\u0459\5\u0104\u0083\2\u0459\u0103\3\2\2\2\u045a\u0461\5\u00d8m\2\u045b"+
		"\u0461\5\u00f8}\2\u045c\u045d\5\u00a8U\2\u045d\u045e\7Q\2\2\u045e\u045f"+
		"\5\u00c8e\2\u045f\u0461\3\2\2\2\u0460\u045a\3\2\2\2\u0460\u045b\3\2\2"+
		"\2\u0460\u045c\3\2\2\2\u0461\u0105\3\2\2\2\u0462\u0463\5\u00f2z\2\u0463"+
		"\u0107\3\2\2\2\u0464\u0469\7\24\2\2\u0465\u0466\7\25\2\2\u0466\u0467\5"+
		"\u010a\u0086\2\u0467\u0468\7\26\2\2\u0468\u046a\3\2\2\2\u0469\u0465\3"+
		"\2\2\2\u0469\u046a\3\2\2\2\u046a\u0109\3\2\2\2\u046b\u0470\5\u00f6|\2"+
		"\u046c\u046d\7\27\2\2\u046d\u046f\5\u00f6|\2\u046e\u046c\3\2\2\2\u046f"+
		"\u0472\3\2\2\2\u0470\u046e\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u010b\3\2"+
		"\2\2\u0472\u0470\3\2\2\2\u0473\u0474\7Y\2\2\u0474\u0475\7Z\2\2\u0475\u010d"+
		"\3\2\2\2\u0476\u0477\7\25\2\2\u0477\u047a\7j\2\2\u0478\u0479\7\t\2\2\u0479"+
		"\u047b\7j\2\2\u047a\u0478\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c\3\2"+
		"\2\2\u047c\u0488\7\26\2\2\u047d\u047e\7\25\2\2\u047e\u0483\5\u0110\u0089"+
		"\2\u047f\u0480\7\27\2\2\u0480\u0482\5\u0110\u0089\2\u0481\u047f\3\2\2"+
		"\2\u0482\u0485\3\2\2\2\u0483\u0481\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0486"+
		"\3\2\2\2\u0485\u0483\3\2\2\2\u0486\u0487\7\26\2\2\u0487\u0489\3\2\2\2"+
		"\u0488\u047d\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u010f\3\2\2\2\u048a\u048e"+
		"\7\3\2\2\u048b\u048c\7_\2\2\u048c\u048e\5\u0112\u008a\2\u048d\u048a\3"+
		"\2\2\2\u048d\u048b\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\5\u0114\u008b"+
		"\2\u0490\u0111\3\2\2\2\u0491\u0492\7\t\2\2\u0492\u0494\5\u0112\u008a\2"+
		"\u0493\u0491\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0113\3\2\2\2\u0495\u049a"+
		"\7j\2\2\u0496\u0497\7\t\2\2\u0497\u0499\7j\2\2\u0498\u0496\3\2\2\2\u0499"+
		"\u049c\3\2\2\2\u049a\u0498\3\2\2\2\u049a\u049b\3\2\2\2\u049b\u0115\3\2"+
		"\2\2\u049c\u049a\3\2\2\2\u049d\u049e\7\"\2\2\u049e\u049f\7 \2\2\u049f"+
		"\u0117\3\2\2\2\u04a0\u04a1\7\37\2\2\u04a1\u04a2\7 \2\2\u04a2\u04a7\3\2"+
		"\2\2\u04a3\u04a4\7\25\2\2\u04a4\u04a5\5\u011a\u008e\2\u04a5\u04a6\7\26"+
		"\2\2\u04a6\u04a8\3\2\2\2\u04a7\u04a3\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8"+
		"\u0119\3\2\2\2\u04a9\u04ae\5\u011c\u008f\2\u04aa\u04ab\7\27\2\2\u04ab"+
		"\u04ad\5\u011c\u008f\2\u04ac\u04aa\3\2\2\2\u04ad\u04b0\3\2\2\2\u04ae\u04ac"+
		"\3\2\2\2\u04ae\u04af\3\2\2\2\u04af\u011b\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b1"+
		"\u04b2\7j\2\2\u04b2\u04b5\7\30\2\2\u04b3\u04b6\7d\2\2\u04b4\u04b6\5\u00f8"+
		"}\2\u04b5\u04b3\3\2\2\2\u04b5\u04b4\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7"+
		"\u04b8\7\31\2\2\u04b8\u011d\3\2\2\2\u04b9\u04ba\t\7\2\2\u04ba\u011f\3"+
		"\2\2\2\u008b\u0128\u012c\u0138\u013c\u0142\u014b\u014e\u0154\u0157\u015d"+
		"\u016e\u0174\u017a\u0182\u018a\u0190\u0194\u019e\u01a0\u01a8\u01aa\u01b3"+
		"\u01ba\u01bf\u01c3\u01ca\u01cf\u01d8\u01de\u01e2\u01e7\u01f1\u01f8\u01fa"+
		"\u0202\u020a\u0210\u0214\u021b\u021f\u0224\u0233\u0238\u0242\u0248\u024e"+
		"\u0254\u025e\u0262\u0265\u0268\u026a\u0271\u0273\u027a\u027c\u027e\u0283"+
		"\u0288\u028e\u0291\u0296\u029c\u02a2\u02a7\u02ab\u02b2\u02bd\u02bf\u02c4"+
		"\u02c6\u02d0\u02dc\u02de\u02e7\u02ef\u02fb\u0306\u030a\u030e\u0311\u0315"+
		"\u0319\u031f\u0325\u032b\u0330\u0336\u033b\u0346\u034b\u0359\u0365\u036c"+
		"\u0371\u0378\u037b\u0380\u0386\u0390\u0398\u03a0\u03b1\u03bd\u03c7\u03cf"+
		"\u03d2\u03d5\u03d9\u03e2\u03f1\u03f5\u03fc\u0401\u040f\u041e\u0422\u0424"+
		"\u042d\u0433\u0439\u0441\u0446\u044e\u0455\u0460\u0469\u0470\u047a\u0483"+
		"\u0488\u048d\u0493\u049a\u04a7\u04ae\u04b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}