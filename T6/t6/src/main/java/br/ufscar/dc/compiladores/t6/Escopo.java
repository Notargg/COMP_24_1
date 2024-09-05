package br.ufscar.dc.compiladores.t6;

import java.util.LinkedList;
import java.util.List;

public class Escopo {

    // Criação de um Escopo
    private LinkedList<TabelaDeSimbolos> pilhaTabela;

    // Construtor
    public Escopo(){
        pilhaTabela = new LinkedList<>();
        novoEscopo();
    }

    // Criação de novo Escopo
    public void novoEscopo(){
        pilhaTabela.push(new TabelaDeSimbolos());
    }

    // Pegar o Escopo atual
    public TabelaDeSimbolos getEscopo(){
        return pilhaTabela.peek();
    }

    // Tirar da pilha o Escopo atual
    public void delEscopo(){
        pilhaTabela.pop();
    }

    // Referência para todas as tabelas
    public List<TabelaDeSimbolos> getPilhaTabela(){
        return  pilhaTabela;
    }

    
}
