// Generated from oncrpc/oncrpcv2.g4 by ANTLR 4.7.1
package parsers.oncrpc;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link oncrpcv2Parser}.
 */
public interface oncrpcv2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#programDef}.
	 * @param ctx the parse tree
	 */
	void enterProgramDef(oncrpcv2Parser.ProgramDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#programDef}.
	 * @param ctx the parse tree
	 */
	void exitProgramDef(oncrpcv2Parser.ProgramDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#versionDef}.
	 * @param ctx the parse tree
	 */
	void enterVersionDef(oncrpcv2Parser.VersionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#versionDef}.
	 * @param ctx the parse tree
	 */
	void exitVersionDef(oncrpcv2Parser.VersionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#procedureDef}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDef(oncrpcv2Parser.ProcedureDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#procedureDef}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDef(oncrpcv2Parser.ProcedureDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#procReturn}.
	 * @param ctx the parse tree
	 */
	void enterProcReturn(oncrpcv2Parser.ProcReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#procReturn}.
	 * @param ctx the parse tree
	 */
	void exitProcReturn(oncrpcv2Parser.ProcReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#procFirstArg}.
	 * @param ctx the parse tree
	 */
	void enterProcFirstArg(oncrpcv2Parser.ProcFirstArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#procFirstArg}.
	 * @param ctx the parse tree
	 */
	void exitProcFirstArg(oncrpcv2Parser.ProcFirstArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#oncrpcv2Specification}.
	 * @param ctx the parse tree
	 */
	void enterOncrpcv2Specification(oncrpcv2Parser.Oncrpcv2SpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#oncrpcv2Specification}.
	 * @param ctx the parse tree
	 */
	void exitOncrpcv2Specification(oncrpcv2Parser.Oncrpcv2SpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(oncrpcv2Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(oncrpcv2Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(oncrpcv2Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(oncrpcv2Parser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(oncrpcv2Parser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(oncrpcv2Parser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(oncrpcv2Parser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(oncrpcv2Parser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#enumTypeSpec}.
	 * @param ctx the parse tree
	 */
	void enterEnumTypeSpec(oncrpcv2Parser.EnumTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#enumTypeSpec}.
	 * @param ctx the parse tree
	 */
	void exitEnumTypeSpec(oncrpcv2Parser.EnumTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(oncrpcv2Parser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(oncrpcv2Parser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#structTypeSpec}.
	 * @param ctx the parse tree
	 */
	void enterStructTypeSpec(oncrpcv2Parser.StructTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#structTypeSpec}.
	 * @param ctx the parse tree
	 */
	void exitStructTypeSpec(oncrpcv2Parser.StructTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#structBody}.
	 * @param ctx the parse tree
	 */
	void enterStructBody(oncrpcv2Parser.StructBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#structBody}.
	 * @param ctx the parse tree
	 */
	void exitStructBody(oncrpcv2Parser.StructBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#unionTypeSpec}.
	 * @param ctx the parse tree
	 */
	void enterUnionTypeSpec(oncrpcv2Parser.UnionTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#unionTypeSpec}.
	 * @param ctx the parse tree
	 */
	void exitUnionTypeSpec(oncrpcv2Parser.UnionTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#unionBody}.
	 * @param ctx the parse tree
	 */
	void enterUnionBody(oncrpcv2Parser.UnionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#unionBody}.
	 * @param ctx the parse tree
	 */
	void exitUnionBody(oncrpcv2Parser.UnionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#caseSpec}.
	 * @param ctx the parse tree
	 */
	void enterCaseSpec(oncrpcv2Parser.CaseSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#caseSpec}.
	 * @param ctx the parse tree
	 */
	void exitCaseSpec(oncrpcv2Parser.CaseSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#constantDef}.
	 * @param ctx the parse tree
	 */
	void enterConstantDef(oncrpcv2Parser.ConstantDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#constantDef}.
	 * @param ctx the parse tree
	 */
	void exitConstantDef(oncrpcv2Parser.ConstantDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#typeDef}.
	 * @param ctx the parse tree
	 */
	void enterTypeDef(oncrpcv2Parser.TypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#typeDef}.
	 * @param ctx the parse tree
	 */
	void exitTypeDef(oncrpcv2Parser.TypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(oncrpcv2Parser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(oncrpcv2Parser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link oncrpcv2Parser#xdrSpecification}.
	 * @param ctx the parse tree
	 */
	void enterXdrSpecification(oncrpcv2Parser.XdrSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link oncrpcv2Parser#xdrSpecification}.
	 * @param ctx the parse tree
	 */
	void exitXdrSpecification(oncrpcv2Parser.XdrSpecificationContext ctx);
}