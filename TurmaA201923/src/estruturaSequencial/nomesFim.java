// exercicio 6 - Entrar com nomes enquanto forem diferentes de FIM imprimir cada nome digitado  

// questao da prova - Execute o programa até o usuario apertar tal tecla.  

package turmaa20192;

import java.util.Scanner;

public class nomesFim {
	public static void main(String[] args) {

	Scanner x=new Scanner(System.in);
	
	String nome;
	int cont=0;
		
	System.out.println("Insira um nome: ");
	nome = x.nextLine();
	// toLowerCase aceita que se digite fim ou FIM
	while (!nome.equals("fim")) {//nome é String não se compara com ==.equals verifica o conteúdo da variavel nome.nega !
		cont++;
		System.out.print("Insira outro nome: ");
		nome = x.nextLine();
	}	
		
	System.out.println("Os nomes digitados foram: "+ cont);
	x.close();
	}

}