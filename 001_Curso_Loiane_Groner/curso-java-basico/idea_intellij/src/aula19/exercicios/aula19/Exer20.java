package src.aula19.exercicios.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;
/* Implementar um programa que obtenha a cotação do dólar (U$) em relação ao real (R$) e a seguir armazene em vetor A
 com 20 elementos as seguintes conversões: A[i] = cotação do dolar * i, para todos i variando de 1 até 20. */
public class Exer20 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 DecimalFormat df = new DecimalFormat("###,###.##");
	 
	 double[] cotacao = new double[21];
	 double dollar;
	 
	 System.out.print("Informe o preço do dollar autal: U$: ");
	 dollar = key.nextDouble();
	 
	 
	 for (int count = 1; count < cotacao.length; count++) {
		cotacao[count] = dollar;
		cotacao[count] *= count;
		System.out.println("A cotação do dollar na " + (count) + "º posição é: U$" + df.format(cotacao[count]));
	 }
  }
}
