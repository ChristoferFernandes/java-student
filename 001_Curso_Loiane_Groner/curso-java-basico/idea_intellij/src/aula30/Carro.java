package src.aula30;

public class Carro {
  String marca;
  String modelo;
  int numDePassageiros;
  double capCombustivel;
  double consumoCombustivel;

  public Carro(String marca, String modelo, int numDePassageiros, double capCombustivel, double consumoCombustivel) {
	this.marca = marca;
	this.modelo = modelo;
	this.numDePassageiros = numDePassageiros;
	this.capCombustivel = capCombustivel;
	this.consumoCombustivel = consumoCombustivel;
  }

  public Carro(String marca, String modelo) {
	this.marca = marca;
	this.modelo = modelo;
  }

  public Carro(String marca, String modelo, int numDePassageiros) {
	this.marca = marca;
	this.modelo = modelo;
	this.numDePassageiros = numDePassageiros;
  }

  public Carro() {
  }

  void exibirAutonomia() { //MÉTODO VAZIO
	System.out.printf("A autonomia do carro é: %.2f km \n", capCombustivel * consumoCombustivel);
	System.out.println();

  }

  double obterAutonomia() { // MÉTODO COM RETURN
	System.out.println("Método obterAutonomia foi chamado.");
	return capCombustivel * consumoCombustivel;
  }

  double calcularCombustivel(double km) { // MÉTODO COM PARÂMETRO
	double qtdCombustivel = km / consumoCombustivel;
	return qtdCombustivel;
  }
}
