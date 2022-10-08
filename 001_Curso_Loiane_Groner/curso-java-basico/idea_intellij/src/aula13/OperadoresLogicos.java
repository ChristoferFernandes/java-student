package src.aula13;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int valor1, valor2;
        valor1 = 1;
        valor2 = 2;
        boolean resultado1,resultado2;

        resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println("Valor1 é 1 AND valor2 é 2: "+ resultado1);

        resultado2 = (valor1 == 1) || (valor2 == 2);
        System.out.println("valor1 é 1 OR valor2 é 2: "+ resultado2);


    }
}
