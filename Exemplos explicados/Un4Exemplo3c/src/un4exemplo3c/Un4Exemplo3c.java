/*
Uma empresa possui 12 vendedores e os identifica por um código de 0 a 11. 
Ela registra em uma tabela todas as vendas do mês, indicando o código do 
vendedor e o valor da venda. Faça um programa que leia estes dados e no final 
apresente o total de vendas no mês de cada um dos vendedores. Para terminar o 
programa, o usuário deve digitar -1 como código do vendedor.
 */
package un4exemplo3c;

import java.util.Scanner;

public class Un4Exemplo3c {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] vendedores = new double[12];
        int codigo;
        double venda;
        
        System.out.print("Digite o código do vendedor: ");
        codigo = Integer.valueOf(input.nextLine());
        while (codigo != -1){
            System.out.print("Digite o valor da venda: ");
            venda = Double.valueOf(input.nextLine());
            vendedores[codigo] = vendedores[codigo] + venda;
            System.out.print("Digite o código do vendedor: ");
            codigo = Integer.valueOf(input.nextLine());
        }
        System.out.println("******************************");
        for (int i=0;i<12;i++){
            System.out.println("Total de vendas do vendedor "+i+" : "+vendedores[i]);
        }
        
        
    }
    
}
