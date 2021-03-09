package com.company;

import java.util.Scanner;

public class MaiorEMenorComIf {

    public static void main(String[] main){
        final int INT_MAX = 2147483647;
        int maior = 0, menor = INT_MAX;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o 1º valor: ");
        int n1 = scanner.nextInt();
        System.out.println("Entre com o 2º valor: ");
        int n2 = scanner.nextInt();
        System.out.println("Entre com o 3º valor: ");
        int n3 = scanner.nextInt();

        int[] numeros = {n1, n2, n3};

        //Encontrando o maior com if
        if(numeros[0] > numeros[1] && numeros[0] > numeros[2]) {
            maior = numeros[0];
        } else if (numeros[1] > numeros[0] && numeros[1] > numeros[2]) {
            maior = numeros[1];
        } else {
            maior = numeros[2];
        }
        //Encontrando o menor com if
        if(numeros[0] < numeros[1] && numeros[0] < numeros[2]) {
            menor = numeros[0];
        } else if (numeros[1] < numeros[0] && numeros[1] < numeros[2]) {
            menor = numeros[1];
        } else {
            menor = numeros[2];
        }

        // Imprime o maior e menor digitado
        System.out.println("O maior digitado é: " + maior);
        System.out.println("O maior digitado é: " + menor);

    }


}
