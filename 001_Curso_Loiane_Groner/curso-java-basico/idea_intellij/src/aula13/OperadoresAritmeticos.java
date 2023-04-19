package src.aula13;

public class OperadoresAritmeticos {
	 public static void main(String[] args) {
			int resultado = 1 + 2;
			System.out.println(resultado);
			
			resultado = resultado - 1;
			System.out.println(resultado);
			
			resultado = resultado * 2;
			System.out.println(resultado);
			
			resultado = resultado / 2;
			System.out.println(resultado);
			
			resultado = resultado + 8;
			System.out.println(resultado);
			
			resultado = resultado % 7;
			System.out.println(resultado);
			
			String primeiroNome = "Está é";
			String segundoNome = " uma String concatenada";
			String terceiroNome = primeiroNome + segundoNome;
			System.out.println(terceiroNome);
			
			
			resultado = resultado + 1; // Este resultado, é a mesma coisa que o valor debaixo
			System.out.println(resultado);
			
			resultado = ++resultado; // significa que está adicionando 1
			System.out.println(resultado);
			//5
			System.out.println(resultado++);
			//mesma coisa que
			//System.out.println(resultado); imprimir primeiro o resultado, e depois acrescentar +1
			//resultado = +1;
			//resultado += 1;
			
			
			System.out.println(++resultado);
			//é a mesma coisa que
			//resultado = +1;
			//resultado += 1;
			//System.out.println(resultado); acresentar primeiro +1, e depois imprimir o resultado
			
			//Também podemos fazer o mesmo retirando valores
			resultado--;
			System.out.println(resultado);
			System.out.println(resultado--);
			System.out.println(--resultado);
	 }
}