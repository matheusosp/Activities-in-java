/*
5) Palíndromos são palavras ou frases que podem ser lidas da esquerda para a direita ou
da direita para esquerda. Exemplos: osso; radar; a grama é amarga. No caso de frases,
os espaços em branco são desconsiderados. Faça um programa que leia uma string,
verifique e apresente uma mensagem indicando se ele é palíndromo ou não.
 */
package lista4_2_exercicio5;

import java.util.Scanner;

public class Lista4_2_Exercicio5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        String texto = input.nextLine();
        char[] textoSemEspacos = new char[texto.length()];
        int i=0, j=0;
        boolean palindromo = true;
        
        //Elimina os espaços em branco
        for (i=0;i<texto.length();i++) {
            if (texto.charAt(i)!=' '){
                textoSemEspacos[j] = texto.charAt(i);
                j++;
            }
        }
        //Percorre até o meio do vetor, com o i iniciando na primeira posição e 
        //avançando e o j na última posição e retrocedendo, para verificar
        //se cada par de caracteres é igual.
        j--;
        int meio = j / 2;
        i = 0;
        while (i < meio && palindromo==true){
            if (textoSemEspacos[i]!=textoSemEspacos[j]){
                palindromo = false;
            }
            i++;
            j--;
        }
        //Saída de dados
        if (palindromo==true)
            System.out.println("O texto é palíndromo.");
        else
            System.out.println("O texto não é palíndromo.");
    }
    
}
