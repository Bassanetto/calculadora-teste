import Operacoes.Divisao;
import Operacoes.Multiplicacao;
import Operacoes.Soma;
import Operacoes.Subtracao;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();


        System.out.println("=================================== SOMA ===================================");
        System.out.println(" ");

        // Primeiro Teste
        int testeSoma = soma.Somar(70,30);
        System.out.println("Soma :: dois números inteiros positivos: " + testeSoma + " ✅");

        // Segundo Teste
        testeSoma = soma.Somar(-60,-40);
        System.out.println("Soma :: dois números inteiros negativos: " + testeSoma + " ✅");

        // Terceiro Teste
        testeSoma = soma.Somar(150,-50);
        System.out.println("Soma :: dois números inteiros um positivo e um negativo: " + testeSoma + " ✅");

        // Quarto Teste
        testeSoma = soma.Somar(0,0);
        System.out.println("Soma :: dois numeros nulos: " + testeSoma + " ✅");

        // Quinto Teste
        testeSoma = soma.Somar(100,0);
        System.out.println("Soma :: dois numeros inteiros um nulo e um positivo: " + testeSoma + " ✅");

        // Sexto Teste
        testeSoma = soma.Somar(-100,0);
        System.out.println("Soma :: dois numeros inteiros um nulo e um negativo: " + testeSoma + " ✅");

        System.out.println(" ");
        System.out.println("================================= SUBTRAÇÃO =================================");
        System.out.println(" ");

        // Primeiro Teste
        int testeSubtracao = subtracao.Subtrair(70,30);
        System.out.println("Subtração :: dois números inteiros positivos: " + testeSubtracao + " ✅");

        // Segundo Teste
        testeSubtracao = subtracao.Subtrair(-60,-40);
        System.out.println("Subtração :: dois números inteiros negativos: " + testeSubtracao + " ✅");

        // Terceiro Teste
        testeSubtracao = subtracao.Subtrair(150,-50);
        System.out.println("Subtração :: dois números inteiros um positivo e um negativo: " + testeSubtracao + " ✅");

        // Quarto Teste
        testeSubtracao = subtracao.Subtrair(0,0);
        System.out.println("Subtração :: dois numeros nulos: " + testeSubtracao + " ✅");

        // Quinto Teste
        testeSubtracao = subtracao.Subtrair(100,0);
        System.out.println("Subtração :: dois numeros inteiros um nulo e um positivo: " + testeSubtracao + " ✅");

        // Sexto Teste
        testeSubtracao = subtracao.Subtrair(-100,0);
        System.out.println("Subtração :: dois numeros inteiros um nulo e um negativo: " + testeSubtracao + " ✅");

        System.out.println(" ");
        System.out.println("=============================== MULTIPLICAÇÃO ==============================");
        System.out.println(" ");

        // Primeiro Teste
        int testeMultiplicacao = multiplicacao.Multiplicar(70,30);
        System.out.println("Multiplicação :: dois números inteiros positivos: " + testeMultiplicacao + " ✅");

        // Segundo Teste
        testeMultiplicacao = multiplicacao.Multiplicar(-60,-40);
        System.out.println("Multiplicação :: dois números inteiros negativos: " + testeMultiplicacao + " ✅");

        // Terceiro TEste
        testeMultiplicacao = multiplicacao.Multiplicar(150,-50);
        System.out.println("Multiplicação :: dois números inteiros um positivo e um negativo: " + testeMultiplicacao + " ✅");

        // Quarto Teste
        testeMultiplicacao = multiplicacao.Multiplicar(0,0);
        System.out.println("Multiplicação :: dois numeros nulos: " + testeMultiplicacao + " ✅");

        // Quinto Teste
        testeMultiplicacao = multiplicacao.Multiplicar(100,0);
        System.out.println("Multiplicação :: dois numeros inteiros um nulo e um positivo: " + testeMultiplicacao + " ✅");

        // Sexto Teste
        testeMultiplicacao = multiplicacao.Multiplicar(-100,0);
        System.out.println("Multiplicação :: dois numeros inteiros um nulo e um negativo: " + testeMultiplicacao + " ✅");

        System.out.println(" ");
        System.out.println("================================= DIVISÃO ==================================");
        System.out.println(" ");

        // Primeiro Teste
        int testeDivisao = divisao.Dividir(70,30);
        System.out.println("Primeiro teste, dois números inteiros positivos: " + testeDivisao + " ✅");

        // Segundo Teste
        testeDivisao = divisao.Dividir(-60,-40);
        System.out.println("Segundo teste, dois números inteiros negativos: " + testeDivisao + " ✅");

        // Terceiro Teste
        testeDivisao = divisao.Dividir(150,-50);
        System.out.println("Terceiro teste, dois números inteiros um positivo e um negativo: " + testeDivisao + " ✅");

        System.out.println(" ");
        System.out.println("‼️ Não é possível reproduzir os próximos testes pois não existe divisão por 0 ‼️");
    }
}