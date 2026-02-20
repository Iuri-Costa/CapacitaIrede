package org.atividades.Unidade2pt1.Atividade9.Test;

import org.atividades.Unidade2pt1.Atividade9.Bicicleta;
import org.atividades.Unidade2pt1.Atividade9.Carro;
import org.atividades.Unidade2pt1.Atividade9.Veiculo;

public class Main {

    public static void main(String[] args) {

        Veiculo v1 = new Carro();
        Veiculo v2 = new Bicicleta();

        v1.mover();
        v2.mover();
    }
}
