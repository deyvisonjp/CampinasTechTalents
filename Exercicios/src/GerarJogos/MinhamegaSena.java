package GerarJogos;

import java.util.Scanner;

public class MinhamegaSena {
    public static void main(String[]args) {

        System.out.println("\nBem vindo ao Sorteador da MegaSena\n");

        GeradorDeJogos gj = new GeradorDeJogos();

        Scanner input = new Scanner(System.in);

        System.out.println("Quantos jogos desejam simular?");
        int quantidadeDeJogos = input.nextInt();

        System.out.println("Quantos jogos desejam simular?");
        int quantidadeDeNumeros = input.nextInt();

        gj.GeraJogos(quantidadeDeNumeros, quantidadeDeJogos);
        System.out.println("Com retorno");
        gj.GeraJogos2(quantidadeDeNumeros, quantidadeDeJogos);
        System.out.println(gj.lista);


    }
}
