// exercicio 2 -Entrar com numeros e imprimir o triplo deste numero. Encessar quando digitar -999

package turmaa20192;

import java.util.Scanner;

public class triploNumero {
	public static void main(String[] args) {

	Scanner x=new Scanner(System.in);
	
	int n;
	System.out.println("Insira um número: ");
	n = x.nextInt();
	while (n != -999) {
		System.out.println("Tripo = "+n*3);
		System.out.print("Insira outro número: ");
		n = x.nextInt();
	}
	x.close();
	}

}