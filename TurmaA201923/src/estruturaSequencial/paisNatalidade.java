// exercicio 8 - Dado um pa�s A, com 5 milh�es de hab. e tx de natalidade de 3%. 

package turmaa20192;

import java.util.Scanner;

public class paisNatalidade {
	public static void main(String[] args) {

		Scanner x = new Scanner(System.in);

		int n = 0;

		System.out.println("Insira um n�mero: ");
		n = x.nextInt();
		while (n!=-999) { // while externo
			int div=1;
			while (div<=n) { // while interno
				if (n % div==0) {
				System.out.println(div);
			}
			div++;
		}
		System.out.print("Insira outro n�mero: ");
		n = x.nextInt();
			
			}

		System.err.println("Programa finalizado "); //err a mensagem sai em vermelho
		x.close();
	}

}