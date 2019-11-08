

package estruturaSequencial;

import java.util.Scanner;

public class IfElseMedia {
	public static void main(String[] args) {
	
	int nota1, nota2, nota3, media ;
	Scanner s = new Scanner(System.line);
	
	System.out.println("Digite a primeira nota: ");
	nota1 = s.hasNextInt();
	System.out.println("Digite a segunda nota: ");
	nota2 = s.hasNextInt();
	System.out.println("Digite a terceira nota: ");
	nota3 = s.hasNextInt();
	if(media=nota1+nota2+nota3/3)
		System.out.println("A média é " + media);
	if(media>=7)
		System.out.println("APROVADO");
	}else {
		System.out.println("REPROVADO");
	
	}
}
