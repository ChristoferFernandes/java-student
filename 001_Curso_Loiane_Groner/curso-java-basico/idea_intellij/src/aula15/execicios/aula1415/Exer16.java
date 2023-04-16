package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
.Faça um programa que calcule as raízes de uma equação do segundo
grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
b e c e fazer as consistências, informando ao usuário nas seguintes
situações:
a. Se o usuário informar o valor de A igual a zero, a equação não é
do segundo grau e o programa não deve fazer pedir os demais
valores, sendo encerrado;
b. Se o delta calculado for negativo, a equação não possui raizes
reais. Informe ao usuário e encerre o programa;
c. Se o delta calculado for igual a zero a equação possui apenas
uma raiz real; informe-a ao usuário;
d. Se o delta for positivo, a equação possui duas raiz reais;
informe-as ao usuário;
 */
public class Exer16 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);
	int valorA, valorB, valorC;
	double delta, x, x2;

	System.out.print("Informe o valor de A: ");
	valorA = key.nextInt();

	if (valorA == 0) {
	  System.out.println("Valor de A igual a 0, não pode ser uma equação de 2º grau.");
	  System.exit(0);
	}
	System.out.print("Informe o valor de B: ");
	valorB = key.nextInt();

	System.out.print("Informe o valor de C: ");
	valorC = key.nextInt();

	System.out.println("Sua equação é: " + valorA + "x² + " + valorB + "x +" + valorC + " = 0");

	delta = Math.pow(valorB, 2) - 4 * valorA * valorC;
	x = ((-valorB) + Math.sqrt(delta)) / (2 * valorA);
	x2 = ((-valorB) - Math.sqrt(delta)) / (2 * valorA);
	System.out.println("O valor de DELTA: " + delta);

	if (delta < 0) {
	  System.out.println("Para DELTA negativo, não existem Raízes reais");
	} else if (delta == 0) {
	  System.out.println("Para DELTA zero, temos duas raízes iguais a: " + x);
	} else {
	  System.out.println("Para DELTA positivo, temos duas raízes diferentes: ");
	  System.out.println("DELTA x¹: " + x);
	  System.out.println("DELTA x²: " + x2);
	}
  }
}
