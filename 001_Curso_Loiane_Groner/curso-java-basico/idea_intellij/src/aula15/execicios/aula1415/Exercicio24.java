package src.aula15.execicios.aula1415;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.print("Informe o primeiro valor: ");
        double valor1 = tecla.nextDouble();

        System.out.print("Informe o segundo valor: ");
        double valor2 = tecla.nextDouble();

        System.out.print("Informe qual operação você quer usar: '+' '-' '*' '/' ");
        char operacao = tecla.next().charAt(0);

        double resultado;
        if (operacao == '+') {
            resultado = valor1 + valor2;
            System.out.println(valor1+ " + "+valor2+" = "+resultado);
            if(resultado % 2 == 0){
                System.out.println(resultado+" é um valor PAR.");
            }else{
                System.out.println(resultado+" é um valor IMPAR.");
            }
            if(resultado >= 0){
                System.out.println(resultado+" é um valor POSITIVO.");
            }else{
                System.out.println(resultado+" é um valor NEGATIVO.");
            }
            if((int)resultado == resultado){
                System.out.println(resultado+" é um valor INTEIRO.");
            }else{
                System.out.println(resultado+" é um valor DECIMAL.");
            }

        } else if (operacao == '-') {
            resultado = valor1 - valor2;
            System.out.println(valor1+ " - "+valor2+ " = "+resultado);
            if(resultado %2 == 0){
                System.out.println(resultado+" é um valor PAR.");
            }else{
                System.out.println(resultado+" é um valor IMPAR.");
            }
            if(resultado >= 0){
                System.out.println(resultado+" é um valor POSITIVO.");
            }else{
                System.out.println(resultado+" é um valor NEGATIVO.");
            }
            if((int)resultado == resultado){
                System.out.println(resultado+" é um valor INTEIRO.");
            }else{
                System.out.println(resultado+" é um valor DECIMAL.");
            }

        } else if (operacao == '*') {
            resultado = valor1 * valor2;
            System.out.println(valor1+" * "+valor2+" = "+resultado);
            if(resultado %2 == 0){
                System.out.println(resultado+" é um valor PAR.");
            }else{
                System.out.println(resultado+" é um valor IMPAR.");
            }
            if(resultado >= 0){
                System.out.println(resultado+" é um valor POSITIVO.");
            }else{
                System.out.println(resultado+" é um valor NEGATIVO.");
            }
            if((int)resultado == resultado){
                System.out.println(resultado+" é um valor INTEIRO.");
            }else{
                System.out.println(resultado+" é um valor DECIMAL.");
            }

        } else if (operacao == '/') {
            resultado = valor1 / valor2;
            System.out.println(valor1+" / "+valor2+" = "+resultado);
            if(resultado %2 == 0){
                System.out.println(resultado+" é um valor PAR.");
            }else{
                System.out.println(resultado+" é um valor IMPAR.");
            }
            if(resultado >= 0){
                System.out.println(resultado+" é um valor POSITIVO.");
            }else{
                System.out.println(resultado+" é um valor NEGATIVO.");
            }
            if((int)resultado == resultado){
                System.out.println(resultado+" é um valor INTEIRO.");
            }else{
                System.out.println(resultado+" é um valor DECIMAL.");
            }
        }else{
            System.out.println("VOCÊ NÃO ESCOLHEU UMA OPERAÇÃO VÁLIDA, TENTE NOVAMENTE.");
            System.exit(0);
        }
    }
}

