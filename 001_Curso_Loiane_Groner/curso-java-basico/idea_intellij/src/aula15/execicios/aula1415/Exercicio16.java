package src.aula15.execicios.aula1415;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Informe o valor de A: ");
        int a = tecla.nextInt();

        if(a == 0){
            System.out.println("Não é uma equação de 2º grau.");
            System.exit(0);
        }

        System.out.print("Informe o valor de B: ");
        int b = tecla.nextInt();

        System.out.print("Informe o valor de C: ");
        int c = tecla.nextInt();

        System.out.println("Sua equação é: "+a+"x² + "+b+"x + "+c+" = 0");

        double delta = Math.pow(b,2) -4*a*c;
        double x1 = ((-b) + Math.sqrt(delta)) / (2*a);
        double x2 = ((-b) - Math.sqrt(delta)) / (2*a);
        System.out.println("O valor de DELTA: "+delta);

        if(delta < 0){
            System.out.println("Para DELTA negativo, não existem Raízes reais");
        }else if(delta == 0){

            System.out.println("Para DELTA zero, temos duas raízes iguais a "+x1);
        }else{
            System.out.println("Para DELTA positivo, temos duas raízes diferentes: ");
            System.out.println("DELTA X¹: "+x1);
            System.out.println("DELTA X²: "+x2);
        }
    }
}
