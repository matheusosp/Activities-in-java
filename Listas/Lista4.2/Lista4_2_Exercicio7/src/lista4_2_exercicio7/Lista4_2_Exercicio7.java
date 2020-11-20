/*
7) Faça um programa que leia uma matriz A(N,M), calcule e apresente a matriz 
transposta de A.
 */
package lista4_2_exercicio7;

import java.util.Scanner;

public class Lista4_2_Exercicio7 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite quantas linhas tem a matriz: ");
        int n = Integer.valueOf(input.nextLine());
        System.out.print("Digite quantas coluna tem a matriz: ");
        int m = Integer.valueOf(input.nextLine());
        int [][] A = new int[n][m];
        int [][] AT = new int[m][n];
        
        //Entrada de dados
        System.out.println("Digite os dados da matriz A: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print("Digite o elemento da linha "+i+" coluna "+j+": ");
                A[i][j] = Integer.valueOf(input.nextLine());
            }
        }  
        
        //Processamento
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
              AT[j][i] = A[i][j];
            }
        }
          //Saída de dados
        System.out.println("Matriz Transposta ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(AT[i][j]+" ");
            }
            System.out.println("");
        }
        
    }
        
    
}
