// Generated from iri/IRI.g4 by ANTLR 4.7.1
package parsers.iri;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IRIParser}.
 */
public interface IRIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IRIParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(IRIParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(IRIParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#iri}.
	 * @param ctx the parse tree
	 */
	void enterIri(IRIParser.IriContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#iri}.
	 * @param ctx the parse tree
	 */
	void exitIri(IRIParser.IriContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#ihier_part}.
	 * @param ctx the parse tree
	 */
	void enterIhier_part(IRIParser.Ihier_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#ihier_part}.
	 * @param ctx the parse tree
	 */
	void exitIhier_part(IRIParser.Ihier_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#iri_reference}.
	 * @param ctx the parse tree
	 */
	void enterIri_reference(IRIParser.Iri_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#iri_reference}.
	 * @param ctx the parse tree
	 */
	void exitIri_reference(IRIParser.Iri_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#absolute_iri}.
	 * @param ctx the parse tree
	 */
	void enterAbsolute_iri(IRIParser.Absolute_iriContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#absolute_iri}.
	 * @param ctx the parse tree
	 */
	void exitAbsolute_iri(IRIParser.Absolute_iriContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#irelative_ref}.
	 * @param ctx the parse tree
	 */
	void enterIrelative_ref(IRIParser.Irelative_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#irelative_ref}.
	 * @param ctx the parse tree
	 */
	void exitIrelative_ref(IRIParser.Irelative_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#irelative_part}.
	 * @param ctx the parse tree
	 */
	void enterIrelative_part(IRIParser.Irelative_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#irelative_part}.
	 * @param ctx the parse tree
	 */
	void exitIrelative_part(IRIParser.Irelative_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#iauthority}.
	 * @param ctx the parse tree
	 */
	void enterIauthority(IRIParser.IauthorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#iauthority}.
	 * @param ctx the parse tree
	 */
	void exitIauthority(IRIParser.IauthorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#iuserinfo}.
	 * @param ctx the parse tree
	 */
	void enterIuserinfo(IRIParser.IuserinfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#iuserinfo}.
	 * @param ctx the parse tree
	 */
	void exitIuserinfo(IRIParser.IuserinfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#ihost}.
	 * @param ctx the parse tree
	 */
	void enterIhost(IRIParser.IhostContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#ihost}.
	 * @param ctx the parse tree
	 */
	void exitIhost(IRIParser.IhostContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#ireg_name}.
	 * @param ctx the parse tree
	 */
	void enterIreg_name(IRIParser.Ireg_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#ireg_name}.
	 * @param ctx the parse tree
	 */
	void exitIreg_name(IRIParser.Ireg_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#ipath}.
	 * @param ctx the parse tree
	 */
	void enterIpath(IRIParser.IpathContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#ipath}.
	 * @param ctx the parse tree
	 */
	void exitIpath(IRIParser.IpathContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#ipath_abempty}.
	 * @param ctx the parse tree
	 */
	void enterIpath_abempty(IRIParser.Ipath_abemptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#ipath_abempty}.
	 * @param ctx the parse tree
	 */
	void exitIpath_abempty(IRIParser.Ipath_abemptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#ipath_absolute}.
	 * @param ctx the parse tree
	 */
	void enterIpath_absolute(IRIParser.Ipath_absoluteContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#ipath_absolute}.
	 * @param ctx the parse tree
	 */
	void exitIpath_absolute(IRIParser.Ipath_absoluteContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#ipath_noscheme}.
	 * @param ctx the parse tree
	 */
	void enterIpath_noscheme(IRIParser.Ipath_noschemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#ipath_noscheme}.
	 * @param ctx the parse tree
	 */
	void exitIpath_noscheme(IRIParser.Ipath_noschemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#ipath_rootless}.
	 * @param ctx the parse tree
	 */
	void enterIpath_rootless(IRIParser.Ipath_rootlessContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#ipath_rootless}.
	 * @param ctx the parse tree
	 */
	void exitIpath_rootless(IRIParser.Ipath_rootlessContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#ipath_empty}.
	 * @param ctx the parse tree
	 */
	void enterIpath_empty(IRIParser.Ipath_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#ipath_empty}.
	 * @param ctx the parse tree
	 */
	void exitIpath_empty(IRIParser.Ipath_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#isegment}.
	 * @param ctx the parse tree
	 */
	void enterIsegment(IRIParser.IsegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#isegment}.
	 * @param ctx the parse tree
	 */
	void exitIsegment(IRIParser.IsegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#isegment_nz}.
	 * @param ctx the parse tree
	 */
	void enterIsegment_nz(IRIParser.Isegment_nzContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#isegment_nz}.
	 * @param ctx the parse tree
	 */
	void exitIsegment_nz(IRIParser.Isegment_nzContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#isegment_nz_nc}.
	 * @param ctx the parse tree
	 */
	void enterIsegment_nz_nc(IRIParser.Isegment_nz_ncContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#isegment_nz_nc}.
	 * @param ctx the parse tree
	 */
	void exitIsegment_nz_nc(IRIParser.Isegment_nz_ncContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#ipchar}.
	 * @param ctx the parse tree
	 */
	void enterIpchar(IRIParser.IpcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#ipchar}.
	 * @param ctx the parse tree
	 */
	void exitIpchar(IRIParser.IpcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#iquery}.
	 * @param ctx the parse tree
	 */
	void enterIquery(IRIParser.IqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#iquery}.
	 * @param ctx the parse tree
	 */
	void exitIquery(IRIParser.IqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#ifragment}.
	 * @param ctx the parse tree
	 */
	void enterIfragment(IRIParser.IfragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#ifragment}.
	 * @param ctx the parse tree
	 */
	void exitIfragment(IRIParser.IfragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#iunreserved}.
	 * @param ctx the parse tree
	 */
	void enterIunreserved(IRIParser.IunreservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#iunreserved}.
	 * @param ctx the parse tree
	 */
	void exitIunreserved(IRIParser.IunreservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#scheme}.
	 * @param ctx the parse tree
	 */
	void enterScheme(IRIParser.SchemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#scheme}.
	 * @param ctx the parse tree
	 */
	void exitScheme(IRIParser.SchemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(IRIParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(IRIParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#ip_literal}.
	 * @param ctx the parse tree
	 */
	void enterIp_literal(IRIParser.Ip_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#ip_literal}.
	 * @param ctx the parse tree
	 */
	void exitIp_literal(IRIParser.Ip_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#ip_v_future}.
	 * @param ctx the parse tree
	 */
	void enterIp_v_future(IRIParser.Ip_v_futureContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#ip_v_future}.
	 * @param ctx the parse tree
	 */
	void exitIp_v_future(IRIParser.Ip_v_futureContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#ip_v6_address}.
	 * @param ctx the parse tree
	 */
	void enterIp_v6_address(IRIParser.Ip_v6_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#ip_v6_address}.
	 * @param ctx the parse tree
	 */
	void exitIp_v6_address(IRIParser.Ip_v6_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#h16}.
	 * @param ctx the parse tree
	 */
	void enterH16(IRIParser.H16Context ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#h16}.
	 * @param ctx the parse tree
	 */
	void exitH16(IRIParser.H16Context ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#ls32}.
	 * @param ctx the parse tree
	 */
	void enterLs32(IRIParser.Ls32Context ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#ls32}.
	 * @param ctx the parse tree
	 */
	void exitLs32(IRIParser.Ls32Context ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#ip_v4_address}.
	 * @param ctx the parse tree
	 */
	void enterIp_v4_address(IRIParser.Ip_v4_addressContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#ip_v4_address}.
	 * @param ctx the parse tree
	 */
	void exitIp_v4_address(IRIParser.Ip_v4_addressContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#dec_octet}.
	 * @param ctx the parse tree
	 */
	void enterDec_octet(IRIParser.Dec_octetContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#dec_octet}.
	 * @param ctx the parse tree
	 */
	void exitDec_octet(IRIParser.Dec_octetContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#pct_encoded}.
	 * @param ctx the parse tree
	 */
	void enterPct_encoded(IRIParser.Pct_encodedContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#pct_encoded}.
	 * @param ctx the parse tree
	 */
	void exitPct_encoded(IRIParser.Pct_encodedContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#unreserved}.
	 * @param ctx the parse tree
	 */
	void enterUnreserved(IRIParser.UnreservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#unreserved}.
	 * @param ctx the parse tree
	 */
	void exitUnreserved(IRIParser.UnreservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#reserved}.
	 * @param ctx the parse tree
	 */
	void enterReserved(IRIParser.ReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#reserved}.
	 * @param ctx the parse tree
	 */
	void exitReserved(IRIParser.ReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#gen_delims}.
	 * @param ctx the parse tree
	 */
	void enterGen_delims(IRIParser.Gen_delimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#gen_delims}.
	 * @param ctx the parse tree
	 */
	void exitGen_delims(IRIParser.Gen_delimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#sub_delims}.
	 * @param ctx the parse tree
	 */
	void enterSub_delims(IRIParser.Sub_delimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#sub_delims}.
	 * @param ctx the parse tree
	 */
	void exitSub_delims(IRIParser.Sub_delimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#alpha}.
	 * @param ctx the parse tree
	 */
	void enterAlpha(IRIParser.AlphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#alpha}.
	 * @param ctx the parse tree
	 */
	void exitAlpha(IRIParser.AlphaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#hexdig}.
	 * @param ctx the parse tree
	 */
	void enterHexdig(IRIParser.HexdigContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#hexdig}.
	 * @param ctx the parse tree
	 */
	void exitHexdig(IRIParser.HexdigContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(IRIParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(IRIParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link IRIParser#non_zero_digit}.
	 * @param ctx the parse tree
	 */
	void enterNon_zero_digit(IRIParser.Non_zero_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRIParser#non_zero_digit}.
	 * @param ctx the parse tree
	 */
	void exitNon_zero_digit(IRIParser.Non_zero_digitContext ctx);
}