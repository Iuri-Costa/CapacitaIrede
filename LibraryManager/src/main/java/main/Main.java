package main;

import model.*;
import service.BibliotecaService;
import exceptions.LivroIndisponivelException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BibliotecaService biblioteca = new BibliotecaService();
        Scanner scanner = new Scanner(System.in);

        biblioteca.adicionarLivro(new Livro("Java Básico", "João Silva"));
        biblioteca.adicionarLivro(new Livro("POO na Prática", "Maria Souza"));

        Usuario usuario = new Aluno("Carlos", "carlos@email.com");

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE BIBLIOTECA =====");
            System.out.println("1 - Listar livros disponíveis");
            System.out.println("2 - Emprestimo de livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (opcao) {
                    case 1:
                        biblioteca.listarLivrosDisponiveis();
                        break;

                    case 2:
                        System.out.print("Digite o título do livro: ");
                        String tituloEmprestimo = scanner.nextLine();
                        biblioteca.emprestarLivro(tituloEmprestimo, usuario);
                        break;

                    case 3:
                        System.out.print("Digite o título do livro: ");
                        String tituloDevolucao = scanner.nextLine();
                        biblioteca.devolverLivro(tituloDevolucao);
                        break;

                    case 4:
                        System.out.println("Encerrando...");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }

            } catch (LivroIndisponivelException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcao != 4);

        scanner.close();
    }
}