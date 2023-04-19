package src.aula17.exerciciosaula1617;

import java.util.Scanner;

/*
Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada e
permita repetir a operação
 */
public class Exer05 {
	 public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			
			int i, paisA, paisB;
			double percentualA, percentualB;
			boolean sair;
			String saindo;
			
			i = 0;
			sair = false;
			do {
				 System.out.print("Informe a quantidade de pessoas no país A: ");
				 paisA = key.nextInt();
				 
				 System.out.print("Informe o percentual de crescimento do país A: ");
				 percentualA = key.nextDouble();
				 
				 System.out.print("Informe a quantidade de pessoas no país B: ");
				 paisB = key.nextInt();
				 
				 System.out.print("Informe o percentual de crescimento do país B: ");
				 percentualB = key.nextDouble();
				 
				 if (paisA < paisB) {
						while (paisA < paisB) {
							 paisA += (paisA / 100) * percentualA;
							 paisB += (paisB / 100) * percentualB;
							 i++;
						}
				 } else {
						while (paisB < paisA) {
							 paisA += (paisA / 100) * percentualA;
							 paisB += (paisB / 100) * percentualB;
							 i++;
						}
				 }
				 System.out.println("População A: " + paisA);
				 System.out.println("População B: " + paisB);
				 System.out.println("Quantidade de anos para ultrapassagem: " + i + " anos.");
				 
				 System.out.print("Deseja sair do programa? (Sim/Não): ");
				 saindo = key.next();
				 if (saindo.equalsIgnoreCase("Sim")) {
						sair = true;
						System.out.println("Saindo do programa...");
				 }
			} while (!sair);
	 }
}
