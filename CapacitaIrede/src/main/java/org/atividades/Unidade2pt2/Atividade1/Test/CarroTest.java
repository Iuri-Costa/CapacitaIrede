package org.atividades.Unidade2pt2.Atividade1.Test;

import org.atividades.Unidade2pt2.Atividade1.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro = new Carro(150);
        carro.ligarCarro();

        Carro carroSemMotor = new Carro(0);
        carroSemMotor = null;

        System.out.println("Se o motor não existir, o carro não funciona.");
    }
}