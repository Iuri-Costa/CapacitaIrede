package org.atividades.Unidade2pt1.Atividade4;

public class Engenheiro extends Funcionario{
    private String graduacao;

    public Engenheiro(String nome, double salario, String graduacao){
        super(nome, salario);
        this.graduacao = graduacao;
    }

    public void dizFormacao(){
        System.out.println("sou formado em "+graduacao);
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }
}
