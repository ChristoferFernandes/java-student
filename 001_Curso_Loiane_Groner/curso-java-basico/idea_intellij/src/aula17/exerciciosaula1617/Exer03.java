package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*
Faça um programa que leia e valide as seguintes informações:
a. Nome: maior que 3 caracteres;
b. Idade: entre 0 e 150;
c. Salário: maior que zero;
d. Sexo: 'f' ou 'm';
e. Estado Civil: 's', 'c', 'v', 'd';
 */
public class Exer03 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 boolean validacao;
	 String nome, sexo, estadoCivil;
	 int idade;
	 double salario;
	 
	 validacao = false;
	 do {
		System.out.print("Informe o seu nome: ");
		nome = key.next();
		
		if (nome.length() < 3) {
		  System.out.println("Nome com menos de 3 caracteres, tente novamente.");
		} else {
		  validacao = true;
		}
	 } while (!validacao);
	 
	 validacao = false;
	 do {
		System.out.print("Informe a sua idade: ");
		idade = key.nextInt();
		if (idade < 0 || idade > 150) {
		  System.out.println("Idade menor que 0 ou maior que 150, tente novamente.");
		} else {
		  validacao = true;
		}
	 } while (!validacao);
	 
	 validacao = false;
	 do {
		System.out.print("Informe o seu salário: R$");
		salario = key.nextDouble();
		if (salario > 0) {
		  validacao = true;
		} else {
		  System.out.println("Salário não pode ser menor ou igual a 0, tente novamente.");
		}
	 } while (!validacao);
	 
	 validacao = false;
	 do {
		System.out.print("Informe o seu sexo \"M - Masculino, F - Feminino\": ");
		sexo = key.next();
		if (sexo.equalsIgnoreCase("m")) {
		  sexo = "Masculino";
		  validacao = true;
		} else if (sexo.equalsIgnoreCase("f")) {
		  sexo = "Feminino";
		  validacao = true;
		} else {
		  System.out.println("Sexo tem que ser ou masculino 'M' ou feminino 'F', tente novamente.");
		}
	 } while (!validacao);
	 
	 validacao = false;
	 do {
		System.out.print("Informe seu estado civíl \"S - Solteiro, C - Casado, V - Viúvo, D - Divorciado\": ");
		estadoCivil = key.next();
		if (estadoCivil.equalsIgnoreCase("s")) {
		  estadoCivil = "Solteiro(a)";
		  validacao = true;
		} else if (estadoCivil.equalsIgnoreCase("c")) {
		  estadoCivil = "Casado(a).";
		  validacao = true;
		} else if (estadoCivil.equalsIgnoreCase("v")) {
		  estadoCivil = "Viúvo(a).";
		  validacao = true;
		} else if (estadoCivil.equalsIgnoreCase("d")) {
		  estadoCivil = "Divorciado(a).";
		  validacao = true;
		} else {
		  System.out.println("Não é um estado civíl válido, tente novamente.");
		}
	 } while (!validacao);
	 
	 System.out.println("---- STATUS ----");
	 System.out.println("Nome: " + nome);
	 System.out.println("Idade: " + idade + " anos.");
	 System.out.println("Salário: R$" + salario);
	 System.out.println("Sexo: " + sexo);
	 System.out.println("Estado civil: " + estadoCivil);
  }
}
