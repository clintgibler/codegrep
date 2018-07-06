// Generated from peoplecode/PeopleCode.g4 by ANTLR 4.7.1
package parsers.peoplecode;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PeopleCodeParser}.
 */
public interface PeopleCodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PeopleCodeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PeopleCodeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void enterStmtList(PeopleCodeParser.StmtListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#stmtList}.
	 * @param ctx the parse tree
	 */
	void exitStmtList(PeopleCodeParser.StmtListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtAppClassImport}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtAppClassImport(PeopleCodeParser.StmtAppClassImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtAppClassImport}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtAppClassImport(PeopleCodeParser.StmtAppClassImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtExternalFuncImport}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtExternalFuncImport(PeopleCodeParser.StmtExternalFuncImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtExternalFuncImport}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtExternalFuncImport(PeopleCodeParser.StmtExternalFuncImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtClassDeclaration}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtClassDeclaration(PeopleCodeParser.StmtClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtClassDeclaration}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtClassDeclaration(PeopleCodeParser.StmtClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtMethodImpl}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtMethodImpl(PeopleCodeParser.StmtMethodImplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtMethodImpl}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtMethodImpl(PeopleCodeParser.StmtMethodImplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtGetImpl}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtGetImpl(PeopleCodeParser.StmtGetImplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtGetImpl}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtGetImpl(PeopleCodeParser.StmtGetImplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtSetImpl}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtSetImpl(PeopleCodeParser.StmtSetImplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtSetImpl}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtSetImpl(PeopleCodeParser.StmtSetImplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtFuncImpl}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtFuncImpl(PeopleCodeParser.StmtFuncImplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtFuncImpl}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtFuncImpl(PeopleCodeParser.StmtFuncImplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtVarDeclaration}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtVarDeclaration(PeopleCodeParser.StmtVarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtVarDeclaration}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtVarDeclaration(PeopleCodeParser.StmtVarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtIf}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtIf(PeopleCodeParser.StmtIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtIf}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtIf(PeopleCodeParser.StmtIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtFor}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtFor(PeopleCodeParser.StmtForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtFor}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtFor(PeopleCodeParser.StmtForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtWhile}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtWhile(PeopleCodeParser.StmtWhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtWhile}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtWhile(PeopleCodeParser.StmtWhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtEvaluate}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtEvaluate(PeopleCodeParser.StmtEvaluateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtEvaluate}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtEvaluate(PeopleCodeParser.StmtEvaluateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtTryCatch}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtTryCatch(PeopleCodeParser.StmtTryCatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtTryCatch}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtTryCatch(PeopleCodeParser.StmtTryCatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtExit}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtExit(PeopleCodeParser.StmtExitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtExit}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtExit(PeopleCodeParser.StmtExitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtBreak}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtBreak(PeopleCodeParser.StmtBreakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtBreak}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtBreak(PeopleCodeParser.StmtBreakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtError}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtError(PeopleCodeParser.StmtErrorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtError}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtError(PeopleCodeParser.StmtErrorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtWarning}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtWarning(PeopleCodeParser.StmtWarningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtWarning}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtWarning(PeopleCodeParser.StmtWarningContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtReturn}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtReturn(PeopleCodeParser.StmtReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtReturn}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtReturn(PeopleCodeParser.StmtReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtThrow}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtThrow(PeopleCodeParser.StmtThrowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtThrow}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtThrow(PeopleCodeParser.StmtThrowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtAssign(PeopleCodeParser.StmtAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtAssign(PeopleCodeParser.StmtAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtExpr}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmtExpr(PeopleCodeParser.StmtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtExpr}
	 * labeled alternative in {@link PeopleCodeParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmtExpr(PeopleCodeParser.StmtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprComparison}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprComparison(PeopleCodeParser.ExprComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprComparison}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprComparison(PeopleCodeParser.ExprComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprConcat}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprConcat(PeopleCodeParser.ExprConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprConcat}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprConcat(PeopleCodeParser.ExprConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCreate}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCreate(PeopleCodeParser.ExprCreateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCreate}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCreate(PeopleCodeParser.ExprCreateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBoolean(PeopleCodeParser.ExprBooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBoolean}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBoolean(PeopleCodeParser.ExprBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(PeopleCodeParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(PeopleCodeParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(PeopleCodeParser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(PeopleCodeParser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDotAccess}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDotAccess(PeopleCodeParser.ExprDotAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDotAccess}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDotAccess(PeopleCodeParser.ExprDotAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFnOrIdxCall}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFnOrIdxCall(PeopleCodeParser.ExprFnOrIdxCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFnOrIdxCall}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFnOrIdxCall(PeopleCodeParser.ExprFnOrIdxCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParenthesized}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParenthesized(PeopleCodeParser.ExprParenthesizedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParenthesized}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParenthesized(PeopleCodeParser.ExprParenthesizedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMulDiv(PeopleCodeParser.ExprMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMulDiv}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMulDiv(PeopleCodeParser.ExprMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNegate}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNegate(PeopleCodeParser.ExprNegateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNegate}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNegate(PeopleCodeParser.ExprNegateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprArrayIndex}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprArrayIndex(PeopleCodeParser.ExprArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprArrayIndex}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprArrayIndex(PeopleCodeParser.ExprArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLiteral}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLiteral(PeopleCodeParser.ExprLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLiteral}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLiteral(PeopleCodeParser.ExprLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprEquality}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprEquality(PeopleCodeParser.ExprEqualityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprEquality}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprEquality(PeopleCodeParser.ExprEqualityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprDynamicReference}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDynamicReference(PeopleCodeParser.ExprDynamicReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprDynamicReference}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDynamicReference(PeopleCodeParser.ExprDynamicReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprId(PeopleCodeParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link PeopleCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprId(PeopleCodeParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(PeopleCodeParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(PeopleCodeParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(PeopleCodeParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(PeopleCodeParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#varDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarator(PeopleCodeParser.VarDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#varDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarator(PeopleCodeParser.VarDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#varType}.
	 * @param ctx the parse tree
	 */
	void enterVarType(PeopleCodeParser.VarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#varType}.
	 * @param ctx the parse tree
	 */
	void exitVarType(PeopleCodeParser.VarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#appClassImport}.
	 * @param ctx the parse tree
	 */
	void enterAppClassImport(PeopleCodeParser.AppClassImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#appClassImport}.
	 * @param ctx the parse tree
	 */
	void exitAppClassImport(PeopleCodeParser.AppClassImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#appPkgPath}.
	 * @param ctx the parse tree
	 */
	void enterAppPkgPath(PeopleCodeParser.AppPkgPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#appPkgPath}.
	 * @param ctx the parse tree
	 */
	void exitAppPkgPath(PeopleCodeParser.AppPkgPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#appClassPath}.
	 * @param ctx the parse tree
	 */
	void enterAppClassPath(PeopleCodeParser.AppClassPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#appClassPath}.
	 * @param ctx the parse tree
	 */
	void exitAppClassPath(PeopleCodeParser.AppClassPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#extFuncImport}.
	 * @param ctx the parse tree
	 */
	void enterExtFuncImport(PeopleCodeParser.ExtFuncImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#extFuncImport}.
	 * @param ctx the parse tree
	 */
	void exitExtFuncImport(PeopleCodeParser.ExtFuncImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#recDefnPath}.
	 * @param ctx the parse tree
	 */
	void enterRecDefnPath(PeopleCodeParser.RecDefnPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#recDefnPath}.
	 * @param ctx the parse tree
	 */
	void exitRecDefnPath(PeopleCodeParser.RecDefnPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(PeopleCodeParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(PeopleCodeParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(PeopleCodeParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(PeopleCodeParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void enterClassBlock(PeopleCodeParser.ClassBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void exitClassBlock(PeopleCodeParser.ClassBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#classBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterClassBlockStmt(PeopleCodeParser.ClassBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#classBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitClassBlockStmt(PeopleCodeParser.ClassBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(PeopleCodeParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(PeopleCodeParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(PeopleCodeParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(PeopleCodeParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(PeopleCodeParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(PeopleCodeParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#instance}.
	 * @param ctx the parse tree
	 */
	void enterInstance(PeopleCodeParser.InstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#instance}.
	 * @param ctx the parse tree
	 */
	void exitInstance(PeopleCodeParser.InstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#methodImpl}.
	 * @param ctx the parse tree
	 */
	void enterMethodImpl(PeopleCodeParser.MethodImplContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#methodImpl}.
	 * @param ctx the parse tree
	 */
	void exitMethodImpl(PeopleCodeParser.MethodImplContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#getImpl}.
	 * @param ctx the parse tree
	 */
	void enterGetImpl(PeopleCodeParser.GetImplContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#getImpl}.
	 * @param ctx the parse tree
	 */
	void exitGetImpl(PeopleCodeParser.GetImplContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#setImpl}.
	 * @param ctx the parse tree
	 */
	void enterSetImpl(PeopleCodeParser.SetImplContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#setImpl}.
	 * @param ctx the parse tree
	 */
	void exitSetImpl(PeopleCodeParser.SetImplContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#funcImpl}.
	 * @param ctx the parse tree
	 */
	void enterFuncImpl(PeopleCodeParser.FuncImplContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#funcImpl}.
	 * @param ctx the parse tree
	 */
	void exitFuncImpl(PeopleCodeParser.FuncImplContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#funcSignature}.
	 * @param ctx the parse tree
	 */
	void enterFuncSignature(PeopleCodeParser.FuncSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#funcSignature}.
	 * @param ctx the parse tree
	 */
	void exitFuncSignature(PeopleCodeParser.FuncSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#formalParamList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParamList(PeopleCodeParser.FormalParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#formalParamList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParamList(PeopleCodeParser.FormalParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(PeopleCodeParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(PeopleCodeParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#returnType}.
	 * @param ctx the parse tree
	 */
	void enterReturnType(PeopleCodeParser.ReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#returnType}.
	 * @param ctx the parse tree
	 */
	void exitReturnType(PeopleCodeParser.ReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(PeopleCodeParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(PeopleCodeParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(PeopleCodeParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#forStmt}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(PeopleCodeParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(PeopleCodeParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(PeopleCodeParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#evaluateStmt}.
	 * @param ctx the parse tree
	 */
	void enterEvaluateStmt(PeopleCodeParser.EvaluateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#evaluateStmt}.
	 * @param ctx the parse tree
	 */
	void exitEvaluateStmt(PeopleCodeParser.EvaluateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#whenBranch}.
	 * @param ctx the parse tree
	 */
	void enterWhenBranch(PeopleCodeParser.WhenBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#whenBranch}.
	 * @param ctx the parse tree
	 */
	void exitWhenBranch(PeopleCodeParser.WhenBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#whenOtherBranch}.
	 * @param ctx the parse tree
	 */
	void enterWhenOtherBranch(PeopleCodeParser.WhenOtherBranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#whenOtherBranch}.
	 * @param ctx the parse tree
	 */
	void exitWhenOtherBranch(PeopleCodeParser.WhenOtherBranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#tryCatchStmt}.
	 * @param ctx the parse tree
	 */
	void enterTryCatchStmt(PeopleCodeParser.TryCatchStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#tryCatchStmt}.
	 * @param ctx the parse tree
	 */
	void exitTryCatchStmt(PeopleCodeParser.TryCatchStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#catchSignature}.
	 * @param ctx the parse tree
	 */
	void enterCatchSignature(PeopleCodeParser.CatchSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#catchSignature}.
	 * @param ctx the parse tree
	 */
	void exitCatchSignature(PeopleCodeParser.CatchSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#createInvocation}.
	 * @param ctx the parse tree
	 */
	void enterCreateInvocation(PeopleCodeParser.CreateInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#createInvocation}.
	 * @param ctx the parse tree
	 */
	void exitCreateInvocation(PeopleCodeParser.CreateInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PeopleCodeParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PeopleCodeParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PeopleCodeParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(PeopleCodeParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PeopleCodeParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(PeopleCodeParser.IdContext ctx);
}