package src.aula17.execicios.aula1617;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);

        boolean validacao = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        do {
            System.out.print("Informe o seu nome: ");
            nome = tecla.next();
            if (nome.length() < 3) {
                System.out.println("Nome com menos de 3 caracteres, tente novamente.");
            } else {
                validacao = true;
            }
        } while (!validacao);

        validacao = false;
        do {
            System.out.print("Informe a sua idade: ");
            idade = tecla.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("Idade menor que 0 ou maior que 150, tente novamente.");
            } else {
                validacao = true;
            }
        } while (!validacao);

        validacao = false;
        do {
            System.out.print("Informe o seu salário: R$");
            salario = tecla.nextDouble();
            if (salario >= 0) {
                validacao = true;
            } else {
                System.out.println("Salário não pode ser menor que 0, tente novamente.");
            }

        } while (!validacao);

        validacao = false;
        do {
            System.out.print("Informe o seu sexo: ");
            sexo = tecla.next();
            if (sexo.equalsIgnoreCase("m")) {
                 sexo = "Masculino";
                validacao = true;
            } else if (sexo.equalsIgnoreCase("f")){
                sexo = "Feminino";
                validacao = true;
            } else {
                System.out.println("Sexo tem que ser ou masculino 'M' ou feminino 'F', tente novamente.");
            }
        } while (!validacao);

        validacao = false;
        do {
            System.out.print("Informe seu estado civíl: ");
            estadoCivil = tecla.next();
            if (estadoCivil.equalsIgnoreCase("s")) {
                estadoCivil = "Solteiro(a)";
                validacao = true;
            } else if (estadoCivil.equalsIgnoreCase("c")){
                estadoCivil = "Casado(a).";
                validacao = true;
            } else if(estadoCivil.equalsIgnoreCase("v")){
                estadoCivil = "Viúvo(a).";
                validacao = true;
            } else if(estadoCivil.equalsIgnoreCase("d")){
                estadoCivil = "Divorciado(a).";
                validacao = true;
            } else {
                System.out.println("Não é um estado civíl válido, tente novamente.");
            }
        } while (!validacao);

        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade + " anos.");
        System.out.println("Salário: R$"+ salario);
        System.out.println("Sexo: "+ sexo);
        System.out.println("Estado civil: "+ estadoCivil);
    }
}