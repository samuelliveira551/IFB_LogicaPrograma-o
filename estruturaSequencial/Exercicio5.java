// Leia a temperatura em graus Celsius e apresente convertido em Fahrenheit


import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {

		//variáveis
		double celsius, fahrenheit;
		Scanner entrada = new Scanner(System.in);
		
		//entrada
		System.out.print("Incira a temperatura em graus Celcius: ");
		celsius = entrada.nextDouble();
		
		//processamento
		fahrenheit = (9*celsius+160) / 5;
		
		 //saida
		System.out.println("A temperatura em graus Fahrenheit é "+fahrenheit);	
		
	}

}

