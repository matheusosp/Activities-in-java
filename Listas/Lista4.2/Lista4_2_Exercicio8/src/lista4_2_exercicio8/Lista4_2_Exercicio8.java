/*
8) Faça um programa que leia uma matriz quadrada A(N,N). A quantidade de linhas e
colunas deve ser maior ou igual a três. Caso o usuário digite um valor inferior a três, o
programa deve apresentar uma mensagem e solicitar que o usuário digite novamente.
Após a leitura dos dados, o programa deve calcular e apresentar:
- A soma de todos os elementos da matriz.
- A soma dos elementos da linha 2 da matriz;
- A soma dos elementos da coluna 1 da matriz;
- A soma dos elementos da diagonal principal.
- A soma dos elementos que estão acima da diagonal principal.
- A soma dos elementos que estão abaixo da diagonal principal.
 */
package lista4_2_exercicio8;

import java.util.Scanner;


public class Lista4_2_Exercicio8 {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Digite o número de linhas e colunas de uma matriz "+
                         "quadrada (deve ser maior ou igual a 3): ");
            n = Integer.valueOf(input.nextLine());
        } while (n < 3);
        int [][] A = new int[n][n];
        
        //Entrada de dados
        System.out.println("Digite os dados da matriz: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("Digite o elemento da linha "+i+" coluna "+j+": ");
                A[i][j] = Integer.valueOf(input.nextLine());
            }
        }  
        
        //Processamento e Saída de dados
        
        //A soma de todos os elementos da matriz.
        int soma = 0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                soma = soma + A[i][j];
            }
        }  
        System.out.println("Soma de todos os elementos da matriz: "+soma);
        
        // A soma dos elementos da linha 2 da matriz;
        int somaLinha2 = 0;
        for (int j=0;j<n;j++){
            somaLinha2 = somaLinha2 + A[2][j];
        }
        System.out.println("Soma dos elementos da linha 2 da matriz: "+somaLinha2);
        
        // A soma dos elementos da coluna 1 da matriz;
        int somaColuna1 = 0;
        for (int i=0;i<n;i++){
            somaColuna1 = somaColuna1 + A[i][1];
        }
        System.out.println("Soma dos elementos da coluna 1 da matriz: "+somaColuna1);
        
        // A soma dos elementos da diagonal principal.
        int somaDiagonal = 0;
        for (int i=0;i<n;i++){
            somaDiagonal = somaDiagonal + A[i][i];
        }
        System.out.println("Soma dos elementos da diagonal principal da matriz: "+somaDiagonal);
        
        // A soma dos elementos que estão acima da diagonal principal.
        int somaAcimaD = 0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                somaAcimaD = somaAcimaD + A[i][j];
            }
        }  
        System.out.println("Soma dos elementos acima da diagonal principal da "+
                           "matriz: " + somaAcimaD);
        
        //A soma dos elementos que estão abaixo da diagonal principal.
        int somaAbaixoD = 0;
        for (int i=0;i<n;i++){
            for (int j=0;j<i;j++){
                somaAbaixoD = somaAbaixoD + A[i][j];
            }
        }  
        System.out.println("Soma dos elementos abaixo da diagonal principal da "+
                           "matriz: " + somaAbaixoD);
        
    }
    
}
