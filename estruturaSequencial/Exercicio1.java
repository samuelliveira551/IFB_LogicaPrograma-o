import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//vari�veis
		double numero, metade, dobro;
		Scanner input = new Scanner(System.in);

	    //entrada
        System.out.print("Insira um n�mero: ");
	    numero = input.nextDouble();

	    //processamento
        metade = numero / 2;
        dobro = numero * 2;

        //saida
        System.out.println("A metaded "+numero+" = "+metade);
        System.out.println("O dobro de "+numero+" = "+dobro);
	}
}
