package br.ufscar.dc.compiladores.t1;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Principal {

    public static void main(String[] args) {

        String arquivoEntrada = args[0];
        String arquivoSaida = args[1];
        System.out.println(arquivoSaida);
        
        try (PrintWriter pw = new PrintWriter(arquivoSaida))
        {
            // args[0] é o primeiro argumento da linha de comando
            CharStream cs = CharStreams.fromFileName(arquivoEntrada);
            AlgumaLexer lex = new AlgumaLexer(cs);

            Token t = null;
            while ((t = lex.nextToken()).getType() != Token.EOF) 
            {
                String nomeToken = AlgumaLexer.VOCABULARY.getDisplayName(t.getType());
                if(nomeToken.equals("ERRO")) 
                {
                    pw.println("Erro na linha "+t.getLine()+": "+t.getText() + " - simbolo nao identificado");
                    break;
                } 
                else if(nomeToken.equals("CADEIA_NAO_FECHADA")) 
                {
                    pw.println("Cadeia não fechada na linha "+t.getLine() + " - cadeia literal nao fechada");
                    break;
                } 
                else if(nomeToken.equals("COMENTARIO_NAO_FECHADO")) 
                {
                    pw.println("Comentario nao fechado na linha "+t.getLine() + " - comentario nao fechado");
                    break;
                }
                else 
                {                
                    if(nomeToken == "PALAVRA_CHAVE" || nomeToken == "OP_ARIT" || nomeToken == "OP_REL") 
                    {
                        pw.println("<'" + t.getText() + "','" + t.getText() + "'>");
                    }
                    else
                        pw.println("<'" + t.getText() + "'," +  nomeToken + ">");
                }             
           }
        } catch (IOException ex) {
            System.err.println("O arquivo/diretório não existe:"+args[1]);
        }
    }
}