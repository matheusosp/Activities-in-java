/*
Faça um programa que leia um número inteiro positivo (N), calcule e apresente o 
valor de A, que é dado pela seguinte fórmula:

A = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N
*/
package lista3_3_exercicio8;

import java.util.Scanner;

public class Lista3_3_Exercicio8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, i;
        double A=0;
        
        System.out.print("Digite o valor de N: ");
        N = Integer.valueOf(input.nextLine());
        for (i=1;i<=N;i++){
            A = A + 1.0 / i;
        }
        System.out.println("O valor de A é: "+A);
    }
    
}
