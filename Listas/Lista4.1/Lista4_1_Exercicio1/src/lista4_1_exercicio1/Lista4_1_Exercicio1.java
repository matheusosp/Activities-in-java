/*
1) Faça um programa que leia 10 números inteiros e armazene-os em um vetor A. Em
seguida, ele deve ler outros 10 números inteiros e armazená-los em um vetor B. Por fim, o
programa deve gerar e apresentar o vetor C, também com 10 posições, que armazenará
a soma dos valores armazenados nas posições correspondentes de A e B.
 */
package lista4_1_exercicio1;

import java.util.Scanner;

public class Lista4_1_Exercicio1 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        
        System.out.println("Digite os elementos do vetor A:");
        for (int i=0;i<10;i++){
            System.out.print("Digite o elemento da posição "+i+": ");
            A[i] = Integer.valueOf(input.nextLine());
        }
        System.out.println("Digite os elementos do vetor B:");
        for (int i=0;i<10;i++){
            System.out.print("Digite o elemento da posição "+i+": ");
            B[i] = Integer.valueOf(input.nextLine());
        }
        System.out.println("Resultado:");
        for (int i=0;i<10;i++){
            C[i] = A[i] + B[i];
            System.out.println("C["+i+"]: "+C[i]);
        }
        System.out.println("");
    }
    
}
