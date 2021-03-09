package ConsumoCombustivel;

import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Qual a distância percorrida (km)? ");
        double distancia = Double.parseDouble(scanner.nextLine());
        System.out.println("Quantos litros foram gastos ? ");
        double litros = Double.parseDouble(scanner.nextLine());
        ConsumoCombustivel cc = new ConsumoCombustivel(distancia, litros);
        cc.media(cc.getDistancia(), cc.getCombustivelGasto());
    }
}
