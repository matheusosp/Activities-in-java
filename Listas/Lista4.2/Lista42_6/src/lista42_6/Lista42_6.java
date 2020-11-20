package lista42_6;
import java.util.Scanner;
public class Lista42_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[5][4];
        int[][] B = new int[5][4];
        double soma = 0;
        for (int m=0;m<5;m++){
            for(int n = 0;n<4;n++){
             System.out.print("Digite o elemento da matriz A linha "+m+" coluna "+n+": ");
             A[m][n] = Integer.valueOf(input.nextLine());
             System.out.print("Digite o elemento da matriz B linha "+m+" coluna "+n+": ");
             B[m][n] = Integer.valueOf(input.nextLine());
             soma +=A[m][n]+ B[m] [n];
            }
        }
        System.out.println(" Matriz A ");
        for (int m=0;m<5;m++){
           for (int n=0;n<4;n++) {
               System.out.print(A[m][n]+" ");
           }
           System.out.println("");
       }
       System.out.println(" Matriz B ");
        for (int m=0;m<5;m++){
           for (int n=0;n<4;n++) {
               System.out.print(B[m][n]+" ");
           }
           System.out.println("");
       }
        System.out.println("A soma total das duas matrizes é: "+soma);
    }    
}
