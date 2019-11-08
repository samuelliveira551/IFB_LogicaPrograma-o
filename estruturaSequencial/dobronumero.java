// FAÇA UM ALGORITIMO QUE LEIA UM NUMERO E INFORME SE O DOBRO DO NÚMERO É MAIOR QUE 40

package estruturaSequencial;

import java.util.Scanner;

public class dobronumero {
	public static void main(String[] args) {

	int numero, dobro;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Insira um numero: ");
	numero = sc.nextInt();
	
	dobro = numero * numero;
	
	if(dobro > 40)
		System.out.println("MAIOR QUE 40");
	else
		System.out.println("MENOR QUE 40");
	}
}