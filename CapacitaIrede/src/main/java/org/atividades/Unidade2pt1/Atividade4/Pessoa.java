package org.atividades.Unidade2pt1.Atividade4;

public class Pessoa {
    private String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }


    public void apresentar(){
        System.out.println("olá, meu  nome é "+this.nome);
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
