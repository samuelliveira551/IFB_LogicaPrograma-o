// exercicio 5 - Entrar com v�rios numeros, informar quantos entre 100 e 200 dos digitados, parar quando o 
// valor for zero o valor acaba  

// questao da prova - Execute o programa at� o usuario apertar tal tecla.  

package turmaa20192;

import java.util.Scanner;

public class cemeDuzentos {
	public static void main(String[] args) {

	Scanner x=new Scanner(System.in);
	
	int num=0, cont=0;
		
	System.out.println("Insira um n�mero: ");
	num = x.nextInt();
	while (num != 0) {
		if(num>100 && num<200)
		cont++;
		System.out.print("Insira outro n�mero: ");
		num = x.nextInt();
	}	
		
	System.out.println("Entre 100 e 200 tem: "+ cont);
	x.close();
	}

}