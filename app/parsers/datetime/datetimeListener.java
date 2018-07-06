// Generated from datetime/datetime.g4 by ANTLR 4.7.1
package parsers.datetime;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link datetimeParser}.
 */
public interface datetimeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link datetimeParser#date_time}.
	 * @param ctx the parse tree
	 */
	void enterDate_time(datetimeParser.Date_timeContext ctx);
	/**
	 * Exit a parse tree produced by {@link datetimeParser#date_time}.
	 * @param ctx the parse tree
	 */
	void exitDate_time(datetimeParser.Date_timeContext ctx);
	/**
	 * Enter a parse tree produced by {@link datetimeParser#day}.
	 * @param ctx the parse tree
	 */
	void enterDay(datetimeParser.DayContext ctx);
	/**
	 * Exit a parse tree produced by {@link datetimeParser#day}.
	 * @param ctx the parse tree
	 */
	void exitDay(datetimeParser.DayContext ctx);
	/**
	 * Enter a parse tree produced by {@link datetimeParser#date}.
	 * @param ctx the parse tree
	 */
	void enterDate(datetimeParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by {@link datetimeParser#date}.
	 * @param ctx the parse tree
	 */
	void exitDate(datetimeParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by {@link datetimeParser#month}.
	 * @param ctx the parse tree
	 */
	void enterMonth(datetimeParser.MonthContext ctx);
	/**
	 * Exit a parse tree produced by {@link datetimeParser#month}.
	 * @param ctx the parse tree
	 */
	void exitMonth(datetimeParser.MonthContext ctx);
	/**
	 * Enter a parse tree produced by {@link datetimeParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(datetimeParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link datetimeParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(datetimeParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link datetimeParser#hour}.
	 * @param ctx the parse tree
	 */
	void enterHour(datetimeParser.HourContext ctx);
	/**
	 * Exit a parse tree produced by {@link datetimeParser#hour}.
	 * @param ctx the parse tree
	 */
	void exitHour(datetimeParser.HourContext ctx);
	/**
	 * Enter a parse tree produced by {@link datetimeParser#zone}.
	 * @param ctx the parse tree
	 */
	void enterZone(datetimeParser.ZoneContext ctx);
	/**
	 * Exit a parse tree produced by {@link datetimeParser#zone}.
	 * @param ctx the parse tree
	 */
	void exitZone(datetimeParser.ZoneContext ctx);
	/**
	 * Enter a parse tree produced by {@link datetimeParser#two_digit}.
	 * @param ctx the parse tree
	 */
	void enterTwo_digit(datetimeParser.Two_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link datetimeParser#two_digit}.
	 * @param ctx the parse tree
	 */
	void exitTwo_digit(datetimeParser.Two_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link datetimeParser#four_digit}.
	 * @param ctx the parse tree
	 */
	void enterFour_digit(datetimeParser.Four_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link datetimeParser#four_digit}.
	 * @param ctx the parse tree
	 */
	void exitFour_digit(datetimeParser.Four_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link datetimeParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void enterAlphanumeric(datetimeParser.AlphanumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link datetimeParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void exitAlphanumeric(datetimeParser.AlphanumericContext ctx);
}