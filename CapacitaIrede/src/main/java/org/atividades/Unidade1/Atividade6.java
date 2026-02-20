package org.atividades.Unidade1;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args){
        /*
        6. Crie um array com os seguintes nomes: "Maria", "João", "Carlos", "Ana", "Beatriz". Em
        seguida, peça um nome ao usuário e diga se ele está ou não no array.
         */
        String[] nomes = {"Maria","João","Carlos","Ana","Beatriz"};

        Scanner scan = new Scanner(System.in);
        System.out.println("digite o seu nome abaixo:");
        String nome = scan.nextLine();
        boolean encontrado = Arrays.asList(nomes).contains(nome);

        if (encontrado){
            System.out.println("está no Array");
        } else {
            System.out.println("não está no Array");
        }
    }

}
