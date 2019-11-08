// exercicio 5 - Entrar com vários numeros, informar quantos entre 100 e 200 dos digitados, parar quando o 
// valor for zero o valor acaba  

// questao da prova - Execute o programa até o usuario apertar tal tecla.  

package turmaa20192;

import java.util.Scanner;

public class cemeDuzentos {
	public static void main(String[] args) {

	Scanner x=new Scanner(System.in);
	
	int num=0, cont=0;
		
	System.out.println("Insira um número: ");
	num = x.nextInt();
	while (num != 0) {
		if(num>100 && num<200)
		cont++;
		System.out.print("Insira outro número: ");
		num = x.nextInt();
	}	
		
	System.out.println("Entre 100 e 200 tem: "+ cont);
	x.close();
	}

}