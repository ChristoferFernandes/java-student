package src.exercicios.aula19;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

            int[] idades = new int[10];
            int ageMin = Integer.MAX_VALUE;
            int ageMax = Integer.MIN_VALUE;
            int posMax = 0, posMin = 0;

        for (int count = 0; count < idades.length; count++) {
            System.out.print("Informe a idade do "+ (count+1) +"º usuário: ");
                idades[count] = key.nextInt();
        }
        System.out.print("idades informadas: ");
        for (int count = 0; count < idades.length; count++) {
            System.out.print(idades[count] +" ");
            if (idades[count] > ageMax) {
               ageMax = idades[count];
               posMax = count + 1;
            } else if (idades[count] < ageMin) {
                ageMin = idades[count];
                posMin = count + 1;
            }
        }
        System.out.println();
        System.out.println("A maior idade informada foi: "+ ageMax +" anos e estava na "+ posMax +"º posição");
        System.out.println("A menor idade informada foi: "+ ageMin +" anos e estava na "+ posMin +"º posição");
    }
}
