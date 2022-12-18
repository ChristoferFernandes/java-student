package src.aula15.execicios.aula1415;

import java.util.Scanner;

/**
 * Faça um Programa que peça dois números e imprima o maior deles.
 */
public class Exercicio01
{
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        
        int valor;
        int valor2;
        
        System.out.print("Informe um número: ");
        valor = key.nextInt();
    
       System.out.print("Informe outro número: ");
       valor2 = key.nextInt();
       
       if(valor > valor2)
       {
           System.out.println(valor +" é o maior número informado pelo usuário.");
       }
       else
       {
           System.out.println (valor2 +" é o maior número informado pelo usuário.");
       }
    }

}
