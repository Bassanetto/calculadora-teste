import e2e.CalculadoraJunitTest;

public class Main {
    public static void main(String[] args) {
        CalculadoraJunitTest teste = new CalculadoraJunitTest();

        // Soma

        // Cénario de Teste 1 :: Soma de dois valores
        teste.SomarDoisNumerosPositivos();

        // Cénario de Teste Erro 1 :: Soma de dois valores
        teste.SomarDoisNumerosPositivosErro();

        //Cénario de Teste 2 :: Soma de dois valores sendo um 0
        teste.SomaDoisValoresSendoUmZero();

        //Cénario de Teste Erro 2 :: Soma de dois valores sendo um 0
        teste.SomaDoisValoresSendoUmZeroErro();

        //Cénario de Teste 3 :: Soma de dois valores sendo que ambos são 0
        teste.SomaDoisValoresSendoAmbosZero();

        //Cénario de Teste Erro 3 :: Soma de dois valores sendo que ambos são 0
        teste.SomaDoisValoresSendoAmbosZeroErro();

        //Cénario de Teste 4 :: Soma de dois valores sendo um negativo
        teste.SomaDoisValoresSendoUmNegativo();

        //Cénario de Teste Erro 4 :: Soma de dois valores sendo um negativo
        teste.SomaDoisValoresSendoUmNegativoErro();


        // Subtração

        //Cénario de Teste 5 :: Subtração de dois valores
        teste.SubstraiDoisNumeros();

        //Cénario de Teste Erro 5 :: Subtração de dois valores
        teste.SubstraiDoisNumerosErro();

        //Cénario de Teste 6 :: Subtração de dois valores sendo um 0
        teste.SubstraiDoisValoresSendoUmZero();

        //Cénario de Teste Erro 6 :: Subtração de dois valores sendo um 0
        teste.SubstraiDoisValoresSendoUmZeroErro();

        //Cénario de Teste 7 :: Subtração de dois valores sendo que ambos são 0
        teste.SubstraiDoisValoresSendoAmbosZero();

        //Cénario de Teste Erro 7 :: Subtração de dois valores sendo que ambos são 0
        teste.SubstraiDoisValoresSendoAmbosZeroErro();

        //Cénario de Teste 8 :: Subtração de dois valores sendo um negativo
        teste.SubstraiDoisValoresSendoUmNegativo();

        //Cénario de Teste Erro 8 :: Subtração de dois valores sendo um negativo
        teste.SubstraiDoisValoresSendoUmNegativoErro();

        // Multiplicação

        //Cénario de Teste 9 :: Multiplicação de dois valores
        teste.MultiplicaDoisNumerosPositivos();

        //Cénario de Teste Erro 9 :: Multiplicação de dois valores
        teste.MultiplicaDoisNumerosPositivosErro();

        //Cénario de Teste 10 :: Multiplicação de dois valores sendo um 0
        teste.MultiplicaDoisValoresSendoUmZero();

        //Cénario de Teste Erro 10 :: Multiplicação de dois valores sendo um 0
        teste.MultiplicaDoisValoresSendoUmZeroErro();

        //Cénario de Teste 11 :: Multiplicação de dois valores sendo que ambos são 0
        teste.MultiplicaDoisValoresSendoAmbosZero();

        //Cénario de Teste Erro 11 :: Multiplicação de dois valores sendo que ambos são 0
        teste.MultiplicaDoisValoresSendoAmbosZeroErro();

        //Cénario de Teste 12 :: Multiplicação de dois valores sendo um negativo
        teste.MultiplicaDoisValoresSendoUmNegativo();

        //Cénario de Teste Erro 12 :: Multiplicação de dois valores sendo um negativo
        teste.MultiplicaDoisValoresSendoUmNegativoErro();

        // Divisão

        //Cénario de Teste 13 :: Divisão de dois valores
        teste.DivideDoisNumerosPositivos();

        //Cénario de Teste Erro 13 :: Divisão de dois valores
        teste.DivideDoisNumerosPositivosErro();

        //Cénario de Teste 14 :: Divisão de dois valores sendo um 0
        teste.DivideDoisValoresSendoUmZero();

        //Cénario de Teste Erro 15 :: Divisão de dois valores sendo um 0
        teste.DivideDoisValoresSendoUmZeroErro();

        //Cénario de Teste 16 :: Divisão de dois valores sendo que ambos são 0
        teste.DivideDoisValoresSendoAmbosZero();

        //Cénario de Teste 17 :: Divisão de dois valores sendo um negativo
        teste.DivideDoisValoresSendoUmNegativo();

        //Cénario de Teste Erro 17 :: Divisão de dois valores sendo um negativo
        teste.DivideDoisValoresSendoUmNegativoErro();
    }
}