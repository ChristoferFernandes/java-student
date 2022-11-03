package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Entre com a informação deu um número inteiro: ");
        int num = tecla.nextInt();

            boolean primo;
        for (int count = 1; count <= num; count++) {
             primo = true;

            for (int cont = 2; cont < count; cont++) {
                if (count % cont == 0) {
                    //System.out.println("Não é um número PRIMO.");
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(count);
            }
        }
    }
}
