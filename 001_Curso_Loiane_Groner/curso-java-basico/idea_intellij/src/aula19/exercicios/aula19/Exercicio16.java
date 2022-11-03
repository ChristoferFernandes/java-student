package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            int[] vetorA = new int[10];
            int casoA = 0, casoB = 0, casoC = 0;
            double media;

        for (int count = 0; count < vetorA.length; count++) {
            System.out.print("Informe o valor da "+ (count+1) +"º posição do vetor: ");
                vetorA[count] = tecla.nextInt();
        }
        System.out.print("vetorA = ");
        for (int count = 0; count < vetorA.length; count++) {
            System.out.print(vetorA[count] +" ");
            if(vetorA[count] < 15){
                casoA += vetorA[count];
            } else if (vetorA[count] == 15) {
                casoB++;
            } else if (vetorA[count] > 15){
                casoC += vetorA[count];
            }
        }
            media = casoC / vetorA.length;
        System.out.println();
        System.out.println("A- a soma dos valores inferiores a 15: "+ casoA);
        System.out.println("B- a quantidade de elementos que são iguais a 15: "+casoB);
        System.out.println("C- a média dos valores que são maiores que 15: "+ media);
    }
}
