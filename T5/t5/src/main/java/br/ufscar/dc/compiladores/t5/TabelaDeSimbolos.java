package br.ufscar.dc.compiladores.t5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


// Classe que representa a tabela de símbolos - Professor MODIFICADO
public class TabelaDeSimbolos {

    public TabelaDeSimbolos.TipoAlguma tipo; // T4

    public enum TipoAlguma {
        INTEIRO,
        REAL,
        INVALIDO,

        // Tipos de variáveis - Adicionadas para o T3
        CADEIA,
        LOGICO,

        // T4 - Adicionar os tipos
        REG,
        VOID;


    }

    // T4 - Adicionar o tipo de estrutura para as novas declarações

    public enum StructAlguma {
        VAR,
        CONST,
        PROC,
        FUNC,
        TIPO
    }

    // Restante foi dado pelo Professor
    
    class EntradaTabelaDeSimbolos {
        String nome;
        TipoAlguma tipo;
        StructAlguma struct; // T4

        public EntradaTabelaDeSimbolos(String nome, TipoAlguma tipo, StructAlguma struct) {
            this.nome = nome;
            this.tipo = tipo;
            this.struct = struct; // T4
        }
    }
    
    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    private final Map<String, ArrayList<EntradaTabelaDeSimbolos>> tabelaTipo; // T4
    
    public TabelaDeSimbolos(TabelaDeSimbolos.TipoAlguma tipo) {
        this.tabela = new HashMap<>();
        this.tabelaTipo = new HashMap<>(); // T4
        this.tipo = tipo; // T4 
    }

    // T5 - se precisar acessa direto

    public TabelaDeSimbolos(){
        tabela = new HashMap<>();
        tabelaTipo = new HashMap<>();
    }

    public void adicionar(String nome, TipoAlguma tipo, StructAlguma struct) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo, struct)); // Adicionado struct
    }

    // Novas funções para o T4

    public void adicionar(EntradaTabelaDeSimbolos entrada) {
        tabela.put(entrada.nome, entrada);
    }

    public void adicionar(String tipo, EntradaTabelaDeSimbolos entrada) {

        if(tabelaTipo.containsKey(tipo)){
            tabelaTipo.get(tipo).add(entrada);
        } else {
            ArrayList<EntradaTabelaDeSimbolos> lista = new ArrayList<>();
            lista.add(entrada);
            tabelaTipo.put(tipo, lista);
        }
    }

    public ArrayList<EntradaTabelaDeSimbolos> getTabelaTipo(String tipo) {
        return tabelaTipo.get(tipo);
    }

    // Funções do T3
    
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    public TipoAlguma verificar(String nome) {
        if(tabela.containsKey(nome))
            return tabela.get(nome).tipo;
        return null;
    }

}