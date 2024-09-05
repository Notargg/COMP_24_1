// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.t6;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlgumaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlgumaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#agente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgente(AlgumaParser.AgenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#sinergia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinergia(AlgumaParser.SinergiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#mapa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapa(AlgumaParser.MapaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(AlgumaParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#declaracao_agente}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_agente(AlgumaParser.Declaracao_agenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#declaracao_sinergia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_sinergia(AlgumaParser.Declaracao_sinergiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#declaracao_mapa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_mapa(AlgumaParser.Declaracao_mapaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaParser#saida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaida(AlgumaParser.SaidaContext ctx);
}