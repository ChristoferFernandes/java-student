package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores. Peça para cada eleitor votar
e ao final mostrar o número de votos de cada candidato. */
public class Exer26 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			int voto, cSharpe, java, phyton, numEleitores;
			
			System.out.print("Informe a quantidade de eleitores a vota: ");
			numEleitores = key.nextInt();
			
			java = 0;
			cSharpe = 0;
			phyton = 0;
			
			for (int i = 0; i < numEleitores; i++) {
				 System.out.print("Informe em quem você quer votar. 1- \"Java\", 2-\"C#\", 3-\"Phyton\": ");
				 voto = key.nextInt();
				 if (voto == 1) {
						java++;
				 } else if (voto == 2) {
						cSharpe++;
				 } else if (voto == 3) {
						phyton++;
				 }
			}
			System.out.println("Votos para Java: " + java + " votos.");
			System.out.println("Votos para C#: " + cSharpe + " votos.");
			System.out.println("Votos para Phyton: " + phyton + " votos.");
	 }
}
