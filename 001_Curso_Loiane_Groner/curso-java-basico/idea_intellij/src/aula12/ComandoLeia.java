package src.aula12;

import java.util.Scanner;

public class ComandoLeia {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        String nomeCompleto, primeiroNome;
        int idade, filho;
        double altura;
        boolean temPet;
        /*System.out.print("Digite o seu nome completo: ");
            nomeCompleto = teclado.nextLine();
        System.out.println("Seu nome completo é " + nomeCompleto);

        System.out.print("Digite o seu primeiro nome: ");
            primeiroNome = teclado.next();
        System.out.println("O seu primeiro nome é " + primeiroNome);*/

        /*System.out.print("Informe a sua idade: ");
            idade = teclado.nextInt();
        System.out.println("Sua idade é " + idade);

        System.out.print("Digite a sua altura: ");
            altura = teclado.nextDouble();
        System.out.println("Sua altura é " + altura); */

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura, e se tem bichos de estimação: ");
        primeiroNome = teclado.next();
        idade = teclado.nextInt();
        filho = teclado.nextInt();
        altura = teclado.nextDouble();
        temPet = teclado.nextBoolean();
        System.out.println("Você informou as seguintes respostas: ");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Sua Idade: " + idade);
        System.out.println("Quantidade de filhos: " + filho);
        System.out.println("Sua altura: "+ altura);
        System.out.println("Tem bicho de estimação: " + temPet);
    }
}
