package src.aula25;

public class TesteCarroComParametro {
  public static void main(String[] args) {
	 
	 CarroComParametro miniVan = new CarroComParametro();
	 miniVan.marca = "Fiat";
	 miniVan.modelo = "Ducato";
	 miniVan.anoFabricacao = 2003;
	 miniVan.numPassageiros = 10;
	 miniVan.capCombustivel = 100;
	 miniVan.consumoCombustivel = 0.2;
	 
	 double qtdCombustivel10 = miniVan.calcularCombustivel(10);
	 double qtdCombustivel15 = miniVan.calcularCombustivel(15);
	 System.out.println("MiniVan");
	 System.out.println("quantidade de combustivel10 = " + qtdCombustivel10);
	 System.out.println("quantidade de combustivel15 = " + qtdCombustivel15);
	 System.out.println();
	 
	 CarroComParametro sedan = new CarroComParametro();
	 sedan.marca = "Ford";
	 sedan.modelo = "Fusion 1º geração";
	 sedan.anoFabricacao = 2009;
	 sedan.numPassageiros = 5;
	 sedan.capCombustivel = 66;
	 sedan.consumoCombustivel = 10.2;
	 
	 qtdCombustivel10 = sedan.calcularCombustivel(10);
	 qtdCombustivel15 = sedan.calcularCombustivel(15);
	 System.out.println("Sedan");
	 System.out.println("quantidade de combustivel10 = " + qtdCombustivel10);
	 System.out.println("quantidade de combustivel15 = " + qtdCombustivel15);
	 System.out.println();
	 
	 CarroComParametro hatch = new CarroComParametro();
	 hatch.marca = "Volkswagen";
	 hatch.modelo = "Fusca";
	 hatch.anoFabricacao = 1945;
	 hatch.numPassageiros = 4;
	 hatch.capCombustivel = 30;
	 hatch.consumoCombustivel = 0.15;
	 
	 qtdCombustivel10 = hatch.calcularCombustivel(10);
	 qtdCombustivel15 = hatch.calcularCombustivel(15);
	 System.out.println("Hatch");
	 System.out.println("quantidade de combustivel10 = " + qtdCombustivel10);
	 System.out.println("quantidade de combustivel15 = " + qtdCombustivel15);
	 System.out.println();
  }
}
