package org.atividades.Unidade1;

import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args){
        /*
        8. Crie um programa que exiba um menu repetitivo com as opções:
        1 - Dizer "Olá"
        2 - Dizer "Tchau"
        3 - Encerrar
        O menu deve continuar aparecendo até que o usuário escolha a opção 3.
        */

        Scanner scan = new Scanner(System.in);
        int num = 0;
        while (num != 3){
            System.out.println(
                    "Digite a ação que você deseja fazer: \n"+
                    "1 - Dizer 'Olá' \n" +
                    "2 - Dizer 'Tchau' \n" +
                    "3 - Encerrar");
            num = scan.nextInt();
            if (num == 1){
                System.out.println(" Olá ");
            } else if (num == 2) {
                System.out.println("Tchau");
            }
        }
    }
}
