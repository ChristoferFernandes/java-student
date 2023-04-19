package src.aula25;

public class CarroComParametro {
	 String marca;
	 String modelo;
	 int anoFabricacao;
	 int numPassageiros;
	 double capCombustivel;
	 double consumoCombustivel;
	 
	 double calcularCombustivel(double km) {
			
			double qtdCombustivel = km / consumoCombustivel;
			
			return qtdCombustivel;
	 }
}
