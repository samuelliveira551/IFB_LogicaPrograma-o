// Recebe um numero e informa o quadrado desse numero


import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {

		//vari�veis
		double numero, quadrado;
		Scanner s = new Scanner(System.in);
		
		//entrada
		System.out.print("Insira um n�mero");
		
		//processamento
		numero = s.nextDouble();
		quadrado = Math.pow(numero,  2);
		
		 //saida
		System.out.println("O quadrado de "+numero+" � "+quadrado);		
		
	}

}
