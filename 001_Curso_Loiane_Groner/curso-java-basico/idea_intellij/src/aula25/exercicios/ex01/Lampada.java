package src.aula25.exercicios.ex01;

public class Lampada {
    String modelo;
    String tensao;
    int potencia;
    String tipoLuz;
    int mesesGarantia;
    String[] tipos;
    String cor;
    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        if (ligada) {
            System.out.println("Lampada está ligada.");
        } else {
            System.out.println("Lampada está desligada.");
        }
    }
}
