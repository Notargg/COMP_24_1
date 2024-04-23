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
	 * Enter a parse tree produced by {@link T2Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(T2Parser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(T2Parser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(T2Parser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(T2Parser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(T2Parser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(T2Parser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(T2Parser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(T2Parser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(T2Parser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(T2Parser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(T2Parser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(T2Parser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(T2Parser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(T2Parser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(T2Parser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(T2Parser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(T2Parser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(T2Parser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(T2Parser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(T2Parser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(T2Parser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(T2Parser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(T2Parser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(T2Parser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(T2Parser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(T2Parser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(T2Parser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(T2Parser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(T2Parser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(T2Parser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(T2Parser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(T2Parser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(T2Parser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(T2Parser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(T2Parser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(T2Parser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(T2Parser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(T2Parser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(T2Parser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(T2Parser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(T2Parser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(T2Parser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(T2Parser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(T2Parser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(T2Parser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(T2Parser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(T2Parser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(T2Parser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(T2Parser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(T2Parser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(T2Parser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(T2Parser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(T2Parser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(T2Parser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(T2Parser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(T2Parser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(T2Parser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(T2Parser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(T2Parser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(T2Parser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(T2Parser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(T2Parser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(T2Parser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(T2Parser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(T2Parser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(T2Parser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(T2Parser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(T2Parser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(T2Parser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(T2Parser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(T2Parser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(T2Parser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(T2Parser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(T2Parser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(T2Parser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(T2Parser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(T2Parser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(T2Parser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(T2Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(T2Parser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(T2Parser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(T2Parser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(T2Parser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(T2Parser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(T2Parser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(T2Parser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(T2Parser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(T2Parser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(T2Parser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(T2Parser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(T2Parser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(T2Parser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(T2Parser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(T2Parser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link T2Parser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(T2Parser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link T2Parser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(T2Parser.Op_logico_2Context ctx);
}