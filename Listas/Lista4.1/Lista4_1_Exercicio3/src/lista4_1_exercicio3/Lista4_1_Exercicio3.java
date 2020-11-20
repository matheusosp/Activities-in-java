/*
3) Faça um programa que leia 10 números inteiros e armazene-os em um vetor A. Em
seguida, ele deve ler outros 10 números inteiros e armazená-los em um vetor B. Por fim, o
programa deve gerar e apresentar o vetor C, com 20 posições. Este vetor vai armazenar
os valores de A e B intercalados, ou seja, na primeira posição de C deve ser armazenado
o primeiro elemento de A, na segunda posição de C deve-se armazenar o primeiro
elemento de B, na terceira posição de C deve-se armazenar o segundo elemento de A e
assim por diante.
*/
package lista4_1_exercicio3;

import java.util.Scanner;

public class Lista4_1_Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];
        
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
        int j = 0;
        for (int i=0;i<10;i++){
            C[j] = A[i];
            j++;
            C[j] = B[i];
            j++;
        }
        System.out.println("Resultado:");
        for (int i=0;i<20;i++){
            System.out.println("C["+i+"]: "+C[i]);
        }
        
        System.out.println("");
    }    
    
}
