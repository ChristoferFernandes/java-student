package src.exercicios.aula1617;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            boolean informacao = false;
        do {
            System.out.print("Login: ");
                String login = tecla.next();
            System.out.print("Senha: ");
                String senha = tecla.next();

            if(login.equals(senha)){
                System.out.println("Senha igual ao usuário, digite novamente.");
            } else  {
                informacao = true;
                System.out.println("Abrindo o programa.");
            }
        } while (!informacao);
    }
}
