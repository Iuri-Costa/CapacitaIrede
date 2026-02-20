package org.atividades.Unidade1;

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args){
        /*7. Crie um programa que leia um número inteiro não-negativo e calcule seu fatorial
        utilizando o laço for.
        Exemplo: Entrada = 5 Saída = 120
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("digite abaixo o número que você deseja ver o fatorial");

        if (!scan.hasNextInt()) {
            System.out.println("Digite um número inteiro não-negativo.");
            return;
        }

        int num = scan.nextInt();

        if (num < 0) {
            System.out.println("Digite um número inteiro não-negativo.");
            return;
        }

        int fatorial = 1;

        for (int i = num; i >= 1; i--) {
            System.out.print(i);
            if (i > 1) System.out.print(" * ");
            fatorial *= i;
        }
        System.out.println(" = " + fatorial);
    }
}

