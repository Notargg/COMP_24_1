package br.ufscar.dc.compiladores.t2;


import org.antlr.v4.runtime.ANTLRErrorListener; // cuidado para importar a versão 4
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import java.io.PrintWriter;

public class T2LexerErrorListener implements ANTLRErrorListener {

    // Declaração do PrintWriter - Escrever no Arquivo
    PrintWriter pw;

    // Garante que só imprima uma vez o erro
    static boolean onlyOnce = false;

    public T2LexerErrorListener(PrintWriter pw) {
     this.pw = pw;    
    }

    @Override
    public void reportAmbiguity(Parser arg0, DFA arg1, int arg2, int arg3, boolean arg4, java.util.BitSet arg5,
            ATNConfigSet arg6) {
        // TODO Auto-generated method stub
        // Não será necessário para o T2, pode deixar vazio
    }

    @Override
    public void reportAttemptingFullContext(Parser arg0, DFA arg1, int arg2, int arg3, java.util.BitSet arg4,
            ATNConfigSet arg5) {
        // TODO Auto-generated method stub
        // Não será necessário para o T2, pode deixar vazio
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }

    @Override
    public void	syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {

        // Aqui vamos colocar o tratamento de erro customizado

        Token t = (Token) offendingSymbol; // Token que gerou o erro
        String text = t.getText(); // Transforma o token em texto
        String tipo = T2Lexer.VOCABULARY.getDisplayName(t.getType()); // Pegar o tipo para categorizar os erros

        if(!onlyOnce){
            
            // Erro de simbolo não identificado
            if(tipo == "ERRO"){
                pw.println("Linha " + t.getLine() + ": " + text + " - simbolo nao identificado");
                onlyOnce = true;
                
            }
            // Error de cadeia não fechada 
            else if(tipo == "CADEIA_NAO_FECHADA"){
                pw.println("Linha " + t.getLine() + ": " + "cadeia literal nao fechada");
                onlyOnce = true;
                
            }
            // Error de comentario não fechado
            else if(tipo == "COMENTARIO_NAO_FECHADO"){
                pw.println("Linha " + t.getLine() + ": " + "comentario nao fechado");
                onlyOnce = true;
                
            }

            // Depois de todos os casos, falta agora verificar se há algum erro sintático
            else{
                
                // Caso o texto seja <EOF>, transformar em EOF
                if(text == "<EOF>"){
                    text = "EOF";
                }
    
                // Printar todo o resto
                pw.println("Linha " + line + ": erro sintatico proximo a " + text);
                onlyOnce = true;

    
               
            }

        }

    }

}