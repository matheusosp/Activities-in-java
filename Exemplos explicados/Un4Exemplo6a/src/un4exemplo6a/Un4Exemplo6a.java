/*
Faça um programa que leia uma matriz [3][4] de números reais, calcule e apresente:
- A soma de todos os elementos da matriz.
- O maior elemento da matriz e a sua posição.
- A soma de cada linha da matriz.
- A soma de cada coluna da matriz.
 */
package un4exemplo6a;

import java.util.Scanner;

public class Un4Exemplo6a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] dados = new double[3][4];
        double soma = 0, maior;
        int linhaMaior, colunaMaior;
        
        //Entrada de dados
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                System.out.print("Digite o elemento da linha "+i+" coluna "+j+": ");
                dados[i][j] = Double.valueOf(input.nextLine());
            }
        }
        
        //Processamento
        maior = dados[0][0];
        linhaMaior = 0;
        colunaMaior = 0;
        for (int i=0;i<3;i++){
            for (int j=0;j < 4;j++){
                soma = soma + dados[i][j];
                
                if (dados[i][j] > maior){
                    maior = dados[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }
        System.out.println("Soma de todos os elementos: "+soma);
        System.out.println("Maior elemento: "+maior);
        System.out.println("Linha do maior elemento: "+linhaMaior);
        System.out.println("Coluna do maior elemento: "+colunaMaior);
        
       
        for (int i=0;i<3;i++){
            soma = 0;
            for (int j=0;j<4;j++) {
                soma = soma + dados[i][j];
            }
            System.out.println("Soma da linha "+i+": "+soma);
        }
        
        for (int j=0;j<4;j++){
            soma = 0;
            for (int i=0;i<3;i++) {
                soma = soma + dados[i][j];
            }
            System.out.println("Soma da coluna "+j+": "+soma);
        }
       
        
        
        
    }
    
}
