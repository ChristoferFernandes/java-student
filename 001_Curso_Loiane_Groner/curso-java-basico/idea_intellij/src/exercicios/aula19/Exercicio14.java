package src.exercicios.aula19;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            int[] vetorA = new int[10];
            int soma = 0;
            int aux = 0;
            double media;

        for (int count = 0; count < vetorA.length; count++) {
            System.out.print("Informe o valor da "+ (count+1) +"º posição do vetor: ");
                vetorA[count] = tecla.nextInt();
        }
        System.out.print("Números Impares = ");
        for (int count = 0; count < vetorA.length; count++) {
            if(vetorA[count] % 2 == 1){
                System.out.print(vetorA[count] +" ");
                soma += vetorA[count];
                aux++;
            }
        }
            media = soma / aux;
        System.out.println();
        System.out.println("Soma dos valores: "+ soma);
        System.out.println("Media dos valores: "+ media);
    }
}