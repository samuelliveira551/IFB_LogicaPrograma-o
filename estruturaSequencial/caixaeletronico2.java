//Caixa automático com notas de 2,10,20 e 50, que mostra o nº minino de notas e o valor do saque 
//e a quantidade de cada nota. limite o saque a 1000 e exiba a fração que o caixa não conseguiu sacar

package estruturaSequencial;

import java.util.Scanner;

public class caixaeletronico2 {
	public static void main(String[] args) {
	
	int nota2, nota10, nota20, nota50, saque = 0;
	Scanner s = new Scanner(System.in);
	
	System.out.println("Digite o valor do saque: "); // o sistema sempre começa da maior para a menor ou seja 50.
	saque = s.nextInt();
	
	if(saque > 0 && saque <= 1000) {
	
		nota50 = saque / 50; // se digitar 100, recebe 2 notas de 50 
		saque = saque % 50; // Se pedir 120, % (porcentagem) recebe 20
		nota20 = saque / 20;  
		saque = saque % 20; 
		nota10 = saque / 10;  
		saque = saque % 10;
		nota2 = saque / 2;  
		saque = saque % 2;
		
		System.out.println("Notas de $50 = " + nota50);
		System.out.println("Notas de $20 = " + nota20);
		System.out.println("Notas de $10 = " + nota10);
		System.out.println("Notas de $2 = " + nota2);
		
			if(saque > 0) {
				System.out.println("O caixa não conseguiu sacar $" + saque + ",00");
		
	}else {
		System.out.println("Saque indisponível!");
							
		}
	}
}
}
