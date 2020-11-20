/*
Exemplo 5.3: Faça um programa que leia um vetor com 10 números reais, calcule 
e apresente a média destes números.
 */
package un5exemplo3a;

import java.util.Scanner;

public class Un5Exemplo3a {
    static double vetor[] = new double[10];
    static double media;
    
    static void leiaVetor(){
        Scanner input = new Scanner(System.in);
        for (int i=0;i<10;i++){
            System.out.print("Digite o elemento da posição "+i+": ");
            vetor[i] = Double.valueOf(input.nextLine());
        }
    }    
    
    static void calculeMedia(){
        double soma = 0;
        for (int i=0;i<10;i++){
            soma = soma + vetor[i];
        }
        media = soma / 10.0;
    }   
    
    static void apresenteMaioresMedia(){
        System.out.println("Valores maiores que a média");
        for (int i=0;i<10;i++){
            if (vetor[i]>media){
                System.out.println(vetor[i]);
            }
        }
    }   
    
    public static void main(String[] args) {
        leiaVetor();
        calculeMedia();
        apresenteMaioresMedia();
    }
    
}
