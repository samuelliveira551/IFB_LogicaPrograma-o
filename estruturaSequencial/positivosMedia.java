// exercicio 4 - Entrar com vários numeros positivos, calcular a sua média e imprimir  

// questao da prova - Execute o programa até o usuario apertar tal tecla.  

package turmaa20192;

import java.util.Scanner;

public class positivosMedia {
	public static void main(String[] args) {

	Scanner x=new Scanner(System.in);
	
	int num, cont=0, soma=0;
	double media;
	System.out.println("Insira um número: ");
	num = x.nextInt();
	while (num > 0) {
		cont++;
		soma+=num;
		System.out.print("Insira outro número: ");
		num = x.nextInt();
		}
	media=soma/cont;
	System.out.println("A média dos números positivos é: "+ media);
	x.close();
	}

}