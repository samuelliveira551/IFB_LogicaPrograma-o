// exercicio 4 -Entrar com v�rios numeros positivos  

// questao da prova - Execute o programa at� o usuario apertar tal tecla.  

package turmaa20192;

import java.util.Scanner;

public class variosPositivos {
	public static void main(String[] args) {

	Scanner x=new Scanner(System.in);
	
	int n, contador = 0;
	System.out.println("Insira um n�mero: ");
	n = x.nextInt();
	while (n > 0) {
		contador++;
		System.out.print("Insira outro n�mero: ");
		n = x.nextInt();
	}
	System.out.println("Os n�meros Positivos s�o: "+contador);
	x.close();
	}

}