package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// Aluno 1: Gustavo Netto de Carvalho | RA: 10437996
// Aluno 2: Gabriel Labarca Del Bianco | RA: 10443681

public class GerenciadorNomesBD implements GerenciadorNomes {
    private Connection conexao;

    public GerenciadorNomesBD() {
        try {
            // Estabelece a conexão com o banco de dados
            this.conexao = DriverManager.getConnection(
                    "jdbc:postgresql://db.xidpkvejjyfpfigolmlq.supabase.co:5432/postgres?user=postgres&password=yoVchOc1yfCbUCuP"
            );
            // Caso a conexão de certo
            System.out.println("Conexão realizada com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados.");
            e.printStackTrace();
        }
    }

    // Printando todos os dados da tabela
    public List<String> obterNomes() {
        List<String> nomes = new ArrayList<>();
        try {
            // Printando todos os dados da tabela
            ResultSet rsClient = conexao.createStatement().executeQuery("SELECT * FROM GerenciadorNomesBD");
            while (rsClient.next()) {
                String nome = rsClient.getString("nome"); // Exibindo os dados da coluna nome
                nomes.add(nome);
            }
        } // Caso não consiga obter os nomes
        catch (SQLException ex) {
            ex.printStackTrace();
        }
        return nomes;
    }

    // Adicionando nome
    public void adicionarNome(String nome) {
        try {
            // Adicionando nome na tabela
            Statement stmt = conexao.createStatement();
            String sqlInsertNome = "INSERT INTO GerenciadorNomesBD (nome) VALUES ('" + nome + "')";  // Essa variável"nome" vem da classe Ihm
            stmt.executeUpdate(sqlInsertNome);
            System.out.println("Nome inserido com sucesso!");
        }
        // Caso a adição do nome não de certo
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
