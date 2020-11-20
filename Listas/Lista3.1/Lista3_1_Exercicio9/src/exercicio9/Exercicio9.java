package exercicio9;

import java.util.Scanner;

public class Exercicio9 {

   
    public static void main(String[] args) {
        //Declaração das variáveis
        Scanner input = new Scanner(System.in);
        int numero, op;
        double saldoAtual, valorOperacao, novoSaldo;
        
        //Entrada de dados
        System.out.print("Digite o número da conta: ");
        numero = Integer.valueOf(input.nextLine());
        System.out.print("Digite o saldo atual: ");
        saldoAtual = Double.valueOf(input.nextLine());
        System.out.print("Digite a operação a ser realizada (1 - Depósito ou 2 - Saque): ");
        op = Integer.valueOf(input.nextLine());
             
        //Processamento
        if (op==1){
            System.out.print("Digite o valor do depósito: ");
            valorOperacao = Double.valueOf(input.nextLine());
            novoSaldo = saldoAtual + valorOperacao;
        }
        else {
            if (op==2){
                System.out.print("Digite o valor do saque: ");
                valorOperacao = Double.valueOf(input.nextLine());
                novoSaldo = saldoAtual - valorOperacao;
            }  
            else {
                novoSaldo = saldoAtual;
                System.out.println("Operação inválida.");
            }
        }
        // Saída de dados
        System.out.println("Número da conta: "+numero);
        System.out.println("Novo saldo: "+ novoSaldo);
        if (novoSaldo < 0){
            System.out.println("Conta estourada.");
        }
    }
}