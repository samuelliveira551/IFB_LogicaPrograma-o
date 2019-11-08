// Solicite tamanho arquivo em bits e velocidade (bits/s), informe tempo download


import java.util.Scanner;

public class Exercicio12 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//variáveis
		int tamanho, velocidade, download;
			
		//entrada
		System.out.print("Insira o tamanho do arquivo em bits: ");
		tamanho = s.nextInt(); 
		System.out.print("Insira a velocidade da conexão em bits/s: ");
		velocidade = s.nextInt();
		
		//processamento
		download = tamanho * velocidade;
				
		 //saida
		System.out.println("O tempo necessário para o download em segundos é: " + download);	
		
	}

}

