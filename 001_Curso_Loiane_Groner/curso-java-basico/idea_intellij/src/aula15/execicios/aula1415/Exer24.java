package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar.
O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
. par ou ímpar;
a. positivo ou negativo;
b. inteiro ou decimal
 */
public class Exer24 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 double valor, valor2, resultado;
	 char operacao;
	 
	 System.out.print("Informe o primeiro valor: ");
	 valor = key.nextDouble();
	 
	 System.out.print("Informe o segundo valor: ");
	 valor2 = key.nextDouble();
	 
	 System.out.print("Informe qual operação você quer usar: \"+\" \"-\" \"*\" \"/\": ");
	 operacao = key.next().charAt(0);
	 
	 if (operacao == '+') {
		resultado = valor + valor2;
		System.out.println(valor + " + " + valor2 + " = " + resultado);
		
		if (resultado % 2 == 0) {
		  System.out.println(resultado + " é um valor PAR.");
		} else {
		  System.out.println(resultado + " é um valor IMPAR.");
		}
		
		if (resultado >= 0) {
		  System.out.println(resultado + " é um valor POSITIVO.");
		} else {
		  System.out.println(resultado + " é um valor NEGATIVO.");
		}
		
		if ((int) resultado == resultado) {
		  System.out.println(resultado + " é um valor INTEIRO.");
		} else {
		  System.out.println(resultado + " é um valor DECIMAL.");
		}
		
	 } else if (operacao == '-') {
		resultado = valor - valor2;
		System.out.println(valor + " - " + valor2 + " = " + resultado);
		if (resultado % 2 == 0) {
		  System.out.println(resultado + " é um valor PAR.");
		} else {
		  System.out.println(resultado + " é um valor IMPAR.");
		}
		
		if (resultado >= 0) {
		  System.out.println(resultado + " é um valor POSITIVO.");
		} else {
		  System.out.println(resultado + " é um valor NEGATIVO.");
		}
		
		if ((int) resultado == resultado) {
		  System.out.println(resultado + " é um valor INTEIRO.");
		} else {
		  System.out.println(resultado + " é um valor DECIMAL.");
		}
		
	 } else if (operacao == '*') {
		resultado = valor * valor2;
		System.out.println(valor + " * " + valor2 + " = " + resultado);
		
		if (resultado % 2 == 0) {
		  System.out.println(resultado + " é um valor PAR.");
		} else {
		  System.out.println(resultado + " é um valor IMPAR.");
		}
		if (resultado >= 0) {
		  System.out.println(resultado + " é um valor POSITIVO.");
		} else {
		  System.out.println(resultado + " é um valor NEGATIVO.");
		}
		if ((int) resultado == resultado) {
		  System.out.println(resultado + " é um valor INTEIRO.");
		} else {
		  System.out.println(resultado + " é um valor DECIMAL.");
		}
		
	 } else if (operacao == '/') {
		resultado = valor / valor2;
		System.out.println(valor + " / " + valor2 + " = " + resultado);
		if (resultado % 2 == 0) {
		  System.out.println(resultado + " é um valor PAR.");
		} else {
		  System.out.println(resultado + " é um valor IMPAR.");
		}
		
		if (resultado >= 0) {
		  System.out.println(resultado + " é um valor POSITIVO.");
		} else {
		  System.out.println(resultado + " é um valor NEGATIVO.");
		}
		
		if ((int) resultado == resultado) {
		  System.out.println(resultado + " é um valor INTEIRO.");
		} else {
		  System.out.println(resultado + " é um valor DECIMAL.");
		}
	 } else {
		System.out.println("VOCÊ NÃO ESCOLHEU UMA OPERAÇÃO VÁLIDA, TENTE NOVAMENTE.");
	 }
  }
}