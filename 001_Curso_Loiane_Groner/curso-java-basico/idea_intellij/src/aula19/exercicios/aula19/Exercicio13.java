package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            int[] vetorA = new int[10];
            int soma = 0;

        for (int count = 0; count < vetorA.length; count++) {
            System.out.print("Informe o valor da "+ (count+1) +"º posição: ");
                vetorA[count] = tecla.nextInt();
        }
        System.out.print("VetorA = ");
        for (int count = 0; count < vetorA.length; count++) {
            if (vetorA[count] % 5 == 0) {
                System.out.print(vetorA[count] +" ");
                soma += vetorA[count];
            }
        }
        System.out.println();
        System.out.println("A soma dos valores: "+ soma);
    }
}
