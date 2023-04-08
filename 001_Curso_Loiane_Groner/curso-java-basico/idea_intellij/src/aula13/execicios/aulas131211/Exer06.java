package src.aula13.execicios.aulas131211;
/*
Faça um Programa que peça o raio de um círculo, calcule e mostre
sua área.
 */
import java.util.Scanner;

public class Exer06 {
	 public static void main(String[] args) {
		  Scanner key = new Scanner(System.in);

		  double area,raio;

		  System.out.print("Informe o raio de um circulo: ");
		  raio = key.nextInt();

		  area = Math.PI * Math.pow(raio,2);
		  System.out.println("A área do raio "+ raio +" é igual a "+ (int)area +"m²");
	 }
}
