package br.ufscar.dc.compiladores.t5;

import br.ufscar.dc.compiladores.t5.TabelaDeSimbolos.EntradaTabelaDeSimbolos;
import br.ufscar.dc.compiladores.t5.TabelaDeSimbolos.TipoAlguma;
import br.ufscar.dc.compiladores.t5.AlgumaParser.Declaracao_constanteContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.Declaracao_variavelContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.Declaracao_globalContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.Declaracao_tipoContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.ProgramaContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.IdentificadorContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.ParametroContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.Tipo_basico_identContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.VariavelContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.Parcela_unarioContext;


import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import br.ufscar.dc.compiladores.t5.AlgumaParser.CmdAtribuicaoContext;

// Novos import
import br.ufscar.dc.compiladores.t5.AlgumaParser.CmdRetorneContext;


public class AlgumaSemantico extends AlgumaBaseVisitor {

    // Ter os escopos para ter as tabelas de símbolos

    Escopo escopo = new Escopo(TabelaDeSimbolos.TipoAlguma.VOID);

    // visitCorpo

    @Override
    public Object visitPrograma(ProgramaContext ctx) {
        return super.visitPrograma(ctx);
    }

    // Classe do Professor de Declarações Modificada

    // Declaração constante + T4

    @Override
    public Object visitDeclaracao_constante(Declaracao_constanteContext ctx) {

        TabelaDeSimbolos tabela = escopo.getEscopo(); // Pegar o peek

        if(tabela.existe(ctx.IDENT().getText())){
            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "constante" + ctx.IDENT().getText()+ " ja declarado anteriormente"); // Erro
        } else {
            TabelaDeSimbolos.TipoAlguma tipo = TabelaDeSimbolos.TipoAlguma.INTEIRO;

            // Escolher os tipos de acordo com o texto - Nova forma T4

            TabelaDeSimbolos.TipoAlguma aux = AlgumaSemanticoUtils.getTipo(ctx.tipo_basico().getText()) ;

            if(aux != null){
                tipo = aux;
            }
            
            tabela.adicionar(ctx.IDENT().getText(), tipo, TabelaDeSimbolos.StructAlguma.CONST); // Colocar na tabela o tipo + t4
        }

        return super.visitDeclaracao_constante(ctx);
    }

    // Declaração Tipo + T4

    @Override
    public Object visitDeclaracao_tipo(Declaracao_tipoContext ctx){

        TabelaDeSimbolos tabela = escopo.getEscopo(); // Pegar o peek

        if(tabela.existe(ctx.IDENT().getText())){

            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "tipo " + ctx.IDENT().getText()+ " declarado duas vezes num mesmo escopo"); // Erro
           
        }else{

            // T4 - Pegar o tipo + Modificações

            TabelaDeSimbolos.TipoAlguma tipo = AlgumaSemanticoUtils.getTipo(ctx.tipo().getText()) ;

            if(tipo != null){
                tabela.adicionar(ctx.IDENT().getText(), tipo, TabelaDeSimbolos.StructAlguma.TIPO); // Colocar na tabela o tipo
            }else if(ctx.tipo().registro() != null){

                ArrayList<TabelaDeSimbolos.EntradaTabelaDeSimbolos> lista = new ArrayList<>(); // Tabelas

                for(VariavelContext va : ctx.tipo().registro().variavel()) {

                    TabelaDeSimbolos.TipoAlguma tipoReg = AlgumaSemanticoUtils.getTipo(va.tipo().getText()) ; // Pegar o tipo

                    for(IdentificadorContext id : va.identificador()) {
                        lista.add(tabela.new EntradaTabelaDeSimbolos(id.getText(), tipoReg, TabelaDeSimbolos.StructAlguma.TIPO)); // Adicionar na lista
                    }
                }

                if(tabela.existe(ctx.IDENT().getText())){

                    AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "identificador " + ctx.IDENT().getText() + " ja declarado anteriormente"); // Erro

                } else {

                    tabela.adicionar(ctx.IDENT().getText(), TabelaDeSimbolos.TipoAlguma.REG, TabelaDeSimbolos.StructAlguma.TIPO); // Colocar na tabela o tipo

                }

                for(TabelaDeSimbolos.EntradaTabelaDeSimbolos entrada : lista) {

                    String nameVer = ctx.IDENT().getText() + '.' + entrada.nome; // Adquirir o nome certo
                     
                    if(tabela.existe(nameVer)){

                        AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "identificador " + nameVer + " ja declarado anteriormente"); // Erro

                    } else {

                        tabela.adicionar(entrada); // Colocar na tabela o tipo + t4
                        tabela.adicionar(ctx.IDENT().getText(),entrada); // Colocar na tabela o tipo + t4

                    }

                }

            }

            tabela.adicionar(ctx.IDENT().getText(), AlgumaSemanticoUtils.getTipo(ctx.tipo().getText()), TabelaDeSimbolos.StructAlguma.TIPO); // Colocar na tabela o tipo + t4

        }  
        return super.visitDeclaracao_tipo(ctx);
    }

    // Declaração variavel + T4

    @Override
    public Object visitDeclaracao_variavel(AlgumaParser.Declaracao_variavelContext ctx) {

        TabelaDeSimbolos tabela = escopo.getEscopo(); // Pegar o peek

       for ( IdentificadorContext ident : ctx.variavel().identificador()) {

            // Adicionar T4 - Algumas preparações
            String nomeId = "";
            int i = 0;

            for(TerminalNode id : ident.IDENT()){
                if(i++ > 0)
                    nomeId += ".";
                nomeId += id.getText();
            }


           if(tabela.existe(nomeId)) {
               AlgumaSemanticoUtils.adicionarErroSemantico(ident.start, "identificador " + nomeId + " ja declarado anteriormente"); // Erro
           } else {

               // Escolher os tipos de acordo com o texto, modo T4

               TabelaDeSimbolos.TipoAlguma tipo = AlgumaSemanticoUtils.getTipo(ctx.variavel().tipo().getText());

               if(tipo != null){
                   tabela.adicionar(nomeId, tipo, TabelaDeSimbolos.StructAlguma.VAR); // Se não for nulo, é VAR no Struct
                }else{

                    TerminalNode identTipo = ctx.variavel().tipo() != null && ctx.variavel().tipo().tipo_estendido() != null && ctx.variavel().tipo().tipo_estendido().tipo_basico_ident() != null  && ctx.variavel().tipo().tipo_estendido().tipo_basico_ident().IDENT() != null ? ctx.variavel().tipo().tipo_estendido().tipo_basico_ident().IDENT() : null;
                    // Verificar se cada argumento é nulo ou não antes de prosseguir

                    if(identTipo != null){

                        // Lista de registradores

                        ArrayList<TabelaDeSimbolos.EntradaTabelaDeSimbolos> lista = null;
                        boolean achou = false;

                        for(TabelaDeSimbolos tab: escopo.getPilhaTabela()){

                            if(!achou && tab.existe(identTipo.getText())){

                                lista = tab.getTabelaTipo(identTipo.getText()); // Vai receber a lista - se existir 
                                achou = true;

                            }

                        }

                        if(tabela.existe(nomeId)){

                            AlgumaSemanticoUtils.adicionarErroSemantico(ident.start, "tipo " + nomeId + " nao declarado"); // Erro

                        }else{

                            tabela.adicionar(nomeId, TabelaDeSimbolos.TipoAlguma.REG, TabelaDeSimbolos.StructAlguma.VAR); // Colocar na tabela o tipo e struct
                            for(TabelaDeSimbolos.EntradaTabelaDeSimbolos entrada : lista) {

                                tabela.adicionar(nomeId + "." + entrada.nome , entrada.tipo, TabelaDeSimbolos.StructAlguma.VAR); // Adicionar na tabela o tipo e struct

                            }

                        }

                    }
                    else if(ctx.variavel().tipo().registro() != null){

                        // Lista de registradores

                        ArrayList<TabelaDeSimbolos.EntradaTabelaDeSimbolos> lista = new ArrayList<>();

                        for(VariavelContext va : ctx.variavel().tipo().registro().variavel()) {

                            TabelaDeSimbolos.TipoAlguma tipoReg = AlgumaSemanticoUtils.getTipo(va.tipo().getText()) ; // Pegar o tipo

                            for(IdentificadorContext id : va.identificador()) {
                                lista.add(tabela.new EntradaTabelaDeSimbolos(id.getText(), tipoReg, TabelaDeSimbolos.StructAlguma.VAR)); // Adicionar na lista
                            }
                        }

                        tabela.adicionar(nomeId, TabelaDeSimbolos.TipoAlguma.REG, TabelaDeSimbolos.StructAlguma.VAR); // Colocar na tabela o tipo e struct

                        for(TabelaDeSimbolos.EntradaTabelaDeSimbolos entrada_2 : lista) {

                            String nameVar = nomeId + '.' + entrada_2.nome;
                            
                            if(tabela.existe(nameVar)){

                                AlgumaSemanticoUtils.adicionarErroSemantico(ident.start, "identificador " + nameVar + " ja declarado anteriormente"); // Erro

                            } else {

                                tabela.adicionar(entrada_2); // Colocar na tabela o tipo e struct
                                tabela.adicionar(nameVar, entrada_2.tipo , TabelaDeSimbolos.StructAlguma.VAR); // Colocar na tabela o tipo e struct

                            }

                        }

                    }else{
                        tabela.adicionar(ident.getText(), TabelaDeSimbolos.TipoAlguma.INTEIRO, TabelaDeSimbolos.StructAlguma.VAR); // Colocar na tabela o tipo
                    }

                }

            }
        
        }

       return super.visitDeclaracao_variavel(ctx);
    }

    // Declaração global + T4

    @Override
    public Object visitDeclaracao_global(Declaracao_globalContext ctx){

        TabelaDeSimbolos tabela = escopo.getEscopo(); // Pegar o peek

        // T4

        if(tabela.existe(ctx.IDENT().getText())){

            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, ctx.IDENT().getText()+ " ja declarado anteriormente"); // Erro
            return super.visitDeclaracao_global(ctx);

        } else {

           // Novas implementações T4

           TabelaDeSimbolos.TipoAlguma tipoRetorno = TabelaDeSimbolos.TipoAlguma.VOID; // Começa retornando nada - VOID

           if(ctx.getText().startsWith("funcao")){

                tipoRetorno = AlgumaSemanticoUtils.getTipo(ctx.tipo_estendido().getText()); // Se for funcao - com retorno - pegar o tipo de retorno dela
                tabela.adicionar(ctx.IDENT().getText(), tipoRetorno, TabelaDeSimbolos.StructAlguma.FUNC); // Colocar na tabela o tipo e a Struct Funcao

           }else{

                // Apenas para Garantir - Verificar se precisa
                
                tabela.adicionar(ctx.IDENT().getText(), tipoRetorno, TabelaDeSimbolos.StructAlguma.PROC); // Colocar na tabela o tipo - que é VOID - e a Struct Procedimento  


           }

           // Fazer a troca T4

            escopo.novoEscopo(tipoRetorno); // Criar um novo escopo
            TabelaDeSimbolos tabelaAux = tabela; // Criar um aux
            tabela = escopo.getEscopo(); // Pegar o peek

            if(ctx.parametros() != null){ // Há parametros ?

                for(ParametroContext param : ctx.parametros().parametro()){

                    for(IdentificadorContext id : param.identificador()){

                        // Adicionar T4 - Algumas preparações
                        String nomeId = "";
                        int i = 0;

                        for(TerminalNode ident : id.IDENT()){
                            if(i++ > 0)
                                nomeId += ".";
                            nomeId += ident.getText();
                        }

                        if(tabela.existe(nomeId)){

                            AlgumaSemanticoUtils.adicionarErroSemantico(id.start, "identificador " + nomeId + " ja declarado anteriormente"); // Erro

                        }else{

                            TabelaDeSimbolos.TipoAlguma tipo = AlgumaSemanticoUtils.getTipo(param.tipo_estendido().getText()); // Pegar o tipo

                            if(tipo !=null){

                                tabela.adicionar(tabela.new EntradaTabelaDeSimbolos(nomeId, tipo, TabelaDeSimbolos.StructAlguma.VAR)); // Colocar na tabela o tipo e a Struct VAR
                                tabelaAux.adicionar(ctx.IDENT().getText(), tabela.new EntradaTabelaDeSimbolos(nomeId, tipo, TabelaDeSimbolos.StructAlguma.VAR)); // Colocar na tabela o tipo e a Struct VAR

                            }else{

                                // Novas implementações T4

                                TerminalNode identTipo = param.tipo_estendido().tipo_basico_ident() != null  && param.tipo_estendido().tipo_basico_ident().IDENT() != null ? param.tipo_estendido().tipo_basico_ident().IDENT() : null;

                                if(identTipo !=null){

                                    // Lista de registradores - TRoca igual ao variavel

                                    ArrayList<TabelaDeSimbolos.EntradaTabelaDeSimbolos> lista = null;
                                    boolean achou = false;

                                    for(TabelaDeSimbolos tab: escopo.getPilhaTabela()){

                                        if(!achou && tab.existe(identTipo.getText())){

                                            lista = tab.getTabelaTipo(identTipo.getText());
                                            achou = true;

                                        }

                                    }
                                    
                                    if(tabela.existe(nomeId)){

                                        AlgumaSemanticoUtils.adicionarErroSemantico(id.start , "identificador " + nomeId+ " ja declarado anteriormente"); // Erro

                                    }else{

                                        tabela.adicionar(tabela.new EntradaTabelaDeSimbolos(nomeId, TabelaDeSimbolos.TipoAlguma.REG , TabelaDeSimbolos.StructAlguma.VAR)); // Colocar na tabela o tipo e a Struct VAR
                                        tabelaAux.adicionar(ctx.IDENT().getText(), tabela.new EntradaTabelaDeSimbolos(nomeId, TabelaDeSimbolos.TipoAlguma.REG, TabelaDeSimbolos.StructAlguma.VAR)); // Colocar na tabela o tipo e a Struct VAR  

                                        for(TabelaDeSimbolos.EntradaTabelaDeSimbolos entrada : lista) {

                                            tabela.adicionar(tabela.new EntradaTabelaDeSimbolos(nomeId + "." + entrada.nome, entrada.tipo, TabelaDeSimbolos.StructAlguma.VAR)); // Colocar na tabela o tipo e a Struct VAR

                                        }

                                    }

                                }

                            }

                        }
                        
                    }

                }

            }

            Object ret; // Usado para salvar o retorno
            ret = super.visitDeclaracao_global(ctx); // Visitar o global
            escopo.delEscopo(); // Tirar o escopo
            return ret;

        }

    }


    // Visit Tipo Basico

    @Override
    public Object visitTipo_basico_ident(Tipo_basico_identContext ctx){

        if(ctx.IDENT() != null){

            // Novas implementações T4

            boolean achou = false; // Apenas certificar que achou

            for(TabelaDeSimbolos escopos : escopo.getPilhaTabela()){ // Verificar se o tipo existe

                if(escopos.existe(ctx.IDENT().getText())){

                    achou = true; // Só tem que achar uma vez

                    break; // Somente print uma vez

                }

            }

            if(!achou){

                AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "tipo " + ctx.IDENT().getText() + " nao declarado"); // Erro

            }

        }

        return super.visitTipo_basico_ident(ctx);  

    }

    // Visit Identificador

    @Override
    public Object visitIdentificador(IdentificadorContext ctx) {

        // Algumas preparações para o T4

        String nomeVar = "";
        int i = 0;
        boolean achou = true;

        for(TerminalNode id : ctx.IDENT()){

            if(i++ > 0)
                nomeVar += ".";
            nomeVar += id.getText();

        }

        for(TabelaDeSimbolos escopos : escopo.getPilhaTabela()){ // Verificar se o identificador existe

            if(escopos.existe(nomeVar)){

                achou = false; // Só tem que achar uma vez

                break; // Somente print uma vez
            }

        }

        if(achou){

            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "identificador " + nomeVar + " nao declarado"); // Erro

        }

        return super.visitIdentificador(ctx); 

    }

    // Visit Cmd Atribuicao

    @Override
    public Object visitCmdAtribuicao(CmdAtribuicaoContext ctx){

        TabelaDeSimbolos.TipoAlguma tipo = AlgumaSemanticoUtils.verificarTipo(escopo, ctx.expressao()); // Verificar o tipo

        boolean erro = false; // Se já tem erro
        String var = "";

        // Novas implementações T4

        String pointer = ctx.getText().charAt(0) ==  '^' ? "^" : ""; // Se é ponteiro
        int i = 0;

        for(TerminalNode id : ctx.identificador().IDENT()){

            if(i++ > 0)
                var += ".";
            var += id.getText();

        }

        if(tipo != TabelaDeSimbolos.TipoAlguma.INVALIDO){

            // Verificar se já foi achado
            boolean achou = false;

            for(TabelaDeSimbolos escopos : escopo.getPilhaTabela()){

                if(escopos.existe(var) && !achou){

                    // T4
                    achou = true;

                    TabelaDeSimbolos.TipoAlguma tipoVar = AlgumaSemanticoUtils.verificarTipo(escopo, var); // Verificar o tipo da var

                    // Pegar os tipos
                    Boolean expNumeric = tipo == TabelaDeSimbolos.TipoAlguma.INTEIRO || tipo == TabelaDeSimbolos.TipoAlguma.REAL;
                    Boolean varNumeric = tipoVar == TabelaDeSimbolos.TipoAlguma.INTEIRO || tipoVar == TabelaDeSimbolos.TipoAlguma.REAL;

                    if(!(expNumeric && varNumeric) && tipo != tipoVar && tipo != TabelaDeSimbolos.TipoAlguma.INVALIDO){

                        erro = true;

                    }

                }

            }

        } else {

            erro = true;

        }

        if(erro){

                AlgumaSemanticoUtils.adicionarErroSemantico(ctx.identificador().start,"atribuicao nao compativel para " + pointer +  ctx.identificador().getText()); // Adcionar o nome de Pointer + Var
    
            }
        

        return super.visitCmdAtribuicao(ctx);  

    }

    // Visit Cmd Retorne - Implementação T4

    @Override
    public Object visitCmdRetorne(CmdRetorneContext ctx){

        if(escopo.getEscopo().tipo == TabelaDeSimbolos.TipoAlguma.VOID){

            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "comando retorne nao permitido nesse escopo"); // Apenas adicionando o erro para o comando de retorno
        
        }

        return super.visitCmdRetorne(ctx);

    }

    // Visit Parcela Unario - Implementação T4

    @Override
    public Object visitParcela_unario(Parcela_unarioContext ctx){

        TabelaDeSimbolos tabela = escopo.getEscopo(); // Pegar o peek

        if(ctx.IDENT() != null){

            String namePar = ctx.IDENT().getText(); // Pegar o nome

            if(tabela.existe(ctx.IDENT().getText())){

                List<EntradaTabelaDeSimbolos> params = tabela.getTabelaTipo(namePar); // Pegar o tipo do nome
                boolean achou = false;

                if(params.size()!= ctx.expressao().size()){

                    achou = true;

                }else{
                        
                    for(int i = 0; i < params.size(); i++){
    
                        if(AlgumaSemanticoUtils.verificarTipo(escopo, ctx.expressao().get(i)) != params.get(i).tipo){
    
                            achou = true;
    
                        }
    
                    }
                
                }

                if(achou){

                    AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "incompatibilidade de parametros na chamada de " + namePar); // Erro

                }

            }

        }

        return super.visitParcela_unario(ctx);

    }


}