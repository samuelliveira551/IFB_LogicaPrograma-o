// exercicio 4 - Entrar com v�rios numeros positivos, calcular a sua m�dia e imprimir  

// questao da prova - Execute o programa at� o usuario apertar tal tecla.  

package turmaa20192;

import java.util.Scanner;

public class positivosMedia {
	public static void main(String[] args) {

	Scanner x=new Scanner(System.in);
	
	int num, cont=0, soma=0;
	double media;
	System.out.println("Insira um n�mero: ");
	num = x.nextInt();
	while (num > 0) {
		cont++;
		soma+=num;
		System.out.print("Insira outro n�mero: ");
		num = x.nextInt();
		}
	media=soma/cont;
	System.out.println("A m�dia dos n�meros positivos �: "+ media);
	x.close();
	}

}