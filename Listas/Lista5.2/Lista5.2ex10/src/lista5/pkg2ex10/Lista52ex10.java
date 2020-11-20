package lista5.pkg2ex10;
import java.util.Arrays;
import java.util.Scanner;
public class Lista52ex10 {
    
    static void ler(Scanner input,int []A){
        for(int i=0;i<20;i++){
            System.out.print("Digite o valor do vetor na posição "+i);
            A[i]=Integer.valueOf(input.nextLine());
        }
    } 
    
    static void trocarposicoes(int []A){
        int aux;
        int repeticoes=A.length/2;
        for(int i=0;i<repeticoes;i++){
            aux=A[i];
            A[i]=A[(A.length-1)-i];
            A[(A.length-1)-i]=aux;
        }
    }  
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[]=new int[20];
        ler(input,A); 
        System.out.println(Arrays.toString(A));
        trocarposicoes(A);
        System.out.println(Arrays.toString(A));
    }

}
