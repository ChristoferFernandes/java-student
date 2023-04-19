package src.aula19.exercicios.aula19;

import java.util.Scanner;

public class Exercicio29 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			int[] valoresVetorA = new int[10];
			int[] valoresVetorB = new int[valoresVetorA.length];
			int[] valoresVetorC = new int[20];
			
			for (int count = 0; count < valoresVetorA.length; count++) {
				 System.out.print("Informe o valor da " + (count + 1) + "º posição de A: ");
				 valoresVetorA[count] = key.nextInt();
				 
				 valoresVetorC[count] = valoresVetorA[count];
			}
			for (int count = 0; count < valoresVetorB.length; count++) {
				 System.out.print("Informe o valor da " + (count + 1) + "º posição de B: ");
				 valoresVetorB[count] = key.nextInt();
				 
				 valoresVetorC[valoresVetorA.length + count] = valoresVetorB[count];
			}
			System.out.println();
			
			System.out.print("valoresVetorA = ");
			for (int count = 0; count < valoresVetorA.length; count++) {
				 System.out.print(valoresVetorA[count] + " ");
			}
			System.out.println();
			
			System.out.print("valoresVetorB = ");
			for (int count = 0; count < valoresVetorB.length; count++) {
				 System.out.print(valoresVetorB[count] + " ");
			}
			System.out.println();
			
			System.out.print("valoresVetorC = ");
			for (int count = 0; count < valoresVetorC.length; count++) {
				 System.out.print(valoresVetorC[count] + " ");
			}
	 }
}
