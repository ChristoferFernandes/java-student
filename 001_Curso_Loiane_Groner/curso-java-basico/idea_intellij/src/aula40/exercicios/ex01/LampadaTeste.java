package src.aula22.exercicios.ex01;

public class LampadaTeste {
  public static void main(String[] args) {
	 Lampada lampada = new Lampada();
	 lampada.fabricante = "CristalLux";
	 lampada.modelo = "A60";
	 lampada.tensao = "Bivolt";
	 lampada.mesesGarantia = 36;
	 lampada.potencia = 7;
	 lampada.cor = "Amarela";
	 lampada.tipoLuz = "Branca";
	 
	 lampada.tipos = new String[3];
	 lampada.tipos[0] = "Abajur";
	 lampada.tipos[1] = "Lamparina";

	 System.out.println("Marca: "+ lampada.fabricante);
	 System.out.println("Tipo de Lampada: " + lampada.tipos[1]);
	 System.out.println("Modelo de Lampada: " + lampada.modelo);
	 System.out.println("Cor de Lampada: " + lampada.cor);
	 System.out.println("Meses de garantia: " + lampada.mesesGarantia);
  }
}
