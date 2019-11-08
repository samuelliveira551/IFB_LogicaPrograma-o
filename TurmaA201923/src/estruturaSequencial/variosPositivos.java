// exercicio 4 -Entrar com vários numeros positivos  

// questao da prova - Execute o programa até o usuario apertar tal tecla.  

package turmaa20192;

import java.util.Scanner;

public class variosPositivos {
	public static void main(String[] args) {

	Scanner x=new Scanner(System.in);
	
	int n, contador = 0;
	System.out.println("Insira um número: ");
	n = x.nextInt();
	while (n > 0) {
		contador++;
		System.out.print("Insira outro número: ");
		n = x.nextInt();
	}
	System.out.println("Os números Positivos são: "+contador);
	x.close();
	}

}