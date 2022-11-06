package src.aula22.exercicios;

public class Exercicio01 {
    public static void main(String[] args) {
        Lampada led = new Lampada();
            led.marca = "FOXLUX";
            led.voltagem = 110;
            led.consumo = 23;

        System.out.println("Lampada Led - Marca: "+ led.marca);
        System.out.println("Lampada Led - Voltagem: "+ led.voltagem +"v");
        System.out.println("Lampada Led - Consumo: "+ led.consumo +"w");

        Lampada flourescente = new Lampada();
            flourescente.marca = "LUXFOX";
            flourescente.voltagem = 110;
            flourescente.consumo = 25;

        System.out.println("Lampada flourescente - Marca: "+ flourescente.marca);
        System.out.println("Lampada flourescente - Voltagem: "+ flourescente.voltagem +"v");
        System.out.println("Lampada flourescente - Consumo: "+ flourescente.consumo +"w");
    }
}
