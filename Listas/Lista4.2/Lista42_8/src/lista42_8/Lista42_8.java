package lista42_8;
import java.util.Scanner;
public class Lista42_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        float soma1 = 0, soma2 = 0, soma3=0, soma4=0, soma5 = 0, soma6 = 0;
        do{
        System.out.println("Digite a quantidade de linhas e colunas da matriz ");
        n=Integer.valueOf(input.nextLine());
        if(n<3)
          System.out.println("Digite um numero maior ou igual a 3");
        }while(n<3);
        int[][] A = new int[n][n];
        for (int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
             System.out.print("Digite o elemento da matriz A linha "+i+" coluna "+j+": ");
             A[i][j] = Integer.valueOf(input.nextLine());
             soma1+=A[i][j];
             if(i==1)
                soma2+=A[i][j];
             if(j==0)
                soma3+=A[i][j];
             if(i==j)
                soma4+=A[i][j];
             if(i<j)
                 soma5+=A[i][j];
             if(i>j)
                 soma6+=A[i][j];
            }
        }    
            System.out.println(" Matriz A ");
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++) {
                System.out.print(A[i][j]+" ");
                }
            System.out.println("");
            }
            System.out.println(" A soma de todos os elementos da matriz é: "+soma1);
            System.out.println(" A soma dos elementos da linha 2 da matriz: "+soma2);
            System.out.println(" A soma dos elementos da coluna 1 da matriz: "+soma3);
            System.out.println(" A soma dos elementos da diagonal principal: "+soma4);
            System.out.println(" A soma dos elementos que estão acima da diagonal principal: "+soma5);
            System.out.println(" A soma dos elementos que estão abaixo da diagonal principal: "+soma6);
    }        
}