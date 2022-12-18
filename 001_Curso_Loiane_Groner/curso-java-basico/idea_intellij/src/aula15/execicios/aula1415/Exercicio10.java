package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 Faça um Programa que pergunte em que turno voce estuda. Peça para digitar:
 M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem de
 "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
 */
public class Exercicio10
{
	 public static void main(String[] args)
	 {
		  Scanner tecla = new Scanner(System.in);
		  
		  String horario;
		  
		  System.out.print("Informe o horário você estuda. \"M\" - Matutino,  \"V\" - Vespertino, \"N\" - Noturno: ");
		  horario = tecla.next();
		  
		  if(horario.length() > 1)
		  {
				System.out.println("Valor Inválido!");
				System.exit(0);
		  }
		  switch (horario){
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
		  }
	 }
}
