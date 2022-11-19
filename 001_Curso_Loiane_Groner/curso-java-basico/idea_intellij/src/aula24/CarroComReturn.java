package src.aula24;

public class CarroComReturn {
    String marca;
    String modelo;
    int anoFabricacao;
    int numDePassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia () {
        System.out.printf("A autonomia do carro é: %.2f km.", capCombustivel * consumoCombustivel );
    }

     double obterAutonomia() {
        System.out.println("Método obterAutonomia foi chamado.");
         return  capCombustivel * consumoCombustivel;
    }
}
