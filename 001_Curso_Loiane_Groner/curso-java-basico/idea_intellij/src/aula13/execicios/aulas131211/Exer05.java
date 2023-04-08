package src.aula13.execicios.aulas131211;
/*
Faça um Programa que converta metros para centímetros
 */
import java.util.Scanner;

public class Exer05 {
	 public static void main(String[] args) {
		  Scanner key = new Scanner(System.in);

		  double metro;

		  System.out.print("Informe quantos metros quer converter para centimetro: ");
		  metro = key.nextDouble();

		  System.out.println(metro +"m equivale a "+(metro * 100) +"cm");
	 }
}
