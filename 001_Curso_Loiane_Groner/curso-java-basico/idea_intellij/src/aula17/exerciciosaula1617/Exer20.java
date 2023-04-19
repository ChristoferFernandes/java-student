package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/* Altere o programa de cálculo do fatorial, permitindo ao usuário calcular o fatorial várias vezes e limitando
o fatorial a números inteiros positivos e menores que 16 */
public class Exer20 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 long valor, fatorial;
	 int num;
	 String sair;
	 boolean saindo;
	 
	 saindo = false;
	 do {
		System.out.print("Informe o  número que deseja ver o fatorial: ");
		num = key.nextInt();
		
		if (num < 1 || num > 16) {
		  System.out.println("Você só pode escolher de 1 a 16 para verificar o fatorial, tente novamente.");
		  System.out.println("Saindo do programa....");
		  System.exit(0);
		} else {
		  System.out.println("Fatorial de " + num + "!: ");
		}
		
		valor = num;
		fatorial = num;
		while (num > 2) {
		  valor--;
		  fatorial = fatorial * valor;
		  System.out.println(fatorial);
		  num--;
		}
		System.out.print("Deseja sair do programa? [S/N]: ");
		sair = key.next();
		if (sair.equalsIgnoreCase("s")) {
		  System.out.println("Saindo do programa...");
		  saindo = true;
		}
	 } while (!saindo);
  }
}
