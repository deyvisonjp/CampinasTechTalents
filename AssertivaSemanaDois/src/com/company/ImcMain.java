package com.company;

import java.util.Scanner;

public class ImcMain {
    public static void main(String[] args) {
        Imc imc = new Imc();
        System.out.println(" =================================================== \n" +
                "Bem vindo! Vamos calcular seu Indice de Massa Corporal (IMC) . . . \n" +
                "Por Favor entre com seu peso: "
        );
        Scanner scanner = new Scanner(System.in);
        imc.peso = scanner.nextFloat(); scanner.nextLine();
        System.out.println( "Agora entre com sua altura: ");
        imc.altura = scanner.nextFloat();scanner.nextLine();
        imc.calculaImc();
        System.out.println( " . . . Calculando seu IMC . . . \n" +  imc.resultadoImc());
    }
}
