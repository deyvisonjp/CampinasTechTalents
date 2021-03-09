package TryCatchFraseNull;

import java.util.Locale;

public class TesteFrase {
    public static void main (String[] args) {
        String frase = null;
        String novaFrase = null;

        try {
            novaFrase = frase.toUpperCase();
        } catch ( NullPointerException e) {
            System.out.println("A frase inicial esta nula, para solucionar o problema, " +
                    "foi lhe atribuido um valor default.");

            frase = "Nova Frase, pode ser qualquer coisa.";

            e.printStackTrace();

        // Finally -> Tratamos o possível erro
        } finally {
            novaFrase = frase.toUpperCase();
        }

        System.out.println("Frase antiga: " + frase);
        System.out.println("Frase nova: " + novaFrase);
    }
}
