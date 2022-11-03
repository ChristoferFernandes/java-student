package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

            int voto;
            int cSharpe = 0;
            int java = 0;
            int phyton = 0;
        System.out.print("Informe a quantidade de eleitores a vota: ");
            int numEleitores = tecla.nextInt();

        for (int count = 0 ; count < numEleitores; count ++){
            System.out.print("Informe em quem você quer votar: 1-'Java', 2-'C#', 3-'Phyton'");
                voto = tecla.nextInt();
            if (voto == 1) {
                java++;
            } else if (voto == 2){
                cSharpe ++;
            } else if (voto == 3){
                phyton ++;
            }
        }
        System.out.println("Votos para Java: "+ java +" votos.");
        System.out.println("Votos para C#: "+ cSharpe +" votos.");
        System.out.println("Votos para Phyton: "+ phyton +" votos.");
    }
}
