package org.example;

// Aluno 1: Gustavo Netto de Carvalho | RA: 10437996
// Aluno 2: Gabriel Labarca Del Bianco | RA: 10443681

public class Main {
    public static void main(String[] args) {
        // Escolher qual GerenciadorNomes usar (Memória ou Banco de Dados)
        GerenciadorNomes gNomes = new GerenciadorNomesBD();
        Ihm ihm = new Ihm(gNomes);
        ihm.dialogar();
    }
}
