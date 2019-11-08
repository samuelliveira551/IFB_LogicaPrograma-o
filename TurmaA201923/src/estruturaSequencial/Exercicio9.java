// Solicita o nome e a idade em anos e mostre o nome e a idade em meses e dias


import java.util.Scanner;

public class Exercicio9 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		//variáveis
		String nome;
		int idade, mes, dia;
			
		//entrada
		System.out.print("Insira o nome: ");
		nome = s.nextLine(); 
		System.out.print("Insira a idade: ");
		idade = s.nextInt();
						
		//processamento
		mes = idade * 12;
		dia = mes * 365;
				
		 //saida
		System.out.println("A idade em meses é: " + mes);	
		System.out.println("A idade em dias é: " + dia);	
		
	}

}

