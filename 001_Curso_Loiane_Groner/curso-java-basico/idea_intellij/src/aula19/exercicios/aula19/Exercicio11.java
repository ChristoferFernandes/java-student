package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            int[] vetorA = new int[10];
            int valor = 0;

        for (int count = 0; count < vetorA.length; count++) {
            System.out.print("Informe o valor da "+ (count+1) +"º posição do vetor: ");
                vetorA[count] = tecla.nextInt();
            if (vetorA[count] % 2 == 0) {
                    valor ++;
            }
        }
        System.out.print("Números pares informados pelo usuário: ");
        for (int count = 0; count < vetorA.length; count++) {
            if (vetorA[count] % 2 == 0){
                System.out.print(vetorA[count] +" ");
            }
        }
        System.out.println();
        System.out.println("O total de números pares informados é de: "+ valor);
    }
}
