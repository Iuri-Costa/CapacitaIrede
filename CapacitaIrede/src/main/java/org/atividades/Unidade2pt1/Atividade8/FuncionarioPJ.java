package org.atividades.Unidade2pt1.Atividade8;

public class FuncionarioPJ extends Funcionario{
    public FuncionarioPJ(double salario){
        super(salario);
    }

    @Override
    public double calcularSalario(){
        double bonus = getSalario() * 0.10;
        return getSalario() + bonus;
    }

}
