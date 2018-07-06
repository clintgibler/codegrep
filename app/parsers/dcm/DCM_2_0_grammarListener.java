// Generated from dcm/DCM_2_0_grammar.g4 by ANTLR 4.7.1
package parsers.dcm;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DCM_2_0_grammarParser}.
 */
public interface DCM_2_0_grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#konservierung}.
	 * @param ctx the parse tree
	 */
	void enterKonservierung(DCM_2_0_grammarParser.KonservierungContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#konservierung}.
	 * @param ctx the parse tree
	 */
	void exitKonservierung(DCM_2_0_grammarParser.KonservierungContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kons_kopf}.
	 * @param ctx the parse tree
	 */
	void enterKons_kopf(DCM_2_0_grammarParser.Kons_kopfContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kons_kopf}.
	 * @param ctx the parse tree
	 */
	void exitKons_kopf(DCM_2_0_grammarParser.Kons_kopfContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#modulkopf_info}.
	 * @param ctx the parse tree
	 */
	void enterModulkopf_info(DCM_2_0_grammarParser.Modulkopf_infoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#modulkopf_info}.
	 * @param ctx the parse tree
	 */
	void exitModulkopf_info(DCM_2_0_grammarParser.Modulkopf_infoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#mod_zeile}.
	 * @param ctx the parse tree
	 */
	void enterMod_zeile(DCM_2_0_grammarParser.Mod_zeileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#mod_zeile}.
	 * @param ctx the parse tree
	 */
	void exitMod_zeile(DCM_2_0_grammarParser.Mod_zeileContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#mod_anf_zeile}.
	 * @param ctx the parse tree
	 */
	void enterMod_anf_zeile(DCM_2_0_grammarParser.Mod_anf_zeileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#mod_anf_zeile}.
	 * @param ctx the parse tree
	 */
	void exitMod_anf_zeile(DCM_2_0_grammarParser.Mod_anf_zeileContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#mod_fort_zeile}.
	 * @param ctx the parse tree
	 */
	void enterMod_fort_zeile(DCM_2_0_grammarParser.Mod_fort_zeileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#mod_fort_zeile}.
	 * @param ctx the parse tree
	 */
	void exitMod_fort_zeile(DCM_2_0_grammarParser.Mod_fort_zeileContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#mod_ele_name}.
	 * @param ctx the parse tree
	 */
	void enterMod_ele_name(DCM_2_0_grammarParser.Mod_ele_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#mod_ele_name}.
	 * @param ctx the parse tree
	 */
	void exitMod_ele_name(DCM_2_0_grammarParser.Mod_ele_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#mod_ele_wert}.
	 * @param ctx the parse tree
	 */
	void enterMod_ele_wert(DCM_2_0_grammarParser.Mod_ele_wertContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#mod_ele_wert}.
	 * @param ctx the parse tree
	 */
	void exitMod_ele_wert(DCM_2_0_grammarParser.Mod_ele_wertContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#funktionsdef}.
	 * @param ctx the parse tree
	 */
	void enterFunktionsdef(DCM_2_0_grammarParser.FunktionsdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#funktionsdef}.
	 * @param ctx the parse tree
	 */
	void exitFunktionsdef(DCM_2_0_grammarParser.FunktionsdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#funktionszeile}.
	 * @param ctx the parse tree
	 */
	void enterFunktionszeile(DCM_2_0_grammarParser.FunktionszeileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#funktionszeile}.
	 * @param ctx the parse tree
	 */
	void exitFunktionszeile(DCM_2_0_grammarParser.FunktionszeileContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#fkt_version}.
	 * @param ctx the parse tree
	 */
	void enterFkt_version(DCM_2_0_grammarParser.Fkt_versionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#fkt_version}.
	 * @param ctx the parse tree
	 */
	void exitFkt_version(DCM_2_0_grammarParser.Fkt_versionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#fkt_langname}.
	 * @param ctx the parse tree
	 */
	void enterFkt_langname(DCM_2_0_grammarParser.Fkt_langnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#fkt_langname}.
	 * @param ctx the parse tree
	 */
	void exitFkt_langname(DCM_2_0_grammarParser.Fkt_langnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#variantendef}.
	 * @param ctx the parse tree
	 */
	void enterVariantendef(DCM_2_0_grammarParser.VariantendefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#variantendef}.
	 * @param ctx the parse tree
	 */
	void exitVariantendef(DCM_2_0_grammarParser.VariantendefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#variantenkrit}.
	 * @param ctx the parse tree
	 */
	void enterVariantenkrit(DCM_2_0_grammarParser.VariantenkritContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#variantenkrit}.
	 * @param ctx the parse tree
	 */
	void exitVariantenkrit(DCM_2_0_grammarParser.VariantenkritContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#krit_name}.
	 * @param ctx the parse tree
	 */
	void enterKrit_name(DCM_2_0_grammarParser.Krit_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#krit_name}.
	 * @param ctx the parse tree
	 */
	void exitKrit_name(DCM_2_0_grammarParser.Krit_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#krit_wert}.
	 * @param ctx the parse tree
	 */
	void enterKrit_wert(DCM_2_0_grammarParser.Krit_wertContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#krit_wert}.
	 * @param ctx the parse tree
	 */
	void exitKrit_wert(DCM_2_0_grammarParser.Krit_wertContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kons_rumpf}.
	 * @param ctx the parse tree
	 */
	void enterKons_rumpf(DCM_2_0_grammarParser.Kons_rumpfContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kons_rumpf}.
	 * @param ctx the parse tree
	 */
	void exitKons_rumpf(DCM_2_0_grammarParser.Kons_rumpfContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kenngroesse}.
	 * @param ctx the parse tree
	 */
	void enterKenngroesse(DCM_2_0_grammarParser.KenngroesseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kenngroesse}.
	 * @param ctx the parse tree
	 */
	void exitKenngroesse(DCM_2_0_grammarParser.KenngroesseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kennwert}.
	 * @param ctx the parse tree
	 */
	void enterKennwert(DCM_2_0_grammarParser.KennwertContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kennwert}.
	 * @param ctx the parse tree
	 */
	void exitKennwert(DCM_2_0_grammarParser.KennwertContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kennwerteblock}.
	 * @param ctx the parse tree
	 */
	void enterKennwerteblock(DCM_2_0_grammarParser.KennwerteblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kennwerteblock}.
	 * @param ctx the parse tree
	 */
	void exitKennwerteblock(DCM_2_0_grammarParser.KennwerteblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kennlinie}.
	 * @param ctx the parse tree
	 */
	void enterKennlinie(DCM_2_0_grammarParser.KennlinieContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kennlinie}.
	 * @param ctx the parse tree
	 */
	void exitKennlinie(DCM_2_0_grammarParser.KennlinieContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kennfeld}.
	 * @param ctx the parse tree
	 */
	void enterKennfeld(DCM_2_0_grammarParser.KennfeldContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kennfeld}.
	 * @param ctx the parse tree
	 */
	void exitKennfeld(DCM_2_0_grammarParser.KennfeldContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#gruppenstuetzstellen}.
	 * @param ctx the parse tree
	 */
	void enterGruppenstuetzstellen(DCM_2_0_grammarParser.GruppenstuetzstellenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#gruppenstuetzstellen}.
	 * @param ctx the parse tree
	 */
	void exitGruppenstuetzstellen(DCM_2_0_grammarParser.GruppenstuetzstellenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kenntext}.
	 * @param ctx the parse tree
	 */
	void enterKenntext(DCM_2_0_grammarParser.KenntextContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kenntext}.
	 * @param ctx the parse tree
	 */
	void exitKenntext(DCM_2_0_grammarParser.KenntextContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kgr_info}.
	 * @param ctx the parse tree
	 */
	void enterKgr_info(DCM_2_0_grammarParser.Kgr_infoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kgr_info}.
	 * @param ctx the parse tree
	 */
	void exitKgr_info(DCM_2_0_grammarParser.Kgr_infoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#einheit_x}.
	 * @param ctx the parse tree
	 */
	void enterEinheit_x(DCM_2_0_grammarParser.Einheit_xContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#einheit_x}.
	 * @param ctx the parse tree
	 */
	void exitEinheit_x(DCM_2_0_grammarParser.Einheit_xContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#einheit_y}.
	 * @param ctx the parse tree
	 */
	void enterEinheit_y(DCM_2_0_grammarParser.Einheit_yContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#einheit_y}.
	 * @param ctx the parse tree
	 */
	void exitEinheit_y(DCM_2_0_grammarParser.Einheit_yContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#einheit_w}.
	 * @param ctx the parse tree
	 */
	void enterEinheit_w(DCM_2_0_grammarParser.Einheit_wContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#einheit_w}.
	 * @param ctx the parse tree
	 */
	void exitEinheit_w(DCM_2_0_grammarParser.Einheit_wContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#langname}.
	 * @param ctx the parse tree
	 */
	void enterLangname(DCM_2_0_grammarParser.LangnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#langname}.
	 * @param ctx the parse tree
	 */
	void exitLangname(DCM_2_0_grammarParser.LangnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#displayname}.
	 * @param ctx the parse tree
	 */
	void enterDisplayname(DCM_2_0_grammarParser.DisplaynameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#displayname}.
	 * @param ctx the parse tree
	 */
	void exitDisplayname(DCM_2_0_grammarParser.DisplaynameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#var_abhangigkeiten}.
	 * @param ctx the parse tree
	 */
	void enterVar_abhangigkeiten(DCM_2_0_grammarParser.Var_abhangigkeitenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#var_abhangigkeiten}.
	 * @param ctx the parse tree
	 */
	void exitVar_abhangigkeiten(DCM_2_0_grammarParser.Var_abhangigkeitenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#var_abh}.
	 * @param ctx the parse tree
	 */
	void enterVar_abh(DCM_2_0_grammarParser.Var_abhContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#var_abh}.
	 * @param ctx the parse tree
	 */
	void exitVar_abh(DCM_2_0_grammarParser.Var_abhContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#funktionszugehorigkeit}.
	 * @param ctx the parse tree
	 */
	void enterFunktionszugehorigkeit(DCM_2_0_grammarParser.FunktionszugehorigkeitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#funktionszugehorigkeit}.
	 * @param ctx the parse tree
	 */
	void exitFunktionszugehorigkeit(DCM_2_0_grammarParser.FunktionszugehorigkeitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#anzahl_x}.
	 * @param ctx the parse tree
	 */
	void enterAnzahl_x(DCM_2_0_grammarParser.Anzahl_xContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#anzahl_x}.
	 * @param ctx the parse tree
	 */
	void exitAnzahl_x(DCM_2_0_grammarParser.Anzahl_xContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#anzahl_y}.
	 * @param ctx the parse tree
	 */
	void enterAnzahl_y(DCM_2_0_grammarParser.Anzahl_yContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#anzahl_y}.
	 * @param ctx the parse tree
	 */
	void exitAnzahl_y(DCM_2_0_grammarParser.Anzahl_yContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#werteliste}.
	 * @param ctx the parse tree
	 */
	void enterWerteliste(DCM_2_0_grammarParser.WertelisteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#werteliste}.
	 * @param ctx the parse tree
	 */
	void exitWerteliste(DCM_2_0_grammarParser.WertelisteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#werteliste_kwb}.
	 * @param ctx the parse tree
	 */
	void enterWerteliste_kwb(DCM_2_0_grammarParser.Werteliste_kwbContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#werteliste_kwb}.
	 * @param ctx the parse tree
	 */
	void exitWerteliste_kwb(DCM_2_0_grammarParser.Werteliste_kwbContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#sst_liste_x}.
	 * @param ctx the parse tree
	 */
	void enterSst_liste_x(DCM_2_0_grammarParser.Sst_liste_xContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#sst_liste_x}.
	 * @param ctx the parse tree
	 */
	void exitSst_liste_x(DCM_2_0_grammarParser.Sst_liste_xContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kf_zeile_liste}.
	 * @param ctx the parse tree
	 */
	void enterKf_zeile_liste(DCM_2_0_grammarParser.Kf_zeile_listeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kf_zeile_liste}.
	 * @param ctx the parse tree
	 */
	void exitKf_zeile_liste(DCM_2_0_grammarParser.Kf_zeile_listeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kf_zeile_liste_r}.
	 * @param ctx the parse tree
	 */
	void enterKf_zeile_liste_r(DCM_2_0_grammarParser.Kf_zeile_liste_rContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kf_zeile_liste_r}.
	 * @param ctx the parse tree
	 */
	void exitKf_zeile_liste_r(DCM_2_0_grammarParser.Kf_zeile_liste_rContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#kf_zeile_liste_tx}.
	 * @param ctx the parse tree
	 */
	void enterKf_zeile_liste_tx(DCM_2_0_grammarParser.Kf_zeile_liste_txContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#kf_zeile_liste_tx}.
	 * @param ctx the parse tree
	 */
	void exitKf_zeile_liste_tx(DCM_2_0_grammarParser.Kf_zeile_liste_txContext ctx);
	/**
	 * Enter a parse tree produced by {@link DCM_2_0_grammarParser#realzahl}.
	 * @param ctx the parse tree
	 */
	void enterRealzahl(DCM_2_0_grammarParser.RealzahlContext ctx);
	/**
	 * Exit a parse tree produced by {@link DCM_2_0_grammarParser#realzahl}.
	 * @param ctx the parse tree
	 */
	void exitRealzahl(DCM_2_0_grammarParser.RealzahlContext ctx);
}