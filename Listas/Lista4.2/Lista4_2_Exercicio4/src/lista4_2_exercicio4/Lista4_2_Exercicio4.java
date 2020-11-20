/*
4) Faça um programa que leia uma sequência de números inteiros e armazene-a em uma
variável do tipo String. O programa deve apresentar cada um dos números digitados por
extenso. Exemplo:
Digite um número inteiro: 532
Resultado:
Cinco
Três
Dois
 */
package lista4_2_exercicio4;

import java.util.Scanner;

public class Lista4_2_Exercicio4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        String texto = input.nextLine();
        char digito;
        System.out.println("Resultado: ");
        for (int i=0;i<texto.length();i++){
            digito = texto.charAt(i);
            switch (digito){
                case '0': System.out.println("Zero");
                          break;
                case '1': System.out.println("Um");
                          break;
                case '2': System.out.println("Dois");
                          break;
                case '3': System.out.println("Três");
                          break;
                case '4': System.out.println("Quatro");
                          break;
                case '5': System.out.println("Cinco");
                          break;
                case '6': System.out.println("Seis");
                          break;
                case '7': System.out.println("Sete");
                          break;
                case '8': System.out.println("Oito");
                          break;
                case '9': System.out.println("Nove");
                          break;
                default: System.out.println("Digito inválido");
            }
        }
    }
    
}
