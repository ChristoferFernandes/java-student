package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            int[] vetorA = new int[10];
            double qtdPar = 0, perPar;
            double qtdImpar = 0,perImpar;

        for (int count = 0; count < vetorA.length; count++) {
            System.out.print("Informe o valor da "+ (count+1) +"º posição do vetor: ");
                vetorA[count] = tecla.nextInt();
        }
        System.out.print("Números Pares = ");
        for (int count = 0; count < vetorA.length; count++) {
            if (vetorA[count] % 2 == 0) {
                System.out.print(vetorA[count] +" ");
                qtdPar++;
            }
        }
        System.out.println();
        System.out.print("Números Impares = ");
        for (int count = 0; count < vetorA.length; count++) {
            if(vetorA[count] % 2 == 1){
                System.out.print(vetorA[count] +" ");
                qtdImpar++;
            }
        }
            perPar = (qtdPar * 100) / vetorA.length;
            perImpar = (qtdImpar * 100) / vetorA.length;
        System.out.println();
        System.out.println("Percentual de números pares: "+ perPar +"%");
        System.out.println("Percentual de números impares "+ perImpar +"%");
    }
}
