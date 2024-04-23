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

    // Lembrando: args[1] é o arquivo de saída
    try(PrintWriter pw = new PrintWriter(new File(args[1]))) { 
    CharStream cs = CharStreams.fromFileName(arquivoEntrada); // Leitura do arquivo de entrada
    T2Lexer lexer = new T2Lexer(cs); // Chamada da gramática léxica
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    T2Parser parser = new T2Parser(tokens);

    T2LexerErrorListener mcel = new T2LexerErrorListener(pw);
    parser.addErrorListener(mcel);

    parser.programa();
    }
    


    }
}