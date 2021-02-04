package com.company;

public class Carro {
    String cor;
    String modelo = "carro";
    double velocidadeAtual;
    double velocidadeMaxima;

    public void liga(){
        System.out.println("Seu " + modelo +  " esta ligadasso . . . Vrummmmm");
    }

    public void acelera(double quantidade) {
        velocidadeAtual += quantidade;
    }

    public int pegaMarcha() {
        if (velocidadeAtual < 0) {
            return -1;
        } else if (velocidadeAtual >= 0 && velocidadeAtual < 40) {
            return 1;
        } else if (velocidadeAtual >= 40 && velocidadeAtual < 80) {
            return 2;
        } else {
            return 3;
        }
    }
}
