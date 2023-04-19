package src.aula29;

public class TesteCarro {
	 public TesteCarro() {
	 }
	 
	 public static void main(String[] args) {
			Carro van = new Carro();
			van.marca = "Fiat";
			van.modelo = "Ducato";
			// van.numDePassageiros = 10;
			van.capCombustivel = 100;
			van.consumoCombustivel = 0.2;
			
			System.out.println(van.numDePassageiros);
			
			Carro van2 = new Carro("Fiat", "Ducato", 10, 100, 0.2);
			System.out.println(van2.marca);
			System.out.println(van2.modelo);
			System.out.println(van2.numDePassageiros);
			System.out.println(van2.capCombustivel);
			System.out.println(van2.consumoCombustivel);
	 }
}
