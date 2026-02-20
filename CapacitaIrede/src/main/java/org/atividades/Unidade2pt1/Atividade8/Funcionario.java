package org.atividades.Unidade2pt1.Atividade8;

public class Funcionario {
    private double salario;

    public Funcionario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario(){
        return salario;
    }


    //getters e setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
