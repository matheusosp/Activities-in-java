/*
5) Faça um programa que leia um conjunto de 30 números inteiros e apresente:
a) O maior número e a posição onde ele estava armazenado;
b) O menor número e a posição onde ele estava armazenado;
c) A diferença entre o maior e o menor número.,
 */
package lista4_1_exercicio5;

import java.util.Scanner;


public class Lista4_1_Exercicio5 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] V = new int[20];
        int maior, menor, posMaior, posMenor, diferenca;
        
        System.out.println("Digite os elementos do vetor:");
        for (int i=0;i<20;i++){
            System.out.print("Digite o elemento da posição "+i+": ");
            V[i] = Integer.valueOf(input.nextLine());
        }
        maior = V[0];
        menor = V[0];
        posMaior = 0;
        posMenor = 0;
        for (int i=1;i<20;i++){
            if (V[i] > maior){
                maior = V[i];
                posMaior = i;
            } 
            else {
                if (V[i]<menor){
                    menor = V[i];
                    posMenor = i;
                }
            }
        }
        diferenca = maior - menor;
        System.out.println("Maior número: "+maior);
        System.out.println("Posição do maior número: "+posMaior);
        System.out.println("Menor número: "+menor);
        System.out.println("Posição do menor número: "+posMenor);
        System.out.println("Diferença entre o maior e o menor número: "+diferenca);
    }
    
}
