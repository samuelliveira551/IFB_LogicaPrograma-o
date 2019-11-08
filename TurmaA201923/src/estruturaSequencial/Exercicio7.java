// Calcula a área de uma circunferência, sendo o raio fornecido pelo usuário (area=pi x raio²)


import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {

		//variáveis
		String nome;
		double salario, vendas, comissao, salarioFinal;
		Scanner s = new Scanner(System.in);
		
		//entrada
		System.out.print("Insira o nome: ");
		nome = s.nextLine(); 
		System.out.print("Insira o salário: ");
		salario = s.nextDouble(); 
		System.out.print("Insira o totalde vendas: ");
		vendas = s.nextDouble(); 
				
		//processamento
		comissao = 0.15 * vendas;
		salarioFinal = salario + comissao;
		
		 //saida
		System.out.println("O salário final é $" + salarioFinal);	
		
	}

}

