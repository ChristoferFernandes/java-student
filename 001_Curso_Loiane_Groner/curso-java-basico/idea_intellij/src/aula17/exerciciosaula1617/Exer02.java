package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*
Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações
 */
public class Exer02 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			String usuario, senha;
			boolean saindo;
			
			saindo = false;
			do {
				 System.out.print("Informe o nome do usuário: ");
				 usuario = key.next();
				 
				 System.out.print("Informe o nome da senha: ");
				 senha = key.next();
				 
				 if (usuario.equals(senha)) {
						System.out.println("Sua senha não pode ser igual a usuário, tente novamente.");
				 } else {
						System.out.println("Abrindo o programa...");
						saindo = true;
				 }
			} while (!saindo);
	 }
}
