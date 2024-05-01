package br.ufscar.dc.compiladores.t3;

import br.ufscar.dc.compiladores.t3.AlgumaParser.ProgramaContext;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Principal {
    public static void main(String args[]) throws IOException {

    // Arquivos

    String arquivoEntrada = args[0]; // Argumento 0 é o arquivo de entrada
    String arquivoSaida = args[1]; // Argumento 1 é o arquivo de saída
    System.out.println(arquivoSaida); // Imprime o nome do arquivo de saída

    // Lembrando: args[1] é o arquivo de saída
    try(PrintWriter pw = new PrintWriter(new File(args[1]))) {  // Criação do arquivo de saída

    CharStream cs = CharStreams.fromFileName(arquivoEntrada); // Leitura do arquivo de entrada
    AlgumaLexer lexer = new AlgumaLexer(cs); // Chamada da gramática léxica
 
    CommonTokenStream tokens = new CommonTokenStream(lexer); // Buffer de tokens
    AlgumaParser parser = new AlgumaParser(tokens); // Analisador sintático

    // Criação da árvore
    AlgumaParser.ProgramaContext arvore = parser.programa();

    // Criação do analisador Semantico
    AlgumaSemantico as = new AlgumaSemantico();
    as.visitPrograma(arvore);

    Iterator<String> iterator = AlgumaSemanticoUtils.errosSemanticos.iterator();

    // Loop para achar os erros
    while ((iterator.hasNext())) {
        String erro = iterator.next();
        pw.println(erro);
    }


    // Imprimir o fim da compilação e terminar
    pw.println("Fim da compilacao");
    pw.close();

    }catch (IOException e) {
        e.printStackTrace(); // Tratamento de erro
    }
    


    }
}