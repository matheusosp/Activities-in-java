/*
3) Faça um programa que leia uma string digitada pelo usuário e apresente:
- Quantos caracteres têm a string;
- Quantas vogais têm a string;
- A string em caixa alta.
 */
package lista4_2_exercicio3;

import java.util.Scanner;

public class Lista4_2_Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um texto qualquer: ");
        String texto = input.nextLine();
        int tamanho = texto.length();
        int contVogais = 0;
        String caixaAlta = texto.toUpperCase();
        for (int i=0;i<tamanho;i++){
           if (texto.charAt(i)=='a' || texto.charAt(i)=='A' 
            || texto.charAt(i)=='e' || texto.charAt(i)=='E' 
            || texto.charAt(i)=='i' || texto.charAt(i)=='I' 
            || texto.charAt(i)=='o' || texto.charAt(i)=='O' 
            || texto.charAt(i)=='u' || texto.charAt(i)=='U') {
               contVogais++;
           }              
        }
        System.out.println("Quantidade de caracteres: "+tamanho);
        System.out.println("Quantidade de vogais: "+contVogais);
        System.out.println("Texto em caixa alta: "+caixaAlta);
    }
    
}
