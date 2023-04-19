package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
o Tabuada de 5:
o 5 X 1 = 5
o 5 X 2 = 10
o ...
o 5 X 10 = 50

 */
public class Exer12 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 int tabuada, num;
	 
	 System.out.print("Informe o número que você quer ver a tabuada: ");
	 num = key.nextInt();
	 
	 System.out.println("Tabuada de " + num + ":");
	 for (int i = 1; i <= 10; i++) {
		tabuada = num * i;
		System.out.println(num + " * " + i + " = " + tabuada);
	 }
  }
}
