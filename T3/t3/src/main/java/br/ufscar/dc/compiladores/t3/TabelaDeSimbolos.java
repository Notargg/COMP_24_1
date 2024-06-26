package br.ufscar.dc.compiladores.t3;

import java.util.HashMap;
import java.util.Map;


// Classe que representa a tabela de símbolos - Professor MODIFICADO
public class TabelaDeSimbolos {
    public enum TipoAlguma {
        INTEIRO,
        REAL,
        INVALIDO,

        // Tipos de variáveis - Adicionadas
        CADEIA,
        LOGICO,
        TIPO,
        IDENT
    }

    // Restante foi dado pelo Professor
    
    class EntradaTabelaDeSimbolos {
        String nome;
        TipoAlguma tipo;

        private EntradaTabelaDeSimbolos(String nome, TipoAlguma tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }
    }
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }
    
    public void adicionar(String nome, TipoAlguma tipo) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo));
    }
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public TipoAlguma verificar(String nome) {
        return tabela.get(nome).tipo;
    }
}