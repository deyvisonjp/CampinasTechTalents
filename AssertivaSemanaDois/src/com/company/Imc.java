package com.company;

public class Imc {
    float peso = 0.00f, altura = 0.00f;
    String[] msgRetornoImc = new String[] {
            ">> Adulto com baixo peso :|",
            ">> Adulto com peso adequado :)",
            ">> Adulto com sobrepeso :|",
            ">> Adulto com obesidade :("
    };

    public float calculaImc() {
        return (float) (peso / (Math.pow(altura, 2)));
    }

    public String resultadoImc () {
        if (calculaImc() < 18.5) {
            return msgRetornoImc[0];
        } else if (calculaImc() >= 18.5 && calculaImc() < 25) {
            return msgRetornoImc[1];
        } else if (calculaImc() >= 25 && calculaImc() < 30) {
            return msgRetornoImc[2];
        } else {
            return msgRetornoImc[3];
        }
    }

}
