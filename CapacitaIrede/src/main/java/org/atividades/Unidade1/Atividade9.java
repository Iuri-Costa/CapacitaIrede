package org.atividades.Unidade1;

import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args){
        /*
        9. Faça um programa que leia o nome completo de uma pessoa e mostre o primeiro
        nome e o último nome separadamente.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine().trim();

        String[] partes = nomeCompleto.split(" ");

        String primeiroNome = partes[0];
        String ultimoNome = partes[partes.length - 1];

        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Último nome: " + ultimoNome);
    }
}



