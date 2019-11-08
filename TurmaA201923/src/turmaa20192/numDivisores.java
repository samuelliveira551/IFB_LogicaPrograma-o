// exercicio 7 - Entrar com varios numeros  até entrar -999 para cada numero imprimir os divisores. 

package turmaa20192;

import java.util.Scanner;

public class numDivisores {
	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);

		int n = 0;

		System.out.println("Insira um número: ");
		n = x.nextInt();
		while (n!=-999) { // while externo
			int div=1;
			while (div<=n) { // while interno
				if (n % div==0) {
				System.out.println(div);
			}
			div++;
		}
		System.out.print("Insira outro número: ");
		n = x.nextInt();
			
			}

		System.err.println("Programa finalizado "); //err a mensagem sai em vermelho
		x.close();
	}

}