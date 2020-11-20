
package exercicio4;

import java.util.Scanner;


public class Exercicio4 {

    public static void main(String[] args) {
      //Declaração das variáveis
        Scanner input = new Scanner(System.in);
        int numero, resto;
        
        //Entrada de dados
        System.out.print("Digite um número inteiro: ");
        numero = Integer.valueOf(input.nextLine());
        
        // Processamento
        resto = numero % 2;
        
        // Saída de dados
        if (resto != 0) {
            System.out.println("Número ímpar");
        }
        else {
            System.out.println("Número par");
        }
    }
}