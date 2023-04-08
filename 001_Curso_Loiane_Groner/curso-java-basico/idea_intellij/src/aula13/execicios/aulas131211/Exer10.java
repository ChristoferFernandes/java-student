package src.aula13.execicios.aulas131211;
/*
Faça um Programa que peça a temperatura em graus Celsius,
transforme e mostre em graus Farenheit.
 */
import java.util.Scanner;

public class Exer10 {
	 public static void main(String[] args) {
		  Scanner key = new Scanner(System.in);

		  double faren, celsius;

		  System.out.print("Informe quantos graus em Celsius está fazendo no momento?");
		  celsius = key.nextDouble();

		  faren = (celsius * 1.8) + 32;
		  System.out.println((int)celsius +"Cº é igual a "+ (int)faren +"Fº");
	 }
}
