package src.aula22;

public class TesteCarro {
    public static void main(String[] args) {
        Carro miniVan = new Carro();
            miniVan.marca = "Fiat";
            miniVan.modelo = "Ducato";
            miniVan.anoFabricacao = 2003;
            miniVan.numDePassageiros = 10;
            miniVan.capCombustivel = 100;
            miniVan.consumoCombustivel = 0.2;

        System.out.println("Marca: "+ miniVan.marca);
        System.out.println("Modelo: "+ miniVan.modelo);
        System.out.println("Ano de fabricação: "+ miniVan.anoFabricacao);

        System.out.println();

        Carro hatch = new Carro();
            hatch.marca = "Volkswagen";
            hatch.modelo = "Fusca";
            hatch.anoFabricacao = 1945;
            hatch.numDePassageiros = 4;
            hatch.capCombustivel = 30;
            hatch.consumoCombustivel = 0.15;

        System.out.println("Marca: "+ hatch.marca);
        System.out.println("Modelo: "+ hatch.modelo);
        System.out.println("Ano de fabricação: "+ hatch.anoFabricacao);
    }
}
