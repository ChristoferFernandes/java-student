package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio02 {
  public static void main(String[] args) {
	Scanner tecla = new Scanner(System.in);

	boolean saindo = false;
	do {
	  System.out.print("Usuário: ");
	  String login = tecla.next();
	  System.out.print("Senha: ");
	  String senha = tecla.next();

	  if (login.equals(senha)) {
		System.out.println("Senha não pode ser igual ao usuário, digite novamente.");
	  } else {
		saindo = true;
		System.out.println("Abrindo o programa.");
	  }
	} while (!saindo);
  }
}
