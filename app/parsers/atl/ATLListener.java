// Generated from atl/ATL.g4 by ANTLR 4.7.1
package parsers.atl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ATLParser}.
 */
public interface ATLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ATLParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(ATLParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(ATLParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(ATLParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(ATLParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#targetModelPattern}.
	 * @param ctx the parse tree
	 */
	void enterTargetModelPattern(ATLParser.TargetModelPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#targetModelPattern}.
	 * @param ctx the parse tree
	 */
	void exitTargetModelPattern(ATLParser.TargetModelPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#sourceModelPattern}.
	 * @param ctx the parse tree
	 */
	void enterSourceModelPattern(ATLParser.SourceModelPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#sourceModelPattern}.
	 * @param ctx the parse tree
	 */
	void exitSourceModelPattern(ATLParser.SourceModelPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#transformationMode}.
	 * @param ctx the parse tree
	 */
	void enterTransformationMode(ATLParser.TransformationModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#transformationMode}.
	 * @param ctx the parse tree
	 */
	void exitTransformationMode(ATLParser.TransformationModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#library}.
	 * @param ctx the parse tree
	 */
	void enterLibrary(ATLParser.LibraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#library}.
	 * @param ctx the parse tree
	 */
	void exitLibrary(ATLParser.LibraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(ATLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(ATLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#libraryRef}.
	 * @param ctx the parse tree
	 */
	void enterLibraryRef(ATLParser.LibraryRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#libraryRef}.
	 * @param ctx the parse tree
	 */
	void exitLibraryRef(ATLParser.LibraryRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#moduleElement}.
	 * @param ctx the parse tree
	 */
	void enterModuleElement(ATLParser.ModuleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#moduleElement}.
	 * @param ctx the parse tree
	 */
	void exitModuleElement(ATLParser.ModuleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#helper}.
	 * @param ctx the parse tree
	 */
	void enterHelper(ATLParser.HelperContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#helper}.
	 * @param ctx the parse tree
	 */
	void exitHelper(ATLParser.HelperContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#oclFeatureDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOclFeatureDefinition(ATLParser.OclFeatureDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#oclFeatureDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOclFeatureDefinition(ATLParser.OclFeatureDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#oclContextDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOclContextDefinition(ATLParser.OclContextDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#oclContextDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOclContextDefinition(ATLParser.OclContextDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#oclFeature}.
	 * @param ctx the parse tree
	 */
	void enterOclFeature(ATLParser.OclFeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#oclFeature}.
	 * @param ctx the parse tree
	 */
	void exitOclFeature(ATLParser.OclFeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(ATLParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(ATLParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ATLParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ATLParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(ATLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(ATLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#arule}.
	 * @param ctx the parse tree
	 */
	void enterArule(ATLParser.AruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#arule}.
	 * @param ctx the parse tree
	 */
	void exitArule(ATLParser.AruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#matchedRule}.
	 * @param ctx the parse tree
	 */
	void enterMatchedRule(ATLParser.MatchedRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#matchedRule}.
	 * @param ctx the parse tree
	 */
	void exitMatchedRule(ATLParser.MatchedRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#lazyMatchedRule}.
	 * @param ctx the parse tree
	 */
	void enterLazyMatchedRule(ATLParser.LazyMatchedRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#lazyMatchedRule}.
	 * @param ctx the parse tree
	 */
	void exitLazyMatchedRule(ATLParser.LazyMatchedRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#ruleVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterRuleVariableDeclaration(ATLParser.RuleVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#ruleVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitRuleVariableDeclaration(ATLParser.RuleVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#calledRule}.
	 * @param ctx the parse tree
	 */
	void enterCalledRule(ATLParser.CalledRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#calledRule}.
	 * @param ctx the parse tree
	 */
	void exitCalledRule(ATLParser.CalledRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#inPattern}.
	 * @param ctx the parse tree
	 */
	void enterInPattern(ATLParser.InPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#inPattern}.
	 * @param ctx the parse tree
	 */
	void exitInPattern(ATLParser.InPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#inPatternElement}.
	 * @param ctx the parse tree
	 */
	void enterInPatternElement(ATLParser.InPatternElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#inPatternElement}.
	 * @param ctx the parse tree
	 */
	void exitInPatternElement(ATLParser.InPatternElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#simpleInPatternElement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleInPatternElement(ATLParser.SimpleInPatternElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#simpleInPatternElement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleInPatternElement(ATLParser.SimpleInPatternElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#outPattern}.
	 * @param ctx the parse tree
	 */
	void enterOutPattern(ATLParser.OutPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#outPattern}.
	 * @param ctx the parse tree
	 */
	void exitOutPattern(ATLParser.OutPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#outPatternElement}.
	 * @param ctx the parse tree
	 */
	void enterOutPatternElement(ATLParser.OutPatternElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#outPatternElement}.
	 * @param ctx the parse tree
	 */
	void exitOutPatternElement(ATLParser.OutPatternElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#simpleOutPatternElement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleOutPatternElement(ATLParser.SimpleOutPatternElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#simpleOutPatternElement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleOutPatternElement(ATLParser.SimpleOutPatternElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#forEachOutPatternElement}.
	 * @param ctx the parse tree
	 */
	void enterForEachOutPatternElement(ATLParser.ForEachOutPatternElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#forEachOutPatternElement}.
	 * @param ctx the parse tree
	 */
	void exitForEachOutPatternElement(ATLParser.ForEachOutPatternElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#binding}.
	 * @param ctx the parse tree
	 */
	void enterBinding(ATLParser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#binding}.
	 * @param ctx the parse tree
	 */
	void exitBinding(ATLParser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#actionBlock}.
	 * @param ctx the parse tree
	 */
	void enterActionBlock(ATLParser.ActionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#actionBlock}.
	 * @param ctx the parse tree
	 */
	void exitActionBlock(ATLParser.ActionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ATLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ATLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#bindingStat}.
	 * @param ctx the parse tree
	 */
	void enterBindingStat(ATLParser.BindingStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#bindingStat}.
	 * @param ctx the parse tree
	 */
	void exitBindingStat(ATLParser.BindingStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#expressionStat}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStat(ATLParser.ExpressionStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#expressionStat}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStat(ATLParser.ExpressionStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(ATLParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(ATLParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#forStat}.
	 * @param ctx the parse tree
	 */
	void enterForStat(ATLParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#forStat}.
	 * @param ctx the parse tree
	 */
	void exitForStat(ATLParser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#oclModel}.
	 * @param ctx the parse tree
	 */
	void enterOclModel(ATLParser.OclModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#oclModel}.
	 * @param ctx the parse tree
	 */
	void exitOclModel(ATLParser.OclModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#oclModelElement}.
	 * @param ctx the parse tree
	 */
	void enterOclModelElement(ATLParser.OclModelElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#oclModelElement}.
	 * @param ctx the parse tree
	 */
	void exitOclModelElement(ATLParser.OclModelElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#oclExpression}.
	 * @param ctx the parse tree
	 */
	void enterOclExpression(ATLParser.OclExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#oclExpression}.
	 * @param ctx the parse tree
	 */
	void exitOclExpression(ATLParser.OclExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#iteratorExp}.
	 * @param ctx the parse tree
	 */
	void enterIteratorExp(ATLParser.IteratorExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#iteratorExp}.
	 * @param ctx the parse tree
	 */
	void exitIteratorExp(ATLParser.IteratorExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#iterateExp}.
	 * @param ctx the parse tree
	 */
	void enterIterateExp(ATLParser.IterateExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#iterateExp}.
	 * @param ctx the parse tree
	 */
	void exitIterateExp(ATLParser.IterateExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#collectionOperationCallExp}.
	 * @param ctx the parse tree
	 */
	void enterCollectionOperationCallExp(ATLParser.CollectionOperationCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#collectionOperationCallExp}.
	 * @param ctx the parse tree
	 */
	void exitCollectionOperationCallExp(ATLParser.CollectionOperationCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#operationCallExp}.
	 * @param ctx the parse tree
	 */
	void enterOperationCallExp(ATLParser.OperationCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#operationCallExp}.
	 * @param ctx the parse tree
	 */
	void exitOperationCallExp(ATLParser.OperationCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#navigationOrAttributeCallExp}.
	 * @param ctx the parse tree
	 */
	void enterNavigationOrAttributeCallExp(ATLParser.NavigationOrAttributeCallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#navigationOrAttributeCallExp}.
	 * @param ctx the parse tree
	 */
	void exitNavigationOrAttributeCallExp(ATLParser.NavigationOrAttributeCallExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#iterator}.
	 * @param ctx the parse tree
	 */
	void enterIterator(ATLParser.IteratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#iterator}.
	 * @param ctx the parse tree
	 */
	void exitIterator(ATLParser.IteratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#oclUndefinedExp}.
	 * @param ctx the parse tree
	 */
	void enterOclUndefinedExp(ATLParser.OclUndefinedExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#oclUndefinedExp}.
	 * @param ctx the parse tree
	 */
	void exitOclUndefinedExp(ATLParser.OclUndefinedExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#primitiveExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveExp(ATLParser.PrimitiveExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#primitiveExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveExp(ATLParser.PrimitiveExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#numericExp}.
	 * @param ctx the parse tree
	 */
	void enterNumericExp(ATLParser.NumericExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#numericExp}.
	 * @param ctx the parse tree
	 */
	void exitNumericExp(ATLParser.NumericExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#booleanExp}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExp(ATLParser.BooleanExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#booleanExp}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExp(ATLParser.BooleanExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#integerExp}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExp(ATLParser.IntegerExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#integerExp}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExp(ATLParser.IntegerExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#realExp}.
	 * @param ctx the parse tree
	 */
	void enterRealExp(ATLParser.RealExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#realExp}.
	 * @param ctx the parse tree
	 */
	void exitRealExp(ATLParser.RealExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#stringExp}.
	 * @param ctx the parse tree
	 */
	void enterStringExp(ATLParser.StringExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#stringExp}.
	 * @param ctx the parse tree
	 */
	void exitStringExp(ATLParser.StringExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#ifExp}.
	 * @param ctx the parse tree
	 */
	void enterIfExp(ATLParser.IfExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#ifExp}.
	 * @param ctx the parse tree
	 */
	void exitIfExp(ATLParser.IfExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#variableExp}.
	 * @param ctx the parse tree
	 */
	void enterVariableExp(ATLParser.VariableExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#variableExp}.
	 * @param ctx the parse tree
	 */
	void exitVariableExp(ATLParser.VariableExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#superExp}.
	 * @param ctx the parse tree
	 */
	void enterSuperExp(ATLParser.SuperExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#superExp}.
	 * @param ctx the parse tree
	 */
	void exitSuperExp(ATLParser.SuperExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#letExp}.
	 * @param ctx the parse tree
	 */
	void enterLetExp(ATLParser.LetExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#letExp}.
	 * @param ctx the parse tree
	 */
	void exitLetExp(ATLParser.LetExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ATLParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ATLParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#enumLiteralExp}.
	 * @param ctx the parse tree
	 */
	void enterEnumLiteralExp(ATLParser.EnumLiteralExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#enumLiteralExp}.
	 * @param ctx the parse tree
	 */
	void exitEnumLiteralExp(ATLParser.EnumLiteralExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#collectionExp}.
	 * @param ctx the parse tree
	 */
	void enterCollectionExp(ATLParser.CollectionExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#collectionExp}.
	 * @param ctx the parse tree
	 */
	void exitCollectionExp(ATLParser.CollectionExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#bagExp}.
	 * @param ctx the parse tree
	 */
	void enterBagExp(ATLParser.BagExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#bagExp}.
	 * @param ctx the parse tree
	 */
	void exitBagExp(ATLParser.BagExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#setExp}.
	 * @param ctx the parse tree
	 */
	void enterSetExp(ATLParser.SetExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#setExp}.
	 * @param ctx the parse tree
	 */
	void exitSetExp(ATLParser.SetExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#orderedSetExp}.
	 * @param ctx the parse tree
	 */
	void enterOrderedSetExp(ATLParser.OrderedSetExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#orderedSetExp}.
	 * @param ctx the parse tree
	 */
	void exitOrderedSetExp(ATLParser.OrderedSetExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#sequenceExp}.
	 * @param ctx the parse tree
	 */
	void enterSequenceExp(ATLParser.SequenceExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#sequenceExp}.
	 * @param ctx the parse tree
	 */
	void exitSequenceExp(ATLParser.SequenceExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#mapExp}.
	 * @param ctx the parse tree
	 */
	void enterMapExp(ATLParser.MapExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#mapExp}.
	 * @param ctx the parse tree
	 */
	void exitMapExp(ATLParser.MapExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#mapElement}.
	 * @param ctx the parse tree
	 */
	void enterMapElement(ATLParser.MapElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#mapElement}.
	 * @param ctx the parse tree
	 */
	void exitMapElement(ATLParser.MapElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#tupleExp}.
	 * @param ctx the parse tree
	 */
	void enterTupleExp(ATLParser.TupleExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#tupleExp}.
	 * @param ctx the parse tree
	 */
	void exitTupleExp(ATLParser.TupleExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#tuplePart}.
	 * @param ctx the parse tree
	 */
	void enterTuplePart(ATLParser.TuplePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#tuplePart}.
	 * @param ctx the parse tree
	 */
	void exitTuplePart(ATLParser.TuplePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#oclType}.
	 * @param ctx the parse tree
	 */
	void enterOclType(ATLParser.OclTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#oclType}.
	 * @param ctx the parse tree
	 */
	void exitOclType(ATLParser.OclTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#oclAnyType}.
	 * @param ctx the parse tree
	 */
	void enterOclAnyType(ATLParser.OclAnyTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#oclAnyType}.
	 * @param ctx the parse tree
	 */
	void exitOclAnyType(ATLParser.OclAnyTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void enterTupleType(ATLParser.TupleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void exitTupleType(ATLParser.TupleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#tupleTypeAttribute}.
	 * @param ctx the parse tree
	 */
	void enterTupleTypeAttribute(ATLParser.TupleTypeAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#tupleTypeAttribute}.
	 * @param ctx the parse tree
	 */
	void exitTupleTypeAttribute(ATLParser.TupleTypeAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#mapType}.
	 * @param ctx the parse tree
	 */
	void enterMapType(ATLParser.MapTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#mapType}.
	 * @param ctx the parse tree
	 */
	void exitMapType(ATLParser.MapTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(ATLParser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(ATLParser.PrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(ATLParser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(ATLParser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#integerType}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(ATLParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#integerType}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(ATLParser.IntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#realType}.
	 * @param ctx the parse tree
	 */
	void enterRealType(ATLParser.RealTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#realType}.
	 * @param ctx the parse tree
	 */
	void exitRealType(ATLParser.RealTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(ATLParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#booleanType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(ATLParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#stringType}.
	 * @param ctx the parse tree
	 */
	void enterStringType(ATLParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#stringType}.
	 * @param ctx the parse tree
	 */
	void exitStringType(ATLParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#collectionType}.
	 * @param ctx the parse tree
	 */
	void enterCollectionType(ATLParser.CollectionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#collectionType}.
	 * @param ctx the parse tree
	 */
	void exitCollectionType(ATLParser.CollectionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#bagType}.
	 * @param ctx the parse tree
	 */
	void enterBagType(ATLParser.BagTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#bagType}.
	 * @param ctx the parse tree
	 */
	void exitBagType(ATLParser.BagTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#setType}.
	 * @param ctx the parse tree
	 */
	void enterSetType(ATLParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#setType}.
	 * @param ctx the parse tree
	 */
	void exitSetType(ATLParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#orderedSetType}.
	 * @param ctx the parse tree
	 */
	void enterOrderedSetType(ATLParser.OrderedSetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#orderedSetType}.
	 * @param ctx the parse tree
	 */
	void exitOrderedSetType(ATLParser.OrderedSetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#sequenceType}.
	 * @param ctx the parse tree
	 */
	void enterSequenceType(ATLParser.SequenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#sequenceType}.
	 * @param ctx the parse tree
	 */
	void exitSequenceType(ATLParser.SequenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#priority_0}.
	 * @param ctx the parse tree
	 */
	void enterPriority_0(ATLParser.Priority_0Context ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#priority_0}.
	 * @param ctx the parse tree
	 */
	void exitPriority_0(ATLParser.Priority_0Context ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#priority_1}.
	 * @param ctx the parse tree
	 */
	void enterPriority_1(ATLParser.Priority_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#priority_1}.
	 * @param ctx the parse tree
	 */
	void exitPriority_1(ATLParser.Priority_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#priority_2}.
	 * @param ctx the parse tree
	 */
	void enterPriority_2(ATLParser.Priority_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#priority_2}.
	 * @param ctx the parse tree
	 */
	void exitPriority_2(ATLParser.Priority_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#priority_3}.
	 * @param ctx the parse tree
	 */
	void enterPriority_3(ATLParser.Priority_3Context ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#priority_3}.
	 * @param ctx the parse tree
	 */
	void exitPriority_3(ATLParser.Priority_3Context ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#priority_4}.
	 * @param ctx the parse tree
	 */
	void enterPriority_4(ATLParser.Priority_4Context ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#priority_4}.
	 * @param ctx the parse tree
	 */
	void exitPriority_4(ATLParser.Priority_4Context ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#priority_5}.
	 * @param ctx the parse tree
	 */
	void enterPriority_5(ATLParser.Priority_5Context ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#priority_5}.
	 * @param ctx the parse tree
	 */
	void exitPriority_5(ATLParser.Priority_5Context ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#matchedRule_abstractContents}.
	 * @param ctx the parse tree
	 */
	void enterMatchedRule_abstractContents(ATLParser.MatchedRule_abstractContentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#matchedRule_abstractContents}.
	 * @param ctx the parse tree
	 */
	void exitMatchedRule_abstractContents(ATLParser.MatchedRule_abstractContentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#oclType_abstractContents}.
	 * @param ctx the parse tree
	 */
	void enterOclType_abstractContents(ATLParser.OclType_abstractContentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#oclType_abstractContents}.
	 * @param ctx the parse tree
	 */
	void exitOclType_abstractContents(ATLParser.OclType_abstractContentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#oclAnyType_abstractContents}.
	 * @param ctx the parse tree
	 */
	void enterOclAnyType_abstractContents(ATLParser.OclAnyType_abstractContentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#oclAnyType_abstractContents}.
	 * @param ctx the parse tree
	 */
	void exitOclAnyType_abstractContents(ATLParser.OclAnyType_abstractContentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#collectionType_abstractContents}.
	 * @param ctx the parse tree
	 */
	void enterCollectionType_abstractContents(ATLParser.CollectionType_abstractContentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#collectionType_abstractContents}.
	 * @param ctx the parse tree
	 */
	void exitCollectionType_abstractContents(ATLParser.CollectionType_abstractContentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ATLParser#primary_oclExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_oclExpression(ATLParser.Primary_oclExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ATLParser#primary_oclExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_oclExpression(ATLParser.Primary_oclExpressionContext ctx);
}