// Leia tr�s notas, calcule e imprima a m�dia aritm�tica entre essas notas


import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//vari�veis
		double nota1, nota2, nota3;
		double soma, media;
			
		//entrada
		System.out.print("Insira a primeira nota: ");
		nota1 = s.nextDouble(); 
		System.out.print("Insira a segunda nota: ");
		nota2 = s.nextDouble();
		System.out.print("Insira a terceira nota: ");
		nota3 = s.nextDouble();
				
		//processamento
		media = (nota1 + nota2 + nota3) / 3;
				
		 //saida
		System.out.println("A m�dia aritim�tica �  " + media);	
		
	}

}

