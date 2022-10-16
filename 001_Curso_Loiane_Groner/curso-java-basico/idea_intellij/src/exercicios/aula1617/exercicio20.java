package src.exercicios.aula1617;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            long valor, fatorial;
            String sair;
            boolean saindo = false;
        do {
            System.out.print("Entre com a informação do número que deseja ver o fatorial: ");
            int num = tecla.nextInt();

            if (num < 1 || num > 16) {
                System.out.println("Você só pode escolher de 1 a 16 para verificar o fatorial, tente novamente.");
                System.out.println("Saindo do programa....");
                System.exit(0);
            } else {
                System.out.println("Fatorial de " + num + "!: ");
            }

            valor = num;
            fatorial = num;
            while (num > 2) {
                valor--;
                fatorial = fatorial * valor;
                System.out.println(fatorial);
                num--;
            }
            System.out.print("Deseja sair do programa? [S/N]: ");
                sair = tecla.next();
            if(sair.equalsIgnoreCase("s")){
                System.out.println("Saindo do programa...");
                System.exit(0);
            }
        } while (!saindo);
    }
}
