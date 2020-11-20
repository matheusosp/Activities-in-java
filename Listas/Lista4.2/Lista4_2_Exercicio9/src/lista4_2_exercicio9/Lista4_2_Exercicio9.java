/*
9) Faça um programa que leia uma matriz A(N,M) e encontre todos os seus pontos de
sela, caso eles existam, e apresente as posições deste(s) ponto(s). Um ponto de sela é
um valor que é o maior elemento de sua linha e o menor elemento de sua coluna. Caso a
matriz não possua nenhum ponto de sela, o programa deve apresentar a seguinte
mensagem: “Esta matriz não possui pontos de sela”.
 */
package lista4_2_exercicio9;

import java.util.Scanner;


public class Lista4_2_Exercicio9 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite quantas linhas tem a matriz: ");
        int n = Integer.valueOf(input.nextLine());
        System.out.print("Digite quantas coluna tem a matriz: ");
        int m = Integer.valueOf(input.nextLine());
        int [][] A = new int[n][m];
        boolean temPonto = false;
        
         //Entrada de dados
        System.out.println("Digite os dados da matriz A: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print("Digite o elemento da linha "+i+" coluna "+j+": ");
                A[i][j] = Integer.valueOf(input.nextLine());
            }
        }
        
        //Processamento
        int maiorLinha;
        int colMaiorLinha;
        int menorColuna;
        int linhaMenorColuna;
        for (int i=0;i<n;i++){
            //Encontra o maior elemento de cada linha
            maiorLinha = A[i][0];
            colMaiorLinha = 0;
            for (int j=1;j<m;j++){
                if (A[i][j] > maiorLinha){
                    maiorLinha = A[i][j];
                    colMaiorLinha = j;
                }
            }
            //Verifica se o elemento encontrado é o menor de sua coluna
            menorColuna = A[0][colMaiorLinha];
            linhaMenorColuna = 0;
            for (int k=1;k<n;k++){
                if (A[k][colMaiorLinha] < menorColuna){
                    menorColuna = A[k][colMaiorLinha];
                    linhaMenorColuna = k;
                }
            }
            if (linhaMenorColuna==i){
                System.out.println("O elemento "+A[linhaMenorColuna][colMaiorLinha]+
                                   " é um ponto de sela.");
                System.out.println("Linha do elemento: "+linhaMenorColuna);
                System.out.println("Coluna do elemento: "+colMaiorLinha);
                temPonto = true;        
            }
        }
        if (temPonto==false){
            System.out.println("Esta matriz não tem ponto de sela.");
        }
    }
        
   
}
