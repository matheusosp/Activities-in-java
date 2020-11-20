/*
6) Faça um programa que leia uma matriz A(5,4) e uma matriz B(5,4), calcule e 
apresente a matriz resultante da soma de A e B.
 */
package lista4_2_exercicio6;

import java.util.Scanner;

public class Lista4_2_Exercicio6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] A = new int[5][4];
        int [][] B = new int[5][4];
        int [][] C = new int[5][4];
        
        //Entrada de dados
        System.out.println("Digite os dados da matriz A: ");
        for (int i=0;i<5;i++){
            for (int j=0;j<4;j++){
                System.out.print("Digite o elemento da linha "+i+" coluna "+j+": ");
                A[i][j] = Integer.valueOf(input.nextLine());
            }
        }
        System.out.println("Digite os dados da matriz B: ");
        for (int i=0;i<5;i++){
            for (int j=0;j<4;j++){
                System.out.print("Digite o elemento da linha "+i+" coluna "+j+": ");
                B[i][j] = Integer.valueOf(input.nextLine());
            }
        }
        
        //Processamento
        for (int i=0;i<5;i++){
            for (int j=0;j<4;j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        
        //Saída de dados
        System.out.println("Matriz C ");
        for (int i=0;i<5;i++){
            for (int j=0;j<4;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
}
