package org.atividades.Unidade2pt1.Atividade8;

public class FuncionarioCLT extends Funcionario{

    public FuncionarioCLT(double salario){
        super(salario);

    }

    @Override
    public double calcularSalario() {
        double descontoINSS = getSalario() * 0.10;
        return getSalario() - descontoINSS;
    }
}
