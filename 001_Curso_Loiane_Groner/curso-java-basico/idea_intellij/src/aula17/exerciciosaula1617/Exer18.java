package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.*/
public class Exer18 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			int maiorValor, menorValor, soma, diferenca, num, valor;
			
			System.out.print("Informe quantos números terá no conjunto numérico: ");
			valor = key.nextInt();
			
			soma = 0;
			diferenca = 0;
			maiorValor = 1;
			menorValor = 1;
			for (int i = 1; i <= valor; i++) {
				 System.out.print("Informe o " + i + "º valor: ");
				 num = key.nextInt();
				 
				 if (num > diferenca) {
						maiorValor = num;
				 } else if (num < diferenca) {
						menorValor = num;
				 }
				 diferenca = num;
				 soma += diferenca;
			}
			System.out.println("O maior valor digitado foi: " + maiorValor);
			System.out.println("O menor valor digitado foi: " + menorValor);
			System.out.println("A soma entre os valores é de: " + soma);
	 }
}
