package src.aula22.exercicios.ex01;

public class Exercicio1 {
    public static void main(String [] args) {
        LampadaEx01 lampadaEx01 = new LampadaEx01();
            lampadaEx01.modelo = "A60";
            lampadaEx01.tensao = "Bivolt";
            lampadaEx01.mesesGarantia = 36;
            lampadaEx01.potencia = 7;
            lampadaEx01.cor = "Amarela";
            lampadaEx01.tipoLuz = "Branca";
            lampadaEx01.tipos = new String[2];
            lampadaEx01.tipos[0] = "Abajur";
            lampadaEx01.tipos[1] = "Lamparina";
    }
}
