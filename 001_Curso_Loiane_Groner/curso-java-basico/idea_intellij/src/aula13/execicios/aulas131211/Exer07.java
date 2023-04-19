package src.aula13.execicios.aulas131211;
/*
Faça um Programa que calcule a área de um quadrado, em seguida
mostre o dobro desta área para o usuário
 */

import java.util.Scanner;

public class Exer07 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			double quadrado, area;
			
			System.out.print("Informe o valor do lado de um quadrado: ");
			quadrado = key.nextDouble();
			
			area = Math.pow(quadrado, 2);
			System.out.println("A área do quadrado é igual a: " + area);
			
			System.out.println("O dobro da area é igual a: " + area * 2);
	 }
}
