package lista5.pkg2ex13;
import java.util.Arrays;
import java.util.Scanner;
public class Lista52Ex13 {
    static void ler(Scanner input,double []A){
        for(int i=0;i<A.length;i++){
            System.out.print("Digite o numero "+i+" : ");
            A[i]=Integer.valueOf(input.nextLine());
        }
    }
    static void negativos(double []A){
        int j = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]<0){                
               j++;
            }
        }
        int[] B=new int[j];
        j = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]<0){                
               B[j]=i;
               j++;
            }
        }        
        if (B.length>0){
            System.out.println("Existe numeros menor que 0 nas posições:"+Arrays.toString(B));  
        }else{
            System.out.println("Não existe numeros menor que 0 no vetor");
        }        
    }    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o tamanho do vetor?");
        double A[]=new double[Integer.valueOf(input.nextLine())];
        ler(input,A);
        negativos(A);
    }

}
