// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.t6;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaParser}.
 */
public interface AlgumaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#agente}.
	 * @param ctx the parse tree
	 */
	void enterAgente(AlgumaParser.AgenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#agente}.
	 * @param ctx the parse tree
	 */
	void exitAgente(AlgumaParser.AgenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#sinergia}.
	 * @param ctx the parse tree
	 */
	void enterSinergia(AlgumaParser.SinergiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#sinergia}.
	 * @param ctx the parse tree
	 */
	void exitSinergia(AlgumaParser.SinergiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#mapa}.
	 * @param ctx the parse tree
	 */
	void enterMapa(AlgumaParser.MapaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#mapa}.
	 * @param ctx the parse tree
	 */
	void exitMapa(AlgumaParser.MapaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(AlgumaParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(AlgumaParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#declaracao_agente}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_agente(AlgumaParser.Declaracao_agenteContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#declaracao_agente}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_agente(AlgumaParser.Declaracao_agenteContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#declaracao_sinergia}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_sinergia(AlgumaParser.Declaracao_sinergiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#declaracao_sinergia}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_sinergia(AlgumaParser.Declaracao_sinergiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#declaracao_mapa}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_mapa(AlgumaParser.Declaracao_mapaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#declaracao_mapa}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_mapa(AlgumaParser.Declaracao_mapaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#saida}.
	 * @param ctx the parse tree
	 */
	void enterSaida(AlgumaParser.SaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#saida}.
	 * @param ctx the parse tree
	 */
	void exitSaida(AlgumaParser.SaidaContext ctx);
}