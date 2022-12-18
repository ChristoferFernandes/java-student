package src.aula29;

public class Carro {
	String marca;
	String modelo;
	int numDePassageiros;
	double capCombustivel;
	double consumoCombustivel;

	Carro() { // Construtor Vazio
		System.out.println("Instanciando um método de construção vazio");
		numDePassageiros = 4;
	}
	
	Carro(String marca_, String modelo_, int numDePassageiros_, double capCombustivel_, double consumoCombustivel_) {
		marca = marca_;
		modelo = modelo_;
		numDePassageiros = numDePassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}

public Carro(String marca, String modelo, int numDePassageiros, double capCombustivel) {
	this.marca = marca;
	this.modelo = modelo;
	this.numDePassageiros = numDePassageiros;
	this.capCombustivel = capCombustivel;
}

void exibirAutonomia () { //MÉTODO VAZIO
		System.out.printf("A autonomia do carro é: %.2f km \n", capCombustivel * consumoCombustivel);
		System.out.println();
	
	}

	double obterAutonomia() { // MÉTODO COM RETURN
		System.out.println("Método obterAutonomia foi chamado.");
		return  capCombustivel * consumoCombustivel;
	}

	double calcularCombustivel(double km) { // MÉTODO COM PARÂMETRO
		double qtdCombustivel = km/ consumoCombustivel;
		return qtdCombustivel;
	}
}
