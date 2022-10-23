package src.exercicios.aula1617;

public class Exercicio29 {
    public static void main(String[] args) {

         double valor = 1.99;
        System.out.println("Lojas Quase Dois - Tabelas de preços: ");
        for (int count = 1; count <= 50; count++) {
            System.out.println(count +" - R$"+ valor);
                valor += 1.99;
        }
    }
}
