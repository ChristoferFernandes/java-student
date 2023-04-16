package src.aula24;

public class TesteCarroComReturn {
  public static void main(String[] args) {
	CarroComReturn miniVan = new CarroComReturn();
	miniVan.marca = "Fiat";
	miniVan.modelo = "Ducato";
	miniVan.anoFabricacao = 2003;
	miniVan.numDePassageiros = 10;
	miniVan.capCombustivel = 100;
	miniVan.consumoCombustivel = 0.2;

	System.out.println("Marca: " + miniVan.marca);
	System.out.println("Modelo: " + miniVan.modelo);
	System.out.println("Ano de fabricação: " + miniVan.anoFabricacao);
	double autonomia = miniVan.obterAutonomia();
	System.out.println("A autonomia do carro é: " + autonomia + " km. CHAMADO COM VARIAVEL AUXILIAR"); // COLOCANDO O MÉTODO RETURN DENTRO DE UMA VARIÁVEL
	System.out.println("A autonomia do carro é: " + miniVan.obterAutonomia() + " km. CHAMADO SEM VARIAVEL AUXILIAR"); // COLOCANDO MÉTODO RETURN SEM SER DENTRO DE UMA VARIÁVEL
	System.out.println();

	CarroComReturn sedan = new CarroComReturn();
	sedan.marca = "Ford";
	sedan.modelo = "Fusion 1º geração";
	sedan.anoFabricacao = 2009;
	sedan.numDePassageiros = 5;
	sedan.capCombustivel = 66;
	sedan.consumoCombustivel = 10.2;

	System.out.println(sedan.marca);
	System.out.println(sedan.modelo);

	autonomia = sedan.obterAutonomia();
	System.out.println("A autonomia do carro é: " + autonomia + " km. CHAMADO COM VARIAVEL AUXILIAR"); // COLOCANDO O MÉTODO RETURN DENTRO DE UMA VARIÁVEL
	System.out.println("A autonomia do carro é: " + sedan.obterAutonomia() + " km. CHAMADO SEM VARIAVEL AUXILIAR"); // COLOCANDO MÉTODO RETURN SEM SER DENTRO DE UMA VARIÁVEL
	System.out.println();

	CarroComReturn hatch = new CarroComReturn();
	hatch.marca = "Volkswagen";
	hatch.modelo = "Fusca";
	hatch.anoFabricacao = 1945;
	hatch.numDePassageiros = 4;
	hatch.capCombustivel = 30;
	hatch.consumoCombustivel = 0.15;

	System.out.println("Marca: " + hatch.marca);
	System.out.println("Modelo: " + hatch.modelo);
	System.out.println("Ano de fabricação: " + hatch.anoFabricacao);
	autonomia = hatch.obterAutonomia();
	System.out.println("A autonomia do carro é: " + autonomia + " km. CHAMADO COM VARIAVEL AUXILIAR"); // COLOCANDO O MÉTODO RETURN DENTRO DE UMA VARIÁVEL
	System.out.println("A autonomia do carro é: " + hatch.obterAutonomia() + " km. CHAMADO SEM VARIAVEL AUXILIAR"); // COLOCANDO MÉTODO RETURN SEM SER DENTRO DE UMA VARIÁVEL

  }
}
