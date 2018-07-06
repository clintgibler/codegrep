// Generated from smiles/smiles.g4 by ANTLR 4.7.1
package parsers.smiles;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link smilesParser}.
 */
public interface smilesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link smilesParser#smiles}.
	 * @param ctx the parse tree
	 */
	void enterSmiles(smilesParser.SmilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link smilesParser#smiles}.
	 * @param ctx the parse tree
	 */
	void exitSmiles(smilesParser.SmilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link smilesParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(smilesParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link smilesParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(smilesParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link smilesParser#aliphatic_organic}.
	 * @param ctx the parse tree
	 */
	void enterAliphatic_organic(smilesParser.Aliphatic_organicContext ctx);
	/**
	 * Exit a parse tree produced by {@link smilesParser#aliphatic_organic}.
	 * @param ctx the parse tree
	 */
	void exitAliphatic_organic(smilesParser.Aliphatic_organicContext ctx);
	/**
	 * Enter a parse tree produced by {@link smilesParser#aromatic_organic}.
	 * @param ctx the parse tree
	 */
	void enterAromatic_organic(smilesParser.Aromatic_organicContext ctx);
	/**
	 * Exit a parse tree produced by {@link smilesParser#aromatic_organic}.
	 * @param ctx the parse tree
	 */
	void exitAromatic_organic(smilesParser.Aromatic_organicContext ctx);
	/**
	 * Enter a parse tree produced by {@link smilesParser#bracket_atom}.
	 * @param ctx the parse tree
	 */
	void enterBracket_atom(smilesParser.Bracket_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link smilesParser#bracket_atom}.
	 * @param ctx the parse tree
	 */
	void exitBracket_atom(smilesParser.Bracket_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link smilesParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(smilesParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link smilesParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(smilesParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link smilesParser#isotope}.
	 * @param ctx the parse tree
	 */
	void enterIsotope(smilesParser.IsotopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link smilesParser#isotope}.
	 * @param ctx the parse tree
	 */
	void exitIsotope(smilesParser.IsotopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link smilesParser#element_symbols}.
	 * @param ctx the parse tree
	 */
	void enterElement_symbols(smilesParser.Element_symbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link smilesParser#element_symbols}.
	 * @param ctx the parse tree
	 */
	void exitElement_symbols(smilesParser.Element_symbolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link smilesParser#aromatic_symbols}.
	 * @param ctx the parse tree
	 */
	void enterAromatic_symbols(smilesParser.Aromatic_symbolsContext ctx);
	/**
	 * Exit a parse tree produced by {@link smilesParser#aromatic_symbols}.
	 * @param ctx the parse tree
	 */
	void exitAromatic_symbols(smilesParser.Aromatic_symbolsContext ctx);
	/**
	 * Enter a parse tree produced by {@link smilesParser#chiral}.
	 * @param ctx the parse tree
	 */
	void enterChiral(smilesParser.ChiralContext ctx);
	/**
	 * Exit a parse tree produced by {@link smilesParser#chiral}.
	 * @param ctx the parse tree
	 */
	void exitChiral(smilesParser.ChiralContext ctx);
	/**
	 * Enter a parse tree produced by {@link smilesParser#hcount}.
	 * @param ctx the parse tree
	 */
	void enterHcount(smilesParser.HcountContext ctx);
	/**
	 * Exit a parse tree produced by {@link smilesParser#hcount}.
	 * @param ctx the parse tree
	 */
	void exitHcount(smilesParser.HcountContext ctx);
	/**
	 * Enter a parse tree produced by {@link smilesParser#charge}.
	 * @param ctx the parse tree
	 */
	void enterCharge(smilesParser.ChargeContext ctx);
	/**
	 * Exit a parse tree produced by {@link smilesParser#charge}.
	 * @param ctx the parse tree
	 */
	void exitCharge(smilesParser.ChargeContext ctx);
	/**
	 * Enter a parse tree produced by {@link smilesParser#class_}.
	 * @param ctx the parse tree
	 */
	void enterClass_(smilesParser.Class_Context ctx);
	/**
	 * Exit a parse tree produced by {@link smilesParser#class_}.
	 * @param ctx the parse tree
	 */
	void exitClass_(smilesParser.Class_Context ctx);
	/**
	 * Enter a parse tree produced by {@link smilesParser#bond}.
	 * @param ctx the parse tree
	 */
	void enterBond(smilesParser.BondContext ctx);
	/**
	 * Exit a parse tree produced by {@link smilesParser#bond}.
	 * @param ctx the parse tree
	 */
	void exitBond(smilesParser.BondContext ctx);
	/**
	 * Enter a parse tree produced by {@link smilesParser#ringbond}.
	 * @param ctx the parse tree
	 */
	void enterRingbond(smilesParser.RingbondContext ctx);
	/**
	 * Exit a parse tree produced by {@link smilesParser#ringbond}.
	 * @param ctx the parse tree
	 */
	void exitRingbond(smilesParser.RingbondContext ctx);
	/**
	 * Enter a parse tree produced by {@link smilesParser#branched_atom}.
	 * @param ctx the parse tree
	 */
	void enterBranched_atom(smilesParser.Branched_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link smilesParser#branched_atom}.
	 * @param ctx the parse tree
	 */
	void exitBranched_atom(smilesParser.Branched_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link smilesParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterBranch(smilesParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link smilesParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitBranch(smilesParser.BranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link smilesParser#chain}.
	 * @param ctx the parse tree
	 */
	void enterChain(smilesParser.ChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link smilesParser#chain}.
	 * @param ctx the parse tree
	 */
	void exitChain(smilesParser.ChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link smilesParser#terminator}.
	 * @param ctx the parse tree
	 */
	void enterTerminator(smilesParser.TerminatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link smilesParser#terminator}.
	 * @param ctx the parse tree
	 */
	void exitTerminator(smilesParser.TerminatorContext ctx);
}