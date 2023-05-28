package src.aula19.exercicios.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;
/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho, sendo que cada elemento do vetor B
deverá ser a raiz quadrada do respectivo elemento de A, ou seja:
B[i] = sqrt(A[i]). */
public class Exer04 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 DecimalFormat form = new DecimalFormat("###,###.##");
	 
	 int[] vetorA = new int[15];
	 double[] vetorB = new double[vetorA.length];
	 
	 for (int i = 0; i < vetorA.length; i++) {
		System.out.print("Informe o valor da " + (i + 1) + "º posição do vetor:");
		vetorA[i] = key.nextInt();
		vetorB[i] = Math.sqrt(vetorA[i]);
	 }
	 System.out.print("VetorA = ");
	 for (int i : vetorA) {
		System.out.print(i + " ");
	 }
	 System.out.println();
	 System.out.print("VetorB = ");
	 for (double j : vetorB) {
		System.out.print(form.format(j) + " ");
	 }
  }
}
