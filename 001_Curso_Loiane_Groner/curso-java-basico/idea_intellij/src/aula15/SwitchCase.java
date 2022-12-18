package src.aula15;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
    
        byte diaSemana;
    
        System.out.print("Informe um número de 1 a 7: ");
        diaSemana = key.nextByte();
        //EXEMPLO DE COMO FICARIA UM PROGRAMA QUE LEIA O NÚMERO DO USUÁRIO, E FIZESSE UM IF-ELSE ANINHADO.
        /**if(diaSemana == 1)
         {
         System.out.println("DOMINGO!");
         }
         else if(diaSemana == 2)
         {
         System.out.println("SEGUNDA-FEIRA!");
         }
         else if(diaSemana == 3)
         {
         System.out.println("TERÇA-FEIRA!");
         }
         else if(diaSemana == 4)
         {
         System.out.println("QUARTA-FEIRA!");
         }
         else if(diaSemana == 5)
         {
         System.out.println("QUINTA-FEIRA!");
         }
         else if(diaSemana == 6)
         {
         System.out.println("SEXTA-FEIRA!");
         }
         else if(diaSemana == 7)
         {
         System.out.println("SÁBADO!");
         }
         else
         {
         System.out.println("Não é um dia da semana válido, tente novamente.");
         }*/
        //EXEMPLO UTILIZANDO SWITCH CASE
        switch (diaSemana)
        {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil!");
                break;
            case 1:
            case 7:
                System.out.println("Fim de semana!");
                break;
            default:
                System.out.println("Não é um dia da semana válido, tente novamente.");
                break;
        }
    }
}

