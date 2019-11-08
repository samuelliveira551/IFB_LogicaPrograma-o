
package estruturaSequencial;

import java.util.Scanner;

public class Escolha {
	public static void main(String[] args) {
	
	double nota1, nota2, nota3, media;
	Scanner s = new Scanner(System.in);
	
	System.out.print("Digite a primeira nota: ");
	nota1 = s.nextDouble();
	System.out.print("Digite a segunda nota: ");
	nota2 = s.nextDouble();
	System.out.print("Digite a terceira nota: ");
	nota3 = s.nextDouble();
	media=(nota1 + nota2 + nota3)/3;
	System.out.println("A média é " + media);
	
	if(media>=7) {
		System.out.println("APROVADO");
	}else {
		System.out.println("REPROVADO");
	
	}
}
}

