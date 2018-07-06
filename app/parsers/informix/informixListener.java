// Generated from informix/informix.g4 by ANTLR 4.7.1
package parsers.informix;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link informixParser}.
 */
public interface informixListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link informixParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit(informixParser.Compilation_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit(informixParser.Compilation_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(informixParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(informixParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void enterMainBlock(informixParser.MainBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#mainBlock}.
	 * @param ctx the parse tree
	 */
	void exitMainBlock(informixParser.MainBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#mainStatements}.
	 * @param ctx the parse tree
	 */
	void enterMainStatements(informixParser.MainStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#mainStatements}.
	 * @param ctx the parse tree
	 */
	void exitMainStatements(informixParser.MainStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#deferStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeferStatement(informixParser.DeferStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#deferStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeferStatement(informixParser.DeferStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#functionOrReportDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterFunctionOrReportDefinitions(informixParser.FunctionOrReportDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#functionOrReportDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitFunctionOrReportDefinitions(informixParser.FunctionOrReportDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(informixParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(informixParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(informixParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(informixParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(informixParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(informixParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(informixParser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(informixParser.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#globalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGlobalDeclaration(informixParser.GlobalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#globalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGlobalDeclaration(informixParser.GlobalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#typeDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclarations(informixParser.TypeDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#typeDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclarations(informixParser.TypeDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(informixParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(informixParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(informixParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(informixParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(informixParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(informixParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#indirectType}.
	 * @param ctx the parse tree
	 */
	void enterIndirectType(informixParser.IndirectTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#indirectType}.
	 * @param ctx the parse tree
	 */
	void exitIndirectType(informixParser.IndirectTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(informixParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(informixParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#largeType}.
	 * @param ctx the parse tree
	 */
	void enterLargeType(informixParser.LargeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#largeType}.
	 * @param ctx the parse tree
	 */
	void exitLargeType(informixParser.LargeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#numberType}.
	 * @param ctx the parse tree
	 */
	void enterNumberType(informixParser.NumberTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#numberType}.
	 * @param ctx the parse tree
	 */
	void exitNumberType(informixParser.NumberTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#charType}.
	 * @param ctx the parse tree
	 */
	void enterCharType(informixParser.CharTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#charType}.
	 * @param ctx the parse tree
	 */
	void exitCharType(informixParser.CharTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#timeType}.
	 * @param ctx the parse tree
	 */
	void enterTimeType(informixParser.TimeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#timeType}.
	 * @param ctx the parse tree
	 */
	void exitTimeType(informixParser.TimeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#datetimeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterDatetimeQualifier(informixParser.DatetimeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#datetimeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitDatetimeQualifier(informixParser.DatetimeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#intervalQualifier}.
	 * @param ctx the parse tree
	 */
	void enterIntervalQualifier(informixParser.IntervalQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#intervalQualifier}.
	 * @param ctx the parse tree
	 */
	void exitIntervalQualifier(informixParser.IntervalQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#unitType}.
	 * @param ctx the parse tree
	 */
	void enterUnitType(informixParser.UnitTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#unitType}.
	 * @param ctx the parse tree
	 */
	void exitUnitType(informixParser.UnitTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#yearQualifier}.
	 * @param ctx the parse tree
	 */
	void enterYearQualifier(informixParser.YearQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#yearQualifier}.
	 * @param ctx the parse tree
	 */
	void exitYearQualifier(informixParser.YearQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#monthQualifier}.
	 * @param ctx the parse tree
	 */
	void enterMonthQualifier(informixParser.MonthQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#monthQualifier}.
	 * @param ctx the parse tree
	 */
	void exitMonthQualifier(informixParser.MonthQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#dayQualifier}.
	 * @param ctx the parse tree
	 */
	void enterDayQualifier(informixParser.DayQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#dayQualifier}.
	 * @param ctx the parse tree
	 */
	void exitDayQualifier(informixParser.DayQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#hourQualifier}.
	 * @param ctx the parse tree
	 */
	void enterHourQualifier(informixParser.HourQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#hourQualifier}.
	 * @param ctx the parse tree
	 */
	void exitHourQualifier(informixParser.HourQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#minuteQualifier}.
	 * @param ctx the parse tree
	 */
	void enterMinuteQualifier(informixParser.MinuteQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#minuteQualifier}.
	 * @param ctx the parse tree
	 */
	void exitMinuteQualifier(informixParser.MinuteQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#secondQualifier}.
	 * @param ctx the parse tree
	 */
	void enterSecondQualifier(informixParser.SecondQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#secondQualifier}.
	 * @param ctx the parse tree
	 */
	void exitSecondQualifier(informixParser.SecondQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#fractionQualifier}.
	 * @param ctx the parse tree
	 */
	void enterFractionQualifier(informixParser.FractionQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#fractionQualifier}.
	 * @param ctx the parse tree
	 */
	void exitFractionQualifier(informixParser.FractionQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(informixParser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(informixParser.StructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#recordType}.
	 * @param ctx the parse tree
	 */
	void enterRecordType(informixParser.RecordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#recordType}.
	 * @param ctx the parse tree
	 */
	void exitRecordType(informixParser.RecordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#arrayIndexer}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndexer(informixParser.ArrayIndexerContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#arrayIndexer}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndexer(informixParser.ArrayIndexerContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(informixParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(informixParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#dynArrayType}.
	 * @param ctx the parse tree
	 */
	void enterDynArrayType(informixParser.DynArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#dynArrayType}.
	 * @param ctx the parse tree
	 */
	void exitDynArrayType(informixParser.DynArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(informixParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(informixParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(informixParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(informixParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(informixParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(informixParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(informixParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(informixParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnlabelledStatement(informixParser.UnlabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnlabelledStatement(informixParser.UnlabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(informixParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(informixParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#runStatement}.
	 * @param ctx the parse tree
	 */
	void enterRunStatement(informixParser.RunStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#runStatement}.
	 * @param ctx the parse tree
	 */
	void exitRunStatement(informixParser.RunStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(informixParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(informixParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(informixParser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(informixParser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#procedureIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterProcedureIdentifier(informixParser.ProcedureIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#procedureIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitProcedureIdentifier(informixParser.ProcedureIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(informixParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(informixParser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(informixParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#gotoStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(informixParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(informixParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(informixParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#logicalTerm}.
	 * @param ctx the parse tree
	 */
	void enterLogicalTerm(informixParser.LogicalTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#logicalTerm}.
	 * @param ctx the parse tree
	 */
	void exitLogicalTerm(informixParser.LogicalTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#logicalFactor}.
	 * @param ctx the parse tree
	 */
	void enterLogicalFactor(informixParser.LogicalFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#logicalFactor}.
	 * @param ctx the parse tree
	 */
	void exitLogicalFactor(informixParser.LogicalFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#quantifiedFactor}.
	 * @param ctx the parse tree
	 */
	void enterQuantifiedFactor(informixParser.QuantifiedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#quantifiedFactor}.
	 * @param ctx the parse tree
	 */
	void exitQuantifiedFactor(informixParser.QuantifiedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#expressionSet}.
	 * @param ctx the parse tree
	 */
	void enterExpressionSet(informixParser.ExpressionSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#expressionSet}.
	 * @param ctx the parse tree
	 */
	void exitExpressionSet(informixParser.ExpressionSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(informixParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(informixParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#sqlExpression}.
	 * @param ctx the parse tree
	 */
	void enterSqlExpression(informixParser.SqlExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#sqlExpression}.
	 * @param ctx the parse tree
	 */
	void exitSqlExpression(informixParser.SqlExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#sqlAlias}.
	 * @param ctx the parse tree
	 */
	void enterSqlAlias(informixParser.SqlAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#sqlAlias}.
	 * @param ctx the parse tree
	 */
	void exitSqlAlias(informixParser.SqlAliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#sqlTerm}.
	 * @param ctx the parse tree
	 */
	void enterSqlTerm(informixParser.SqlTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#sqlTerm}.
	 * @param ctx the parse tree
	 */
	void exitSqlTerm(informixParser.SqlTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#sqlMultiply}.
	 * @param ctx the parse tree
	 */
	void enterSqlMultiply(informixParser.SqlMultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#sqlMultiply}.
	 * @param ctx the parse tree
	 */
	void exitSqlMultiply(informixParser.SqlMultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#sqlFactor}.
	 * @param ctx the parse tree
	 */
	void enterSqlFactor(informixParser.SqlFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#sqlFactor}.
	 * @param ctx the parse tree
	 */
	void exitSqlFactor(informixParser.SqlFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#sqlFactor2}.
	 * @param ctx the parse tree
	 */
	void enterSqlFactor2(informixParser.SqlFactor2Context ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#sqlFactor2}.
	 * @param ctx the parse tree
	 */
	void exitSqlFactor2(informixParser.SqlFactor2Context ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#sqlExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterSqlExpressionList(informixParser.SqlExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#sqlExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitSqlExpressionList(informixParser.SqlExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#sqlLiteral}.
	 * @param ctx the parse tree
	 */
	void enterSqlLiteral(informixParser.SqlLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#sqlLiteral}.
	 * @param ctx the parse tree
	 */
	void exitSqlLiteral(informixParser.SqlLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#sqlVariable}.
	 * @param ctx the parse tree
	 */
	void enterSqlVariable(informixParser.SqlVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#sqlVariable}.
	 * @param ctx the parse tree
	 */
	void exitSqlVariable(informixParser.SqlVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#sqlFunction}.
	 * @param ctx the parse tree
	 */
	void enterSqlFunction(informixParser.SqlFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#sqlFunction}.
	 * @param ctx the parse tree
	 */
	void exitSqlFunction(informixParser.SqlFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#dateFunction}.
	 * @param ctx the parse tree
	 */
	void enterDateFunction(informixParser.DateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#dateFunction}.
	 * @param ctx the parse tree
	 */
	void exitDateFunction(informixParser.DateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#numberFunction}.
	 * @param ctx the parse tree
	 */
	void enterNumberFunction(informixParser.NumberFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#numberFunction}.
	 * @param ctx the parse tree
	 */
	void exitNumberFunction(informixParser.NumberFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunction(informixParser.CharFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunction(informixParser.CharFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#groupFunction}.
	 * @param ctx the parse tree
	 */
	void enterGroupFunction(informixParser.GroupFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#groupFunction}.
	 * @param ctx the parse tree
	 */
	void exitGroupFunction(informixParser.GroupFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#otherFunction}.
	 * @param ctx the parse tree
	 */
	void enterOtherFunction(informixParser.OtherFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#otherFunction}.
	 * @param ctx the parse tree
	 */
	void exitOtherFunction(informixParser.OtherFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#sqlPseudoColumn}.
	 * @param ctx the parse tree
	 */
	void enterSqlPseudoColumn(informixParser.SqlPseudoColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#sqlPseudoColumn}.
	 * @param ctx the parse tree
	 */
	void exitSqlPseudoColumn(informixParser.SqlPseudoColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOperator(informixParser.RelationalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#relationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOperator(informixParser.RelationalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(informixParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(informixParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#ifCondition2}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition2(informixParser.IfCondition2Context ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#ifCondition2}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition2(informixParser.IfCondition2Context ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#ifLogicalTerm}.
	 * @param ctx the parse tree
	 */
	void enterIfLogicalTerm(informixParser.IfLogicalTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#ifLogicalTerm}.
	 * @param ctx the parse tree
	 */
	void exitIfLogicalTerm(informixParser.IfLogicalTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(informixParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(informixParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#ifLogicalFactor}.
	 * @param ctx the parse tree
	 */
	void enterIfLogicalFactor(informixParser.IfLogicalFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#ifLogicalFactor}.
	 * @param ctx the parse tree
	 */
	void exitIfLogicalFactor(informixParser.IfLogicalFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(informixParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(informixParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#addingOperator}.
	 * @param ctx the parse tree
	 */
	void enterAddingOperator(informixParser.AddingOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#addingOperator}.
	 * @param ctx the parse tree
	 */
	void exitAddingOperator(informixParser.AddingOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(informixParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(informixParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#multiplyingOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyingOperator(informixParser.MultiplyingOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#multiplyingOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyingOperator(informixParser.MultiplyingOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(informixParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(informixParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDesignator(informixParser.FunctionDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDesignator(informixParser.FunctionDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(informixParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(informixParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(informixParser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(informixParser.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(informixParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(informixParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#numericConstant}.
	 * @param ctx the parse tree
	 */
	void enterNumericConstant(informixParser.NumericConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#numericConstant}.
	 * @param ctx the parse tree
	 */
	void exitNumericConstant(informixParser.NumericConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(informixParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(informixParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#entireVariable}.
	 * @param ctx the parse tree
	 */
	void enterEntireVariable(informixParser.EntireVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#entireVariable}.
	 * @param ctx the parse tree
	 */
	void exitEntireVariable(informixParser.EntireVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableIdentifier(informixParser.VariableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#variableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableIdentifier(informixParser.VariableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#indexingVariable}.
	 * @param ctx the parse tree
	 */
	void enterIndexingVariable(informixParser.IndexingVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#indexingVariable}.
	 * @param ctx the parse tree
	 */
	void exitIndexingVariable(informixParser.IndexingVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#componentVariable}.
	 * @param ctx the parse tree
	 */
	void enterComponentVariable(informixParser.ComponentVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#componentVariable}.
	 * @param ctx the parse tree
	 */
	void exitComponentVariable(informixParser.ComponentVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#recordVariable}.
	 * @param ctx the parse tree
	 */
	void enterRecordVariable(informixParser.RecordVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#recordVariable}.
	 * @param ctx the parse tree
	 */
	void exitRecordVariable(informixParser.RecordVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#fieldIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldIdentifier(informixParser.FieldIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#fieldIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldIdentifier(informixParser.FieldIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(informixParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(informixParser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(informixParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(informixParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(informixParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(informixParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepetetiveStatement(informixParser.RepetetiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepetetiveStatement(informixParser.RepetetiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(informixParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(informixParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(informixParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(informixParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(informixParser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(informixParser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#controlVariable}.
	 * @param ctx the parse tree
	 */
	void enterControlVariable(informixParser.ControlVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#controlVariable}.
	 * @param ctx the parse tree
	 */
	void exitControlVariable(informixParser.ControlVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(informixParser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(informixParser.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(informixParser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(informixParser.FinalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#forEachStatement}.
	 * @param ctx the parse tree
	 */
	void enterForEachStatement(informixParser.ForEachStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#forEachStatement}.
	 * @param ctx the parse tree
	 */
	void exitForEachStatement(informixParser.ForEachStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#variableList}.
	 * @param ctx the parse tree
	 */
	void enterVariableList(informixParser.VariableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#variableList}.
	 * @param ctx the parse tree
	 */
	void exitVariableList(informixParser.VariableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#variableOrConstantList}.
	 * @param ctx the parse tree
	 */
	void enterVariableOrConstantList(informixParser.VariableOrConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#variableOrConstantList}.
	 * @param ctx the parse tree
	 */
	void exitVariableOrConstantList(informixParser.VariableOrConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(informixParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(informixParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#otherFGLStatement}.
	 * @param ctx the parse tree
	 */
	void enterOtherFGLStatement(informixParser.OtherFGLStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#otherFGLStatement}.
	 * @param ctx the parse tree
	 */
	void exitOtherFGLStatement(informixParser.OtherFGLStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#otherProgramFlowStatement}.
	 * @param ctx the parse tree
	 */
	void enterOtherProgramFlowStatement(informixParser.OtherProgramFlowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#otherProgramFlowStatement}.
	 * @param ctx the parse tree
	 */
	void exitOtherProgramFlowStatement(informixParser.OtherProgramFlowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#exitTypes}.
	 * @param ctx the parse tree
	 */
	void enterExitTypes(informixParser.ExitTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#exitTypes}.
	 * @param ctx the parse tree
	 */
	void exitExitTypes(informixParser.ExitTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#exitStatements}.
	 * @param ctx the parse tree
	 */
	void enterExitStatements(informixParser.ExitStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#exitStatements}.
	 * @param ctx the parse tree
	 */
	void exitExitStatements(informixParser.ExitStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#continueStatements}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatements(informixParser.ContinueStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#continueStatements}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatements(informixParser.ContinueStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#otherStorageStatement}.
	 * @param ctx the parse tree
	 */
	void enterOtherStorageStatement(informixParser.OtherStorageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#otherStorageStatement}.
	 * @param ctx the parse tree
	 */
	void exitOtherStorageStatement(informixParser.OtherStorageStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#printExpressionItem}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpressionItem(informixParser.PrintExpressionItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#printExpressionItem}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpressionItem(informixParser.PrintExpressionItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#printExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpressionList(informixParser.PrintExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#printExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpressionList(informixParser.PrintExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#reportStatement}.
	 * @param ctx the parse tree
	 */
	void enterReportStatement(informixParser.ReportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#reportStatement}.
	 * @param ctx the parse tree
	 */
	void exitReportStatement(informixParser.ReportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void enterFieldName(informixParser.FieldNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#fieldName}.
	 * @param ctx the parse tree
	 */
	void exitFieldName(informixParser.FieldNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#thruNotation}.
	 * @param ctx the parse tree
	 */
	void enterThruNotation(informixParser.ThruNotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#thruNotation}.
	 * @param ctx the parse tree
	 */
	void exitThruNotation(informixParser.ThruNotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(informixParser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(informixParser.FieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#keyList}.
	 * @param ctx the parse tree
	 */
	void enterKeyList(informixParser.KeyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#keyList}.
	 * @param ctx the parse tree
	 */
	void exitKeyList(informixParser.KeyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#constructEvents}.
	 * @param ctx the parse tree
	 */
	void enterConstructEvents(informixParser.ConstructEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#constructEvents}.
	 * @param ctx the parse tree
	 */
	void exitConstructEvents(informixParser.ConstructEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#constructInsideStatement}.
	 * @param ctx the parse tree
	 */
	void enterConstructInsideStatement(informixParser.ConstructInsideStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#constructInsideStatement}.
	 * @param ctx the parse tree
	 */
	void exitConstructInsideStatement(informixParser.ConstructInsideStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#specialAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSpecialAttribute(informixParser.SpecialAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#specialAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSpecialAttribute(informixParser.SpecialAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(informixParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(informixParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void enterAttributeList(informixParser.AttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#attributeList}.
	 * @param ctx the parse tree
	 */
	void exitAttributeList(informixParser.AttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#constructGroupStatement}.
	 * @param ctx the parse tree
	 */
	void enterConstructGroupStatement(informixParser.ConstructGroupStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#constructGroupStatement}.
	 * @param ctx the parse tree
	 */
	void exitConstructGroupStatement(informixParser.ConstructGroupStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#constructStatement}.
	 * @param ctx the parse tree
	 */
	void enterConstructStatement(informixParser.ConstructStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#constructStatement}.
	 * @param ctx the parse tree
	 */
	void exitConstructStatement(informixParser.ConstructStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#displayArrayStatement}.
	 * @param ctx the parse tree
	 */
	void enterDisplayArrayStatement(informixParser.DisplayArrayStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#displayArrayStatement}.
	 * @param ctx the parse tree
	 */
	void exitDisplayArrayStatement(informixParser.DisplayArrayStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#displayInsideStatement}.
	 * @param ctx the parse tree
	 */
	void enterDisplayInsideStatement(informixParser.DisplayInsideStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#displayInsideStatement}.
	 * @param ctx the parse tree
	 */
	void exitDisplayInsideStatement(informixParser.DisplayInsideStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#displayEvents}.
	 * @param ctx the parse tree
	 */
	void enterDisplayEvents(informixParser.DisplayEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#displayEvents}.
	 * @param ctx the parse tree
	 */
	void exitDisplayEvents(informixParser.DisplayEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void enterDisplayStatement(informixParser.DisplayStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#displayStatement}.
	 * @param ctx the parse tree
	 */
	void exitDisplayStatement(informixParser.DisplayStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#errorStatement}.
	 * @param ctx the parse tree
	 */
	void enterErrorStatement(informixParser.ErrorStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#errorStatement}.
	 * @param ctx the parse tree
	 */
	void exitErrorStatement(informixParser.ErrorStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#messageStatement}.
	 * @param ctx the parse tree
	 */
	void enterMessageStatement(informixParser.MessageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#messageStatement}.
	 * @param ctx the parse tree
	 */
	void exitMessageStatement(informixParser.MessageStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#promptStatement}.
	 * @param ctx the parse tree
	 */
	void enterPromptStatement(informixParser.PromptStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#promptStatement}.
	 * @param ctx the parse tree
	 */
	void exitPromptStatement(informixParser.PromptStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#inputEvents}.
	 * @param ctx the parse tree
	 */
	void enterInputEvents(informixParser.InputEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#inputEvents}.
	 * @param ctx the parse tree
	 */
	void exitInputEvents(informixParser.InputEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#inputInsideStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputInsideStatement(informixParser.InputInsideStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#inputInsideStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputInsideStatement(informixParser.InputInsideStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#inputGroupStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputGroupStatement(informixParser.InputGroupStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#inputGroupStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputGroupStatement(informixParser.InputGroupStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(informixParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(informixParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#inputArrayStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputArrayStatement(informixParser.InputArrayStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#inputArrayStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputArrayStatement(informixParser.InputArrayStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#menuEvents}.
	 * @param ctx the parse tree
	 */
	void enterMenuEvents(informixParser.MenuEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#menuEvents}.
	 * @param ctx the parse tree
	 */
	void exitMenuEvents(informixParser.MenuEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#menuInsideStatement}.
	 * @param ctx the parse tree
	 */
	void enterMenuInsideStatement(informixParser.MenuInsideStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#menuInsideStatement}.
	 * @param ctx the parse tree
	 */
	void exitMenuInsideStatement(informixParser.MenuInsideStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#menuGroupStatement}.
	 * @param ctx the parse tree
	 */
	void enterMenuGroupStatement(informixParser.MenuGroupStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#menuGroupStatement}.
	 * @param ctx the parse tree
	 */
	void exitMenuGroupStatement(informixParser.MenuGroupStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#menuStatement}.
	 * @param ctx the parse tree
	 */
	void enterMenuStatement(informixParser.MenuStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#menuStatement}.
	 * @param ctx the parse tree
	 */
	void exitMenuStatement(informixParser.MenuStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#reservedLinePosition}.
	 * @param ctx the parse tree
	 */
	void enterReservedLinePosition(informixParser.ReservedLinePositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#reservedLinePosition}.
	 * @param ctx the parse tree
	 */
	void exitReservedLinePosition(informixParser.ReservedLinePositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#specialWindowAttribute}.
	 * @param ctx the parse tree
	 */
	void enterSpecialWindowAttribute(informixParser.SpecialWindowAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#specialWindowAttribute}.
	 * @param ctx the parse tree
	 */
	void exitSpecialWindowAttribute(informixParser.SpecialWindowAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#windowAttribute}.
	 * @param ctx the parse tree
	 */
	void enterWindowAttribute(informixParser.WindowAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#windowAttribute}.
	 * @param ctx the parse tree
	 */
	void exitWindowAttribute(informixParser.WindowAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#windowAttributeList}.
	 * @param ctx the parse tree
	 */
	void enterWindowAttributeList(informixParser.WindowAttributeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#windowAttributeList}.
	 * @param ctx the parse tree
	 */
	void exitWindowAttributeList(informixParser.WindowAttributeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#optionStatement}.
	 * @param ctx the parse tree
	 */
	void enterOptionStatement(informixParser.OptionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#optionStatement}.
	 * @param ctx the parse tree
	 */
	void exitOptionStatement(informixParser.OptionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#optionsStatement}.
	 * @param ctx the parse tree
	 */
	void enterOptionsStatement(informixParser.OptionsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#optionsStatement}.
	 * @param ctx the parse tree
	 */
	void exitOptionsStatement(informixParser.OptionsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#screenStatement}.
	 * @param ctx the parse tree
	 */
	void enterScreenStatement(informixParser.ScreenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#screenStatement}.
	 * @param ctx the parse tree
	 */
	void exitScreenStatement(informixParser.ScreenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatements(informixParser.SqlStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatements(informixParser.SqlStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#cursorManipulationStatement}.
	 * @param ctx the parse tree
	 */
	void enterCursorManipulationStatement(informixParser.CursorManipulationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#cursorManipulationStatement}.
	 * @param ctx the parse tree
	 */
	void exitCursorManipulationStatement(informixParser.CursorManipulationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#columnsList}.
	 * @param ctx the parse tree
	 */
	void enterColumnsList(informixParser.ColumnsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#columnsList}.
	 * @param ctx the parse tree
	 */
	void exitColumnsList(informixParser.ColumnsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#statementId}.
	 * @param ctx the parse tree
	 */
	void enterStatementId(informixParser.StatementIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#statementId}.
	 * @param ctx the parse tree
	 */
	void exitStatementId(informixParser.StatementIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void enterCursorName(informixParser.CursorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void exitCursorName(informixParser.CursorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(informixParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(informixParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#columnItem}.
	 * @param ctx the parse tree
	 */
	void enterColumnItem(informixParser.ColumnItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#columnItem}.
	 * @param ctx the parse tree
	 */
	void exitColumnItem(informixParser.ColumnItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#dataDefinitionStatement}.
	 * @param ctx the parse tree
	 */
	void enterDataDefinitionStatement(informixParser.DataDefinitionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#dataDefinitionStatement}.
	 * @param ctx the parse tree
	 */
	void exitDataDefinitionStatement(informixParser.DataDefinitionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#dataManipulationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDataManipulationStatement(informixParser.DataManipulationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#dataManipulationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDataManipulationStatement(informixParser.DataManipulationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#sqlSelectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlSelectStatement(informixParser.SqlSelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#sqlSelectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlSelectStatement(informixParser.SqlSelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#columnsTableId}.
	 * @param ctx the parse tree
	 */
	void enterColumnsTableId(informixParser.ColumnsTableIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#columnsTableId}.
	 * @param ctx the parse tree
	 */
	void exitColumnsTableId(informixParser.ColumnsTableIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#selectList}.
	 * @param ctx the parse tree
	 */
	void enterSelectList(informixParser.SelectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#selectList}.
	 * @param ctx the parse tree
	 */
	void exitSelectList(informixParser.SelectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#headSelectStatement}.
	 * @param ctx the parse tree
	 */
	void enterHeadSelectStatement(informixParser.HeadSelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#headSelectStatement}.
	 * @param ctx the parse tree
	 */
	void exitHeadSelectStatement(informixParser.HeadSelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#tableQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTableQualifier(informixParser.TableQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#tableQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTableQualifier(informixParser.TableQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(informixParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(informixParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void enterFromTable(informixParser.FromTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void exitFromTable(informixParser.FromTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#tableExpression}.
	 * @param ctx the parse tree
	 */
	void enterTableExpression(informixParser.TableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#tableExpression}.
	 * @param ctx the parse tree
	 */
	void exitTableExpression(informixParser.TableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#fromSelectStatement}.
	 * @param ctx the parse tree
	 */
	void enterFromSelectStatement(informixParser.FromSelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#fromSelectStatement}.
	 * @param ctx the parse tree
	 */
	void exitFromSelectStatement(informixParser.FromSelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void enterAliasName(informixParser.AliasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#aliasName}.
	 * @param ctx the parse tree
	 */
	void exitAliasName(informixParser.AliasNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#mainSelectStatement}.
	 * @param ctx the parse tree
	 */
	void enterMainSelectStatement(informixParser.MainSelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#mainSelectStatement}.
	 * @param ctx the parse tree
	 */
	void exitMainSelectStatement(informixParser.MainSelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#unionSelectStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionSelectStatement(informixParser.UnionSelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#unionSelectStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionSelectStatement(informixParser.UnionSelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#simpleSelectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelectStatement(informixParser.SimpleSelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#simpleSelectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelectStatement(informixParser.SimpleSelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#whereStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhereStatement(informixParser.WhereStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#whereStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhereStatement(informixParser.WhereStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#groupByStatement}.
	 * @param ctx the parse tree
	 */
	void enterGroupByStatement(informixParser.GroupByStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#groupByStatement}.
	 * @param ctx the parse tree
	 */
	void exitGroupByStatement(informixParser.GroupByStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#havingStatement}.
	 * @param ctx the parse tree
	 */
	void enterHavingStatement(informixParser.HavingStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#havingStatement}.
	 * @param ctx the parse tree
	 */
	void exitHavingStatement(informixParser.HavingStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#orderbyColumn}.
	 * @param ctx the parse tree
	 */
	void enterOrderbyColumn(informixParser.OrderbyColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#orderbyColumn}.
	 * @param ctx the parse tree
	 */
	void exitOrderbyColumn(informixParser.OrderbyColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#orderbyStatement}.
	 * @param ctx the parse tree
	 */
	void enterOrderbyStatement(informixParser.OrderbyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#orderbyStatement}.
	 * @param ctx the parse tree
	 */
	void exitOrderbyStatement(informixParser.OrderbyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#sqlLoadStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlLoadStatement(informixParser.SqlLoadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#sqlLoadStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlLoadStatement(informixParser.SqlLoadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#sqlUnLoadStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlUnLoadStatement(informixParser.SqlUnLoadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#sqlUnLoadStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlUnLoadStatement(informixParser.SqlUnLoadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#sqlInsertStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlInsertStatement(informixParser.SqlInsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#sqlInsertStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlInsertStatement(informixParser.SqlInsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#sqlUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlUpdateStatement(informixParser.SqlUpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#sqlUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlUpdateStatement(informixParser.SqlUpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#sqlDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlDeleteStatement(informixParser.SqlDeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#sqlDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlDeleteStatement(informixParser.SqlDeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#actualParameterList}.
	 * @param ctx the parse tree
	 */
	void enterActualParameterList(informixParser.ActualParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#actualParameterList}.
	 * @param ctx the parse tree
	 */
	void exitActualParameterList(informixParser.ActualParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#dynamicManagementStatement}.
	 * @param ctx the parse tree
	 */
	void enterDynamicManagementStatement(informixParser.DynamicManagementStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#dynamicManagementStatement}.
	 * @param ctx the parse tree
	 */
	void exitDynamicManagementStatement(informixParser.DynamicManagementStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#queryOptimizationStatement}.
	 * @param ctx the parse tree
	 */
	void enterQueryOptimizationStatement(informixParser.QueryOptimizationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#queryOptimizationStatement}.
	 * @param ctx the parse tree
	 */
	void exitQueryOptimizationStatement(informixParser.QueryOptimizationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#databaseDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseDeclaration(informixParser.DatabaseDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#databaseDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseDeclaration(informixParser.DatabaseDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#clientServerStatement}.
	 * @param ctx the parse tree
	 */
	void enterClientServerStatement(informixParser.ClientServerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#clientServerStatement}.
	 * @param ctx the parse tree
	 */
	void exitClientServerStatement(informixParser.ClientServerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#dataIntegrityStatement}.
	 * @param ctx the parse tree
	 */
	void enterDataIntegrityStatement(informixParser.DataIntegrityStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#dataIntegrityStatement}.
	 * @param ctx the parse tree
	 */
	void exitDataIntegrityStatement(informixParser.DataIntegrityStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#wheneverStatement}.
	 * @param ctx the parse tree
	 */
	void enterWheneverStatement(informixParser.WheneverStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#wheneverStatement}.
	 * @param ctx the parse tree
	 */
	void exitWheneverStatement(informixParser.WheneverStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#wheneverType}.
	 * @param ctx the parse tree
	 */
	void enterWheneverType(informixParser.WheneverTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#wheneverType}.
	 * @param ctx the parse tree
	 */
	void exitWheneverType(informixParser.WheneverTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#wheneverFlow}.
	 * @param ctx the parse tree
	 */
	void enterWheneverFlow(informixParser.WheneverFlowContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#wheneverFlow}.
	 * @param ctx the parse tree
	 */
	void exitWheneverFlow(informixParser.WheneverFlowContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#reportDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReportDefinition(informixParser.ReportDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#reportDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReportDefinition(informixParser.ReportDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#outputReport}.
	 * @param ctx the parse tree
	 */
	void enterOutputReport(informixParser.OutputReportContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#outputReport}.
	 * @param ctx the parse tree
	 */
	void exitOutputReport(informixParser.OutputReportContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#formatReport}.
	 * @param ctx the parse tree
	 */
	void enterFormatReport(informixParser.FormatReportContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#formatReport}.
	 * @param ctx the parse tree
	 */
	void exitFormatReport(informixParser.FormatReportContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#eol}.
	 * @param ctx the parse tree
	 */
	void enterEol(informixParser.EolContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#eol}.
	 * @param ctx the parse tree
	 */
	void exitEol(informixParser.EolContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(informixParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(informixParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(informixParser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(informixParser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedReal(informixParser.UnsignedRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedReal(informixParser.UnsignedRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(informixParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(informixParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link informixParser#constantIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantIdentifier(informixParser.ConstantIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link informixParser#constantIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantIdentifier(informixParser.ConstantIdentifierContext ctx);
}