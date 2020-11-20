/*
9) A série de Fibinacci é formada pela sequência: 0, 1, 1, 2, 3, 5, 8, 13 ...

Crie um programa que leia um número inteiro N (entre 3 e 20) e apresente a 
série de Fibonacci até o enésimo termo. Se o número digitado pelo usuário não 
estiver entre o intervalo 3 e 20 (inclusive), o programa deve solicitar que ele
digite outro número.
 */
package lista3_3_exercicio9;

import java.util.Scanner;

public class Lista3_3_Exercicio9 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, i, penultimo=0, ultimo=1, novo;
        
        do {
            System.out.print("Digite um número entre 3 e 20 para gerar a série de Fibonacci: ");
            N = Integer.valueOf(input.nextLine());
        }while (N < 3 || N > 20);
        System.out.println(penultimo);
        System.out.println(ultimo);
        for (i=3;i<=N;i++){
            novo = ultimo + penultimo;
            System.out.println(novo);
            penultimo = ultimo;
            ultimo = novo;
        }
    }
    
}
