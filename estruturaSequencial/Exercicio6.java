// Calcula a �rea de uma circunfer�ncia, sendo o raio fornecido pelo usu�rio (area=pi x raio�)


import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {

		//vari�veis
		double area, raio;
		Scanner entrada = new Scanner(System.in);
		
		//entrada
		System.out.print("Incira a area do raio: ");
		raio = entrada.nextDouble();
		
		//processamento
		area = Math.PI * Math.pow(raio, 2);
		
		 //saida
		System.out.println("A �rea da circunfer�ncia � "+area);	
		
	}

}

