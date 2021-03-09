import java.text.DecimalFormat;

public class ConversorTemperatura {
    public int celsius;
    public float fahrenheit;

    public void CelsiusParaFahrenheit(int celsius) {
        fahrenheit = (9*celsius+160)/5;
    }

    public String ImprimeConversao() {
        DecimalFormat df = new DecimalFormat("0.0");
        return "------------------------------------------------------\n" +
        "\t A Temperatura em Fahrenheit é  " + df.format(fahrenheit) + " °F.\n" +
        "------------------------------------------------------";
    }

}
