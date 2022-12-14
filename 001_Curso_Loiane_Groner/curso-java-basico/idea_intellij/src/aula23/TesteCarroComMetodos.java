package src.aula23;
public class TesteCarroComMetodos {
    public static void main(String [] args) {
        CarroComMetodos miniVan = new CarroComMetodos();
        miniVan.marca = "Fiat";
        miniVan.modelo = "Ducato";
        miniVan.anoFabricacao = 2003;
        miniVan.numDePassageiros = 10;
        miniVan.capCombustivel = 100;
        miniVan.consumoCombustivel = 0.2;

        System.out.println("Marca: "+ miniVan.marca);
        System.out.println("Modelo: "+ miniVan.modelo);
        System.out.println("Ano de fabricação: "+ miniVan.anoFabricacao);
        miniVan.exibirAutonomia();

        CarroComMetodos hatch = new CarroComMetodos();
        hatch.marca = "Volkswagen";
        hatch.modelo = "Fusca";
        hatch.anoFabricacao = 1945;
        hatch.numDePassageiros = 4;
        hatch.capCombustivel = 30;
        hatch.consumoCombustivel = 0.15;

        System.out.println("Marca: "+ hatch.marca);
        System.out.println("Modelo: "+ hatch.modelo);
        System.out.println("Ano de fabricação: "+ hatch.anoFabricacao);
        hatch.exibirAutonomia();

        CarroComMetodos sedan = new CarroComMetodos();
        sedan.marca = "Ford";
        sedan.modelo = "Fusion 1º geração";
        sedan.anoFabricacao = 2009;
        sedan.numDePassageiros = 5;
        sedan.capCombustivel = 66;
        sedan.consumoCombustivel = 10.2;

        System.out.println("Marca: "+ sedan.marca);
        System.out.println("Modelo: "+sedan.modelo);
        System.out.println("Ano de fabricação: "+ sedan.modelo);
        sedan.exibirAutonomia();
    }
}
