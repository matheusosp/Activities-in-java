package lista42_7;
import java.util.Scanner;
public class Lista42_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m;
        System.out.println("Digite a quantidade de linhas da matriz ");
        n=Integer.valueOf(input.nextLine());
        System.out.println("Digite a quantidade de colunas ");
        m=Integer.valueOf(input.nextLine());
        int[][] A = new int[n][m];
        int[][] transposta = new int[m][n];
        for (int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
             System.out.print("Digite o elemento da matriz A linha "+i+" coluna "+j+": ");
             A[i][j] = Integer.valueOf(input.nextLine());
            }
        }
        System.out.println(" Matriz A ");
        for (int i=0;i<n;i++){
           for (int j=0;j<m;j++) {
               System.out.print(A[i][j]+" ");
           }
           System.out.println("");
       }
        System.out.println(" Matriz transposta ");
        for (int i=0;i<m;i++){
           for (int j=0;j<n;j++) {
               System.out.print(A[j][i]+" ");
           }
           System.out.println("");
       }
    }
    
}
