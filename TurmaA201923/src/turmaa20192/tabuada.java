// exercicio 3 -Entrar com numeros enquanto forem possitivos. Imprimir quantos forem digitados. Numero Negativo finaliza o progrma

// questao da prova - Execute o programa até o usuario apertar tal tecla.  

// Pega um valor do usuario digitar e faz uma tabuada. 


package turmaa20192;

import java.util.Scanner;

public class tabuada {
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		//variaveis
		int n;
		
		//entrada
		System.out.print("Insira um valor:");
		n = s.nextInt();
			
		//processamento e Saída
		for(int I = 1; I <= 10; I++) {
		System.out.println(I+ "x "+n+" = " +(I*n));
		
		}
		
	}
}