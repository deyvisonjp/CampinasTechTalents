import java.util.Scanner;

public class ExecutaMenuDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        int numeroMenu;
        do {
            System.out.println("========== MENU ==========");
            menu.imprimeMenu();
            System.out.println("==========================");
            System.out.println("Escolha uma opção:");

            numeroMenu = scanner.nextInt();

            //Em caso de um numero inválido
            while (numeroMenu < 0 || numeroMenu > 5) {
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("Opção Inválida! 0 a 5");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("Escolha uma opção:");
                numeroMenu = scanner.nextInt();
            }

        } while (numeroMenu != 0);
        System.out.println("Até Breve!");

    }
}
