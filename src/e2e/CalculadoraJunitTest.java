package e2e;

import Operacoes.Divisao;
import Operacoes.Multiplicacao;
import Operacoes.Soma;
import Operacoes.Subtracao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraJunitTest {
    Soma soma = new Soma();
    Subtracao subtracao = new Subtracao();
    Multiplicacao multiplicacao = new Multiplicacao();
    Divisao divisao = new Divisao();
    private Assertions Assert;

    //Soma

    @SuppressWarnings("deprecation")
    @Test
    public void SomarDoisNumerosPositivos() {

        double resultado = soma.Somar(5, 5);

        Assertions.assertEquals(10, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomarDoisNumerosPositivosErro() {

        double resultado = soma.Somar(5, 5);

        Assertions.assertEquals(9, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomaDoisValoresSendoUmZero() {
        double resultado = soma.Somar(3, 0);

        Assertions.assertEquals(3, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomaDoisValoresSendoUmZeroErro() {
        double resultado = soma.Somar(3, 0);

        Assertions.assertEquals(2, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomaDoisValoresSendoAmbosZero() {
        double resultado = soma.Somar(0, 0);

        Assertions.assertEquals(0, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomaDoisValoresSendoAmbosZeroErro() {
        double resultado = soma.Somar(0, 0);

        Assertions.assertEquals(1, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomaDoisValoresSendoUmNegativo() {
        double resultado = soma.Somar(5, -3);

        Assertions.assertEquals(2, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SomaDoisValoresSendoUmNegativoErro() {
        double resultado = soma.Somar(5, -3);

        Assertions.assertEquals(4, resultado);
    }

    // Subtração

    @SuppressWarnings("deprecation")
    @Test
    public void SubstraiDoisNumeros() {

        double resultado = subtracao.Subtrair(10, 8);

        Assertions.assertEquals(2, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubstraiDoisNumerosErro() {

        double resultado = subtracao.Subtrair(10, 8);

        Assertions.assertEquals(1, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubstraiDoisValoresSendoUmZero() {
        double resultado = subtracao.Subtrair(5, 0);

        Assertions.assertEquals(5, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubstraiDoisValoresSendoUmZeroErro() {
        double resultado = subtracao.Subtrair(5, 0);

        Assertions.assertEquals(4, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubstraiDoisValoresSendoAmbosZero() {
        double resultado = subtracao.Subtrair(0, 0);

        Assertions.assertEquals(0, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubstraiDoisValoresSendoAmbosZeroErro() {
        double resultado = subtracao.Subtrair(0, 0);

        Assertions.assertEquals(10, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubstraiDoisValoresSendoUmNegativo() {
        double resultado = subtracao.Subtrair(4, -5);

        Assertions.assertEquals(9, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void SubstraiDoisValoresSendoUmNegativoErro() {
        double resultado = subtracao.Subtrair(4, -5);

        Assertions.assertEquals(11, resultado);
    }

    // Multiplicação

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicaDoisNumerosPositivos() {

        double resultado = multiplicacao.Multiplicar(10, 10);

        Assertions.assertEquals(100, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicaDoisNumerosPositivosErro() {

        double resultado = multiplicacao.Multiplicar(10, 10);

        Assertions.assertEquals(90, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicaDoisValoresSendoUmZero() {
        double resultado = multiplicacao.Multiplicar(10, 0);

        Assertions.assertEquals(0, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicaDoisValoresSendoUmZeroErro() {
        double resultado = multiplicacao.Multiplicar(10, 0);

        Assertions.assertEquals(3, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicaDoisValoresSendoAmbosZero() {
        double resultado = multiplicacao.Multiplicar(0, 0);

        Assertions.assertEquals(1, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicaDoisValoresSendoAmbosZeroErro() {
        double resultado = multiplicacao.Multiplicar(0, 0);

        Assertions.assertEquals(0, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicaDoisValoresSendoUmNegativo() {
        double resultado = multiplicacao.Multiplicar(4, -5);

        Assertions.assertEquals(-20, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void MultiplicaDoisValoresSendoUmNegativoErro() {
        double resultado = multiplicacao.Multiplicar(4, -5);

        Assertions.assertEquals(-10, resultado);
    }

    // Divisão

    @SuppressWarnings("deprecation")
    @Test
    public void DivideDoisNumerosPositivos() {

        double resultado = divisao.Dividir(10, 10);

        Assertions.assertEquals(1, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void DivideDoisNumerosPositivosErro() {

        double resultado = divisao.Dividir(10, 10);

        Assertions.assertEquals(0, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void DivideDoisValoresSendoUmZero() {

        double resultado = divisao.Dividir(50, 0);

        Assertions.assertEquals(0, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void DivideDoisValoresSendoUmZeroErro() {

        double resultado = divisao.Dividir(50, 0);

        Assertions.assertEquals(10, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void DivideDoisValoresSendoAmbosZero() {

        double resultado = divisao.Dividir(0, 0);

        Assertions.assertEquals(3, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void DivideDoisValoresSendoUmNegativo() {

        double resultado = divisao.Dividir(10, -5);

        Assertions.assertEquals(-2, resultado);
    }

    @SuppressWarnings("deprecation")
    @Test
    public void DivideDoisValoresSendoUmNegativoErro() {

        double resultado = divisao.Dividir(10, -5);

        Assertions.assertEquals(-5, resultado);
    }
}
