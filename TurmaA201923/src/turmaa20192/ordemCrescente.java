package turmaa20192;

import java.util.Scanner;
public class ordemCrescente {
    /** exercicio 2
     */
    public static void main(String[] args) {
             //variaveis
        double salario, vendas, comissao, salarioFinal;
        Scanner s = new Scanner(System.in);
        //entrada    
        System.out.println("Insira o nome: ");
        nome = s.nextLine();
        System.out.println("Insira o salário fixo: ");
        salario = s.nextDouble();
        System.out.println("Insira as vendas: ");
        vendas = s.nextDouble();
        
        //processamento
        comissao = 0.15*vendas;
        salarioFinal = salario + comissao;
        
        System.out.println("O salario é $"+salarioFinal);
        
    }
}
  