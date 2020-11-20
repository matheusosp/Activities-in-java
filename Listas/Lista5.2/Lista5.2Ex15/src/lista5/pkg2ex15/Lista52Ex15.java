package lista5.pkg2ex15;
import java.util.Scanner;
public class Lista52Ex15 {
    
    static void ler(Scanner input,int []A){
        for(int i=0;i<A.length;i++){
            System.out.print("Digite o valor do vetor na posição "+i+" : ");
            A[i]=Integer.valueOf(input.nextLine());
        }
    }  

    
    public static int encontreMaior(int [] A){
        int maior = A[0];
        for (int i=1;i<A.length;i++){
            if (A[i] >= maior){
                maior  = A[i];
            }
        }
        System.out.print("O maior numero é o "+maior+" que esta na posição: ");
        for (int i=0;i<A.length;i++){
            if (A[i] >= maior){
                System.out.print(i+" ");
            }
        }
        return maior;
    }
    
    public static int encontreMenor(int [] A){
        int menor = A[0];
        for (int i=1;i<A.length;i++){
            if (A[i] <= menor){
                menor  = A[i];
            }
        }
        System.out.print("\n"+"O menor numero é o "+menor+" que esta na posição: ");
        for (int i=0;i<A.length;i++){
            if (A[i] <= menor){
                System.out.print(i+" ");
            }
        }
        return menor;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[]=new int[30];
        ler(input,A);
        int maior=encontreMaior(A);
        int menor=encontreMenor(A);
        System.out.println("\n"+"A diferença entre o menor e o maior é "+(maior-menor));
    }

}
