// Generated from turtle-doc/turtle.g4 by ANTLR 4.7.1
package parsers.turtle-doc;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link turtleParser}.
 */
public interface turtleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link turtleParser#turtleDoc}.
	 * @param ctx the parse tree
	 */
	void enterTurtleDoc(turtleParser.TurtleDocContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#turtleDoc}.
	 * @param ctx the parse tree
	 */
	void exitTurtleDoc(turtleParser.TurtleDocContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(turtleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(turtleParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(turtleParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(turtleParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#prefixID}.
	 * @param ctx the parse tree
	 */
	void enterPrefixID(turtleParser.PrefixIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#prefixID}.
	 * @param ctx the parse tree
	 */
	void exitPrefixID(turtleParser.PrefixIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#base}.
	 * @param ctx the parse tree
	 */
	void enterBase(turtleParser.BaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#base}.
	 * @param ctx the parse tree
	 */
	void exitBase(turtleParser.BaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#sparqlBase}.
	 * @param ctx the parse tree
	 */
	void enterSparqlBase(turtleParser.SparqlBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#sparqlBase}.
	 * @param ctx the parse tree
	 */
	void exitSparqlBase(turtleParser.SparqlBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#sparqlPrefix}.
	 * @param ctx the parse tree
	 */
	void enterSparqlPrefix(turtleParser.SparqlPrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#sparqlPrefix}.
	 * @param ctx the parse tree
	 */
	void exitSparqlPrefix(turtleParser.SparqlPrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#triples}.
	 * @param ctx the parse tree
	 */
	void enterTriples(turtleParser.TriplesContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#triples}.
	 * @param ctx the parse tree
	 */
	void exitTriples(turtleParser.TriplesContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#predicateObjectList}.
	 * @param ctx the parse tree
	 */
	void enterPredicateObjectList(turtleParser.PredicateObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#predicateObjectList}.
	 * @param ctx the parse tree
	 */
	void exitPredicateObjectList(turtleParser.PredicateObjectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#objectList}.
	 * @param ctx the parse tree
	 */
	void enterObjectList(turtleParser.ObjectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#objectList}.
	 * @param ctx the parse tree
	 */
	void exitObjectList(turtleParser.ObjectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#predicateObject}.
	 * @param ctx the parse tree
	 */
	void enterPredicateObject(turtleParser.PredicateObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#predicateObject}.
	 * @param ctx the parse tree
	 */
	void exitPredicateObject(turtleParser.PredicateObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#subject}.
	 * @param ctx the parse tree
	 */
	void enterSubject(turtleParser.SubjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#subject}.
	 * @param ctx the parse tree
	 */
	void exitSubject(turtleParser.SubjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(turtleParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(turtleParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(turtleParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(turtleParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(turtleParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(turtleParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterBlankNodePropertyList(turtleParser.BlankNodePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#blankNodePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitBlankNodePropertyList(turtleParser.BlankNodePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(turtleParser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(turtleParser.CollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(turtleParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(turtleParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#rDFLiteral}.
	 * @param ctx the parse tree
	 */
	void enterRDFLiteral(turtleParser.RDFLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#rDFLiteral}.
	 * @param ctx the parse tree
	 */
	void exitRDFLiteral(turtleParser.RDFLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(turtleParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(turtleParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(turtleParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(turtleParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#iri}.
	 * @param ctx the parse tree
	 */
	void enterIri(turtleParser.IriContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#iri}.
	 * @param ctx the parse tree
	 */
	void exitIri(turtleParser.IriContext ctx);
	/**
	 * Enter a parse tree produced by {@link turtleParser#blankNode}.
	 * @param ctx the parse tree
	 */
	void enterBlankNode(turtleParser.BlankNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link turtleParser#blankNode}.
	 * @param ctx the parse tree
	 */
	void exitBlankNode(turtleParser.BlankNodeContext ctx);
}