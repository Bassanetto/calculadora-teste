import e2e.CalculadoraJunitTest;

public class Main {
    public static void main(String[] args) {
        CalculadoraJunitTest teste = new CalculadoraJunitTest();

        // Cénario de Teste 1 :: Soma de dois valores
        teste.SomarDoisNumerosPositivos();

        //Cénario de Teste 2 :: Soma de dois valores sendo um 0
        teste.SomaDoisValoresSendoUmZero();

        //Cénario de Teste 3 :: Soma de dois valores sendo que ambos são 0
        teste.SomaDoisValoresSendoAmbosZero();

        //Cénario de Teste 4 :: Soma de dois valores sendo um negativo
        teste.SomaDoisValoresSendoUmNegativo();

        //Cénario de Teste 5 :: Subtração de dois valores
        teste.SubstraiDoisNumeros();

        //Cénario de Teste 6 :: Subtração de dois valores sendo um 0
        teste.SubstraiDoisValoresSendoUmZero();

        //Cénario de Teste 7 :: Subtração de dois valores sendo que ambos são 0
        teste.SubstraiDoisValoresSendoAmbosZero();

        //Cénario de Teste 8 :: Subtração de dois valores sendo um negativo
        teste.SubstraiDoisValoresSendoAmbosZero();
    }
}