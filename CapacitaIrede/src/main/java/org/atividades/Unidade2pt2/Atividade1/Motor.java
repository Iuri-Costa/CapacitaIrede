package org.atividades.Unidade2pt2.Atividade1;

public class Motor {
    private int potencia;

    public Motor(int potencia){
        this.potencia = potencia;
    }

    public void ligarMotor(){
        System.out.println("o motor está funcionando com força de "+this.potencia+" cavalos");
    }

    public int getPotencia() {
        return potencia;
    }
}
