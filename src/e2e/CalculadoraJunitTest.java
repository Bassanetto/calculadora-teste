package e2e;

import Operacoes.Soma;
import Operacoes.Subtracao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraJunitTest {
    Soma soma = new Soma();
    Subtracao subtracao = new Subtracao();
    private Assertions Assert;

    @SuppressWarnings("deprecation")
    @Test
    public void SomarDoisNumerosPositivos() {

        double resultado = soma.Somar(5, 5);

        Assertions.assertEquals(10, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomaDoisValoresSendoUmZero() {
        double resultado = soma.Somar(3, 0);

        Assertions.assertEquals(3, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomaDoisValoresSendoAmbosZero() {
        double resultado = soma.Somar(0, 0);

        Assertions.assertEquals(0, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomaDoisValoresSendoUmNegativo() {
        double resultado = soma.Somar(5, -3);

        Assertions.assertEquals(2, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubstraiDoisNumeros() {

        double resultado = subtracao.Subtrair(10, 8);

        Assertions.assertEquals(2, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubstraiDoisValoresSendoUmZero() {
        double resultado = subtracao.Subtrair(5, 0);

        Assertions.assertEquals(5, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubstraiDoisValoresSendoAmbosZero() {
        double resultado = subtracao.Subtrair(0, 0);

        Assertions.assertEquals(5, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubstraiDoisValoresSendoUmNegativo() {
        double resultado = subtracao.Subtrair(4, -5);

        Assertions.assertEquals(9, resultado);
    }
}
