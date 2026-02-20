package model;

public class TarefaPrioritaria extends Tarefa {

    private String prioridade;

    public TarefaPrioritaria(String titulo, String descricao, String prioridade) {
        super(titulo, descricao);
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return super.toString() + " | Prioridade: " + prioridade;
    }
}