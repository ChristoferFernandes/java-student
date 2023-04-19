package src.aula13.execicios.aulas131211;
/*
Tendo como dados de entrada a altura e o sexo de uma pessoa,
construa um algoritmo que calcule seu peso ideal, utilizando as
seguintes fórmulas:
. Para homens: (72.7*h) - 58
a. Para mulheres: (62.1*h) - 44.7 (h = altura)
b. Peça o peso da pessoa e informe se ela está dentro, acima ou
abaixo do peso.
 */

import java.util.Scanner;

public class Exer13 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 double tamanho, pesoIdeal, pesoDoUsuario;
	 String sexo, pesoFinal;
	 
	 System.out.print("Informe a sua altura: ");
	 tamanho = key.nextDouble();
	 
	 System.out.println("Informe o seu sexo[Masculino/Feminino]: ");
	 sexo = key.next();
	 
	 //Operador Ternário
	 pesoIdeal = (sexo.equals("masculino")) ? (72.7 * tamanho) - 58 : (62.1 * tamanho) - 44.7;
	 
	 System.out.print("Informe o seu peso atual: ");
	 pesoDoUsuario = key.nextDouble();
	 
	 System.out.println("Seu peso ideal é de: " + pesoIdeal);
	 pesoFinal = (pesoIdeal == pesoDoUsuario) ? "você está dentro do seu peso ideal" : "você não está no seu peso ideal";
	 System.out.println(pesoDoUsuario + " é seu peso atual, " + pesoFinal);
  }
}
