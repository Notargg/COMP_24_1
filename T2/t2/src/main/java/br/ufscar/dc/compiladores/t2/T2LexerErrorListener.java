package br.ufscar.dc.compiladores.t2;

import org.antlr.runtime.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener; // cuidado para importar a versão 4
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import java.io.PrintWriter;

public class T2LexerErrorListener implements ANTLRErrorListener {

    PrintWriter pw;
    public T2LexerErrorListener(PrintWriter pw) {
     this.pw = pw;    
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }

    @Override
    public void	syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        // Aqui vamos colocar o tratamento de erro customizado

        Token t = (Token) offendingSymbol;

        pw.println("Minha mensagem customizada: Erro na linha "+line+", o token é "+t.getText());
    }

    @Override
    public void reportAmbiguity(Parser arg0, DFA arg1, int arg2, int arg3, boolean arg4, java.util.BitSet arg5,
            ATNConfigSet arg6) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'reportAmbiguity'");
    }

    @Override
    public void reportAttemptingFullContext(Parser arg0, DFA arg1, int arg2, int arg3, java.util.BitSet arg4,
            ATNConfigSet arg5) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'reportAttemptingFullContext'");
    }
}