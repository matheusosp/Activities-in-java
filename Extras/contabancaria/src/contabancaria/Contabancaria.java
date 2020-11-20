package contabancaria;

import java.util.Scanner;

public class Contabancaria {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Digite o numero da conta conta bancaria: ");
        int Numeroconta=Integer.valueOf(input.nextLine());
    System.out.print("Digite o saldo atual da conta: ");
        double saldo=Double.valueOf(input.nextLine());
    System.out.print("Digite o tipo de operação a ser realizada (1 - depósito ou 2 - saque) ");
        int operacao=Integer.valueOf(input.nextLine());
    System.out.print("Digite o valor da operação: ");
        double valoroperacao=Double.valueOf(input.nextLine());    
    if(operacao == 1){
        saldo = saldo +valoroperacao;
        System.out.print("O novo saldo é: "+saldo);
    }
    else if(operacao == 2){
        saldo = saldo-valoroperacao;
        System.out.print("O novo saldo é: "+saldo);
    }
    if(saldo<0){
        System.out.print(" E a conta esta estourada");
    }
    }}
