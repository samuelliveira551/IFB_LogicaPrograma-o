
// sabendo que a = 3; b = 6; c = 15; x = 1; y = 2; onde a + b * c; 4/x+y; 4a*c; 1/3 y; imprima as letras correspondente

package estruturaSequencial;

public class Operadores {
	public static void main(String[] args) {
	
	double a = 3;
	double b = 6;
	double c = 15;
	double x = 1;
	double y = 2;
	
	double letraA = a + b * c;
	double letraB = 4/x+y;
	double letraC = Math.pow(b,2)-4*a*c;
	double letraD = 1/3*y;
	
	Math.pow(letraC, letraD);
	System.out.println(letraA);
	System.out.println(letraB);
	System.out.println(letraC);
	System.out.println(letraD);
	
	
	}
}
