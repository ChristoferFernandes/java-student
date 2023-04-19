package src.aula20.execicios.aula20;

import java.util.Scanner;

public class Exercicio05 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 String[][][] compromissos = new String[12][30][8];
	 boolean saindo = false;
	 int opcao;
	 
	 do {
		System.out.println("1- Para adicionar um compromisso:");
		System.out.println("2- Para verificar  um compromisso:");
		System.out.println("0- Para sair do programa:");
		opcao = key.nextInt();
		
		int mes = 0;
		int dia = 0;
		int hora = 0;
		
		if (opcao == 1) { //adicionando um compromisso
		  boolean mesValido = false;
		  do {
			 System.out.print("Informe o mês do compromisso: ");
			 mes = key.nextInt();
			 
			 if (mes > 0 && mes <= 12) {
				mesValido = true;
			 } else {
				System.out.println("Mês inválido, informe o mês novamente.");
			 }
		  } while (!mesValido);
		  
		  boolean diaValido = false;
		  do {
			 System.out.print("Informe o dia do compromisso: ");
			 dia = key.nextInt();
			 
			 if (dia > 0 && dia <= 30) {
				diaValido = true;
			 } else {
				System.out.println("Dia inválido, informe o dia novamente.");
			 }
			 
		  } while (!diaValido);
		  
		  boolean horaValida = false;
		  do {
			 System.out.println("Informe a hora do compromisso: ");
			 hora = key.nextInt();
			 
			 if (hora >= 0 && hora <= 8) {
				horaValida = true;
			 } else {
				System.out.println("Hora inválida, informe a hora novamente.");
			 }
		  } while (!horaValida);
		  
		  System.out.print("Informe  o compromisso: ");
		  compromissos[--mes][--dia][--hora] = key.next();
		  
		} else if (opcao == 2) { // verificando um compromisso
		  boolean mesValido = false;
		  do {
			 System.out.print("Informe o mês do compromisso: ");
			 mes = key.nextInt();
			 
			 if (mes > 0 && mes <= 12) {
				mesValido = true;
			 } else {
				System.out.println("Mês inválido, informe o mês novamente.");
			 }
		  } while (!mesValido);
		  
		  boolean diaValido = false;
		  do {
			 System.out.print("Informe o dia do compromisso: ");
			 dia = key.nextInt();
			 
			 if (dia > 0 && dia <= 30) {
				diaValido = true;
			 } else {
				System.out.println("Dia inválido, informe o dia novamente.");
			 }
			 
		  } while (!diaValido);
		  
		  boolean horaValida = false;
		  do {
			 System.out.println("Informe a hora do compromisso: ");
			 hora = key.nextInt();
			 
			 if (hora >= 0 && hora <= 8) {
				horaValida = true;
			 } else {
				System.out.println("Hora inválida, informe a hora novamente.");
			 }
		  } while (!horaValida);
		  
		  System.out.print("O compromisso é: ");
		  System.out.println(compromissos[--mes][--dia][--hora]);
		  
		} else if (opcao == 0) { // saindo do programa
		  System.out.println("Saindo do programa...");
		  saindo = true;
		  
		} else {
		  System.out.println("Opcao inválida, digite novamente.");
		}
	 } while (!saindo);
  }
}
