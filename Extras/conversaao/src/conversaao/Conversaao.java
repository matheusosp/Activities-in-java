/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversaao;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Conversaao {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        // TODO code application logic here
        Double salario,salario_f,totalvendas;
        int qtdcarros;
        Scanner input= new Scanner (System.in);
        System.out.print("Digite o valor do salario minimo: ");
        salario = Double.valueOf(input.nextLine());
        System.out.print("Digite a quantidade de carros vendidos no mes:  ");
        qtdcarros = Integer.valueOf(input.nextLine());
        System.out.print("Digite o total de vendas:  ");
        totalvendas = Double.valueOf(input.nextLine());
        salario_f= 150*qtdcarros+totalvendas*0.05+salario*2;
        System.out.println("O valor final do salario do funcionario é: "+salario_f);
        
    }
    
}
