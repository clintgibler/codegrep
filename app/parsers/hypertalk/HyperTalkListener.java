// Generated from hypertalk/HyperTalk.g4 by ANTLR 4.7.1
package parsers.hypertalk;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HyperTalkParser}.
 */
public interface HyperTalkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(HyperTalkParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(HyperTalkParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#scriptlet}.
	 * @param ctx the parse tree
	 */
	void enterScriptlet(HyperTalkParser.ScriptletContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#scriptlet}.
	 * @param ctx the parse tree
	 */
	void exitScriptlet(HyperTalkParser.ScriptletContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#multilineScriptlet}.
	 * @param ctx the parse tree
	 */
	void enterMultilineScriptlet(HyperTalkParser.MultilineScriptletContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#multilineScriptlet}.
	 * @param ctx the parse tree
	 */
	void exitMultilineScriptlet(HyperTalkParser.MultilineScriptletContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#handler}.
	 * @param ctx the parse tree
	 */
	void enterHandler(HyperTalkParser.HandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#handler}.
	 * @param ctx the parse tree
	 */
	void exitHandler(HyperTalkParser.HandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(HyperTalkParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(HyperTalkParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#handlerName}.
	 * @param ctx the parse tree
	 */
	void enterHandlerName(HyperTalkParser.HandlerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#handlerName}.
	 * @param ctx the parse tree
	 */
	void exitHandlerName(HyperTalkParser.HandlerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(HyperTalkParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(HyperTalkParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(HyperTalkParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(HyperTalkParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HyperTalkParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HyperTalkParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#globalStmnt}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStmnt(HyperTalkParser.GlobalStmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#globalStmnt}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStmnt(HyperTalkParser.GlobalStmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#returnStmnt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmnt(HyperTalkParser.ReturnStmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#returnStmnt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmnt(HyperTalkParser.ReturnStmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(HyperTalkParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(HyperTalkParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#thenStatement}.
	 * @param ctx the parse tree
	 */
	void enterThenStatement(HyperTalkParser.ThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#thenStatement}.
	 * @param ctx the parse tree
	 */
	void exitThenStatement(HyperTalkParser.ThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(HyperTalkParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(HyperTalkParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(HyperTalkParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(HyperTalkParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#messageStatement}.
	 * @param ctx the parse tree
	 */
	void enterMessageStatement(HyperTalkParser.MessageStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#messageStatement}.
	 * @param ctx the parse tree
	 */
	void exitMessageStatement(HyperTalkParser.MessageStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#commandStmnt}.
	 * @param ctx the parse tree
	 */
	void enterCommandStmnt(HyperTalkParser.CommandStmntContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#commandStmnt}.
	 * @param ctx the parse tree
	 */
	void exitCommandStmnt(HyperTalkParser.CommandStmntContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#convertible}.
	 * @param ctx the parse tree
	 */
	void enterConvertible(HyperTalkParser.ConvertibleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#convertible}.
	 * @param ctx the parse tree
	 */
	void exitConvertible(HyperTalkParser.ConvertibleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#conversionFormat}.
	 * @param ctx the parse tree
	 */
	void enterConversionFormat(HyperTalkParser.ConversionFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#conversionFormat}.
	 * @param ctx the parse tree
	 */
	void exitConversionFormat(HyperTalkParser.ConversionFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#length}.
	 * @param ctx the parse tree
	 */
	void enterLength(HyperTalkParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#length}.
	 * @param ctx the parse tree
	 */
	void exitLength(HyperTalkParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#sortDirection}.
	 * @param ctx the parse tree
	 */
	void enterSortDirection(HyperTalkParser.SortDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#sortDirection}.
	 * @param ctx the parse tree
	 */
	void exitSortDirection(HyperTalkParser.SortDirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#sortChunkType}.
	 * @param ctx the parse tree
	 */
	void enterSortChunkType(HyperTalkParser.SortChunkTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#sortChunkType}.
	 * @param ctx the parse tree
	 */
	void exitSortChunkType(HyperTalkParser.SortChunkTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#sortStyle}.
	 * @param ctx the parse tree
	 */
	void enterSortStyle(HyperTalkParser.SortStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#sortStyle}.
	 * @param ctx the parse tree
	 */
	void exitSortStyle(HyperTalkParser.SortStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#repeatRange}.
	 * @param ctx the parse tree
	 */
	void enterRepeatRange(HyperTalkParser.RepeatRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#repeatRange}.
	 * @param ctx the parse tree
	 */
	void exitRepeatRange(HyperTalkParser.RepeatRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#duration}.
	 * @param ctx the parse tree
	 */
	void enterDuration(HyperTalkParser.DurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#duration}.
	 * @param ctx the parse tree
	 */
	void exitDuration(HyperTalkParser.DurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#count}.
	 * @param ctx the parse tree
	 */
	void enterCount(HyperTalkParser.CountContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#count}.
	 * @param ctx the parse tree
	 */
	void exitCount(HyperTalkParser.CountContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(HyperTalkParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(HyperTalkParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#chunk}.
	 * @param ctx the parse tree
	 */
	void enterChunk(HyperTalkParser.ChunkContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#chunk}.
	 * @param ctx the parse tree
	 */
	void exitChunk(HyperTalkParser.ChunkContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#menu}.
	 * @param ctx the parse tree
	 */
	void enterMenu(HyperTalkParser.MenuContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#menu}.
	 * @param ctx the parse tree
	 */
	void exitMenu(HyperTalkParser.MenuContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#menuItem}.
	 * @param ctx the parse tree
	 */
	void enterMenuItem(HyperTalkParser.MenuItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#menuItem}.
	 * @param ctx the parse tree
	 */
	void exitMenuItem(HyperTalkParser.MenuItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(HyperTalkParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(HyperTalkParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#globalProperty}.
	 * @param ctx the parse tree
	 */
	void enterGlobalProperty(HyperTalkParser.GlobalPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#globalProperty}.
	 * @param ctx the parse tree
	 */
	void exitGlobalProperty(HyperTalkParser.GlobalPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#partProperty}.
	 * @param ctx the parse tree
	 */
	void enterPartProperty(HyperTalkParser.PartPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#partProperty}.
	 * @param ctx the parse tree
	 */
	void exitPartProperty(HyperTalkParser.PartPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(HyperTalkParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(HyperTalkParser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#stackPart}.
	 * @param ctx the parse tree
	 */
	void enterStackPart(HyperTalkParser.StackPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#stackPart}.
	 * @param ctx the parse tree
	 */
	void exitStackPart(HyperTalkParser.StackPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#buttonPart}.
	 * @param ctx the parse tree
	 */
	void enterButtonPart(HyperTalkParser.ButtonPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#buttonPart}.
	 * @param ctx the parse tree
	 */
	void exitButtonPart(HyperTalkParser.ButtonPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#fieldPart}.
	 * @param ctx the parse tree
	 */
	void enterFieldPart(HyperTalkParser.FieldPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#fieldPart}.
	 * @param ctx the parse tree
	 */
	void exitFieldPart(HyperTalkParser.FieldPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#cardPart}.
	 * @param ctx the parse tree
	 */
	void enterCardPart(HyperTalkParser.CardPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#cardPart}.
	 * @param ctx the parse tree
	 */
	void exitCardPart(HyperTalkParser.CardPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#bkgndPart}.
	 * @param ctx the parse tree
	 */
	void enterBkgndPart(HyperTalkParser.BkgndPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#bkgndPart}.
	 * @param ctx the parse tree
	 */
	void exitBkgndPart(HyperTalkParser.BkgndPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#listExpression}.
	 * @param ctx the parse tree
	 */
	void enterListExpression(HyperTalkParser.ListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#listExpression}.
	 * @param ctx the parse tree
	 */
	void exitListExpression(HyperTalkParser.ListExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HyperTalkParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HyperTalkParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(HyperTalkParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(HyperTalkParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(HyperTalkParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(HyperTalkParser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#musicExpression}.
	 * @param ctx the parse tree
	 */
	void enterMusicExpression(HyperTalkParser.MusicExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#musicExpression}.
	 * @param ctx the parse tree
	 */
	void exitMusicExpression(HyperTalkParser.MusicExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#toolExpression}.
	 * @param ctx the parse tree
	 */
	void enterToolExpression(HyperTalkParser.ToolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#toolExpression}.
	 * @param ctx the parse tree
	 */
	void exitToolExpression(HyperTalkParser.ToolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#effectExpression}.
	 * @param ctx the parse tree
	 */
	void enterEffectExpression(HyperTalkParser.EffectExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#effectExpression}.
	 * @param ctx the parse tree
	 */
	void exitEffectExpression(HyperTalkParser.EffectExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(HyperTalkParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(HyperTalkParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#builtInFunc}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInFunc(HyperTalkParser.BuiltInFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#builtInFunc}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInFunc(HyperTalkParser.BuiltInFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#zeroArgFunc}.
	 * @param ctx the parse tree
	 */
	void enterZeroArgFunc(HyperTalkParser.ZeroArgFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#zeroArgFunc}.
	 * @param ctx the parse tree
	 */
	void exitZeroArgFunc(HyperTalkParser.ZeroArgFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#singleArgFunc}.
	 * @param ctx the parse tree
	 */
	void enterSingleArgFunc(HyperTalkParser.SingleArgFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#singleArgFunc}.
	 * @param ctx the parse tree
	 */
	void exitSingleArgFunc(HyperTalkParser.SingleArgFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#multiArgFunc}.
	 * @param ctx the parse tree
	 */
	void enterMultiArgFunc(HyperTalkParser.MultiArgFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#multiArgFunc}.
	 * @param ctx the parse tree
	 */
	void exitMultiArgFunc(HyperTalkParser.MultiArgFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(HyperTalkParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(HyperTalkParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#preposition}.
	 * @param ctx the parse tree
	 */
	void enterPreposition(HyperTalkParser.PrepositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#preposition}.
	 * @param ctx the parse tree
	 */
	void exitPreposition(HyperTalkParser.PrepositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(HyperTalkParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(HyperTalkParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#cardinalValue}.
	 * @param ctx the parse tree
	 */
	void enterCardinalValue(HyperTalkParser.CardinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#cardinalValue}.
	 * @param ctx the parse tree
	 */
	void exitCardinalValue(HyperTalkParser.CardinalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#ordinal}.
	 * @param ctx the parse tree
	 */
	void enterOrdinal(HyperTalkParser.OrdinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#ordinal}.
	 * @param ctx the parse tree
	 */
	void exitOrdinal(HyperTalkParser.OrdinalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#ordinalValue}.
	 * @param ctx the parse tree
	 */
	void enterOrdinalValue(HyperTalkParser.OrdinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#ordinalValue}.
	 * @param ctx the parse tree
	 */
	void exitOrdinalValue(HyperTalkParser.OrdinalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#mouseState}.
	 * @param ctx the parse tree
	 */
	void enterMouseState(HyperTalkParser.MouseStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#mouseState}.
	 * @param ctx the parse tree
	 */
	void exitMouseState(HyperTalkParser.MouseStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#modifierKey}.
	 * @param ctx the parse tree
	 */
	void enterModifierKey(HyperTalkParser.ModifierKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#modifierKey}.
	 * @param ctx the parse tree
	 */
	void exitModifierKey(HyperTalkParser.ModifierKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#knownType}.
	 * @param ctx the parse tree
	 */
	void enterKnownType(HyperTalkParser.KnownTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#knownType}.
	 * @param ctx the parse tree
	 */
	void exitKnownType(HyperTalkParser.KnownTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#findType}.
	 * @param ctx the parse tree
	 */
	void enterFindType(HyperTalkParser.FindTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#findType}.
	 * @param ctx the parse tree
	 */
	void exitFindType(HyperTalkParser.FindTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(HyperTalkParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(HyperTalkParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void enterPropertyValue(HyperTalkParser.PropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#propertyValue}.
	 * @param ctx the parse tree
	 */
	void exitPropertyValue(HyperTalkParser.PropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#commandName}.
	 * @param ctx the parse tree
	 */
	void enterCommandName(HyperTalkParser.CommandNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#commandName}.
	 * @param ctx the parse tree
	 */
	void exitCommandName(HyperTalkParser.CommandNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#picture}.
	 * @param ctx the parse tree
	 */
	void enterPicture(HyperTalkParser.PictureContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#picture}.
	 * @param ctx the parse tree
	 */
	void exitPicture(HyperTalkParser.PictureContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#seconds}.
	 * @param ctx the parse tree
	 */
	void enterSeconds(HyperTalkParser.SecondsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#seconds}.
	 * @param ctx the parse tree
	 */
	void exitSeconds(HyperTalkParser.SecondsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#speed}.
	 * @param ctx the parse tree
	 */
	void enterSpeed(HyperTalkParser.SpeedContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#speed}.
	 * @param ctx the parse tree
	 */
	void exitSpeed(HyperTalkParser.SpeedContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(HyperTalkParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(HyperTalkParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#effect}.
	 * @param ctx the parse tree
	 */
	void enterEffect(HyperTalkParser.EffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#effect}.
	 * @param ctx the parse tree
	 */
	void exitEffect(HyperTalkParser.EffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#timeUnit}.
	 * @param ctx the parse tree
	 */
	void enterTimeUnit(HyperTalkParser.TimeUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#timeUnit}.
	 * @param ctx the parse tree
	 */
	void exitTimeUnit(HyperTalkParser.TimeUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#position}.
	 * @param ctx the parse tree
	 */
	void enterPosition(HyperTalkParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#position}.
	 * @param ctx the parse tree
	 */
	void exitPosition(HyperTalkParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#message}.
	 * @param ctx the parse tree
	 */
	void enterMessage(HyperTalkParser.MessageContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#message}.
	 * @param ctx the parse tree
	 */
	void exitMessage(HyperTalkParser.MessageContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#cards}.
	 * @param ctx the parse tree
	 */
	void enterCards(HyperTalkParser.CardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#cards}.
	 * @param ctx the parse tree
	 */
	void exitCards(HyperTalkParser.CardsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#card}.
	 * @param ctx the parse tree
	 */
	void enterCard(HyperTalkParser.CardContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#card}.
	 * @param ctx the parse tree
	 */
	void exitCard(HyperTalkParser.CardContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#background}.
	 * @param ctx the parse tree
	 */
	void enterBackground(HyperTalkParser.BackgroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#background}.
	 * @param ctx the parse tree
	 */
	void exitBackground(HyperTalkParser.BackgroundContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#button}.
	 * @param ctx the parse tree
	 */
	void enterButton(HyperTalkParser.ButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#button}.
	 * @param ctx the parse tree
	 */
	void exitButton(HyperTalkParser.ButtonContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(HyperTalkParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(HyperTalkParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#stack}.
	 * @param ctx the parse tree
	 */
	void enterStack(HyperTalkParser.StackContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#stack}.
	 * @param ctx the parse tree
	 */
	void exitStack(HyperTalkParser.StackContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#character}.
	 * @param ctx the parse tree
	 */
	void enterCharacter(HyperTalkParser.CharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#character}.
	 * @param ctx the parse tree
	 */
	void exitCharacter(HyperTalkParser.CharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(HyperTalkParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(HyperTalkParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(HyperTalkParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(HyperTalkParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(HyperTalkParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(HyperTalkParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HyperTalkParser#of}.
	 * @param ctx the parse tree
	 */
	void enterOf(HyperTalkParser.OfContext ctx);
	/**
	 * Exit a parse tree produced by {@link HyperTalkParser#of}.
	 * @param ctx the parse tree
	 */
	void exitOf(HyperTalkParser.OfContext ctx);
}