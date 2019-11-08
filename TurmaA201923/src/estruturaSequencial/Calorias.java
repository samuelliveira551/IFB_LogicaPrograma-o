package estruturaSequencial;

import java.util.Scanner;

public class Calorias {
	public static void main(String[] args) {
		int pratoPrincipal, sobremesa, bebida, menu, calorias = 0;
		Scanner s = new Scanner(System.in); // Scanner s = captura a entrada

		System.out.println("PRATO PRINCIPAL");
		System.out.println("1 - Vegetariano");
		System.out.println("2 - Peixe");
		System.out.println("3 - Frango");
		System.out.println("4 - Carne Bovina");
		menu = s.nextInt();

		switch (menu){ //  switch = escolha
		case 1:
			calorias += 180;
			break;
		case 2:
			calorias += 200;
			break;
		case 3:
			calorias += 220;
			break;
		case 4:
			calorias += 240;
			break;
		default:
			System.out.println("OPÇÃO INVÁLIDA");
			
			System.out.println("BEBIDA");
			System.out.println("1 - Vegetariano");
			System.out.println("2 - Peixe");
			System.out.println("3 - Frango");
			System.out.println("4 - Carne Bovina");
			menu = s.nextInt();
			
			switch (menu) { //  switch = escolha
			case 1:
				calorias += 75;
				System.out.println("1");
				break;
			case 2:
				calorias += 110;
				System.out.println("2");
				break;
			case 3:
				calorias += 170;
				System.out.println("2");
				break;
			case 4:
				calorias += 200;
				System.out.println("2");
				break;
			default:
				System.out.println("OPÇÃO INVÁLIDA");
				
				System.out.println("SOBREMESA");
				System.out.println("1 - Vegetariano");
				System.out.println("2 - Peixe");
				System.out.println("3 - Frango");
				System.out.println("4 - Carne Bovina");
				menu = s.nextInt();
				switch (menu) { //  switch = escolha
				case 1:
					calorias += 180;
					System.out.println("1");
					break;
				case 2:
					calorias += 230;
					System.out.println("2");
					break;
				case 3:
					calorias += 230;
					System.out.println("2");
					break;
				case 4:
					calorias += 230;
					System.out.println("2");
					break;
					System.out.println("BEBIDA" + bebida);
					
					System.out.println("Quantidade de calorias" + calorias);
					

		default:
			System.out.println("OPÇÃO INVÁLIDA"); 
		}

	}

}

	