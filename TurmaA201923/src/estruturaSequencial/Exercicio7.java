// Calcula a �rea de uma circunfer�ncia, sendo o raio fornecido pelo usu�rio (area=pi x raio�)


import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {

		//vari�veis
		String nome;
		double salario, vendas, comissao, salarioFinal;
		Scanner s = new Scanner(System.in);
		
		//entrada
		System.out.print("Insira o nome: ");
		nome = s.nextLine(); 
		System.out.print("Insira o sal�rio: ");
		salario = s.nextDouble(); 
		System.out.print("Insira o totalde vendas: ");
		vendas = s.nextDouble(); 
				
		//processamento
		comissao = 0.15 * vendas;
		salarioFinal = salario + comissao;
		
		 //saida
		System.out.println("O sal�rio final � $" + salarioFinal);	
		
	}

}

