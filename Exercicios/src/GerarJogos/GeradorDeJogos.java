package GerarJogos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class GeradorDeJogos {

    public void GeraJogos(int quantidadeNumeros, int quantidadeJogos) {
        Random numeroRandom = new Random();
        for(int i = 0; i < quantidadeJogos; i++) {
            TreeSet<Integer> numeros = new TreeSet<>();
            for (int j = 0; j < quantidadeNumeros; j++) {
                numeros.add(numeroRandom.nextInt(60)+1);
            }
            System.out.println(numeros);
        }
    }

    /* TODO
    *   Criar um metódo que tenha o retorno da list
    * */

    List<TreeSet<Integer>> lista = new ArrayList<>();

    public void GeraJogos2(int quantidadeNumeros, int quantidadeJogos) {
        Random numeroRandom = new Random();
        for(int i = 0; i < quantidadeJogos; i++) {
            TreeSet<Integer> numeros = new TreeSet<>();
            for (int j = 0; j < quantidadeNumeros; j++) {
                numeros.add(numeroRandom.nextInt(60)+1);
            }
            lista.add(numeros);
        }
    }
}
