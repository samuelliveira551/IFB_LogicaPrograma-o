// Solicite distância percorrida e combustível gasto, informe o consumo médio


import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//variáveis
		int distancia, combustivel, consumo;
			
		//entrada
		System.out.print("Insira a distância percorrida: ");
		distancia = s.nextInt(); 
		System.out.print("Insira a quantidade de combustível: ");
		combustivel = s.nextInt();
						
		//processamento
		consumo = distancia / combustivel;
				
		 //saida
		System.out.println("O consumo médio do veículo é: " + consumo + "km/l");	
		
	}

}

