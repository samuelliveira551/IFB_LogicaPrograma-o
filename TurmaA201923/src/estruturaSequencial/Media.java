package estruturaSequencial;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Media {
	public static void main(String[] args) {
		// tipos de comentários. este é de uma linha
		/* este é de várias linhas
		 *  
		 */
		/** comentário para documentação   ]
		 * 
		 */
		// variáveis = t ipo  nome-valor;
		int nota1;
		int nota2;
		float nota3;
		String nome;
		double media;
		
		Scanner x; // pega a informação do usuário. tem que ser impostada por isso abaixo do package
		x = new Scanner(System.in); 
		
		// as duas linhas acima tambem pode ser:  Scanner s = new Scanner(System.in);
		
		System.out.println("Informe seu nome:");
		nome=x.nextLine();
		
		System.out.println("Informe a nota1:");
		nota1=x.nextInt();
		
		System.out.println("Informe a nota2:");
		nota2=x.nextInt();
				
		
	}

}
