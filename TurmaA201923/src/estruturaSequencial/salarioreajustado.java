//EXERCICIO 10
//RECEBE SALARIO APLICA UM REAJUSTE de 50% se o salário for menor que R$300 e 30% se o salário for maior que R$300
package estruturaSequencial;

import java.util.Scanner;

public class salarioreajustado {
	public static void main(String[] args) {
		
		double salario;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Insira o salário: ");
		salario = s.nextDouble();
		
		if(salario <= 300)
			salario*=1.5;
		else
			salario*=1.3;
		System.out.println("Novo salário: $"+salario);
				
	}
	
}
