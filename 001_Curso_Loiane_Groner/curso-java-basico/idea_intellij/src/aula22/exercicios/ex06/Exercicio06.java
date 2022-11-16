package src.aula22.exercicios.ex06;

public class Exercicio06 {
    public static void main(String [] args) {
        Contato agenda = new Contato();

            agenda.nome = "Trabalho";
            agenda.email = "trabalheconosco.criaçãodejogos@startup.com.br";
            agenda.endereco = "Avenida Presidente Dutra, Nº 523, Quarto andar sala 401 - Petrópolis";

            agenda.telefones = new String[2];
            agenda.telefones[0] = "Telefone Fixo: (24) 3535-3535";
            agenda.telefones[1] = "Telefone Celular: (24) 99998-9998";

        System.out.println("Contato ");
        System.out.println("Nome: "+ agenda.nome);
        System.out.println("E-mail: "+ agenda.email);
        System.out.println("Endereço: "+ agenda.endereco);
        System.out.println("Telefones:"+ agenda.telefones[0] +" | "+ agenda.telefones[1]);
    }
}