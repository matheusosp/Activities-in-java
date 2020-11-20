/*
 10) Faça um programa que leia um conjunto de números reais A(30), ordene e 
apresente o conjunto resultante após a ordenação.

Existem diversos métodos para ordenação de vetores, com diferentes graus de 
dificuldade e eficiência. O método utilizado neste código chama-se Bubble Sort 
que é um algoritmo pouco eficiente, porém simples de implementar.
 */
package lista4_1_exercicio10;

import java.util.Scanner;


public class Lista4_1_Exercicio10 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] vetor = new double[30];
        double aux;
    
        //Entrada de dados
        for(int i=0;i<30;i++){
            System.out.print("Digite o elemento da posição "+i+": ");
            vetor[i] = Double.valueOf(input.nextLine());
        }
        
        //Processamento de dados
        for(int i=0;i<29;i++){
            for(int j=0;j<29-i;j++){
                if(vetor[j] > vetor[j + 1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        //Saída de Dados
        System.out.println("Vetor organizado:");
        for(int i=0;i<30;i++){
            System.out.print(" "+vetor[i]);
        }
        System.out.println("");
    }
    
}
