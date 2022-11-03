package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            int tabuada;

        System.out.print("Informe o número que você quer ver a tabuada: ");
            int valor = tecla.nextInt();

        System.out.println("Tabuada de "+ valor +":");
        for (int count = 1; count <= 10; count++) {
            tabuada = valor * count;
            System.out.println(valor +" * "+ count +" = "+ tabuada);
        }
    }
}
