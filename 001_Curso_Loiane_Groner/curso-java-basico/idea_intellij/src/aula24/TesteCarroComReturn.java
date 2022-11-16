package src.aula24;

public class TesteCarroComReturn {
    public static void main(String[] args) {
        CarroComReturn fusion = new CarroComReturn();
        fusion.marca = "Ford";
        fusion.modelo = "Fusion 1º geração";
        fusion.anoFabricacao = 2009;
        fusion.numDePassageiros = 5;
        fusion.capCombustivel = 66;
        fusion.consumoCombustivel = 10.2;

        System.out.println(fusion.marca);
        System.out.println(fusion.modelo);

        fusion.exibirAutonomia();

        double autonomia = fusion.obterAutonomia();
        System.out.println("A autonomia do carro é: "+ autonomia);
        System.out.println("A autonomia do carro é: "+ fusion.obterAutonomia());
    }
}
