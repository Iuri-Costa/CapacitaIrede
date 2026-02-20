package org.atividades.Unidade2pt1.Atividade1.Test;

import org.atividades.Unidade2pt1.Atividade1.ContaBancaria;

public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.setNumero(1);
        conta1.setTitular("Iuri");
        conta1.depositar(200);
        conta1.sacar(120);
        conta1.imprime();
    }
}
