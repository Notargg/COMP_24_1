package br.ufscar.dc.compiladores.t3;

import br.ufscar.dc.compiladores.t3.TabelaDeSimbolos.TipoAlguma;
import br.ufscar.dc.compiladores.t3.AlgumaParser.Declaracao_constanteContext;
import br.ufscar.dc.compiladores.t3.AlgumaParser.Declaracao_variavelContext;
import br.ufscar.dc.compiladores.t3.AlgumaParser.Declaracao_globalContext;
import br.ufscar.dc.compiladores.t3.AlgumaParser.Declaracao_tipoContext;
import br.ufscar.dc.compiladores.t3.AlgumaParser.ProgramaContext;
import br.ufscar.dc.compiladores.t3.AlgumaParser.IdentificadorContext;
import br.ufscar.dc.compiladores.t3.AlgumaParser.Tipo_basico_identContext;
import br.ufscar.dc.compiladores.t3.AlgumaParser.CmdAtribuicaoContext;

public class AlgumaSemantico extends AlgumaBaseVisitor {

    // Ter os escopos para ter as tabelas de símbolos

    Escopo escopo = new Escopo();

    // Classe do Professor de Declarações Modificada

    // Declaração constante

    @Override
    public Object visitDeclaracao_constante(Declaracao_constanteContext ctx) {

        TabelaDeSimbolos tabela = escopo.getEscopo();

        if(tabela.existe(ctx.IDENT().getText())){
            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "constante" + ctx.IDENT().getText()+ " ja declarado anteriormente");
        } else {
            TabelaDeSimbolos.TipoAlguma tipo = TabelaDeSimbolos.TipoAlguma.INTEIRO;

            // Escolher os tipos de acordo com o texto

            switch (ctx.tipo_basico().getText()) 
            {
                case "literal":
                    tipo = TabelaDeSimbolos.TipoAlguma.CADEIA;
                    break;
                case "real":
                    tipo = TabelaDeSimbolos.TipoAlguma.REAL;
                    break;
                case "inteiro":
                    tipo = TabelaDeSimbolos.TipoAlguma.INTEIRO;
                    break;
                case "logico":
                    tipo = TabelaDeSimbolos.TipoAlguma.LOGICO;
                    break;
            }
            
            tabela.adicionar(ctx.IDENT().getText(), tipo);
        }

        return super.visitDeclaracao_constante(ctx);
    }

    // Declaração variavel

    @Override
    public Object visitDeclaracao_variavel(AlgumaParser.Declaracao_variavelContext ctx) {

        TabelaDeSimbolos tabela = escopo.getEscopo();

       for ( IdentificadorContext ident : ctx.variavel().identificador()) {
           if(tabela.existe(ident.getText())){
               AlgumaSemanticoUtils.adicionarErroSemantico(ident.start, "identificador " + ident.getText()+ " ja declarado anteriormente");
           } else {

               TabelaDeSimbolos.TipoAlguma tipo = TabelaDeSimbolos.TipoAlguma.INTEIRO;

               // Escolher os tipos de acordo com o texto

               switch (ctx.variavel().tipo().getText()) 
               {
                   case "literal":
                       tipo = TabelaDeSimbolos.TipoAlguma.CADEIA;
                       break;
                   case "real":
                       tipo = TabelaDeSimbolos.TipoAlguma.REAL;
                       break;
                   case "inteiro":
                       tipo = TabelaDeSimbolos.TipoAlguma.INTEIRO;
                       break;
                   case "logico":
                       tipo = TabelaDeSimbolos.TipoAlguma.LOGICO;
                       break;
               }
               
               tabela.adicionar(ident.getText(), tipo);
           }

        
       }

       return super.visitDeclaracao_variavel(ctx);
    }

    // Declaração global

    @Override
    public Object visitDeclaracao_global(Declaracao_globalContext ctx){

        TabelaDeSimbolos tabela = escopo.getEscopo();

        if(tabela.existe(ctx.IDENT().getText())){
            AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, ctx.IDENT().getText()+ " ja declarado anteriormente");
        } else {

            tabela.adicionar(ctx.IDENT().getText(), TabelaDeSimbolos.TipoAlguma.TIPO);

        }

        return super.visitDeclaracao_global(ctx);  

    }

    // Visit Tipo Basico

    @Override
    public Object visitTipo_basico_ident(Tipo_basico_identContext ctx){

        if(ctx.IDENT() != null){

            for(TabelaDeSimbolos escopos : escopo.getPilhaTabela()){

                if(!escopos.existe(ctx.IDENT().getText())){

                    AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "tipo " + ctx.IDENT().getText()+ " nao declarado");

                }

            }

        }

        return super.visitTipo_basico_ident(ctx);  

    }

    // Visit Identificador

    @Override
    public Object visitIdentificador(IdentificadorContext ctx) {

        for(TabelaDeSimbolos escopos : escopo.getPilhaTabela()){

            if(!escopos.existe(ctx.IDENT(0).getText())){

                AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, "identificador " + ctx.IDENT(0).getText()+ " nao declarado");
            }

        }

        return super.visitIdentificador(ctx); 

    }

    // Visit Cmd Atribuicao

    @Override
    public Object visitCmdAtribuicao(CmdAtribuicaoContext ctx){

        TabelaDeSimbolos.TipoAlguma tipo = AlgumaSemanticoUtils.verificarTipo(escopo, ctx.expressao());

        boolean erro = false;
        String var = ctx.identificador().getText();

        if(tipo != TabelaDeSimbolos.TipoAlguma.INVALIDO){

            for(TabelaDeSimbolos escopos : escopo.getPilhaTabela()){

                if(escopos.existe(var)){

                    TabelaDeSimbolos.TipoAlguma tipoVar = AlgumaSemanticoUtils.verificarTipo(escopo, var);
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
                
                AlgumaSemanticoUtils.adicionarErroSemantico(ctx.identificador().start,"atribuicao nao compativel para " + var);
    
            }
        

        return super.visitCmdAtribuicao(ctx);  

    }


}