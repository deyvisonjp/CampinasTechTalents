import java.text.DecimalFormat;
import java.util.Scanner;

public class ExecutarConversor {
    public static void main(String[] args) throws InterruptedException {

        //Mensagem inicial para o terminal
        Scanner scanner = new Scanner(System.in);
        ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
        System.out.println("\nEsse Programa tem por fim, converter uma temperatura Celsius para Fahrenheit");

        //Execução do conversor
        String respostaContinuar;
        do {

            System.out.println("Entre com a temperatura em Celsius: ");
            conversorTemperatura.CelsiusParaFahrenheit(scanner.nextInt());scanner.nextLine();
            System.out.println(conversorTemperatura.ImprimeConversao());

            new Thread().sleep(3000);
            System.out.println("\n. . . Deseja fazer outra conversão? 'Sim - Para continuar' ou " +
                    "'Qualquer outra coisa para sair.' . . .");
            respostaContinuar = scanner.nextLine().toLowerCase();

        } while (respostaContinuar.equals("sim"));

    }
}
