package src.aula20.execicios.aula20;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String [] args) {
        Scanner key = new Scanner(System.in);

            String[][] compromissos = new String[24][30];
            boolean saindo = false;
        do {
            System.out.println("1 - Para adicionar um compromisso:");
            System.out.println("2 - Para verificar um compromisso: ");
            System.out.println("0 - Para sair do programa:");
                int opcao = key.nextInt();

                int dia = 0;
                int hora = 0;
            if(opcao == 1) { // adicionar um compromisso
                boolean diaValido = false;
                do {
                    System.out.print("Informe o dia do compromisso: ");
                         dia = key.nextInt();

                    if (dia > 0 && dia <= 30) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, informe o dia novamente.");
                    }


                } while (!diaValido);

                boolean horaValida = false;
                do {
                    System.out.print("Informe a hora do compromisso: ");
                        hora = key.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora de compromisso inválida, informe novamente.");
                    }
                } while (!horaValida);
                    System.out.print("Informe o compromisso: ");
                        compromissos[dia][hora] = key.next();

            } else if (opcao == 2) { //verificar um compromisso
                boolean diaValido = false;
                do {
                    System.out.print("Informe o dia do compromisso: ");
                    dia = key.nextInt();

                    if (dia > 0 && dia <= 30) {
                        diaValido = true;
                    } else {
                        System.out.println("Dia inválido, informe o dia novamente.");
                    }


                } while (!diaValido);

                boolean horaValida = false;
                do {
                    System.out.print("Informe a hora do compromisso: ");
                    hora = key.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("Hora de compromisso inválida, informe novamente.");
                    }
                } while (!horaValida);

                System.out.println("O compromisso agendado é: ");
                System.out.println(compromissos[dia][hora]);

            } else if(opcao == 0) { // sair do programa
                System.out.println("Saindo do programa...");
                    saindo = true;
            } else {
                System.out.println("Opção inválida, digite novamente.");
            }
        } while (!saindo);
    }
}
