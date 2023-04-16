package src.aula23;

public class CarroComMetodos {

  String marca;
  String modelo;
  int anoFabricacao;
  int numDePassageiros;
  double capCombustivel;
  double consumoCombustivel;

  void exibirAutonomia() {
	System.out.printf("A autonomia do carro é: %.2f km \n", capCombustivel * consumoCombustivel);
	System.out.println();

  }
}
