package src.aula17.exerciciosaula1617;

import java.util.Scanner;

//A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
// Faça um programa capaz de gerar a série até o n−ésimo termo
public class Exer15 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			int seqInicial, seqFinal, fibonnaci, termo;
			
			System.out.print("Informe qual termo você quer ver o valor da sequência fibonnaci: ");
			termo = key.nextInt();
			
			seqInicial = 1;
			seqFinal = 1;
			fibonnaci = 0;
			
			System.out.print(seqInicial + ",");
			System.out.print(seqFinal);
			for (int count = 3; count <= termo; count++) {
				 fibonnaci = seqInicial + seqFinal;
				 System.out.print(", " + fibonnaci);
				 seqInicial = seqFinal;
				 seqFinal = fibonnaci;
			}
			System.out.println();
			System.out.println("O valor da " + termo + "º posição é: " + fibonnaci);
	 }
}
