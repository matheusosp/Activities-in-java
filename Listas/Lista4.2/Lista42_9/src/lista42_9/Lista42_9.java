package lista42_9;
import java.util.Scanner;
public class Lista42_9 {
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int i, j;
        int m, n, A[][];
        System.out.println("Digite a quantidade de linhas da matriz ");
        m = Integer.valueOf(input.nextLine());
        System.out.println("Digite a quantidade de colunas ");
        n = Integer.valueOf(input.nextLine());
        A = new int[m][n];
        int menorcoluna[]= new int[n]; 
        menorcoluna[0]=A[0][0];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("Digite o elemento [" + i + "] [" + j + "]");
                A[i][j] = Integer.valueOf(input.nextLine());
            }
        }
        int[] menoresDeCadaColuna = new int[n];	
	int[] aux1 = new int[n];
	// descobre qual o menor numero de cada coluna
	for (i = 0; i < m; i++) {				
            for (j = 0; j < n; j++) {
                aux1[j] = A[i][j];
                if (i==0){
                    menoresDeCadaColuna[j] = aux1[j];
                }	
                if (menoresDeCadaColuna[j]> aux1[j]){
                    menoresDeCadaColuna[j] = aux1[j];
                }
            }				                	
        }    
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println(" ");
        }
       int maior,j2=0;
       boolean existesela=false;
        for(i=0;i< m;i++){
            maior = A[i][0];
            for(j=0;j<n;j++){                
                if (A[i][j] > maior){
                    maior = A[i][j];
                    j2=j;
                }
            }
            if(maior==menoresDeCadaColuna[j2]){
                System.out.println("Sela na posição [" + i + "][" + j2 + "]");
                existesela=true;
            }
        }
        if(!existesela){
           System.out.println("Não existe sela na matriz");
        }
    }
}


