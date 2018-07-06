// Generated from istc/istc.g4 by ANTLR 4.7.1
package parsers.istc;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link istcParser}.
 */
public interface istcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link istcParser#istc}.
	 * @param ctx the parse tree
	 */
	void enterIstc(istcParser.IstcContext ctx);
	/**
	 * Exit a parse tree produced by {@link istcParser#istc}.
	 * @param ctx the parse tree
	 */
	void exitIstc(istcParser.IstcContext ctx);
	/**
	 * Enter a parse tree produced by {@link istcParser#registration}.
	 * @param ctx the parse tree
	 */
	void enterRegistration(istcParser.RegistrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link istcParser#registration}.
	 * @param ctx the parse tree
	 */
	void exitRegistration(istcParser.RegistrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link istcParser#year}.
	 * @param ctx the parse tree
	 */
	void enterYear(istcParser.YearContext ctx);
	/**
	 * Exit a parse tree produced by {@link istcParser#year}.
	 * @param ctx the parse tree
	 */
	void exitYear(istcParser.YearContext ctx);
	/**
	 * Enter a parse tree produced by {@link istcParser#work}.
	 * @param ctx the parse tree
	 */
	void enterWork(istcParser.WorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link istcParser#work}.
	 * @param ctx the parse tree
	 */
	void exitWork(istcParser.WorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link istcParser#check}.
	 * @param ctx the parse tree
	 */
	void enterCheck(istcParser.CheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link istcParser#check}.
	 * @param ctx the parse tree
	 */
	void exitCheck(istcParser.CheckContext ctx);
}