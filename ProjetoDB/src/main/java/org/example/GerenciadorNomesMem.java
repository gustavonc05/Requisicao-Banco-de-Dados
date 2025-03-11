package org.example;

import java.util.*;

// Aluno 1: Gustavo Netto de Carvalho | RA: 10437996
// Aluno 2: Gabriel Labarca Del Bianco | RA: 10443681

public class GerenciadorNomesMem implements GerenciadorNomes {
    private List<String> nomes = new ArrayList<String>();

    @Override
    public List<String> obterNomes() {
        return nomes;
    }

    @Override
    public void adicionarNome(String nome) {
        nomes.add(nome);
    }
}
