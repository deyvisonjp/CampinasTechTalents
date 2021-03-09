package test;

import classes.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteCalculadora {

    double x = 5, y = 2.5;
    Calculadora calc = new Calculadora(x, y);

    @Test
    public void TesteSoma()
    {
        Assertions.assertEquals( x + y, calc.getSoma());
    }

    @Test
    public void TesteSubtracao()
    {
        Assertions.assertEquals(x - y, calc.getSubtracao());
    }

    @Test void TesteMultiplicacao()
    {
        Assertions.assertEquals(x * y, calc.getMultiplicacao());
    }

    @Test void TesteDivisao() {
        Assertions.assertEquals(x / y, calc.getDivisao());
    }

}
