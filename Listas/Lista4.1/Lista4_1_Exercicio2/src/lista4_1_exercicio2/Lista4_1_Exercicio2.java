/*
2) Faça um programa que leia um conjunto com N números inteiros e substitua todos os
valores negativos por 0. Em seguida deve-se apresentar o novo conjunto e indicar
quantos valores foram substituídos dentro dele.
 */
package lista4_1_exercicio2;

import java.util.Scanner;

public class Lista4_1_Exercicio2 {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        
        System.out.print("Digite a quantidade de números existente no conjunto: ");
        n = Integer.valueOf(input.nextLine());

        int [] vetor = new int[n];
        
        for (int i=0;i<n;i++){
            System.out.print("Digite o elemento da posição "+i+" :");
            vetor[i] = Integer.valueOf(input.nextLine());
            if (vetor[i]<0)
                vetor[i] = 0;
        }
        System.out.println("Resultado:");
        for (int i=0;i<n;i++){
            System.out.println(vetor[i]);
        }
    }
    
}
