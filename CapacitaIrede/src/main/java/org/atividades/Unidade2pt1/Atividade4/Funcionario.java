package org.atividades.Unidade2pt1.Atividade4;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome, double salario){
        super(nome);
        this.salario = salario;
    }

    public void dizSalario(){
        System.out.println("meu salario é "+this.salario);
    }

    //getters e setter
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
