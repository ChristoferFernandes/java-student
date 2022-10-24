package src.exercicios.aula19;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

            double[] nota1 = new double[10];
            double[] nota2 = new double[nota1.length];
            double[] result = new double[nota1.length];

        for (int count = 0; count < nota1.length; count++){
            System.out.print("Informe a primeira nota do "+ (count+1) +"º aluno: ");
                nota1[count] = key.nextDouble();
            System.out.print("Informe a segunda nota: ");
                nota2[count] = key.nextDouble();
        }
    }
}
