// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.t2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link T2Parser}.
 */
public interface T2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link T2Parser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(T2Parser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(T2Parser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracoes(T2Parser.ListaDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracoes(T2Parser.ListaDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(T2Parser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(T2Parser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(T2Parser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(T2Parser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmetico(T2Parser.TermoAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmetico(T2Parser.TermoAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterFatorAritmetico(T2Parser.FatorAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitFatorAritmetico(T2Parser.FatorAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(T2Parser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(T2Parser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterTermoRelacional(T2Parser.TermoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitTermoRelacional(T2Parser.TermoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos(T2Parser.ListaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos(T2Parser.ListaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(T2Parser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(T2Parser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(T2Parser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(T2Parser.ComandoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterComandoEntrada(T2Parser.ComandoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitComandoEntrada(T2Parser.ComandoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void enterComandoSaida(T2Parser.ComandoSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void exitComandoSaida(T2Parser.ComandoSaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicao(T2Parser.ComandoCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicao(T2Parser.ComandoCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepeticao(T2Parser.ComandoRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepeticao(T2Parser.ComandoRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void enterSubAlgoritmo(T2Parser.SubAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void exitSubAlgoritmo(T2Parser.SubAlgoritmoContext ctx);
}