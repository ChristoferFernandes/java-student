package src.exercicios.aula1617;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            int count = 0;
            int paisA,paisB;
            double percentualA, percentualB;
            boolean sair = false;
            String saindo;

        System.out.print("Informe a quantidade de pessoas no país A: ");
            paisA = tecla.nextInt();
        System.out.print("Informe o percentual de crescimento do país A: ");
            percentualA = tecla.nextDouble();
        System.out.print("Informe a quantidade de pessoas no país B: ");
            paisB = tecla.nextInt();
        System.out.print("Informe o percentual de crescimento do país B: ");
            percentualB = tecla.nextDouble();

        do {
            while (paisA <= paisB) {
                paisA += (paisA / 100) * percentualA;
                paisB += (paisB / 100) * percentualB;
                count ++;
            }
            System.out.println("População do país A:" + paisA);
            System.out.println("População do país B: "+ paisB);
            System.out.println("Quantidade de anos para A, ultrapassar B: "+ count);

            System.out.print("Deseja sair do programa? (Sim/Não): ");
                saindo = tecla.next();
            if (saindo.equalsIgnoreCase("nao")){

            } else if(saindo.equalsIgnoreCase("sim")) {
                sair = true;
                System.out.println("Saindo do programa...");
            }
        } while (!sair);
    }
}
