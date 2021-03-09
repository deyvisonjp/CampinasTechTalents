package test;
import classes.Participante;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParticipanteTeste {
    Participante participante = new Participante();

    @Test
    public void TestSetNome()
    {
        participante.setNome("Deyvison");
        Assertions.assertEquals("Joao", participante.getNome());

    }

    @Test
    public void testeSetIdade()
    {
        participante.setIdade((byte) 32);
        Assertions.assertEquals(32, participante.getIdade());
    }
}
