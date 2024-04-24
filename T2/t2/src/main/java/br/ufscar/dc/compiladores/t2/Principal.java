package br.ufscar.dc.compiladores.t2;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.File;
import java.io.PrintWriter;


public class Principal {
    public static void main(String args[]) throws IOException {

    // Arquivos

    String arquivoEntrada = args[0]; // Argumento 0 é o arquivo de entrada
    String arquivoSaida = args[1]; // Argumento 1 é o arquivo de saída
    System.out.println(arquivoSaida); // Imprime o nome do arquivo de saída

    // Lembrando: args[1] é o arquivo de saída
    try(PrintWriter pw = new PrintWriter(new File(args[1]))) {  // Criação do arquivo de saída
    CharStream cs = CharStreams.fromFileName(arquivoEntrada); // Leitura do arquivo de entrada
    T2Lexer lexer = new T2Lexer(cs); // Chamada da gramática léxica
 
    CommonTokenStream tokens = new CommonTokenStream(lexer); // Buffer de tokens
    T2Parser parser = new T2Parser(tokens); // Analisador sintático
    T2LexerErrorListener mcel = new T2LexerErrorListener(pw); // Criar o tratamento de erro customizado

    // Remover todos os erros do ANTLR
    parser.removeErrorListeners();

    // Adicionar os erros customizados
    parser.addErrorListener(mcel);

    // Rodar o programa
    parser.programa();

    // Imprimir o fim da compilação
    pw.println("Fim da compilacao");

    }catch (IOException e) {
        e.printStackTrace(); // Tratamento de erro
    }
    


    }
}