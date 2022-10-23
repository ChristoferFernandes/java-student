package src.aula18;

import java.util.Scanner;

public class BreakEContinue {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        //EXEMPLO DE UM BREAK; QUE SERVE PARA QUEBRAR O LOOP DE UM CÓDIGO EM UM DETERMINADO MOMENTO.
        /*System.out.print("Informe um número: ");
            int num = tecla.nextInt();
        System.out.print("Entre com um limite: ");
            int limite = tecla.nextInt();

        for (int count = 1; count <= limite; count++) {
            if(count % 7 == 0){
                break;
            }
            System.out.println("O primeiro divisivel por 7 é: "+ count);
        }*/
        //EXEMPLO DE UM RÓTULO OU (GOTO); SERVE PARA IDENTIFICAR UM BLOCO DE CÓDIGOS
        /*for (int i =0; i < 4; i++) {
            rotulo1: {
                rotulo2: {
                    rotulo3: {
                        if (i == 1) break rotulo1;
                        if (i == 2) break rotulo2;
                        if (i == 3) break rotulo3;
                        System.out.println("rotulo3");
                    }
                    System.out.println("rotulo2");
                }
                System.out.println("rotulo1");
            }
            System.out.println("valor de i: "+ i);
        }
        System.out.println("saiu do loop.");*/

        System.out.print("Informe um número: ");
        int num = tecla.nextInt();
        System.out.print("Entre com um limite: ");
        int limite = tecla.nextInt();
        //EXEMPLO DE UM CONTINUE; BÁSICAMENTE, ELE FAZ O INVERSO DO BREAK, INVÉS DE PARAR O BLOCO DE CÓDIGO, ELE VAI PULAR
        //E CONTINUAR COM A LINHA DE CÓDGO IGNORANDO AQUELE TRECHO.
        for (int count = 1; count <= limite; count++) {
            if(count % 7 == 0){
                continue;
            }
            System.out.println("O primeiro divisivel por 7 é: "+ count);
        }
    }
}
