// Generated from restructuredtext/ReStructuredText.g4 by ANTLR 4.7.1
package parsers.restructuredtext;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReStructuredTextParser}.
 */
public interface ReStructuredTextListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(ReStructuredTextParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(ReStructuredTextParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(ReStructuredTextParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(ReStructuredTextParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#sectionElement}.
	 * @param ctx the parse tree
	 */
	void enterSectionElement(ReStructuredTextParser.SectionElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#sectionElement}.
	 * @param ctx the parse tree
	 */
	void exitSectionElement(ReStructuredTextParser.SectionElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(ReStructuredTextParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(ReStructuredTextParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#commentParagraphs}.
	 * @param ctx the parse tree
	 */
	void enterCommentParagraphs(ReStructuredTextParser.CommentParagraphsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#commentParagraphs}.
	 * @param ctx the parse tree
	 */
	void exitCommentParagraphs(ReStructuredTextParser.CommentParagraphsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#commentRest}.
	 * @param ctx the parse tree
	 */
	void enterCommentRest(ReStructuredTextParser.CommentRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#commentRest}.
	 * @param ctx the parse tree
	 */
	void exitCommentRest(ReStructuredTextParser.CommentRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#commentParagraph}.
	 * @param ctx the parse tree
	 */
	void enterCommentParagraph(ReStructuredTextParser.CommentParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#commentParagraph}.
	 * @param ctx the parse tree
	 */
	void exitCommentParagraph(ReStructuredTextParser.CommentParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#commentLineNoBreak}.
	 * @param ctx the parse tree
	 */
	void enterCommentLineNoBreak(ReStructuredTextParser.CommentLineNoBreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#commentLineNoBreak}.
	 * @param ctx the parse tree
	 */
	void exitCommentLineNoBreak(ReStructuredTextParser.CommentLineNoBreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#commentLine}.
	 * @param ctx the parse tree
	 */
	void enterCommentLine(ReStructuredTextParser.CommentLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#commentLine}.
	 * @param ctx the parse tree
	 */
	void exitCommentLine(ReStructuredTextParser.CommentLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#commentLineAtoms}.
	 * @param ctx the parse tree
	 */
	void enterCommentLineAtoms(ReStructuredTextParser.CommentLineAtomsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#commentLineAtoms}.
	 * @param ctx the parse tree
	 */
	void exitCommentLineAtoms(ReStructuredTextParser.CommentLineAtomsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterParagraph(ReStructuredTextParser.ParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitParagraph(ReStructuredTextParser.ParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(ReStructuredTextParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(ReStructuredTextParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(ReStructuredTextParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(ReStructuredTextParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#lineBlock}.
	 * @param ctx the parse tree
	 */
	void enterLineBlock(ReStructuredTextParser.LineBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#lineBlock}.
	 * @param ctx the parse tree
	 */
	void exitLineBlock(ReStructuredTextParser.LineBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#lineBlockLine}.
	 * @param ctx the parse tree
	 */
	void enterLineBlockLine(ReStructuredTextParser.LineBlockLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#lineBlockLine}.
	 * @param ctx the parse tree
	 */
	void exitLineBlockLine(ReStructuredTextParser.LineBlockLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#listItemBullet}.
	 * @param ctx the parse tree
	 */
	void enterListItemBullet(ReStructuredTextParser.ListItemBulletContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#listItemBullet}.
	 * @param ctx the parse tree
	 */
	void exitListItemBullet(ReStructuredTextParser.ListItemBulletContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#bulletCrossLine}.
	 * @param ctx the parse tree
	 */
	void enterBulletCrossLine(ReStructuredTextParser.BulletCrossLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#bulletCrossLine}.
	 * @param ctx the parse tree
	 */
	void exitBulletCrossLine(ReStructuredTextParser.BulletCrossLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#bulletSimple}.
	 * @param ctx the parse tree
	 */
	void enterBulletSimple(ReStructuredTextParser.BulletSimpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#bulletSimple}.
	 * @param ctx the parse tree
	 */
	void exitBulletSimple(ReStructuredTextParser.BulletSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#bullet}.
	 * @param ctx the parse tree
	 */
	void enterBullet(ReStructuredTextParser.BulletContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#bullet}.
	 * @param ctx the parse tree
	 */
	void exitBullet(ReStructuredTextParser.BulletContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#listItemEnumerated}.
	 * @param ctx the parse tree
	 */
	void enterListItemEnumerated(ReStructuredTextParser.ListItemEnumeratedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#listItemEnumerated}.
	 * @param ctx the parse tree
	 */
	void exitListItemEnumerated(ReStructuredTextParser.ListItemEnumeratedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#paragraphNoBreak}.
	 * @param ctx the parse tree
	 */
	void enterParagraphNoBreak(ReStructuredTextParser.ParagraphNoBreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#paragraphNoBreak}.
	 * @param ctx the parse tree
	 */
	void exitParagraphNoBreak(ReStructuredTextParser.ParagraphNoBreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#lineNoBreak}.
	 * @param ctx the parse tree
	 */
	void enterLineNoBreak(ReStructuredTextParser.LineNoBreakContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#lineNoBreak}.
	 * @param ctx the parse tree
	 */
	void exitLineNoBreak(ReStructuredTextParser.LineNoBreakContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#lines}.
	 * @param ctx the parse tree
	 */
	void enterLines(ReStructuredTextParser.LinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#lines}.
	 * @param ctx the parse tree
	 */
	void exitLines(ReStructuredTextParser.LinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#linesNormal}.
	 * @param ctx the parse tree
	 */
	void enterLinesNormal(ReStructuredTextParser.LinesNormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#linesNormal}.
	 * @param ctx the parse tree
	 */
	void exitLinesNormal(ReStructuredTextParser.LinesNormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#linesStar}.
	 * @param ctx the parse tree
	 */
	void enterLinesStar(ReStructuredTextParser.LinesStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#linesStar}.
	 * @param ctx the parse tree
	 */
	void exitLinesStar(ReStructuredTextParser.LinesStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#lineNormal}.
	 * @param ctx the parse tree
	 */
	void enterLineNormal(ReStructuredTextParser.LineNormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#lineNormal}.
	 * @param ctx the parse tree
	 */
	void exitLineNormal(ReStructuredTextParser.LineNormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#lineStar}.
	 * @param ctx the parse tree
	 */
	void enterLineStar(ReStructuredTextParser.LineStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#lineStar}.
	 * @param ctx the parse tree
	 */
	void exitLineStar(ReStructuredTextParser.LineStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#lineSpecial}.
	 * @param ctx the parse tree
	 */
	void enterLineSpecial(ReStructuredTextParser.LineSpecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#lineSpecial}.
	 * @param ctx the parse tree
	 */
	void exitLineSpecial(ReStructuredTextParser.LineSpecialContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#empty_line}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_line(ReStructuredTextParser.Empty_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#empty_line}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_line(ReStructuredTextParser.Empty_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#indentation}.
	 * @param ctx the parse tree
	 */
	void enterIndentation(ReStructuredTextParser.IndentationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#indentation}.
	 * @param ctx the parse tree
	 */
	void exitIndentation(ReStructuredTextParser.IndentationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#spanLineStartNoStar}.
	 * @param ctx the parse tree
	 */
	void enterSpanLineStartNoStar(ReStructuredTextParser.SpanLineStartNoStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#spanLineStartNoStar}.
	 * @param ctx the parse tree
	 */
	void exitSpanLineStartNoStar(ReStructuredTextParser.SpanLineStartNoStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#textLineStart}.
	 * @param ctx the parse tree
	 */
	void enterTextLineStart(ReStructuredTextParser.TextLineStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#textLineStart}.
	 * @param ctx the parse tree
	 */
	void exitTextLineStart(ReStructuredTextParser.TextLineStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#lineStart_fragment}.
	 * @param ctx the parse tree
	 */
	void enterLineStart_fragment(ReStructuredTextParser.LineStart_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#lineStart_fragment}.
	 * @param ctx the parse tree
	 */
	void exitLineStart_fragment(ReStructuredTextParser.LineStart_fragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(ReStructuredTextParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(ReStructuredTextParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#textStart}.
	 * @param ctx the parse tree
	 */
	void enterTextStart(ReStructuredTextParser.TextStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#textStart}.
	 * @param ctx the parse tree
	 */
	void exitTextStart(ReStructuredTextParser.TextStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#forcedText}.
	 * @param ctx the parse tree
	 */
	void enterForcedText(ReStructuredTextParser.ForcedTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#forcedText}.
	 * @param ctx the parse tree
	 */
	void exitForcedText(ReStructuredTextParser.ForcedTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#spanNoStar}.
	 * @param ctx the parse tree
	 */
	void enterSpanNoStar(ReStructuredTextParser.SpanNoStarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#spanNoStar}.
	 * @param ctx the parse tree
	 */
	void exitSpanNoStar(ReStructuredTextParser.SpanNoStarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#span}.
	 * @param ctx the parse tree
	 */
	void enterSpan(ReStructuredTextParser.SpanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#span}.
	 * @param ctx the parse tree
	 */
	void exitSpan(ReStructuredTextParser.SpanContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#quotedLiteral}.
	 * @param ctx the parse tree
	 */
	void enterQuotedLiteral(ReStructuredTextParser.QuotedLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#quotedLiteral}.
	 * @param ctx the parse tree
	 */
	void exitQuotedLiteral(ReStructuredTextParser.QuotedLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#text_fragment_start}.
	 * @param ctx the parse tree
	 */
	void enterText_fragment_start(ReStructuredTextParser.Text_fragment_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#text_fragment_start}.
	 * @param ctx the parse tree
	 */
	void exitText_fragment_start(ReStructuredTextParser.Text_fragment_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#text_fragment}.
	 * @param ctx the parse tree
	 */
	void enterText_fragment(ReStructuredTextParser.Text_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#text_fragment}.
	 * @param ctx the parse tree
	 */
	void exitText_fragment(ReStructuredTextParser.Text_fragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#starText}.
	 * @param ctx the parse tree
	 */
	void enterStarText(ReStructuredTextParser.StarTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#starText}.
	 * @param ctx the parse tree
	 */
	void exitStarText(ReStructuredTextParser.StarTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#starAtoms}.
	 * @param ctx the parse tree
	 */
	void enterStarAtoms(ReStructuredTextParser.StarAtomsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#starAtoms}.
	 * @param ctx the parse tree
	 */
	void exitStarAtoms(ReStructuredTextParser.StarAtomsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#starNoSpace}.
	 * @param ctx the parse tree
	 */
	void enterStarNoSpace(ReStructuredTextParser.StarNoSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#starNoSpace}.
	 * @param ctx the parse tree
	 */
	void exitStarNoSpace(ReStructuredTextParser.StarNoSpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#starAtom}.
	 * @param ctx the parse tree
	 */
	void enterStarAtom(ReStructuredTextParser.StarAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#starAtom}.
	 * @param ctx the parse tree
	 */
	void exitStarAtom(ReStructuredTextParser.StarAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#backTickText}.
	 * @param ctx the parse tree
	 */
	void enterBackTickText(ReStructuredTextParser.BackTickTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#backTickText}.
	 * @param ctx the parse tree
	 */
	void exitBackTickText(ReStructuredTextParser.BackTickTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(ReStructuredTextParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(ReStructuredTextParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#backTickAtoms}.
	 * @param ctx the parse tree
	 */
	void enterBackTickAtoms(ReStructuredTextParser.BackTickAtomsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#backTickAtoms}.
	 * @param ctx the parse tree
	 */
	void exitBackTickAtoms(ReStructuredTextParser.BackTickAtomsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#backTickNoSpace}.
	 * @param ctx the parse tree
	 */
	void enterBackTickNoSpace(ReStructuredTextParser.BackTickNoSpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#backTickNoSpace}.
	 * @param ctx the parse tree
	 */
	void exitBackTickNoSpace(ReStructuredTextParser.BackTickNoSpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#backTickAtom}.
	 * @param ctx the parse tree
	 */
	void enterBackTickAtom(ReStructuredTextParser.BackTickAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#backTickAtom}.
	 * @param ctx the parse tree
	 */
	void exitBackTickAtom(ReStructuredTextParser.BackTickAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(ReStructuredTextParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(ReStructuredTextParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#referenceIn}.
	 * @param ctx the parse tree
	 */
	void enterReferenceIn(ReStructuredTextParser.ReferenceInContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#referenceIn}.
	 * @param ctx the parse tree
	 */
	void exitReferenceIn(ReStructuredTextParser.ReferenceInContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#hyperlinkTarget}.
	 * @param ctx the parse tree
	 */
	void enterHyperlinkTarget(ReStructuredTextParser.HyperlinkTargetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#hyperlinkTarget}.
	 * @param ctx the parse tree
	 */
	void exitHyperlinkTarget(ReStructuredTextParser.HyperlinkTargetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#hyperlink}.
	 * @param ctx the parse tree
	 */
	void enterHyperlink(ReStructuredTextParser.HyperlinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#hyperlink}.
	 * @param ctx the parse tree
	 */
	void exitHyperlink(ReStructuredTextParser.HyperlinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#hyperlinkDoc}.
	 * @param ctx the parse tree
	 */
	void enterHyperlinkDoc(ReStructuredTextParser.HyperlinkDocContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#hyperlinkDoc}.
	 * @param ctx the parse tree
	 */
	void exitHyperlinkDoc(ReStructuredTextParser.HyperlinkDocContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(ReStructuredTextParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(ReStructuredTextParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#urlAtom}.
	 * @param ctx the parse tree
	 */
	void enterUrlAtom(ReStructuredTextParser.UrlAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#urlAtom}.
	 * @param ctx the parse tree
	 */
	void exitUrlAtom(ReStructuredTextParser.UrlAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#hyperlinkAtom}.
	 * @param ctx the parse tree
	 */
	void enterHyperlinkAtom(ReStructuredTextParser.HyperlinkAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#hyperlinkAtom}.
	 * @param ctx the parse tree
	 */
	void exitHyperlinkAtom(ReStructuredTextParser.HyperlinkAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReStructuredTextParser#separator}.
	 * @param ctx the parse tree
	 */
	void enterSeparator(ReStructuredTextParser.SeparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReStructuredTextParser#separator}.
	 * @param ctx the parse tree
	 */
	void exitSeparator(ReStructuredTextParser.SeparatorContext ctx);
}