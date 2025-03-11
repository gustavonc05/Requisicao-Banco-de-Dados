package org.example;

import java.util.*;

// Aluno 1: Gustavo Netto de Carvalho | RA: 10437996
// Aluno 2: Gabriel Labarca Del Bianco | RA: 10443681

public class Ihm {

    private GerenciadorNomes gerenciador;
    private Scanner entrada;

    // Construtor da classe Ihm que recebe um GerenciadorNomes
    public Ihm(GerenciadorNomes gerenciador) {
        this.gerenciador = gerenciador;
        this.entrada = new Scanner(System.in);
    }

    // Metodo principal de interação com o usuário
    public void dialogar() {
        boolean sair = false;

        while (!sair) {
            exibirMenu();  // Exibe o menu para o usuário

            String opcao = entrada.nextLine();  // Lê a opção do usuário
            switch (opcao) {
                case "1":
                    listarNomes();  // Lista os nomes cadastrados
                    break;
                case "2":
                    adicionarNome();  // Permite adicionar um novo nome
                    break;
                case "3":
                    sair = true;  // Encerra o programa
                    break;
                default:
                    System.out.println("Opção inválida!");  // Caso a opção seja inválida
            }
        }

        System.out.println("Fim do programa!");  // Mensagem de encerramento
    }

    // Método para exibir o menu principal
    private void exibirMenu() {
        System.out.println("\n>> MENU PRINCIPAL:");
        System.out.println("(1) Listar nomes");
        System.out.println("(2) Adicionar Nome");
        System.out.println("(3) Sair");
        System.out.print("Escolha uma opção: ");
    }

    // Método para listar os nomes cadastrados
    private void listarNomes() {
        List<String> nomes = gerenciador.obterNomes();  // Obtém a lista de nomes
        System.out.println("\n>> Lista dos nomes:");

        if (nomes.isEmpty()) {
            System.out.println("Nenhum nome encontrado.");
        } else {
            for (String nome : nomes) {
                System.out.println(nome);  // Imprime os nomes
            }
        }
    }

    // Método para adicionar um nome à lista
    private void adicionarNome() {
        System.out.print("\n>> Digite o novo nome: ");
        String novoNome = entrada.nextLine();  // Lê o novo nome do usuário
        gerenciador.adicionarNome(novoNome);  // Adiciona o nome ao gerenciador
    }
}
