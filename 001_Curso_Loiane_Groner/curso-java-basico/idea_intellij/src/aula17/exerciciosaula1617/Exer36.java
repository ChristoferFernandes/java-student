package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*Desenvolva um programa que faça a tabuada de um número qualquer inteiro que será digitado pelo usuário, mas a tabuada não deve
necessariamente iniciar em 1 e terminar em 10, o valor inicial e final devem ser informados também pelo usuário, conforme exemplo
abaixo:
o Montar a tabuada de: 5
o Começar por: 4
o Terminar em: 7
o
o Vou montar a tabuada de 5 começando em 4 e terminando em 7:
o 5 X 4 = 20
o 5 X 5 = 25
o 5 X 6 = 30
o 5 X 7 = 35
Obs: Você deve verificar se o usuário não digitou o final menor que o inicial.*/
public class Exer36 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 int resultado, tabuada, comeca, termina;
	 
	 System.out.print("Montar a tabuada de: ");
	 tabuada = key.nextInt();
	 
	 System.out.print("Começa por: ");
	 comeca = key.nextInt();
	 
	 System.out.print("Termina por: ");
	 termina = key.nextInt();
	 
	 if (termina < comeca) {
		System.out.println("Tabuada inválida, valor final não pode ser menor que o final.");
		System.out.println("Saindo do programa...");
		System.exit(0);
	 }
	 
	 System.out.println();
	 System.out.println("Vou montar uma tabuada de " + tabuada + " que começa com " + comeca + " e termina com " + termina + ".");
	 
	 for (int i = comeca; i <= termina; i++) {
		resultado = tabuada * i;
		System.out.println(tabuada + " * " + i + " = " + resultado);
	 }
  }
}
