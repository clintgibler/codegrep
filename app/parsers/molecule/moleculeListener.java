// Generated from molecule/molecule.g4 by ANTLR 4.7.1
package parsers.molecule;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link moleculeParser}.
 */
public interface moleculeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link moleculeParser#molecule}.
	 * @param ctx the parse tree
	 */
	void enterMolecule(moleculeParser.MoleculeContext ctx);
	/**
	 * Exit a parse tree produced by {@link moleculeParser#molecule}.
	 * @param ctx the parse tree
	 */
	void exitMolecule(moleculeParser.MoleculeContext ctx);
	/**
	 * Enter a parse tree produced by {@link moleculeParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(moleculeParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link moleculeParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(moleculeParser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link moleculeParser#structure}.
	 * @param ctx the parse tree
	 */
	void enterStructure(moleculeParser.StructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link moleculeParser#structure}.
	 * @param ctx the parse tree
	 */
	void exitStructure(moleculeParser.StructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link moleculeParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(moleculeParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link moleculeParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(moleculeParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link moleculeParser#group}.
	 * @param ctx the parse tree
	 */
	void enterGroup(moleculeParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link moleculeParser#group}.
	 * @param ctx the parse tree
	 */
	void exitGroup(moleculeParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link moleculeParser#ion}.
	 * @param ctx the parse tree
	 */
	void enterIon(moleculeParser.IonContext ctx);
	/**
	 * Exit a parse tree produced by {@link moleculeParser#ion}.
	 * @param ctx the parse tree
	 */
	void exitIon(moleculeParser.IonContext ctx);
	/**
	 * Enter a parse tree produced by {@link moleculeParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(moleculeParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link moleculeParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(moleculeParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link moleculeParser#count}.
	 * @param ctx the parse tree
	 */
	void enterCount(moleculeParser.CountContext ctx);
	/**
	 * Exit a parse tree produced by {@link moleculeParser#count}.
	 * @param ctx the parse tree
	 */
	void exitCount(moleculeParser.CountContext ctx);
}