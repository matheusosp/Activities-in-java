/*
Este programa lê um string, converte em um vetor de char e depois converte cada
char para um string, gerando um vetor de strings.
 */
package chartostr;

import java.util.Scanner;

public class CharToStr {

    public static void main(String[] args) {
        //Lê uma frase e armazena em uma variável do tipo String
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();
        //Converte a frase lida em um vetor de caracteres
        char[] fraseChar = frase.toCharArray();
        //Percorre o vetor de char e transforma cada caracter do vetor em um 
        //string e armazena em um vetor de String
        int tamanho = fraseChar.length;
        String[] fraseString = new String[tamanho];
        for (int i = 0;i<tamanho;i++){
            fraseString[i] = Character.toString(fraseChar[i]);
            System.out.println(fraseString[i]);
        }
        
    }
    
}
