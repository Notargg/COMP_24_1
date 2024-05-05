package br.ufscar.dc.compiladores.t3;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;

import br.ufscar.dc.compiladores.t3.AlgumaParser.Exp_aritmeticaContext;
import br.ufscar.dc.compiladores.t3.AlgumaParser.ExpressaoContext;
import br.ufscar.dc.compiladores.t3.AlgumaParser.FatorContext;
import br.ufscar.dc.compiladores.t3.AlgumaParser.Fator_logicoContext;
import br.ufscar.dc.compiladores.t3.AlgumaParser.ParcelaContext;
import br.ufscar.dc.compiladores.t3.AlgumaParser.TermoContext;
import br.ufscar.dc.compiladores.t3.AlgumaParser.Termo_logicoContext;


public class AlgumaSemanticoUtils {

    // Lista para os Erros
    public static List<String> errosSemanticos = new ArrayList<>();
    
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        // Mensagem de Erro
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
        
    }

    // Verifica tipos de expressões - Professor Modificado
    
    public static TabelaDeSimbolos.TipoAlguma verificarTipo(Escopo escopo, AlgumaParser.ExpressaoContext ctx)  {
        
        TabelaDeSimbolos.TipoAlguma ret = null;
        // Para cada expressão aritmético, verifica o tipo
        for (Termo_logicoContext tl : ctx.termo_logico()) {
            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(escopo, tl);

            // Sistema de Troca
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }

        return ret;
    }

    // Verifica tipos de termos aritméticos - Professor Modificado

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(Escopo escopo, AlgumaParser.Termo_logicoContext ctx) {

        TabelaDeSimbolos.TipoAlguma ret = null;
        // Para cada fator aritmético, verifica o tipo
        for (Fator_logicoContext fl : ctx.fator_logico()) {
            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(escopo, fl);

            // Sistema de Troca
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }
        return ret;
    }

    // Métodos novos 

    // Validação do Fator Lógico através da Validação de Parcela Lógica

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(Escopo escopo, AlgumaParser.Fator_logicoContext ctx){

        return verificarTipo(escopo, ctx.parcela_logica());
    }

    // Validação da Parcela Lógica

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(Escopo escopo, AlgumaParser.Parcela_logicaContext ctx) {

        TabelaDeSimbolos.TipoAlguma ret = null;

        // Verifica se a parcela detem uma expressão relacional

        if(ctx.exp_relacional() != null) {

            ret = verificarTipo(escopo, ctx.exp_relacional()); // Verifica o tipo da expressão relacional

        }else{

            ret = TabelaDeSimbolos.TipoAlguma.LOGICO; // Tipo Lógico
        }

        return ret;
    }

    // Verifica tipos de expressões relacionais

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(Escopo escopo, AlgumaParser.Exp_relacionalContext ctx){
        
        TabelaDeSimbolos.TipoAlguma ret = null;

        // Verifica o tipo de cada expressão relacional

        if(ctx.op_relacional() != null) {

            // Iterar para verificar as exp aritméticas dentro

            for(Exp_aritmeticaContext ea : ctx.exp_aritmetica()) {

                // Verifica o tipo da expressão aritmética

                TabelaDeSimbolos.TipoAlguma aux = verificarTipo(escopo, ea);

                // Pega o tipo do aux e do ret

                Boolean auxNumeric = aux == TabelaDeSimbolos.TipoAlguma.INTEIRO || aux == TabelaDeSimbolos.TipoAlguma.REAL;
                Boolean retNumeric = ret == TabelaDeSimbolos.TipoAlguma.INTEIRO || ret == TabelaDeSimbolos.TipoAlguma.REAL;

                // Sistema de Troca

                if(ret == null) {
                    ret = aux;
                }else if(!(auxNumeric && retNumeric) && aux != ret) { // Não são nulos e são diferentes
                    ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
                }

            }

            // Caso não tenha dado erro, retorna o tipo Lógico

            if(ret != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                ret = TabelaDeSimbolos.TipoAlguma.LOGICO;
            }

        } else {

            //Se não tiver operador relacional, ret recebe a verificação do tipo de exp aritmética

            ret = verificarTipo(escopo, ctx.exp_aritmetica(0));
        }
        
        return ret;
    }

    // Verifica tipos de expressões aritméticas

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(Escopo escopo, AlgumaParser.Exp_aritmeticaContext ctx) {

        TabelaDeSimbolos.TipoAlguma ret = null;

        // Percorrer expressões aritméticas	

        for(TermoContext ta : ctx.termo()) {

            // Verifica o tipo do termo

            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(escopo, ta);

            // Sistema de Troca

            if(ret == null) {
                ret = aux;
            }else if(ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }

        return ret;
    }

    // Verifica tipos de termos

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(Escopo escopo, AlgumaParser.TermoContext ctx) {

        TabelaDeSimbolos.TipoAlguma ret = null;

        // Percorrer termos

        for(FatorContext fc : ctx.fator()) {

            // Verifica o tipo do fator

            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(escopo, fc);
            Boolean auxNumeric = aux == TabelaDeSimbolos.TipoAlguma.INTEIRO || aux == TabelaDeSimbolos.TipoAlguma.REAL;
            Boolean retNumeric = ret == TabelaDeSimbolos.TipoAlguma.INTEIRO || ret == TabelaDeSimbolos.TipoAlguma.REAL;

            // Sistema de Troca

            if(ret == null) {
                ret = aux;
            }else if(!(auxNumeric && retNumeric) && aux != ret) {
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }
        return ret;
    }

    // Verifica tipos de fatores

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(Escopo escopo, AlgumaParser.FatorContext ctx) {

        TabelaDeSimbolos.TipoAlguma ret = null;

        // Percorrer fatores

        for(ParcelaContext pc : ctx.parcela()) {

            // Verifica o tipo da parcela

            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(escopo, pc);

            // Sistema de Troca

            if(ret == null) {
                ret = aux;
            }else if(ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }

        return ret;
    }

    // Verificar tipos de parcelas

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(Escopo escopo, AlgumaParser.ParcelaContext ctx)  {

        TabelaDeSimbolos.TipoAlguma ret = null;

        // Tipos de Parcelas

        if(ctx.parcela_nao_unario() != null) {

            // Verifica o tipo da parcela unário

            // ret = verificarTipo(escopo, ctx.parcela_unario());
            ret = verificarTipo(escopo, ctx.parcela_nao_unario());

        }else{
                
            // Verifica o tipo da parcela não unário
    
            //ret = verificarTipo(escopo, ctx.parcela_nao_unario());
            ret = verificarTipo(escopo, ctx.parcela_unario());
        }

        
        return ret;
    }

    // Verificar tipo de parcela não unaria

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(Escopo escopo,AlgumaParser.Parcela_nao_unarioContext ctx) {

        if(ctx.identificador() != null) {

            // Verifica o tipo do identificador

            return verificarTipo(escopo, ctx.identificador());
        }

        return TabelaDeSimbolos.TipoAlguma.CADEIA;
    }

    // Verificar tipo de identificador

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(Escopo escopo, AlgumaParser.IdentificadorContext ctx) {

        String nomeVar = "";
        TabelaDeSimbolos.TipoAlguma ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;

        // Percorrer Identificadores

        for(int i = 0; i < ctx.IDENT().size(); i++) {

            // Pega o nome da variável

            nomeVar += ctx.IDENT(i).getText();

            // Colocar ponto

            if(i != ctx.IDENT().size() - 1) {

                nomeVar += ".";
            }
        }

        // Percorrer Tabelas

        for(TabelaDeSimbolos tabela : escopo.getPilhaTabela()) {

            if(tabela.existe(nomeVar)) { // Se existir

                ret = verificarTipo(escopo, nomeVar); // Pegar nome tabela
            }

        }

        System.out.println(nomeVar);
        return ret;
    }

    // Verificar tipo de parcela unária

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(Escopo escopo, AlgumaParser.Parcela_unarioContext ctx) {

        if(ctx.NUM_INT() != null) {

            return TabelaDeSimbolos.TipoAlguma.INTEIRO; // Inteiro
        }

        if(ctx.NUM_REAL() != null) {

            return TabelaDeSimbolos.TipoAlguma.REAL; // Real
        }

        if(ctx.identificador() != null) {

            // Verifica o tipo do identificador

            return verificarTipo(escopo, ctx.identificador());
        }

        

        if (ctx.IDENT() != null) {

            TabelaDeSimbolos.TipoAlguma ret = null;
            ret = verificarTipo(escopo,ctx.IDENT().getText());

            for(ExpressaoContext ec : ctx.expressao()) {

                // Verifica o tipo da expressão

                TabelaDeSimbolos.TipoAlguma aux = verificarTipo(escopo, ec);

                // Sistema de Troca

                if(ret == null) {
                    ret = aux;
                }else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                    ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
                }
            }

            return ret;

        } else {

            TabelaDeSimbolos.TipoAlguma ret = null;
            for(ExpressaoContext ec : ctx.expressao()) {

                // Verifica o tipo da expressão
                
                TabelaDeSimbolos.TipoAlguma aux = verificarTipo(escopo, ec);

                // Sistema de Troca

                if(ret == null) {
                    ret = aux;
                }else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO){
                    ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
                }
            }

            return ret;

        }
    }




    

    //Verificar tipo de nome de variável

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(Escopo escopo, String nomeVar) {

        TabelaDeSimbolos.TipoAlguma type = null;

        // Percorrer Tabelas

        for(TabelaDeSimbolos tabela : escopo.getPilhaTabela()) {

            type = tabela.verificar(nomeVar);

        }

        return type;
    }



}