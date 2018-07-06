// Generated from graphstream-dgs/DGSParser.g4 by ANTLR 4.7.1
package parsers.graphstream-dgs;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DGSParser}.
 */
public interface DGSParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DGSParser#dgs}.
	 * @param ctx the parse tree
	 */
	void enterDgs(DGSParser.DgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#dgs}.
	 * @param ctx the parse tree
	 */
	void exitDgs(DGSParser.DgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(DGSParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(DGSParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#event}.
	 * @param ctx the parse tree
	 */
	void enterEvent(DGSParser.EventContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#event}.
	 * @param ctx the parse tree
	 */
	void exitEvent(DGSParser.EventContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#an}.
	 * @param ctx the parse tree
	 */
	void enterAn(DGSParser.AnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#an}.
	 * @param ctx the parse tree
	 */
	void exitAn(DGSParser.AnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#cn}.
	 * @param ctx the parse tree
	 */
	void enterCn(DGSParser.CnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#cn}.
	 * @param ctx the parse tree
	 */
	void exitCn(DGSParser.CnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#dn}.
	 * @param ctx the parse tree
	 */
	void enterDn(DGSParser.DnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#dn}.
	 * @param ctx the parse tree
	 */
	void exitDn(DGSParser.DnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#ae}.
	 * @param ctx the parse tree
	 */
	void enterAe(DGSParser.AeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#ae}.
	 * @param ctx the parse tree
	 */
	void exitAe(DGSParser.AeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#ce}.
	 * @param ctx the parse tree
	 */
	void enterCe(DGSParser.CeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#ce}.
	 * @param ctx the parse tree
	 */
	void exitCe(DGSParser.CeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#de}.
	 * @param ctx the parse tree
	 */
	void enterDe(DGSParser.DeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#de}.
	 * @param ctx the parse tree
	 */
	void exitDe(DGSParser.DeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#cg}.
	 * @param ctx the parse tree
	 */
	void enterCg(DGSParser.CgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#cg}.
	 * @param ctx the parse tree
	 */
	void exitCg(DGSParser.CgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#st}.
	 * @param ctx the parse tree
	 */
	void enterSt(DGSParser.StContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#st}.
	 * @param ctx the parse tree
	 */
	void exitSt(DGSParser.StContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#cl}.
	 * @param ctx the parse tree
	 */
	void enterCl(DGSParser.ClContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#cl}.
	 * @param ctx the parse tree
	 */
	void exitCl(DGSParser.ClContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(DGSParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(DGSParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(DGSParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(DGSParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DGSParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DGSParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(DGSParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(DGSParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#a_map}.
	 * @param ctx the parse tree
	 */
	void enterA_map(DGSParser.A_mapContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#a_map}.
	 * @param ctx the parse tree
	 */
	void exitA_map(DGSParser.A_mapContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#mapping}.
	 * @param ctx the parse tree
	 */
	void enterMapping(DGSParser.MappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#mapping}.
	 * @param ctx the parse tree
	 */
	void exitMapping(DGSParser.MappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(DGSParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(DGSParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(DGSParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(DGSParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link DGSParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(DGSParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DGSParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(DGSParser.IdentifierContext ctx);
}