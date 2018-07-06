// Generated from jpa/JPA.g4 by ANTLR 4.7.1
package parsers.jpa;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JPAParser}.
 */
public interface JPAListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JPAParser#ql_statement}.
	 * @param ctx the parse tree
	 */
	void enterQl_statement(JPAParser.Ql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#ql_statement}.
	 * @param ctx the parse tree
	 */
	void exitQl_statement(JPAParser.Ql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(JPAParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(JPAParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(JPAParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(JPAParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(JPAParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(JPAParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(JPAParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(JPAParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#identification_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterIdentification_variable_declaration(JPAParser.Identification_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#identification_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitIdentification_variable_declaration(JPAParser.Identification_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#range_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRange_variable_declaration(JPAParser.Range_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#range_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRange_variable_declaration(JPAParser.Range_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#join}.
	 * @param ctx the parse tree
	 */
	void enterJoin(JPAParser.JoinContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#join}.
	 * @param ctx the parse tree
	 */
	void exitJoin(JPAParser.JoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#fetch_join}.
	 * @param ctx the parse tree
	 */
	void enterFetch_join(JPAParser.Fetch_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#fetch_join}.
	 * @param ctx the parse tree
	 */
	void exitFetch_join(JPAParser.Fetch_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#join_spec}.
	 * @param ctx the parse tree
	 */
	void enterJoin_spec(JPAParser.Join_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#join_spec}.
	 * @param ctx the parse tree
	 */
	void exitJoin_spec(JPAParser.Join_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#join_association_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterJoin_association_path_expression(JPAParser.Join_association_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#join_association_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitJoin_association_path_expression(JPAParser.Join_association_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#join_collection_valued_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterJoin_collection_valued_path_expression(JPAParser.Join_collection_valued_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#join_collection_valued_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitJoin_collection_valued_path_expression(JPAParser.Join_collection_valued_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#join_single_valued_association_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterJoin_single_valued_association_path_expression(JPAParser.Join_single_valued_association_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#join_single_valued_association_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitJoin_single_valued_association_path_expression(JPAParser.Join_single_valued_association_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#collection_member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCollection_member_declaration(JPAParser.Collection_member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#collection_member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCollection_member_declaration(JPAParser.Collection_member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#single_valued_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterSingle_valued_path_expression(JPAParser.Single_valued_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#single_valued_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitSingle_valued_path_expression(JPAParser.Single_valued_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#state_field_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterState_field_path_expression(JPAParser.State_field_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#state_field_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitState_field_path_expression(JPAParser.State_field_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#single_valued_association_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterSingle_valued_association_path_expression(JPAParser.Single_valued_association_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#single_valued_association_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitSingle_valued_association_path_expression(JPAParser.Single_valued_association_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#collection_valued_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterCollection_valued_path_expression(JPAParser.Collection_valued_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#collection_valued_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitCollection_valued_path_expression(JPAParser.Collection_valued_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#state_field}.
	 * @param ctx the parse tree
	 */
	void enterState_field(JPAParser.State_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#state_field}.
	 * @param ctx the parse tree
	 */
	void exitState_field(JPAParser.State_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#update_clause}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_clause(JPAParser.Update_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#update_clause}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_clause(JPAParser.Update_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#update_item}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_item(JPAParser.Update_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#update_item}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_item(JPAParser.Update_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#new_value}.
	 * @param ctx the parse tree
	 */
	void enterNew_value(JPAParser.New_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#new_value}.
	 * @param ctx the parse tree
	 */
	void exitNew_value(JPAParser.New_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#delete_clause}.
	 * @param ctx the parse tree
	 */
	void enterDelete_clause(JPAParser.Delete_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#delete_clause}.
	 * @param ctx the parse tree
	 */
	void exitDelete_clause(JPAParser.Delete_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(JPAParser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(JPAParser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#select_expression}.
	 * @param ctx the parse tree
	 */
	void enterSelect_expression(JPAParser.Select_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#select_expression}.
	 * @param ctx the parse tree
	 */
	void exitSelect_expression(JPAParser.Select_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#constructor_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_expression(JPAParser.Constructor_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#constructor_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_expression(JPAParser.Constructor_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#constructor_item}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_item(JPAParser.Constructor_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#constructor_item}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_item(JPAParser.Constructor_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#aggregate_expression}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_expression(JPAParser.Aggregate_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#aggregate_expression}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_expression(JPAParser.Aggregate_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(JPAParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(JPAParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroupby_clause(JPAParser.Groupby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroupby_clause(JPAParser.Groupby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#groupby_item}.
	 * @param ctx the parse tree
	 */
	void enterGroupby_item(JPAParser.Groupby_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#groupby_item}.
	 * @param ctx the parse tree
	 */
	void exitGroupby_item(JPAParser.Groupby_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(JPAParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(JPAParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_clause(JPAParser.Orderby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_clause(JPAParser.Orderby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#orderby_item}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_item(JPAParser.Orderby_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#orderby_item}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_item(JPAParser.Orderby_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(JPAParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(JPAParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#subquery_from_clause}.
	 * @param ctx the parse tree
	 */
	void enterSubquery_from_clause(JPAParser.Subquery_from_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#subquery_from_clause}.
	 * @param ctx the parse tree
	 */
	void exitSubquery_from_clause(JPAParser.Subquery_from_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#subselect_identification_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSubselect_identification_variable_declaration(JPAParser.Subselect_identification_variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#subselect_identification_variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSubselect_identification_variable_declaration(JPAParser.Subselect_identification_variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#association_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssociation_path_expression(JPAParser.Association_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#association_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssociation_path_expression(JPAParser.Association_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#simple_select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_clause(JPAParser.Simple_select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#simple_select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_clause(JPAParser.Simple_select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#simple_select_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_expression(JPAParser.Simple_select_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#simple_select_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_expression(JPAParser.Simple_select_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_expression(JPAParser.Conditional_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#conditional_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_expression(JPAParser.Conditional_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#conditional_term}.
	 * @param ctx the parse tree
	 */
	void enterConditional_term(JPAParser.Conditional_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#conditional_term}.
	 * @param ctx the parse tree
	 */
	void exitConditional_term(JPAParser.Conditional_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#conditional_factor}.
	 * @param ctx the parse tree
	 */
	void enterConditional_factor(JPAParser.Conditional_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#conditional_factor}.
	 * @param ctx the parse tree
	 */
	void exitConditional_factor(JPAParser.Conditional_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#conditional_primary}.
	 * @param ctx the parse tree
	 */
	void enterConditional_primary(JPAParser.Conditional_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#conditional_primary}.
	 * @param ctx the parse tree
	 */
	void exitConditional_primary(JPAParser.Conditional_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#simple_cond_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_cond_expression(JPAParser.Simple_cond_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#simple_cond_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_cond_expression(JPAParser.Simple_cond_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#between_expression}.
	 * @param ctx the parse tree
	 */
	void enterBetween_expression(JPAParser.Between_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#between_expression}.
	 * @param ctx the parse tree
	 */
	void exitBetween_expression(JPAParser.Between_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#in_expression}.
	 * @param ctx the parse tree
	 */
	void enterIn_expression(JPAParser.In_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#in_expression}.
	 * @param ctx the parse tree
	 */
	void exitIn_expression(JPAParser.In_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#in_item}.
	 * @param ctx the parse tree
	 */
	void enterIn_item(JPAParser.In_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#in_item}.
	 * @param ctx the parse tree
	 */
	void exitIn_item(JPAParser.In_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#like_expression}.
	 * @param ctx the parse tree
	 */
	void enterLike_expression(JPAParser.Like_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#like_expression}.
	 * @param ctx the parse tree
	 */
	void exitLike_expression(JPAParser.Like_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#null_comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterNull_comparison_expression(JPAParser.Null_comparison_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#null_comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitNull_comparison_expression(JPAParser.Null_comparison_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#empty_collection_comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_collection_comparison_expression(JPAParser.Empty_collection_comparison_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#empty_collection_comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_collection_comparison_expression(JPAParser.Empty_collection_comparison_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#collection_member_expression}.
	 * @param ctx the parse tree
	 */
	void enterCollection_member_expression(JPAParser.Collection_member_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#collection_member_expression}.
	 * @param ctx the parse tree
	 */
	void exitCollection_member_expression(JPAParser.Collection_member_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#exists_expression}.
	 * @param ctx the parse tree
	 */
	void enterExists_expression(JPAParser.Exists_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#exists_expression}.
	 * @param ctx the parse tree
	 */
	void exitExists_expression(JPAParser.Exists_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#all_or_any_expression}.
	 * @param ctx the parse tree
	 */
	void enterAll_or_any_expression(JPAParser.All_or_any_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#all_or_any_expression}.
	 * @param ctx the parse tree
	 */
	void exitAll_or_any_expression(JPAParser.All_or_any_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void enterComparison_expression(JPAParser.Comparison_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#comparison_expression}.
	 * @param ctx the parse tree
	 */
	void exitComparison_expression(JPAParser.Comparison_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(JPAParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(JPAParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_expression(JPAParser.Arithmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_expression(JPAParser.Arithmetic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#simple_arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_arithmetic_expression(JPAParser.Simple_arithmetic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#simple_arithmetic_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_arithmetic_expression(JPAParser.Simple_arithmetic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#arithmetic_term}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_term(JPAParser.Arithmetic_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#arithmetic_term}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_term(JPAParser.Arithmetic_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#arithmetic_factor}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_factor(JPAParser.Arithmetic_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#arithmetic_factor}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_factor(JPAParser.Arithmetic_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#arithmetic_primary}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_primary(JPAParser.Arithmetic_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#arithmetic_primary}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_primary(JPAParser.Arithmetic_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void enterString_expression(JPAParser.String_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#string_expression}.
	 * @param ctx the parse tree
	 */
	void exitString_expression(JPAParser.String_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#string_primary}.
	 * @param ctx the parse tree
	 */
	void enterString_primary(JPAParser.String_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#string_primary}.
	 * @param ctx the parse tree
	 */
	void exitString_primary(JPAParser.String_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_expression(JPAParser.Datetime_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#datetime_expression}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_expression(JPAParser.Datetime_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#datetime_primary}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_primary(JPAParser.Datetime_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#datetime_primary}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_primary(JPAParser.Datetime_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_expression(JPAParser.Boolean_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_expression(JPAParser.Boolean_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#boolean_primary}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_primary(JPAParser.Boolean_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#boolean_primary}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_primary(JPAParser.Boolean_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#enum_expression}.
	 * @param ctx the parse tree
	 */
	void enterEnum_expression(JPAParser.Enum_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#enum_expression}.
	 * @param ctx the parse tree
	 */
	void exitEnum_expression(JPAParser.Enum_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#enum_primary}.
	 * @param ctx the parse tree
	 */
	void enterEnum_primary(JPAParser.Enum_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#enum_primary}.
	 * @param ctx the parse tree
	 */
	void exitEnum_primary(JPAParser.Enum_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#entity_expression}.
	 * @param ctx the parse tree
	 */
	void enterEntity_expression(JPAParser.Entity_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#entity_expression}.
	 * @param ctx the parse tree
	 */
	void exitEntity_expression(JPAParser.Entity_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#simple_entity_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_entity_expression(JPAParser.Simple_entity_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#simple_entity_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_entity_expression(JPAParser.Simple_entity_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#functions_returning_numerics}.
	 * @param ctx the parse tree
	 */
	void enterFunctions_returning_numerics(JPAParser.Functions_returning_numericsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#functions_returning_numerics}.
	 * @param ctx the parse tree
	 */
	void exitFunctions_returning_numerics(JPAParser.Functions_returning_numericsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#functions_returning_datetime}.
	 * @param ctx the parse tree
	 */
	void enterFunctions_returning_datetime(JPAParser.Functions_returning_datetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#functions_returning_datetime}.
	 * @param ctx the parse tree
	 */
	void exitFunctions_returning_datetime(JPAParser.Functions_returning_datetimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#functions_returning_strings}.
	 * @param ctx the parse tree
	 */
	void enterFunctions_returning_strings(JPAParser.Functions_returning_stringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#functions_returning_strings}.
	 * @param ctx the parse tree
	 */
	void exitFunctions_returning_strings(JPAParser.Functions_returning_stringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#trim_specification}.
	 * @param ctx the parse tree
	 */
	void enterTrim_specification(JPAParser.Trim_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#trim_specification}.
	 * @param ctx the parse tree
	 */
	void exitTrim_specification(JPAParser.Trim_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(JPAParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(JPAParser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#pattern_value}.
	 * @param ctx the parse tree
	 */
	void enterPattern_value(JPAParser.Pattern_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#pattern_value}.
	 * @param ctx the parse tree
	 */
	void exitPattern_value(JPAParser.Pattern_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#input_parameter}.
	 * @param ctx the parse tree
	 */
	void enterInput_parameter(JPAParser.Input_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#input_parameter}.
	 * @param ctx the parse tree
	 */
	void exitInput_parameter(JPAParser.Input_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(JPAParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(JPAParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#constructor_name}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_name(JPAParser.Constructor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#constructor_name}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_name(JPAParser.Constructor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#enum_literal}.
	 * @param ctx the parse tree
	 */
	void enterEnum_literal(JPAParser.Enum_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#enum_literal}.
	 * @param ctx the parse tree
	 */
	void exitEnum_literal(JPAParser.Enum_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(JPAParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(JPAParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#simple_state_field}.
	 * @param ctx the parse tree
	 */
	void enterSimple_state_field(JPAParser.Simple_state_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#simple_state_field}.
	 * @param ctx the parse tree
	 */
	void exitSimple_state_field(JPAParser.Simple_state_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#embedded_class_state_field}.
	 * @param ctx the parse tree
	 */
	void enterEmbedded_class_state_field(JPAParser.Embedded_class_state_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#embedded_class_state_field}.
	 * @param ctx the parse tree
	 */
	void exitEmbedded_class_state_field(JPAParser.Embedded_class_state_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#single_valued_association_field}.
	 * @param ctx the parse tree
	 */
	void enterSingle_valued_association_field(JPAParser.Single_valued_association_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#single_valued_association_field}.
	 * @param ctx the parse tree
	 */
	void exitSingle_valued_association_field(JPAParser.Single_valued_association_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#collection_valued_association_field}.
	 * @param ctx the parse tree
	 */
	void enterCollection_valued_association_field(JPAParser.Collection_valued_association_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#collection_valued_association_field}.
	 * @param ctx the parse tree
	 */
	void exitCollection_valued_association_field(JPAParser.Collection_valued_association_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link JPAParser#abstract_schema_name}.
	 * @param ctx the parse tree
	 */
	void enterAbstract_schema_name(JPAParser.Abstract_schema_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JPAParser#abstract_schema_name}.
	 * @param ctx the parse tree
	 */
	void exitAbstract_schema_name(JPAParser.Abstract_schema_nameContext ctx);
}