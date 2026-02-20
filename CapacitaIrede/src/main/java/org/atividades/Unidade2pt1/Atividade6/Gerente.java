package org.atividades.Unidade2pt1.Atividade6;

public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }


    public void imprime() {
        System.out.println(this.getNome());
        System.out.println(this.getSalario());
        System.out.println(this.departamento);


    }
    //getters e setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
