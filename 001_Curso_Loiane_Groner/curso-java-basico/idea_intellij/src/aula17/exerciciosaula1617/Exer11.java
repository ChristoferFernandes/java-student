package src.aula17.exerciciosaula1617;

import java.util.Scanner;

//Altere o programa anterior para mostrar no final a soma dos números
public class Exer11 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			int menorNum, diferenca, soma;
			
			System.out.print("Informe um número inteiro: ");
			int num1 = key.nextInt();
			System.out.print("Informe outro número inteiro: ");
			int num2 = key.nextInt();
			
			menorNum = Math.min(num1, num2);
			diferenca = Math.abs(num1 - num2);
			
			soma = 0;
			for (int i = 0; i < diferenca; i++) {
				 System.out.print(menorNum + i + " ");
				 soma = menorNum + diferenca + i;
			}
			System.out.println(" ");
			System.out.println(soma);
	 }
}
