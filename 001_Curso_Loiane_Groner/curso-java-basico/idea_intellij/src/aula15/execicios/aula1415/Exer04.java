package src.aula15.execicios.aula1415;

import java.util.Scanner;

/*
Faça um Programa que verifique se uma letra digitada é vogal ou
consoante
 */
public class Exer04 {
  public static void main(String[] args) {
	 Scanner key = new Scanner(System.in);
	 
	 System.out.print("Informe uma letra: ");
	 String letra = key.nextLine();
	 
	 if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
			|| letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
		System.out.println(letra + " é uma vogal.");
	 } else if (letra.equalsIgnoreCase("b") || letra.equalsIgnoreCase("c") || letra.equalsIgnoreCase("d")
			|| letra.equalsIgnoreCase("f") || letra.equalsIgnoreCase("g") || letra.equalsIgnoreCase("h")
			|| letra.equalsIgnoreCase("j") || letra.equalsIgnoreCase("k") || letra.equalsIgnoreCase("l")
			|| letra.equalsIgnoreCase("m") || letra.equalsIgnoreCase("n") || letra.equalsIgnoreCase("p")
			|| letra.equalsIgnoreCase("q") || letra.equalsIgnoreCase("r") || letra.equalsIgnoreCase("s")
			|| letra.equalsIgnoreCase("t") || letra.equalsIgnoreCase("v") || letra.equalsIgnoreCase("x")
			|| letra.equalsIgnoreCase("w") || letra.equalsIgnoreCase("y") || letra.equalsIgnoreCase("z")) {
		System.out.println(letra + " é uma consoante");
	 }
  }
}
