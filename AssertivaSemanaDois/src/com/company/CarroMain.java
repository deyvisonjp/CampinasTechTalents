package com.company;

import java.util.Scanner;

public class CarroMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro carro = new Carro();

        carro.modelo = "Citroën C4";
        carro.cor = "prata";
        carro.liga();

        String resposta;
        do {
            System.out.println("Entre com a velocidade do seu carro:");
            int velocidade = scanner.nextInt();
            carro.acelera(velocidade); scanner.nextLine();
            System.out.println("Sua velocidade atual é: " + carro.velocidadeAtual + "km/h . . . \n" +
                    "Você está na " + carro.pegaMarcha() + "ª marcha");
            System.out.println("Deseja aumentar sua velocidade?");
            resposta = scanner.nextLine();
        } while (resposta.equals("sim"));

    }
}
