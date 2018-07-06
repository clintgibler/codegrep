// Generated from z/ZOperatorParser.g4 by ANTLR 4.7.1
package parsers.z;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ZOperatorParser}.
 */
public interface ZOperatorParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ZOperatorParser#specification}.
	 * @param ctx the parse tree
	 */
	void enterSpecification(ZOperatorParser.SpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZOperatorParser#specification}.
	 * @param ctx the parse tree
	 */
	void exitSpecification(ZOperatorParser.SpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InheritingSection}
	 * labeled alternative in {@link ZOperatorParser#section}.
	 * @param ctx the parse tree
	 */
	void enterInheritingSection(ZOperatorParser.InheritingSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InheritingSection}
	 * labeled alternative in {@link ZOperatorParser#section}.
	 * @param ctx the parse tree
	 */
	void exitInheritingSection(ZOperatorParser.InheritingSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BaseSection}
	 * labeled alternative in {@link ZOperatorParser#section}.
	 * @param ctx the parse tree
	 */
	void enterBaseSection(ZOperatorParser.BaseSectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BaseSection}
	 * labeled alternative in {@link ZOperatorParser#section}.
	 * @param ctx the parse tree
	 */
	void exitBaseSection(ZOperatorParser.BaseSectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperatorTemplateParagraph}
	 * labeled alternative in {@link ZOperatorParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterOperatorTemplateParagraph(ZOperatorParser.OperatorTemplateParagraphContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperatorTemplateParagraph}
	 * labeled alternative in {@link ZOperatorParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitOperatorTemplateParagraph(ZOperatorParser.OperatorTemplateParagraphContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AxiomaticDescriptionParagraph}
	 * labeled alternative in {@link ZOperatorParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterAxiomaticDescriptionParagraph(ZOperatorParser.AxiomaticDescriptionParagraphContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AxiomaticDescriptionParagraph}
	 * labeled alternative in {@link ZOperatorParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitAxiomaticDescriptionParagraph(ZOperatorParser.AxiomaticDescriptionParagraphContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaDefinitionParagraph}
	 * labeled alternative in {@link ZOperatorParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterSchemaDefinitionParagraph(ZOperatorParser.SchemaDefinitionParagraphContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaDefinitionParagraph}
	 * labeled alternative in {@link ZOperatorParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitSchemaDefinitionParagraph(ZOperatorParser.SchemaDefinitionParagraphContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NONOperatorTemplateParagraph}
	 * labeled alternative in {@link ZOperatorParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterNONOperatorTemplateParagraph(ZOperatorParser.NONOperatorTemplateParagraphContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NONOperatorTemplateParagraph}
	 * labeled alternative in {@link ZOperatorParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitNONOperatorTemplateParagraph(ZOperatorParser.NONOperatorTemplateParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZOperatorParser#formals}.
	 * @param ctx the parse tree
	 */
	void enterFormals(ZOperatorParser.FormalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZOperatorParser#formals}.
	 * @param ctx the parse tree
	 */
	void exitFormals(ZOperatorParser.FormalsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RelationOperatorTemplate}
	 * labeled alternative in {@link ZOperatorParser#operatorTemplate}.
	 * @param ctx the parse tree
	 */
	void enterRelationOperatorTemplate(ZOperatorParser.RelationOperatorTemplateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RelationOperatorTemplate}
	 * labeled alternative in {@link ZOperatorParser#operatorTemplate}.
	 * @param ctx the parse tree
	 */
	void exitRelationOperatorTemplate(ZOperatorParser.RelationOperatorTemplateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionOperatorTemplate}
	 * labeled alternative in {@link ZOperatorParser#operatorTemplate}.
	 * @param ctx the parse tree
	 */
	void enterFunctionOperatorTemplate(ZOperatorParser.FunctionOperatorTemplateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionOperatorTemplate}
	 * labeled alternative in {@link ZOperatorParser#operatorTemplate}.
	 * @param ctx the parse tree
	 */
	void exitFunctionOperatorTemplate(ZOperatorParser.FunctionOperatorTemplateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GenericOperatorTemplate}
	 * labeled alternative in {@link ZOperatorParser#operatorTemplate}.
	 * @param ctx the parse tree
	 */
	void enterGenericOperatorTemplate(ZOperatorParser.GenericOperatorTemplateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GenericOperatorTemplate}
	 * labeled alternative in {@link ZOperatorParser#operatorTemplate}.
	 * @param ctx the parse tree
	 */
	void exitGenericOperatorTemplate(ZOperatorParser.GenericOperatorTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZOperatorParser#categoryTemplate}.
	 * @param ctx the parse tree
	 */
	void enterCategoryTemplate(ZOperatorParser.CategoryTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZOperatorParser#categoryTemplate}.
	 * @param ctx the parse tree
	 */
	void exitCategoryTemplate(ZOperatorParser.CategoryTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZOperatorParser#prec}.
	 * @param ctx the parse tree
	 */
	void enterPrec(ZOperatorParser.PrecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZOperatorParser#prec}.
	 * @param ctx the parse tree
	 */
	void exitPrec(ZOperatorParser.PrecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZOperatorParser#assoc}.
	 * @param ctx the parse tree
	 */
	void enterAssoc(ZOperatorParser.AssocContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZOperatorParser#assoc}.
	 * @param ctx the parse tree
	 */
	void exitAssoc(ZOperatorParser.AssocContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZOperatorParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(ZOperatorParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZOperatorParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(ZOperatorParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZOperatorParser#prefixTemplate}.
	 * @param ctx the parse tree
	 */
	void enterPrefixTemplate(ZOperatorParser.PrefixTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZOperatorParser#prefixTemplate}.
	 * @param ctx the parse tree
	 */
	void exitPrefixTemplate(ZOperatorParser.PrefixTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZOperatorParser#postfixTemplate}.
	 * @param ctx the parse tree
	 */
	void enterPostfixTemplate(ZOperatorParser.PostfixTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZOperatorParser#postfixTemplate}.
	 * @param ctx the parse tree
	 */
	void exitPostfixTemplate(ZOperatorParser.PostfixTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZOperatorParser#infixTemplate}.
	 * @param ctx the parse tree
	 */
	void enterInfixTemplate(ZOperatorParser.InfixTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZOperatorParser#infixTemplate}.
	 * @param ctx the parse tree
	 */
	void exitInfixTemplate(ZOperatorParser.InfixTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZOperatorParser#nofixTemplate}.
	 * @param ctx the parse tree
	 */
	void enterNofixTemplate(ZOperatorParser.NofixTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZOperatorParser#nofixTemplate}.
	 * @param ctx the parse tree
	 */
	void exitNofixTemplate(ZOperatorParser.NofixTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZOperatorParser#optArgName}.
	 * @param ctx the parse tree
	 */
	void enterOptArgName(ZOperatorParser.OptArgNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZOperatorParser#optArgName}.
	 * @param ctx the parse tree
	 */
	void exitOptArgName(ZOperatorParser.OptArgNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZOperatorParser#optListName}.
	 * @param ctx the parse tree
	 */
	void enterOptListName(ZOperatorParser.OptListNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZOperatorParser#optListName}.
	 * @param ctx the parse tree
	 */
	void exitOptListName(ZOperatorParser.OptListNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZOperatorParser#argName}.
	 * @param ctx the parse tree
	 */
	void enterArgName(ZOperatorParser.ArgNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZOperatorParser#argName}.
	 * @param ctx the parse tree
	 */
	void exitArgName(ZOperatorParser.ArgNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZOperatorParser#listName}.
	 * @param ctx the parse tree
	 */
	void enterListName(ZOperatorParser.ListNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZOperatorParser#listName}.
	 * @param ctx the parse tree
	 */
	void exitListName(ZOperatorParser.ListNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZOperatorParser#prefixName}.
	 * @param ctx the parse tree
	 */
	void enterPrefixName(ZOperatorParser.PrefixNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZOperatorParser#prefixName}.
	 * @param ctx the parse tree
	 */
	void exitPrefixName(ZOperatorParser.PrefixNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZOperatorParser#postfixName}.
	 * @param ctx the parse tree
	 */
	void enterPostfixName(ZOperatorParser.PostfixNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZOperatorParser#postfixName}.
	 * @param ctx the parse tree
	 */
	void exitPostfixName(ZOperatorParser.PostfixNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZOperatorParser#infixName}.
	 * @param ctx the parse tree
	 */
	void enterInfixName(ZOperatorParser.InfixNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZOperatorParser#infixName}.
	 * @param ctx the parse tree
	 */
	void exitInfixName(ZOperatorParser.InfixNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZOperatorParser#nofixName}.
	 * @param ctx the parse tree
	 */
	void enterNofixName(ZOperatorParser.NofixNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZOperatorParser#nofixName}.
	 * @param ctx the parse tree
	 */
	void exitNofixName(ZOperatorParser.NofixNameContext ctx);
}