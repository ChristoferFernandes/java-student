package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*Faça um programa que calcule e mostre a média aritmética de N notas.
 */
public class Exer24 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			int media, soma, nota, num;
			
			System.out.print("Informe quantos números terá para tirar a média: ");
			num = key.nextInt();
			
			
			soma = 0;
			for (int i = 0; i < num; i++) {
				 System.out.print("Informe a nota: ");
				 nota = key.nextInt();
				 
				 if (nota < 0 || nota > 10) {
						System.out.println("Você só pode informar notas de 0 a 10.");
						System.out.println("Saindo do programa...");
						break;
				 }
				 soma += nota;
			}
			media = soma / num;
			System.out.println("A média aritmética é: " + media);
	 }
}

