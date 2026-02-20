package org.atividades.Unidade1;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        /*
        4. Crie um programa que leia um número inteiro do usuário e imprima a tabuada
        desse número (de 1 a 10), usando um laço for.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("digite abaixo o número que você deseja ver a tabuada:");

        int num = scan.nextInt();

        System.out.println(num);

        for (int i = 1; i <= 10; i++){
            System.out.println(num * i);
        }
    }
}
