package org.atividades.Unidade2pt1.Atividade1;

public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;
    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void imprime(){
        System.out.println("Número: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    // Getters e Setters
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
