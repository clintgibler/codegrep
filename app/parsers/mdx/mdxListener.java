// Generated from mdx/mdx.g4 by ANTLR 4.7.1
package parsers.mdx;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mdxParser}.
 */
public interface mdxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mdxParser#mdx_statement}.
	 * @param ctx the parse tree
	 */
	void enterMdx_statement(mdxParser.Mdx_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#mdx_statement}.
	 * @param ctx the parse tree
	 */
	void exitMdx_statement(mdxParser.Mdx_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(mdxParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(mdxParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#formula_specification}.
	 * @param ctx the parse tree
	 */
	void enterFormula_specification(mdxParser.Formula_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#formula_specification}.
	 * @param ctx the parse tree
	 */
	void exitFormula_specification(mdxParser.Formula_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#single_formula_specification}.
	 * @param ctx the parse tree
	 */
	void enterSingle_formula_specification(mdxParser.Single_formula_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#single_formula_specification}.
	 * @param ctx the parse tree
	 */
	void exitSingle_formula_specification(mdxParser.Single_formula_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#set_specification}.
	 * @param ctx the parse tree
	 */
	void enterSet_specification(mdxParser.Set_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#set_specification}.
	 * @param ctx the parse tree
	 */
	void exitSet_specification(mdxParser.Set_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#member_specification}.
	 * @param ctx the parse tree
	 */
	void enterMember_specification(mdxParser.Member_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#member_specification}.
	 * @param ctx the parse tree
	 */
	void exitMember_specification(mdxParser.Member_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#axis_specification_list}.
	 * @param ctx the parse tree
	 */
	void enterAxis_specification_list(mdxParser.Axis_specification_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#axis_specification_list}.
	 * @param ctx the parse tree
	 */
	void exitAxis_specification_list(mdxParser.Axis_specification_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#member_property_def_list}.
	 * @param ctx the parse tree
	 */
	void enterMember_property_def_list(mdxParser.Member_property_def_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#member_property_def_list}.
	 * @param ctx the parse tree
	 */
	void exitMember_property_def_list(mdxParser.Member_property_def_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#member_name}.
	 * @param ctx the parse tree
	 */
	void enterMember_name(mdxParser.Member_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#member_name}.
	 * @param ctx the parse tree
	 */
	void exitMember_name(mdxParser.Member_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#member_property_definition}.
	 * @param ctx the parse tree
	 */
	void enterMember_property_definition(mdxParser.Member_property_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#member_property_definition}.
	 * @param ctx the parse tree
	 */
	void exitMember_property_definition(mdxParser.Member_property_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#set_name}.
	 * @param ctx the parse tree
	 */
	void enterSet_name(mdxParser.Set_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#set_name}.
	 * @param ctx the parse tree
	 */
	void exitSet_name(mdxParser.Set_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#compound_id}.
	 * @param ctx the parse tree
	 */
	void enterCompound_id(mdxParser.Compound_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#compound_id}.
	 * @param ctx the parse tree
	 */
	void exitCompound_id(mdxParser.Compound_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#axis_specification}.
	 * @param ctx the parse tree
	 */
	void enterAxis_specification(mdxParser.Axis_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#axis_specification}.
	 * @param ctx the parse tree
	 */
	void exitAxis_specification(mdxParser.Axis_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#axis_name}.
	 * @param ctx the parse tree
	 */
	void enterAxis_name(mdxParser.Axis_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#axis_name}.
	 * @param ctx the parse tree
	 */
	void exitAxis_name(mdxParser.Axis_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#dim_props}.
	 * @param ctx the parse tree
	 */
	void enterDim_props(mdxParser.Dim_propsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#dim_props}.
	 * @param ctx the parse tree
	 */
	void exitDim_props(mdxParser.Dim_propsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#property_list}.
	 * @param ctx the parse tree
	 */
	void enterProperty_list(mdxParser.Property_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#property_list}.
	 * @param ctx the parse tree
	 */
	void exitProperty_list(mdxParser.Property_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(mdxParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(mdxParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#cube_specification}.
	 * @param ctx the parse tree
	 */
	void enterCube_specification(mdxParser.Cube_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#cube_specification}.
	 * @param ctx the parse tree
	 */
	void exitCube_specification(mdxParser.Cube_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#cube_name}.
	 * @param ctx the parse tree
	 */
	void enterCube_name(mdxParser.Cube_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#cube_name}.
	 * @param ctx the parse tree
	 */
	void exitCube_name(mdxParser.Cube_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#slicer_specification}.
	 * @param ctx the parse tree
	 */
	void enterSlicer_specification(mdxParser.Slicer_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#slicer_specification}.
	 * @param ctx the parse tree
	 */
	void exitSlicer_specification(mdxParser.Slicer_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#cell_props}.
	 * @param ctx the parse tree
	 */
	void enterCell_props(mdxParser.Cell_propsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#cell_props}.
	 * @param ctx the parse tree
	 */
	void exitCell_props(mdxParser.Cell_propsContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#cell_property_list}.
	 * @param ctx the parse tree
	 */
	void enterCell_property_list(mdxParser.Cell_property_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#cell_property_list}.
	 * @param ctx the parse tree
	 */
	void exitCell_property_list(mdxParser.Cell_property_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#cell_property}.
	 * @param ctx the parse tree
	 */
	void enterCell_property(mdxParser.Cell_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#cell_property}.
	 * @param ctx the parse tree
	 */
	void exitCell_property(mdxParser.Cell_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#mandatory_cell_property}.
	 * @param ctx the parse tree
	 */
	void enterMandatory_cell_property(mdxParser.Mandatory_cell_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#mandatory_cell_property}.
	 * @param ctx the parse tree
	 */
	void exitMandatory_cell_property(mdxParser.Mandatory_cell_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#provider_specific_cell_property}.
	 * @param ctx the parse tree
	 */
	void enterProvider_specific_cell_property(mdxParser.Provider_specific_cell_propertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#provider_specific_cell_property}.
	 * @param ctx the parse tree
	 */
	void exitProvider_specific_cell_property(mdxParser.Provider_specific_cell_propertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(mdxParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(mdxParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#value_expression}.
	 * @param ctx the parse tree
	 */
	void enterValue_expression(mdxParser.Value_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#value_expression}.
	 * @param ctx the parse tree
	 */
	void exitValue_expression(mdxParser.Value_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#value_xor_expression}.
	 * @param ctx the parse tree
	 */
	void enterValue_xor_expression(mdxParser.Value_xor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#value_xor_expression}.
	 * @param ctx the parse tree
	 */
	void exitValue_xor_expression(mdxParser.Value_xor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#value_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterValue_or_expression(mdxParser.Value_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#value_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitValue_or_expression(mdxParser.Value_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#term5}.
	 * @param ctx the parse tree
	 */
	void enterTerm5(mdxParser.Term5Context ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#term5}.
	 * @param ctx the parse tree
	 */
	void exitTerm5(mdxParser.Term5Context ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#term4}.
	 * @param ctx the parse tree
	 */
	void enterTerm4(mdxParser.Term4Context ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#term4}.
	 * @param ctx the parse tree
	 */
	void exitTerm4(mdxParser.Term4Context ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#term3}.
	 * @param ctx the parse tree
	 */
	void enterTerm3(mdxParser.Term3Context ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#term3}.
	 * @param ctx the parse tree
	 */
	void exitTerm3(mdxParser.Term3Context ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#term2}.
	 * @param ctx the parse tree
	 */
	void enterTerm2(mdxParser.Term2Context ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#term2}.
	 * @param ctx the parse tree
	 */
	void exitTerm2(mdxParser.Term2Context ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(mdxParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(mdxParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(mdxParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(mdxParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(mdxParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(mdxParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#value_expression_primary}.
	 * @param ctx the parse tree
	 */
	void enterValue_expression_primary(mdxParser.Value_expression_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#value_expression_primary}.
	 * @param ctx the parse tree
	 */
	void exitValue_expression_primary(mdxParser.Value_expression_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#value_expression_primary0}.
	 * @param ctx the parse tree
	 */
	void enterValue_expression_primary0(mdxParser.Value_expression_primary0Context ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#value_expression_primary0}.
	 * @param ctx the parse tree
	 */
	void exitValue_expression_primary0(mdxParser.Value_expression_primary0Context ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#exp_list}.
	 * @param ctx the parse tree
	 */
	void enterExp_list(mdxParser.Exp_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#exp_list}.
	 * @param ctx the parse tree
	 */
	void exitExp_list(mdxParser.Exp_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(mdxParser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(mdxParser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#when_list}.
	 * @param ctx the parse tree
	 */
	void enterWhen_list(mdxParser.When_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#when_list}.
	 * @param ctx the parse tree
	 */
	void exitWhen_list(mdxParser.When_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#when_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhen_clause(mdxParser.When_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#when_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhen_clause(mdxParser.When_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(mdxParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(mdxParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(mdxParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(mdxParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#unquoted_identifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquoted_identifier(mdxParser.Unquoted_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#unquoted_identifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquoted_identifier(mdxParser.Unquoted_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#amp_quoted_identifier}.
	 * @param ctx the parse tree
	 */
	void enterAmp_quoted_identifier(mdxParser.Amp_quoted_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#amp_quoted_identifier}.
	 * @param ctx the parse tree
	 */
	void exitAmp_quoted_identifier(mdxParser.Amp_quoted_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#quoted_identifier}.
	 * @param ctx the parse tree
	 */
	void enterQuoted_identifier(mdxParser.Quoted_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#quoted_identifier}.
	 * @param ctx the parse tree
	 */
	void exitQuoted_identifier(mdxParser.Quoted_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link mdxParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(mdxParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link mdxParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(mdxParser.KeywordContext ctx);
}