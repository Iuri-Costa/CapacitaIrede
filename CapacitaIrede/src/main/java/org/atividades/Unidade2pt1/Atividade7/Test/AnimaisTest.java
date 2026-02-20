package org.atividades.Unidade2pt1.Atividade7.Test;

import org.atividades.Unidade2pt1.Atividade7.Animal;
import org.atividades.Unidade2pt1.Atividade7.Cachorro;
import org.atividades.Unidade2pt1.Atividade7.Gato;

public class AnimaisTest {
    public static void main(String[] args) {

        Animal[] animais = new Animal[3];

        animais[0] = new Animal();
        animais[1] = new Gato();
        animais[2] = new Cachorro();

        for (Animal animal : animais) {
            animal.fazerSom();
        }
    }
}
