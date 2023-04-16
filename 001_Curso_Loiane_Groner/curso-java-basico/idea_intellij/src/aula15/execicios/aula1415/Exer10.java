package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
Faça um Programa que pergunte em que turno você estuda. Peça
para digitar M-matutino ou V-Vespertino ou N- Noturno. Imprima a
mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor
Inválido!", conforme o caso
 */
public class Exer10 {
  public static void main(String[] args) {
	Scanner key = new Scanner(System.in);

	String horario;

	System.out.print("Em que horário você estuda? \"M\", \"V\", \"N\" :");
	horario = key.next();

	switch (horario) {
	  case "m":
	  case "M":
		System.out.println("Bom dia!");
		break;
	  case "v":
	  case "V":
		System.out.println("Boa tarde!");
		break;
	  case "n":
	  case "N":
		System.out.println("Boa noite!");
		break;
	  default:
		System.out.println("Valor Inválido!");
		break;
	}
  }

}
