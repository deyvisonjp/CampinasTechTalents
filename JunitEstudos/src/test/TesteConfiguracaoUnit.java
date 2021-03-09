package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteConfiguracaoUnit {
    @Test
    public void testeConfiguracao() {
        Assertions.assertEquals(2, (1+1), 0);
    }

    @Test
    public void testeConfiguracaoNegativo() {
        Assertions.assertEquals(2, (2+1), 0);
    }

}
