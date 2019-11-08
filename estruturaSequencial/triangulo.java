//EXERCICIO 11 - tringulo
// pega 3 lados e verifica se forma um triangulo,  se os 3 lados forem iguais é equilátero, se 2 lados forem iguais 
// se é equilátero, escaleno ou isostenes    a<b+c; b<a+c; c<a+b
package estruturaSequencial;

import java.util.Scanner;

public class triangulo {
	public static void main(String[] args) {
		
		double lado1, lado2, lado3;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Insira o lado 1: ");
		lado1 = s.nextDouble();
		System.out.print("Insira o lado 2: ");
		lado2 = s.nextDouble();
		System.out.print("Insira o lado 3: ");
		lado3 = s.nextDouble();
		
		if(lado1<lado2+lado3 && lado2<lado1+lado3 && lado3<lado1+lado2)
			System.out
		else
			salario*=1.3;
		System.out.println("Novo salário: $"+salario);
				
	}
	
}
