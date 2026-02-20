package org.atividades.Unidade1;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args){
    /*
        5. Faça um programa que leia uma string e substitua todas as ocorrências da letra "e"
        por "*".
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("digite a String que haverá a substituição");

        String string = scan.nextLine();

        String string2 = string.replace("e","*");

        System.out.println(string2);
    }
}
