package br.ufscar.dc.compiladores.t5;

import br.ufscar.dc.compiladores.t5.TabelaDeSimbolos.EntradaTabelaDeSimbolos;

// Importação necessária para a classe

import br.ufscar.dc.compiladores.t5.AlgumaParser.Declaracao_globalContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.Declaracao_localContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.DimensaoContext;

import br.ufscar.dc.compiladores.t5.AlgumaParser.Exp_aritmeticaContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.Exp_relacionalContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.ExpressaoContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.FatorContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.Fator_logicoContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.CmdAtribuicaoContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.CmdCasoContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.CmdChamadaContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.CmdContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.CmdEnquantoContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.CmdEscrevaContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.CmdFacaContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.CmdLeiaContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.CmdParaContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.CmdRetorneContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.CmdSeContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.CmdSenaoContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.CorpoContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.Declaracao_constanteContext;

import br.ufscar.dc.compiladores.t5.AlgumaParser.IdentificadorContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.Item_selecaoContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.ParametroContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.ParcelaContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.Parcela_logicaContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.Parcela_nao_unarioContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.Parcela_unarioContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.RegistroContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.SelecaoContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.TermoContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.Termo_logicoContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.TipoContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.Tipo_basico_identContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.Valor_constanteContext;
import br.ufscar.dc.compiladores.t5.AlgumaParser.VariavelContext;


import java.util.ArrayList;
import java.util.Arrays;

import org.antlr.v4.runtime.tree.TerminalNode;

public class AlgumaGeradorC extends AlgumaBaseVisitor<Void> {

    StringBuilder saida;
    TabelaDeSimbolos tabela;

    public AlgumaGeradorC() {
        saida = new StringBuilder();
        this.tabela = new TabelaDeSimbolos(null);
    }

    // Declaracao de tudo - Começo do Programa

    @Override
    public Void visitPrograma(AlgumaParser.ProgramaContext ctx) {

        // Inclui os cabeçalhos necessários para o Programa em C

        saida.append("#include <stdio.h>\n");
        saida.append("#include <stdlib.h>\n");
        saida.append("#include <string.h>\n");

        // Apenas deixar mais bonito

        saida.append("\n");

        // Visitar o programa

        ctx.declaracoes().declaracao_local_global().forEach(dec -> visitDeclaracao_local_global(dec));

        // Inicio do Programa
        saida.append("int main() {\n");

        // Visitar o bloco
        visitCorpo(ctx.corpo());

        // Fim do Programa
        saida.append("return 0; \n");
        saida.append("}\n");

        // Fim da função
        return null;
    }

    // Corpo

    @Override
    public Void visitCorpo(CorpoContext ctx) {

        // Ver todas as declaracoes locais
        for (AlgumaParser.Declaracao_localContext dec : ctx.declaracao_local()) {
            visitDeclaracao_local(dec);
        }

        // Ver todos os comandos
        for (AlgumaParser.CmdContext com : ctx.cmd()) {
            visitCmd(com);
        }

        // Retornar null
        return null;
    }

    // Identificador

    @Override
    public Void visitIdentificador(IdentificadorContext ctx) {

        // Espaço para ficar bonito
        saida.append(" ");

        // Número de identificadores
        int i = 0;

        // Ver todos os identificadores
        for (TerminalNode id : ctx.IDENT()) {

            // Dividir, a partir do primeiro, em ,
            if (i++ > 0)
                saida.append(".");

            // Colocar na saída
            saida.append(id.getText());
        }

        // Visitar Dimensao
        visitDimensao(ctx.dimensao());

        // Retorna null
        return null;
    }

    // Dimensão

    @Override
    public Void visitDimensao(DimensaoContext ctx) {

        // Passar pelas exp
        for (Exp_aritmeticaContext exp_a : ctx.exp_aritmetica()) {

            // Colchete no início
            saida.append("[");

            // Visitar a expressão arit
            visitExp_aritmetica(exp_a);

            // Colchete na saída
            saida.append("]");
        }

        return null;
    }

    // Exp

    @Override
    public Void visitExpressao(ExpressaoContext ctx) {

        // Há Termos Lógicos 
        if (ctx.termo_logico() != null) {

            // Visita o primeiro
            visitTermo_logico(ctx.termo_logico(0));

            // Verifica os outros termos lógcos
            for (int i = 1; i < ctx.termo_logico().size(); i++) {

                // Pegar o termo logico
                AlgumaParser.Termo_logicoContext termo = ctx.termo_logico(i);

                // Adiciona o termo
                saida.append(" || ");

                // Visita ele
                visitTermo_logico(termo);
            }
        }
        
        // Retorna null
        return null;
    }

    // Exp Aritmetica

    @Override
    public Void visitExp_aritmetica(Exp_aritmeticaContext ctx) {

        // Visitar o primeiro termo
        visitTermo(ctx.termo(0));

        // Verificar a presença de outros termos
        for (int i = 1; i < ctx.termo().size(); i++) {

            // Pega o termo
            AlgumaParser.TermoContext termo = ctx.termo(i);

            // Colocar na saída
            saida.append(ctx.op1(i - 1).getText());

            // Visita o termo
            visitTermo(termo);
        }

        // Retorna null
        return null;
    }

    // Exp Relacional

    @Override
    public Void visitExp_relacional(Exp_relacionalContext ctx) {

        // Visitar a primeira exp_ar
        visitExp_aritmetica(ctx.exp_aritmetica(0));

        // Verificar a presença de outras
        for (int i = 1; i < ctx.exp_aritmetica().size(); i++) {

            // Pegar a exp_ar
            AlgumaParser.Exp_aritmeticaContext termo = ctx.exp_aritmetica(i);

            // Se for =, trata. Se não, op_relacional trata
            if (ctx.op_relacional().getText().equals("=")) {
                saida.append(" == ");
            } else {
                saida.append(ctx.op_relacional().getText());
            }

            // Visitar a exp
            visitExp_aritmetica(termo);
        }

        // Retorna null
        return null;
    }

    // Termo

    @Override
    public Void visitTermo(TermoContext ctx) {

        // Visitar o primeiro fator
        visitFator(ctx.fator(0));

        // Verificar a presença de outros fatores
        for (int i = 1; i < ctx.fator().size(); i++) {

            // Pegar o fator
            AlgumaParser.FatorContext fator = ctx.fator(i);

            // Colocar na saída
            saida.append(ctx.op2(i - 1).getText());

            // Visitar o fator
            visitFator(fator);
        }

        // Retorna null
        return null;
    }

    // Termo Logico

    @Override
    public Void visitTermo_logico(Termo_logicoContext ctx) {

        // Visitar o primeiro fator
        visitFator_logico(ctx.fator_logico(0));

        // Verificar a presença de outros fatores
        for (int i = 1; i < ctx.fator_logico().size(); i++) {

            // Pegar o fator
            AlgumaParser.Fator_logicoContext fator = ctx.fator_logico(i);

            // Colocar na saída
            saida.append(" && ");

            // Visitar o fator
            visitFator_logico(fator);
        }

        // Não possui retorno explícito, retorna 'null'.
        return null;
    }

    // Fator

    @Override
    public Void visitFator(FatorContext ctx) {

        // Visitar a primeira parcela
        visitParcela(ctx.parcela(0));

        // Verificar a presença de outras parcelas
        for (int i = 1; i < ctx.parcela().size(); i++) {

            // Pegar a parcela
            AlgumaParser.ParcelaContext parcela = ctx.parcela(i);

            // Colocar na saída
            saida.append(ctx.op3(i - 1).getText());

            // Visitar a parcela
            visitParcela(parcela);
        }

        // Retorna null
        return null;
    }

    // Fator Lógico

    @Override
    public Void visitFator_logico(Fator_logicoContext ctx) {

        // Negação no começo
        if (ctx.getText().startsWith("nao")) {
            saida.append("!");
        }

        // Visita a parcela lógica
        visitParcela_logica(ctx.parcela_logica());

        // Retorna null
        return null;
    }

    // Parcela Lógica

    @Override
    public Void visitParcela_logica(Parcela_logicaContext ctx) {

        // Há alguma Exp Rel
        if (ctx.exp_relacional() != null) {
            // Se tiver, visite
            visitExp_relacional(ctx.exp_relacional());
        } 
        else if (ctx.getText().equals("verdadeiro")){

            //  Verdaeiro
            saida.append("true");
            
        }
        else if (ctx.getText().equals("falso")){
            // Falso
            saida.append("false");
        }

        // Retorna null
        return null;
    }

    // Parcela

    @Override
    public Void visitParcela(ParcelaContext ctx) {

        // Descobrir se é unária ou não a parcela
        if (ctx.parcela_unario() != null) {

            // Se for unária, verificar a existência do operador
            if (ctx.op_unario() != null) {
                saida.append(ctx.op_unario().getText()); // Dar print dele
            }

            // Visitar parcela unaria
            visitParcela_unario(ctx.parcela_unario());
        } else {

            // Se não for unario, visitar esta
            visitParcela_nao_unario(ctx.parcela_nao_unario());
        }

        // Retorna null
        return null;
    }

    // Parcela Unaria
  
    @Override
    public Void visitParcela_unario(Parcela_unarioContext ctx) {

        // Verificar o identificador

        if (ctx.IDENT() != null) {

            // Colocar na saída
            saida.append(ctx.IDENT().getText());

            // Abrir chaves
            saida.append("(");

            // Pega quantidade de expressões, percrrer
            for (int i = 0; i < ctx.expressao().size(); i++) {

                // Visitar ela
                visitExpressao(ctx.expressao(i));

                // Dar print de vírugla a partir da primeira
                if (i < ctx.expressao().size() - 1) {
                    saida.append(", ");
                }
            }

            // Fechar parenteses
            saida.append(")");
        } 
        
        else if (ctx.parentesis_expressao() != null) {
            saida.append("(");
            visitExpressao(ctx.parentesis_expressao().expressao());
            saida.append(")");
            
        } else {
            saida.append(ctx.getText());
        }

        // Retorna null
        return null;
    }

    // Parcela nao nario

    @Override
    public Void visitParcela_nao_unario(Parcela_nao_unarioContext ctx) {
        // Adicionar a saída
        saida.append(ctx.getText());

        // Retonar null
        return null;
    }


    // Declaracao de Local / Global 

    @Override
    public Void visitDeclaracao_local_global(AlgumaParser.Declaracao_local_globalContext ctx) {

        // Verifica se é uma declaração local ou global
        // Com isso encaminha para o local certo

        if (ctx.declaracao_local() != null) {
            visitDeclaracao_local(ctx.declaracao_local());
        } else {
            visitDeclaracao_global(ctx.declaracao_global());
        }

        // Fim da função
        return null;
    }

    // Declaração Global

    @Override
    public Void visitDeclaracao_global(Declaracao_globalContext ctx) {

        // Verifica se é uma declaração de procedimento ou função
        // Com isso encaminha para o local certo

        if (ctx.getText().contains("procedimento")) { // Procedimento não possui um tipo de retorno

            saida.append("void " + ctx.IDENT().getText() + "("); // Abre o parenteses para conseguir adicionar os parametros

            
        } else { 

            // Se não for procedimento, vai ser uma função - dessa forna possui um tipo de retorno
            // Pegar esse tipo, que pode começar ou não com ^, visto que é ^? - tratar

            String tipoC = AlgumaSemanticoUtils.getTipoC(ctx.tipo_estendido().getText().replace("^", "")); 

            // Pegar o tipo de retorno da função, mas para a Linguagem Alguma
            TabelaDeSimbolos.TipoAlguma tipo = AlgumaSemanticoUtils.getTipo(ctx.tipo_estendido().getText());

            // Como é uma função com retorno, visitar o tipo estendido
            visitTipo_estendido(ctx.tipo_estendido());

            // Caso o tipo for C - Apenas para brincar colocar 5 de tamanho
            if(tipoC == "char"){
                saida.append("[5]");
            }
            // O restante não precisa de um argumento a mais, então só colocar na saída resolve

            saida.append(" " + ctx.IDENT().getText() + "("); // Espaço para adicionar os parametros

            tabela.adicionar(ctx.IDENT().getText(), tipo, TabelaDeSimbolos.StructAlguma.FUNC); // Colocar na tabela o tipo FUNC
            
        }

        // Verificar se tem parametros - se tiver tratar
        ctx.parametros().parametro().forEach(par -> visitParametro(par));
        saida.append("){\n"); // Espaço para ficar agradável

        // Verificar se tem declaracoes locais - se tiver tratar
        ctx.declaracao_local().forEach(dec_l -> visitDeclaracao_local(dec_l));

        // Verificar se tem comandos - se tiver tratar
        ctx.cmd().forEach(cmds -> visitCmd(cmds));

        saida.append("}\n"); // Espaço para ficar agradável

        // Fim da função
        return null;
    }

    // Declaração Local

    @Override
    public Void visitDeclaracao_local(Declaracao_localContext ctx) {
        
        // A declaracao local pode ser 3 coisas

        if(ctx.declaracao_variavel() != null){ // Declaracao de variavel
            visitDeclaracao_variavel(ctx.declaracao_variavel());
        }
        if(ctx.declaracao_constante() != null){ // Declaracao de constante
            visitDeclaracao_constante(ctx.declaracao_constante());
        } 
        else if(ctx.declaracao_tipo() != null){ // Declaracao de tipo
            visitDeclaracao_tipo(ctx.declaracao_tipo());
        }

        return null; // Se nao for nada disso, segue a vida
    }

    // Declaracao Variavel

    @Override
    public Void visitDeclaracao_variavel(AlgumaParser.Declaracao_variavelContext ctx) {

        // Visitar variavel
        visitVariavel(ctx.variavel());

        // Retornar null
        return null;

    }


    // Declaracao Constante

    @Override
    public Void visitDeclaracao_constante(Declaracao_constanteContext ctx) {

        // Pegar o tipo de C da constante
        String tipoC = AlgumaSemanticoUtils.getTipoC(ctx.tipo_basico().getText());

        // Pegar o tipo de retorno da função, mas para a Linguagem Alguma
        TabelaDeSimbolos.TipoAlguma typeVar = AlgumaSemanticoUtils.getTipo(ctx.tipo_basico().getText());

        // Adicionar na tabela de simbolos
        tabela.adicionar(ctx.IDENT().getText(),typeVar,TabelaDeSimbolos.StructAlguma.VAR);

        // Colocar na saída o tipo da constante, espaço para ficar bonito, o nome da constante, espaço para ficar bonito, e o operador =
        saida.append("const " + tipoC + " " + ctx.IDENT().getText() + " = ");

        // Prosseguir para constante
        visitValor_constante(ctx.valor_constante());

        // Adicionar ponto e virgula para finalizar a declaração + quebra de linha
        saida.append(";\n");

        // Retornar null
        return null;
    }

    @Override
    public Void visitDeclaracao_tipo(AlgumaParser.Declaracao_tipoContext ctx) {

        // Saída com a paralavra "typedef" 
        saida.append("typedef ");

        // Pegar o tipo , mas para a Linguagem Alguma
        TabelaDeSimbolos.TipoAlguma tipo = AlgumaSemanticoUtils.getTipo(ctx.tipo().getText());
       
        // Se for um tipo registro
        if(ctx.tipo().getText().contains("registro")){
            for(VariavelContext var : ctx.tipo().registro().variavel()){
                for(IdentificadorContext id : var.identificador()){

                    // Pegar o tipo , mas para a Linguagem Alguma
                    TabelaDeSimbolos.TipoAlguma tipoReg = AlgumaSemanticoUtils.getTipo(var.tipo().getText());

                    // Adicionar na tabela de simbolos
                    tabela.adicionar(ctx.IDENT().getText() + "." + id.getText(), tipoReg, TabelaDeSimbolos.StructAlguma.VAR);
                    tabela.adicionar(ctx.IDENT().getText(), tabela.new EntradaTabelaDeSimbolos(id.getText(), tipoReg, TabelaDeSimbolos.StructAlguma.TIPO));
                }
            }
        }

        // Adicionar na tabela de simbolos
        tabela.adicionar(ctx.IDENT().getText(), tipo, TabelaDeSimbolos.StructAlguma.VAR);

        // Visitar o tipo de declaração
        visitTipo(ctx.tipo());

        // Adicionar o nome do tipo, ; e uma quebra de linha
        saida.append(ctx.IDENT() + ";\n");

        // Retornar null
        return null;
    }

    // Tipo
    
    @Override
    public Void visitTipo(TipoContext ctx) {
  
        // Pegar esse tipo, que pode começar ou não com ^, visto que é ^? - tratar
        String tipoC = AlgumaSemanticoUtils.getTipoC(ctx.getText().replace("^", ""));

        // Bool para ponteiro
        boolean pointer = ctx.getText().contains("^");

        // Var
        if (tipoC != null) {
            saida.append(tipoC);
        }

        // Registro
        else if (ctx.registro() != null) {
            visitRegistro(ctx.registro());
        }
        // Se não for, segue oflixo
        else {
            visitTipo_estendido(ctx.tipo_estendido());
        }

        // Caso for ponteiro, adicionar *
        if (pointer)
            saida.append("*");


        // Retorna null;
        return null;
    }
    
    // Tipo estendido

    @Override
    public Void visitTipo_estendido(AlgumaParser.Tipo_estendidoContext ctx) {

        // Visita o tipo basico
        visitTipo_basico_ident(ctx.tipo_basico_ident());

        // Verifica se o tipo estendido é um ponteiro, se for, adiciona um * na saída.

        if (ctx.getText().contains("^"))
            saida.append("*");

        // Retornar null
        return null;
    }

    // Tipo Basico Estendido

    @Override
    public Void visitTipo_basico_ident(Tipo_basico_identContext ctx) {

        // Verificar se é um ident
        if (ctx.IDENT() != null) {
            saida.append(ctx.IDENT().getText());
        }
        else {

            // Se não for, é um tipo Basico - Tratar se for com ^
            saida.append(AlgumaSemanticoUtils.getTipoC(ctx.getText().replace("^", "")));
        }

        // Retornar null
        return null;
    }

    // Registro

    @Override
    public Void visitRegistro(RegistroContext ctx) {

        // Adiciona a saída
        saida.append("struct {\n");

        // Visita as variaveis
        ctx.variavel().forEach(var -> visitVariavel(var));

        // Adiciona a saída
        saida.append("} ");

        // Retorna null
        return null;
    }

    // Parametro

    @Override
    public Void visitParametro(ParametroContext ctx) {

        // Controlar número de parametros
        int i = 0;

        // Pegar esse tipo, que pode começar ou não com ^, visto que é ^? - tratar

        String tipoC = AlgumaSemanticoUtils.getTipoC(ctx.tipo_estendido().getText().replace("^", ""));

        // Pegar o tipo , mas para a Linguagem Alguma

        TabelaDeSimbolos.TipoAlguma tipo = AlgumaSemanticoUtils.getTipo(ctx.tipo_estendido().getText());

        // Prcoorrer os identificadores
        for (IdentificadorContext id : ctx.identificador()) {

            // Separar por , depois do primeiro parametro
            if (i++ > 0)
                saida.append(",");

            // Visit estendido para tratar os parametros
            visitTipo_estendido(ctx.tipo_estendido());

            // Visita identificador para tratar os parametros
            visitIdentificador(id);

            // Caso o tipo for C - Apenas para brincar colocar 5 de tamanho
            if (tipoC.equals("char")) {
                saida.append("[5]");
            }

            // Adiciona na tabela
            tabela.adicionar(id.getText(), tipo, TabelaDeSimbolos.StructAlguma.VAR);
        }

        // Retorna null
        return null;
    }

    // Variavel



    @Override
    public Void visitVariavel(VariavelContext ctx) {

         // Pegar esse tipo, que pode começar ou não com ^, visto que é ^? - tratar
        String tipoC = AlgumaSemanticoUtils.getTipoC(ctx.tipo().getText().replace("^", ""));

        // Pegar o tipo , mas para a Linguagem Alguma
        TabelaDeSimbolos.TipoAlguma tipo = AlgumaSemanticoUtils.getTipo(ctx.tipo().getText());

        // Passar pelos ident
        for (AlgumaParser.IdentificadorContext id : ctx.identificador()) {

            // COntem registro
            if (ctx.tipo().getText().contains("registro")) {

                // Pssar por cada variavel e indetificador
                for (VariavelContext var : ctx.tipo().registro().variavel()) {
                    for (IdentificadorContext ident : var.identificador()) {

                        // Pegar o tipo , mas para a Linguagem Alguma, além de adicionar na tabela
                        TabelaDeSimbolos.TipoAlguma tipoIns = AlgumaSemanticoUtils.getTipo(var.tipo().getText());
                        tabela.adicionar(id.getText() + "." + ident.getText(), tipoIns, TabelaDeSimbolos.StructAlguma.VAR);
                    }
                }
            }

            // Tipo Novo
            else if (tipoC == null && tipo == null) {

                // Pegar o array
                ArrayList<EntradaTabelaDeSimbolos> arg = tabela.getTabelaTipo(ctx.tipo().getText());
                // Se tiver algo, adicionar na tabela
                if (arg != null) {
                    for (TabelaDeSimbolos.EntradaTabelaDeSimbolos val : arg) {
                        tabela.adicionar(id.getText() + "." + val.nome, val.tipo, TabelaDeSimbolos.StructAlguma.VAR);
                    }
                }
            }

            // Verificar se é vetor
            if (id.getText().contains("[")) {

                // Pegar o começo e o final
                int ini = id.getText().indexOf("[", 0);
                int end = id.getText().indexOf("]", 0);

                // Pegar o tamanho
                String tam = id.getText().substring(ini + 1, end);

                // Pegar o nome - onde comeca
                String nome = id.IDENT().get(0).getText();

                // Tamanho em int
                int tamanho = Integer.parseInt(tam);

                // Iterar e adicionar na tabela
                for (int i = 0; i < tamanho; i++) {
                    tabela.adicionar(nome + "[" + i + "]", tipo, TabelaDeSimbolos.StructAlguma.VAR);
                }

            }

            
            else {
                // Se não for, adicionar na tabela
                tabela.adicionar(id.getText(), tipo, TabelaDeSimbolos.StructAlguma.VAR);
            }

            // Visita tipo
            visitTipo(ctx.tipo());

            // Visita o ident
            visitIdentificador(id);

            // Tratar char
            if (tipoC == "char") {
                saida.append("[10]");
            }

            // Finaliza o programa
            saida.append(";\n");
        }

        // Retorna null
        return null;
    }

    // Valor Constante

    @Override
    public Void visitValor_constante(Valor_constanteContext ctx) {

        // Verificar se o valor constante é Vdd ou Falso - Para mudar
        if (ctx.getText().equals("verdadeiro")) {
            saida.append("true");
        } 
        
        else if (ctx.getText().equals("falso")) {
            saida.append("false");
        } 
        
        else { // O resto pode ser tratado como está
            saida.append(ctx.getText());
        }

        // Retornar null
        return null;
    }

    // Cmd

    @Override
    public Void visitCmd(CmdContext ctx) {
    
        // Dependendo do comando, chama a função correta
    
        if (ctx.cmdLeia() != null) { // Cmd Leia
            visitCmdLeia(ctx.cmdLeia());
        } 
    
        else if (ctx.cmdEscreva() != null) { // Cmd Escreva
            visitCmdEscreva(ctx.cmdEscreva());
        } 
    
        else if (ctx.cmdAtribuicao() != null) { // Cmd Atribuição
            visitCmdAtribuicao(ctx.cmdAtribuicao());
        } 
            
        else if (ctx.cmdSe() != null) { // Cmd Se
            visitCmdSe(ctx.cmdSe());
        } 
            
        else if (ctx.cmdCaso() != null) { // Cmd Caso
            visitCmdCaso(ctx.cmdCaso());
        } 
            
        else if (ctx.cmdPara() != null) { // Cmd Para
            visitCmdPara(ctx.cmdPara());
        } 
            
        else if (ctx.cmdEnquanto() != null) { // Cmd Enquanto
            visitCmdEnquanto(ctx.cmdEnquanto());
        } 
            
        else if (ctx.cmdFaca() != null) { // Cmd Faça
            visitCmdFaca(ctx.cmdFaca());
        } 
            
        else if (ctx.cmdChamada() != null) { // Cmd Chamada
            visitCmdChamada(ctx.cmdChamada());
        } 
            
        else if (ctx.cmdRetorne() != null) { // Cmd Retorne
            visitCmdRetorne(ctx.cmdRetorne());
        }
            
        // Retornar null
        return null;
    }

    // CMD Retorne

    @Override
    public Void visitCmdRetorne(CmdRetorneContext ctx) {

        // return na sauda
        saida.append("return ");

        // Visita a expressão 
        visitExpressao(ctx.expressao());

        // Finalizar com ; e \n

        saida.append(";\n");

        // Retornar null
        return null;
    }

    // CMD Chamada

    @Override
    public Void visitCmdChamada(CmdChamadaContext ctx) {

        // Adicionar nome da chamada + (
        saida.append(ctx.IDENT().getText()).append("(");

        // Quantas expressões tera
        int i = 0;

        // Passar por todas as expressões
        for (ExpressaoContext exp : ctx.expressao()) {

            // Colocar , a partir da primeira
            if (i++ > 0)
                saida.append(",");

            // Visitar a expressao
            visitExpressao(exp);

        }

        // Fechar a chamada com ) ; e quebra de linhas
        saida.append(");\n");

        // Retornar null
        return null;
    }

    // CMD Leia
 
    @Override
    public Void visitCmdLeia(CmdLeiaContext ctx) {

        // Andar pelos identificadores
        for (AlgumaParser.IdentificadorContext id : ctx.identificador()) {

            // Pegar o tupo
            TabelaDeSimbolos.TipoAlguma identTipo = tabela.verificar(id.getText());

            // Se for diferente de cadeia, pegar por Scanf
            if (identTipo != TabelaDeSimbolos.TipoAlguma.CADEIA) {

                // Adicionar operacao na saída
                saida.append("scanf(\"%").append(AlgumaSemanticoUtils.getTipoAlgumaC(identTipo)).append("\", &");

                // Adicionar o nome, ) ; e quebra de linha
                saida.append(id.getText()).append(");\n");

            } else {

                // Se for cadeia
                saida.append("gets(");

                // Visitar o ident
                visitIdentificador(id);

                // Adicionar na saída
                saida.append(");\n");
            }
        }

        // Retornar null
        return null;
    }

    // CMD Escreva

    @Override

    public Void visitCmdEscreva(CmdEscrevaContext ctx) {

        // Andar pelas exp
        for (AlgumaParser.ExpressaoContext exp : ctx.expressao()) {

            // Novo escopo para percorrer
            Escopo escopo = new Escopo(tabela);

            // Pegar o tipo Algum
            String tipoC = AlgumaSemanticoUtils.getTipoAlgumaC(AlgumaSemanticoUtils.verificarTipo(escopo, exp));
            
            // Se já existir a tabela
            if (tabela.existe(exp.getText())) {

                // Verificar o tipo
                TabelaDeSimbolos.TipoAlguma tipo = tabela.verificar(exp.getText());
                tipoC = AlgumaSemanticoUtils.getTipoAlgumaC(tipo);
            }

            // Adicionar printf na saída
            saida.append("printf(\"%").append(tipoC).append("\", ");

            // Adiciona a expressão 
            saida.append(exp.getText());

            // Adicionar na saída
            saida.append(");\n");
        }

        // Retorna null
        return null;
    }

    // CMD Atribuicao

    @Override
    public Void visitCmdAtribuicao(CmdAtribuicaoContext ctx) {

        // Se tiver ^, tratar
        if (ctx.getText().contains("^"))
            saida.append("*");

        // Atribuição normal - não é Cadeia - Visitar
        visitIdentificador(ctx.identificador());

        // Finaliza o Arquivo
        saida.append(" = ").append(ctx.expressao().getText()).append(";\n");
        

        // Retorna null
        return null;
    }

    // CMD Se

    @Override
    public Void visitCmdSe(CmdSeContext ctx) {

        // Aicionar o If
        saida.append("if(");

        // Adiciona a expressão 
        visitExpressao(ctx.expressao());

        // Adiciona o fechamento + Começo
        saida.append(") {\n");

        // Comando dentro do if
        for (CmdContext cmd : ctx.cmd()) {
            visitCmd(cmd);
        }

        // Fechamento do bloco
        saida.append("}\n");

        // Comando SEnaao
        if (ctx.cmdSenao() != null) {

            // Adiciona o senao
            saida.append("else {\n");

            // Percorre os comandos 
            for (CmdContext cmd : ctx.cmdSenao().cmd()) {
                visitCmd(cmd);
            }
            // Fechamento do Bloco
            saida.append("}\n");
        }

        // Retorna null.
        return null;
    }

    // CMD SEnao

    @Override
    public Void visitCmdSenao(CmdSenaoContext ctx) {

        // Adicionar a saída
        saida.append("default:\n");

        // Visita os comandos 
        ctx.cmd().forEach(var -> visitCmd(var));

        // Fechar o comando
        saida.append("break;\n");

        // Retorna null
        return null;
    }

    // CMD Caso

    @Override
    public Void visitCmdCaso(CmdCasoContext ctx) {

        // Adcionar a saída
        saida.append("switch(");

        // Visitar exp
        visit(ctx.exp_aritmetica());

        // Começar o bloco
        saida.append("){\n");

        // Visitar a seleção
        visit(ctx.selecao());

        // Uso do senão para
        if (ctx.cmdSenao() != null) {
            visit(ctx.cmdSenao());
        }

        // Fechar 
        saida.append("}\n");

        // Retorna null
        return null;
    }

    // CMD Para

    @Override
    public Void visitCmdPara(CmdParaContext ctx) {

        // Pegar o identificador
        String ident = ctx.IDENT().getText();

        // Adicionar a saída
        saida.append("for(" + ident + " = ");
        // Visitar a expresão
        visitExp_aritmetica(ctx.exp_aritmetica(0));
        // Adicionar a saída
        saida.append("; " + ident + " <= ");
        // Visitar a expressão
        visitExp_aritmetica(ctx.exp_aritmetica(1));
        // Adicionar a saída
        saida.append("; " + ident + "++){\n");

        // Visitar os comandos até acabar
        ctx.cmd().forEach(cmd -> visitCmd(cmd));
        saida.append("}\n");

        // Retorna null
        return null;
    }

    // CMD Enquanto


    @Override
    public Void visitCmdEnquanto(CmdEnquantoContext ctx) {

        // Adcionar a saída
        saida.append("while(");
        // Visita a expressao
        visitExpressao(ctx.expressao());
        // Adcionar a saída
        saida.append("){\n");

        // Visitar os comandos até acabar
        ctx.cmd().forEach(cmd -> visitCmd(cmd));
        saida.append("}\n");

        // Retorna null
        return null;
    }

    // Cmd Faca


    @Override
    public Void visitCmdFaca(CmdFacaContext ctx) {

        //Adicionar a saída
        saida.append("do{\n");

        // Visitar os comandos até acabar
        ctx.cmd().forEach(cmd -> visitCmd(cmd));
        saida.append("} while(");

        // Visita a expressao
        visitExpressao(ctx.expressao());
        saida.append(");\n");

        // Retorna null
        return null;
    }

    // Selecao

    @Override
    public Void visitSelecao(SelecaoContext ctx) {

        // Pegar os inens de selecao
        ctx.item_selecao().forEach(var -> visitItem_selecao(var));

        // Retorna null
        return null;
    }

    @Override
    public Void visitItem_selecao(Item_selecaoContext ctx) {

        // Divide a constante em uma lista de intervalo (se houver)
        ArrayList<String> intervalo = new ArrayList<>(Arrays.asList(ctx.constantes().getText().split("\\.\\.")));

        // Pega os valores - primeiro e ultimo
        String first = intervalo.size() > 0 ? intervalo.get(0) : ctx.constantes().getText();
        String last = intervalo.size() > 1 ? intervalo.get(1) : intervalo.get(0);
        
        // Itera sobre os valores no intervalo e gera código para cada um deles
        for (int i = Integer.parseInt(first); i <= Integer.parseInt(last); i++) {

            // Adiciona a saída
            saida.append("case " + i + ":\n");
            // Visita os comandos dentro do ramo "caso"
            ctx.cmd().forEach(var -> visitCmd(var));
            // Adiciona a saída
            saida.append("break;\n");
        }

        // Retorna null
        return null;
    }



    
    

}