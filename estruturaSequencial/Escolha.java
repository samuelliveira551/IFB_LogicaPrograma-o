package estruturaSequencial;

import java.util.Scanner;

public class Escolha {
	public static void main(String[] args) {
		int mes;
		Scanner s = new Scanner(System.in);

		System.out.println("Insira um numero entre (1 e 12)");
		mes = s.nextInt();

		switch (mes) { //  switch = escolha
		case 1:
			System.out.println("JANEIRO");
			break;
		case 2:
			System.out.println("FEVEREIRO");
			break;

		default:
			System.out.println("mês inválido"); 
		}

	}

}
