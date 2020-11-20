/*
Elabore um programa que leia 8 números inteiros e armazene-os em um Vetor A. 
O programa deve gerar um Vetor B, de mesmo tamanho que A, para armazenar o dobro
de cada um dos valores armazenados em A. Por fim, o programa deve apresentar 
os valores armazenados em B.
 */
package un4exemplo3a;

import java.util.Scanner;


public class Un4Exemplo3a {


    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int[] A = new int[8];
       int[] B = new int[8];
       
       for (int i=0;i<8;i++){
           System.out.print("Digite o número da posição "+i+" : ");
           A[i] = Integer.valueOf(input.nextLine());
           B[i] = 2 * A[i];
       }
       System.out.println("Dados do vetor A");
       for (int i=0;i<8;i++){
           System.out.print(A[i]+" ");
       }
       System.out.println("");
       System.out.println("Dados do vetor B");
       for (int i=0;i<8;i++){
           System.out.print(B[i]+" ");
       }
    }
    
}
