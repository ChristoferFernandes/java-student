package src.aula17.exerciciosaula1617;


import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.
 */
public class Exer01 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			int i;
			boolean saindo;
			
			saindo = false;
			do {
				 System.out.print("Informe uma nota de \"1 a 10\": ");
				 i = key.nextInt();
				 
				 if (i <= 0 || i > 10) {
						System.out.println("NOTA INVÁLIDA!");
				 } else {
						System.out.println(i + " é uma nota VÁLIDA!");
						saindo = true;
				 }
			} while (!saindo);
	 }
	 
}
