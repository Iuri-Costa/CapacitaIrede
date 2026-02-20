package org.atividades.Unidade1;

import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        /*
        10. Escreva um programa que leia uma frase e conte quantas palavras ela possui
        (considere as palavras separadas por espaços).
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine().trim();

        if (frase.isEmpty()) {
            System.out.println("Quantidade de palavras: 0");
        } else {
            String[] palavras = frase.split(" ");
            System.out.println(palavras.length);
        }
    }
}
