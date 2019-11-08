// Calcula a área de uma circunferência, sendo o raio fornecido pelo usuário (area=pi x raio²)


import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {

		//variáveis
		double area, raio;
		Scanner entrada = new Scanner(System.in);
		
		//entrada
		System.out.print("Incira a area do raio: ");
		raio = entrada.nextDouble();
		
		//processamento
		area = Math.PI * Math.pow(raio, 2);
		
		 //saida
		System.out.println("A área da circunferência é "+area);	
		
	}

}

