// Solicite cumprim. e largura de 1 sala e preço do carpete, informe custo total


import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//variáveis
		int cumprimento, largura, valorCarpete, valorTotal;
			
		//entrada
		System.out.print("Insira o cumprimento da sala: ");
		cumprimento = s.nextInt(); 
		System.out.print("Insira a largura da sala: ");
		largura = s.nextInt();
		System.out.print("Insira o valor do carpete: ");
		valorCarpete = s.nextInt();

		//processamento
		valorTotal = (cumprimento * largura) * valorCarpete;
				
		 //saida
		System.out.println("O custo total para o piso da sala é: " + valorTotal);	
		
	}

}

