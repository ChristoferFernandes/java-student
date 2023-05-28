package src.aula22;

public class TesteCarro {
  public static void main(String[] args) {

	 Carro sedan = new Carro();
	 sedan.tipos = new String[3];
	 sedan.tipos[0] = "Sedan";
	 sedan.marca = "Ford";
	 sedan.modelo = "Fusion";
	 sedan.numDePassageiros = 5;
	 sedan.capCombustivel = 66;
	 sedan.consumoCombustivel = 10.2;
	 
	 System.out.println("Tipo do carro: " + sedan.tipos[0]);
	 System.out.println("Marca: " + sedan.marca);
	 System.out.println("Modelo: " + sedan.modelo);

  }
}
