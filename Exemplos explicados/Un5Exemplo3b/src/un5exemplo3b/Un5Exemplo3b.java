/*
Altere o exemplo 5.3, utilizando passagem de parâmetros e retorno de valores 
pela função.
 */
package un5exemplo3b;

import java.util.Scanner;

public class Un5Exemplo3b {
    
    static double[] leiaVetor(){
        Scanner input = new Scanner(System.in);
        double vet[] = new double[10];
        for (int i=0;i<10;i++){
            System.out.print("Digite o elemento da posição "+i+": ");
            vet[i] = Double.valueOf(input.nextLine());
        }
        return vet;
    }    
    
    static double calculeMedia(double[] v){
        double soma = 0;
        for (int i=0;i<10;i++){
            soma = soma + v[i];
        }
        return soma / 10.0;
    }   
    
    static void apresenteMaioresMedia(double m, double[] x){
        System.out.println("Valores maiores que a média");
        for (int i=0;i<10;i++){
            if (x[i]>m){
                System.out.println(x[i]);
            }
        }
    }   
    
    public static void main(String[] args) {
        double vetor[];
        double media;
   
        vetor = leiaVetor();
        media = calculeMedia(vetor);
        apresenteMaioresMedia(media, vetor);
    }
    
}
