package e2e;

import Operacoes.Soma;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraJunitTest {

    private Assertions Assert;

    @SuppressWarnings("deprecation")
    @Test
    public void SomarDoisNumerosPositivos() {
        Soma soma = new Soma();
        double resultado = soma.Somar(5, 5);

        Assert.assertEquals(10, resultado);
    }


}
