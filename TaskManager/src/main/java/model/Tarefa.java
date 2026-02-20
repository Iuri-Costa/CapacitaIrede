package model;

public class Tarefa {

    private static int contador = 1;

    private int id;
    private String titulo;
    private String descricao;
    private boolean concluida;

    public Tarefa(String titulo, String descricao) {
        this.id = contador++;
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void concluir() {
        this.concluida = true;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " | Título: " + titulo +
                " | Descrição: " + descricao +
                " | Status: " + (concluida ? "Concluída" : "Pendente");
    }
}