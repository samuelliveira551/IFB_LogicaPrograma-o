//Programa que capture a idade de 7 pessoas e imprima a média das idades
package estruturaSequencial;

import java.util.Scanner;

public class idade7 {
	public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	int idade, mediaIdade=0, contador=0;
	System.out.println("[Media das Idades]");	
	while(contador<7) {
	System.out.print("Insira a"+(contador+1)+"º idade");
	idade=s.nextInt();
	mediaIdade=mediaIdade+idade;
	contador++;
	
	}
	System.out.println("Média das idades: "+mediaIdade/7);
	System.out.println("\n[Programa Finalizado!]");
	}
	}