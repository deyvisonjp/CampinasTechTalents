import java.util.Scanner;

public class WhileAndScanner {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int indice = 0;

        System.out.println("Digite o código de DDD da sua cidade:");
        byte ddd = sc.nextByte();
        sc.nextLine();

        System.out.println("Digite seu numero de telefone:");
        String telefone = sc.nextLine();

        while (indice < 5 ) {
            System.out.println("Seu telefone é (" + ddd + ") " + telefone);
            indice++;
        }

    }

}
