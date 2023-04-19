package src.aula17;

public class For {
	 public static void main(String[] args) {
			
			//for normal
        /*
        for(int i = 0; i < 5 ;i++ ){
        	System.out.println("O valor de i: "+ i);
        }
		//Decrementando valor
        for(int i = 5; i > 0; i--){
            System.out.println("O valor de i: "+ i);
        }*/
			
			//for com mais de uma variável
        /*for(int i = 0, j = 10; i < j; i ++, j--){
            System.out.println("i = "+i+ " j = "+j);
        }*/
			
			//partes ausentes
        /*int i = 0;
        for(;i < 10 ;){
            System.out.println("valor de i: "+i);
            i = i += 2;
        }*/
			//é a mesma coisa que
        /*for( int count = 0; count < 10; count += 2){
            System.out.println("valor de i: "+count);
        }*/
			
			//loop sem corpo, é utilizado geralmente para somar valores.
        /*int soma = 0;
        for(int i = 1; i < 5; soma += i++){
        }
        System.out.println("O valor da soma é: "+soma);*/
			
			
	 }
}
