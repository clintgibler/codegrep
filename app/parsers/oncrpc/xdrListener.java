// Generated from oncrpc/xdr.g4 by ANTLR 4.7.1
package parsers.oncrpc;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link xdrParser}.
 */
public interface xdrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link xdrParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(xdrParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link xdrParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(xdrParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link xdrParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(xdrParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link xdrParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(xdrParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link xdrParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(xdrParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link xdrParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(xdrParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link xdrParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(xdrParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link xdrParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(xdrParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link xdrParser#enumTypeSpec}.
	 * @param ctx the parse tree
	 */
	void enterEnumTypeSpec(xdrParser.EnumTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link xdrParser#enumTypeSpec}.
	 * @param ctx the parse tree
	 */
	void exitEnumTypeSpec(xdrParser.EnumTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link xdrParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(xdrParser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link xdrParser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(xdrParser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link xdrParser#structTypeSpec}.
	 * @param ctx the parse tree
	 */
	void enterStructTypeSpec(xdrParser.StructTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link xdrParser#structTypeSpec}.
	 * @param ctx the parse tree
	 */
	void exitStructTypeSpec(xdrParser.StructTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link xdrParser#structBody}.
	 * @param ctx the parse tree
	 */
	void enterStructBody(xdrParser.StructBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link xdrParser#structBody}.
	 * @param ctx the parse tree
	 */
	void exitStructBody(xdrParser.StructBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link xdrParser#unionTypeSpec}.
	 * @param ctx the parse tree
	 */
	void enterUnionTypeSpec(xdrParser.UnionTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link xdrParser#unionTypeSpec}.
	 * @param ctx the parse tree
	 */
	void exitUnionTypeSpec(xdrParser.UnionTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link xdrParser#unionBody}.
	 * @param ctx the parse tree
	 */
	void enterUnionBody(xdrParser.UnionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link xdrParser#unionBody}.
	 * @param ctx the parse tree
	 */
	void exitUnionBody(xdrParser.UnionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link xdrParser#caseSpec}.
	 * @param ctx the parse tree
	 */
	void enterCaseSpec(xdrParser.CaseSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link xdrParser#caseSpec}.
	 * @param ctx the parse tree
	 */
	void exitCaseSpec(xdrParser.CaseSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link xdrParser#constantDef}.
	 * @param ctx the parse tree
	 */
	void enterConstantDef(xdrParser.ConstantDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link xdrParser#constantDef}.
	 * @param ctx the parse tree
	 */
	void exitConstantDef(xdrParser.ConstantDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link xdrParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void enterTypeDef(xdrParser.TypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link xdrParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void exitTypeDef(xdrParser.TypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link xdrParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(xdrParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link xdrParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(xdrParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link xdrParser#xdrSpecification}.
	 * @param ctx the parse tree
	 */
	void enterXdrSpecification(xdrParser.XdrSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link xdrParser#xdrSpecification}.
	 * @param ctx the parse tree
	 */
	void exitXdrSpecification(xdrParser.XdrSpecificationContext ctx);
}