package lista52_16;
import java.util.Scanner;
public class Lista52_16 {
    
    static void ler(Scanner input,int []A,int []B){
        for(int i=0;i<A.length;i++){
            System.out.print("Digite o vetor A na posição "+i+" :");
            A[i]=Integer.valueOf(input.nextLine());          
        }
        for(int i=0;i<B.length;i++){
            System.out.print("Digite o vetor B na posição "+i+" :");
            B[i]=Integer.valueOf(input.nextLine());          
        }        
    } 
    
    static boolean subconjunto(int []A,int []B){
        boolean subconjunto=true;
        int cont;
        for(int i=0;i<A.length;i++){
            cont=0;
            for(int j=0;j<B.length;j++){
                if(A[i]==B[j]){
                    cont+=1;
                }
            }
            if (cont==0){
                subconjunto=false;               
                i=A.length;
            }
        }
        return subconjunto;
    } 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A[]=new int[5];
        int B[]=new int[10];
        ler(input,A,B);
        boolean subconjunto=subconjunto(A,B);
        if(subconjunto==false){
            System.out.println("A não é um sunconjunto de B");
        }
        if(subconjunto==true){
            System.out.println("A é um subconjunto de B");
        }        
    }

}
