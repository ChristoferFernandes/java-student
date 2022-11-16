package src.aula23;

import src.aula22.Carro;

public class TesteCarroComMetodos {
    public static void main(String [] args) {
        CarroComMetodos sedan = new CarroComMetodos();
        sedan.marca = "Ford";
        sedan.modelo = "Fusion 1º geração";
        sedan.anoFabricacao = 2009;
        sedan.numDePassageiros = 5;
        sedan.capCombustivel = 66;
        sedan.consumoCombustivel = 10.2;

        System.out.println(sedan.marca);
        System.out.println(sedan.modelo);

        sedan.exibirAutonomia();
    }
}
