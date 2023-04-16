package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
Faça um Programa que peça os 3 lados de um triângulo. O programa
deverá informar se os valores podem ser um triângulo. Indique, caso
os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
escaleno.
o Dicas:
o Três lados formam um triângulo quando a soma de quaisquer
dois lados for maior que o terceiro;
o Triângulo Equilátero: três lados iguais;
o Triângulo Isósceles: quaisquer dois lados iguais;
o Triângulo Escaleno: três lados diferentes;

 */
public class Exer15 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	int lado, lado2, lado3;

	System.out.print("Informe o 1º lado do triângulo: ");
	lado = key.nextInt();

	System.out.print("Informe o 2º lado do triângulo: ");
	lado2 = key.nextInt();

	System.out.print("Informe o  3º lado do triângulo: ");
	lado3 = key.nextInt();

	if (lado + lado2 > lado3 || lado + lado3 > lado2 || lado2 + lado3 > lado) {
	  System.out.println("Pode formar um TRIÂNGULO.");
	  if (lado == lado2 && lado == lado3) {
		System.out.println("Pode formar um triângulo EQUILATERO");
	  } else if (lado != lado2 && lado2 != lado3 && lado != lado3) {
		System.out.println("Pode formar um triângulo ESCALENO");
	  } else if (lado == lado2 || lado2 == lado3) {
		System.out.println("Pode formar um triângulo ISÓCELES");
	  }
	} else {
	  System.out.println("Não pode formar um TRIÂNGULO");
	}
  }

}
