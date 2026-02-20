package org.atividades.Unidade1;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        /*3. Implemente um programa que exiba um menu com 3 opções:
        1 - Somar dois números
        2 - Subtrair dois números
        3 - Sair
        O programa deve usar switch para executar a operação escolhida.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("digite qual ação você deseja fazer: 1 - Adição. 2 - Subtração. 3 - Sair");

        int acao = scan.nextInt();

        switch (acao) {
            case 1:
                System.out.println("digite o primeiro número que você deseja fazer a soma:");
                int num1 = scan.nextInt();
                System.out.println("digite o segundo número que você deseja fazer a soma:");
                int num2 = scan.nextInt();
                int soma = num1 + num2;
                System.out.println(num1+" + "+num2+ " = "+ soma);
                break;
            case 2:
                System.out.println("digite o primeiro número que você deseja fazer a subtração:");
                int Snum1 = scan.nextInt();
                System.out.println("digite o segundo número que você deseja fazer a subtração:");
                int Snum2 = scan.nextInt();
                int subtracao = Snum1 - Snum2;
                System.out.println(Snum1+" - "+Snum2+ " = "+ subtracao);
                break;
            case 3:
                System.out.println("saindo... ");
                break;
            default:
                System.out.println("opção inválida");
        }

    }
}
