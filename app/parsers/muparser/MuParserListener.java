// Generated from muparser/MuParser.g4 by ANTLR 4.7.1
package parsers.muparser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MuParserParser}.
 */
public interface MuParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code progExpr}
	 * labeled alternative in {@link MuParserParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgExpr(MuParserParser.ProgExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code progExpr}
	 * labeled alternative in {@link MuParserParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgExpr(MuParserParser.ProgExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionMultiExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionMultiExpr(MuParserParser.FunctionMultiExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionMultiExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionMultiExpr(MuParserParser.FunctionMultiExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(MuParserParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(MuParserParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(MuParserParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(MuParserParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(MuParserParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(MuParserParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpr(MuParserParser.RelationalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpr(MuParserParser.RelationalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpr(MuParserParser.FunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpr(MuParserParser.FunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpr(MuParserParser.UnaryMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpr(MuParserParser.UnaryMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(MuParserParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(MuParserParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(MuParserParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(MuParserParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivExpr(MuParserParser.MulDivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivExpr(MuParserParser.MulDivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(MuParserParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(MuParserParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(MuParserParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(MuParserParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iteExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIteExpr(MuParserParser.IteExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iteExpr}
	 * labeled alternative in {@link MuParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIteExpr(MuParserParser.IteExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MuParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterParExpr(MuParserParser.ParExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpr}
	 * labeled alternative in {@link MuParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitParExpr(MuParserParser.ParExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link MuParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(MuParserParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link MuParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(MuParserParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MuParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAtom(MuParserParser.BooleanAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAtom}
	 * labeled alternative in {@link MuParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAtom(MuParserParser.BooleanAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predefinedConstantAtom}
	 * labeled alternative in {@link MuParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterPredefinedConstantAtom(MuParserParser.PredefinedConstantAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predefinedConstantAtom}
	 * labeled alternative in {@link MuParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitPredefinedConstantAtom(MuParserParser.PredefinedConstantAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MuParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(MuParserParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link MuParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(MuParserParser.IdAtomContext ctx);
}