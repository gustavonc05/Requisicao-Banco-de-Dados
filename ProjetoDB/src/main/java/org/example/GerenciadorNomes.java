package org.example;

import java.util.List;

// Aluno 1: Gustavo Netto de Carvalho | RA: 10437996
// Aluno 2: Gabriel Labarca Del Bianco | RA: 10443681

public interface GerenciadorNomes {
    int MAX_CARACTERES_NOMES = 20;
    List<String> obterNomes();
    void adicionarNome(String nome);
}
