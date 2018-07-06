// Generated from asn/ASN.g4 by ANTLR 4.7.1
package parsers.asn;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ASNParser}.
 */
public interface ASNListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ASNParser#moduleDefinition}.
	 * @param ctx the parse tree
	 */
	void enterModuleDefinition(ASNParser.ModuleDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#moduleDefinition}.
	 * @param ctx the parse tree
	 */
	void exitModuleDefinition(ASNParser.ModuleDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#tagDefault}.
	 * @param ctx the parse tree
	 */
	void enterTagDefault(ASNParser.TagDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#tagDefault}.
	 * @param ctx the parse tree
	 */
	void exitTagDefault(ASNParser.TagDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#extensionDefault}.
	 * @param ctx the parse tree
	 */
	void enterExtensionDefault(ASNParser.ExtensionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#extensionDefault}.
	 * @param ctx the parse tree
	 */
	void exitExtensionDefault(ASNParser.ExtensionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void enterModuleBody(ASNParser.ModuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void exitModuleBody(ASNParser.ModuleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#exports}.
	 * @param ctx the parse tree
	 */
	void enterExports(ASNParser.ExportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#exports}.
	 * @param ctx the parse tree
	 */
	void exitExports(ASNParser.ExportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#symbolsExported}.
	 * @param ctx the parse tree
	 */
	void enterSymbolsExported(ASNParser.SymbolsExportedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#symbolsExported}.
	 * @param ctx the parse tree
	 */
	void exitSymbolsExported(ASNParser.SymbolsExportedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(ASNParser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(ASNParser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#symbolsImported}.
	 * @param ctx the parse tree
	 */
	void enterSymbolsImported(ASNParser.SymbolsImportedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#symbolsImported}.
	 * @param ctx the parse tree
	 */
	void exitSymbolsImported(ASNParser.SymbolsImportedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#symbolsFromModuleList}.
	 * @param ctx the parse tree
	 */
	void enterSymbolsFromModuleList(ASNParser.SymbolsFromModuleListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#symbolsFromModuleList}.
	 * @param ctx the parse tree
	 */
	void exitSymbolsFromModuleList(ASNParser.SymbolsFromModuleListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#symbolsFromModule}.
	 * @param ctx the parse tree
	 */
	void enterSymbolsFromModule(ASNParser.SymbolsFromModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#symbolsFromModule}.
	 * @param ctx the parse tree
	 */
	void exitSymbolsFromModule(ASNParser.SymbolsFromModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#globalModuleReference}.
	 * @param ctx the parse tree
	 */
	void enterGlobalModuleReference(ASNParser.GlobalModuleReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#globalModuleReference}.
	 * @param ctx the parse tree
	 */
	void exitGlobalModuleReference(ASNParser.GlobalModuleReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#assignedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterAssignedIdentifier(ASNParser.AssignedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#assignedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitAssignedIdentifier(ASNParser.AssignedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#symbolList}.
	 * @param ctx the parse tree
	 */
	void enterSymbolList(ASNParser.SymbolListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#symbolList}.
	 * @param ctx the parse tree
	 */
	void exitSymbolList(ASNParser.SymbolListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(ASNParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(ASNParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(ASNParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(ASNParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ASNParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ASNParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#sequenceType}.
	 * @param ctx the parse tree
	 */
	void enterSequenceType(ASNParser.SequenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#sequenceType}.
	 * @param ctx the parse tree
	 */
	void exitSequenceType(ASNParser.SequenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#extensionAndException}.
	 * @param ctx the parse tree
	 */
	void enterExtensionAndException(ASNParser.ExtensionAndExceptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#extensionAndException}.
	 * @param ctx the parse tree
	 */
	void exitExtensionAndException(ASNParser.ExtensionAndExceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#optionalExtensionMarker}.
	 * @param ctx the parse tree
	 */
	void enterOptionalExtensionMarker(ASNParser.OptionalExtensionMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#optionalExtensionMarker}.
	 * @param ctx the parse tree
	 */
	void exitOptionalExtensionMarker(ASNParser.OptionalExtensionMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#componentTypeLists}.
	 * @param ctx the parse tree
	 */
	void enterComponentTypeLists(ASNParser.ComponentTypeListsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#componentTypeLists}.
	 * @param ctx the parse tree
	 */
	void exitComponentTypeLists(ASNParser.ComponentTypeListsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#rootComponentTypeList}.
	 * @param ctx the parse tree
	 */
	void enterRootComponentTypeList(ASNParser.RootComponentTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#rootComponentTypeList}.
	 * @param ctx the parse tree
	 */
	void exitRootComponentTypeList(ASNParser.RootComponentTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#componentTypeList}.
	 * @param ctx the parse tree
	 */
	void enterComponentTypeList(ASNParser.ComponentTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#componentTypeList}.
	 * @param ctx the parse tree
	 */
	void exitComponentTypeList(ASNParser.ComponentTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#componentType}.
	 * @param ctx the parse tree
	 */
	void enterComponentType(ASNParser.ComponentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#componentType}.
	 * @param ctx the parse tree
	 */
	void exitComponentType(ASNParser.ComponentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#extensionAdditions}.
	 * @param ctx the parse tree
	 */
	void enterExtensionAdditions(ASNParser.ExtensionAdditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#extensionAdditions}.
	 * @param ctx the parse tree
	 */
	void exitExtensionAdditions(ASNParser.ExtensionAdditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#extensionAdditionList}.
	 * @param ctx the parse tree
	 */
	void enterExtensionAdditionList(ASNParser.ExtensionAdditionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#extensionAdditionList}.
	 * @param ctx the parse tree
	 */
	void exitExtensionAdditionList(ASNParser.ExtensionAdditionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#extensionAddition}.
	 * @param ctx the parse tree
	 */
	void enterExtensionAddition(ASNParser.ExtensionAdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#extensionAddition}.
	 * @param ctx the parse tree
	 */
	void exitExtensionAddition(ASNParser.ExtensionAdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#extensionAdditionGroup}.
	 * @param ctx the parse tree
	 */
	void enterExtensionAdditionGroup(ASNParser.ExtensionAdditionGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#extensionAdditionGroup}.
	 * @param ctx the parse tree
	 */
	void exitExtensionAdditionGroup(ASNParser.ExtensionAdditionGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#versionNumber}.
	 * @param ctx the parse tree
	 */
	void enterVersionNumber(ASNParser.VersionNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#versionNumber}.
	 * @param ctx the parse tree
	 */
	void exitVersionNumber(ASNParser.VersionNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#sequenceOfType}.
	 * @param ctx the parse tree
	 */
	void enterSequenceOfType(ASNParser.SequenceOfTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#sequenceOfType}.
	 * @param ctx the parse tree
	 */
	void exitSequenceOfType(ASNParser.SequenceOfTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#sizeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterSizeConstraint(ASNParser.SizeConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#sizeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitSizeConstraint(ASNParser.SizeConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#parameterizedAssignment}.
	 * @param ctx the parse tree
	 */
	void enterParameterizedAssignment(ASNParser.ParameterizedAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#parameterizedAssignment}.
	 * @param ctx the parse tree
	 */
	void exitParameterizedAssignment(ASNParser.ParameterizedAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(ASNParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(ASNParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ASNParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ASNParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#paramGovernor}.
	 * @param ctx the parse tree
	 */
	void enterParamGovernor(ASNParser.ParamGovernorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#paramGovernor}.
	 * @param ctx the parse tree
	 */
	void exitParamGovernor(ASNParser.ParamGovernorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#governor}.
	 * @param ctx the parse tree
	 */
	void enterGovernor(ASNParser.GovernorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#governor}.
	 * @param ctx the parse tree
	 */
	void exitGovernor(ASNParser.GovernorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#objectClassAssignment}.
	 * @param ctx the parse tree
	 */
	void enterObjectClassAssignment(ASNParser.ObjectClassAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#objectClassAssignment}.
	 * @param ctx the parse tree
	 */
	void exitObjectClassAssignment(ASNParser.ObjectClassAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#objectClass}.
	 * @param ctx the parse tree
	 */
	void enterObjectClass(ASNParser.ObjectClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#objectClass}.
	 * @param ctx the parse tree
	 */
	void exitObjectClass(ASNParser.ObjectClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#definedObjectClass}.
	 * @param ctx the parse tree
	 */
	void enterDefinedObjectClass(ASNParser.DefinedObjectClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#definedObjectClass}.
	 * @param ctx the parse tree
	 */
	void exitDefinedObjectClass(ASNParser.DefinedObjectClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#usefulObjectClassReference}.
	 * @param ctx the parse tree
	 */
	void enterUsefulObjectClassReference(ASNParser.UsefulObjectClassReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#usefulObjectClassReference}.
	 * @param ctx the parse tree
	 */
	void exitUsefulObjectClassReference(ASNParser.UsefulObjectClassReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#externalObjectClassReference}.
	 * @param ctx the parse tree
	 */
	void enterExternalObjectClassReference(ASNParser.ExternalObjectClassReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#externalObjectClassReference}.
	 * @param ctx the parse tree
	 */
	void exitExternalObjectClassReference(ASNParser.ExternalObjectClassReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#objectClassDefn}.
	 * @param ctx the parse tree
	 */
	void enterObjectClassDefn(ASNParser.ObjectClassDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#objectClassDefn}.
	 * @param ctx the parse tree
	 */
	void exitObjectClassDefn(ASNParser.ObjectClassDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#withSyntaxSpec}.
	 * @param ctx the parse tree
	 */
	void enterWithSyntaxSpec(ASNParser.WithSyntaxSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#withSyntaxSpec}.
	 * @param ctx the parse tree
	 */
	void exitWithSyntaxSpec(ASNParser.WithSyntaxSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#syntaxList}.
	 * @param ctx the parse tree
	 */
	void enterSyntaxList(ASNParser.SyntaxListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#syntaxList}.
	 * @param ctx the parse tree
	 */
	void exitSyntaxList(ASNParser.SyntaxListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#tokenOrGroupSpec}.
	 * @param ctx the parse tree
	 */
	void enterTokenOrGroupSpec(ASNParser.TokenOrGroupSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#tokenOrGroupSpec}.
	 * @param ctx the parse tree
	 */
	void exitTokenOrGroupSpec(ASNParser.TokenOrGroupSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#optionalGroup}.
	 * @param ctx the parse tree
	 */
	void enterOptionalGroup(ASNParser.OptionalGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#optionalGroup}.
	 * @param ctx the parse tree
	 */
	void exitOptionalGroup(ASNParser.OptionalGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#requiredToken}.
	 * @param ctx the parse tree
	 */
	void enterRequiredToken(ASNParser.RequiredTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#requiredToken}.
	 * @param ctx the parse tree
	 */
	void exitRequiredToken(ASNParser.RequiredTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ASNParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ASNParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#primitiveFieldName}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveFieldName(ASNParser.PrimitiveFieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#primitiveFieldName}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveFieldName(ASNParser.PrimitiveFieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#fieldSpec}.
	 * @param ctx the parse tree
	 */
	void enterFieldSpec(ASNParser.FieldSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#fieldSpec}.
	 * @param ctx the parse tree
	 */
	void exitFieldSpec(ASNParser.FieldSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#typeFieldSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeFieldSpec(ASNParser.TypeFieldSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#typeFieldSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeFieldSpec(ASNParser.TypeFieldSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#typeOptionalitySpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeOptionalitySpec(ASNParser.TypeOptionalitySpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#typeOptionalitySpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeOptionalitySpec(ASNParser.TypeOptionalitySpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#fixedTypeValueFieldSpec}.
	 * @param ctx the parse tree
	 */
	void enterFixedTypeValueFieldSpec(ASNParser.FixedTypeValueFieldSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#fixedTypeValueFieldSpec}.
	 * @param ctx the parse tree
	 */
	void exitFixedTypeValueFieldSpec(ASNParser.FixedTypeValueFieldSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#valueOptionalitySpec}.
	 * @param ctx the parse tree
	 */
	void enterValueOptionalitySpec(ASNParser.ValueOptionalitySpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#valueOptionalitySpec}.
	 * @param ctx the parse tree
	 */
	void exitValueOptionalitySpec(ASNParser.ValueOptionalitySpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#variableTypeValueFieldSpec}.
	 * @param ctx the parse tree
	 */
	void enterVariableTypeValueFieldSpec(ASNParser.VariableTypeValueFieldSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#variableTypeValueFieldSpec}.
	 * @param ctx the parse tree
	 */
	void exitVariableTypeValueFieldSpec(ASNParser.VariableTypeValueFieldSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#fixedTypeValueSetFieldSpec}.
	 * @param ctx the parse tree
	 */
	void enterFixedTypeValueSetFieldSpec(ASNParser.FixedTypeValueSetFieldSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#fixedTypeValueSetFieldSpec}.
	 * @param ctx the parse tree
	 */
	void exitFixedTypeValueSetFieldSpec(ASNParser.FixedTypeValueSetFieldSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#valueSetOptionalitySpec}.
	 * @param ctx the parse tree
	 */
	void enterValueSetOptionalitySpec(ASNParser.ValueSetOptionalitySpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#valueSetOptionalitySpec}.
	 * @param ctx the parse tree
	 */
	void exitValueSetOptionalitySpec(ASNParser.ValueSetOptionalitySpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(ASNParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(ASNParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#parameterizedObject}.
	 * @param ctx the parse tree
	 */
	void enterParameterizedObject(ASNParser.ParameterizedObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#parameterizedObject}.
	 * @param ctx the parse tree
	 */
	void exitParameterizedObject(ASNParser.ParameterizedObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#definedObject}.
	 * @param ctx the parse tree
	 */
	void enterDefinedObject(ASNParser.DefinedObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#definedObject}.
	 * @param ctx the parse tree
	 */
	void exitDefinedObject(ASNParser.DefinedObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#objectSet}.
	 * @param ctx the parse tree
	 */
	void enterObjectSet(ASNParser.ObjectSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#objectSet}.
	 * @param ctx the parse tree
	 */
	void exitObjectSet(ASNParser.ObjectSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#objectSetSpec}.
	 * @param ctx the parse tree
	 */
	void enterObjectSetSpec(ASNParser.ObjectSetSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#objectSetSpec}.
	 * @param ctx the parse tree
	 */
	void exitObjectSetSpec(ASNParser.ObjectSetSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void enterFieldName(ASNParser.FieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void exitFieldName(ASNParser.FieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#valueSet}.
	 * @param ctx the parse tree
	 */
	void enterValueSet(ASNParser.ValueSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#valueSet}.
	 * @param ctx the parse tree
	 */
	void exitValueSet(ASNParser.ValueSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#elementSetSpecs}.
	 * @param ctx the parse tree
	 */
	void enterElementSetSpecs(ASNParser.ElementSetSpecsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#elementSetSpecs}.
	 * @param ctx the parse tree
	 */
	void exitElementSetSpecs(ASNParser.ElementSetSpecsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#rootElementSetSpec}.
	 * @param ctx the parse tree
	 */
	void enterRootElementSetSpec(ASNParser.RootElementSetSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#rootElementSetSpec}.
	 * @param ctx the parse tree
	 */
	void exitRootElementSetSpec(ASNParser.RootElementSetSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#additionalElementSetSpec}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalElementSetSpec(ASNParser.AdditionalElementSetSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#additionalElementSetSpec}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalElementSetSpec(ASNParser.AdditionalElementSetSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#elementSetSpec}.
	 * @param ctx the parse tree
	 */
	void enterElementSetSpec(ASNParser.ElementSetSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#elementSetSpec}.
	 * @param ctx the parse tree
	 */
	void exitElementSetSpec(ASNParser.ElementSetSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#unions}.
	 * @param ctx the parse tree
	 */
	void enterUnions(ASNParser.UnionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#unions}.
	 * @param ctx the parse tree
	 */
	void exitUnions(ASNParser.UnionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#exclusions}.
	 * @param ctx the parse tree
	 */
	void enterExclusions(ASNParser.ExclusionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#exclusions}.
	 * @param ctx the parse tree
	 */
	void exitExclusions(ASNParser.ExclusionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#intersections}.
	 * @param ctx the parse tree
	 */
	void enterIntersections(ASNParser.IntersectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#intersections}.
	 * @param ctx the parse tree
	 */
	void exitIntersections(ASNParser.IntersectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#unionMark}.
	 * @param ctx the parse tree
	 */
	void enterUnionMark(ASNParser.UnionMarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#unionMark}.
	 * @param ctx the parse tree
	 */
	void exitUnionMark(ASNParser.UnionMarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#intersectionMark}.
	 * @param ctx the parse tree
	 */
	void enterIntersectionMark(ASNParser.IntersectionMarkContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#intersectionMark}.
	 * @param ctx the parse tree
	 */
	void exitIntersectionMark(ASNParser.IntersectionMarkContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#elements}.
	 * @param ctx the parse tree
	 */
	void enterElements(ASNParser.ElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#elements}.
	 * @param ctx the parse tree
	 */
	void exitElements(ASNParser.ElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#objectSetElements}.
	 * @param ctx the parse tree
	 */
	void enterObjectSetElements(ASNParser.ObjectSetElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#objectSetElements}.
	 * @param ctx the parse tree
	 */
	void exitObjectSetElements(ASNParser.ObjectSetElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#intersectionElements}.
	 * @param ctx the parse tree
	 */
	void enterIntersectionElements(ASNParser.IntersectionElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#intersectionElements}.
	 * @param ctx the parse tree
	 */
	void exitIntersectionElements(ASNParser.IntersectionElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#subtypeElements}.
	 * @param ctx the parse tree
	 */
	void enterSubtypeElements(ASNParser.SubtypeElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#subtypeElements}.
	 * @param ctx the parse tree
	 */
	void exitSubtypeElements(ASNParser.SubtypeElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#variableTypeValueSetFieldSpec}.
	 * @param ctx the parse tree
	 */
	void enterVariableTypeValueSetFieldSpec(ASNParser.VariableTypeValueSetFieldSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#variableTypeValueSetFieldSpec}.
	 * @param ctx the parse tree
	 */
	void exitVariableTypeValueSetFieldSpec(ASNParser.VariableTypeValueSetFieldSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#objectFieldSpec}.
	 * @param ctx the parse tree
	 */
	void enterObjectFieldSpec(ASNParser.ObjectFieldSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#objectFieldSpec}.
	 * @param ctx the parse tree
	 */
	void exitObjectFieldSpec(ASNParser.ObjectFieldSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#objectOptionalitySpec}.
	 * @param ctx the parse tree
	 */
	void enterObjectOptionalitySpec(ASNParser.ObjectOptionalitySpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#objectOptionalitySpec}.
	 * @param ctx the parse tree
	 */
	void exitObjectOptionalitySpec(ASNParser.ObjectOptionalitySpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#objectSetFieldSpec}.
	 * @param ctx the parse tree
	 */
	void enterObjectSetFieldSpec(ASNParser.ObjectSetFieldSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#objectSetFieldSpec}.
	 * @param ctx the parse tree
	 */
	void exitObjectSetFieldSpec(ASNParser.ObjectSetFieldSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#objectSetOptionalitySpec}.
	 * @param ctx the parse tree
	 */
	void enterObjectSetOptionalitySpec(ASNParser.ObjectSetOptionalitySpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#objectSetOptionalitySpec}.
	 * @param ctx the parse tree
	 */
	void exitObjectSetOptionalitySpec(ASNParser.ObjectSetOptionalitySpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#typeAssignment}.
	 * @param ctx the parse tree
	 */
	void enterTypeAssignment(ASNParser.TypeAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#typeAssignment}.
	 * @param ctx the parse tree
	 */
	void exitTypeAssignment(ASNParser.TypeAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#valueAssignment}.
	 * @param ctx the parse tree
	 */
	void enterValueAssignment(ASNParser.ValueAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#valueAssignment}.
	 * @param ctx the parse tree
	 */
	void exitValueAssignment(ASNParser.ValueAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#asnType}.
	 * @param ctx the parse tree
	 */
	void enterAsnType(ASNParser.AsnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#asnType}.
	 * @param ctx the parse tree
	 */
	void exitAsnType(ASNParser.AsnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#builtinType}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinType(ASNParser.BuiltinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#builtinType}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinType(ASNParser.BuiltinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#objectClassFieldType}.
	 * @param ctx the parse tree
	 */
	void enterObjectClassFieldType(ASNParser.ObjectClassFieldTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#objectClassFieldType}.
	 * @param ctx the parse tree
	 */
	void exitObjectClassFieldType(ASNParser.ObjectClassFieldTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#setType}.
	 * @param ctx the parse tree
	 */
	void enterSetType(ASNParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#setType}.
	 * @param ctx the parse tree
	 */
	void exitSetType(ASNParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#setOfType}.
	 * @param ctx the parse tree
	 */
	void enterSetOfType(ASNParser.SetOfTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#setOfType}.
	 * @param ctx the parse tree
	 */
	void exitSetOfType(ASNParser.SetOfTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#referencedType}.
	 * @param ctx the parse tree
	 */
	void enterReferencedType(ASNParser.ReferencedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#referencedType}.
	 * @param ctx the parse tree
	 */
	void exitReferencedType(ASNParser.ReferencedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#definedType}.
	 * @param ctx the parse tree
	 */
	void enterDefinedType(ASNParser.DefinedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#definedType}.
	 * @param ctx the parse tree
	 */
	void exitDefinedType(ASNParser.DefinedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(ASNParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(ASNParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#constraintSpec}.
	 * @param ctx the parse tree
	 */
	void enterConstraintSpec(ASNParser.ConstraintSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#constraintSpec}.
	 * @param ctx the parse tree
	 */
	void exitConstraintSpec(ASNParser.ConstraintSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#userDefinedConstraint}.
	 * @param ctx the parse tree
	 */
	void enterUserDefinedConstraint(ASNParser.UserDefinedConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#userDefinedConstraint}.
	 * @param ctx the parse tree
	 */
	void exitUserDefinedConstraint(ASNParser.UserDefinedConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#generalConstraint}.
	 * @param ctx the parse tree
	 */
	void enterGeneralConstraint(ASNParser.GeneralConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#generalConstraint}.
	 * @param ctx the parse tree
	 */
	void exitGeneralConstraint(ASNParser.GeneralConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#userDefinedConstraintParameter}.
	 * @param ctx the parse tree
	 */
	void enterUserDefinedConstraintParameter(ASNParser.UserDefinedConstraintParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#userDefinedConstraintParameter}.
	 * @param ctx the parse tree
	 */
	void exitUserDefinedConstraintParameter(ASNParser.UserDefinedConstraintParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraint(ASNParser.TableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraint(ASNParser.TableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#simpleTableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTableConstraint(ASNParser.SimpleTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#simpleTableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTableConstraint(ASNParser.SimpleTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#contentsConstraint}.
	 * @param ctx the parse tree
	 */
	void enterContentsConstraint(ASNParser.ContentsConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#contentsConstraint}.
	 * @param ctx the parse tree
	 */
	void exitContentsConstraint(ASNParser.ContentsConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#subtypeConstraint}.
	 * @param ctx the parse tree
	 */
	void enterSubtypeConstraint(ASNParser.SubtypeConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#subtypeConstraint}.
	 * @param ctx the parse tree
	 */
	void exitSubtypeConstraint(ASNParser.SubtypeConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ASNParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ASNParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#builtinValue}.
	 * @param ctx the parse tree
	 */
	void enterBuiltinValue(ASNParser.BuiltinValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#builtinValue}.
	 * @param ctx the parse tree
	 */
	void exitBuiltinValue(ASNParser.BuiltinValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#objectIdentifierValue}.
	 * @param ctx the parse tree
	 */
	void enterObjectIdentifierValue(ASNParser.ObjectIdentifierValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#objectIdentifierValue}.
	 * @param ctx the parse tree
	 */
	void exitObjectIdentifierValue(ASNParser.ObjectIdentifierValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#objIdComponentsList}.
	 * @param ctx the parse tree
	 */
	void enterObjIdComponentsList(ASNParser.ObjIdComponentsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#objIdComponentsList}.
	 * @param ctx the parse tree
	 */
	void exitObjIdComponentsList(ASNParser.ObjIdComponentsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#objIdComponents}.
	 * @param ctx the parse tree
	 */
	void enterObjIdComponents(ASNParser.ObjIdComponentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#objIdComponents}.
	 * @param ctx the parse tree
	 */
	void exitObjIdComponents(ASNParser.ObjIdComponentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#integerValue}.
	 * @param ctx the parse tree
	 */
	void enterIntegerValue(ASNParser.IntegerValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#integerValue}.
	 * @param ctx the parse tree
	 */
	void exitIntegerValue(ASNParser.IntegerValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#choiceValue}.
	 * @param ctx the parse tree
	 */
	void enterChoiceValue(ASNParser.ChoiceValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#choiceValue}.
	 * @param ctx the parse tree
	 */
	void exitChoiceValue(ASNParser.ChoiceValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#enumeratedValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratedValue(ASNParser.EnumeratedValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#enumeratedValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratedValue(ASNParser.EnumeratedValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#signedNumber}.
	 * @param ctx the parse tree
	 */
	void enterSignedNumber(ASNParser.SignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#signedNumber}.
	 * @param ctx the parse tree
	 */
	void exitSignedNumber(ASNParser.SignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#choiceType}.
	 * @param ctx the parse tree
	 */
	void enterChoiceType(ASNParser.ChoiceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#choiceType}.
	 * @param ctx the parse tree
	 */
	void exitChoiceType(ASNParser.ChoiceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#alternativeTypeLists}.
	 * @param ctx the parse tree
	 */
	void enterAlternativeTypeLists(ASNParser.AlternativeTypeListsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#alternativeTypeLists}.
	 * @param ctx the parse tree
	 */
	void exitAlternativeTypeLists(ASNParser.AlternativeTypeListsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#extensionAdditionAlternatives}.
	 * @param ctx the parse tree
	 */
	void enterExtensionAdditionAlternatives(ASNParser.ExtensionAdditionAlternativesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#extensionAdditionAlternatives}.
	 * @param ctx the parse tree
	 */
	void exitExtensionAdditionAlternatives(ASNParser.ExtensionAdditionAlternativesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#extensionAdditionAlternativesList}.
	 * @param ctx the parse tree
	 */
	void enterExtensionAdditionAlternativesList(ASNParser.ExtensionAdditionAlternativesListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#extensionAdditionAlternativesList}.
	 * @param ctx the parse tree
	 */
	void exitExtensionAdditionAlternativesList(ASNParser.ExtensionAdditionAlternativesListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#extensionAdditionAlternative}.
	 * @param ctx the parse tree
	 */
	void enterExtensionAdditionAlternative(ASNParser.ExtensionAdditionAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#extensionAdditionAlternative}.
	 * @param ctx the parse tree
	 */
	void exitExtensionAdditionAlternative(ASNParser.ExtensionAdditionAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#extensionAdditionAlternativesGroup}.
	 * @param ctx the parse tree
	 */
	void enterExtensionAdditionAlternativesGroup(ASNParser.ExtensionAdditionAlternativesGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#extensionAdditionAlternativesGroup}.
	 * @param ctx the parse tree
	 */
	void exitExtensionAdditionAlternativesGroup(ASNParser.ExtensionAdditionAlternativesGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#rootAlternativeTypeList}.
	 * @param ctx the parse tree
	 */
	void enterRootAlternativeTypeList(ASNParser.RootAlternativeTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#rootAlternativeTypeList}.
	 * @param ctx the parse tree
	 */
	void exitRootAlternativeTypeList(ASNParser.RootAlternativeTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#alternativeTypeList}.
	 * @param ctx the parse tree
	 */
	void enterAlternativeTypeList(ASNParser.AlternativeTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#alternativeTypeList}.
	 * @param ctx the parse tree
	 */
	void exitAlternativeTypeList(ASNParser.AlternativeTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#namedType}.
	 * @param ctx the parse tree
	 */
	void enterNamedType(ASNParser.NamedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#namedType}.
	 * @param ctx the parse tree
	 */
	void exitNamedType(ASNParser.NamedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#enumeratedType}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratedType(ASNParser.EnumeratedTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#enumeratedType}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratedType(ASNParser.EnumeratedTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#enumerations}.
	 * @param ctx the parse tree
	 */
	void enterEnumerations(ASNParser.EnumerationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#enumerations}.
	 * @param ctx the parse tree
	 */
	void exitEnumerations(ASNParser.EnumerationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#rootEnumeration}.
	 * @param ctx the parse tree
	 */
	void enterRootEnumeration(ASNParser.RootEnumerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#rootEnumeration}.
	 * @param ctx the parse tree
	 */
	void exitRootEnumeration(ASNParser.RootEnumerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#enumeration}.
	 * @param ctx the parse tree
	 */
	void enterEnumeration(ASNParser.EnumerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#enumeration}.
	 * @param ctx the parse tree
	 */
	void exitEnumeration(ASNParser.EnumerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#enumerationItem}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationItem(ASNParser.EnumerationItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#enumerationItem}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationItem(ASNParser.EnumerationItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#namedNumber}.
	 * @param ctx the parse tree
	 */
	void enterNamedNumber(ASNParser.NamedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#namedNumber}.
	 * @param ctx the parse tree
	 */
	void exitNamedNumber(ASNParser.NamedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#definedValue}.
	 * @param ctx the parse tree
	 */
	void enterDefinedValue(ASNParser.DefinedValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#definedValue}.
	 * @param ctx the parse tree
	 */
	void exitDefinedValue(ASNParser.DefinedValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#parameterizedValue}.
	 * @param ctx the parse tree
	 */
	void enterParameterizedValue(ASNParser.ParameterizedValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#parameterizedValue}.
	 * @param ctx the parse tree
	 */
	void exitParameterizedValue(ASNParser.ParameterizedValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#simpleDefinedValue}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDefinedValue(ASNParser.SimpleDefinedValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#simpleDefinedValue}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDefinedValue(ASNParser.SimpleDefinedValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#actualParameterList}.
	 * @param ctx the parse tree
	 */
	void enterActualParameterList(ASNParser.ActualParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#actualParameterList}.
	 * @param ctx the parse tree
	 */
	void exitActualParameterList(ASNParser.ActualParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(ASNParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(ASNParser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#exceptionSpec}.
	 * @param ctx the parse tree
	 */
	void enterExceptionSpec(ASNParser.ExceptionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#exceptionSpec}.
	 * @param ctx the parse tree
	 */
	void exitExceptionSpec(ASNParser.ExceptionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#exceptionIdentification}.
	 * @param ctx the parse tree
	 */
	void enterExceptionIdentification(ASNParser.ExceptionIdentificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#exceptionIdentification}.
	 * @param ctx the parse tree
	 */
	void exitExceptionIdentification(ASNParser.ExceptionIdentificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#additionalEnumeration}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalEnumeration(ASNParser.AdditionalEnumerationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#additionalEnumeration}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalEnumeration(ASNParser.AdditionalEnumerationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#integerType}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(ASNParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#integerType}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(ASNParser.IntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#namedNumberList}.
	 * @param ctx the parse tree
	 */
	void enterNamedNumberList(ASNParser.NamedNumberListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#namedNumberList}.
	 * @param ctx the parse tree
	 */
	void exitNamedNumberList(ASNParser.NamedNumberListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#objectidentifiertype}.
	 * @param ctx the parse tree
	 */
	void enterObjectidentifiertype(ASNParser.ObjectidentifiertypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#objectidentifiertype}.
	 * @param ctx the parse tree
	 */
	void exitObjectidentifiertype(ASNParser.ObjectidentifiertypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#componentRelationConstraint}.
	 * @param ctx the parse tree
	 */
	void enterComponentRelationConstraint(ASNParser.ComponentRelationConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#componentRelationConstraint}.
	 * @param ctx the parse tree
	 */
	void exitComponentRelationConstraint(ASNParser.ComponentRelationConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#atNotation}.
	 * @param ctx the parse tree
	 */
	void enterAtNotation(ASNParser.AtNotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#atNotation}.
	 * @param ctx the parse tree
	 */
	void exitAtNotation(ASNParser.AtNotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#level}.
	 * @param ctx the parse tree
	 */
	void enterLevel(ASNParser.LevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#level}.
	 * @param ctx the parse tree
	 */
	void exitLevel(ASNParser.LevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#componentIdList}.
	 * @param ctx the parse tree
	 */
	void enterComponentIdList(ASNParser.ComponentIdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#componentIdList}.
	 * @param ctx the parse tree
	 */
	void exitComponentIdList(ASNParser.ComponentIdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#octetStringType}.
	 * @param ctx the parse tree
	 */
	void enterOctetStringType(ASNParser.OctetStringTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#octetStringType}.
	 * @param ctx the parse tree
	 */
	void exitOctetStringType(ASNParser.OctetStringTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#bitStringType}.
	 * @param ctx the parse tree
	 */
	void enterBitStringType(ASNParser.BitStringTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#bitStringType}.
	 * @param ctx the parse tree
	 */
	void exitBitStringType(ASNParser.BitStringTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#namedBitList}.
	 * @param ctx the parse tree
	 */
	void enterNamedBitList(ASNParser.NamedBitListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#namedBitList}.
	 * @param ctx the parse tree
	 */
	void exitNamedBitList(ASNParser.NamedBitListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#namedBit}.
	 * @param ctx the parse tree
	 */
	void enterNamedBit(ASNParser.NamedBitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#namedBit}.
	 * @param ctx the parse tree
	 */
	void exitNamedBit(ASNParser.NamedBitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASNParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(ASNParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASNParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(ASNParser.BooleanValueContext ctx);
}