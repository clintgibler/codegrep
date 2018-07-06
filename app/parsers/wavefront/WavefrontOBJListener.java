// Generated from wavefront/WavefrontOBJ.g4 by ANTLR 4.7.1
package parsers.wavefront;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WavefrontOBJParser}.
 */
public interface WavefrontOBJListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WavefrontOBJParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(WavefrontOBJParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavefrontOBJParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(WavefrontOBJParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavefrontOBJParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(WavefrontOBJParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavefrontOBJParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(WavefrontOBJParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavefrontOBJParser#face}.
	 * @param ctx the parse tree
	 */
	void enterFace(WavefrontOBJParser.FaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavefrontOBJParser#face}.
	 * @param ctx the parse tree
	 */
	void exitFace(WavefrontOBJParser.FaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavefrontOBJParser#vertex}.
	 * @param ctx the parse tree
	 */
	void enterVertex(WavefrontOBJParser.VertexContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavefrontOBJParser#vertex}.
	 * @param ctx the parse tree
	 */
	void exitVertex(WavefrontOBJParser.VertexContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavefrontOBJParser#mtllib}.
	 * @param ctx the parse tree
	 */
	void enterMtllib(WavefrontOBJParser.MtllibContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavefrontOBJParser#mtllib}.
	 * @param ctx the parse tree
	 */
	void exitMtllib(WavefrontOBJParser.MtllibContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavefrontOBJParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(WavefrontOBJParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavefrontOBJParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(WavefrontOBJParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavefrontOBJParser#use_material}.
	 * @param ctx the parse tree
	 */
	void enterUse_material(WavefrontOBJParser.Use_materialContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavefrontOBJParser#use_material}.
	 * @param ctx the parse tree
	 */
	void exitUse_material(WavefrontOBJParser.Use_materialContext ctx);
	/**
	 * Enter a parse tree produced by {@link WavefrontOBJParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(WavefrontOBJParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link WavefrontOBJParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(WavefrontOBJParser.GroupContext ctx);
}