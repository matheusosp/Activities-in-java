/*
Faça um programa que leia um vetor A contendo 10 números inteiros diferentes. 
Após ler todos os números, o programa deve solicitar que o usuário digite um 
número a ser pesquisado no vetor. O programa deve verificar se o número existe 
no vetor e informar uma das seguintes mensagens: 
- O número está cadastrado na posição “X” do vetor; 
- O número NÃO está cadastrado no vetor. 
 */
package un4exemplo3b;

import java.util.Scanner;

public class Un4Exemplo3b {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[10];
        int i, num, pos=-1;
        
        for (i=0;i<10;i++){
            System.out.print("Digite o número da posição "+i+" : ");
            A[i] = Integer.valueOf(input.nextLine());
        }
        System.out.print("Digite o número a ser pesquisado: ");
        num = Integer.valueOf(input.nextLine());
        i = 0;
        while(i<10 && pos==-1){
            if (num == A[i]){
                pos = i;
            }
            else {
                i++; // i = i + 1;
            }
        }
        if (pos != -1){
            System.out.println("Valor armazenado na posição "+pos+".");
        }
        else {
            System.out.println("Número não encontrado no vetor.");
        }
    }
    
}
