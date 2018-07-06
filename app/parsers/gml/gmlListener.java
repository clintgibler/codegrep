// Generated from gml/gml.g4 by ANTLR 4.7.1
package parsers.gml;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gmlParser}.
 */
public interface gmlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gmlParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(gmlParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link gmlParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(gmlParser.GraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link gmlParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(gmlParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link gmlParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(gmlParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link gmlParser#kv}.
	 * @param ctx the parse tree
	 */
	void enterKv(gmlParser.KvContext ctx);
	/**
	 * Exit a parse tree produced by {@link gmlParser#kv}.
	 * @param ctx the parse tree
	 */
	void exitKv(gmlParser.KvContext ctx);
	/**
	 * Enter a parse tree produced by {@link gmlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(gmlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gmlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(gmlParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gmlParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(gmlParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link gmlParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(gmlParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link gmlParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(gmlParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link gmlParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(gmlParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link gmlParser#realnum}.
	 * @param ctx the parse tree
	 */
	void enterRealnum(gmlParser.RealnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link gmlParser#realnum}.
	 * @param ctx the parse tree
	 */
	void exitRealnum(gmlParser.RealnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link gmlParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStr(gmlParser.StrContext ctx);
	/**
	 * Exit a parse tree produced by {@link gmlParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStr(gmlParser.StrContext ctx);
	/**
	 * Enter a parse tree produced by {@link gmlParser#stringliteral}.
	 * @param ctx the parse tree
	 */
	void enterStringliteral(gmlParser.StringliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link gmlParser#stringliteral}.
	 * @param ctx the parse tree
	 */
	void exitStringliteral(gmlParser.StringliteralContext ctx);
}