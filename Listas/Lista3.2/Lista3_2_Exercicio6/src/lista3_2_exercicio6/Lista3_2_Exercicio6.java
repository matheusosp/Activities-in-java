package lista3_2_exercicio6;

import java.util.Scanner;

public class Lista3_2_Exercicio6 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, quantFuncionarios;
        String nome;
        double salario, novoSalario;
        char categoria;
        
        System.out.print("Digite a quantidade de funcionários da empresa: ");
        quantFuncionarios = Integer.valueOf(input.nextLine());
        for (i=1;i<=quantFuncionarios;i++){
            System.out.print("Digite o nome do funcionário "+i+": ");
            nome = input.nextLine();
            System.out.print("Digite o salário do funcionário "+nome+": ");
            salario = Double.valueOf(input.nextLine());
            System.out.print("Digite a categoria do funcionário "+nome+" (Use letras maiúsculas): ");
            categoria = input.nextLine().charAt(0);
            switch (categoria){
                case 'A' :  novoSalario = salario + salario*10/100;
                            break;
                case 'B' :  novoSalario = salario + salario*12/100;
                            break;
                case 'C' :  novoSalario = salario + salario*14/100;
                            break;
                case 'D' :  novoSalario = salario + salario*16/100;
                            break;
                case 'E' :  novoSalario = salario + salario*18/100;
                            break;
                case 'F' :  novoSalario = salario + salario*20/100;
                            break;
                case 'G' :  novoSalario = salario + salario*22/100;
                            break;
                case 'H' :  novoSalario = salario + salario*24/100;
                            break;
                case 'I' :  novoSalario = salario + salario*26/100;
                            break;
                case 'J' :  novoSalario = salario + salario*28/100;
                            break;
                default : novoSalario = salario + salario*30/100;
            }
            System.out.println("Nome: "+ nome);
            System.out.println("Categoria: "+categoria);
            System.out.println("Salário reajustado: "+novoSalario);
        }
    }
    
}
