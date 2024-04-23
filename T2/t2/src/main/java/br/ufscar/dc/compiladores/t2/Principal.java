package br.ufscar.dc.compiladores.t2;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import java.io.PrintWriter;

public class Principal {
    public static void main(String args[]) throws IOException {

    // Arquivos

    String arquivoEntrada = args[0]; // Argumento 0 é o arquivo de entrada
    String arquivoSaida = args[1]; // Argumento 1 é o arquivo de saída
    System.out.println(arquivoSaida); // Imprime o nome do arquivo de saída


    try (PrintWriter pw = new PrintWriter(arquivoSaida))
    {
        // args[0] é o primeiro argumento da linha de comando
        CharStream cs = CharStreams.fromFileName(arquivoEntrada); // Leitura do arquivo de entrada
        T2Lexer lexer = new T2Lexer(cs); // Chamada da gramática léxica

        Token t = null;

        // Enquanto não chegar no final do arquivo, continua lendo

        while ((t = lexer.nextToken()).getType() != Token.EOF) 
        {

            // Verifica se o token é um erro, cadeia não fechada ou comentário não fechado

            String nomeToken = T2Lexer.VOCABULARY.getDisplayName(t.getType());
            if(nomeToken.equals("ERRO")) 
            {
                pw.println("Linha "+t.getLine()+": "+t.getText() + " - simbolo nao identificado"); // Erro de Simbolo
                break;
            } 
            else if(nomeToken.equals("CADEIA_NAO_FECHADA")) 
            {
                pw.println("Linha "+t.getLine() + ": cadeia literal nao fechada"); // Cadeia não fechada
                break;
            } 
            else if(nomeToken.equals("COMENTARIO_NAO_FECHADO")) 
            {
                pw.println("Linha "+t.getLine() + ": comentario nao fechado"); // Comentário não fechado
                break;
            }
            else 
            {  
                    
                if(nomeToken == "PALAVRA_CHAVE" || nomeToken == "OP_ARIT" || nomeToken == "OP_REL") 
                {
                    pw.println("<'" + t.getText() + "','" + t.getText() + "'>"); // Imprime o texto e não o tipo
                }
                else


                    pw.println("<'" + nomeToken + "'," +  t.getText() + ">"); //  Imprime o texto e o nome
                    
            }             
       }

       CommonTokenStream tokens = new CommonTokenStream(lexer);
       T2Parser parser = new T2Parser(tokens);
       parser.programa();

    } catch (IOException ex) {
        System.err.println("O arquivo/diretório não existe:"+args[1]);
    }


    }
}