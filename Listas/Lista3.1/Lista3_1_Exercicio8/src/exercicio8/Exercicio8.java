package exercicio8;

import java.util.Scanner;

public class Exercicio8 {

   
    public static void main(String[] args) {
        //Declaração das variáveis
        Scanner input = new Scanner(System.in);
        String nome;
        double salarioAtual, novoSalario;
        char categoria;
        
        //Entrada de dados
        System.out.print("Digite o nome do funcionário: ");
        nome = input.nextLine();
        System.out.print("Digite a categoria do funcionário: ");
        categoria = input.nextLine().charAt(0);
        System.out.print("Digite seu salário atual: ");
        salarioAtual = Double.valueOf(input.nextLine());
       
        //Processamento
        if (categoria=='A' || categoria=='H'){
            novoSalario = salarioAtual + salarioAtual * 10/100;
        }
        else {
            if (categoria=='B' || categoria=='D' || categoria=='E'){
                novoSalario = salarioAtual + salarioAtual * 15/100;             
            }
            else {
                if (categoria=='C' || categoria=='F'){
                    novoSalario = salarioAtual + salarioAtual * 25/100;
                }
                else {
                    novoSalario = salarioAtual + salarioAtual * 30/100;
                }
            }
        }
                    
        // Saída de dados
        System.out.println("Funcionário: "+nome);
        System.out.println("Categoria: "+categoria);
        System.out.println("Salário Reajustado:"+novoSalario);
    }
}