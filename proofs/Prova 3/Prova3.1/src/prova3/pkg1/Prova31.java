package prova3.pkg1;
import java.util.Scanner;
public class Prova31 {
    static int lertamanho(Scanner input){
       System.out.print("Digite o tamanho da Matriz: ");
        return Integer.valueOf(input.nextLine());
    }
    
    static void ler(Scanner input,int [][]A,int tamanho){
        for(int i=0;i<tamanho;i++){       
            for(int j=0;j<tamanho;j++){
              System.out.print("Digite o elemento da linha "+i+" coluna "+j+": ");
                A[i][j] = Integer.valueOf(input.nextLine());        
            }  
       }    
    }

    static void mostrarResultados(int somapar,double mediaimpar,int maior,int qtdzero){
        System.out.println("A soma dos elementos pares da matriz é: "+somapar);
        System.out.println("A média dos elementos ímpares da matriz é: "+mediaimpar);
        System.out.println("O maior elemento da matriz é: "+maior);
        System.out.println("A quantidade de zeros existentes na matriz é: "+qtdzero);
    }
   
    static void calculo(int [][]A,int tamanho){
        int somapar=0;
        double mediaimpar=0;
        int contimpar=0;
        int maior=A[0][0];
        int qtdzero=0;  
        for(int i=0;i<tamanho;i++){       
            for(int j=0;j<tamanho;j++){
                if(A[i][j]%2==0){
                    somapar+=A[i][j];
                }else{
                    mediaimpar+=A[i][j];
                    contimpar+=1;
                }
                if(A[i][j]>maior){
                    maior=A[i][j];
                }
                if(A[i][j]==0){
                    qtdzero+=1;
                }
            }  
       }
        mostrarResultados(somapar,mediaimpar/contimpar,maior,qtdzero);
    } 
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tamanho=lertamanho(input);
        int [][] A = new int[tamanho][tamanho];
        ler(input,A,tamanho); 
        calculo(A,tamanho);        
    }

}
