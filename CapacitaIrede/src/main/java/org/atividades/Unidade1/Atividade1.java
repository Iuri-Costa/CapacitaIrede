package org.atividades.Unidade1;

public class Atividade1 {
    public static void main(String[] args) {
        /*1. Escreva um programa Java que use os operadores lógicos para vericar se um
        número está entre 10 e 20 (inclusive). Use int numero = 15; */

        int numero = 15;
        if (numero > 10 && numero < 20){
            System.out.println("o número está entre 10 e 20");
        } else {
            System.out.println("o número não está entre 10 e 20");
        }
    }
}
