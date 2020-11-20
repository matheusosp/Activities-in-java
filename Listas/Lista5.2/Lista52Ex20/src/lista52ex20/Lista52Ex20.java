package lista52ex20;
import java.util.Scanner;
public class Lista52Ex20 {
    //tamanho da linha    
    static int m(Scanner input){
       System.out.print("Digite o tamanho de M: ");
        return Integer.valueOf(input.nextLine());
    }
    
    //tamananho da coluna
    static int n(Scanner input){
        System.out.print("Digite o tamanho de N: ");
        return Integer.valueOf(input.nextLine());
    }
    
    //valores da matriz
    static void ler(Scanner input,int [][]A,int m,int n){
        for(int i=0;i<n;i++){       
            for(int j=0;j<m;j++){
              System.out.print("Digite o elemento da linha "+i+" coluna "+j+": ");
                A[i][j] = Integer.valueOf(input.nextLine());        
            }  
       }    
    }
    
    //verifica se a posição==1
    static void verificar(int A[][],int m, int n){
        //cont para determinar o tamanho dos vetores e para contar quantos vizinhos das posições com 1 existem 
        int cont=0; 
        // for para determinar quantos "1" existem na matriz  
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(A[i][j]==1){
                    cont++;
                }
            }
        }    
        //poscição da linha com o"1"
        int posicoesm[]=new int [cont];
        //posição da coluna com o "1"
        int posicoesn[]=new int [cont];
        cont=0;
        //guarda todas as posições com 1 na matriz nos vetores 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(A[i][j]==1){
                    posicoesm[cont]=i;
                    posicoesn[cont]=j;
                    cont++;
                }
            }
        }
        //boolean para determinar se o vizinho é "1"=true ou "0"=false 
        boolean confere=false;
        //cont2 para determinar quantos digitos 1 estão isolados e deifinir o tamanho do vetor para guardar as posições posteriormente
        int cont2=0;
        int linha,coluna;
        for(int i=0;i<posicoesm.length;i++){
            linha=posicoesm[i];
            coluna=posicoesn[i];
            confere=false;
            cont=0;
            //situação de quando a linha for a linha inicial e a coluna não for a ultima coluna(n-1) e a coluna não for a coluna inicial da matriz 
            if(linha==0 && coluna!=n-1 && coluna!=0){
                confere = A[linha][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
            }
            
            //situação caso a linha seja a ultima do vetor(m-1) e que não seja a ultima coluna(n-1) e não seja a coluna inicial
            if(linha==m-1 && coluna!=n-1 && coluna!=0){
                confere = A[linha][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha-1][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha-1][coluna] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha-1][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
            }
            
            //situação se for a coluna inicial e a linha não for a linha inicial e a ultima linha(m-1)
            if(coluna==0 && linha!=0 && linha!=m-1){
                confere = A[linha-1][coluna] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha-1][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
            }
            
            //situação caso seja a ultima coluna e não seja a linha iinicial e não seja a ultima coluna
            if(coluna==n-1 && linha!=0 && linha!=m-1){
                confere = A[linha-1][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha-1][coluna] != 1;   
                if(confere==false){
                    cont++;
                }
                confere = A[linha][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha][coluna] != 1;  
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna] != 1;             
                if(confere==false){
                    cont++;
                }
            }
            
            //situação se for a linha e coluna inicial
            if(linha==0 && coluna==0){
                confere = A[linha][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
            }
            
            //situação se for a linha inicial e a ultima coluna
            if(linha==0 && coluna==n-1){
                confere = A[linha][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna] != 1;
                if(confere==false){
                    cont++;
                }
            }
            
            //situação caso seja a ultima linha e a coluna inicial
            if(linha==m-1 && coluna==0){
                confere = A[linha-1][coluna] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha-1][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
            } 
            
            //situação se for a for a ultima linha e a ultima coluna
            if(linha==m-1 && coluna==n-1){
                confere = A[linha-1][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha-1][coluna] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
            }
            // situação se a linha e a coluna n]ao estiver em nenhuma extremidade
            if(linha!=0 && linha!=m-1 && coluna!=0 && coluna!=n-1){
                confere = A[linha-1][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha-1][coluna] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha-1][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha][coluna-1] != 1;     
                if(confere==false){
                    cont++;
                }
                confere = A[linha][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna] != 1; 
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
           }       
        //se a posição da matriz com 1 for 0 em todos os seus vizinhos então siginifica que esta posição é uma posição com o "1" isolado
                if(cont==0){
                    //define quantas posições isoladas com o "1" existem para guardar no vetor no proximo for
                    cont2++;
                }                
        } 
        int posicoesmok[]=new int[cont2];
        int posicoesnok[]=new int[cont2];
        cont2=0;
        for(int i=0;i<posicoesm.length;i++){
            linha=posicoesm[i];
            coluna=posicoesn[i];
            confere=false;
            cont=0;
            if(linha==0 && coluna!=n-1 && coluna!=0){
                confere = A[linha][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
            }
            if(linha==m-1 && coluna!=n-1 && coluna!=0){
                confere = A[linha][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha-1][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha-1][coluna] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha-1][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
            }
            if(coluna==0 && linha!=0 && linha!=m-1){
                confere = A[linha-1][coluna] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha-1][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
            }
            if(coluna==n-1 && linha!=0 && linha!=m-1){
                confere = A[linha-1][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha-1][coluna] != 1;   
                if(confere==false){
                    cont++;
                }
                confere = A[linha][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha][coluna] != 1;  
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna] != 1;             
                if(confere==false){
                    cont++;
                }
            }
            if(linha==0 && coluna==0){
                confere = A[linha][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
            }
            if(linha==0 && coluna==n-1){
                confere = A[linha][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna] != 1;
                if(confere==false){
                    cont++;
                }
            }
            if(linha==m-1 && coluna==0){
                confere = A[linha-1][coluna] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha-1][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
            } 
            if(linha==m-1 && coluna==n-1){
                confere = A[linha-1][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha-1][coluna] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
            }                 
            if(linha!=0 && linha!=m-1 && coluna!=0 && coluna!=n-1){
                confere = A[linha-1][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha-1][coluna] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha-1][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha][coluna-1] != 1;     
                if(confere==false){
                    cont++;
                }
                confere = A[linha][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna-1] != 1;
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna] != 1; 
                if(confere==false){
                    cont++;
                }
                confere = A[linha+1][coluna+1] != 1;
                if(confere==false){
                    cont++;
                }
           }   
            //guarda no vetor as posições com o "1" isoladas
            if(cont==0){
                posicoesmok[cont2]=linha;
                posicoesnok[cont2]=coluna;
                cont2++;
            }                
        } 
        mostrarposicoes(posicoesmok,posicoesnok);
    }        
        
    static void mostrarposicoes(int []posicoesmok,int[] posicoesnok){
        for(int i=0;i<posicoesmok.length;i++){
            System.out.println("Existe um caracter isolado na linha "+posicoesmok[i]+" coluna "+posicoesnok[i]);
       }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m=m(input);
        int n=n(input);
        while(n!=m){
            System.out.println("Digite uma matriz quadrada");
            m=m(input);
            n=n(input);             
        }
        int [][] A = new int[m][n];
        ler(input,A,m,n);  
        verificar(A,m,n);

    }

}
