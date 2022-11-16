package src.aula25;

public class TesteCarroComParametro {
    public static void main(String [] args) {
        CarroComParametro sedan = new CarroComParametro();
            sedan.marca = "Ford";
            sedan.modelo = "Fusion 1º geração";
            sedan.anoFabricacao = 2009;
            sedan.numPassageiros = 5;
            sedan.capCombustivel = 66;
            sedan.consumoCombustivel = 10.2;

            double qtdCombustivel10 = sedan.calcularCombustivel(10);
            double qtdCombustivel15 = sedan.calcularCombustivel(15);

        System.out.println("quantidade de combustivel 10 = "+ qtdCombustivel10);
        System.out.println("quantidade de combustivel 15 = "+ qtdCombustivel15);
    }
}
