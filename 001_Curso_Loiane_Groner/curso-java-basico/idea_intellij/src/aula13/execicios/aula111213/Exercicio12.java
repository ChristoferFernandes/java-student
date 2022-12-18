package src.aula13.execicios.aula111213;

import java.util.Scanner;
/**
 *Tendo como dados de entrada a altura de uma pessoa, construa um
 algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
 (72.7*altura) - 58
 */
public class Exercicio12
{
	 public static void main(String[] args)
	 {
		  Scanner tecla = new Scanner(System.in);
		  
		  System.out.print("Entre com a informação da altura do usuário: ");
		  double altura = tecla.nextDouble();
		  
		  double pesoIdeal = (72.7 * altura) - 58;
		  System.out.println("Seu peso ideal: "+ pesoIdeal);
	 }
}
