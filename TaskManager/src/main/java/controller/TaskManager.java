package controller;

import model.Tarefa;
import exceptions.TarefaNaoEncontradaException;

import java.util.ArrayList;

public class TaskManager {

    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        for (Tarefa t : tarefas) {
            System.out.println(t);
        }
    }

    public void concluirTarefa(int id) throws TarefaNaoEncontradaException {

        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                t.concluir();
                System.out.println("Tarefa concluída!");
                return;
            }
        }

        throw new TarefaNaoEncontradaException("Tarefa com ID " + id + " não encontrada.");
    }

    public void removerTarefa(int id) throws TarefaNaoEncontradaException {

        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                tarefas.remove(t);
                System.out.println("Tarefa removida com sucesso!");
                return;
            }
        }

        throw new TarefaNaoEncontradaException("Tarefa com ID " + id + " não encontrada.");
    }
}