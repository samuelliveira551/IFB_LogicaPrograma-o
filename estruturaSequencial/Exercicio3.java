// Recebe 2 numero (base e expoente) e apresente a base elevada ao expoente

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		//variaveis
		double base, expoente, resultado;
		Scanner input = new Scanner(System.in);
		
		//entrada
		System.out.print("Insira a Base: ");
		base = input.nextDouble();
		
		System.out.println("Insira a Expoente: ");
		expoente = input.nextDouble();
		
		//processamento
		resultado = Math.pow(base, expoente);
		
		//Saída
		System.out.println("O resultado é: "+resultado);
		
	}

}
