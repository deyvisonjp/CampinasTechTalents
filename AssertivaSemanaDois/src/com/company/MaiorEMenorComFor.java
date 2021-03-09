package com.company;

import java.util.Scanner;

public class MaiorEMenorComFor {
    public static void main(String[] main) {

        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;
        int maior = INT_MIN, menor = INT_MAX;
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************* \n Entre com 3 valores: ");

        int numeros[] = new int[3];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Entre com o " + i + "º valor:");
            numeros[i] = scanner.nextInt();
            if (numeros[i] > maior) {
                maior = numeros[i];
            } else if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Imprime o maior e menor digitado
        System.out.println("O maior digitado é: " + maior);
        System.out.println("O maior digitado é: " + menor);
    }
}
