package lista5.pkg2_18;
import java.util.Scanner;
public class Lista52_18 {

    static int n(Scanner input){
        System.out.print("Digite o tamanho de N: ");
        return Integer.valueOf(input.nextLine());
    }

    static int m(Scanner input){
        System.out.print("Digite o tamanho de M: ");
        return Integer.valueOf(input.nextLine());
    }
    
    static void ler(Scanner input,int [][]A,int n,int m){
        for(int i=0;i<n;i++){       
            for(int j=0;j<m;j++){
                System.out.print("Digite o elemento da linha "+i+" coluna "+j+": ");
                A[i][j] = Integer.valueOf(input.nextLine());        
            }  
        }    
    } 

    static int soma(int [][]A,int n,int m){
        int soma=0;
        for(int i=0;i<n;i++){       
            for(int j=0;j<m;j++){
                soma+=A[i][j];     
            }  
        } 
        return soma;
    } 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=n(input);
        int m=m(input);
        int [][] A = new int[n][m];
        ler(input,A,n,m);
        int soma=soma(A,n,m);
        System.out.println("A soma da matriz é: "+soma);
    }

}
