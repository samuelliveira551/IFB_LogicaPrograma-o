
// Recebe o nome e a idade emprime o nome e idade digitado daqui a 30 anos


import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {

		//variáveis
		int idade;
		String nome;
		Scanner entrada = new Scanner(System.in);
		
		//entrada
		System.out.print("Insira seu nome: ");
		nome = entrada.nextLine();
		System.out.print("Insira sua idade: ");
		idade = entrada.nextInt();
		
		//processamento
		idade += 30;
		
		 //saida
		System.out.println(nome+" sua idade daqui a 30 anos será "+idade+" anos");		
		
	}

}

