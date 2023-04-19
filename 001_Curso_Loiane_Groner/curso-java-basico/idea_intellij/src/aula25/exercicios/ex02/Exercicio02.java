package src.aula25.exercicios.ex02;

import java.util.Scanner;

public class Exercicio02 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			ContaCorrente conta = new ContaCorrente();
			
			conta.mostrarStatus();
			System.out.println();
			do {
				 System.out.println("----------------------------------");
				 System.out.println("| 1- Para realizar um saque.          |");
				 System.out.println("| 2- Para realizar um depósito.      |");
				 System.out.println("| 3- Para ver saldo da conta.        |");
				 System.out.println("| 0- Para sair do programa.           |");
				 System.out.println("----------------------------------");
				 conta.opcao = key.nextByte();
				 
				 conta.utilizarFuncoes();
			} while (conta.opcao != 0);
	 }
}
