package estruturaSequencial;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Media {
	public static void main(String[] args) {
		// tipos de coment�rios. este � de uma linha
		/* este � de v�rias linhas
		 *  
		 */
		/** coment�rio para documenta��o   ]
		 * 
		 */
		// vari�veis = t ipo  nome-valor;
		int nota1;
		int nota2;
		float nota3;
		String nome;
		double media;
		
		Scanner x; // pega a informa��o do usu�rio. tem que ser impostada por isso abaixo do package
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
