package service;

import model.Livro;
import model.Usuario;
import exceptions.LivroIndisponivelException;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaService {

    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivrosDisponiveis() {
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }

    public void emprestarLivro(String titulo, Usuario usuario)
            throws LivroIndisponivelException {

        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {

                if (!livro.isDisponivel()) {
                    throw new LivroIndisponivelException(
                            "O livro já está emprestado."
                    );
                }

                livro.emprestar();
                System.out.println(usuario.getTipoUsuario() +
                        " " + usuario.getNome() +
                        " realizou o empréstimo.");
                return;
            }
        }

        System.out.println("Livro não encontrado.");
    }

    public void devolverLivro(String titulo) {

        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                livro.devolver();
                System.out.println("Livro devolvido com sucesso.");
                return;
            }
        }

        System.out.println("Livro não encontrado.");
    }
}