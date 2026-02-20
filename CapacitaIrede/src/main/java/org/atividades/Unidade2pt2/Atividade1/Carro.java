package org.atividades.Unidade2pt2.Atividade1;

public class Carro {
    private Motor motor;

    public Carro(int potenciaMotor){
        this.motor = new Motor(potenciaMotor);
    }
    public void ligarCarro() {
        if (motor != null) {
            motor.ligarMotor();
            System.out.println("Carro está funcionando.");
        } else {
            System.out.println("Carro não pode funcionar sem motor.");
        }
    }
}
