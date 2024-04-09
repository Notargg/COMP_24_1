package br.ufscar.dc.compiladores.t1;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class Principal {

    public static void main(String[] args) {
        try {
            // args[0] é o primeiro argumento da linha de comando
            CharStream cs = CharStreams.fromFileName(args[0]);
            AlgumaLexer lex = new AlgumaLexer(cs);

            Token t = null;
            while ((t = lex.nextToken()).getType() != Token.EOF) {
                String nomeToken = AlgumaLexer.VOCABULARY.getDisplayName(t.getType());
                        if(nomeToken.equals("ERRO")) {
                      System.out.println("Erro na linha "+t.getLine()+": "+t.getText());
                      break;
                  } else if(nomeToken.equals("CADEIA_NAO_FECHADA")) {
                      System.out.println("Cadeia não fechada na linha "+t.getLine());
                      break;
                  } else {                
                         System.out.println("<" + nomeToken + "," + t.getText() + ">");
                       }             
           }
        } catch (IOException ex) {
        }
    }
}