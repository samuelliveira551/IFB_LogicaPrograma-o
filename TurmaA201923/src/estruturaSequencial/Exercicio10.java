// Solicite dist�ncia percorrida e combust�vel gasto, informe o consumo m�dio


import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//vari�veis
		int distancia, combustivel, consumo;
			
		//entrada
		System.out.print("Insira a dist�ncia percorrida: ");
		distancia = s.nextInt(); 
		System.out.print("Insira a quantidade de combust�vel: ");
		combustivel = s.nextInt();
						
		//processamento
		consumo = distancia / combustivel;
				
		 //saida
		System.out.println("O consumo m�dio do ve�culo �: " + consumo + "km/l");	
		
	}

}

