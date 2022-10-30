package src.exercicios.aula19;

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

            int[] valores = new int[20];
            int[] parEImpar = new int[valores.length];
            int aux = 0;

        for (int count = 0; count < valores.length; count++) {
            System.out.print("Entre com a informação do valor na "+ (count+1) +" posição: ");
                valores[count] = key.nextInt();
        }
        for (int count = 0; count < valores.length; count++) {
            if(valores[count] % 2 == 0) {
                parEImpar[aux] = valores[count];
                aux++;
            }
        }
        for (int count = 0; count < valores.length; count++) {
            if (valores[count] % 2 != 0) {
                parEImpar[aux] = valores[count];
                aux++;
            }
        }
        System.out.println();

        System.out.print("Valores informados = ");
        for (int count = 0; count < valores.length; count++) {
            System.out.print(valores[count] +" ");
        }
        System.out.println();

        System.out.print("Valores Par e Impar = ");
        for (int count = 0; count < parEImpar.length; count++) {
            System.out.print(parEImpar[count] +" ");
        }
    }

}
