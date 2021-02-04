import java.util.Locale;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione a 'melhor' linguagem: \n [1] - Java \n [2] - C");
        byte escolha = sc.nextByte();

        switch (escolha) {
            case 1:
                System.out.println("Melhor escolha! Esta linguagem é orientada a Objetos");
                break;
            case 2:
                System.out.println("Esta linguagem é estruturada.");
                break;
            default:
                System.out.println("Linguagem desconhecida! \n " +
                        " Por favor escolha a opção 1 ou a opção 2");
        }
    }
}

/* Se estivessemos utilizando a String Java e C poderíamos
 *   System.out.println("Java ou C");
 *    String escolha = sc.next().toLowerCase();
 * */


// Outra forma de fazer o case seria (jdk + atuais):
/*
* case 1 -> System.out.println("Melhor escolha! Esta linguagem é orientada a Objetos");
  case 2 -> System.out.println("Esta linguagem é estruturada.");
  default -> System.out.println("Linguagem desconhecida!");
* */
