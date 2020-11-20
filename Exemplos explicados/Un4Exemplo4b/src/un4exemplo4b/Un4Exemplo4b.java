/*
Faça um programa que leia uma string digitado pelo usuário, armazene-os em um 
vetor de caracteres e apresente-o em ordem inversa.
 */
package un4exemplo4b;

import java.util.Scanner;

public class Un4Exemplo4b {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = input.nextLine();
        
        char[] vetor = texto.toCharArray();
        for (int i=vetor.length - 1;i>=0;i--)
            System.out.print(vetor[i]);
        System.out.println("");
    }
    
}
