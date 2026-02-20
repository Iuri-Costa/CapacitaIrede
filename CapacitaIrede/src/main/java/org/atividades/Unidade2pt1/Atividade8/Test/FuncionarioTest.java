package org.atividades.Unidade2pt1.Atividade8.Test;

import org.atividades.Unidade2pt1.Atividade8.Funcionario;
import org.atividades.Unidade2pt1.Atividade8.FuncionarioCLT;
import org.atividades.Unidade2pt1.Atividade8.FuncionarioPJ;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario[] funcionarios = {new FuncionarioCLT(1300), new Funcionario(1300),
                new FuncionarioPJ(1300)};

        for (Funcionario f : funcionarios){
            System.out.println(f.calcularSalario());
        }
    }
}
