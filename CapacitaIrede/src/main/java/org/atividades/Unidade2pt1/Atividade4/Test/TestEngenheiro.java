package org.atividades.Unidade2pt1.Atividade4.Test;

import org.atividades.Unidade2pt1.Atividade4.Engenheiro;

public class TestEngenheiro {
    public static void main(String[] args){
        Engenheiro engenheiro = new Engenheiro("Iuri", 4700, "Engenharia de Software");

        engenheiro.apresentar();
        engenheiro.dizFormacao();
        engenheiro.dizSalario();
    }

}
