package src.exercicios.aula1415;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        System.out.println("HIPERMERCADO TABAJARA");
        System.out.println("|---------------------");
        System.out.println("1- Filé Duplo");
        System.out.println("2- Alcatra");
        System.out.println("3- Picanha");
        System.out.println("|--------------------");
            int carne = tecla.nextInt();

        switch (carne) {
            case 1:
                System.out.print("Informe quantos quilos de filé duplo você quer comprar: ");
                double quantidade = tecla.nextDouble();
                if (quantidade <= 5) {
                    double valor = quantidade * 4.90;
                    System.out.println("Você está comprando " + quantidade + " kg de filé duplo, e vai pagar R$" + valor);
                    System.out.print("Você tem um cartão tabajara? [S/N]: ");
                    char cartao = tecla.next().charAt(0);
                    if (cartao == 's' || cartao == 'S') {
                        System.out.print("Você quer usar o cartão para pagar a compra? [S/N]: ");
                        char usarOuNao = tecla.next().charAt(0);
                        if (usarOuNao == 's' || usarOuNao == 'S') {
                            double desconto = valor / 5;
                            double total = valor - desconto;
                            System.out.println("IMPRIMINDO.....");
                            System.out.println("COMPRA REALIZADA: " + quantidade + " kg de FILÉ DUPLO.");
                            System.out.println("FORMA DE PAGAMENTO: CARTÃO TABAJARA");
                            System.out.println("GANHOU 5% DE DESCONTO PELA COMPRA NO CARTÃO DA LOJA");
                            System.out.printf("DESCONTO: R$%.2f\n", desconto);
                            System.out.printf("TOTAL: R$%.2f\n", total);
                            System.out.println("");
                            System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
                        } else {
                            System.out.println("IMPRIMINDO.....");
                            System.out.println("COMPRA REALIZADA: " + quantidade + " kg de FILÉ DUPLO.");
                            System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
                            System.out.printf("TOTAL: R$%.2f\n", valor);
                            System.out.println("");
                            System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
                        }
                    } else {
                        System.out.println("IMPRIMINDO.....");
                        System.out.println("COMPRA REALIZADA: " + quantidade + " kg de FILÉ DUPLO.");
                        System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
                        System.out.printf("TOTAL: R$%.2f\n", valor);
                        System.out.println("");
                        System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
                    }
                } else if (quantidade > 5) {
                    double valor = quantidade * 5.80;
                    System.out.println("Você está comprando " + quantidade + " kg de filé duplo, e vai pagar R$" + valor);
                    System.out.print("Você tem um cartão tabajara? [S/N]: ");
                    char cartao = tecla.next().charAt(0);
                    if (cartao == 's' || cartao == 'S') {
                        System.out.print("Você quer usar o cartão para pagar a compra? [S/N]: ");
                        char usarOuNao = tecla.next().charAt(0);
                        if (usarOuNao == 's' || usarOuNao == 'S') {
                            double desconto = valor / 5;
                            double total = valor - desconto;
                            System.out.println("IMPRIMINDO.....");
                            System.out.println("COMPRA REALIZADA: " + quantidade + " kg de FILÉ DUPLO.");
                            System.out.println("FORMA DE PAGAMENTO: CARTÃO TABAJARA");
                            System.out.println("GANHOU 5% DE DESCONTO PELA COMPRA NO CARTÃO DA LOJA");
                            System.out.printf("DESCONTO: R$%.2f\n", desconto);
                            System.out.printf("TOTAL: R$%.2f\n", total);
                            System.out.println("");
                            System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
                        } else {
                            System.out.println("IMPRIMINDO.....");
                            System.out.println("COMPRA REALIZADA: " + quantidade + " kg de FILÉ DUPLO.");
                            System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
                            System.out.printf("TOTAL: R$%.2f\n", valor);
                            System.out.println("");
                            System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
                        }
                    } else {
                        System.out.println("IMPRIMINDO.....");
                        System.out.println("COMPRA REALIZADA: " + quantidade + " kg de FILÉ DUPLO.");
                        System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
                        System.out.printf("TOTAL: R$%.2f\n", valor);
                        System.out.println("");
                        System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
                    }
                }
                break;

            case 2:
                System.out.print("Informe quantos quilos de Alcatra você quer comprar: ");
                quantidade = tecla.nextDouble();
                if (quantidade <= 5) {
                    double valor = quantidade * 5.90;
                    System.out.println("Você está comprando " + quantidade + " kg de Alcatra, e vai pagar R$" + valor);
                    System.out.print("Você tem um cartão tabajara? [S/N]: ");
                    char cartao = tecla.next().charAt(0);
                    if (cartao == 's' || cartao == 'S') {
                        System.out.print("Você quer usar o cartão para pagar a compra? [S/N]: ");
                        char usarOuNao = tecla.next().charAt(0);
                        if (usarOuNao == 's' || usarOuNao == 'S') {
                            double desconto = valor / 5;
                            double total = valor - desconto;
                            System.out.println("IMPRIMINDO.....");
                            System.out.println("COMPRA REALIZADA: " + quantidade + " kg de ALCATRA.");
                            System.out.println("FORMA DE PAGAMENTO: CARTÃO TABAJARA");
                            System.out.println("GANHOU 5% DE DESCONTO PELA COMPRA NO CARTÃO DA LOJA");
                            System.out.printf("DESCONTO: R$%.2f\n", desconto);
                            System.out.printf("TOTAL: R$%.2f\n", total);
                            System.out.println("");
                            System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
                        } else {
                            System.out.println("IMPRIMINDO.....");
                            System.out.println("COMPRA REALIZADA: " + quantidade + " kg de ALCATRA.");
                            System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
                            System.out.printf("TOTAL: R$%.2f\n", valor);
                            System.out.println("");
                            System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
                        }
                    } else {
                        System.out.println("IMPRIMINDO.....");
                        System.out.println("COMPRA REALIZADA: " + quantidade + " kg de ALCATRA.");
                        System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
                        System.out.printf("TOTAL: R$%.2f\n", valor);
                        System.out.println("");
                        System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
                    }
                } else if (quantidade > 5) {
                    double valor = quantidade * 6.80;
                    System.out.println("Você está comprando " + quantidade + " kg de Alcatra, e vai pagar R$" + valor);
                    System.out.print("Você tem um cartão tabajara? [S/N]: ");
                    char cartao = tecla.next().charAt(0);
                    if (cartao == 's' || cartao == 'S') {
                        System.out.print("Você quer usar o cartão para pagar a compra? [S/N]: ");
                        char usarOuNao = tecla.next().charAt(0);
                        if (usarOuNao == 's' || usarOuNao == 'S') {
                            double desconto = valor / 5;
                            double total = valor - desconto;
                            System.out.println("IMPRIMINDO.....");
                            System.out.println("COMPRA REALIZADA: " + quantidade + " kg de ALCATRA.");
                            System.out.println("FORMA DE PAGAMENTO: CARTÃO TABAJARA");
                            System.out.println("GANHOU 5% DE DESCONTO PELA COMPRA NO CARTÃO DA LOJA");
                            System.out.printf("DESCONTO: R$%.2f\n", desconto);
                            System.out.printf("TOTAL: R$%.2f\n", total);
                            System.out.println("");
                            System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
                        } else {
                            System.out.println("IMPRIMINDO.....");
                            System.out.println("COMPRA REALIZADA: " + quantidade + " kg de ALCATRA.");
                            System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
                            System.out.printf("TOTAL: R$%.2f\n", valor);
                            System.out.println("");
                            System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
                        }
                    } else {
                        System.out.println("IMPRIMINDO.....");
                        System.out.println("COMPRA REALIZADA: " + quantidade + " kg de ALCATRA.");
                        System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
                        System.out.printf("TOTAL: R$%.2f\n", valor);
                        System.out.println("");
                        System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
                    }
                }
                break;

            case 3:
                System.out.print("Informe quantos quilos de Picanha você quer comprar: ");
                quantidade = tecla.nextDouble();
                if (quantidade <= 5) {
                    double valor = quantidade * 6.90;
                    System.out.println("Você está comprando " + quantidade + " kg de Picanha, e vai pagar R$" + valor);
                    System.out.print("Você tem um cartão tabajara? [S/N]: ");
                    char cartao = tecla.next().charAt(0);
                    if (cartao == 's' || cartao == 'S') {
                        System.out.print("Você quer usar o cartão para pagar a compra? [S/N]: ");
                        char usarOuNao = tecla.next().charAt(0);
                        if (usarOuNao == 's' || usarOuNao == 'S') {
                            double desconto = valor / 5;
                            double total = valor - desconto;
                            System.out.println("IMPRIMINDO.....");
                            System.out.println("COMPRA REALIZADA: " + quantidade + " kg de PICANHA.");
                            System.out.println("FORMA DE PAGAMENTO: CARTÃO TABAJARA");
                            System.out.println("GANHOU 5% DE DESCONTO PELA COMPRA NO CARTÃO DA LOJA");
                            System.out.printf("DESCONTO: R$%.2f\n", desconto);
                            System.out.printf("TOTAL: R$%.2f\n", total);
                            System.out.println("");
                            System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
                        } else {
                            System.out.println("IMPRIMINDO.....");
                            System.out.println("COMPRA REALIZADA: " + quantidade + " kg de PICANHA.");
                            System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
                            System.out.printf("TOTAL: R$%.2f\n", valor);
                            System.out.println("");
                            System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
                        }
                    } else {
                        System.out.println("IMPRIMINDO.....");
                        System.out.println("COMPRA REALIZADA: " + quantidade + " kg de PICANHA.");
                        System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
                        System.out.printf("TOTAL: R$%.2f\n", valor);
                        System.out.println("");
                        System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
                    }
                } else if (quantidade > 5) {
                    double valor = quantidade * 7.80;
                    System.out.println("Você está comprando " + quantidade + " kg de Picanha, e vai pagar R$" + valor);
                    System.out.print("Você tem um cartão tabajara? [S/N]: ");
                    char cartao = tecla.next().charAt(0);
                    if (cartao == 's' || cartao == 'S') {
                        System.out.print("Você quer usar o cartão para pagar a compra? [S/N]: ");
                        char usarOuNao = tecla.next().charAt(0);
                        if (usarOuNao == 's' || usarOuNao == 'S') {
                            double desconto = valor / 5;
                            double total = valor - desconto;
                            System.out.println("IMPRIMINDO.....");
                            System.out.println("COMPRA REALIZADA: " + quantidade + " kg de PICANHA.");
                            System.out.println("FORMA DE PAGAMENTO: CARTÃO TABAJARA");
                            System.out.println("GANHOU 5% DE DESCONTO PELA COMPRA NO CARTÃO DA LOJA");
                            System.out.printf("DESCONTO: R$%.2f\n", desconto);
                            System.out.printf("TOTAL: R$%.2f\n", total);
                            System.out.println("");
                            System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
                        } else {
                            System.out.println("IMPRIMINDO.....");
                            System.out.println("COMPRA REALIZADA: " + quantidade + " kg de PICANHA.");
                            System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
                            System.out.printf("TOTAL: R$%.2f\n", valor);
                            System.out.println("");
                            System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");
                        }
                    } else {
                        System.out.println("IMPRIMINDO.....");
                        System.out.println("COMPRA REALIZADA: " + quantidade + " kg de PICANHA.");
                        System.out.println("FORMA DE PAGAMENTO: DINHEIRO");
                        System.out.printf("TOTAL: R$%.2f\n", valor);
                        System.out.println("");
                        System.out.println("    OBRIGADO E VOLTE SEMPRE!    ");

                    }
                }
                break;

            default:
                System.out.println("Opção inválida, Volte para o final da fila, espere sua vez, e escolha a carne se quiser.");
                System.exit(0);
        }
    }
}

