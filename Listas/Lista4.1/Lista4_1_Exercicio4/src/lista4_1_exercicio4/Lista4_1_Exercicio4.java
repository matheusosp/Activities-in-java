/*
4) Faça um programa que leia um vetor A (20) e troque o 1º elemento com o último, o 2º
com o penúltimo etc. até o 10º com o 11º. Por fim, o programa deve imprimir os dados do
vetor na nova ordem. Observe que não basta imprimir o vetor na ordem inversa, os
valores devem ser trocados de posição dentro do vetor. Além disto, não se deve usar um
segundo vetor, todo o processo deve ser feito utilizando um único vetor.
 */
package lista4_1_exercicio4;

import java.util.Scanner;

public class Lista4_1_Exercicio4 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[20];
        int aux;
        
        System.out.println("Digite os elementos do vetor A:");
        for (int i=0;i<20;i++){
            System.out.print("Digite o elemento da posição "+i+": ");
            A[i] = Integer.valueOf(input.nextLine());
        }    
        for (int i=0;i<10;i++){
            aux = A[i];
            A[i] = A[19-i];
            A[19-i] = aux;
        } 
        System.out.println("Resultado:");
        for (int i=0;i<20;i++){
            System.out.println(A[i]);
        }
    }
       
    
}
